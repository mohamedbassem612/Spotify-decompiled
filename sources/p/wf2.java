package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wf2 implements it80 {
    public final /* synthetic */ byte a;
    public Object b;

    public wf2(ov20 ov20Var) {
        this.a = (byte) 21;
        this.b = ((bw20) ov20Var).a("restrict-showing-your-updates", false);
    }

    public static final c0k0 b(wf2 wf2Var, Intent intent, s4b1 s4b1Var, String str) {
        fyu0 fyu0Var = s4b1Var.d;
        fyu0 fyu0Var2 = fyu0Var instanceof fyu0 ? fyu0Var : null;
        if (fyu0Var2 == null) {
            ncn0.d(s4b1Var, " URI is not supported, only the mixing URI is supported.");
            return null;
        }
        Set set = s4b1.f;
        String strZ = uic.y(fyu0Var2.a).z();
        if (strZ == null) {
            bhn0.k("Unable to convert ", s4b1Var, " URI to a playlist V2 URI.");
            return null;
        }
        String str2 = fyu0Var2.d;
        boolean booleanExtra = intent.getBooleanExtra("intent_argument_opened_from_edit_playlist", false);
        bt31 bt31Var = (bt31) ila0.s(intent, "intent_argument_to_row", bt31.class);
        if (bt31Var == null) {
            hhg1.n("Missing or faulty toRow");
            return null;
        }
        bt31 bt31Var2 = (bt31) ila0.s(intent, "intent_argument_from_row", bt31.class);
        if (bt31Var2 != null) {
            return new c0k0(strZ, str2, bt31Var2, bt31Var, (String) null, str, (dbk0) null, booleanExtra, 80);
        }
        hhg1.n("Missing or faulty fromRow");
        return null;
    }

    public static final /* synthetic */ mnk0 c(wf2 wf2Var) {
        return (mnk0) wf2Var.b;
    }

    public final void a(ajq0 ajq0Var) {
        byte b = 21;
        byte b2 = 6;
        byte b3 = 27;
        lnm lnmVar = null;
        byte b4 = 8;
        switch (this.a) {
            case 0:
                ajq0Var.K(blc0.b1, "Handle age assurance routing for the web collect flow (without intro sheet).", new x6o0(this, (byte) 11));
                break;
            case 1:
                if (!((e54) this.b).a()) {
                    q58 q58Var = new q58((byte) 10);
                    ajq0Var.K(blc0.w1, "Show biography fragment", q58Var);
                    ajq0Var.K(blc0.B1, "Show biography fragment", q58Var);
                    break;
                }
                break;
            case 2:
                ajq0Var.J(new ebu(blc0.H3, (byte) 7), szf.class.getSimpleName(), new dg8(this, (byte) 19));
                break;
            case 3:
                ajq0Var.J(new ebu(blc0.b6, (byte) 7), cyq.class.getSimpleName(), new sun(this, (byte) 3));
                break;
            case 4:
                ajq0Var.C(blc0.g5, "Redirect to device picker page", new her(this, (byte) 21));
                rjn rjnVar = new rjn(this, (byte) 25);
                r95 r95Var = (r95) ajq0Var.e;
                nbh0 nbh0VarO = l6o1.o(new jbh0[]{new os80("android.intent.action.VIEW", (byte) 0), new ebu(new ebu(n7l.d, (byte) 8), (byte) 9)});
                ro30 ro30Var = (ro30) ajq0Var.a;
                r95Var.a(nbh0VarO, new o860(ro30Var.b, (Object) new bp50(ro30Var, "Redirect to device picker page", new okg(rjnVar, (byte) 7), (byte) 22), (Object) "Redirect to device picker page", (Object) m4h.c1, (byte) 9));
                break;
            case 5:
                blc0 blc0Var = blc0.G1;
                ajq0Var.K(blc0Var, "Handle routing to the artist expression videos page", new jxa(this, b4));
                blc0 blc0Var2 = blc0.S1;
                ajq0Var.K(blc0Var2, "Handle routing to the artist videos page", new fza(this, (byte) 8));
                blc0 blc0Var3 = blc0.i1;
                ajq0Var.K(blc0Var3, "Handle routing to the album discovery feed", new a0b(this, (byte) 8));
                blc0 blc0Var4 = blc0.Gj;
                ajq0Var.K(blc0Var4, "Handle routing to the Pre Release Discovery feed", new t2b(this, (byte) 8));
                ajq0Var.E(new ebu(new ebu(new String[]{"watch-feed", "remote"}, (byte) 0), (byte) 9), "Handle routing to Watch Feed Platform feeds", new hfb(this, (byte) 8));
                ajq0Var.E(l6o1.o(new jbh0[]{new ebu(new ebu(new String[]{"watch-feed"}, (byte) 0), (byte) 9), new ebu(new ebu(new ebu(new String[]{"watch-feed", "remote"}, (byte) 0), (byte) 9), (byte) 3), new ebu(new ebu(new ebu(blc0Var, (byte) 7), (byte) 9), (byte) 3), new ebu(new ebu(new ebu(blc0Var2, (byte) 7), (byte) 9), (byte) 3), new ebu(new ebu(new ebu(blc0Var3, (byte) 7), (byte) 9), (byte) 3), new ebu(new ebu(new ebu(blc0Var4, (byte) 7), (byte) 9), (byte) 3)}), "Handle routing to Watch Feed feeds", new ogr(this, (byte) 16));
                break;
            case 6:
                Iterator it = ((Set) this.b).iterator();
                while (it.hasNext()) {
                    ((it80) it.next()).a(ajq0Var);
                }
                break;
            case 7:
                ajq0Var.K(blc0.Wg, "Handle routing to a page to find episodes within a specific show.", new ouz(this, b2));
                break;
            case 8:
                ajq0Var.K(blc0.E7, "Handle home ad routing", new lmw(this, (byte) 22));
                break;
            case 9:
                wmo1.q(ajq0Var, new m6d((byte) 3), "Playlist Collaboration: playlist uri with invite", new ew0(this, (lnm) null, (byte) 27));
                break;
            case 10:
                ajq0Var.K(blc0.i9, "Legal consent step of the account creation flow", new hl00(this, b));
                ajq0Var.K(blc0.v9, "Legal step of the account transition flow", new il00(this, (byte) 19));
                break;
            case 11:
                ajq0Var.J(new ebu(blc0.He, (byte) 7), g9f0.class.getSimpleName(), new z8c0(this, (byte) 10));
                break;
            case 12:
                ajq0Var.K(blc0.P3, "Do not open Made For You for the cluster stations root.", new mna0(b3));
                hr4 hr4Var = (hr4) this.b;
                if (!hr4Var.b() && !hr4Var.a()) {
                    mna0 mna0Var = new mna0((byte) 28);
                    ajq0Var.K(blc0.Qa, "Display the made for you hub fragment.", mna0Var);
                    ajq0Var.K(blc0.a6, "Display the made for you hub fragment.", mna0Var);
                    break;
                }
                break;
            case 13:
                wmo1.q(ajq0Var, new ebu(fyu0.e, (byte) 8), "Mixing", new ms4(this, (lnm) null, (byte) 6));
                wmo1.q(ajq0Var, l6o1.p(new jbh0[]{new ebu(blc0.yi, (byte) 7), new ebu(blc0.zi, (byte) 7)}), "Mixing", new zz90((it80) this, lnmVar, (byte) 24));
                break;
            case 14:
                lag0 lag0Var = new lag0(this, (lnm) null, (byte) 3);
                wmo1.q(ajq0Var, new ebu(blc0.k4, (byte) 7), "New episodes", lag0Var);
                wmo1.q(ajq0Var, new ebu(blc0.l4, (byte) 7), "Old unfinished uri fallback navigate to episodes tab", lag0Var);
                wmo1.q(ajq0Var, new ebu(blc0.z4, (byte) 7), "Old unplayed uri fallback navigate to episodes tab", lag0Var);
                wmo1.q(ajq0Var, new ebu(blc0.y4, (byte) 7), "Old unplayed uri fallback navigate to episodes tab", lag0Var);
                break;
            case 15:
                if (!((oto0) this.b).a.f()) {
                    ajq0Var.K(blc0.nd, "Podcast New Episode Notifications Settings page", mif1.k1);
                    break;
                }
                break;
            case 16:
                if (!((jy4) this.b).b()) {
                    ajq0Var.K(blc0.eh, "Handles routing to the Show settings page", bj20.c1);
                    break;
                }
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                wmo1.q(ajq0Var, l6o1.o(new jbh0[]{new ebu(blc0.ch, (byte) 7)}), "Map ratings intent action", new lag0(this, (lnm) null, (byte) 7));
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ajq0Var.L(crk.d, "Reserved ticket onboarding", new n0v0(this, (byte) 27));
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ajq0Var.C(blc0.X, "Open the side drawer", new y281(this, (byte) 4));
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                q881 q881Var = new q881(this, (byte) 26);
                ajq0Var.K(blc0.Ki, "Handle upsell uri routing", q881Var);
                ajq0Var.K(blc0.Sh, "Handle start trial upsell uri routing", q881Var);
                break;
            default:
                wmo1.q(ajq0Var, new ebu(blc0.Qb, (byte) 7), "YourUpdates Page", new arz0(this, (lnm) null));
                break;
        }
    }

    public hrn0 e(Intent intent, yxa0 yxa0Var) {
        tpw0 tpw0Var;
        yq00 yq00Var;
        yxa0 yxa0Var2;
        swa0 swa0Var = (swa0) this.b;
        Bundle extras = intent.getExtras();
        yxa0 yxa0Var3 = (extras == null || (yxa0Var2 = (yxa0) extras.getParcelable("key_flow_type")) == null) ? yxa0Var : yxa0Var2;
        if (!(yxa0Var3 instanceof xxa0)) {
            Bundle extras2 = intent.getExtras();
            twa0 twa0VarA = twa0.a(swa0Var.d, (String) null, (String) null, (String) null, (dxr0) null, (String) null, (String) null, false, false, extras2 != null ? extras2.getInt("entry-point-pages-count", 0) : 0, (String) null, (yxa0) null, (tpw0) null, 7935);
            swa0Var.d = twa0VarA;
            swa0Var.d = twa0.a(twa0VarA, (String) null, (String) null, (String) null, (dxr0) null, (String) null, (String) null, false, false, 0, (String) null, yxa0Var3, (tpw0) null, 6143);
            return new hrn0(nwa0.class, new pwa0(yxa0Var3), new c6w0(1, true, (hd5) null, 12));
        }
        Bundle extras3 = intent.getExtras();
        okr0 okr0Var = extras3 != null ? (okr0) extras3.getParcelable("pages") : null;
        Bundle extras4 = intent.getExtras();
        if (extras4 == null || (tpw0Var = (tpw0) extras4.getParcelable("key_privacy_policy_consent_type")) == null) {
            tpw0Var = tpw0.a;
        }
        tpw0 tpw0Var2 = tpw0Var;
        int i = okr0Var != null ? okr0Var.a : 0;
        int i2 = okr0Var != null ? okr0Var.b : 0;
        Bundle extras5 = intent.getExtras();
        if (extras5 == null || (yq00Var = (yq00) extras5.getParcelable("expected_account_type")) == null) {
            yq00Var = wq00.a;
        }
        return new hrn0(z1c0.class, new o2c0(yxa0Var3, tpw0Var2, i, i2, yq00Var), new c6w0(1, true, (hd5) null, 12));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(onm onmVar) {
        x2n1 x2n1Var;
        if (onmVar instanceof x2n1) {
            x2n1Var = (x2n1) onmVar;
            int i = x2n1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x2n1Var.c = i - Integer.MIN_VALUE;
            } else {
                x2n1Var = new x2n1(this, onmVar);
            }
        } else {
            x2n1Var = new x2n1(this, onmVar);
        }
        Object objI = x2n1Var.a;
        int i2 = x2n1Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20Var = (mr20) this.b;
            x2n1Var.c = 1;
            objI = b5p1.i(mr20Var, x2n1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        return Boolean.valueOf(!((Boolean) objI).booleanValue());
    }

    public /* synthetic */ wf2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public wf2(twa twaVar, khc khcVar) {
        this.a = (byte) 5;
        this.b = twaVar;
    }
}
