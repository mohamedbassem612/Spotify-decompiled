package p;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jcz0 extends dn90 {
    public final obz0 e;
    public cif1 f = zhf1.a;
    public final Paint g = new Paint();
    public final int h;
    public final int i;
    public final int j;
    public final Drawable k;
    public final Drawable l;
    public final Drawable m;
    public final Drawable n;
    public final LinkedHashMap o;

    public jcz0(Resources resources, obz0 obz0Var) {
        this.e = obz0Var;
        this.h = resources.getColor(2131101176, null);
        this.i = resources.getColor(2131101175, null);
        this.j = resources.getColor(2131101503, null);
        this.k = resources.getDrawable(2131231362, null);
        this.l = resources.getDrawable(2131232479, null);
        Drawable drawableMutate = resources.getDrawable(2131232479, null).mutate();
        drawableMutate.setTint(resources.getColor(2131102455, null));
        this.m = drawableMutate;
        this.n = resources.getDrawable(2131231692, null);
        this.o = new LinkedHashMap();
    }

    public final void a(RecyclerView recyclerView, w611 w611Var) {
        super.a(recyclerView, w611Var);
        cif1 cif1Var = this.f;
        if (cif1Var instanceof aif1) {
            w611Var.a.setBackgroundResource(2131102463);
            this.e.E(((aif1) cif1Var).a, w611Var.n());
            this.f = zhf1.a;
        }
    }

    public final float f() {
        cif1 cif1Var = this.f;
        bif1 bif1Var = cif1Var instanceof bif1 ? (bif1) cif1Var : null;
        return (bif1Var == null || bif1Var.b == 16) ? 0.5f : Float.MAX_VALUE;
    }

    public final float g() {
        cif1 cif1Var = this.f;
        bif1 bif1Var = cif1Var instanceof bif1 ? (bif1) cif1Var : null;
        return (bif1Var == null || bif1Var.b == 16) ? 0.5f : Float.MAX_VALUE;
    }

    public final void i(Canvas canvas, RecyclerView recyclerView, w611 w611Var, float f, float f2, int i, boolean z) {
        int i2;
        Drawable drawable;
        float fO = f;
        View view = w611Var.a;
        float width = view.getWidth() * 0.45f;
        int iHashCode = w611Var.hashCode();
        boolean z2 = recyclerView.getLayoutDirection() == 0;
        if (z2 == (fO >= 0.0f)) {
            fO = yoi1.o(fO, -width, width);
        }
        float f3 = z2 ? fO : -fO;
        LinkedHashMap linkedHashMap = this.o;
        if (fO == 0.0f) {
            if (((Boolean) linkedHashMap.remove(Integer.valueOf(iHashCode))) != null) {
                int iN = w611Var.n();
                obz0 obz0Var = this.e;
                obz0.F(obz0Var.X, iN, new nbz0(obz0Var, (byte) 2));
            }
            if (this.f instanceof bif1) {
                this.f = zhf1.a;
            }
        } else {
            this.f = new bif1(w611Var.n(), f3 < 0.0f ? 16 : 32);
            zm90 zm90Var = w611Var instanceof zm90 ? (zm90) w611Var : null;
            int iH = zm90Var != null ? zm90Var.h() : 0;
            boolean z3 = iH == 3;
            if (f3 < 0.0f) {
                i2 = this.i;
            } else {
                i2 = z3 ? this.j : this.h;
            }
            Paint paint = this.g;
            paint.setColor(i2);
            int i3 = iH == 0 ? -1 : icz0.a[l1d.C(iH)];
            if (i3 != 1) {
                drawable = i3 != 2 ? this.k : this.l;
            } else {
                drawable = this.m;
            }
            drawable.getClass();
            Drawable drawable2 = this.n;
            if (fO >= 0.0f ? !z2 : z2) {
                drawable = drawable2;
            }
            int height = (view.getHeight() - drawable.getIntrinsicHeight()) / 2;
            Rect rect = fO < 0.0f ? new Rect(view.getRight() + ((int) fO), view.getTop(), view.getRight(), view.getBottom()) : new Rect(view.getLeft(), view.getTop(), view.getLeft() + ((int) fO), view.getBottom());
            int i4 = rect.left + rect.right;
            drawable.setBounds((i4 - drawable.getIntrinsicWidth()) / 2, rect.top + height, (drawable.getIntrinsicWidth() + i4) / 2, rect.bottom - height);
            canvas.clipRect(rect);
            canvas.drawRect(rect, paint);
            drawable.draw(canvas);
            float fAbs = Math.abs(f3) / view.getWidth();
            boolean zContainsKey = linkedHashMap.containsKey(Integer.valueOf(iHashCode));
            if (fAbs <= 0.25f || f3 <= 0) {
                if (z && zContainsKey) {
                    linkedHashMap.remove(Integer.valueOf(iHashCode));
                }
            } else if (z && !zContainsKey) {
                linkedHashMap.put(Integer.valueOf(iHashCode), Boolean.TRUE);
            }
        }
        super.i(canvas, recyclerView, w611Var, fO, f2, i, z);
    }

    public final boolean j(w611 w611Var, w611 w611Var2) {
        this.e.D(w611Var.n(), w611Var2.n());
        return true;
    }

    public final void k(int i, w611 w611Var) {
        if (i != 2 || w611Var == null) {
            return;
        }
        this.e.i.invoke();
        w611Var.a.setBackgroundResource(2131101501);
        this.f = new aif1(w611Var.n());
    }

    public final void l(int i, w611 w611Var) {
        if (i == 16) {
            int iN = w611Var.n();
            obz0 obz0Var = this.e;
            ArrayList arrayList = obz0Var.X;
            if (i == 32) {
                obz0.F(arrayList, iN, new nbz0(obz0Var, (byte) 2));
            } else {
                obz0.F(arrayList, iN, new ym(obz0Var, iN, (byte) 21));
            }
        }
    }
}
