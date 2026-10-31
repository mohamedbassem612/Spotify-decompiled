package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yxw extends ayw {
    public final qxw a;

    public yxw(qxw qxwVar) {
        this.a = qxwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxw) && this.a.equals(((yxw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
