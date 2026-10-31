package p;

import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gvy implements yt11 {
    public final d0r a;
    public final lzn0 b;
    public final String c;
    public final uu00 d;
    public final vgm e;
    public final mcn1 f;
    public final ylt0 g;
    public final o3r h;
    public final vvu i;
    public final ay8 j;
    public final o3r k = w3p1.o(new l4r(pwc0.b, 2, auy.t, new j4r(auy.f), auy.X), auy.g);

    public gvy(d0r d0rVar, lzn0 lzn0Var, String str, uu00 uu00Var, vgm vgmVar, mcn1 mcn1Var, yzc0 yzc0Var, r0s0 r0s0Var, a5m a5mVar, lc20 lc20Var) {
        this.a = d0rVar;
        this.b = lzn0Var;
        this.c = str;
        this.d = uu00Var;
        this.e = vgmVar;
        this.f = mcn1Var;
        this.g = r0s0Var.r(new ult0(yzc0Var));
        this.h = q3p1.n(p7h.M(new o3r[]{a5mVar.a, (o3r) lc20Var.d}), new pm0(yty.d, (byte) 2));
        this.i = new vvu(d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, auy.Y, new j4r(auy.h), auy.Z), auy.i), str), (byte) 13);
        this.j = vxo1.l(d0rVar, str);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x0141  */
    /* JADX WARN: Code duplicated, block: B:57:0x0144  */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0168 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        evy evyVar;
        Object objE;
        int i;
        String str;
        int i2;
        g3d0 g3d0Var;
        Object objI;
        tv80 tv80Var2;
        g3d0 g3d0Var2;
        bs50 bs50Var;
        sr1 sr1Var;
        tv80 tv80Var3;
        jo70 jo70Var;
        io70 io70Var;
        bs50 bs50Var2;
        piu piuVar;
        tv80 tv80Var4 = tv80Var;
        if (onmVar instanceof evy) {
            evyVar = (evy) onmVar;
            int i3 = evyVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                evyVar.g = i3 - Integer.MIN_VALUE;
            } else {
                evyVar = new evy(this, onmVar);
            }
        } else {
            evyVar = new evy(this, onmVar);
        }
        evy evyVar2 = evyVar;
        Object obj = evyVar2.e;
        int i4 = evyVar2.g;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        Object obj2 = d9n.a;
        switch (i4) {
            case 0:
                hm5.M(obj);
                if (unb1Var instanceof jmb1) {
                    jmb1 jmb1Var = (jmb1) unb1Var;
                    if (jmb1Var.b.y == ktl.b) {
                        evyVar2.a = null;
                        evyVar2.g = 1;
                        if (d(jmb1Var, tv80Var4, evyVar2) == obj2) {
                        }
                    } else {
                        String str2 = jmb1Var.a.a;
                        Set set = s4b1.f;
                        int i5 = (uic.g(str2, blc0.ed) || uic.g(str2, blc0.M3)) ? 1 : 0;
                        if (i5 != 0) {
                            evyVar2.a = tv80Var4;
                            evyVar2.b = str2;
                            evyVar2.d = i5;
                            evyVar2.g = 2;
                            Object objK = b5p1.k(this.i, evyVar2);
                            if (objK != obj2) {
                                str = str2;
                                i2 = i5;
                                obj = objK;
                                g3d0Var = (g3d0) obj;
                                vvu vvuVar = new vvu(this.j, (byte) 12);
                                evyVar2.a = tv80Var4;
                                evyVar2.b = str;
                                evyVar2.c = g3d0Var;
                                evyVar2.d = i2;
                                evyVar2.g = 3;
                                objI = b5p1.i(vvuVar, evyVar2);
                                if (objI != obj2) {
                                    tv80Var2 = tv80Var4;
                                    g3d0Var2 = g3d0Var;
                                    obj = objI;
                                    int i6 = i2;
                                    Bundle bundleH = mno1.h(new mmr0[]{new mmr0("extra_playback_context_uri", this.c), new mmr0("extra_sort_order", g3d0Var2), new mmr0("extra_filters", new ArrayList((Set) obj))});
                                    fns fnsVar = igu.a;
                                    bs50Var = pyf0.a;
                                    sr1Var = new sr1(tv80Var2, this, str, bundleH, (lnm) null, (byte) 18);
                                    evyVar2.a = null;
                                    evyVar2.b = null;
                                    evyVar2.c = null;
                                    evyVar2.d = i6;
                                    evyVar2.g = 4;
                                    if (fn31.Y(bs50Var, sr1Var, evyVar2) != obj2) {
                                    }
                                }
                            }
                        } else {
                            evyVar2.a = tv80Var4;
                            evyVar2.b = null;
                            evyVar2.d = i5;
                            evyVar2.g = 5;
                            objE = e(this.d, str2, evyVar2);
                            if (objE != obj2) {
                                i = i5;
                                tv80Var3 = tv80Var4;
                                jo70Var = (jo70) objE;
                                if (jo70Var != null) {
                                    io70Var = jo70Var.e;
                                } else {
                                    io70Var = null;
                                }
                                if (io70Var != null) {
                                    String str3 = io70Var.b;
                                    fns fnsVar2 = igu.a;
                                    bs50Var2 = pyf0.a;
                                    piuVar = new piu((Object) this, str3, (Parcelable) tv80Var3, lnmVar, (byte) 9);
                                    evyVar2.a = null;
                                    evyVar2.b = null;
                                    evyVar2.c = null;
                                    evyVar2.d = i;
                                    evyVar2.g = 6;
                                    if (fn31.Y(bs50Var2, piuVar, evyVar2) == obj2) {
                                    }
                                }
                            }
                        }
                    }
                    return obj2;
                }
                return rih1Var;
            case 1:
                hm5.M(obj);
                return rih1Var;
            case 2:
                i2 = evyVar2.d;
                String str4 = evyVar2.b;
                tv80 tv80Var5 = evyVar2.a;
                hm5.M(obj);
                str = str4;
                tv80Var4 = tv80Var5;
                g3d0Var = (g3d0) obj;
                vvu vvuVar2 = new vvu(this.j, (byte) 12);
                evyVar2.a = tv80Var4;
                evyVar2.b = str;
                evyVar2.c = g3d0Var;
                evyVar2.d = i2;
                evyVar2.g = 3;
                objI = b5p1.i(vvuVar2, evyVar2);
                if (objI != obj2) {
                    tv80Var2 = tv80Var4;
                    g3d0Var2 = g3d0Var;
                    obj = objI;
                    int i7 = i2;
                    Bundle bundleH2 = mno1.h(new mmr0[]{new mmr0("extra_playback_context_uri", this.c), new mmr0("extra_sort_order", g3d0Var2), new mmr0("extra_filters", new ArrayList((Set) obj))});
                    fns fnsVar3 = igu.a;
                    bs50Var = pyf0.a;
                    sr1Var = new sr1(tv80Var2, this, str, bundleH2, (lnm) null, (byte) 18);
                    evyVar2.a = null;
                    evyVar2.b = null;
                    evyVar2.c = null;
                    evyVar2.d = i7;
                    evyVar2.g = 4;
                    if (fn31.Y(bs50Var, sr1Var, evyVar2) != obj2) {
                        return rih1Var;
                    }
                }
                return obj2;
            case 3:
                i2 = evyVar2.d;
                g3d0Var2 = evyVar2.c;
                str = evyVar2.b;
                tv80Var2 = evyVar2.a;
                hm5.M(obj);
                int i8 = i2;
                Bundle bundleH3 = mno1.h(new mmr0[]{new mmr0("extra_playback_context_uri", this.c), new mmr0("extra_sort_order", g3d0Var2), new mmr0("extra_filters", new ArrayList((Set) obj))});
                fns fnsVar4 = igu.a;
                bs50Var = pyf0.a;
                sr1Var = new sr1(tv80Var2, this, str, bundleH3, (lnm) null, (byte) 18);
                evyVar2.a = null;
                evyVar2.b = null;
                evyVar2.c = null;
                evyVar2.d = i8;
                evyVar2.g = 4;
                if (fn31.Y(bs50Var, sr1Var, evyVar2) != obj2) {
                    return obj2;
                }
                return rih1Var;
            case 4:
                hm5.M(obj);
                return rih1Var;
            case 5:
                int i9 = evyVar2.d;
                tv80Var4 = evyVar2.a;
                hm5.M(obj);
                i = i9;
                objE = obj;
                tv80Var3 = tv80Var4;
                jo70Var = (jo70) objE;
                if (jo70Var != null) {
                    io70Var = jo70Var.e;
                } else {
                    io70Var = null;
                }
                if (io70Var != null) {
                    String str5 = io70Var.b;
                    fns fnsVar5 = igu.a;
                    bs50Var2 = pyf0.a;
                    piuVar = new piu((Object) this, str5, (Parcelable) tv80Var3, lnmVar, (byte) 9);
                    evyVar2.a = null;
                    evyVar2.b = null;
                    evyVar2.c = null;
                    evyVar2.d = i;
                    evyVar2.g = 6;
                    if (fn31.Y(bs50Var2, piuVar, evyVar2) == obj2) {
                        return obj2;
                    }
                }
                return rih1Var;
            case 6:
                io70 io70Var2 = evyVar2.c;
                hm5.M(obj);
                return rih1Var;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public final s9d1 b() {
        return null;
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        if ((unb1Var instanceof jmb1) && tv80Var != null) {
            i1r i1rVarN = x2p1.n(this.a, this.k, this.c);
            i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
            wqy wqyVarA = this.f.a(i1rVar != null ? (qxc0) i1rVar.a : null);
            fns fnsVar = igu.a;
            Object objY = fn31.Y(pyf0.a, new sr1(this, unb1Var, tv80Var, wqyVarA, (lnm) null, (byte) 19), onmVar);
            if (objY == d9n.a) {
                return objY;
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object d(jmb1 jmb1Var, tv80 tv80Var, onm onmVar) {
        bvy bvyVar;
        String str;
        Object obj;
        jmb1 jmb1Var2;
        avy avyVar;
        tv80 tv80Var2 = tv80Var;
        if (onmVar instanceof bvy) {
            bvyVar = (bvy) onmVar;
            int i = bvyVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bvyVar.f = i - Integer.MIN_VALUE;
            } else {
                bvyVar = new bvy(this, onmVar);
            }
        } else {
            bvyVar = new bvy(this, onmVar);
        }
        bvy bvyVar2 = bvyVar;
        Object obj2 = bvyVar2.d;
        int i2 = bvyVar2.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            uv11 uv11Var = jmb1Var.a;
            str = uv11Var.d;
            if (str != null && tv80Var2 != null) {
                ay8 ay8VarF = d3p1.F(this.a, this.h, new h1q0(this.c, uv11Var.a, str));
                afv afvVar = new afv(2, null, (byte) 5);
                bvyVar2.a = jmb1Var;
                bvyVar2.b = tv80Var2;
                bvyVar2.c = str;
                bvyVar2.f = 1;
                Object objJ = b5p1.j(ay8VarF, afvVar, bvyVar2);
                if (objJ != d9nVar) {
                    obj = objJ;
                    jmb1Var2 = jmb1Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str2 = bvyVar2.c;
        tv80Var2 = bvyVar2.b;
        jmb1 jmb1Var3 = bvyVar2.a;
        hm5.M(obj2);
        str = str2;
        obj = obj2;
        jmb1Var2 = jmb1Var3;
        tv80 tv80Var3 = tv80Var2;
        i1r i1rVar = (k1r) obj;
        if (!(i1rVar instanceof i1r)) {
            if (i1rVar instanceof h1r) {
                avyVar = new avy(x4m.a, q840.a);
            }
        }
        avyVar = (avy) i1rVar.a;
        avy avyVar2 = avyVar;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        ary aryVar = new ary((byte) 1, this, jmb1Var2, str, avyVar2, tv80Var3, (lnm) null);
        bvyVar2.a = null;
        bvyVar2.b = null;
        bvyVar2.c = null;
        bvyVar2.f = 2;
        return fn31.Y(bs50Var, aryVar, bvyVar2) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(uu00 uu00Var, String str, onm onmVar) {
        cvy cvyVar;
        if (onmVar instanceof cvy) {
            cvyVar = (cvy) onmVar;
            int i = cvyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cvyVar.d = i - Integer.MIN_VALUE;
            } else {
                cvyVar = new cvy(this, onmVar);
            }
        } else {
            cvyVar = new cvy(this, onmVar);
        }
        Object objL = cvyVar.b;
        int i2 = cvyVar.d;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableFilter = ((zu00) uu00Var).b(new oi("EntitySegmentsPlaylistRowEventsHandlerMetadataLoader", false, new kov(str, (byte) 19))).filter(bbn.b1);
            cvyVar.a = str;
            cvyVar.d = 1;
            objL = fc11.l(observableFilter, 1, (Object) null, cvyVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cvyVar.a;
            hm5.M(objL);
        }
        return ((uv00) objL).a(jo70.class, str).b;
    }
}
