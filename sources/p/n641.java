package p;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.spotify.ads.esperanto.proto.SetRequestHeadersRequest;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n641 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n641(c380 c380Var, Object obj, xtb0 xtb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.d = c380Var;
        this.c = obj;
        this.e = xtb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                n641 n641Var = new n641(this.d, obj2, lnmVar, (byte) 0);
                n641Var.c = obj;
                return n641Var;
            case 1:
                return new n641(this.d, obj2, lnmVar, (byte) 1);
            case 2:
                n641 n641Var2 = new n641(this.d, obj2, lnmVar, (byte) 2);
                n641Var2.c = obj;
                return n641Var2;
            case 3:
                return new n641((x841) this.c, (String) this.d, (tv80) obj2, lnmVar, (byte) 3);
            case 4:
                return new n641((Exception) this.c, (mzr0) this.d, (String) obj2, lnmVar, (byte) 4);
            case 5:
                return new n641((qn41) this.c, (String) this.d, (iu30) obj2, lnmVar, (byte) 5);
            case 6:
                return new n641((hq41) this.c, (mr20) this.d, (Bundle) obj2, lnmVar, (byte) 6);
            case 7:
                return new n641((List) this.c, (Set) this.d, (xtb0) obj2, lnmVar, (byte) 7);
            case 8:
                return new n641((c380) this.d, this.c, (xtb0) obj2, lnmVar);
            case 9:
                n641 n641Var3 = new n641(this.d, obj2, lnmVar, (byte) 9);
                n641Var3.c = obj;
                return n641Var3;
            case 10:
                n641 n641Var4 = new n641(this.d, obj2, lnmVar, (byte) 10);
                n641Var4.c = obj;
                return n641Var4;
            case 11:
                return new n641(this.d, obj2, lnmVar, (byte) 11);
            case 12:
                return new n641((l251) this.c, (ven0) this.d, (iu30) obj2, lnmVar, (byte) 12);
            case 13:
                return new n641((l251) this.c, (y7e1) this.d, (iu30) obj2, lnmVar, (byte) 13);
            case 14:
                return new n641((String) this.c, (y7e1) this.d, (iu30) obj2, lnmVar, (byte) 14);
            case 15:
                return new n641((ven0) this.c, (y7e1) this.d, (ven0) obj2, lnmVar, (byte) 15);
            case 16:
                n641 n641Var5 = new n641(this.d, obj2, lnmVar, (byte) 16);
                n641Var5.c = obj;
                return n641Var5;
            case 17:
                n641 n641Var6 = new n641(this.d, obj2, lnmVar, (byte) 17);
                n641Var6.c = obj;
                return n641Var6;
            case 18:
                return new n641((dc61) this.c, (vb61) this.d, (String) obj2, lnmVar, (byte) 18);
            case 19:
                return new n641((res) this.c, (hc61) this.d, (ou80) obj2, lnmVar, (byte) 19);
            case 20:
                n641 n641Var7 = new n641(this.d, obj2, lnmVar, (byte) 20);
                n641Var7.c = obj;
                return n641Var7;
            case 21:
                return new n641((cm0) this.c, (vc61) this.d, (ou80) obj2, lnmVar, (byte) 21);
            case 22:
                n641 n641Var8 = new n641(this.d, obj2, lnmVar, (byte) 22);
                n641Var8.c = obj;
                return n641Var8;
            case 23:
                return new n641((String) this.c, (Boolean) this.d, (np61) obj2, lnmVar, (byte) 23);
            case 24:
                n641 n641Var9 = new n641(this.d, obj2, lnmVar, (byte) 24);
                n641Var9.c = obj;
                return n641Var9;
            case 25:
                return new n641((r171) this.c, (String) this.d, (tqw) obj2, lnmVar, (byte) 25);
            case 26:
                return new n641((wh41) this.c, (String) this.d, (ArrayList) obj2, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new n641((wh41) this.c, (String) this.d, (String) obj2, lnmVar, (byte) 27);
            case 28:
                return new n641((Function0) obj2, lnmVar);
            default:
                return new n641((dl71) this.c, (c380) this.d, (iu30) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((cu41) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((bs41) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((ou80) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((ou80) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:355:0x07bd  */
    public final Object invokeSuspend(Object obj) {
        slc0 slc0Var;
        Object objJ;
        ou80 ou80Var;
        String str;
        f5y0 huzVar;
        f5y0 f5y0Var;
        Object objO;
        ven0 ven0Var;
        Object objJ2;
        xgn0 xgn0Var;
        Function0 function0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        ubc0 ubc0Var = null;
        switch (b) {
            case 0:
                p541 p541Var = (p541) obj2;
                vi11 vi11Var = (vi11) this.d;
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ve01 ve01VarR = d5p1.r(d3p1.G((d0r) vi11Var.b, (iik0) vi11Var.f, p541Var), ssw0Var, ey71.a, 1);
                x010 x010Var = new x010(ve01VarR, hu20.e(rqt0.u(new f5y0(new dwv(ve01VarR, (byte) 17), p541Var, (byte) 26)), new af01((lnm) null, vi11Var, (byte) 5)), new wc10(3, null, (byte) 4), (byte) 1);
                k641 k641Var = new k641(ssw0Var, null, (byte) 0);
                this.c = null;
                this.b = true;
                return l4p1.q(x010Var, k641Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                p68 p68Var = (p68) this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    slc0Var = new slc0(UUID.randomUUID().toString());
                    ((dg30) p68Var.b).startActivity(((a741) p68Var.f).a(slc0Var));
                    Single singleTimeout = fq7.C((xov0) p68Var.c).timeout(5L, TimeUnit.SECONDS, Single.just(""));
                    this.c = slc0Var;
                    this.b = true;
                    objJ = fc11.j(singleTimeout, this);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slc0Var = (slc0) this.c;
                    hm5.M(obj);
                    objJ = obj;
                }
                tv80 tv80Var = (tv80) obj2;
                ((lvc) p68Var.d).a(slc0Var, "SAMSUNG", (String) objJ, (tv80Var == null || (ou80Var = tv80Var.a) == null || (str = ou80Var.a) == null) ? "" : str, 2, 3);
                return rih1Var;
            case 2:
                String str2 = (String) this.d;
                vr20 vr20Var = (vr20) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (sgy.b(str2)) {
                    ne neVar = (ne) obj2;
                    hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                    sku0 sku0VarP = PlaylistDecorationPolicy.p();
                    sku0VarP.S();
                    sku0VarP.L();
                    sku0VarP.E();
                    sku0VarP.W();
                    sku0VarP.k0();
                    sku0VarP.n(((iz00) neVar.b).a(Collections.singleton(rc11.a.b(qp31.class))));
                    hru0VarS.x(sku0VarP);
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
                    playlistRequestDecorationPolicyBuild.getClass();
                    f5y0Var = new f5y0(new lt20(new wzv0(new h5y0(((xrc0) neVar.a).k(str2, new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, (Set) null, false, qrc0.a, jqz0.a, (prc0) null, 0, (List) null, 462)), (byte) 29), (byte) 12), new w1e0(3, (lnm) null, (byte) 25), (byte) 0), neVar, (byte) 27);
                } else {
                    if (!sgy.i(str2)) {
                        Set set = s4b1.f;
                        blc0[] blc0VarArr = sgy.b;
                        huzVar = (uic.h(str2, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length)) || sgy.a(str2) || sgy.f(str2) || sgy.d(str2) || sgy.c(str2)) ? new huz(Boolean.TRUE, (byte) 10) : new huz(Boolean.FALSE, (byte) 10);
                    }
                    f5y0Var = huzVar;
                }
                this.c = null;
                this.b = true;
                return l4p1.s(vr20Var, f5y0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ccc0 ccc0Var = ((x841) this.c).c;
                String str3 = (String) this.d;
                tv80 tv80Var2 = (tv80) obj2;
                ubc0Var = tv80Var2 != null ? new ubc0(tv80Var2) : null;
                this.b = true;
                ccc0Var.getClass();
                return ccc0.c(ccc0Var, str3, true, ubc0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z5 = this.b;
                try {
                    if (!z5) {
                        hm5.M(obj);
                        lc41 lc41Var = new lc41((mzr0) this.d, (String) obj2, (lnm) null, (byte) 2);
                        this.b = true;
                        objO = rc2.O(5000L, lc41Var, this);
                        if (objO == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objO = obj;
                    }
                    if (((rih1) objO) != null) {
                        return rih1Var;
                    }
                    throw new IOException("Timed out rolling back inserted track");
                } catch (Exception e) {
                    j2h1.h((Exception) this.c, e);
                    return rih1Var;
                }
            case 5:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bbc bbcVar = ((qn41) this.c).d;
                on41 on41Var = new on41((String) this.d, (iu30) obj2, (gyq0) null);
                this.b = true;
                return bbcVar.b(on41Var, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
                hq41 hq41Var = (hq41) this.c;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jge jgeVarE = hu20.e(hq41Var.a(), new af01((lnm) null, (mr20) this.d, (byte) 10));
                i3y0 i3y0Var = new i3y0(hq41Var, (Bundle) obj2, (lnm) null, (byte) 20);
                this.b = true;
                Object objCollect = jgeVarE.collect(new eu20(kfo0.a, i3y0Var, (byte) 1), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 7:
                List list = (List) this.c;
                Set set2 = (Set) this.d;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    String str4 = (String) o7h.s0(list);
                    if (str4 != null && !set2.isEmpty() && !set2.contains(str4)) {
                        this.b = true;
                        df41 df41Var = xtb0.y;
                        if (((xtb0) obj2).f(0, 0, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                r7h.W(list, set2);
                return rih1Var;
            case 8:
                xtb0 xtb0Var = (xtb0) obj2;
                c380 c380Var = (c380) this.d;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int iIndexOf = c380Var.indexOf(this.c);
                int size = c380Var.size();
                if (iIndexOf < 0 || size <= 0) {
                    return rih1Var;
                }
                ptb0 ptb0VarH = xtb0Var.h();
                List list2 = ptb0VarH.l;
                int i = ptb0VarH.m;
                int i2 = ptb0VarH.n;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    qtb0 qtb0Var = (qtb0) obj3;
                    int i3 = qtb0Var.p;
                    int i4 = qtb0Var.q + i3;
                    if (i3 >= i && i4 <= i2) {
                        arrayList.add(obj3);
                    }
                }
                int size2 = size - arrayList.size();
                if (size2 < 0) {
                    size2 = 0;
                }
                if (iIndexOf <= size2) {
                    size2 = iIndexOf;
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Integer(((qtb0) it.next()).a));
                }
                if (arrayList2.contains(new Integer(iIndexOf))) {
                    return rih1Var;
                }
                this.b = true;
                return xtb0Var.k(size2, 0, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cu41 cu41Var = (cu41) this.c;
                swn swnVar = (swn) this.d;
                gub0 gub0Var = new gub0(cu41Var, (du41) obj2, (byte) 19);
                this.b = true;
                return swnVar.invoke(gub0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bs41 bs41Var = (bs41) this.c;
                du41 du41Var = (du41) this.d;
                du41Var.k = bs41Var;
                cu41 cu41Var2 = du41Var.l;
                this.b = true;
                return ((vu30) obj2).invoke(cu41Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                boolean z12 = this.b;
                try {
                    if (!z12) {
                        hm5.M(obj);
                        rm51 rm51Var = (rm51) this.d;
                        ven0Var = (ven0) obj2;
                        if (rm51Var == null) {
                            ven0Var.setValue((Object) null);
                            return rih1Var;
                        }
                        ixg ixgVar = rm51Var.b;
                        ixgVar.g = false;
                        Single singleI = ixgVar.i();
                        this.c = ven0Var;
                        this.b = true;
                        objJ2 = fc11.j(singleI, this);
                        if (objJ2 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ven0 ven0Var2 = (ven0) this.c;
                        hm5.M(obj);
                        ven0Var = ven0Var2;
                        objJ2 = obj;
                    }
                    ven0Var.setValue((Bitmap) objJ2);
                    return rih1Var;
                } catch (Exception unused) {
                    return rih1Var;
                }
            case 12:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarK = r4p1.k(rqt0.u(rwq.q(new g8y0((ven0) this.d, (byte) 13))), 350L);
                py5 py5Var = new py5((iu30) obj2, (lnm) null, (byte) 6);
                this.b = true;
                return l4p1.q(mr20VarK, py5Var, this) == d9nVar ? d9nVar : rih1Var;
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarK2 = r4p1.k(rqt0.u(rwq.q(new ime0((y7e1) this.d, (byte) 6))), 350L);
                py5 py5Var2 = new py5((iu30) obj2, (lnm) null, (byte) 7);
                this.b = true;
                return l4p1.q(mr20VarK2, py5Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p811 p811VarU = cy30.u(obj);
                p811VarU.a = (String) this.c;
                m441 m441VarQ = rwq.q(new ime0((y7e1) this.d, (byte) 9));
                tzy0 tzy0Var = new tzy0(p811VarU, (iu30) obj2, (byte) 22);
                this.b = true;
                return m441VarQ.collect(tzy0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 15:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!((Boolean) ((ven0) this.c).getValue()).booleanValue()) {
                    return rih1Var;
                }
                mr20 mr20VarU = rqt0.u(rwq.q(new ime0((y7e1) this.d, (byte) 10)));
                tqf tqfVar = new tqf((ven0) obj2, (lnm) null, (byte) 1);
                this.b = true;
                return l4p1.q(mr20VarU, tqfVar, this) == d9nVar ? d9nVar : rih1Var;
            case 16:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l811 l811VarY = l1d.y(obj);
                mr20 mr20Var = (mr20) this.d;
                uqs0 uqs0Var = new uqs0((ju51) obj2, vr20Var2, l811VarY);
                this.c = null;
                this.b = true;
                return mr20Var.collect(uqs0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 17:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                c9n c9nVar = (c9n) this.c;
                m441 m441VarQ2 = rwq.q(new uy51((tob1) this.d, (byte) 1));
                tzy0 tzy0Var2 = new tzy0((o95) obj2, c9nVar, (byte) 26);
                this.b = true;
                return m441VarQ2.collect(tzy0Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 18:
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dc61 dc61Var = (dc61) this.c;
                vb61 vb61Var = (vb61) this.d;
                String str5 = (String) obj2;
                this.b = true;
                if (!u890.j(str5, "session-control-reset")) {
                    bpb1 bpb1Var = dc61Var.N0;
                    bpb1Var.m((Object) null, dm61.x0(vb61Var.a, (Set) bpb1Var.getValue()));
                }
                m021 m021Var = dc61Var.g;
                String str6 = vb61Var.a;
                i8h1 i8h1Var = (i8h1) m021Var.b;
                opl0 opl0Var = (opl0) m021Var.c;
                x6h1 x6h1VarC = opl0Var.c.c();
                x6h1VarC.i.add(new a7h1("retry_snackbar", str6, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                Object objG = dc61.g(dc61Var, vb61Var, str5, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1VarA, opl0Var.b, System.currentTimeMillis()), (xj61) null).a, this, 12);
                if (objG != d9nVar) {
                    objG = rih1Var;
                }
                return objG == d9nVar ? d9nVar : rih1Var;
            case 19:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                res resVar = (res) this.c;
                crb crbVar = ((hc61) this.d).b;
                ou80 ou80Var2 = (ou80) obj2;
                this.b = true;
                Object objT = resVar.t(ioo1.E(crbVar) ? "session-control-reset" : (String) resVar.f, ou80Var2, this);
                if (objT != d9nVar) {
                    objT = rih1Var;
                }
                return objT == d9nVar ? d9nVar : rih1Var;
            case 20:
                ou80 ou80Var3 = (ou80) this.c;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return ((res) this.d).t((String) obj2, ou80Var3, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z21) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cm0 cm0Var = (cm0) this.c;
                crb crbVar2 = ((vc61) this.d).b;
                ou80 ou80Var4 = (ou80) obj2;
                this.b = true;
                Object objK = cm0Var.k(ioo1.E(crbVar2) ? "session-control-reset" : (String) cm0Var.h, ou80Var4, this);
                if (objK != d9nVar) {
                    objK = rih1Var;
                }
                return objK == d9nVar ? d9nVar : rih1Var;
            case 22:
                ou80 ou80Var5 = (ou80) this.c;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return ((cm0) this.d).k((String) obj2, ou80Var5, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z23) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    ql61 ql61VarO = SetRequestHeadersRequest.o();
                    ql61VarO.n((String) this.c);
                    ql61VarO.q(((Boolean) this.d).booleanValue());
                    oo61 oo61Var = ((np61) obj2).a;
                    SetRequestHeadersRequest setRequestHeadersRequestBuild = ql61VarO.build();
                    this.b = true;
                    if (oo61Var.b(setRequestHeadersRequestBuild, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ax0.a;
            case 24:
                bpb1 bpb1Var2 = (bpb1) this.d;
                ssw0 ssw0Var2 = (ssw0) this.c;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jt61 jt61Var = (jt61) bpb1Var2.getValue();
                if ((jt61Var != null ? jt61Var.a() : null) == null) {
                    fn31.T(ssw0Var2, (o8n) null, 0, new w621((pbg) obj2, bpb1Var2, (lnm) null, (byte) 5), 3);
                }
                cu cuVar = new cu(ssw0Var2, (byte) 12);
                this.c = null;
                this.b = true;
                bpb1Var2.collect(new o010(cuVar, (byte) 25), this);
                return d9nVar;
            case 25:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mzr0 mzr0Var = ((r171) this.c).m1;
                String string = new y6b1((String) this.d, false).c().toString();
                tv80 tv80VarY = n3o1.y((tqw) obj2);
                this.b = true;
                return mzr0Var.p(string, tv80VarY, this) == d9nVar ? d9nVar : rih1Var;
            case 26:
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    this.b = true;
                    Object objG2 = ((hre1) ((wh41) this.c).e).g((String) this.d, (ArrayList) obj2, xqe1.a, this);
                    return objG2 == d9nVar ? d9nVar : objG2;
                }
                if (z27) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA = ((uvy) ((wh41) this.c).c).a((String) this.d, (String) obj2, this);
                    return objA == d9nVar ? d9nVar : objA;
                }
                if (z28) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    xgn0 xgn0Var2 = o771.f;
                    Function0 function1 = (Function0) obj2;
                    this.c = xgn0Var2;
                    this.d = (hab0) function1;
                    this.b = true;
                    if (xgn0Var2.a(this) == d9nVar) {
                        return d9nVar;
                    }
                    xgn0Var = xgn0Var2;
                    function0 = function1;
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function0 = (Function0) ((hab0) this.d);
                    xgn0Var = (xgn0) this.c;
                    hm5.M(obj);
                }
                try {
                    return function0.invoke();
                } finally {
                    xgn0Var.c((Object) null);
                }
            default:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l811 l811VarY2 = l1d.y(obj);
                l811VarY2.a = true;
                m441 m441VarQ3 = rwq.q(new qv61((dl71) this.c, (byte) 12));
                uqs0 uqs0Var2 = new uqs0((c380) this.d, (iu30) obj2, l811VarY2, (byte) 23);
                this.b = true;
                return m441VarQ3.collect(uqs0Var2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n641(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n641(Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 28;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n641(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
