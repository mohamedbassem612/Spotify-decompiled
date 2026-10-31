package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s56 {
    public final String a;

    public s56(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s56) && u890.j(this.a, ((s56) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
