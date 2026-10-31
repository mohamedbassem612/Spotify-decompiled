package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tj31 implements uj31 {
    public final String a;

    public tj31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj31) && this.a.equals(((tj31) obj).a);
    }

    @Override // p.uj31
    public final String getPath() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
