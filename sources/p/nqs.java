package p;

import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nqs {
    public final UUID a;
    public final llm b;
    public final z6n c;
    public final z6n d;
    public final n7m e;
    public boolean f;
    public final bpb1 g;
    public final dt71 h;
    public snb1 i;
    public final ve01 j;
    public final any k;
    public boolean l;

    public nqs(UUID uuid, llm llmVar, z6n z6nVar, z6n z6nVar2, n7m n7mVar) {
        this.a = uuid;
        this.b = llmVar;
        this.c = z6nVar;
        this.d = z6nVar2;
        this.e = n7mVar;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.g = bpb1VarB;
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        this.h = dt71VarE;
        this.j = d5p1.g(dt71VarE);
        this.k = new any(bpb1VarB, (byte) 18);
    }

    public final void a() {
        this.c.invoke(this, (Object) null);
    }

    public final ve01 b() {
        return this.j;
    }

    public final c9n c() {
        return this.b;
    }

    public final boolean d() {
        return this.l;
    }

    public final Object e(kub1 kub1Var, onm onmVar) {
        if (!this.l) {
            smo1.p(this.b, (CancellationException) null);
            this.l = true;
            boolean z = this.f;
            bh91 bh91Var = bh91.c;
            bh91 bh91Var2 = z ? bh91Var : bh91.d;
            if (kub1Var == null) {
                kub1Var = bh91Var2 == bh91Var ? kub1.h : kub1.c;
            }
            Object objJ = j(bh91Var2, kub1Var, onmVar);
            if (objJ == d9n.a) {
                return objJ;
            }
        }
        return rih1.a;
    }

    public final Object f(lor lorVar) {
        this.f = true;
        Object objJ = j(bh91.b, null, lorVar);
        return objJ == d9n.a ? objJ : rih1.a;
    }

    public final Object g(lor lorVar) {
        Object objJ = j(bh91.a, null, lorVar);
        return objJ == d9n.a ? objJ : rih1.a;
    }

    public final void h() {
        this.d.invoke(this, 1500L);
    }

    public final void i(snb1 snb1Var) {
        this.i = snb1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(bh91 bh91Var, kub1 kub1Var, onm onmVar) {
        mqs mqsVar;
        if (onmVar instanceof mqs) {
            mqsVar = (mqs) onmVar;
            int i = mqsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqsVar.e = i - Integer.MIN_VALUE;
            } else {
                mqsVar = new mqs(this, onmVar);
            }
        } else {
            mqsVar = new mqs(this, onmVar);
        }
        Object obj = mqsVar.c;
        int i2 = mqsVar.e;
        kub1 kub1Var2 = null;
        d9n d9nVar = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            mqsVar.a = bh91Var;
            mqsVar.b = kub1Var;
            mqsVar.e = 1;
            this.g.emit(bh91Var, mqsVar);
            d9n d9nVar2 = d9n.a;
            if (d9nVar == d9nVar2) {
                return d9nVar2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kub1Var = mqsVar.b;
            bh91Var = mqsVar.a;
            hm5.M(obj);
        }
        int iOrdinal = bh91Var.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return null;
            }
            if (kub1Var != null && f46.M(kub1Var.b, bh91Var)) {
                kub1Var2 = kub1Var;
            }
            if (kub1Var2 == null) {
                kub1Var2 = kub1.N0;
            }
        }
        this.e.invoke(bh91Var, kub1Var2);
        return d9nVar;
    }
}
