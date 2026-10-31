package com.spotify.playbacknative;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public class AudioDriver$VolumeHandler extends Handler {
    private final AudioDriver mAudioDriver;

    private AudioDriver$VolumeHandler(Looper looper, AudioDriver audioDriver) {
        super(looper);
        this.mAudioDriver = audioDriver;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        synchronized (AudioDriver.b(this.mAudioDriver)) {
            try {
                if (message.what == 1) {
                    Float f = (Float) message.obj;
                    if (AudioDriver.a(this.mAudioDriver) != null) {
                        AudioDriver.g(f.floatValue(), AudioDriver.a(this.mAudioDriver).getAudioTrack());
                    }
                    AudioDriver.c(this.mAudioDriver, f.floatValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.handleMessage(message);
    }

    public /* synthetic */ AudioDriver$VolumeHandler(Looper looper, AudioDriver audioDriver, int i) {
        this(looper, audioDriver);
    }
}
