package androidx.camera.core.impl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class CameraValidator$CameraIdListIncorrectException extends Exception {
    public final int a;

    public CameraValidator$CameraIdListIncorrectException(String str, int i, IllegalArgumentException illegalArgumentException) {
        super(str, illegalArgumentException);
        this.a = i;
    }
}
