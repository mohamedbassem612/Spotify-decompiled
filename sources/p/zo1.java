package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zo1 implements cq1 {
    public final String a;

    public zo1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo1) && u890.j(this.a, ((zo1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
