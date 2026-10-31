package com.spotify.encoreconsumermobile.elements.thumb;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.azo1;
import p.fjc1;
import p.hhe1;
import p.ihe1;
import p.is3;
import p.iu30;
import p.j4b1;
import p.jhe1;
import p.jnz0;
import p.lhe1;
import p.mhe1;
import p.nhe1;
import p.wa21;
import p.x0e1;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/thumb/ThumbButtonView;", "Lp/hhe1;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "listener", "Lp/rih1;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "getContentDescription", "f", "I", "getActiveColor", "()I", "setActiveColor", "(I)V", "activeColor", "Lp/mhe1;", "g", "Lp/mhe1;", "getType", "()Lp/mhe1;", "type", "", "h", "F", "getDrawableSize", "()F", "setDrawableSize", "(F)V", "drawableSize", "src_main_java_com_spotify_encoreconsumermobile_elements_thumb-thumb"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ThumbButtonView extends StateListAnimatorImageButton implements hhe1 {
    public static final /* synthetic */ int i = 0;
    public lhe1 d;
    public iu30 e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int activeColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final mhe1 type;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float drawableSize;

    /* JADX WARN: Multi-variable type inference failed */
    public ThumbButtonView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = lhe1.b;
        this.e = nhe1.b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jnz0.a, i2, 0);
        this.type = mhe1.values()[typedArrayObtainStyledAttributes.getInt(2, 0)];
        this.activeColor = typedArrayObtainStyledAttributes.getResourceId(0, 2131101343);
        this.drawableSize = typedArrayObtainStyledAttributes.getDimension(1, context.getResources().getDimension(2131165724));
        typedArrayObtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setBackgroundResource(0);
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        super/*android.view.View*/.setOnClickListener(null);
        fjc1 fjc1Var = new fjc1(this, (byte) 21);
        setRotation(0.0f);
        AccelerateInterpolator accelerateInterpolator = ihe1.a;
        x0e1 x0e1Var = new x0e1(this, fjc1Var, (byte) 6);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        viewPropertyAnimatorAnimate.rotationBy(-25.0f);
        viewPropertyAnimatorAnimate.scaleXBy(0.2f);
        viewPropertyAnimatorAnimate.scaleYBy(0.2f);
        viewPropertyAnimatorAnimate.setInterpolator(accelerateInterpolator);
        viewPropertyAnimatorAnimate.setDuration(200L);
        viewPropertyAnimatorAnimate.withEndAction(new is3(x0e1Var, (byte) 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        j4b1 j4b1Var;
        Context context = getContext();
        lhe1 lhe1Var = this.d;
        int i2 = this.activeColor;
        float f = this.drawableSize;
        mhe1 mhe1Var = this.type;
        lhe1 lhe1Var2 = lhe1.a;
        lhe1 lhe1Var3 = lhe1.b;
        mhe1 mhe1Var2 = mhe1.a;
        if (mhe1Var == mhe1Var2 && lhe1Var == lhe1Var3) {
            j4b1Var = jhe1.a;
        } else if (mhe1Var == mhe1Var2 && lhe1Var == lhe1Var2) {
            j4b1Var = jhe1.b;
        } else {
            j4b1Var = (mhe1Var == mhe1.b && lhe1Var == lhe1Var3) ? jhe1.c : jhe1.d;
        }
        if (lhe1Var != lhe1Var2) {
            i2 = 2131101343;
        }
        setImageDrawable(azo1.r(context, j4b1Var, i2, (int) f));
    }

    public final void f(Object obj) {
        this.d = (lhe1) obj;
        b();
    }

    public CharSequence getAccessibilityClassName() {
        return "android.widget.CheckBox";
    }

    public final int getActiveColor() {
        return this.activeColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CharSequence getContentDescription() {
        String string = this.type == mhe1.b ? getResources().getString(2131963171) : getResources().getString(2131963172);
        string.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            return xcg1.i(this.d == lhe1.a ? getResources().getString(2131963173) : getResources().getString(2131963170), ", ", string);
        }
        return string;
    }

    public final float getDrawableSize() {
        return this.drawableSize;
    }

    public final mhe1 getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        this.e = iu30Var;
        super/*android.view.View*/.setOnClickListener(new wa21(iu30Var, this, (byte) 20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 30) {
            CheckBox checkBox = new CheckBox(getContext());
            checkBox.setChecked(this.d == lhe1.a);
            accessibilityNodeInfo.setStateDescription(checkBox.getStateDescription());
        }
    }

    public final void setActiveColor(int i2) {
        this.activeColor = i2;
    }

    public final void setDrawableSize(float f) {
        this.drawableSize = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @adt
    public void setOnClickListener(View.OnClickListener listener) {
        super/*android.view.View*/.setOnClickListener(listener);
    }

    public ThumbButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ThumbButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ThumbButtonView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
