package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j6g0 extends n6g0 {
    public final String a;

    public j6g0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6g0) && u890.j(this.a, ((j6g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
