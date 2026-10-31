package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ynd1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynd1(iu30 iu30Var, gx31 gx31Var, int i) {
        super(0);
        this.a = (byte) 3;
        this.c = iu30Var;
        this.d = gx31Var;
        this.b = i;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.d;
        Object obj2 = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                ((iod1) obj2).setSelectedTabIndex(i);
                ((fod1) obj).c.invoke();
                return rih1Var;
            case 1:
                if (i == ((p9f1) ((jye1) obj2).c).b.size() - 1) {
                    ((xgm1) ((rk41) obj).c).a(fgm1.a);
                }
                return rih1Var;
            case 2:
                ((iu30) obj2).invoke(new bff1(i, ((zff1) obj).e));
                return rih1Var;
            case 3:
                ((iu30) obj2).invoke(new udg1(String.valueOf(((gx31) obj).a), i, i));
                return rih1Var;
            default:
                if (i == 0) {
                    return z6x.a;
                }
                ptb0 ptb0VarH = ((xtb0) obj2).h();
                int i2 = ptb0VarH.m;
                int iG = ((int) (ptb0VarH.g() >> 32)) + i2;
                return z561.k0(z561.f0(new tak1((c9) obj, (byte) 7), z561.T(new mun((byte) 7, iG, i2), new i46(ptb0VarH.l, (byte) 1))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ynd1(Object obj, int i, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ynd1(int i, Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }
}
