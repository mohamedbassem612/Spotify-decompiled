package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xak0 implements yak0 {
    public final String a;

    public xak0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xak0) && u890.j(this.a, ((xak0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
