package com.spotify.watchfeed.uiusecases.element.mediaitemsframelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.gph0;
import p.hoz0;
import p.ihc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/spotify/watchfeed/uiusecases/element/mediaitemsframelayout/MediaItemsFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "p/gph0", "src_main_java_com_spotify_watchfeed_uiusecases_element_mediaitemsframelayout-mediaitemsframelayout"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaItemsFrameLayout extends FrameLayout {
    public final float a;
    public final float b;
    public final int c;

    public MediaItemsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 1.0f;
        this.b = 1.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hoz0.a);
            this.a = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
            this.b = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        gph0 gph0Var = new gph0(-1, -1);
        gph0Var.a = "";
        return gph0Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        gph0 gph0Var = new gph0(getContext(), attributeSet);
        gph0Var.a = "";
        return gph0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = (int) (size * this.a);
        int i4 = (int) (size2 * this.b);
        int childCount = getChildCount();
        int measuredWidth = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            String str = ((gph0) childAt.getLayoutParams()).a;
            if (ihc1.h0(str, ":", false)) {
                List listQ0 = ihc1.Q0(str, new String[]{":"}, 0, 6);
                f = Float.parseFloat((String) listQ0.get(0)) / Float.parseFloat((String) listQ0.get(1));
            } else {
                f = 1.0f;
            }
            int i7 = (int) (i4 * f);
            if (i7 > i3) {
                i7 = i3;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i7 / f), 1073741824));
            int measuredHeight = (this.c * i6) + childAt.getMeasuredHeight();
            if (measuredHeight > i5) {
                i5 = measuredHeight;
            }
            measuredWidth += childAt.getMeasuredWidth();
        }
        setMeasuredDimension(Math.min(measuredWidth, size), Math.min(i5, size2));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        gph0 gph0Var = new gph0(layoutParams);
        gph0Var.a = "";
        return gph0Var;
    }

    public MediaItemsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MediaItemsFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ MediaItemsFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
