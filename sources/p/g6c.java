package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class g6c {
    public static final f6c Companion = new f6c();
    public final String a;

    public /* synthetic */ g6c(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, e6c.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6c) && u890.j(this.a, ((g6c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public g6c(String str) {
        this.a = str;
    }
}
