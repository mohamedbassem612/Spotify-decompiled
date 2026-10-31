package com.spotify.watchfeed.uiusecases.element.videothumbnail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.icons.IconVideo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.f3k1;
import p.f47;
import p.g07;
import p.gw70;
import p.ilh1;
import p.iu30;
import p.m5n1;
import p.tlv;
import p.x07;
import p.xaj1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/watchfeed/uiusecases/element/videothumbnail/VideoThumbnailView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/gw70;", "imageLoader", "Lp/rih1;", "setImageLoader", "(Lp/gw70;)V", "src_main_java_com_spotify_watchfeed_uiusecases_element_videothumbnail-videothumbnail"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoThumbnailView extends FrameLayout implements tlv {
    public final ilh1 a;
    public boolean b;
    public f3k1 c;
    public iu30 d;

    public VideoThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LayoutInflater.from(context).inflate(2131626314, this);
        int i2 = 2131430352;
        IconVideo iconVideoT = m5n1.t(this, 2131430352);
        if (iconVideoT != null) {
            i2 = 2131431335;
            ArtworkView artworkViewT = m5n1.t(this, 2131431335);
            if (artworkViewT != null) {
                this.a = new ilh1(this, iconVideoT, artworkViewT);
                artworkViewT.n(new xaj1(this, (byte) 25));
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(f3k1 f3k1Var) {
        if (f3k1Var.equals(this.c) && this.b) {
            return;
        }
        this.c = f3k1Var;
        this.b = false;
        ilh1 ilh1Var = this.a;
        ((ArtworkView) ilh1Var.c).setVisibility(4);
        ((IconVideo) ilh1Var.b).setVisibility(0);
        ((ArtworkView) ilh1Var.c).h(new x07(new g07(f3k1Var.a), f3k1Var.b));
    }

    public final void n(iu30 iu30Var) {
        this.d = iu30Var;
    }

    public final void setImageLoader(gw70 imageLoader) {
        ((ArtworkView) this.a.c).setViewContext(new f47(imageLoader));
    }

    public VideoThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public VideoThumbnailView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ VideoThumbnailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
