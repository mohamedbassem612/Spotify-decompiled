package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o3h0 implements e4h0 {
    public final String a;

    public o3h0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3h0) && u890.j(this.a, ((o3h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
