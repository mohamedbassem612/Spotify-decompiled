package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ynf implements znf {
    public final String a;

    public ynf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynf) && u890.j(this.a, ((ynf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
