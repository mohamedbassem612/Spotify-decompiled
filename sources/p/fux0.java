package p;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fux0 implements h0r0 {
    public final hux0 a;
    public final pkq b;
    public final xkq c;
    public final cbr0 d;

    public fux0(Context context, hux0 hux0Var, h931 h931Var, pkq pkqVar, xkq xkqVar, m4c m4cVar, bf4 bf4Var, h2r0 h2r0Var) {
        this.a = hux0Var;
        this.b = pkqVar;
        this.c = xkqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new yxe1(new ehc1(context.getString(bf4Var.b() ? 2131960608 : 2131960607))), new t1r0(true), new bn70(yon1.E3(), hux0Var.a() == null ? nik1.G4 : nik1.H4.b(m4c.n(hux0Var.a())), (nar0) null), new hgr0(egr0.a, 0, 2), new ktl1(16), new s9h1(14, h2r0Var.a.b(), false, false)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return h931.a(new y6w0(this, (byte) 12), new dvt0(this, (byte) 24));
    }
}
