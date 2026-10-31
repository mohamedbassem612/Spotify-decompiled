package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ag4 implements pdy0 {
    public final boolean a;
    public final zf4 b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public ag4(boolean z, zf4 zf4Var, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = zf4Var;
        this.c = z2;
        this.d = z3;
        this.e = lukVar;
        this.f = new idd1(new q30(this, (byte) 9));
    }

    public final boolean a() {
        ag4 ag4Var = (ag4) this.f.getValue();
        return ag4Var != null ? ag4Var.a() : this.a;
    }

    public final zf4 b() {
        zf4 zf4VarB;
        ag4 ag4Var = (ag4) this.f.getValue();
        return (ag4Var == null || (zf4VarB = ag4Var.b()) == null) ? this.b : zf4VarB;
    }

    public final boolean c() {
        ag4 ag4Var = (ag4) this.f.getValue();
        return ag4Var != null ? ag4Var.c() : this.c;
    }

    public final boolean d() {
        ag4 ag4Var = (ag4) this.f.getValue();
        return ag4Var != null ? ag4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("personalized_recommendations_redirect_enabled", "android-feature-dsa", a());
        String str = b().a;
        zf4[] zf4VarArrValues = zf4.values();
        ArrayList arrayList = new ArrayList(zf4VarArrValues.length);
        for (zf4 zf4Var : zf4VarArrValues) {
            arrayList.add(zf4Var.a);
        }
        return p7h.M(fpbVar, new fpb("personalized_recommendations_sheets_copy", "android-feature-dsa", str, arrayList), new fpb("personalized_recommendations_toggle_enabled", "android-feature-dsa", c()), new fpb("should_display_empty_state", "android-feature-dsa", d()));
    }

    public ag4(luk lukVar) {
        this(false, zf4.V3, false, true, lukVar);
    }
}
