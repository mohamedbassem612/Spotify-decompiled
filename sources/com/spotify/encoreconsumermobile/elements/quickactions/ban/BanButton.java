package com.spotify.encoreconsumermobile.elements.quickactions.ban;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.azo1;
import p.cg1;
import p.fnz0;
import p.g4b1;
import p.iu30;
import p.j4b1;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/quickactions/ban/BanButton;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_quickactions-quickactions"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BanButton extends StateListAnimatorImageButton implements tlv {
    public final g4b1 d;
    public final g4b1 e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public BanButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165724);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fnz0.a, i, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, dimensionPixelSize);
        typedArrayObtainStyledAttributes.recycle();
        j4b1 j4b1Var = j4b1.o1;
        this.d = azo1.r(context, j4b1Var, 2131101343, dimensionPixelSize2);
        g4b1 g4b1VarR = azo1.r(context, j4b1Var, 2131101341, dimensionPixelSize2);
        this.e = g4b1VarR;
        setImageDrawable(g4b1VarR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z) {
        this.f = z;
        setImageDrawable(z ? this.d : this.e);
        setContentDescription(getResources().getString(this.f ? 2131952711 : 2131952712));
    }

    public final /* bridge */ /* synthetic */ void f(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new cg1(iu30Var, this, (byte) 11));
    }

    public BanButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BanButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BanButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
