package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yg9 implements jh9 {
    public final String a;

    public yg9(String str) {
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
        return (obj instanceof yg9) && u890.j(this.a, ((yg9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
