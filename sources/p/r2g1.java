package p;

import com.spotify.cosmos.cosmosmodels.ContextTrackSerializer;
import com.spotify.cosmos.cosmosmodels.PlayOriginSerializer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r2g1 implements nma0 {
    public static final r2g1 a = new r2g1();
    public static final j661 b = omo1.i("TrackWithPlayOrigin", new h661[0], uyf1.b1);

    public final Object deserialize(dar darVar) {
        j661 j661Var = b;
        x1k x1kVarB = darVar.b(j661Var);
        Object objBuild = null;
        Object objB = null;
        Object objA = null;
        Object objA2 = null;
        while (true) {
            int iP = x1kVarB.p(j661Var);
            if (iP == -1) {
                x1kVarB.a(j661Var);
                ContextTrack contextTrack = (ContextTrack) objBuild;
                if (contextTrack != null) {
                    String strProvider = contextTrack.provider();
                    LinkedHashMap linkedHashMap = new LinkedHashMap((Map) contextTrack.metadata());
                    linkedHashMap.put("provider", strProvider);
                    objBuild = contextTrack.toBuilder().metadata(linkedHashMap).build();
                }
                return new q2g1((ContextTrack) objBuild, (PlayOrigin) objB, (String) objA, (String) objA2);
            }
            if (iP == 0) {
                objB = x1kVarB.B(j661Var, iP, m5n1.z(PlayOriginSerializer.INSTANCE), (Object) null);
            } else if (iP == 1) {
                objA = x1kVarB.A(j661Var, iP, pma.a, (Object) null);
            } else if (iP == 2) {
                objA2 = x1kVarB.A(j661Var, iP, pma.a, (Object) null);
            } else {
                if (iP != 3) {
                    uh61.j(f4i1.c(iP, "Unexpected TrackWithPlayOrigin field index "));
                    return null;
                }
                objBuild = x1kVarB.B(j661Var, iP, m5n1.z(ContextTrackSerializer.INSTANCE), (Object) null);
            }
        }
    }

    public final h661 getDescriptor() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void serialize(uax uaxVar, Object obj) throws SerializationException {
        throw new SerializationException("Serializing TrackWithPlayOrigin is not supported");
    }
}
