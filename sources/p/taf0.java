package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class taf0 extends xaf0 {
    public final String a;

    public taf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof taf0) && u890.j(this.a, ((taf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
