package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tb60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb60(int i, boolean z, String str, tob1 tob1Var) {
        super(1);
        this.c = i;
        this.b = z;
        this.d = str;
        this.e = tob1Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:64:0x012d  */
    public final Object invoke(Object obj) {
        d761 d761Var;
        d761 d761Var2;
        byte b = this.a;
        boolean zA = false;
        int i = this.c;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kd31 kd31Var = (kd31) obj;
                jkr0 jkr0Var = (jkr0) obj3;
                qb60 qb60Var = (rb60) obj2;
                if (qb60Var instanceof qb60) {
                    rlx0 rlx0Var = qb60Var.a;
                    if (rlx0Var.c.a() || rlx0Var.d.a()) {
                        kd31Var.i(2);
                    }
                } else {
                    if (!(qb60Var instanceof pb60)) {
                        eg.o();
                        return null;
                    }
                    ta60 ta60Var = ((pb60) qb60Var).a;
                    if (ta60Var.f) {
                        kd31Var.i(2);
                    } else {
                        la60 la60Var = ta60Var.e;
                        if (la60Var instanceof ga60) {
                            ga60 ga60Var = (ga60) la60Var;
                            d761 d761Var3 = ga60Var.b;
                            if ((d761Var3 != null && d761Var3.a()) || (((d761Var = ga60Var.c) != null && d761Var.a()) || ((d761Var2 = ga60Var.d) != null && d761Var2.a()))) {
                                zA = true;
                            }
                        } else if (la60Var instanceof ia60) {
                            zA = mmo1.A(((ia60) la60Var).b);
                        } else if (la60Var instanceof ja60) {
                            ja60 ja60Var = (ja60) la60Var;
                            if (mmo1.A(ja60Var.b) || mmo1.A(ja60Var.c)) {
                                zA = true;
                            }
                        } else if (la60Var instanceof ka60) {
                            ka60 ka60Var = (ka60) la60Var;
                            if (mmo1.A(ka60Var.b) || mmo1.A(ka60Var.c) || mmo1.A(ka60Var.d)) {
                                zA = true;
                            }
                        } else if (!(la60Var instanceof ha60)) {
                            eg.o();
                            return null;
                        }
                        if (zA) {
                            kd31Var.i(2);
                        }
                    }
                }
                if (z) {
                    float fO = 1.0f - yoi1.o(Math.abs(((drr0) jkr0Var.d.d).s() + (((err0) jkr0Var.d.c).s() - i)), 0.0f, 1.0f);
                    kd31Var.q((0.14999998f * fO) + 0.85f);
                    kd31Var.r(kd31Var.b);
                    kd31Var.b((fO * 0.45f) + 0.55f);
                }
                return rih1Var;
            case 1:
                st60 st60Var = (st60) obj2;
                fn31.T(cto1.q((dg30) st60Var.c), (o8n) null, 0, new bp70(st60Var, (String) obj3, !z, this.c, (lnm) null), 3);
                return rih1Var;
            case 2:
                rtb0.c((rtb0) obj, "removeAccountRowElement", new j2i(612334344, new ok7((x521) obj2, this.c, (fli0) obj3, (byte) 4, this.b), true), 2);
                return rih1Var;
            default:
                e261 e261Var = (e261) obj;
                d261 d261Var = c1e1.a;
                u7h u7hVar = (u7h) ((tob1) obj3).getValue();
                long j = u7hVar.a;
                e261Var.b(d261Var, u7hVar);
                b261.B(e261Var, "text_section_" + i);
                if (z) {
                    b261.A(e261Var, (String) obj2);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb60(rb60 rb60Var, boolean z, jkr0 jkr0Var, int i) {
        super(1);
        this.d = rb60Var;
        this.b = z;
        this.e = jkr0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb60(x521 x521Var, fli0 fli0Var, int i, boolean z) {
        super(1);
        this.d = x521Var;
        this.e = fli0Var;
        this.c = i;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb60(boolean z, st60 st60Var, String str, int i) {
        super(1);
        this.b = z;
        this.d = st60Var;
        this.e = str;
        this.c = i;
    }
}
