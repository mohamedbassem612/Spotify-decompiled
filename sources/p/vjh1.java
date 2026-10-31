package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class vjh1 {
    public static final ujh1 Companion = new ujh1();
    public final String a;

    public /* synthetic */ vjh1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, tjh1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjh1) && u890.j(this.a, ((vjh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
