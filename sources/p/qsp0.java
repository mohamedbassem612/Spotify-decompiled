package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qsp0 {
    public final int a;

    public qsp0(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qsp0) && this.a == ((qsp0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
