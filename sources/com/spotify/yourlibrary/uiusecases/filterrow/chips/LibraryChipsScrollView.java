package com.spotify.yourlibrary.uiusecases.filterrow.chips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.aiq0;
import p.an90;
import p.b8k1;
import p.bno1;
import p.u4c0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/spotify/yourlibrary/uiusecases/filterrow/chips/LibraryChipsScrollView;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/u4c0;", "value", "b", "Lp/u4c0;", "getOnScrollChangeListener", "()Lp/u4c0;", "setOnScrollChangeListener", "(Lp/u4c0;)V", "onScrollChangeListener", "src_main_java_com_spotify_yourlibrary_uiusecases_filterrow-filterrow"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LibraryChipsScrollView extends HorizontalScrollView {
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public u4c0 onScrollChangeListener;

    public LibraryChipsScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean zS = bno1.s(context);
        this.a = zS;
        WeakHashMap weakHashMap = b8k1.a;
        setLayoutDirection(zS ? 1 : 0);
        aiq0.a(this, new an90(this, (byte) 3));
    }

    public final void a(int i) {
        if (getMeasuredWidth() <= 0 || this.onScrollChangeListener == null || !this.a) {
            return;
        }
        computeHorizontalScrollRange();
        getMeasuredWidth();
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        if (isEnabled()) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final u4c0 getOnScrollChangeListener() {
        return this.onScrollChangeListener;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(getScrollX());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setOnScrollChangeListener(u4c0 u4c0Var) {
        this.onScrollChangeListener = u4c0Var;
        a(getScrollX());
    }

    public LibraryChipsScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LibraryChipsScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LibraryChipsScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
