package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s1a extends Drawable implements c4e1 {
    public float N0;
    public WeakReference O0;
    public WeakReference P0;
    public int X;
    public float Y;
    public float Z;
    public final WeakReference a;
    public final gch0 b;
    public final d4e1 c;
    public final Rect d;
    public float e;
    public float f;
    public float g;
    public final r1a h;
    public float i;
    public float t;

    public s1a(Context context) {
        k0e1 k0e1Var;
        Context context2;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        blo1.o(context, blo1.b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.d = new Rect();
        this.b = new gch0();
        this.e = resources.getDimensionPixelSize(2131166544);
        this.g = resources.getDimensionPixelSize(2131166543);
        this.f = resources.getDimensionPixelSize(2131166549);
        d4e1 d4e1Var = new d4e1(this);
        this.c = d4e1Var;
        d4e1Var.a.setTextAlign(Paint.Align.CENTER);
        r1a r1aVar = new r1a();
        r1aVar.c = 255;
        r1aVar.d = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(2132018052, omz0.L);
        typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        ColorStateList colorStateListI = dgo1.i(context, typedArrayObtainStyledAttributes, 3);
        dgo1.i(context, typedArrayObtainStyledAttributes, 4);
        dgo1.i(context, typedArrayObtainStyledAttributes, 5);
        typedArrayObtainStyledAttributes.getInt(2, 0);
        typedArrayObtainStyledAttributes.getInt(1, 1);
        int iM = dgo1.m(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.getResourceId(iM, 0);
        typedArrayObtainStyledAttributes.getString(iM);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        dgo1.i(context, typedArrayObtainStyledAttributes, 6);
        typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(2132018052, omz0.C);
        typedArrayObtainStyledAttributes2.hasValue(0);
        typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
        r1aVar.b = colorStateListI.getDefaultColor();
        r1aVar.f = context.getString(2131958942);
        r1aVar.g = 2131820758;
        r1aVar.h = 2131958944;
        r1aVar.t = true;
        this.h = r1aVar;
        Context context3 = (Context) weakReference.get();
        if (context3 == null || d4e1Var.f == (k0e1Var = new k0e1(context3, 2132018052)) || (context2 = (Context) weakReference.get()) == null) {
            return;
        }
        d4e1Var.b(k0e1Var, context2);
        f();
    }

    @Override // p.c4e1
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        if (c() <= this.X) {
            return NumberFormat.getInstance().format(c());
        }
        Context context = (Context) this.a.get();
        return context == null ? "" : context.getString(2131958945, Integer.valueOf(this.X), "+");
    }

    public final int c() {
        if (d()) {
            return this.h.d;
        }
        return 0;
    }

    public final boolean d() {
        return this.h.d != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || this.h.c == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (d()) {
            Rect rect = new Rect();
            String strB = b();
            d4e1 d4e1Var = this.c;
            d4e1Var.a.getTextBounds(strB, 0, strB.length(), rect);
            canvas.drawText(strB, this.i, this.t + (rect.height() / 2), d4e1Var.a);
        }
    }

    public final void e(View view, FrameLayout frameLayout) {
        this.O0 = new WeakReference(view);
        this.P0 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        f();
        invalidateSelf();
    }

    public final void f() {
        float f;
        float f2;
        Context context = (Context) this.a.get();
        WeakReference weakReference = this.O0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference2 = this.P0;
        FrameLayout frameLayout = weakReference2 != null ? (FrameLayout) weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zD = d();
        r1a r1aVar = this.h;
        int i = (zD ? r1aVar.N0 : r1aVar.Y) + r1aVar.P0;
        int i2 = r1aVar.i;
        if (i2 == 8388691 || i2 == 8388693) {
            this.t = rect3.bottom - i;
        } else {
            this.t = rect3.top + i;
        }
        if (c() <= 9) {
            float f3 = !d() ? this.e : this.f;
            this.Y = f3;
            this.N0 = f3;
            this.Z = f3;
        } else {
            float f4 = this.f;
            this.Y = f4;
            this.N0 = f4;
            this.Z = (this.c.a(b()) / 2.0f) + this.g;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(d() ? 2131166545 : 2131166542);
        int i3 = (d() ? r1aVar.Z : r1aVar.X) + r1aVar.O0;
        int i4 = r1aVar.i;
        if (i4 == 8388659 || i4 == 8388691) {
            WeakHashMap weakHashMap = b8k1.a;
            if (view.getLayoutDirection() == 0) {
                float f5 = rect3.left;
                f = this.Z;
                f2 = (f5 - f) + dimensionPixelSize + i3;
            } else {
                float f6 = rect3.right;
                f = this.Z;
                f2 = ((f6 + f) - dimensionPixelSize) - i3;
            }
            this.i = f2;
        } else {
            WeakHashMap weakHashMap2 = b8k1.a;
            if (view.getLayoutDirection() == 0) {
                float f7 = rect3.right;
                f = this.Z;
                f2 = ((f7 + f) - dimensionPixelSize) - i3;
            } else {
                float f8 = rect3.left;
                f = this.Z;
                f2 = (f8 - f) + dimensionPixelSize + i3;
            }
            this.i = f2;
        }
        float f9 = this.t;
        float f10 = this.N0;
        rect2.set((int) (f2 - f), (int) (f9 - f10), (int) (f2 + f), (int) (f9 + f10));
        float f11 = this.Y;
        gch0 gch0Var = this.b;
        gch0Var.setShapeAppearanceModel(gch0Var.a.a.e(f11));
        if (rect.equals(rect2)) {
            return;
        }
        gch0Var.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.h.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, p.c4e1
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.h.c = i;
        this.c.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
