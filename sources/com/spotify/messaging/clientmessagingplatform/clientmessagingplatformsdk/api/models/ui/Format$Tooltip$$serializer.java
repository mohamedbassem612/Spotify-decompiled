package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipAnchorView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipArrowDirection;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.adt;
import p.dar;
import p.h661;
import p.m0v0;
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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@adt
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format.Tooltip.$serializer", "Lp/pf40;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Tooltip;", "<init>", "()V", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Tooltip;)V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Tooltip;", "", "Lp/nma0;", "childSerializers", "()[Lp/nma0;", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final /* synthetic */ class Format$Tooltip$$serializer implements pf40 {
    public static final int $stable;
    public static final Format$Tooltip$$serializer INSTANCE;
    private static final h661 descriptor;

    static {
        Format$Tooltip$$serializer format$Tooltip$$serializer = new Format$Tooltip$$serializer();
        INSTANCE = format$Tooltip$$serializer;
        $stable = 8;
        m0v0 m0v0Var = new m0v0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format.Tooltip", format$Tooltip$$serializer, 4);
        m0v0Var.j("template", true);
        m0v0Var.j("anchorView", false);
        m0v0Var.j("tooltipDirection", true);
        m0v0Var.j("durationMillis", true);
        descriptor = m0v0Var;
    }

    private Format$Tooltip$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.pf40
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = Format.Tooltip.$childSerializers;
        return new nma0[]{znb0VarArr[0].getValue(), znb0VarArr[1].getValue(), znb0VarArr[2].getValue(), o5f0.a};
    }

    @Override // p.nma0
    public final Format.Tooltip deserialize(dar decoder) {
        h661 h661Var = descriptor;
        x1k x1kVarB = decoder.b(h661Var);
        znb0[] znb0VarArr = Format.Tooltip.$childSerializers;
        x1kVarB.getClass();
        int i = 0;
        TooltipTemplate tooltipTemplate = null;
        TooltipAnchorView tooltipAnchorView = null;
        TooltipArrowDirection tooltipArrowDirection = null;
        long jI0 = 0;
        boolean z = true;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                tooltipTemplate = (TooltipTemplate) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), tooltipTemplate);
                i |= 1;
            } else if (iP == 1) {
                tooltipAnchorView = (TooltipAnchorView) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), tooltipAnchorView);
                i |= 2;
            } else if (iP == 2) {
                tooltipArrowDirection = (TooltipArrowDirection) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), tooltipArrowDirection);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                jI0 = x1kVarB.i0(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new Format.Tooltip(i, tooltipTemplate, tooltipAnchorView, tooltipArrowDirection, jI0, (p661) null);
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return descriptor;
    }

    @Override // p.nma0
    public final void serialize(uax encoder, Format.Tooltip value) {
        h661 h661Var = descriptor;
        z1k z1kVarB = encoder.b(h661Var);
        Format.Tooltip.write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(value, z1kVarB, h661Var);
        z1kVarB.a(h661Var);
    }

    @Override // p.pf40
    public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
        return z0o1.a;
    }
}
