package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vfk extends nln {
    public final String e;
    public final vqe1 f;

    public vfk(String str, vqe1 vqe1Var) {
        super((byte) 4);
        this.e = str;
        this.f = vqe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfk)) {
            return false;
        }
        vfk vfkVar = (vfk) obj;
        return this.e.equals(vfkVar.e) && u890.j(this.f, vfkVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }
}
