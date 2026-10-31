package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ixm {
    public final String a;

    public ixm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixm) && u890.j(this.a, ((ixm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
