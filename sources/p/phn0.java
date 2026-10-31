package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class phn0 extends rhn0 {
    public final String a;

    public phn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phn0) && u890.j(this.a, ((phn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
