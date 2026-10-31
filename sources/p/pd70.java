package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pd70 extends jyo1 {
    public String c;
    public final String d;
    public wwo1 e;
    public final tmc0 f;
    public final tmc0 g;
    public final String h;
    public yxo1 i;

    public pd70(qd70 qd70Var) {
        this.c = qd70Var.c;
        this.d = qd70Var.d;
        gd70 gd70Var = qd70Var.e;
        this.e = gd70Var != null ? gd70Var.a : null;
        this.f = new tmc0(qd70Var.f);
        this.g = new tmc0(qd70Var.g);
        this.h = qd70Var.h;
        this.i = qd70Var.i.a;
    }

    public final rd70 f() {
        gd70 gd70VarP;
        String str = this.c;
        wwo1 wwo1Var = this.e;
        if (wwo1Var != null) {
            gd70 gd70Var = gd70.c;
            gd70VarP = cyo1.p(wwo1Var.x());
        } else {
            gd70VarP = null;
        }
        gd70 gd70Var2 = gd70VarP;
        b380 b380VarP = b380.p(this.f.a);
        b380 b380VarP2 = b380.p(this.g.a);
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        return new rd70(str, this.d, gd70Var2, b380VarP, b380VarP2, this.h, lqc.v(this.i.o()));
    }

    public final jyo1 j(y570 y570Var) {
        this.e = y570Var != null ? y570Var.toBuilder() : null;
        return this;
    }
}
