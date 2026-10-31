package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ocn implements tcn {
    public final t5u a;

    public ocn(t5u t5uVar) {
        this.a = t5uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ocn) && this.a == ((ocn) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
