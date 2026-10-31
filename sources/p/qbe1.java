package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qbe1 implements sbe1 {
    public final String a;

    public qbe1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbe1) && u890.j(this.a, ((qbe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
