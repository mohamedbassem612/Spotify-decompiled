package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class cbh {
    public static final kiv a = new kiv(new xh3((byte) 15), (byte) 1);

    public static final long a(long j, b0k b0kVar) {
        long jA;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-583917585);
        bbh bbhVar = (bbh) x340Var.k(a);
        long jB = bbhVar.b();
        hrr0 hrr0Var = bbhVar.i;
        hrr0 hrr0Var2 = bbhVar.h;
        int i = u7h.l;
        if (z4h1.b(j, jB) || z4h1.b(j, ((u7h) bbhVar.b.getValue()).a)) {
            jA = ((u7h) hrr0Var2.getValue()).a;
        } else if (z4h1.b(j, ((u7h) bbhVar.c.getValue()).a) || z4h1.b(j, ((u7h) bbhVar.d.getValue()).a)) {
            jA = ((u7h) hrr0Var.getValue()).a;
        } else if (z4h1.b(j, ((u7h) bbhVar.e.getValue()).a)) {
            jA = ((u7h) bbhVar.j.getValue()).a;
        } else if (z4h1.b(j, bbhVar.c())) {
            jA = bbhVar.a();
        } else {
            jA = z4h1.b(j, ((u7h) bbhVar.g.getValue()).a) ? ((u7h) bbhVar.l.getValue()).a : u7h.k;
        }
        if (jA == 16) {
            jA = ((u7h) x340Var.k(xrl.a)).a;
        }
        x340Var.r(false);
        return jA;
    }
}
