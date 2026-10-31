package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q5c1 implements t5c1 {
    public final String a;

    public q5c1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5c1) && u890.j(this.a, ((q5c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
