package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tap {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ tap(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ac10 a(String str) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                uap uapVar = (uap) ((d7p) ykqVar).c;
                uu00 uu00VarA = ((ras) uapVar.H).A();
                c8o.l(uu00VarA);
                return new ac10(uu00VarA, ((ras) uapVar.H).k1(), str, (byte) 2);
            case 1:
                u9p u9pVar = (u9p) ((chp) ykqVar).c;
                uu00 uu00VarA2 = ((ys10) u9pVar.C).A();
                c8o.l(uu00VarA2);
                return new ac10(uu00VarA2, ((ys10) u9pVar.C).k1(), str, (byte) 2);
            case 2:
                iip iipVar = (iip) ((chp) ykqVar).c;
                uu00 uu00VarA3 = iipVar.a.A();
                c8o.l(uu00VarA3);
                return new ac10(uu00VarA3, iipVar.a.k1(), str, (byte) 2);
            case 3:
                fyp fypVar = (fyp) ((ywp) ykqVar).c;
                uu00 uu00VarA4 = fypVar.a.A();
                c8o.l(uu00VarA4);
                return new ac10(uu00VarA4, fypVar.a.k1(), str, (byte) 2);
            case 4:
                daq daqVar = ((p2q) ykqVar).b;
                return new ac10((uu00) daqVar.a5.get(), daqVar.c2(), str, (byte) 2);
            case 5:
                daq daqVar2 = ((p2q) ykqVar).b;
                return new ac10((uu00) daqVar2.a5.get(), daqVar2.c2(), str, (byte) 2);
            default:
                ynq ynqVar = (ynq) ykqVar.c;
                uu00 uu00VarA5 = ynqVar.a.A();
                c8o.l(uu00VarA5);
                return new ac10(uu00VarA5, ynqVar.a.k1(), str, (byte) 2);
        }
    }
}
