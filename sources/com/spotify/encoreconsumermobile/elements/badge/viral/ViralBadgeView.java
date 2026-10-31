package com.spotify.encoreconsumermobile.elements.badge.viral;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.azo1;
import p.b8k1;
import p.j4b1;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/viral/ViralBadgeView;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_viral-viral"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ViralBadgeView extends ConstraintLayout implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public ViralBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, 2131626331, this);
        ((ImageView) b8k1.n(this, 2131431642)).setImageDrawable(azo1.r(context, j4b1.f7, 2131101344, context.getResources().getDimensionPixelSize(2131165927)));
        setContentDescription(context.getString(2131963817));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Object obj) {
        setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }

    public ViralBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ViralBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ViralBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
