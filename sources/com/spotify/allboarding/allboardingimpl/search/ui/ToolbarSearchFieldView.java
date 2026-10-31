package com.spotify.allboarding.allboardingimpl.search.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.spotify.allboarding.allboardingimpl.search.ui.ToolbarSearchFieldView;
import java.util.Collections;
import p.a8o;
import p.b2u;
import p.b8k1;
import p.cwl1;
import p.e821;
import p.g4b1;
import p.ifb1;
import p.j4b1;
import p.m3f1;
import p.n3f1;
import p.nce;
import p.o3f1;
import p.p3f1;
import p.pmz0;
import p.q3f1;
import p.r3f1;
import p.sv41;
import p.v9w0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class ToolbarSearchFieldView extends FrameLayout {
    public static final m3f1 R0 = new m3f1();
    public static final n3f1 S0 = new n3f1();
    public q3f1 N0;
    public final e821 O0;
    public final int P0;
    public final int Q0;
    public int a;
    public final int b;
    public final View c;
    public final BackKeyEditText d;
    public final ImageButton e;
    public final ImageButton f;
    public final Button g;
    public final View h;
    public final o3f1 i;
    public r3f1 t;

    public ToolbarSearchFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = o3f1.b;
        this.t = R0;
        this.N0 = S0;
        LayoutInflater.from(context).inflate(2131626105, (ViewGroup) this, true);
        setDescendantFocusability(262144);
        View viewN = b8k1.n(this, 2131430819);
        this.c = viewN;
        BackKeyEditText backKeyEditText = (BackKeyEditText) b8k1.n(this, 2131430561);
        this.d = backKeyEditText;
        ImageButton imageButton = (ImageButton) b8k1.n(this, 2131430839);
        this.e = imageButton;
        Button button = (Button) b8k1.n(this, 2131430831);
        this.g = button;
        this.h = b8k1.n(this, 2131430818);
        new g4b1(context, j4b1.A1, context.getResources().getDimensionPixelSize(2131165277)).b(context.getColor(2131104462));
        g4b1 g4b1Var = new g4b1(context, j4b1.Q7, context.getResources().getDimensionPixelSize(2131165277));
        g4b1Var.b(context.getColor(2131104462));
        ImageButton imageButton2 = (ImageButton) b8k1.n(this, 2131427887);
        this.f = imageButton2;
        v9w0 v9w0VarO = b2u.o(imageButton2);
        final byte b = 0;
        Collections.addAll(v9w0VarO.d, imageButton2);
        v9w0VarO.a();
        g4b1 g4b1Var2 = new g4b1(context, j4b1.b1, context.getResources().getDimensionPixelSize(2131165277));
        g4b1Var2.b(context.getColor(2131104462));
        imageButton2.setImageDrawable(g4b1Var2);
        int iY = a8o.y(8.0f, context.getResources());
        int iY2 = a8o.y(4.0f, context.getResources());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, pmz0.a, 0, 0);
        this.P0 = iY;
        this.Q0 = iY;
        try {
            int color = typedArrayObtainStyledAttributes.getColor(1, context.getColor(2131101503));
            this.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iY);
            this.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, iY);
            sv41 sv41Var = new sv41(this.P0, this.Q0, typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, iY2), color);
            typedArrayObtainStyledAttributes.recycle();
            viewN.setBackground(sv41Var);
            v9w0 v9w0VarO2 = b2u.o(button);
            Collections.addAll(v9w0VarO2.c, button);
            v9w0VarO2.a();
            g4b1 g4b1Var3 = new g4b1(context, j4b1.W5, context.getResources().getDimensionPixelSize(2131165277));
            g4b1Var3.b(context.getColor(2131104462));
            this.b = ((FrameLayout.LayoutParams) imageButton.getLayoutParams()).rightMargin;
            this.i = o3f1.a;
            imageButton.setImageDrawable(g4b1Var);
            imageButton.setVisibility(8);
            button.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) g4b1Var3, (Drawable) null, (Drawable) null, (Drawable) null);
            View searchField = getSearchField();
            e821 e821Var = new e821();
            e821Var.e = this;
            nce nceVar = sv41.h;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(sv41Var, (Property<sv41, Integer>) nceVar, 255);
            objectAnimatorOfInt.setDuration(200L);
            e821Var.c = objectAnimatorOfInt;
            ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(sv41Var, (Property<sv41, Integer>) nceVar, 0);
            objectAnimatorOfInt2.setDuration(200L);
            e821Var.d = objectAnimatorOfInt2;
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(searchField, (Property<View, Float>) property, 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(button, (Property<Button, Float>) property, 1.0f);
            ImageButton imageButton3 = this.e;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageButton3, "scaleX", 1.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageButton3, "scaleY", 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat2.setDuration(200L);
            objectAnimatorOfFloat3.setDuration(200L);
            objectAnimatorOfFloat4.setDuration(200L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).before(objectAnimatorOfFloat2);
            animatorSet.addListener(new p3f1(e821Var, button, searchField));
            e821Var.b = animatorSet;
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(button, (Property<Button, Float>) property, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(searchField, (Property<View, Float>) property, 1.0f);
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(imageButton3, "scaleX", 1.2f);
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(imageButton3, "scaleY", 1.2f);
            objectAnimatorOfFloat5.setDuration(200L);
            objectAnimatorOfFloat6.setDuration(200L);
            objectAnimatorOfFloat7.setDuration(200L);
            objectAnimatorOfFloat8.setDuration(200L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8).before(objectAnimatorOfFloat6);
            animatorSet2.addListener(new p3f1(e821Var, searchField, button));
            e821Var.a = animatorSet2;
            this.O0 = e821Var;
            imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: p.l3f1
                public final /* synthetic */ ToolbarSearchFieldView b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = b;
                    ToolbarSearchFieldView toolbarSearchFieldView = this.b;
                    switch (b2) {
                        case 0:
                            m3f1 m3f1Var = ToolbarSearchFieldView.R0;
                            if (toolbarSearchFieldView.i == o3f1.a) {
                                toolbarSearchFieldView.t.a();
                            }
                            break;
                        case 1:
                            m3f1 m3f1Var2 = ToolbarSearchFieldView.R0;
                            toolbarSearchFieldView.N0.b();
                            break;
                        default:
                            m3f1 m3f1Var3 = ToolbarSearchFieldView.R0;
                            toolbarSearchFieldView.N0.a();
                            break;
                    }
                }
            });
            final byte b2 = 1;
            imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: p.l3f1
                public final /* synthetic */ ToolbarSearchFieldView b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b2;
                    ToolbarSearchFieldView toolbarSearchFieldView = this.b;
                    switch (b3) {
                        case 0:
                            m3f1 m3f1Var = ToolbarSearchFieldView.R0;
                            if (toolbarSearchFieldView.i == o3f1.a) {
                                toolbarSearchFieldView.t.a();
                            }
                            break;
                        case 1:
                            m3f1 m3f1Var2 = ToolbarSearchFieldView.R0;
                            toolbarSearchFieldView.N0.b();
                            break;
                        default:
                            m3f1 m3f1Var3 = ToolbarSearchFieldView.R0;
                            toolbarSearchFieldView.N0.a();
                            break;
                    }
                }
            });
            backKeyEditText.setBackKeyListener(new ifb1(this, (byte) 17));
            final byte b3 = 2;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: p.l3f1
                public final /* synthetic */ ToolbarSearchFieldView b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b4 = b3;
                    ToolbarSearchFieldView toolbarSearchFieldView = this.b;
                    switch (b4) {
                        case 0:
                            m3f1 m3f1Var = ToolbarSearchFieldView.R0;
                            if (toolbarSearchFieldView.i == o3f1.a) {
                                toolbarSearchFieldView.t.a();
                            }
                            break;
                        case 1:
                            m3f1 m3f1Var2 = ToolbarSearchFieldView.R0;
                            toolbarSearchFieldView.N0.b();
                            break;
                        default:
                            m3f1 m3f1Var3 = ToolbarSearchFieldView.R0;
                            toolbarSearchFieldView.N0.a();
                            break;
                    }
                }
            };
            viewN.setOnClickListener(onClickListener);
            button.setOnClickListener(onClickListener);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public View getCancelButton() {
        return this.f;
    }

    public o3f1 getCurrentDrawableState() {
        return this.i;
    }

    public int getInsetX() {
        return this.P0;
    }

    public int getInsetY() {
        return this.Q0;
    }

    public BackKeyEditText getQueryEditText() {
        return this.d;
    }

    public View getRightButton() {
        return this.e;
    }

    public View getSearchField() {
        return this.h;
    }

    public Button getSearchPlaceHolder() {
        return this.g;
    }

    public void setRightButtonVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 4);
    }

    public void setToolbarSearchFieldCallbacks(q3f1 q3f1Var) {
        this.N0 = (q3f1) cwl1.y(q3f1Var, S0);
    }

    public void setToolbarSearchFieldRightButtonListener(r3f1 r3f1Var) {
        this.t = (r3f1) cwl1.y(r3f1Var, R0);
    }

    public ToolbarSearchFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolbarSearchFieldView(Context context) {
        this(context, null, 0);
    }
}
