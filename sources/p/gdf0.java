package p;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gdf0 extends zda {
    public final /* synthetic */ byte e = 1;
    public final Object f;
    public final Object g;

    public gdf0(yge0 yge0Var, int i, List list) {
        super(new f3a(2131625165, 2131429862));
        List list2 = (List) yge0Var.c;
        fcf0 fcf0Var = (fcf0) yge0Var.b;
        List<kdf0> list3 = list2;
        boolean z = list3 instanceof Collection;
        mdf0 mdf0Var = mdf0.a;
        if (!z || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (!((kdf0) it.next()).c.equals(mdf0Var)) {
                    eg.o();
                    throw null;
                }
            }
        }
        long j = 0;
        for (kdf0 kdf0Var : list3) {
            if (!(kdf0Var instanceof kdf0)) {
                eg.o();
                throw null;
            }
            float fM = up30.m(kdf0Var.b, fcf0Var) - up30.m(kdf0Var.a, fcf0Var);
            if (!kdf0Var.c.equals(mdf0Var)) {
                eg.o();
                throw null;
            }
            j += (long) (((fM * 1.0f) / fcf0Var.n) * 1000.0f);
        }
        this.f = new nj41(j);
        this.g = new tkt(yge0Var, i, list);
    }

    @Override // p.zda
    public void a() {
        switch (this.e) {
            case 0:
                super.a();
                tkt tktVar = (tkt) this.g;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) tktVar.e;
                if (lottieAnimationView != null) {
                    lottieAnimationView.h.b.removeAllListeners();
                    lottieAnimationView.c();
                }
                tktVar.e = null;
                break;
            default:
                super.a();
                break;
        }
    }

    @Override // p.zda
    public final pj41 b() {
        switch (this.e) {
            case 0:
                return (nj41) this.f;
            default:
                return oj41.a;
        }
    }

    @Override // p.zda
    public final void d(ConstraintLayout constraintLayout) {
        byte b = this.e;
        Object obj = this.g;
        switch (b) {
            case 0:
                ((tkt) obj).e = b8k1.n(constraintLayout, 2131429862);
                b8k1.n(constraintLayout, 2131429862).setScaleX(1.0f);
                break;
            default:
                ((ParagraphView) b8k1.n(constraintLayout, 2131431082)).x((gpr0) this.f);
                ((ParagraphView) b8k1.n(constraintLayout, 2131431081)).x((gpr0) obj);
                break;
        }
    }

    @Override // p.zda
    public final void e() {
        switch (this.e) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ((tkt) this.g).e;
                if (lottieAnimationView != null) {
                    lottieAnimationView.O0 = false;
                    lottieAnimationView.h.j();
                }
                break;
        }
    }

    @Override // p.zda
    public void f(uk41 uk41Var) {
        switch (this.e) {
            case 0:
                this.d = uk41Var;
                tkt tktVar = (tkt) this.g;
                y1t0 y1t0Var = new y1t0(uk41Var, (byte) 13);
                List list = (List) tktVar.d;
                yge0 yge0Var = (yge0) tktVar.c;
                tktVar.f = y1t0Var;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) tktVar.e;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(0);
                    if (Build.VERSION.SDK_INT < 28) {
                        lottieAnimationView.setRenderMode(xc21.c);
                    }
                    lottieAnimationView.setComposition((fcf0) yge0Var.b);
                    tktVar.b = 0;
                    if (((List) yge0Var.c).isEmpty()) {
                        lottieAnimationView.h.r(0, 0);
                    } else {
                        tktVar.c(lottieAnimationView);
                    }
                    if (list.isEmpty()) {
                        return;
                    }
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        throw pze0.g(it);
                    }
                    return;
                }
                return;
            default:
                super.f(uk41Var);
                return;
        }
    }

    @Override // p.zda
    public final void g() {
        switch (this.e) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ((tkt) this.g).e;
                if (lottieAnimationView != null) {
                    lottieAnimationView.Q0.add(xbf0.f);
                    lottieAnimationView.h.m();
                }
                break;
        }
    }

    private final void h() {
    }

    private final void i() {
    }

    public gdf0(gpr0 gpr0Var, gpr0 gpr0Var2) {
        super(new f3a(2131626192, 2131431082));
        this.f = gpr0Var;
        this.g = gpr0Var2;
    }
}
