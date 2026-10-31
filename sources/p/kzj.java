package p;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kzj extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzj(View view, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.c = view;
        this.b = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new kzj(this.c, this.b, lnmVar);
            case 1:
                return new kzj(this.c, lnmVar);
            default:
                return new kzj(this.b, this.c, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        szo0 szo0Var;
        zob1 zob1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        View view = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof ComposeView)) {
                    parent = parent.getParent();
                }
                ComposeView composeView = (ComposeView) parent;
                if (composeView != null) {
                    composeView.setVisibility(this.b ? 0 : 8);
                }
                return rih1Var;
            case 1:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                Iterator it = z561.c0(pzo0.c, view).iterator();
                do {
                    if (it.hasNext()) {
                        Object tag = ((View) it.next()).getTag(2131430183);
                        szo0Var = tag instanceof szo0 ? (szo0) tag : null;
                    } else {
                        szo0Var = null;
                    }
                    if (szo0Var == null && (zob1Var = szo0Var.a) != null) {
                        p5b0 p5b0Var = new p5b0(view, (byte) 3);
                        this.b = true;
                        Object objCollect = zob1Var.collect(p5b0Var, this);
                        d9n d9nVar = d9n.a;
                        if (objCollect == d9nVar) {
                            return d9nVar;
                        }
                    }
                } while (szo0Var == null);
                return szo0Var == null ? rih1Var : rih1Var;
                jah.d();
                return null;
            default:
                hm5.M(obj);
                if (this.b) {
                    view.performHapticFeedback(27);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzj(View view, lnm lnmVar) {
        super(2, lnmVar);
        this.c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzj(boolean z, View view, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = view;
    }
}
