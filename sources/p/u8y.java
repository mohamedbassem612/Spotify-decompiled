package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u8y implements v8y {
    public final kw9 a;

    public u8y(kw9 kw9Var) {
        this.a = kw9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8y) && this.a.equals(((u8y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
