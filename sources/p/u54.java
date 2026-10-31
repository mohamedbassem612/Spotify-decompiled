package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u54 implements pdy0 {
    public final int a;
    public final boolean b;
    public final int c;
    public final t54 d;
    public final luk e;
    public final idd1 f = new idd1(new m44(this, (byte) 23));

    public u54(int i, boolean z, int i2, t54 t54Var, luk lukVar) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = t54Var;
        this.e = lukVar;
    }

    public final int a() {
        u54 u54Var = (u54) this.f.getValue();
        return u54Var != null ? u54Var.a() : this.a;
    }

    public final int b() {
        u54 u54Var = (u54) this.f.getValue();
        return u54Var != null ? u54Var.b() : this.c;
    }

    public final t54 c() {
        t54 t54VarC;
        u54 u54Var = (u54) this.f.getValue();
        return (u54Var == null || (t54VarC = u54Var.c()) == null) ? this.d : t54VarC;
    }

    public final boolean d() {
        u54 u54Var = (u54) this.f.getValue();
        return u54Var != null ? u54Var.d() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("intervening_time_in_hours", "android-audiobooks-onboarding-bottom-sheet", a(), 0, Integer.MAX_VALUE);
        fpb fpbVar2 = new fpb("is_eligible", "android-audiobooks-onboarding-bottom-sheet", d());
        fpb fpbVar3 = new fpb("presentation_cap", "android-audiobooks-onboarding-bottom-sheet", b(), 1, Integer.MAX_VALUE);
        String str = c().a;
        t54[] t54VarArrValues = t54.values();
        ArrayList arrayList = new ArrayList(t54VarArrValues.length);
        for (t54 t54Var : t54VarArrValues) {
            arrayList.add(t54Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, new fpb("type", "android-audiobooks-onboarding-bottom-sheet", str, arrayList));
    }
}
