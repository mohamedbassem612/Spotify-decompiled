package com.spotify.cosmos.cosmosmodels;

import com.spotify.player.model.ContextTrack;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.SerializationException;
import p.dar;
import p.f4i1;
import p.h661;
import p.nma0;
import p.omo1;
import p.uax;
import p.uh61;
import p.x1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/cosmos/cosmosmodels/ContextTrackSerializer;", "Lp/nma0;", "Lcom/spotify/player/model/ContextTrack;", "<init>", "()V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/player/model/ContextTrack;", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/player/model/ContextTrack;)V", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContextTrackSerializer implements nma0 {
    public static final ContextTrackSerializer INSTANCE = new ContextTrackSerializer();
    private static final h661 descriptor = omo1.i("com.spotify.player.model.ContextTrack", new h661[0], ContextTrackSerializer$descriptor$1.INSTANCE);

    private ContextTrackSerializer() {
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public ContextTrack m1272deserialize(dar decoder) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h661 descriptor2 = getDescriptor();
        x1k x1kVarB = decoder.b(descriptor2);
        Object objA = "";
        Object objA2 = "";
        Object objA3 = objA2;
        while (true) {
            ContextTrackSerializer contextTrackSerializer = INSTANCE;
            int iP = x1kVarB.p(contextTrackSerializer.getDescriptor());
            switch (iP) {
                case -1:
                    x1kVarB.a(descriptor2);
                    return ContextTrack.builder((String) objA).uid((String) objA2).provider((String) objA3).metadata(linkedHashMap).build();
                case 0:
                    objA = x1kVarB.A(contextTrackSerializer.getDescriptor(), iP, CoercingStringSerializer.INSTANCE, (Object) null);
                    break;
                case 1:
                    objA2 = x1kVarB.A(contextTrackSerializer.getDescriptor(), iP, CoercingStringSerializer.INSTANCE, (Object) null);
                    break;
                case 2:
                    objA3 = x1kVarB.A(contextTrackSerializer.getDescriptor(), iP, CoercingStringSerializer.INSTANCE, (Object) null);
                    break;
                case 3:
                    linkedHashMap.put("album_uri", x1kVarB.A(contextTrackSerializer.getDescriptor(), iP, CoercingStringSerializer.INSTANCE, (Object) null));
                    break;
                case 4:
                    linkedHashMap.put("artist_uri", x1kVarB.A(contextTrackSerializer.getDescriptor(), iP, CoercingStringSerializer.INSTANCE, (Object) null));
                    break;
                case 5:
                    linkedHashMap.putAll((Map) x1kVarB.A(contextTrackSerializer.getDescriptor(), iP, PlayerModelSerializersKt.access$getStringMetadataSerializer$p(), (Object) null));
                    break;
                default:
                    uh61.j(f4i1.c(iP, "Unexpected ContextTrack field index "));
                    return null;
            }
        }
    }

    public h661 getDescriptor() {
        return descriptor;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public void serialize(uax encoder, ContextTrack value) throws SerializationException {
        throw new SerializationException("Serializing ContextTrack is not supported");
    }
}
