package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/cz71;", "Lp/uim0;", "Lp/ez71;", "src_main_java_com_spotify_listuxplatformconsumers_standard_shimmer-shimmer"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class cz71 extends uim0 {
    public final hw61 a;
    public final long b;

    public cz71(long j, hw61 hw61Var) {
        this.a = hw61Var;
        this.b = j;
    }

    public final pim0 a() {
        return new ez71(this.b, this.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    public final void b(pim0 pim0Var) {
        boolean z;
        ez71 ez71Var = (ez71) pim0Var;
        boolean zC = p3v.c(ez71Var.Q0, 1.0f);
        hw61 hw61Var = this.a;
        long j = this.b;
        if (zC && ez71Var.R0 == hw61Var) {
            long j2 = ez71Var.S0;
            int i = u7h.l;
            if (z4h1.b(j2, j)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        ez71Var.Q0 = 1.0f;
        ez71Var.R0 = hw61Var;
        ez71Var.S0 = j;
        if (z) {
            ez71Var.V0.H1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz71)) {
            return false;
        }
        cz71 cz71Var = (cz71) obj;
        if (!p3v.c(1.0f, 1.0f) || !this.a.equals(cz71Var.a)) {
            return false;
        }
        long j = cz71Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + (Float.hashCode(1.0f) * 31)) * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
