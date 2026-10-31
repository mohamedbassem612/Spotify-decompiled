package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/bh10;", "Lp/uim0;", "Lp/ch10;", "src_main_java_com_spotify_encore_tabs-tabs"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class bh10 extends uim0 {
    public final es41 a;
    public final float b;
    public final long c;

    public bh10(es41 es41Var, float f, long j) {
        this.a = es41Var;
        this.b = f;
        this.c = j;
    }

    public final pim0 a() {
        ch10 ch10Var = new ch10();
        ch10Var.O0 = this.a;
        ch10Var.P0 = this.b;
        ch10Var.Q0 = this.c;
        return ch10Var;
    }

    public final void b(pim0 pim0Var) {
        ch10 ch10Var = (ch10) pim0Var;
        ch10Var.O0 = this.a;
        ch10Var.P0 = this.b;
        ch10Var.Q0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bh10) {
            bh10 bh10Var = (bh10) obj;
            if (this.a == bh10Var.a && p3v.c(this.b, bh10Var.b)) {
                long j = bh10Var.c;
                int i = u7h.l;
                if (z4h1.b(this.c, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = x0d.f(this.a.hashCode() * 31, 31, this.b);
        int i = u7h.l;
        return Long.hashCode(this.c) + iF;
    }
}
