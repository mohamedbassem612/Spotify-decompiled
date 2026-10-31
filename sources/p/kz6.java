package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kz6 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kz6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void dispose() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((c0r) obj).dispose();
                break;
            case 1:
                ((xt9) obj).e();
                break;
            case 2:
                ((View) obj).getViewTreeObserver().removeOnWindowFocusChangeListener(vq01.a);
                break;
            default:
                bjg1 bjg1Var = (bjg1) obj;
                bjg1Var.i();
                ((mhg1) bjg1Var).a.t1();
                break;
        }
    }
}
