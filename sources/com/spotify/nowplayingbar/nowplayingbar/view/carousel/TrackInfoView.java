package com.spotify.nowplayingbar.nowplayingbar.view.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.queued.QueuedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.speed.SpeedBadgeIconView;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.dtw;
import p.idd1;
import p.imx0;
import p.iu30;
import p.o7h;
import p.p7h;
import p.smd0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u00020\f2\u001e\u0010\u0017\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u0013¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/spotify/nowplayingbar/nowplayingbar/view/carousel/TrackInfoView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "Lp/rih1;", "setMarqueeEnabled", "(Z)V", "Lp/imx0;", "controller", "setPromoIndicatorController", "(Lp/imx0;)V", "Lkotlin/Function0;", "Lp/dtw;", "Lp/smd0;", "", "factory", "setListenAlongBadgeHolderFactory", "(Lkotlin/jvm/functions/Function0;)V", "src_main_java_com_spotify_nowplayingbar_nowplayingbar-nowplayingbar"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class TrackInfoView extends LinearLayout {
    public boolean N0;
    public final TextView a;
    public final TextView b;
    public final EnhancedBadgeView c;
    public final QueuedBadgeView d;
    public final SpeedBadgeIconView e;
    public idd1 f;
    public final View g;
    public final ViewGroup h;
    public final View i;
    public imx0 t;

    public TrackInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, 2131625321, this);
        setOrientation(1);
        this.a = (TextView) findViewById(2131431483);
        this.b = (TextView) findViewById(2131431482);
        this.c = findViewById(2131428664);
        this.d = findViewById(2131430570);
        this.e = findViewById(2131431038);
        this.g = findViewById(2131431124);
        this.h = (ViewGroup) findViewById(2131431121);
        this.i = findViewById(2131430543);
    }

    public final void a(boolean z) {
        idd1 idd1Var = this.f;
        if (idd1Var != null) {
            if (z || idd1Var.isInitialized()) {
                ((dtw) idd1Var.getValue()).f(new smd0(z, z));
            }
        }
    }

    public final String b(String str, boolean z, boolean z2) {
        return o7h.y0(o7h.o0(p7h.M(new String[]{str, z ? getContext().getString(2131959228) : null, z2 ? getContext().getString(2131959227) : null})), ", ", (String) null, (String) null, (iu30) null, 62);
    }

    public final void c() {
        boolean z = false;
        boolean z2 = this.N0 && isAttachedToWindow();
        this.a.setSelected(z2);
        TextView textView = this.b;
        if (z2 && textView.getVisibility() == 0) {
            z = true;
        }
        textView.setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.a.setSelected(false);
        this.b.setSelected(false);
        imx0 imx0Var = this.t;
        if (imx0Var != null) {
            imx0Var.c();
        }
        super.onDetachedFromWindow();
    }

    public final void setListenAlongBadgeHolderFactory(Function0 factory) {
        this.f = new idd1(factory);
    }

    public final void setMarqueeEnabled(boolean enabled) {
        this.N0 = enabled;
        c();
    }

    public final void setPromoIndicatorController(imx0 controller) {
        this.t = controller;
    }

    public TrackInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TrackInfoView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TrackInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
