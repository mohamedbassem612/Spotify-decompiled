package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.collection2.itemdata.proto.CollectionItemdata;
import com.spotify.list_collection.save_source.proto.SaveSource;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import spotify.collection.esperanto.proto.CollectionAddRemoveItem;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ams implements xpw {
    public final ia00 X;
    public final psw Y;
    public final iyc0 a;
    public final vlo b;
    public final zwm1 c;
    public final il20 d;
    public final g7h e;
    public final r5h f;
    public final d0r g;
    public final o3r h;
    public final o3r i;
    public final js20 t;

    public ams(iyc0 iyc0Var, vlo vloVar, zwm1 zwm1Var, il20 il20Var, agc0 agc0Var, xrm1 xrm1Var, g7h g7hVar, r5h r5hVar, d0r d0rVar) {
        this.a = iyc0Var;
        this.b = vloVar;
        this.c = zwm1Var;
        this.d = il20Var;
        this.e = g7hVar;
        this.f = r5hVar;
        this.g = d0rVar;
        jd11 jd11Var = rc11.a;
        this.h = w3p1.o(new l4r(new xv00(jd11Var.b(uio.class)), 1, mls.t, new j4r(mls.d), mls.X), mls.e);
        this.i = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 1, mls.Y, new j4r(mls.f), mls.Z), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, mls.h, new j4r(mls.g), mls.i), szr.O0);
        this.t = x3p1.n(new wsr(1, this, ams.class, "getState", "getState(Lcom/spotify/alignedcuration/firstsave/page/contents/DefaultSaveDestinationElement$Props;)Lkotlinx/coroutines/flow/Flow;", 0, (byte) 10), mls.c, szr.N0, (o8n) null, new vas(this, (byte) 12), 8);
        this.X = n3o1.q(this).a(njs.f, njs.g);
        j2i j2iVar = new j2i(-641658367, new i6r(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
    }

    public static CollectionAddRemoveItemsRequest l(String str, ou80 ou80Var) {
        b0h b0hVarN = CollectionAddRemoveItem.n();
        b0hVarN.r(str);
        if (ou80Var != null) {
            h4h h4hVarT = CollectionItemdata.ItemData.t();
            oc41 oc41VarP = SaveSource.p();
            oc41VarP.n(ou80Var.a);
            h4hVarT.q(oc41VarP);
            b0hVarN.n((CollectionItemdata.ItemData) h4hVarT.build());
        }
        CollectionAddRemoveItem collectionAddRemoveItem = (CollectionAddRemoveItem) b0hVarN.build();
        c0h c0hVarQ = CollectionAddRemoveItemsRequest.q();
        c0hVarQ.n(Collections.singletonList(collectionAddRemoveItem));
        return c0hVarQ.build();
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.Y;
    }

    public final void e(String str, String str2, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1098503368);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = z ? zw51.b : zw51.c;
                b0kVar3.s0(objT);
            }
            zw51 zw51Var = (zw51) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N(str, u291.f(qim0Var3, 1.0f));
            uvx uvxVar = new uvx(1, (pgx) null, 3, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
            String strK = z ? x0d.k(b0kVar3, -2135289987, 2131952233, b0kVar3, false) : x0d.k(b0kVar3, -2135128384, 2131952232, b0kVar3, false);
            boolean z3 = (i4 == 256) | ((i3 & 7168) == 2048);
            Object objT2 = b0kVar3.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new z20(z, iu30Var, (byte) 11);
                b0kVar3.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(strK)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strK), function0), (gbx) null, (xu30) null, apo.r(-1359823681, new xo6(str2, str, (byte) 4), b0kVar3), (xu30) null, (xu30) null, apo.r(1998612161, new b1s(zw51Var, (byte) 16), b0kVar3), (xu30) null, (xu30) null, apo.r(1358483716, new kaf(str, (byte) 24), b0kVar3), b0kVar2, 805306432, 196992, 28092);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(this, str, str2, z, iu30Var, qim0Var2, i);
        }
    }

    public final void f(qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1738104639);
        int i2 = i | 6;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(b0kVar3).a.a.c();
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("shimmer_save_row", u291.f(qim0Var3, 1.0f)), new uvx(1, (pgx) null, 3, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-55057610, new r7j(jC, cr31VarB, (byte) 2), b0kVar3), (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(255347579, new rvh((byte) 4, jC), b0kVar3), b0kVar2, 805306432, 196608, 32252);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new g1o(this, qim0Var2, i, (byte) 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object g(String str, onm onmVar) throws Throwable {
        pls plsVar;
        uio m231Var;
        if (onmVar instanceof pls) {
            plsVar = (pls) onmVar;
            int i = plsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                plsVar.d = i - Integer.MIN_VALUE;
            } else {
                plsVar = new pls(this, onmVar);
            }
        } else {
            plsVar = new pls(this, onmVar);
        }
        Object objO = plsVar.b;
        int i2 = plsVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                if (!this.b.a(str)) {
                    return null;
                }
                n5s n5sVar = new n5s(this, str, (lnm) null, (byte) 8);
                plsVar.a = str;
                plsVar.d = 1;
                objO = rc2.O(5000L, n5sVar, plsVar);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = plsVar.a;
                hm5.M(objO);
            }
            i1r i1rVar = (k1r) objO;
            if (i1rVar == null) {
                Logger.k("DefaultSaveDestinationElement", new Object[]{"Timed out resolving curation trait for " + str});
            }
            i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
            m231Var = i1rVar2 != null ? (uio) i1rVar2.a : null;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            return m231Var;
        }
        if (thA instanceof CancellationException) {
            throw thA;
        }
        return null;
    }

    public final mqw getBehavior() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(String str, gls glsVar, onm onmVar) {
        wls wlsVar;
        if (onmVar instanceof wls) {
            wlsVar = (wls) onmVar;
            int i = wlsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wlsVar.c = i - Integer.MIN_VALUE;
            } else {
                wlsVar = new wls(this, onmVar);
            }
        } else {
            wlsVar = new wls(this, onmVar);
        }
        wls wlsVar2 = wlsVar;
        Object obj = wlsVar2.a;
        int i2 = wlsVar2.c;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        il20 il20Var = this.d;
        tv80 tv80Var = il20Var.f;
        ou80 ou80Var = tv80Var != null ? tv80Var.a : null;
        zxc0 zxc0Var = ou80Var != null ? new zxc0(ou80Var) : null;
        boolean z = glsVar instanceof els;
        d9n d9nVar = d9n.a;
        if (z) {
            List listSingletonList = Collections.singletonList(str);
            String str2 = il20Var.c;
            String str3 = ((els) glsVar).a;
            String str4 = il20Var.d;
            wlsVar2.c = 1;
            if (this.a.d(str3, listSingletonList, str2, str4, zxc0Var, wlsVar2) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (!(glsVar instanceof fls)) {
            eg.o();
            return null;
        }
        Single singleA = this.f.a(l(str, ou80Var));
        wlsVar2.c = 2;
        if (fc11.j(singleA, wlsVar2) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, gls glsVar, onm onmVar) {
        xls xlsVar;
        if (onmVar instanceof xls) {
            xlsVar = (xls) onmVar;
            int i = xlsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xlsVar.c = i - Integer.MIN_VALUE;
            } else {
                xlsVar = new xls(this, onmVar);
            }
        } else {
            xlsVar = new xls(this, onmVar);
        }
        Object obj = xlsVar.a;
        int i2 = xlsVar.c;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        tv80 tv80Var = this.d.f;
        boolean z = glsVar instanceof els;
        d9n d9nVar = d9n.a;
        if (z) {
            List listSingletonList = Collections.singletonList(str);
            String str2 = ((els) glsVar).a;
            xlsVar.c = 1;
            if (this.a.l(str2, listSingletonList, xlsVar, tv80Var) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (!(glsVar instanceof fls)) {
            eg.o();
            return null;
        }
        Single singleC = this.f.c(l(str, tv80Var != null ? tv80Var.a : null));
        xlsVar.c = 2;
        if (fc11.j(singleC, xlsVar) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, String str2, onm onmVar) throws Throwable {
        yls ylsVar;
        if (onmVar instanceof yls) {
            ylsVar = (yls) onmVar;
            int i = ylsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ylsVar.e = i - Integer.MIN_VALUE;
            } else {
                ylsVar = new yls(this, onmVar);
            }
        } else {
            ylsVar = new yls(this, onmVar);
        }
        Object objG = ylsVar.c;
        int i2 = ylsVar.e;
        if (i2 == 0) {
            hm5.M(objG);
            if (!this.b.a(str)) {
                return new ols(str2, str);
            }
            ylsVar.a = str;
            ylsVar.b = str2;
            ylsVar.e = 1;
            objG = g(str, ylsVar);
            Object obj = d9n.a;
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = ylsVar.b;
            str = ylsVar.a;
            hm5.M(objG);
        }
        uio uioVar = (uio) objG;
        if (uioVar == null) {
            return new ols(str2, str);
        }
        String str3 = uioVar.a;
        if (str3.length() != 0) {
            str = str3;
        }
        two1 two1Var = uioVar.b;
        if (two1Var instanceof rio) {
            str2 = ((rio) two1Var).c;
        }
        return new ols(str2, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable k(String str, blc0 blc0Var, onm onmVar) throws Throwable {
        zls zlsVar;
        if (onmVar instanceof zls) {
            zlsVar = (zls) onmVar;
            int i = zlsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zlsVar.c = i - Integer.MIN_VALUE;
            } else {
                zlsVar = new zls(this, onmVar);
            }
        } else {
            zlsVar = new zls(this, onmVar);
        }
        Object objJ = zlsVar.a;
        int i2 = zlsVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            String str2 = blc0Var == blc0.ti ? "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ" : "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt";
            zlsVar.c = 1;
            objJ = j(str, str2, zlsVar);
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
        ols olsVar = (ols) objJ;
        return new mmr0(new els(olsVar.a), olsVar.b);
    }
}
