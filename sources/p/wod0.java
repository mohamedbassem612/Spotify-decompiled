package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wod0 implements f4h1 {
    public final kdn0 a;
    public final goq b;
    public final cir0 c;
    public final haa0 d;
    public final l6d0 e;
    public b431 f;

    public wod0(kdn0 kdn0Var, goq goqVar, cir0 cir0Var, haa0 haa0Var, l6d0 l6d0Var) {
        this.a = kdn0Var;
        this.b = goqVar;
        this.c = cir0Var;
        this.d = haa0Var;
        this.e = l6d0Var;
    }

    public final Object getView() {
        return ((nsg) this.b.b).a;
    }

    public final Bundle serialize() {
        return new Bundle();
    }

    public final void start() {
        cir0 cir0Var = this.c;
        this.a.f(cir0Var.e(), new z11(this, (byte) 24));
        y11 y11Var = new y11(this, (byte) 14);
        goq goqVar = this.b;
        bpb1 bpb1Var = (wen0) ((idd1) goqVar.f).getValue();
        gi00 gi00Var = new gi00(y11Var, (byte) 0);
        bpb1 bpb1Var2 = bpb1Var;
        bpb1Var2.getClass();
        bpb1Var2.m((Object) null, gi00Var);
        ((qzh) goqVar.c).n(new hi00(goqVar, y11Var, (byte) 1));
        ((yyr) goqVar.d).b = new hi00(goqVar, y11Var, (byte) 0);
        this.f = cir0Var.h().a(iwe.d, new wj1(this, (byte) 23));
    }

    public final void stop() {
    }
}
