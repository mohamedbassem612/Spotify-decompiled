package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m6e implements q6e {
    public final j6e a;

    public m6e(j6e j6eVar) {
        this.a = j6eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6e) && this.a.equals(((m6e) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
