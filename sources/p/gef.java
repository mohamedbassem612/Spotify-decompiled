package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gef extends cso1 {
    public final String b;
    public final boolean c;

    public gef(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gef)) {
            return false;
        }
        gef gefVar = (gef) obj;
        return u890.j(this.b, gefVar.b) && this.c == gefVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
