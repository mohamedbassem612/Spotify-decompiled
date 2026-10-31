package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qh4 implements pdy0 {
    public final boolean a;
    public final ph4 b;
    public final luk c;
    public final idd1 d;

    public qh4(boolean z, ph4 ph4Var, luk lukVar) {
        this.a = z;
        this.b = ph4Var;
        this.c = lukVar;
        this.d = new idd1(new cg4(this, (byte) 28));
    }

    public final boolean a() {
        qh4 qh4Var = (qh4) this.d.getValue();
        return qh4Var != null ? qh4Var.a() : this.a;
    }

    public final ph4 b() {
        ph4 ph4VarB;
        qh4 qh4Var = (qh4) this.d.getValue();
        return (qh4Var == null || (ph4VarB = qh4Var.b()) == null) ? this.b : ph4VarB;
    }

    public final List models() {
        fpb fpbVar = new fpb("enable_premium_banner", "android-feature-premium-banner", a());
        String str = b().a;
        ph4[] ph4VarArrValues = ph4.values();
        ArrayList arrayList = new ArrayList(ph4VarArrValues.length);
        for (ph4 ph4Var : ph4VarArrValues) {
            arrayList.add(ph4Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, new fpb("layout_variant", "android-feature-premium-banner", str, arrayList)});
    }

    public qh4(luk lukVar) {
        this(false, ph4.TOP_BANNER, lukVar);
    }
}
