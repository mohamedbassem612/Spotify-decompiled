package p;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fk5 {
    public final TextView a;
    private final i5x b;

    public fk5(TextView textView) {
        this.a = textView;
        this.b = new i5x(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a.p(inputFilterArr);
    }

    public final boolean b() {
        return this.b.a.x();
    }

    public final void c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, moz0.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void d(boolean z) {
        this.b.a.A(z);
    }

    public final void e(boolean z) {
        this.b.a.B(z);
    }

    public final TransformationMethod f(in3 in3Var) {
        return this.b.a.E(in3Var);
    }
}
