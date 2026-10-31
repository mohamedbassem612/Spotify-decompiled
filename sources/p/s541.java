package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s541 implements t541 {
    public final String a;

    public s541(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s541) && u890.j(this.a, ((s541) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
