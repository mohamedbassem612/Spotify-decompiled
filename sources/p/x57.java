package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x57 implements vi0 {
    public final String a;

    public x57(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x57) && u890.j(this.a, ((x57) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
