package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tzo0 extends pno1 {
    public final String d;

    public tzo0(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzo0) && u890.j(this.d, ((tzo0) obj).d);
    }

    public final int hashCode() {
        String str = this.d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
