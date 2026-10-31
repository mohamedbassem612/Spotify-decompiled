package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ltm1 {
    public static LayerDrawable a(Context context, Drawable drawable, int i, ColorStateList colorStateList, float f) {
        Drawable drawableG = x74.G(context, i);
        drawableG.getClass();
        if (colorStateList != null) {
            drawableG = drawableG.mutate();
            y1a1.U(drawableG, colorStateList);
        }
        return new LayerDrawable(new Drawable[]{drawable, new x10(new ns70(drawableG, (byte) 1), f, 0, (byte) 1)});
    }

    public static LayerDrawable b(Context context) {
        return a(context, j541.m(context), 2131231977, x74.E(context, 2131104462), 0.375f);
    }

    public static LayerDrawable c(Context context) {
        ColorDrawable colorDrawable = new ColorDrawable(x74.D(context, 2131101759));
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        zti1 zti1Var = new zti1();
        ThreadLocal threadLocal = qx21.a;
        zti1Var.a = resources.getDrawable(2131233231, theme);
        new yti1(zti1Var.a.getConstantState());
        zti1Var.mutate();
        return new LayerDrawable(new Drawable[]{colorDrawable, new x10(zti1Var, 0.375f, 0, (byte) 1)});
    }

    public static LayerDrawable d(Context context) {
        Drawable drawableG = x74.G(context, 2131234040);
        drawableG.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130968788});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, drawableG, 2131232230, colorStateList, 0.435f);
    }

    public static LayerDrawable e(Context context) {
        Drawable drawableG = x74.G(context, 2131234039);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        zti1 zti1Var = new zti1();
        ThreadLocal threadLocal = qx21.a;
        zti1Var.a = resources.getDrawable(2131233414, theme);
        new yti1(zti1Var.a.getConstantState());
        return new LayerDrawable(new Drawable[]{drawableG, new x10(zti1Var, 0.375f, 0, (byte) 1)});
    }
}
