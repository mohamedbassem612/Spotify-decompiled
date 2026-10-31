package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xm3 extends ym3 {
    public final String a;

    public xm3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm3) && u890.j(this.a, ((xm3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
