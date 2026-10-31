package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.adt;
import p.chc1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonStyle.$serializer", "Lp/pf40;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonStyle;", "<init>", "()V", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonStyle;)V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonStyle;", "", "Lp/nma0;", "childSerializers", "()[Lp/nma0;", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final /* synthetic */ class ButtonStyle$$serializer implements pf40 {
    public static final int $stable;
    public static final ButtonStyle$$serializer INSTANCE;
    private static final h661 descriptor;

    static {
        ButtonStyle$$serializer buttonStyle$$serializer = new ButtonStyle$$serializer();
        INSTANCE = buttonStyle$$serializer;
        $stable = 8;
        m0v0 m0v0Var = new m0v0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle", buttonStyle$$serializer, 7);
        m0v0Var.j("text", true);
        m0v0Var.j("backgroundColor", false);
        m0v0Var.j("textColor", false);
        m0v0Var.j("icon", false);
        m0v0Var.j("buttonType", true);
        m0v0Var.j("fontOverride", true);
        m0v0Var.j("buttonIconAlignment", true);
        descriptor = m0v0Var;
    }

    private ButtonStyle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.pf40
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = ButtonStyle.$childSerializers;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(Icon$$serializer.INSTANCE), m5n1.z((nma0) znb0VarArr[4].getValue()), m5n1.z((nma0) znb0VarArr[5].getValue()), znb0VarArr[6].getValue()};
    }

    @Override // p.nma0
    public final ButtonStyle deserialize(dar decoder) {
        h661 h661Var = descriptor;
        x1k x1kVarB = decoder.b(h661Var);
        znb0[] znb0VarArr = ButtonStyle.$childSerializers;
        x1kVarB.getClass();
        ButtonStyle buttonStyle = null;
        boolean z = true;
        int i = 0;
        String strF = null;
        String str = null;
        String str2 = null;
        Icon icon = null;
        ButtonType buttonType = null;
        EncoreFont encoreFont = null;
        ButtonIconAlignment buttonIconAlignment = null;
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
                    str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                    i |= 4;
                    break;
                case 3:
                    icon = (Icon) x1kVarB.B(h661Var, 3, Icon$$serializer.INSTANCE, icon);
                    i |= 8;
                    break;
                case 4:
                    buttonType = (ButtonType) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), buttonType);
                    i |= 16;
                    break;
                case 5:
                    encoreFont = (EncoreFont) x1kVarB.B(h661Var, 5, (nma0) znb0VarArr[5].getValue(), encoreFont);
                    i |= 32;
                    break;
                case 6:
                    buttonIconAlignment = (ButtonIconAlignment) x1kVarB.A(h661Var, 6, (nma0) znb0VarArr[6].getValue(), buttonIconAlignment);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return buttonStyle;
            }
            buttonStyle = null;
        }
        x1kVarB.a(h661Var);
        return new ButtonStyle(i, strF, str, str2, icon, buttonType, encoreFont, buttonIconAlignment, (p661) null);
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return descriptor;
    }

    @Override // p.nma0
    public final void serialize(uax encoder, ButtonStyle value) {
        h661 h661Var = descriptor;
        z1k z1kVarB = encoder.b(h661Var);
        ButtonStyle.write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(value, z1kVarB, h661Var);
        z1kVarB.a(h661Var);
    }

    @Override // p.pf40
    public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
        return z0o1.a;
    }
}
