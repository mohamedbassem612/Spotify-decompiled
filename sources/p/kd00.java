package p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kd00 {
    public String a;
    public byte[] b;
    public long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kd00.class == obj.getClass()) {
            kd00 kd00Var = (kd00) obj;
            if (this.c == kd00Var.c && this.a.equals(kd00Var.a) && Arrays.equals(this.b, kd00Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Objects.hash(this.a, Long.valueOf(this.c)) * 31);
    }
}
