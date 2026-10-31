package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fjf {
    public final String a;
    public final boolean b;

    public fjf(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjf)) {
            return false;
        }
        fjf fjfVar = (fjf) obj;
        return u890.j(this.a, fjfVar.a) && this.b == fjfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
