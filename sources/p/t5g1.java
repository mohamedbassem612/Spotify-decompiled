package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t5g1 {
    public final i1z a;

    public t5g1(i1z i1zVar) {
        this.a = i1zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5g1) && u890.j(this.a, ((t5g1) obj).a);
    }

    public final int hashCode() {
        i1z i1zVar = this.a;
        if (i1zVar == null) {
            return 0;
        }
        return i1zVar.hashCode();
    }
}
