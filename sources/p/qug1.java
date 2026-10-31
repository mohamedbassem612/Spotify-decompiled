package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qug1 extends lug1 {
    public final nps0 d;

    public qug1(nps0 nps0Var) {
        this.d = nps0Var;
    }

    public final Object next() {
        int i = ((lug1) this).c;
        ((lug1) this).c = i + 2;
        Object[] objArr = ((lug1) this).a;
        return new pdn0(this.d, objArr[i], objArr[i + 1]);
    }
}
