package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pf31 implements tf31 {
    public final String a;

    public pf31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf31) && u890.j(this.a, ((pf31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
