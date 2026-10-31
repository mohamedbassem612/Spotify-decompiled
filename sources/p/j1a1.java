package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j1a1 extends q1a1 {
    public final String a;

    public j1a1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1a1) && u890.j(this.a, ((j1a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
