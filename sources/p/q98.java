package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q98 implements fny {
    public final bx21 a;
    public final hv4 b;
    public final yqg c;

    public q98(bx21 bx21Var, hv4 hv4Var, yqg yqgVar) {
        this.a = bx21Var;
        this.b = hv4Var;
        this.c = yqgVar;
    }

    @Override // p.fny
    public final hx21 a(PlayerState playerState) {
        j380 j380VarMetadata;
        String str;
        elm elmVarN;
        boolean zA = this.b.a();
        bx21 bx21Var = this.a;
        if (!zA) {
            String strW = poo1.w(playerState);
            if (strW.length() == 0) {
                strW = poo1.A(playerState);
            }
            return new hx21(bx21Var, new ugc1(strW), poo1.z(playerState), (ynb) null, 120);
        }
        String strW2 = poo1.w(playerState);
        if (strW2.length() == 0) {
            strW2 = poo1.A(playerState);
        }
        ugc1 ugc1Var = new ugc1(strW2);
        String strZ = poo1.z(playerState);
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        ynb ynbVar = null;
        if (contextTrack != null && (j380VarMetadata = contextTrack.metadata()) != null && (str = (String) j380VarMetadata.get("previous_accumulative_ms")) != null && nhc1.d0(10, str) != null && (elmVarN = o4p1.n(this.c.b(), playerState)) != null) {
            ynbVar = new ynb(elmVarN.b(), elmVarN.a());
        }
        return new hx21(bx21Var, ugc1Var, strZ, ynbVar, 96);
    }

    @Override // p.fny
    public final mr20 b(PlayerState playerState) {
        return h4p1.l(new us0(this, playerState, (lnm) null, (byte) 3));
    }
}
