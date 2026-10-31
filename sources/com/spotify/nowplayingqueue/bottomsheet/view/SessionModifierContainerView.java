package com.spotify.nowplayingqueue.bottomsheet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8k1;
import p.l7k1;
import p.u2o1;
import p.w661;
import p.wpw;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/spotify/nowplayingqueue/bottomsheet/view/SessionModifierContainerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lp/rih1;", "a", "Lkotlin/jvm/functions/Function0;", "getOnAnimationEnd", "()Lkotlin/jvm/functions/Function0;", "setOnAnimationEnd", "(Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "src_main_java_com_spotify_nowplayingqueue_bottomsheet-bottomsheet"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class SessionModifierContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Function0 onAnimationEnd;
    public final int b;
    public final int c;

    public SessionModifierContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onAnimationEnd = w661.g;
        this.b = getResources().getDimensionPixelSize(2131166977);
        this.c = getResources().getDimensionPixelSize(2131166978);
        setFocusable(false);
        setGravity(81);
        setOrientation(0);
        setShowDividers(0);
        WeakHashMap weakHashMap = b8k1.a;
        new l7k1().e(this, Boolean.TRUE);
    }

    public final void a(int i) {
        if (getChildCount() == 0) {
            return;
        }
        int paddingEnd = i - (getPaddingEnd() + getPaddingStart());
        if (paddingEnd < 0) {
            paddingEnd = 0;
        }
        int iP = yoi1.p(paddingEnd / getChildCount(), this.c, this.b);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = iP;
            childAt.setLayoutParams(layoutParams);
        }
    }

    public final void b(Integer num, List list) {
        if (getChildCount() != 0) {
            removeAllViews();
        }
        if (list.isEmpty()) {
            return;
        }
        int iIntValue = num != null ? num.intValue() - (getPaddingBottom() + getPaddingTop()) : -2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addView(u2o1.u((wpw) it.next(), this).w, new LinearLayout.LayoutParams(this.c, iIntValue));
        }
        a(getWidth());
    }

    public final Function0 getOnAnimationEnd() {
        return this.onAnimationEnd;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 0) {
            a(View.MeasureSpec.getSize(i));
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            a(i);
        }
    }

    public final void setOnAnimationEnd(Function0 function0) {
        this.onAnimationEnd = function0;
    }

    public SessionModifierContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SessionModifierContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SessionModifierContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
