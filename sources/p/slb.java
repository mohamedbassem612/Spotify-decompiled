package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class slb {
    public final String a;
    public final e98 b;

    public slb(String str, e98 e98Var) {
        this.a = str;
        this.b = e98Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slb)) {
            return false;
        }
        slb slbVar = (slb) obj;
        return u890.j(this.a, slbVar.a) && this.b.equals(slbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
