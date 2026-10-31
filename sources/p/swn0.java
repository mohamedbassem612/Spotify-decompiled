package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class swn0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ twn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swn0(twn0 twn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = twn0Var;
    }

    public final Object invoke() {
        xg30 xg30VarA;
        byte b = this.a;
        twn0 twn0Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                twn0Var.d();
                break;
            case 1:
                twn0 twn0Var2 = this.b;
                th30 th30Var = twn0Var2.k;
                yun0 yun0Var = twn0Var2.b;
                if (!th30Var.L) {
                    xun0 xun0VarH = yun0Var.h();
                    e6w0 e6w0Var = (xun0VarH == null || (xg30VarA = xun0VarH.a()) == null) ? null : xg30VarA.d;
                    fvn0 fvn0Var = twn0Var2.i;
                    xun0 xun0VarH2 = yun0Var.h();
                    pnr0 pnr0VarD = fvn0Var.d(xun0VarH2 != null ? xun0VarH2.b() : null);
                    n0g0 n0g0Var = fsm0.Q0;
                    nu9 nu9Var = new nu9(th30Var);
                    akr akrVar = twn0Var2.f;
                    yun0Var.j(nu9Var, true, akrVar, th30Var);
                    xun0 xun0VarH3 = yun0Var.h();
                    vun0 vun0Var = xun0VarH3 instanceof vun0 ? (vun0) xun0VarH3 : null;
                    if (vun0Var != null) {
                        zf30 zf30Var = vun0Var.a;
                        xg30 xg30Var = vun0Var.b;
                        e6w0 e6w0Var2 = xg30Var.d;
                        boolean z = e6w0Var2 instanceof b6w0;
                        String str = xg30Var.c;
                        if (z) {
                            akrVar.h(zf30Var, str, new n0g0(0, twn0Var2, twn0.class, "onBottomSheetDismissed", "onBottomSheetDismissed$src_main_java_com_spotify_ubi_model_model()V", 0, (byte) 15), new n0g0(0, twn0Var2, twn0.class, "notifyCurrentFragmentChanged", "notifyCurrentFragmentChanged()V", 0, (byte) 16));
                        } else {
                            twn0Var2.c(nu9Var, zf30Var, e6w0Var2, str);
                            n0g0Var = new n0g0(0, twn0Var2, twn0.class, "notifyCurrentFragmentChanged", "notifyCurrentFragmentChanged()V", 0, (byte) 17);
                        }
                    }
                    nu9Var.i();
                    n0g0Var.invoke();
                    twn0Var2.s(e6w0Var, pnr0VarD);
                }
                break;
            default:
                twn0Var.k();
                break;
        }
        return rih1Var;
    }
}
