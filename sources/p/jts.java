package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jts {
    public final g3e a;
    public final jo20 b;
    public final l7s c;
    public final g0l d;

    public jts(g3e g3eVar, jo20 jo20Var, l7s l7sVar, ekb ekbVar, g0l g0lVar) {
        this.a = g3eVar;
        this.b = jo20Var;
        this.c = l7sVar;
        this.d = g0lVar;
    }

    public static String a(gvh0 gvh0Var) {
        return l1d.m("spotify_group-", gvh0Var.g());
    }

    public final boolean b(String str) {
        Object next;
        Iterator it = this.d.i().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((l0l) next).d(), str));
        l0l l0lVar = (l0l) next;
        return l0lVar != null && l0lVar.v();
    }
}
