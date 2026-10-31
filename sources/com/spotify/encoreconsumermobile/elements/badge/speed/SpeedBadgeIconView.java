package com.spotify.encoreconsumermobile.elements.badge.speed;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.eg;
import p.eqa1;
import p.fqa1;
import p.gqa1;
import p.l1d;
import p.zmz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/speed/SpeedBadgeIconView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_speed-speed"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SpeedBadgeIconView extends AppCompatImageView {
    public final int d;
    public int e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public SpeedBadgeIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zmz0.a, i, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, getResources().getDimensionPixelSize(2131165820));
        typedArrayObtainStyledAttributes.recycle();
        this.d = dimensionPixelSize;
        this.f = -1;
        setAdjustViewBounds(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(gqa1 gqa1Var) {
        int i;
        if (gqa1Var.equals(eqa1.a)) {
            setVisibility(8);
            return;
        }
        if (!(gqa1Var instanceof fqa1)) {
            eg.o();
            return;
        }
        int i2 = ((fqa1) gqa1Var).b;
        if (i2 != this.e) {
            int iC = l1d.C(i2);
            if (iC == 0) {
                i = 2131233389;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                i = 2131233388;
            }
            setImageResource(i);
            this.e = i2;
        }
        int i3 = (int) (this.d * getResources().getConfiguration().fontScale);
        if (i3 != this.f) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams.width = i3;
            layoutParams.height = i3;
            setLayoutParams(layoutParams);
            this.f = i3;
        }
        setVisibility(0);
    }

    public SpeedBadgeIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SpeedBadgeIconView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SpeedBadgeIconView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
