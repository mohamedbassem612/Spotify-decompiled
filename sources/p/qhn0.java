package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qhn0 extends rhn0 {
    public final String a;

    public qhn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhn0) && u890.j(this.a, ((qhn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
