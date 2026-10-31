package androidx.car.app;

import java.util.Objects;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class HandshakeInfo {
    private final int mHostCarAppApiLevel;
    private final String mHostPackageName;

    private HandshakeInfo() {
        this.mHostPackageName = null;
        this.mHostCarAppApiLevel = 0;
    }

    public int getHostCarAppApiLevel() {
        return this.mHostCarAppApiLevel;
    }

    public String getHostPackageName() {
        String str = this.mHostPackageName;
        Objects.requireNonNull(str);
        return str;
    }

    public HandshakeInfo(String str, int i) {
        this.mHostPackageName = str;
        this.mHostCarAppApiLevel = i;
    }
}
