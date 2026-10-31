package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f9y0 implements i9y0 {
    public final String a;

    public f9y0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f9y0) && u890.j(this.a, ((f9y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
