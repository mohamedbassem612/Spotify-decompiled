package p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tbh0 {
    public final MaterialButton a;
    public iw61 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public gch0 m;
    public boolean n = false;
    public boolean o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f114p = false;
    public boolean q;
    public RippleDrawable r;
    public int s;

    public tbh0(MaterialButton materialButton, iw61 iw61Var) {
        this.a = materialButton;
        this.b = iw61Var;
    }

    public final jx61 a() {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.r.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.r;
        return numberOfLayers > 2 ? (jx61) rippleDrawable2.getDrawable(2) : (jx61) rippleDrawable2.getDrawable(1);
    }

    public final gch0 b(boolean z) {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (gch0) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(iw61 iw61Var) {
        this.b = iw61Var;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iw61Var);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iw61Var);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iw61Var);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = b8k1.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        gch0 gch0Var = new gch0(this.b);
        MaterialButton materialButton = this.a;
        gch0Var.j(materialButton.getContext());
        y1a1.U(gch0Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            y1a1.V(gch0Var, mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        gch0Var.a.j = f;
        gch0Var.invalidateSelf();
        fch0 fch0Var = gch0Var.a;
        if (fch0Var.d != colorStateList) {
            fch0Var.d = colorStateList;
            gch0Var.onStateChange(gch0Var.getState());
        }
        gch0 gch0Var2 = new gch0(this.b);
        gch0Var2.setTint(0);
        float f2 = this.h;
        int iP = this.n ? ago1.p(materialButton, 2130969040) : 0;
        gch0Var2.a.j = f2;
        gch0Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iP);
        fch0 fch0Var2 = gch0Var2.a;
        if (fch0Var2.d != colorStateListValueOf) {
            fch0Var2.d = colorStateListValueOf;
            gch0Var2.onStateChange(gch0Var2.getState());
        }
        gch0 gch0Var3 = new gch0(this.b);
        this.m = gch0Var3;
        y1a1.T(gch0Var3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(y4o1.w(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gch0Var2, gch0Var}), this.c, this.e, this.d, this.f), this.m);
        this.r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        gch0 gch0VarB = b(false);
        if (gch0VarB != null) {
            gch0VarB.l(this.s);
        }
    }

    public final void f() {
        gch0 gch0VarB = b(false);
        gch0 gch0VarB2 = b(true);
        if (gch0VarB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            gch0VarB.a.j = f;
            gch0VarB.invalidateSelf();
            fch0 fch0Var = gch0VarB.a;
            if (fch0Var.d != colorStateList) {
                fch0Var.d = colorStateList;
                gch0VarB.onStateChange(gch0VarB.getState());
            }
            if (gch0VarB2 != null) {
                float f2 = this.h;
                int iP = this.n ? ago1.p(this.a, 2130969040) : 0;
                gch0VarB2.a.j = f2;
                gch0VarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iP);
                fch0 fch0Var2 = gch0VarB2.a;
                if (fch0Var2.d != colorStateListValueOf) {
                    fch0Var2.d = colorStateListValueOf;
                    gch0VarB2.onStateChange(gch0VarB2.getState());
                }
            }
        }
    }
}
