package com.example.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculadora.ui.theme.CalculadoraTheme
import com.example.calculadora.ui.theme.verdeClaro
import com.example.calculadora.ui.theme.verdeOscuro


@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.DarkGray)
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter),
                        verticalArrangement = Arrangement.spacedBy(buttonSpacing),
                    ) {
                        Text(
                            text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                            textAlign = TextAlign.End,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 32.dp),
                            fontWeight = FontWeight.Light,
                            fontSize = 80.sp,
                            color = Color.White,
                            maxLines = 2
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "AC",
                                color = verdeClaro,
                                modifier = Modifier
                                    .aspectRatio(2f)
                                    .weight(2f)
                            ) {
                                viewModel.onAction(CalculatorAction.Clear)
                            }
                            CalculatorButton(
                                symbol = "Del",
                                color = verdeClaro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Delete)
                            }
                            CalculatorButton(
                                symbol = "/",
                                color = verdeClaro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "7",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(7))
                            }
                            CalculatorButton(
                                symbol = "8",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(8))
                            }
                            CalculatorButton(
                                symbol = "9",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(9))
                            }
                            CalculatorButton(
                                symbol = "x",
                                color = verdeClaro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "4",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(4))
                            }
                            CalculatorButton(
                                symbol = "5",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(5))
                            }
                            CalculatorButton(
                                symbol = "6",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(6))
                            }
                            CalculatorButton(
                                symbol = "-",
                                color = verdeClaro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "1",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(1))
                            }
                            CalculatorButton(
                                symbol = "2",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(2))
                            }
                            CalculatorButton(
                                symbol = "3",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(3))
                            }
                            CalculatorButton(
                                symbol = "+",
                                color = verdeClaro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "0",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(2f)
                                    .weight(2f)
                            ) {
                                viewModel.onAction(CalculatorAction.Number(0))
                            }
                            CalculatorButton(
                                symbol = ".",
                                color = verdeOscuro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Decimal)
                            }
                            CalculatorButton(
                                symbol = "=",
                                color = verdeClaro,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Calculate)
                            }
                        }
                    }
                }
            }
        }
    }
}

