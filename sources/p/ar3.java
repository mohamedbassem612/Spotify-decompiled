package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ar3 extends hr3 {
    public final dia1 a;

    public ar3(dia1 dia1Var) {
        this.a = dia1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar3) && this.a == ((ar3) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
