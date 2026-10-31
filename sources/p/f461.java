package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class f461 {
    public static final e461 Companion = new e461();
    public final ibf a;

    public /* synthetic */ f461(int i, ibf ibfVar) {
        if (1 == (i & 1)) {
            this.a = ibfVar;
        } else {
            o6p1.t(i, 1, d461.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f461) && u890.j(this.a, ((f461) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
