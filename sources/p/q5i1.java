package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q5i1 implements r5i1 {
    public final String a;

    public q5i1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5i1) && u890.j(this.a, ((q5i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
