package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l071 implements x071 {
    public final String a;

    public l071(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l071) && u890.j(this.a, ((l071) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
