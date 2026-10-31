package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s12 extends ti {
    public final String b;

    public s12(String str) {
        super(str);
        this.b = str;
    }

    @Override // p.ti
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s12) && this.b.equals(((s12) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
