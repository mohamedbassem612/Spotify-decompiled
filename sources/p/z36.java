package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z36 extends x6 {
    public int c = -1;
    public final /* synthetic */ a46 d;

    public z36(a46 a46Var) {
        this.d = a46Var;
    }

    @Override // p.x6
    public final void a() {
        int i;
        Object[] objArr;
        do {
            i = this.c + 1;
            this.c = i;
            objArr = this.d.a;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.a = (byte) 2;
        } else {
            this.b = objArr[i];
            this.a = (byte) 1;
        }
    }
}
