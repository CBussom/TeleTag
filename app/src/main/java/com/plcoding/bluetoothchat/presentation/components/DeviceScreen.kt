package com.plcoding.bluetoothchat.presentation.components

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.bluetoothchat.domain.chat.BluetoothDevice
import com.plcoding.bluetoothchat.presentation.BluetoothUiState
fun connect(device: BluetoothDevice){

}
var devicesToConnect: MutableList<BluetoothDevice> = mutableListOf()
@Composable
fun DeviceScreen(
    state: BluetoothUiState,
    onStartScan: () -> Unit,
    onStopScan: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        BluetoothDeviceList(
            //pairedDevices = state.pairedDevices,
            scannedDevices = state.scannedDevices,
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = onStartScan) {
                Text(text = "Start scan")
            }
            Button(onClick = onStopScan) {
                Text(text = "Stop scan")
            }
        }
    }
}

@Composable
fun BluetoothDeviceList(
    scannedDevices: List<BluetoothDevice>,
    oDevices: List<BluetoothDevice> = listOf(),
    //devicesToConnect: MutableList<BluetoothDevice> = oDevices.toMutableList(),

    onClick: (BluetoothDevice) -> Unit = {


    },
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        /*item {
            Text(
                text = "Paired Devices",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }

        items(pairedDevices) { device ->
            Text(
                text = device.name ?: "(No name)",
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onClick(device) }
                    .padding(16.dp)
            )
        }
        */
        item {
            Text(
                text = "Scanned Devices",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        } //adding to list
        items(scannedDevices) { device ->
            if(device.name != null){
                Text(
                    text = device.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            var contains = false
                            for(x in devicesToConnect){
                                if(x == device){
                                    contains = true
                                }

                            }
                            if(!contains){
                                devicesToConnect.add(device)
                            }

                        }
                        .padding(16.dp)
                )
            }

        }
        item {
            Text(
                text = "(to) Connected Devices",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }

        items(devicesToConnect) { device ->
            //Log.d("TAG", "Connect?")

            Text(

                text = device.name ?: "(No name)",
                modifier = Modifier
                    .fillMaxWidth()

                    .padding(16.dp)
            )
        }

    }
}