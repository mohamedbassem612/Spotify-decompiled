package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jhe implements ehe {
    public final long a;
    public final long b;
    public final boolean c;
    public final u9b0 d;

    public jhe(long j, long j2, boolean z, u9b0 u9b0Var) {
        dm5.m(j == -9223372036854775807L || j2 == -9223372036854775807L || j <= j2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = u9b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jhe.class == obj.getClass()) {
            jhe jheVar = (jhe) obj;
            if (this.a == jheVar.a && this.b == jheVar.b && this.c == jheVar.c && Objects.equals(this.d, jheVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iZ = (((anm1.z(this.b) + ((anm1.z(this.a) + 527) * 31)) * 31) + (this.c ? 1 : 0)) * 31;
        u9b0 u9b0Var = this.d;
        return iZ + (u9b0Var != null ? u9b0Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Chapter: startTimeMs=");
        long j = this.a;
        sb.append(j == -9223372036854775807L ? "UNSET" : Long.valueOf(j));
        long j2 = this.b;
        String str2 = "";
        if (j2 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", endTimeMs=" + j2;
        }
        sb.append(str);
        sb.append(this.c ? ", hidden" : "");
        u9b0 u9b0Var = this.d;
        if (u9b0Var != null) {
            str2 = ", title=" + u9b0Var;
        }
        sb.append(str2);
        return sb.toString();
    }
}
