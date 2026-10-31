package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qcw {
    public final String a;

    public qcw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcw) && u890.j(this.a, ((qcw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
