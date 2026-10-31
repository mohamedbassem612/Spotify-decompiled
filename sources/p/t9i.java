package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t9i extends hab0 implements bv30 {
    public static final t9i a = new t9i(5);

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        otn0 otn0Var = (otn0) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        float f = ((p3v) obj3).a;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(otn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.h(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.d(f) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1171) != 1170)) {
            mp10.c(otn0Var, zBooleanValue, f, (qim0) null, (qim0) null, (qim0) null, x340Var2, i & 1022, 28);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
