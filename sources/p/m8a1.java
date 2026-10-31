package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m8a1 {
    public final String a;

    public m8a1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8a1) && u890.j(this.a, ((m8a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
