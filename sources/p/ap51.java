package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ap51 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap51(c8u0 c8u0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 0;
        this.c = c8u0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        switch (b) {
            case 0:
                return new ap51((c8u0) this.c, (lnm) obj3).invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ap51 ap51Var = new ap51(b2, (lnm) obj3, (byte) 1);
                ap51Var.c = (bd61) obj;
                ap51Var.b = zBooleanValue;
                return ap51Var.invokeSuspend(rih1Var);
            case 2:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ap51 ap51Var2 = new ap51(b2, (lnm) obj3, (byte) 2);
                ap51Var2.b = zBooleanValue2;
                ap51Var2.c = (ibk0) obj2;
                return ap51Var2.invokeSuspend(rih1Var);
            case 3:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                ap51 ap51Var3 = new ap51(b2, (lnm) obj3, b2);
                ap51Var3.c = (bc71) obj;
                ap51Var3.b = zBooleanValue3;
                return ap51Var3.invokeSuspend(rih1Var);
            case 4:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                ap51 ap51Var4 = new ap51(b2, (lnm) obj3, (byte) 4);
                ap51Var4.c = (sp91) obj;
                ap51Var4.b = zBooleanValue4;
                return ap51Var4.invokeSuspend(rih1Var);
            case 5:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                ap51 ap51Var5 = new ap51(b2, (lnm) obj3, (byte) 5);
                ap51Var5.c = (px0) obj;
                ap51Var5.b = zBooleanValue5;
                return ap51Var5.invokeSuspend(rih1Var);
            case 6:
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                ap51 ap51Var6 = new ap51(b2, (lnm) obj3, (byte) 6);
                ap51Var6.c = (vyo0) obj;
                ap51Var6.b = zBooleanValue6;
                return ap51Var6.invokeSuspend(rih1Var);
            case 7:
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                ap51 ap51Var7 = new ap51(b2, (lnm) obj3, (byte) 7);
                ap51Var7.b = zBooleanValue7;
                ap51Var7.c = (Integer) obj2;
                return ap51Var7.invokeSuspend(rih1Var);
            case 8:
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                ap51 ap51Var8 = new ap51(b2, (lnm) obj3, (byte) 8);
                ap51Var8.c = (ksc1) obj;
                ap51Var8.b = zBooleanValue8;
                return ap51Var8.invokeSuspend(rih1Var);
            case 9:
                boolean zBooleanValue9 = ((Boolean) obj2).booleanValue();
                ap51 ap51Var9 = new ap51(b2, (lnm) obj3, (byte) 9);
                ap51Var9.c = (dma) obj;
                ap51Var9.b = zBooleanValue9;
                return ap51Var9.invokeSuspend(rih1Var);
            case 10:
                boolean zBooleanValue10 = ((Boolean) obj2).booleanValue();
                ap51 ap51Var10 = new ap51(b2, (lnm) obj3, (byte) 10);
                ap51Var10.c = (dsf1) obj;
                ap51Var10.b = zBooleanValue10;
                return ap51Var10.invokeSuspend(rih1Var);
            case 11:
                boolean zBooleanValue11 = ((Boolean) obj).booleanValue();
                ap51 ap51Var11 = new ap51(b2, (lnm) obj3, (byte) 11);
                ap51Var11.b = zBooleanValue11;
                ap51Var11.c = (y2u0) obj2;
                return ap51Var11.invokeSuspend(rih1Var);
            case 12:
                long j = ((Offset) obj2).a;
                ap51 ap51Var12 = new ap51(b2, (lnm) obj3, (byte) 12);
                ap51Var12.c = (p9w0) obj;
                return ap51Var12.invokeSuspend(rih1Var);
            case 13:
                boolean zBooleanValue12 = ((Boolean) obj2).booleanValue();
                ap51 ap51Var13 = new ap51(b2, (lnm) obj3, (byte) 13);
                ap51Var13.c = (s7n0) obj;
                ap51Var13.b = zBooleanValue12;
                return ap51Var13.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue13 = ((Boolean) obj).booleanValue();
                ap51 ap51Var14 = new ap51(b2, (lnm) obj3, (byte) 14);
                ap51Var14.b = zBooleanValue13;
                ap51Var14.c = (bpm1) obj2;
                return ap51Var14.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        boolean z = false;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    zuw0 zuw0Var = ((c8u0) this.c).c;
                    this.b = true;
                    return zuw0Var.f(false, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                bd61 bd61Var = (bd61) this.c;
                boolean z3 = this.b;
                hm5.M(obj);
                return new bd61(bd61Var.a, bd61Var.b, bd61Var.c, bd61Var.d, bd61Var.e, z3);
            case 2:
                boolean z4 = this.b;
                ibk0 ibk0Var = (ibk0) this.c;
                hm5.M(obj);
                return new m171(z4, ibk0Var);
            case 3:
                bc71 bc71Var = (bc71) this.c;
                boolean z5 = this.b;
                hm5.M(obj);
                return new cq71(bc71Var, z5);
            case 4:
                sp91 sp91Var = (sp91) this.c;
                boolean z6 = this.b;
                hm5.M(obj);
                return new bm91(sp91Var.a, sp91Var.c, sp91Var.k, sp91Var.i.contains(rp91.c), z6);
            case 5:
                px0 px0Var = (px0) this.c;
                boolean z7 = this.b;
                hm5.M(obj);
                if ((px0Var instanceof mx0) && !z7) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                vyo0 vyo0Var = (vyo0) this.c;
                boolean z8 = this.b;
                hm5.M(obj);
                if (z8) {
                    return vyo0Var;
                }
                return null;
            case 7:
                boolean z9 = this.b;
                Integer num = (Integer) this.c;
                hm5.M(obj);
                num.getClass();
                return new jsb1(num.intValue(), z9);
            case 8:
                ksc1 ksc1Var = (ksc1) this.c;
                boolean z10 = this.b;
                hm5.M(obj);
                return new jsc1(ksc1Var, z10);
            case 9:
                dma dmaVar = (dma) this.c;
                boolean z11 = this.b;
                hm5.M(obj);
                if (!z11) {
                    if (dmaVar instanceof bma) {
                        eld1 eld1Var = eld1.c;
                        h8k1 h8k1Var = new h8k1(eld1Var, eld1Var);
                        fld1 fld1Var = new fld1(((bma) dmaVar).a);
                        return p7h.M(new h8k1[]{h8k1Var, new h8k1(fld1Var, fld1Var)});
                    }
                    if (!u890.j(dmaVar, cma.a)) {
                        eg.o();
                        return null;
                    }
                }
                return z6x.a;
            case 10:
                dsf1 dsf1Var = (dsf1) this.c;
                boolean z12 = this.b;
                hm5.M(obj);
                if (dsf1Var.c && !z12) {
                    z = true;
                }
                return new dsf1(dsf1Var.a, dsf1Var.b, z);
            case 11:
                boolean z13 = this.b;
                y2u0 y2u0Var = (y2u0) this.c;
                hm5.M(obj);
                return new mtj1(z13, y2u0Var);
            case 12:
                p9w0 p9w0Var = (p9w0) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return p9w0Var.d(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z14) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                s7n0 s7n0Var = (s7n0) this.c;
                boolean z15 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z15 || s7n0Var == s7n0.b || s7n0Var == s7n0.c);
            default:
                boolean z16 = this.b;
                bpm1 bpm1Var = (bpm1) this.c;
                hm5.M(obj);
                if (bpm1Var instanceof xom1) {
                    xom1 xom1Var = (xom1) bpm1Var;
                    return new fom1(xom1Var.a, xom1Var.b, xom1Var.c ? iom1.a : new hom1(xom1Var.d), z16);
                }
                if ((bpm1Var instanceof zom1) || (bpm1Var instanceof yom1) || (bpm1Var instanceof apm1)) {
                    return gom1.a;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap51(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
