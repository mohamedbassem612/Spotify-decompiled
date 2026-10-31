package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ogi1 implements qgi1 {
    public final j2i a;

    public ogi1(j2i j2iVar) {
        this.a = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogi1) && this.a == ((ogi1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
