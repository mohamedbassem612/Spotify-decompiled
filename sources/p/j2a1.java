package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j2a1 implements m2a1 {
    public final String a;

    public j2a1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2a1) && u890.j(this.a, ((j2a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
