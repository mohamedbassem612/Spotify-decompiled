package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class om40 {
    public static final f7h c = new f7h(false, false, false);
    public final g7h a;
    public final p85 b;

    public om40(g7h g7hVar, p85 p85Var) {
        this.a = g7hVar;
        this.b = p85Var;
    }

    public static iko b(ContextTrack contextTrack, f7h f7hVar) {
        boolean zO = l4o1.O(contextTrack);
        if (nhc1.Y(contextTrack.uri(), "spotify:ad:", false) || zO) {
            return iko.c;
        }
        return f7hVar.c ? iko.a : iko.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(ContextTrack contextTrack, onm onmVar) {
        lm40 lm40Var;
        if (onmVar instanceof lm40) {
            lm40Var = (lm40) onmVar;
            int i = lm40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lm40Var.c = i - Integer.MIN_VALUE;
            } else {
                lm40Var = new lm40(this, onmVar);
            }
        } else {
            lm40Var = new lm40(this, onmVar);
        }
        Object objJ = lm40Var.a;
        int i2 = lm40Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            if (!this.b.h()) {
                return iko.c;
            }
            String strJ = l4o1.j(contextTrack);
            if (!l4o1.G(contextTrack) || strJ == null) {
                strJ = contextTrack.uri();
                strJ.getClass();
            }
            Single map = g7h.b(this.a, "", new String[]{strJ}).map(new vdn1(strJ, (byte) 9)).map(new dh30(this, contextTrack, (byte) 6));
            lm40Var.c = 1;
            objJ = fc11.j(map, lm40Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        objJ.getClass();
        return (iko) objJ;
    }
}
