package p;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cch0 {
    public static final double s = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final gch0 c;
    public final gch0 d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public Drawable i;
    public ColorStateList j;
    public ColorStateList k;
    public iw61 l;
    public ColorStateList m;
    public RippleDrawable n;
    public LayerDrawable o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public gch0 f21p;
    public boolean r;
    public final Rect b = new Rect();
    public boolean q = false;

    public cch0(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.a = materialCardView;
        gch0 gch0Var = new gch0(materialCardView.getContext(), attributeSet, i, 2132018778);
        this.c = gch0Var;
        gch0Var.j(materialCardView.getContext());
        gch0Var.o(-12303292);
        iw61 iw61Var = gch0Var.a.a;
        iw61Var.getClass();
        wdm wdmVar = new wdm(iw61Var);
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, omz0.f, i, 2132017466);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            wdmVar.B(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.d = new gch0();
        f(wdmVar.d());
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(zko1 zko1Var, float f) {
        if (zko1Var instanceof gr31) {
            return (float) ((1.0d - s) * ((double) f));
        }
        if (zko1Var instanceof bto) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        zko1 zko1Var = this.l.a;
        gch0 gch0Var = this.c;
        return Math.max(Math.max(b(zko1Var, gch0Var.h()), b(this.l.b, gch0Var.a.a.f.a(gch0Var.g()))), Math.max(b(this.l.c, gch0Var.a.a.g.a(gch0Var.g())), b(this.l.d, gch0Var.a.a.h.a(gch0Var.g()))));
    }

    public final LayerDrawable c() {
        if (this.n == null) {
            this.f21p = new gch0(this.l);
            this.n = new RippleDrawable(this.j, null, this.f21p);
        }
        if (this.o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.n, this.d, this.i});
            this.o = layerDrawable;
            layerDrawable.setId(2, 2131430075);
        }
        return this.o;
    }

    public final bch0 d(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (g() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (g() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new bch0(drawable, iCeil, i, iCeil, i);
    }

    public final void e(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.i = drawableMutate;
            y1a1.U(drawableMutate, this.k);
            boolean z = this.a.i;
            Drawable drawable2 = this.i;
            if (drawable2 != null) {
                drawable2.setAlpha(z ? 255 : 0);
            }
        }
        LayerDrawable layerDrawable = this.o;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(2131430075, this.i);
        }
    }

    public final void f(iw61 iw61Var) {
        this.l = iw61Var;
        gch0 gch0Var = this.c;
        gch0Var.setShapeAppearanceModel(iw61Var);
        gch0Var.V0 = !gch0Var.k();
        gch0 gch0Var2 = this.d;
        if (gch0Var2 != null) {
            gch0Var2.setShapeAppearanceModel(iw61Var);
        }
        gch0 gch0Var3 = this.f21p;
        if (gch0Var3 != null) {
            gch0Var3.setShapeAppearanceModel(iw61Var);
        }
    }

    public final boolean g() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.k() && materialCardView.getUseCompatPadding();
    }

    public final void h() {
        MaterialCardView materialCardView = this.a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.c.k()) && !g()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - s) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.b;
        materialCardView.c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        int[] iArr = CardView.f;
        f6o1.D(materialCardView.e);
    }

    public final void i() {
        boolean z = this.q;
        MaterialCardView materialCardView = this.a;
        if (!z) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.h));
    }
}
