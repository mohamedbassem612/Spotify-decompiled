package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k631 extends iaa0 {
    public final laa0 g;

    public k631(laa0 laa0Var) {
        this.g = laa0Var;
    }

    public final boolean k() {
        return false;
    }

    public final void l(Throwable th) {
        Object objG0 = j().g0();
        boolean z = objG0 instanceof nyh;
        laa0 laa0Var = this.g;
        if (z) {
            laa0Var.resumeWith(new m231(((nyh) objG0).a));
        } else {
            laa0Var.resumeWith(j1e1.D(objG0));
        }
    }
}
