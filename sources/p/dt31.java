package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dt31 implements wf81 {
    public final oe41 a;
    public final bpb1 b;
    public final xe01 c;

    public dt31(oe41 oe41Var) {
        this.a = oe41Var;
        Bundle bundleA = oe41Var.a("com.spotify.sidedrawer.sidedrawerimpl.accessory_state");
        bpb1 bpb1VarB = gio1.b(Boolean.valueOf(bundleA != null ? bundleA.getBoolean("is_expanded") : false));
        this.b = bpb1VarB;
        this.c = d5p1.t(new iib(new ht20(bpb1VarB, new kdt0(this, null, (byte) 17)), new xx0(this, (lnm) null, (byte) 21), (byte) 6), smo1.e(igu.b), new alb1(0L, Long.MAX_VALUE), bpb1VarB.getValue());
    }

    public final void a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        bpb1 bpb1Var = this.b;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, boolValueOf);
    }

    public final xe01 b() {
        return this.c;
    }

    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
