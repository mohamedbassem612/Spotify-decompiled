package p;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.appauthorization.builtinauth.model.FieldValidator;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.loading.LoadingProgressBarView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.interapp.interappprotocol.NotAuthorizedException;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDoFinally;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p1f0 implements juh0, r6r0, qc51 {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public p1f0(LayoutInflater layoutInflater, ViewGroup viewGroup, xfx xfxVar, h5a1 h5a1Var, gqm1 gqm1Var) {
        this.a = new idd1(new t800(layoutInflater, viewGroup, (byte) 2));
        this.b = new idd1(new bkk1(this, (byte) 28));
        this.c = new idd1(new wrm1(xfxVar, this, (byte) 1));
        this.d = new idd1(new wrm1(xfxVar, this, (byte) 0));
        this.e = new idd1(new x9n(xfxVar, (byte) 2));
        this.f = new idd1(new g4k1(gqm1Var, xfxVar, (byte) 20));
        this.g = new idd1(new x9n(xfxVar, (byte) 1));
        this.h = new idd1(new bkk1(h5a1Var, (byte) 29));
    }

    public void A(bpb1 bpb1Var) {
        sjq0 sjq0Var = new sjq0(bpb1Var);
        j3r j3rVar = rzq.y;
        dnc0 dnc0Var = new dnc0(l2p1.f((l2r) this.b), (Function0) null, (Function0) null, new cc9(50, 0, 6), (guh0) null, 94);
        dnc0Var.b(new gj50(new gcv(bpb1Var, (byte) 2), true), new ozp0(this, sjq0Var, (byte) 29));
        cnc0 cnc0VarA = dnc0Var.a();
        this.e = (snc0) cnc0VarA.a.invoke();
        this.f = cnc0VarA.c;
        this.g = cnc0VarA.b;
        bpb1 bpb1Var2 = (bpb1) this.h;
        jge jgeVarE = hu20.e(bpb1Var, new t4o0((lnm) null, sjq0Var, (byte) 13));
        snc0 snc0Var = (snc0) this.e;
        if (snc0Var != null) {
            bpb1Var2.m((Object) null, new p4t0(jgeVarE, snc0Var.b()));
        } else {
            u890.C("listContentRuntime");
            throw null;
        }
    }

    public void B(tv80 tv80Var) {
        this.h = tv80Var != null ? new bwn0(tv80Var) : null;
    }

    public c4p1 a(t480 t480Var, long j, Set set) {
        p480 p480Var;
        long jE = ((yqg) this.c).e();
        dgs0 dgs0Var = (dgs0) w0h1.k((ConcurrentHashMap) this.d).remove(t480Var);
        s6r0 s6r0Var = (s6r0) w0h1.k((ConcurrentHashMap) this.e).remove(t480Var);
        Long lValueOf = dgs0Var != null ? Long.valueOf(jE - dgs0Var.a) : null;
        Object obj = this.b;
        if (lValueOf == null || lValueOf.longValue() < 300) {
            if (dgs0Var != null) {
                return new ih10(1);
            }
            if (s6r0Var == null) {
                return new ih10(2);
            }
            p480 p480Var2 = s6r0Var.a;
            int i = s6r0Var.b;
            long j2 = s6r0Var.c;
            ((q7h1) obj).a(p480Var2, i, j2, j - j2, s6r0Var.d, s6r0Var.e, set, s6r0Var.f, s6r0Var.g);
            return new esc1(p480Var2, i);
        }
        a8r0 a8r0Var = dgs0Var.c;
        a8r0 a8r0Var2 = dgs0Var.c;
        y6r0 y6r0VarR = a4p1.r(a8r0Var.a);
        l7h1 l7h1Var = dgs0Var.b;
        q480 q480VarT = ((ffe1) this.a).t(y6r0VarR, a4p1.g(l7h1Var));
        p480 p480Var3 = new p480(q480VarT.a.toString());
        int i2 = q480VarT.b;
        if (i2 == 0) {
            p480Var = p480Var3;
            ((q7h1) obj).b(p480Var, dgs0Var.b, a8r0Var2, dgs0Var.d, dgs0Var.e);
        } else {
            p480Var = p480Var3;
        }
        q7h1 q7h1Var = (q7h1) obj;
        int i3 = q480VarT.b;
        long j3 = ((q6h1) l7h1Var).a;
        long j4 = j - j3;
        ArrayList arrayListS = a4p1.s(l7h1Var);
        ArrayList arrayListT = a4p1.t(l7h1Var);
        y6r0 y6r0Var = a8r0Var2.a;
        q7h1Var.a(p480Var, i3, j3, j4, arrayListS, arrayListT, set, y6r0Var != null ? y6r0Var.a : null, a8r0Var2.d);
        return new esc1(p480Var, Integer.valueOf(i2).intValue());
    }

    @Override // p.qc51
    public lw41 b(pc51 pc51Var, lw41 lw41Var) {
        List list;
        ezb1 ezb1Var;
        boolean z;
        d8r0 d8r0Var;
        boolean z2;
        boolean z3;
        d8r0 d8r0Var2;
        d8r0 d8r0Var3;
        String str;
        String str2;
        d8r0 d8r0Var4;
        String str3;
        boolean z4;
        wvl pvlVar;
        wvl mulVar;
        String str4;
        boolean z5;
        List list2;
        d8r0 d8r0Var5;
        boolean z6;
        boolean z7;
        lle lleVar;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        d8r0 d8r0Var6;
        int i;
        List listSingletonList;
        o5a o5aVar;
        xaz0 xaz0Var = (xaz0) this.g;
        int size = pc51Var.b;
        fw41 fw41Var = pc51Var.j;
        e7r0 e7r0Var = pc51Var.h;
        m131 m131Var = pc51Var.e;
        boolean z12 = m131Var.a || m131Var.b;
        boolean z13 = fw41Var.e;
        d8r0 d8r0Var7 = new d8r0(e7r0Var.a, e7r0Var.b.c, e7r0Var.c, e7r0Var.e);
        z851 z851Var = pc51Var.a;
        boolean z14 = z851Var instanceof z851;
        List listK = z6x.a;
        if (z14) {
            pvp0 pvp0Var = z851Var.a;
            if (pvp0Var.a() == 0) {
                return xaz0Var.j(d8r0Var7);
            }
            cqp0 cqp0Var = (cqp0) this.h;
            Resources resources = cqp0Var.a;
            di4 di4Var = cqp0Var.b;
            cqp0Var.c = 0;
            zxp0 zxp0Var = pvp0Var.b;
            List list3 = zxp0Var != null ? zxp0Var.a : listK;
            nrp0 nrp0Var = pvp0Var.c;
            List list4 = nrp0Var != null ? nrp0Var.a : listK;
            gup0 gup0Var = pvp0Var.d;
            List list5 = gup0Var != null ? gup0Var.a : listK;
            ArrayList<znp0> arrayList = pvp0Var.e;
            ArrayList arrayList2 = new ArrayList();
            List listSingletonList2 = list3.isEmpty() ? listK : Collections.singletonList(new tvl(new v331(di4Var.j0() ? 2131961542 : 2131961543)));
            List list6 = list3;
            ArrayList arrayList3 = new ArrayList(q7h.U(list6, 10));
            Iterator it = list6.iterator();
            while (it.hasNext()) {
                pxp0 pxp0Var = (pxp0) it.next();
                String str5 = pxp0Var.a;
                di4 di4Var2 = di4Var;
                String str6 = pxp0Var.b;
                String str7 = pxp0Var.i;
                Iterator it2 = it;
                sxp0 sxp0Var = pxp0Var.e;
                String strJ0 = bmq0.j0(str7, sxp0Var != null ? sxp0Var.a : null);
                String str8 = pxp0Var.c;
                int i2 = pxp0Var.g ? 1 : pxp0Var.f ? 2 : 3;
                boolean z15 = pxp0Var.h;
                int i3 = cqp0Var.c;
                cqp0Var.c = i3 + 1;
                d8r0 d8r0Var8 = d8r0Var7;
                arrayList3.add(new mvl(new wvp0(str5, str6, strJ0, str8, 1, i2, z15, d8r0Var8, i3)));
                di4Var = di4Var2;
                it = it2;
                d8r0Var7 = d8r0Var8;
            }
            di4 di4Var3 = di4Var;
            d8r0 d8r0Var9 = d8r0Var7;
            arrayList2.addAll(o7h.N0(arrayList3, listSingletonList2));
            List listSingletonList3 = list4.isEmpty() ? listK : Collections.singletonList(new tvl(new v331(di4Var3.j0() ? 2131961540 : 2131961537)));
            List list7 = list4;
            ArrayList arrayList4 = new ArrayList(q7h.U(list7, 10));
            Iterator it3 = list7.iterator();
            while (it3.hasNext()) {
                lrp0 lrp0Var = (lrp0) it3.next();
                String str9 = lrp0Var.a;
                String str10 = lrp0Var.b;
                String string = resources.getString(2131961520);
                String str11 = lrp0Var.c;
                Iterator it4 = it3;
                int i4 = lrp0Var.e ? 1 : lrp0Var.d ? 2 : 3;
                int i5 = cqp0Var.c;
                cqp0Var.c = i5 + 1;
                d8r0 d8r0Var10 = d8r0Var9;
                d8r0Var9 = d8r0Var10;
                arrayList4.add(new mvl(new wvp0(str9, str10, string, str11, 3, i4, false, d8r0Var10, i5)));
                it3 = it4;
            }
            arrayList2.addAll(o7h.N0(arrayList4, listSingletonList3));
            List listSingletonList4 = list5.isEmpty() ? listK : Collections.singletonList(new tvl(new v331(di4Var3.j0() ? 2131961541 : 2131961538)));
            List<eup0> list8 = list5;
            ArrayList arrayList5 = new ArrayList(q7h.U(list8, 10));
            for (eup0 eup0Var : list8) {
                String str12 = eup0Var.a;
                String str13 = eup0Var.b;
                String string2 = resources.getString(2131961528);
                String str14 = eup0Var.c;
                int i6 = cqp0Var.c;
                cqp0Var.c = i6 + 1;
                d8r0 d8r0Var11 = d8r0Var9;
                d8r0Var9 = d8r0Var11;
                arrayList5.add(new mvl(new wvp0(str12, str13, string2, str14, 4, 3, false, d8r0Var11, i6)));
            }
            arrayList2.addAll(o7h.N0(arrayList5, listSingletonList4));
            if (!arrayList.isEmpty()) {
                listK = Collections.singletonList(new tvl(new v331(di4Var3.j0() ? 2131961539 : 2131961536)));
            }
            List list9 = listK;
            ArrayList arrayList6 = new ArrayList(q7h.U(arrayList, 10));
            for (znp0 znp0Var : arrayList) {
                String str15 = znp0Var.a;
                String str16 = znp0Var.b;
                String str17 = znp0Var.g;
                String str18 = znp0Var.c;
                int i7 = znp0Var.f ? 1 : znp0Var.e ? 2 : 3;
                int i8 = cqp0Var.c;
                cqp0Var.c = i8 + 1;
                d8r0 d8r0Var12 = d8r0Var9;
                arrayList6.add(new mvl(new wvp0(str15, str16, str17, str18, 2, i7, false, d8r0Var12, i8)));
                d8r0Var9 = d8r0Var12;
            }
            arrayList2.addAll(o7h.N0(arrayList6, list9));
            return new gw41(arrayList2);
        }
        Object obj = null;
        if (!(z851Var instanceof a951)) {
            if (z851Var instanceof b951) {
                b951 b951Var = (b951) z851Var;
                return (b951Var.a.isEmpty() && b951Var.b.isEmpty()) ? xaz0Var.i(pc51Var.k instanceof ral, fw41Var.c, fw41Var.f, fw41Var.g, d8r0Var7) : new jw41(((m39) this.c).b(b951Var, d8r0Var7));
            }
            if (z851Var instanceof y851) {
                return new gw41(listK);
            }
            if (u890.j(z851Var, u851.a)) {
                return kw41.a;
            }
            if (z851Var instanceof w851) {
                return new gw41(((w29) this.d).a((w851) z851Var, d8r0Var7, pc51Var.i, fw41Var.e, z12, pc51Var.c, m131Var.c, m131Var.d));
            }
            if (z851Var instanceof x851) {
                x851 x851Var = (x851) z851Var;
                return new jw41(((ov41) this.e).a(x851Var, d8r0Var7, pc51Var.i, x851Var.a.a, pc51Var.c));
            }
            if (z851Var instanceof s851) {
                return ((up41) this.a).m((s851) z851Var, d8r0Var7);
            }
            eg.o();
            return null;
        }
        riq0 riq0Var = ((a951) z851Var).a;
        boolean z16 = riq0Var instanceof riq0;
        int i9 = 1;
        lle lleVar2 = lle.c;
        if (!z16) {
            if (!(riq0Var instanceof qiq0)) {
                eg.o();
                return null;
            }
            qiq0 qiq0Var = (qiq0) riq0Var;
            List list10 = qiq0Var.b;
            k851 k851Var = (k851) o7h.q0(list10);
            if (k851Var.b.a.isEmpty()) {
                return xaz0Var.h(k851Var.a, d8r0Var7);
            }
            c351 c351Var = (c351) this.b;
            List list11 = list10;
            if (lw41Var != null && size == 0) {
                size = list10.size();
            }
            List<k851> listK0 = o7h.k0(list11, size);
            ArrayList<b351> arrayList7 = new ArrayList(q7h.U(listK0, 10));
            for (k851 k851Var2 : listK0) {
                ArrayList arrayList8 = k851Var2.b.a;
                xo20 xo20Var = qiq0Var.a;
                String str19 = k851Var2.a;
                List list12 = qiq0Var.c;
                if (list12 == null) {
                    list12 = listK;
                }
                arrayList7.add(new b351(arrayList8, xo20Var, str19, list12));
            }
            boolean z17 = lw41Var instanceof gw41;
            int size2 = z17 ? ((gw41) lw41Var).a.size() : 0;
            boolean z18 = m131Var.c;
            boolean z19 = m131Var.d;
            ArrayList arrayList9 = new ArrayList();
            for (b351 b351Var : arrayList7) {
                ezb1 ezb1Var2 = c351Var.a;
                String str20 = b351Var.c;
                boolean z20 = z17;
                boolean zY = d0p1.Y(b351Var.d, b351Var.b);
                ArrayList arrayList10 = b351Var.a;
                ArrayList arrayList11 = new ArrayList();
                Iterator it5 = arrayList10.iterator();
                int i10 = 0;
                while (it5.hasNext()) {
                    Object next = it5.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        p7h.T();
                        throw null;
                    }
                    Iterator it6 = it5;
                    lby lbyVar = (lby) next;
                    int i12 = i10 + size2;
                    jjf1 jjf1Var = lbyVar.e;
                    if (jjf1Var instanceof jjf1) {
                        z5 = z18;
                        boolean z21 = z19;
                        d8r0 d8r0Var13 = d8r0Var7;
                        str3 = str20;
                        plf1 plf1VarI = ezb1Var2.i(lbyVar, jjf1Var, z13, z12, d8r0Var13, str3, i12, zY, z5, z21);
                        ezb1Var = ezb1Var2;
                        boolean z22 = zY;
                        d8r0Var4 = d8r0Var13;
                        z3 = z22;
                        z2 = z21;
                        pvlVar = new wvl(plf1VarI);
                        z = z13;
                    } else {
                        boolean z23 = z18;
                        boolean z24 = z19;
                        String str21 = str20;
                        ezb1Var = ezb1Var2;
                        z = z13;
                        boolean z25 = zY;
                        d8r0Var = d8r0Var7;
                        if (jjf1Var instanceof cu7) {
                            yzu yzuVar = c351Var.b;
                            cu7 cu7Var = (cu7) jjf1Var;
                            tb51 tb51Var = (tb51) yzuVar.a;
                            tb51Var.getClass();
                            boolean z26 = z12;
                            pvlVar = yzuVar.u(lbyVar, cu7Var, d8r0Var, str21, tb51.i(tb51Var, lbyVar, z25, false, 4).toString(), i12, z26, z24, null, null);
                            z3 = z25;
                            z = z;
                            str3 = str21;
                            z12 = z26;
                            z2 = z24;
                            z4 = z23;
                        } else {
                            z2 = z24;
                            if (jjf1Var instanceof fww0) {
                                z3 = z25;
                                d8r0Var2 = d8r0Var;
                                pvlVar = new qvl(new s0x0(lbyVar.a, lbyVar.b, ((tb51) c351Var.c.b).c(lbyVar).toString(), lbyVar.c, lbyVar.e.a, str21, d8r0Var, i12));
                                str3 = str21;
                            } else {
                                z3 = z25;
                                d8r0Var2 = d8r0Var;
                                if (jjf1Var instanceof ji40) {
                                    str3 = str21;
                                    pvlVar = new avl(c351Var.d.m(lbyVar, d8r0Var2, str21, i12));
                                } else {
                                    if (jjf1Var instanceof jb6) {
                                        ol6 ol6VarC = c351Var.e.c(lbyVar, (jb6) jjf1Var, z, d8r0Var2, str21, i12);
                                        d8r0Var4 = d8r0Var2;
                                        str4 = str21;
                                        pvlVar = new iul(ol6VarC);
                                        z = z;
                                    } else {
                                        if (jjf1Var instanceof i53) {
                                            n63 n63Var = c351Var.f;
                                            s63 s63VarA = n63Var.a(lbyVar, (i53) jjf1Var, z, d8r0Var2, str21, n63Var.a.c(lbyVar).toString(), i12, (Integer) null, (String) null);
                                            z = z;
                                            d8r0Var4 = d8r0Var2;
                                            str4 = str21;
                                            pvlVar = new gul(s63VarA);
                                        } else if (jjf1Var instanceof tfu0) {
                                            z = z;
                                            yeu0 yeu0Var = c351Var.g;
                                            boolean zB = ((fza1) yeu0Var.c).b(lbyVar.a);
                                            fhu0 fhu0Var = new fhu0(lbyVar.a, lbyVar.b, tb51.i((tb51) yeu0Var.b, lbyVar, false, zB, 2), lbyVar.c, str21, d8r0Var2, i12, ((tfu0) jjf1Var).c, (Integer) null, (String) null, zB, lbyVar.g);
                                            str4 = str21;
                                            d8r0Var4 = d8r0Var2;
                                            pvlVar = new nvl(fhu0Var);
                                        } else {
                                            if (jjf1Var instanceof v68) {
                                                z = z;
                                                zwg zwgVar = c351Var.h;
                                                boolean z27 = z12;
                                                x78 x78VarT = zwgVar.t(lbyVar, (v68) jjf1Var, z27, d8r0Var2, str21, ((tb51) zwgVar.a).c(lbyVar).toString(), i12, (Integer) null, (String) null);
                                                z12 = z27;
                                                d8r0Var3 = d8r0Var2;
                                                str = str21;
                                                mulVar = new kul(x78VarT);
                                            } else {
                                                str = str21;
                                                if (jjf1Var instanceof tm8) {
                                                    z = z;
                                                    d8r0Var3 = d8r0Var2;
                                                    mulVar = new mul(c351Var.i.a(lbyVar, d8r0Var3, str, i12));
                                                } else {
                                                    if (jjf1Var instanceof k48) {
                                                        z = z;
                                                        d8r0Var3 = d8r0Var2;
                                                        str2 = str;
                                                        d8r0Var4 = d8r0Var3;
                                                        pvlVar = new uvl(scx0.a(c351Var.j, lbyVar, (k48) jjf1Var, d8r0Var4, str2, i12));
                                                    } else {
                                                        str2 = str;
                                                        d8r0Var4 = d8r0Var3;
                                                        if (jjf1Var instanceof i6k) {
                                                            z = z;
                                                            d8r0Var3 = d8r0Var2;
                                                            pvlVar = new qul(c351Var.k.b(lbyVar, (i6k) jjf1Var, d8r0Var4, str2, i12, (Integer) null, (String) null));
                                                        } else if (jjf1Var instanceof xui1) {
                                                            z = z;
                                                            d8r0Var3 = d8r0Var2;
                                                            pvlVar = new zvl(ltf1.h(c351Var.l, lbyVar, (xui1) jjf1Var, d8r0Var4, str2, i12));
                                                        } else if (jjf1Var instanceof yma0) {
                                                            z = z;
                                                            d8r0Var3 = d8r0Var2;
                                                            v6a0 v6a0Var = c351Var.m;
                                                            pvlVar = new hvl(v6a0Var.r(lbyVar, (yma0) jjf1Var, d8r0Var4, str2, tb51.g((tb51) v6a0Var.b, lbyVar), i12));
                                                        } else if (jjf1Var instanceof o2v0) {
                                                            o2v0 o2v0Var = (o2v0) jjf1Var;
                                                            if (o2v0Var.t == lleVar2 && c351Var.o.Q()) {
                                                                String str22 = o2v0Var.i;
                                                                if (str22 == null) {
                                                                    z = z;
                                                                    d8r0Var3 = d8r0Var2;
                                                                    str22 = lbyVar.c;
                                                                }
                                                                z = z;
                                                                d8r0Var3 = d8r0Var2;
                                                                str3 = str2;
                                                                z4 = z23;
                                                                plf1 plf1VarI2 = ezb1Var.i(lby.a(lbyVar, str22, (jjf1) null, 123), t6p1.q(o2v0Var), z, z12, d8r0Var4, str3, i12, z3, z4, z2);
                                                                z = z;
                                                                d8r0Var4 = d8r0Var4;
                                                                pvlVar = new wvl(plf1VarI2);
                                                            } else {
                                                                z = z;
                                                                d8r0Var3 = d8r0Var2;
                                                                z = z;
                                                                d8r0Var3 = d8r0Var2;
                                                                z = z;
                                                                z4 = z23;
                                                                boolean z28 = z12;
                                                                u2v0 u2v0VarJ = c351Var.n.j(lbyVar, o2v0Var, d8r0Var4, str2, i12, 1, z28, z2);
                                                                d8r0Var4 = d8r0Var4;
                                                                str3 = str2;
                                                                z12 = z28;
                                                                pvlVar = new pvl(u2v0VarJ);
                                                            }
                                                        } else {
                                                            z = z;
                                                            str3 = str2;
                                                            z4 = z23;
                                                            if (!(jjf1Var instanceof k39) && !(jjf1Var instanceof yf51)) {
                                                                z = z;
                                                                d8r0Var3 = d8r0Var2;
                                                                eg.o();
                                                                return null;
                                                            }
                                                            z = z;
                                                            d8r0Var3 = d8r0Var2;
                                                            z = z;
                                                            d8r0Var3 = d8r0Var2;
                                                            pvlVar = null;
                                                        }
                                                    }
                                                    str3 = str2;
                                                    z4 = z23;
                                                }
                                            }
                                            pvlVar = mulVar;
                                            str3 = str;
                                            d8r0Var4 = d8r0Var3;
                                            z4 = z23;
                                        }
                                        z = z;
                                    }
                                    str3 = str4;
                                    z4 = z23;
                                }
                            }
                            d8r0Var4 = d8r0Var2;
                            z4 = z23;
                        }
                    }
                    if (pvlVar != null) {
                        d8r0Var4 = d8r0Var;
                        z4 = z5;
                        arrayList11.add(pvlVar);
                    } else {
                        d8r0Var4 = d8r0Var;
                        z4 = z5;
                    }
                    it5 = it6;
                    z19 = z2;
                    str20 = str3;
                    d8r0Var7 = d8r0Var4;
                    z18 = z4;
                    z13 = z;
                    i10 = i11;
                    ezb1Var2 = ezb1Var;
                    zY = z3;
                }
                r7h.W(arrayList11, arrayList9);
                z19 = z19;
                z18 = z18;
                z17 = z20;
            }
            boolean z29 = z17;
            smc0 smc0VarN = k4p1.n();
            gw41 gw41Var = z29 ? (gw41) lw41Var : null;
            if (gw41Var != null && (list = gw41Var.a) != null) {
                smc0VarN.addAll(list);
            }
            smc0VarN.addAll(arrayList9);
            return new gw41(k4p1.k(smc0VarN));
        }
        List list13 = riq0Var.a;
        k851 k851Var3 = (k851) o7h.q0(list13);
        if (k851Var3.b.a.isEmpty() && k851Var3.b.d == null) {
            return xaz0Var.h(k851Var3.a, d8r0Var7);
        }
        sd51 sd51Var = (sd51) this.f;
        ezb1 ezb1Var3 = sd51Var.i;
        int i13 = pc51Var.i;
        String str23 = pc51Var.c;
        String str24 = pc51Var.d;
        boolean z30 = m131Var.c;
        boolean z31 = m131Var.d;
        di4 di4Var4 = sd51Var.r;
        smc0 smc0VarN2 = k4p1.n();
        if (!list13.isEmpty()) {
            String str25 = ((k851) list13.get(0)).a;
            if (i13 == 2 || (o5aVar = ((k851) list13.get(0)).b.d) == null) {
                list2 = list13;
                d8r0Var5 = d8r0Var7;
            } else {
                list2 = list13;
                d8r0Var5 = d8r0Var7;
                smc0VarN2.add(new lvl(new qwi0(o5aVar.b, o5aVar.c, o5aVar.d, o5aVar.e, o5aVar.a, str25, d8r0Var7, !((k851) o7h.q0(list2)).b.a.isEmpty())));
            }
            List<k851> list14 = list2;
            ArrayList arrayList12 = new ArrayList();
            for (k851 k851Var4 : list14) {
                List list15 = list14;
                ezb1 ezb1Var4 = ezb1Var3;
                ArrayList arrayList13 = k851Var4.b.a;
                String str26 = str23;
                boolean z32 = z31;
                di4 di4Var5 = di4Var4;
                ArrayList arrayList14 = new ArrayList(q7h.U(arrayList13, 10));
                Iterator it7 = arrayList13.iterator();
                while (it7.hasNext()) {
                    arrayList14.add(new mmr0((lby) it7.next(), k851Var4.a));
                    k851Var4 = k851Var4;
                }
                r7h.W(arrayList14, arrayList12);
                list14 = list15;
                z31 = z32;
                ezb1Var3 = ezb1Var4;
                str23 = str26;
                di4Var4 = di4Var5;
            }
            List list16 = list14;
            ezb1 ezb1Var5 = ezb1Var3;
            String str27 = str23;
            boolean z33 = z31;
            di4 di4Var6 = di4Var4;
            ArrayList arrayList15 = new ArrayList();
            for (Object obj2 : arrayList12) {
                ei90 ei90Var = ((lby) ((mmr0) obj2).a).e;
                if ((ei90Var instanceof i53) || (ei90Var instanceof jb6) || (ei90Var instanceof cu7) || (ei90Var instanceof k48) || (ei90Var instanceof v68) || (ei90Var instanceof tm8) || (ei90Var instanceof ji40) || (ei90Var instanceof tfu0) || (ei90Var instanceof fww0) || (ei90Var instanceof yf51) || (ei90Var instanceof jjf1) || (ei90Var instanceof i6k) || (ei90Var instanceof yma0) || (ei90Var instanceof xui1) || (ei90Var instanceof o2v0)) {
                    arrayList15.add(obj2);
                } else if (!(ei90Var instanceof k39)) {
                    eg.o();
                    return null;
                }
            }
            ArrayList arrayList16 = new ArrayList();
            Iterator it8 = arrayList15.iterator();
            int i14 = 0;
            while (it8.hasNext()) {
                Object next2 = it8.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p7h.T();
                    throw null;
                }
                mmr0 mmr0Var = (mmr0) next2;
                lby lbyVar2 = (lby) mmr0Var.a;
                String str28 = (String) mmr0Var.b;
                i53 i53Var = lbyVar2.e;
                if (u890.j(lbyVar2.f, dby.a) && (lbyVar2.e instanceof i53)) {
                    d8r0 d8r0Var14 = d8r0Var5;
                    int i16 = i14;
                    z11 = z13;
                    d8r0Var5 = d8r0Var14;
                    listSingletonList = Collections.singletonList(new cvl(sd51Var.m.w(lbyVar2, d8r0Var14, str28, i16, z11)));
                } else {
                    if (i53Var instanceof i53) {
                        d8r0 d8r0Var15 = d8r0Var5;
                        d8r0Var5 = d8r0Var15;
                        listSingletonList = Collections.singletonList(new gul(n63.b(sd51Var.a, lbyVar2, i53Var, z13, d8r0Var15, str28, i14)));
                        z33 = z33;
                        ezb1Var5 = ezb1Var5;
                        it8 = it8;
                        i15 = i15;
                        lleVar = lleVar2;
                        z8 = z30;
                    } else {
                        if (i53Var instanceof jb6) {
                            d8r0 d8r0Var16 = d8r0Var5;
                            boolean z34 = z13;
                            ol6 ol6VarA = sd51Var.b.a(lbyVar2, (jb6) i53Var, z34, d8r0Var16, str28, i14, (Integer) null, (String) null);
                            d8r0Var5 = d8r0Var16;
                            listSingletonList = Collections.singletonList(new iul(ol6VarA));
                            z11 = z34;
                        } else {
                            boolean z35 = z13;
                            if (i53Var instanceof v68) {
                                z8 = z30;
                                boolean z36 = z12;
                                z12 = z36;
                                List listSingletonList5 = Collections.singletonList(new kul(zwg.u(sd51Var.c, lbyVar2, (v68) i53Var, z36, d8r0Var5, str28, i14)));
                                lleVar = lleVar2;
                                listSingletonList = listSingletonList5;
                            } else {
                                lleVar = lleVar2;
                                z8 = z30;
                                if (i53Var instanceof k48) {
                                    listSingletonList = Collections.singletonList(new uvl(scx0.a(sd51Var.d, lbyVar2, (k48) i53Var, d8r0Var5, str28, i14)));
                                } else if (i53Var instanceof tfu0) {
                                    listSingletonList = Collections.singletonList(new nvl(yeu0.k(sd51Var.g, lbyVar2, (tfu0) i53Var, d8r0Var5, str28, i14)));
                                } else if (i53Var instanceof fww0) {
                                    d8r0 d8r0Var17 = d8r0Var5;
                                    d8r0Var5 = d8r0Var17;
                                    listSingletonList = Collections.singletonList(new qvl(new s0x0(lbyVar2.a, lbyVar2.b, tb51.g((tb51) sd51Var.h.b, lbyVar2), lbyVar2.c, ((fww0) i53Var).a, str28, d8r0Var17, i14)));
                                    i15 = i15;
                                    z11 = z35;
                                    d8r0Var6 = d8r0Var5;
                                    i = i9;
                                } else {
                                    it8 = it8;
                                    if (i53Var instanceof jjf1) {
                                        d8r0 d8r0Var18 = d8r0Var5;
                                        boolean z37 = z33;
                                        ezb1 ezb1Var6 = ezb1Var5;
                                        plf1 plf1VarH = ezb1Var6.h(lbyVar2, (jjf1) i53Var, z35, z12, d8r0Var18, str28, i14, (Integer) null, (String) null, z8, z37);
                                        ezb1Var5 = ezb1Var6;
                                        d8r0Var5 = d8r0Var18;
                                        z33 = z37;
                                        z9 = z35;
                                        listSingletonList = Collections.singletonList(new wvl(plf1VarH));
                                    } else {
                                        boolean z38 = z33;
                                        ezb1Var5 = ezb1Var5;
                                        z9 = z35;
                                        if (i53Var instanceof cu7) {
                                            boolean z39 = z12;
                                            z12 = z39;
                                            z10 = z38;
                                            listSingletonList = Collections.singletonList(yzu.E(sd51Var.e, lbyVar2, (cu7) i53Var, d8r0Var5, str28, i14, z39, z38));
                                        } else {
                                            z10 = z38;
                                            if (i53Var instanceof ji40) {
                                                listSingletonList = Collections.singletonList(new avl(bm00.l(sd51Var.f, lbyVar2, (ji40) i53Var, d8r0Var5, str28, i14)));
                                            } else if (i53Var instanceof yf51) {
                                                d8r0 d8r0Var19 = d8r0Var5;
                                                boolean z40 = z12;
                                                listSingletonList = sd51Var.k.s((yf51) i53Var, lbyVar2.b, i14, d8r0Var19, str28, str27, z9, z40, z8, z10);
                                                i15 = i15;
                                                d8r0Var6 = d8r0Var19;
                                                z12 = z40;
                                                z33 = z10;
                                                i = i9;
                                                z11 = z9;
                                            } else {
                                                i15 = i15;
                                                d8r0 d8r0Var20 = d8r0Var5;
                                                int i17 = i14;
                                                z13 = z9;
                                                if (i53Var instanceof tm8) {
                                                    listSingletonList = Collections.singletonList(new mul(sd51Var.l.a(lbyVar2, d8r0Var20, str28, i17)));
                                                    z33 = z10;
                                                    d8r0Var6 = d8r0Var20;
                                                    z11 = z13;
                                                    i = i9;
                                                } else {
                                                    if (i53Var instanceof i6k) {
                                                        d8r0Var5 = d8r0Var20;
                                                        listSingletonList = Collections.singletonList(new qul(sd51Var.n.b(lbyVar2, (i6k) i53Var, d8r0Var5, str28, i17, (Integer) null, (String) null)));
                                                    } else {
                                                        d8r0Var5 = d8r0Var20;
                                                        if (i53Var instanceof xui1) {
                                                            listSingletonList = Collections.singletonList(new zvl(ltf1.h(sd51Var.o, lbyVar2, (xui1) i53Var, d8r0Var5, str28, i17)));
                                                        } else if (i53Var instanceof yma0) {
                                                            v6a0 v6a0Var2 = sd51Var.p;
                                                            listSingletonList = Collections.singletonList(new hvl(v6a0Var2.r(lbyVar2, (yma0) i53Var, d8r0Var5, str28, tb51.g((tb51) v6a0Var2.b, lbyVar2), i17)));
                                                        } else if (i53Var instanceof o2v0) {
                                                            o2v0 o2v0Var2 = (o2v0) i53Var;
                                                            if (o2v0Var2.t == lleVar && di4Var6.Q()) {
                                                                String str29 = o2v0Var2.i;
                                                                if (str29 == null) {
                                                                    str29 = lbyVar2.c;
                                                                }
                                                                plf1 plf1VarH2 = ezb1Var5.h(lby.a(lbyVar2, str29, (jjf1) null, 123), t6p1.q(o2v0Var2), z13, z12, d8r0Var5, str28, i17, (Integer) null, (String) null, z8, z10);
                                                                d8r0Var5 = d8r0Var5;
                                                                z33 = z10;
                                                                z11 = z13;
                                                                listSingletonList = Collections.singletonList(new wvl(plf1VarH2));
                                                                d8r0Var6 = d8r0Var5;
                                                                i = i9;
                                                            } else {
                                                                z11 = z13;
                                                                boolean z41 = z12;
                                                                int i18 = i9;
                                                                u2v0 u2v0VarJ2 = sd51Var.q.j(lbyVar2, o2v0Var2, d8r0Var5, str28, i17, i18, z41, z10);
                                                                d8r0Var6 = d8r0Var5;
                                                                i = i18;
                                                                z12 = z41;
                                                                z33 = z10;
                                                                listSingletonList = Collections.singletonList(new pvl(u2v0VarJ2));
                                                            }
                                                        } else {
                                                            z33 = z10;
                                                            z11 = z13;
                                                            d8r0Var6 = d8r0Var5;
                                                            i = i9;
                                                            n57.e("Unsupported entity type in top results: " + rc11.a.b(i53Var.getClass()));
                                                            listSingletonList = listK;
                                                        }
                                                    }
                                                    z33 = z10;
                                                }
                                            }
                                        }
                                        z33 = z10;
                                    }
                                    d8r0Var6 = d8r0Var5;
                                    z11 = z9;
                                    i = i9;
                                }
                            }
                            i15 = i15;
                            z11 = z35;
                            d8r0Var6 = d8r0Var5;
                            i = i9;
                        }
                        r7h.W(listSingletonList, arrayList16);
                        d8r0Var5 = d8r0Var6;
                        lleVar2 = lleVar;
                        i9 = i;
                        z13 = z11;
                        ezb1Var5 = ezb1Var5;
                        z30 = z8;
                        it8 = it8;
                        obj = null;
                        i14 = i15;
                        z33 = z33;
                    }
                    z11 = z13;
                    d8r0Var6 = d8r0Var5;
                    i = i9;
                    r7h.W(listSingletonList, arrayList16);
                    d8r0Var5 = d8r0Var6;
                    lleVar2 = lleVar;
                    i9 = i;
                    z13 = z11;
                    ezb1Var5 = ezb1Var5;
                    z30 = z8;
                    it8 = it8;
                    obj = null;
                    i14 = i15;
                    z33 = z33;
                }
                lleVar = lleVar2;
                z8 = z30;
                d8r0Var6 = d8r0Var5;
                i = i9;
                r7h.W(listSingletonList, arrayList16);
                d8r0Var5 = d8r0Var6;
                lleVar2 = lleVar;
                i9 = i;
                z13 = z11;
                ezb1Var5 = ezb1Var5;
                z30 = z8;
                it8 = it8;
                obj = null;
                i14 = i15;
                z33 = z33;
            }
            boolean z42 = z33;
            boolean z43 = z30;
            boolean z44 = z13;
            d8r0 d8r0Var21 = d8r0Var5;
            smc0VarN2.addAll(arrayList16);
            ArrayList arrayList17 = new ArrayList();
            Iterator it9 = list16.iterator();
            while (it9.hasNext()) {
                r7h.W(((k851) it9.next()).b.a, arrayList17);
            }
            lby lbyVar3 = (lby) o7h.s0(arrayList17);
            xy01 xy01Var = ((k851) o7h.q0(list2)).b.c;
            if (lbyVar3 == null || xy01Var == null) {
                z6 = true;
            } else {
                z6 = true;
                smc0VarN2.addAll(1 > arrayList16.size() ? arrayList16.size() : 1, sd51Var.j.e(xy01Var, lbyVar3, d8r0Var21, str25));
            }
            ArrayList arrayList18 = new ArrayList();
            Iterator it10 = list16.iterator();
            while (it10.hasNext()) {
                r7h.W(((k851) it10.next()).b.a, arrayList18);
            }
            if (arrayList18.isEmpty()) {
                z7 = false;
                break;
            }
            Iterator it11 = arrayList18.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    z7 = false;
                    break;
                }
                yf51 yf51Var = ((lby) it11.next()).e;
                if ((yf51Var instanceof yf51) && yf51Var.b == 12) {
                    z7 = z6;
                    break;
                }
            }
            if (di4Var6.l() && di4Var6.j() && z7) {
                smc0VarN2.add(o7h.s0(smc0VarN2) instanceof lvl ? 1 : 0, new wul(new sbo("spotify:search", 0, d8r0Var21, (String) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x08b6: INVOKE 
                      (r10v19 'smc0VarN2' p.smc0)
                      (wrap int:?: TERNARY null = ((wrap boolean:0x0881: INSTANCE_OF 
                      (wrap java.lang.Object:0x087d: INVOKE (r10v19 'smc0VarN2' p.smc0) STATIC call: p.o7h.s0(java.util.List):java.lang.Object A[WRAPPED] (LINE:2174))
                     A[WRAPPED] (LINE:2178) p.lvl) == true) ? (1 int) : (0 int))
                      (wrap p.wul:0x08b3: CONSTRUCTOR 
                      (wrap p.sbo:0x08ae: CONSTRUCTOR 
                      ("spotify:search")
                      (0 int)
                      (r6v12 'd8r0Var21' p.d8r0)
                      (wrap java.lang.String:?: CAST (java.lang.String) (r22v6 ?? I:java.lang.String))
                      (wrap java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
                      (wrap java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
                      (wrap p.fg91:0x089e: SGET  A[WRAPPED] (LINE:2207) p.fg91.b p.fg91)
                      (wrap java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
                      (wrap java.util.List:?: CAST (java.util.List) (null java.util.List))
                      (wrap java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
                      (wrap p.qbo:0x0891: CONSTRUCTOR 
                      (r32v1 'str27' java.lang.String)
                      (r1v51 'str24' java.lang.String)
                      (r21v33 'z44' boolean)
                      (r15v14 'z12' boolean)
                      (r30v2 'z43' boolean)
                      (r17v30 'z42' boolean)
                     A[WRAPPED] (LINE:2194) call: p.qbo.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):void type: CONSTRUCTOR)
                      (1792 int)
                     A[WRAPPED] (LINE:2223) call: p.sbo.<init>(java.lang.String, int, p.d8r0, java.lang.String, java.lang.String, java.lang.String, p.c380, java.lang.String, java.util.List, java.lang.String, p.qbo, int):void type: CONSTRUCTOR)
                     A[WRAPPED] (LINE:2228) call: p.wul.<init>(p.sbo):void type: CONSTRUCTOR)
                     VIRTUAL call: p.smc0.add(int, java.lang.Object):void (LINE:2231) in method: p.p1f0.b(p.pc51, p.lw41):p.lw41, file: /workspace/spotify-analysis/dex-input/classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v6 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 3530
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.p1f0.b(p.pc51, p.lw41):p.lw41");
            }

            public ParcelFileDescriptor c(Uri uri, File file, String str) throws IOException {
                if (uri.toString().length() == 0) {
                    ((j2e0) this.f).p("", str, "Image URI is empty or missing");
                    return null;
                }
                ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = ParcelFileDescriptor.createReliablePipe();
                fn31.T((llm) this.g, (o8n) null, 0, new z290(this, uri, parcelFileDescriptorArrCreateReliablePipe, str, (lnm) null, (byte) 26), 3);
                return parcelFileDescriptorArrCreateReliablePipe[0];
            }

            public t480 d(l7h1 l7h1Var, a8r0 a8r0Var, Set set, g6h1 g6h1Var) {
                t480 t480Var = new t480(UUID.randomUUID());
                ((ConcurrentHashMap) this.d).put(t480Var, new dgs0(((yqg) this.c).e(), l7h1Var, a8r0Var, set, g6h1Var));
                if (((AtomicBoolean) this.h).compareAndSet(false, true)) {
                    ((rku) this.f).b(Observable.interval(300L, 250L, TimeUnit.MILLISECONDS, Schedulers.b).subscribe(new ixp0(this, (byte) 8)));
                }
                return t480Var;
            }

            public void e(y6r0 y6r0Var) {
                ffe1 ffe1Var = (ffe1) this.a;
                b7x b7xVar = (Map) ((p7h1) ffe1Var.b).a.remove(y6r0Var);
                if (b7xVar == null) {
                    b7xVar = b7x.a;
                }
                ((ConcurrentHashMap) ffe1Var.c).putAll(b7xVar);
            }

            public void f(y6r0 y6r0Var) {
                ((ffe1) this.a).p(y6r0Var);
            }

            public void g(y6r0 y6r0Var) {
                ((rku) this.g).b(new CompletableDoFinally(new CompletableFromRunnable(new jyh0((Object) this, (Object) y6r0Var, (byte) 5)).s(Schedulers.b), new wqd0(this, (byte) 14)).subscribe());
            }

            public dwn0 h() {
                String str = (String) this.a;
                if (str == null) {
                    eg.m("uri was not set!");
                    return null;
                }
                String str2 = (String) this.b;
                if (str2 != null) {
                    return new dwn0(str, str2, ((Boolean) this.c).booleanValue(), ((Boolean) this.d).booleanValue(), 0, 0, ((Boolean) this.e).booleanValue(), (a690) this.f, (Bundle) this.g, (cwn0) this.h);
                }
                eg.m("title was not set!");
                return null;
            }

            public void i() {
                this.c = Boolean.TRUE;
            }

            public qn j() {
                lo9 lo9Var = new lo9((hur) this.a, (byte) 8);
                i3b i3bVar = new i3b((tz01) this.b, (byte) 24);
                tzo tzoVar = (tzo) this.h;
                mev mevVar = new mev(tzoVar, (byte) 0);
                f2g1 f2g1Var = new f2g1(tzoVar, (byte) 2);
                e4b1 e4b1Var = new e4b1((xaz0) this.c, (byte) 26);
                ec4 ec4Var = (ec4) this.d;
                lan1 lan1Var = new lan1(ec4Var, (byte) 26);
                uq8 uq8Var = new uq8(ec4Var, (byte) 8);
                ruc0 ruc0Var = new ruc0(this.f, (byte) 8);
                yjq yjqVar = (yjq) this.g;
                q8n q8nVar = (q8n) this.e;
                CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
                CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                q0m1 q0m1Var = new q0m1(lo9Var);
                jd11 jd11Var = rc11.a;
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yzl1.class), runSequentially.a(q0m1Var));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e0m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s0m1(i3bVar)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uzl1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u0m1(mevVar)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f0m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w0m1(f2g1Var)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tzl1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y0m1(e4b1Var)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c0m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a1m1(lan1Var)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(szl1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i0m1(uq8Var)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vzl1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new j0m1(ruc0Var)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xzl1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k0m1(yjqVar)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wzl1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l0m1(yjqVar)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d0m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m0m1()));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a0m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n0m1()));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b0m1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new o0m1()));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zzl1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new h0m1()));
                return new qn(new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), this, (byte) 14);
            }

            public void k() {
                this.d = Boolean.TRUE;
            }

            public void m(Bundle bundle) {
                this.g = bundle;
            }

            public LinearLayoutCompat n() {
                return (LinearLayoutCompat) ((idd1) this.b).getValue();
            }

            public mt o() {
                return new mt(((ac91) this.a).e, (byte) 26);
            }

            public void p() {
                this.f = b690.a;
            }

            public void q(cwn0 cwn0Var) {
                this.h = cwn0Var;
            }

            public void r(boolean z) {
                AppProtocolRemoteService appProtocolRemoteService = (AppProtocolRemoteService) this.d;
                appProtocolRemoteService.e1.post(new jv5(appProtocolRemoteService, z, (aos) this.a, (byte) 0));
            }

            public void reset() {
                ((rku) this.f).a();
                ((AtomicBoolean) this.h).set(false);
                ((ConcurrentHashMap) ((ffe1) this.a).c).clear();
                ((rku) this.g).a();
            }

            public void s(String str) {
                try {
                    ((aos) this.a).j.getClass();
                    nhc.D(str, "signature");
                    t();
                } catch (FieldValidator.ValidationException e) {
                    s24 s24Var = (s24) this.b;
                    es5.Companion.getClass();
                    s24Var.Y(ds5.a(e), "wamp.error");
                }
            }

            /* JADX WARN: Code duplicated, block: B:17:0x005d  */
            /* JADX WARN: Code duplicated, block: B:20:0x0062  */
            /* JADX WARN: Code duplicated, block: B:21:0x0065  */
            /* JADX WARN: Code duplicated, block: B:28:0x007f  */
            /* JADX WARN: Code duplicated, block: B:30:0x0083  */
            /* JADX WARN: Code duplicated, block: B:31:0x0086  */
            /* JADX WARN: Code duplicated, block: B:34:0x008c  */
            /* JADX WARN: Code duplicated, block: B:35:0x008f  */
            /* JADX WARN: Code duplicated, block: B:38:0x009b  */
            /* JADX WARN: Code duplicated, block: B:39:0x009d  */
            /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
            /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
            /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
            /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
            /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
            /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
            /* JADX WARN: Code duplicated, block: B:65:0x0100  */
            /* JADX WARN: Code duplicated, block: B:75:0x03e8 A[LOOP:0: B:73:0x03e2->B:75:0x03e8, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:78:0x0437  */
            public void t() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                String str9;
                String str10;
                String str11;
                String str12;
                String str13;
                List list;
                boolean z;
                List list2;
                Iterator it;
                String strE;
                int iIndexOf;
                String str14;
                ((aos) this.a).l = (byte) 1;
                aos aosVar = (aos) this.a;
                oh61 oh61Var = aosVar.f;
                int i = aosVar.e;
                zq5 zq5Var = aosVar.a;
                zq5Var.getClass();
                aos aosVar2 = (aos) this.a;
                String str15 = aosVar2.h;
                String str16 = aosVar2.i;
                dbm dbmVar = oh61Var.m;
                x610 x610Var = oh61Var.c;
                oh61Var.o = zq5Var;
                oh61Var.p = i + "_root";
                String str17 = str16 == null ? "" : str16;
                String str18 = str15 == null ? "" : str15;
                cr5 cr5Var = zq5Var.c;
                String str19 = cr5Var.d;
                if (!jhc1.F(str19)) {
                    if (str19 == null) {
                        str = "";
                    }
                    str2 = cr5Var.e;
                    str3 = cr5Var.g;
                    str4 = cr5Var.h;
                    if (str2 == null) {
                        str2 = "";
                    }
                    str5 = cr5Var.f;
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                    if (!"app_to_app".equals(str15) && str4 != null) {
                        String[] strArrSplit = str4.split("-");
                        if (strArrSplit.length > 0) {
                            str4 = strArrSplit[0];
                        }
                    }
                    if (str4 == null) {
                        str7 = "";
                    } else {
                        str7 = str4;
                    }
                    str8 = cr5Var.i;
                    if (str8 == null) {
                        str9 = "";
                    } else {
                        str9 = str8;
                    }
                    if ("car".equalsIgnoreCase(str3)) {
                        str10 = "car";
                    } else {
                        str10 = "wearable";
                        if (!"wearable".equalsIgnoreCase(str3)) {
                            if ("app".equalsIgnoreCase(cr5Var.g)) {
                                str10 = "app";
                            } else {
                                str10 = "";
                            }
                        }
                    }
                    if ("app".equalsIgnoreCase(cr5Var.g)) {
                        str14 = cr5Var.e;
                        if (str14 == null) {
                            str14 = "";
                        }
                        str11 = str14;
                        str2 = "";
                    } else {
                        str11 = "";
                    }
                    str12 = str10;
                    oh61Var.z = new m210(str17, str, str2, str18, "", str12, str9, str6, str7, "inter_app", str11);
                    if ("car".equals(str12)) {
                        str13 = "default-cars";
                    } else {
                        str13 = "default";
                    }
                    oh61Var.y = str13;
                    if ("app".equalsIgnoreCase(cr5Var.g)) {
                        oh61Var.q = true;
                    } else {
                        list = cr5Var.c;
                        if (list == null && list.contains("com.spotify.features.load_multiple_images")) {
                            z = true;
                        } else {
                            z = false;
                        }
                        oh61Var.q = z;
                    }
                    list2 = cr5Var.c;
                    if (list2 != null && list2.contains("com.spotify.features.voice")) {
                        dbmVar.a = new ho41(((ho41) dbmVar.a).a | 32);
                    }
                    rl1 rl1VarP = x610Var.a.c.p(oh61Var.z);
                    oh61Var.s = rl1VarP;
                    rl1VarP.J();
                    x610 x610Var2 = oh61Var.c;
                    oh61Var.x = new m5a1(x610Var2);
                    p2p p2pVar = oh61Var.b.a;
                    cp31 cp31Var = (cp31) p2pVar.d;
                    daq daqVar = (daq) p2pVar.c;
                    uw0 uw0Var = new uw0(aosVar, x610Var2, (Context) cp31Var.a, (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.r3.get(), (o241) daqVar.u4.get(), (Flowable) daqVar.D5.get(), (b7n) daqVar.L4.get(), (yqg) daqVar.J1.get(), (irb1) ((jly0) cp31Var.c).get(), (dxz0) daqVar.I4.get(), new ow3(new km3((yze1) daqVar.Gm.get(), new x5j1((w5b1) daqVar.W3.get(), (byte) 2)), daqVar.A(), (byte) 27), cp31Var.F());
                    oh61Var.r = uw0Var;
                    fno fnoVar = new fno((x610) uw0Var.g, (aos) uw0Var.e, (Scheduler) uw0Var.c, (Flowable) uw0Var.t, (irb1) uw0Var.b);
                    zmf1 zmf1Var = new zmf1((x610) uw0Var.g, (aos) uw0Var.e, (Scheduler) uw0Var.c, (Flowable) uw0Var.t, (yqg) uw0Var.Y, (irb1) uw0Var.b);
                    fno fnoVar2 = new fno((x610) uw0Var.g, (aos) uw0Var.e, (Scheduler) uw0Var.c, (Flowable) uw0Var.t, (irb1) uw0Var.b, (byte) 1);
                    ze41 ze41Var = new ze41((x610) uw0Var.g, (aos) uw0Var.e, (Scheduler) uw0Var.c, (Flowable) uw0Var.t, (irb1) uw0Var.b, (byte) 1);
                    fno fnoVar3 = new fno((x610) uw0Var.g, (aos) uw0Var.e, (Scheduler) uw0Var.c, (Flowable) uw0Var.t, (irb1) uw0Var.b, (byte) 3);
                    ze41 ze41Var2 = new ze41((x610) uw0Var.g, (aos) uw0Var.e, (Scheduler) uw0Var.c, (Flowable) uw0Var.t, (irb1) uw0Var.b, (byte) 0);
                    x610 x610Var3 = (x610) uw0Var.g;
                    aos aosVar3 = (aos) uw0Var.e;
                    hi3 hi3Var = new hi3(x610Var3, aosVar3, (byte) 1);
                    Context context = (Context) uw0Var.d;
                    Scheduler scheduler = (Scheduler) uw0Var.c;
                    olm olmVar = new olm(context, x610Var3, aosVar3, new poj0(x610Var3, scheduler, (Flowable) uw0Var.t, (Map) uw0Var.N0, (byte) 10));
                    olm olmVar2 = new olm(context, x610Var3, aosVar3, scheduler);
                    hi3 hi3Var2 = new hi3(x610Var3, aosVar3, (byte) 0);
                    fno fnoVar4 = new fno((x610) uw0Var.g, (aos) uw0Var.e, (Scheduler) uw0Var.c, (Flowable) uw0Var.t, (yqg) uw0Var.Y, (irb1) uw0Var.b);
                    g6v0 g6v0Var = new g6v0(x610Var3, aosVar3);
                    g6v0Var.f = EmptyDisposable.a;
                    g6v0Var.g = Float.MIN_VALUE;
                    kld kldVar = new kld(x610Var3, (o241) uw0Var.i, aosVar3, (Scheduler) uw0Var.h);
                    olm olmVar3 = new olm((Context) uw0Var.d, (x610) uw0Var.g, (aos) uw0Var.e, (Scheduler) uw0Var.c, (ow3) uw0Var.O0);
                    zh61 zh61Var = new zh61((Context) uw0Var.d, (x610) uw0Var.g, (aos) uw0Var.e, (Scheduler) uw0Var.c, (b7n) uw0Var.X, (dxz0) uw0Var.Z);
                    HashMap map = (HashMap) uw0Var.f;
                    map.put("com.spotify.current_track", fnoVar);
                    map.put("com.spotify.track_elapsed", zmf1Var);
                    map.put("com.spotify.playback_speed", fnoVar2);
                    map.put("com.spotify.shuffle", ze41Var);
                    map.put("com.spotify.repeat", fnoVar3);
                    map.put("com.spotify.saved", ze41Var2);
                    map.put("com.spotify.rating", hi3Var);
                    map.put("com.spotify.current_context", olmVar);
                    map.put("com.spotify.status", olmVar2);
                    map.put("com.spotify.alert", hi3Var2);
                    map.put("com.spotify.player_state", fnoVar4);
                    map.put("com.spotify.podcast_playback_speed", g6v0Var);
                    map.put("com.spotify.capabilities", kldVar);
                    map.put("com.spotify.token", olmVar3);
                    map.put("com.spotify.session_state", zh61Var);
                    uw0 uw0Var2 = oh61Var.r;
                    irb1 irb1Var = (irb1) uw0Var2.b;
                    irb1Var.b.a(irb1Var.a.c().subscribe(new hrb1(irb1Var, (byte) 0), new hrb1(irb1Var, (byte) 1)));
                    it = ((HashMap) uw0Var2.f).values().iterator();
                    while (it.hasNext()) {
                        ((xca) it.next()).c();
                    }
                    oh61Var.t = oh61Var.f.subscribe(new fv5(dbmVar, (byte) 20));
                    oh61Var.u = (c610) x610Var.a.e.get();
                    oh61Var.v = x610Var.c();
                    oh61Var.w = (k710) x610Var.a.i.get();
                    strE = ((ajg) this.e).e();
                    iIndexOf = strE.indexOf(45);
                    if (iIndexOf > 0) {
                        strE = strE.substring(0, iIndexOf);
                    }
                    Calendar calendarD = ((yqg) this.f).d();
                    calendarD.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                    s24 s24Var = (s24) this.b;
                    int i2 = ((aos) this.a).e;
                    String strA = d7r.a(calendarD);
                    wq5 wq5Var = new wq5();
                    wq5 wq5Var2 = new wq5();
                    fr5 fr5Var = new fr5();
                    fr5Var.b = wq5Var;
                    fr5Var.c = wq5Var2;
                    fr5Var.d = null;
                    fr5Var.e = null;
                    bv5 bv5Var = new bv5();
                    bv5Var.b = fr5Var;
                    bv5Var.c = strE;
                    bv5Var.d = "";
                    bv5Var.e = "";
                    bv5Var.f = "";
                    bv5Var.g = "";
                    bv5Var.h = strA;
                    s24Var.a0(new Object[]{2, Integer.valueOf(i2), bv5Var});
                    ((mj61) this.c).a((aos) this.a);
                    r(true);
                }
                str19 = "Unknown_app_protocol_client_id";
                str = str19;
                str2 = cr5Var.e;
                str3 = cr5Var.g;
                str4 = cr5Var.h;
                if (str2 == null) {
                    str2 = "";
                }
                str5 = cr5Var.f;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                if (!"app_to_app".equals(str15)) {
                }
                if (str4 == null) {
                    str7 = "";
                } else {
                    str7 = str4;
                }
                str8 = cr5Var.i;
                if (str8 == null) {
                    str9 = "";
                } else {
                    str9 = str8;
                }
                if ("car".equalsIgnoreCase(str3)) {
                    str10 = "car";
                } else {
                    str10 = "wearable";
                    if (!"wearable".equalsIgnoreCase(str3)) {
                        if ("app".equalsIgnoreCase(cr5Var.g)) {
                            str10 = "app";
                        } else {
                            str10 = "";
                        }
                    }
                }
                if ("app".equalsIgnoreCase(cr5Var.g)) {
                    str14 = cr5Var.e;
                    if (str14 == null) {
                        str14 = "";
                    }
                    str11 = str14;
                    str2 = "";
                } else {
                    str11 = "";
                }
                str12 = str10;
                oh61Var.z = new m210(str17, str, str2, str18, "", str12, str9, str6, str7, "inter_app", str11);
                if ("car".equals(str12)) {
                    str13 = "default-cars";
                } else {
                    str13 = "default";
                }
                oh61Var.y = str13;
                if ("app".equalsIgnoreCase(cr5Var.g)) {
                    oh61Var.q = true;
                } else {
                    list = cr5Var.c;
                    if (list == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    oh61Var.q = z;
                }
                list2 = cr5Var.c;
                if (list2 != null) {
                    dbmVar.a = new ho41(((ho41) dbmVar.a).a | 32);
                }
                rl1 rl1VarP2 = x610Var.a.c.p(oh61Var.z);
                oh61Var.s = rl1VarP2;
                rl1VarP2.J();
                x610 x610Var4 = oh61Var.c;
                oh61Var.x = new m5a1(x610Var4);
                p2p p2pVar2 = oh61Var.b.a;
                cp31 cp31Var2 = (cp31) p2pVar2.d;
                daq daqVar2 = (daq) p2pVar2.c;
                uw0 uw0Var3 = new uw0(aosVar, x610Var4, (Context) cp31Var2.a, (Scheduler) daqVar2.z1.get(), (Scheduler) daqVar2.r3.get(), (o241) daqVar2.u4.get(), (Flowable) daqVar2.D5.get(), (b7n) daqVar2.L4.get(), (yqg) daqVar2.J1.get(), (irb1) ((jly0) cp31Var2.c).get(), (dxz0) daqVar2.I4.get(), new ow3(new km3((yze1) daqVar2.Gm.get(), new x5j1((w5b1) daqVar2.W3.get(), (byte) 2)), daqVar2.A(), (byte) 27), cp31Var2.F());
                oh61Var.r = uw0Var3;
                fno fnoVar5 = new fno((x610) uw0Var3.g, (aos) uw0Var3.e, (Scheduler) uw0Var3.c, (Flowable) uw0Var3.t, (irb1) uw0Var3.b);
                zmf1 zmf1Var2 = new zmf1((x610) uw0Var3.g, (aos) uw0Var3.e, (Scheduler) uw0Var3.c, (Flowable) uw0Var3.t, (yqg) uw0Var3.Y, (irb1) uw0Var3.b);
                fno fnoVar6 = new fno((x610) uw0Var3.g, (aos) uw0Var3.e, (Scheduler) uw0Var3.c, (Flowable) uw0Var3.t, (irb1) uw0Var3.b, (byte) 1);
                ze41 ze41Var3 = new ze41((x610) uw0Var3.g, (aos) uw0Var3.e, (Scheduler) uw0Var3.c, (Flowable) uw0Var3.t, (irb1) uw0Var3.b, (byte) 1);
                fno fnoVar7 = new fno((x610) uw0Var3.g, (aos) uw0Var3.e, (Scheduler) uw0Var3.c, (Flowable) uw0Var3.t, (irb1) uw0Var3.b, (byte) 3);
                ze41 ze41Var4 = new ze41((x610) uw0Var3.g, (aos) uw0Var3.e, (Scheduler) uw0Var3.c, (Flowable) uw0Var3.t, (irb1) uw0Var3.b, (byte) 0);
                x610 x610Var5 = (x610) uw0Var3.g;
                aos aosVar4 = (aos) uw0Var3.e;
                hi3 hi3Var3 = new hi3(x610Var5, aosVar4, (byte) 1);
                Context context2 = (Context) uw0Var3.d;
                Scheduler scheduler2 = (Scheduler) uw0Var3.c;
                olm olmVar4 = new olm(context2, x610Var5, aosVar4, new poj0(x610Var5, scheduler2, (Flowable) uw0Var3.t, (Map) uw0Var3.N0, (byte) 10));
                olm olmVar5 = new olm(context2, x610Var5, aosVar4, scheduler2);
                hi3 hi3Var4 = new hi3(x610Var5, aosVar4, (byte) 0);
                fno fnoVar8 = new fno((x610) uw0Var3.g, (aos) uw0Var3.e, (Scheduler) uw0Var3.c, (Flowable) uw0Var3.t, (yqg) uw0Var3.Y, (irb1) uw0Var3.b);
                g6v0 g6v0Var2 = new g6v0(x610Var5, aosVar4);
                g6v0Var2.f = EmptyDisposable.a;
                g6v0Var2.g = Float.MIN_VALUE;
                kld kldVar2 = new kld(x610Var5, (o241) uw0Var3.i, aosVar4, (Scheduler) uw0Var3.h);
                olm olmVar6 = new olm((Context) uw0Var3.d, (x610) uw0Var3.g, (aos) uw0Var3.e, (Scheduler) uw0Var3.c, (ow3) uw0Var3.O0);
                zh61 zh61Var2 = new zh61((Context) uw0Var3.d, (x610) uw0Var3.g, (aos) uw0Var3.e, (Scheduler) uw0Var3.c, (b7n) uw0Var3.X, (dxz0) uw0Var3.Z);
                HashMap map2 = (HashMap) uw0Var3.f;
                map2.put("com.spotify.current_track", fnoVar5);
                map2.put("com.spotify.track_elapsed", zmf1Var2);
                map2.put("com.spotify.playback_speed", fnoVar6);
                map2.put("com.spotify.shuffle", ze41Var3);
                map2.put("com.spotify.repeat", fnoVar7);
                map2.put("com.spotify.saved", ze41Var4);
                map2.put("com.spotify.rating", hi3Var3);
                map2.put("com.spotify.current_context", olmVar4);
                map2.put("com.spotify.status", olmVar5);
                map2.put("com.spotify.alert", hi3Var4);
                map2.put("com.spotify.player_state", fnoVar8);
                map2.put("com.spotify.podcast_playback_speed", g6v0Var2);
                map2.put("com.spotify.capabilities", kldVar2);
                map2.put("com.spotify.token", olmVar6);
                map2.put("com.spotify.session_state", zh61Var2);
                uw0 uw0Var4 = oh61Var.r;
                irb1 irb1Var2 = (irb1) uw0Var4.b;
                irb1Var2.b.a(irb1Var2.a.c().subscribe(new hrb1(irb1Var2, (byte) 0), new hrb1(irb1Var2, (byte) 1)));
                it = ((HashMap) uw0Var4.f).values().iterator();
                while (it.hasNext()) {
                    ((xca) it.next()).c();
                }
                oh61Var.t = oh61Var.f.subscribe(new fv5(dbmVar, (byte) 20));
                oh61Var.u = (c610) x610Var.a.e.get();
                oh61Var.v = x610Var.c();
                oh61Var.w = (k710) x610Var.a.i.get();
                strE = ((ajg) this.e).e();
                iIndexOf = strE.indexOf(45);
                if (iIndexOf > 0) {
                    strE = strE.substring(0, iIndexOf);
                }
                Calendar calendarD2 = ((yqg) this.f).d();
                calendarD2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                s24 s24Var2 = (s24) this.b;
                int i3 = ((aos) this.a).e;
                String strA2 = d7r.a(calendarD2);
                wq5 wq5Var3 = new wq5();
                wq5 wq5Var4 = new wq5();
                fr5 fr5Var2 = new fr5();
                fr5Var2.b = wq5Var3;
                fr5Var2.c = wq5Var4;
                fr5Var2.d = null;
                fr5Var2.e = null;
                bv5 bv5Var2 = new bv5();
                bv5Var2.b = fr5Var2;
                bv5Var2.c = strE;
                bv5Var2.d = "";
                bv5Var2.e = "";
                bv5Var2.f = "";
                bv5Var2.g = "";
                bv5Var2.h = strA2;
                s24Var2.a0(new Object[]{2, Integer.valueOf(i3), bv5Var2});
                ((mj61) this.c).a((aos) this.a);
                r(true);
            }

            public void u() {
                snc0 snc0Var = (snc0) this.e;
                if (snc0Var != null) {
                    snc0Var.destroy();
                } else {
                    u890.C("listContentRuntime");
                    throw null;
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.interapp.interappprotocol.NotAuthorizedException */
            public void v(q881 q881Var) throws NotAuthorizedException {
                s24 s24Var = (s24) this.b;
                aos aosVar = (aos) this.a;
                if (aosVar.l != 1) {
                    throw new NotAuthorizedException();
                }
                try {
                    int iM = aosVar.f.m(q881Var.e(), q881Var.f());
                    ((mj61) this.c).a(aosVar);
                    s24Var.a0(new Object[]{33, Integer.valueOf(q881Var.e()), Integer.valueOf(iM)});
                    try {
                        oh61 oh61Var = aosVar.f;
                        CompletableFromAction completableFromAction = new CompletableFromAction(new ok70(oh61Var.m, 4));
                        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
                        completableFromAction.subscribe(blockingMultiObserver);
                        blockingMultiObserver.b();
                        int iE = q881Var.e();
                        String strF = q881Var.f();
                        nhc.F(0, Integer.MAX_VALUE, iE, "request id");
                        nhc.D(strF, "uri");
                        xca xcaVarM = oh61Var.r.m(q881Var.f());
                        if (xcaVarM != null) {
                            xcaVarM.e(q881Var, iM);
                        } else {
                            Logger.k("Attempted to notify subscribed to unknown topic \"%s\".", new Object[]{q881Var.f()});
                        }
                    } catch (FieldValidator.ValidationException unused) {
                    }
                } catch (FieldValidator.ValidationException e) {
                    int iE2 = q881Var.e();
                    es5.Companion.getClass();
                    s24Var.Z(32, iE2, ds5.a(e), "wamp.error.invalid_argument");
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.interapp.interappprotocol.NotAuthorizedException */
            public void w(int i, int i2) throws NotAuthorizedException {
                s24 s24Var = (s24) this.b;
                aos aosVar = (aos) this.a;
                if (aosVar.l != 1) {
                    throw new NotAuthorizedException();
                }
                try {
                    if (!aosVar.f.n(i, i2)) {
                        s24Var.Z(34, i, cv5.a, "wamp.error.no_such_subscription");
                    } else {
                        ((mj61) this.c).a(aosVar);
                        s24Var.a0(new Object[]{35, Integer.valueOf(i)});
                    }
                } catch (FieldValidator.ValidationException e) {
                    es5.Companion.getClass();
                    s24Var.Z(34, i, ds5.a(e), "wamp.error.invalid_argument");
                }
            }

            public void x() {
                this.e = Boolean.TRUE;
            }

            public void y() {
                ec4 ec4Var = (ec4) this.d;
                ec4Var.getClass();
                ec4Var.d(new dc4(ec4Var, (byte) 0));
            }

            public void z(gl8 gl8Var) {
                th61 th61Var = (th61) this.h;
                th61 th61Var2 = gl8Var.a;
                if (u890.j(th61Var, th61Var2)) {
                    return;
                }
                this.h = th61Var2;
                ip31 ip31Var = (ip31) ((ep31) this.d).b;
                ip31Var.i = th61Var2;
                Iterator it = ((LinkedHashSet) ip31Var.d).iterator();
                while (it.hasNext()) {
                    ((d8q0) it.next()).a(th61Var2);
                }
            }

            public p1f0(yge0 yge0Var, cvg0 cvg0Var, String str, String str2, String str3, String str4, String str5, dg30 dg30Var) {
                this.a = yge0Var;
                this.b = cvg0Var;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
                this.g = str5;
                this.h = new WeakReference(dg30Var);
            }

            public p1f0(iac0 iac0Var, n1f0 n1f0Var, ap31 ap31Var, vxf0 vxf0Var, ep31 ep31Var, riq riqVar) {
                this.a = iac0Var;
                this.b = ap31Var;
                this.c = vxf0Var;
                this.d = ep31Var;
                this.e = new kdn0(o1f0.b);
            }

            public /* synthetic */ p1f0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
                this.d = obj4;
                this.e = obj5;
                this.f = obj6;
                this.g = obj7;
                this.h = obj8;
            }

            public p1f0(gw70 gw70Var, aai0 aai0Var, p370 p370Var, oo70 oo70Var, xm41 xm41Var, q8n q8nVar, j2e0 j2e0Var) {
                this.a = gw70Var;
                this.b = aai0Var;
                this.c = p370Var;
                this.d = oo70Var;
                this.e = xm41Var;
                this.f = j2e0Var;
                this.g = i3a.k(q8nVar);
                this.h = new AtomicInteger(0);
            }

            public p1f0(l2r l2rVar, iac0 iac0Var, Set set, khc khcVar) {
                this.b = l2rVar;
                this.a = iac0Var;
                this.c = set;
                this.d = khcVar;
                this.h = gio1.b((Object) null);
            }

            public p1f0(String str) {
                this.a = str;
                this.b = "";
                Boolean bool = Boolean.FALSE;
                this.c = bool;
                this.d = bool;
                this.e = bool;
            }

            public p1f0(ffe1 ffe1Var, q7h1 q7h1Var, yqg yqgVar) {
                this.a = ffe1Var;
                this.b = q7h1Var;
                this.c = yqgVar;
                this.d = new ConcurrentHashMap();
                this.e = new ConcurrentHashMap();
                this.f = new rku();
                this.g = new rku();
                this.h = new AtomicBoolean(false);
            }

            public p1f0(LinearLayout linearLayout, TextView textView, TextView textView2, View view, EditText editText, TextView textView3, ConstraintLayout constraintLayout, Button button, View view2) {
                this.a = textView;
                this.b = textView2;
                this.c = view;
                this.d = editText;
                this.e = textView3;
                this.f = constraintLayout;
                this.g = button;
                this.h = view2;
            }

            public p1f0(p6r0 p6r0Var, lko lkoVar, byu byuVar, pyu pyuVar, pix0 pix0Var, peq peqVar, qeq qeqVar, sbq sbqVar, kx11 kx11Var, bc91 bc91Var, ezc ezcVar, bpb1 bpb1Var, ioj0 ioj0Var) {
                this.a = new ac91(new zcd(ezcVar, (byte) 2), bpb1Var, bc91Var.a);
                this.b = lko.a(lkoVar, o(), kx11Var.c);
                this.c = pix0.a(pix0Var, o(), p6r0Var);
                k740 k740VarV = a8o.v(peqVar, o());
                this.d = k740VarV;
                this.e = byuVar.a(o());
                this.f = pyuVar.a(o(), k740VarV, new kdn0(ioj0Var));
                this.g = qeqVar.a(o());
                this.h = sbqVar.a(o());
            }

            public p1f0(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, ArtworkView artworkView, LinearLayout linearLayout2, TextView textView4, EncoreButton encoreButton, LoadingProgressBarView loadingProgressBarView) {
                this.a = constraintLayout;
                this.b = linearLayout;
                this.c = textView2;
                this.d = textView3;
                this.e = artworkView;
                this.f = linearLayout2;
                this.g = encoreButton;
                this.h = loadingProgressBarView;
            }

            public p1f0(aos aosVar, s24 s24Var, mj61 mj61Var, AppProtocolRemoteService appProtocolRemoteService, ajg ajgVar, yqg yqgVar, vd vdVar) {
                this.h = EmptyDisposable.a;
                this.a = aosVar;
                this.b = s24Var;
                this.c = mj61Var;
                this.d = appProtocolRemoteService;
                this.e = ajgVar;
                this.f = yqgVar;
                this.g = vdVar;
            }

            public p1f0() {
                Boolean bool = Boolean.FALSE;
                this.a = v8r.q(bool);
                this.b = new drr0(1.0f);
                this.c = v8r.q(bool);
                this.d = new drr0(1.0f);
                this.e = v8r.q(bool);
                this.f = v8r.q(new ofg1(ofg1.b));
                this.g = v8r.q(bool);
                this.h = v8r.q(new u7h(u7h.j));
            }

            public p1f0(yjj1 yjj1Var, c3s c3sVar, gw70 gw70Var, iac0 iac0Var, w2k1 w2k1Var, Scheduler scheduler, qlb qlbVar, sn4 sn4Var) {
                this.b = yjj1Var;
                this.c = c3sVar;
                this.d = gw70Var;
                this.a = iac0Var;
                this.e = w2k1Var;
                this.f = scheduler;
                this.g = qlbVar;
                this.h = sn4Var;
            }
        }
