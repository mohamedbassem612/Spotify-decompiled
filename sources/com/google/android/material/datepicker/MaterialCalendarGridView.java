package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import p.b8k1;
import p.ech0;
import p.foi1;
import p.k220;
import p.ujm0;
import p.zdc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        foi1.c(null);
        if (ech0.k1(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(2131427887);
            setNextFocusRightId(2131428179);
        }
        this.a = ech0.k1(getContext(), 2130969880);
        b8k1.p(this, new zdc((byte) 14));
    }

    public final ujm0 a() {
        return (ujm0) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (ujm0) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((ujm0) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ujm0 ujm0Var = (ujm0) super.getAdapter();
        ujm0Var.getClass();
        int iMax = Math.max(ujm0Var.a.h(), getFirstVisiblePosition());
        int iMin = Math.min(ujm0Var.b(), getLastVisiblePosition());
        ujm0Var.getItem(iMax);
        ujm0Var.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((ujm0) super.getAdapter()).b());
        } else if (i == 130) {
            setSelection(((ujm0) super.getAdapter()).a.h());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((ujm0) super.getAdapter()).a.h()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((ujm0) super.getAdapter()).a.h());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof ujm0) {
            super.setAdapter(listAdapter);
        } else {
            k220.q("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), ujm0.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((ujm0) super.getAdapter()).a.h()) {
            super.setSelection(((ujm0) super.getAdapter()).a.h());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (ujm0) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
