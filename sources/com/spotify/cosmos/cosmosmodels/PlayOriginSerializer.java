package com.spotify.cosmos.cosmosmodels;

import com.spotify.player.model.PlayOrigin;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.SerializationException;
import p.dar;
import p.eg;
import p.f4i1;
import p.h661;
import p.m5n1;
import p.nma0;
import p.omo1;
import p.r36;
import p.uax;
import p.uh61;
import p.w7x;
import p.x1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/cosmos/cosmosmodels/PlayOriginSerializer;", "Lp/nma0;", "Lcom/spotify/player/model/PlayOrigin;", "<init>", "()V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/player/model/PlayOrigin;", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/player/model/PlayOrigin;)V", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_cosmos_cosmosmodels-cosmosmodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlayOriginSerializer implements nma0 {
    public static final PlayOriginSerializer INSTANCE = new PlayOriginSerializer();
    private static final h661 descriptor = omo1.i("com.spotify.player.model.PlayOrigin", new h661[0], PlayOriginSerializer$descriptor$1.INSTANCE);

    private PlayOriginSerializer() {
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public PlayOrigin m1274deserialize(dar decoder) {
        h661 descriptor2 = getDescriptor();
        x1k x1kVarB = decoder.b(descriptor2);
        Object objA = null;
        Object objA2 = null;
        Object objA3 = null;
        Object objA4 = null;
        Object objA5 = null;
        Object objA6 = null;
        Object objB = null;
        while (true) {
            PlayOriginSerializer playOriginSerializer = INSTANCE;
            int iP = x1kVarB.p(playOriginSerializer.getDescriptor());
            switch (iP) {
                case -1:
                    x1kVarB.a(descriptor2);
                    if (objA == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    PlayOrigin.Builder builder = PlayOrigin.builder((String) objA);
                    String str = (String) objA2;
                    if (str == null) {
                        str = "";
                    }
                    PlayOrigin.Builder builderFeatureVersion = builder.featureVersion(str);
                    String str2 = (String) objA3;
                    if (str2 == null) {
                        str2 = "";
                    }
                    PlayOrigin.Builder builderViewUri = builderFeatureVersion.viewUri(str2);
                    String str3 = (String) objA4;
                    if (str3 == null) {
                        str3 = "";
                    }
                    PlayOrigin.Builder builderExternalReferrer = builderViewUri.externalReferrer(str3);
                    String str4 = (String) objA5;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = (String) objA6;
                    PlayOrigin.Builder builderDeviceIdentifier = builderExternalReferrer.referrerIdentifier(str4).deviceIdentifier(str5 != null ? str5 : "");
                    w7x w7xVar = (Set) objB;
                    if (w7xVar == null) {
                        w7xVar = w7x.a;
                    }
                    return builderDeviceIdentifier.featureClasses(w7xVar).build();
                case 0:
                    objA = x1kVarB.A(playOriginSerializer.getDescriptor(), iP, NullableCoercingStringSerializer.INSTANCE, (Object) null);
                    break;
                case 1:
                    objA2 = x1kVarB.A(playOriginSerializer.getDescriptor(), iP, NullableCoercingStringSerializer.INSTANCE, (Object) null);
                    break;
                case 2:
                    objA3 = x1kVarB.A(playOriginSerializer.getDescriptor(), iP, NullableCoercingStringSerializer.INSTANCE, (Object) null);
                    break;
                case 3:
                    objA4 = x1kVarB.A(playOriginSerializer.getDescriptor(), iP, NullableCoercingStringSerializer.INSTANCE, (Object) null);
                    break;
                case 4:
                    objA5 = x1kVarB.A(playOriginSerializer.getDescriptor(), iP, NullableCoercingStringSerializer.INSTANCE, (Object) null);
                    break;
                case 5:
                    objA6 = x1kVarB.A(playOriginSerializer.getDescriptor(), iP, NullableCoercingStringSerializer.INSTANCE, (Object) null);
                    break;
                case 6:
                    objB = x1kVarB.B(playOriginSerializer.getDescriptor(), iP, m5n1.z(new r36(CoercingStringSerializer.INSTANCE, (byte) 1)), (Object) null);
                    break;
                default:
                    uh61.j(f4i1.c(iP, "Unexpected PlayOrigin field index "));
                    return null;
            }
        }
    }

    public h661 getDescriptor() {
        return descriptor;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public void serialize(uax encoder, PlayOrigin value) throws SerializationException {
        throw new SerializationException("Serializing PlayOrigin is not supported");
    }
}
