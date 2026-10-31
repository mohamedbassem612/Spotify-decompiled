package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hkt extends m87 {
    public final String d;

    public hkt(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hkt) && u890.j(this.d, ((hkt) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
