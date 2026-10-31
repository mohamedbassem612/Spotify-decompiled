package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tmt extends umt {
    public final o571 a;
    public final p371 b;
    public final n3o1 c;
    public final s4b1 d;
    public final ou80 e;
    public final wgf f;
    public final s7q0 g;
    public final u6q0 h;

    public tmt(o571 o571Var, p371 p371Var, n3o1 n3o1Var, s4b1 s4b1Var, ou80 ou80Var, wgf wgfVar, s7q0 s7q0Var, u6q0 u6q0Var) {
        this.a = o571Var;
        this.b = p371Var;
        this.c = n3o1Var;
        this.d = s4b1Var;
        this.e = ou80Var;
        this.f = wgfVar;
        this.g = s7q0Var;
        this.h = u6q0Var;
    }

    @Override // p.umt
    public final o571 a() {
        return this.a;
    }

    @Override // p.umt
    public final p371 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmt)) {
            return false;
        }
        tmt tmtVar = (tmt) obj;
        return u890.j(this.a, tmtVar.a) && u890.j(this.b, tmtVar.b) && u890.j(this.c, tmtVar.c) && u890.j(this.d, tmtVar.d) && u890.j(this.e, tmtVar.e) && u890.j(this.f, tmtVar.f) && u890.j(this.g, tmtVar.g) && u890.j(this.h, tmtVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        p371 p371Var = this.b;
        int iD = cy30.d(xvj1.j(this.d, (this.c.hashCode() + ((iHashCode + (p371Var == null ? 0 : p371Var.hashCode())) * 31)) * 31, 31), 31, this.e.a);
        wgf wgfVar = this.f;
        int iHashCode2 = (iD + (wgfVar == null ? 0 : wgfVar.hashCode())) * 31;
        s7q0 s7q0Var = this.g;
        int iHashCode3 = (iHashCode2 + (s7q0Var == null ? 0 : s7q0Var.hashCode())) * 31;
        u6q0 u6q0Var = this.h;
        return iHashCode3 + (u6q0Var != null ? u6q0Var.hashCode() : 0);
    }
}
