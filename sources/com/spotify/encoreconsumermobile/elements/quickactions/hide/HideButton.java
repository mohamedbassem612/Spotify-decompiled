package com.spotify.encoreconsumermobile.elements.quickactions.hide;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.azo1;
import p.g4b1;
import p.iu30;
import p.j4b1;
import p.t230;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/quickactions/hide/HideButton;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "f", "Z", "isHidden", "()Z", "setHidden", "(Z)V", "src_main_java_com_spotify_encoreconsumermobile_elements_quickactions-quickactions"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HideButton extends StateListAnimatorImageButton implements tlv {
    public final g4b1 d;
    public final g4b1 e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isHidden;

    public HideButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j4b1 j4b1Var = j4b1.s1;
        this.d = azo1.q(2131101343, context, j4b1Var);
        g4b1 g4b1VarQ = azo1.q(2131101341, context, j4b1Var);
        this.e = g4b1VarQ;
        setImageDrawable(g4b1VarQ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z) {
        this.isHidden = z;
        setImageDrawable(z ? this.d : this.e);
        setContentDescription(getResources().getString(this.isHidden ? 2131956548 : 2131956549));
    }

    public final /* bridge */ /* synthetic */ void f(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new t230(iu30Var, this, (byte) 6));
    }

    public final void setHidden(boolean z) {
        this.isHidden = z;
    }

    public HideButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public HideButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ HideButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
