package com.spotify.nowplayingqueue.bottomsheet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.lx70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/spotify/nowplayingqueue/bottomsheet/view/JamHeaderContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lp/rih1;", "a", "Lkotlin/jvm/functions/Function0;", "getOnAnimationEnd", "()Lkotlin/jvm/functions/Function0;", "setOnAnimationEnd", "(Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "src_main_java_com_spotify_nowplayingqueue_bottomsheet-bottomsheet"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class JamHeaderContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Function0 onAnimationEnd;

    public /* synthetic */ JamHeaderContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final Function0 getOnAnimationEnd() {
        return this.onAnimationEnd;
    }

    public final void setOnAnimationEnd(Function0 function0) {
        this.onAnimationEnd = function0;
    }

    public JamHeaderContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public JamHeaderContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onAnimationEnd = lx70.U0;
    }

    public JamHeaderContainerView(Context context) {
        this(context, null, 0, 6, null);
    }
}
