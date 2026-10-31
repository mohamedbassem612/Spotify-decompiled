package p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class chg implements mk90 {
    public final c9c0 a;
    public final d0r b;
    public final f1n0 c;
    public final yzc0 d;
    public final String e;
    public final ov80 f;
    public final dxz0 g;
    public final kqi0 h;
    public final kt91 i;
    public final g0l j;
    public final t740 k;
    public final vb2 l;
    public final e7p0 m;
    public final yh2 n;
    public final h9k0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wr00 f3p;
    public final vbs q;
    public final ov20 r;
    public final x290 s;
    public final o3r t;
    public final ywv0 u;
    public final z9k0 v;
    public final ylt0 w;

    public chg(c9c0 c9c0Var, d0r d0rVar, f1n0 f1n0Var, yzc0 yzc0Var, String str, ov80 ov80Var, dxz0 dxz0Var, kqi0 kqi0Var, kt91 kt91Var, g0l g0lVar, t740 t740Var, r6h1 r6h1Var, r0s0 r0s0Var, vb2 vb2Var, kmj1 kmj1Var, h5q h5qVar, e7p0 e7p0Var, b9q b9qVar, yh2 yh2Var, h9k0 h9k0Var, wr00 wr00Var, vbs vbsVar, ov20 ov20Var, x290 x290Var) {
        this.a = c9c0Var;
        this.b = d0rVar;
        this.c = f1n0Var;
        this.d = yzc0Var;
        this.e = str;
        this.f = ov80Var;
        this.g = dxz0Var;
        this.h = kqi0Var;
        this.i = kt91Var;
        this.j = g0lVar;
        this.k = t740Var;
        this.l = vb2Var;
        this.m = e7p0Var;
        this.n = yh2Var;
        this.o = h9k0Var;
        this.f3p = wr00Var;
        this.q = vbsVar;
        this.r = ov20Var;
        this.s = x290Var;
        this.t = kmj1Var.a(str);
        this.u = h5qVar.a((muz) null);
        this.v = b9qVar.a(r6h1Var);
        this.w = r0s0Var.r(new ult0(yzc0Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        wgg wggVar;
        if (onmVar instanceof wgg) {
            wggVar = (wgg) onmVar;
            int i = wggVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wggVar.c = i - Integer.MIN_VALUE;
            } else {
                wggVar = new wgg(this, onmVar);
            }
        } else {
            wggVar = new wgg(this, onmVar);
        }
        Object objJ = wggVar.a;
        int i2 = wggVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleOnErrorReturnItem = this.g.e().firstOrError().onErrorReturnItem(Boolean.TRUE);
            wggVar.c = 1;
            objJ = fc11.j(singleOnErrorReturnItem, wggVar);
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
        return objJ;
    }

    public final tv80 e(String str, int i, boolean z) {
        ov80 ov80Var = this.f;
        r6h1 r6h1Var = ov80Var.b;
        i8h1 i8h1Var = ov80Var.a;
        b7x b7xVar = b7x.a;
        if (z) {
            Integer numValueOf = Integer.valueOf(i);
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-playlist-entity-item-list-item";
            x6h1VarI.f = "3.0.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.c = numValueOf;
            x6h1VarI.d = str;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("shuffle_play", 1, Collections.singletonMap("context_to_be_played", str)), x6h1VarI.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
        }
        Integer numValueOf2 = Integer.valueOf(i);
        y6h1 y6h1Var2 = y6h1.i;
        x6h1 x6h1VarI2 = i3o1.i();
        x6h1VarI2.h = "music";
        x6h1VarI2.a = "mobile-playlist-entity-item-list-item";
        x6h1VarI2.f = "3.0.0";
        x6h1VarI2.g = "22.0.0";
        x6h1VarI2.c = numValueOf2;
        x6h1VarI2.d = str;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), x6h1VarI2.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0184  */
    /* JADX WARN: Code duplicated, block: B:67:0x0188  */
    /* JADX WARN: Code duplicated, block: B:69:0x0198 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r2 == r12) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (r2 != p.ktl.b) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(int r25, p.zuc0 r26, p.wj90 r27, p.onm r28) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.chg.f(int, p.zuc0, p.wj90, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0255  */
    /* JADX WARN: Code duplicated, block: B:106:0x025a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0287  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:34:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x015b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0167  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x0195  */
    /* JADX WARN: Code duplicated, block: B:71:0x0198  */
    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:94:0x0213  */
    /* JADX WARN: Code duplicated, block: B:97:0x021c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0224  */
    public final Object i(int i, zuc0 zuc0Var, uj90 uj90Var, onm onmVar) {
        ygg yggVar;
        zuc0 zuc0Var2;
        Object objD;
        uj90 uj90Var2;
        int i2;
        boolean zBooleanValue;
        ltt0 ltt0VarB;
        Object objI;
        zuc0 zuc0Var3;
        uj90 uj90Var3;
        boolean z;
        ltt0 ltt0Var;
        boolean zBooleanValue2;
        qj90 qj90Var;
        fjf1 fjf1Var;
        String str;
        i1r i1rVarN;
        i1r i1rVar;
        cmj1 cmj1Var;
        tv80 tv80VarE;
        Object objI2;
        boolean z2;
        int i3;
        tv80 tv80Var;
        boolean z3;
        zuc0 zuc0Var4;
        int i4;
        tv80 tv80Var2;
        boolean z4;
        List list;
        boolean z5;
        ndj1 ndj1Var;
        uzc0 uzc0Var;
        yjp1 yjp1Var;
        tv80 tv80Var3;
        boolean zBooleanValue3;
        uzc0 uzc0Var2;
        yjp1 yjp1Var2;
        boolean z6;
        zuc0 zuc0Var5;
        boolean z7;
        if (onmVar instanceof ygg) {
            yggVar = (ygg) onmVar;
            int i5 = yggVar.X;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                yggVar.X = i5 - Integer.MIN_VALUE;
            } else {
                yggVar = new ygg(this, onmVar);
            }
        } else {
            yggVar = new ygg(this, onmVar);
        }
        Object obj = yggVar.i;
        int i6 = yggVar.X;
        rih1 rih1Var = rih1.a;
        yzc0 yzc0Var = this.d;
        Object obj2 = d9n.a;
        switch (i6) {
            case 0:
                hm5.M(obj);
                zuc0Var2 = zuc0Var;
                yggVar.b = zuc0Var2;
                yggVar.c = uj90Var;
                yggVar.a = i;
                yggVar.X = 1;
                objD = d(yggVar);
                if (objD != obj2) {
                    uj90Var2 = uj90Var;
                    i2 = i;
                    zBooleanValue = ((Boolean) objD).booleanValue();
                    ltt0VarB = zuc0Var2.b();
                    mr20 mr20VarA = yzc0Var.a();
                    yggVar.b = zuc0Var2;
                    yggVar.c = uj90Var2;
                    yggVar.d = ltt0VarB;
                    yggVar.a = i2;
                    yggVar.f = zBooleanValue;
                    yggVar.X = 2;
                    objI = b5p1.i(mr20VarA, yggVar);
                    if (objI != obj2) {
                        zuc0Var3 = zuc0Var2;
                        obj = objI;
                        uj90Var3 = uj90Var2;
                        z = zBooleanValue;
                        ltt0Var = ltt0VarB;
                        zBooleanValue2 = ((Boolean) obj).booleanValue();
                        qj90Var = uj90Var3.a;
                        if (ltt0Var == ltt0.c) {
                            e(zuc0Var3.c, i2, zBooleanValue2);
                            this.f3p.a(zuc0Var3.c);
                            return rih1Var;
                        }
                        fjf1Var = zuc0Var3.p;
                        tu00 tu00Var = zuc0Var3.q;
                        str = zuc0Var3.c;
                        if (!(fjf1Var instanceof fjf1) && fjf1Var.h) {
                            tv80 tv80VarE2 = e(str, i2, zBooleanValue2);
                            String strA = zuc0Var3.a(1);
                            bql bqlVarA = tu00Var.a(bql.class);
                            this.k.a(this.e, strA, u890.j(bqlVarA != null ? bqlVarA.a : null, kql.a) ? "spotify:windowed-song:click" : "spotify:gated-song:click", zuc0Var3.c, tv80VarE2);
                            return rih1Var;
                        }
                        if (qj90Var instanceof pj90) {
                            vb2.b(this.l, new db2(((pj90) qj90Var).a), true, e(str, i2, zBooleanValue2));
                            return rih1Var;
                        }
                        if (ltt0Var == ltt0.d) {
                            e(str, i2, zBooleanValue2);
                            this.n.c(str, (String) null);
                            return rih1Var;
                        }
                        if (!z) {
                            Set set = s4b1.f;
                            if (uic.x(str).c == blc0.ti) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (zuc0Var3.f() || (z5 && zuc0Var3.e())) {
                                e(str, i2, zBooleanValue2);
                                return rih1Var;
                            }
                        }
                        i1rVarN = x2p1.n(this.b, this.t, rih1Var);
                        if (i1rVarN instanceof i1r) {
                            i1rVar = i1rVarN;
                        } else {
                            i1rVar = null;
                        }
                        if (i1rVar != null) {
                            cmj1Var = (cmj1) i1rVar.a;
                        } else {
                            cmj1Var = null;
                        }
                        if (cmj1Var == null && t2p1.p(cmj1Var)) {
                            hll hllVarA = tu00Var.a(hll.class);
                            if ((hllVarA == null || (list = hllVarA.d) == null) ? false : list.contains(fll.c)) {
                                tv80 tv80VarE3 = e(str, i2, zBooleanValue2);
                                yggVar.b = zuc0Var3;
                                yggVar.c = null;
                                yggVar.d = null;
                                yggVar.e = tv80VarE3;
                                yggVar.a = i2;
                                yggVar.f = z;
                                yggVar.g = zBooleanValue2;
                                yggVar.X = 3;
                                Object objC = this.u.c(str, yggVar);
                                if (objC != obj2) {
                                    i4 = i2;
                                    tv80Var2 = tv80VarE3;
                                    z4 = zBooleanValue2;
                                    obj = objC;
                                    ndj1Var = (ndj1) obj;
                                    if (u890.j(ndj1Var, ndj1.c)) {
                                        if (u890.j(ndj1Var, ndj1.b)) {
                                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963769});
                                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                                            this.i.k(new er91((fs91) null, "", 2131963769, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                                            return rih1Var;
                                        }
                                        if (!u890.j(ndj1Var, ndj1.a)) {
                                            eg.o();
                                            return null;
                                        }
                                        return rih1Var;
                                    }
                                    uzc0Var = new uzc0(zuc0Var3.a);
                                    yjp1Var = ujy0.a;
                                    yggVar.b = null;
                                    yggVar.c = null;
                                    yggVar.d = null;
                                    yggVar.e = tv80Var2;
                                    yggVar.a = i4;
                                    yggVar.f = z;
                                    yggVar.g = z4;
                                    yggVar.X = 4;
                                    if (yzc0Var.h(uzc0Var, tv80Var2, yjp1Var, yggVar) != obj2) {
                                        tv80Var3 = tv80Var2;
                                        e7p0.d(this.m, tv80Var3.a);
                                        return rih1Var;
                                    }
                                }
                            } else {
                                tv80VarE = e(str, i2, zBooleanValue2);
                                yggVar.b = zuc0Var3;
                                yggVar.c = null;
                                yggVar.d = null;
                                yggVar.e = tv80VarE;
                                yggVar.a = i2;
                                yggVar.f = z;
                                yggVar.g = zBooleanValue2;
                                yggVar.X = 5;
                                objI2 = b5p1.i(z4p1.F(new nwd(yzc0Var.j(), (byte) 11), 1), yggVar);
                                if (objI2 != obj2) {
                                    int i7 = i2;
                                    z2 = zBooleanValue2;
                                    obj = objI2;
                                    i3 = i7;
                                    boolean z8 = z;
                                    tv80Var = tv80VarE;
                                    z3 = z8;
                                    zuc0Var4 = zuc0Var3;
                                    zBooleanValue3 = ((Boolean) obj).booleanValue();
                                    uzc0Var2 = new uzc0(zuc0Var4.a);
                                    yjp1Var2 = ujy0.a;
                                    yggVar.b = null;
                                    yggVar.c = null;
                                    yggVar.d = null;
                                    yggVar.e = tv80Var;
                                    yggVar.a = i3;
                                    yggVar.f = z3;
                                    yggVar.g = z2;
                                    yggVar.h = zBooleanValue3;
                                    yggVar.X = 6;
                                    if (yzc0Var.h(uzc0Var2, tv80Var, yjp1Var2, yggVar) != obj2) {
                                        z6 = z2;
                                        zuc0Var5 = null;
                                        z7 = zBooleanValue3;
                                        yggVar.b = zuc0Var5;
                                        yggVar.c = zuc0Var5;
                                        yggVar.d = zuc0Var5;
                                        yggVar.e = zuc0Var5;
                                        yggVar.a = i3;
                                        yggVar.f = z3;
                                        yggVar.g = z6;
                                        yggVar.h = z7;
                                        yggVar.X = 7;
                                        if (o(z6, tv80Var, z7, yggVar) != obj2) {
                                            return rih1Var;
                                        }
                                    }
                                }
                            }
                        } else {
                            tv80VarE = e(str, i2, zBooleanValue2);
                            yggVar.b = zuc0Var3;
                            yggVar.c = null;
                            yggVar.d = null;
                            yggVar.e = tv80VarE;
                            yggVar.a = i2;
                            yggVar.f = z;
                            yggVar.g = zBooleanValue2;
                            yggVar.X = 5;
                            objI2 = b5p1.i(z4p1.F(new nwd(yzc0Var.j(), (byte) 11), 1), yggVar);
                            if (objI2 != obj2) {
                                int i8 = i2;
                                z2 = zBooleanValue2;
                                obj = objI2;
                                i3 = i8;
                                boolean z9 = z;
                                tv80Var = tv80VarE;
                                z3 = z9;
                                zuc0Var4 = zuc0Var3;
                                zBooleanValue3 = ((Boolean) obj).booleanValue();
                                uzc0Var2 = new uzc0(zuc0Var4.a);
                                yjp1Var2 = ujy0.a;
                                yggVar.b = null;
                                yggVar.c = null;
                                yggVar.d = null;
                                yggVar.e = tv80Var;
                                yggVar.a = i3;
                                yggVar.f = z3;
                                yggVar.g = z2;
                                yggVar.h = zBooleanValue3;
                                yggVar.X = 6;
                                if (yzc0Var.h(uzc0Var2, tv80Var, yjp1Var2, yggVar) != obj2) {
                                    z6 = z2;
                                    zuc0Var5 = null;
                                    z7 = zBooleanValue3;
                                    yggVar.b = zuc0Var5;
                                    yggVar.c = zuc0Var5;
                                    yggVar.d = zuc0Var5;
                                    yggVar.e = zuc0Var5;
                                    yggVar.a = i3;
                                    yggVar.f = z3;
                                    yggVar.g = z6;
                                    yggVar.h = z7;
                                    yggVar.X = 7;
                                    if (o(z6, tv80Var, z7, yggVar) != obj2) {
                                        return rih1Var;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                i2 = yggVar.a;
                uj90Var2 = yggVar.c;
                zuc0 zuc0Var6 = yggVar.b;
                hm5.M(obj);
                objD = obj;
                zuc0Var2 = zuc0Var6;
                zBooleanValue = ((Boolean) objD).booleanValue();
                ltt0VarB = zuc0Var2.b();
                mr20 mr20VarA2 = yzc0Var.a();
                yggVar.b = zuc0Var2;
                yggVar.c = uj90Var2;
                yggVar.d = ltt0VarB;
                yggVar.a = i2;
                yggVar.f = zBooleanValue;
                yggVar.X = 2;
                objI = b5p1.i(mr20VarA2, yggVar);
                if (objI != obj2) {
                    zuc0Var3 = zuc0Var2;
                    obj = objI;
                    uj90Var3 = uj90Var2;
                    z = zBooleanValue;
                    ltt0Var = ltt0VarB;
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                    qj90Var = uj90Var3.a;
                    if (ltt0Var == ltt0.c) {
                        e(zuc0Var3.c, i2, zBooleanValue2);
                        this.f3p.a(zuc0Var3.c);
                        return rih1Var;
                    }
                    fjf1Var = zuc0Var3.p;
                    tu00 tu00Var2 = zuc0Var3.q;
                    str = zuc0Var3.c;
                    if (!(fjf1Var instanceof fjf1)) {
                    }
                    if (qj90Var instanceof pj90) {
                        vb2.b(this.l, new db2(((pj90) qj90Var).a), true, e(str, i2, zBooleanValue2));
                        return rih1Var;
                    }
                    if (ltt0Var == ltt0.d) {
                        e(str, i2, zBooleanValue2);
                        this.n.c(str, (String) null);
                        return rih1Var;
                    }
                    if (!z) {
                        Set set2 = s4b1.f;
                        if (uic.x(str).c == blc0.ti) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (zuc0Var3.f()) {
                            break;
                        }
                        e(str, i2, zBooleanValue2);
                        return rih1Var;
                    }
                    i1rVarN = x2p1.n(this.b, this.t, rih1Var);
                    if (i1rVarN instanceof i1r) {
                        i1rVar = i1rVarN;
                    } else {
                        i1rVar = null;
                    }
                    if (i1rVar != null) {
                        cmj1Var = (cmj1) i1rVar.a;
                    } else {
                        cmj1Var = null;
                    }
                    if (cmj1Var == null) {
                        tv80VarE = e(str, i2, zBooleanValue2);
                        yggVar.b = zuc0Var3;
                        yggVar.c = null;
                        yggVar.d = null;
                        yggVar.e = tv80VarE;
                        yggVar.a = i2;
                        yggVar.f = z;
                        yggVar.g = zBooleanValue2;
                        yggVar.X = 5;
                        objI2 = b5p1.i(z4p1.F(new nwd(yzc0Var.j(), (byte) 11), 1), yggVar);
                        if (objI2 != obj2) {
                            int i9 = i2;
                            z2 = zBooleanValue2;
                            obj = objI2;
                            i3 = i9;
                            boolean z10 = z;
                            tv80Var = tv80VarE;
                            z3 = z10;
                            zuc0Var4 = zuc0Var3;
                            zBooleanValue3 = ((Boolean) obj).booleanValue();
                            uzc0Var2 = new uzc0(zuc0Var4.a);
                            yjp1Var2 = ujy0.a;
                            yggVar.b = null;
                            yggVar.c = null;
                            yggVar.d = null;
                            yggVar.e = tv80Var;
                            yggVar.a = i3;
                            yggVar.f = z3;
                            yggVar.g = z2;
                            yggVar.h = zBooleanValue3;
                            yggVar.X = 6;
                            if (yzc0Var.h(uzc0Var2, tv80Var, yjp1Var2, yggVar) != obj2) {
                                z6 = z2;
                                zuc0Var5 = null;
                                z7 = zBooleanValue3;
                                yggVar.b = zuc0Var5;
                                yggVar.c = zuc0Var5;
                                yggVar.d = zuc0Var5;
                                yggVar.e = zuc0Var5;
                                yggVar.a = i3;
                                yggVar.f = z3;
                                yggVar.g = z6;
                                yggVar.h = z7;
                                yggVar.X = 7;
                                if (o(z6, tv80Var, z7, yggVar) != obj2) {
                                    return rih1Var;
                                }
                            }
                        }
                    } else {
                        tv80VarE = e(str, i2, zBooleanValue2);
                        yggVar.b = zuc0Var3;
                        yggVar.c = null;
                        yggVar.d = null;
                        yggVar.e = tv80VarE;
                        yggVar.a = i2;
                        yggVar.f = z;
                        yggVar.g = zBooleanValue2;
                        yggVar.X = 5;
                        objI2 = b5p1.i(z4p1.F(new nwd(yzc0Var.j(), (byte) 11), 1), yggVar);
                        if (objI2 != obj2) {
                            int i10 = i2;
                            z2 = zBooleanValue2;
                            obj = objI2;
                            i3 = i10;
                            boolean z11 = z;
                            tv80Var = tv80VarE;
                            z3 = z11;
                            zuc0Var4 = zuc0Var3;
                            zBooleanValue3 = ((Boolean) obj).booleanValue();
                            uzc0Var2 = new uzc0(zuc0Var4.a);
                            yjp1Var2 = ujy0.a;
                            yggVar.b = null;
                            yggVar.c = null;
                            yggVar.d = null;
                            yggVar.e = tv80Var;
                            yggVar.a = i3;
                            yggVar.f = z3;
                            yggVar.g = z2;
                            yggVar.h = zBooleanValue3;
                            yggVar.X = 6;
                            if (yzc0Var.h(uzc0Var2, tv80Var, yjp1Var2, yggVar) != obj2) {
                                z6 = z2;
                                zuc0Var5 = null;
                                z7 = zBooleanValue3;
                                yggVar.b = zuc0Var5;
                                yggVar.c = zuc0Var5;
                                yggVar.d = zuc0Var5;
                                yggVar.e = zuc0Var5;
                                yggVar.a = i3;
                                yggVar.f = z3;
                                yggVar.g = z6;
                                yggVar.h = z7;
                                yggVar.X = 7;
                                if (o(z6, tv80Var, z7, yggVar) != obj2) {
                                    return rih1Var;
                                }
                            }
                        }
                    }
                    break;
                }
                return obj2;
            case 2:
                boolean z12 = yggVar.f;
                int i11 = yggVar.a;
                ltt0Var = yggVar.d;
                uj90Var3 = yggVar.c;
                zuc0Var3 = yggVar.b;
                hm5.M(obj);
                z = z12;
                i2 = i11;
                zBooleanValue2 = ((Boolean) obj).booleanValue();
                qj90Var = uj90Var3.a;
                if (ltt0Var == ltt0.c) {
                    e(zuc0Var3.c, i2, zBooleanValue2);
                    this.f3p.a(zuc0Var3.c);
                    return rih1Var;
                }
                fjf1Var = zuc0Var3.p;
                tu00 tu00Var3 = zuc0Var3.q;
                str = zuc0Var3.c;
                if (!(fjf1Var instanceof fjf1)) {
                    break;
                }
                if (qj90Var instanceof pj90) {
                    vb2.b(this.l, new db2(((pj90) qj90Var).a), true, e(str, i2, zBooleanValue2));
                    return rih1Var;
                }
                if (ltt0Var == ltt0.d) {
                    e(str, i2, zBooleanValue2);
                    this.n.c(str, (String) null);
                    return rih1Var;
                }
                if (!z) {
                    Set set3 = s4b1.f;
                    if (uic.x(str).c == blc0.ti) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (zuc0Var3.f()) {
                        break;
                    }
                    e(str, i2, zBooleanValue2);
                    return rih1Var;
                }
                i1rVarN = x2p1.n(this.b, this.t, rih1Var);
                if (i1rVarN instanceof i1r) {
                    i1rVar = i1rVarN;
                } else {
                    i1rVar = null;
                }
                if (i1rVar != null) {
                    cmj1Var = (cmj1) i1rVar.a;
                } else {
                    cmj1Var = null;
                }
                if (cmj1Var == null) {
                    tv80VarE = e(str, i2, zBooleanValue2);
                    yggVar.b = zuc0Var3;
                    yggVar.c = null;
                    yggVar.d = null;
                    yggVar.e = tv80VarE;
                    yggVar.a = i2;
                    yggVar.f = z;
                    yggVar.g = zBooleanValue2;
                    yggVar.X = 5;
                    objI2 = b5p1.i(z4p1.F(new nwd(yzc0Var.j(), (byte) 11), 1), yggVar);
                    if (objI2 != obj2) {
                        int i12 = i2;
                        z2 = zBooleanValue2;
                        obj = objI2;
                        i3 = i12;
                        boolean z13 = z;
                        tv80Var = tv80VarE;
                        z3 = z13;
                        zuc0Var4 = zuc0Var3;
                        zBooleanValue3 = ((Boolean) obj).booleanValue();
                        uzc0Var2 = new uzc0(zuc0Var4.a);
                        yjp1Var2 = ujy0.a;
                        yggVar.b = null;
                        yggVar.c = null;
                        yggVar.d = null;
                        yggVar.e = tv80Var;
                        yggVar.a = i3;
                        yggVar.f = z3;
                        yggVar.g = z2;
                        yggVar.h = zBooleanValue3;
                        yggVar.X = 6;
                        if (yzc0Var.h(uzc0Var2, tv80Var, yjp1Var2, yggVar) != obj2) {
                            z6 = z2;
                            zuc0Var5 = null;
                            z7 = zBooleanValue3;
                            yggVar.b = zuc0Var5;
                            yggVar.c = zuc0Var5;
                            yggVar.d = zuc0Var5;
                            yggVar.e = zuc0Var5;
                            yggVar.a = i3;
                            yggVar.f = z3;
                            yggVar.g = z6;
                            yggVar.h = z7;
                            yggVar.X = 7;
                            if (o(z6, tv80Var, z7, yggVar) != obj2) {
                                return rih1Var;
                            }
                        }
                    }
                } else {
                    tv80VarE = e(str, i2, zBooleanValue2);
                    yggVar.b = zuc0Var3;
                    yggVar.c = null;
                    yggVar.d = null;
                    yggVar.e = tv80VarE;
                    yggVar.a = i2;
                    yggVar.f = z;
                    yggVar.g = zBooleanValue2;
                    yggVar.X = 5;
                    objI2 = b5p1.i(z4p1.F(new nwd(yzc0Var.j(), (byte) 11), 1), yggVar);
                    if (objI2 != obj2) {
                        int i13 = i2;
                        z2 = zBooleanValue2;
                        obj = objI2;
                        i3 = i13;
                        boolean z14 = z;
                        tv80Var = tv80VarE;
                        z3 = z14;
                        zuc0Var4 = zuc0Var3;
                        zBooleanValue3 = ((Boolean) obj).booleanValue();
                        uzc0Var2 = new uzc0(zuc0Var4.a);
                        yjp1Var2 = ujy0.a;
                        yggVar.b = null;
                        yggVar.c = null;
                        yggVar.d = null;
                        yggVar.e = tv80Var;
                        yggVar.a = i3;
                        yggVar.f = z3;
                        yggVar.g = z2;
                        yggVar.h = zBooleanValue3;
                        yggVar.X = 6;
                        if (yzc0Var.h(uzc0Var2, tv80Var, yjp1Var2, yggVar) != obj2) {
                            z6 = z2;
                            zuc0Var5 = null;
                            z7 = zBooleanValue3;
                            yggVar.b = zuc0Var5;
                            yggVar.c = zuc0Var5;
                            yggVar.d = zuc0Var5;
                            yggVar.e = zuc0Var5;
                            yggVar.a = i3;
                            yggVar.f = z3;
                            yggVar.g = z6;
                            yggVar.h = z7;
                            yggVar.X = 7;
                            if (o(z6, tv80Var, z7, yggVar) != obj2) {
                                return rih1Var;
                            }
                        }
                    }
                }
                return obj2;
            case 3:
                z4 = yggVar.g;
                z = yggVar.f;
                i4 = yggVar.a;
                tv80Var2 = yggVar.e;
                zuc0Var3 = yggVar.b;
                hm5.M(obj);
                ndj1Var = (ndj1) obj;
                if (u890.j(ndj1Var, ndj1.c)) {
                    if (u890.j(ndj1Var, ndj1.b)) {
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963769});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        this.i.k(new er91((fs91) null, "", 2131963769, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        return rih1Var;
                    }
                    if (!u890.j(ndj1Var, ndj1.a)) {
                        eg.o();
                        return null;
                    }
                    return rih1Var;
                }
                uzc0Var = new uzc0(zuc0Var3.a);
                yjp1Var = ujy0.a;
                yggVar.b = null;
                yggVar.c = null;
                yggVar.d = null;
                yggVar.e = tv80Var2;
                yggVar.a = i4;
                yggVar.f = z;
                yggVar.g = z4;
                yggVar.X = 4;
                if (yzc0Var.h(uzc0Var, tv80Var2, yjp1Var, yggVar) != obj2) {
                    tv80Var3 = tv80Var2;
                    e7p0.d(this.m, tv80Var3.a);
                    return rih1Var;
                }
                return obj2;
            case 4:
                tv80Var3 = yggVar.e;
                hm5.M(obj);
                e7p0.d(this.m, tv80Var3.a);
                return rih1Var;
            case 5:
                z2 = yggVar.g;
                z3 = yggVar.f;
                i3 = yggVar.a;
                tv80Var = yggVar.e;
                zuc0Var4 = yggVar.b;
                hm5.M(obj);
                zBooleanValue3 = ((Boolean) obj).booleanValue();
                uzc0Var2 = new uzc0(zuc0Var4.a);
                yjp1Var2 = ujy0.a;
                yggVar.b = null;
                yggVar.c = null;
                yggVar.d = null;
                yggVar.e = tv80Var;
                yggVar.a = i3;
                yggVar.f = z3;
                yggVar.g = z2;
                yggVar.h = zBooleanValue3;
                yggVar.X = 6;
                if (yzc0Var.h(uzc0Var2, tv80Var, yjp1Var2, yggVar) != obj2) {
                    z6 = z2;
                    zuc0Var5 = null;
                    z7 = zBooleanValue3;
                    yggVar.b = zuc0Var5;
                    yggVar.c = zuc0Var5;
                    yggVar.d = zuc0Var5;
                    yggVar.e = zuc0Var5;
                    yggVar.a = i3;
                    yggVar.f = z3;
                    yggVar.g = z6;
                    yggVar.h = z7;
                    yggVar.X = 7;
                    if (o(z6, tv80Var, z7, yggVar) != obj2) {
                        return rih1Var;
                    }
                }
                return obj2;
            case 6:
                z7 = yggVar.h;
                z6 = yggVar.g;
                z3 = yggVar.f;
                i3 = yggVar.a;
                tv80Var = yggVar.e;
                hm5.M(obj);
                zuc0Var5 = null;
                yggVar.b = zuc0Var5;
                yggVar.c = zuc0Var5;
                yggVar.d = zuc0Var5;
                yggVar.e = zuc0Var5;
                yggVar.a = i3;
                yggVar.f = z3;
                yggVar.g = z6;
                yggVar.h = z7;
                yggVar.X = 7;
                if (o(z6, tv80Var, z7, yggVar) != obj2) {
                    return obj2;
                }
                return rih1Var;
            case 7:
                hm5.M(obj);
                return rih1Var;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    /* JADX WARN: Code duplicated, block: B:35:0x012c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0150, code lost:
    
        if (p.ylt0.b(r3, r4, r5, r6, r7, r11, r9, r10, 64) == r12) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(int r18, p.zuc0 r19, p.vj90 r20, p.onm r21) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.chg.l(int, p.zuc0, p.vj90, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[PHI: r11 r13
      0x008c: PHI (r11v2 boolean) = (r11v0 boolean), (r11v0 boolean), (r11v1 boolean), (r11v1 boolean), (r11v17 boolean) binds: [B:19:0x0053, B:20:0x0055, B:25:0x0071, B:30:0x0089, B:16:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r13v2 boolean) = (r13v0 boolean), (r13v0 boolean), (r13v1 boolean), (r13v1 boolean), (r13v4 boolean) binds: [B:19:0x0053, B:20:0x0055, B:25:0x0071, B:30:0x0089, B:16:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(boolean z, tv80 tv80Var, boolean z2, onm onmVar) {
        bhg bhgVar;
        Object objC;
        boolean z3;
        boolean z4;
        boolean z5;
        z9k0 z9k0Var;
        if (onmVar instanceof bhg) {
            bhgVar = (bhg) onmVar;
            int i = bhgVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bhgVar.f = i - Integer.MIN_VALUE;
            } else {
                bhgVar = new bhg(this, onmVar);
            }
        } else {
            bhgVar = new bhg(this, onmVar);
        }
        Object objS = bhgVar.d;
        int i2 = bhgVar.f;
        rih1 rih1Var = rih1.a;
        kqi0 kqi0Var = this.h;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = bhgVar.b;
                z = bhgVar.a;
                tv80Var = bhgVar.c;
                hm5.M(objS);
                if (((Boolean) objS).booleanValue()) {
                    bhgVar.c = null;
                    bhgVar.a = z;
                    bhgVar.b = z2;
                    bhgVar.f = 2;
                    objC = this.o.c(this.e, z8k0.a, tv80Var, bhgVar);
                    if (objC != d9nVar) {
                        objC = rih1Var;
                    }
                    if (objC != d9nVar) {
                        bhgVar.c = null;
                        bhgVar.a = z;
                        bhgVar.b = z2;
                        bhgVar.f = 3;
                        objS = smo1.s(new oxj0(kqi0Var, null, (byte) 0), bhgVar);
                        if (objS != d9nVar) {
                            z3 = z2;
                        }
                    }
                } else {
                    bhgVar.c = null;
                    bhgVar.a = z;
                    bhgVar.b = z2;
                    bhgVar.f = 3;
                    objS = smo1.s(new oxj0(kqi0Var, null, (byte) 0), bhgVar);
                    if (objS != d9nVar) {
                        z3 = z2;
                    }
                }
                return d9nVar;
            }
            if (i2 == 2) {
                boolean z6 = bhgVar.b;
                boolean z7 = bhgVar.a;
                hm5.M(objS);
                z2 = z6;
                z = z7;
                bhgVar.c = null;
                bhgVar.a = z;
                bhgVar.b = z2;
                bhgVar.f = 3;
                objS = smo1.s(new oxj0(kqi0Var, null, (byte) 0), bhgVar);
                if (objS != d9nVar) {
                    z3 = z2;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = bhgVar.b;
            hm5.M(objS);
            if (((Boolean) objS).booleanValue() && z3) {
                if (this.a.b.current().getValue() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                l0l l0lVarC = this.j.c();
                z5 = l0lVarC != null ? !l0lVarC.l() : false;
                z9k0Var = this.v;
                if (z4) {
                    z9k0.a(z9k0Var, x9k0.a);
                    return rih1Var;
                }
                if (z5) {
                    z9k0.a(z9k0Var, v9k0.a);
                }
            }
            return rih1Var;
        }
        hm5.M(objS);
        if (z && z2) {
            bhgVar.c = tv80Var;
            bhgVar.a = z;
            bhgVar.b = z2;
            bhgVar.f = 1;
            objS = smo1.s(new oxj0(kqi0Var, null, (byte) 1), bhgVar);
            if (objS != d9nVar) {
                if (((Boolean) objS).booleanValue()) {
                    bhgVar.c = null;
                    bhgVar.a = z;
                    bhgVar.b = z2;
                    bhgVar.f = 2;
                    objC = this.o.c(this.e, z8k0.a, tv80Var, bhgVar);
                    if (objC != d9nVar) {
                        objC = rih1Var;
                    }
                    if (objC != d9nVar) {
                        bhgVar.c = null;
                        bhgVar.a = z;
                        bhgVar.b = z2;
                        bhgVar.f = 3;
                        objS = smo1.s(new oxj0(kqi0Var, null, (byte) 0), bhgVar);
                        if (objS != d9nVar) {
                            z3 = z2;
                            if (((Boolean) objS).booleanValue()) {
                                if (this.a.b.current().getValue() != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                l0l l0lVarC2 = this.j.c();
                                if (l0lVarC2 != null) {
                                }
                                z9k0Var = this.v;
                                if (z4) {
                                    z9k0.a(z9k0Var, x9k0.a);
                                    return rih1Var;
                                }
                                if (z5) {
                                    z9k0.a(z9k0Var, v9k0.a);
                                }
                            }
                            return rih1Var;
                        }
                    }
                } else {
                    bhgVar.c = null;
                    bhgVar.a = z;
                    bhgVar.b = z2;
                    bhgVar.f = 3;
                    objS = smo1.s(new oxj0(kqi0Var, null, (byte) 0), bhgVar);
                    if (objS != d9nVar) {
                        z3 = z2;
                        if (((Boolean) objS).booleanValue()) {
                            if (this.a.b.current().getValue() != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            l0l l0lVarC3 = this.j.c();
                            if (l0lVarC3 != null) {
                            }
                            z9k0Var = this.v;
                            if (z4) {
                                z9k0.a(z9k0Var, x9k0.a);
                                return rih1Var;
                            }
                            if (z5) {
                                z9k0.a(z9k0Var, v9k0.a);
                            }
                        }
                        return rih1Var;
                    }
                }
            }
        } else {
            bhgVar.c = null;
            bhgVar.a = z;
            bhgVar.b = z2;
            bhgVar.f = 3;
            objS = smo1.s(new oxj0(kqi0Var, null, (byte) 0), bhgVar);
            if (objS != d9nVar) {
                z3 = z2;
                if (((Boolean) objS).booleanValue()) {
                    if (this.a.b.current().getValue() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    l0l l0lVarC4 = this.j.c();
                    if (l0lVarC4 != null) {
                    }
                    z9k0Var = this.v;
                    if (z4) {
                        z9k0.a(z9k0Var, x9k0.a);
                        return rih1Var;
                    }
                    if (z5) {
                        z9k0.a(z9k0Var, v9k0.a);
                    }
                }
                return rih1Var;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum t(ak90 ak90Var, lnm lnmVar) {
        ahg ahgVar;
        if (lnmVar instanceof ahg) {
            ahgVar = (ahg) lnmVar;
            int i = ahgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahgVar.c = i - Integer.MIN_VALUE;
            } else {
                ahgVar = new ahg(this, (onm) lnmVar);
            }
        } else {
            ahgVar = new ahg(this, (onm) lnmVar);
        }
        Object obj = ahgVar.a;
        int i2 = ahgVar.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                if (!(ak90Var instanceof xj90)) {
                    return lk90.a;
                }
                zuc0 zuc0Var = ((xj90) ak90Var).b;
                int i3 = ((xj90) ak90Var).a;
                wj90 wj90Var = ((xj90) ak90Var).c;
                ahgVar.c = 1;
                Object objF = f(i3, zuc0Var, wj90Var, ahgVar);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
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
        } catch (Exception e2) {
            Logger.e(e2, "ClickInteraction failed during track row click handling", new Object[0]);
        }
        return lk90.b;
    }
}
