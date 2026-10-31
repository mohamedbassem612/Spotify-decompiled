package com.spotify.aiplaylist.promptcreation.presentation.tracklist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.ajw0;
import p.bhn0;
import p.cjw0;
import p.fgs0;
import p.h8j;
import p.hid0;
import p.iet0;
import p.iu30;
import p.m5n1;
import p.r0s0;
import p.yqg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/spotify/aiplaylist/promptcreation/presentation/tracklist/PlayIndicatorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lp/rih1;", "onItemClicked", "setOnClickListener", "(Lp/iu30;)V", "src_main_java_com_spotify_aiplaylist_promptcreation-promptcreation"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlayIndicatorView extends FrameLayout {
    public final r0s0 a;
    public yqg b;
    public iu30 c;

    public PlayIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = iet0.e1;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625400, (ViewGroup) this, false);
        addView(constraintLayoutInflate);
        int i2 = 2131427593;
        ArtworkView artworkViewT = m5n1.t(constraintLayoutInflate, 2131427593);
        if (artworkViewT != null) {
            i2 = 2131430403;
            ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131430403);
            if (composeViewT != null) {
                i2 = 2131430491;
                PreviewOverlayView previewOverlayViewT = m5n1.t(constraintLayoutInflate, 2131430491);
                if (previewOverlayViewT != null) {
                    this.a = new r0s0(constraintLayoutInflate, artworkViewT, composeViewT, previewOverlayViewT, (byte) 11);
                    previewOverlayViewT.y(new ajw0((cjw0) null));
                    composeViewT.setContent(h8j.b);
                    previewOverlayViewT.setOnClickListener(new hid0(this, (byte) 12));
                    previewOverlayViewT.n(new fgs0(this, (byte) 12));
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void setOnClickListener(iu30 onItemClicked) {
        this.c = onItemClicked;
    }

    public PlayIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlayIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PlayIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
