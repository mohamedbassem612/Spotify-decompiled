package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ndv0 extends up20 {
    public final Object c;

    public ndv0(int i) {
        super(i, (byte) 3);
        this.c = new Object();
    }

    @Override // p.up20
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // p.up20
    public final boolean i(Object obj) {
        boolean zI;
        synchronized (this.c) {
            zI = super.i(obj);
        }
        return zI;
    }
}
