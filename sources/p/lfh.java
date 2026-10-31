package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lfh implements nfh {
    public final String a;

    public lfh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfh) && u890.j(this.a, ((lfh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
