package p;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vtq0 {
    public final OutputConfiguration a;
    public String b;
    public boolean c;
    public long d = 1;

    public vtq0(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vtq0)) {
            return false;
        }
        vtq0 vtq0Var = (vtq0) obj;
        return this.a.equals(vtq0Var.a) && this.c == vtq0Var.c && this.d == vtq0Var.d && Objects.equals(this.b, vtq0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = (this.c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
        int i2 = (i << 5) - i;
        String str = this.b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i2;
        return Long.hashCode(this.d) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
