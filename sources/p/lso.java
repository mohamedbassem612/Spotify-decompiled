package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lso implements mso {
    public final String a;

    public lso(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lso) && u890.j(this.a, ((lso) obj).a);
    }

    @Override // p.mso
    public final String getMessage() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
