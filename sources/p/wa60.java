package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wa60 implements ya60 {
    public final String a;

    public wa60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa60) && this.a.equals(((wa60) obj).a);
    }

    @Override // p.ya60
    public final String getImageUrl() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
