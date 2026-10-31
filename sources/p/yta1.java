package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yta1 implements h0r0 {
    public final dua1 a;
    public final los b;
    public final qyj c;
    public final esa1 d;
    public final pwa1 e;
    public final cwu0 f;
    public final rss g;
    public final lzn0 h;
    public final u9c0 i;
    public final cbr0 j;
    public final fua1 k;
    public boolean l;
    public final vta1 m;
    public final vta1 n;
    public final vta1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vta1 f103p;
    public final vta1 q;

    public yta1(dua1 dua1Var, los losVar, qyj qyjVar, esa1 esa1Var, pwa1 pwa1Var, cwu0 cwu0Var, rss rssVar, lzn0 lzn0Var, u9c0 u9c0Var, cbr0 cbr0Var) {
        fua1 fua1VarA;
        this.a = dua1Var;
        this.b = losVar;
        this.c = qyjVar;
        this.d = esa1Var;
        this.e = pwa1Var;
        this.f = cwu0Var;
        this.g = rssVar;
        this.h = lzn0Var;
        this.i = u9c0Var;
        this.j = cbr0Var;
        if (dua1Var instanceof bua1) {
            fua1VarA = fua1.a;
        } else if (dua1Var instanceof aua1) {
            fua1VarA = ((aua1) dua1Var).a();
        } else {
            if (!(dua1Var instanceof cua1)) {
                eg.o();
                throw null;
            }
            fua1VarA = fua1.d;
        }
        this.k = fua1VarA;
        this.m = new vta1(this, (byte) 2);
        this.n = new vta1(this, (byte) 6);
        this.o = new vta1(this, (byte) 4);
        this.f103p = new vta1(this, (byte) 8);
        this.q = new vta1(this, (byte) 1);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.j;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.c.a(apo.j(1649967983, new wh91(this, (byte) 11), true));
    }

    public final void c(Function0 function0) {
        if (this.l) {
            return;
        }
        this.l = true;
        function0.invoke();
        this.b.a(ixb.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, dwu0 dwu0Var, boolean z, onm onmVar) {
        xta1 xta1Var;
        Object objA;
        if (onmVar instanceof xta1) {
            xta1Var = (xta1) onmVar;
            int i = xta1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                xta1Var.f = i - Integer.MIN_VALUE;
            } else {
                xta1Var = new xta1(this, onmVar);
            }
        } else {
            xta1Var = new xta1(this, onmVar);
        }
        Object obj = xta1Var.d;
        int i2 = xta1Var.f;
        if (i2 == 0) {
            hm5.M(obj);
            xta1Var.a = str;
            xta1Var.b = dwu0Var;
            xta1Var.c = z;
            xta1Var.f = 1;
            objA = this.f.a(str, dwu0Var, xta1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = xta1Var.c;
            dwu0Var = xta1Var.b;
            str = xta1Var.a;
            hm5.M(obj);
            objA = ((e331) obj).a;
        }
        Throwable thA = e331.a(objA);
        rss rssVar = this.g;
        if (thA == null) {
            if (z) {
                rssVar.a(new yva1(dwu0Var), new m551(this, str, dwu0Var, (byte) 20));
            }
        } else {
            rss.b(rssVar);
        }
        return rih1.a;
    }
}
