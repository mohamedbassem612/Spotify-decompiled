package com.google.android.material.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import p.blo1;
import p.dch0;
import p.dgo1;
import p.hj5;
import p.kj5;
import p.kk5;
import p.kl5;
import p.omz0;
import p.qbh0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class MaterialComponentsViewInflater extends kl5 {
    public final hj5 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new qbh0(context, attributeSet);
    }

    public final kj5 createButton(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        dch0 dch0Var = new dch0(u890.J(context, attributeSet, 2130968941, 2132018790), attributeSet, 2130968941);
        Context context2 = dch0Var.getContext();
        TypedArray typedArrayS = blo1.s(context2, attributeSet, omz0.z, 2130968941, 2132018790, new int[0]);
        if (typedArrayS.hasValue(0)) {
            dch0Var.setButtonTintList(dgo1.i(context2, typedArrayS, 0));
        }
        dch0Var.f = typedArrayS.getBoolean(1, false);
        typedArrayS.recycle();
        return dch0Var;
    }

    public final kk5 createRadioButton(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    public final AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
