package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v74 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new u74(this, (byte) 0));

    public v74(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        v74 v74Var = (v74) this.d.getValue();
        return v74Var != null ? v74Var.a() : this.a;
    }

    public final boolean b() {
        v74 v74Var = (v74) this.d.getValue();
        return v74Var != null ? v74Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_overflow_area_bit_filter", "android-ble-scanning", a()), new fpb("include_overflow_area_scan_filter", "android-ble-scanning", b())});
    }
}
