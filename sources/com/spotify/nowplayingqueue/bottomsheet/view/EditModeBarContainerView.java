package com.spotify.nowplayingqueue.bottomsheet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8k1;
import p.l7k1;
import p.p7h;
import p.xzu;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/spotify/nowplayingqueue/bottomsheet/view/EditModeBarContainerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Landroid/view/View;", "buttons", "Lp/rih1;", "setEditModeBarButtons", "(Ljava/util/List;)V", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getOnAnimationEnd", "()Lkotlin/jvm/functions/Function0;", "setOnAnimationEnd", "(Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "src_main_java_com_spotify_nowplayingqueue_bottomsheet-bottomsheet"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class EditModeBarContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Function0 onAnimationEnd;

    public EditModeBarContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onAnimationEnd = xzu.N0;
        setFocusable(false);
        setGravity(8388627);
        setOrientation(0);
        WeakHashMap weakHashMap = b8k1.a;
        new l7k1().e(this, Boolean.TRUE);
    }

    public final Function0 getOnAnimationEnd() {
        return this.onAnimationEnd;
    }

    public final void setEditModeBarButtons(List<? extends View> buttons) {
        removeAllViews();
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167033);
        int i = 0;
        for (Object obj : buttons) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            View view = (View) obj;
            if (i > 0 && i < buttons.size()) {
                addView(new Space(getContext()), new LinearLayout.LayoutParams(dimensionPixelSize, 0));
            }
            addView(view, new LinearLayout.LayoutParams(-2, -2));
            i = i2;
        }
    }

    public final void setOnAnimationEnd(Function0 function0) {
        this.onAnimationEnd = function0;
    }

    public EditModeBarContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EditModeBarContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EditModeBarContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
