package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ial {
    public final cal a;
    public final cal b;

    public ial(cal calVar, cal calVar2) {
        this.a = calVar;
        this.b = calVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ial)) {
            return false;
        }
        ial ialVar = (ial) obj;
        return this.a == ialVar.a && this.b == ialVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
