package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class r080 {
    public static final q080 Companion = new q080();
    public final String a;

    public /* synthetic */ r080(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, p080.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r080) && u890.j(this.a, ((r080) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
