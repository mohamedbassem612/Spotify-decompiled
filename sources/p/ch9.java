package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ch9 implements jh9 {
    public final String a;

    public ch9(String str) {
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
        return (obj instanceof ch9) && u890.j(this.a, ((ch9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
