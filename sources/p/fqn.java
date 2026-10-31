package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fqn implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;
    public final Object c;

    public fqn() {
        this.a = (byte) 0;
        this.b = Collections.singleton(lxu0.d);
        this.c = new dqn(false, new cqn((String) null, (String) null, new zpn(false, (List) null, (List) null, (List) null, "spotify:new:playlist", "spotify:new:playlist", (ypn) null, false, 1855), 3));
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return tpn.class;
            case 1:
                return hk10.class;
            default:
                return yta1.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0130  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        int i;
        fua1 fua1Var;
        byte b = this.a;
        int i2 = 3;
        Object obj = this.c;
        switch (b) {
            case 0:
                dqn parcelableExtra = intent.getParcelableExtra("create_playlist_page_parameters");
                if (parcelableExtra != null) {
                    return parcelableExtra;
                }
                Bundle extras = intent.getExtras();
                cqn cqnVar = extras != null ? (cqn) extras.getParcelable("create_playlist_page_contract_input") : null;
                dqn dqnVar = cqnVar != null ? new dqn(true, cqnVar) : null;
                return dqnVar == null ? (dqn) obj : dqnVar;
            case 1:
                String strZ = s4b1Var.z();
                String str = strZ == null ? "" : strZ;
                a3i1 a3i1Var = (a3i1) pk10.d.getValue();
                Set set = x6b1.e;
                x6b1 x6b1VarL = oqn1.l(str);
                v5b1 v5b1VarA = x6b1VarL == null ? null : a3i1Var.a(x6b1VarL);
                nk10 nk10Var = v5b1VarA instanceof nk10 ? (nk10) v5b1VarA : null;
                if (nk10Var == null) {
                    hhg1.n("Expected a fan-event redemption URI");
                    return null;
                }
                String str2 = nk10Var.a;
                boolean z = ((Optional) obj).isPresent() && u890.j(s4b1Var.n("useMockData"), "true");
                String strN = s4b1Var.n("reason");
                if (strN == null) {
                    i2 = 4;
                    i = i2;
                } else {
                    int iHashCode = strN.hashCode();
                    if (iHashCode != -425003621) {
                        if (iHashCode == 595233003) {
                            if (!strN.equals("notification")) {
                            }
                            i = i2;
                        } else if (iHashCode == 629233382 && strN.equals("deeplink")) {
                            i = 2;
                        }
                        i2 = 4;
                        i = i2;
                    } else if (strN.equals("hub_section")) {
                        i = 1;
                    } else {
                        i2 = 4;
                        i = i2;
                    }
                }
                return new jk10(i, str2, str, z, s4b1Var.n("redeemed_at"));
            default:
                String strZ2 = s4b1Var.z();
                String str3 = strZ2 != null ? strZ2 : "";
                String strN2 = s4b1Var.n("type");
                if (strN2 == null || strN2.equals("opt-in")) {
                    String stringExtra = intent.getStringExtra("target-uri");
                    if (stringExtra != null) {
                        return new bua1(str3, stringExtra);
                    }
                    eg.m("Missing target-uri intent extra");
                    return null;
                }
                if (strN2.equals("adjusted-speed-disclosure")) {
                    int iC = l1d.C(((oqa1) obj).i);
                    if (iC == 0) {
                        eg.m("Adjusted-speed disclosure is disabled");
                        return null;
                    }
                    if (iC == 1) {
                        fua1Var = fua1.b;
                    } else {
                        if (iC != 2 && iC != 3) {
                            eg.o();
                            return null;
                        }
                        fua1Var = fua1.c;
                    }
                    return new aua1(str3, fua1Var);
                }
                if (!strN2.equals("turn-off-speed-changes-confirmation")) {
                    k220.f("Unknown speed control messaging type: ".concat(strN2));
                    return null;
                }
                String strN3 = s4b1Var.n("playlist-uri");
                if (strN3 == null) {
                    eg.m("Missing playlist-uri query parameter");
                    return null;
                }
                nyu0 nyu0VarC = oxu0.a.c(strN3);
                if ((nyu0VarC instanceof nyu0 ? nyu0VarC : null) != null) {
                    return new cua1(str3, strN3);
                }
                k220.f("Invalid playlist URI: ".concat(strN3));
                return null;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new c6w0(1, true, (hd5) null, 12);
            case 1:
                return new b6w0(true);
            default:
                return new b6w0(false);
        }
    }

    public final Set e() {
        byte b = this.a;
        return this.b;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Create Playlist";
            case 1:
                return "Fan-event benefit redemption bottom sheet";
            default:
                return "Speed Control Messaging Bottom Sheet";
        }
    }

    public fqn(Optional optional) {
        this.a = (byte) 1;
        this.c = optional;
        this.b = Collections.singleton(nk10.e);
    }

    public fqn(oqa1 oqa1Var) {
        this.a = (byte) 2;
        this.c = oqa1Var;
        this.b = Collections.singleton(kyu0.d);
    }
}
