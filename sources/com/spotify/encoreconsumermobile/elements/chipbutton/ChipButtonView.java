package com.spotify.encoreconsumermobile.elements.chipbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.iu30;
import p.pze0;
import p.tlv;
import p.v20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/chipbutton/ChipButtonView;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_chipbutton-chipbutton"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChipButtonView extends StateListAnimatorButton implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public ChipButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setBackground(context.getDrawable(2131231216));
        int dimension = (int) getResources().getDimension(2131165496);
        int dimension2 = (int) getResources().getDimension(2131165495);
        setPadding(dimension2, dimension, dimension2, dimension);
        setGravity(17);
        setTextColor(context.getColor(2131104462));
    }

    public final void f(Object obj) {
        pze0.m(obj);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new v20(iu30Var, (byte) 14));
    }

    public ChipButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChipButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ChipButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
