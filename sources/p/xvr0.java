package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xvr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bmg1 b;
    public final /* synthetic */ dlg1 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xvr0(bmg1 bmg1Var, dlg1 dlg1Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = bmg1Var;
        this.c = dlg1Var;
        this.d = iu30Var;
    }

    public final Object invoke() {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        dlg1 dlg1Var = this.c;
        bmg1 bmg1Var = this.b;
        switch (b) {
            case 0:
                String str2 = bmg1Var.g;
                iu30Var.invoke(new rlg1(!ihc1.y0(str2) ? dlg1Var.u(nik1.T3.b("spotify:internal:managed-account-details:child:".concat(str2)).a) : null));
                break;
            default:
                yig1 yig1Var = bmg1Var.c;
                if (yig1Var instanceof wig1) {
                    str = cfm0.i("spotify:internal:regular-member-sub-account-details:", ((wig1) yig1Var).a, nik1.Y3).a;
                } else {
                    str = nik1.Z0.a;
                }
                dlg1Var.w(str);
                iu30Var.invoke(wlg1.a);
                break;
        }
        return rih1Var;
    }
}
