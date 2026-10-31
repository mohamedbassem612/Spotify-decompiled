package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mwn implements kwn, hs80 {
    public final xrc0 a;
    public final String b;
    public final idd1 c;
    public final llm d;
    public final bpb1 e;
    public String f;
    public List g;

    public mwn(pp11 pp11Var, iac0 iac0Var, b7r0 b7r0Var, q8n q8nVar, xrc0 xrc0Var, ynb0 ynb0Var) {
        String str;
        this.a = xrc0Var;
        y6r0 y6r0Var = b7r0Var.get();
        this.b = (y6r0Var == null || (str = y6r0Var.a) == null) ? "" : str;
        this.c = new idd1(new ssm(pp11Var, iac0Var, ynb0Var, (byte) 7));
        this.d = cy30.t(q8nVar);
        this.e = gio1.b(new gwn(127, (String) null, (String) null));
        this.g = z6x.a;
    }

    public final mr20 a() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object b(String str, String str2, l24 l24Var, lnm lnmVar) {
        lwn lwnVar;
        Object objB;
        if (lnmVar instanceof lwn) {
            lwnVar = (lwn) lnmVar;
            int i = lwnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwnVar.c = i - Integer.MIN_VALUE;
            } else {
                lwnVar = new lwn(this, (onm) lnmVar);
            }
        } else {
            lwnVar = new lwn(this, (onm) lnmVar);
        }
        lwn lwnVar2 = lwnVar;
        Object obj = lwnVar2.a;
        int i2 = lwnVar2.c;
        boolean z = false;
        if (i2 == 0) {
            hm5.M(obj);
            bpb1 bpb1Var = this.e;
            boolean z2 = bpb1Var.getValue() instanceof hwn;
            String str3 = this.b;
            d9n d9nVar = d9n.a;
            if (z2 && u890.j(((hwn) bpb1Var.getValue()).i(), str)) {
                op11 op11Var = (bq11) this.c.getValue();
                lwnVar2.c = 1;
                Object objH = op11Var.h(str2, str3, lwnVar2);
                return objH == d9nVar ? d9nVar : objH;
            }
            String str4 = this.f;
            if (str4 != null) {
                trc0 trc0Var = new trc0(null, null, Collections.singleton(drc0.a), false, null, hqz0.a, null, 0, this.g, 219);
                coz cozVarR = EsLoggingParams.LoggingParams.r();
                cozVarR.q(str3);
                cozVarR.n(str2);
                EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
                zpz zpzVarY = EsPlayOrigin$PlayOrigin.y();
                zpzVarY.s("home");
                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) zpzVarY.build();
                lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
                wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
                wrzVarP.t(str);
                lqzVarS.C(wrzVarP.build());
                lqzVarS.q();
                imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
                ppz ppzVarN = EsOptional.OptionalBoolean.n();
                ppzVarN.n(false);
                imzVarO.t(ppzVarN.build());
                ppz ppzVarN2 = EsOptional.OptionalBoolean.n();
                ppzVarN2.n(false);
                imzVarO.r(ppzVarN2.build());
                ppz ppzVarN3 = EsOptional.OptionalBoolean.n();
                ppzVarN3.n(false);
                imzVarO.s(ppzVarN3.build());
                lqzVarS.x(imzVarO.build());
                lqzVarS.E(false);
                EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsBuild = lqzVarS.build();
                lwnVar2.c = 2;
                objB = xrc0.b(this.a, str4, trc0Var, preparePlayOptionsBuild, esPlayOrigin$PlayOrigin, null, null, loggingParamsBuild, null, lwnVar2, 176);
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                z = false;
                Logger.d("Could not initiate list playback, no list uri provided", new Object[0]);
            }
            return yah0.m(z);
        }
        if (i2 == 1) {
            hm5.M(obj);
            return obj;
        }
        if (i2 != 2) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        objB = obj;
        boolean z3 = ((py21) objB).c() != null ? true : z;
        return yah0.m(z3);
    }

    public final Object c(String str, String str2, lnm lnmVar) {
        return ((bq11) this.c.getValue()).e(str2, this.b, (onm) lnmVar);
    }

    @Override // p.hs80
    public final void dispose() {
        op71.r(this.d.a);
    }

    @Override // p.hs80
    public final void start() {
        llm llmVar = this.d;
        op71.r(llmVar.a);
        c921.y(llmVar, (o8n) null, 0, new awe(this, (lnm) null, (byte) 28), 3);
    }
}
