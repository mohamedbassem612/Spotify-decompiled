package p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.Connectables;
import com.spotify.player.model.command.options.TimerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fun0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public fun0(yu8 yu8Var, c9n c9nVar) {
        this.a = (byte) 16;
        this.b = yu8Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public Object b(boolean z, lnm lnmVar) {
        iut0 iut0Var;
        m231 m231Var;
        blx0 blx0Var;
        boolean z2 = z;
        byte b = this.a;
        m231 m231Var2 = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.b;
        switch (b) {
            case 16:
                yu8 yu8Var = (yu8) obj;
                String str = (String) yu8Var.d;
                if (lnmVar instanceof iut0) {
                    iut0Var = (iut0) lnmVar;
                    int i = iut0Var.d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iut0Var.d = i - Integer.MIN_VALUE;
                    } else {
                        iut0Var = new iut0(this, lnmVar);
                    }
                } else {
                    iut0Var = new iut0(this, lnmVar);
                }
                Object objP = iut0Var.b;
                int i2 = iut0Var.d;
                try {
                    if (i2 == 0) {
                        hm5.M(objP);
                        boolean z3 = z2 && ((ep4) yu8Var.g).a();
                        xyc0 xyc0Var = (iyc0) yu8Var.e;
                        iut0Var.a = z2;
                        iut0Var.d = 1;
                        objP = xyc0Var.p(str, "playable-audiobook", z3, false, iut0Var);
                        if (objP == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i2 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = iut0Var.a;
                        hm5.M(objP);
                    }
                    ((py21) objP).d();
                    m231Var = m231Var2;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null) {
                    return m231Var2;
                }
                Logger.e(thA, "Auto Lens: Failed to set lens playable-audiobook to " + z2 + " on list " + str, new Object[0]);
                return m231Var2;
            default:
                dlx0 dlx0Var = (dlx0) obj;
                tac0 tac0Var = dlx0Var.d;
                if (lnmVar instanceof blx0) {
                    blx0Var = (blx0) lnmVar;
                    int i3 = blx0Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        blx0Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        blx0Var = new blx0(this, lnmVar);
                    }
                } else {
                    blx0Var = new blx0(this, lnmVar);
                }
                Object obj2 = blx0Var.a;
                int i4 = blx0Var.c;
                if (i4 == 0) {
                    hm5.M(obj2);
                    if (!z2) {
                        if (!tac0Var.i.a(w8c0.c)) {
                            return m231Var2;
                        }
                        dlx0Var.e(k8c0.ON_DESTROY);
                        return m231Var2;
                    }
                    dlx0Var.e(k8c0.ON_CREATE);
                    xe01 xe01VarH = d5p1.h(tac0Var.j);
                    zio0 zio0Var = new zio0(2, (lnm) null, (byte) 19);
                    blx0Var.c = 1;
                    if (b5p1.j(xe01VarH, zio0Var, blx0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj2);
                }
                tj70 tj70Var = dlx0Var.h;
                if (tj70Var == null) {
                    return m231Var2;
                }
                IInterface iInterface = dlx0Var.i;
                tj70 tj70Var2 = tj70Var;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(vj70.j);
                    parcelObtain.writeStrongInterface(iInterface);
                    if (!tj70Var2.a.transact(6, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method registerProjectedDeviceStateListener is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return m231Var2;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0208  */
    public final Object emit(Object obj, lnm lnmVar) {
        Object objB;
        y5u y5uVar;
        y5u y5uVar2;
        mia1 mia1Var;
        var0 var0Var;
        int iC;
        nmu0 nmu0Var;
        String strM;
        Boolean boolD1;
        String string;
        Integer num;
        Object objY;
        ContentResolver contentResolver;
        byte b = this.a;
        wls0 wls0Var = wls0.c;
        byte b2 = 2;
        byte b3 = 3;
        d9n d9nVar = d9n.a;
        String str = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((((o5e0) obj) instanceof f5e0) && (objB = ((gun0) obj2).a.b(lnmVar)) == d9nVar) ? objB : rih1Var;
            case 1:
                Object objJ = ((km0) obj2).j((String) obj, lnmVar);
                return objJ == d9nVar ? objJ : rih1Var;
            case 2:
                ((fdc) obj2).c0(((Boolean) obj).booleanValue());
                return rih1Var;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                o0p0 o0p0Var = (o0p0) obj2;
                w8c0 w8c0Var = w8c0.a;
                if (zBooleanValue) {
                    MobiusLoop.Controller controller = o0p0Var.P1;
                    if (controller == null) {
                        u890.C("mobiusController");
                        throw null;
                    }
                    if (!controller.isRunning()) {
                        MobiusLoop.Controller controller2 = o0p0Var.P1;
                        if (controller2 == null) {
                            u890.C("mobiusController");
                            throw null;
                        }
                        controller2.c(Connectables.a(new hod0(o0p0Var, (byte) 26), o0p0Var.Q1));
                        MobiusLoop.Controller controller3 = o0p0Var.P1;
                        if (controller3 == null) {
                            u890.C("mobiusController");
                            throw null;
                        }
                        controller3.start();
                    }
                    j2p0 j2p0Var = o0p0Var.Q1;
                    if (j2p0Var != null && (y5uVar2 = j2p0Var.N0) != null) {
                        tac0 tac0Var = y5uVar2.b;
                        if (tac0Var.i != w8c0Var) {
                            tac0Var.i(w8c0.e);
                        }
                    }
                } else {
                    j2p0 j2p0Var2 = o0p0Var.Q1;
                    if (j2p0Var2 != null && (y5uVar = j2p0Var2.N0) != null) {
                        tac0 tac0Var2 = y5uVar.b;
                        if (tac0Var2.i != w8c0Var) {
                            tac0Var2.i(w8c0.c);
                        }
                    }
                    o0p0Var.a1();
                }
                return rih1Var;
            case 4:
                ((e6p0) obj2).c();
                return rih1Var;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((bpb1) obj2).m((Object) null, bool);
                return rih1Var;
            case 6:
                hhp0 hhp0Var = hhp0.a;
                ihp0.p("nav.page_navigation", (String) obj);
                ((qhp0) obj2).a();
                return rih1Var;
            case 7:
                x2d0 x2d0Var = (g3d0) obj;
                stk stkVar = (stk) ((ynb0) ((odm) obj2).d).get();
                if (x2d0Var instanceof x2d0) {
                    mia1Var = new mia1("name", x2d0Var.a, (mia1) null, 4);
                } else if (x2d0Var instanceof s2d0) {
                    mia1Var = new mia1("artist.name", ((s2d0) x2d0Var).a, (mia1) null, 4);
                } else {
                    mia1Var = x2d0Var instanceof q2d0 ? new mia1("album.name", ((q2d0) x2d0Var).a, (mia1) null, 4) : new mia1("relevance", false, (mia1) null, 4);
                }
                hma1 hma1VarEdit = stkVar.b.a.edit();
                hma1VarEdit.d(qia1.c, mia1Var.a);
                hma1VarEdit.g();
                bpb1 bpb1Var = stkVar.c;
                bpb1Var.m((Object) null, ztc.a((ztc) bpb1Var.getValue(), mia1Var, (List) null, 0, 254));
                return rih1Var;
            case 8:
                g4q0 g4q0Var = (g4q0) obj2;
                int iOrdinal = ((s3q0) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        Object objB2 = g4q0Var.b(lnmVar);
                        if (objB2 == d9nVar) {
                            return objB2;
                        }
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        Object objE = g4q0Var.e(lnmVar);
                        if (objE == d9nVar) {
                            return objE;
                        }
                    }
                }
                return rih1Var;
            case 9:
                yu8 yu8Var = (yu8) obj2;
                Object objY2 = fn31.Y((q8n) yu8Var.g, new e3p0(yu8Var, (o9r0) obj, (lnm) null, (byte) 19), lnmVar);
                return objY2 == d9nVar ? objY2 : rih1Var;
            case 10:
                nar0 nar0Var = (nar0) obj;
                tar0 tar0Var = (tar0) obj2;
                if (tar0Var.d && tar0Var.c) {
                    yqg yqgVar = tar0Var.b;
                    bpb1 bpb1Var2 = tar0Var.s;
                    boolean z = tar0Var.j && tar0Var.o == null;
                    tar0Var.j = false;
                    if (!nar0Var.equals(tar0Var.f)) {
                        tar0Var.f = nar0Var;
                        if (tar0Var.g != null) {
                            if (tar0Var.l instanceof rar0) {
                                tar0Var.l = fkj0.d1;
                                bpb1Var2.l(tar0Var.a());
                                uhs0 uhs0Var = tar0Var.m;
                                if (uhs0Var != null) {
                                    ps7 ps7Var = tar0Var.n;
                                    if (ps7Var != null) {
                                        uba.q((uba) ps7Var.b, uhs0Var.a, uhs0Var.b, uhs0Var.c, uhs0Var.d, tar0Var.a(), (List) null, uhs0Var.e, 32);
                                    }
                                    tar0Var.m = null;
                                }
                            } else if (z) {
                                bpb1Var2.l(tar0Var.a());
                            } else {
                                int i = tar0Var.e;
                                tar0Var.e = i + 1;
                                var0 var0VarA = tar0Var.a();
                                if (var0VarA != null) {
                                    jsn0 jsn0Var = tar0Var.o;
                                    if (jsn0Var == null && (jsn0Var = var0VarA.c) == null) {
                                        jsn0Var = jsn0.a;
                                    }
                                    var0Var = new var0(var0VarA.a, var0VarA.b, jsn0Var);
                                } else {
                                    var0Var = null;
                                }
                                bjr0 bjr0Var = tar0Var.a;
                                y6r0 y6r0Var = tar0Var.g;
                                String str2 = y6r0Var != null ? y6r0Var.a : null;
                                Integer numValueOf = Integer.valueOf(i);
                                n6r0 n6r0Var = tar0Var.h;
                                String strPath = n6r0Var != null ? n6r0Var.path() : null;
                                u8h1 u8h1Var = tar0Var.i;
                                bjr0Var.d.l(new dbp0(bjr0Var, str2, numValueOf, strPath, u8h1Var != null ? u8h1Var.a.a : null, Long.valueOf(yqgVar.b()), yqgVar.g().getID(), var0Var, (byte) 5));
                                tar0Var.o = null;
                                bpb1Var2.l(tar0Var.a());
                            }
                        }
                    }
                }
                return rih1Var;
            case 11:
                ((bjr0) obj2).a.a((s2j0) ((Function0) obj).invoke());
                LinkedHashMap linkedHashMap = h8h1.a;
                return rih1Var;
            case 12:
                String str3 = (String) obj;
                djr0 djr0Var = (djr0) obj2;
                djr0Var.i = str3;
                kj41 kj41Var = djr0Var.e;
                if (kj41Var != null) {
                    kj41Var.setAttribute("page_identifier", str3);
                }
                return rih1Var;
            case 13:
                String str4 = (String) obj;
                w4t0 w4t0Var = (w4t0) obj2;
                bpb1 bpb1Var3 = w4t0Var.h;
                llm llmVar = w4t0Var.Z;
                if (((b5t0) bpb1Var3.getValue()).a == null || !u890.j(w4t0Var.P0, str4) || ((List) w4t0Var.N0.getValue()).isEmpty()) {
                    fn31.T(llmVar, (o8n) null, 0, new dvq0(w4t0Var, str4, str, (byte) 13), 3);
                    fn31.T(llmVar, (o8n) null, 0, new f3t0(w4t0Var, str, b2), 3);
                }
                return rih1Var;
            case 14:
                ((gst0) obj2).e.l((Map) obj);
                return rih1Var;
            case 15:
                ((stt0) obj2).e.l((Map) obj);
                return rih1Var;
            case 16:
                return b(((Boolean) obj).booleanValue(), lnmVar);
            case 17:
                mmr0 mmr0Var = (mmr0) obj;
                k7u0 k7u0Var = (k7u0) obj2;
                Boolean bool2 = (Boolean) mmr0Var.a;
                if (!u890.j((Boolean) mmr0Var.b, Boolean.TRUE)) {
                    Set set = k7u0.N0;
                    faa0 faa0Var = k7u0Var.Y;
                    if (faa0Var != null) {
                        faa0Var.d(new g7u0("PLAYBACK_STOPPED"));
                    }
                    k7u0Var.Y = null;
                } else if (bool2 != null && !bool2.booleanValue()) {
                    Set set2 = k7u0.N0;
                    if (k7u0Var.t.getValue() == null && k7u0Var.j()) {
                        k7u0Var.f.e();
                        faa0 faa0Var2 = k7u0Var.Y;
                        if (faa0Var2 != null) {
                            faa0Var2.d((CancellationException) null);
                        }
                        k7u0Var.Y = fn31.T(k7u0Var.i, (o8n) null, 0, new i7u0(k7u0Var, (lnm) null, (byte) 0), 3);
                    }
                }
                return rih1Var;
            case 18:
                adu0 adu0Var = (adu0) obj2;
                TimerType.Clear clear = TimerType.clear();
                ocu0 ocu0Var = adu0Var.a;
                faa0 faa0Var3 = ocu0Var.c;
                if (faa0Var3 != null) {
                    faa0Var3.d((CancellationException) null);
                }
                ocu0Var.c = c921.y(ocu0Var.b, (o8n) null, 0, new ncu0(ocu0Var, clear, (lnm) null), 3);
                g991 g991Var = adu0Var.i;
                if (g991Var != null) {
                    g991Var.a(va91.e);
                    return rih1Var;
                }
                u890.C("statusHandler");
                throw null;
            case 19:
                ((lzn0) ((cpa) obj2).b).i(new dwn0(d5j1.b.a, "", true, false, 0, 0, false, null, null, null), mno1.h(new mmr0[]{new mmr0("has_expired", Boolean.TRUE)}));
                return rih1Var;
            case 20:
                h1r h1rVar = (k1r) obj;
                you0 you0Var = (you0) obj2;
                if (h1rVar instanceof j1r) {
                    you0Var.j();
                } else if (h1rVar instanceof h1r) {
                    you0Var.h(new IllegalStateException(h1rVar.a.getMessage()));
                } else {
                    if (!(h1rVar instanceof i1r)) {
                        eg.o();
                        return null;
                    }
                    you0Var.i();
                    qxc0 qxc0Var = (qxc0) ((i1r) h1rVar).a;
                    u46 u46Var = you0Var.f;
                    String str5 = u46Var.a;
                    String str6 = u46Var.b;
                    Map map = qxc0Var.X;
                    pxc0 pxc0Var = qxc0Var.c;
                    String str7 = (String) map.get("prompt");
                    String str8 = "";
                    String str9 = str7 == null ? "" : str7;
                    try {
                        String str10 = (String) map.get("refresh_cadence");
                        if (str10 != null) {
                            if (str10 != null) {
                                if (str10.equals("DAILY")) {
                                    b2 = 1;
                                } else if (!str10.equals("WEEKLY")) {
                                    if (str10.equals("NEVER")) {
                                        b2 = 3;
                                    } else {
                                        hhg1.n("No enum constant com.spotify.promptedplaylists.artifactpage.api.Cadence.".concat(str10));
                                    }
                                }
                                if (b2 != 0) {
                                    b3 = b2;
                                }
                            } else {
                                bhn0.i("Name is null");
                            }
                            b2 = 0;
                            if (b2 != 0) {
                                b3 = b2;
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String str11 = (String) map.get("weekly_refresh_day");
                        if (str11 == null || (iC = eqq.C(str11)) == 0) {
                            iC = 1;
                        }
                    } catch (Exception unused2) {
                    }
                    ee11 ee11Var = new ee11(b3, iC);
                    String str12 = (String) map.get("generation_mode");
                    if (str12 == null) {
                        nmu0Var = null;
                    } else if (str12.equals("MODE_ITERATIVE_UPDATE")) {
                        nmu0Var = nmu0.b;
                    } else {
                        str12.equals("MODE_FULL_GENERATION");
                        nmu0Var = nmu0.c;
                    }
                    if (nmu0Var == null) {
                        nmu0Var = nmu0.a;
                    }
                    nmu0 nmu0Var2 = nmu0Var;
                    Set set3 = s4b1.f;
                    boolean zJ = u890.j(str6, uic.x(pxc0Var != null ? pxc0Var.a : null).s());
                    String str13 = qxc0Var.a;
                    if (pxc0Var == null || (strM = pxc0Var.a) == null) {
                        strM = l1d.m("spotify:user:", str6);
                    }
                    String str14 = strM;
                    boolean z2 = qxc0Var.i != wls0Var;
                    List list = qxc0Var.N0;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ll81) it.next()).a);
                    }
                    Set set4 = h4d0.a;
                    String str15 = (String) map.get("generation_status");
                    if (str15 != null && (string = ihc1.e1(str15).toString()) != null) {
                        str8 = string;
                    }
                    boolean zB = qyo1.u(str8).b();
                    String str16 = (String) map.get("location_sensitive");
                    boolean zBooleanValue2 = (str16 == null || (boolD1 = ihc1.d1(str16)) == null) ? false : boolD1.booleanValue();
                    you0Var.g.getClass();
                    you0Var.i = new txx0(str5, str9, zJ, str13, str14, ee11Var, nmu0Var2, z2, arrayList, zB, zBooleanValue2, ytw0.e(map) != null);
                }
                return rih1Var;
            case 21:
                r091 r091Var = (r091) ((kkw0) obj2).c.getValue();
                if (r091Var != null) {
                    r091Var.c();
                }
                return rih1Var;
            case 22:
                wls0 wls0Var2 = (wls0) obj;
                fjk0 fjk0Var = (fjk0) obj2;
                wls0 wls0Var3 = (wls0) fjk0Var.h;
                fjk0Var.h = wls0Var2;
                wls0 wls0Var4 = wls0.d;
                if (wls0Var3 == wls0Var4 && wls0Var2 == wls0Var) {
                    num = new Integer(2131960426);
                } else {
                    num = (wls0Var3 == wls0Var && wls0Var2 == wls0Var4) ? new Integer(2131960427) : null;
                }
                return (num == null || (objY = fn31.Y((q8n) fjk0Var.f, new cqu0(fjk0Var, num, (lnm) null, (byte) 16), lnmVar)) != d9nVar) ? rih1Var : objY;
            case 23:
                ((bpb1) ((l0x0) obj2).c).l((whx0) obj);
                return rih1Var;
            case 24:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                bpb1 bpb1Var4 = ((hkx0) obj2).Q0;
                bpb1Var4.getClass();
                bpb1Var4.m((Object) null, bool3);
                return rih1Var;
            case 25:
                return b(((Boolean) obj).booleanValue(), lnmVar);
            case 26:
                ((Boolean) obj).getClass();
                PromptSuggestionsProvider promptSuggestionsProvider = (PromptSuggestionsProvider) obj2;
                Context context = promptSuggestionsProvider.getContext();
                if (context != null && (contentResolver = context.getContentResolver()) != null) {
                    Uri uri = promptSuggestionsProvider.d;
                    if (uri == null) {
                        u890.C("contentUri");
                        throw null;
                    }
                    contentResolver.notifyChange(uri, (ContentObserver) null, 0);
                }
                return rih1Var;
            case 27:
                ((Boolean) obj).getClass();
                dly0 dly0Var = (dly0) obj2;
                Object objD = d0r.d(dly0Var.a, pwc0.e, new g4d0(dly0Var.b), d4d0.a, lnmVar);
                return objD == d9nVar ? objD : rih1Var;
            case 28:
                ((toy0) obj2).c.c(((Boolean) obj).booleanValue());
                return rih1Var;
            default:
                suy0 suy0Var = (suy0) obj2;
                zor zorVar = suy0Var.c;
                m0s m0sVar = suy0Var.d;
                m0sVar.getClass();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-connect-google-output-switcher";
                x6h1VarI.f = "3.2.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "background");
                x6h1VarR.i.add(new a7h1("container_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                x6h1 x6h1VarC = x6h1VarR.a().c();
                x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("local_device", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                zor.i(zorVar, m0sVar.a(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pull_playback_to_local_device", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis())), 4);
                return rih1Var;
        }
    }

    public /* synthetic */ fun0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
