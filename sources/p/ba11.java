package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ba11 implements ca11 {
    public final String a;

    public ba11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba11) && u890.j(this.a, ((ba11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
