package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g251 extends i251 {
    public final String a;

    public g251(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g251) && u890.j(this.a, ((g251) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
