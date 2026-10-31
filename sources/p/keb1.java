package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class keb1 {
    public final qfd a;

    public keb1(qfd qfdVar) {
        this.a = qfdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof keb1) && u890.j(this.a, ((keb1) obj).a);
    }

    public final int hashCode() {
        qfd qfdVar = this.a;
        if (qfdVar == null) {
            return 0;
        }
        return qfdVar.hashCode();
    }
}
