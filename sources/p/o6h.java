package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o6h implements z6h {
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final Set d;
    public final wa71 e;

    static {
        zy61 zy61Var = ez61.c;
    }

    public o6h(int i, z771 z771Var, ez61 ez61Var, Set set, wa71 wa71Var) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = set;
        this.e = wa71Var;
    }

    @Override // p.z6h
    public final wa71 a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6h)) {
            return false;
        }
        o6h o6hVar = (o6h) obj;
        return this.a == o6hVar.a && u890.j(this.b, o6hVar.b) && u890.j(this.c, o6hVar.c) && u890.j(this.d, o6hVar.d) && u890.j(this.e, o6hVar.e);
    }

    public final String getEntityUri() {
        return this.e.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + gvg.c(pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31), 31, this.d);
    }
}
