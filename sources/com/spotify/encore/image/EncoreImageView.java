package com.spotify.encore.image;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.apo;
import p.b0k;
import p.een;
import p.fc3;
import p.gw70;
import p.h311;
import p.hrr0;
import p.hzw;
import p.ihc1;
import p.isl;
import p.j6m;
import p.jsl;
import p.ksl;
import p.lgx;
import p.mif1;
import p.nyx;
import p.o6;
import p.rux;
import p.tl3;
import p.tux;
import p.u890;
import p.vu30;
import p.x340;
import p.xto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010 \u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010'\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010.\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R7\u00106\u001a\b\u0012\u0004\u0012\u0002000/2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002000/8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0014\u001a\u0004\b2\u00103\"\u0004\b4\u00105R7\u0010;\u001a\b\u0012\u0004\u0012\u0002070/2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002070/8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0014\u001a\u0004\b9\u00103\"\u0004\b:\u00105R(\u0010@\u001a\b\u0012\u0004\u0012\u0002070/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u00103\"\u0004\b?\u00105R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/spotify/encore/image/EncoreImageView;", "Lp/o6;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getContentDescription", "()Ljava/lang/CharSequence;", "contentDescription", "Lp/rih1;", "setContentDescription", "(Ljava/lang/CharSequence;)V", "Lp/ksl;", "<set-?>", "N0", "Lp/ven0;", "get_contentDescription", "()Lp/ksl;", "set_contentDescription", "(Lp/ksl;)V", "_contentDescription", "Lp/j6m;", "O0", "getContentScale", "()Lp/j6m;", "setContentScale", "(Lp/j6m;)V", "contentScale", "Lp/tl3;", "P0", "getAlignment", "()Lp/tl3;", "setAlignment", "(Lp/tl3;)V", "alignment", "Lp/tux;", "Q0", "getSource", "()Lp/tux;", "setSource", "(Lp/tux;)V", "source", "Lkotlin/Function0;", "Lp/qim0;", "R0", "getModifierFactory", "()Lp/vu30;", "setModifierFactory", "(Lp/vu30;)V", "modifierFactory", "Lp/jmr0;", "S0", "getPlaceholderFactory", "setPlaceholderFactory", "placeholderFactory", "T0", "Lp/vu30;", "getErrorFactory", "setErrorFactory", "errorFactory", "Lp/gw70;", "U0", "Lp/gw70;", "getImageLoader", "()Lp/gw70;", "setImageLoader", "(Lp/gw70;)V", "imageLoader", "src_main_java_com_spotify_encore_image-image"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class EncoreImageView extends o6 {
    public final hrr0 N0;
    public final hrr0 O0;
    public final hrr0 P0;
    public final hrr0 Q0;
    public final hrr0 R0;
    public final hrr0 S0;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public vu30 errorFactory;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public gw70 imageLoader;

    public EncoreImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.N0 = xto.t(isl.a);
        this.O0 = xto.t(mif1.S0);
        this.P0 = xto.t(een.h);
        this.Q0 = xto.t(rux.a);
        this.R0 = xto.t(lgx.h);
        this.S0 = xto.t(lgx.i);
        this.errorFactory = getPlaceholderFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ksl get_contentDescription() {
        return (ksl) this.N0.getValue();
    }

    private final void set_contentDescription(ksl kslVar) {
        this.N0.setValue(kslVar);
    }

    @Override // p.o6
    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-374689853);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(2, null, apo.r(1666658448, new fc3((Object) this, (byte) 7), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hzw(this, i);
        }
    }

    public final tl3 getAlignment() {
        return (tl3) this.P0.getValue();
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        ksl kslVar = get_contentDescription();
        jsl jslVar = kslVar instanceof jsl ? (jsl) kslVar : null;
        String str = jslVar != null ? jslVar.a : null;
        return str == null ? "" : str;
    }

    public final j6m getContentScale() {
        return (j6m) this.O0.getValue();
    }

    public final vu30 getErrorFactory() {
        return this.errorFactory;
    }

    public final gw70 getImageLoader() {
        gw70 gw70Var = this.imageLoader;
        if (gw70Var != null) {
            return gw70Var;
        }
        u890.C("imageLoader");
        throw null;
    }

    public final vu30 getModifierFactory() {
        return (vu30) this.R0.getValue();
    }

    public final vu30 getPlaceholderFactory() {
        return (vu30) this.S0.getValue();
    }

    public final tux getSource() {
        return (tux) this.Q0.getValue();
    }

    public final void setAlignment(tl3 tl3Var) {
        this.P0.setValue(tl3Var);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence contentDescription) {
        set_contentDescription((contentDescription == null || ihc1.y0(contentDescription)) ? isl.a : new jsl(contentDescription.toString()));
    }

    public final void setContentScale(j6m j6mVar) {
        this.O0.setValue(j6mVar);
    }

    public final void setErrorFactory(vu30 vu30Var) {
        this.errorFactory = vu30Var;
    }

    public final void setImageLoader(gw70 gw70Var) {
        this.imageLoader = gw70Var;
    }

    public final void setModifierFactory(vu30 vu30Var) {
        this.R0.setValue(vu30Var);
    }

    public final void setPlaceholderFactory(vu30 vu30Var) {
        this.S0.setValue(vu30Var);
    }

    public final void setSource(tux tuxVar) {
        this.Q0.setValue(tuxVar);
    }

    public EncoreImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EncoreImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EncoreImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
