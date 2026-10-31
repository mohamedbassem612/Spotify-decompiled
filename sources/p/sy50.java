package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sy50 implements uy50 {
    public final String a;

    public sy50(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy50) && u890.j(this.a, ((sy50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
