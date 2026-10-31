package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p.eg;
import p.h3n;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public final boolean b(View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        eg.m("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    public final void c(h3n h3nVar) {
        if (h3nVar.h == 0) {
            h3nVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
