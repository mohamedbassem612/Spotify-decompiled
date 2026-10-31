package p;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cc5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ View c;

    public /* synthetic */ cc5(View view, float f, byte b) {
        this.a = b;
        this.c = view;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        float f = this.b;
        ec5 ec5Var = this.c;
        switch (b) {
            case 0:
                ec5 ec5Var2 = ec5Var;
                zb5 zb5Var = ec5Var2.a;
                zb5Var.getClass();
                zb5Var.B = yoi1.o(f, 2.0f, 40.0f);
                ec5Var2.a();
                break;
            default:
                c1p0 c1p0Var = (c1p0) ec5Var;
                v0p0 v0p0Var = c1p0Var.b;
                if (v0p0Var != null && v0p0Var.a) {
                    c1p0Var.d = true;
                    c1p0Var.e = f;
                    c1p0Var.f = c1p0Var.getHeight();
                    v0p0 v0p0Var2 = c1p0Var.b;
                    v0p0Var2.getClass();
                    c1p0Var.g = v0p0Var2.a(c1p0Var.getHeight()) >= 0.75f;
                    ViewParent parent = c1p0Var.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    iu30 onEvent = c1p0Var.getOnEvent();
                    if (onEvent != null) {
                        onEvent.invoke(z0p0.a);
                    }
                    break;
                }
                break;
        }
    }
}
