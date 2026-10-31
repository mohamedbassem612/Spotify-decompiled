package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class if91 extends FrameLayout.LayoutParams {
    public final gf91 a;
    public final dcx b;

    public if91(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dcx dcxVarD = rbx.b;
        this.b = dcxVarD;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qnz0.a, 0, 0);
        this.a = (gf91) f46.n0(typedArrayObtainStyledAttributes.getInt(0, -1), gf91.values());
        TypedValue typedValue = new TypedValue();
        typedArrayObtainStyledAttributes.getValue(1, typedValue);
        if (typedValue.type == 16) {
            dcx dcxVar = (dcx) o7h.t0(typedArrayObtainStyledAttributes.getInt(1, -1), mka.l());
            if (dcxVar != null) {
                dcxVarD = dcxVar;
            }
        } else {
            String string = typedArrayObtainStyledAttributes.getString(1);
            if (string != null) {
                dcxVarD = mka.d(string);
            }
        }
        this.b = dcxVarD;
        typedArrayObtainStyledAttributes.recycle();
    }
}
