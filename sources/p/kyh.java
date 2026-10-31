package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class kyh {
    public static final jyh Companion = new jyh();
    public final String a;

    public /* synthetic */ kyh(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, iyh.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyh) && u890.j(this.a, ((kyh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public kyh(String str) {
        this.a = str;
    }
}
