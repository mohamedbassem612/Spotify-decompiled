package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ig21 {
    public final String a;

    public ig21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ig21) && u890.j(this.a, ((ig21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
