package com.spotify.encoreconsumermobile.elements.previewbutton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.ajw0;
import p.aru0;
import p.azo1;
import p.bjw0;
import p.eg;
import p.enz0;
import p.hid0;
import p.iu30;
import p.j4b1;
import p.kb5;
import p.o7h;
import p.otd;
import p.ppv0;
import p.tlv;
import p.yiw0;
import p.ziw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/previewbutton/PreviewOverlayView;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "src_main_java_com_spotify_encoreconsumermobile_elements_previewbutton-previewbutton"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class PreviewOverlayView extends ConstraintLayout implements tlv {
    public static final /* synthetic */ int Y0 = 0;
    public final aru0 T0;
    public bjw0 U0;
    public ValueAnimator V0;
    public ppv0 W0;
    public iu30 X0;

    public PreviewOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aru0 aru0VarM = aru0.m(LayoutInflater.from(context), this);
        this.T0 = aru0VarM;
        this.U0 = new ajw0();
        ((ImageView) aru0VarM.d).setImageDrawable(azo1.r(context, j4b1.L4, 2131101354, context.getResources().getDimensionPixelSize(2131165851)));
        setOnClickListener(new hid0(this, (byte) 16));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, enz0.a, i, 0);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        ((LottieAnimationView) aru0VarM.c).setPadding(dimension, dimension, dimension, dimension);
        typedArrayObtainStyledAttributes.recycle();
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    @Override // p.mi90
    public final void n(iu30 iu30Var) {
        this.X0 = iu30Var;
        this.W0 = new ppv0(iu30Var, (byte) 7);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:39:0x00f8  */
    @Override // p.mi90
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void f(bjw0 bjw0Var) throws NoWhenBranchMatchedException {
        String string;
        ziw0 ziw0Var = ziw0.b;
        ziw0 ziw0Var2 = ziw0.a;
        if (!bjw0Var.equals(this.U0)) {
            boolean z = bjw0Var instanceof ajw0;
            aru0 aru0Var = this.T0;
            if (z) {
                ValueAnimator valueAnimator = this.V0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ((ImageView) aru0Var.d).setVisibility(0);
            } else if (bjw0Var instanceof yiw0) {
                yiw0 yiw0Var = (yiw0) bjw0Var;
                ValueAnimator valueAnimator2 = this.V0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                if (yiw0Var.b() < 1.0f) {
                    long jA = yiw0Var.a();
                    float fB = yiw0Var.b();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fB, 1.0f);
                    valueAnimatorOfFloat.setDuration((long) (jA * (1.0f - fB)));
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new kb5(this, (byte) 16));
                    valueAnimatorOfFloat.addListener(new otd(this, (byte) 6));
                    this.V0 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                }
            } else if (!bjw0Var.equals(ziw0Var2)) {
                if (!bjw0Var.equals(ziw0Var)) {
                    eg.o();
                    return;
                }
                ((ImageView) aru0Var.d).setVisibility(4);
            }
            this.U0 = bjw0Var;
        }
        if (bjw0Var instanceof yiw0) {
            string = getContext().getString(2131960404);
        } else if (bjw0Var instanceof ajw0) {
            ajw0 ajw0Var = (ajw0) bjw0Var;
            if (ajw0Var.a() == null) {
                string = getContext().getString(2131960405);
            } else {
                string = ajw0Var.a().a().isEmpty() ? getContext().getString(2131960405) : getContext().getString(2131960406, ajw0Var.a().b(), o7h.y0(ajw0Var.a().a(), ", ", (String) null, (String) null, (iu30) null, 54));
                if (string == null) {
                    string = getContext().getString(2131960405);
                }
            }
        } else if (bjw0Var.equals(ziw0Var2)) {
            string = getContext().getString(2131960405);
        } else {
            if (!bjw0Var.equals(ziw0Var)) {
                eg.o();
                return;
            }
            string = null;
        }
        setContentDescription(string);
    }

    public final void z() {
        aru0 aru0Var = this.T0;
        ((LottieAnimationView) aru0Var.c).setVisibility(8);
        ((ImageView) aru0Var.d).setVisibility(0);
        setContentDescription(aru0Var.l().getContext().getString(2131960405));
    }

    public PreviewOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PreviewOverlayView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PreviewOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
