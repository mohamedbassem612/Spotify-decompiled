package com.spotify.encoreconsumermobile.elements.navigatebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bno1;
import p.g4b1;
import p.iu30;
import p.j4b1;
import p.jn90;
import p.td6;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/navigatebutton/NavigateButtonView;", "", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "circleColor", "Lp/rih1;", "setColors", "(I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_navigatebutton-navigatebutton"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NavigateButtonView extends StateListAnimatorImageButton implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public NavigateButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setContentDescription(context.getResources().getString(2131959088));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setColors(int circleColor) {
        g4b1 g4b1Var = new g4b1(getContext(), j4b1.A2, getContext().getResources().getDimension(2131165846));
        g4b1Var.b(circleColor);
        g4b1Var.f = bno1.s(getContext()) ? 90.0f : -90.0f;
        g4b1Var.invalidateSelf();
        setImageDrawable(g4b1Var);
    }

    public final void f(Object obj) {
        throw td6.k(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new jn90(iu30Var, (byte) 17));
    }

    public NavigateButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public NavigateButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ NavigateButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
