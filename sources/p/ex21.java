package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ex21 {
    public static ex21 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public a680 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final dx21 h = new dx21(6);

    public static synchronized ex21 b() {
        ex21 ex21Var;
        ex21Var = g;
        if (ex21Var == null) {
            ex21Var = new ex21();
            g = ex21Var;
        }
        return ex21Var;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        dx21 dx21Var = h;
        dx21Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) dx21Var.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void h(Drawable drawable, mal malVar, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = malVar.b;
            if (!z && !malVar.a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterF = null;
            ColorStateList colorStateList = z ? (ColorStateList) malVar.c : null;
            PorterDuff.Mode mode = malVar.a ? (PorterDuff.Mode) malVar.d : f;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterF = f(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterF);
        }
    }

    public final synchronized void a(Context context, long j, LayerDrawable layerDrawable) {
        try {
            Drawable.ConstantState constantState = layerDrawable.getConstantState();
            if (constantState != null) {
                q5f0 q5f0Var = (q5f0) this.b.get(context);
                if (q5f0Var == null) {
                    q5f0Var = new q5f0((Object) null);
                    this.b.put(context, q5f0Var);
                }
                q5f0Var.g(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Drawable c(long j, Context context) {
        q5f0 q5f0Var = (q5f0) this.b.get(context);
        if (q5f0Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) q5f0Var.b(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            q5f0Var.h(j);
        }
        return null;
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.graphics.drawable.Drawable, android.graphics.drawable.LayerDrawable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [p.ex21] */
    public final synchronized Drawable e(Context context, int i, boolean z) {
        ?? C;
        LayerDrawable layerDrawableF;
        a680 a680Var;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, 2131230917);
                if (drawableD == null || (!(drawableD instanceof zti1) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            TypedValue typedValue = this.c;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.c = typedValue;
            }
            context.getResources().getValue(i, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            C = c(j, context);
            ?? r4 = 0;
            PorterDuff.Mode modeO = null;
            if (C == 0) {
                if (this.e == null) {
                    C = 0;
                } else {
                    layerDrawableF = a680.f((ex21) this, context, i);
                }
                if (C != 0) {
                    C = layerDrawableF;
                    C.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, j, C);
                }
            }
            if (C == 0) {
                C = x74.G(context, i);
            }
            if (C != 0) {
                ColorStateList colorStateListG = g(context, i);
                if (colorStateListG != null) {
                    Drawable drawableMutate = C.mutate();
                    y1a1.U(drawableMutate, colorStateListG);
                    if (this.e != null) {
                        modeO = a680.o(i);
                    }
                    if (modeO != null) {
                        y1a1.V(drawableMutate, modeO);
                    }
                    r4 = drawableMutate;
                } else if ((this.e != null && a680.B(context, i, (Drawable) C)) || (((a680Var = this.e) != null && a680Var.C(context, i, (Drawable) C)) || !z)) {
                    r4 = C;
                }
                C = r4;
            }
            if (C != 0) {
                a8v.a(C);
            }
        } catch (Throwable th) {
            throw th;
        }
        return C;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        ina1 ina1Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListN = null;
        colorStateList = (weakHashMap == null || (ina1Var = (ina1) weakHashMap.get(context)) == null) ? null : (ColorStateList) dio1.r(ina1Var, i);
        if (colorStateList == null) {
            a680 a680Var = this.e;
            if (a680Var != null) {
                colorStateListN = a680Var.n(context, i);
            }
            if (colorStateListN != null) {
                WeakHashMap weakHashMap2 = this.a;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.a = weakHashMap2;
                }
                ina1 ina1Var2 = (ina1) weakHashMap2.get(context);
                if (ina1Var2 == null) {
                    ina1Var2 = new ina1(0);
                    this.a.put(context, ina1Var2);
                }
                ina1Var2.a(i, colorStateListN);
            }
            colorStateList = colorStateListN;
        }
        return colorStateList;
    }
}
