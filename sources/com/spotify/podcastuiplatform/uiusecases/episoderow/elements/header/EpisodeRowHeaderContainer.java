package com.spotify.podcastuiplatform.uiusecases.episoderow.elements.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.d7;
import p.dqj1;
import p.eqj1;
import p.maz;
import p.naz;
import p.oaz;
import p.sxr;
import p.txr;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/podcastuiplatform/uiusecases/episoderow/elements/header/EpisodeRowHeaderContainer;", "Landroid/widget/FrameLayout;", "Lp/naz;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/oaz;", "viewContext", "Lp/rih1;", "setViewContext", "(Lp/oaz;)V", "", "enabled", "setEnabled", "(Z)V", "src_main_java_com_spotify_podcastuiplatform_uiusecases-uiusecases"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class EpisodeRowHeaderContainer extends FrameLayout implements naz {
    public naz a;
    public oaz b;

    public /* synthetic */ EpisodeRowHeaderContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static void a(naz nazVar, oaz oazVar) {
        if (nazVar instanceof txr) {
            ((txr) nazVar).setViewContext(new sxr(oazVar.a));
        } else if (nazVar instanceof eqj1) {
            ((eqj1) nazVar).setViewContext(new dqj1(oazVar.a));
        }
    }

    public final void f(Object obj) {
        maz mazVar = (maz) obj;
        naz nazVar = this.a;
        if (nazVar != null) {
            nazVar.f(mazVar);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        d7 d7Var = new d7(this, (byte) 8);
        while (d7Var.hasNext()) {
            ((View) d7Var.next()).setEnabled(enabled);
        }
    }

    public final void setViewContext(oaz viewContext) {
        this.b = viewContext;
        naz nazVar = this.a;
        if (nazVar != null) {
            a(nazVar, viewContext);
        }
    }

    public EpisodeRowHeaderContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EpisodeRowHeaderContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public EpisodeRowHeaderContainer(Context context) {
        this(context, null, 0, 6, null);
    }
}
