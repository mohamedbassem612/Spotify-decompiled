package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xa60 implements ya60 {
    public final String a;

    public xa60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa60) && this.a.equals(((xa60) obj).a);
    }

    @Override // p.ya60
    public final String getImageUrl() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
