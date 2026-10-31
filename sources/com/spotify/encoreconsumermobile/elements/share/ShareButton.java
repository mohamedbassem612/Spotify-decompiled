package com.spotify.encoreconsumermobile.elements.share;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.azo1;
import p.bnz0;
import p.iu30;
import p.j4b1;
import p.tlv;
import p.zl51;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/share/ShareButton;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_share-share"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ShareButton extends StateListAnimatorImageButton implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public ShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j4b1 j4b1Var = j4b1.Y5;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165724);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bnz0.a, i, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        typedArrayObtainStyledAttributes.recycle();
        setImageDrawable(azo1.r(context, j4b1Var, 2131101341, dimensionPixelSize2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Object obj) {
        setEnabled(true);
        setFocusable(true);
        setImportantForAccessibility(1);
        setContentDescription(getResources().getString(2131962270));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new zl51(iu30Var, (byte) 3));
    }

    public ShareButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ShareButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ShareButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
