package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rug1 extends mug1 {
    public final nps0 d;

    public rug1(nps0 nps0Var) {
        this.d = nps0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new qdn0(this.d, objArr[i], objArr[i + 1]);
    }
}
