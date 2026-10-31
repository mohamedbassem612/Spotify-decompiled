package com.spotify.recents.uiusecases.singleartworkwithbadge;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b0k;
import p.d781;
import p.euj;
import p.fkj0;
import p.g3h;
import p.gw70;
import p.h311;
import p.hy81;
import p.iu30;
import p.qim0;
import p.qm71;
import p.sap1;
import p.u890;
import p.x340;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/spotify/recents/uiusecases/singleartworkwithbadge/SingleArtworkWithBadgeView;", "Lp/euj;", "Lp/hy81;", "Lp/rih1;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/gw70;", "P0", "Lp/gw70;", "getImageLoader", "()Lp/gw70;", "setImageLoader", "(Lp/gw70;)V", "imageLoader", "Lp/g3h;", "Q0", "Lp/g3h;", "getCollectionDrawableProvider", "()Lp/g3h;", "setCollectionDrawableProvider", "(Lp/g3h;)V", "collectionDrawableProvider", "src_main_java_com_spotify_recents_uiusecases_singleartworkwithbadge-singleartworkwithbadge"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class SingleArtworkWithBadgeView extends euj {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public gw70 imageLoader;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public g3h collectionDrawableProvider;

    public /* synthetic */ SingleArtworkWithBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final g3h getCollectionDrawableProvider() {
        return this.collectionDrawableProvider;
    }

    public final gw70 getImageLoader() {
        gw70 gw70Var = this.imageLoader;
        if (gw70Var != null) {
            return gw70Var;
        }
        u890.C("imageLoader");
        throw null;
    }

    public final void setCollectionDrawableProvider(g3h g3hVar) {
        this.collectionDrawableProvider = g3hVar;
    }

    public final void setImageLoader(gw70 gw70Var) {
        this.imageLoader = gw70Var;
    }

    public final /* bridge */ /* synthetic */ void y(Object obj, iu30 iu30Var, x340 x340Var) {
        z((hy81) obj, iu30Var, x340Var, 0);
    }

    public final void z(hy81 hy81Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1176600830);
        int i2 = (x340Var.i(hy81Var) ? 4 : 2) | i | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 131) != 130)) {
            gw70 imageLoader = getImageLoader();
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new d781(this, (byte) 15);
                x340Var.s0(objT);
            }
            sap1.b(hy81Var, imageLoader, (iu30) objT, (qim0) null, x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71((byte) 9, i, this, hy81Var, iu30Var);
        }
    }

    public SingleArtworkWithBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SingleArtworkWithBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SingleArtworkWithBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
