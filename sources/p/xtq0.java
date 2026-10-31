package p;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xtq0 {
    public final OutputConfiguration a;
    public String b;
    public long c = 1;

    public xtq0(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xtq0)) {
            return false;
        }
        xtq0 xtq0Var = (xtq0) obj;
        return this.a.equals(xtq0Var.a) && this.c == xtq0Var.c && Objects.equals(this.b, xtq0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        String str = this.b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
        return Long.hashCode(this.c) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
