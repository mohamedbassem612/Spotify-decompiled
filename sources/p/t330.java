package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t330 implements w330 {
    public final yf a;

    public t330(yf yfVar) {
        this.a = yfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t330) && u890.j(this.a, ((t330) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
