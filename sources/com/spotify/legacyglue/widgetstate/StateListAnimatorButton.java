package com.spotify.legacyglue.widgetstate;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p.b2u;
import p.da30;
import p.iti1;
import p.kj5;
import p.kpb1;
import p.lpb1;
import p.m890;
import p.n7s0;
import p.y7v;
import p.znz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Deprecated
public class StateListAnimatorButton extends kj5 {
    public lpb1 e;
    public n7s0 f;

    public StateListAnimatorButton(Context context) {
        super(context, (AttributeSet) null);
        this.e = new kpb1(this);
        i(null, 0);
    }

    public final void drawableStateChanged() {
        Drawable background;
        super.drawableStateChanged();
        n7s0 n7s0Var = this.f;
        if (n7s0Var != null) {
            kj5 kj5Var = n7s0Var.a;
            iti1 iti1Var = n7s0Var.d;
            if (iti1Var.a && (background = kj5Var.getBackground()) != null) {
                y7v.a(background, (ColorStateList) iti1Var.c, kj5Var.getDrawableState());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getScaleX() {
        lpb1 lpb1Var = this.e;
        return lpb1Var != null ? lpb1Var.c() : super/*android.view.View*/.getScaleX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getScaleY() {
        lpb1 lpb1Var = this.e;
        return lpb1Var != null ? lpb1Var.e() : super/*android.view.View*/.getScaleY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(AttributeSet attributeSet, int i) {
        boolean z;
        setIncludeFontPadding(false);
        b2u.o(this).a();
        da30.b(this, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{2130969391});
            try {
                z = typedArrayObtainStyledAttributes.getBoolean(0, false);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = false;
        }
        this.e = z ? new m890(this) : new kpb1(this);
        n7s0 n7s0Var = new n7s0(this);
        this.f = n7s0Var;
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, znz0.b, i, 0);
        try {
            n7s0Var.c = typedArrayObtainStyledAttributes2.getColor(2, -16777216);
            n7s0Var.b = typedArrayObtainStyledAttributes2.getColor(3, -1);
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                n7s0Var.e.b = typedArrayObtainStyledAttributes2.getColor(4, -65281);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(1)) {
                n7s0Var.d.b = typedArrayObtainStyledAttributes2.getColor(1, -65281);
            }
            n7s0Var.a();
        } finally {
            typedArrayObtainStyledAttributes2.recycle();
        }
    }

    public final void onDraw(Canvas canvas) {
        this.e.b(canvas);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n7s0 n7s0Var = this.f;
        if (n7s0Var != null) {
            n7s0Var.a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        n7s0 n7s0Var = this.f;
        if (n7s0Var != null) {
            n7s0Var.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScaleX(float f) {
        lpb1 lpb1Var = this.e;
        if (lpb1Var != null) {
            lpb1Var.a(f);
        } else {
            super/*android.view.View*/.setScaleX(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScaleY(float f) {
        lpb1 lpb1Var = this.e;
        if (lpb1Var != null) {
            lpb1Var.d(f);
        } else {
            super/*android.view.View*/.setScaleY(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearance(int i) {
        super/*android.widget.TextView*/.setTextAppearance(i);
        da30.a(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        da30.a(this, i);
    }

    public StateListAnimatorButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new kpb1(this);
        i(attributeSet, 0);
    }

    public StateListAnimatorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new kpb1(this);
        i(attributeSet, i);
    }
}
