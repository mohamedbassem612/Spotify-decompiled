package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p.dgo1;
import p.omz0;
import p.u890;
import p.xfo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(u890.J(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        if (xfo1.p(context2, 2130970399, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = omz0.D;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int[] iArr2 = {1, 2};
            int iK = -1;
            for (int i3 = 0; i3 < 2 && iK < 0; i3++) {
                iK = dgo1.k(context2, typedArrayObtainStyledAttributes, iArr2[i3], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iK != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, omz0.C);
                Context context3 = getContext();
                int[] iArr3 = {1, 2};
                int iK2 = -1;
                for (int i4 = 0; i4 < 2 && iK2 < 0; i4++) {
                    iK2 = dgo1.k(context3, typedArrayObtainStyledAttributes3, iArr3[i4], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iK2 >= 0) {
                    setLineHeight(iK2);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (xfo1.p(context, 2130970399, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, omz0.C);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iK = -1;
            for (int i2 = 0; i2 < 2 && iK < 0; i2++) {
                iK = dgo1.k(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iK >= 0) {
                setLineHeight(iK);
            }
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context) {
        this(context, null);
    }
}
