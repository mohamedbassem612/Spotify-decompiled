package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage$$serializer;
import kotlin.Metadata;
import p.adt;
import p.dar;
import p.h661;
import p.m0v0;
import p.m5n1;
import p.n9v;
import p.nma0;
import p.p661;
import p.pf40;
import p.uax;
import p.x1k;
import p.z0o1;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@adt
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageResponse.$serializer", "Lp/pf40;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageResponse;", "<init>", "()V", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageResponse;)V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageResponse;", "", "Lp/nma0;", "childSerializers", "()[Lp/nma0;", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final /* synthetic */ class FetchMessageResponse$$serializer implements pf40 {
    public static final int $stable;
    public static final FetchMessageResponse$$serializer INSTANCE;
    private static final h661 descriptor;

    static {
        FetchMessageResponse$$serializer fetchMessageResponse$$serializer = new FetchMessageResponse$$serializer();
        INSTANCE = fetchMessageResponse$$serializer;
        $stable = 8;
        m0v0 m0v0Var = new m0v0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageResponse", fetchMessageResponse$$serializer, 1);
        m0v0Var.j("message", true);
        descriptor = m0v0Var;
    }

    private FetchMessageResponse$$serializer() {
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(InAppMessage$$serializer.INSTANCE)};
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final FetchMessageResponse m215deserialize(dar decoder) {
        h661 h661Var = descriptor;
        x1k x1kVarB = decoder.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        InAppMessage inAppMessage = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                inAppMessage = (InAppMessage) x1kVarB.B(h661Var, 0, InAppMessage$$serializer.INSTANCE, inAppMessage);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new FetchMessageResponse(i, inAppMessage, (p661) null);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax encoder, FetchMessageResponse value) {
        h661 h661Var = descriptor;
        z1k z1kVarB = encoder.b(h661Var);
        FetchMessageResponse.write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(value, z1kVarB, h661Var);
        z1kVarB.a(h661Var);
    }

    public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
        return z0o1.a;
    }
}
