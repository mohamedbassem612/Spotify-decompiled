package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ebx extends l570 {
    public final /* synthetic */ byte b = 0;
    public final qzh c;
    public final vx40 d;
    public final Object e;

    public ebx(x7z x7zVar, qzh qzhVar, vx40 vx40Var) {
        super(qzhVar.getView());
        this.e = x7zVar;
        this.c = qzhVar;
        this.d = vx40Var;
    }

    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        byte b = this.b;
        vx40 vx40Var = this.d;
        Object obj = this.e;
        qzh qzhVar = this.c;
        switch (b) {
            case 0:
                String str = y570Var.n().a.a;
                String str2 = str == null ? "" : str;
                String str3 = y570Var.n().a.b;
                String str4 = str3 == null ? "" : str3;
                ld70 ld70Var = y570Var.k().a.c;
                String str5 = ld70Var != null ? ld70Var.a.c : null;
                String str6 = str5 == null ? "" : str5;
                ld70 ld70Var2 = y570Var.k().a.d;
                String str7 = ld70Var2 != null ? ld70Var2.a.c : null;
                String str8 = str7 == null ? "" : str7;
                String strB = y570Var.g().B("previewImageUri");
                String str9 = strB == null ? "" : strB;
                String strB2 = y570Var.g().B("label");
                if (strB2 == null) {
                    strB2 = y570Var.g().B("premiumLabel");
                }
                String str10 = strB2 == null ? "" : strB2;
                Boolean boolA = y570Var.g().a("hasLabelWithSpotifyLogo");
                boolean zBooleanValue = boolA != null ? boolA.booleanValue() : true;
                Boolean boolA2 = y570Var.g().a("previewImageIsBlurred");
                qzhVar.f(new cy(str2, str4, str6, str9, str8, str10, zBooleanValue, boolA2 != null ? boolA2.booleanValue() : false, ((pe) obj).b(5)));
                qzhVar.n(new jy(l670Var, y570Var, (byte) 2));
                vx40Var.v(y570Var);
                break;
            default:
                x7z x7zVar = (x7z) obj;
                boolean zB = y570Var.g().b("isLocked", false);
                p811 p811Var = new p811();
                ld70 ld70Var3 = y570Var.k().a.c;
                String str11 = ld70Var3 != null ? ld70Var3.a.c : null;
                String str12 = str11 == null ? "" : str11;
                String str13 = y570Var.n().a.a;
                if (str13 == null) {
                    str13 = "";
                }
                String str14 = y570Var.n().a.b;
                if (str14 == null) {
                    str14 = "";
                }
                ld70 ld70Var4 = (pc70) y570Var.k().a.e.get("cover");
                String str15 = ld70Var4 != null ? ld70Var4.a.c : null;
                ydj1 ydj1Var = new ydj1(new xdj1(str15 != null ? str15 : "", y570Var.g().F("coverImageShape", "square").equals("circle") ? 2 : 1), str13, str14);
                String strB3 = y570Var.g().B("restriction");
                p811Var.a = new zdj1(str12, ydj1Var, false, zB, true, strB3 != null ? qqn1.o(strB3) : 0);
                x7zVar.a(yoi1.i(x7zVar.d.a, o6x.a), new xyx(p811Var, this, (byte) 0));
                sc70 sc70Var = (j570) y570Var.j().get("togglePlayStateClick");
                String strB4 = sc70Var != null ? sc70Var.b.c.B("uri") : null;
                if (zB) {
                    qzhVar.f(p811Var.a);
                } else if (strB4 != null) {
                    x7zVar.a((Observable) x7zVar.b.invoke(strB4), new xyx(p811Var, this, (byte) 1));
                }
                qzhVar.n(new lbx(this, y570Var, l670Var, p811Var, (byte) 5));
                vx40Var.v(y570Var);
                break;
        }
    }

    public final void b(int... iArr) {
        byte b = this.b;
    }

    public ebx(pe peVar, qzh qzhVar, vx40 vx40Var) {
        super(qzhVar.getView());
        this.e = peVar;
        this.c = qzhVar;
        this.d = vx40Var;
    }

    private final void c(int... iArr) {
    }

    private final void d(int... iArr) {
    }
}
