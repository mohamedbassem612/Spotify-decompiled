package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class shn1 extends k5n1 {
    public int b;
    public final int c;
    public final /* synthetic */ ain1 d;

    public shn1(ain1 ain1Var) {
        super((byte) 2);
        this.d = ain1Var;
        this.b = 0;
        this.c = ain1Var.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }

    @Override // p.k5n1
    public final byte zza() {
        int i = this.b;
        if (i < this.c) {
            this.b = i + 1;
            return this.d.e(i);
        }
        hhg1.k();
        return (byte) 0;
    }
}
