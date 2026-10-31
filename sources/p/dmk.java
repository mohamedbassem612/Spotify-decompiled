package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@o661
public final class dmk {
    public static final cmk Companion = new cmk();
    public final String a;

    public /* synthetic */ dmk(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, bmk.a.getDescriptor());
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
        return (obj instanceof dmk) && u890.j(this.a, ((dmk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
