package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zmt extends kbb {
    public final umt d;

    public zmt(umt umtVar) {
        this.d = umtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmt) && u890.j(this.d, ((zmt) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
