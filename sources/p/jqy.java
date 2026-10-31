package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jqy extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqy(boolean z, sqy sqyVar, String str, mr20 mr20Var, lzn0 lzn0Var, String str2, d0r d0rVar) {
        super(1);
        this.a = (byte) 0;
        this.b = z;
        this.c = sqyVar;
        this.d = str;
        this.f = mr20Var;
        this.g = lzn0Var;
        this.e = str2;
        this.h = d0rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = true;
        boolean z2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.h;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                dnc0 dnc0Var = (dnc0) obj;
                mr20 mr20Var = (mr20) obj6;
                String str = (String) obj7;
                sqy sqyVar = (sqy) obj4;
                if (!z2) {
                    o3r o3rVar = sqy.t;
                    two1.v(dnc0Var, new any(mr20Var, (byte) 4), false, new w3w(sqyVar, (lzn0) obj5, (byte) 24));
                    String str2 = (String) obj3;
                    if (str2 != null) {
                        Set set = s4b1.f;
                        if (uic.g(str2, blc0.Pg)) {
                            two1.v(dnc0Var, new ld2(mr20Var, str, (byte) 8), false, new gqy((d0r) obj2, sqyVar));
                        }
                    }
                } else {
                    o3r o3rVar2 = sqy.t;
                    sqyVar.a(dnc0Var, str, 1);
                    sqyVar.a(dnc0Var, str, 2);
                }
                break;
            case 1:
                fn31.T((c9n) obj4, (o8n) null, 0, new zj40((g6o0) obj7, ((qui1) obj).a, (cr41) obj3, (u5u) obj6, (pob0) obj5, this.b, (lbh) obj2, (lnm) null), 3);
                break;
            case 2:
                cm0 cm0Var = (cm0) obj6;
                ksk0 ksk0Var = (ksk0) obj5;
                rtb0 rtb0Var = (rtb0) obj;
                c380 c380Var = (c380) obj4;
                if (c380Var != null) {
                    z4p1.D(rtb0Var, c380Var, 2131961059, cm0Var, 0, ksk0Var);
                }
                c380 c380Var2 = (c380) obj7;
                if (c380Var2 != null) {
                    z4p1.D(rtb0Var, c380Var2, 2131961062, cm0Var, !z2 ? 1 : 0, ksk0Var);
                    rtb0Var = rtb0Var;
                }
                c380 c380Var3 = (c380) obj3;
                if (c380Var3 != null) {
                    rwj rwjVar = (rwj) obj2;
                    int i = z2 ? 1 : 2;
                    if (!c380Var3.isEmpty()) {
                        rtb0.c(rtb0Var, "upcoming-listening-parties", new j2i(587435889, new xo7(ksk0Var, i, c380Var3, rwjVar, (byte) 7), true), 2);
                    }
                }
                rtb0.c(rtb0Var, (Object) null, xcj.a, 3);
                break;
            case 3:
                ven0 ven0Var = (ven0) obj2;
                err0 err0Var = (hdn0) obj5;
                ven0 ven0Var2 = (ven0) obj6;
                boolean zB = ((wz20) obj).b();
                ((ven0) obj7).setValue(Boolean.valueOf(zB));
                ven0 ven0Var3 = (ven0) obj3;
                if (!((Boolean) ven0Var3.getValue()).booleanValue()) {
                    ven0Var3.setValue(Boolean.TRUE);
                } else {
                    uex0 uex0Var = uex0.c;
                    if (!zB && ((uex0) ven0Var2.getValue()) == uex0Var && z2) {
                        ven0Var2.setValue(uex0.d);
                        ydh.m(err0Var, 1);
                    } else {
                        uex0 uex0Var2 = (uex0) ven0Var2.getValue();
                        uex0 uex0Var3 = uex0.a;
                        Object[] objArr = uex0Var2 != uex0Var3;
                        if (!zB || ((uex0) ven0Var2.getValue()) != uex0.b) {
                            uex0Var = uex0Var3;
                        }
                        ven0Var2.setValue(uex0Var);
                        iu30 iu30Var = (iu30) obj4;
                        if (!zB || (!((Boolean) ven0Var.getValue()).booleanValue() && objArr != false)) {
                            z = false;
                        }
                        iu30Var.invoke(new d251(zB, z));
                        if (zB) {
                            ven0Var.setValue(Boolean.FALSE);
                        }
                    }
                }
                break;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                ven0 ven0Var4 = (ven0) obj7;
                drr0 drr0Var = (drr0) obj6;
                if (((Boolean) ((tob1) obj5).getValue()).booleanValue() && !z2 && !((Boolean) ((ven0) obj4).getValue()).booleanValue()) {
                    if (!((Boolean) ven0Var4.getValue()).booleanValue()) {
                        ven0Var4.setValue(Boolean.TRUE);
                        ((drr0) obj3).t(drr0Var.s());
                    }
                    drr0Var.t(yoi1.o(drr0Var.s() - fFloatValue, 0.0f, ((Number) ((tob1) obj2).getValue()).floatValue()));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jqy(boolean z, Object obj, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, tob1 tob1Var, tob1 tob1Var2, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
        this.g = tob1Var;
        this.h = tob1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jqy(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.b = z;
        this.h = obj6;
    }
}
