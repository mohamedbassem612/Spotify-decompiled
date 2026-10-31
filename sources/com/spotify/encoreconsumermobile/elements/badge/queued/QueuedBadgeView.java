package com.spotify.encoreconsumermobile.elements.badge.queued;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.f0o1;
import p.qx21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/queued/QueuedBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_queued-queued"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QueuedBadgeView extends AppCompatImageView {
    /* JADX WARN: Multi-variable type inference failed */
    public QueuedBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAdjustViewBounds(true);
        setImageDrawable(f0o1.j(context, 2131232474));
        Resources resources = getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = qx21.a;
        setColorFilter(resources.getColor(2131101181, theme));
        setContentDescription(context.getString(2131960807));
    }

    public QueuedBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public QueuedBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ QueuedBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
