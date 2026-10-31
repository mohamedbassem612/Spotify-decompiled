package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tbl1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o0i b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ vbl1 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ylv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tbl1(o0i o0iVar, c9n c9nVar, vbl1 vbl1Var, ven0 ven0Var, ylv ylvVar, byte b) {
        super(0);
        this.a = b;
        this.b = o0iVar;
        this.c = c9nVar;
        this.d = vbl1Var;
        this.e = ven0Var;
        this.f = ylvVar;
    }

    public final Object invoke() {
        Long lA;
        Long lA2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vbl1 vbl1Var = this.d;
        ylv ylvVar = this.f;
        c9n c9nVar = this.c;
        long jLongValue = 0;
        o0i o0iVar = this.b;
        ven0 ven0Var = this.e;
        switch (b) {
            case 0:
                n2u0 n2u0Var = o0iVar.c.b;
                if (n2u0Var != null && (lA = n2u0Var.a()) != null) {
                    jLongValue = lA.longValue();
                }
                int iIntValue = ((Number) ven0Var.getValue()).intValue() + 10;
                if (jLongValue >= ((long) iIntValue) * 1000) {
                    ven0Var.setValue(Integer.valueOf(iIntValue));
                    fn31.T(c9nVar, (o8n) null, 0, new sbl1(ylvVar, null, (byte) 0), 3);
                }
                bcl1 bcl1Var = vbl1Var.b;
                hp80 hp80Var = o0iVar.e;
                bcl1Var.getClass();
                bcl1Var.a.m(bcl1Var.h(hp80Var.b()).e(-10000), (xj61) null);
                vbl1Var.f.c.onNext(new dal1(-10000));
                break;
            default:
                n2u0 n2u0Var2 = o0iVar.c.b;
                if (n2u0Var2 != null && (lA2 = n2u0Var2.a()) != null) {
                    jLongValue = lA2.longValue();
                }
                if (jLongValue < ((long) ((Number) ven0Var.getValue()).intValue()) * 1000) {
                    ven0Var.setValue(0);
                }
                ven0Var.setValue(Integer.valueOf(((Number) ven0Var.getValue()).intValue() + 10));
                fn31.T(c9nVar, (o8n) null, 0, new sbl1(ylvVar, null, (byte) 1), 3);
                bcl1 bcl1Var2 = vbl1Var.b;
                hp80 hp80Var2 = o0iVar.e;
                bcl1Var2.getClass();
                bcl1Var2.a.m(bcl1Var2.h(hp80Var2.b()).e(10000), (xj61) null);
                vbl1Var.f.c.onNext(new dal1(10000));
                break;
        }
        return rih1Var;
    }
}
