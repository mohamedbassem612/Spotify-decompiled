package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gym implements jym {
    public final String a;
    public final c380 b;

    public gym(String str, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gym)) {
            return false;
        }
        gym gymVar = (gym) obj;
        return u890.j(this.a, gymVar.a) && this.b.equals(gymVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
