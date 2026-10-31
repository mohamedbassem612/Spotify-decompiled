package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ihl extends nnb0 {
    public final Object c;
    public final thl d;
    public final shl e;
    public final thl f;
    public final shl g;

    public ihl(Object obj) {
        super(obj);
        this.c = obj;
        this.d = new thl(obj, -2, this);
        this.e = new shl(obj, 0, this);
        this.f = new thl(obj, -1, this);
        this.g = new shl(obj, 1, this);
    }

    @Override // p.nnb0
    public final Object a() {
        return this.c;
    }
}
