package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nsd1 implements osd1 {
    public final String a;

    public nsd1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nsd1) && u890.j(this.a, ((nsd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
