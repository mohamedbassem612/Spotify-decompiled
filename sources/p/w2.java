package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w2 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public w2(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(blc0.pc);
                break;
            case 2:
                this.b = Collections.singleton(blc0.pb);
                break;
            case 3:
                this.b = Collections.singleton(blc0.j2);
                break;
            case 4:
                this.b = Collections.singleton(blc0.Kg);
                break;
            default:
                this.b = dm61.z0(new blc0[]{blc0.n2, blc0.Og});
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        xj61 xj61Var = this.b;
        switch (b) {
        }
        return xj61Var;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return p2.class;
            case 1:
                return biz.class;
            case 2:
                return bth0.class;
            case 3:
                return vd01.class;
            case 4:
                return cj71.class;
            default:
                return p8r0.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                String strZ = s4b1Var.z();
                Uri uri = s4b1Var.a;
                int iOrdinal = s4b1Var.c.ordinal();
                if (iOrdinal != 89 && iOrdinal != 843) {
                    uh61.i(uri, "\" is not supported");
                    return null;
                }
                String strZ2 = s4b1Var.z();
                if (strZ2 == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                String lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
                if (lastPathSegment != null) {
                    strZ2 = strZ2.substring(0, ihc1.B0(strZ2, lastPathSegment, 0, 6) - 1);
                }
                return new u2(strZ, strZ2);
            case 1:
                return f(s4b1Var);
            case 2:
                zsh0 zsh0VarC = uj1.c(intent.getExtras());
                return zsh0VarC == null ? new zsh0(0, 3, 0) : zsh0VarC;
            case 3:
                String stringExtra = intent.getStringExtra("showUri");
                return new xd01(stringExtra != null ? stringExtra : "");
            case 4:
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return new gj71(h0p1.u(extras));
                }
                hhg1.n("Intent has no extras bundle");
                return null;
            default:
                String strO = s4b1Var.o(2);
                String str = strO != null ? strO : "";
                return new q8r0(s4b1Var.l(), str, "spotify:show:".concat(str));
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            case 1:
                return a6w0.a;
            case 2:
                return new b6w0(true);
            case 3:
                return new c6w0(1, true, (hd5) null, 12);
            case 4:
                return new b6w0(true);
            default:
                return new c6w0(3, false, ed5.c, 8);
        }
    }

    public eiz f(s4b1 s4b1Var) {
        Uri uri = s4b1Var.a;
        String strJ = s4b1Var.j();
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        return new eiz(ozn1.q(uri != null ? uri.getQueryParameter("errorType") : null), str, "spotify:show:".concat(str), uri != null ? uri.getQueryParameter("debugMessage") : null, dj20.j(s4b1Var));
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Page to show expanded description of entities";
            case 1:
                return "Page Match error page when no match is found";
            case 2:
                return "Media picker bottom sheet";
            case 3:
                return "E-reader page";
            case 4:
                return "The actual bottom sheet for the share destinations";
            default:
                return "Page Match bottom sheet host page";
        }
    }

    public w2(w8r0 w8r0Var) {
        this.a = (byte) 5;
        xj61 xj61Var = new xj61();
        if (!w8r0Var.a()) {
            xj61Var.add(blc0.qc);
            xj61Var.add(blc0.pc);
            xj61Var.add(blc0.tc);
        }
        xj61Var.add(blc0.uc);
        this.b = cwl1.j(xj61Var);
    }
}
