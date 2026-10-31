package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kvi1 {
    public final String a;

    public kvi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvi1) && this.a.equals(((kvi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
