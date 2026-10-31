package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ybu0 {
    public static final wbu0 Companion = new wbu0();
    public final boolean a;
    public final int b;

    public /* synthetic */ ybu0(int i, boolean z, int i2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, vbu0.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = i2;
    }

    public ybu0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
