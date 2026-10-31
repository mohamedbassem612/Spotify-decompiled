package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gf3 implements it80 {
    public final ptk a;
    public final u961 b;
    public final kly0 c;
    public final zle1 d;

    public gf3(ptk ptkVar, u961 u961Var, thq thqVar, dgb dgbVar, zle1 zle1Var) {
        this.a = ptkVar;
        this.b = u961Var;
        this.c = thqVar;
        this.d = zle1Var;
    }

    public final void a(ajq0 ajq0Var) {
        Iterator it = dm61.z0(new blc0[]{blc0.g1, blc0.h1, blc0.R3}).iterator();
        while (it.hasNext()) {
            wmo1.q(ajq0Var, cpn1.w((blc0) it.next()), "Handle album links", new ff3(this, null));
        }
    }
}
