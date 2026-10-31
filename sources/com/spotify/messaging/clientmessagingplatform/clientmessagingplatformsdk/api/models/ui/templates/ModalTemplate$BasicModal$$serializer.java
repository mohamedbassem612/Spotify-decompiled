package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText$$serializer;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
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
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@adt
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate.BasicModal.$serializer", "Lp/pf40;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BasicModal;", "<init>", "()V", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BasicModal;)V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate$BasicModal;", "", "Lp/nma0;", "childSerializers", "()[Lp/nma0;", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final /* synthetic */ class ModalTemplate$BasicModal$$serializer implements pf40 {
    public static final int $stable;
    public static final ModalTemplate$BasicModal$$serializer INSTANCE;
    private static final h661 descriptor;

    static {
        ModalTemplate$BasicModal$$serializer modalTemplate$BasicModal$$serializer = new ModalTemplate$BasicModal$$serializer();
        INSTANCE = modalTemplate$BasicModal$$serializer;
        $stable = 8;
        m0v0 m0v0Var = new m0v0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate.BasicModal", modalTemplate$BasicModal$$serializer, 7);
        m0v0Var.j("backgroundColor", false);
        m0v0Var.j("headline", false);
        m0v0Var.j("body", false);
        m0v0Var.j("accessoryContent", false);
        m0v0Var.j("primaryButton", false);
        m0v0Var.j("accessoryContentSize", true);
        m0v0Var.j("contentAlignment", true);
        descriptor = m0v0Var;
    }

    private ModalTemplate$BasicModal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.pf40
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = ModalTemplate.BasicModal.$childSerializers;
        MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
        return new nma0[]{m5n1.z((nma0) znb0VarArr[0].getValue()), m5n1.z(messageText$$serializer), messageText$$serializer, m5n1.z((nma0) znb0VarArr[3].getValue()), m5n1.z(Button$$serializer.INSTANCE), znb0VarArr[5].getValue(), znb0VarArr[6].getValue()};
    }

    @Override // p.nma0
    public final ModalTemplate.BasicModal deserialize(dar decoder) {
        h661 h661Var = descriptor;
        x1k x1kVarB = decoder.b(h661Var);
        znb0[] znb0VarArr = ModalTemplate.BasicModal.$childSerializers;
        x1kVarB.getClass();
        ModalTemplate.BasicModal basicModal = null;
        boolean z = true;
        int i = 0;
        BackgroundColor backgroundColor = null;
        MessageText messageText = null;
        MessageText messageText2 = null;
        AccessoryContent accessoryContent = null;
        Button button = null;
        AccessoryContentSize accessoryContentSize = null;
        ContentAlignment contentAlignment = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    backgroundColor = (BackgroundColor) x1kVarB.B(h661Var, 0, (nma0) znb0VarArr[0].getValue(), backgroundColor);
                    i |= 1;
                    break;
                case 1:
                    messageText = (MessageText) x1kVarB.B(h661Var, 1, MessageText$$serializer.INSTANCE, messageText);
                    i |= 2;
                    break;
                case 2:
                    messageText2 = (MessageText) x1kVarB.A(h661Var, 2, MessageText$$serializer.INSTANCE, messageText2);
                    i |= 4;
                    break;
                case 3:
                    accessoryContent = (AccessoryContent) x1kVarB.B(h661Var, 3, (nma0) znb0VarArr[3].getValue(), accessoryContent);
                    i |= 8;
                    break;
                case 4:
                    button = (Button) x1kVarB.B(h661Var, 4, Button$$serializer.INSTANCE, button);
                    i |= 16;
                    break;
                case 5:
                    accessoryContentSize = (AccessoryContentSize) x1kVarB.A(h661Var, 5, (nma0) znb0VarArr[5].getValue(), accessoryContentSize);
                    i |= 32;
                    break;
                case 6:
                    contentAlignment = (ContentAlignment) x1kVarB.A(h661Var, 6, (nma0) znb0VarArr[6].getValue(), contentAlignment);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return basicModal;
            }
            basicModal = null;
        }
        x1kVarB.a(h661Var);
        return new ModalTemplate.BasicModal(i, backgroundColor, messageText, messageText2, accessoryContent, button, accessoryContentSize, contentAlignment, (p661) null);
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return descriptor;
    }

    @Override // p.nma0
    public final void serialize(uax encoder, ModalTemplate.BasicModal value) {
        h661 h661Var = descriptor;
        z1k z1kVarB = encoder.b(h661Var);
        ModalTemplate.BasicModal.write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(value, z1kVarB, h661Var);
        z1kVarB.a(h661Var);
    }

    @Override // p.pf40
    public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
        return z0o1.a;
    }
}
