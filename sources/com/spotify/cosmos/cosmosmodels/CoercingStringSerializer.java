package com.spotify.cosmos.cosmosmodels;

import kotlin.Metadata;
import p.bga0;
import p.dar;
import p.ega0;
import p.fga0;
import p.h661;
import p.knw0;
import p.nma0;
import p.omo1;
import p.rga0;
import p.uax;
import p.uh61;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/cosmos/cosmosmodels/CoercingStringSerializer;", "Lp/nma0;", "", "<init>", "()V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Ljava/lang/String;", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Ljava/lang/String;)V", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class CoercingStringSerializer implements nma0 {
    public static final CoercingStringSerializer INSTANCE = new CoercingStringSerializer();
    private static final h661 descriptor = omo1.c("CoercingString", knw0.o);

    private CoercingStringSerializer() {
    }

    public String deserialize(dar decoder) {
        ega0 ega0VarM = ((bga0) decoder).m();
        if (!(ega0VarM instanceof rga0)) {
            return PlayerModelSerializersKt.access$coerceString(fga0.m(ega0VarM), "value");
        }
        uh61.j("Expected a string");
        return null;
    }

    public h661 getDescriptor() {
        return descriptor;
    }

    public void serialize(uax encoder, String value) {
        encoder.h0(value);
    }
}
