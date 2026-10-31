package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mhw implements eiw {
    public final String a;

    public mhw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mhw) && this.a.equals(((mhw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
