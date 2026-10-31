package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d490 {
    public final e831 a;
    public final xe01 b;
    public final Set c;
    public final CopyOnWriteArraySet d;

    public d490(e831 e831Var, Flowable flowable, Set set) {
        this.a = e831Var;
        llm llmVarE = smo1.e(flo1.l(guo1.B(), igu.b));
        vbm[] vbmVarArr = q601.a;
        this.b = d5p1.t(new lt20(new kge(flowable), new ob00(3, (lnm) null, (byte) 3), (byte) 0), llmVarE, ey71.a, (Object) null);
        this.c = o7h.p1(set);
        this.d = new CopyOnWriteArraySet();
    }

    public final c490 a() {
        String string;
        n6r0 n6r0Var;
        Object next;
        j380 j380VarContextMetadata;
        String str;
        String string2;
        String string3;
        n6r0 n6r0Var2;
        lik1 lik1Var;
        war0 war0VarB0;
        war0 war0VarB1;
        bbr0 bbr0VarA = this.a.a();
        bbr0 bbr0Var = bbr0VarA instanceof bbr0 ? bbr0VarA : null;
        bn70 bn70Var = (bbr0Var == null || (war0VarB1 = bbr0Var.b0(bn70.class)) == null) ? null : (bn70) war0VarB1.a();
        vmc1 vmc1Var = (bbr0Var == null || (war0VarB0 = bbr0Var.b0(vmc1.class)) == null) ? null : (vmc1) war0VarB0.a();
        PlayerState playerState = (PlayerState) this.b.a.getValue();
        String str2 = (bn70Var == null || (lik1Var = bn70Var.b) == null) ? null : lik1Var.a;
        if (vmc1Var != null) {
            string = vmc1Var.a;
        } else {
            string = (bn70Var == null || (n6r0Var = bn70Var.a) == null) ? null : n6r0Var.toString();
        }
        mf20 mf20Var = new mf20(z561.f0(new os(str2, string, (byte) 17), new i46(dm61.y0(this.c, this.d), (byte) 1)));
        if (mf20Var.hasNext()) {
            next = mf20Var.next();
            if (mf20Var.hasNext()) {
                int size = ((pn10) next).e.size();
                do {
                    Object next2 = mf20Var.next();
                    int size2 = ((pn10) next2).e.size();
                    if (size < size2) {
                        next = next2;
                        size = size2;
                    }
                } while (mf20Var.hasNext());
            }
        } else {
            next = null;
        }
        pn10 pn10Var = (pn10) next;
        return new c490((bn70Var == null || (n6r0Var2 = bn70Var.a) == null) ? null : n6r0Var2.toString(), str2, (playerState == null || (string3 = ihc1.e1(o4p1.o(playerState)).toString()) == null || string3.length() <= 0) ? null : string3, (playerState == null || (j380VarContextMetadata = playerState.contextMetadata()) == null || (str = (String) j380VarContextMetadata.get("player.arch")) == null || (string2 = ihc1.e1(str).toString()) == null || string2.length() <= 0) ? null : string2, pn10Var != null ? pn10Var.e : b7x.a, pn10Var);
    }
}
