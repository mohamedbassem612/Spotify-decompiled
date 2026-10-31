package p;

import com.spotify.showpage.memberbadgepreferenceimpl.proto.SignalData;
import com.spotify.showpage.memberbadgepreferenceimpl.proto.ToggleBadgePayload;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tji0 {
    public final xrc0 a;
    public final iyc0 b;
    public final u9c0 c;

    public tji0(xrc0 xrc0Var, iyc0 iyc0Var, u9c0 u9c0Var) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = u9c0Var;
    }

    public final mr20 a(String str) {
        return rqt0.u(new ipr(mji0.a, new lt20(x4p1.p(new f8f0(this.a.p(new rxc0(str)), (byte) 23), 3L, new nw5(2, (lnm) null, (byte) 14)), new w1e0(3, (lnm) null, (byte) 10), (byte) 0), new vv70(3, (lnm) null, (byte) 22), (byte) 16));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar, boolean z) {
        sji0 sji0Var;
        if (onmVar instanceof sji0) {
            sji0Var = (sji0) onmVar;
            int i = sji0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sji0Var.c = i - Integer.MIN_VALUE;
            } else {
                sji0Var = new sji0(this, onmVar);
            }
        } else {
            sji0Var = new sji0(this, onmVar);
        }
        Object objQ = sji0Var.a;
        int i2 = sji0Var.c;
        if (i2 == 0) {
            hm5.M(objQ);
            ol81 ol81VarN = SignalData.n();
            ol81VarN.n();
            phc byteString = ((SignalData) ol81VarN.build()).toByteString();
            bze1 bze1VarN = ToggleBadgePayload.n();
            bze1VarN.n(z);
            s2t s2tVarQ = fn31.q(this.c, (o8n) null, 0, new z290(this, str, byteString, ((ToggleBadgePayload) bze1VarN.build()).toByteString(), (lnm) null, (byte) 27), 3);
            sji0Var.c = 1;
            objQ = s2tVarQ.Q(sji0Var);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objQ);
        }
        return ((e331) objQ).a;
    }
}
