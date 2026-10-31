package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qhw implements eiw {
    public final String a;

    public qhw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhw) && this.a.equals(((qhw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
