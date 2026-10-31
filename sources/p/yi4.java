package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yi4 implements pdy0 {
    public final xi4 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f = new idd1(new sh4(this, (byte) 20));

    public yi4(xi4 xi4Var, boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = xi4Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = lukVar;
    }

    public final xi4 a() {
        xi4 xi4VarA;
        yi4 yi4Var = (yi4) this.f.getValue();
        return (yi4Var == null || (xi4VarA = yi4Var.a()) == null) ? this.a : xi4VarA;
    }

    public final boolean b() {
        yi4 yi4Var = (yi4) this.f.getValue();
        return yi4Var != null ? yi4Var.b() : this.b;
    }

    public final boolean c() {
        yi4 yi4Var = (yi4) this.f.getValue();
        return yi4Var != null ? yi4Var.c() : this.c;
    }

    public final boolean d() {
        yi4 yi4Var = (yi4) this.f.getValue();
        return yi4Var != null ? yi4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        xi4[] xi4VarArrValues = xi4.values();
        ArrayList arrayList = new ArrayList(xi4VarArrValues.length);
        for (xi4 xi4Var : xi4VarArrValues) {
            arrayList.add(xi4Var.a);
        }
        return p7h.M(new fpb("data_source_behavior", "android-feature-version-sunsetting", str, arrayList), new fpb("dialog_can_be_blocking", "android-feature-version-sunsetting", b()), new fpb("dialog_enabled", "android-feature-version-sunsetting", c()), new fpb("player_observer_enabled", "android-feature-version-sunsetting", d()));
    }
}
