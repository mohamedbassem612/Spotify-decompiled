package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class hgd {
    public static final ggd Companion = new ggd();
    public final String a;

    public /* synthetic */ hgd(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, fgd.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgd) && u890.j(this.a, ((hgd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public hgd(String str) {
        this.a = str;
    }
}
