package com.spotify.encoreconsumermobile.elements.badge.live;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8k1;
import p.eg;
import p.idd1;
import p.l1d;
import p.mnd0;
import p.nnd0;
import p.ond0;
import p.pnd0;
import p.qnd0;
import p.tlv;
import p.wmz0;
import p.xfo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0014\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R#\u0010\u0017\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010\"\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u001bR\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010&R\u001b\u0010-\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010&¨\u0006."}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/live/LiveEventBadgeView;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/ColorStateList;", "kotlin.jvm.PlatformType", "V0", "Lp/znb0;", "getScheduledColor", "()Landroid/content/res/ColorStateList;", "scheduledColor", "W0", "getLiveColor", "liveColor", "X0", "getEndedColor", "endedColor", "Landroid/graphics/drawable/Drawable;", "Y0", "getScheduledBg", "()Landroid/graphics/drawable/Drawable;", "scheduledBg", "Z0", "getLiveBg", "liveBg", "a1", "getEndedBg", "endedBg", "", "b1", "getScheduledText", "()Ljava/lang/String;", "scheduledText", "c1", "getLiveText", "liveText", "d1", "getEndedText", "endedText", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_live-live"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LiveEventBadgeView extends ConstraintLayout implements tlv {
    public final AppCompatTextView T0;
    public final ComposeView U0;
    public final idd1 V0;
    public final idd1 W0;
    public final idd1 X0;
    public final idd1 Y0;
    public final idd1 Z0;
    public final idd1 a1;
    public final idd1 b1;
    public final idd1 c1;
    public final idd1 d1;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveEventBadgeView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        super(context, attributeSet, i);
        this.V0 = new idd1(new qnd0(context, (byte) 4));
        this.W0 = new idd1(new qnd0(context, (byte) 2));
        this.X0 = new idd1(new qnd0(context, (byte) 0));
        this.Y0 = new idd1(new pnd0(context, this, (byte) 2));
        this.Z0 = new idd1(new pnd0(context, this, (byte) 1));
        this.a1 = new idd1(new pnd0(context, this, (byte) 0));
        this.b1 = new idd1(new qnd0(context, (byte) 5));
        this.c1 = new idd1(new qnd0(context, (byte) 3));
        this.d1 = new idd1(new qnd0(context, (byte) 1));
        View.inflate(context, 2131625145, this);
        setId(2131429808);
        AppCompatTextView appCompatTextViewN = b8k1.n(this, 2131428734);
        this.T0 = appCompatTextViewN;
        ComposeView composeViewN = b8k1.n(this, 2131429809);
        this.U0 = composeViewN;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wmz0.a, i, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        int iC = l1d.C(l1d.H(2)[i4]);
        if (iC == 0) {
            i2 = 2131166213;
            i3 = 2131166212;
        } else {
            if (iC != 1) {
                eg.o();
                throw null;
            }
            i3 = 2131166211;
            i2 = 2131166215;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
        ViewGroup.LayoutParams layoutParams = composeViewN.getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        composeViewN.setLayoutParams(layoutParams);
        float f = context.getResources().getDisplayMetrics().density;
        appCompatTextViewN.setTextSize(0, context.getResources().getDimension(i2));
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131166210);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(2131166214);
        setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
    }

    private final Drawable getEndedBg() {
        return (Drawable) this.a1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ColorStateList getEndedColor() {
        return (ColorStateList) this.X0.getValue();
    }

    private final String getEndedText() {
        return (String) this.d1.getValue();
    }

    private final Drawable getLiveBg() {
        return (Drawable) this.Z0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ColorStateList getLiveColor() {
        return (ColorStateList) this.W0.getValue();
    }

    private final String getLiveText() {
        return (String) this.c1.getValue();
    }

    private final Drawable getScheduledBg() {
        return (Drawable) this.Y0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ColorStateList getScheduledColor() {
        return (ColorStateList) this.V0.getValue();
    }

    private final String getScheduledText() {
        return (String) this.b1.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void f(ond0 ond0Var) {
        boolean zEquals = ond0Var.equals(mnd0.a);
        ComposeView composeView = this.U0;
        AppCompatTextView appCompatTextView = this.T0;
        if (zEquals) {
            composeView.setVisibility(8);
            appCompatTextView.setText(getEndedText());
            appCompatTextView.setTextColor(xfo1.r(appCompatTextView, 2130969492));
            setBackground(getEndedBg());
            setContentDescription(getContext().getResources().getString(2131955493));
            return;
        }
        if (!(ond0Var instanceof nnd0)) {
            eg.o();
            return;
        }
        composeView.setVisibility(8);
        appCompatTextView.setText(getLiveText());
        appCompatTextView.setTextColor(xfo1.r(appCompatTextView, 2130969877));
        setEnabled(((nnd0) ond0Var).a);
        setBackground(getLiveBg());
        setContentDescription(getContext().getResources().getString(2131957508));
    }

    public LiveEventBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LiveEventBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LiveEventBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
