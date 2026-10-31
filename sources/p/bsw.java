package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bsw implements csw {
    public final String a;

    public bsw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bsw) && this.a.equals(((bsw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
