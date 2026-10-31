package com.spotify.cosmos.cosmosmodels;

import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.neg;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/neg;", "Lp/rih1;", "invoke", "(Lp/neg;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class ContextTrackSerializer$descriptor$1 extends hab0 implements iu30 {
    public static final ContextTrackSerializer$descriptor$1 INSTANCE = new ContextTrackSerializer$descriptor$1();

    public ContextTrackSerializer$descriptor$1() {
        super(1);
    }

    public final void invoke(neg negVar) {
        CoercingStringSerializer coercingStringSerializer = CoercingStringSerializer.INSTANCE;
        neg.b(negVar, "uri", coercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "uid", coercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "provider", coercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "album_uri", coercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "artist_uri", coercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "metadata", PlayerModelSerializersKt.access$getStringMetadataSerializer$p().getDescriptor(), 4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((neg) obj);
        return rih1.a;
    }
}
