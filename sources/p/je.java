package p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class je implements id50 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ je(zd zdVar, md50 md50Var, ef61 ef61Var, sw9 sw9Var) {
        this.a = (byte) 2;
        this.d = zdVar;
        this.b = ef61Var;
        this.c = sw9Var;
    }

    @Override // p.id50
    public final void a(pd50 pd50Var) throws Throwable {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ie ieVar = (ie) obj;
                ((ge) obj3).a(pd50Var);
                if (((AtomicInteger) obj2).incrementAndGet() == 2) {
                    ieVar.run();
                }
                break;
            case 1:
                ie ieVar2 = (ie) obj;
                ((he) obj3).a(pd50Var);
                if (((AtomicInteger) obj2).incrementAndGet() == 2) {
                    ieVar2.run();
                }
                break;
            default:
                zd zdVar = (zd) obj3;
                ef61 ef61Var = (ef61) obj2;
                sw9 sw9Var = (sw9) obj;
                if (!dhn.a.contains(gm5.class)) {
                    try {
                        gm5.e(zdVar, pd50Var, ef61Var, sw9Var);
                    } catch (Throwable th) {
                        dhn.a(gm5.class, th);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ je(id50 id50Var, AtomicInteger atomicInteger, ie ieVar, byte b) {
        this.a = b;
        this.d = id50Var;
        this.b = atomicInteger;
        this.c = ieVar;
    }
}
