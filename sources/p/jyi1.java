package p;

import android.content.Context;
import android.os.StrictMode;
import androidx.compose.ui.geometry.Offset;
import com.google.android.gms.maps.GoogleMapOptions;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jyi1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyi1(iu30 iu30Var, qkn0 qkn0Var, iu30 iu30Var2) {
        super(1);
        this.a = (byte) 3;
        this.c = iu30Var;
        this.b = qkn0Var;
        this.d = iu30Var2;
    }

    public final Object invoke(Object obj) {
        float f;
        char c;
        String str;
        switch (this.a) {
            case 0:
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.X = Boolean.TRUE;
                y1g0 y1g0Var = new y1g0((Context) obj, googleMapOptions);
                dyi1 dyi1Var = (dyi1) this.b;
                iu30 iu30Var = (iu30) this.c;
                ven0 ven0Var = (ven0) this.d;
                kz50 kz50Var = (kz50) y1g0Var.b;
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
                try {
                    kz50Var.e();
                    if (((zrj1) kz50Var.a) == null) {
                        kz50.f(y1g0Var);
                        break;
                    }
                    StrictMode.setThreadPolicy(threadPolicy);
                    iyi1 iyi1Var = new iyi1(dyi1Var, iu30Var, ven0Var);
                    zod.n("getMapAsync() must be called on the main thread");
                    zrj1 zrj1Var = (zrj1) kz50Var.a;
                    if (zrj1Var != null) {
                        zrj1Var.g(iyi1Var);
                    } else {
                        ((ArrayList) kz50Var.h).add(iyi1Var);
                    }
                    return y1g0Var;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            case 1:
                gcj1 gcj1Var = (gcj1) this.d;
                e701 e701Var = (e701) this.c;
                cas casVar = (a7m0) obj;
                casVar.a = new c1j1(gcj1Var, e701Var);
                casVar.b = ((a4q) this.b).a((fv0) e701Var.h);
                casVar.h = new xaj1(e701Var, (byte) 0);
                return rih1.a;
            case 2:
                hcj1 hcj1Var = (hcj1) this.d;
                dbj1 dbj1Var = (dbj1) this.c;
                cas casVar2 = (a7m0) obj;
                casVar2.a = new muh1(hcj1Var, dbj1Var);
                casVar2.b = ((a4q) this.b).a(dbj1Var.g);
                return rih1.a;
            case 3:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) ((iu30) this.c).invoke((Context) obj);
                videoSurfaceView.setVideoSurfaceCallback((qkn0) this.b);
                ((iu30) this.d).invoke(videoSurfaceView);
                return videoSurfaceView;
            case 4:
                VideoSurfaceView videoSurfaceView2 = new VideoSurfaceView((Context) obj);
                a7j1 a7j1Var = (a7j1) this.b;
                b3k1 b3k1Var = (b3k1) this.c;
                czs czsVar = (czs) this.d;
                videoSurfaceView2.setSupportsSurfaceView(a7j1Var != null);
                if (!videoSurfaceView2.getSupportsSurfaceView()) {
                    videoSurfaceView2.setUseSurfaceView(false);
                }
                videoSurfaceView2.setBufferingThrobberEnabled(false);
                videoSurfaceView2.setScaleType(b3k1Var);
                if (a7j1Var != null) {
                    videoSurfaceView2.d(a7j1Var.b, a7j1Var.c);
                }
                czsVar.b = videoSurfaceView2;
                return videoSurfaceView2;
            case 5:
                adj1 adj1Var = (adj1) this.d;
                bzs bzsVar = (bzs) this.b;
                uoa uoaVar = (uoa) this.c;
                bzsVar.a = uoaVar;
                if (uoaVar.e() != null && !adj1Var.f() && adj1Var.isVisible()) {
                    uoaVar.l();
                }
                return new zxg1(uoaVar, bzsVar, (byte) 4);
            case 6:
                nuj1 nuj1Var = (nuj1) obj;
                hij1 hij1Var = (hij1) this.d;
                mr20 mr20VarU = rqt0.u(t5p1.i((epb1) this.b));
                msj1 msj1Var = (msj1) this.c;
                mr20 mr20VarU2 = rqt0.u(msj1Var.c);
                ytp0 ytp0Var = msj1Var.f;
                List list = nuj1Var.c;
                List list2 = !list.isEmpty() ? list : null;
                mr20 mr20VarU3 = rqt0.u(h5p1.s(((zr00) ytp0Var.c).a, yoi1.g(((yh2) ytp0Var.b).a()), list2 != null ? new lt20(new m441(new k1e0(ytp0Var, list2, (lnm) null, (byte) 23)), new q8t0(3, (lnm) null, (byte) 3), (byte) 0) : new huz(z6x.a, (byte) 10), new r20(list, (lnm) null, (byte) 29)));
                mr20 mr20Var = msj1Var.h;
                return rqt0.u(h5p1.q(mr20VarU, mr20VarU2, mr20VarU3, mr20Var != null ? rqt0.u(new vlj1(mr20Var, hij1Var, (byte) 3)) : new huz((Object) null, (byte) 10), msj1Var.g.getLifecycle().c(), new hsj1(nuj1Var, msj1Var, hij1Var, null)));
            case 7:
                fn31.T((c9n) this.b, (o8n) null, 0, new vqm((o95) this.c, ((Offset) obj).a, (o95) this.d, (lnm) null, (byte) 2), 3);
                return rih1.a;
            case 8:
                tdl0 tdl0Var = ((ph41) this.b).b;
                Integer numValueOf = Integer.valueOf(((vpu0) this.c).a);
                String str2 = (String) this.d;
                return new gol0(new qgl0(new qgl0(numValueOf, str2, tdl0Var), (short) 0), str2);
            case 9:
                abc0 abc0Var = (abc0) obj;
                fyc fycVar = (fyc) this.b;
                abc0Var.c = new mxj1((Object) fycVar, this.c, this.d, (lnm) null, (byte) 4);
                abc0Var.a = new vbc1(fycVar, (lnm) null, (byte) 22);
                return rih1.a;
            case 10:
                abc0 abc0Var2 = (abc0) obj;
                x9l1 x9l1Var = (x9l1) this.b;
                abc0Var2.c = new mxj1((Object) x9l1Var, this.c, this.d, (lnm) null, (byte) 6);
                abc0Var2.a = new vbc1(x9l1Var, (lnm) null, (byte) 23);
                return rih1.a;
            case 11:
                b7x b7xVar = b7x.a;
                int iIntValue = ((Number) obj).intValue();
                o0i o0iVar = (o0i) this.d;
                sd5 sd5Var = (sd5) this.b;
                l7d1 l7d1Var = (l7d1) sd5Var.b;
                bcl1 bcl1Var = (bcl1) sd5Var.c;
                lbl1 lbl1Var = (lbl1) this.c;
                String str3 = lbl1Var.a;
                String str4 = lbl1Var.c;
                c9 c9Var = lbl1Var.g;
                LinkedHashMap linkedHashMap = l7d1Var.a;
                Object obj2 = linkedHashMap.get(str3);
                if (obj2 == null) {
                    hrr0 hrr0VarQ = v8r.q((Object) null);
                    linkedHashMap.put(str3, hrr0VarQ);
                    obj2 = hrr0VarQ;
                }
                Integer num = (Integer) ((tob1) obj2).getValue();
                if (num != null && iIntValue == num.intValue()) {
                    ven0 ven0Var2 = (ven0) l7d1Var.a.get(str3);
                    if (ven0Var2 != null) {
                        ven0Var2.setValue((Object) null);
                    }
                    jbl1 jbl1Var = (jbl1) c9Var.get(iIntValue);
                    hp80 hp80Var = o0iVar.e;
                    String str5 = jbl1Var.c;
                    bcl1Var.getClass();
                    x6h1 x6h1VarC = bcl1Var.h(hp80Var.b()).a.c();
                    x6h1VarC.i.add(new a7h1("watch_feed_component", "survey_layout.option", (Integer) null, str4, str5));
                    x6h1VarC.j = true;
                    bcl1Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    Integer numValueOf2 = Integer.valueOf(iIntValue);
                    ven0 ven0Var3 = (ven0) l7d1Var.a.get(str3);
                    if (ven0Var3 != null) {
                        ven0Var3.setValue(numValueOf2);
                    }
                    jbl1 jbl1Var2 = (jbl1) c9Var.get(iIntValue);
                    hp80 hp80Var2 = o0iVar.e;
                    String str6 = jbl1Var2.c;
                    bcl1Var.getClass();
                    x6h1 x6h1VarC2 = bcl1Var.h(hp80Var2.b()).a.c();
                    x6h1VarC2.i.add(new a7h1("watch_feed_component", "survey_layout.option", (Integer) null, str4, str6));
                    x6h1VarC2.j = true;
                    bcl1Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    fn31.T(o0iVar.a, (o8n) null, 0, new fkj1(sd5Var, (lnm) null, (byte) 13), 3);
                }
                return rih1.a;
            case 12:
                abc0 abc0Var3 = (abc0) obj;
                vbl1 vbl1Var = (vbl1) this.b;
                o0i o0iVar2 = (o0i) this.c;
                abc0Var3.c = new mxj1((Object) vbl1Var, (Object) o0iVar2, this.d, (lnm) null, (byte) 7);
                abc0Var3.a = new t6j1(o0iVar2, vbl1Var, null, (byte) 22);
                return rih1.a;
            case 13:
                float fB = ((lel1) this.b).b(((Number) obj).floatValue());
                jti0 jti0Var = (jti0) this.c;
                drr0 drr0Var = (drr0) this.d;
                float fS = drr0Var.s();
                float f2 = jti0Var.c;
                float f3 = jti0Var.d;
                if (fS < f2) {
                    f = f2 - fS;
                } else {
                    f = fS > f3 ? fS - f3 : 0.0f;
                }
                if (f > 0.0f) {
                    fB /= ((f / 5000.0f) * 4.0f) + 1.0f;
                }
                drr0Var.t(drr0Var.s() - fB);
                jti0Var.e(jch0.U(drr0Var.s()), true);
                return rih1.a;
            case 14:
                return new ymg(((los) this.b).b(new xs3((ven0) this.d, (ven0) this.c, (byte) 21)), (byte) 3);
            case 15:
                ws61 ws61Var = (ws61) obj;
                int iIndexOf = ((List) this.b).indexOf(ws61Var);
                zxl1 zxl1Var = (zxl1) this.c;
                i8h1 i8h1Var = (i8h1) zxl1Var.b;
                zok0 zok0Var = (zok0) zxl1Var.c;
                int iOrdinal = ws61Var.ordinal();
                if (iOrdinal == 0) {
                    c = 3;
                } else if (iOrdinal == 1) {
                    c = 4;
                } else if (iOrdinal == 2) {
                    c = 5;
                } else if (iOrdinal == 3) {
                    c = 1;
                } else {
                    if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                    c = 2;
                }
                Integer numValueOf3 = Integer.valueOf(iIndexOf);
                zok0Var.getClass();
                x6h1 x6h1VarC3 = zok0Var.b.c();
                if (c == 1) {
                    str = "audio_coaching";
                } else if (c == 2) {
                    str = "beat_matching";
                } else if (c == 3) {
                    str = "duration";
                } else if (c == 4) {
                    str = "music";
                } else {
                    if (c != 5) {
                        throw null;
                    }
                    str = "workout_type";
                }
                x6h1VarC3.i.add(new a7h1("panel_chip", str, numValueOf3, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA = x6h1VarC3.a();
                b7x b7xVar2 = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_select", 1, b7xVar2), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((b2m1) this.d).a.accept(new u3m1(ws61Var));
                return rih1.a;
            case 16:
                f3n0 f3n0Var = (f3n0) obj;
                String str7 = f3n0Var.a;
                b7x b7xVar3 = b7x.a;
                zxl1 zxl1Var2 = (zxl1) this.c;
                zok0 zok0Var2 = (zok0) zxl1Var2.c;
                i8h1 i8h1Var2 = (i8h1) zxl1Var2.b;
                m4m1 m4m1Var = (m4m1) this.b;
                if (m4m1Var != null) {
                    Set set = m4m1Var.l;
                    Iterator it = m4m1Var.k.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                        } else if (!((xi40) it.next()).a.equals(str7)) {
                            i++;
                        }
                    }
                    boolean zContains = set.contains(f3n0Var);
                    if (zContains && set.size() > 1) {
                        Integer numValueOf4 = Integer.valueOf(i);
                        zok0Var2.getClass();
                        x6h1 x6h1VarC4 = zok0Var2.b.c();
                        x6h1VarC4.i.add(new a7h1("genre_chip", str7, numValueOf4, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_deselect", 1, b7xVar3), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    } else if (!zContains) {
                        Integer numValueOf5 = Integer.valueOf(i);
                        zok0Var2.getClass();
                        x6h1 x6h1VarC5 = zok0Var2.b.c();
                        x6h1VarC5.i.add(new a7h1("genre_chip", str7, numValueOf5, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_select", 1, b7xVar3), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                    ((b2m1) this.d).a.accept(new r3m1(str7));
                }
                return rih1.a;
            case 17:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                mbm1 mbm1Var = (mbm1) this.b;
                Object obj3 = this.d;
                synchronized (mbm1Var) {
                    LinkedHashSet linkedHashSet = mbm1Var.c;
                    if (zBooleanValue) {
                        linkedHashSet.add(obj3);
                    } else {
                        linkedHashSet.remove(obj3);
                    }
                }
                ((iu30) this.c).invoke(new v6m1(zBooleanValue));
                return rih1.a;
            case 18:
                v671 v671Var = new v671((ven0) this.d, (ven0) this.c);
                iac0 iac0Var = (iac0) this.b;
                iac0Var.getLifecycle().a(v671Var);
                return new zxg1(iac0Var, v671Var, (byte) 14);
            case 19:
                kd31 kd31Var = (kd31) obj;
                kd31Var.b(((Boolean) ((ven0) this.d).getValue()).booleanValue() ? 1.0f : 0.0f);
                float fFloatValue = ((Number) ((tob1) this.c).getValue()).floatValue() * ((Number) ((o95) this.b).e()).floatValue();
                kd31Var.q(fFloatValue);
                kd31Var.r(fFloatValue);
                return rih1.a;
            default:
                xhm1 xhm1Var = (xhm1) this.b;
                return new zxg1(xhm1Var != null ? (t480) ((iu30) ((ven0) this.d).getValue()).invoke(xhm1Var) : null, (iu30) ((ven0) this.c).getValue(), (byte) 17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyi1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyi1(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
