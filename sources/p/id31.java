package p;

import android.app.Activity;
import android.widget.Toast;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class id31 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ id31(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void b(qqd0 qqd0Var) {
        xvd0 xvd0Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                eh30 eh30Var = (eh30) obj;
                if (qqd0Var.equals(qqd0.a)) {
                    xvd0Var = mvd0.a;
                } else if (qqd0Var.equals(qqd0.b)) {
                    xvd0Var = nvd0.a;
                } else if (qqd0Var.equals(qqd0.c)) {
                    xvd0Var = ovd0.a;
                } else if (qqd0Var.equals(qqd0.e)) {
                    xvd0Var = rvd0.a;
                } else if (qqd0Var.equals(qqd0.f)) {
                    xvd0Var = svd0.a;
                } else if (qqd0Var.equals(qqd0.g)) {
                    xvd0Var = tvd0.a;
                } else if (qqd0Var.equals(qqd0.h)) {
                    xvd0Var = uvd0.a;
                } else if (!qqd0Var.equals(qqd0.d)) {
                    eg.o();
                } else {
                    xvd0Var = qvd0.a;
                }
                eh30Var.a(xvd0Var, null);
                break;
            default:
                Toast.makeText((Activity) obj, 2131956466, 0).show();
                break;
        }
    }

    private final void a() {
    }
}
