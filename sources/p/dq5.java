package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class dq5 extends cv5 {
    public static final cq5 Companion = new cq5();
    public Boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq5) && u890.j(this.b, ((dq5) obj).b);
    }

    public final int hashCode() {
        Boolean bool = this.b;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
