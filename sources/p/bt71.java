package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bt71 implements qku {
    public final dt71 a;
    public final long b;
    public final Object c;
    public final ohd d;

    public bt71(dt71 dt71Var, long j, Object obj, ohd ohdVar) {
        this.a = dt71Var;
        this.b = j;
        this.c = obj;
        this.d = ohdVar;
    }

    @Override // p.qku
    public final void dispose() {
        dt71 dt71Var = this.a;
        synchronized (dt71Var) {
            if (this.b >= dt71Var.q()) {
                Object[] objArr = dt71Var.h;
                objArr.getClass();
                if (mgo1.h(objArr, this.b) == this) {
                    mgo1.i(objArr, this.b, mgo1.a);
                    dt71Var.l();
                }
            }
        }
    }
}
