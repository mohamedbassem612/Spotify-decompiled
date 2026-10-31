package com.spotify.adsdisplay.uiusecases.videocontrolsoverlay;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.dlg1;
import p.egj1;
import p.hlv;
import p.iu30;
import p.lgs;
import p.m5n1;
import p.oik1;
import p.pze0;
import p.seg1;
import p.tlv;
import p.tw20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/adsdisplay/uiusecases/videocontrolsoverlay/VideoControlsOverlayView;", "", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lp/rih1;", "listener", "setVideoTouchListener", "(Lkotlin/jvm/functions/Function0;)V", "src_main_java_com_spotify_adsdisplay_uiusecases-uiusecases"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class VideoControlsOverlayView extends FrameLayout implements tlv {
    public static final /* synthetic */ int h = 0;
    public final Handler a;
    public boolean b;
    public boolean c;
    public iu30 d;
    public final seg1 e;
    public Function0 f;
    public final dlg1 g;

    public VideoControlsOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Handler(Looper.getMainLooper());
        this.b = true;
        this.d = egj1.S0;
        this.e = new seg1(this, (byte) 3);
        View.inflate(context, 2131626301, this);
        int i2 = 2131427455;
        StateListAnimatorImageButton stateListAnimatorImageButtonT = m5n1.t(this, 2131427455);
        if (stateListAnimatorImageButtonT != null) {
            i2 = 2131430264;
            View viewT = m5n1.t(this, 2131430264);
            if (viewT != null) {
                this.g = new dlg1(this, stateListAnimatorImageButtonT, viewT);
                int i3 = 0;
                while (true) {
                    if (!(i3 < getChildCount())) {
                        View.OnTouchListener lgsVar = new lgs(this, (byte) 7);
                        dlg1 dlg1Var = this.g;
                        ((VideoControlsOverlayView) dlg1Var.a).setOnTouchListener(lgsVar);
                        ((StateListAnimatorImageButton) dlg1Var.b).setOnTouchListener(lgsVar);
                        return;
                    }
                    int i4 = i3 + 1;
                    View childAt = getChildAt(i3);
                    if (childAt == null) {
                        tw20.p();
                        throw null;
                    }
                    childAt.setVisibility(8);
                    i3 = i4;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void a() {
        this.b = true;
        int i = 0;
        while (true) {
            if (!(i < getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                tw20.p();
                return;
            }
            if (childAt.getVisibility() != 8) {
                childAt.clearAnimation();
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(hlv.d);
                alphaAnimation.setDuration(400L);
                alphaAnimation.setAnimationListener(new oik1(childAt));
                childAt.startAnimation(alphaAnimation);
            }
            i = i2;
        }
    }

    public final void f(Object obj) {
        pze0.m(obj);
        throw null;
    }

    public final void n(iu30 iu30Var) {
        this.d = iu30Var;
    }

    public final void setVideoTouchListener(Function0 listener) {
        this.f = listener;
    }

    public VideoControlsOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public VideoControlsOverlayView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ VideoControlsOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
