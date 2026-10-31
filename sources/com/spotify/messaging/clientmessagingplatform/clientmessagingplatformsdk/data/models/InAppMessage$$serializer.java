package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType;
import java.util.List;
import kotlin.Metadata;
import p.adt;
import p.chc1;
import p.dar;
import p.h661;
import p.m0v0;
import p.m5n1;
import p.n9v;
import p.nma0;
import p.o5f0;
import p.p661;
import p.pf40;
import p.uax;
import p.x1k;
import p.z0o1;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@adt
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage.$serializer", "Lp/pf40;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "<init>", "()V", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;)V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "", "Lp/nma0;", "childSerializers", "()[Lp/nma0;", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final /* synthetic */ class InAppMessage$$serializer implements pf40 {
    public static final int $stable;
    public static final InAppMessage$$serializer INSTANCE;
    private static final h661 descriptor;

    static {
        InAppMessage$$serializer inAppMessage$$serializer = new InAppMessage$$serializer();
        INSTANCE = inAppMessage$$serializer;
        $stable = 8;
        m0v0 m0v0Var = new m0v0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage", inAppMessage$$serializer, 7);
        m0v0Var.j("uuid", false);
        m0v0Var.j("messageId", false);
        m0v0Var.j("endTimestamp", true);
        m0v0Var.j("creative", false);
        m0v0Var.j("capping", true);
        m0v0Var.j("triggers", false);
        m0v0Var.j("messageType", false);
        descriptor = m0v0Var;
    }

    private InAppMessage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArrAccess$get$childSerializers$cp = InAppMessage.access$get$childSerializers$cp();
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{chc1.a, o5f0Var, m5n1.z(o5f0Var), znb0VarArrAccess$get$childSerializers$cp[3].getValue(), m5n1.z(Capping$$serializer.INSTANCE), znb0VarArrAccess$get$childSerializers$cp[5].getValue(), znb0VarArrAccess$get$childSerializers$cp[6].getValue()};
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final InAppMessage m214deserialize(dar decoder) {
        h661 h661Var = descriptor;
        x1k x1kVarB = decoder.b(h661Var);
        znb0[] znb0VarArrAccess$get$childSerializers$cp = InAppMessage.access$get$childSerializers$cp();
        x1kVarB.getClass();
        InAppMessage inAppMessage = null;
        MessageType messageType = null;
        String strF = null;
        Long l = null;
        MessageCreative messageCreative = null;
        Capping capping = null;
        long jI0 = 0;
        int i = 0;
        boolean z = true;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    jI0 = x1kVarB.i0(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    l = (Long) x1kVarB.B(h661Var, 2, o5f0.a, l);
                    i |= 4;
                    break;
                case 3:
                    messageCreative = (MessageCreative) x1kVarB.A(h661Var, 3, (nma0) znb0VarArrAccess$get$childSerializers$cp[3].getValue(), messageCreative);
                    i |= 8;
                    break;
                case 4:
                    capping = (Capping) x1kVarB.B(h661Var, 4, Capping$$serializer.INSTANCE, capping);
                    i |= 16;
                    break;
                case 5:
                    list = (List) x1kVarB.A(h661Var, 5, (nma0) znb0VarArrAccess$get$childSerializers$cp[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    messageType = (MessageType) x1kVarB.A(h661Var, 6, (nma0) znb0VarArrAccess$get$childSerializers$cp[6].getValue(), messageType);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return inAppMessage;
            }
            inAppMessage = null;
        }
        x1kVarB.a(h661Var);
        return new InAppMessage(i, strF, jI0, l, messageCreative, capping, list, messageType, (p661) null);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax encoder, InAppMessage value) {
        h661 h661Var = descriptor;
        z1k z1kVarB = encoder.b(h661Var);
        InAppMessage.write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(value, z1kVarB, h661Var);
        z1kVarB.a(h661Var);
    }

    public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
        return z0o1.a;
    }
}
