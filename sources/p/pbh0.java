package p;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pbh0 extends uh3 {
    public final gch0 c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    public pbh0(Context context, int i) {
        TypedValue typedValueO = xfo1.o(context, 2130969695);
        int i2 = typedValueO == null ? 0 : typedValueO.data;
        Context contextJ = u890.J(context, (AttributeSet) null, 2130968623, 2132017739);
        contextJ = i2 != 0 ? new plm(contextJ, i2) : contextJ;
        TypedValue typedValueO2 = xfo1.o(context, 2130969695);
        super(contextJ, typedValueO2 == null ? 0 : typedValueO2.data);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        blo1.m(context2, null, 2130968623, 2132017739);
        int[] iArr = omz0.s;
        blo1.n(context2, null, iArr, 2130968623, 2132017739, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, 2130968623, 2132017739);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(2131166539));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(2131166540));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(2131166538));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(2131166537));
        typedArrayObtainStyledAttributes.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int iQ = xfo1.q(2130969040, context2, pbh0.class.getCanonicalName());
        gch0 gch0Var = new gch0(context2, (AttributeSet) null, 2130968623, 2132017739);
        gch0Var.j(context2);
        gch0Var.m(ColorStateList.valueOf(iQ));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                gch0Var.setShapeAppearanceModel(gch0Var.a.a.e(dimension));
            }
        }
        this.c = gch0Var;
    }

    public final uh3 a(CharSequence[] charSequenceArr, ln5 ln5Var) {
        super.a(charSequenceArr, ln5Var);
        return this;
    }

    public final void b(int i) {
        qh3 qh3Var = ((uh3) this).a;
        qh3Var.f = qh3Var.a.getText(i);
    }

    public final pbh0 c(int i, DialogInterface.OnClickListener onClickListener) {
        return (pbh0) super.setNegativeButton(i, onClickListener);
    }

    public final vh3 create() {
        vh3 vh3VarCreate = super.create();
        Window window = vh3VarCreate.getWindow();
        View decorView = window.getDecorView();
        gch0 gch0Var = this.c;
        if (gch0Var != null) {
            WeakHashMap weakHashMap = b8k1.a;
            gch0Var.l(decorView.getElevation());
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) gch0Var, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new mk80(vh3VarCreate, rect));
        return vh3VarCreate;
    }

    public final pbh0 d(int i, DialogInterface.OnClickListener onClickListener) {
        return (pbh0) super.setPositiveButton(i, onClickListener);
    }

    public final pbh0 e(String str) {
        return (pbh0) super.setTitle(str);
    }

    public final void f(int i) {
        qh3 qh3Var = ((uh3) this).a;
        qh3Var.d = qh3Var.a.getText(i);
    }

    public final uh3 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (pbh0) super.setNegativeButton(i, onClickListener);
    }

    public final uh3 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (pbh0) super.setPositiveButton(i, onClickListener);
    }

    public final uh3 setTitle(CharSequence charSequence) {
        return (pbh0) super.setTitle(charSequence);
    }

    public final uh3 setView(View view) {
        return (pbh0) super.setView(view);
    }
}
