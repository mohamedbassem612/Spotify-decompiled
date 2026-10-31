package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jwe implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;
    public final Object c;

    public jwe(a7a1 a7a1Var) {
        this.a = (byte) 8;
        this.c = a7a1Var;
        this.b = Collections.singleton(jfa1.d);
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return ewe.class;
            case 1:
                return ttf.class;
            case 2:
                return gtu.class;
            case 3:
                return w700.class;
            case 4:
                return zvd0.class;
            case 5:
                return mwu0.class;
            case 6:
                return lr51.class;
            case 7:
                return f681.class;
            default:
                return pda1.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String string;
        ArrayList arrayListU;
        Boolean boolD1;
        String str;
        byte b = this.a;
        List listL1 = z6x.a;
        String str2 = "";
        Integer numValueOf = null;
        str = null;
        str = null;
        String str3 = null;
        numValueOf = null;
        switch (b) {
            case 0:
                String strZ = s4b1Var.z();
                if (strZ != null) {
                    return new gwe(strZ);
                }
                hhg1.n("Page URI cannot be null");
                return null;
            case 1:
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                Object objT = jhc1.t(extras, "check.in.sheet.parameters", vtf.class);
                if (objT != null) {
                    return (vtf) objT;
                }
                hhg1.n("No parameters in bundle!");
                return null;
            case 2:
                return ktu.a;
            case 3:
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (arrayListU = jhc1.u(extras2, "event_bottom_sheet_albums", q700.class)) != null) {
                    listL1 = o7h.l1(arrayListU);
                }
                Bundle extras3 = intent.getExtras();
                if (extras3 != null && (string = extras3.getString("event_bottom_sheet_title")) != null) {
                    str2 = string;
                }
                return new p800(listL1, str2);
            case 4:
                String strJ = s4b1Var.j();
                str2 = strJ != null ? strJ : "";
                String strN = s4b1Var.n("closeParentOnDismiss");
                return new bwd0(str2, s4b1Var.n("pageUri"), (strN == null || (boolD1 = ihc1.d1(strN)) == null) ? false : boolD1.booleanValue());
            case 5:
                v5b1 v5b1Var = s4b1Var.d;
                rxu0 rxu0Var = v5b1Var instanceof rxu0 ? (rxu0) v5b1Var : null;
                if (rxu0Var != null) {
                    String str4 = rxu0Var.a;
                    return new owu0(f4i1.f("spotify:internal:playlist-curator-stats:", str4, ""), str4);
                }
                ncn0.d(s4b1Var, " is not a playlist curator stats URI");
                return null;
            case 6:
                Bundle extras4 = intent.getExtras();
                ArrayList arrayListU2 = extras4 != null ? jhc1.u(extras4, "fields", c220.class) : null;
                if (arrayListU2 != null) {
                    listL1 = arrayListU2;
                }
                String string2 = extras4 != null ? extras4.getString("initialFieldName") : null;
                str2 = string2 != null ? string2 : "";
                if (extras4 != null && extras4.containsKey("accentColor")) {
                    numValueOf = Integer.valueOf(extras4.getInt("accentColor"));
                }
                return new mr51(numValueOf, str2, listL1);
            case 7:
                return aqr0.a;
            default:
                v5b1 v5b1Var2 = s4b1Var.d;
                jfa1 jfa1Var = v5b1Var2 instanceof jfa1 ? (jfa1) v5b1Var2 : null;
                if (jfa1Var != null && (str = (String) jfa1Var.a.get("seedUri")) != null && !ihc1.y0(str)) {
                    str3 = str;
                }
                return new rda1(str3);
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(false);
            case 1:
                return new b6w0(true);
            case 2:
                return a6w0.a;
            case 3:
                return new b6w0(false);
            case 4:
                return new c6w0(3, false, (hd5) null, 14);
            case 5:
                return new b6w0(true);
            case 6:
                return new b6w0(true);
            case 7:
                return new b6w0(true);
            default:
                return new b6w0(true);
        }
    }

    public final Set e() {
        byte b = this.a;
        return this.b;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "A bottom sheet page for the chat disclaimer";
            case 1:
                return "Guest-side check-in sheet";
            case 2:
                return "Download Center";
            case 3:
                return "Concert playlists bottom sheet";
            case 4:
                return "Livestream error dialog page";
            case 5:
                return "Playlist stats page";
            case 6:
                return "Bottom sheet with slider to edit a segmented prompt field";
            case 7:
                return "Personal Podcast show generation list bottom sheet";
            default:
                return "Song DNA in-context search bottom sheet";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                qf4 qf4Var = ((add) obj).a;
                return qf4Var.h() && qf4Var.k();
            case 1:
                return ((pni1) ((ynb0) obj).get()).a();
            case 2:
                return ((z0t) obj).a.f();
            case 3:
                return ((xrk) obj).s;
            case 4:
                return ((pq4) ((kly0) obj).get()).a();
            case 5:
                return ((l35) obj).a();
            case 6:
                return ((i5y0) obj).e();
            case 7:
                jf4 jf4Var = ((u9b) obj).a;
                return jf4Var.v() && jf4Var.q();
            default:
                return ((a7a1) obj).g;
        }
    }

    public jwe(z0t z0tVar) {
        this.a = (byte) 2;
        this.c = z0tVar;
        this.b = Collections.singleton(ltu.d);
    }

    public jwe(add addVar) {
        this.a = (byte) 0;
        this.c = addVar;
        this.b = Collections.singleton(pwe.d);
    }

    public jwe(jly0 jly0Var) {
        this.a = (byte) 4;
        this.c = jly0Var;
        this.b = Collections.singleton(avd0.e);
    }

    public jwe(u9b u9bVar) {
        this.a = (byte) 7;
        this.c = u9bVar;
        this.b = Collections.singleton(nab.d);
    }

    public jwe(i5y0 i5y0Var) {
        this.a = (byte) 6;
        this.c = i5y0Var;
        this.b = Collections.singleton(e03.d);
    }

    public jwe(l35 l35Var) {
        this.a = (byte) 5;
        this.c = l35Var;
        this.b = Collections.singleton(rxu0.e);
    }

    public jwe(xrk xrkVar) {
        this.a = (byte) 3;
        this.c = xrkVar;
        this.b = Collections.singleton(zqk.d);
    }

    public jwe(ynb0 ynb0Var) {
        this.a = (byte) 1;
        this.c = ynb0Var;
        this.b = Collections.singleton(sni1.d);
    }
}
