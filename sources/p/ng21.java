package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ng21 implements pg21 {
    public final String a;

    public ng21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng21) && u890.j(this.a, ((ng21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
