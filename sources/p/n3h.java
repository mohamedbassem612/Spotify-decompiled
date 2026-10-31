package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class n3h {
    public static final m3h Companion = new m3h();
    public final p3h a;

    public /* synthetic */ n3h(int i, p3h p3hVar) {
        if (1 == (i & 1)) {
            this.a = p3hVar;
        } else {
            o6p1.t(i, 1, l3h.a.getDescriptor());
            throw null;
        }
    }

    public final p3h a() {
        return this.a;
    }

    public n3h(p3h p3hVar) {
        this.a = p3hVar;
    }
}
