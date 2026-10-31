package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q540 implements s540 {
    public final q7y a;

    public q540(q7y q7yVar) {
        this.a = q7yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q540) && this.a.equals(((q540) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
