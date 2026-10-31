package com.spotify.marquee.marquee.ui;

import android.content.Context;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8k1;
import p.i15;
import p.v7h;
import p.w74;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/marquee/marquee/ui/OverlayBackgroundView;", "Landroid/widget/FrameLayout;", "Lp/v7h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "radius", "Lp/rih1;", "setRadius", "(F)V", "src_main_java_com_spotify_marquee_marquee-marquee"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class OverlayBackgroundView extends FrameLayout implements v7h {
    public final GradientDrawable a;

    public OverlayBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.a = gradientDrawable;
        gradientDrawable.setColor(context.getColor(2131102368));
        WeakHashMap weakHashMap = b8k1.a;
        setBackground(gradientDrawable);
    }

    public final void a(int i, boolean z) {
        GradientDrawable gradientDrawable = this.a;
        if (!z) {
            gradientDrawable.setColor(i);
        } else if (Build.VERSION.SDK_INT < 29) {
            gradientDrawable.setColorFilter(i, PorterDuff.Mode.DST_OVER);
        } else {
            i15.l();
            gradientDrawable.setColorFilter(new BlendModeColorFilter(i, w74.g()));
        }
    }

    public final void setRadius(float radius) {
        this.a.setCornerRadius(radius);
    }

    public OverlayBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OverlayBackgroundView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OverlayBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
