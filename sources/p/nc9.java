package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nc9 implements bgd {
    public final mc9[] a;

    public nc9(mc9[] mc9VarArr) {
        this.a = mc9VarArr;
    }

    @Override // p.bgd
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (mc9 mc9Var : this.a) {
            qku qkuVar = mc9Var.h;
            if (qkuVar == null) {
                u890.C("handle");
                throw null;
            }
            qkuVar.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
