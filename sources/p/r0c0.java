package p;

import io.reactivex.rxjava3.functions.Function4;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r0c0 implements Function4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public r0c0(t0c0 t0c0Var, boolean z, boolean z2, boolean z3) {
        this.d = t0c0Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        evm1 evm1Var = ((t0c0) this.d).b;
        boolean zD = evm1Var.d();
        boolean zN = evm1Var.n();
        boolean zY = evm1Var.y();
        boolean zG = evm1Var.G();
        boolean z = false;
        boolean z2 = this.a;
        boolean z3 = (z2 || zBooleanValue || !zD) ? false : true;
        boolean z4 = this.b;
        boolean z5 = !z2 && z4 && !zBooleanValue2 && zN;
        boolean z6 = z2 && z4 && !zBooleanValue3 && zY;
        if (z4 && this.c && !zBooleanValue4 && zG) {
            z = true;
        }
        return new q0c0(z5, z3, z, z6);
    }

    public /* synthetic */ r0c0() {
        this((String) null, false, true, false);
    }

    public r0c0(String str, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
    }
}
