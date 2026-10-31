package com.spotify.legacyglue.pasteview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatTextView;
import p.hj5;
import p.hk5;
import p.il5;
import p.kj5;
import p.kk5;
import p.kl5;
import p.lk5;
import p.mj5;
import p.n8s0;
import p.o8s0;
import p.vk5;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class PasteViewInflater extends kl5 {
    public hj5 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        hj5 hj5VarCreateView = createView(context, "AutoCompleteTextView", attributeSet);
        return hj5VarCreateView == null ? new hj5(context, attributeSet) : hj5VarCreateView;
    }

    public kj5 createButton(Context context, AttributeSet attributeSet) {
        kj5 kj5VarCreateView = createView(context, "Button", attributeSet);
        return kj5VarCreateView == null ? new kj5(context, attributeSet) : kj5VarCreateView;
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        AppCompatCheckBox appCompatCheckBoxCreateView = createView(context, "CheckBox", attributeSet);
        return appCompatCheckBoxCreateView == null ? new AppCompatCheckBox(context, attributeSet) : appCompatCheckBoxCreateView;
    }

    public mj5 createCheckedTextView(Context context, AttributeSet attributeSet) {
        mj5 mj5VarCreateView = createView(context, "CheckedTextView", attributeSet);
        return mj5VarCreateView == null ? new mj5(context, attributeSet) : mj5VarCreateView;
    }

    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        AppCompatEditText appCompatEditTextCreateView = createView(context, "EditText", attributeSet);
        return appCompatEditTextCreateView == null ? new AppCompatEditText(context, attributeSet) : appCompatEditTextCreateView;
    }

    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        AppCompatImageButton appCompatImageButtonCreateView = createView(context, "ImageButton", attributeSet);
        return appCompatImageButtonCreateView == null ? new AppCompatImageButton(context, attributeSet) : appCompatImageButtonCreateView;
    }

    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        AppCompatImageView appCompatImageViewCreateView = createView(context, "ImageView", attributeSet);
        return appCompatImageViewCreateView == null ? new AppCompatImageView(context, attributeSet) : appCompatImageViewCreateView;
    }

    public hk5 createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        hk5 hk5VarCreateView = createView(context, "MultiAutoCompleteTextView", attributeSet);
        return hk5VarCreateView == null ? new hk5(context, attributeSet) : hk5VarCreateView;
    }

    public kk5 createRadioButton(Context context, AttributeSet attributeSet) {
        kk5 kk5VarCreateView = createView(context, "RadioButton", attributeSet);
        return kk5VarCreateView == null ? new kk5(context, attributeSet) : kk5VarCreateView;
    }

    public AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeSet) {
        AppCompatRatingBar appCompatRatingBarCreateView = createView(context, "RatingBar", attributeSet);
        return appCompatRatingBarCreateView == null ? new AppCompatRatingBar(context, attributeSet) : appCompatRatingBarCreateView;
    }

    public lk5 createSeekBar(Context context, AttributeSet attributeSet) {
        lk5 lk5VarCreateView = createView(context, "SeekBar", attributeSet);
        return lk5VarCreateView == null ? new lk5(context, attributeSet) : lk5VarCreateView;
    }

    public vk5 createSpinner(Context context, AttributeSet attributeSet) {
        vk5 vk5VarCreateView = createView(context, "Spinner", attributeSet);
        return vk5VarCreateView == null ? new vk5(context, attributeSet) : vk5VarCreateView;
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextViewCreateView = createView(context, "TextView", attributeSet);
        return appCompatTextViewCreateView == null ? new AppCompatTextView(context, attributeSet) : appCompatTextViewCreateView;
    }

    public il5 createToggleButton(Context context, AttributeSet attributeSet) {
        il5 il5VarCreateView = createView(context, "ToggleButton", attributeSet);
        return il5VarCreateView == null ? new il5(context, attributeSet) : il5VarCreateView;
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        n8s0 n8s0Var = (n8s0) o8s0.b.get(str);
        if (n8s0Var == null) {
            n8s0Var = (n8s0) o8s0.a.get(str);
        }
        if (n8s0Var == null) {
            return null;
        }
        return yoi1.x(context, n8s0Var, attributeSet, 0);
    }
}
