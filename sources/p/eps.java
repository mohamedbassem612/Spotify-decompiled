package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class eps implements lps {
    public static final dps Companion = new dps();
    public final String a;

    public /* synthetic */ eps(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, cps.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eps) && u890.j(this.a, ((eps) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public eps(String str) {
        this.a = str;
    }
}
