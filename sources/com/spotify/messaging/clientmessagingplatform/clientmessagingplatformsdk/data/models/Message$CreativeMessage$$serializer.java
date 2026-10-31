package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.adt;
import p.chc1;
import p.dar;
import p.h661;
import p.m0v0;
import p.n9v;
import p.nma0;
import p.o5f0;
import p.pf40;
import p.uax;
import p.x1k;
import p.z0o1;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@adt
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message.CreativeMessage.$serializer", "Lp/pf40;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;", "<init>", "()V", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;)V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;", "", "Lp/nma0;", "childSerializers", "()[Lp/nma0;", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final /* synthetic */ class Message$CreativeMessage$$serializer implements pf40 {
    public static final int $stable;
    public static final Message$CreativeMessage$$serializer INSTANCE;
    private static final h661 descriptor;

    static {
        Message$CreativeMessage$$serializer message$CreativeMessage$$serializer = new Message$CreativeMessage$$serializer();
        INSTANCE = message$CreativeMessage$$serializer;
        $stable = 8;
        m0v0 m0v0Var = new m0v0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message.CreativeMessage", message$CreativeMessage$$serializer, 9);
        m0v0Var.j("triggers", false);
        m0v0Var.j("id", false);
        m0v0Var.j("format", false);
        m0v0Var.j("source", false);
        m0v0Var.j("loggingData", false);
        m0v0Var.j("endTimestamp", false);
        m0v0Var.j("messageType", false);
        m0v0Var.j("cappingRules", false);
        m0v0Var.j("pacing", false);
        descriptor = m0v0Var;
    }

    private Message$CreativeMessage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.pf40
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = Message.CreativeMessage.$childSerializers;
        return new nma0[]{znb0VarArr[0].getValue(), chc1.a, znb0VarArr[2].getValue(), znb0VarArr[3].getValue(), LoggingData$$serializer.INSTANCE, o5f0.a, znb0VarArr[6].getValue(), znb0VarArr[7].getValue(), Pacing$$serializer.INSTANCE};
    }

    @Override // p.nma0
    public final Message.CreativeMessage deserialize(dar decoder) {
        h661 h661Var = descriptor;
        x1k x1kVarB = decoder.b(h661Var);
        znb0[] znb0VarArr = Message.CreativeMessage.$childSerializers;
        x1kVarB.getClass();
        long jI0 = 0;
        Pacing pacing = null;
        boolean z = true;
        MessageType messageType = null;
        Set set = null;
        int i = 0;
        List list = null;
        String strF = null;
        Format format = null;
        MessageSource messageSource = null;
        LoggingData loggingData = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    strF = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    format = (Format) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), format);
                    i |= 4;
                    break;
                case 3:
                    messageSource = (MessageSource) x1kVarB.A(h661Var, 3, (nma0) znb0VarArr[3].getValue(), messageSource);
                    i |= 8;
                    break;
                case 4:
                    loggingData = (LoggingData) x1kVarB.A(h661Var, 4, LoggingData$$serializer.INSTANCE, loggingData);
                    i |= 16;
                    break;
                case 5:
                    jI0 = x1kVarB.i0(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    messageType = (MessageType) x1kVarB.A(h661Var, 6, (nma0) znb0VarArr[6].getValue(), messageType);
                    i |= 64;
                    break;
                case 7:
                    set = (Set) x1kVarB.A(h661Var, 7, (nma0) znb0VarArr[7].getValue(), set);
                    i |= 128;
                    break;
                case 8:
                    pacing = (Pacing) x1kVarB.A(h661Var, 8, Pacing$$serializer.INSTANCE, pacing);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new Message.CreativeMessage(i, list, strF, format, messageSource, loggingData, jI0, messageType, set, pacing, null);
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return descriptor;
    }

    @Override // p.nma0
    public final void serialize(uax encoder, Message.CreativeMessage value) {
        h661 h661Var = descriptor;
        z1k z1kVarB = encoder.b(h661Var);
        Message.CreativeMessage.write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(value, z1kVarB, h661Var);
        z1kVarB.a(h661Var);
    }

    @Override // p.pf40
    public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
        return z0o1.a;
    }
}
