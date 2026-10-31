package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mu51 {
    public final Object a;
    public final xu30 b;
    public final xu30 c;
    public final Object d;
    public final a8d1 e;
    public final xu30 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ ou51 i;

    public mu51(ou51 ou51Var, Object obj, xu30 xu30Var, xu30 xu30Var2, Object obj2, a8d1 a8d1Var, xu30 xu30Var3) {
        this.i = ou51Var;
        this.a = obj;
        this.b = xu30Var;
        this.c = xu30Var2;
        this.d = obj2;
        this.e = a8d1Var;
        this.f = xu30Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof hp51) {
            ((hp51) obj).h(this.h, this.i.a);
            return;
        }
        qku qkuVar = obj instanceof qku ? (qku) obj : null;
        if (qkuVar != null) {
            qkuVar.dispose();
        }
    }
}
