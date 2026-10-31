package p;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l6s implements Function, SingleOnSubscribe {
    public Object a;
    public Object b;
    public Object c;

    public l6s() {
        this.a = new vun();
        this.b = new vun();
        this.c = new vun();
    }

    public static final /* synthetic */ vun d(l6s l6sVar) {
        return (vun) l6sVar.c;
    }

    public static final /* synthetic */ vun e(l6s l6sVar) {
        return (vun) l6sVar.a;
    }

    public static final /* synthetic */ vun f(l6s l6sVar) {
        return (vun) l6sVar.b;
    }

    public static List m(dma1 dma1Var) {
        try {
            String strF = dma1Var.f(hje0.a);
            if (strF != null) {
                Iterable<oos0> iterable = (Iterable) nfa0.d.a(strF, new r36(oos0.Companion.serializer(), (byte) 0));
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                for (oos0 oos0Var : iterable) {
                    arrayList.add(new aoe0(oos0Var.c, oos0Var.a, oos0Var.b));
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return z6x.a;
    }

    public static void q(dma1 dma1Var, List list) {
        List<aoe0> list2 = list;
        nos0 nos0Var = oos0.Companion;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (aoe0 aoe0Var : list2) {
            nos0Var.getClass();
            arrayList.add(new oos0(aoe0Var.c, aoe0Var.a, aoe0Var.b));
        }
        String strB = nfa0.d.b(new r36(oos0.Companion.serializer(), (byte) 0), arrayList);
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.d(hje0.a, strB);
        hma1VarEdit.g();
    }

    public void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-156282854);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new a1t(this, (byte) 1);
                x340Var.s0(objT);
            }
            dgo1.c("YourLibraryMessagingPageComposer", (iu30) objT, apo.r(-1545190306, new b1t(this), x340Var), x340Var, 390);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b1t(this, i);
        }
    }

    public Object apply(Object obj) {
        Object em41Var;
        kvh1 kvh1Var = (mvh1) obj;
        dgs dgsVar = (dgs) this.a;
        if (kvh1Var instanceof jvh1) {
            em41Var = fm41.d;
        } else if (kvh1Var instanceof hvh1) {
            em41Var = new em41(new xk41(2, (n7r) null));
        } else if (kvh1Var instanceof kvh1) {
            n7r n7rVar = (n7r) o7h.t0(kvh1Var.a - 1, n7r.i);
            if (n7rVar == null) {
                n7rVar = n7r.a;
            }
            em41Var = new em41(new xk41(3, n7rVar));
        } else {
            if (!(kvh1Var instanceof ivh1)) {
                eg.o();
                return null;
            }
            em41Var = new em41(new xk41(4, (n7r) null));
        }
        return rqt0.F(dgsVar.o, new swn((Object) dgsVar, this.b, this.c, em41Var, (lnm) null, (byte) 15)).map(new lqr(kvh1Var, (byte) 6));
    }

    public void b(q160 q160Var, iu30 iu30Var, vu30 vu30Var, b0k b0kVar, int i) {
        l6s l6sVar;
        q160 q160Var2;
        iu30 iu30Var2;
        vu30 vu30Var2;
        iu30 iu30Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-420264612);
        int i2 = (x340Var.i(q160Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(vu30Var) ? 2048 : 1024) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                lvq lvqVar = (lvq) ((gvq) this.b).a.c;
                dj81 dj81VarP0 = lvqVar.b.p0();
                c8o.l(dj81VarP0);
                kvm1 kvm1Var = lvqVar.b;
                acq acqVarJ = kvm1Var.J();
                c8o.l(acqVarJ);
                String str = (String) lvqVar.l.get();
                evm1 evm1VarN = lvqVar.n();
                zwz0 zwz0VarW = kvm1Var.w();
                c8o.l(zwz0VarW);
                h1t h1tVar = new h1t(dj81VarP0, acqVarJ, str, evm1VarN, zwz0VarW, kvm1Var.n(), iu30Var);
                iu30Var3 = iu30Var;
                x340Var.s0(h1tVar);
                objT = h1tVar;
            } else {
                iu30Var3 = iu30Var;
            }
            h1t h1tVar2 = (h1t) objT;
            boolean zG = x340Var.g(q160Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                x0x0 x0x0Var = q160Var.c;
                objT2 = new ovm1(new nvm1(x0x0Var.c, x0x0Var.a, x0x0Var.b), q160Var.b, q160Var.d, ((z0t) this.c).a.f());
                x340Var.s0(objT2);
            }
            ovm1 ovm1Var = (ovm1) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = d0t.X;
                x340Var.s0(objT3);
            }
            q160Var2 = q160Var;
            iu30 iu30Var4 = iu30Var3;
            k40 k40Var = new k40(h1tVar2, ovm1Var, q160Var2, this, iu30Var4, vu30Var);
            l6sVar = this;
            iu30Var2 = iu30Var4;
            vu30Var2 = vu30Var;
            dgo1.c("your_library_page_header", (iu30) objT3, apo.r(-1822237792, k40Var, x340Var), x340Var, 438);
        } else {
            l6sVar = this;
            q160Var2 = q160Var;
            iu30Var2 = iu30Var;
            vu30Var2 = vu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(i, l6sVar, q160Var2, iu30Var2, vu30Var2, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public Object c(onm onmVar) {
        y8t y8tVar;
        if (onmVar instanceof y8t) {
            y8tVar = (y8t) onmVar;
            int i = y8tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8tVar.c = i - Integer.MIN_VALUE;
            } else {
                y8tVar = new y8t(this, onmVar);
            }
        } else {
            y8tVar = new y8t(this, onmVar);
        }
        Object objG = y8tVar.a;
        int i2 = y8tVar.c;
        if (i2 == 0) {
            hm5.M(objG);
            pp31 pp31Var = (op31) this.c;
            String str = (String) this.a;
            y8tVar.c = 1;
            objG = pp31Var.g(str, y8tVar);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objG);
        }
        py21 py21Var = (py21) objG;
        if (!(py21Var instanceof ly21)) {
            if (py21Var instanceof oy21) {
                return ouv.a;
            }
            eg.o();
            return null;
        }
        kt91 kt91Var = (kt91) this.b;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131955267});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", 2131955267, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        return quv.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(aoe0 aoe0Var, onm onmVar) {
        q6s q6sVar;
        if (onmVar instanceof q6s) {
            q6sVar = (q6s) onmVar;
            int i = q6sVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q6sVar.d = i - Integer.MIN_VALUE;
            } else {
                q6sVar = new q6s(this, onmVar);
            }
        } else {
            q6sVar = new q6s(this, onmVar);
        }
        Object objR = q6sVar.b;
        int i2 = q6sVar.d;
        if (i2 == 0) {
            hm5.M(objR);
            q6sVar.a = aoe0Var;
            q6sVar.d = 1;
            objR = r(q6sVar);
            Object obj = d9n.a;
            if (objR == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aoe0Var = q6sVar.a;
            hm5.M(objR);
        }
        dma1 dma1Var = (dma1) objR;
        List listSingletonList = Collections.singletonList(aoe0Var);
        List listM = m(dma1Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM) {
            if (!u890.j((aoe0) obj2, aoe0Var)) {
                arrayList.add(obj2);
            }
        }
        List listD1 = o7h.d1(o7h.N0(arrayList, listSingletonList), 30);
        q(dma1Var, listD1);
        return listD1;
    }

    public void h(int i, hmb0 hmb0Var) {
        vun vunVar = (vun) this.a;
        vun vunVar2 = (vun) this.b;
        vun vunVar3 = (vun) this.c;
        int iC = l1d.C(i);
        if (iC == 0) {
            vunVar.b(hmb0Var);
            vunVar3.b(hmb0Var);
            return;
        }
        if (iC == 1) {
            vunVar2.b(hmb0Var);
            vunVar3.b(hmb0Var);
            return;
        }
        if (iC == 2) {
            if (hmb0Var.i != null) {
                vunVar3.b(hmb0Var);
                return;
            } else {
                vunVar.b(hmb0Var);
                return;
            }
        }
        if (iC != 3) {
            eg.o();
        } else if (hmb0Var.i != null) {
            vunVar3.b(hmb0Var);
        } else {
            vunVar2.b(hmb0Var);
        }
    }

    public boolean i(hmb0 hmb0Var) {
        return !(hmb0Var.i == null) && (((hja1) ((vun) this.a).b).contains(hmb0Var) || ((hja1) ((vun) this.b).b).contains(hmb0Var));
    }

    public mxr j(Context context, LayoutInflater layoutInflater) {
        boolean zB = ((iy4) this.c).b();
        int i = zB ? 5 : 10;
        Integer num = zB ? 10 : null;
        List list = zB ? lwa1.a : lwa1.b;
        fp7 fp7Var = new fp7(context, zB);
        return new mxr(context, layoutInflater, new hwa1(new bnl1(new zml1(50, 350, i, 100), new anl1(new lss(fp7Var, (byte) 0), new lss(fp7Var, (byte) 1), num, zB)), list), new bgx(((xfx) this.a).i, (byte) 2), (mxr) this.b, fp7Var);
    }

    public boolean k() {
        return (((hja1) ((vun) this.c).b).isEmpty() || ((hja1) ((vun) this.a).b).isEmpty()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable l(onm onmVar) {
        r6s r6sVar;
        if (onmVar instanceof r6s) {
            r6sVar = (r6s) onmVar;
            int i = r6sVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r6sVar.d = i - Integer.MIN_VALUE;
            } else {
                r6sVar = new r6s(this, onmVar);
            }
        } else {
            r6sVar = new r6s(this, onmVar);
        }
        Object objR = r6sVar.b;
        int i2 = r6sVar.d;
        if (i2 == 0) {
            hm5.M(objR);
            r6sVar.a = this;
            r6sVar.d = 1;
            objR = r(r6sVar);
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = r6sVar.a;
            hm5.M(objR);
        }
        this.getClass();
        return (Serializable) m((dma1) objR);
    }

    public boolean n() {
        return !(((hja1) ((vun) this.a).b).isEmpty() && ((hja1) ((vun) this.c).b).isEmpty() && ((hja1) ((vun) this.b).b).isEmpty());
    }

    public String o() {
        c1l c1lVarG;
        l0l l0lVarC = ((g0l) this.a).c();
        if (l0lVarC == null || (c1lVarG = l0lVarC.G()) == null) {
            return null;
        }
        String str = c1lVarG.a;
        i8h1 i8h1Var = (i8h1) this.b;
        e0m0 e0m0Var = (e0m0) this.c;
        x6h1 x6h1VarC = e0m0Var.b.c();
        x6h1VarC.i.add(new a7h1("disable_connect_option", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("disconnect_from_remote_device", 1, Collections.singletonMap("remote_device_id", str)), x6h1VarC.a(), e0m0Var.a, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public void p() {
        i8h1 i8h1Var = (i8h1) this.b;
        e0m0 e0m0Var = (e0m0) this.c;
        x6h1 x6h1VarC = e0m0Var.b.c();
        x6h1VarC.i.add(new a7h1("remove_sleep_timer", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        String str = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_sleep_timer", 1, b7xVar), y6h1VarA, e0m0Var.a, System.currentTimeMillis()), (xj61) null).a.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(onm onmVar) {
        s6s s6sVar;
        if (onmVar instanceof s6s) {
            s6sVar = (s6s) onmVar;
            int i = s6sVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s6sVar.c = i - Integer.MIN_VALUE;
            } else {
                s6sVar = new s6s(this, onmVar);
            }
        } else {
            s6sVar = new s6s(this, onmVar);
        }
        Object objJ = s6sVar.a;
        int i2 = s6sVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            mr20 mr20Var = (mr20) this.c;
            jte jteVar = new jte(2, (lnm) null, (byte) 19);
            s6sVar.c = 1;
            objJ = b5p1.j(mr20Var, jteVar, s6sVar);
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
        return ((ut71) this.a).b((Context) this.b, ((th61) objJ).a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable s(aoe0 aoe0Var, onm onmVar) {
        t6s t6sVar;
        if (onmVar instanceof t6s) {
            t6sVar = (t6s) onmVar;
            int i = t6sVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t6sVar.d = i - Integer.MIN_VALUE;
            } else {
                t6sVar = new t6s(this, onmVar);
            }
        } else {
            t6sVar = new t6s(this, onmVar);
        }
        Object objR = t6sVar.b;
        int i2 = t6sVar.d;
        if (i2 == 0) {
            hm5.M(objR);
            t6sVar.a = aoe0Var;
            t6sVar.d = 1;
            objR = r(t6sVar);
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aoe0Var = t6sVar.a;
            hm5.M(objR);
        }
        dma1 dma1Var = (dma1) objR;
        List listM = m(dma1Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (!u890.j((aoe0) obj, aoe0Var)) {
                arrayList.add(obj);
            }
        }
        q(dma1Var, arrayList);
        return arrayList;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        mw40 mw40Var = (mw40) ((vu30) this.a).invoke(new nw40(0, (Activity) ((hur) this.b).b), new vas(singleEmitter, (byte) 15));
        mw40Var.h = new kqs(singleEmitter, this.c, (byte) 0);
        mw40Var.e = false;
        pw40 pw40VarB = mw40Var.b();
        singleEmitter.setCancellable(new ci0(pw40VarB, (byte) 2));
        pw40VarB.b();
    }

    public void t(hmb0 hmb0Var) {
        ((vun) this.a).f(hmb0Var);
        ((vun) this.b).f(hmb0Var);
        ((vun) this.c).f(hmb0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r0.b(r7, r2) == r6) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object u(boolean r20, p.onm r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof p.v2t
            if (r2 == 0) goto L17
            r2 = r1
            p.v2t r2 = (p.v2t) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            p.v2t r2 = new p.v2t
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.b
            int r3 = r2.d
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2e
            p.hm5.M(r1)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L87
            goto L96
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L35:
            boolean r3 = r2.a
            p.hm5.M(r1)
            r15 = r3
            goto L57
        L3c:
            p.hm5.M(r1)
            java.lang.Object r1 = r0.c
            p.mr20 r1 = (p.mr20) r1
            p.x3s r3 = new p.x3s
            r7 = 3
            r3.<init>(r1, r7)
            r1 = r20
            r2.a = r1
            r2.d = r5
            java.lang.Object r3 = p.b5p1.i(r3, r2)
            if (r3 != r6) goto L56
            goto L84
        L56:
            r15 = r1
        L57:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "Referrer matching: reporting unattempted match — referrer available=%b"
            com.spotify.base.java.logging.Logger.g(r3, r1)
            java.lang.Object r0 = r0.a     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L87
            p.t2t r0 = (p.t2t) r0     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L87
            p.z8h0 r7 = new p.z8h0     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L87
            r17 = 0
            r18 = 832(0x340, float:1.166E-42)
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r7.<init>(r8, r9, r10, r12, r13, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L87
            r2.a = r15     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L87
            r2.d = r4     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L87
            java.lang.Object r0 = r0.b(r7, r2)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L87
            if (r0 != r6) goto L96
        L84:
            return r6
        L85:
            r0 = move-exception
            goto L89
        L87:
            r0 = move-exception
            goto L99
        L89:
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Referrer matching: result reporting failed: %s"
            com.spotify.base.java.logging.Logger.d(r1, r0)
        L96:
            p.rih1 r0 = p.rih1.a
            return r0
        L99:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l6s.u(boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object v(v8h0 v8h0Var, long j, boolean z, onm onmVar) {
        w2t w2tVar;
        if (onmVar instanceof w2t) {
            w2tVar = (w2t) onmVar;
            int i = w2tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w2tVar.c = i - Integer.MIN_VALUE;
            } else {
                w2tVar = new w2t(this, onmVar);
            }
        } else {
            w2tVar = new w2t(this, onmVar);
        }
        Object obj = w2tVar.a;
        int i2 = w2tVar.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Logger.g("Referrer matching: reporting match result — success=%b", new Object[]{Boolean.valueOf(v8h0Var.a)});
                t2t t2tVar = (t2t) this.a;
                z8h0 z8h0Var = new z8h0(v8h0Var.a, v8h0Var.c, v8h0Var.d, v8h0Var.b, ((yqg) this.b).b() - j, z, v8h0Var.e, v8h0Var.f, 65);
                w2tVar.c = 1;
                Object objB = t2tVar.b(z8h0Var, w2tVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
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
            Logger.d("Referrer matching: result reporting failed: %s", new Object[]{e2.getMessage()});
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(lnm lnmVar) {
        cls clsVar;
        if (lnmVar instanceof cls) {
            clsVar = (cls) lnmVar;
            int i = clsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                clsVar.c = i - Integer.MIN_VALUE;
            } else {
                clsVar = new cls(this, lnmVar);
            }
        } else {
            clsVar = new cls(this, lnmVar);
        }
        Object objJ = clsVar.a;
        int i2 = clsVar.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleO = ((r0s0) this.b).o();
            clsVar.c = 1;
            objJ = fc11.j(singleO, clsVar);
            if (objJ != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objJ);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objJ);
        if (((Boolean) objJ).booleanValue()) {
            q741 q741Var = (q741) this.c;
            clsVar.c = 2;
            if (q741Var.a(f841.b, clsVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object x(String str, onm onmVar) throws IOException {
        y2t y2tVar;
        long jB;
        v8h0 v8h0Var;
        if (onmVar instanceof y2t) {
            y2tVar = (y2t) onmVar;
            int i = y2tVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y2tVar.f = i - Integer.MIN_VALUE;
            } else {
                y2tVar = new y2t(this, onmVar);
            }
        } else {
            y2tVar = new y2t(this, onmVar);
        }
        y2t y2tVar2 = y2tVar;
        Object objA = y2tVar2.d;
        int i2 = y2tVar2.f;
        Object obj = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                x3s x3sVar = new x3s((mr20) this.c, (byte) 4);
                y2tVar2.a = str;
                y2tVar2.f = 1;
                if (b5p1.i(x3sVar, y2tVar2) != obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                str = y2tVar2.a;
                hm5.M(objA);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v8h0 v8h0Var2 = y2tVar2.b;
                    hm5.M(objA);
                    return v8h0Var2;
                }
                long j = y2tVar2.c;
                hm5.M(objA);
                jB = j;
            }
            v8h0Var = (v8h0) objA;
            y2tVar2.a = null;
            y2tVar2.b = v8h0Var;
            y2tVar2.c = jB;
            y2tVar2.f = 3;
            if (v(v8h0Var, jB, true, y2tVar2) != obj) {
                return obj;
            }
            return v8h0Var;
            jB = ((yqg) this.b).b();
            t2t t2tVar = (t2t) this.a;
            t8h0 t8h0Var = new t8h0(str);
            y2tVar2.a = null;
            y2tVar2.c = jB;
            y2tVar2.f = 2;
            objA = t2tVar.a(t8h0Var, y2tVar2);
            if (objA != obj) {
                v8h0Var = (v8h0) objA;
                y2tVar2.a = null;
                y2tVar2.b = v8h0Var;
                y2tVar2.c = jB;
                y2tVar2.f = 3;
                if (v(v8h0Var, jB, true, y2tVar2) != obj) {
                    return v8h0Var;
                }
            }
            return obj;
        } catch (IOException e) {
            Logger.d("Referrer matching transport failure: %s", new Object[]{e.getMessage()});
            throw e;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.d("Referrer matching from install referrer failed: %s", new Object[]{e3.getMessage()});
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object y(String str, List list, onm onmVar) {
        jos josVar;
        m231 m231Var;
        z1s z1sVar = (z1s) this.c;
        if (onmVar instanceof jos) {
            josVar = (jos) onmVar;
            int i = josVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                josVar.c = i - Integer.MIN_VALUE;
            } else {
                josVar = new jos(this, onmVar);
            }
        } else {
            josVar = new jos(this, onmVar);
        }
        Object obj = josVar.a;
        int i2 = josVar.c;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                pp90 pp90Var = (pp90) ((c9c0) this.a).b.current().getValue();
                if (pp90Var == null || pp90Var.h.b.e) {
                    cn30 cn30Var = (cn30) this.b;
                    josVar.c = 1;
                    Object objA = cn30Var.a(str, list, josVar);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    z1sVar.a(new wi70(str));
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            z1sVar.a(vi70.c);
        }
        return m231Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(qo90 qo90Var, onm onmVar) {
        zhs zhsVar;
        if (onmVar instanceof zhs) {
            zhsVar = (zhs) onmVar;
            int i = zhsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zhsVar.d = i - Integer.MIN_VALUE;
            } else {
                zhsVar = new zhs(this, onmVar);
            }
        } else {
            zhsVar = new zhs(this, onmVar);
        }
        Object obj = zhsVar.b;
        int i2 = zhsVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            byp bypVar = (byp) this.a;
            aca0 aca0Var = new aca0(qo90Var.b.contains(ko90.c) ? new wea0(xea0.t) : new wea0(xea0.i), qo90Var);
            zhsVar.a = qo90Var;
            zhsVar.d = 1;
            Object objB = bypVar.B((String) null, aca0Var, zhsVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qo90Var = zhsVar.a;
            hm5.M(obj);
        }
        n36 n36Var = ((eis) this.c).a;
        if (n36Var.c > 10) {
            n36Var.removeFirst();
        }
        n36Var.addLast(new gp90(qo90Var.c));
        hma1 hma1VarEdit = ((g5s) this.b).a.edit();
        hma1VarEdit.a(h5s.a, true);
        hma1VarEdit.g();
        return rih1.a;
    }

    public /* synthetic */ l6s(boolean z, Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public l6s(Context context, Handler handler) {
        this.a = context;
        this.c = new p2a(this, handler, (byte) 1);
    }

    public /* synthetic */ l6s(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
