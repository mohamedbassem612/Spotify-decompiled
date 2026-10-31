package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class akt implements dkt {
    public final eo81 a;

    public akt(eo81 eo81Var) {
        this.a = eo81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akt) && u890.j(this.a, ((akt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
