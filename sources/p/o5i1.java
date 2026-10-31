package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o5i1 implements r5i1 {
    public final String a;

    public o5i1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5i1) && u890.j(this.a, ((o5i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
