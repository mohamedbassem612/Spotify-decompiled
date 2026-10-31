package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l750 implements h0r0 {
    public final Activity a;
    public final lzn0 b;
    public final qyj c;
    public final o750 d;
    public final lc20 e;

    public l750(Activity activity, lzn0 lzn0Var, qyj qyjVar, o750 o750Var, lc20 lc20Var) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = qyjVar;
        this.d = o750Var;
        this.e = lc20Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        o750 o750Var = this.d;
        return new cbr0(new dbr0[]{yxe1Var, u890.j(o750Var.a(), nik1.c4) ? new bn70((n6r0) o750Var.e(), o750Var.a(), (v8h1) t8p1.o()) : new bn70(o750Var.e(), o750Var.a(), (nar0) null), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.c.a(apo.j(-482115277, new rr10(this, (byte) 29), true));
    }
}
