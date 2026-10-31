package p;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qvb implements Runnable {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;

    public qvb(lsw0 lsw0Var, mkb1 mkb1Var, boolean z, int i) {
        this.d = lsw0Var;
        this.e = mkb1Var;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sxl1 sxl1VarB;
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                k8k1 k8k1Var = bottomSheetBehavior.H;
                if (k8k1Var == null || !k8k1Var.g()) {
                    bottomSheetBehavior.M(this.c);
                } else {
                    View view = (View) this.d;
                    WeakHashMap weakHashMap = b8k1.a;
                    view.postOnAnimation(this);
                }
                this.b = false;
                return;
            default:
                boolean z = this.b;
                lsw0 lsw0Var = (lsw0) this.d;
                mkb1 mkb1Var = (mkb1) this.e;
                if (!z) {
                    int i = this.c;
                    lsw0Var.getClass();
                    String str = mkb1Var.a.a;
                    synchronized (lsw0Var.k) {
                        try {
                            if (lsw0Var.f.get(str) != null) {
                                qs10.a().getClass();
                            } else {
                                Set set = (Set) lsw0Var.h.get(str);
                                if (set != null && set.contains(mkb1Var)) {
                                    lsw0.d(lsw0Var.b(str), i);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    break;
                } else {
                    int i2 = this.c;
                    lsw0Var.getClass();
                    String str2 = mkb1Var.a.a;
                    synchronized (lsw0Var.k) {
                        sxl1VarB = lsw0Var.b(str2);
                        break;
                    }
                    lsw0.d(sxl1VarB, i2);
                }
                qs10 qs10VarA = qs10.a();
                qs10.c("StopWorkRunnable");
                String str3 = ((mkb1) this.e).a.a;
                qs10VarA.getClass();
                return;
        }
    }

    public qvb(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.e = bottomSheetBehavior;
        this.d = view;
        this.c = i;
    }
}
