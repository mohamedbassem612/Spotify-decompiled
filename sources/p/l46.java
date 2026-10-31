package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l46 implements n46 {
    public final String a;

    public l46(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l46) && u890.j(this.a, ((l46) obj).a);
    }

    @Override // p.n46
    public final String getMessage() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
