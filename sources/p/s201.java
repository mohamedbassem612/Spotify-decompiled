package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s201 {
    public final String a;

    public s201(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s201) && u890.j(this.a, ((s201) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
