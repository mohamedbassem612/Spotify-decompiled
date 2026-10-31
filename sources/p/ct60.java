package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ct60 extends jto1 {
    public final String b;

    public ct60(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ct60) && u890.j(this.b, ((ct60) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
