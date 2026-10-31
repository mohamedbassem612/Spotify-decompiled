package p;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.nowplayingqueue.bottomsheet.view.EditModeBarContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.SessionModifierContainerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class acz0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ccz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ acz0(ccz0 ccz0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ccz0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ccz0 ccz0Var = this.b;
        switch (b) {
            case 0:
                tka0 tka0Var = dtw.C;
                mnb0 mnb0Var = ccz0Var.a;
                Context context = mnb0Var.b.getContext();
                ConstraintLayout constraintLayout = mnb0Var.b;
                bno bnoVar = ccz0Var.Y;
                return mhc.d(context, constraintLayout, new efm(bnoVar.a, bnoVar.b, ccz0Var.t, bnoVar.c), (drw) null, 24);
            case 1:
                ccz0Var.b.invoke();
                return rih1Var;
            case 2:
                ((SessionModifierContainerView) ccz0Var.Z.e).getOnAnimationEnd().invoke();
                return rih1Var;
            case 3:
                ((EditModeBarContainerView) ccz0Var.Z.b).getOnAnimationEnd().invoke();
                return rih1Var;
            case 4:
                ((EditModeBarContainerView) ccz0Var.Z.b).getOnAnimationEnd().invoke();
                return rih1Var;
            case 5:
                ((SessionModifierContainerView) ccz0Var.Z.e).getOnAnimationEnd().invoke();
                return rih1Var;
            case 6:
                ccz0Var.b.invoke();
                return rih1Var;
            case 7:
                xrl0 xrl0Var = ccz0Var.X;
                xrl0Var.getClass();
                x6h1 x6h1VarC = xrl0Var.a.c();
                x6h1VarC.i.add(new a7h1("session_modifiers", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            case 8:
                xrl0 xrl0Var2 = ccz0Var.X;
                xrl0Var2.getClass();
                x6h1 x6h1VarC2 = xrl0Var2.a.c();
                x6h1VarC2.i.add(new a7h1("session_modifiers", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                r6h1 r6h1Var2 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
            default:
                xrl0 xrl0Var3 = ccz0Var.X;
                xrl0Var3.getClass();
                x6h1 x6h1VarC3 = xrl0Var3.a.c();
                x6h1VarC3.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                r6h1 r6h1Var3 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA3), (u8h1) null);
        }
    }
}
