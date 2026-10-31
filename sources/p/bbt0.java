package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bbt0 implements ebt0 {
    public final String a;

    public bbt0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbt0) && this.a.equals(((bbt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
