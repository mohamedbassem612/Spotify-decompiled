package com.spotify.podcastplaybackspeed.uiusecases.wheelcontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.g611;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlElementContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WheelControlElementContainer extends LinearLayout {
    public WheelControlElementContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setMinimumWidth(context.getResources().getDimensionPixelSize(2131165556));
        setGravity(1);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            return;
        }
        g611 g611Var = (g611) layoutParams;
        int minimumWidth = (getMinimumWidth() - getMeasuredWidth()) / 2;
        g611Var.setMarginStart(minimumWidth);
        g611Var.setMarginEnd(minimumWidth);
        setLayoutParams(g611Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WheelControlElementContainer(Context context) {
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ WheelControlElementContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
