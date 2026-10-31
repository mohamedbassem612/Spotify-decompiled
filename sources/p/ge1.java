package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class ge1 {
    public static final fe1 Companion = new fe1();
    public final String a;

    public /* synthetic */ ge1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, ee1.a.getDescriptor());
            throw null;
        }
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge1) && u890.j(this.a, ((ge1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
