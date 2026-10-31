package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vp3 extends hr3 {
    public final String a;

    public vp3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp3) && u890.j(this.a, ((vp3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
