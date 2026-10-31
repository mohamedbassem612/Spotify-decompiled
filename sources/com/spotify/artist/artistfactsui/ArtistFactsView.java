package com.spotify.artist.artistfactsui;

import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.apo;
import p.b0k;
import p.c380;
import p.fg91;
import p.h311;
import p.hrr0;
import p.io6;
import p.mqo1;
import p.nyx;
import p.o40;
import p.o6;
import p.p5x0;
import p.so6;
import p.v8r;
import p.wux;
import p.x340;
import p.xu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R[\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u00192\u001e\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/spotify/artist/artistfactsui/ArtistFactsView;", "Lp/o6;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lp/io6;", "facts", "Lp/rih1;", "setFacts", "(Ljava/util/List;)V", "Lp/c380;", "<set-?>", "N0", "Lp/ven0;", "getCurrentFacts", "()Lp/c380;", "setCurrentFacts", "(Lp/c380;)V", "currentFacts", "Lkotlin/Function3;", "Lp/mo6;", "", "O0", "getOnLearnMoreClick", "()Lp/xu30;", "setOnLearnMoreClick", "(Lp/xu30;)V", "onLearnMoreClick", "", "P0", "getTitleOutsideCard", "()Z", "setTitleOutsideCard", "(Z)V", "titleOutsideCard", "src_main_java_com_spotify_artist_artistfactsui-artistfactsui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ArtistFactsView extends o6 {
    public final hrr0 N0;
    public final hrr0 O0;
    public final hrr0 P0;

    public ArtistFactsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setViewCompositionStrategy(p5x0.W0);
        this.N0 = v8r.q(fg91.b);
        this.O0 = v8r.q(o40.Q0);
        this.P0 = v8r.q(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c380 getCurrentFacts() {
        return (c380) this.N0.getValue();
    }

    private final void setCurrentFacts(c380 c380Var) {
        this.N0.setValue(c380Var);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1945799487);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(0, (wux) null, apo.r(-1946232690, new so6(this), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new so6(this, i);
        }
    }

    public final xu30 getOnLearnMoreClick() {
        return (xu30) this.O0.getValue();
    }

    public final boolean getTitleOutsideCard() {
        return ((Boolean) this.P0.getValue()).booleanValue();
    }

    public final void setFacts(List<io6> facts) {
        setCurrentFacts(mqo1.A(facts));
    }

    public final void setOnLearnMoreClick(xu30 xu30Var) {
        this.O0.setValue(xu30Var);
    }

    public final void setTitleOutsideCard(boolean z) {
        this.P0.setValue(Boolean.valueOf(z));
    }

    public ArtistFactsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ArtistFactsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ArtistFactsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
