package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import p.b8k1;
import p.kil;
import p.lgs;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int U0 = 0;
    public final MaterialButtonToggleGroup T0;

    /* JADX WARN: Multi-variable type inference failed */
    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.OnClickListener dVar = new d();
        LayoutInflater.from(context).inflate(2131625196, (ViewGroup) this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(2131429917);
        this.T0 = materialButtonToggleGroup;
        materialButtonToggleGroup.d.add(new e());
        AppCompatCheckBox appCompatCheckBox = (Chip) findViewById(2131429922);
        AppCompatCheckBox appCompatCheckBox2 = (Chip) findViewById(2131429919);
        WeakHashMap weakHashMap = b8k1.a;
        appCompatCheckBox.setAccessibilityLiveRegion(2);
        appCompatCheckBox2.setAccessibilityLiveRegion(2);
        View.OnTouchListener lgsVar = new lgs(new GestureDetector(getContext(), new f()), (byte) 6);
        appCompatCheckBox.setOnTouchListener(lgsVar);
        appCompatCheckBox2.setOnTouchListener(lgsVar);
        appCompatCheckBox.setTag(2131430919, 12);
        appCompatCheckBox2.setTag(2131430919, 10);
        appCompatCheckBox.setOnClickListener(dVar);
        appCompatCheckBox2.setOnClickListener(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onVisibilityChanged(View view, int i) {
        super/*android.view.View*/.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            y();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        if (this.T0.getVisibility() == 0) {
            kil kilVar = new kil();
            kilVar.f(this);
            WeakHashMap weakHashMap = b8k1.a;
            kilVar.e(2131429912, getLayoutDirection() == 0 ? 2 : 1);
            kilVar.b(this);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }
}
