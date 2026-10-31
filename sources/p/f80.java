package p;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f80 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(enf enfVar, iu30 iu30Var, inf infVar, ven0 ven0Var, ven0 ven0Var2) {
        super(0);
        this.a = (byte) 19;
        this.b = enfVar;
        this.c = iu30Var;
        this.d = ven0Var;
        this.e = ven0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0754  */
    /* JADX WARN: Code duplicated, block: B:181:0x0755  */
    /* JADX WARN: Code duplicated, block: B:182:0x0758  */
    /* JADX WARN: Code duplicated, block: B:183:0x075b  */
    /* JADX WARN: Code duplicated, block: B:184:0x075e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0761  */
    /* JADX WARN: Code duplicated, block: B:186:0x0764  */
    /* JADX WARN: Code duplicated, block: B:187:0x0767  */
    /* JADX WARN: Code duplicated, block: B:217:0x081f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0821 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x0823  */
    /* JADX WARN: Code duplicated, block: B:221:0x0826  */
    /* JADX WARN: Code duplicated, block: B:224:0x082a  */
    /* JADX WARN: Code duplicated, block: B:226:0x0830  */
    /* JADX WARN: Code duplicated, block: B:227:0x0836  */
    /* JADX WARN: Code duplicated, block: B:228:0x083a  */
    /* JADX WARN: Code duplicated, block: B:229:0x083e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0842  */
    public final Object invoke() {
        int i;
        int iC;
        char c;
        String str;
        boolean zJ;
        qj0 qj0Var;
        String str2;
        byte b = this.a;
        l231 l231Var = l231.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                Activity activity = (Activity) obj3;
                Intent intent = (Intent) obj2;
                String str3 = (String) obj4;
                if (str3 != null) {
                    if (str3.equals("ACTIVITY")) {
                        i = 1;
                    } else if (str3.equals("BROADCAST")) {
                        i = 2;
                    } else if (str3.equals("SERVICE")) {
                        i = 3;
                    } else if (str3.equals("FOREGROUND_SERVICE")) {
                        i = 4;
                    } else if (str3.equals("CALLBACK")) {
                        i = 5;
                    } else {
                        hhg1.n("No enum constant androidx.glance.appwidget.action.ActionTrampolineType.".concat(str3));
                    }
                    iC = l1d.C(i);
                    if (iC != 0) {
                        activity.startActivity(intent, (Bundle) obj);
                    } else if (iC == 1) {
                        activity.sendBroadcast(intent);
                    } else if (iC != 2) {
                        activity.startService(intent);
                    } else if (iC != 3) {
                        if (iC == 4) {
                            activity.sendBroadcast(intent);
                        }
                    } else if (Build.VERSION.SDK_INT >= 26) {
                        fmc0.a.a(activity, intent);
                    } else {
                        activity.startService(intent);
                    }
                    return rih1Var;
                }
                bhn0.i("Name is null");
                i = 0;
                iC = l1d.C(i);
                if (iC != 0) {
                    activity.startActivity(intent, (Bundle) obj);
                } else if (iC == 1) {
                    activity.sendBroadcast(intent);
                } else if (iC != 2) {
                    activity.startService(intent);
                } else if (iC != 3) {
                    if (iC == 4) {
                        activity.sendBroadcast(intent);
                    }
                } else if (Build.VERSION.SDK_INT >= 26) {
                    fmc0.a.a(activity, intent);
                } else {
                    activity.startService(intent);
                }
                return rih1Var;
            case 1:
                el1 el1Var = (el1) obj4;
                xab1 xab1Var = el1Var.i;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                o0i o0iVar = (o0i) obj3;
                el1Var.i = fn31.T(o0iVar.a, (o8n) null, 0, new zk1(el1Var, o0iVar, (xk1) obj2, (ven0) obj, (lnm) null, (byte) 1), 3);
                return rih1Var;
            case 2:
                mn1 mn1Var = (mn1) obj3;
                String str4 = (String) obj4;
                String str5 = (String) obj2;
                int i2 = ((rmy) obj).d;
                eyh0 eyh0Var = mn1Var.f;
                String strA = ((gdr) eyh0Var.c).a(fdr.d);
                i8h1 i8h1Var = (i8h1) eyh0Var.b;
                String strQ = zjy.q(i2);
                if (strQ != null) {
                    if (strQ.equals("ALBUM")) {
                        c = 1;
                    } else if (strQ.equals("ARTIST")) {
                        c = 2;
                    } else if (strQ.equals("AUDIOBOOK")) {
                        c = 3;
                    } else if (strQ.equals("EPISODE")) {
                        c = 4;
                    } else if (strQ.equals("PLAYLIST")) {
                        c = 5;
                    } else if (strQ.equals("PODCAST")) {
                        c = 6;
                    } else if (strQ.equals("TRACK")) {
                        c = 7;
                    } else {
                        hhg1.n("No enum constant com.spotify.ubi.specification.factories.MobileSaveForLaterAddToPlaylistEventFactory.MobileSaveForLaterAddToPlaylistEnums.Identifier.".concat(strQ));
                    }
                    r6h1 r6h1Var = r6h1.c;
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-save-for-later-add-to-playlist";
                    x6h1VarI.f = "1.0.0";
                    x6h1VarI.g = "22.0.0";
                    switch (c) {
                        case 1:
                            str = "album";
                            break;
                        case 2:
                            str = "artist";
                            break;
                        case 3:
                            str = "audiobook";
                            break;
                        case 4:
                            str = "episode";
                            break;
                        case 5:
                            str = "playlist";
                            break;
                        case 6:
                            str = "podcast";
                            break;
                        case 7:
                            str = "track";
                            break;
                        default:
                            throw null;
                    }
                    x6h1VarI.b = str;
                    x6h1VarI.e = strA;
                    x6h1VarI.d = str5;
                    y6h1 y6h1VarA = x6h1VarI.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = r6h1.c;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                    vu1.b(mn1Var.a, Collections.singletonList(str5), "spotify:save-for-later", str4, (tv80) null, new dy1((g3d0) null), 40);
                    return rih1Var;
                }
                bhn0.i("Name is null");
                c = 0;
                r6h1 r6h1Var2 = r6h1.c;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-save-for-later-add-to-playlist";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                switch (c) {
                    case 1:
                        str = "album";
                        break;
                    case 2:
                        str = "artist";
                        break;
                    case 3:
                        str = "audiobook";
                        break;
                    case 4:
                        str = "episode";
                        break;
                    case 5:
                        str = "playlist";
                        break;
                    case 6:
                        str = "podcast";
                        break;
                    case 7:
                        str = "track";
                        break;
                    default:
                        throw null;
                }
                x6h1VarI2.b = str;
                x6h1VarI2.e = strA;
                x6h1VarI2.d = str5;
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).b = r6h1.c;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var2.a(), (Set) null);
                vu1.b(mn1Var.a, Collections.singletonList(str5), "spotify:save-for-later", str4, (tv80) null, new dy1((g3d0) null), 40);
                return rih1Var;
            case 3:
                fn31.T((c9n) obj4, (o8n) null, 0, new g((vy71) obj, (lnm) null, (byte) 2), 3);
                ly2 ly2Var = (ly2) obj3;
                ly2Var.a.m(ly2Var.b.e(), (xj61) null);
                ((jy2) obj2).c.invoke();
                return rih1Var;
            case 4:
                uv11 uv11Var = (uv11) obj2;
                o3r o3rVar = (o3r) obj4;
                if (o3rVar != null) {
                    i1r i1rVarN = x2p1.n(((qlb) obj).b, o3rVar, uv11Var);
                    i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
                    zJ = u890.j(i1rVar != null ? (Boolean) i1rVar.a : null, Boolean.TRUE);
                } else {
                    zJ = false;
                }
                x83 x83Var = (x83) obj3;
                return gm50.n((Map) x83Var.j.getValue(), x83Var.m.a(), x83Var.k.b(), dko1.o(x83Var.m, uv11Var.a, zJ));
            case 5:
                ((ven0) obj).setValue(Boolean.TRUE);
                ((wh6) ((ji6) obj4).b).v.invoke();
                ys50 ys50Var = (ys50) obj3;
                if (ys50Var != null) {
                    ys50Var.a((c9n) obj2);
                }
                return rih1Var;
            case 6:
                tka0 tka0Var = dtw.C;
                Context context = (Context) obj4;
                FrameLayout frameLayout = (FrameLayout) ((b14) obj3).c;
                ylp ylpVar = (ylp) ((kly0) obj2).get();
                iu30 iu30Var = (iu30) obj;
                switch (ylpVar.a) {
                    case 0:
                        urk0 urk0Var = new urk0((byte) 4);
                        kop kopVar = (kop) ylpVar.b.c;
                        yqg yqgVar = (yqg) kopVar.d.get();
                        gw70 gw70VarB = kopVar.a.b();
                        c8o.l(gw70VarB);
                        qj0Var = new qj0(gw70VarB, yqgVar, urk0Var, iu30Var);
                        break;
                    default:
                        urk0 urk0Var2 = new urk0((byte) 4);
                        apq apqVar = (apq) ylpVar.b.c;
                        yqg yqgVar2 = (yqg) apqVar.d.get();
                        gw70 gw70VarB2 = apqVar.a.b();
                        c8o.l(gw70VarB2);
                        qj0Var = new qj0(gw70VarB2, yqgVar2, urk0Var2, iu30Var);
                        break;
                }
                dtw dtwVarD = mhc.d(context, frameLayout, f6o1.A(qj0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
                frameLayout.addView(dtwVarD.w);
                return dtwVarD;
            case 7:
                wrk0 wrk0Var = (wrk0) obj3;
                wrk0Var.getClass();
                x6h1 x6h1VarC = wrk0Var.a.c();
                x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((i8h1) obj4).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                tbr0 tbr0Var = (tbr0) obj;
                if (((AtomicBoolean) obj2).compareAndSet(false, true)) {
                    tbr0Var.a(l231Var);
                }
                return rih1Var;
            case 8:
                zrk0 zrk0Var = (zrk0) obj3;
                zrk0Var.getClass();
                x6h1 x6h1VarC2 = zrk0Var.a.c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                ((i8h1) obj4).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                wmo1.b((ven0) obj2, (tbr0) obj, l231Var);
                return rih1Var;
            case 9:
                bsk0 bsk0Var = (bsk0) obj3;
                bsk0Var.getClass();
                x6h1 x6h1VarC3 = bsk0Var.a.c();
                x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                ((i8h1) obj4).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                tbr0 tbr0Var2 = (tbr0) obj;
                if (((AtomicBoolean) obj2).compareAndSet(false, true)) {
                    tbr0Var2.a(l231Var);
                }
                return rih1Var;
            case 10:
                rm9 rm9Var = (rm9) obj2;
                wqk0 wqk0Var = (wqk0) obj3;
                if (wqk0Var != null) {
                    String str6 = (String) obj4;
                    i8h1 i8h1Var2 = (i8h1) rm9Var.j.get();
                    x6h1 x6h1VarC4 = wqk0Var.c.c();
                    x6h1VarC4.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    str2 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str6 != null ? str6 : "")), x6h1VarC4.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null).a.a;
                } else {
                    str2 = null;
                }
                sh61 sh61Var = (sh61) obj;
                if (((i84) rm9Var.p.get()).a()) {
                    fn31.T(rm9Var.r, (o8n) null, 0, new us0(rm9Var, sh61Var, str2, (lnm) null, (byte) 5), 3);
                }
                return rih1Var;
            case 11:
                tif1 tif1Var = (tif1) obj4;
                kly0 kly0Var = (kly0) obj;
                try {
                    tif1Var.e(2, "Background_dependencies", "qss");
                    px9 px9Var = (px9) kly0Var.get();
                    tif1Var.f("Background_dependencies", "qss");
                    px9Var.getClass();
                    jma jmaVar = new jma((byte) 4);
                    l3n1 l3n1Var = (l3n1) obj2;
                    uv40 uv40Var = new uv40(Collections.singleton(new h7y()));
                    return new bx9(new zm41((dn41) obj3, new oo6(jmaVar, px9Var, uv40Var, l3n1Var), xj.h, new hj8(jmaVar, px9Var, uv40Var, l3n1Var), new ft0(jmaVar, px9Var, uv40Var, l3n1Var), new ry9(jmaVar, px9Var, uv40Var, l3n1Var), 64));
                } catch (Throwable th) {
                    tif1Var.f("Background_dependencies", "qss");
                    throw th;
                }
            case 12:
                it8 it8Var = (it8) obj4;
                i8h1 i8h1Var3 = (i8h1) it8Var.b;
                x6h1 x6h1VarC5 = ((otk0) it8Var.c).b.c();
                x6h1VarC5.i.add(new a7h1("apply_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                b6t b6tVar = (k6a1) obj3;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((vu30) obj2).invoke(ihc1.e1(((y7e1) obj).d().d.toString()).toString(), ezx0.a);
                return rih1Var;
            case 13:
                ic9 ic9Var = (ic9) obj4;
                String str7 = ((ea61) obj3).a;
                int i3 = m3b.i((yb20) obj2, str7);
                i8h1 i8h1Var4 = (i8h1) ic9Var.b;
                otk0 otk0Var = (otk0) ic9Var.c;
                Integer numValueOf = Integer.valueOf(i3);
                x6h1 x6h1VarC6 = otk0Var.b.c();
                x6h1VarC6.i.add(new a7h1("session_chip", str7, numValueOf, (String) null, (String) null));
                x6h1VarC6.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((Function0) obj).invoke();
                return rih1Var;
            case 14:
                ic9 ic9Var2 = (ic9) obj4;
                String str8 = ((ea61) obj3).a;
                int i4 = m3b.i((yb20) obj2, str8);
                i8h1 i8h1Var5 = (i8h1) ic9Var2.b;
                otk0 otk0Var2 = (otk0) ic9Var2.c;
                Integer numValueOf2 = Integer.valueOf(i4);
                x6h1 x6h1VarC7 = otk0Var2.b.c();
                x6h1VarC7.i.add(new a7h1("session_chip", str8, numValueOf2, (String) null, (String) null));
                x6h1VarC7.j = false;
                i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj).invoke(str8);
                return rih1Var;
            case 15:
                ttb ttbVar = (ttb) obj4;
                mub mubVar = ttbVar.c;
                hp80 hp80Var = (hp80) obj3;
                String str9 = (String) ((ven0) obj2).getValue();
                ven0 ven0Var = (ven0) obj;
                l2u0 l2u0Var = (l2u0) ven0Var.getValue();
                Integer numValueOf3 = l2u0Var != null ? Integer.valueOf((int) l2u0Var.b) : null;
                l2u0 l2u0Var2 = (l2u0) ven0Var.getValue();
                Integer numValueOf4 = l2u0Var2 != null ? Integer.valueOf((int) l2u0Var2.c) : null;
                i8h1 i8h1Var6 = mubVar.c;
                opl0 opl0VarA = mubVar.a(str9, hp80Var);
                x6h1 x6h1VarC8 = opl0VarA.c.c();
                x6h1VarC8.i.add(new a7h1("nudge_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = true;
                y6h1 y6h1VarA3 = x6h1VarC8.a();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                mmr0 mmr0Var = new mmr0("item_to_be_skipped", str9);
                String strValueOf = numValueOf3 != null ? String.valueOf(numValueOf3.intValue()) : null;
                if (strValueOf == null) {
                    strValueOf = "";
                }
                mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
                String strValueOf2 = numValueOf4 != null ? String.valueOf(numValueOf4.intValue()) : null;
                i8h1Var6.m(new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA3, opl0VarA.b, System.currentTimeMillis()), (xj61) null);
                ttbVar.b.a(kgm1.a);
                return rih1Var;
            case 16:
                fn31.T((c9n) obj3, (o8n) null, 0, new sxa((cab) obj2, (Context) obj, (String) obj4, (lnm) null, (byte) 8), 3);
                return rih1Var;
            case 17:
                UUID uuid = (UUID) obj2;
                uuid.getClass();
                ((hbc) obj4).b.invoke((BluetoothDevice) obj3, uuid, (byte[]) obj);
                return rih1Var;
            case 18:
                ((iu30) obj4).invoke(new m8e(new pu6((String) ((qj0) obj3).d, (ArrayList) obj, ((jx11) obj2).a())));
                return rih1Var;
            case 19:
                iu30 iu30Var2 = (iu30) obj3;
                enf enfVar = (enf) obj4;
                if (!enfVar.b) {
                    ((ven0) obj2).setValue(Boolean.TRUE);
                    iu30Var2.invoke(bnf.a);
                } else if (enfVar.a) {
                    iu30Var2.invoke(cnf.a);
                } else {
                    ((ven0) obj).setValue(Boolean.TRUE);
                    iu30Var2.invoke(zmf.a);
                }
                return rih1Var;
            case 20:
                if (!((Boolean) ((tob1) obj3).getValue()).booleanValue() || ((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    ((Function0) obj4).invoke();
                } else {
                    ((ven0) obj).setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 21:
                ((Function0) obj4).invoke();
                err0 err0Var = (hdn0) obj;
                if (err0Var.s() < ((c380) obj3).size() - 1) {
                    ydh.m(err0Var, 1);
                } else {
                    ((Function0) obj2).invoke();
                }
                return rih1Var;
            case 22:
                ((fad0) obj4).j(st80.g);
                ((iu30) obj3).invoke(new tle0((jj40) obj2));
                ((ven0) obj).setValue((Object) null);
                return rih1Var;
            case 23:
                String str10 = (String) obj4;
                if (str10 != null) {
                    ((ven0) obj).setValue(new rs30((wr21) obj3, str10, (pxk0) obj2));
                }
                return rih1Var;
            case 24:
                ((bhk) obj3).j.setValue(new w9r((String) obj4, (String) obj2, (String) obj));
                return rih1Var;
            case 25:
                String str11 = (String) obj4;
                if (str11.equals("not_interested_reasons")) {
                    ((iu30) obj3).invoke(mo0.a);
                } else if (str11.equals("report_ad_categories") || o7h.i0(ht71.a, str11)) {
                    ((Function0) obj2).invoke();
                }
                aab1.b(((bab1) obj).d);
                return rih1Var;
            case 26:
                wx10 wx10Var = ((t32) obj3).d;
                ((xu30) obj4).invoke(wx10Var.a, wx10Var, (mmr0) ((ven0) obj).getValue());
                aab1.e(((bab1) obj2).d, "report_confirmation");
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                nx9 nx9Var = (nx9) obj4;
                tif1 tif1Var2 = (tif1) obj3;
                kly0 kly0Var2 = (kly0) obj;
                try {
                    tif1Var2.e(2, "ConfiguredBackground_dependencies", "qss");
                    wuk wukVar = (wuk) kly0Var2.get();
                    tif1Var2.f("ConfiguredBackground_dependencies", "qss");
                    wukVar.getClass();
                    return new uuk(new zm41((dn41) obj2, new kjk(nx9Var, wukVar, (byte) 7), xj.Z0, new jjk(nx9Var, wukVar, (byte) 8), (Function0) null, (Function0) null, 112));
                } catch (Throwable th2) {
                    tif1Var2.f("ConfiguredBackground_dependencies", "qss");
                    throw th2;
                }
            default:
                if (((d0r) obj4) != ((d0r) obj3)) {
                    eg.m("ContentDSLHost received a different DataPool instance after initialization. Keep dataLoader stable for the lifetime of ContentDSLHost.");
                    return null;
                }
                if (((j2i) obj2) == ((vu30) obj)) {
                    return rih1Var;
                }
                eg.m("ContentDSLHost received a different content lambda instance after initialization. Keep content stable for the lifetime of ContentDSLHost.");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f80(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f80(Object obj, String str, String str2, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.b = str;
        this.d = str2;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f80(byte b, Object obj, Object obj2, Object obj3, String str) {
        super(0);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = str;
    }
}
