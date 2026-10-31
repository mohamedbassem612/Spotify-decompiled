package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.bellbutton.BellButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.leavebehindads.events.proto.LeavebehindAdEvent;
import com.spotify.libs.sociallistening.events.proto.SocialConnectNotificationOpenError;
import com.spotify.mobius.MobiusLoop;
import com.spotify.nowplayingmini.nowplayingmini.NowPlayingMiniMode;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class byp implements dl4, s8b1, lqw {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public final Object i;

    public byp(mxm1 mxm1Var, ryj ryjVar, nxm1 nxm1Var) {
        this.b = mxm1Var;
        this.c = nxm1Var;
        this.a = xqu.b(new tsq(this, 0, (byte) 28));
        this.d = xqu.b(new tsq(this, 2, (byte) 28));
        this.e = iy81.a(new tsq(this, 4, (byte) 28));
        this.f = iy81.a(new tsq(this, 3, (byte) 28));
        this.g = iy81.a(new tsq(this, 6, (byte) 28));
        this.h = iy81.a(new tsq(this, 5, (byte) 28));
        this.i = iy81.a(new tsq(this, 1, (byte) 28));
    }

    public static ih90 E(zuc0 zuc0Var) {
        k1z k1zVar = zuc0Var.p;
        k1z k1zVar2 = k1zVar instanceof k1z ? k1zVar : null;
        String str = zuc0Var.i;
        String str2 = zuc0Var.c;
        String str3 = k1zVar2 != null ? k1zVar2.n.b : null;
        String str4 = str3 == null ? "" : str3;
        String str5 = k1zVar2 != null ? k1zVar2.n.c : null;
        String str6 = str5 == null ? "" : str5;
        String strA = k1zVar2 != null ? k1zVar2.n.d.a(2) : null;
        return new ih90(str4, str6, strA == null ? "" : strA, str, str2);
    }

    public static final /* synthetic */ c690 b(byp bypVar) {
        return (c690) bypVar.d;
    }

    public static final /* synthetic */ s331 c(byp bypVar) {
        return (s331) bypVar.f;
    }

    public static final /* synthetic */ n431 e(byp bypVar) {
        return (n431) bypVar.e;
    }

    public static re70 m() {
        return ((re70) ee70.a.a()).toBuilder().p(new y570[]{gd70.c.a.Q(k570.c).y(p("made-for-you-hub-loading-empty-view")).x()}).f();
    }

    public static HubsImmutableComponentBundle p(String str) {
        return HubsImmutableComponentBundle.b.a.J("tag", str).o();
    }

    public static boolean u(re70 re70Var) {
        zpb0 zpb0Var = ee70.a;
        return "hubs/placeholder".equals(re70Var.a()) && !re70Var.j().isEmpty() && "made-for-you-hub-error-empty-view".equals(((y570) re70Var.j().get(0)).g().B("tag"));
    }

    public static boolean v(cca0 cca0Var) {
        return cca0Var.a().b == xea0.X && (cca0Var instanceof bca0) && ((bca0) cca0Var).c.contains(ko90.e);
    }

    public static boolean x(zuc0 zuc0Var) {
        b9v0 b9v0VarA = zuc0Var.q.a(b9v0.class);
        return ((b9v0VarA == null || !b9v0VarA.a || b9v0VarA.b) && zuc0Var.b() == ltt0.b) ? false : true;
    }

    public void A(String str, Function0 function0) {
        oum oumVar = (oum) this.f;
        if (oumVar.b || oumVar.c) {
            try {
                v6b1 v6b1Var = new y6b1(str, false).c;
                if (v6b1Var == v6b1.N0 || v6b1Var == v6b1.O0) {
                    dma1 dma1Var = ((xio0) this.a).a;
                    bma1 bma1Var = xio0.b;
                    Set set = w7x.a;
                    Set setB = dma1Var.b(bma1Var, set);
                    if (setB != null) {
                        set = setB;
                    }
                    if (!set.contains(str)) {
                        fn31.T((u9c0) this.c, (o8n) null, 0, new p230(function0, this, str, (lnm) null), 3);
                        return;
                    }
                }
            } catch (SpotifyUriParserException unused) {
            }
        }
        function0.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:108:0x01df  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0209  */
    /* JADX WARN: Code duplicated, block: B:124:0x020c  */
    /* JADX WARN: Code duplicated, block: B:126:0x020f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0213  */
    /* JADX WARN: Code duplicated, block: B:133:0x0256 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:134:0x0257 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:135:0x0258  */
    /* JADX WARN: Code duplicated, block: B:137:0x025d  */
    /* JADX WARN: Code duplicated, block: B:140:0x026c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0270  */
    /* JADX WARN: Code duplicated, block: B:143:0x0274  */
    /* JADX WARN: Code duplicated, block: B:150:0x0281  */
    /* JADX WARN: Code duplicated, block: B:151:0x0294  */
    /* JADX WARN: Code duplicated, block: B:153:0x0298  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:174:0x0309  */
    /* JADX WARN: Code duplicated, block: B:176:0x030d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0311  */
    /* JADX WARN: Code duplicated, block: B:182:0x031d  */
    /* JADX WARN: Code duplicated, block: B:183:0x031f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0323  */
    /* JADX WARN: Code duplicated, block: B:187:0x0329  */
    /* JADX WARN: Code duplicated, block: B:190:0x0345  */
    /* JADX WARN: Code duplicated, block: B:192:0x0349  */
    /* JADX WARN: Code duplicated, block: B:194:0x034d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:? A[LOOP:0: B:87:0x0183->B:200:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[LOOP:1: B:106:0x01d9->B:203:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0133  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:76:0x015a  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b A[PHI: r1 r6 r15
      0x015b: PHI (r1v22 p.qo90) = (r1v8 p.qo90), (r1v25 p.qo90) binds: [B:68:0x013c, B:76:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r6v28 p.cca0) = (r6v26 p.cca0), (r6v32 p.cca0) binds: [B:68:0x013c, B:76:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r15v9 java.lang.String) = (r15v7 java.lang.String), (r15v10 java.lang.String) binds: [B:68:0x013c, B:76:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:83:0x0175  */
    /* JADX WARN: Code duplicated, block: B:89:0x0189  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bc  */
    public Object B(String str, cca0 cca0Var, onm onmVar) {
        gca0 gca0Var;
        String str2;
        Object objH;
        c1a0 e1a0Var;
        b1a0 b1a0Var;
        boolean z;
        bca0 bca0Var;
        String str3;
        u4a1 v4a1Var;
        boolean z2;
        String str4;
        String str5;
        String str6;
        qo90 qo90Var;
        Object objT;
        cca0 cca0Var2;
        qo90 qo90Var2;
        String str7;
        Object obj;
        String str8;
        wea0 wea0VarA;
        m4a0 m4a0Var;
        Object objB;
        bca0 bca0Var2;
        List list;
        List list2;
        Iterator it;
        int iOrdinal;
        bca0 bca0Var3;
        String str9;
        List list3;
        Iterator it2;
        jut jutVar;
        wea0 wea0VarA2;
        cca0 cca0Var3 = cca0Var;
        ynb0 ynb0Var = ((b0a0) this.i).a;
        z1s z1sVar = (z1s) this.a;
        if (onmVar instanceof gca0) {
            gca0Var = (gca0) onmVar;
            int i = gca0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gca0Var.f = i - Integer.MIN_VALUE;
            } else {
                gca0Var = new gca0(this, onmVar);
            }
        } else {
            gca0Var = new gca0(this, onmVar);
        }
        Object objJ = gca0Var.d;
        int i2 = gca0Var.f;
        xea0 xea0Var = xea0.c;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        switch (i2) {
            case 0:
                hm5.M(objJ);
                str2 = str;
                gca0Var.a = str2;
                gca0Var.b = cca0Var3;
                gca0Var.f = 1;
                if (cca0Var3 instanceof aca0) {
                    objH = new e1a0(((aca0) cca0Var3).b);
                } else {
                    if (!(cca0Var3 instanceof bca0)) {
                        eg.o();
                        return null;
                    }
                    bca0 bca0Var4 = (bca0) cca0Var3;
                    objH = ((xap) this.c).h(bca0Var4.b, bca0Var4.c, gca0Var);
                    if (objH != d9nVar2) {
                        objH = (f1a0) objH;
                    }
                }
                if (objH != d9nVar2) {
                    e1a0Var = (f1a0) objH;
                    if (!(e1a0Var instanceof d1a0)) {
                        if (e1a0Var instanceof e1a0) {
                            eg.o();
                            return null;
                        }
                        obj = ((e1a0) e1a0Var).a;
                        if (obj == null) {
                            e1a0Var = new c1a0(404, "not_found");
                        } else {
                            e1a0Var = new e1a0(obj);
                        }
                    }
                    if (e1a0Var instanceof e1a0) {
                        if (e1a0Var instanceof d1a0) {
                            eg.o();
                            return null;
                        }
                        b1a0Var = (d1a0) e1a0Var;
                        if (cca0Var3.a().b == xea0.e) {
                            if (cca0Var3 instanceof bca0) {
                                bca0Var = (bca0) cca0Var3;
                            } else {
                                bca0Var = null;
                            }
                            if (bca0Var != null && (str3 = bca0Var.b) != null) {
                                if (b1a0Var instanceof b1a0) {
                                    v4a1Var = new u4a1(b1a0Var.a.getClass().getSimpleName());
                                } else {
                                    if (b1a0Var instanceof c1a0) {
                                        eg.o();
                                        return null;
                                    }
                                    c1a0 c1a0Var = (c1a0) b1a0Var;
                                    v4a1Var = new v4a1(c1a0Var.a, c1a0Var.b);
                                }
                                cpr cprVar = (cpr) ((g2z) this.h).e;
                                z2 = v4a1Var instanceof u4a1;
                                if (z2) {
                                    str4 = "client";
                                } else {
                                    if (v4a1Var instanceof v4a1) {
                                        eg.o();
                                        return null;
                                    }
                                    str4 = "server";
                                }
                                str5 = "Unknown";
                                if (z2) {
                                    str6 = v4a1Var.a;
                                    if (str6 != null) {
                                        str5 = str6;
                                    }
                                } else {
                                    if (v4a1Var instanceof v4a1) {
                                        eg.o();
                                        return null;
                                    }
                                    v4a1 v4a1Var2 = (v4a1) v4a1Var;
                                    String str10 = v4a1Var2.b;
                                    str5 = v4a1Var2.a + ":" + (str10 != null ? str10 : "Unknown");
                                }
                                gy91 gy91VarN = SocialConnectNotificationOpenError.n();
                                gy91VarN.s(str3);
                                gy91VarN.r("lockscreen-invite-open-error");
                                gy91VarN.n(str4);
                                gy91VarN.q(str5);
                                SocialConnectNotificationOpenError socialConnectNotificationOpenErrorBuild = gy91VarN.build();
                                t2j0 t2j0Var = cprVar.a;
                                socialConnectNotificationOpenErrorBuild.getClass();
                                t2j0Var.a(socialConnectNotificationOpenErrorBuild);
                            }
                        }
                        wea0 wea0VarA3 = cca0Var3.a();
                        if (!(b1a0Var instanceof b1a0)) {
                            z = false;
                        } else {
                            if (b1a0Var instanceof c1a0) {
                                eg.o();
                                return null;
                            }
                            if (e1a0Var.a == 404) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        z1sVar.a(new yh70(!z, p7h.M(new xea0[]{xea0.d, xea0Var}).contains(wea0VarA3.b)));
                        return d9nVar;
                    }
                    qo90Var = (qo90) ((e1a0) e1a0Var).a;
                    gca0Var.a = str2;
                    gca0Var.b = cca0Var3;
                    gca0Var.c = qo90Var;
                    gca0Var.f = 2;
                    objT = t(qo90Var, gca0Var);
                    if (objT != d9nVar2) {
                        cca0Var2 = cca0Var3;
                        qo90Var2 = qo90Var;
                        str7 = str2;
                        objJ = objT;
                        if (((Boolean) objJ).booleanValue()) {
                            if (cca0Var2 instanceof bca0) {
                                bca0Var2 = (bca0) cca0Var2;
                                if (bca0Var2.a.b == xea0Var && u890.j(bca0Var2.d, "android-automotive")) {
                                    z1sVar.a(bj70.c);
                                    return d9nVar;
                                }
                            }
                            wea0VarA = cca0Var2.a();
                            gca0Var.a = null;
                            gca0Var.b = null;
                            gca0Var.c = null;
                            gca0Var.f = 3;
                            p410 p410Var = (p410) this.f;
                            if (hca0.a[wea0VarA.b.ordinal()] == 1) {
                                m4a0Var = m4a0.a;
                            } else {
                                m4a0Var = r4a0.a;
                            }
                            objB = p410Var.B(m4a0Var, (ou80) null, (aet0) null, gca0Var);
                            if (objB != d9nVar2) {
                                objB = d9nVar;
                            }
                            if (objB != d9nVar2) {
                                return d9nVar;
                            }
                        } else if (v(cca0Var2)) {
                            gca0Var.a = str7;
                            gca0Var.b = cca0Var2;
                            gca0Var.c = qo90Var2;
                            gca0Var.f = 4;
                            objJ = j(str7, qo90Var2, gca0Var);
                            if (objJ != d9nVar2) {
                                str8 = str7;
                                if (((Boolean) objJ).booleanValue()) {
                                    str7 = str8;
                                    if (((no4) ynb0Var.get()).D() && v(cca0Var2)) {
                                        list3 = qo90Var2.f;
                                        if ((list3 instanceof Collection) || !list3.isEmpty()) {
                                            it2 = list3.iterator();
                                            while (it2.hasNext()) {
                                                if (((no90) it2.next()).c.a) {
                                                    jutVar = (jut) this.e;
                                                    wea0VarA2 = cca0Var2.a();
                                                    gca0Var.a = null;
                                                    gca0Var.b = null;
                                                    gca0Var.c = null;
                                                    gca0Var.f = 5;
                                                    if (jutVar.g(str7, wea0VarA2, qo90Var2, gca0Var) != d9nVar2) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (!((no4) ynb0Var.get()).e0()) {
                                        list = qo90Var2.f;
                                        if (!list.isEmpty()) {
                                            list2 = list;
                                            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                                it = list2.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        iOrdinal = cca0Var2.a().b.ordinal();
                                                        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 10 && iOrdinal != 11) {
                                                            if (cca0Var2 instanceof bca0) {
                                                                bca0Var3 = (bca0) cca0Var2;
                                                            } else {
                                                                bca0Var3 = null;
                                                            }
                                                            str9 = bca0Var3 != null ? bca0Var3.b : null;
                                                            if (str9 == null) {
                                                                str9 = "";
                                                            }
                                                            z1sVar.a(new si70(false, str9));
                                                            return d9nVar;
                                                        }
                                                    } else if (((no90) it.next()).a == 3) {
                                                    }
                                                }
                                            } else {
                                                iOrdinal = cca0Var2.a().b.ordinal();
                                                if (iOrdinal != 2) {
                                                    if (cca0Var2 instanceof bca0) {
                                                        bca0Var3 = (bca0) cca0Var2;
                                                    } else {
                                                        bca0Var3 = null;
                                                    }
                                                    if (bca0Var3 != null) {
                                                    }
                                                    if (str9 == null) {
                                                        str9 = "";
                                                    }
                                                    z1sVar.a(new si70(false, str9));
                                                    return d9nVar;
                                                }
                                            }
                                        }
                                    }
                                    up41 up41Var = (up41) this.d;
                                    wea0 wea0VarA4 = cca0Var2.a();
                                    gca0Var.a = null;
                                    gca0Var.b = null;
                                    gca0Var.c = null;
                                    gca0Var.f = 6;
                                    ser serVar = (ser) ((h0y) up41Var.b).b;
                                    String str11 = nik1.C5.a;
                                    Parcelable kca0Var = new kca0(new hqr0(qo90Var2), wea0VarA4.b);
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelable("join.jam.sheet.args", kca0Var);
                                    serVar.a(str7, str11, bundle);
                                    if (d9nVar != d9nVar2) {
                                    }
                                }
                                return d9nVar;
                            }
                        } else {
                            if (((no4) ynb0Var.get()).D()) {
                                list3 = qo90Var2.f;
                                if (list3 instanceof Collection) {
                                }
                                it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    if (((no90) it2.next()).c.a) {
                                        jutVar = (jut) this.e;
                                        wea0VarA2 = cca0Var2.a();
                                        gca0Var.a = null;
                                        gca0Var.b = null;
                                        gca0Var.c = null;
                                        gca0Var.f = 5;
                                        if (jutVar.g(str7, wea0VarA2, qo90Var2, gca0Var) != d9nVar2) {
                                            return d9nVar;
                                        }
                                    }
                                }
                            }
                            if (!((no4) ynb0Var.get()).e0()) {
                                list = qo90Var2.f;
                                if (!list.isEmpty()) {
                                    list2 = list;
                                    if (list2 instanceof Collection) {
                                        it = list2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                iOrdinal = cca0Var2.a().b.ordinal();
                                                if (iOrdinal != 2) {
                                                    if (cca0Var2 instanceof bca0) {
                                                        bca0Var3 = (bca0) cca0Var2;
                                                    } else {
                                                        bca0Var3 = null;
                                                    }
                                                    if (bca0Var3 != null) {
                                                    }
                                                    if (str9 == null) {
                                                        str9 = "";
                                                    }
                                                    z1sVar.a(new si70(false, str9));
                                                    return d9nVar;
                                                }
                                            } else if (((no90) it.next()).a == 3) {
                                            }
                                        }
                                    } else {
                                        it = list2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                iOrdinal = cca0Var2.a().b.ordinal();
                                                if (iOrdinal != 2) {
                                                    if (cca0Var2 instanceof bca0) {
                                                        bca0Var3 = (bca0) cca0Var2;
                                                    } else {
                                                        bca0Var3 = null;
                                                    }
                                                    if (bca0Var3 != null) {
                                                    }
                                                    if (str9 == null) {
                                                        str9 = "";
                                                    }
                                                    z1sVar.a(new si70(false, str9));
                                                    return d9nVar;
                                                }
                                            } else if (((no90) it.next()).a == 3) {
                                            }
                                        }
                                    }
                                }
                            }
                            up41 up41Var2 = (up41) this.d;
                            wea0 wea0VarA5 = cca0Var2.a();
                            gca0Var.a = null;
                            gca0Var.b = null;
                            gca0Var.c = null;
                            gca0Var.f = 6;
                            ser serVar2 = (ser) ((h0y) up41Var2.b).b;
                            String str12 = nik1.C5.a;
                            Parcelable kca0Var2 = new kca0(new hqr0(qo90Var2), wea0VarA5.b);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("join.jam.sheet.args", kca0Var2);
                            serVar2.a(str7, str12, bundle2);
                            if (d9nVar != d9nVar2) {
                                return d9nVar;
                            }
                        }
                    }
                }
                return d9nVar2;
            case 1:
                cca0Var3 = gca0Var.b;
                String str13 = gca0Var.a;
                hm5.M(objJ);
                objH = objJ;
                str2 = str13;
                e1a0Var = (f1a0) objH;
                if (!(e1a0Var instanceof d1a0)) {
                    if (e1a0Var instanceof e1a0) {
                        eg.o();
                        return null;
                    }
                    obj = ((e1a0) e1a0Var).a;
                    if (obj == null) {
                        e1a0Var = new c1a0(404, "not_found");
                    } else {
                        e1a0Var = new e1a0(obj);
                    }
                }
                if (e1a0Var instanceof e1a0) {
                    if (e1a0Var instanceof d1a0) {
                        eg.o();
                        return null;
                    }
                    b1a0Var = (d1a0) e1a0Var;
                    if (cca0Var3.a().b == xea0.e) {
                        if (cca0Var3 instanceof bca0) {
                            bca0Var = (bca0) cca0Var3;
                        } else {
                            bca0Var = null;
                        }
                        if (bca0Var != null) {
                            if (b1a0Var instanceof b1a0) {
                                v4a1Var = new u4a1(b1a0Var.a.getClass().getSimpleName());
                            } else {
                                if (b1a0Var instanceof c1a0) {
                                    eg.o();
                                    return null;
                                }
                                c1a0 c1a0Var2 = (c1a0) b1a0Var;
                                v4a1Var = new v4a1(c1a0Var2.a, c1a0Var2.b);
                            }
                            cpr cprVar2 = (cpr) ((g2z) this.h).e;
                            z2 = v4a1Var instanceof u4a1;
                            if (z2) {
                                str4 = "client";
                            } else {
                                if (v4a1Var instanceof v4a1) {
                                    eg.o();
                                    return null;
                                }
                                str4 = "server";
                            }
                            str5 = "Unknown";
                            if (z2) {
                                str6 = v4a1Var.a;
                                if (str6 != null) {
                                    str5 = str6;
                                }
                            } else {
                                if (v4a1Var instanceof v4a1) {
                                    eg.o();
                                    return null;
                                }
                                v4a1 v4a1Var3 = (v4a1) v4a1Var;
                                String str14 = v4a1Var3.b;
                                if (str14 != null) {
                                }
                                str5 = v4a1Var3.a + ":" + (str14 != null ? str14 : "Unknown");
                            }
                            gy91 gy91VarN2 = SocialConnectNotificationOpenError.n();
                            gy91VarN2.s(str3);
                            gy91VarN2.r("lockscreen-invite-open-error");
                            gy91VarN2.n(str4);
                            gy91VarN2.q(str5);
                            SocialConnectNotificationOpenError socialConnectNotificationOpenErrorBuild2 = gy91VarN2.build();
                            t2j0 t2j0Var2 = cprVar2.a;
                            socialConnectNotificationOpenErrorBuild2.getClass();
                            t2j0Var2.a(socialConnectNotificationOpenErrorBuild2);
                        }
                    }
                    wea0 wea0VarA6 = cca0Var3.a();
                    if (!(b1a0Var instanceof b1a0)) {
                        z = false;
                    } else {
                        if (b1a0Var instanceof c1a0) {
                            eg.o();
                            return null;
                        }
                        if (e1a0Var.a == 404) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z1sVar.a(new yh70(!z, p7h.M(new xea0[]{xea0.d, xea0Var}).contains(wea0VarA6.b)));
                    return d9nVar;
                }
                qo90Var = (qo90) ((e1a0) e1a0Var).a;
                gca0Var.a = str2;
                gca0Var.b = cca0Var3;
                gca0Var.c = qo90Var;
                gca0Var.f = 2;
                objT = t(qo90Var, gca0Var);
                if (objT != d9nVar2) {
                    cca0Var2 = cca0Var3;
                    qo90Var2 = qo90Var;
                    str7 = str2;
                    objJ = objT;
                    if (((Boolean) objJ).booleanValue()) {
                        if (cca0Var2 instanceof bca0) {
                            bca0Var2 = (bca0) cca0Var2;
                            if (bca0Var2.a.b == xea0Var) {
                                z1sVar.a(bj70.c);
                                return d9nVar;
                            }
                        }
                        wea0VarA = cca0Var2.a();
                        gca0Var.a = null;
                        gca0Var.b = null;
                        gca0Var.c = null;
                        gca0Var.f = 3;
                        p410 p410Var2 = (p410) this.f;
                        if (hca0.a[wea0VarA.b.ordinal()] == 1) {
                            m4a0Var = m4a0.a;
                        } else {
                            m4a0Var = r4a0.a;
                        }
                        objB = p410Var2.B(m4a0Var, (ou80) null, (aet0) null, gca0Var);
                        if (objB != d9nVar2) {
                            objB = d9nVar;
                        }
                        if (objB != d9nVar2) {
                            return d9nVar;
                        }
                    } else if (v(cca0Var2)) {
                        gca0Var.a = str7;
                        gca0Var.b = cca0Var2;
                        gca0Var.c = qo90Var2;
                        gca0Var.f = 4;
                        objJ = j(str7, qo90Var2, gca0Var);
                        if (objJ != d9nVar2) {
                            str8 = str7;
                            if (((Boolean) objJ).booleanValue()) {
                                str7 = str8;
                                if (((no4) ynb0Var.get()).D()) {
                                    list3 = qo90Var2.f;
                                    if (list3 instanceof Collection) {
                                    }
                                    it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (((no90) it2.next()).c.a) {
                                            jutVar = (jut) this.e;
                                            wea0VarA2 = cca0Var2.a();
                                            gca0Var.a = null;
                                            gca0Var.b = null;
                                            gca0Var.c = null;
                                            gca0Var.f = 5;
                                            if (jutVar.g(str7, wea0VarA2, qo90Var2, gca0Var) != d9nVar2) {
                                            }
                                        }
                                    }
                                }
                                if (!((no4) ynb0Var.get()).e0()) {
                                    list = qo90Var2.f;
                                    if (!list.isEmpty()) {
                                        list2 = list;
                                        if (list2 instanceof Collection) {
                                            it = list2.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    iOrdinal = cca0Var2.a().b.ordinal();
                                                    if (iOrdinal != 2) {
                                                        if (cca0Var2 instanceof bca0) {
                                                            bca0Var3 = (bca0) cca0Var2;
                                                        } else {
                                                            bca0Var3 = null;
                                                        }
                                                        if (bca0Var3 != null) {
                                                        }
                                                        if (str9 == null) {
                                                            str9 = "";
                                                        }
                                                        z1sVar.a(new si70(false, str9));
                                                        return d9nVar;
                                                    }
                                                } else if (((no90) it.next()).a == 3) {
                                                }
                                            }
                                        } else {
                                            it = list2.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    iOrdinal = cca0Var2.a().b.ordinal();
                                                    if (iOrdinal != 2) {
                                                        if (cca0Var2 instanceof bca0) {
                                                            bca0Var3 = (bca0) cca0Var2;
                                                        } else {
                                                            bca0Var3 = null;
                                                        }
                                                        if (bca0Var3 != null) {
                                                        }
                                                        if (str9 == null) {
                                                            str9 = "";
                                                        }
                                                        z1sVar.a(new si70(false, str9));
                                                        return d9nVar;
                                                    }
                                                } else if (((no90) it.next()).a == 3) {
                                                }
                                            }
                                        }
                                    }
                                }
                                up41 up41Var3 = (up41) this.d;
                                wea0 wea0VarA7 = cca0Var2.a();
                                gca0Var.a = null;
                                gca0Var.b = null;
                                gca0Var.c = null;
                                gca0Var.f = 6;
                                ser serVar3 = (ser) ((h0y) up41Var3.b).b;
                                String str15 = nik1.C5.a;
                                Parcelable kca0Var3 = new kca0(new hqr0(qo90Var2), wea0VarA7.b);
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("join.jam.sheet.args", kca0Var3);
                                serVar3.a(str7, str15, bundle3);
                                if (d9nVar != d9nVar2) {
                                }
                                break;
                            }
                            return d9nVar;
                        }
                    } else {
                        if (((no4) ynb0Var.get()).D()) {
                            list3 = qo90Var2.f;
                            if (list3 instanceof Collection) {
                            }
                            it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (((no90) it2.next()).c.a) {
                                    jutVar = (jut) this.e;
                                    wea0VarA2 = cca0Var2.a();
                                    gca0Var.a = null;
                                    gca0Var.b = null;
                                    gca0Var.c = null;
                                    gca0Var.f = 5;
                                    if (jutVar.g(str7, wea0VarA2, qo90Var2, gca0Var) != d9nVar2) {
                                        return d9nVar;
                                    }
                                }
                            }
                        }
                        if (!((no4) ynb0Var.get()).e0()) {
                            list = qo90Var2.f;
                            if (!list.isEmpty()) {
                                list2 = list;
                                if (list2 instanceof Collection) {
                                    it = list2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            iOrdinal = cca0Var2.a().b.ordinal();
                                            if (iOrdinal != 2) {
                                                if (cca0Var2 instanceof bca0) {
                                                    bca0Var3 = (bca0) cca0Var2;
                                                } else {
                                                    bca0Var3 = null;
                                                }
                                                if (bca0Var3 != null) {
                                                }
                                                if (str9 == null) {
                                                    str9 = "";
                                                }
                                                z1sVar.a(new si70(false, str9));
                                                return d9nVar;
                                            }
                                        } else if (((no90) it.next()).a == 3) {
                                        }
                                    }
                                } else {
                                    it = list2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            iOrdinal = cca0Var2.a().b.ordinal();
                                            if (iOrdinal != 2) {
                                                if (cca0Var2 instanceof bca0) {
                                                    bca0Var3 = (bca0) cca0Var2;
                                                } else {
                                                    bca0Var3 = null;
                                                }
                                                if (bca0Var3 != null) {
                                                }
                                                if (str9 == null) {
                                                    str9 = "";
                                                }
                                                z1sVar.a(new si70(false, str9));
                                                return d9nVar;
                                            }
                                        } else if (((no90) it.next()).a == 3) {
                                        }
                                    }
                                }
                            }
                        }
                        up41 up41Var4 = (up41) this.d;
                        wea0 wea0VarA8 = cca0Var2.a();
                        gca0Var.a = null;
                        gca0Var.b = null;
                        gca0Var.c = null;
                        gca0Var.f = 6;
                        ser serVar4 = (ser) ((h0y) up41Var4.b).b;
                        String str16 = nik1.C5.a;
                        Parcelable kca0Var4 = new kca0(new hqr0(qo90Var2), wea0VarA8.b);
                        Bundle bundle4 = new Bundle();
                        bundle4.putParcelable("join.jam.sheet.args", kca0Var4);
                        serVar4.a(str7, str16, bundle4);
                        if (d9nVar != d9nVar2) {
                            return d9nVar;
                        }
                    }
                    break;
                }
                return d9nVar2;
            case 2:
                qo90Var2 = gca0Var.c;
                cca0Var2 = gca0Var.b;
                str7 = gca0Var.a;
                hm5.M(objJ);
                if (((Boolean) objJ).booleanValue()) {
                    if (cca0Var2 instanceof bca0) {
                        bca0Var2 = (bca0) cca0Var2;
                        if (bca0Var2.a.b == xea0Var) {
                            z1sVar.a(bj70.c);
                            return d9nVar;
                        }
                    }
                    wea0VarA = cca0Var2.a();
                    gca0Var.a = null;
                    gca0Var.b = null;
                    gca0Var.c = null;
                    gca0Var.f = 3;
                    p410 p410Var3 = (p410) this.f;
                    if (hca0.a[wea0VarA.b.ordinal()] == 1) {
                        m4a0Var = m4a0.a;
                    } else {
                        m4a0Var = r4a0.a;
                    }
                    objB = p410Var3.B(m4a0Var, (ou80) null, (aet0) null, gca0Var);
                    if (objB != d9nVar2) {
                        objB = d9nVar;
                    }
                    if (objB != d9nVar2) {
                        return d9nVar;
                    }
                } else if (v(cca0Var2)) {
                    gca0Var.a = str7;
                    gca0Var.b = cca0Var2;
                    gca0Var.c = qo90Var2;
                    gca0Var.f = 4;
                    objJ = j(str7, qo90Var2, gca0Var);
                    if (objJ != d9nVar2) {
                        str8 = str7;
                        if (((Boolean) objJ).booleanValue()) {
                            str7 = str8;
                            if (((no4) ynb0Var.get()).D()) {
                                list3 = qo90Var2.f;
                                if (list3 instanceof Collection) {
                                }
                                it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    if (((no90) it2.next()).c.a) {
                                        jutVar = (jut) this.e;
                                        wea0VarA2 = cca0Var2.a();
                                        gca0Var.a = null;
                                        gca0Var.b = null;
                                        gca0Var.c = null;
                                        gca0Var.f = 5;
                                        if (jutVar.g(str7, wea0VarA2, qo90Var2, gca0Var) != d9nVar2) {
                                        }
                                    }
                                }
                            }
                            if (!((no4) ynb0Var.get()).e0()) {
                                list = qo90Var2.f;
                                if (!list.isEmpty()) {
                                    list2 = list;
                                    if (list2 instanceof Collection) {
                                        it = list2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                iOrdinal = cca0Var2.a().b.ordinal();
                                                if (iOrdinal != 2) {
                                                    if (cca0Var2 instanceof bca0) {
                                                        bca0Var3 = (bca0) cca0Var2;
                                                    } else {
                                                        bca0Var3 = null;
                                                    }
                                                    if (bca0Var3 != null) {
                                                    }
                                                    if (str9 == null) {
                                                        str9 = "";
                                                    }
                                                    z1sVar.a(new si70(false, str9));
                                                    return d9nVar;
                                                }
                                            } else if (((no90) it.next()).a == 3) {
                                            }
                                        }
                                    } else {
                                        it = list2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                iOrdinal = cca0Var2.a().b.ordinal();
                                                if (iOrdinal != 2) {
                                                    if (cca0Var2 instanceof bca0) {
                                                        bca0Var3 = (bca0) cca0Var2;
                                                    } else {
                                                        bca0Var3 = null;
                                                    }
                                                    if (bca0Var3 != null) {
                                                    }
                                                    if (str9 == null) {
                                                        str9 = "";
                                                    }
                                                    z1sVar.a(new si70(false, str9));
                                                    return d9nVar;
                                                }
                                            } else if (((no90) it.next()).a == 3) {
                                            }
                                        }
                                    }
                                }
                            }
                            up41 up41Var5 = (up41) this.d;
                            wea0 wea0VarA9 = cca0Var2.a();
                            gca0Var.a = null;
                            gca0Var.b = null;
                            gca0Var.c = null;
                            gca0Var.f = 6;
                            ser serVar5 = (ser) ((h0y) up41Var5.b).b;
                            String str17 = nik1.C5.a;
                            Parcelable kca0Var5 = new kca0(new hqr0(qo90Var2), wea0VarA9.b);
                            Bundle bundle5 = new Bundle();
                            bundle5.putParcelable("join.jam.sheet.args", kca0Var5);
                            serVar5.a(str7, str17, bundle5);
                            if (d9nVar != d9nVar2) {
                            }
                            break;
                        }
                        return d9nVar;
                    }
                } else {
                    if (((no4) ynb0Var.get()).D()) {
                        list3 = qo90Var2.f;
                        if (list3 instanceof Collection) {
                        }
                        it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if (((no90) it2.next()).c.a) {
                                jutVar = (jut) this.e;
                                wea0VarA2 = cca0Var2.a();
                                gca0Var.a = null;
                                gca0Var.b = null;
                                gca0Var.c = null;
                                gca0Var.f = 5;
                                if (jutVar.g(str7, wea0VarA2, qo90Var2, gca0Var) != d9nVar2) {
                                    return d9nVar;
                                }
                            }
                        }
                    }
                    if (!((no4) ynb0Var.get()).e0()) {
                        list = qo90Var2.f;
                        if (!list.isEmpty()) {
                            list2 = list;
                            if (list2 instanceof Collection) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        iOrdinal = cca0Var2.a().b.ordinal();
                                        if (iOrdinal != 2) {
                                            if (cca0Var2 instanceof bca0) {
                                                bca0Var3 = (bca0) cca0Var2;
                                            } else {
                                                bca0Var3 = null;
                                            }
                                            if (bca0Var3 != null) {
                                            }
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            z1sVar.a(new si70(false, str9));
                                            return d9nVar;
                                        }
                                    } else if (((no90) it.next()).a == 3) {
                                    }
                                }
                            } else {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        iOrdinal = cca0Var2.a().b.ordinal();
                                        if (iOrdinal != 2) {
                                            if (cca0Var2 instanceof bca0) {
                                                bca0Var3 = (bca0) cca0Var2;
                                            } else {
                                                bca0Var3 = null;
                                            }
                                            if (bca0Var3 != null) {
                                            }
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            z1sVar.a(new si70(false, str9));
                                            return d9nVar;
                                        }
                                    } else if (((no90) it.next()).a == 3) {
                                    }
                                }
                            }
                        }
                    }
                    up41 up41Var6 = (up41) this.d;
                    wea0 wea0VarA10 = cca0Var2.a();
                    gca0Var.a = null;
                    gca0Var.b = null;
                    gca0Var.c = null;
                    gca0Var.f = 6;
                    ser serVar6 = (ser) ((h0y) up41Var6.b).b;
                    String str18 = nik1.C5.a;
                    Parcelable kca0Var6 = new kca0(new hqr0(qo90Var2), wea0VarA10.b);
                    Bundle bundle6 = new Bundle();
                    bundle6.putParcelable("join.jam.sheet.args", kca0Var6);
                    serVar6.a(str7, str18, bundle6);
                    if (d9nVar != d9nVar2) {
                        return d9nVar;
                    }
                }
                return d9nVar2;
            case 3:
                hm5.M(objJ);
                return d9nVar;
            case 4:
                qo90Var2 = gca0Var.c;
                cca0Var2 = gca0Var.b;
                str8 = gca0Var.a;
                hm5.M(objJ);
                if (((Boolean) objJ).booleanValue()) {
                    str7 = str8;
                    if (((no4) ynb0Var.get()).D()) {
                        list3 = qo90Var2.f;
                        if (list3 instanceof Collection) {
                        }
                        it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if (((no90) it2.next()).c.a) {
                                jutVar = (jut) this.e;
                                wea0VarA2 = cca0Var2.a();
                                gca0Var.a = null;
                                gca0Var.b = null;
                                gca0Var.c = null;
                                gca0Var.f = 5;
                                if (jutVar.g(str7, wea0VarA2, qo90Var2, gca0Var) != d9nVar2) {
                                    return d9nVar2;
                                }
                            }
                        }
                    }
                    if (!((no4) ynb0Var.get()).e0()) {
                        list = qo90Var2.f;
                        if (!list.isEmpty()) {
                            list2 = list;
                            if (list2 instanceof Collection) {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        iOrdinal = cca0Var2.a().b.ordinal();
                                        if (iOrdinal != 2) {
                                            if (cca0Var2 instanceof bca0) {
                                                bca0Var3 = (bca0) cca0Var2;
                                            } else {
                                                bca0Var3 = null;
                                            }
                                            if (bca0Var3 != null) {
                                            }
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            z1sVar.a(new si70(false, str9));
                                            return d9nVar;
                                        }
                                    } else if (((no90) it.next()).a == 3) {
                                    }
                                }
                            } else {
                                it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        iOrdinal = cca0Var2.a().b.ordinal();
                                        if (iOrdinal != 2) {
                                            if (cca0Var2 instanceof bca0) {
                                                bca0Var3 = (bca0) cca0Var2;
                                            } else {
                                                bca0Var3 = null;
                                            }
                                            if (bca0Var3 != null) {
                                            }
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            z1sVar.a(new si70(false, str9));
                                            return d9nVar;
                                        }
                                    } else if (((no90) it.next()).a == 3) {
                                    }
                                }
                            }
                        }
                    }
                    up41 up41Var7 = (up41) this.d;
                    wea0 wea0VarA11 = cca0Var2.a();
                    gca0Var.a = null;
                    gca0Var.b = null;
                    gca0Var.c = null;
                    gca0Var.f = 6;
                    ser serVar7 = (ser) ((h0y) up41Var7.b).b;
                    String str19 = nik1.C5.a;
                    Parcelable kca0Var7 = new kca0(new hqr0(qo90Var2), wea0VarA11.b);
                    Bundle bundle7 = new Bundle();
                    bundle7.putParcelable("join.jam.sheet.args", kca0Var7);
                    serVar7.a(str7, str19, bundle7);
                    if (d9nVar != d9nVar2) {
                        return d9nVar2;
                    }
                    break;
                }
                return d9nVar;
            case 5:
                hm5.M(objJ);
                return d9nVar;
            case 6:
                hm5.M(objJ);
                return d9nVar;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(String str, onm onmVar) {
        yye0 yye0Var;
        if (onmVar instanceof yye0) {
            yye0Var = (yye0) onmVar;
            int i = yye0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yye0Var.c = i - Integer.MIN_VALUE;
            } else {
                yye0Var = new yye0(this, onmVar);
            }
        } else {
            yye0Var = new yye0(this, onmVar);
        }
        Object objJ = yye0Var.a;
        int i2 = yye0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleB = ((oq) this.f).b(new nlb1(str));
            yye0Var.c = 1;
            objJ = fc11.j(singleB, yye0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        q941 q941Var = (q941) objJ;
        if (q941Var instanceof m941) {
            return rih1.a;
        }
        if (q941Var.equals(k941.a) || q941Var.equals(o941.a)) {
            eg.m("Failed to save current user in AccountSwitcher");
            return null;
        }
        eg.o();
        return null;
    }

    public g931 D() {
        jbt jbtVar = (jbt) this.b;
        return new g931(jbtVar.b, jbtVar.d);
    }

    public xq81 F() {
        RetrofitMaker retrofitMaker = (RetrofitMaker) ((gni1) this.b).d.get();
        c8o.l(retrofitMaker);
        return new xq81((dmi1) retrofitMaker.createWebgateService(dmi1.class, "android-usersnearby-data-impl"), (byte) 27);
    }

    public lud0 a() {
        daq daqVar = (daq) this.c;
        gw70 gw70Var = (gw70) daqVar.d8.get();
        Object obj = this.a;
        d0r d0rVar = (d0r) ((jly0) obj).get();
        Object obj2 = this.e;
        return new lud0(new vi11(gw70Var, d0rVar, new uym0(f2u0.j((Flowable) ((jly0) obj2).get()), (Flowable) ((jly0) this.h).get(), ((Flowable) ((jly0) obj2).get()).j(mo9.O0), (w9u0) ((jly0) this.i).get(), (d0r) ((jly0) obj).get()), new et90(new xu4(false, (luk) daqVar.L1.get()), f2u0.f((Flowable) ((jly0) obj2).get()), (cbv) daqVar.vq.get()), ((v5q) this.d).i(), (byte) 14), (byte) 2);
    }

    public void d(Object obj) {
        fam1 fam1Var = new fam1(new uah0((e7m0) this.c, obj, (byte) 23));
        ArrayList arrayList = (ArrayList) this.b;
        p811 p811Var = (p811) this.a;
        synchronized (arrayList) {
            try {
                MobiusLoop mobiusLoop = (MobiusLoop) p811Var.a;
                if (mobiusLoop != null) {
                    mobiusLoop.a(fam1Var);
                } else {
                    arrayList.add(fam1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void dispose() {
        Object obj = this.d;
        l811 l811Var = (l811) this.i;
        synchronized (obj) {
            l811Var.a = true;
        }
        m7g1 m7g1Var = (m7g1) ((p811) this.e).a;
        if (m7g1Var != null) {
            m7g1Var.c = true;
            faa0 faa0Var = m7g1Var.b;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
        }
        iu30 iu30Var = (iu30) this.f;
        if (iu30Var != null) {
            iu30Var.invoke(((ipb1) this.g).getState());
        }
        MobiusLoop mobiusLoop = (MobiusLoop) ((p811) this.a).a;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        smo1.p((llm) this.h, (CancellationException) null);
    }

    public vu4 f() {
        return new vu4(false, false, false, (luk) ((daq) this.c).L1.get());
    }

    public byp g(n9r n9rVar, List list, zjn0 zjn0Var, l141 l141Var, y3j1 y3j1Var, ava avaVar) {
        ks6 ks6Var = (ks6) this.b;
        int i = avaVar.b;
        if ((i != 1 || avaVar.c < 4) && i <= 1) {
            y3j1Var = (y3j1) this.e;
        }
        return new byp(ks6Var, zjn0Var, n9rVar, l141Var, y3j1Var, avaVar, (xht) this.g, (mxa1) this.h, list);
    }

    public void i(Function0 function0) {
        this.h = null;
        ((rku) this.g).a();
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            ((x8c0) this.a).d((ct6) this.i);
            function0.invoke();
        } else {
            ((Handler) ((idd1) this.f).getValue()).post(new aih0(this, function0, false, (byte) 12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, qo90 qo90Var, onm onmVar) {
        dca0 dca0Var;
        tv80 tv80Var;
        if (onmVar instanceof dca0) {
            dca0Var = (dca0) onmVar;
            int i = dca0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dca0Var.c = i - Integer.MIN_VALUE;
            } else {
                dca0Var = new dca0(this, onmVar);
            }
        } else {
            dca0Var = new dca0(this, onmVar);
        }
        Object objJ = dca0Var.a;
        int i2 = dca0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            pp90 pp90Var = (pp90) ((c9c0) this.b).b.current().getValue();
            foo eooVar = pp90Var == null ? foo.a : new eoo(pp90Var.h.b.e);
            if (!(eooVar instanceof eoo)) {
                return Boolean.TRUE;
            }
            po90 po90VarG = pno1.g(qo90Var.d);
            if (str != null) {
                ou80.Companion.getClass();
                tv80Var = new tv80(new ou80(str), (y6r0) null);
            } else {
                tv80Var = null;
            }
            ezc ezcVarG = yoi1.g(((z1s) this.a).i.doOnSubscribe(new y43(this, tv80Var, (eoo) eooVar, po90VarG, (byte) 7)));
            lm9 lm9Var = new lm9(str, (lnm) null, (byte) 4);
            dca0Var.c = 1;
            objJ = b5p1.j(ezcVarG, lm9Var, dca0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return Boolean.valueOf(((lj70) objJ) instanceof jj70);
    }

    public void k(Object obj, tqw tqwVar) {
        w9m1 w9m1Var = new w9m1(obj, tqwVar);
        ArrayList arrayList = (ArrayList) this.b;
        p811 p811Var = (p811) this.a;
        synchronized (arrayList) {
            try {
                MobiusLoop mobiusLoop = (MobiusLoop) p811Var.a;
                if (mobiusLoop != null) {
                    mobiusLoop.a(w9m1Var);
                } else {
                    arrayList.add(w9m1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public u9c0 l() {
        return cto1.q(((qop) this.d).c());
    }

    public Intent n(hwe0 hwe0Var) {
        iwe0 iwe0Var = (iwe0) this.e;
        Context context = (Context) this.d;
        Intent intent = (Intent) this.h;
        intent.setData(null);
        intent.setAction(null);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.clear();
        }
        return iwe0.a(iwe0Var, context, intent, hwe0Var);
    }

    public re70 o() {
        return ((dxz0) this.b).d() ? ee70.a(j4b1.B4, (String) this.f, (String) this.g, p("made-for-you-hub-no-spotify-service-empty-view")) : ee70.a(j4b1.B4, (String) this.d, (String) this.e, p("made-for-you-hub-no-network-empty-view"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, onm onmVar) {
        xye0 xye0Var;
        if (onmVar instanceof xye0) {
            xye0Var = (xye0) onmVar;
            int i = xye0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xye0Var.c = i - Integer.MIN_VALUE;
            } else {
                xye0Var = new xye0(this, onmVar);
            }
        } else {
            xye0Var = new xye0(this, onmVar);
        }
        Object objJ = xye0Var.a;
        int i2 = xye0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleC = ((iwe0) this.e).a.c(str);
            xye0Var.c = 1;
            objJ = fc11.j(singleC, xye0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        fwe0 fwe0Var = (gwe0) objJ;
        if (fwe0Var instanceof fwe0) {
            return fwe0Var.a;
        }
        if (fwe0Var.equals(ewe0.a) || fwe0Var.equals(ewe0.b) || fwe0Var.equals(ewe0.c)) {
            bhn0.A(fwe0Var, "Failed to retrieve child credential: ");
            return null;
        }
        eg.o();
        return null;
    }

    public zjn0 r() {
        return (zjn0) this.c;
    }

    public l141 s() {
        return (l141) this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(qo90 qo90Var, onm onmVar) {
        eca0 eca0Var;
        if (onmVar instanceof eca0) {
            eca0Var = (eca0) onmVar;
            int i = eca0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eca0Var.d = i - Integer.MIN_VALUE;
            } else {
                eca0Var = new eca0(this, onmVar);
            }
        } else {
            eca0Var = new eca0(this, onmVar);
        }
        Object objJ = eca0Var.b;
        int i2 = eca0Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            mr20 mr20Var = (mr20) this.g;
            fca0 fca0Var = new fca0(2, (lnm) null, (byte) 0);
            eca0Var.a = qo90Var;
            eca0Var.d = 1;
            objJ = b5p1.j(mr20Var, fca0Var, eca0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qo90Var = eca0Var.a;
            hm5.M(objJ);
        }
        return Boolean.valueOf(u890.j(((th61) objJ).a, pno1.g(qo90Var.d).b));
    }

    public void w(Object obj) {
        b4p0 b4p0Var = (b4p0) obj;
        teq teqVar = (teq) this.d;
        b4p0Var.H1 = new ewx(new ogr((xfx) teqVar.q1.get()));
        daq daqVar = (daq) this.c;
        Flowable flowable = (Flowable) daqVar.D5.get();
        o241 o241Var = (o241) daqVar.u4.get();
        esj0 esj0Var = (esj0) ((jly0) this.a).get();
        yiq yiqVar = teqVar.b;
        rzo0 rzo0Var = new rzo0(flowable, o241Var, new phi0((Object) esj0Var, (Object) new s6z0((Object) yiqVar.b.W1(), (byte) 14), ((jly0) this.f).get(), ((jly0) this.g).get(), ((jly0) this.h).get(), (byte) 3));
        byp bypVar = (byp) this.e;
        c21 c21Var = new c21(new j3q(daqVar, teqVar, bypVar, (byte) 0));
        xfx xfxVar = (xfx) teqVar.q1.get();
        c8o.l(xfxVar);
        Flowable flowable2 = (Flowable) ((jly0) c21Var.d).get();
        Flowable flowable3 = (Flowable) ((jly0) c21Var.g).get();
        w9u0 w9u0Var = (w9u0) ((jly0) c21Var.h).get();
        o241 o241Var2 = (o241) daqVar.u4.get();
        c8o.l(o241Var2);
        bsp bspVar = (bsp) c21Var.i;
        k62 k62Var = new k62(c21Var.t());
        i691 i691Var = i691.a;
        ktf1 ktf1Var = new ktf1(flowable2, flowable3, w9u0Var, i691Var, o241Var2, bspVar, k62Var);
        fsp fspVar = (fsp) ((jly0) c21Var.t).get();
        yjj1 yjj1Var = (yjj1) daqVar.zq.get();
        c8o.l(yjj1Var);
        c3s c3sVar = (c3s) daqVar.e6.get();
        c8o.l(c3sVar);
        gw70 gw70Var = (gw70) daqVar.d8.get();
        c8o.l(gw70Var);
        b4p0 b4p0Var2 = (b4p0) bypVar.b;
        w2k1 w2k1Var = (w2k1) daqVar.L8.get();
        c8o.l(w2k1Var);
        Scheduler scheduler = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler);
        gw70 gw70Var2 = (gw70) daqVar.d8.get();
        c8o.l(gw70Var2);
        d0r d0rVar = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar);
        qlb qlbVar = new qlb(gw70Var2, d0rVar);
        luk lukVar = (luk) daqVar.L1.get();
        c8o.l(lukVar);
        p1f0 p1f0Var = new p1f0(yjj1Var, c3sVar, gw70Var, (iac0) b4p0Var2, w2k1Var, scheduler, qlbVar, new sn4(lukVar));
        luk lukVar2 = (luk) daqVar.L1.get();
        c8o.l(lukVar2);
        d4p0 d4p0Var = new d4p0(fspVar, p1f0Var, new dv4(false, false, lukVar2));
        Context context = (Context) teqVar.f.a;
        c8o.l(context);
        e7p0 e7p0Var = (e7p0) teqVar.W4.get();
        c8o.l(e7p0Var);
        z611 z611VarA = mid.A(context, e7p0Var);
        ymm0 ymm0Var = new ymm0(f2u0.f((Flowable) ((jly0) c21Var.d).get()), (byte) 5);
        w9u0 w9u0Var2 = (w9u0) ((jly0) c21Var.h).get();
        Flowable flowable4 = (Flowable) ((jly0) c21Var.d).get();
        Flowable flowable5 = (Flowable) ((jly0) c21Var.g).get();
        i8h1 i8h1Var = (i8h1) ((bsp) c21Var.i).get();
        yok0 yok0VarT = c21Var.t();
        Scheduler scheduler2 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler2);
        gh10 gh10Var = new gh10(w9u0Var2, flowable4, flowable5, i8h1Var, yok0VarT, scheduler2);
        FlowableMap flowableMapD = f2u0.D((Flowable) ((jly0) c21Var.d).get());
        Flowable flowable6 = (Flowable) ((jly0) c21Var.g).get();
        Flowable flowable7 = (Flowable) ((jly0) c21Var.d).get();
        mo9 mo9Var = mo9.O0;
        s691 s691Var = new s691(flowableMapD, flowable6, flowable7.j(mo9Var), (w9u0) ((jly0) c21Var.h).get());
        w9u0 w9u0Var3 = (w9u0) ((jly0) c21Var.h).get();
        gn10 gn10VarR = j310.r(b4p0Var2);
        FlowableMap flowableMapF = f2u0.f((Flowable) ((jly0) c21Var.d).get());
        Flowable flowableJ = ((Flowable) ((jly0) c21Var.d).get()).j(mo9Var);
        Flowable flowable8 = (Flowable) ((jly0) c21Var.d).get();
        mo9 mo9Var2 = mo9.N0;
        Flowable flowableJ2 = flowable8.j(mo9Var2);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) ((jly0) c21Var.d).get());
        pe peVar = (pe) daqVar.p9.get();
        c8o.l(peVar);
        luk lukVar3 = (luk) daqVar.L1.get();
        c8o.l(lukVar3);
        dfm dfmVar = new dfm(w9u0Var3, gn10VarR, flowableMapF, flowableJ, flowableJ2, flowableDistinctUntilChangedD, peVar, new qmr(new in4(lukVar3)));
        Flowable flowable9 = (Flowable) ((jly0) c21Var.d).get();
        Flowable flowable10 = (Flowable) ((jly0) c21Var.g).get();
        w9u0 w9u0Var4 = (w9u0) ((jly0) c21Var.h).get();
        nrq0 nrq0Var = nrq0.a;
        k691 k691Var = new k691(flowable9, flowable10, w9u0Var4, nrq0Var, i691Var);
        ziq ziqVar = teqVar.a;
        aor aorVar = (aor) ziqVar.Mb.get();
        c8o.l(aorVar);
        FlowableMap flowableMapD2 = f2u0.D((Flowable) ((jly0) c21Var.d).get());
        i8h1 i8h1Var2 = (i8h1) ((bsp) c21Var.i).get();
        l6h1 l6h1Var = (l6h1) daqVar.fg.get();
        c8o.l(l6h1Var);
        gsj0 gsj0Var = new gsj0(xfxVar, ktf1Var, d4p0Var, z611VarA, ymm0Var, gh10Var, s691Var, dfmVar, k691Var, aorVar, flowableMapD2, i8h1Var2, l6h1Var, c21Var.t());
        j3q j3qVar = new j3q(daqVar, teqVar, bypVar, (byte) 1);
        em0 em0Var = new em0(j3qVar);
        xfx xfxVar2 = (xfx) teqVar.q1.get();
        c8o.l(xfxVar2);
        Flowable flowable11 = (Flowable) ((jly0) em0Var.d).get();
        Flowable flowable12 = (Flowable) ((jly0) em0Var.g).get();
        w9u0 w9u0Var5 = (w9u0) ((jly0) em0Var.h).get();
        o241 o241Var3 = (o241) daqVar.u4.get();
        c8o.l(o241Var3);
        bsp bspVar2 = (bsp) em0Var.i;
        ktf1 ktf1Var2 = new ktf1(flowable11, flowable12, w9u0Var5, i691Var, o241Var3, bspVar2, new tas(bspVar2, em0Var.m0()));
        fsp fspVar2 = (fsp) ((jly0) em0Var.t).get();
        yjj1 yjj1Var2 = (yjj1) daqVar.zq.get();
        c8o.l(yjj1Var2);
        c3s c3sVar2 = (c3s) daqVar.e6.get();
        c8o.l(c3sVar2);
        gw70 gw70Var3 = (gw70) daqVar.d8.get();
        c8o.l(gw70Var3);
        w2k1 w2k1Var2 = (w2k1) daqVar.L8.get();
        c8o.l(w2k1Var2);
        Scheduler scheduler3 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler3);
        gw70 gw70Var4 = (gw70) daqVar.d8.get();
        c8o.l(gw70Var4);
        d0r d0rVar2 = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar2);
        qlb qlbVar2 = new qlb(gw70Var4, d0rVar2);
        luk lukVarA = j3qVar.a();
        c8o.l(lukVarA);
        p1f0 p1f0Var2 = new p1f0(yjj1Var2, c3sVar2, gw70Var3, (iac0) b4p0Var2, w2k1Var2, scheduler3, qlbVar2, new sn4(lukVarA));
        luk lukVarA2 = j3qVar.a();
        c8o.l(lukVarA2);
        d4p0 d4p0Var2 = new d4p0(fspVar2, p1f0Var2, new dv4(false, false, lukVarA2));
        Context context2 = (Context) teqVar.f.a;
        c8o.l(context2);
        e7p0 e7p0Var2 = (e7p0) teqVar.W4.get();
        c8o.l(e7p0Var2);
        z611 z611VarA2 = mid.A(context2, e7p0Var2);
        FlowableMap flowableMapF2 = f2u0.f((Flowable) ((jly0) em0Var.d).get());
        d0r d0rVar3 = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar3);
        lzn0 lzn0Var = (lzn0) teqVar.i.get();
        c8o.l(lzn0Var);
        xrn0 xrn0VarO = aan0.o(lzn0Var);
        Resources resources = (Resources) teqVar.N0.get();
        c8o.l(resources);
        yna0 yna0Var = new yna0(resources);
        tas tasVar = new tas((bsp) em0Var.i, em0Var.m0());
        Resources resources2 = (Resources) teqVar.N0.get();
        c8o.l(resources2);
        luk lukVarA3 = j3qVar.a();
        c8o.l(lukVarA3);
        ln4 ln4Var = new ln4(false, lukVarA3);
        vbs vbsVar = (vbs) daqVar.wf.get();
        c8o.l(vbsVar);
        s880 s880Var = new s880(flowableMapF2, d0rVar3, xrn0VarO, yna0Var, tasVar, resources2, ln4Var, vbsVar);
        w9u0 w9u0Var6 = (w9u0) ((jly0) em0Var.h).get();
        Flowable flowable13 = (Flowable) ((jly0) em0Var.d).get();
        Flowable flowable14 = (Flowable) ((jly0) em0Var.g).get();
        i8h1 i8h1Var3 = (i8h1) ((bsp) em0Var.i).get();
        pdl0 pdl0VarM0 = em0Var.m0();
        Scheduler scheduler4 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler4);
        gh10 gh10Var2 = new gh10(w9u0Var6, flowable13, flowable14, i8h1Var3, pdl0VarM0, scheduler4);
        Flowable flowable15 = (Flowable) ((jly0) em0Var.d).get();
        fl3 fl3Var = (fl3) yiqVar.xb.get();
        c8o.l(fl3Var);
        yl1 yl1Var = new yl1(flowable15, fl3Var, d8.c(b4p0Var2));
        s691 s691Var2 = new s691(em0Var.F0(), (Flowable) ((jly0) em0Var.g).get(), em0Var.S(), (w9u0) ((jly0) em0Var.h).get());
        w9u0 w9u0Var7 = (w9u0) ((jly0) em0Var.h).get();
        gn10 gn10VarR2 = j310.r(b4p0Var2);
        FlowableMap flowableMapF3 = f2u0.f((Flowable) ((jly0) em0Var.d).get());
        Flowable flowableS = em0Var.S();
        Flowable flowableJ3 = ((Flowable) ((jly0) em0Var.d).get()).j(mo9Var2);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD2 = f2u0.d((Flowable) ((jly0) em0Var.d).get());
        pe peVar2 = (pe) daqVar.p9.get();
        c8o.l(peVar2);
        luk lukVarA4 = j3qVar.a();
        c8o.l(lukVarA4);
        dfm dfmVar2 = new dfm(w9u0Var7, gn10VarR2, flowableMapF3, flowableS, flowableJ3, flowableDistinctUntilChangedD2, peVar2, new qmr(new in4(lukVarA4)));
        k691 k691Var2 = new k691((Flowable) ((jly0) em0Var.d).get(), (Flowable) ((jly0) em0Var.g).get(), (w9u0) ((jly0) em0Var.h).get(), nrq0Var, i691Var);
        FlowableMap flowableMapF4 = f2u0.f((Flowable) ((jly0) em0Var.d).get());
        uu00 uu00Var = (uu00) daqVar.a5.get();
        c8o.l(uu00Var);
        d0r d0rVar4 = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar4);
        vbs vbsVar2 = (vbs) daqVar.wf.get();
        c8o.l(vbsVar2);
        q8n q8nVar = (q8n) daqVar.r2.get();
        c8o.l(q8nVar);
        luk lukVarA5 = j3qVar.a();
        c8o.l(lukVarA5);
        dxy dxyVar = new dxy((Object) flowableMapF4, (Object) uu00Var, (Object) d0rVar4, (Object) vbsVar2, (Object) q8nVar, (Object) new gn4(false, lukVarA5), (byte) 17);
        am51 am51Var = new am51(em0Var.F0(), f2u0.j((Flowable) ((jly0) em0Var.d).get()), em0Var.S(), (Flowable) ((jly0) em0Var.g).get(), (w9u0) ((jly0) em0Var.h).get(), em0Var.c1(), (im51) ((jly0) em0Var.X).get(), em0Var.o());
        qm51 qm51Var = new qm51(em0Var.F0(), f2u0.j((Flowable) ((jly0) em0Var.d).get()), em0Var.S(), (Flowable) ((jly0) em0Var.g).get(), (w9u0) ((jly0) em0Var.h).get(), em0Var.c1(), (im51) ((jly0) em0Var.X).get(), em0Var.o());
        h791 h791Var = new h791((Flowable) ((jly0) em0Var.d).get(), (Flowable) ((jly0) em0Var.g).get(), (w9u0) ((jly0) em0Var.h).get());
        uu00 uu00Var2 = (uu00) daqVar.a5.get();
        c8o.l(uu00Var2);
        uvy uvyVar = (uvy) ziqVar.o5.get();
        c8o.l(uvyVar);
        rt01 rt01Var = new rt01(qm51Var, h791Var, new nn61(uu00Var2, uvyVar, false, (byte) 25), (Flowable) ((jly0) em0Var.d).get(), em0Var.o());
        aor aorVar2 = (aor) ziqVar.Mb.get();
        c8o.l(aorVar2);
        i8h1 i8h1Var4 = (i8h1) ((bsp) em0Var.i).get();
        l6h1 l6h1Var2 = (l6h1) daqVar.fg.get();
        c8o.l(l6h1Var2);
        pdl0 pdl0VarM1 = em0Var.m0();
        luk lukVarA6 = j3qVar.a();
        c8o.l(lukVarA6);
        jsj0 jsj0Var = new jsj0(xfxVar2, ktf1Var2, d4p0Var2, z611VarA2, s880Var, gh10Var2, yl1Var, s691Var2, dfmVar2, k691Var2, dxyVar, am51Var, rt01Var, aorVar2, i8h1Var4, l6h1Var2, pdl0VarM1, new qv4(false, lukVarA6), f2u0.f((Flowable) ((jly0) em0Var.d).get()));
        qqp qqpVar = new qqp(new a1q((Object) daqVar, (Object) bypVar, (byte) 1));
        w9u0 w9u0Var8 = (w9u0) ((jly0) qqpVar.c).get();
        gn10 gn10VarR3 = j310.r(b4p0Var2);
        Object obj2 = qqpVar.e;
        FlowableMap flowableMapF5 = f2u0.f((Flowable) ((jly0) obj2).get());
        Flowable flowableJ4 = ((Flowable) ((jly0) obj2).get()).j(mo9Var);
        Flowable flowableJ5 = ((Flowable) ((jly0) obj2).get()).j(mo9Var2);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD3 = f2u0.d((Flowable) ((jly0) obj2).get());
        pe peVar3 = (pe) daqVar.p9.get();
        c8o.l(peVar3);
        luk lukVar4 = (luk) daqVar.L1.get();
        c8o.l(lukVar4);
        g7x g7xVar = new g7x(new dfm(w9u0Var8, gn10VarR3, flowableMapF5, flowableJ4, flowableJ5, flowableDistinctUntilChangedD3, peVar3, new qmr(new in4(lukVar4))));
        em0 em0Var2 = new em0(new j3q(daqVar, teqVar, bypVar, (byte) 3), (byte) 0);
        xfx xfxVar3 = (xfx) teqVar.q1.get();
        c8o.l(xfxVar3);
        Flowable flowable16 = (Flowable) ((jly0) em0Var2.d).get();
        Flowable flowable17 = (Flowable) ((jly0) em0Var2.g).get();
        w9u0 w9u0Var9 = (w9u0) ((jly0) em0Var2.h).get();
        o241 o241Var4 = (o241) daqVar.u4.get();
        c8o.l(o241Var4);
        bsp bspVar3 = (bsp) em0Var2.i;
        n6r0 n6r0VarP = kmq0.p(b4p0Var2);
        lik1 lik1VarC = d8.c(b4p0Var2);
        r6h1 r6h1Var = r6h1.c;
        ktf1 ktf1Var3 = new ktf1(flowable16, flowable17, w9u0Var9, i691Var, o241Var4, bspVar3, new xe50(bspVar3, new yok0(n6r0VarP.path(), lik1VarC.a, (byte) 18)));
        bf50 bf50Var = new bf50((fsp) ((jly0) em0Var2.t).get(), (gsp) ((jly0) em0Var2.X).get());
        FlowableMap flowableMapY = ziqVar.Y();
        lzn0 lzn0Var2 = (lzn0) teqVar.i.get();
        c8o.l(lzn0Var2);
        xrn0 xrn0VarO2 = aan0.o(lzn0Var2);
        xe50 xe50Var = new xe50((bsp) em0Var2.i, new yok0(kmq0.p(b4p0Var2).path(), d8.c(b4p0Var2).a, (byte) 18));
        Scheduler scheduler5 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler5);
        wp20 wp20Var = new wp20(flowableMapY, xrn0VarO2, xe50Var, scheduler5);
        Context context3 = (Context) teqVar.f.a;
        c8o.l(context3);
        e7p0 e7p0Var3 = (e7p0) teqVar.W4.get();
        c8o.l(e7p0Var3);
        z611 z611VarA3 = mid.A(context3, e7p0Var3);
        Flowable flowable18 = (Flowable) ((jly0) em0Var2.d).get();
        fl3 fl3Var2 = (fl3) yiqVar.xb.get();
        c8o.l(fl3Var2);
        yl1 yl1Var2 = new yl1(flowable18, fl3Var2, d8.c(b4p0Var2));
        upd0 upd0Var = new upd0(((Flowable) ((jly0) em0Var2.d).get()).j(mo9Var2), (byte) 1);
        Flowable flowableJ6 = ((Flowable) ((jly0) em0Var2.d).get()).j(mo9Var2);
        Flowable flowable19 = (Flowable) daqVar.D5.get();
        c8o.l(flowable19);
        Scheduler scheduler6 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler6);
        Scheduler scheduler7 = (Scheduler) daqVar.r3.get();
        c8o.l(scheduler7);
        hbq hbqVar = daqVar.a;
        skd0 skd0Var = (skd0) hbqVar.k2.get();
        c8o.l(skd0Var);
        ppd0 ppd0Var = new ppd0(flowableJ6, flowable19, scheduler6, scheduler7, skd0Var, (byte) 1);
        w9u0 w9u0Var10 = (w9u0) ((jly0) em0Var2.h).get();
        gn10 gn10VarR4 = j310.r(b4p0Var2);
        FlowableMap flowableMapF6 = f2u0.f((Flowable) ((jly0) em0Var2.d).get());
        Flowable flowableJ7 = ((Flowable) ((jly0) em0Var2.d).get()).j(mo9Var);
        Flowable flowableJ8 = ((Flowable) ((jly0) em0Var2.d).get()).j(mo9Var2);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD4 = f2u0.d((Flowable) ((jly0) em0Var2.d).get());
        pe peVar4 = (pe) daqVar.p9.get();
        c8o.l(peVar4);
        luk lukVar5 = (luk) daqVar.L1.get();
        c8o.l(lukVar5);
        dfm dfmVar3 = new dfm(w9u0Var10, gn10VarR4, flowableMapF6, flowableJ7, flowableJ8, flowableDistinctUntilChangedD4, peVar4, new qmr(new in4(lukVar5)));
        s691 s691Var3 = new s691(f2u0.D((Flowable) ((jly0) em0Var2.d).get()), (Flowable) ((jly0) em0Var2.g).get(), ((Flowable) ((jly0) em0Var2.d).get()).j(mo9Var), (w9u0) ((jly0) em0Var2.h).get());
        k691 k691Var3 = new k691((Flowable) ((jly0) em0Var2.d).get(), (Flowable) ((jly0) em0Var2.g).get(), (w9u0) ((jly0) em0Var2.h).get(), nrq0Var, i691Var);
        aor aorVar3 = (aor) ziqVar.Mb.get();
        c8o.l(aorVar3);
        ns10 ns10VarX = yiqVar.X();
        i8h1 i8h1Var5 = (i8h1) ((bsp) em0Var2.i).get();
        l6h1 l6h1Var3 = (l6h1) daqVar.fg.get();
        c8o.l(l6h1Var3);
        nsj0 nsj0Var = new nsj0(xfxVar3, ktf1Var3, bf50Var, wp20Var, z611VarA3, yl1Var2, upd0Var, ppd0Var, dfmVar3, s691Var3, k691Var3, aorVar3, ns10VarX, i8h1Var5, l6h1Var3, new yok0(kmq0.p(b4p0Var2).path(), d8.c(b4p0Var2).a, (byte) 18), f2u0.D((Flowable) ((jly0) em0Var2.d).get()));
        j3q j3qVar2 = new j3q(daqVar, teqVar, bypVar, (byte) 4);
        em0 em0Var3 = new em0(j3qVar2, (char) 0);
        xfx xfxVar4 = (xfx) teqVar.q1.get();
        c8o.l(xfxVar4);
        Flowable flowable20 = (Flowable) ((jly0) em0Var3.d).get();
        Flowable flowable21 = (Flowable) ((jly0) em0Var3.g).get();
        w9u0 w9u0Var11 = (w9u0) ((jly0) em0Var3.h).get();
        o241 o241Var5 = (o241) daqVar.u4.get();
        c8o.l(o241Var5);
        bsp bspVar4 = (bsp) em0Var3.i;
        ktf1 ktf1Var4 = new ktf1(flowable20, flowable21, w9u0Var11, i691Var, o241Var5, bspVar4, new n5v0((i8h1) bspVar4.get(), em0Var3.n0()));
        fsp fspVar3 = (fsp) ((jly0) em0Var3.t).get();
        yjj1 yjj1Var3 = (yjj1) daqVar.zq.get();
        c8o.l(yjj1Var3);
        c3s c3sVar3 = (c3s) daqVar.e6.get();
        c8o.l(c3sVar3);
        gw70 gw70Var5 = (gw70) daqVar.d8.get();
        c8o.l(gw70Var5);
        w2k1 w2k1Var3 = (w2k1) daqVar.L8.get();
        c8o.l(w2k1Var3);
        Scheduler scheduler8 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler8);
        gw70 gw70Var6 = (gw70) daqVar.d8.get();
        c8o.l(gw70Var6);
        d0r d0rVar5 = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar5);
        qlb qlbVar3 = new qlb(gw70Var6, d0rVar5);
        luk lukVarA7 = j3qVar2.a();
        c8o.l(lukVarA7);
        p1f0 p1f0Var3 = new p1f0(yjj1Var3, c3sVar3, gw70Var5, (iac0) b4p0Var2, w2k1Var3, scheduler8, qlbVar3, new sn4(lukVarA7));
        luk lukVarA8 = j3qVar2.a();
        c8o.l(lukVarA8);
        d4p0 d4p0Var3 = new d4p0(fspVar3, p1f0Var3, new dv4(false, false, lukVarA8));
        Context context4 = (Context) teqVar.f.a;
        c8o.l(context4);
        e7p0 e7p0Var4 = (e7p0) teqVar.W4.get();
        c8o.l(e7p0Var4);
        z611 z611VarA4 = mid.A(context4, e7p0Var4);
        FlowableMap flowableMapF7 = f2u0.f((Flowable) ((jly0) em0Var3.d).get());
        d0r d0rVar6 = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar6);
        lzn0 lzn0Var3 = (lzn0) teqVar.i.get();
        c8o.l(lzn0Var3);
        xrn0 xrn0VarO3 = aan0.o(lzn0Var3);
        Resources resources3 = (Resources) teqVar.N0.get();
        c8o.l(resources3);
        yna0 yna0Var2 = new yna0(resources3);
        n5v0 n5v0Var = new n5v0((i8h1) ((bsp) em0Var3.i).get(), em0Var3.n0());
        Resources resources4 = (Resources) teqVar.N0.get();
        c8o.l(resources4);
        luk lukVarA9 = j3qVar2.a();
        c8o.l(lukVarA9);
        ln4 ln4Var2 = new ln4(false, lukVarA9);
        vbs vbsVar3 = (vbs) daqVar.wf.get();
        c8o.l(vbsVar3);
        s880 s880Var2 = new s880(flowableMapF7, d0rVar6, xrn0VarO3, yna0Var2, n5v0Var, resources4, ln4Var2, vbsVar3);
        w9u0 w9u0Var12 = (w9u0) ((jly0) em0Var3.h).get();
        Flowable flowable22 = (Flowable) ((jly0) em0Var3.d).get();
        Flowable flowable23 = (Flowable) ((jly0) em0Var3.g).get();
        i8h1 i8h1Var6 = (i8h1) ((bsp) em0Var3.i).get();
        pdl0 pdl0VarN0 = em0Var3.n0();
        Scheduler scheduler9 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler9);
        gh10 gh10Var3 = new gh10(w9u0Var12, flowable22, flowable23, i8h1Var6, pdl0VarN0, scheduler9);
        FlowableMap flowableMapF8 = f2u0.f((Flowable) ((jly0) em0Var3.d).get());
        uu00 uu00Var3 = (uu00) daqVar.a5.get();
        c8o.l(uu00Var3);
        d0r d0rVar7 = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar7);
        vbs vbsVar4 = (vbs) daqVar.wf.get();
        c8o.l(vbsVar4);
        q8n q8nVar2 = (q8n) daqVar.r2.get();
        c8o.l(q8nVar2);
        luk lukVarA10 = j3qVar2.a();
        c8o.l(lukVarA10);
        dxy dxyVar2 = new dxy((Object) flowableMapF8, (Object) uu00Var3, (Object) d0rVar7, (Object) vbsVar4, (Object) q8nVar2, (Object) new gn4(false, lukVarA10), (byte) 17);
        am51 am51Var2 = new am51(f2u0.D((Flowable) ((jly0) em0Var3.d).get()), f2u0.j((Flowable) ((jly0) em0Var3.d).get()), ((Flowable) ((jly0) em0Var3.d).get()).j(mo9Var), (Flowable) ((jly0) em0Var3.g).get(), (w9u0) ((jly0) em0Var3.h).get(), em0Var3.c1(), (im51) ((jly0) em0Var3.X).get(), em0Var3.o());
        w9u0 w9u0Var13 = (w9u0) ((jly0) em0Var3.h).get();
        gn10 gn10VarR5 = j310.r(b4p0Var2);
        FlowableMap flowableMapF9 = f2u0.f((Flowable) ((jly0) em0Var3.d).get());
        Flowable flowableJ9 = ((Flowable) ((jly0) em0Var3.d).get()).j(mo9Var);
        Flowable flowableJ10 = ((Flowable) ((jly0) em0Var3.d).get()).j(mo9Var2);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD5 = f2u0.d((Flowable) ((jly0) em0Var3.d).get());
        pe peVar5 = (pe) daqVar.p9.get();
        c8o.l(peVar5);
        luk lukVarA11 = j3qVar2.a();
        c8o.l(lukVarA11);
        dfm dfmVar4 = new dfm(w9u0Var13, gn10VarR5, flowableMapF9, flowableJ9, flowableJ10, flowableDistinctUntilChangedD5, peVar5, new qmr(new in4(lukVarA11)));
        qm51 qm51Var2 = new qm51(f2u0.D((Flowable) ((jly0) em0Var3.d).get()), f2u0.j((Flowable) ((jly0) em0Var3.d).get()), ((Flowable) ((jly0) em0Var3.d).get()).j(mo9Var), (Flowable) ((jly0) em0Var3.g).get(), (w9u0) ((jly0) em0Var3.h).get(), em0Var3.c1(), (im51) ((jly0) em0Var3.X).get(), em0Var3.o());
        h791 h791Var2 = new h791((Flowable) ((jly0) em0Var3.d).get(), (Flowable) ((jly0) em0Var3.g).get(), (w9u0) ((jly0) em0Var3.h).get());
        uu00 uu00Var4 = (uu00) daqVar.a5.get();
        c8o.l(uu00Var4);
        uvy uvyVar2 = (uvy) ziqVar.o5.get();
        c8o.l(uvyVar2);
        rt01 rt01Var2 = new rt01(qm51Var2, h791Var2, new nn61(uu00Var4, uvyVar2, false, (byte) 25), (Flowable) ((jly0) em0Var3.d).get(), em0Var3.o());
        k691 k691Var4 = new k691((Flowable) ((jly0) em0Var3.d).get(), (Flowable) ((jly0) em0Var3.g).get(), (w9u0) ((jly0) em0Var3.h).get(), nrq0Var, i691Var);
        aor aorVar4 = (aor) ziqVar.Mb.get();
        c8o.l(aorVar4);
        i8h1 i8h1Var7 = (i8h1) ((bsp) em0Var3.i).get();
        l6h1 l6h1Var4 = (l6h1) daqVar.fg.get();
        c8o.l(l6h1Var4);
        lsj0 lsj0Var = new lsj0(xfxVar4, ktf1Var4, d4p0Var3, z611VarA4, s880Var2, gh10Var3, dxyVar2, am51Var2, dfmVar4, rt01Var2, k691Var4, aorVar4, i8h1Var7, l6h1Var4, em0Var3.n0(), f2u0.f((Flowable) ((jly0) em0Var3.d).get()));
        j3q j3qVar3 = new j3q(daqVar, teqVar, bypVar, (byte) 2);
        c21 c21Var2 = new c21(j3qVar3, (byte) 0);
        xfx xfxVar5 = (xfx) teqVar.q1.get();
        c8o.l(xfxVar5);
        Flowable flowable24 = (Flowable) ((jly0) c21Var2.d).get();
        Flowable flowable25 = (Flowable) ((jly0) c21Var2.g).get();
        w9u0 w9u0Var14 = (w9u0) ((jly0) c21Var2.h).get();
        o241 o241Var6 = (o241) daqVar.u4.get();
        c8o.l(o241Var6);
        bsp bspVar5 = (bsp) c21Var2.i;
        lik1 lik1Var = nik1.n1;
        ktf1 ktf1Var5 = new ktf1(flowable24, flowable25, w9u0Var14, i691Var, o241Var6, bspVar5, new r0y(bspVar5, new pdl0(lik1Var.a)));
        fsp fspVar4 = (fsp) ((jly0) c21Var2.t).get();
        yjj1 yjj1Var4 = (yjj1) daqVar.zq.get();
        c8o.l(yjj1Var4);
        c3s c3sVar4 = (c3s) daqVar.e6.get();
        c8o.l(c3sVar4);
        gw70 gw70Var7 = (gw70) daqVar.d8.get();
        c8o.l(gw70Var7);
        w2k1 w2k1Var4 = (w2k1) daqVar.L8.get();
        c8o.l(w2k1Var4);
        Scheduler scheduler10 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler10);
        gw70 gw70Var8 = (gw70) daqVar.d8.get();
        c8o.l(gw70Var8);
        d0r d0rVar8 = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar8);
        qlb qlbVar4 = new qlb(gw70Var8, d0rVar8);
        luk lukVarA12 = j3qVar3.a();
        c8o.l(lukVarA12);
        p1f0 p1f0Var4 = new p1f0(yjj1Var4, c3sVar4, gw70Var7, (iac0) b4p0Var2, w2k1Var4, scheduler10, qlbVar4, new sn4(lukVarA12));
        luk lukVarA13 = j3qVar3.a();
        c8o.l(lukVarA13);
        d4p0 d4p0Var4 = new d4p0(fspVar4, p1f0Var4, new dv4(false, false, lukVarA13));
        Context context5 = (Context) teqVar.f.a;
        c8o.l(context5);
        e7p0 e7p0Var5 = (e7p0) teqVar.W4.get();
        c8o.l(e7p0Var5);
        z611 z611VarA5 = mid.A(context5, e7p0Var5);
        FlowableMap flowableMapF10 = f2u0.f((Flowable) ((jly0) c21Var2.d).get());
        d0r d0rVar9 = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar9);
        lzn0 lzn0Var4 = (lzn0) teqVar.i.get();
        c8o.l(lzn0Var4);
        xrn0 xrn0VarO4 = aan0.o(lzn0Var4);
        Resources resources5 = (Resources) teqVar.N0.get();
        c8o.l(resources5);
        yna0 yna0Var3 = new yna0(resources5);
        r0y r0yVar = new r0y((bsp) c21Var2.i, new pdl0(lik1Var.a));
        Resources resources6 = (Resources) teqVar.N0.get();
        c8o.l(resources6);
        luk lukVarA14 = j3qVar3.a();
        c8o.l(lukVarA14);
        ln4 ln4Var3 = new ln4(false, lukVarA14);
        vbs vbsVar5 = (vbs) daqVar.wf.get();
        c8o.l(vbsVar5);
        s880 s880Var3 = new s880(flowableMapF10, d0rVar9, xrn0VarO4, yna0Var3, r0yVar, resources6, ln4Var3, vbsVar5);
        w9u0 w9u0Var15 = (w9u0) ((jly0) c21Var2.h).get();
        Flowable flowable26 = (Flowable) ((jly0) c21Var2.d).get();
        Flowable flowable27 = (Flowable) ((jly0) c21Var2.g).get();
        i8h1 i8h1Var8 = (i8h1) ((bsp) c21Var2.i).get();
        pdl0 pdl0Var = new pdl0(lik1Var.a);
        Scheduler scheduler11 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler11);
        gh10 gh10Var4 = new gh10(w9u0Var15, flowable26, flowable27, i8h1Var8, pdl0Var, scheduler11);
        Flowable flowable28 = (Flowable) ((jly0) c21Var2.d).get();
        fl3 fl3Var3 = (fl3) yiqVar.xb.get();
        c8o.l(fl3Var3);
        yl1 yl1Var3 = new yl1(flowable28, fl3Var3, d8.c(b4p0Var2));
        s691 s691Var4 = new s691(f2u0.D((Flowable) ((jly0) c21Var2.d).get()), (Flowable) ((jly0) c21Var2.g).get(), ((Flowable) ((jly0) c21Var2.d).get()).j(mo9Var), (w9u0) ((jly0) c21Var2.h).get());
        w9u0 w9u0Var16 = (w9u0) ((jly0) c21Var2.h).get();
        gn10 gn10VarR6 = j310.r(b4p0Var2);
        FlowableMap flowableMapF11 = f2u0.f((Flowable) ((jly0) c21Var2.d).get());
        Flowable flowableJ11 = ((Flowable) ((jly0) c21Var2.d).get()).j(mo9Var);
        Flowable flowableJ12 = ((Flowable) ((jly0) c21Var2.d).get()).j(mo9Var2);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD6 = f2u0.d((Flowable) ((jly0) c21Var2.d).get());
        pe peVar6 = (pe) daqVar.p9.get();
        c8o.l(peVar6);
        luk lukVarA15 = j3qVar3.a();
        c8o.l(lukVarA15);
        dfm dfmVar5 = new dfm(w9u0Var16, gn10VarR6, flowableMapF11, flowableJ11, flowableJ12, flowableDistinctUntilChangedD6, peVar6, new qmr(new in4(lukVarA15)));
        k691 k691Var5 = new k691((Flowable) ((jly0) c21Var2.d).get(), (Flowable) ((jly0) c21Var2.g).get(), (w9u0) ((jly0) c21Var2.h).get(), nrq0Var, i691Var);
        joe joeVar = (joe) teqVar.af.get();
        c8o.l(joeVar);
        r0y r0yVar2 = new r0y((bsp) c21Var2.i, new pdl0(lik1Var.a));
        Flowable flowable29 = (Flowable) daqVar.D5.get();
        c8o.l(flowable29);
        FlowableMap flowableMapF12 = f2u0.f((Flowable) ((jly0) c21Var2.d).get());
        mr20 mr20Var = (mr20) daqVar.ul.get();
        c8o.l(mr20Var);
        mr20 mr20Var2 = mr20Var;
        a1r0 a1r0Var = (a1r0) teqVar.V0.get();
        c8o.l(a1r0Var);
        vz80 vz80Var = new vz80(a1r0Var);
        q8n q8nVar3 = (q8n) daqVar.V2.get();
        c8o.l(q8nVar3);
        luk lukVarA16 = j3qVar3.a();
        c8o.l(lukVarA16);
        mr4 mr4Var = new mr4(lukVarA16);
        a1r0 a1r0Var2 = (a1r0) teqVar.V0.get();
        c8o.l(a1r0Var2);
        c21 c21Var3 = new c21(joeVar, r0yVar2, flowable29, flowableMapF12, mr20Var2, vz80Var, q8nVar3, mr4Var, a1r0Var2, (byte) 6);
        aor aorVar5 = (aor) ziqVar.Mb.get();
        c8o.l(aorVar5);
        i8h1 i8h1Var9 = (i8h1) ((bsp) c21Var2.i).get();
        l6h1 l6h1Var5 = (l6h1) daqVar.fg.get();
        c8o.l(l6h1Var5);
        lsj0 lsj0Var2 = new lsj0(xfxVar5, ktf1Var5, d4p0Var4, z611VarA5, s880Var3, gh10Var4, yl1Var3, s691Var4, dfmVar5, k691Var5, c21Var3, aorVar5, i8h1Var9, l6h1Var5, new pdl0(lik1Var.a), f2u0.f((Flowable) ((jly0) c21Var2.d).get()));
        j3q j3qVar4 = new j3q(daqVar, teqVar, bypVar, (byte) 5);
        s24 s24Var = new s24(j3qVar4);
        xfx xfxVar6 = (xfx) teqVar.q1.get();
        c8o.l(xfxVar6);
        Object obj3 = s24Var.d;
        Flowable flowable30 = (Flowable) ((jly0) obj3).get();
        Flowable flowable31 = (Flowable) ((jly0) s24Var.g).get();
        Object obj4 = s24Var.h;
        w9u0 w9u0Var17 = (w9u0) ((jly0) obj4).get();
        o241 o241Var7 = (o241) daqVar.u4.get();
        c8o.l(o241Var7);
        Object obj5 = s24Var.i;
        bsp bspVar6 = (bsp) obj5;
        ktf1 ktf1Var6 = new ktf1(flowable30, flowable31, w9u0Var17, i691Var, o241Var7, bspVar6, new tas(bspVar6, new pdl0("", lik1Var.a, (byte) 1), (byte) 0));
        fsp fspVar5 = (fsp) ((jly0) s24Var.t).get();
        yjj1 yjj1Var5 = (yjj1) daqVar.zq.get();
        c8o.l(yjj1Var5);
        c3s c3sVar5 = (c3s) daqVar.e6.get();
        c8o.l(c3sVar5);
        gw70 gw70Var9 = (gw70) daqVar.d8.get();
        c8o.l(gw70Var9);
        w2k1 w2k1Var5 = (w2k1) daqVar.L8.get();
        c8o.l(w2k1Var5);
        Scheduler scheduler12 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler12);
        gw70 gw70Var10 = (gw70) daqVar.d8.get();
        c8o.l(gw70Var10);
        d0r d0rVar10 = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar10);
        qlb qlbVar5 = new qlb(gw70Var10, d0rVar10);
        luk lukVarA17 = j3qVar4.a();
        c8o.l(lukVarA17);
        p1f0 p1f0Var5 = new p1f0(yjj1Var5, c3sVar5, gw70Var9, (iac0) b4p0Var2, w2k1Var5, scheduler12, qlbVar5, new sn4(lukVarA17));
        luk lukVarA18 = j3qVar4.a();
        c8o.l(lukVarA18);
        d4p0 d4p0Var5 = new d4p0(fspVar5, p1f0Var5, new dv4(false, false, lukVarA18));
        Context context6 = (Context) teqVar.f.a;
        c8o.l(context6);
        e7p0 e7p0Var6 = (e7p0) teqVar.W4.get();
        c8o.l(e7p0Var6);
        z611 z611VarA6 = mid.A(context6, e7p0Var6);
        FlowableMap flowableMapF13 = f2u0.f((Flowable) ((jly0) obj3).get());
        lzn0 lzn0Var5 = (lzn0) teqVar.i.get();
        c8o.l(lzn0Var5);
        xrn0 xrn0VarO5 = aan0.o(lzn0Var5);
        tas tasVar2 = new tas((bsp) obj5, new pdl0("", lik1Var.a, (byte) 1), (byte) 0);
        ln91 ln91Var = (ln91) daqVar.yf.get();
        c8o.l(ln91Var);
        bfz bfzVar = new bfz(flowableMapF13, xrn0VarO5, tasVar2, ln91Var);
        w9u0 w9u0Var18 = (w9u0) ((jly0) obj4).get();
        Flowable flowable32 = (Flowable) ((jly0) obj3).get();
        Flowable flowable33 = (Flowable) ((jly0) s24Var.g).get();
        i8h1 i8h1Var10 = (i8h1) ((bsp) obj5).get();
        pdl0 pdl0Var2 = new pdl0("", lik1Var.a, (byte) 1);
        Scheduler scheduler13 = (Scheduler) daqVar.z1.get();
        c8o.l(scheduler13);
        gh10 gh10Var5 = new gh10(w9u0Var18, flowable32, flowable33, i8h1Var10, pdl0Var2, scheduler13);
        Flowable flowable34 = (Flowable) ((jly0) obj3).get();
        fl3 fl3Var4 = (fl3) yiqVar.xb.get();
        c8o.l(fl3Var4);
        yl1 yl1Var4 = new yl1(flowable34, fl3Var4, d8.c(b4p0Var2));
        s691 s691Var5 = new s691(s24Var.R(), (Flowable) ((jly0) s24Var.g).get(), s24Var.G(), (w9u0) ((jly0) obj4).get());
        w9u0 w9u0Var19 = (w9u0) ((jly0) obj4).get();
        gn10 gn10VarR7 = j310.r(b4p0Var2);
        FlowableMap flowableMapF14 = f2u0.f((Flowable) ((jly0) obj3).get());
        Flowable flowableG = s24Var.G();
        Flowable flowableJ13 = ((Flowable) ((jly0) obj3).get()).j(mo9Var2);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD7 = f2u0.d((Flowable) ((jly0) obj3).get());
        pe peVar7 = (pe) daqVar.p9.get();
        c8o.l(peVar7);
        luk lukVarA19 = j3qVar4.a();
        c8o.l(lukVarA19);
        dfm dfmVar6 = new dfm(w9u0Var19, gn10VarR7, flowableMapF14, flowableG, flowableJ13, flowableDistinctUntilChangedD7, peVar7, new qmr(new in4(lukVarA19)));
        k691 k691Var6 = new k691((Flowable) ((jly0) obj3).get(), (Flowable) ((jly0) s24Var.g).get(), (w9u0) ((jly0) obj4).get(), (mrq0) ((jly0) s24Var.Z).get(), i691Var);
        FlowableMap flowableMapF15 = f2u0.f((Flowable) ((jly0) obj3).get());
        uu00 uu00Var5 = (uu00) daqVar.a5.get();
        c8o.l(uu00Var5);
        d0r d0rVar11 = (d0r) ((jly0) bypVar.i).get();
        c8o.l(d0rVar11);
        vbs vbsVar6 = (vbs) daqVar.wf.get();
        c8o.l(vbsVar6);
        fns fnsVar = igu.a;
        c8o.m(fnsVar);
        luk lukVarA20 = j3qVar4.a();
        c8o.l(lukVarA20);
        dxy dxyVar3 = new dxy((Object) flowableMapF15, (Object) uu00Var5, (Object) d0rVar11, (Object) vbsVar6, (Object) fnsVar, (Object) new gn4(false, lukVarA20), (byte) 17);
        am51 am51Var3 = new am51(s24Var.R(), f2u0.j((Flowable) ((jly0) obj3).get()), s24Var.G(), (Flowable) ((jly0) s24Var.g).get(), (w9u0) ((jly0) obj4).get(), s24Var.f0(), (im51) ((jly0) s24Var.N0).get(), s24Var.t());
        qm51 qm51Var3 = new qm51(s24Var.R(), f2u0.j((Flowable) ((jly0) obj3).get()), s24Var.G(), (Flowable) ((jly0) s24Var.g).get(), (w9u0) ((jly0) obj4).get(), s24Var.f0(), (im51) ((jly0) s24Var.N0).get(), s24Var.t());
        h791 h791Var3 = new h791((Flowable) ((jly0) obj3).get(), (Flowable) ((jly0) s24Var.g).get(), (w9u0) ((jly0) obj4).get());
        uu00 uu00Var6 = (uu00) daqVar.a5.get();
        c8o.l(uu00Var6);
        uvy uvyVar3 = (uvy) ziqVar.o5.get();
        c8o.l(uvyVar3);
        rt01 rt01Var3 = new rt01(qm51Var3, h791Var3, new nn61(uu00Var6, uvyVar3, false, (byte) 25), (Flowable) ((jly0) obj3).get(), s24Var.t());
        aor aorVar6 = (aor) ziqVar.Mb.get();
        c8o.l(aorVar6);
        i8h1 i8h1Var11 = (i8h1) ((bsp) obj5).get();
        l6h1 l6h1Var6 = (l6h1) daqVar.fg.get();
        c8o.l(l6h1Var6);
        pdl0 pdl0Var3 = new pdl0("", lik1Var.a, (byte) 1);
        luk lukVarA21 = j3qVar4.a();
        c8o.l(lukVarA21);
        b4p0Var.G1 = new bjx(rzo0Var, sqg0.J(new mmr0[]{new mmr0(NowPlayingMiniMode.Ad, Single.just(gsj0Var)), new mmr0(NowPlayingMiniMode.Empty, Single.just(g7xVar)), new mmr0(NowPlayingMiniMode.Default, Single.just(jsj0Var)), new mmr0(NowPlayingMiniMode.Podcast, Single.just(lsj0Var)), new mmr0(NowPlayingMiniMode.Greenroom, Single.just(nsj0Var)), new mmr0(NowPlayingMiniMode.Endless, Single.just(lsj0Var2)), new mmr0(NowPlayingMiniMode.ReinventFree, Single.just(new rsj0(xfxVar6, ktf1Var6, d4p0Var5, z611VarA6, bfzVar, gh10Var5, yl1Var4, s691Var5, dfmVar6, k691Var6, dxyVar3, am51Var3, rt01Var3, aorVar6, i8h1Var11, l6h1Var6, pdl0Var3, new rv4(false, lukVarA21), s24Var.R())))}), (Scheduler) daqVar.r3.get(), (Scheduler) daqVar.z1.get());
        b4p0Var.I1 = (m7p0) daqVar.q9.get();
        b4p0Var.J1 = (ror) hbqVar.F1.get();
    }

    public void y() {
        i(new kks0(this, (byte) 18));
    }

    public void z(int i, int i2, String str, ji0 ji0Var) {
        jjh1 jjh1Var = (jjh1) this.a;
        String str2 = ji0Var.h;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.i;
        String str3 = ji0Var.a;
        String str4 = ji0Var.t;
        if (linkedHashSet.add(new mmr0(str3, str4))) {
            ryb0 ryb0VarN = LeavebehindAdEvent.n();
            ryb0VarN.r(str2);
            ryb0VarN.s(str4);
            ryb0VarN.t(kaa0.e(i2));
            ryb0VarN.u(i + 1);
            ryb0VarN.n("event_viewed");
            ryb0VarN.q("");
            ryb0VarN.v(str);
            ((t2j0) this.b).a(ryb0VarN.build());
            if (bpo1.C(ji0Var, jjh1Var, (i44) this.g)) {
                return;
            }
            if (!bpo1.y(ji0Var, jjh1Var)) {
                ao0.a((ao0) this.h, co0.Z, ji0Var.a, (Long) null, (String) null, (String) null, 124);
                return;
            }
            List list = (List) ji0Var.Q0.get("viewed");
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ko0) this.c).a((String) it.next(), str2);
                }
            }
        }
    }

    public byp(gj5 gj5Var, l8s l8sVar, Scheduler scheduler, apr aprVar) {
        this.b = gj5Var;
        this.c = l8sVar;
        this.a = scheduler;
        this.d = aprVar;
        this.e = new vku();
        this.i = new m9s(this, (byte) 1);
    }

    public byp(qe41 qe41Var, g0i g0iVar, qp60 qp60Var, String str, lzn0 lzn0Var, c690 c690Var, n431 n431Var, s331 s331Var, fkk1 fkk1Var, q01 q01Var) {
        this.b = g0iVar;
        this.c = qp60Var;
        this.a = str;
        this.d = c690Var;
        this.e = n431Var;
        this.f = s331Var;
        this.g = fkk1Var;
        this.h = new ecr0(new ukm0(this, qe41Var, (byte) 15), q01Var, s5o0.a, new in8(lzn0Var));
        tbr0 tbr0Var = new tbr0(c690Var, n431Var, "");
        fns fnsVar = igu.a;
        myq0 myq0Var = new myq0(pyf0.a.f, tbr0Var, (byte) 3);
        this.i = new phi0((Function0) new gyq0(this, (byte) 9), (s1q0) g0iVar, (wbr0) new z5r0(this), (vbr0) new a6r0(), tbr0Var, myq0Var);
    }

    public byp(Flowable flowable, k9r k9rVar, x8c0 x8c0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.b = flowable;
        this.c = k9rVar;
        this.a = x8c0Var;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = new idd1(w0n0.Z);
        this.g = new rku();
        this.i = new ct6(this, (byte) 11);
    }

    public byp(lik1 lik1Var, String str, c380 c380Var, dnc0 dnc0Var, ogr ogrVar, qdp qdpVar, rdp rdpVar, xq51 xq51Var, fjb fjbVar, iac0 iac0Var) {
        this.b = lik1Var;
        this.c = str;
        this.a = c380Var;
        this.d = ogrVar;
        this.e = qdpVar;
        this.f = rdpVar;
        this.g = xq51Var;
        this.h = fjbVar;
        this.i = iac0Var;
    }

    public byp(t2j0 t2j0Var, ko0 ko0Var, jjh1 jjh1Var, lzn0 lzn0Var, dg30 dg30Var, pxc pxcVar, i44 i44Var, ao0 ao0Var) {
        this.b = t2j0Var;
        this.c = ko0Var;
        this.a = jjh1Var;
        this.d = lzn0Var;
        this.e = dg30Var;
        this.f = pxcVar;
        this.g = i44Var;
        this.h = ao0Var;
        this.i = new LinkedHashSet();
    }

    public byp(g0l g0lVar, hir hirVar, lbq lbqVar, c9c0 c9c0Var, sfr sfrVar, uya uyaVar, iir iirVar, q8n q8nVar) {
        this.b = g0lVar;
        this.c = hirVar;
        this.a = lbqVar;
        this.d = c9c0Var;
        this.e = sfrVar;
        this.f = uyaVar;
        this.g = iirVar;
        this.h = i3a.k(q8nVar);
        this.i = new idd1(new dor(this, (byte) 4));
    }

    public byp(Resources resources, dxz0 dxz0Var) {
        this.b = dxz0Var;
        this.c = resources.getString(2131955714);
        this.a = resources.getString(2131955713);
        this.d = resources.getString(2131955740);
        this.e = resources.getString(2131955739);
        this.f = resources.getString(2131955757);
        this.g = resources.getString(2131955756);
        this.h = resources.getString(2131955743);
        this.i = resources.getString(2131955742);
    }

    public byp(BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout, BackButtonView backButtonView, View view, CollapsingToolbarLayout collapsingToolbarLayout, ViewStub viewStub, BellButtonView bellButtonView, EncoreButton encoreButton, View view2, Toolbar toolbar, LinearLayout linearLayout, TextView textView) {
        this.b = behaviorRetainingAppBarLayout;
        this.c = backButtonView;
        this.a = view;
        this.d = bellButtonView;
        this.e = encoreButton;
        this.f = view2;
        this.g = toolbar;
        this.h = linearLayout;
        this.i = textView;
    }

    public byp(k3q k3qVar, qop qopVar, jbt jbtVar) {
        this.b = jbtVar;
        this.c = k3qVar;
        this.d = qopVar;
        this.e = new ykq(this, 0, (byte) 27);
        this.f = new ykq(this, 1, (byte) 27);
        this.g = new ykq(this, 3, (byte) 27);
        this.h = new ykq(this, 2, (byte) 27);
        this.i = new ykq(this, 4, (byte) 27);
        this.a = iy81.a(new ykq(this, 5, (byte) 27));
    }

    public byp(String str, rit0 rit0Var, nm1 nm1Var, xvu xvuVar, bk90 bk90Var, q1p q1pVar, nm1 nm1Var2, qlb qlbVar, f6g1 f6g1Var) {
        this.b = str;
        this.c = rit0Var;
        this.a = nm1Var;
        this.d = xvuVar;
        this.e = bk90Var;
        this.f = nm1Var2;
        this.g = qlbVar;
        this.h = f6g1Var;
        this.i = q1pVar.a();
    }

    public byp(ks6 ks6Var, zjn0 zjn0Var, n9r n9rVar, l141 l141Var, y3j1 y3j1Var, ava avaVar, xht xhtVar, mxa1 mxa1Var, List list) {
        this.b = ks6Var;
        this.c = zjn0Var;
        this.a = n9rVar;
        this.d = l141Var;
        this.e = y3j1Var;
        this.f = avaVar;
        this.g = xhtVar;
        this.h = new mxa1(this, mxa1Var, list, "Deserializer for \"" + n9rVar.getName() + '\"', xhtVar != null ? xhtVar.c() : "[container not found]");
        this.i = new eki0(this);
    }

    public byp(fwg1 fwg1Var, hwg1 hwg1Var, q7r0 q7r0Var) {
        this.b = hwg1Var;
        this.c = fwg1Var;
        this.d = q7r0Var;
        this.a = xqu.b(new tsq(this, 2, (byte) 8));
        this.e = iy81.a(new tsq(this, 1, (byte) 8));
        this.f = xqu.b(new tsq(this, 3, (byte) 8));
        this.g = xqu.b(new tsq(this, 0, (byte) 8));
        this.h = xqu.b(new tsq(this, 4, (byte) 8));
        this.i = xqu.b(new tsq(this, 5, (byte) 8));
    }

    public byp(cle1 cle1Var, dle1 dle1Var) {
        this.b = cle1Var;
        this.c = dle1Var;
        this.a = xqu.b(new tsq(this, 0, (byte) 2));
        this.d = new tsq(this, 3, (byte) 2);
        this.e = new tsq(this, 2, (byte) 2);
        this.f = new tsq(this, 4, (byte) 2);
        this.g = new tsq(this, 1, (byte) 2);
        this.h = new tsq(this, 6, (byte) 2);
        this.i = new tsq(this, 5, (byte) 2);
    }

    public byp(a7u0 a7u0Var, b7u0 b7u0Var, q7r0 q7r0Var) {
        this.b = a7u0Var;
        this.c = b7u0Var;
        byte b = 11;
        this.a = xqu.b(new ywp(this, 0, b));
        this.d = new ywp(this, 4, b);
        this.e = new ywp(this, 5, b);
        this.f = new ywp(this, 3, b);
        this.g = new ywp(this, 2, b);
        this.h = new ywp(this, 1, b);
        this.i = new ywp(this, 6, b);
    }

    public byp(k0x0 k0x0Var, m0x0 m0x0Var, q7r0 q7r0Var) {
        this.b = k0x0Var;
        this.c = m0x0Var;
        this.d = q7r0Var;
        byte b = 27;
        this.a = xqu.b(new ywp(this, 0, b));
        this.e = iy81.a(new ywp(this, 1, b));
        this.f = iy81.a(new ywp(this, 2, b));
        this.g = new ywp(this, 3, b);
        this.h = new ywp(this, 4, b);
        this.i = xqu.b(new ywp(this, 5, b));
    }

    public /* synthetic */ byp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
    }

    public byp(gni1 gni1Var, lyj lyjVar, hni1 hni1Var, q7r0 q7r0Var) {
        this.b = gni1Var;
        this.c = hni1Var;
        this.d = q7r0Var;
        this.a = xqu.b(new tsq(this, 2, (byte) 14));
        this.e = xqu.b(new tsq(this, 1, (byte) 14));
        this.f = new tsq(this, 4, (byte) 14);
        this.g = xqu.b(new tsq(this, 3, (byte) 14));
        this.h = xqu.b(new tsq(this, 0, (byte) 14));
        this.i = xqu.b(new tsq(this, 5, (byte) 14));
    }

    public byp(daq daqVar, v5q v5qVar, q2p0 q2p0Var) {
        this.c = daqVar;
        this.d = v5qVar;
        this.b = q2p0Var;
        byte b = 7;
        this.a = iy81.a(new obq(daqVar, this, 0, b));
        this.e = iy81.a(new obq(daqVar, this, 1, b));
        this.f = iy81.a(new obq(daqVar, this, 3, b));
        this.g = iy81.a(new obq(daqVar, this, 4, b));
        this.h = iy81.a(new obq(daqVar, this, 2, b));
        this.i = iy81.a(new obq(daqVar, this, 5, b));
    }

    public byp(daq daqVar, teq teqVar, b4p0 b4p0Var) {
        this.e = this;
        this.c = daqVar;
        this.d = teqVar;
        this.b = b4p0Var;
        this.a = iy81.a(new p2q(daqVar, teqVar, this, 0, (byte) 6));
        byte b = 6;
        this.f = iy81.a(new p2q(daqVar, teqVar, this, 1, b));
        this.g = iy81.a(new p2q(daqVar, teqVar, this, 2, b));
        this.h = iy81.a(new p2q(daqVar, teqVar, this, 3, b));
        this.i = xqu.b(new p2q(daqVar, teqVar, this, 4, b));
    }
}
