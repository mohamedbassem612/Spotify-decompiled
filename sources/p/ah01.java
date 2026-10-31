package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ah01 {
    public final String a;

    public ah01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah01) && u890.j(this.a, ((ah01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
