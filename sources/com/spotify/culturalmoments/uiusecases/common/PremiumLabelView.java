package com.spotify.culturalmoments.uiusecases.common;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.apo;
import p.b0k;
import p.dtv0;
import p.h311;
import p.hrr0;
import p.nyx;
import p.o6;
import p.v8r;
import p.wux;
import p.x340;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/spotify/culturalmoments/uiusecases/common/PremiumLabelView;", "Lp/o6;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "<set-?>", "N0", "Lp/ven0;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "src_main_java_com_spotify_culturalmoments_uiusecases_common-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PremiumLabelView extends o6 {
    public final hrr0 N0;

    public /* synthetic */ PremiumLabelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1794796510);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(2, (wux) null, apo.r(-1903657803, new dtv0(this), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dtv0(this, i);
        }
    }

    public final String getText() {
        return (String) this.N0.getValue();
    }

    public final void setText(String str) {
        this.N0.setValue(str);
    }

    public PremiumLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PremiumLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.N0 = v8r.q("");
    }

    public PremiumLabelView(Context context) {
        this(context, null, 0, 6, null);
    }
}
