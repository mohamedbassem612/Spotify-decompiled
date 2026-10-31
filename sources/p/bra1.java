package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bra1 implements era1 {
    public final String a;

    public bra1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bra1) && u890.j(this.a, ((bra1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
