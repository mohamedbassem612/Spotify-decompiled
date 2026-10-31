package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.spotify.blend.tastematch.BlendStoryContainerActivity;
import com.spotify.wear.pinpairing.PinPairingActivity;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b72 implements it80 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public b72(Resources resources, g341 g341Var) {
        this.a = (byte) 0;
        this.b = g341Var;
        this.c = resources.getString(2131951861);
    }

    public static final irn0 b(b72 b72Var, Intent intent, th61 th61Var) {
        tgf tgfVar;
        Uri uri;
        String strN;
        String strN2;
        String str = th61Var.a;
        Set set = s4b1.f;
        vjq0 vjq0Var = (vjq0) ila0.s(intent, "push_data", vjq0.class);
        tgf tgfVarN = null;
        String dataString = vjq0Var != null ? vjq0Var.d : null;
        if (dataString == null) {
            dataString = intent.getDataString();
        }
        s4b1 s4b1VarX = uic.x(dataString);
        blc0 blc0Var = s4b1VarX.c;
        String strZ = s4b1VarX.z();
        if (strZ == null) {
            strZ = "";
        }
        t7q0 t7q0Var = (t7q0) ila0.s(intent, "OnPlatformShareData", t7q0.class);
        jqf jqfVar = (jqf) ila0.s(intent, "ChatSource", jqf.class);
        if (jqfVar == null) {
            jqfVar = jqf.a;
        }
        jqf jqfVar2 = jqfVar;
        int iOrdinal = blc0Var.ordinal();
        List list = z6x.a;
        if (iOrdinal == 129) {
            List listM = pcf.m(s4b1VarX);
            if (listM != null) {
                list = listM;
            }
            if (list.size() > 1) {
                String strB = pcf.b(s4b1VarX);
                if (strB != null && (strN = s4b1VarX.n("createGroupChatToken")) != null) {
                    tgfVar = new tgf(strZ, new rgf(strB, list, strN, intent.getStringExtra("group_name")), str, (String) null, t7q0Var, jqfVar2, 72);
                    tgfVarN = tgfVar;
                }
            } else if (list.size() == 1) {
                String strB2 = pcf.b(s4b1VarX);
                if (strB2 != null) {
                    tgfVar = new tgf(strZ, new qgf(strB2, (String) o7h.q0(list)), str, (String) null, t7q0Var, jqfVar2, 72);
                    tgfVarN = tgfVar;
                }
            } else {
                String queryParameter = (ocf.a[blc0Var.ordinal()] != 1 || (uri = s4b1VarX.a) == null) ? null : uri.getQueryParameter("originalContentUri");
                String strB3 = pcf.b(s4b1VarX);
                if (strB3 != null) {
                    int iOrdinal2 = blc0Var.ordinal();
                    if (iOrdinal2 == 129) {
                        tgfVarN = s4b1VarX.n("contributionId");
                    } else if (iOrdinal2 == 142) {
                        tgfVarN = s4b1VarX.j();
                    }
                    tgfVar = new tgf(strZ, new ogf(strB3, tgfVarN), str, queryParameter, t7q0Var, jqfVar2, 64);
                    tgfVarN = tgfVar;
                }
            }
        } else if (iOrdinal == 142) {
            Set set2 = pcf.a;
            int iOrdinal3 = blc0Var.ordinal();
            if (iOrdinal3 != 129) {
                strN2 = iOrdinal3 != 142 ? null : s4b1VarX.j();
            } else {
                strN2 = s4b1VarX.n("contributionId");
            }
            if (strN2 != null) {
                tgfVar = new tgf(strZ, new pgf(strN2), str, (String) null, t7q0Var, jqfVar2, 72);
                tgfVarN = tgfVar;
            }
        } else if (iOrdinal == 133) {
            List listM2 = pcf.m(s4b1VarX);
            if (listM2 != null) {
                list = listM2;
            }
            if (list.size() != 1) {
                n57.s("You need 1 other participant to create a DM");
            } else {
                tgfVar = new tgf(strZ, new qgf((String) null, (String) o7h.q0(list)), str, (String) null, t7q0Var, jqfVar2, 72);
                tgfVarN = tgfVar;
            }
        } else if (iOrdinal == 134) {
            List listM3 = pcf.m(s4b1VarX);
            if (listM3 != null) {
                list = listM3;
            }
            if (list.size() < 2) {
                n57.s("Cannot create a new group with less than 2 other participants");
            } else {
                tgfVar = new tgf(strZ, new rgf((String) null, list, (String) null, intent.getStringExtra("group_name")), str, (String) null, t7q0Var, jqfVar2, 72);
                tgfVarN = tgfVar;
            }
        }
        if (tgfVarN != null) {
            return new hrn0(uff.class, tgfVarN, a6w0.a);
        }
        n57.s("Error creating NavigateAction for ChatPage: pageParameters is null");
        return crn0.a;
    }

    public static final /* synthetic */ fta c(b72 b72Var) {
        return (fta) b72Var.c;
    }

    public static final /* synthetic */ kly0 d(b72 b72Var) {
        return (kly0) b72Var.b;
    }

    public final void a(ajq0 ajq0Var) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        final byte b2 = 0;
        final byte b3 = 2;
        final byte b4 = 1;
        switch (b) {
            case 0:
                ebu ebuVar = new ebu(new ebu((String) obj2, (byte) 1), (byte) 2);
                e4b1 e4b1Var = new e4b1(this, (byte) 9);
                r95 r95Var = (r95) ajq0Var.e;
                mg30 mg30Var = (mg30) ajq0Var.b;
                ro30 ro30Var = mg30Var.a;
                r95Var.a(ebuVar, new o860((Scheduler) ro30Var.b, new cb60(ro30Var, "Ads partner reference URL", new rr10(e4b1Var, (byte) 14), new fc3(mg30Var, (byte) 8), (byte) 7), "Ads partner reference URL", m830.c1, (byte) 9));
                break;
            case 1:
                if (!((ul4) ((kly0) obj2).get()).h()) {
                    Context applicationContext = ((Context) obj).getApplicationContext();
                    ajq0Var.G(blc0.l1, "Open AllBoarding feature", new bn3(applicationContext));
                    ajq0Var.G(blc0.hi, "Redirect to taste onboarding page", new cn3(applicationContext, false));
                    ajq0Var.G(blc0.ii, "Redirect to taste onboarding page", new dn3(applicationContext, false));
                    ajq0Var.G(blc0.H9, "Redirect to language onboarding page", new ox1(applicationContext));
                    break;
                }
                break;
            case 2:
                ((xo5) obj2).getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    ajq0Var.C(blc0.C9, "Show App language settings Dialog", new x5j1(this, (byte) 19));
                }
                break;
            case 3:
                ajq0Var.B("android.intent.action.APPLICATION_PREFERENCES", "Show application preferences.", new gs31() { // from class: p.b06
                    public final void a(Intent intent, th61 th61Var) {
                        b72 b72Var = this.a;
                        Context context = (Context) b72Var.b;
                        context.startActivity((Intent) ((pbk1) b72Var.c).a(context, nik1.W0.a).b);
                    }
                });
                break;
            case 4:
                ajq0Var.J(new ebu(blc0.q2, (byte) 7), "Handle auto login links", new t4d1(this, (byte) 24));
                break;
            case 5:
                ajq0Var.G(blc0.A2, "Open Blend Taste Match view", new lo9(this, (byte) 4));
                if (((hf4) obj2).a()) {
                    ajq0Var.G(blc0.z2, "Open Blend data stories for a particular playlist", new kba(this, (byte) 4));
                }
                ajq0Var.G(blc0.r2, "Open Blend data stories for a celebrity blend playlist", new ps7(this, (byte) 9));
                break;
            case 6:
                wmo1.q(ajq0Var, l6o1.p(new jbh0[]{new ebu(blc0.b3, (byte) 7), new ebu(blc0.f3, (byte) 7), new ebu(blc0.o3, (byte) 7), new ebu(blc0.g3, (byte) 7)}), uff.class.getSimpleName(), new yjf(this, (lnm) null));
                break;
            case 7:
                ajq0Var.B("com.spotify.action.CLEAR_CACHE", "Clear streaming cache", new qu9(this, (byte) 4));
                break;
            case 8:
                ajq0Var.K(blc0.z5, "Bottom sheet page for user to provide DJ feedback", new tzo(this, (byte) 25));
                break;
            case 9:
                for (blc0 blc0Var : fq90.a) {
                    ajq0Var.J(new ebu(blc0Var, (byte) 7), "Start Jam with Autoplay", new x390(blc0Var, this, (byte) 5));
                }
                break;
            case 10:
                if (((r44) obj2).a()) {
                    wmo1.q(ajq0Var, new cwf0((byte) 1), "Handles natural language URI playback", new lag0(this, (lnm) null, (byte) 2));
                    break;
                }
                break;
            case 11:
                ajq0Var.H("com.spotify.mobile.android.ui.action.player.SHOW", "Show player", new zud0(this, (byte) 24));
                break;
            case 12:
                ajq0Var.D(new ebu(new ebu("spotify:pair", (byte) 1), (byte) 2), "Pair inApp view by deeplink", new is31(this) { // from class: p.x1t0
                    public final /* synthetic */ b72 b;

                    {
                        this.b = this;
                    }

                    public final Intent f(Intent intent) {
                        byte b5 = b2;
                        b72 b72Var = this.b;
                        switch (b5) {
                            case 0:
                                Uri data = intent.getData();
                                data.getClass();
                                String encodedQuery = data.getEncodedQuery();
                                String strM = (encodedQuery == null || !encodedQuery.isEmpty()) ? l1d.m("https://spotify.com/pair?", encodedQuery) : "https://spotify.com/pair";
                                Context context = (Context) b72Var.b;
                                int i = PinPairingActivity.f1;
                                Intent intent2 = new Intent(context, (Class<?>) PinPairingActivity.class);
                                intent2.putExtra("url", strM);
                                return intent2;
                            case 1:
                                String dataString = intent.getDataString();
                                dataString.getClass();
                                Context context2 = (Context) b72Var.b;
                                int i2 = PinPairingActivity.f1;
                                Intent intent3 = new Intent(context2, (Class<?>) PinPairingActivity.class);
                                intent3.putExtra("url", dataString);
                                return intent3;
                            default:
                                return ((in60) b72Var.c).b(intent);
                        }
                    }
                });
                ajq0Var.D(new ebu(new ebu("https://spotify.com/pair", (byte) 1), (byte) 2), "Pair inApp view by URL", new is31(this) { // from class: p.x1t0
                    public final /* synthetic */ b72 b;

                    {
                        this.b = this;
                    }

                    public final Intent f(Intent intent) {
                        byte b5 = b4;
                        b72 b72Var = this.b;
                        switch (b5) {
                            case 0:
                                Uri data = intent.getData();
                                data.getClass();
                                String encodedQuery = data.getEncodedQuery();
                                String strM = (encodedQuery == null || !encodedQuery.isEmpty()) ? l1d.m("https://spotify.com/pair?", encodedQuery) : "https://spotify.com/pair";
                                Context context = (Context) b72Var.b;
                                int i = PinPairingActivity.f1;
                                Intent intent2 = new Intent(context, (Class<?>) PinPairingActivity.class);
                                intent2.putExtra("url", strM);
                                return intent2;
                            case 1:
                                String dataString = intent.getDataString();
                                dataString.getClass();
                                Context context2 = (Context) b72Var.b;
                                int i2 = PinPairingActivity.f1;
                                Intent intent3 = new Intent(context2, (Class<?>) PinPairingActivity.class);
                                intent3.putExtra("url", dataString);
                                return intent3;
                            default:
                                return ((in60) b72Var.c).b(intent);
                        }
                    }
                });
                ajq0Var.D(new ebu(new ebu("https://www.spotify.com/pair", (byte) 1), (byte) 2), "Pair inApp view by URL", new is31(this) { // from class: p.x1t0
                    public final /* synthetic */ b72 b;

                    {
                        this.b = this;
                    }

                    public final Intent f(Intent intent) {
                        byte b5 = b4;
                        b72 b72Var = this.b;
                        switch (b5) {
                            case 0:
                                Uri data = intent.getData();
                                data.getClass();
                                String encodedQuery = data.getEncodedQuery();
                                String strM = (encodedQuery == null || !encodedQuery.isEmpty()) ? l1d.m("https://spotify.com/pair?", encodedQuery) : "https://spotify.com/pair";
                                Context context = (Context) b72Var.b;
                                int i = PinPairingActivity.f1;
                                Intent intent2 = new Intent(context, (Class<?>) PinPairingActivity.class);
                                intent2.putExtra("url", strM);
                                return intent2;
                            case 1:
                                String dataString = intent.getDataString();
                                dataString.getClass();
                                Context context2 = (Context) b72Var.b;
                                int i2 = PinPairingActivity.f1;
                                Intent intent3 = new Intent(context2, (Class<?>) PinPairingActivity.class);
                                intent3.putExtra("url", dataString);
                                return intent3;
                            default:
                                return ((in60) b72Var.c).b(intent);
                        }
                    }
                });
                ajq0Var.D(new ebu(new ebu("https://accounts.spotify.com/pair", (byte) 1), (byte) 2), "Pair inApp view by URL", new is31(this) { // from class: p.x1t0
                    public final /* synthetic */ b72 b;

                    {
                        this.b = this;
                    }

                    public final Intent f(Intent intent) {
                        byte b5 = b4;
                        b72 b72Var = this.b;
                        switch (b5) {
                            case 0:
                                Uri data = intent.getData();
                                data.getClass();
                                String encodedQuery = data.getEncodedQuery();
                                String strM = (encodedQuery == null || !encodedQuery.isEmpty()) ? l1d.m("https://spotify.com/pair?", encodedQuery) : "https://spotify.com/pair";
                                Context context = (Context) b72Var.b;
                                int i = PinPairingActivity.f1;
                                Intent intent2 = new Intent(context, (Class<?>) PinPairingActivity.class);
                                intent2.putExtra("url", strM);
                                return intent2;
                            case 1:
                                String dataString = intent.getDataString();
                                dataString.getClass();
                                Context context2 = (Context) b72Var.b;
                                int i2 = PinPairingActivity.f1;
                                Intent intent3 = new Intent(context2, (Class<?>) PinPairingActivity.class);
                                intent3.putExtra("url", dataString);
                                return intent3;
                            default:
                                return ((in60) b72Var.c).b(intent);
                        }
                    }
                });
                ajq0Var.D(new os80("android.nfc.action.NDEF_DISCOVERED", (byte) 0), "NFC tag with NDEF payload", new is31(this) { // from class: p.x1t0
                    public final /* synthetic */ b72 b;

                    {
                        this.b = this;
                    }

                    public final Intent f(Intent intent) {
                        byte b5 = b3;
                        b72 b72Var = this.b;
                        switch (b5) {
                            case 0:
                                Uri data = intent.getData();
                                data.getClass();
                                String encodedQuery = data.getEncodedQuery();
                                String strM = (encodedQuery == null || !encodedQuery.isEmpty()) ? l1d.m("https://spotify.com/pair?", encodedQuery) : "https://spotify.com/pair";
                                Context context = (Context) b72Var.b;
                                int i = PinPairingActivity.f1;
                                Intent intent2 = new Intent(context, (Class<?>) PinPairingActivity.class);
                                intent2.putExtra("url", strM);
                                return intent2;
                            case 1:
                                String dataString = intent.getDataString();
                                dataString.getClass();
                                Context context2 = (Context) b72Var.b;
                                int i2 = PinPairingActivity.f1;
                                Intent intent3 = new Intent(context2, (Class<?>) PinPairingActivity.class);
                                intent3.putExtra("url", dataString);
                                return intent3;
                            default:
                                return ((in60) b72Var.c).b(intent);
                        }
                    }
                });
                break;
            case 13:
                ajq0Var.C(blc0.Dd, "Open Cancel Subscription webview", new hvp0(this, (byte) 17));
                ajq0Var.C(blc0.Ed, "Open Close Account webview", new uip0(this, (byte) 18));
                ajq0Var.I(blc0.zd, "Page where user can see other available premium plans", m6r0.class, new aod(spv0.class, xpv0.b, (byte) 18));
                break;
            case 14:
                ajq0Var.J(l6o1.p(new jbh0[]{new ebu(blc0.Q5, (byte) 7)}), "A page for displaying AI playlist prompt creation with a pre-populated prompt", new jqd0(this, true, new y6w0(this, (byte) 13), (byte) 14));
                ajq0Var.J(l6o1.p(new jbh0[]{new ebu(blc0.O5, (byte) 7), new ebu(blc0.R5, (byte) 7)}), "A page for displaying AI playlist prompt creation", new jqd0(this, true, ibi0.N0, (byte) 14));
                ajq0Var.J(l6o1.p(new jbh0[]{new ebu(blc0.P5, (byte) 7), new ebu(blc0.S5, (byte) 7)}), "A route to re-edit an AI playlist using prompt creation", new jqd0(this, ((kiu0) obj).b.f(), gbw0.W0, (byte) 14));
                ajq0Var.J(l6o1.p(new jbh0[]{new ebu(blc0.De, (byte) 7)}), "A route to refine a prompted playlist", new hvp0(this, (byte) 24));
                break;
            case 15:
                ajq0Var.J(new ebu(blc0.Fe, (byte) 7), "Open Puffin intro in PageActivity", new hvp0(this, (byte) 27));
                break;
            case 16:
                for (rs61 rs61Var : ((ss61) obj).a) {
                    f(ajq0Var, rs61Var, rs61Var.a(), rq61.e);
                    if (!rs61Var.d().isEmpty()) {
                        f(ajq0Var, rs61Var, rs61Var.d(), fft0.a1);
                    }
                }
                ajq0Var.J(new ebu(blc0.Wf, (byte) 7), "Settings item", new ij01(this, (byte) 24));
                break;
            default:
                for (mu61 mu61Var : ((nu61) obj).a) {
                    ajq0Var.E(new ebu(l6o1.o(new jbh0[]{new ebu(mu61Var.a(), (byte) 6), new ebu(new i1w(mu61Var, mu61.class, "isEnabled", "isEnabled()Z", 0, (byte) 14), (byte) 5)}), (byte) 9), "Settings sheet", new dc31(this, mu61Var, (byte) 23));
                }
                break;
        }
    }

    public Intent e(Intent intent, boolean z) {
        Set set = s4b1.f;
        String strJ = uic.x(intent.getDataString()).j();
        Bundle extras = intent.getExtras();
        boolean z2 = (extras != null ? extras.getBoolean("com.spotify.blend.tastematch.effecthandlers.group.KEY_IS_INVITE") : false) || z;
        int i = BlendStoryContainerActivity.h1;
        Context context = (Context) this.b;
        if (strJ == null) {
            strJ = "";
        }
        Intent intent2 = new Intent(context, (Class<?>) BlendStoryContainerActivity.class);
        intent2.setFlags(268435456);
        intent2.putExtra("apps.music.features.blend-taste-match.key.PLAYLIST_URI", strJ);
        intent2.putExtra("apps.music.features.blend-taste-match.key.IS_BLEND_INVITE", z2);
        return intent2;
    }

    public void f(ajq0 ajq0Var, rs61 rs61Var, Set set, iu30 iu30Var) {
        ajq0Var.J(l6o1.o(new jbh0[]{new ebu(set, (byte) 6), new ebu(new i1w(rs61Var, rs61.class, "isEnabled", "isEnabled()Z", 0, (byte) 13), (byte) 5)}), "Settings page", new r961(iu30Var, rs61Var, this, (byte) 5));
    }

    public b72(jn7 jn7Var) {
        this.a = (byte) 7;
        this.b = jn7Var;
        this.c = ygn0.a();
    }

    public b72(mmo mmoVar, s6z0 s6z0Var, in60 in60Var) {
        this.a = (byte) 11;
        this.b = mmoVar;
        this.c = s6z0Var;
    }

    public /* synthetic */ b72(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
