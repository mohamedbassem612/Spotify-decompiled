package com.spotify.encoreconsumermobile.elements.heart;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bqn1;
import p.cdf0;
import p.iu30;
import p.pze0;
import p.tlv;
import p.v20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R \u0010\u001f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0014¨\u0006 "}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/heart/AnimatedHeartButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "Lp/rih1;", "setEnabled", "(Z)V", "Lp/cdf0;", "d", "Lp/cdf0;", "getActiveHeart", "()Lp/cdf0;", "getActiveHeart$annotations", "()V", "activeHeart", "e", "getHeart", "getHeart$annotations", "heart", "f", "getNudge", "getNudge$annotations", "nudge", "src_main_java_com_spotify_encoreconsumermobile_elements_heart-heart"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AnimatedHeartButton extends AppCompatImageButton implements tlv {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final cdf0 activeHeart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final cdf0 heart;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final cdf0 nudge;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedHeartButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.activeHeart = bqn1.A(context, 2131886154);
        this.heart = bqn1.A(context, 2131886155);
        this.nudge = bqn1.A(context, 2131886153);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public static /* synthetic */ void getActiveHeart$annotations() {
    }

    public static /* synthetic */ void getHeart$annotations() {
    }

    public static /* synthetic */ void getNudge$annotations() {
    }

    public final void f(Object obj) {
        pze0.m(obj);
        throw null;
    }

    public final cdf0 getActiveHeart() {
        return this.activeHeart;
    }

    public final cdf0 getHeart() {
        return this.heart;
    }

    public final cdf0 getNudge() {
        return this.nudge;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new v20((byte) 5, this, iu30Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean enabled) {
        super/*android.view.View*/.setEnabled(enabled);
        setAlpha(enabled ? 1.0f : 0.5f);
    }

    public AnimatedHeartButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AnimatedHeartButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AnimatedHeartButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
