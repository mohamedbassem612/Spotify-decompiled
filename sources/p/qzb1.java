package p;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qzb1 extends ovb {
    public final /* synthetic */ BottomSheetBehavior a;
    public final /* synthetic */ ven0 b;

    public qzb1(BottomSheetBehavior bottomSheetBehavior, ven0 ven0Var) {
        this.a = bottomSheetBehavior;
        this.b = ven0Var;
    }

    public final void a(View view, float f) {
        boolean z;
        if (this.a != null) {
            ven0 ven0Var = this.b;
            int height = view.getHeight();
            BottomSheetBehavior bottomSheetBehavior = this.a;
            ven0Var.setValue(new rzb1(height, bottomSheetBehavior.e ? -1 : bottomSheetBehavior.d, f));
            synchronized (pv91.c) {
                oen0 oen0Var = ((ten0) pv91.j).h;
                z = false;
                if (oen0Var != null && oen0Var.h()) {
                    z = true;
                }
            }
            if (z) {
                pv91.c();
            }
        }
    }

    public final void b(View view, int i) {
        boolean z;
        if (i != 4 || this.a == null) {
            return;
        }
        ven0 ven0Var = this.b;
        int height = view.getHeight();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        ven0Var.setValue(new rzb1(height, bottomSheetBehavior.e ? -1 : bottomSheetBehavior.d, 0.0f));
        synchronized (pv91.c) {
            oen0 oen0Var = ((ten0) pv91.j).h;
            z = false;
            if (oen0Var != null && oen0Var.h()) {
                z = true;
            }
        }
        if (z) {
            pv91.c();
        }
    }
}
