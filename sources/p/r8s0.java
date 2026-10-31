package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class r8s0 {
    public static final q8s0 Companion = new q8s0();
    public final String a;

    public /* synthetic */ r8s0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, p8s0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8s0) && u890.j(this.a, ((r8s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public r8s0(String str) {
        this.a = str;
    }
}
