package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r251 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lz20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r251(lz20 lz20Var, byte b) {
        super(5);
        this.a = b;
        this.b = lz20Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                l251 l251Var = (l251) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                int i = (iIntValue & 48) == 0 ? (x340Var.g(l251Var) ? 32 : 16) | iIntValue : iIntValue;
                if ((iIntValue & 384) == 0) {
                    i |= x340Var.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 1169) != 1168)) {
                    x340Var2.b0();
                } else {
                    Object[] objArr = new Object[0];
                    int i2 = i & 112;
                    boolean z = i2 == 32;
                    Object objT = x340Var2.T();
                    if (z || objT == m4cVar) {
                        objT = new g521(l251Var, (byte) 28);
                        x340Var2.s0(objT);
                    }
                    ven0 ven0VarV = k5p1.v(objArr, c8e1.d, (Function0) objT, x340Var2, 0);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(l251Var.a);
                        x340Var2.s0(objT2);
                    }
                    ven0 ven0Var = (ven0) objT2;
                    int i3 = i & 896;
                    boolean z2 = (i2 == 32) | (i3 == 256);
                    Object objT3 = x340Var2.T();
                    if (z2 || objT3 == m4cVar) {
                        objT3 = new n641(l251Var, ven0Var, iu30Var, (lnm) null, (byte) 12);
                        x340Var2.s0(objT3);
                    }
                    qxd0.t(350L, x340Var2, (vu30) objT3);
                    c8e1 c8e1Var = (c8e1) ven0VarV.getValue();
                    String str = l251Var.b;
                    String str2 = l251Var.c;
                    boolean zG = x340Var2.g(ven0VarV);
                    Object objT4 = x340Var2.T();
                    if (zG || objT4 == m4cVar) {
                        objT4 = new xs3(ven0VarV, ven0Var, (byte) 18);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var2 = (iu30) objT4;
                    boolean z3 = i3 == 256;
                    Object objT5 = x340Var2.T();
                    if (z3 || objT5 == m4cVar) {
                        objT5 = new n601(iu30Var, (byte) 17);
                        x340Var2.s0(objT5);
                    }
                    iu30 iu30Var3 = (iu30) objT5;
                    boolean zG2 = x340Var2.g(ven0VarV) | (i3 == 256);
                    Object objT6 = x340Var2.T();
                    if (zG2 || objT6 == m4cVar) {
                        objT6 = new rc21(iu30Var, ven0VarV, (byte) 2);
                        x340Var2.s0(objT6);
                    }
                    ezn1.e(c8e1Var, str, str2, this.b, iu30Var2, iu30Var3, (Function0) objT6, (qim0) null, x340Var2, 0);
                }
                break;
            default:
                l251 l251Var2 = (l251) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                int i4 = (iIntValue2 & 48) == 0 ? iIntValue2 | (x340Var3.g(l251Var2) ? 32 : 16) : iIntValue2;
                if ((iIntValue2 & 384) == 0) {
                    i4 |= x340Var3.i(iu30Var4) ? 256 : 128;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    x340Var4.b0();
                } else {
                    y7e1 y7e1VarD = c4p1.D(0, 2, l251Var2.a, x340Var4);
                    boolean zG3 = x340Var4.g(y7e1VarD) | ((i4 & 112) == 32);
                    int i5 = i4 & 896;
                    boolean z4 = zG3 | (i5 == 256);
                    Object objT7 = x340Var4.T();
                    if (z4 || objT7 == m4cVar2) {
                        n641 n641Var = new n641(l251Var2, y7e1VarD, iu30Var4, (lnm) null, (byte) 13);
                        x340Var4.s0(n641Var);
                        objT7 = n641Var;
                    }
                    qxd0.s(y7e1VarD, 350L, (vu30) objT7, x340Var4);
                    String str3 = l251Var2.b;
                    String str4 = l251Var2.c;
                    boolean zG4 = (i5 == 256) | x340Var4.g(y7e1VarD);
                    Object objT8 = x340Var4.T();
                    if (zG4 || objT8 == m4cVar2) {
                        objT8 = new efb(iu30Var4, y7e1VarD, (byte) 7);
                        x340Var4.s0(objT8);
                    }
                    Function0 function0 = (Function0) objT8;
                    boolean zG5 = x340Var4.g(y7e1VarD) | (i5 == 256);
                    Object objT9 = x340Var4.T();
                    if (zG5 || objT9 == m4cVar2) {
                        objT9 = new efb(y7e1VarD, iu30Var4, (byte) 8);
                        x340Var4.s0(objT9);
                    }
                    jzn1.m(y7e1VarD, str3, str4, this.b, function0, (Function0) objT9, (qim0) null, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }
}
