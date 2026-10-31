package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class axq0 implements vzq0 {
    public final p3v b;
    public final p3v c;
    public final p3v d;
    public final p3v e;
    public final vzq0 f;

    public axq0(p3v p3vVar, p3v p3vVar2, p3v p3vVar3, p3v p3vVar4, vzq0 vzq0Var) {
        this.b = p3vVar;
        this.c = p3vVar2;
        this.d = p3vVar3;
        this.e = p3vVar4;
        this.f = vzq0Var;
    }

    public final float a() {
        p3v p3vVar = this.e;
        return p3vVar != null ? p3vVar.a : this.f.a();
    }

    public final float b(flb0 flb0Var) {
        p3v p3vVar = flb0Var == flb0.a ? this.b : this.d;
        return p3vVar != null ? p3vVar.a : this.f.b(flb0Var);
    }

    public final float c(flb0 flb0Var) {
        p3v p3vVar = flb0Var == flb0.a ? this.d : this.b;
        return p3vVar != null ? p3vVar.a : this.f.c(flb0Var);
    }

    public final float d() {
        p3v p3vVar = this.c;
        return p3vVar != null ? p3vVar.a : this.f.d();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axq0)) {
            return false;
        }
        axq0 axq0Var = (axq0) obj;
        return u890.j(this.b, axq0Var.b) && u890.j(this.c, axq0Var.c) && u890.j(this.d, axq0Var.d) && u890.j(this.e, axq0Var.e) && u890.j(this.f, axq0Var.f);
    }

    public final int hashCode() {
        p3v p3vVar = this.b;
        int iHashCode = p3vVar != null ? Float.hashCode(p3vVar.a) : 0;
        p3v p3vVar2 = this.c;
        int iHashCode2 = iHashCode + (p3vVar2 != null ? Float.hashCode(p3vVar2.a) : 0);
        p3v p3vVar3 = this.d;
        int iHashCode3 = iHashCode2 + (p3vVar3 != null ? Float.hashCode(p3vVar3.a) : 0);
        p3v p3vVar4 = this.e;
        return this.f.hashCode() + iHashCode3 + (p3vVar4 != null ? Float.hashCode(p3vVar4.a) : 0);
    }
}
