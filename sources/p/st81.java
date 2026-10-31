package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class st81 implements ut81 {
    public final String a;

    public st81(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof st81) && u890.j(this.a, ((st81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
