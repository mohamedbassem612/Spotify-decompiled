package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class hbi1 implements obi1 {
    public static final gbi1 Companion = new gbi1();
    public final String a;

    public /* synthetic */ hbi1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, fbi1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbi1) && u890.j(this.a, ((hbi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public hbi1(String str) {
        this.a = str;
    }
}
