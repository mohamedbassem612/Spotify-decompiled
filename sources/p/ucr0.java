package p;

import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.PlayOrigin;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ucr0 extends xbk1 {
    public final ui01 b;

    public ucr0(ki01 ki01Var, String str, PlayOrigin playOrigin, iac0 iac0Var) {
        gsg gsgVarA = ack1.a(this);
        b0d0 b0d0Var = ki01Var.a;
        w7x w7xVar = w7x.a;
        huz huzVar = new huz(w7xVar, (byte) 10);
        huz huzVar2 = new huz(Collections.singletonList("recap-media"), (byte) 10);
        w9u0 w9u0VarA = ki01Var.d.a();
        huz huzVar3 = new huz(xzc0.c, (byte) 10);
        huz huzVar4 = new huz((Object) null, (byte) 10);
        huz huzVar5 = new huz(w7xVar, (byte) 10);
        EsPlayOrigin.PlayOrigin playOriginA = tot0.a(PlayOrigin.builder("recaps-button-element").featureVersion(playOrigin.featureVersion()).viewUri(playOrigin.viewUri()).externalReferrer(playOrigin.externalReferrer()).referrerIdentifier(playOrigin.referrerIdentifier()).deviceIdentifier(playOrigin.deviceIdentifier()).restrictionIdentifier(playOrigin.restrictionIdentifier()).build());
        b7x b7xVar = b7x.a;
        this.b = new ui01(str, ki01Var.b, ki01Var.c, b0d0Var.a(str, huzVar, huzVar2, iac0Var, w9u0VarA, huzVar3, huzVar4, huzVar5, playOriginA, new huz(b7xVar, (byte) 10), new huz(b7xVar, (byte) 10), new huz(qrc0.a, (byte) 10)), gsgVarA, ki01Var.f, ki01Var.e, ki01Var.g);
    }
}
