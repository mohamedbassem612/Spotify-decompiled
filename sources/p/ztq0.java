package p;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ztq0 {
    public final OutputConfiguration a;
    public long b = 1;

    public ztq0(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ztq0)) {
            return false;
        }
        ztq0 ztq0Var = (ztq0) obj;
        return this.a.equals(ztq0Var.a) && this.b == ztq0Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        return Long.hashCode(this.b) ^ ((iHashCode << 5) - iHashCode);
    }
}
