package com.spotify.proactiveplatforms.npvwidget;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.fiv;
import p.idd1;
import p.kaa;
import p.p6r0;
import p.u6j0;
import p.ws40;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/proactiveplatforms/npvwidget/NpvWidgetProvider;", "Lp/kaa;", "<init>", "()V", "src_main_java_com_spotify_widgets_dynamicnpvwidget-dynamicnpvwidget"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class NpvWidgetProvider extends kaa {
    public fiv f;
    public final idd1 g;

    public NpvWidgetProvider() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new fiv(yon1.j4().c);
        this.g = new idd1(new u6j0(this, (byte) 9));
    }

    @Override // p.kaa
    public final ws40 b() {
        return (ws40) this.g.getValue();
    }
}
