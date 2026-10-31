package p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jh3 extends fy31 {
    public final /* synthetic */ byte U0;
    public final qzh V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh3(qzh qzhVar, byte b) {
        super(qzhVar.getView());
        this.U0 = b;
        switch (b) {
            case 1:
                super(qzhVar.getView());
                this.V0 = qzhVar;
                break;
            case 2:
                super(qzhVar.getView());
                this.V0 = qzhVar;
                break;
            case 3:
            default:
                this.V0 = qzhVar;
                break;
            case 4:
                super(qzhVar.getView());
                this.V0 = qzhVar;
                break;
        }
    }

    public final void E(bw31 bw31Var, List list, ym ymVar) {
        byte b = this.U0;
        qzh qzhVar = this.V0;
        switch (b) {
            case 0:
                wu31 wu31Var = (wu31) bw31Var;
                bh90 bh90Var = wu31Var.a;
                String str = bh90Var.b;
                boolean z = wu31Var.c;
                boolean z2 = wu31Var.d;
                qzhVar.f(new lf3(z, !z2, str, aqo1.r(qzhVar.getView().getContext(), bh90Var), z2 ? null : bh90Var.c));
                qzhVar.n(new cc2(ymVar, bh90Var, (byte) 13));
                break;
            case 1:
                xu31 xu31Var = (xu31) bw31Var;
                ch90 ch90Var = xu31Var.a;
                String str2 = ch90Var.b;
                boolean z3 = xu31Var.c;
                qzhVar.f(new ww6(str2, aqo1.r(qzhVar.getView().getContext(), ch90Var), z3 ? null : ch90Var.c, !z3));
                qzhVar.n(new xg6(ymVar, ch90Var, (byte) 20));
                break;
            case 2:
                oh90 oh90Var = ((iv31) bw31Var).a;
                qzhVar.f(new lf3(false, true, oh90Var.b, aqo1.r(qzhVar.getView().getContext(), oh90Var), oh90Var.c));
                qzhVar.n(new aft0(ymVar, oh90Var, (byte) 27));
                break;
            case 3:
                qzhVar.f(new kh51(((pv31) bw31Var).a));
                break;
            default:
                vh90 vh90Var = ((rv31) bw31Var).a;
                qzhVar.f(new z981(vh90Var.b, aqo1.r(qzhVar.getView().getContext(), vh90Var), vh90Var.c));
                qzhVar.n(new d(ymVar, vh90Var, (byte) 21));
                break;
        }
    }

    public jh3(Context context, qzh qzhVar) {
        this.U0 = (byte) 3;
        View view = qzhVar.getView();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(view);
        frameLayout.setPadding(0, context.getResources().getDimensionPixelSize(2131165339), 0, 0);
        super(frameLayout);
        this.V0 = qzhVar;
    }
}
