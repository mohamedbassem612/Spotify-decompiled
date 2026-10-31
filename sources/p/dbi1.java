package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class dbi1 implements obi1 {
    public static final cbi1 Companion = new cbi1();
    public final String a;

    public /* synthetic */ dbi1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, bbi1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbi1) && u890.j(this.a, ((dbi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public dbi1(String str) {
        this.a = str;
    }
}
