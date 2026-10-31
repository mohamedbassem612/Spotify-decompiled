package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bwd {
    public final String a;

    public bwd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwd) && u890.j(this.a, ((bwd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
