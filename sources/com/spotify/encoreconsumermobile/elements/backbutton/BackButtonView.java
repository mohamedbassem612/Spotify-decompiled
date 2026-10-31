package com.spotify.encoreconsumermobile.elements.backbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.g4b1;
import p.iu30;
import p.j4b1;
import p.tlv;
import p.v20;
import p.x74;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/backbutton/BackButtonView;", "", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_backbutton-backbutton"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BackButtonView extends StateListAnimatorImageButton implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public BackButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g4b1 g4b1Var = new g4b1(context, j4b1.b1, context.getResources().getDimension(2131165726));
        g4b1Var.c(x74.E(context, 2131101343));
        setImageDrawable(g4b1Var);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setContentDescription(context.getResources().getString(2131952699));
    }

    public final void f(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new v20(iu30Var, (byte) 9));
    }

    public BackButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BackButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BackButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
