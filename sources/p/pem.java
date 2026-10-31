package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pem implements tem {
    public final igm a;
    public final c9 b;
    public final zm81 c;
    public final Function0 d;
    public final Function0 e;
    public final yim f;
    public final gu61 g;

    public pem(igm igmVar, c9 c9Var, zm81 zm81Var, Function0 function0, Function0 function1, yim yimVar, gu61 gu61Var) {
        this.a = igmVar;
        this.b = c9Var;
        this.c = zm81Var;
        this.d = function0;
        this.e = function1;
        this.f = yimVar;
        this.g = gu61Var;
    }

    public final igm a() {
        return this.a;
    }

    public final c380 b() {
        return this.b;
    }

    public final Function0 c() {
        return this.e;
    }

    public final zm81 d() {
        return this.c;
    }

    public final yim e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pem)) {
            return false;
        }
        pem pemVar = (pem) obj;
        return u890.j(this.a, pemVar.a) && this.b.equals(pemVar.b) && u890.j(this.c, pemVar.c) && u890.j(this.d, pemVar.d) && u890.j(this.e, pemVar.e) && u890.j(this.f, pemVar.f) && this.g.equals(pemVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        zm81 zm81Var = this.c;
        int iN = rjx.n(rjx.n((iHashCode + (zm81Var == null ? 0 : zm81Var.hashCode())) * 31, 31, this.d), 31, this.e);
        yim yimVar = this.f;
        return this.g.a.hashCode() + ((iN + (yimVar != null ? yimVar.hashCode() : 0)) * 31);
    }
}
