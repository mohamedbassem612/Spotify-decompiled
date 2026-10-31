package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class d5u extends zct {
    public int m;

    public d5u(xpl1 xpl1Var) {
        super(xpl1Var);
        if (xpl1Var instanceof ur60) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // p.zct
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (xct xctVar : this.k) {
            xctVar.a(xctVar);
        }
    }
}
