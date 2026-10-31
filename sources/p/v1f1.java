package p;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class v1f1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ v1f1(Toolbar toolbar, byte b) {
        this.a = b;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Toolbar toolbar = this.b;
        switch (b) {
            case 0:
                w1f1 w1f1Var = toolbar.p1;
                ysi0 ysi0Var = w1f1Var == null ? null : w1f1Var.b;
                if (ysi0Var != null) {
                    ysi0Var.collapseActionView();
                }
                break;
            default:
                toolbar.k();
                break;
        }
    }
}
