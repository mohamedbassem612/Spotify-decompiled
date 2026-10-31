package p;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ay5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ cy5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay5(Context context, cy5 cy5Var) {
        super(2);
        this.b = context;
        this.c = cy5Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0145  */
    /* JADX WARN: Code duplicated, block: B:41:0x0159  */
    /* JADX WARN: Code duplicated, block: B:43:0x0160  */
    /* JADX WARN: Code duplicated, block: B:47:0x017e  */
    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        Boolean bool;
        cy5 cy5Var;
        Context context;
        boolean zG;
        Object objT2;
        rih1 rih1Var;
        boolean zG2;
        Object objT3;
        Object objT4;
        vu30 vu30Var;
        Bundle bundle;
        byte b = this.a;
        rih1 rih1Var2 = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var2 = (b0k) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    x340Var = x340Var2;
                    x340Var.j0(1881995740);
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(new s3v(0L));
                        x340Var.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    x340Var.r(false);
                    bool = Boolean.FALSE;
                    x340Var.j0(1881999935);
                    cy5Var = this.c;
                    boolean zG3 = x340Var.g(cy5Var);
                    context = this.b;
                    zG = x340Var.g(context) | zG3 | x340Var.g(ven0Var);
                    objT2 = x340Var.T();
                    rih1Var = null;
                    if (zG) {
                        bh bhVar = new bh(cy5Var, context, ven0Var, (lnm) null, (byte) 15);
                        x340Var.s0(bhVar);
                        objT2 = bhVar;
                    } else {
                        bh bhVar2 = new bh(cy5Var, context, ven0Var, (lnm) null, (byte) 15);
                        x340Var.s0(bhVar2);
                        objT2 = bhVar2;
                    }
                    x340Var.r(false);
                    if (((Boolean) yto.q(bool, x340Var, (vu30) objT2).getValue()).booleanValue()) {
                        x340Var.j0(-1786326291);
                        x340Var.j0(1882039614);
                        objT4 = x340Var.T();
                        if (objT4 == m4cVar) {
                            rih1Var = null;
                            objT4 = h4p1.g(new bh(cy5Var.d, context, cy5Var.e, (lnm) null, (byte) 16));
                            x340Var.s0(objT4);
                        }
                        x340Var.r(false);
                        vu30Var = (vu30) rwq.g((mr20) objT4, (Object) null, (o8n) null, x340Var, 48, 2).getValue();
                        x340Var.j0(1882043230);
                        if (vu30Var != null) {
                            tgp1.d(0, ((s3v) ven0Var.getValue()).a, x340Var, vu30Var, cy5Var.f);
                            rih1Var = rih1Var2;
                        }
                        x340Var.r(false);
                        if (rih1Var == null) {
                            u0p1.d(x340Var, 0);
                        }
                        x340Var.r(false);
                    } else {
                        x340Var.j0(-1786102688);
                        u0p1.d(x340Var, 0);
                        x340Var.r(false);
                    }
                    x340Var.j0(1882053955);
                    zG2 = x340Var.g(cy5Var);
                    objT3 = x340Var.T();
                    if (zG2) {
                        objT3 = new f85(cy5Var, (byte) 25);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new f85(cy5Var, (byte) 25);
                        x340Var.s0(objT3);
                    }
                    x340Var.r(false);
                    qxd0.S((Function0) objT3, x340Var);
                } else {
                    x340 x340Var3 = x340Var2;
                    if (!x340Var3.H()) {
                        x340Var = x340Var2;
                        x340Var.j0(1881995740);
                        objT = x340Var.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = v8r.q(new s3v(0L));
                            x340Var.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        x340Var.r(false);
                        bool = Boolean.FALSE;
                        x340Var.j0(1881999935);
                        cy5Var = this.c;
                        boolean zG4 = x340Var.g(cy5Var);
                        context = this.b;
                        zG = x340Var.g(context) | zG4 | x340Var.g(ven0Var);
                        objT2 = x340Var.T();
                        rih1Var = null;
                        if (zG || objT2 == m4cVar) {
                            bh bhVar3 = new bh(cy5Var, context, ven0Var, (lnm) null, (byte) 15);
                            x340Var.s0(bhVar3);
                            objT2 = bhVar3;
                        }
                        x340Var.r(false);
                        if (((Boolean) yto.q(bool, x340Var, (vu30) objT2).getValue()).booleanValue()) {
                            x340Var.j0(-1786326291);
                            x340Var.j0(1882039614);
                            objT4 = x340Var.T();
                            if (objT4 == m4cVar) {
                                rih1Var = null;
                                objT4 = h4p1.g(new bh(cy5Var.d, context, cy5Var.e, (lnm) null, (byte) 16));
                                x340Var.s0(objT4);
                            }
                            x340Var.r(false);
                            vu30Var = (vu30) rwq.g((mr20) objT4, (Object) null, (o8n) null, x340Var, 48, 2).getValue();
                            x340Var.j0(1882043230);
                            if (vu30Var != null) {
                                tgp1.d(0, ((s3v) ven0Var.getValue()).a, x340Var, vu30Var, cy5Var.f);
                                rih1Var = rih1Var2;
                            }
                            x340Var.r(false);
                            if (rih1Var == null) {
                                u0p1.d(x340Var, 0);
                            }
                            x340Var.r(false);
                        } else {
                            x340Var.j0(-1786102688);
                            u0p1.d(x340Var, 0);
                            x340Var.r(false);
                        }
                        x340Var.j0(1882053955);
                        zG2 = x340Var.g(cy5Var);
                        objT3 = x340Var.T();
                        if (zG2 || objT3 == m4cVar) {
                            objT3 = new f85(cy5Var, (byte) 25);
                            x340Var.s0(objT3);
                        }
                        x340Var.r(false);
                        qxd0.S((Function0) objT3, x340Var);
                    } else {
                        x340Var3.b0();
                    }
                }
                break;
            default:
                x340 x340Var4 = (b0k) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    kiv kivVar = p4k.b;
                    Context context2 = this.b;
                    ely0 ely0VarA = kivVar.a(context2);
                    kiv kivVar2 = p4k.d;
                    cy5 cy5Var2 = this.c;
                    ely0 ely0VarA2 = kivVar2.a(cy5Var2.e);
                    kiv kivVar3 = q4k.a;
                    bundle = (Bundle) cy5Var2.h.getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    mod.c(new ely0[]{ely0VarA, ely0VarA2, kivVar3.a(bundle), p4k.c.a(cy5Var2.g.getValue())}, apo.i(x340Var4, 1688971311, new ay5(cy5Var2, context2)), x340Var4, 48);
                } else {
                    x340 x340Var5 = x340Var4;
                    if (!x340Var5.H()) {
                        kiv kivVar4 = p4k.b;
                        Context context3 = this.b;
                        ely0 ely0VarA3 = kivVar4.a(context3);
                        kiv kivVar5 = p4k.d;
                        cy5 cy5Var3 = this.c;
                        ely0 ely0VarA4 = kivVar5.a(cy5Var3.e);
                        kiv kivVar6 = q4k.a;
                        bundle = (Bundle) cy5Var3.h.getValue();
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        mod.c(new ely0[]{ely0VarA3, ely0VarA4, kivVar6.a(bundle), p4k.c.a(cy5Var3.g.getValue())}, apo.i(x340Var4, 1688971311, new ay5(cy5Var3, context3)), x340Var4, 48);
                    } else {
                        x340Var5.b0();
                    }
                }
                break;
        }
        return rih1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay5(cy5 cy5Var, Context context) {
        super(2);
        this.c = cy5Var;
        this.b = context;
    }
}
