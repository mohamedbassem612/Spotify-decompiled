package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hm2 implements nm2 {
    public final String a;

    public hm2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm2) && u890.j(this.a, ((hm2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
