package p;

import android.content.Intent;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ru9 implements it80 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ru9(dg30 dg30Var, pwn0 pwn0Var, rsn0 rsn0Var, ywn0 ywn0Var, mmo mmoVar, mwn0 mwn0Var) {
        this.a = (byte) 0;
        this.b = pwn0Var;
        this.c = ywn0Var;
        this.d = new zwg(dg30Var, pwn0Var, rsn0Var, mmoVar, mwn0Var);
    }

    public static final /* synthetic */ pwn0 b(ru9 ru9Var) {
        return (pwn0) ru9Var.b;
    }

    public final void a(ajq0 ajq0Var) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ajq0Var.B("com.spotify.mobile.android.ui.action.view.CLEAR_BACKSTACK", "Should clear backstack", new pu9(this, (byte) 0));
                ajq0Var.B("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI", "Should probably pop a fragment", new qu9(this, (byte) 0));
                ajq0Var.B("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS", "Should clear overlay backstack", new qu9(this, (byte) 1));
                ajq0Var.B("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_LINK", "Should clear overlay backstack matching a specific link type", new qu9(this, (byte) 2));
                ajq0Var.B("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_URI_TYPE", "Should clear overlay backstack matching a specific URI type", new qu9(this, (byte) 3));
                break;
            case 1:
                ajq0Var.J(new ebu(blc0.h3, (byte) 7), eve.class.getSimpleName(), new i6b(this, (byte) 9));
                break;
            case 2:
                wmo1.q(ajq0Var, l6o1.p(new jbh0[]{new ebu(blc0.A3, (byte) 7), new ebu(blc0.C3, (byte) 7), new ebu(blc0.n3, (byte) 7)}), kof.class.getSimpleName(), new b7c(this, (lnm) null, (byte) 5));
                break;
            case 3:
                ajq0Var.C(blc0.u8, "Open Jam Manage Participants Sheet", new wb00(this, (byte) 21));
                ajq0Var.C(blc0.w8, "Open Jam Pending Requests Sheet", new bm00(this, (byte) 22));
                break;
            case 4:
                for (blc0 blc0Var : h1a0.a) {
                    ajq0Var.J(new ebu(blc0Var, (byte) 7), "Route to dialog that opens Jam", new vx40(this, blc0Var, (byte) 29));
                }
                break;
            case 5:
                dg30 dg30Var = (dg30) obj;
                ajq0Var.K(blc0.M9, "lex-experiments", new gw40(dg30Var));
                if (((b1y) obj2).a.f()) {
                    wmo1.q(ajq0Var, new ebu(blc0.L9, (byte) 7), "lexicon", new qd0(this, (lnm) null));
                } else {
                    ajq0Var.K(blc0.L9, "lexicon", new gw40(dg30Var));
                }
                break;
            case 6:
                ajq0Var.J(new ebu(blc0.l2, (byte) 7), "Handles an audiobooks listening hours request", new upa0(this, (byte) 7));
                break;
            case 7:
                qf4 qf4Var = ((add) obj).a;
                if (qf4Var.h() && qf4Var.B()) {
                    wmo1.q(ajq0Var, new ebu(blc0.c3, (byte) 7), "Bottom sheet for inviting people to Spotify messaging", new lag0(this, (lnm) null, (byte) 1));
                    break;
                }
                break;
            case 8:
                ajq0Var.B("com.spotify.mobile.android.ui.action.view.CLEAR_BACKSTACK", "Should clear backstack", new k0r0(this, (byte) 0));
                ajq0Var.B("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI", "Closes page and navigates back", new k0r0(this, (byte) 1));
                ajq0Var.B("com.spotify.mobile.android.ui.action.view.CLOSE_PAGE_ACTIVITY", "Closes page activity", new k0r0(this, (byte) 2));
                ajq0Var.B("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS", "Should clear overlay backstack", new k0r0(this, (byte) 3));
                ajq0Var.B("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_LINK", "Closes page activity", new k0r0(this, (byte) 4));
                ajq0Var.B("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_URI_TYPE", "Should clear overlay backstack matching a specific URI type", new k0r0(this, (byte) 5));
                break;
            case 9:
                ajq0Var.K(blc0.Ug, "Handle routing to podcast specific entity page", new n0v0(this, (byte) 1));
                break;
            case 10:
                ajq0Var.K(blc0.oc, "Current users profile", a4x0.b);
                ajq0Var.J(new ebu(blc0.ee, (byte) 7), "Profiles of Spotify users", new uip0(this, (byte) 22));
                if (((gdx0) obj2).a.a()) {
                    wmo1.q(ajq0Var, new ebu(aji1.f, (byte) 8), "Profile via account ID with social handle", new t4o0(this, (lnm) null, (byte) 25));
                }
                break;
            case 11:
                wmo1.q(ajq0Var, new ebu(blc0.Gf, (byte) 7), "Store Super Connect pending pairing from QR scan", new lag0(this, (lnm) null, (byte) 14));
                break;
            case 12:
                wmo1.q(ajq0Var, new ebu(blc0.n4, (byte) 7), "Your Library tags bottom sheet", new lag0(this, (lnm) null, (byte) 18));
                break;
            default:
                for (mmr0 mmr0Var : p7h.M(new mmr0[]{new mmr0(blc0.q4, "Collection root: Your Library"), new mmr0(blc0.r4, "Collection rootlist: Your Library."), new mmr0(blc0.s4, "Collection rootlist by you: Your Library"), new mmr0(blc0.S3, "Collection album overview: Your Library."), new mmr0(blc0.U3, "Collection artist overview: Your Library."), new mmr0(blc0.j4, "Collection podcasts downloads: Your Library"), new mmr0(blc0.m4, "Collection podcasts following: Your Library"), new mmr0(blc0.i4, "Collection podcasts: Your Library"), new mmr0(blc0.v4, "Collection podcasts: Your Library"), new mmr0(blc0.A4, "Collection podcasts downloads: Your Library"), new mmr0(blc0.d4, "Old downloads uri fallback navigate to Your Library"), new mmr0(blc0.e4, "Old downloads uri fallback navigate to Your Library"), new mmr0(blc0.V3, "Collection audiobooks: Your Library"), new mmr0(blc0.W3, "All downloads: Your Library"), new mmr0(blc0.Y3, "Collection events: Your Library")})) {
                    blc0 blc0Var2 = (blc0) mmr0Var.a;
                    ajq0Var.J(new ebu(blc0Var2, (byte) 7), (String) mmr0Var.b, new bym1(this, blc0Var2, (byte) 0));
                }
                break;
        }
    }

    public hrn0 c(Intent intent, blc0 blc0Var, boolean z, th61 th61Var, boolean z2) {
        Set set = s4b1.f;
        String strK = zjy.k(intent);
        if (strK == null) {
            strK = "";
        }
        return new hrn0(jvm1.class, new rvm1(strK, blc0Var, th61Var.a, intent.getStringExtra("filter"), z2, ((Boolean) ((s181) this.d).invoke(Boolean.valueOf(z), intent, th61Var.a)).booleanValue()), a6w0.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object d(Intent intent, th61 th61Var, String str, String str2, s4b1 s4b1Var, onm onmVar) {
        d4x0 d4x0Var;
        th61 th61Var2;
        s4b1 s4b1Var2;
        Intent intent2;
        String str3;
        String str4;
        String str5;
        boolean z;
        if (onmVar instanceof d4x0) {
            d4x0Var = (d4x0) onmVar;
            int i = d4x0Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4x0Var.t = i - Integer.MIN_VALUE;
            } else {
                d4x0Var = new d4x0(this, onmVar);
            }
        } else {
            d4x0Var = new d4x0(this, onmVar);
        }
        Object objB = d4x0Var.h;
        int i2 = d4x0Var.t;
        boolean z2 = false;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            sbi1 sbi1Var = (sbi1) this.c;
            d4x0Var.a = intent;
            th61Var2 = th61Var;
            d4x0Var.b = th61Var2;
            d4x0Var.c = s4b1Var;
            d4x0Var.t = 1;
            objB = sbi1Var.b(str, str2, d4x0Var);
            if (objB != d9nVar) {
                s4b1Var2 = s4b1Var;
                intent2 = intent;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            s4b1Var2 = d4x0Var.c;
            th61Var2 = d4x0Var.b;
            intent2 = d4x0Var.a;
            hm5.M(objB);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = d4x0Var.g;
            str5 = d4x0Var.f;
            str4 = d4x0Var.e;
            str3 = d4x0Var.d;
            hm5.M(objB);
        }
        if (((Boolean) objB).booleanValue() && !u890.j(str5, str3)) {
            z2 = true;
        }
        return new hrn0(x3x0.class, new y3x0(16, str4, str5, z, z2), a6w0.a);
        String str6 = (String) objB;
        if (str6 == null) {
            String strD = s4b1Var2.D();
            if (strD != null) {
                return new hrn0(hkh1.class, new kkh1(strD, intent2.getExtras()), ikh1.a);
            }
        } else {
            Set set = s4b1.f;
            String strZ = uic.C(str6, (String) null).z();
            if (strZ != null) {
                String str7 = th61Var2.a;
                boolean booleanExtra = intent2.getBooleanExtra("view_as_visitor", false);
                Single singleOnErrorReturn = ((o241) this.b).a.map(e4x0.b).firstOrError().onErrorReturn(f4x0.b);
                d4x0Var.a = null;
                d4x0Var.b = null;
                d4x0Var.c = null;
                d4x0Var.d = str6;
                d4x0Var.e = strZ;
                d4x0Var.f = str7;
                d4x0Var.g = booleanExtra;
                d4x0Var.t = 2;
                Object objJ = fc11.j(singleOnErrorReturn, d4x0Var);
                if (objJ != d9nVar) {
                    str3 = str6;
                    str4 = strZ;
                    str5 = str7;
                    objB = objJ;
                    z = booleanExtra;
                    if (((Boolean) objB).booleanValue()) {
                        z2 = true;
                    }
                    return new hrn0(x3x0.class, new y3x0(16, str4, str5, z, z2), a6w0.a);
                }
                return d9nVar;
            }
        }
        return crn0.a;
    }

    public ru9(w0r0 w0r0Var, mwn0 mwn0Var, ywn0 ywn0Var) {
        this.a = (byte) 8;
        this.b = w0r0Var;
        this.d = mwn0Var;
        this.c = ywn0Var;
    }

    public /* synthetic */ ru9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
