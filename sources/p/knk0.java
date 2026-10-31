package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class knk0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knk0(boolean z, qim0 qim0Var, Function0 function0, boolean z2, Function0 function1) {
        super(2);
        this.a = (byte) 2;
        this.b = z;
        this.f = qim0Var;
        this.d = function0;
        this.c = z2;
        this.e = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                e4p1.c(this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                oho1.g(this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                boolean z = this.b;
                qim0 qim0Var = this.f;
                if (z) {
                    x340Var2.i0(-947635582);
                    qim0 qim0VarN = anm1.N("lockButton", qim0Var);
                    String strO0 = cwl1.o0(x340Var2, 2131954724);
                    if (!ihc1.y0(strO0)) {
                        qon1.a(new gbx(new y50(strO0), this.d), eoj.b, qim0VarN, x340Var2, 48);
                        x340Var2.r(false);
                        return rih1Var;
                    }
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                } else {
                    boolean z2 = this.c;
                    Function0 function0 = this.e;
                    if (z2) {
                        x340Var2.i0(-947057928);
                        qim0 qim0VarN2 = anm1.N("pauseButton", qim0Var);
                        String strO1 = cwl1.o0(x340Var2, 2131959683);
                        if (!ihc1.y0(strO1)) {
                            qon1.a(new gbx(new y50(strO1), function0), eoj.c, qim0VarN2, x340Var2, 48);
                            x340Var2.r(false);
                            return rih1Var;
                        }
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    } else {
                        x340Var2.i0(-946547172);
                        qim0 qim0VarN3 = anm1.N("playButton", qim0Var);
                        String strO2 = cwl1.o0(x340Var2, 2131959803);
                        if (!ihc1.y0(strO2)) {
                            qon1.a(new gbx(new y50(strO2), function0), eoj.d, qim0VarN3, x340Var2, 48);
                            x340Var2.r(false);
                            return rih1Var;
                        }
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    }
                }
                return null;
            case 3:
                ((Number) obj2).intValue();
                zgo1.l(this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                p1p1.w(this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ knk0(boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = function0;
        this.e = function1;
        this.f = qim0Var;
    }
}
