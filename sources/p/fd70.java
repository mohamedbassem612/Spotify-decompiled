package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fd70 extends wwo1 {
    public final ad70 b;
    public final id70 c;
    public final dd70 d;
    public final HubsImmutableComponentBundle e;
    public final HubsImmutableComponentBundle f;
    public final HubsImmutableComponentBundle g;
    public final od70 h;
    public final String i;
    public final String j;
    public final j380 k;
    public final b380 l;
    public final /* synthetic */ gd70 m;

    public fd70(gd70 gd70Var, ad70 ad70Var, id70 id70Var, dd70 dd70Var, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, od70 od70Var, String str, String str2, j380 j380Var, b380 b380Var) {
        this.m = gd70Var;
        this.b = ad70Var;
        this.c = id70Var;
        this.d = dd70Var;
        this.e = hubsImmutableComponentBundle;
        this.f = hubsImmutableComponentBundle2;
        this.g = hubsImmutableComponentBundle3;
        this.h = od70Var;
        this.i = str;
        this.j = str2;
        this.k = j380Var;
        this.l = b380Var;
    }

    public final wwo1 E(String str) {
        if (u890.j(this.i, str)) {
            return this;
        }
        ed70 ed70Var = new ed70(this);
        ed70Var.i = str;
        return ed70Var;
    }

    public final wwo1 F(x570 x570Var) {
        x570 x570Var2;
        boolean zJ;
        dd70 dd70Var = this.d;
        if (dd70Var == x570Var) {
            zJ = true;
        } else {
            if (dd70Var == null) {
                dd70 dd70Var2 = dd70.c;
                dd70Var = dd70.c;
            }
            if (x570Var == null) {
                dd70 dd70Var3 = dd70.c;
                x570Var2 = dd70.c;
            } else {
                x570Var2 = x570Var;
            }
            zJ = u890.j(dd70Var, x570Var2);
        }
        if (zJ) {
            return this;
        }
        ed70 ed70Var = new ed70(this);
        ed70Var.F(x570Var);
        return ed70Var;
    }

    public final wwo1 H(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        if (zxo1.z(this.f, hubsImmutableComponentBundle)) {
            return this;
        }
        ed70 ed70Var = new ed70(this);
        ed70Var.H(hubsImmutableComponentBundle);
        return ed70Var;
    }

    public final wwo1 M(j670 j670Var) {
        j670 j670Var2;
        boolean zJ;
        id70 id70Var = this.c;
        if (id70Var == j670Var) {
            zJ = true;
        } else {
            if (id70Var == null) {
                id70 id70Var2 = id70.c;
                id70Var = id70.c;
            }
            if (j670Var == null) {
                id70 id70Var3 = id70.c;
                j670Var2 = id70.c;
            } else {
                j670Var2 = j670Var;
            }
            zJ = u890.j(id70Var, j670Var2);
        }
        if (zJ) {
            return this;
        }
        ed70 ed70Var = new ed70(this);
        ed70Var.M(j670Var);
        return ed70Var;
    }

    public final wwo1 P(String str, String str2) {
        return Q(new ad70(str, str2));
    }

    public final wwo1 Q(w570 w570Var) {
        boolean zJ;
        ad70 ad70Var = this.b;
        if (ad70Var == w570Var) {
            zJ = true;
        } else {
            if (ad70Var == null) {
                ad70 ad70Var2 = ad70.d;
                ad70Var = ad70.d;
            }
            zJ = u890.j(ad70Var, w570Var);
        }
        if (zJ) {
            return this;
        }
        ed70 ed70Var = new ed70(this);
        ed70Var.b = w570Var;
        return ed70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd70)) {
            return false;
        }
        fd70 fd70Var = (fd70) obj;
        return u890.j(this.b, fd70Var.b) && u890.j(this.c, fd70Var.c) && u890.j(this.d, fd70Var.d) && this.e.equals(fd70Var.e) && this.f.equals(fd70Var.f) && this.g.equals(fd70Var.g) && u890.j(this.h, fd70Var.h) && u890.j(this.i, fd70Var.i) && u890.j(this.j, fd70Var.j) && this.k.equals(fd70Var.k) && this.l.equals(fd70Var.l);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public final wwo1 n(y570... y570VarArr) {
        if (y570VarArr.length == 0) {
            return this;
        }
        ed70 ed70Var = new ed70(this);
        ed70Var.l.a(zxo1.q(Arrays.asList(y570VarArr)));
        return ed70Var;
    }

    public final wwo1 o(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        if (hubsImmutableComponentBundle.s().isEmpty()) {
            return this;
        }
        ed70 ed70Var = new ed70(this);
        ed70Var.o(hubsImmutableComponentBundle);
        return ed70Var;
    }

    public final wwo1 p(String str, Serializable serializable) {
        if (u890.j(serializable, this.g.j(str))) {
            return this;
        }
        ed70 ed70Var = new ed70(this);
        ed70Var.p(str, serializable);
        return ed70Var;
    }

    public final wwo1 q(String str, j570 j570Var) {
        if (j570Var.equals(this.k.get(str))) {
            return this;
        }
        ed70 ed70Var = new ed70(this);
        ed70Var.q(str, j570Var);
        return ed70Var;
    }

    public final gd70 x() {
        return this.m;
    }

    public final wwo1 y(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        if (zxo1.z(this.g, hubsImmutableComponentBundle)) {
            return this;
        }
        ed70 ed70Var = new ed70(this);
        ed70Var.y(hubsImmutableComponentBundle);
        return ed70Var;
    }
}
