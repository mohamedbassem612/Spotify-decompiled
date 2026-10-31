package p;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wwd implements qek1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w611 b;
    public final /* synthetic */ oek1 c;
    public final /* synthetic */ ywd d;

    public /* synthetic */ wwd(ywd ywdVar, w611 w611Var, oek1 oek1Var, byte b) {
        this.a = b;
        this.d = ywdVar;
        this.b = w611Var;
        this.c = oek1Var;
    }

    public final void a(View view) {
        switch (this.a) {
            case 0:
                f(view);
                break;
            default:
                WeakHashMap weakHashMap = b8k1.a;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                break;
        }
    }

    public final void d(View view) {
        switch (this.a) {
            case 0:
                f(view);
                break;
            default:
                view.setTag(2131430297, null);
                this.c.f((qek1) null);
                ywd ywdVar = this.d;
                ArrayList arrayList = ywdVar.k;
                w611 w611Var = this.b;
                arrayList.remove(w611Var);
                try {
                    ywdVar.d(w611Var);
                    break;
                } catch (IllegalArgumentException unused) {
                }
                if (!ywdVar.i()) {
                    ywdVar.e();
                }
                break;
        }
    }

    public final void e() {
        byte b = this.a;
    }

    public void f(View view) {
        this.c.f((qek1) null);
        WeakHashMap weakHashMap = b8k1.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        ywd ywdVar = this.d;
        ArrayList arrayList = ywdVar.l;
        w611 w611Var = this.b;
        arrayList.remove(w611Var);
        try {
            ywdVar.d(w611Var);
        } catch (IllegalArgumentException unused) {
        }
        if (ywdVar.i()) {
            return;
        }
        ywdVar.e();
    }

    private final void b() {
    }

    private final void c() {
    }
}
