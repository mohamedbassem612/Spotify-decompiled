package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ea3 implements fa3 {
    public final String a;

    public ea3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea3) && u890.j(this.a, ((ea3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
