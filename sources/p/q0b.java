package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class q0b {
    public static final p0b Companion = new p0b();
    public final String a;

    public /* synthetic */ q0b(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, o0b.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0b) && u890.j(this.a, ((q0b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public q0b(String str) {
        this.a = str;
    }
}
