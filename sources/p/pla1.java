package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pla1 implements rla1 {
    public final Throwable a;

    public pla1(Throwable th) {
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pla1) && u890.j(this.a, ((pla1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
