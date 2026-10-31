package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hvg1 {
    public final String a;

    public hvg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvg1) && u890.j(this.a, ((hvg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
