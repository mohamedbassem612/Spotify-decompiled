package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eyz implements z500 {
    public final e6r a;

    public eyz(e6r e6rVar) {
        this.a = e6rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyz) && this.a.equals(((eyz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
