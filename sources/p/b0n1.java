package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b0n1 implements g0n1 {
    public final String a;

    public b0n1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0n1) && u890.j(this.a, ((b0n1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
