package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k71 extends n71 {
    public final String a;

    public k71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k71) && this.a.equals(((k71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
