package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lr51 implements h0r0 {
    public final Resources a;
    public final qyj b;
    public final mr51 c;
    public final los d;
    public final e220 e;
    public final q120 f;
    public final nu g;
    public final up41 h;
    public final nl51 i;
    public final kt91 j;
    public final cbr0 k;
    public String l;
    public final dt71 m;

    public lr51(Resources resources, qyj qyjVar, mr51 mr51Var, los losVar, e220 e220Var, q120 q120Var, nu nuVar, up41 up41Var, nl51 nl51Var, kt91 kt91Var) {
        this.a = resources;
        this.b = qyjVar;
        this.c = mr51Var;
        this.d = losVar;
        this.e = e220Var;
        this.f = q120Var;
        this.g = nuVar;
        this.h = up41Var;
        this.i = nl51Var;
        this.j = kt91Var;
        dbr0 t1r0Var = new t1r0(true);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.k = new cbr0(new dbr0[]{t1r0Var, new bn70(yon1.G1("MAGPIE_FIELD_EDITOR", "magpie/field-editor", 980, "magpie"), nik1.k6, (nar0) null), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.5f)), ixb.b, (Integer) null, 2, new kxb(2131101412), losVar, false, false, false, new nsm0(2, this, lr51.class, "onOutsideTap", "onOutsideTap(FF)Z", 0, (byte) 23), 1988)}, false);
        this.l = mr51Var.b;
        this.m = mgo1.e(0, 1, 0, 5);
        losVar.c(new jr51(this, (byte) 0));
    }

    public final cbr0 a() {
        return this.k;
    }

    public final p2r0 b() {
        return this.b.a(new j2i(2086044141, new kr51(this, (byte) 2), true));
    }
}
