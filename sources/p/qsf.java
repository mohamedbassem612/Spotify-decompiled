package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qsf implements ssf {
    public final String a;

    public qsf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qsf) && u890.j(this.a, ((qsf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
