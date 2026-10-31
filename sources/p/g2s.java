package p;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g2s implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g2s(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ComposeView composeView = (ComposeView) this.c;
                if (composeView.getHeight() != ((int) (this.b & 4294967295L))) {
                    Iterator it = z561.c0(nvr.c1, composeView).iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).requestLayout();
                    }
                }
                break;
            case 1:
                ((l6u0) this.c).apply(this.b);
                break;
            default:
                if (!((fnd0) this.c).c) {
                    long j = this.b;
                    fnd0 fnd0Var = (fnd0) this.c;
                    if (j > 0) {
                        long j2 = fnd0Var.e;
                        long j3 = j + j2;
                        if (j3 < j2) {
                            j3 = Long.MAX_VALUE;
                        }
                        fnd0Var.e = j3;
                        if (!fnd0Var.d) {
                            fnd0Var.d = true;
                            fnd0Var.b.g(fnd0Var);
                        } else {
                            Object obj = fnd0Var.f;
                            if (obj != null) {
                                fnd0Var.b(obj);
                                ((fnd0) this.c).f = null;
                            }
                        }
                    } else {
                        fnd0Var.c = true;
                        fnd0 fnd0Var2 = (fnd0) this.c;
                        if (fnd0Var2.d) {
                            fnd0Var2.b.k(fnd0Var2);
                            fnd0Var2 = (fnd0) this.c;
                            fnd0Var2.d = false;
                        }
                        fnd0Var2.f = null;
                        fnd0Var2.a.onError(new IllegalArgumentException("Non-positive request"));
                    }
                    break;
                }
                break;
        }
    }
}
