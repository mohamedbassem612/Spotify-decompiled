package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uzd {
    public final i8h1 a;
    public final c4n0 b;

    public /* synthetic */ uzd(i8h1 i8h1Var, c4n0 c4n0Var) {
        this.a = i8h1Var;
        this.b = c4n0Var;
    }

    public void a(HubsImmutableComponentBundle hubsImmutableComponentBundle, String str) {
        x6h1 x6h1VarG = y1a1.G(hubsImmutableComponentBundle, this.b.getViewUri().a);
        x6h1VarG.g = "22.0.0";
        oj80 oj80VarF = new x5j1(x6h1VarG.a(), (byte) 12).f();
        v7h1 v7h1Var = new v7h1();
        ((xjn) v7h1Var).a = (y6h1) ((x5j1) oj80VarF.c).b;
        ((xjn) v7h1Var).c = Long.valueOf(System.currentTimeMillis());
        t6h1 t6h1Var = t6h1.f;
        o3b1 o3b1VarJ = f3o1.j();
        o3b1VarJ.c = "hit";
        o3b1VarJ.b = "pause";
        o3b1VarJ.a = (byte) 1;
        o3b1.b(o3b1VarJ, "item_to_be_paused", str);
        v7h1Var.e = o3b1VarJ.a();
        this.a.m(v7h1Var.a(), (xj61) null);
    }

    public tv80 b(HubsImmutableComponentBundle hubsImmutableComponentBundle, String str) {
        x6h1 x6h1VarG = y1a1.G(hubsImmutableComponentBundle, this.b.getViewUri().a);
        x6h1VarG.g = "22.0.0";
        return this.a.m(new x5j1(x6h1VarG.a(), (byte) 12).f().o(str), (xj61) null);
    }

    public tv80 c(HubsImmutableComponentBundle hubsImmutableComponentBundle, String str) {
        x6h1 x6h1VarG = y1a1.G(hubsImmutableComponentBundle, this.b.getViewUri().a);
        x6h1VarG.g = "22.0.0";
        oj80 oj80VarF = new x5j1(x6h1VarG.a(), (byte) 12).f();
        v7h1 v7h1Var = new v7h1();
        ((xjn) v7h1Var).a = (y6h1) ((x5j1) oj80VarF.c).b;
        ((xjn) v7h1Var).c = Long.valueOf(System.currentTimeMillis());
        t6h1 t6h1Var = t6h1.f;
        o3b1 o3b1VarJ = f3o1.j();
        o3b1VarJ.c = "hit";
        o3b1VarJ.b = "resume";
        o3b1VarJ.a = (byte) 1;
        o3b1.b(o3b1VarJ, "item_to_be_resumed", str);
        v7h1Var.e = o3b1VarJ.a();
        return this.a.m(v7h1Var.a(), (xj61) null);
    }

    public tv80 d(HubsImmutableComponentBundle hubsImmutableComponentBundle, String str) {
        x6h1 x6h1VarG = y1a1.G(hubsImmutableComponentBundle, this.b.getViewUri().a);
        x6h1VarG.g = "22.0.0";
        return this.a.m(new x5j1(x6h1VarG.a(), (byte) 12).f().r(str), (xj61) null);
    }
}
