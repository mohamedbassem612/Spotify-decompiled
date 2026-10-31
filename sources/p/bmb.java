package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bmb {
    public final int a;
    public final mob b;

    public bmb(int i, mob mobVar) {
        this.a = i;
        this.b = mobVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmb)) {
            return false;
        }
        bmb bmbVar = (bmb) obj;
        return this.a == bmbVar.a && this.b.equals(bmbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
