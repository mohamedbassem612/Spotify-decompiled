package com.spotify.mainlayout.ui.view.containers;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.ce0;
import p.coz0;
import p.een0;
import p.mma0;
import p.sgp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/spotify/mainlayout/ui/view/containers/MainLayoutConstrainedContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "<set-?>", "b", "Ljava/lang/Object;", "getPercentageWidth", "()F", "setPercentageWidth", "(F)V", "percentageWidth", "src_main_java_com_spotify_mainlayout_ui_view-view"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class MainLayoutConstrainedContainerView extends FrameLayout {
    public static final /* synthetic */ mma0[] c = {new een0(MainLayoutConstrainedContainerView.class, "percentageWidth", "getPercentageWidth()F", 0)};
    public final int a;
    public final ce0 b;

    public MainLayoutConstrainedContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ce0(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, coz0.b, 0, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.a);
        setPercentageWidth(typedArrayObtainStyledAttributes.getFloat(1, getPercentageWidth()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float getPercentageWidth() {
        mma0 mma0Var = c[0];
        return ((Number) ((sgp0) this.b).a).floatValue();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int percentageWidth = (int) (getPercentageWidth() * size);
        int i3 = this.a;
        if (percentageWidth < i3) {
            percentageWidth = i3;
        }
        if (percentageWidth <= size) {
            size = percentageWidth;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }

    public final void setPercentageWidth(float f) {
        this.b.c(c[0], this, Float.valueOf(f));
    }
}
