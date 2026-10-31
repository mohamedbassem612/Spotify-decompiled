package p;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n7s0 {
    public final StateListAnimatorButton a;
    public int b;
    public int c;
    public final iti1 d = new iti1(0);
    public final iti1 e = new iti1(0);
    public final d9z0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public n7s0(StateListAnimatorButton stateListAnimatorButton) {
        this.a = stateListAnimatorButton;
        this.f = new d9z0(stateListAnimatorButton.getContext());
    }

    public final void a() {
        ColorStateList colorStateListA;
        Drawable background;
        iti1 iti1Var = this.e;
        boolean z = iti1Var.b != 0;
        iti1 iti1Var2 = this.d;
        int i = iti1Var2.b;
        boolean z2 = i != 0;
        iti1Var2.a = z2;
        iti1Var.a = z || z2;
        boolean z3 = iti1Var2.a;
        kj5 kj5Var = this.a;
        d9z0 d9z0Var = this.f;
        if (z3) {
            iti1Var2.c = d9z0Var.a(i);
            if (iti1Var2.a && (background = kj5Var.getBackground()) != null) {
                y7v.a(background, (ColorStateList) iti1Var2.c, kj5Var.getDrawableState());
            }
        }
        if (iti1Var.a) {
            boolean z4 = uah.f(iti1Var2.b) > 0.5d;
            int i2 = iti1Var.b;
            if (i2 != 0) {
                colorStateListA = d9z0Var.a(i2);
                iti1Var.c = colorStateListA;
            } else if (z4) {
                colorStateListA = d9z0Var.a(this.c);
                iti1Var.c = colorStateListA;
            } else {
                colorStateListA = d9z0Var.a(this.b);
                iti1Var.c = colorStateListA;
            }
            if (iti1Var.a) {
                kj5Var.setTextColor(colorStateListA);
            }
        }
    }
}
