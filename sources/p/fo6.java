package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fo6 implements acr0 {
    public final /* synthetic */ byte a;
    public final xrk b;
    public final Set c;

    public fo6(xrk xrkVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = xrkVar;
                this.c = Collections.singleton(blc0.X4);
                break;
            case 2:
                this.b = xrkVar;
                this.c = Collections.singleton(blc0.U4);
                break;
            case 3:
                this.b = xrkVar;
                this.c = Collections.singleton(blc0.a5);
                break;
            case 4:
                this.b = xrkVar;
                this.c = Collections.singleton(blc0.V4);
                break;
            case 5:
                this.b = xrkVar;
                this.c = Collections.singleton(blc0.ij);
                break;
            default:
                this.b = xrkVar;
                this.c = Collections.singleton(blc0.F1);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.c;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return zn6.class;
            case 1:
                return lak.class;
            case 2:
                return hjk.class;
            case 3:
                return jpk.class;
            case 4:
                return ane0.class;
            default:
                return axi1.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String queryParameter;
        int i;
        boolean zEquals = false;
        ccr ccrVar = null;
        String str = "";
        switch (this.a) {
            case 0:
                String stringExtra = intent.getStringExtra("live-events-artist-name");
                boolean booleanExtra = intent.getBooleanExtra("live-events-artist-extras", false);
                String strZ = s4b1Var.z();
                if (strZ == null) {
                    strZ = "";
                }
                return new eo6(stringExtra != null ? stringExtra : "", strZ, booleanExtra, th61Var.a);
            case 1:
                String strZ2 = s4b1Var.z();
                if (strZ2 == null) {
                    String dataString = intent.getDataString();
                    if (dataString != null) {
                        str = dataString;
                    }
                } else {
                    str = strZ2;
                }
                if (u890.j(s4b1Var.n("setReminder"), "1")) {
                    ccrVar = ccr.a;
                } else if (u890.j(s4b1Var.n("joinWaitlist"), "1")) {
                    ccrVar = ccr.c;
                } else if (u890.j(s4b1Var.n("declineOffer"), "1")) {
                    ccrVar = ccr.b;
                } else if (u890.j(s4b1Var.n("notInterested"), "1")) {
                    ccrVar = ccr.d;
                }
                return new nak("Spotify", str, ccrVar);
            case 2:
                String strZ3 = s4b1Var.z();
                str = (strZ3 == null && (strZ3 = intent.getDataString()) == null) ? "" : strZ3;
                Set set = s4b1.f;
                String strH = uic.x(str).h();
                String str2 = th61Var.a;
                Uri uri = s4b1Var.a;
                if (uri != null && (queryParameter = uri.getQueryParameter("notInterested")) != null) {
                    zEquals = queryParameter.equals("1");
                }
                return new njk(strH, str, str2, zEquals);
            case 3:
                String strD = s4b1Var.D();
                if (strD == null) {
                    strD = "";
                }
                String strZ4 = s4b1Var.z();
                return new npk(strD, strZ4 != null ? strZ4 : "");
            case 4:
                Set set2 = s4b1.f;
                String strK = zjy.k(intent);
                str = strK != null ? strK : "";
                Uri uri2 = s4b1Var.a;
                String queryParameter2 = uri2 != null ? uri2.getQueryParameter("pageState") : null;
                if (u890.j(queryParameter2, "preferred")) {
                    i = 2;
                } else {
                    i = u890.j(queryParameter2, "browse") ? 3 : 1;
                }
                return new ene0(str, i);
            default:
                String dataString2 = intent.getDataString();
                str = dataString2 != null ? dataString2 : "";
                Set set3 = s4b1.f;
                return new dxi1(str, uic.x(str).h());
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Artist live events tour page";
            case 1:
                return "Entity page for concert campaigns";
            case 2:
                return "Page representing a concert event";
            case 3:
                return "Gallery page presenting concerts";
            case 4:
                return "Concerts Location Search page";
            default:
                return "Venue entity page";
        }
    }

    public final boolean isEnabled() {
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
        return this.b.a();
    }
}
