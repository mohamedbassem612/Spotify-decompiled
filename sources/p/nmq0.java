package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nmq0 extends m87 {
    public final String d;

    public nmq0(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nmq0) && u890.j(this.d, ((nmq0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
