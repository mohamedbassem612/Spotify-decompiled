package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ak7 {
    public final maa a;

    public ak7(maa maaVar) {
        this.a = maaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak7) && u890.j(this.a, ((ak7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
