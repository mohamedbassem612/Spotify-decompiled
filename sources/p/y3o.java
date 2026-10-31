package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y3o implements a4o {
    public final String a;

    public y3o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3o) && u890.j(this.a, ((y3o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
