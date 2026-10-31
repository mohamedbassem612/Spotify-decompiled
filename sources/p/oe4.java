package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oe4 implements pdy0 {
    public final ne4 a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public oe4(ne4 ne4Var, boolean z, luk lukVar) {
        this.a = ne4Var;
        this.b = z;
        this.c = lukVar;
        this.d = new idd1(new wb4(this, (byte) 29));
    }

    public final ne4 a() {
        ne4 ne4VarA;
        oe4 oe4Var = (oe4) this.d.getValue();
        return (oe4Var == null || (ne4VarA = oe4Var.a()) == null) ? this.a : ne4VarA;
    }

    public final boolean b() {
        oe4 oe4Var = (oe4) this.d.getValue();
        return oe4Var != null ? oe4Var.b() : this.b;
    }

    public final List models() {
        String str = a().a;
        ne4[] ne4VarArrValues = ne4.values();
        ArrayList arrayList = new ArrayList(ne4VarArrValues.length);
        for (ne4 ne4Var : ne4VarArrValues) {
            arrayList.add(ne4Var.a);
        }
        return p7h.M(new fpb[]{new fpb("experiment", "android-entitypages-shuffleonfreeimpl", str, arrayList), new fpb("smart_shuffle_hide_new_badge_on_premium_when_upsell_was_seen_on_free", "android-entitypages-shuffleonfreeimpl", b())});
    }

    public oe4(luk lukVar) {
        this(ne4.LINEAR, false, lukVar);
    }
}
