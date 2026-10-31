package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class saf0 extends xaf0 {
    public final String a;

    public saf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof saf0) && u890.j(this.a, ((saf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
