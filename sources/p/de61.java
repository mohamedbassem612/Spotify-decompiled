package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class de61 implements ie61 {
    public final String a;

    public de61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de61) && u890.j(this.a, ((de61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
