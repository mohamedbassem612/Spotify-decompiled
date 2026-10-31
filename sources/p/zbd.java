package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zbd implements jcd {
    public final String a;

    public zbd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbd) && u890.j(this.a, ((zbd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (sbd.a.hashCode() * 31);
    }
}
