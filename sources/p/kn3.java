package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kn3 extends qxd0 {
    public final String d;

    public kn3(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kn3) && u890.j(this.d, ((kn3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
