package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ov80 {
    public final i8h1 a;
    public final r6h1 b;

    public /* synthetic */ ov80(i8h1 i8h1Var, r6h1 r6h1Var) {
        this.a = i8h1Var;
        this.b = r6h1Var;
    }

    public void a(int i, String str) {
        Integer numValueOf = Integer.valueOf(i);
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-playlist-entity-item-list-item";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.c = numValueOf;
        x6h1VarI.d = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        b7x b7xVar = b7x.a;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, this.b, System.currentTimeMillis()), (xj61) null);
    }
}
