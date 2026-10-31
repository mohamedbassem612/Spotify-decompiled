package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s790 implements u790 {
    public final String a;

    public s790(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s790) && this.a.equals(((s790) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
