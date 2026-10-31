package p;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class onj1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;
    public final /* synthetic */ pnj1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onj1(View view, pnj1 pnj1Var, byte b) {
        super(0);
        this.a = b;
        this.b = view;
        this.c = pnj1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pnj1 pnj1Var = this.c;
        View view = this.b;
        switch (b) {
            case 0:
                view.setVisibility(0);
                ConstraintLayout constraintLayout = pnj1Var.U1;
                if (constraintLayout == null) {
                    u890.C("headerContainer");
                    throw null;
                }
                constraintLayout.setVisibility(8);
                ConstraintLayout constraintLayout2 = pnj1Var.f2;
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(8);
                    return rih1Var;
                }
                u890.C("playbackControlsContainer");
                throw null;
            default:
                view.setVisibility(8);
                ConstraintLayout constraintLayout3 = pnj1Var.U1;
                if (constraintLayout3 == null) {
                    u890.C("headerContainer");
                    throw null;
                }
                constraintLayout3.setVisibility(0);
                ConstraintLayout constraintLayout4 = pnj1Var.f2;
                if (constraintLayout4 != null) {
                    constraintLayout4.setVisibility(0);
                    return rih1Var;
                }
                u890.C("playbackControlsContainer");
                throw null;
        }
    }
}
