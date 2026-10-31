package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d271 extends hxo1 {
    public final qz61 c;

    public d271(qz61 qz61Var) {
        this.c = qz61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d271) && u890.j(this.c, ((d271) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String p() {
        return String.valueOf(this.c.b.a);
    }
}
