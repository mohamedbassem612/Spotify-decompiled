package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class mnw {
    public static final lnw Companion = new lnw();
    public final String a;

    public /* synthetic */ mnw(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, knw.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnw) && u890.j(this.a, ((mnw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
