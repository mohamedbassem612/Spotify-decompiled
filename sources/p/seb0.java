package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class seb0 {
    public static final reb0 Companion = new reb0();
    public final String a;

    public /* synthetic */ seb0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, qeb0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof seb0) && u890.j(this.a, ((seb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public seb0(String str) {
        this.a = str;
    }
}
