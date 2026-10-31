package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xxc {
    public final String a;
    public final int b;

    public xxc(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxc)) {
            return false;
        }
        xxc xxcVar = (xxc) obj;
        return this.a.equals(xxcVar.a) && this.b == xxcVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
