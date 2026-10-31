package com.spotify.encoreconsumermobile.elements.badge.paid;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.n0e1;
import p.slr0;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/paid/PaidBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_paid-paid"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PaidBadgeView extends AppCompatImageView implements tlv {
    public /* synthetic */ PaidBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void f(slr0 slr0Var) {
        boolean z = slr0Var.a;
        int i = z ? 2131955878 : 2131959537;
        int i2 = z ? 2131955877 : 2131959536;
        setImageDrawable(new n0e1(getContext(), getContext().getString(i)));
        setContentDescription(getContext().getString(i2));
        setVisibility(0);
    }

    public PaidBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PaidBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PaidBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
