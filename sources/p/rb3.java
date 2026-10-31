package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rb3 implements hsw {
    public final /* synthetic */ byte a;
    public final yd91 b;
    public final Object c;
    public final Object d;
    public final mr20 e;

    public rb3(String str, koc0 koc0Var, u6y0 u6y0Var, i5y0 i5y0Var, rg4 rg4Var, wxp wxpVar, y4m1 y4m1Var, qpj1 qpj1Var) {
        this.a = (byte) 2;
        this.c = str;
        this.d = qpj1Var;
        this.e = rqt0.u(hu20.e(rqt0.u(new x010(new fu20(((roc0) koc0Var).d(), new rwm0(u6y0Var, this, (lnm) null, (byte) 16), (byte) 1), u6y0Var.h.o(str), new n93((Object) rg4Var, (Object) i5y0Var, (Object) this, (lnm) null, (byte) 3), (byte) 1)), new c6e0((lnm) null, y4m1Var, this, (byte) 8)));
        this.b = new yd91(3, new shq0(wxpVar, this, (byte) 27));
    }

    @Override // p.xe91
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.b;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        switch (this.a) {
            case 0:
                return this.e;
            case 1:
                return this.e;
            case 2:
                return this.e;
            case 3:
                return this.e;
            case 4:
                return this.e;
            default:
                return (vlj1) this.e;
        }
    }

    public rb3(Context context, koc0 koc0Var, qyo qyoVar) {
        this.a = (byte) 0;
        this.c = context;
        this.d = qyoVar;
        this.b = new yd91(3, new g82(this, (byte) 12));
        this.e = rqt0.u(new gk(((roc0) koc0Var).d(), this, (byte) 20));
    }

    public rb3(String str, koc0 koc0Var, xuq xuqVar, lzn0 lzn0Var, bih1 bih1Var) {
        this.a = (byte) 5;
        this.c = lzn0Var;
        this.d = bih1Var;
        this.e = new vlj1(z4p1.F(((roc0) koc0Var).d(), 1), this, (byte) 7);
        this.b = new yd91(3, new o8e1(xuqVar, this, str, (byte) 25));
    }

    public rb3(String str, koc0 koc0Var, alq alqVar, uqv0 uqv0Var, ags0 ags0Var, u6y0 u6y0Var, qpj1 qpj1Var) {
        this.a = (byte) 3;
        this.c = qpj1Var;
        this.d = ((k511) uqv0Var.b).a(str);
        this.e = rqt0.u(new qsc0(new fu20(((roc0) koc0Var).d(), new i3y0(u6y0Var, str, null, (byte) 0), (byte) 1), ags0Var, str, (byte) 29));
        this.b = new yd91(3, new d4v0(alqVar, str, this, (byte) 9));
    }

    public rb3(k7j0 k7j0Var, String str) {
        this.a = (byte) 1;
        this.c = k7j0Var;
        this.d = str;
        this.b = new yd91(3, new z8i0(this, (byte) 18));
        this.e = new huz(Boolean.TRUE, (byte) 10);
    }

    public rb3(String str, koc0 koc0Var, uqv0 uqv0Var, vf40 vf40Var, vnd1 vnd1Var) {
        this.a = (byte) 4;
        this.c = vf40Var;
        this.d = vnd1Var;
        this.e = h5p1.s(((roc0) koc0Var).d(), ((k511) uqv0Var.b).a(str), vf40Var.a, new py40(4, null, (byte) 3));
        this.b = new yd91(3, new j4f1(this, (byte) 17));
    }
}
