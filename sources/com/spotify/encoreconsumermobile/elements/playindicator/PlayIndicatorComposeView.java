package com.spotify.encoreconsumermobile.elements.playindicator;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.apo;
import p.b0k;
import p.eg;
import p.h311;
import p.hrr0;
import p.nyx;
import p.o6;
import p.p5x0;
import p.tkt0;
import p.x340;
import p.xto;
import p.zkt0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/playindicator/PlayIndicatorComposeView;", "Lp/o6;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/zkt0;", "<set-?>", "N0", "Lp/ven0;", "getState", "()Lp/zkt0;", "setState", "(Lp/zkt0;)V", "state", "", "value", "O0", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "src_main_java_com_spotify_encoreconsumermobile_elements_playindicator-playindicator"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class PlayIndicatorComposeView extends o6 {
    public final hrr0 N0;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public PlayIndicatorComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setViewCompositionStrategy(p5x0.W0);
        this.N0 = xto.t(zkt0.c);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zkt0 getState() {
        return (zkt0) this.N0.getValue();
    }

    private final void setState(zkt0 zkt0Var) {
        this.N0.setValue(zkt0Var);
    }

    @Override // p.o6
    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1314563624);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(0, null, apo.r(-367514373, new tkt0(this), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tkt0(this, i);
        }
    }

    @Override // p.o6
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void z(zkt0 zkt0Var) {
        int i;
        if (zkt0Var == zkt0.c) {
            setVisibility(8);
            setContentDescription(null);
            this.shouldCreateCompositionOnAttachedToWindow = false;
            l();
            return;
        }
        setState(zkt0Var);
        setVisibility(0);
        Resources resources = getContext().getResources();
        int iOrdinal = zkt0Var.ordinal();
        if (iOrdinal == 0) {
            i = 2131959810;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                } else {
                    eg.m("unreachable");
                    return;
                }
            }
            i = 2131959809;
        }
        setContentDescription(resources.getString(i));
        this.shouldCreateCompositionOnAttachedToWindow = true;
        if (isAttachedToWindow()) {
            k();
        }
    }

    public PlayIndicatorComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlayIndicatorComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PlayIndicatorComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
