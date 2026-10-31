package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s330 implements w330 {
    public final yf a;

    public s330(yf yfVar) {
        this.a = yfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s330) && u890.j(this.a, ((s330) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
