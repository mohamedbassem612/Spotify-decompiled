package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ed70 extends wwo1 {
    public w570 b;
    public hd70 c;
    public cd70 d;
    public final uc70 e;
    public uc70 f;
    public yxo1 g;
    public final od70 h;
    public String i;
    public final String j;
    public final ifl1 k;
    public final tmc0 l;

    public ed70(fd70 fd70Var) {
        this.b = fd70Var.b;
        this.c = fd70Var.c.a;
        this.d = fd70Var.d.a;
        this.e = fd70Var.e.a;
        this.f = fd70Var.f.a;
        this.g = fd70Var.g.a;
        this.h = fd70Var.h;
        this.i = fd70Var.i;
        this.j = fd70Var.j;
        this.k = new ifl1(fd70Var.k, (byte) 23);
        this.l = new tmc0(fd70Var.l);
    }

    public final wwo1 E(String str) {
        this.i = str;
        return this;
    }

    public final wwo1 F(x570 x570Var) {
        this.d = x570Var != null ? ((dd70) x570Var).a : dd70.c.a;
        return this;
    }

    public final wwo1 H(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.f = hubsImmutableComponentBundle != null ? hubsImmutableComponentBundle.a : HubsImmutableComponentBundle.b.a;
        return this;
    }

    public final wwo1 M(j670 j670Var) {
        this.c = j670Var != null ? ((id70) j670Var).a : id70.c.a;
        return this;
    }

    public final wwo1 n(y570... y570VarArr) {
        this.l.a(zxo1.q(Arrays.asList(y570VarArr)));
        return this;
    }

    public final wwo1 o(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.g = this.g.l(hubsImmutableComponentBundle);
        return this;
    }

    public final wwo1 p(String str, Serializable serializable) {
        this.g = this.g.I(str, serializable);
        return this;
    }

    public final wwo1 q(String str, j570 j570Var) {
        sc70 sc70VarP;
        sc70 sc70Var = sc70.d;
        if (j570Var instanceof sc70) {
            sc70VarP = (sc70) j570Var;
        } else {
            rc70 rc70Var = ((sc70) j570Var).b;
            sc70VarP = wxo1.p(rc70Var.c, rc70Var.b);
        }
        ifl1 ifl1Var = this.k;
        if (!sc70VarP.equals(((Map) ifl1Var.b).get(str))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) ifl1Var.b);
            linkedHashMap.put(str, sc70VarP);
            ifl1Var.b = linkedHashMap;
        }
        return this;
    }

    public final gd70 x() {
        gd70 gd70Var = gd70.c;
        return cyo1.m(this.b, this.c.e, this.d.g, this.e.d, this.f.d, this.g.o(), this.h, this.i, this.j, this.k.b(), b380.p(this.l.a));
    }

    public final wwo1 y(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        uc70 uc70Var;
        if (hubsImmutableComponentBundle != null) {
            uc70Var = hubsImmutableComponentBundle.a;
        } else {
            HubsImmutableComponentBundle hubsImmutableComponentBundle2 = HubsImmutableComponentBundle.b;
            uc70Var = HubsImmutableComponentBundle.b.a;
        }
        this.g = uc70Var;
        return this;
    }
}
