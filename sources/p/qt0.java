package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qt0 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;
    public final Object c;

    public qt0(fo4 fo4Var) {
        this.a = (byte) 5;
        this.c = fo4Var;
        this.b = Collections.singleton(blc0.O4);
    }

    public final Set a() {
        byte b = this.a;
        return this.b;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return nt0.class;
            case 1:
                return r5e.class;
            case 2:
                return vsm.class;
            case 3:
                return nwg0.class;
            case 4:
                return uff.class;
            case 5:
                return qyd1.class;
            default:
                return avh1.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        byte b = this.a;
        aqr0 aqr0Var = aqr0.a;
        switch (b) {
            case 0:
            case 1:
                return aqr0Var;
            case 2:
                String strZ = s4b1Var.z();
                String str = strZ == null ? "" : strZ;
                String strO = s4b1Var.o(2);
                if (strO == null) {
                    strO = "";
                }
                String strConcat = "spotify:contribution:".concat(strO);
                String strN = s4b1Var.n("list_item_id");
                String strN2 = s4b1Var.n("context_uri");
                String str2 = strN2 == null ? "" : strN2;
                String strN3 = s4b1Var.n("item_uri");
                return new xsm(str, strConcat, strN, str2, strN3 == null ? "" : strN3);
            case 3:
                iug0 iug0Var = (iug0) ila0.s(intent, "extra_marquee", iug0.class);
                if (iug0Var != null) {
                    return new qwg0(iug0Var);
                }
                eg.m("Marquee data required");
                return null;
            case 4:
                String strB = pcf.b(s4b1Var);
                if (strB != null) {
                    String strZ2 = s4b1Var.z();
                    return new tgf(strZ2 == null ? "" : strZ2, new ogf(strB), th61Var.a, (String) null, (t7q0) null, (jqf) null, 56);
                }
                hhg1.n("Chat ID cannot be null");
                return null;
            case 5:
                return new syd1();
            default:
                i7w0 i7w0Var = i7w0.h;
                jrr0 jrr0VarC = i7w0.c(intent.getExtras());
                if (jrr0VarC == null) {
                    jrr0VarC = new jrr0(3, 0, bm41.a);
                }
                return new evh1(iko1.t(jrr0VarC), jrr0VarC.a(), i7w0Var.d(intent.getExtras()));
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new c6w0(1, false, (hd5) null, 14);
            case 1:
                return a6w0.a;
            case 2:
                return new b6w0(true);
            case 3:
                return new c6w0(2, false, (hd5) null, 14);
            case 4:
                return new b6w0(true);
            case 5:
                return new b6w0(true);
            default:
                return new b6w0(true);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "The URI template for the Splash Ad page. The app may navigate to this page first when it is opened.";
            case 1:
                return "Page API implementation of notification settings categories";
            case 2:
                return "Bottom sheet displaying the full text of a contribution note";
            case 3:
                return "Marquee ad overlay";
            case 4:
                return "A bottom sheet route for presenting a chat as a modal overlay";
            case 5:
                return "Comment terms bottom sheet shown before users can post their first comment";
            default:
                return "Bottom sheet to choose update schedule";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((a44) obj).g();
            case 1:
                return ((oto0) obj).a.b();
            case 2:
                oum oumVar = (oum) obj;
                return oumVar.b || oumVar.c;
            case 3:
                return ((tm4) ((kly0) obj).get()).b();
            case 4:
                return ((add) obj).a.h();
            case 5:
                return ((fo4) obj).c();
            default:
                return ((i5y0) obj).e();
        }
    }

    public qt0(add addVar) {
        this.a = (byte) 4;
        this.c = addVar;
        this.b = Collections.singleton(blc0.p3);
    }

    public qt0(oum oumVar) {
        this.a = (byte) 2;
        this.c = oumVar;
        this.b = Collections.singleton(blc0.H5);
    }

    public qt0(oto0 oto0Var) {
        this.a = (byte) 1;
        this.c = oto0Var;
        this.b = Collections.singleton(blc0.c5);
    }

    public qt0(gbp gbpVar) {
        this.a = (byte) 3;
        this.c = gbpVar;
        this.b = Collections.singleton(blc0.lb);
    }

    public qt0(i5y0 i5y0Var) {
        this.a = (byte) 6;
        this.c = i5y0Var;
        this.b = Collections.singleton(blc0.Xa);
    }

    public qt0(a44 a44Var) {
        this.a = (byte) 0;
        this.c = a44Var;
        this.b = Collections.singleton(blc0.S0);
    }
}
