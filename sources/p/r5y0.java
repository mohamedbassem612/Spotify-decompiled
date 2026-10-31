package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r5y0 implements u5y0 {
    public final String a;

    public r5y0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5y0) && u890.j(this.a, ((r5y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
