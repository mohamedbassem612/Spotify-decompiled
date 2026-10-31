package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oit0 {
    public final qfd a;

    public oit0(qfd qfdVar) {
        this.a = qfdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oit0) && u890.j(this.a, ((oit0) obj).a);
    }

    public final int hashCode() {
        qfd qfdVar = this.a;
        if (qfdVar == null) {
            return 0;
        }
        return qfdVar.hashCode();
    }
}
