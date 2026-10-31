package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vvw {
    public final boolean a;
    public final boolean b;
    public final uvw c;
    public final nvw d;

    public vvw(boolean z, boolean z2, uvw uvwVar, nvw nvwVar) {
        this.a = z;
        this.b = z2;
        this.c = uvwVar;
        this.d = nvwVar;
    }

    public static vvw a(vvw vvwVar, boolean z, boolean z2, uvw uvwVar, nvw nvwVar, int i) {
        if ((i & 1) != 0) {
            z = vvwVar.a;
        }
        if ((i & 2) != 0) {
            z2 = vvwVar.b;
        }
        if ((i & 4) != 0) {
            uvwVar = vvwVar.c;
        }
        if ((i & 8) != 0) {
            nvwVar = vvwVar.d;
        }
        vvwVar.getClass();
        return new vvw(z, z2, uvwVar, nvwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvw)) {
            return false;
        }
        vvw vvwVar = (vvw) obj;
        return this.a == vvwVar.a && this.b == vvwVar.b && u890.j(this.c, vvwVar.c) && u890.j(this.d, vvwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
