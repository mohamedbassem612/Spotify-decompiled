package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hfj1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mfj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hfj1(mfj1 mfj1Var, byte b) {
        super(0);
        this.a = b;
        this.b = mfj1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        mfj1 mfj1Var = this.b;
        switch (b) {
            case 0:
                zej1 zej1Var = mfj1Var.O0;
                if (zej1Var != null && zej1Var.l == 2) {
                    mfj1Var.e(mfj1Var.a, zej1Var);
                }
                return rih1.a;
            case 1:
                return mfj1.d(mfj1Var.e, (ConstraintLayout) mfj1Var.h.b, new qy1("", 6));
            case 2:
                xho xhoVar = mfj1Var.f;
                if (xhoVar != null) {
                    return mfj1.d(xhoVar, (ConstraintLayout) mfj1Var.h.b, new uho("", (String) null, mfj1Var.t, (nho) null, (String) null, (Function0) null, 250));
                }
                return null;
            default:
                njv0 njv0Var = mfj1Var.g;
                if (njv0Var != null) {
                    return mfj1.d(njv0Var, (ConstraintLayout) mfj1Var.h.b, new uiv0(1, 0L, "", 1));
                }
                return null;
        }
    }
}
