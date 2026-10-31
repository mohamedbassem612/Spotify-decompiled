package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ku80 extends sj1 {
    public final String i;

    public ku80(String str) {
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku80) && this.i.equals(((ku80) obj).i);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }
}
