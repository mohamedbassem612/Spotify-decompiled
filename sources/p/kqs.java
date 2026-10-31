package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kqs implements qw40 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kqs(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.qw40
    public final void a() {
        switch (this.a) {
            case 0:
                SingleEmitter singleEmitter = (SingleEmitter) this.b;
                if (!singleEmitter.isDisposed()) {
                    singleEmitter.onSuccess(this.c);
                }
                break;
        }
    }

    @Override // p.qw40
    public final void b() {
        t480 t480VarH;
        switch (this.a) {
            case 0:
                break;
            default:
                y380 y380Var = (y380) this.b;
                String str = (String) this.c;
                if (y380Var.d == null) {
                    n7h1 n7h1Var = (n7h1) y380Var.e.getValue();
                    if (n7h1Var != null) {
                        r6h1 r6h1VarA = y380Var.c.a();
                        y6h1 y6h1Var = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-your-library-import-progress";
                        x6h1VarI.f = "1.0.0";
                        x6h1VarI.g = "22.0.0";
                        x6h1 x6h1VarC = x6h1VarI.a().c();
                        x6h1VarC.i.add(new a7h1("failure_dialog", str, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA;
                        ((xjn) k7h1Var).b = r6h1VarA;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        t480VarH = n7h1Var.h(k7h1Var.a());
                    } else {
                        t480VarH = null;
                    }
                    y380Var.d = t480VarH;
                    break;
                }
                break;
        }
    }

    private final void c() {
    }

    private final void d() {
    }
}
