package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pue1 implements oh81 {
    public static final LocalDate c = LocalDate.of(2027, 1, 1);
    public final kly0 a;
    public final idd1 b;

    public pue1(of60 of60Var, thq thqVar) {
        this.a = thqVar;
        this.b = new idd1(new x0e1(of60Var, this, (byte) 10));
    }

    public final mr20 a() {
        return (mr20) this.b.getValue();
    }

    public final kh81 b(int i) {
        flx flxVar = flx.c;
        Integer numValueOf = Integer.valueOf(i);
        String str = nik1.y4.a;
        tm81 tm81Var = new tm81(0, 12, "listening_stats", new k7b1(1, this, pue1.class, "newnessExpiryDate", "newnessExpiryDate(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 23), false);
        uzl0 uzl0Var = (uzl0) this.a.get();
        uzl0Var.getClass();
        return new kh81(flxVar, numValueOf, str, tm81Var, new jh81(new mzl0(uzl0Var), ppd1.W0), (nh81) null, 66);
    }
}
