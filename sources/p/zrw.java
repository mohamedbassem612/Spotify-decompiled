package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zrw implements csw {
    public final String a;

    public zrw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrw) && u890.j(this.a, ((zrw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
