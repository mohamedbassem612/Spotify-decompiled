package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class un3 extends qxd0 {
    public final String d;

    public un3(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un3) && u890.j(this.d, ((un3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
