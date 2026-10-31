package p;

import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fq2 implements yo2, m680 {
    public static final Set c0 = dm61.z0(new String[]{"track", "episode", "chapter"});
    public final xe01 A;
    public final bpb1 B;
    public final xe01 C;
    public volatile String D;
    public final bbc E;
    public final bbc F;
    public final bpb1 G;
    public final xe01 H;
    public volatile s2t I;
    public volatile faa0 J;
    public volatile boolean K;
    public volatile String L;
    public volatile String M;
    public volatile Long N;
    public volatile String O;
    public volatile rq2 P;
    public volatile String Q;
    public final Object R;
    public final idd1 S;
    public final idd1 T;
    public final idd1 U;
    public ep2 V;
    public int W;
    public boolean X;
    public final xgn0 Y;
    public final xe01 Z;
    public final gx2 a;
    public final idd1 a0;
    public final jr2 b;
    public final idd1 b0;
    public final qt2 c;
    public final a2n d;
    public final Flowable e;
    public final t8u0 f;
    public final c3s g;
    public final lpm1 h;
    public final ar51 i;
    public final djh j;
    public final qfb0 k;
    public final mr4 l;
    public final lo2 m;
    public final oj80 n;
    public final zo2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mv2 f38p;
    public final c9n q;
    public final bpb1 r;
    public final xe01 s;
    public final bpb1 t;
    public final xe01 u;
    public final bpb1 v;
    public final xe01 w;
    public final bpb1 x;
    public final xe01 y;
    public final bpb1 z;

    public fq2(gx2 gx2Var, jr2 jr2Var, qt2 qt2Var, a2n a2nVar, dlf dlfVar, gy2 gy2Var, Flowable flowable, t8u0 t8u0Var, c3s c3sVar, e1y e1yVar, lpm1 lpm1Var, ar51 ar51Var, djh djhVar, qfb0 qfb0Var, mr4 mr4Var, lo2 lo2Var, oj80 oj80Var, zo2 zo2Var, mv2 mv2Var, c9n c9nVar) {
        this.a = gx2Var;
        this.b = jr2Var;
        this.c = qt2Var;
        this.d = a2nVar;
        this.e = flowable;
        this.f = t8u0Var;
        this.g = c3sVar;
        this.h = lpm1Var;
        this.i = ar51Var;
        this.j = djhVar;
        this.k = qfb0Var;
        this.l = mr4Var;
        this.m = lo2Var;
        this.n = oj80Var;
        this.o = zo2Var;
        this.f38p = mv2Var;
        this.q = c9nVar;
        byte b = 6;
        lnm lnmVar = null;
        if (dlfVar.d.compareAndSet(false, true)) {
            c921.y(c9nVar, (o8n) null, 0, new mx(dlfVar, lnmVar, b), 3);
        }
        gy2Var.f(c9nVar);
        fre freVar = fre.a;
        bpb1 bpb1VarB = gio1.b(freVar);
        this.r = bpb1VarB;
        evz evzVarS = h5p1.s(bpb1VarB, lo2Var.e, mv2Var.n(), new vd2((byte) 1));
        sua suaVar = ey71.a;
        this.s = d5p1.t(evzVarS, c9nVar, suaVar, freVar);
        bpb1 bpb1VarB2 = gio1.b("");
        this.t = bpb1VarB2;
        this.u = d5p1.h(bpb1VarB2);
        Boolean bool = Boolean.FALSE;
        bpb1 bpb1VarB3 = gio1.b(bool);
        this.v = bpb1VarB3;
        this.w = d5p1.h(bpb1VarB3);
        bpb1 bpb1VarB4 = gio1.b(bool);
        this.x = bpb1VarB4;
        this.y = d5p1.h(bpb1VarB4);
        bpb1 bpb1VarB5 = gio1.b(bool);
        this.z = bpb1VarB5;
        this.A = d5p1.h(bpb1VarB5);
        bpb1 bpb1VarB6 = gio1.b((Object) null);
        this.B = bpb1VarB6;
        this.C = d5p1.h(bpb1VarB6);
        d5p1.t(new mt(bpb1VarB6, (byte) 1), c9nVar, suaVar, (Object) null);
        this.D = "";
        bbc bbcVarA = mno1.a(-2, 0, 6);
        this.E = bbcVarA;
        this.F = bbcVarA;
        bpb1 bpb1VarB7 = gio1.b(0L);
        this.G = bpb1VarB7;
        this.H = d5p1.h(bpb1VarB7);
        this.P = rq2.c;
        this.R = new Object();
        this.S = new idd1(new q30(this, (byte) 2));
        this.T = new idd1(new qp2(this, (byte) 1));
        this.U = new idd1(new wam1(this, (byte) 24));
        this.Y = ygn0.a();
        vbm[] vbmVarArr = q601.a;
        this.Z = d5p1.t(rqt0.u(new xy0(new kge(flowable), (byte) 3)), c9nVar, new alb1(5000L, Long.MAX_VALUE), new lpu());
        this.a0 = new idd1(new qp2(this, (byte) 2));
        this.b0 = new idd1(new qp2(this, (byte) 0));
    }

    public static boolean C(tn2 tn2Var) {
        if (tn2Var == null || (tn2Var instanceof rn2)) {
            return false;
        }
        sn2 sn2Var = tn2Var instanceof sn2 ? (sn2) tn2Var : null;
        return !u890.j(sn2Var != null ? sn2Var.b() : null, "");
    }

    public static boolean D(String str) {
        return str != null && j1p1.t(str);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    public static String K(tn2 tn2Var) {
        if (tn2Var instanceof qn2) {
            String strA = ((qn2) tn2Var).a();
            if (!j1p1.t(strA)) {
                return strA;
            }
        } else if (tn2Var instanceof sn2) {
            sn2 sn2Var = (sn2) tn2Var;
            String strA2 = sn2Var.a();
            if (strA2 == null) {
                strA2 = sn2Var.b();
            } else {
                if (ihc1.y0(strA2)) {
                    strA2 = null;
                }
                if (strA2 == null) {
                    strA2 = sn2Var.b();
                }
            }
            if (strA2 == null) {
                String strC = sn2Var.c();
                boolean zContains = false;
                if (nhc1.Y(strC, "spotify:", false)) {
                    zContains = c0.contains(ihc1.Z0(ihc1.H0(strC, "spotify:"), ":"));
                }
                if (zContains) {
                    return "spotify:now-playing";
                }
            } else if (strA2.length() != 0 && !j1p1.t(strA2)) {
                return strA2;
            }
        }
        return null;
    }

    public static tn2 k(String str, String str2) {
        if (str == null) {
            return new rn2(str2);
        }
        if (str.length() == 0) {
            return null;
        }
        return j1p1.t(str) ? new rn2(str2) : new qn2(str);
    }

    public static boolean m(String str) {
        return str.equals("spotify:home") || nhc1.Y(str, "spotify:home?", false) || nhc1.Y(str, "spotify:home:", false) || nhc1.Y(str, "spotify:internal:", false);
    }

    public final void A(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        bpb1 bpb1Var = this.x;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, boolValueOf);
    }

    public final void B(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        bpb1 bpb1Var = this.v;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, boolValueOf);
    }

    public final void E() {
        if (this.f38p.r()) {
            return;
        }
        this.Q = null;
        b();
        J();
        bpb1 bpb1Var = this.v;
        Boolean bool = Boolean.FALSE;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
        bpb1 bpb1Var2 = this.x;
        bpb1Var2.getClass();
        bpb1Var2.m((Object) null, bool);
        this.K = false;
        this.B.l((Object) null);
        bpb1 bpb1Var3 = this.t;
        bpb1Var3.getClass();
        bpb1Var3.m((Object) null, "");
        bpb1 bpb1Var4 = this.r;
        fre freVar = fre.a;
        bpb1Var4.getClass();
        bpb1Var4.m((Object) null, freVar);
        lo2 lo2Var = this.m;
        faa0 faa0Var = lo2Var.f;
        lo2Var.f = null;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        p811 p811Var = new p811();
        faa0 faa0VarY = c921.y(lo2Var.c, (o8n) null, 2, new hi2(lo2Var, p811Var, (lnm) null, (byte) 2), 1);
        p811Var.a = faa0VarY;
        lo2Var.f = faa0VarY;
        lo2Var.d.m((Object) null, ro2.a);
        Object obj = p811Var.a;
        if (obj != null) {
            ((faa0) obj).start();
        } else {
            u890.C("sessionJob");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F(String str, onm onmVar) {
        zp2 zp2Var;
        if (onmVar instanceof zp2) {
            zp2Var = (zp2) onmVar;
            int i = zp2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zp2Var.c = i - Integer.MIN_VALUE;
            } else {
                zp2Var = new zp2(this, onmVar);
            }
        } else {
            zp2Var = new zp2(this, onmVar);
        }
        Object obj = zp2Var.a;
        d9n d9nVar = d9n.a;
        int i2 = zp2Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            a2n a2nVar = this.d;
            String str2 = this.L;
            String str3 = this.M;
            if (str3 != null) {
                str = str3;
            }
            zp2Var.c = 1;
            if (a2nVar.P(str2, str, zp2Var) == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        this.L = null;
        this.M = null;
        this.N = null;
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r12.a(r0) == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G(p.onm r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fq2.G(p.onm):java.lang.Object");
    }

    public final boolean H() {
        mmr0 mmr0VarN;
        faa0 faa0VarB;
        synchronized (this.R) {
            try {
                ep2 ep2Var = this.V;
                this.V = null;
                if (ep2Var != null) {
                    bpb1 bpb1Var = this.z;
                    Boolean bool = Boolean.FALSE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                }
                boolean z = false;
                boolean z2 = ep2Var != null && ep2Var.c();
                if (z2 && this.W > 0) {
                    this.X = true;
                }
                if (z2 && this.W == 0) {
                    z = true;
                }
                mmr0VarN = oqn1.n(ep2Var, Boolean.valueOf(z));
            } catch (Throwable th) {
                throw th;
            }
        }
        ep2 ep2Var2 = (ep2) mmr0VarN.a;
        boolean zBooleanValue = ((Boolean) mmr0VarN.b).booleanValue();
        if (ep2Var2 != null && (faa0VarB = ep2Var2.b()) != null) {
            faa0VarB.d((CancellationException) null);
        }
        return zBooleanValue;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r12 == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r4.d((java.lang.String) r13, r0) == r8) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(java.lang.String r11, p.onm r12, boolean r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p.dq2
            if (r0 == 0) goto L13
            r0 = r12
            p.dq2 r0 = (p.dq2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.dq2 r0 = new p.dq2
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 0
            p.rih1 r3 = p.rih1.a
            p.jr2 r4 = r10.b
            r5 = 3
            r6 = 2
            r7 = 1
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L48
            if (r1 == r7) goto L40
            if (r1 == r6) goto L38
            if (r1 != r5) goto L32
            p.hm5.M(r12)
            return r3
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r2
        L38:
            boolean r11 = r0.b
            java.lang.String r13 = r0.a
            p.hm5.M(r12)     // Catch: java.lang.Exception -> L6f
            goto L6f
        L40:
            boolean r13 = r0.b
            java.lang.String r11 = r0.a
            p.hm5.M(r12)     // Catch: java.lang.Exception -> L5b
            goto L5b
        L48:
            p.hm5.M(r12)
            r0.a = r11     // Catch: java.lang.Exception -> L5b
            r0.b = r13     // Catch: java.lang.Exception -> L5b
            r0.e = r7     // Catch: java.lang.Exception -> L5b
            r12 = r4
            p.wr2 r12 = (p.wr2) r12     // Catch: java.lang.Exception -> L5b
            java.lang.Object r12 = r12.m(r11, r0)     // Catch: java.lang.Exception -> L5b
            if (r12 != r8) goto L5b
            goto L7d
        L5b:
            r9 = r13
            r13 = r11
            r11 = r9
            if (r11 == 0) goto L7e
            r0.a = r13     // Catch: java.lang.Exception -> L6f
            r0.b = r11     // Catch: java.lang.Exception -> L6f
            r0.e = r6     // Catch: java.lang.Exception -> L6f
            p.wr2 r4 = (p.wr2) r4     // Catch: java.lang.Exception -> L6f
            java.lang.Object r12 = r4.d(r13, r0)     // Catch: java.lang.Exception -> L6f
            if (r12 != r8) goto L6f
            goto L7d
        L6f:
            r0.a = r2
            r0.b = r11
            r0.e = r5
            p.a2n r10 = r10.d
            java.lang.Object r10 = r10.b(r13, r0)
            if (r10 != r8) goto L7e
        L7d:
            return r8
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fq2.I(java.lang.String, p.onm, boolean):java.lang.Object");
    }

    public final void J() {
        if (H()) {
            c921.y(this.q, (o8n) null, 0, new lp2(this, (lnm) null, (byte) 3), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (r10 == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(java.lang.String r9, p.onm r10) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fq2.L(java.lang.String, p.onm):java.lang.Object");
    }

    public final Object M(String str, rq2 rq2Var, boolean z, op2 op2Var) {
        d9n d9nVar = d9n.a;
        a2n a2nVar = this.d;
        if (z || rq2Var == rq2.e) {
            Object objT = a2nVar.t(str, "spotify:internal:npv-mini-chat", op2Var);
            if (objT == d9nVar) {
                return objT;
            }
        } else {
            Object objQ = a2nVar.Q(str, "spotify:internal:npv-mini-chat", op2Var);
            if (objQ == d9nVar) {
                return objQ;
            }
        }
        return rih1.a;
    }

    public final void a() {
        faa0 faa0Var = this.J;
        this.J = null;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        lo2 lo2Var = this.m;
        faa0 faa0Var2 = lo2Var.f;
        lo2Var.f = null;
        if (faa0Var2 != null) {
            faa0Var2.d((CancellationException) null);
        }
        lo2Var.d.m((Object) null, qo2.a);
    }

    public final void b() {
        s2t s2tVar = this.I;
        if (s2tVar != null) {
            s2tVar.d((CancellationException) null);
        }
        a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zob1 zob1Var, onm onmVar) {
        gp2 gp2Var;
        a8r0 a8r0Var;
        if (onmVar instanceof gp2) {
            gp2Var = (gp2) onmVar;
            int i = gp2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gp2Var.d = i - Integer.MIN_VALUE;
            } else {
                gp2Var = new gp2(this, onmVar);
            }
        } else {
            gp2Var = new gp2(this, onmVar);
        }
        Object obj = gp2Var.b;
        int i2 = gp2Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            a8r0 a8r0VarA = this.k.a(rj41.b);
            gp2Var.a = a8r0VarA;
            gp2Var.d = 1;
            Object objR = r(zob1Var, gp2Var);
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
            obj = objR;
            a8r0Var = a8r0VarA;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a8r0Var = gp2Var.a;
            hm5.M(obj);
        }
        return new fp2((String) obj, a8r0Var != null ? a8r0Var.b : null, a8r0Var != null ? a8r0Var.c : null);
    }

    public final void d() {
        bpb1 bpb1Var;
        Object value;
        hre hreVarA;
        do {
            bpb1Var = this.r;
            value = bpb1Var.getValue();
            hreVarA = (jre) value;
            hre hreVar = hreVarA instanceof hre ? hreVarA : null;
            if (hreVar != null) {
                hreVarA = hre.a(hreVar);
            }
        } while (!bpb1Var.k(value, hreVarA));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(tn2 tn2Var, boolean z, onm onmVar) {
        hp2 hp2Var;
        if (onmVar instanceof hp2) {
            hp2Var = (hp2) onmVar;
            int i = hp2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hp2Var.d = i - Integer.MIN_VALUE;
            } else {
                hp2Var = new hp2(this, onmVar);
            }
        } else {
            hp2Var = new hp2(this, onmVar);
        }
        Object obj = hp2Var.b;
        int i2 = hp2Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            if (z && !(tn2Var instanceof sn2)) {
                hp2Var.a = tn2Var;
                hp2Var.d = 1;
                Object objV = v(false, hp2Var);
                d9n d9nVar = d9n.a;
                if (objV == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tn2Var = hp2Var.a;
            hm5.M(obj);
        }
        if (tn2Var != null) {
            this.E.l(tn2Var);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(boolean z, dp2 dp2Var, boolean z2, onm onmVar) {
        ip2 ip2Var;
        if (onmVar instanceof ip2) {
            ip2Var = (ip2) onmVar;
            int i = ip2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ip2Var.e = i - Integer.MIN_VALUE;
            } else {
                ip2Var = new ip2(this, onmVar);
            }
        } else {
            ip2Var = new ip2(this, onmVar);
        }
        Object obj = ip2Var.c;
        int i2 = ip2Var.e;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (!this.f38p.r()) {
                if (z) {
                    ip2Var.b = dp2Var;
                    ip2Var.a = z2;
                    ip2Var.e = 1;
                    Object objV = v(false, ip2Var);
                    d9n d9nVar = d9n.a;
                    if (objV == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = ip2Var.a;
        dp2Var = ip2Var.b;
        hm5.M(obj);
        if (dp2Var != dp2.b && z2) {
            this.E.l(pn2.a);
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(fp2 fp2Var, zob1 zob1Var, onm onmVar) {
        jp2 jp2Var;
        if (onmVar instanceof jp2) {
            jp2Var = (jp2) onmVar;
            int i = jp2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jp2Var.d = i - Integer.MIN_VALUE;
            } else {
                jp2Var = new jp2(this, onmVar);
            }
        } else {
            jp2Var = new jp2(this, onmVar);
        }
        Object objC = jp2Var.b;
        int i2 = jp2Var.d;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objC);
            jp2Var.a = fp2Var;
            jp2Var.d = 1;
            objC = c(zob1Var, jp2Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fp2Var = jp2Var.a;
            hm5.M(objC);
        }
        fp2 fp2Var2 = (fp2) objC;
        boolean z2 = !u890.j(fp2Var2.a(), fp2Var.a());
        if (u890.j(fp2Var2.c(), fp2Var.c()) && u890.j(fp2Var2.b(), fp2Var.b())) {
            z = false;
        }
        return new bp2(z2, z);
    }

    public final String h() {
        this.f38p.l();
        String strQ = too1.q((jre) this.s.a.getValue());
        if (strQ == null || ihc1.y0(strQ)) {
            strQ = null;
        }
        if (strQ != null) {
            return strQ;
        }
        String str = this.L;
        if (str == null || ihc1.y0(str)) {
            return null;
        }
        return str;
    }

    public final void i() {
        if (this.f38p.r()) {
            return;
        }
        this.f38p.s();
        a();
        bpb1 bpb1Var = this.v;
        Boolean bool = Boolean.FALSE;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
        bpb1 bpb1Var2 = this.x;
        bpb1Var2.getClass();
        bpb1Var2.m((Object) null, bool);
        bpb1 bpb1Var3 = this.t;
        bpb1Var3.getClass();
        bpb1Var3.m((Object) null, "");
        this.L = null;
        this.M = null;
        this.N = null;
        this.Q = null;
        bpb1 bpb1Var4 = this.r;
        fre freVar = fre.a;
        bpb1Var4.getClass();
        bpb1Var4.m((Object) null, freVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(onm onmVar) {
        kp2 kp2Var;
        if (onmVar instanceof kp2) {
            kp2Var = (kp2) onmVar;
            int i = kp2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kp2Var.c = i - Integer.MIN_VALUE;
            } else {
                kp2Var = new kp2(this, onmVar);
            }
        } else {
            kp2Var = new kp2(this, onmVar);
        }
        Object obj = kp2Var.a;
        int i2 = kp2Var.c;
        boolean z = true;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableA = zq51.a(((mpm1) this.a0.getValue()).a);
                kp2Var.c = 1;
                Object objI = fc11.i(completableA, kp2Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            n57.t("DJ jump failed", th);
            z = false;
        }
        return yah0.m(z);
    }

    public final zq00 l() {
        return (zq00) this.U.getValue();
    }

    public final void n() {
        if (this.l.u()) {
            this.f38p.q();
        }
    }

    public final void o(String str, boolean z, xu30 xu30Var) {
        ep2 ep2Var;
        faa0 faa0VarB;
        long jLongValue = ((Number) this.H.a.getValue()).longValue();
        p811 p811Var = new p811();
        boolean z2 = true;
        p811Var.a = c921.y(this.q, (o8n) null, 2, new d6(this, str, jLongValue, p811Var, (lnm) null), 1);
        synchronized (this.R) {
            try {
                ep2Var = this.V;
                if (!z && (ep2Var == null || !ep2Var.c())) {
                    z2 = false;
                }
                Object obj = p811Var.a;
                if (obj == null) {
                    u890.C("playbackJob");
                    throw null;
                }
                this.V = new ep2((faa0) obj, z2, xu30Var);
                bpb1 bpb1Var = this.z;
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ep2Var != null && (faa0VarB = ep2Var.b()) != null) {
            faa0VarB.d((CancellationException) null);
        }
        Object obj2 = p811Var.a;
        if (obj2 != null) {
            ((faa0) obj2).start();
        } else {
            u890.C("playbackJob");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[Catch: Exception -> 0x019a, CancellationException -> 0x01a2, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x01a2, Exception -> 0x019a, blocks: (B:14:0x002f, B:30:0x0096, B:32:0x00a0, B:34:0x00a5, B:37:0x00ad, B:38:0x00bc, B:40:0x00c2, B:43:0x00d0, B:45:0x00d6, B:47:0x00dc, B:48:0x00e0, B:49:0x00f1, B:51:0x00f7, B:55:0x0116, B:56:0x0130, B:57:0x013e, B:59:0x0144, B:60:0x0155, B:62:0x015b, B:66:0x017a, B:67:0x0194, B:19:0x0041, B:26:0x0069, B:22:0x004f), top: B:73:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0 A[Catch: Exception -> 0x019a, CancellationException -> 0x01a2, TRY_ENTER, TryCatch #2 {CancellationException -> 0x01a2, Exception -> 0x019a, blocks: (B:14:0x002f, B:30:0x0096, B:32:0x00a0, B:34:0x00a5, B:37:0x00ad, B:38:0x00bc, B:40:0x00c2, B:43:0x00d0, B:45:0x00d6, B:47:0x00dc, B:48:0x00e0, B:49:0x00f1, B:51:0x00f7, B:55:0x0116, B:56:0x0130, B:57:0x013e, B:59:0x0144, B:60:0x0155, B:62:0x015b, B:66:0x017a, B:67:0x0194, B:19:0x0041, B:26:0x0069, B:22:0x004f), top: B:73:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc A[Catch: Exception -> 0x019a, CancellationException -> 0x01a2, TryCatch #2 {CancellationException -> 0x01a2, Exception -> 0x019a, blocks: (B:14:0x002f, B:30:0x0096, B:32:0x00a0, B:34:0x00a5, B:37:0x00ad, B:38:0x00bc, B:40:0x00c2, B:43:0x00d0, B:45:0x00d6, B:47:0x00dc, B:48:0x00e0, B:49:0x00f1, B:51:0x00f7, B:55:0x0116, B:56:0x0130, B:57:0x013e, B:59:0x0144, B:60:0x0155, B:62:0x015b, B:66:0x017a, B:67:0x0194, B:19:0x0041, B:26:0x0069, B:22:0x004f), top: B:73:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7 A[Catch: Exception -> 0x019a, CancellationException -> 0x01a2, TryCatch #2 {CancellationException -> 0x01a2, Exception -> 0x019a, blocks: (B:14:0x002f, B:30:0x0096, B:32:0x00a0, B:34:0x00a5, B:37:0x00ad, B:38:0x00bc, B:40:0x00c2, B:43:0x00d0, B:45:0x00d6, B:47:0x00dc, B:48:0x00e0, B:49:0x00f1, B:51:0x00f7, B:55:0x0116, B:56:0x0130, B:57:0x013e, B:59:0x0144, B:60:0x0155, B:62:0x015b, B:66:0x017a, B:67:0x0194, B:19:0x0041, B:26:0x0069, B:22:0x004f), top: B:73:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b A[Catch: Exception -> 0x019a, CancellationException -> 0x01a2, TryCatch #2 {CancellationException -> 0x01a2, Exception -> 0x019a, blocks: (B:14:0x002f, B:30:0x0096, B:32:0x00a0, B:34:0x00a5, B:37:0x00ad, B:38:0x00bc, B:40:0x00c2, B:43:0x00d0, B:45:0x00d6, B:47:0x00dc, B:48:0x00e0, B:49:0x00f1, B:51:0x00f7, B:55:0x0116, B:56:0x0130, B:57:0x013e, B:59:0x0144, B:60:0x0155, B:62:0x015b, B:66:0x017a, B:67:0x0194, B:19:0x0041, B:26:0x0069, B:22:0x004f), top: B:73:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0175  */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object p(rq2 rq2Var, String str, onm onmVar) {
        rp2 rp2Var;
        jr2 jr2Var;
        rq2 rq2Var2;
        boolean z;
        String str2;
        boolean z2;
        rs2 rs2Var;
        List listB;
        ArrayList arrayList;
        String strB;
        String str3;
        List list;
        ArrayList arrayList2;
        js2 js2VarA;
        String strA;
        ArrayList arrayList3;
        String strB2;
        String str4;
        if (onmVar instanceof rp2) {
            rp2Var = (rp2) onmVar;
            int i = rp2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rp2Var.g = i - Integer.MIN_VALUE;
            } else {
                rp2Var = new rp2(this, onmVar);
            }
        } else {
            rp2Var = new rp2(this, onmVar);
        }
        rp2 rp2Var2 = rp2Var;
        Object objH = rp2Var2.e;
        int i2 = rp2Var2.g;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objH);
                boolean zM = q1o1.m(this.l);
                jr2Var = this.b;
                rq2Var2 = rq2Var;
                rp2Var2.a = rq2Var2;
                rp2Var2.b = str;
                rp2Var2.c = jr2Var;
                rp2Var2.d = zM;
                rp2Var2.g = 1;
                Object objY = y(rp2Var2);
                if (objY != d9nVar) {
                    z = zM;
                    str2 = str;
                    objH = objY;
                }
                return d9nVar;
            }
            if (i2 == 1) {
                boolean z3 = rp2Var2.d;
                jr2Var = rp2Var2.c;
                str2 = rp2Var2.b;
                rq2Var2 = rp2Var2.a;
                hm5.M(objH);
                z = z3;
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = rp2Var2.d;
                hm5.M(objH);
            }
            rs2Var = (rs2) objH;
            listB = rs2Var.b();
            if (z2 && (list = listB) != null && !list.isEmpty()) {
                List<ks2> list2 = listB;
                arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (ks2 ks2Var : list2) {
                    js2VarA = ks2Var.a();
                    if (js2VarA != null) {
                        strA = js2VarA.a();
                    } else {
                        strA = "";
                    }
                    js2 js2VarA2 = ks2Var.a();
                    String strB3 = js2VarA2 != null ? js2VarA2.b() : "";
                    List<is2> listB2 = ks2Var.b();
                    arrayList3 = new ArrayList(q7h.U(listB2, 10));
                    for (is2 is2Var : listB2) {
                        String strA2 = is2Var.a();
                        int i3 = u7h.l;
                        long jP = nfb.p();
                        strB2 = is2Var.b();
                        if (strB2.length() == 0) {
                            str4 = null;
                        } else {
                            str4 = strB2;
                        }
                        arrayList3.add(new iys0((hux) null, 0L, jP, strA2, str4, is2Var.c(), false, false, rs2Var.c(), 807));
                    }
                    arrayList2.add(new zs80(strA, strB3, mqo1.A(arrayList3)));
                }
                return new l2n(arrayList2);
            }
            List<is2> listA = rs2Var.a();
            arrayList = new ArrayList(q7h.U(listA, 10));
            for (is2 is2Var2 : listA) {
                String strA3 = is2Var2.a();
                int i4 = u7h.l;
                long jP2 = nfb.p();
                strB = is2Var2.b();
                if (strB.length() == 0) {
                    str3 = null;
                } else {
                    str3 = strB;
                }
                arrayList.add(new iys0((hux) null, 0L, jP2, strA3, str3, is2Var2.c(), false, false, rs2Var.c(), 807));
            }
            return new k2n(arrayList);
            ot2 ot2VarQ = qtg.q(str2, (ot2) objH);
            rq2 rq2Var3 = rq2Var2;
            String strA4 = rq2Var3.a();
            String strQ = d7e.q(rq2Var3);
            dt2 dt2Var = new dt2(rq2Var3.b());
            rp2Var2.a = null;
            rp2Var2.b = null;
            rp2Var2.c = null;
            rp2Var2.d = z;
            rp2Var2.g = 2;
            objH = ((wr2) jr2Var).h(ot2VarQ, strA4, strQ, z, dt2Var, rp2Var2);
            if (objH != d9nVar) {
                z2 = z;
                rs2Var = (rs2) objH;
                listB = rs2Var.b();
                if (z2) {
                    List<ks2> list3 = listB;
                    arrayList2 = new ArrayList(q7h.U(list3, 10));
                    while (r2.hasNext()) {
                        js2VarA = ks2Var.a();
                        if (js2VarA != null) {
                            strA = js2VarA.a();
                        } else {
                            strA = "";
                        }
                        js2 js2VarA3 = ks2Var.a();
                        if (js2VarA3 != null) {
                        }
                        List<is2> listB3 = ks2Var.b();
                        arrayList3 = new ArrayList(q7h.U(listB3, 10));
                        while (r4.hasNext()) {
                            String strA5 = is2Var.a();
                            int i5 = u7h.l;
                            long jP3 = nfb.p();
                            strB2 = is2Var.b();
                            if (strB2.length() == 0) {
                                str4 = null;
                            } else {
                                str4 = strB2;
                            }
                            arrayList3.add(new iys0((hux) null, 0L, jP3, strA5, str4, is2Var.c(), false, false, rs2Var.c(), 807));
                        }
                        arrayList2.add(new zs80(strA, strB3, mqo1.A(arrayList3)));
                    }
                    return new l2n(arrayList2);
                }
                List<is2> listA2 = rs2Var.a();
                arrayList = new ArrayList(q7h.U(listA2, 10));
                while (r0.hasNext()) {
                    String strA6 = is2Var2.a();
                    int i6 = u7h.l;
                    long jP4 = nfb.p();
                    strB = is2Var2.b();
                    if (strB.length() == 0) {
                        str3 = null;
                    } else {
                        str3 = strB;
                    }
                    arrayList.add(new iys0((hux) null, 0L, jP4, strA6, str3, is2Var2.c(), false, false, rs2Var.c(), 807));
                }
                return new k2n(arrayList);
            }
            return d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new k2n(z6x.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(onm onmVar) {
        sp2 sp2Var;
        int i;
        int i2;
        if (onmVar instanceof sp2) {
            sp2Var = (sp2) onmVar;
            int i3 = sp2Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sp2Var.d = i3 - Integer.MIN_VALUE;
            } else {
                sp2Var = new sp2(this, onmVar);
            }
        } else {
            sp2Var = new sp2(this, onmVar);
        }
        Object objI = sp2Var.b;
        int i4 = sp2Var.d;
        d9n d9nVar = d9n.a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    hm5.M(objI);
                } else {
                    if (i4 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = sp2Var.a;
                    hm5.M(objI);
                }
                i = i2;
                return yah0.m(i != 0);
            }
            hm5.M(objI);
            if (!this.g.c()) {
                i = 0;
                return yah0.m(i != 0);
            }
            Flowable flowable = this.e;
            vbm[] vbmVarArr = q601.a;
            kge kgeVar = new kge(flowable);
            sp2Var.d = 1;
            objI = b5p1.i(kgeVar, sp2Var);
            if (objI == d9nVar) {
            }
            return d9nVar;
            PlayerState playerState = (PlayerState) objI;
            i = (!playerState.isPlaying() || playerState.isPaused()) ? 0 : 1;
            if (i != 0) {
                Completable completableIgnoreElement = ((w9u0) this.T.getValue()).a(q9u0.d(PauseCommand.builder().options(CommandOptions.builder().systemInitiated(true).overrideRestrictions(true).build()).build())).ignoreElement();
                sp2Var.a = i;
                sp2Var.d = 2;
                if (fc11.i(completableIgnoreElement, sp2Var) != d9nVar) {
                    i2 = i;
                    i = i2;
                }
                return d9nVar;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to pause context player for TTS", e2);
        }
        return yah0.m(i != 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(zob1 zob1Var, onm onmVar) {
        tp2 tp2Var;
        PlayerState playerState;
        String strContextUri;
        if (onmVar instanceof tp2) {
            tp2Var = (tp2) onmVar;
            int i = tp2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tp2Var.c = i - Integer.MIN_VALUE;
            } else {
                tp2Var = new tp2(this, onmVar);
            }
        } else {
            tp2Var = new tp2(this, onmVar);
        }
        Object objI = tp2Var.a;
        int i2 = tp2Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                playerState = (PlayerState) zob1Var.getValue();
                if (playerState == null) {
                    any anyVarN = f5p1.n(zob1Var);
                    tp2Var.c = 1;
                    objI = b5p1.i(anyVarN, tp2Var);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    strContextUri = playerState.contextUri();
                    if (strContextUri == null && !ihc1.y0(strContextUri)) {
                        return strContextUri;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
            playerState = (PlayerState) objI;
            strContextUri = playerState.contextUri();
            if (strContextUri == null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0008  */
    public final void s() {
        boolean z;
        synchronized (this.R) {
            int i = this.W;
            if (i == 0) {
                z = false;
            } else {
                int i2 = i - 1;
                this.W = i2;
                if (i2 == 0) {
                    z = this.X;
                    this.X = false;
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            c921.y(this.q, (o8n) null, 0, new lp2(this, (lnm) null, (byte) 1), 3);
        }
    }

    public final void t(String str) {
        if (str != null) {
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str == null || m(str)) {
                return;
            }
            this.O = str;
        }
    }

    public final cp2 u(gp21 gp21Var) {
        t(gp21Var.a());
        a8r0 a8r0VarA = this.k.a(rj41.b);
        String str = null;
        String str2 = a8r0VarA != null ? a8r0VarA.b : null;
        t(str2);
        String strB = gp21Var.b();
        if (strB == null && (strB = gp21Var.a()) == null) {
            strB = str2;
        }
        String strA = gp21Var.a();
        if (strA == null || m(strA)) {
            strA = null;
        }
        if (strA == null) {
            String str3 = this.O;
            if (str3 != null) {
                str = str3;
            } else if (str2 != null && !m(str2)) {
                str = str2;
            }
        } else {
            str = strA;
        }
        return new cp2(strB, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(boolean z, onm onmVar) {
        up2 up2Var;
        if (onmVar instanceof up2) {
            up2Var = (up2) onmVar;
            int i = up2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                up2Var.c = i - Integer.MIN_VALUE;
            } else {
                up2Var = new up2(this, onmVar);
            }
        } else {
            up2Var = new up2(this, onmVar);
        }
        Object obj = up2Var.a;
        int i2 = up2Var.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            if (!this.f38p.r() || z) {
                Completable completableIgnoreElement = ((w9u0) this.T.getValue()).a(q9u0.f(ResumeCommand.builder().options(CommandOptions.builder().systemInitiated(true).build()).build())).ignoreElement();
                up2Var.c = 1;
                Object objI = fc11.i(completableIgnoreElement, up2Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to resume context player after TTS", e2);
            return rih1Var;
        }
    }

    public final void x() {
        boolean z;
        if (this.f38p.r()) {
            return;
        }
        synchronized (this.R) {
            try {
                z = true;
                if (this.W > 0) {
                    this.X = true;
                } else {
                    ep2 ep2Var = this.V;
                    if (ep2Var != null) {
                        this.V = ep2.a(ep2Var);
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c921.y(this.q, (o8n) null, 0, new lp2(this, (lnm) null, (byte) 2), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(onm onmVar) {
        vp2 vp2Var;
        if (onmVar instanceof vp2) {
            vp2Var = (vp2) onmVar;
            int i = vp2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vp2Var.c = i - Integer.MIN_VALUE;
            } else {
                vp2Var = new vp2(this, onmVar);
            }
        } else {
            vp2Var = new vp2(this, onmVar);
        }
        Object objA = vp2Var.a;
        int i2 = vp2Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                qt2 qt2Var = this.c;
                vp2Var.c = 1;
                objA = qt2Var.a(vp2Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            return (ot2) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            n57.t("Failed to build AgentGatewayUserContext for agent-coordinator request", th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object z(String str, gp21 gp21Var, onm onmVar) {
        wp2 wp2Var;
        fq2 fq2Var;
        rih1 rih1Var = rih1.a;
        if (onmVar instanceof wp2) {
            wp2Var = (wp2) onmVar;
            int i = wp2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wp2Var.c = i - Integer.MIN_VALUE;
            } else {
                wp2Var = new wp2(this, onmVar);
            }
        } else {
            wp2Var = new wp2(this, onmVar);
        }
        Object obj = wp2Var.a;
        d9n d9nVar = d9n.a;
        int i2 = wp2Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                if (!this.f38p.r()) {
                    this.f38p.s();
                    if (!this.l.a() || !d7e.m(str)) {
                        a();
                        fq2Var = this;
                        fq2Var.I = c921.q(this.q, (o8n) null, 2, new c6(fq2Var, str, gp21Var, (lnm) null, (byte) 14), 1);
                        s2t s2tVar = fq2Var.I;
                        if (s2tVar != null) {
                            s2tVar.L(new mp2(fq2Var, (byte) 1));
                        }
                        try {
                            s2t s2tVar2 = fq2Var.I;
                            if (s2tVar2 != null) {
                                wp2Var.c = 1;
                                if (s2tVar2.Q(wp2Var) == d9nVar) {
                                    return d9nVar;
                                }
                            }
                        } catch (Exception unused) {
                            fq2Var.Q = null;
                            bpb1 bpb1Var = fq2Var.r;
                            fre freVar = fre.a;
                            bpb1Var.getClass();
                            bpb1Var.m((Object) null, freVar);
                        }
                    } else if (!this.f38p.r() && this.l.a()) {
                        this.f38p.s();
                        if (this.J == null) {
                            if (this.n.j()) {
                                E();
                                return rih1Var;
                            }
                            p811 p811Var = new p811();
                            faa0 faa0VarY = c921.y(this.q, (o8n) null, 2, new hi2(this, p811Var, (lnm) null, (byte) 4), 1);
                            p811Var.a = faa0VarY;
                            this.J = faa0VarY;
                            Object obj2 = p811Var.a;
                            if (obj2 != null) {
                                ((faa0) obj2).start();
                                return rih1Var;
                            }
                            u890.C("job");
                            throw null;
                        }
                    }
                }
                return rih1Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                hm5.M(obj);
                return rih1Var;
            } catch (Exception unused2) {
                fq2Var = this;
            }
            fq2Var.Q = null;
            bpb1 bpb1Var2 = fq2Var.r;
            fre freVar2 = fre.a;
            bpb1Var2.getClass();
            bpb1Var2.m((Object) null, freVar2);
        } catch (CancellationException unused3) {
            op71.x(wp2Var.getContext());
        }
        return rih1Var;
    }
}
