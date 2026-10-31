package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cr implements dr {
    public final String a;

    public cr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr) && u890.j(this.a, ((cr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
