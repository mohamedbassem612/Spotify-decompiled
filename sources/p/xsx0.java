package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xsx0 extends ktx0 {
    public final String a;

    public xsx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsx0) && u890.j(this.a, ((xsx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
