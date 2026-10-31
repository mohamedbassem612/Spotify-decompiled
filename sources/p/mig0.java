package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mig0 {
    public final fpt a;

    public mig0(fpt fptVar) {
        this.a = fptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mig0) && u890.j(this.a, ((mig0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
