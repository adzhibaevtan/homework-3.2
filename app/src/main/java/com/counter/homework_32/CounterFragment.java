package com.counter.homework_32;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class CounterFragment extends Fragment {
    private TextView score;
    private Button btn_plus, btn_minus;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_counter, container, false);
    }

    public void color() {
        if (Integer.parseInt(score.getText().toString()) < 0) {
            score.setTextColor(Color.GRAY);
        } else {
            score.setTextColor(Color.BLACK);
        }

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        score = view.findViewById(R.id.score);
        btn_plus = view.findViewById(R.id.plus);
        btn_minus = view.findViewById(R.id.minus);
        startIncrementingCounterIfButtonIsHeldDown();
        startDecreasingCounterIfButtonIsHeldDown();
    }

    @SuppressLint("ClickableViewAccessibility")
    private void startIncrementingCounterIfButtonIsHeldDown() {
        final CountDownTimer countDownTimer = new CountDownTimer(1000, 500) {
            @Override
            public void onTick(long l) {
                color();
                int i = Integer.parseInt(score.getText().toString());
                score.setText(String.valueOf(++i));
            }

            @Override
            public void onFinish() {
                final CountDownTimer countDownTimer = new CountDownTimer(500, 250) {
                    @Override
                    public void onTick(long l) {
                        color();
                        int i = Integer.parseInt(score.getText().toString());
                        score.setText(String.valueOf(++i));
                    }

                    @Override
                    public void onFinish() {
                        final CountDownTimer countDownTimer = new CountDownTimer(250, 100) {
                            @Override
                            public void onTick(long l) {
                                color();
                                int i = Integer.parseInt(score.getText().toString());
                                score.setText(String.valueOf(++i));
                            }

                            @Override
                            public void onFinish() {
                                final CountDownTimer countDownTimer = new CountDownTimer(100, 50) {
                                    @Override
                                    public void onTick(long l) {
                                        color();
                                        int i = Integer.parseInt(score.getText().toString());
                                        score.setText(String.valueOf(++i));
                                    }

                                    @Override
                                    public void onFinish() {
                                        final CountDownTimer countDownTimer = new CountDownTimer(Long.MAX_VALUE, 10) {
                                            @Override
                                            public void onTick(long l) {
                                                color();
                                                int i = Integer.parseInt(score.getText().toString());
                                                score.setText(String.valueOf(++i));
                                            }

                                            @Override
                                            public void onFinish() {
                                            }
                                        };
                                        countDownTimer.start();

                                        btn_plus.setOnTouchListener((view, motionEvent) -> {
                                            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {

                                                countDownTimer.start();
                                            }
                                            if (motionEvent.getAction() == MotionEvent.ACTION_UP ) {
                                                countDownTimer.cancel();
                                                startIncrementingCounterIfButtonIsHeldDown();
                                            }
                                            return false;
                                        });
                                    }
                                };
                                countDownTimer.start();

                                btn_plus.setOnTouchListener((view, motionEvent) -> {
                                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN ) {
                                        countDownTimer.start();
                                    }
                                    if (motionEvent.getAction() == MotionEvent.ACTION_UP ) {
                                        countDownTimer.cancel();
                                        startIncrementingCounterIfButtonIsHeldDown();
                                    }
                                    return false;
                                });
                            }
                        };
                        countDownTimer.start();


                        btn_plus.setOnTouchListener((view, motionEvent) -> {
                            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN ) {
                                countDownTimer.start();
                            }
                            if (motionEvent.getAction() == MotionEvent.ACTION_UP ) {
                                countDownTimer.cancel();
                                startIncrementingCounterIfButtonIsHeldDown();
                            }
                            return false;
                        });
                    }
                };

                btn_plus.setOnTouchListener((view, motionEvent) -> {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        countDownTimer.start();
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                        countDownTimer.cancel();
                        startIncrementingCounterIfButtonIsHeldDown();
                    }
                    return false;
                });
                countDownTimer.start();
            }
        };

        btn_plus.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                countDownTimer.start();
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                countDownTimer.cancel();
                startIncrementingCounterIfButtonIsHeldDown();
            }
            return false;
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    private void startDecreasingCounterIfButtonIsHeldDown() {
        final CountDownTimer countDownTimer = new CountDownTimer(1000, 500) {
            @Override
            public void onTick(long l) {
                color();
                int i = Integer.parseInt(score.getText().toString());
                score.setText(String.valueOf(--i));
            }

            @Override
            public void onFinish() {
                final CountDownTimer countDownTimer = new CountDownTimer(500, 250) {
                    @Override
                    public void onTick(long l) {
                        color();
                        int i = Integer.parseInt(score.getText().toString());
                        score.setText(String.valueOf(--i));
                    }

                    @Override
                    public void onFinish() {
                        final CountDownTimer countDownTimer = new CountDownTimer(250, 100) {
                            @Override
                            public void onTick(long l) {
                                color();
                                int i = Integer.parseInt(score.getText().toString());
                                score.setText(String.valueOf(--i));
                            }

                            @Override
                            public void onFinish() {
                                final CountDownTimer countDownTimer = new CountDownTimer(100, 50) {
                                    @Override
                                    public void onTick(long l) {
                                        color();
                                        int i = Integer.parseInt(score.getText().toString());
                                        score.setText(String.valueOf(--i));
                                    }

                                    @Override
                                    public void onFinish() {
                                        final CountDownTimer countDownTimer = new CountDownTimer(Long.MAX_VALUE, 10) {
                                            @Override
                                            public void onTick(long l) {
                                                color();
                                                int i = Integer.parseInt(score.getText().toString());
                                                score.setText(String.valueOf(--i));
                                            }

                                            @Override
                                            public void onFinish() {
                                            }
                                        };
                                        countDownTimer.start();

                                        btn_minus.setOnTouchListener((view, motionEvent) -> {
                                            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                                                countDownTimer.start();
                                            }
                                            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                                                countDownTimer.cancel();
                                                startDecreasingCounterIfButtonIsHeldDown();
                                            }
                                            return false;
                                        });
                                    }
                                };
                                countDownTimer.start();

                                btn_minus.setOnTouchListener((view, motionEvent) -> {
                                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                                        countDownTimer.start();
                                    }
                                    if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                                        countDownTimer.cancel();
                                        startDecreasingCounterIfButtonIsHeldDown();
                                    }
                                    return false;
                                });
                            }
                        };
                        countDownTimer.start();


                        btn_minus.setOnTouchListener((view, motionEvent) -> {
                            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                                countDownTimer.start();
                            }
                            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                                countDownTimer.cancel();
                                startDecreasingCounterIfButtonIsHeldDown();
                            }
                            return false;
                        });
                    }
                };

                btn_minus.setOnTouchListener((view, motionEvent) -> {
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                        countDownTimer.start();
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                        countDownTimer.cancel();
                        startDecreasingCounterIfButtonIsHeldDown();
                    }
                    return false;
                });
                countDownTimer.start();
            }
        };

        btn_minus.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                countDownTimer.start();
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                countDownTimer.cancel();
                startDecreasingCounterIfButtonIsHeldDown();
            }
            return false;
        });
    }
}