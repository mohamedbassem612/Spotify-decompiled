package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/ugd1;", "Lp/uim0;", "Lp/wgd1;", "src_main_java_com_spotify_encore_tabs-tabs"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class ugd1 extends uim0 {
    public final lhd1 a;
    public final float b;
    public final pxg1 c;

    public ugd1(lhd1 lhd1Var, float f, pxg1 pxg1Var) {
        this.a = lhd1Var;
        this.b = f;
        this.c = pxg1Var;
    }

    public final pim0 a() {
        wgd1 wgd1Var = new wgd1();
        wgd1Var.O0 = this.a;
        wgd1Var.P0 = 16.0f;
        wgd1Var.Q0 = this.b;
        return wgd1Var;
    }

    public final void b(pim0 pim0Var) {
        wgd1 wgd1Var = (wgd1) pim0Var;
        wgd1Var.P0 = 16.0f;
        wgd1Var.Q0 = this.b;
        lhd1 lhd1Var = wgd1Var.O0;
        lhd1 lhd1Var2 = this.a;
        if (u890.j(lhd1Var, lhd1Var2)) {
            return;
        }
        wgd1Var.O0 = lhd1Var2;
        fn31.T(wgd1Var.v1(), (o8n) null, 0, new wba1(wgd1Var, lhd1Var2, this.c, (lnm) null, (byte) 5), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugd1)) {
            return false;
        }
        ugd1 ugd1Var = (ugd1) obj;
        return this.a.equals(ugd1Var.a) && p3v.c(16.0f, 16.0f) && p3v.c(this.b, ugd1Var.b) && this.c.equals(ugd1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.f(x0d.f(this.a.hashCode() * 31, 31, 16.0f), 31, this.b);
    }
}
