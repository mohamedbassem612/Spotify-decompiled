package com.spotify.encoreconsumermobile.elements.contextmenu;

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
import p.v20;
import p.ydh;
import p.zbm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/contextmenu/ContextMenuButton;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_contextmenu-contextmenu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContextMenuButton extends StateListAnimatorImageButton implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j4b1 j4b1Var = j4b1.q4;
        int[] iArr = bnz0.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 2131101341);
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165724);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setImageDrawable(azo1.r(context, j4b1Var, resourceId, dimensionPixelSize2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(zbm zbmVar) {
        setEnabled(true);
        int i = zbmVar.a;
        if (i != 0) {
            setContentDescription(getResources().getString(ydh.c(i), zbmVar.b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new v20(iu30Var, (byte) 19));
    }

    public ContextMenuButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ContextMenuButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ContextMenuButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
