package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gs40 extends mgo1 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ hs40 d;

    public gs40(ArrayList arrayList, hs40 hs40Var) {
        this.c = arrayList;
        this.d = hs40Var;
    }

    public final void k(jyc jycVar) {
        exq0.r(jycVar, null);
        this.c.add(jycVar);
    }

    public final void n(jyc jycVar, jyc jycVar2) {
        throw new IllegalStateException(("Conflict in scope of " + this.d.b + ": " + jycVar + " vs " + jycVar2).toString());
    }
}
