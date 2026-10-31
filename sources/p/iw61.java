package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iw61 {
    public zko1 a = ggo1.z();
    public zko1 b = ggo1.z();
    public zko1 c = ggo1.z();
    public zko1 d = ggo1.z();
    public j8n e = new k5(0.0f);
    public j8n f = new k5(0.0f);
    public j8n g = new k5(0.0f);
    public j8n h = new k5(0.0f);
    public fmv i = ggo1.A();
    public fmv j = ggo1.A();
    public fmv k = ggo1.A();
    public fmv l = ggo1.A();

    public static wdm a(Context context, int i, int i2, k5 k5Var) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, omz0.H);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            j8n j8nVarC = c(typedArrayObtainStyledAttributes, 5, k5Var);
            j8n j8nVarC2 = c(typedArrayObtainStyledAttributes, 8, j8nVarC);
            j8n j8nVarC3 = c(typedArrayObtainStyledAttributes, 9, j8nVarC);
            j8n j8nVarC4 = c(typedArrayObtainStyledAttributes, 7, j8nVarC);
            j8n j8nVarC5 = c(typedArrayObtainStyledAttributes, 6, j8nVarC);
            wdm wdmVar = new wdm();
            wdmVar.K(i4, j8nVarC2);
            wdmVar.M(i5, j8nVarC3);
            wdmVar.F(i6, j8nVarC4);
            wdmVar.D(i7, j8nVarC5);
            return wdmVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static wdm b(Context context, AttributeSet attributeSet, int i, int i2) {
        k5 k5Var = new k5(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.B, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, k5Var);
    }

    public static j8n c(TypedArray typedArray, int i, j8n j8nVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new k5(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new eo11(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return j8nVar;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(fmv.class) && this.j.getClass().equals(fmv.class) && this.i.getClass().equals(fmv.class) && this.k.getClass().equals(fmv.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof gr31) && (this.a instanceof gr31) && (this.c instanceof gr31) && (this.d instanceof gr31));
    }

    public final iw61 e(float f) {
        wdm wdmVar = new wdm(this);
        wdmVar.B(f);
        return wdmVar.d();
    }
}
