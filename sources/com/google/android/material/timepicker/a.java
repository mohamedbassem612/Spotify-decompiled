package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatCheckBox;
import p.afe1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a extends afe1 {
    public final /* synthetic */ ChipTextInputComboView b;

    public a(ChipTextInputComboView chipTextInputComboView) {
        super((byte) 1);
        this.b = chipTextInputComboView;
    }

    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.b;
        AppCompatCheckBox appCompatCheckBox = chipTextInputComboView.a;
        if (zIsEmpty) {
            appCompatCheckBox.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt("00"))));
        } else {
            appCompatCheckBox.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(editable)))));
        }
    }
}
