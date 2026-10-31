package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l1n1 extends q1n1 {
    public final String a;

    public l1n1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1n1) && u890.j(this.a, ((l1n1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
