package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dkb1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dkb1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                PublishSubject publishSubject = ((lkw0) ((fjp0) obj2).b).j;
                u19 u19Var = u19.e;
                if (str != null) {
                    i5w0 i5w0Var = new i5w0(10000L);
                    j5 j5Var = j5.a;
                    publishSubject.onNext(new u19(str, j5Var, j5Var, i5w0Var));
                } else {
                    bhn0.i("Null previewId");
                }
                break;
            case 1:
                arb1 arb1Var = (arb1) obj;
                ((q9u0) obj2).b(new yqb1(arb1Var, (byte) 0), new o2b1(arb1Var, (byte) 2), new zqb1(arb1Var, (byte) 0), new utw0(arb1Var), new yqb1(arb1Var, (byte) 1), new vr51(arb1Var, (byte) 19), new dn81(arb1Var, (byte) 10), new q881(arb1Var, (byte) 12), new zqb1(arb1Var, (byte) 1), new wqb1(arb1Var), new xqb1(arb1Var), new y281(arb1Var, (byte) 13));
                break;
            case 2:
                ((rm5) obj2).H();
                ((wec1) obj).N0.dispose();
                break;
            case 3:
                ((r0d1) obj2).g = ((Boolean) obj).booleanValue();
                break;
            case 4:
                hma1 hma1VarEdit = ((jcd1) obj2).d.edit();
                xxy0.a.getClass();
                hma1VarEdit.d(wxy0.b, (String) obj);
                hma1VarEdit.g();
                break;
            case 5:
                tqw tqwVar = (tqw) obj2;
                if (tqwVar != null) {
                    ((xrn0) ((dpf1) obj).g.get()).a("spotify:local-files", n3o1.y(tqwVar));
                }
                break;
            case 6:
                String str2 = ((mof1) obj2).k;
                if (str2 != null) {
                    jc6 jc6Var = (jc6) ((dpf1) obj).f.get();
                    jc6Var.getClass();
                    a1r0.j(jc6Var.a, l1d.m("spotify:internal:artist-attribution?entityUri=", Uri.encode(str2)), (String) null, (Bundle) null, false, 14);
                    break;
                }
                break;
            case 7:
                iu30 iu30Var = ((mtf1) obj2).X;
                gkf1 gkf1Var = (gkf1) obj;
                hkf1 hkf1Var = gkf1Var.b;
                iu30Var.invoke(new gkf1(gkf1Var.a, new hkf1(true, hkf1Var.b, hkf1Var.c, hkf1Var.d, hkf1Var.e, hkf1Var.f, hkf1Var.g), gkf1Var.c, gkf1Var.d, gkf1Var.e));
                break;
            case 8:
                swa0 swa0Var = (swa0) obj2;
                uxa0 uxa0Var = swa0Var.d.Y;
                if (uxa0Var instanceof uxa0) {
                    tv80 tv80VarW = ((dlg1) obj).w(f0o1.k(uxa0Var));
                    uxa0 uxa0Var2 = swa0Var.d.Y;
                    if (uxa0Var2 instanceof uxa0) {
                        Parcelable.Creator creator = twa0.CREATOR;
                        rzn1.t();
                        swa0Var.d = twa0.N0;
                        String strK = f0o1.k(uxa0Var2);
                        f3b f3bVar = swa0Var.a;
                        int i = swa0Var.d.i;
                        lzn0 lzn0Var = f3bVar.a;
                        lzn0Var.c();
                        for (int i2 = 0; i2 < i; i2++) {
                            lzn0Var.e();
                        }
                        lzn0Var.f(new dwn0(strK, "", false, false, 0, 0, true, null, null, new bwn0(tv80VarW)));
                    }
                } else {
                    eg.m("Not in an AccountTransition flow");
                }
                break;
            case 9:
                hf7 hf7Var = (hf7) obj;
                ((md7) ((t4d1) ((g2x0) obj2).c).b).accept(new jd7(hf7Var.d, hf7Var.e));
                break;
            case 10:
                c5l1 c5l1Var = (c5l1) obj;
                yl8 yl8Var = (nyo1) obj2;
                if (yl8Var instanceof yl8) {
                    yl8 yl8Var2 = yl8Var;
                    kg0.e(c5l1Var.Y0(), new zit(new wwe0(yl8Var2.c, yl8Var2.d)), new ifl1((Object) null, (byte) 25));
                    break;
                } else if (yl8Var instanceof cm8) {
                    kg0.e(c5l1Var.Y0(), new bjt(((cm8) yl8Var).c), new ifl1((Object) null, (byte) 25));
                    break;
                } else if (yl8Var instanceof am8) {
                    am8 am8Var = (am8) yl8Var;
                    kg0.e(c5l1Var.Y0(), new ujt(am8Var.c, am8Var.d, am8Var.e), new ifl1((Object) null, (byte) 25));
                    break;
                } else if (yl8Var instanceof zl8) {
                    kg0.e(c5l1Var.Y0(), new sit(((zl8) yl8Var).c, 14, false), new ifl1((Object) null, (byte) 25));
                    break;
                } else if (!(yl8Var instanceof xl8) && !(yl8Var instanceof bm8)) {
                    eg.o();
                    break;
                }
                break;
            default:
                ((c5l1) obj2).Y0().c(new rjt((String) obj), new ifl1((Object) null, (byte) 25), true);
                break;
        }
    }
}
