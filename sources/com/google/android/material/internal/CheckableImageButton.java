package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import p.b8k1;
import p.gvf;
import p.i5;
import p.xf;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] g = {R.attr.state_checked};
    public boolean d;
    public boolean e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.f = true;
        b8k1.p(this, new xf(this, (byte) 3));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        return this.d ? View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i + 1), g) : super/*android.view.View*/.onCreateDrawableState(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof gvf)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        gvf gvfVar = (gvf) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(((i5) gvfVar).a);
        setChecked(gvfVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, p.gvf, p.i5] */
    public final Parcelable onSaveInstanceState() {
        ?? gvfVar = new gvf(super/*android.view.View*/.onSaveInstanceState());
        gvfVar.c = this.d;
        return gvfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckable(boolean z) {
        if (this.e != z) {
            this.e = z;
            sendAccessibilityEvent(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.e || this.d == z) {
            return;
        }
        this.d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        if (this.f) {
            super/*android.view.View*/.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969462);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
