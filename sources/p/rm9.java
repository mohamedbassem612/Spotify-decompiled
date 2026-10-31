package p;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import com.spotify.messages.ByomSessionStartFailed;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rm9 {
    public xab1 A;
    public xab1 B;
    public ja61 C;
    public op9 D;
    public final np9 a;
    public final ro9 b;
    public final ser c;
    public final t8u0 d;
    public final x8c0 e;
    public final mr20 f;
    public final q8n g;
    public final yu3 h;
    public final kt91 i;
    public final kly0 j;
    public final yqg k;
    public final ys9 l;
    public final kr9 m;
    public final mr20 n;
    public final ajq0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kly0 f60p;
    public final ik9 q;
    public final llm r;
    public final bpb1 s;
    public final xe01 t;
    public final xe01 u;
    public xab1 v;
    public xab1 w;
    public xab1 x;
    public xab1 y;
    public xab1 z;

    public rm9(np9 np9Var, ro9 ro9Var, ser serVar, t8u0 t8u0Var, x8c0 x8c0Var, mr20 mr20Var, q8n q8nVar, yu3 yu3Var, kt91 kt91Var, caq caqVar, yqg yqgVar, q8n q8nVar2, ys9 ys9Var, kr9 kr9Var, mr20 mr20Var2, ajq0 ajq0Var, caq caqVar2, ik9 ik9Var) {
        this.a = np9Var;
        this.b = ro9Var;
        this.c = serVar;
        this.d = t8u0Var;
        this.e = x8c0Var;
        this.f = mr20Var;
        this.g = q8nVar;
        this.h = yu3Var;
        this.i = kt91Var;
        this.j = caqVar;
        this.k = yqgVar;
        this.l = ys9Var;
        this.m = kr9Var;
        this.n = mr20Var2;
        this.o = ajq0Var;
        this.f60p = caqVar2;
        this.q = ik9Var;
        this.r = us71.h(q8nVar2);
        bpb1 bpb1VarB = gio1.b(lr9.a);
        this.s = bpb1VarB;
        this.t = d5p1.h(bpb1VarB);
        this.u = np9Var.i;
    }

    public static void e(rm9 rm9Var, c9n c9nVar, String str, String str2, String str3, int i) {
        fn31.T(c9nVar, rm9Var.g, 0, new im9(rm9Var, str, (i & 4) != 0 ? null : str3, (i & 2) != 0 ? null : str2, null), 2);
    }

    public static r6h1 g(String str) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-byom-pip-video";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("any");
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        hm9 hm9Var;
        xab1 xab1Var;
        if (onmVar instanceof hm9) {
            hm9Var = (hm9) onmVar;
            int i = hm9Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hm9Var.d = i - Integer.MIN_VALUE;
            } else {
                hm9Var = new hm9(this, onmVar);
            }
        } else {
            hm9Var = new hm9(this, onmVar);
        }
        Object obj = hm9Var.b;
        int i2 = hm9Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            xab1Var = this.v;
            if (xab1Var == null) {
                return Boolean.FALSE;
            }
            hm9Var.a = xab1Var;
            hm9Var.d = 1;
            Object objJ = xab1Var.j(hm9Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xab1Var = hm9Var.a;
            hm5.M(obj);
        }
        return Boolean.valueOf(!xab1Var.isCancelled());
    }

    public final void b() {
        bpb1 bpb1Var = this.s;
        if (bpb1Var.getValue() != lr9.c) {
            return;
        }
        this.b.e(new n5(1, this, rm9.class, "expandToSheet", "expandToSheet(Lcom/spotify/ubi/model/InteractionId;)V", 0, (byte) 24));
        bpb1Var.m((Object) null, lr9.b);
    }

    public final void c(int i) {
        sh61 sh61Var;
        ja61 ja61Var;
        sh61 sh61Var2;
        np9 np9Var = this.a;
        String str = np9Var.h;
        op9 op9Var = this.D;
        if (op9Var != null) {
            if (((i84) this.f60p.get()).a() && (ja61Var = this.C) != null) {
                Object value = np9Var.i.a.getValue();
                jp9 jp9Var = value instanceof jp9 ? (jp9) value : null;
                long jA = jp9Var != null ? jp9Var.a(this.k.b()) : 0L;
                ys9 ys9Var = this.l;
                sh61Var2 = new sh61(ja61Var, op9Var, jA, ((Number) ys9Var.g.a.getValue()).floatValue(), ((Number) ys9Var.i.a.getValue()).floatValue(), ((Boolean) ys9Var.k.a.getValue()).booleanValue());
            } else {
                sh61Var2 = null;
            }
            sh61Var = sh61Var2;
        } else {
            sh61Var = null;
        }
        wqk0 wqk0Var = str != null ? new wqk0(str, g(str), (byte) 5) : null;
        i(2131953075, sh61Var != null ? new f80((byte) 10, wqk0Var, this, sh61Var, str) : null, new vv8((Object) wqk0Var, (byte) 2));
        m(i);
    }

    public final void d(ou80 ou80Var) {
        bpb1 bpb1Var = this.s;
        if (bpb1Var.getValue() != lr9.b) {
            return;
        }
        this.b.d();
        this.c.a(ou80Var != null ? ou80Var.a : null, "spotify:internal:byom-npv", (Bundle) null);
        bpb1Var.m((Object) null, lr9.c);
    }

    public final void f(String str, String str2, String str3) {
        t2j0 t2j0Var = (t2j0) this.o.a;
        yfc yfcVarN = ByomSessionStartFailed.n();
        yfcVarN.q(str);
        yfcVarN.n(str2);
        yfcVarN.r("video_unavailable");
        if (str3 != null) {
            yfcVarN.s(str3);
        }
        t2j0Var.a(yfcVarN.build());
    }

    public final void h() {
        ik9 ik9Var = this.q;
        ik9Var.b.d(ik9Var);
        xab1 xab1Var = this.v;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.v = null;
        xab1 xab1Var2 = this.w;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.w = null;
        xab1 xab1Var3 = this.x;
        if (xab1Var3 != null) {
            xab1Var3.d((CancellationException) null);
        }
        this.x = null;
        xab1 xab1Var4 = this.y;
        if (xab1Var4 != null) {
            xab1Var4.d((CancellationException) null);
        }
        this.y = null;
        xab1 xab1Var5 = this.z;
        if (xab1Var5 != null) {
            xab1Var5.d((CancellationException) null);
        }
        this.z = null;
        xab1 xab1Var6 = this.A;
        if (xab1Var6 != null) {
            xab1Var6.d((CancellationException) null);
        }
        this.A = null;
        xab1 xab1Var7 = this.B;
        if (xab1Var7 != null) {
            xab1Var7.d((CancellationException) null);
        }
        this.B = null;
        this.C = null;
        this.D = null;
        this.s.m((Object) null, lr9.a);
    }

    public final void i(int i, f80 f80Var, Function0 function0) {
        Integer num;
        View.OnClickListener et1Var;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        Integer numValueOf = Integer.valueOf(i);
        if (f80Var != null) {
            n57.k(i != 0, "Invalid resource ID provided: %s", new Object[]{numValueOf});
            num = 2131953079;
            et1Var = new et1(f80Var, (byte) 1);
        } else {
            num = null;
            et1Var = null;
        }
        er91 er91Var = new er91((fs91) null, "", numValueOf, (String) null, num, et1Var, (cvr) null, new lw6(function0, this, (byte) 1), false);
        kt91 kt91Var = this.i;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(lnm lnmVar) {
        nm9 nm9Var;
        if (lnmVar instanceof nm9) {
            nm9Var = (nm9) lnmVar;
            int i = nm9Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nm9Var.c = i - Integer.MIN_VALUE;
            } else {
                nm9Var = new nm9(this, lnmVar);
            }
        } else {
            nm9Var = new nm9(this, lnmVar);
        }
        Object objY = nm9Var.a;
        int i2 = nm9Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                q8n q8nVar = this.g;
                om9 om9Var = new om9(this, null);
                nm9Var.c = 1;
                objY = fn31.Y(q8nVar, om9Var, nm9Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objY);
            }
            objY.getClass();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1.a;
    }

    public final void k(String str, String str2, String str3, String str4, String str5, String str6) {
        ajq0 ajq0Var = this.o;
        ajq0Var.t(7);
        h();
        ajq0Var.c = new br9(str, str4, str6);
        this.C = new ja61(str, str2, str3, str4);
        km9 km9Var = new km9(this, null, (byte) 4);
        llm llmVar = this.r;
        this.B = fn31.T(llmVar, (o8n) null, 0, km9Var, 3);
        xab1 xab1VarT = fn31.T(llmVar, (o8n) null, 2, new sh6(this, str, str5, str2, str3, str6, (lnm) null, (byte) 2), 1);
        this.v = xab1VarT;
        xab1VarT.start();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l(String str, String str2, long j, boolean z, onm onmVar) {
        qm9 qm9Var;
        long j2;
        tn10 sn10Var;
        boolean z2;
        fdc fdcVar;
        if (onmVar instanceof qm9) {
            qm9Var = (qm9) onmVar;
            int i = qm9Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qm9Var.e = i - Integer.MIN_VALUE;
            } else {
                qm9Var = new qm9(this, onmVar);
            }
        } else {
            qm9Var = new qm9(this, onmVar);
        }
        Object obj = qm9Var.c;
        int i2 = qm9Var.e;
        np9 np9Var = this.a;
        byte b = 1;
        if (i2 == 0) {
            hm5.M(obj);
            j2 = j;
            qm9Var.a = j2;
            qm9Var.b = z;
            qm9Var.e = 1;
            llm llmVar = np9Var.e;
            np9Var.b();
            np9Var.h = str;
            osm0 osm0Var = np9Var.a;
            esm0 esm0Var = new esm0("byom", vc7.Z0);
            w2k1 w2k1Var = np9Var.b;
            ic9 ic9Var = np9Var.c;
            List list = (List) ic9Var.b;
            yqg yqgVar = osm0Var.a;
            int i3 = psm0.a[l1d.C(2)];
            if (i3 == -1) {
                sn10Var = new sn10(false);
            } else if (i3 != 1) {
                if (i3 != 2) {
                    eg.o();
                    return null;
                }
                sn10Var = new sn10(false);
            } else {
                sn10Var = new tn10(false);
            }
            w590 w590VarA = osm0Var.a(esm0Var, w2k1Var, 3, sn10Var, list);
            fdc fdcVar2 = new fdc(yqgVar, w590VarA);
            lsm0 lsm0Var = new lsm0(str2, new ksm0(new gec1("4771d8ce8b5a4e289b5e9bf6a74512a7"), str, (String) null, "byom", (String) null, (String) null, 500), false, true, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2036);
            if (!fdcVar2.b) {
                w590VarA.k(lsm0Var);
            }
            lnm lnmVar = null;
            l4p1.u(llmVar, new fu20((bpb1) fdcVar2.f, new ry5(np9Var, lnmVar, (byte) 20), (byte) 1));
            l4p1.u(llmVar, new fu20((lt20) ic9Var.c, new ry5(fdcVar2, lnmVar, (byte) 21), (byte) 1));
            fdc.d0(fdcVar2, rky0.a);
            np9Var.d = fdcVar2;
            d9n d9nVar = rih1.a;
            d9n d9nVar2 = d9n.a;
            if (d9nVar == d9nVar2) {
                return d9nVar2;
            }
            z2 = z;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = qm9Var.b;
            j2 = qm9Var.a;
            hm5.M(obj);
            z2 = z3;
        }
        if (np9Var.h == null) {
            return Boolean.FALSE;
        }
        if (j2 > 0 && (fdcVar = np9Var.d) != null && !fdcVar.b) {
            ((w590) fdcVar.d).s(j2);
        }
        this.b.e(new n5(1, this, rm9.class, "expandToSheet", "expandToSheet(Lcom/spotify/ubi/model/InteractionId;)V", 0, (byte) 25));
        this.s.m((Object) null, lr9.b);
        ys9 ys9Var = this.l;
        ufc ufcVar = ys9Var.e;
        c21 c21Var = ys9Var.b;
        c21Var.y();
        zs9 zs9Var = ys9Var.c;
        Context context = zs9Var.a;
        context.getContentResolver().unregisterContentObserver(zs9Var);
        zs9Var.f = null;
        xab1 xab1Var = zs9Var.d;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        zs9Var.d = null;
        llm llmVar2 = ys9Var.l;
        if (llmVar2 != null) {
            smo1.p(llmVar2, (CancellationException) null);
        }
        ys9Var.j.m((Object) null, Boolean.valueOf(ufcVar.a()));
        llm llmVarE = smo1.e(flo1.l(guo1.B(), ys9Var.f));
        ys9Var.l = llmVarE;
        q01 q01Var = new q01(0, ys9Var, ys9.class, "showSheet", "showSheet$src_main_java_com_spotify_byom_volumeimpl_volumeimpl()V", 0, (byte) 20);
        zs9Var.f = q01Var;
        zs9Var.e = zs9Var.c.getStreamVolume(3);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, zs9Var);
        lnm lnmVar2 = null;
        zs9Var.d = fn31.T(llmVarE, (o8n) null, 0, new k96(zs9Var, q01Var, (lnm) null, (byte) 27), 3);
        np9 np9Var2 = ys9Var.a;
        String str3 = np9Var2.h;
        if (str3 != null) {
            qev qevVar = new qev(np9Var2.i, ys9Var.i, ys9Var.k, ufcVar.a());
            c21Var.y();
            c21Var.i = llmVarE;
            c21Var.t = qevVar;
            c21Var.g = fn31.T(llmVarE, (o8n) null, 0, new wc5(c21Var, str3, qevVar, (lnm) null, (byte) 23), 3);
        }
        xab1 xab1Var2 = this.x;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        oy3 oy3Var = new oy3(this, z2, (lnm) null, (byte) 1);
        llm llmVar3 = this.r;
        this.x = fn31.T(llmVar3, (o8n) null, 0, oy3Var, 3);
        xab1 xab1Var3 = this.y;
        if (xab1Var3 != null) {
            xab1Var3.d((CancellationException) null);
        }
        this.y = fn31.T(llmVar3, (o8n) null, 0, new km9(this, lnmVar2, b), 3);
        ik9 ik9Var = this.q;
        x8c0 x8c0Var = ik9Var.b;
        x8c0Var.a(ik9Var);
        if (!x8c0Var.b().a(w8c0.d)) {
            ik9Var.a.a();
        }
        xab1 xab1Var4 = this.A;
        if (xab1Var4 != null) {
            xab1Var4.d((CancellationException) null);
        }
        byte b2 = 0;
        this.A = fn31.T(llmVar3, (o8n) null, 0, new km9(this, lnmVar2, (byte) 2), 3);
        xab1 xab1Var5 = this.z;
        if (xab1Var5 != null) {
            xab1Var5.d((CancellationException) null);
        }
        this.z = fn31.T(llmVar3, (o8n) null, 0, new km9(this, lnmVar2, b2), 3);
        return Boolean.TRUE;
    }

    public final void m(int i) {
        this.o.t(i);
        xab1 xab1Var = this.v;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        kr9 kr9Var = this.m;
        s2t s2tVar = kr9Var.d;
        if (s2tVar != null) {
            kr9Var.d = null;
            s2tVar.d((CancellationException) null);
            kr9Var.e = fn31.q(kr9Var.c, (o8n) null, 0, new dr9(kr9Var, null, (byte) 1), 3);
        }
        bpb1 bpb1Var = this.s;
        if (bpb1Var.getValue() != lr9.a) {
            if (bpb1Var.getValue() == lr9.b) {
                this.b.d();
            }
            ys9 ys9Var = this.l;
            c21 c21Var = ys9Var.b;
            c21Var.h();
            b8p1 b8p1Var = (b8p1) c21Var.c;
            ((wt7) b8p1Var.c).c(vt7.b, 0);
            b8p1Var.b = 1;
            zs9 zs9Var = ys9Var.c;
            zs9Var.a.getContentResolver().unregisterContentObserver(zs9Var);
            zs9Var.f = null;
            xab1 xab1Var2 = zs9Var.d;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            zs9Var.d = null;
            llm llmVar = ys9Var.l;
            if (llmVar != null) {
                smo1.p(llmVar, (CancellationException) null);
            }
            ys9Var.l = null;
            ot9 ot9Var = ys9Var.d;
            ot9Var.c = 1;
            ot9Var.d = null;
            ys9Var.h.m((Object) null, Float.valueOf(1.0f));
            ys9Var.j.m((Object) null, Boolean.FALSE);
            this.a.b();
        }
        h();
    }
}
