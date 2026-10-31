package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jjo implements njo {
    public final njo a;

    public jjo(njo njoVar) {
        this.a = njoVar;
    }

    @Override // p.njo
    public final boolean a() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjo) && this.a.equals(((jjo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
