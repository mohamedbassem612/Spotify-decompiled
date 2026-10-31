package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ypf0 {
    public final String a;

    public ypf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ypf0) && u890.j(this.a, ((ypf0) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) - 1386559057;
    }
}
