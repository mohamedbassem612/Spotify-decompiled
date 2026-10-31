package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o3m1 extends b4m1 {
    public final String a;

    public o3m1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3m1) && u890.j(this.a, ((o3m1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
