package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xqs {
    public static final idd1 e = new idd1(df.Q0);
    public final xrc0 a;
    public final wm70 b;
    public final Flowable c;
    public final q8n d;

    public xqs(xrc0 xrc0Var, wm70 wm70Var, Flowable flowable, q8n q8nVar) {
        this.a = xrc0Var;
        this.b = wm70Var;
        this.c = flowable;
        this.d = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        vqs vqsVar;
        ContextTrack contextTrack;
        if (onmVar instanceof vqs) {
            vqsVar = (vqs) onmVar;
            int i = vqsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vqsVar.e = i - Integer.MIN_VALUE;
            } else {
                vqsVar = new vqs(this, onmVar);
            }
        } else {
            vqsVar = new vqs(this, onmVar);
        }
        Object objK = vqsVar.c;
        int i2 = vqsVar.e;
        if (i2 == 0) {
            hm5.M(objK);
            Flowable flowable = this.c;
            ezc ezcVarG = yoi1.g(x0d.j(flowable, flowable).onErrorReturn(vrg.X0));
            vqsVar.a = str;
            vqsVar.b = str2;
            vqsVar.e = 1;
            objK = b5p1.k(ezcVarG, vqsVar);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = vqsVar.b;
            str = vqsVar.a;
            hm5.M(objK);
        }
        PlayerState playerState = (PlayerState) objK;
        if (playerState != null && (contextTrack = (ContextTrack) playerState.track().h()) != null && u890.j(contextTrack.uri(), str) && u890.j(playerState.contextUri(), str2)) {
            return playerState;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, onm onmVar) {
        wqs wqsVar;
        String str2;
        if (onmVar instanceof wqs) {
            wqsVar = (wqs) onmVar;
            int i = wqsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wqsVar.c = i - Integer.MIN_VALUE;
            } else {
                wqsVar = new wqs(this, onmVar);
            }
        } else {
            wqsVar = new wqs(this, onmVar);
        }
        Object objF = wqsVar.a;
        int i2 = wqsVar.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objF);
            trc0 trc0Var = new trc0(e9p1.j(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
            wqsVar.c = 1;
            objF = this.a.f(str, trc0Var, wqsVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        wsc0 wsc0Var = (wsc0) ((py21) objF).c();
        if (wsc0Var == null) {
            return yah0.m(false);
        }
        kby kbyVar = wsc0Var.f;
        Map map = kbyVar.q;
        String str3 = kbyVar.p;
        if (str3 == null) {
            str3 = "";
        }
        wm70 wm70Var = this.b;
        if (!wm70Var.b.contains(wm70Var.a.a(str3)) && ((str2 = (String) map.get("isAlgotorial")) == null || !Boolean.parseBoolean(str2))) {
            z = false;
        }
        return yah0.m(z);
    }
}
