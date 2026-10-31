package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class isv0 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final hsv0 d;
    public final luk e;
    public final idd1 f = new idd1(new z6v0(this, (byte) 11));

    public isv0(boolean z, boolean z2, boolean z3, hsv0 hsv0Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = hsv0Var;
        this.e = lukVar;
    }

    public final boolean a() {
        isv0 isv0Var = (isv0) this.f.getValue();
        return isv0Var != null ? isv0Var.a() : this.a;
    }

    public final boolean b() {
        isv0 isv0Var = (isv0) this.f.getValue();
        return isv0Var != null ? isv0Var.b() : this.b;
    }

    public final boolean c() {
        isv0 isv0Var = (isv0) this.f.getValue();
        return isv0Var != null ? isv0Var.c() : this.c;
    }

    public final hsv0 d() {
        hsv0 hsv0VarD;
        isv0 isv0Var = (isv0) this.f.getValue();
        return (isv0Var == null || (hsv0VarD = isv0Var.d()) == null) ? this.d : hsv0VarD;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("enable_premium_marketing", "premium-destination", a());
        fpb fpbVar2 = new fpb("premium_tab_enabled", "premium-destination", b());
        fpb fpbVar3 = new fpb("premium_tab_shows_on_tablets", "premium-destination", c());
        String str = d().a;
        hsv0[] hsv0VarArrValues = hsv0.values();
        ArrayList arrayList = new ArrayList(hsv0VarArrValues.length);
        for (hsv0 hsv0Var : hsv0VarArrValues) {
            arrayList.add(hsv0Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, new fpb("premium_tab_title", "premium-destination", str, arrayList));
    }
}
