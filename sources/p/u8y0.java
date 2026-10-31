package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u8y0 {
    public final qfd a;

    public u8y0(qfd qfdVar) {
        this.a = qfdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8y0) && u890.j(this.a, ((u8y0) obj).a);
    }

    public final int hashCode() {
        qfd qfdVar = this.a;
        if (qfdVar == null) {
            return 0;
        }
        return qfdVar.hashCode();
    }
}
