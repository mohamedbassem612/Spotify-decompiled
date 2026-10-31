package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sa50 implements kmt {
    public static final sa50 b = new sa50(0);
    public static final sa50 c = new sa50(1);
    public static final sa50 d = new sa50(2);
    public static final sa50 e = new sa50(3);
    public static final sa50 f = new sa50(4);
    public static final sa50 g = new sa50(5);
    public static final sa50 h = new sa50(6);
    public static final sa50 i = new sa50(7);
    public final /* synthetic */ byte a;

    public /* synthetic */ sa50(byte b2) {
        this.a = b2;
    }

    @Override // p.kmt
    public final c97 a(dkt dktVar) {
        switch (this.a) {
            case 0:
                return new skt(lfb.d(((rjt) dktVar).a), qa50.class);
            case 1:
                return new skt(op71.v((ujt) dktVar), kwf0.class);
            case 2:
                return new pkt(new y3o0((kjt) dktVar, (byte) 3));
            case 3:
                return new skt(mno1.g(), wts0.class);
            case 4:
                return new skt(mno1.g(), uj81.class);
            case 5:
                return new skt(mno1.g(), kk81.class);
            case 6:
                return new skt(vzn1.h((bkt) dktVar), fib1.class);
            default:
                ckt cktVar = (ckt) dktVar;
                Set set = c5l1.S1;
                return new skt(kbb.p(cktVar.a, cktVar.b), c5l1.class);
        }
    }
}
