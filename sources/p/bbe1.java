package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class bbe1 {
    public static final abe1 Companion = new abe1();
    public final String a;

    public /* synthetic */ bbe1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, zae1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbe1) && u890.j(this.a, ((bbe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public bbe1(String str) {
        this.a = str;
    }
}
