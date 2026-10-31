package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class df8 {
    public final String a;

    public df8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df8) && u890.j(this.a, ((df8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
