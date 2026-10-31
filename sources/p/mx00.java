package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mx00 implements lx00 {
    public final String a;

    public mx00(String str) {
        this.a = str;
    }

    @Override // p.lx00
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mx00) && u890.j(this.a, ((mx00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
