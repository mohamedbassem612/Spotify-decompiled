package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qdz0 implements wdz0 {
    public final String a;

    public qdz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdz0) && u890.j(this.a, ((qdz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
