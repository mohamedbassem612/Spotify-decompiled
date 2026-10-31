package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pdj0 extends jyo1 {
    public final bq21 c;

    public pdj0(bq21 bq21Var) {
        this.c = bq21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdj0) && this.c.equals(((pdj0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
