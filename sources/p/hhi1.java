package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hhi1 implements khi1 {
    public final String a;

    public hhi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhi1) && u890.j(this.a, ((hhi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
