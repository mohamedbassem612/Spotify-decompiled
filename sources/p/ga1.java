package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ga1 extends wa1 {
    public final String a;

    public ga1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga1) && u890.j(this.a, ((ga1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
