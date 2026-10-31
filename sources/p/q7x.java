package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q7x {
    public final String a;

    public q7x(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7x) && u890.j(this.a, ((q7x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
