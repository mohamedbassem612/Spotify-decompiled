package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eg71 extends tg71 {
    public final va71 a;

    public eg71(va71 va71Var) {
        this.a = va71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg71) && u890.j(this.a, ((eg71) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
