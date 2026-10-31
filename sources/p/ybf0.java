package p;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ybf0 implements idf0 {
    public final /* synthetic */ byte a;
    public final WeakReference b;

    public ybf0(LottieAnimationView lottieAnimationView, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // p.idf0
    public final void onResult(Object obj) {
        byte b = this.a;
        WeakReference weakReference = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView != null) {
                    int i = lottieAnimationView.g;
                    if (i != 0) {
                        lottieAnimationView.setImageResource(i);
                    }
                    idf0 idf0Var = lottieAnimationView.f;
                    if (idf0Var == null) {
                        idf0Var = LottieAnimationView.T0;
                    }
                    idf0Var.onResult(th);
                    break;
                }
                break;
            default:
                fcf0 fcf0Var = (fcf0) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(fcf0Var);
                    break;
                }
                break;
        }
    }
}
