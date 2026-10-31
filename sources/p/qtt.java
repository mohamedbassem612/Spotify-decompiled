package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes14.dex */
public final class qtt {
    public final String a;
    public final int b;

    public qtt(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtt)) {
            return false;
        }
        qtt qttVar = (qtt) obj;
        return this.a.equals(qttVar.a) && this.b == qttVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + l1d.C(this.b);
    }
}
