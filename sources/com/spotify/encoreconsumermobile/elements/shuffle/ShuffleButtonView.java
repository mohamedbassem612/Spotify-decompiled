package com.spotify.encoreconsumermobile.elements.shuffle;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.azo1;
import p.b8k1;
import p.g4b1;
import p.iu30;
import p.j4b1;
import p.se81;
import p.tlv;
import p.zdc;
import p.zl51;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/shuffle/ShuffleButtonView;", "", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_shuffle-shuffle"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ShuffleButtonView extends StateListAnimatorImageButton implements tlv {
    public final LayerDrawable d;
    public final g4b1 e;

    /* JADX WARN: Multi-variable type inference failed */
    public ShuffleButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165723);
        j4b1 j4b1Var = j4b1.a6;
        this.d = azo1.j(context, azo1.r(context, j4b1Var, 2131101342, dimensionPixelSize));
        this.e = azo1.r(context, j4b1Var, 2131101341, dimensionPixelSize);
        b8k1.p(this, new zdc((byte) 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(se81 se81Var) {
        String string;
        boolean z = se81Var.a;
        setImageDrawable(z ? this.d : this.e);
        String str = se81Var.b;
        if (z) {
            string = str != null ? getContext().getString(2131962442, str) : getContext().getString(2131962441);
        } else {
            string = str != null ? getContext().getString(2131962444, str) : getContext().getString(2131962443);
        }
        setContentDescription(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new zl51(iu30Var, (byte) 4));
    }

    public ShuffleButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ShuffleButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ShuffleButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
