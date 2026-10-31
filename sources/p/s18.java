package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s18 implements w18 {
    public final String a;

    public s18(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s18) && this.a.equals(((s18) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
