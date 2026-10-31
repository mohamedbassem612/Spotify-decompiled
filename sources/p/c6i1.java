package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c6i1 implements d6i1 {
    public final String a;

    public c6i1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6i1) && u890.j(this.a, ((c6i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
