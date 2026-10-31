package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qaw0 implements raw0 {
    public final String a;

    public qaw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qaw0) && this.a.equals(((qaw0) obj).a);
    }

    @Override // p.raw0
    public final String getIdentifier() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
