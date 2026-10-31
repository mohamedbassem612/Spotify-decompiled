package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wri0 implements yri0 {
    public final String a;

    public wri0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wri0) && this.a.equals(((wri0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
