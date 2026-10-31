package com.spotify.watchfeed.uiusecases.element.explorerentrypoint;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b2u;
import p.b3k1;
import p.b8k1;
import p.bhn0;
import p.f47;
import p.h7l1;
import p.iu30;
import p.m5n1;
import p.pze0;
import p.sp00;
import p.tlv;
import p.v9w0;
import p.zdc;
import p.zl51;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/spotify/watchfeed/uiusecases/element/explorerentrypoint/WatchFeedEntityExplorerEntryPointButtonView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/spotify/betamax/player/VideoSurfaceView;", "getVideoSurfaceView", "()Lcom/spotify/betamax/player/VideoSurfaceView;", "Landroid/view/View;", "getThumbnailView", "()Landroid/view/View;", "Lp/h7l1;", "viewContext", "Lp/rih1;", "setViewContext", "(Lp/h7l1;)V", "src_main_java_com_spotify_watchfeed_uiusecases_element_explorerentrypoint-explorerentrypoint"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class WatchFeedEntityExplorerEntryPointButtonView extends FrameLayout implements tlv {
    public final sp00 a;
    public boolean b;
    public boolean c;
    public h7l1 d;

    public WatchFeedEntityExplorerEntryPointButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, 2131624628, this);
        int i2 = 2131428802;
        if (m5n1.t(this, 2131428802) != null) {
            i2 = 2131428803;
            if (m5n1.t(this, 2131428803) != null) {
                i2 = 2131428804;
                LottieAnimationView lottieAnimationViewT = m5n1.t(this, 2131428804);
                if (lottieAnimationViewT != null) {
                    i2 = 2131428805;
                    if (m5n1.t(this, 2131428805) != null) {
                        i2 = 2131428806;
                        View view = (ArtworkView) m5n1.t(this, 2131428806);
                        if (view != null) {
                            i2 = 2131428807;
                            View view2 = (VideoSurfaceView) m5n1.t(this, 2131428807);
                            if (view2 != null) {
                                this.a = new sp00(this, lottieAnimationViewT, view, view2, (byte) 3);
                                setClickable(true);
                                setFocusable(true);
                                view2.setScaleType(b3k1.c);
                                b8k1.p(this, new zdc((byte) 23));
                                v9w0 v9w0VarP = b2u.p(this);
                                Collections.addAll(v9w0VarP.d, view2, view);
                                v9w0VarP.a();
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void f(Object obj) {
        pze0.m(obj);
        Object obj2 = this.a.b;
        throw null;
    }

    public View getThumbnailView() {
        return (ArtworkView) this.a.d;
    }

    public VideoSurfaceView getVideoSurfaceView() {
        return (VideoSurfaceView) this.a.e;
    }

    public final void n(iu30 iu30Var) {
        ((WatchFeedEntityExplorerEntryPointButtonView) this.a.b).setOnClickListener(new zl51(iu30Var, (byte) 15));
    }

    public final void setViewContext(h7l1 viewContext) {
        if (this.b) {
            return;
        }
        this.d = viewContext;
        ((ArtworkView) this.a.d).setViewContext(new f47(viewContext.a));
        this.b = true;
    }

    public WatchFeedEntityExplorerEntryPointButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public WatchFeedEntityExplorerEntryPointButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ WatchFeedEntityExplorerEntryPointButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
