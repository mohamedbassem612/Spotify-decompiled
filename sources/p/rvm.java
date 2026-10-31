package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rvm implements svm {
    public final String a;

    public rvm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvm) && this.a.equals(((rvm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
