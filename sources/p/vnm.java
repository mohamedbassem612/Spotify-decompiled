package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vnm {
    public final i1z a;

    public vnm(i1z i1zVar) {
        this.a = i1zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vnm) && u890.j(this.a, ((vnm) obj).a);
    }

    public final int hashCode() {
        i1z i1zVar = this.a;
        if (i1zVar == null) {
            return 0;
        }
        return i1zVar.hashCode();
    }
}
