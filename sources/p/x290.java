package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x290 {
    public final /* synthetic */ m8b a;

    public x290(m8b m8bVar) {
        this.a = m8bVar;
    }

    public final c8b a() {
        n8b n8bVarCreate = this.a.create();
        z2p z2pVar = new z2p(n8bVarCreate);
        lzn0 lzn0VarC = n8bVarCreate.c();
        c8o.l(lzn0VarC);
        Activity activityS = n8bVarCreate.s();
        c8o.l(activityS);
        Activity activityS2 = n8bVarCreate.s();
        c8o.l(activityS2);
        it8 it8Var = new it8(activityS, new nw40(activityS2), (byte) 16);
        y2p y2pVar = (y2p) z2pVar.a.get();
        zwg zwgVar = new zwg();
        zwgVar.a = lzn0VarC;
        zwgVar.b = it8Var;
        zwgVar.c = y2pVar;
        zwgVar.e = new mp8((Object) zwgVar, (byte) 6);
        return new c8b(zwgVar);
    }
}
