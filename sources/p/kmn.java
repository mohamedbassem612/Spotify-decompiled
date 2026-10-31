package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kmn implements lmn {
    public final String a;

    public kmn(String str) {
        this.a = str;
        if (str.length() > 0) {
            return;
        }
        hhg1.n("A non-empty URI must be provided.");
        throw null;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmn) && u890.j(this.a, ((kmn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
