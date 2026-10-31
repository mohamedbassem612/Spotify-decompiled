package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o200 implements a700 {
    public final String a;

    public o200(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o200) && u890.j(this.a, ((o200) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
