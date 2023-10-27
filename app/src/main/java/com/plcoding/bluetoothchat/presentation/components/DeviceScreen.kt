package com.plcoding.bluetoothchat.presentation.components

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.bluetoothchat.domain.chat.BluetoothDevice
import com.plcoding.bluetoothchat.presentation.BluetoothUiState

var playGame = false
fun connect(device: BluetoothDevice){

}
var devicesToConnect: MutableList<BluetoothDevice> = mutableListOf()

@Composable
fun DeviceScreen(
    state: BluetoothUiState,
    onStartScan: () -> Unit,
    onStopScan: () -> Unit,
    playScreen: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        if(playGame){
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Button(
                    onClick = { playGame = false },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Back")
                }
            }
        }else{
            //---
            BluetoothDeviceList(
                //pairedDevices = state.pairedDevices,
                scannedDevices = state.scannedDevices,
                onClick = {
                    //Log.d("TAG", "HELLO")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)

            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                if(!playGame) {
                    Button(onClick = onStartScan) {
                        Text(text = "Start scan")
                    }
                    Button(onClick = onStopScan) {
                        Text(text = "Stop scan")
                    }
                    Button(onClick = { playGame = true }) {
                        Text(text = "Play")
                    }
                }
                if(playGame){
                    Button(
                        onClick = { playGame = false },
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(text = "Back")
                    }
                }
            }
        }

        //-----
    }

}
@Composable
fun playGameScreen(onBackButtonClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        content = {
            Text(
                text = "Connected Devices",
                style = MaterialTheme.typography.h5
            )

            Button(
                onClick = { onBackButtonClick() },
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Back")
            }
        }
    )
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

    if (playGame) {
        Column(
            modifier = Modifier.fillMaxSize(),
            content = {
                Text(
                    text = "Connected Devices",
                    style = MaterialTheme.typography.h5
                )

            }
        )
    }


    else{
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
            item{
                //add it here
            }

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
                    text = "Connected Devices",
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
}