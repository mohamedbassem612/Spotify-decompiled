package com.spotify.cosmos.cosmosmodels;

import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.neg;
import p.p36;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/neg;", "Lp/rih1;", "invoke", "(Lp/neg;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class PlayOriginSerializer$descriptor$1 extends hab0 implements iu30 {
    public static final PlayOriginSerializer$descriptor$1 INSTANCE = new PlayOriginSerializer$descriptor$1();

    public PlayOriginSerializer$descriptor$1() {
        super(1);
    }

    public final void invoke(neg negVar) {
        NullableCoercingStringSerializer nullableCoercingStringSerializer = NullableCoercingStringSerializer.INSTANCE;
        neg.b(negVar, "feature_identifier", nullableCoercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "feature_version", nullableCoercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "view_uri", nullableCoercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "external_referrer", nullableCoercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "referrer_identifier", nullableCoercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "device_identifier", nullableCoercingStringSerializer.getDescriptor(), 4);
        neg.b(negVar, "feature_classes", new p36(CoercingStringSerializer.INSTANCE.getDescriptor(), (byte) 2), 4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((neg) obj);
        return rih1.a;
    }
}
