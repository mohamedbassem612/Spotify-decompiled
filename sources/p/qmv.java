package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qmv implements ymv {
    public final String a;

    public qmv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmv) && this.a.equals(((qmv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
