package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x1f1 extends ViewGroup.MarginLayoutParams {
    public int a;
    public byte b;

    public x1f1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, moz0.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.b = (byte) 0;
    }

    public x1f1() {
        super(-2, -2);
        this.b = (byte) 0;
        this.a = 8388627;
    }

    public x1f1(x1f1 x1f1Var, Object obj) {
        super((ViewGroup.MarginLayoutParams) x1f1Var);
        this.a = 0;
        this.a = x1f1Var.a;
    }

    public x1f1(ViewGroup.LayoutParams layoutParams, int i) {
        super(layoutParams);
        this.a = 0;
    }

    public x1f1(x1f1 x1f1Var) {
        this(x1f1Var, (Object) null);
        this.b = (byte) 0;
        this.b = x1f1Var.b;
    }

    public x1f1(x1f1 x1f1Var, int i) {
        this(x1f1Var, (Object) null);
        this.b = (byte) 0;
    }

    public x1f1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        this(marginLayoutParams, 0);
        this.b = (byte) 0;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
    }

    public x1f1(ViewGroup.LayoutParams layoutParams) {
        this(layoutParams, 0);
        this.b = (byte) 0;
    }
}
