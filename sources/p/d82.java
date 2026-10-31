package p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d82 implements r2g {
    public final /* synthetic */ byte a;
    public final String b;
    public final yd91 c;
    public final jly0 d;
    public final Object e;
    public final Object f;
    public final l381 g;

    public d82(koc0 koc0Var, String str, jwo jwoVar, xvo xvoVar) {
        this.a = (byte) 0;
        this.b = str;
        this.d = jwoVar;
        this.c = new yd91(3, new g3(this, (byte) 29));
        this.e = rqt0.u(new x010(rqt0.u(new x72(((roc0) koc0Var).d(), (byte) 1)), yoi1.g(xvoVar.a(true)), new a82(3, (lnm) null, (byte) 0), (byte) 1));
        this.f = w3p1.o(new l4r(pwc0.b, 1, ny1.S0, new j4r(new jm1(this, (byte) 11)), ny1.T0), ny1.Q0);
        this.g = new b82(this);
    }

    public static boolean a(List list) {
        String str;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Object obj : list2) {
            if (obj instanceof j7e0) {
                String str2 = (String) ((j7e0) obj).a.g.get("recsplanation");
                if (str2 != null && str2.length() > 0) {
                    return true;
                }
            } else if ((obj instanceof pvc0) && (str = (String) ((pvc0) obj).f.get("recsplanation")) != null && str.length() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p.xe91
    public final l381 c() {
        switch (this.a) {
            case 0:
                return (b82) this.g;
            case 1:
                return (jsm) this.g;
            default:
                return (aa3) this.g;
        }
    }

    @Override // p.xe91
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        switch (this.a) {
            case 0:
                return (mr20) this.e;
            case 1:
                return (qbk) this.f;
            default:
                return (a1b1) this.e;
        }
    }

    @Override // p.r2g
    public final Integer i() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 1;
            default:
                return 1;
        }
    }

    public d82(String str, d0r d0rVar, j7p j7pVar, oum oumVar) {
        this.a = (byte) 1;
        this.b = str;
        this.d = j7pVar;
        this.e = oumVar.a();
        this.c = new yd91(3, new j3m(this, (byte) 11));
        this.f = new qbk(d3p1.F(d0rVar, w3p1.o(new l4r(jd0.j, 2, crm.P0, new j4r(new gsm(this, (byte) 0)), crm.Q0), hsm.a), str), this, (byte) 17);
        this.g = new jsm(this);
    }

    public d82(String str, koc0 koc0Var, hsq hsqVar) {
        this.a = (byte) 2;
        this.b = str;
        this.d = hsqVar;
        this.c = new yd91(3, new j4f1(this, (byte) 19));
        this.e = new a1b1(((roc0) koc0Var).c(), this, (byte) 18);
        this.f = w3p1.o(new l4r(hvm.c, 1, ppg1.b, new j4r(new ymg1(this, (byte) 3)), ppg1.c), zdg1.d1);
        this.g = new aa3(this);
    }
}
