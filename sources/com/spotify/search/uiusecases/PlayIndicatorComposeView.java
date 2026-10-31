package com.spotify.search.uiusecases;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.apo;
import p.b0k;
import p.h311;
import p.hrr0;
import p.nyx;
import p.o6;
import p.p5x0;
import p.skt0;
import p.v8r;
import p.wux;
import p.x340;
import p.zkt0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/spotify/search/uiusecases/PlayIndicatorComposeView;", "Lp/o6;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/zkt0;", "<set-?>", "N0", "Lp/ven0;", "getState", "()Lp/zkt0;", "setState", "(Lp/zkt0;)V", "state", "src_main_java_com_spotify_search_uiusecases-uiusecases"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class PlayIndicatorComposeView extends o6 {
    public final hrr0 N0;

    public PlayIndicatorComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setViewCompositionStrategy(p5x0.W0);
        this.N0 = v8r.q(zkt0.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zkt0 getState() {
        return (zkt0) this.N0.getValue();
    }

    private final void setState(zkt0 zkt0Var) {
        this.N0.setValue(zkt0Var);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(249159076);
        int i2 = (x340Var.g(this) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (getState() != zkt0.c) {
            x340Var.i0(994605770);
            nyx.a(2, (wux) null, apo.r(1643931026, new skt0(this), x340Var), x340Var, 3078, 6);
            x340Var.r(false);
        } else {
            x340Var.i0(994686494);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new skt0(this, i);
        }
    }

    public final void z(zkt0 zkt0Var) {
        setState(zkt0Var);
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
