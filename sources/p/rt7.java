package p;

import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rt7 implements qt7 {
    public final AudioDeviceInfo a;

    public rt7(AudioDeviceInfo audioDeviceInfo) {
        this.a = audioDeviceInfo;
    }

    public final String a() {
        return this.a.getAddress();
    }

    public final CharSequence b() {
        return this.a.getProductName();
    }

    public final int getId() {
        return this.a.getId();
    }

    public final int getType() {
        return this.a.getType();
    }
}
