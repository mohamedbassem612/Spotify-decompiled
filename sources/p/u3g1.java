package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u3g1 extends hab0 implements bv30 {
    public final /* synthetic */ hry0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ t62 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3g1(hry0 hry0Var, boolean z, Map map, t62 t62Var) {
        super(5);
        this.a = hry0Var;
        this.b = z;
        this.c = map;
        this.d = t62Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gqa1 gqa1Var;
        gjf1 gjf1Var = (gjf1) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
        String str = gjf1Var.a;
        String str2 = gjf1Var.b;
        t62 t62Var = this.d;
        t3g1 t3g1Var = new t3g1(gjf1Var, t62Var, zBooleanValue, (byte) 0);
        boolean z = true;
        t3g1 t3g1Var2 = new t3g1(gjf1Var, t62Var, zBooleanValue, (byte) 1);
        k8f0 k8f0Var = this.a.b;
        if (!gjf1Var.h && !zBooleanValue2) {
            z = false;
        }
        return new m2g1(str, str2, t3g1Var, t3g1Var2, k8f0Var, z, gjf1Var.i, zBooleanValue3 && this.b && gjf1Var.j, (gjf1Var.g != 2 || zBooleanValue || (gqa1Var = (gqa1) this.c.get(str2)) == null) ? eqa1.a : gqa1Var, zBooleanValue4, zBooleanValue3);
    }
}
