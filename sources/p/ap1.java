package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ap1 implements cq1 {
    public final String a;

    public ap1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap1) && u890.j(this.a, ((ap1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
