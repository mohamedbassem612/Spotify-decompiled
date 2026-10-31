package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ujp0 implements kku {
    public final Object a;
    public boolean b = true;
    public final /* synthetic */ iti1 c;

    public ujp0(iti1 iti1Var, Object obj) {
        this.c = iti1Var;
        this.a = obj;
    }

    public final void dispose() {
        if (this.b) {
            this.b = false;
            iti1 iti1Var = this.c;
            if (iti1Var.b == 0) {
                ((wdn0) iti1Var.c).k(this);
            } else {
                iti1Var.a = true;
            }
        }
    }
}
