package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwt {
    public final ywt a;
    public final ywt b;

    public zwt(ywt ywtVar, ywt ywtVar2) {
        this.a = ywtVar;
        this.b = ywtVar2;
    }

    public final ywt a() {
        return this.a;
    }

    public final ywt b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwt)) {
            return false;
        }
        zwt zwtVar = (zwt) obj;
        return this.a == zwtVar.a && this.b == zwtVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
