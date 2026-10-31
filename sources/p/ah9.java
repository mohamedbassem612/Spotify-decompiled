package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ah9 implements jh9 {
    public final String a;

    public ah9(String str) {
        this.a = str;
    }

    @Override // p.jh9
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah9) && u890.j(this.a, ((ah9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
