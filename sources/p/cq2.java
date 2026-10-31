package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cq2 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq2(boolean z, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 6;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                cq2 cq2Var = new cq2((fq2) this.d, (lnm) obj3, (byte) 0);
                cq2Var.c = zBooleanValue;
                return cq2Var.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                cq2 cq2Var2 = new cq2((aw8) this.d, (lnm) obj3, (byte) 1);
                cq2Var2.b = zBooleanValue2;
                cq2Var2.c = zBooleanValue3;
                return cq2Var2.invokeSuspend(rih1Var);
            case 2:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                cq2 cq2Var3 = new cq2((gfr) this.d, (lnm) obj3, (byte) 2);
                cq2Var3.b = zBooleanValue4;
                cq2Var3.c = zBooleanValue5;
                return cq2Var3.invokeSuspend(rih1Var);
            case 3:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                cq2 cq2Var4 = new cq2((d1n0) this.d, (lnm) obj3, (byte) 3);
                cq2Var4.b = zBooleanValue6;
                cq2Var4.c = zBooleanValue7;
                return cq2Var4.invokeSuspend(rih1Var);
            case 4:
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                cq2 cq2Var5 = new cq2((iu30) this.d, (lnm) obj3, (byte) 4);
                cq2Var5.c = zBooleanValue8;
                return cq2Var5.invokeSuspend(rih1Var);
            case 5:
                boolean zBooleanValue9 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue10 = ((Boolean) obj2).booleanValue();
                cq2 cq2Var6 = new cq2((a4q0) this.d, (lnm) obj3, (byte) 5);
                cq2Var6.b = zBooleanValue9;
                cq2Var6.c = zBooleanValue10;
                return cq2Var6.invokeSuspend(rih1Var);
            case 6:
                boolean zBooleanValue11 = ((Boolean) obj).booleanValue();
                cq2 cq2Var7 = new cq2(this.c, (lnm) obj3);
                cq2Var7.b = zBooleanValue11;
                cq2Var7.d = (r5l) obj2;
                return cq2Var7.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue12 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue13 = ((Boolean) obj2).booleanValue();
                cq2 cq2Var8 = new cq2((String) this.d, (lnm) obj3, (byte) 7);
                cq2Var8.b = zBooleanValue12;
                cq2Var8.c = zBooleanValue13;
                return cq2Var8.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z3 = this.c;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    if (z3) {
                        fq2 fq2Var = (fq2) this.d;
                        this.c = z3;
                        this.b = true;
                        Set set = fq2.c0;
                        if (fq2Var.v(false, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 1:
                boolean z5 = this.b;
                boolean z6 = this.c;
                hm5.M(obj);
                return Boolean.valueOf(((aw8) this.d).c.a.getResources().getBoolean(2131034136) && z5 && z6);
            case 2:
                idd1 idd1Var = (idd1) ((gfr) this.d).d;
                boolean z7 = this.b;
                boolean z8 = this.c;
                hm5.M(obj);
                return new hq3(!z7 && ((Boolean) idd1Var.getValue()).booleanValue(), !z8 && ((Boolean) idd1Var.getValue()).booleanValue());
            case 3:
                boolean z9 = this.b;
                boolean z10 = this.c;
                hm5.M(obj);
                dxy dxyVar = ((d1n0) this.d).a;
                idd1 idd1Var2 = (idd1) dxyVar.g;
                idd1 idd1Var3 = (idd1) dxyVar.f;
                if (z10) {
                    u0n0 u0n0Var = (u0n0) dxyVar.c;
                    return z9 ? new b1n0(u0n0Var, (u0n0) dxyVar.d, (u0n0) dxyVar.e, (u0n0) idd1Var3.getValue(), (u0n0) idd1Var2.getValue(), 32) : new b1n0(u0n0Var, (u0n0) dxyVar.d, (u0n0) dxyVar.e, (u0n0) idd1Var3.getValue(), (u0n0) null, 48);
                }
                u0n0 u0n0Var2 = (u0n0) dxyVar.c;
                return z9 ? new b1n0(u0n0Var2, (u0n0) dxyVar.d, (u0n0) dxyVar.e, (u0n0) idd1Var2.getValue(), (u0n0) null, 48) : new b1n0(u0n0Var2, (u0n0) dxyVar.d, (u0n0) dxyVar.e, (u0n0) null, (u0n0) null, 56);
            case 4:
                boolean z11 = this.c;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    if (z11) {
                        iu30 iu30Var = (iu30) this.d;
                        this.c = z11;
                        this.b = true;
                        obj = iu30Var.invoke(this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (!z12) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            case 5:
                boolean z13 = this.b;
                boolean z14 = this.c;
                hm5.M(obj);
                boolean z15 = z13 && z14;
                return new qrg1(z13, z13, z15, z15 && ((a4q0) this.d).a.f());
            case 6:
                boolean z16 = this.b;
                p5l p5lVar = (r5l) this.d;
                hm5.M(obj);
                if (z16) {
                    boolean z17 = this.c;
                    if (p5lVar instanceof o5l) {
                        z2 = false;
                    } else if (p5lVar instanceof q5l) {
                        if (z17) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        if (!(p5lVar instanceof p5l)) {
                            eg.o();
                            return null;
                        }
                        f0u f0uVar = p5lVar.c;
                        z2 = f0uVar == f0u.d || f0uVar == f0u.c;
                        if (!z17) {
                            if (z2) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                    z = z2;
                }
                return Boolean.valueOf(z);
            default:
                boolean z18 = this.b;
                boolean z19 = this.c;
                hm5.M(obj);
                if (z19) {
                    return z6x.a;
                }
                String str = (String) this.d;
                if (z18) {
                    cld1 cld1Var = new cld1(str);
                    h8k1 h8k1Var = new h8k1(cld1Var, cld1Var);
                    dld1 dld1Var = new dld1(str);
                    return p7h.M(new h8k1[]{h8k1Var, new h8k1(dld1Var, dld1Var)});
                }
                cld1 cld1Var2 = new cld1(str);
                h8k1 h8k1Var2 = new h8k1(cld1Var2, cld1Var2);
                bld1 bld1Var = new bld1(str);
                return p7h.M(new h8k1[]{h8k1Var2, new h8k1(bld1Var, bld1Var)});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq2(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
