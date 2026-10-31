package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v59 extends x59 {
    public final hkz a;

    public v59(hkz hkzVar) {
        this.a = hkzVar;
    }

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v59) && this.a.equals(((v59) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(false) * 31);
    }
}
