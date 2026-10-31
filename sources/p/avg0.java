package p;

import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class avg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bvg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ avg0(bvg0 bvg0Var, byte b) {
        super(1);
        this.a = b;
        this.b = bvg0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zf30 zf30Var = this.b;
        switch (b) {
            case 0:
                th30 th30VarE0 = zf30Var.N0().e0();
                String str = ((bvg0) zf30Var).Z1;
                if (str == null) {
                    u890.C("artistUri");
                    throw null;
                }
                String str2 = ((bvg0) zf30Var).a2;
                if (str2 == null) {
                    u890.C("lineItemId");
                    throw null;
                }
                String str3 = ((bvg0) zf30Var).b2;
                if (str3 == null) {
                    u890.C("adId");
                    throw null;
                }
                zf30 ts10Var = new ts10();
                ts10Var.T0(mno1.h(new mmr0[]{new mmr0("artist_uri", str), new mmr0("lineitem_id", str2), new mmr0("ad_id", str3)}));
                ui30 ui30Var = vi30.a;
                vi30.b(new SetTargetFragmentUsageViolation("Attempting to set target fragment " + zf30Var + " with request code 0 for fragment " + ts10Var, ts10Var));
                vi30.a(ts10Var).getClass();
                th30 th30Var = ts10Var.U0;
                th30 th30Var2 = zf30Var.U0;
                if (th30Var != null && th30Var2 != null && th30Var != th30Var2) {
                    eg.n("Fragment ", zf30Var, " must share the same FragmentManager to be set as a target fragment");
                    return null;
                }
                for (zf30 zf30VarM0 = zf30Var; zf30VarM0 != null; zf30VarM0 = zf30VarM0.m0(false)) {
                    if (zf30VarM0 == ts10Var) {
                        throw new IllegalArgumentException("Setting " + zf30Var + " as the target of " + ts10Var + " would create a target cycle");
                    }
                }
                if (ts10Var.U0 == null || zf30Var.U0 == null) {
                    ts10Var.h = null;
                    ts10Var.g = zf30Var;
                } else {
                    ts10Var.h = zf30Var.e;
                    ts10Var.g = null;
                }
                ts10Var.i = 0;
                ts10Var.g1(th30VarE0, "marquee_feedback_menu");
                return rih1Var;
            default:
                ((bvg0) zf30Var).i2 = true;
                return rih1Var;
        }
    }
}
