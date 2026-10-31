package p;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class znv0 implements h0r0 {
    public final oj80 a;
    public final cbr0 b;

    public znv0(oj80 oj80Var) {
        this.a = oj80Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131960268));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("ADS_PREFERRED_AD_CATEGORIES", "ads/preferred-ad-categories", 23, "ads"), new lik1("spotify:internal:ads:preferred-ad-categories"), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.b;
    }

    public final p2r0 b() {
        ArrayList arrayList = uk0.c;
        oj80 oj80Var = this.a;
        return ((qyj) oj80Var.b).a(new j2i(-1708414945, new nk0(oj80Var, 1, 2131960267, (Integer) null, arrayList), true));
    }
}
