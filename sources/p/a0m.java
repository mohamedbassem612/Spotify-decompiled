package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import com.spotify.deeplinkimpl.events.proto.DeeplinkOpenNonAuth;
import com.spotify.login.loginflowimpl.LoginActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class a0m implements k1q0, Function, fsc1, is31, ecz0, qiw, qp91, bx81, w9k1, ix30 {
    public final /* synthetic */ byte a;
    public Object b;

    public a0m(byte b) {
        this.a = b;
        switch (b) {
            case 25:
                this.b = new PublishSubject().c();
                break;
        }
    }

    public au90 A0() {
        return ((asl0) ((k9k) this.b).b).A0();
    }

    public fh4 D0() {
        return ((asl0) ((k9k) this.b).b).D0();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public ife0 a() {
        List<LinkAddress> linkAddresses;
        ArrayList arrayList;
        Object next;
        Object next2;
        LinkProperties linkProperties;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((idd1) ((tzo) ((yfc0) this.b).b).b).getValue();
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                boolean zHasTransport = networkCapabilities != null ? networkCapabilities.hasTransport(1) : false;
                boolean zHasTransport2 = networkCapabilities != null ? networkCapabilities.hasTransport(3) : false;
                if (!zHasTransport && !zHasTransport2) {
                    activeNetwork = null;
                }
            } else {
                activeNetwork = null;
            }
            linkAddresses = (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) ? null : linkProperties.getLinkAddresses();
        } catch (RemoteException | RuntimeException unused) {
        }
        if (linkAddresses != null) {
            List<LinkAddress> list = linkAddresses;
            arrayList = new ArrayList(q7h.U(list, 10));
            for (LinkAddress linkAddress : list) {
                arrayList.add(new cb4(linkAddress.getAddress(), linkAddress.getPrefixLength()));
            }
        } else {
            arrayList = z6x.a;
        }
        ArrayList<cb4> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        for (cb4 cb4Var : arrayList2) {
            arrayList3.add(new hfe0(cb4Var.a, cb4Var.b));
        }
        List listA1 = o7h.a1(o7h.p1(arrayList3), new cvt((byte) 29));
        Iterator it = listA1.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((hfe0) next).a instanceof Inet6Address));
        hfe0 hfe0Var = (hfe0) next;
        Integer numValueOf = hfe0Var != null ? Integer.valueOf(hfe0Var.b) : null;
        Iterator it2 = listA1.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((hfe0) next2).a instanceof Inet6Address);
        hfe0 hfe0Var2 = (hfe0) next2;
        return new ife0(hfe0Var2 != null ? Integer.valueOf(hfe0Var2.b) : null, numValueOf);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((w2z) this.b).j((w8v0) obj);
            case 10:
                idd1 idd1Var = ((o1r) this.b).c;
                return Boolean.valueOf(((ConnectivityManager) idd1Var.getValue()).isActiveNetworkMetered() && ((ConnectivityManager) idd1Var.getValue()).getRestrictBackgroundStatus() == 3);
            case 17:
                so soVar = (so) this.b;
                return ((yix0) soVar.b).a(((o6r0) soVar.c).e()).a(o7h.p1(((ch20) obj).c)).distinctUntilChanged().map(xbp1.V0);
            default:
                return ((fjx0) this.b).a(((jgx0) obj).a).distinctUntilChanged().map(s9w.X0);
        }
    }

    public void b(un91 un91Var) {
        ((p2p0) this.b).d(un91Var, "PlayModePicker.Dialog");
    }

    public Flowable c() {
        Flowable flowableC = ((asl0) ((k9k) this.b).b).c();
        c8o.l(flowableC);
        return flowableC;
    }

    public Subject d() {
        return (Subject) this.b;
    }

    public hfp1 e(Object obj) {
        jm61 jm61Var = (jm61) obj;
        jhn jhnVar = ((hhn) this.b).e;
        return jm61Var == null ? o0c.z((Object) null) : o0c.S(Arrays.asList(jhnVar.g(), jhnVar.m.l((String) null, (djn) jhnVar.e.b)));
    }

    public Intent f(Intent intent) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        int i = CulturalMomentsStoryActivity.g1;
        Context context = ((igo) this.b).b;
        String strJ = s4b1VarX.j();
        if (strJ == null) {
            strJ = "";
        }
        String strZ = s4b1VarX.z();
        String str = strZ != null ? strZ : "";
        Intent intent2 = new Intent(context, (Class<?>) CulturalMomentsStoryActivity.class);
        intent2.setFlags(268435456);
        intent2.putExtra("cultural_moments.story.id", strJ);
        intent2.putExtra("cultural_moments.story.uri", str);
        return intent2;
    }

    public void g(LoginActivity loginActivity, Intent intent) {
        if (u890.j(intent.getAction(), "android.intent.action.VIEW")) {
            k9r k9rVar = (k9r) this.b;
            String dataString = intent.getDataString();
            if (dataString == null || dataString.length() == 0) {
                return;
            }
            String dataString2 = intent.getDataString();
            dataString2.getClass();
            if (ihc1.h0(dataString2, "utm_campaign=", false) || ihc1.h0(dataString2, "utm_source=", false) || ihc1.h0(dataString2, "utm_medium=", false) || ihc1.h0(dataString2, "si=", false) || ((rm5) k9rVar.c).f(dataString2)) {
                Set set = s4b1.f;
                String strZ = uic.x(dataString2).z();
                String stringExtra = intent.getStringExtra("short_link");
                String stringExtra2 = intent.getStringExtra("shortlink_source");
                Uri referrer = loginActivity.getReferrer();
                String string = referrer != null ? referrer.toString() : null;
                String strB = ((x2g1) k9rVar.d).a.b();
                String stringExtra3 = intent.getStringExtra("extra_deeplink_navigation_reference");
                k9r k9rVar2 = (k9r) k9rVar.b;
                ycr ycrVarN = DeeplinkOpenNonAuth.n();
                ycrVarN.s(((y1k) k9rVar2.b).a(dataString2));
                ycrVarN.q(((gdr) k9rVar2.d).a(fdr.LOGGED_OUT));
                if (strZ != null && strZ.length() != 0) {
                    ycrVarN.r(strZ);
                }
                if (string != null && string.length() != 0) {
                    ycrVarN.x(string);
                }
                if (stringExtra != null && stringExtra.length() != 0) {
                    ycrVarN.u(stringExtra);
                    String strC = m5n1.C(stringExtra);
                    if (strC != null && strC.length() != 0) {
                        ycrVarN.v(m5n1.C(stringExtra));
                    }
                }
                if (stringExtra2 != null && stringExtra2.length() != 0) {
                    ycrVarN.w(stringExtra2);
                }
                ycrVarN.n(strB);
                if (stringExtra3 != null) {
                    ycrVarN.t(stringExtra3);
                }
                DeeplinkOpenNonAuth deeplinkOpenNonAuthBuild = ycrVarN.build();
                t2j0 t2j0Var = (t2j0) k9rVar2.c;
                deeplinkOpenNonAuthBuild.getClass();
                t2j0Var.a(deeplinkOpenNonAuthBuild);
                deeplinkOpenNonAuthBuild.toString();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(imt imtVar, onm onmVar) {
        lmt lmtVar;
        if (onmVar instanceof lmt) {
            lmtVar = (lmt) onmVar;
            int i = lmtVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lmtVar.d = i - Integer.MIN_VALUE;
            } else {
                lmtVar = new lmt(this, onmVar);
            }
        } else {
            lmtVar = new lmt(this, onmVar);
        }
        Object objA = lmtVar.b;
        int i2 = lmtVar.d;
        if (i2 == 0) {
            hm5.M(objA);
            Set set = s4b1.f;
            v5b1 v5b1Var = uic.x((String) o7h.q0(imtVar.a)).d;
            b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
            if (u890.j(type, nyu0.e) || u890.j(type, wyu0.f)) {
                return new jmt(jio.a, 1, imtVar.a);
            }
            elc0 elc0Var = (elc0) ((j380) this.b).get(imtVar.b);
            if (elc0Var != null) {
                lmtVar.a = imtVar;
                lmtVar.d = 1;
                objA = elc0Var.a(imtVar, lmtVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            }
            return new jmt(gio.a, 1, imtVar.a);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        imtVar = lmtVar.a;
        hm5.M(objA);
        jmt jmtVar = (jmt) objA;
        if (jmtVar != null) {
            return jmtVar;
        }
        return new jmt(gio.a, 1, imtVar.a);
    }

    public void i(j851 j851Var) {
        m4r m4rVar;
        j9r j9rVar = (j9r) this.b;
        h9r h9rVar = new h9r(j851Var);
        synchronized (j9rVar.a) {
            m4rVar = j9rVar.c;
            if (m4rVar == null) {
                j9rVar.b.add(h9rVar);
            }
        }
        if (m4rVar != null) {
            m4rVar.invoke(h9rVar);
        }
    }

    public kt91 j() {
        kt91 kt91VarJ = ((asl0) ((k9k) this.b).b).j();
        c8o.l(kt91VarJ);
        return kt91VarJ;
    }

    public csc1 k() {
        vrc1 vrc1Var = (vrc1) this.b;
        Activity activity = (Activity) vrc1Var.a.get();
        c8o.l(activity);
        lzn0 lzn0Var = (lzn0) vrc1Var.f.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) vrc1Var.g.get();
        c8o.l(a1r0Var);
        return new csc1(activity, lzn0Var, a1r0Var);
    }

    public void lock() {
        ((ReentrantLock) this.b).lock();
    }

    public i8h1 m() {
        i8h1 i8h1VarM = ((asl0) ((k9k) this.b).b).m();
        c8o.l(i8h1VarM);
        return i8h1VarM;
    }

    public void onFailure(Throwable th) {
        boolean z = th instanceof TimeoutException;
        mzc mzcVar = (mzc) this.b;
        if (z) {
            mzcVar.c(th);
        } else {
            mzcVar.b(Collections.EMPTY_LIST);
        }
    }

    public void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        ((mzc) this.b).b(new ArrayList(list));
    }

    public void unlock() {
        ((ReentrantLock) this.b).unlock();
    }

    public void v(Object obj) {
        switch (this.a) {
            case 13:
                zmr zmrVar = (zmr) this.b;
                e93 e93Var = zmrVar.e;
                ArrayList arrayList = new ArrayList();
                for (String str : (List) obj) {
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                int size = arrayList.size();
                List listSubList = arrayList;
                if (size > 3) {
                    listSubList = arrayList.subList(0, 3);
                }
                zmrVar.g.setAdapter(new an(((ConstraintLayout) e93Var.b).getContext(), listSubList, zmrVar.Z));
                return;
            case 14:
                Long l = (Long) obj;
                jnq jnqVar = (jnq) this.b;
                TextView textView = (TextView) ((g1i) jnqVar.c).d;
                l.getClass();
                textView.setText(jnqVar.b(2131820698, l.longValue()));
                return;
            case 16:
                int iIntValue = ((Number) obj).intValue();
                d520 d520Var = (d520) ((odr) this.b).c;
                ((ProgressBar) d520Var.e).setProgress(iIntValue);
                ((FrameLayout) d520Var.f).setVisibility(iIntValue > 0 ? 0 : 8);
                return;
            case 20:
                uhs uhsVar = (uhs) this.b;
                j4w0 j4w0Var = uhsVar.X;
                if (j4w0Var == null) {
                    u890.C("headerModel");
                    throw null;
                }
                boolean z = j4w0Var.f;
                ytp0 ytp0Var = uhsVar.f;
                if (z) {
                    ((ImageButton) ytp0Var.f).setVisibility(8);
                    return;
                } else {
                    ((ImageButton) ytp0Var.f).setVisibility(0);
                    return;
                }
            case 23:
                ((pkf1) this.b).setRestrictions$src_main_java_com_spotify_nowplaying_uiusecases_uiusecases((hkf1) obj);
                return;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                qws qwsVar = (qws) this.b;
                long jLongValue = ((Number) mmr0Var.a).longValue();
                long jLongValue2 = ((Number) mmr0Var.b).longValue();
                g931 g931Var = qwsVar.f;
                b8k1.t(qwsVar.c, qwsVar.a.getString(2131959268, g931Var.i((int) jLongValue), g931Var.i((int) jLongValue2)));
                return;
        }
    }

    public g5p0 w0() {
        g5p0 g5p0VarW0 = ((asl0) ((k9k) this.b).b).w0();
        c8o.l(g5p0VarW0);
        return g5p0VarW0;
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(519);
        ContentPickerFragment contentPickerFragment = (ContentPickerFragment) this.b;
        contentPickerFragment.X1 = nk80VarI.d;
        tzr0 tzr0Var = contentPickerFragment.Q1;
        tzr0Var.getClass();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) tzr0Var.b;
        coordinatorLayout.setPadding(nk80VarI.a, coordinatorLayout.getPaddingTop(), nk80VarI.c, coordinatorLayout.getPaddingBottom());
        return hsl1.b;
    }

    public a0m(xfx xfxVar, lzn0 lzn0Var, a1r0 a1r0Var, rzo rzoVar, tjq tjqVar, xf4 xf4Var, hod0 hod0Var) {
        this.a = (byte) 4;
        this.b = rzoVar;
    }

    public /* synthetic */ a0m(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public a0m(hhn hhnVar, String str) {
        this.a = (byte) 3;
        this.b = hhnVar;
    }
}
