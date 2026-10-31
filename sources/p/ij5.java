package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ij5 {
    public final View a;
    public mal d;
    public mal e;
    public mal f;
    public int c = -1;
    public final ck5 b = ck5.a();

    public ij5(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                mal malVar = this.f;
                if (malVar == null) {
                    malVar = new mal();
                    this.f = malVar;
                }
                malVar.c = null;
                malVar.b = false;
                malVar.d = null;
                malVar.a = false;
                WeakHashMap weakHashMap = b8k1.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    malVar.b = true;
                    malVar.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    malVar.a = true;
                    malVar.d = backgroundTintMode;
                }
                if (malVar.b || malVar.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = ck5.b;
                    ex21.h(background, malVar, drawableState);
                    return;
                }
            }
            mal malVar2 = this.e;
            if (malVar2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = ck5.b;
                ex21.h(background, malVar2, drawableState2);
            } else {
                mal malVar3 = this.d;
                if (malVar3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = ck5.b;
                    ex21.h(background, malVar3, drawableState3);
                }
            }
        }
    }

    public final ColorStateList b() {
        mal malVar = this.e;
        if (malVar != null) {
            return (ColorStateList) malVar.c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        mal malVar = this.e;
        if (malVar != null) {
            return (PorterDuff.Mode) malVar.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = moz0.A;
        lvc1 lvc1VarE = lvc1.E(context, attributeSet, iArr, i);
        View view2 = this.a;
        b8k1.o(view2, view2.getContext(), iArr, attributeSet, lvc1VarE.w(), i);
        try {
            if (lvc1VarE.y(0)) {
                this.c = lvc1VarE.q(0, -1);
                ck5 ck5Var = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (ck5Var) {
                    colorStateListG = ck5Var.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    g(colorStateListG);
                }
            }
            if (lvc1VarE.y(1)) {
                view.setBackgroundTintList(lvc1VarE.g(1));
            }
            if (lvc1VarE.y(2)) {
                view.setBackgroundTintMode(a8v.c(lvc1VarE.n(2, -1), null));
            }
            lvc1VarE.I();
        } catch (Throwable th) {
            lvc1VarE.I();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListG;
        this.c = i;
        ck5 ck5Var = this.b;
        if (ck5Var != null) {
            Context context = this.a.getContext();
            synchronized (ck5Var) {
                colorStateListG = ck5Var.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        g(colorStateListG);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            mal malVar = this.d;
            if (malVar == null) {
                malVar = new mal();
                this.d = malVar;
            }
            malVar.c = colorStateList;
            malVar.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        mal malVar = this.e;
        if (malVar == null) {
            malVar = new mal();
            this.e = malVar;
        }
        malVar.c = colorStateList;
        malVar.b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        mal malVar = this.e;
        if (malVar == null) {
            malVar = new mal();
            this.e = malVar;
        }
        malVar.d = mode;
        malVar.a = true;
        a();
    }
}
