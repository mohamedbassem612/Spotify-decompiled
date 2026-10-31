package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class ucu0 {
    public static final tcu0 Companion = new tcu0();
    public final String a;

    public /* synthetic */ ucu0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, scu0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ucu0) && u890.j(this.a, ((ucu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ucu0(String str) {
        this.a = str;
    }
}
