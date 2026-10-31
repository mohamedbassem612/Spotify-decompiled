package com.spotify.encoreconsumermobile.elements.badge.enhanced;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.azo1;
import p.j4b1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/enhanced/EnhancedBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lp/rih1;", "setColor", "(I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_enhanced-enhanced"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EnhancedBadgeView extends AppCompatImageView {
    /* JADX WARN: Multi-variable type inference failed */
    public EnhancedBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAdjustViewBounds(true);
        setColor(2131101181);
        setContentDescription(context.getString(2131955516));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setColor(int color) {
        setImageDrawable(azo1.q(color, getContext(), j4b1.H2));
    }

    public EnhancedBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EnhancedBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EnhancedBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
