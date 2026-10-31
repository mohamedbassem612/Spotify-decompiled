package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l730 implements m730 {
    public final String a;

    public l730(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l730) && u890.j(this.a, ((l730) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
