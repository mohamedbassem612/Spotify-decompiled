package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zo81 extends s9p1 {
    public final hm c;
    public final n5o d;

    public zo81(hm hmVar, n5o n5oVar) {
        this.c = hmVar;
        this.d = n5oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo81)) {
            return false;
        }
        zo81 zo81Var = (zo81) obj;
        return this.c.equals(zo81Var.c) && u890.j(this.d, zo81Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        n5o n5oVar = this.d;
        return iHashCode + (n5oVar == null ? 0 : n5oVar.hashCode());
    }
}
