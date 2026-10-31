package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oo {
    public final String a;

    public oo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oo) && u890.j(this.a, ((oo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
