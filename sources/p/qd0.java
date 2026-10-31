package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.geometry.Offset;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.endless.sessionstarter.EndlessActivity;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import j$.net.URLDecoder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;
import spotify.your_library.esperanto.proto.IsCuratedRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qd0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd0(l811 l811Var, c5f0 c5f0Var, Function0 function0, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 21;
        this.d = l811Var;
        this.e = c5f0Var;
        this.f = function0;
    }

    private final Object e(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            m441 m441Var = new m441(new glu0((byte) 3, (xmu0) ((yxb0) this.e).c, ((b4z) this.f).a, (lnm) null));
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, m441Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object g(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            kge kgeVarD = hu20.d(new mr20[]{new huz(obj2, (byte) 10), new evz(new ipr((mr20) this.e, (iu30) this.f, obj2, (byte) 12), obj2, (byte) 6)});
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, kgeVarD, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object h(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            kge kgeVarD = hu20.d(new mr20[]{new huz(obj2, (byte) 10), new evz(new x010((jge) this.e, (iu30) this.f, obj2, (byte) 0), obj2, (byte) 5)});
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, kgeVarD, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object i(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            ht20 ht20Var = ((Boolean) obj2).booleanValue() ? new ht20(((t7y) this.e).g(((dm20) this.f).a), new qjr(2, (lnm) null, (byte) 26)) : new huz(px3.a, (byte) 10);
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, ht20Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object j(Object obj) {
        p9w0 p9w0Var = (p9w0) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            this.c = null;
            this.b = true;
            obj = p9w0Var.d(this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        l811 l811Var = (l811) this.d;
        if (l811Var.a && zBooleanValue) {
            l811Var.a = false;
            c5f0 c5f0Var = (c5f0) this.e;
            if (c5f0Var != null) {
                c5f0Var.a.setValue(Boolean.FALSE);
            }
            ((Function0) this.f).invoke();
        }
        return rih1.a;
    }

    private final Object m(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        pv70 pv70Var = (pv70) obj2;
        ArrayList arrayList = ((sv70) this.e).c;
        List list = pv70Var.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new tlt(((ji90) it.next()).a));
        }
        ArrayList<tlt> arrayListN0 = o7h.N0(arrayList2, arrayList);
        nm1 nm1Var = (nm1) this.f;
        idd1 idd1Var = (idd1) nm1Var.i;
        d0r d0rVar = (d0r) nm1Var.b;
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayListN0, 10));
        for (tlt tltVar : arrayListN0) {
            arrayList3.add(new evz(d3p1.F(d0rVar, ((bmt) idd1Var.getValue()).e, tltVar), tltVar, (byte) 28));
        }
        mr20[] mr20VarArr = (mr20[]) arrayList3.toArray(new mr20[0]);
        kge kgeVarD = hu20.d((mr20[]) Arrays.copyOf(mr20VarArr, mr20VarArr.length));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayListN0) {
            if (!(x2p1.n(d0rVar, ((bmt) idd1Var.getValue()).e, (tlt) obj3) instanceof h1r)) {
                arrayList4.add(obj3);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(((tlt) it2.next()).a);
        }
        ipr iprVar = new ipr(linkedHashSet, kgeVarD, new mnl(3, (lnm) null, (byte) 29), (byte) 16);
        this.c = null;
        this.d = null;
        this.b = true;
        u4p1.S(vr20Var);
        Object objCollect = iprVar.collect(new ap70(vr20Var, pv70Var, arrayListN0, (byte) 1), this);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }

    private final Object o(Object obj) {
        huz kgeVar;
        Object obj2;
        h5y0 h5y0Var;
        Set set = (Set) this.f;
        hm90 hm90Var = (hm90) this.e;
        vr20 vr20Var = (vr20) this.c;
        Object obj3 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            mmr0 mmr0Var = (mmr0) obj3;
            Map map = (Map) mmr0Var.a;
            int i = 10;
            if (((Boolean) mmr0Var.b).booleanValue()) {
                kgeVar = new huz(hm90Var.f(set), (byte) 10);
                obj2 = null;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : set) {
                    z6x z6xVar = (List) map.get((String) obj4);
                    if (z6xVar == null) {
                        z6xVar = z6x.a;
                    }
                    Object arrayList = linkedHashMap.get(z6xVar);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(z6xVar, arrayList);
                    }
                    ((List) arrayList).add(obj4);
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    List list = (List) entry.getKey();
                    List list2 = (List) entry.getValue();
                    Set setP1 = o7h.p1(list2);
                    n6r0 n6r0Var = hm90Var.c;
                    boolean zIsEmpty = list.isEmpty();
                    jn7 jn7Var = hm90Var.a;
                    if (zIsEmpty) {
                        o831 o831VarO = ResumptionProgressEsperanto.GetProgressRequest.o();
                        o831VarO.n(setP1);
                        o831VarO.q(n6r0Var.path());
                        h5y0Var = new h5y0(jn7Var.callStream("spotify.resumption_progress_esperanto.proto.ResumptionProgress", "SubProgress", o831VarO.build()), (byte) 26);
                    } else {
                        n831 n831VarP = ResumptionProgressEsperanto.GetListProgressRequest.p();
                        n831VarP.n(setP1);
                        List<m3d0> list3 = list;
                        ArrayList arrayList3 = new ArrayList(q7h.U(list3, i));
                        for (m3d0 m3d0Var : list3) {
                            s831 s831VarN = ResumptionProgressEsperanto.ListSortParam.n();
                            s831VarN.q(m3d0Var.a);
                            s831VarN.n(m3d0Var.b);
                            arrayList3.add(s831VarN.build());
                        }
                        n831VarP.q(arrayList3);
                        n831VarP.r(n6r0Var.path());
                        h5y0Var = new h5y0(jn7Var.callStream("spotify.resumption_progress_esperanto.proto.ResumptionProgress", "SubListProgress", n831VarP.build()), (byte) 25);
                    }
                    arrayList2.add(new ipr(h5y0Var, hm90Var, list2, (byte) 25));
                    i = 10;
                }
                int i2 = hu20.a;
                kgeVar = new kge(arrayList2);
                obj2 = null;
            }
            this.c = obj2;
            this.d = obj2;
            this.b = true;
            Object objS = l4p1.s(vr20Var, kgeVar, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object p(Object obj) {
        String str;
        String str2;
        bx80 bx80VarB;
        ru9 ru9Var = (ru9) this.f;
        Intent intent = (Intent) this.c;
        th61 th61Var = (th61) this.d;
        boolean z = this.b;
        crn0 crn0Var = crn0.a;
        if (!z) {
            hm5.M(obj);
            Uri data = intent.getData();
            if (data != null) {
                List listP0 = ihc1.P0(ihc1.T0(data.toString(), '?', ""), new char[]{'&'}, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listP0) {
                    String str3 = (String) obj2;
                    if (str3.length() > 0 && ihc1.i0(str3, '=')) {
                        arrayList.add(obj2);
                    }
                }
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List listP1 = ihc1.P0((String) it.next(), new char[]{'='}, 2);
                    linkedHashMap.put((String) listP1.get(0), URLDecoder.decode((String) listP1.get(1), nne.a.name()));
                }
                str = (String) linkedHashMap.get("prompt");
            } else {
                str = null;
            }
            if (str == null) {
                dg30 dg30Var = (dg30) ru9Var.b;
                ou80 serializableExtra = intent.getSerializableExtra("extra_interaction_id");
                ou80 ou80Var = serializableExtra instanceof ou80 ? serializableExtra : null;
                int i = EndlessActivity.m1;
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(intent.getDataString());
                String str4 = th61Var.a;
                Intent intent2 = new Intent((Context) dg30Var, (Class<?>) EndlessActivity.class);
                intent2.putExtra("com.spotify.endless.sessionstarter.KEY_EXTRA_DEEPLINK", s4b1VarX.z());
                intent2.putExtra("com.spotify.endless.sessionstarter.KEY_USERNAME", str4);
                if (ou80Var != null) {
                    intent2.putExtra("com.spotify.endless.sessionstarter.KEY_INTERACTION_ID", (Serializable) ou80Var);
                }
                dg30Var.startActivity(intent2);
                return crn0Var;
            }
            zx60 zx60Var = (zx60) ru9Var.c;
            this.c = null;
            this.d = null;
            this.e = str;
            this.b = true;
            Object objK = b5p1.k(zx60Var, this);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
            String str5 = str;
            obj = objK;
            str2 = str5;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = (String) this.e;
            hm5.M(obj);
        }
        nw80 nw80Var = (nw80) obj;
        if (nw80Var != null && (bx80VarB = nw80Var.b()) != null) {
            bx80VarB.b(str2, vt81.a);
        }
        return crn0Var;
    }

    private final Object r(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        mmr0 mmr0Var = (mmr0) obj2;
        wsc0 wsc0Var = (wsc0) mmr0Var.a;
        rp91 rp91Var = (rp91) mmr0Var.b;
        mr20 mr20VarA = don1.A((at71) this.e, wsc0Var);
        hwc0 hwc0Var = (hwc0) this.f;
        this.c = null;
        this.d = null;
        this.b = true;
        u4p1.S(vr20Var);
        Object objCollect = mr20VarA.collect(new u60(vr20Var, hwc0Var, wsc0Var, rp91Var, (byte) 24), this);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }

    private final Object s(Object obj) {
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            m441 m441Var = new m441(new rzu((mdd0) this.f, (String) this.e, (String) obj2, (lnm) null, (byte) 26));
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, m441Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object t(Object obj) {
        lt20 huzVar;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        lnm lnmVar = null;
        if (!z) {
            hm5.M(obj);
            hoe hoeVar = (hoe) obj2;
            if (hoeVar.a && hoeVar.b) {
                vjd0 vjd0Var = (vjd0) this.f;
                String str = (String) this.e;
                huzVar = new lt20(hu20.e(rqt0.w(new zx60(yoi1.g(vjd0Var.b.a(new y6b1(str, false))), (byte) 14), ujd0.b, rqt0.b), new db3(lnmVar, vjd0Var, str, (byte) 3)), new kn1(str, null, (byte) 2), (byte) 0);
            } else {
                huzVar = new huz((Object) null, (byte) 10);
            }
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, huzVar, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                qd0 qd0Var = new qd0((lnm) obj3, this.e, obj4, (byte) 0);
                qd0Var.c = (vr20) obj;
                qd0Var.d = obj2;
                return qd0Var.invokeSuspend(rih1Var);
            case 1:
                qd0 qd0Var2 = new qd0((byte) 1, (kl1) obj4, (String) this.e, (lnm) obj3);
                qd0Var2.c = (vr20) obj;
                qd0Var2.d = obj2;
                return qd0Var2.invokeSuspend(rih1Var);
            case 2:
                qd0 qd0Var3 = new qd0((lnm) obj3, this.e, obj4, (byte) 2);
                qd0Var3.c = (vr20) obj;
                qd0Var3.d = (Object[]) obj2;
                return qd0Var3.invokeSuspend(rih1Var);
            case 3:
                qd0 qd0Var4 = new qd0((lnm) obj3, this.e, obj4, (byte) 3);
                qd0Var4.c = (vr20) obj;
                qd0Var4.d = (Object[]) obj2;
                return qd0Var4.invokeSuspend(rih1Var);
            case 4:
                qd0 qd0Var5 = new qd0((zsc) this.e, (Set) obj4, (lnm) obj3);
                qd0Var5.c = (vr20) obj;
                qd0Var5.d = (Throwable) obj2;
                return qd0Var5.invokeSuspend(rih1Var);
            case 5:
                qd0 qd0Var6 = new qd0((lnm) obj3, this.e, obj4, (byte) 5);
                qd0Var6.c = (vr20) obj;
                qd0Var6.d = obj2;
                return qd0Var6.invokeSuspend(rih1Var);
            case 6:
                qd0 qd0Var7 = new qd0((lnm) obj3, this.e, obj4, (byte) 6);
                qd0Var7.c = (vr20) obj;
                qd0Var7.d = obj2;
                return qd0Var7.invokeSuspend(rih1Var);
            case 7:
                qd0 qd0Var8 = new qd0((lnm) obj3, this.e, obj4, (byte) 7);
                qd0Var8.c = (vr20) obj;
                qd0Var8.d = obj2;
                return qd0Var8.invokeSuspend(rih1Var);
            case 8:
                qd0 qd0Var9 = new qd0((lnm) obj3, this.e, obj4, (byte) 8);
                qd0Var9.c = (vr20) obj;
                qd0Var9.d = obj2;
                return qd0Var9.invokeSuspend(rih1Var);
            case 9:
                qd0 qd0Var10 = new qd0((lnm) obj3, this.e, obj4, (byte) 9);
                qd0Var10.c = (vr20) obj;
                qd0Var10.d = obj2;
                return qd0Var10.invokeSuspend(rih1Var);
            case 10:
                qd0 qd0Var11 = new qd0((lnm) obj3, this.e, obj4, (byte) 10);
                qd0Var11.c = (vr20) obj;
                qd0Var11.d = obj2;
                return qd0Var11.invokeSuspend(rih1Var);
            case 11:
                qd0 qd0Var12 = new qd0((lnm) obj3, this.e, obj4, (byte) 11);
                qd0Var12.c = (vr20) obj;
                qd0Var12.d = obj2;
                return qd0Var12.invokeSuspend(rih1Var);
            case 12:
                qd0 qd0Var13 = new qd0((lnm) obj3, this.e, obj4, (byte) 12);
                qd0Var13.c = (vr20) obj;
                qd0Var13.d = obj2;
                return qd0Var13.invokeSuspend(rih1Var);
            case 13:
                qd0 qd0Var14 = new qd0((lnm) obj3, this.e, obj4, (byte) 13);
                qd0Var14.c = (vr20) obj;
                qd0Var14.d = obj2;
                return qd0Var14.invokeSuspend(rih1Var);
            case 14:
                qd0 qd0Var15 = new qd0((lnm) obj3, this.e, obj4, (byte) 14);
                qd0Var15.c = (vr20) obj;
                qd0Var15.d = obj2;
                return qd0Var15.invokeSuspend(rih1Var);
            case 15:
                qd0 qd0Var16 = new qd0((lnm) obj3, this.e, obj4, (byte) 15);
                qd0Var16.c = (vr20) obj;
                qd0Var16.d = obj2;
                return qd0Var16.invokeSuspend(rih1Var);
            case 16:
                qd0 qd0Var17 = new qd0((byte) 16, (qlw) obj4, (String) this.e, (lnm) obj3);
                qd0Var17.c = (vr20) obj;
                qd0Var17.d = obj2;
                return qd0Var17.invokeSuspend(rih1Var);
            case 17:
                qd0 qd0Var18 = new qd0((lnm) obj3, this.e, obj4, (byte) 17);
                qd0Var18.c = (vr20) obj;
                qd0Var18.d = obj2;
                return qd0Var18.invokeSuspend(rih1Var);
            case 18:
                qd0 qd0Var19 = new qd0((lnm) obj3, this.e, obj4, (byte) 18);
                qd0Var19.c = (vr20) obj;
                qd0Var19.d = obj2;
                return qd0Var19.invokeSuspend(rih1Var);
            case 19:
                qd0 qd0Var20 = new qd0((lnm) obj3, this.e, obj4, (byte) 19);
                qd0Var20.c = (vr20) obj;
                qd0Var20.d = obj2;
                return qd0Var20.invokeSuspend(rih1Var);
            case 20:
                qd0 qd0Var21 = new qd0((lnm) obj3, this.e, obj4, (byte) 20);
                qd0Var21.c = (vr20) obj;
                qd0Var21.d = obj2;
                return qd0Var21.invokeSuspend(rih1Var);
            case 21:
                long j = ((Offset) obj2).a;
                qd0 qd0Var22 = new qd0((l811) this.d, (c5f0) this.e, (Function0) obj4, (lnm) obj3);
                qd0Var22.c = (p9w0) obj;
                return qd0Var22.invokeSuspend(rih1Var);
            case 22:
                qd0 qd0Var23 = new qd0((lnm) obj3, this.e, obj4, (byte) 22);
                qd0Var23.c = (vr20) obj;
                qd0Var23.d = obj2;
                return qd0Var23.invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                qd0 qd0Var24 = new qd0((lnm) obj3, this.e, obj4, (byte) 23);
                qd0Var24.c = (vr20) obj;
                qd0Var24.d = obj2;
                return qd0Var24.invokeSuspend(rih1Var);
            case 24:
                qd0 qd0Var25 = new qd0((ru9) obj4, (lnm) obj3);
                qd0Var25.c = (Intent) obj;
                qd0Var25.d = (th61) obj2;
                return qd0Var25.invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                qd0 qd0Var26 = new qd0((lnm) obj3, this.e, obj4, (byte) 25);
                qd0Var26.c = (vr20) obj;
                qd0Var26.d = obj2;
                return qd0Var26.invokeSuspend(rih1Var);
            case 26:
                qd0 qd0Var27 = new qd0((byte) 26, (mdd0) obj4, (String) this.e, (lnm) obj3);
                qd0Var27.c = (vr20) obj;
                qd0Var27.d = obj2;
                return qd0Var27.invokeSuspend(rih1Var);
            case 27:
                qd0 qd0Var28 = new qd0((byte) 27, (vjd0) obj4, (String) this.e, (lnm) obj3);
                qd0Var28.c = (vr20) obj;
                qd0Var28.d = obj2;
                return qd0Var28.invokeSuspend(rih1Var);
            default:
                qd0 qd0Var29 = new qd0((lnm) obj3, this.e, obj4, (byte) 28);
                qd0Var29.c = (vr20) obj;
                qd0Var29.d = (Object[]) obj2;
                return qd0Var29.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:292:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[PHI: r10
      0x00b1: PHI (r10v27 java.lang.String) = (r10v26 java.lang.String), (r10v31 java.lang.String) binds: [B:27:0x00a0, B:29:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:443:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:448:0x0ba3 A[LOOP:7: B:446:0x0b9d->B:448:0x0ba3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:452:0x0bd3 A[LOOP:8: B:450:0x0bcb->B:452:0x0bd3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:481:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0078 A[SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        huz vd0Var;
        Object obj2;
        boolean z;
        ArrayList arrayList;
        Iterator it;
        wlu wluVar;
        ArrayList arrayList2;
        Iterator it2;
        boolean z2;
        huz huzVarE;
        mgb huzVar;
        mr20 m441Var;
        boolean z3;
        i0h nwdVar;
        mr20 huzVar2;
        qbk huzVar3;
        Object obj3;
        huz huzVar4;
        String str;
        String str2;
        Integer num;
        Integer numValueOf;
        mq70 mq70Var;
        up70 up70VarA;
        boolean z4;
        huz huzVar5;
        o6d0 huzVar6;
        xkb1 huzVar7;
        huz huzVar8;
        xkb1 xkb1Var;
        o6d0 o6d0Var;
        huz huzVar9;
        k6e0 k6e0Var;
        h6a h6aVar;
        z4t0 huzVar10;
        char c;
        wzv0 huzVar11;
        ArrayList arrayList3;
        List listA1;
        bl50 cl50Var;
        el50 el50Var;
        i1r i1rVar;
        i1r i1rVar2;
        jl50 jl50Var;
        String str3;
        String strS;
        String str4;
        String str5;
        String str6;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                Object obj5 = this.d;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List list = (List) obj5;
                if (list.isEmpty()) {
                    obj2 = null;
                    vd0Var = new huz((Object) null, (byte) 10);
                } else {
                    List<lvy> list2 = list;
                    ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                    for (lvy lvyVar : list2) {
                        String str7 = lvyVar.a;
                        sq51 sq51Var = lvyVar.b;
                        arrayList4.add(new kd0(sq51Var.a, lvyVar.c.a, str7, sq51Var.b));
                    }
                    vd0Var = new vd0(((xd0) obj4).b.c, (String) this.e, arrayList4, (byte) 0);
                    obj2 = null;
                }
                this.c = obj2;
                this.d = obj2;
                this.b = true;
                return l4p1.s(vr20Var, vd0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                String str8 = (String) this.e;
                kl1 kl1Var = (kl1) obj4;
                vr20 vr20Var2 = (vr20) this.c;
                Object obj6 = this.d;
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
                List list3 = (List) obj6;
                if (list3.isEmpty()) {
                    huzVarE = new huz(new qie((String) null, (String) null, true, (String) null, z6x.a), (byte) 10);
                    z2 = true;
                } else {
                    Map map = ((pvc0) o7h.q0(list3)).f;
                    String str9 = (String) map.get("has_creator_timestamps");
                    if (str9 != null) {
                        z = true;
                        boolean z7 = Boolean.parseBoolean(str9);
                        List list4 = list3;
                        arrayList = new ArrayList(q7h.U(list4, 10));
                        it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((pvc0) it.next()).c);
                        }
                        wluVar = new wlu(rc11.a.b(jo70.class));
                        arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            wlu wluVar2 = wluVar;
                            arrayList2.add(new l4r(wluVar2, 1, dt3.Q0, new j4r(new wk3((String) it2.next(), (byte) 1)), dt3.R0));
                            wluVar = wluVar2;
                        }
                        mr20 mr20VarW = kl1Var.w(new o3r(arrayList2, dt3.P0, false), rih1Var);
                        jd11 jd11Var = rc11.a;
                        z2 = true;
                        huzVarE = hu20.e(new x010(mr20VarW, kl1Var.w(new o3r(p7h.M(new l4r[]{new l4r(new wlu(jd11Var.b(jo70.class)), 1, dt3.W0, new j4r(new wk3(str8, (byte) 2)), dt3.X0), new l4r(new wlu(jd11Var.b(xkk1.class)), 1, dt3.Y0, new j4r(new wk3(str8, (byte) 3)), dt3.Z0)}), dt3.a1, false), rih1Var), new t83(kl1Var, list3, (lnm) null, (byte) 1), (byte) 1), new h64((lnm) null, kl1Var, str8, z7, (byte) 0));
                    } else {
                        z = true;
                    }
                    String str10 = (String) map.get("needs_remapping");
                    if (str10 == null || Boolean.parseBoolean(str10) != z) {
                    }
                    List list5 = list3;
                    arrayList = new ArrayList(q7h.U(list5, 10));
                    it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((pvc0) it.next()).c);
                    }
                    wluVar = new wlu(rc11.a.b(jo70.class));
                    arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        wlu wluVar3 = wluVar;
                        arrayList2.add(new l4r(wluVar3, 1, dt3.Q0, new j4r(new wk3((String) it2.next(), (byte) 1)), dt3.R0));
                        wluVar = wluVar3;
                    }
                    mr20 mr20VarW2 = kl1Var.w(new o3r(arrayList2, dt3.P0, false), rih1Var);
                    jd11 jd11Var2 = rc11.a;
                    z2 = true;
                    huzVarE = hu20.e(new x010(mr20VarW2, kl1Var.w(new o3r(p7h.M(new l4r[]{new l4r(new wlu(jd11Var2.b(jo70.class)), 1, dt3.W0, new j4r(new wk3(str8, (byte) 2)), dt3.X0), new l4r(new wlu(jd11Var2.b(xkk1.class)), 1, dt3.Y0, new j4r(new wk3(str8, (byte) 3)), dt3.Z0)}), dt3.a1, false), rih1Var), new t83(kl1Var, list3, (lnm) null, (byte) 1), (byte) 1), new h64((lnm) null, kl1Var, str8, z7, (byte) 0));
                }
                this.c = null;
                this.d = null;
                this.b = z2;
                return l4p1.s(vr20Var2, huzVarE, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = (vr20) this.c;
                Object[] objArr = (Object[]) this.d;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Set setP = lrn1.p((rcr0) this.e, q7h.V(f46.Q0((List[]) objArr)), (Set) ((d520) obj4).b);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var3.emit(setP, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = (vr20) this.c;
                Object[] objArr2 = (Object[]) this.d;
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
                Set setP2 = lrn1.p((rcr0) this.e, q7h.V(f46.Q0((List[]) objArr2)), (Set) ((em0) obj4).b);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var4.emit(setP2, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var5 = (vr20) this.c;
                Throwable th = (Throwable) this.d;
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
                this.c = null;
                this.d = null;
                this.b = true;
                h3r h3rVar = new h3r(new d3r(th.toString()));
                Set set = (Set) obj4;
                int iS = zno1.s(q7h.U(set, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj7 : set) {
                    linkedHashMap.put(obj7, h3rVar);
                }
                Object objEmit = vr20Var5.emit(linkedHashMap, this);
                if (objEmit != d9nVar) {
                    objEmit = rih1Var;
                }
                return objEmit == d9nVar ? d9nVar : rih1Var;
            case 5:
                List<p7b> list6 = (List) obj4;
                f8b f8bVar = (f8b) this.e;
                vr20 vr20Var6 = (vr20) this.c;
                Object obj8 = this.d;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    d8b d8bVar = (d8b) obj8;
                    g7h g7hVar = f8bVar.a;
                    Map map2 = d8bVar.a;
                    ArrayList arrayList5 = new ArrayList();
                    for (p7b p7bVar : list6) {
                        if (p7bVar instanceof p7b) {
                            r7h.W(f46.i0(new String[]{p7bVar.a, f8b.c(p7bVar, map2)}), arrayList5);
                        } else {
                            eg.o();
                        }
                    }
                    ezc ezcVarG = yoi1.g(g7hVar.c("", o7h.j0(arrayList5), false));
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    u4p1.S(vr20Var6);
                    Object objCollect = ezcVarG.collect(new h50(vr20Var6, list6, f8bVar, d8bVar), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    return objCollect == d9nVar ? d9nVar : rih1Var;
                }
                if (z11) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                vr20 vr20Var7 = (vr20) this.c;
                Object obj9 = this.d;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Object obj10 = ((e331) obj9).a;
                Throwable thA = e331.a(obj10);
                if (thA == null) {
                    goe goeVar = (goe) obj10;
                    bfd bfdVar = (bfd) this.e;
                    ArrayList arrayListK = goeVar.k();
                    List list7 = goeVar.f;
                    if (((AtomicBoolean) obj4).getAndSet(false)) {
                        ht20 ht20Var = new ht20(new m441(new udd(bfdVar, arrayListK, list7, (lnm) null, (byte) 0)), new vdd(list7, (lnm) null, (byte) 0));
                        ytw0 ytw0Var = jfv.b;
                        m441Var = r4p1.k(ht20Var, hap1.u(fdg1.k0(300, ngv.d)));
                    } else {
                        m441Var = new m441(new udd(bfdVar, arrayListK, list7, (lnm) null, (byte) 1));
                    }
                    huzVar = new mgb(m441Var, goeVar, (byte) 15);
                } else {
                    huzVar = new huz(new e331(new m231(thA)), (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var7, huzVar, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                vr20 vr20Var8 = (vr20) this.c;
                Object obj11 = this.d;
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
                k1r k1rVar = (k1r) obj11;
                k1rVar.getClass();
                huz huzVar12 = !(k1rVar instanceof i1r) ? new huz(k1rVar, (byte) 10) : new qbk(yoi1.g(((uqk) this.e).b.c(((vqk) obj4).a)), k1rVar, (byte) 2);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var8, huzVar12, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                vr20 vr20Var9 = (vr20) this.c;
                Object obj12 = this.d;
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
                boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                Flowable flowable = (Flowable) this.e;
                vbm[] vbmVarArr = q601.a;
                mr20 mr20VarU = rqt0.u(new xy0(new kge(flowable), (byte) 10));
                if (zBooleanValue) {
                    z3 = true;
                    nwdVar = new i0h(new ve1(new x010(mr20VarU, ((qq0) obj4).d, w0l.h, (byte) 1), (byte) 3), (byte) 4);
                } else {
                    z3 = true;
                    nwdVar = new nwd(mr20VarU, (byte) 23);
                }
                this.c = null;
                this.d = null;
                this.b = z3;
                return l4p1.s(vr20Var9, nwdVar, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                vr20 vr20Var10 = (vr20) this.c;
                Object obj13 = this.d;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = (mr20) this.e;
                mr20 mr20VarC = ((zwz0) obj4).c();
                vm0 vm0Var = new vm0(3, (lnm) null, (byte) 9);
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var10);
                Object objS = fc11.s(vrl.c, this, vr20Var10, new ekv(vm0Var, (lnm) null), new mr20[]{mr20Var, mr20VarC});
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                return objS == d9nVar ? d9nVar : rih1Var;
            case 10:
                wcm wcmVar = (wcm) this.e;
                idm idmVar = (idm) obj4;
                vr20 vr20Var11 = (vr20) this.c;
                Object obj14 = this.d;
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
                if (((Boolean) obj14).booleanValue() && wcmVar.g) {
                    String str11 = wcmVar.a;
                    Set set2 = s4b1.f;
                    if (uic.g(str11, blc0.ti)) {
                        huzVar2 = rqt0.u(new m441(new x4c(new ht20(idmVar.e.c(), new sd0(2, (lnm) null, (byte) 24)), (lnm) null, idmVar, wcmVar, (byte) 26)));
                    } else {
                        huzVar2 = new huz(Boolean.FALSE, (byte) 10);
                    }
                } else {
                    huzVar2 = new huz(Boolean.FALSE, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var11, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                vr20 vr20Var12 = (vr20) this.c;
                Object obj15 = this.d;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var2 = (xy0) this.e;
                vlm vlmVar = vlm.h;
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var12);
                Object objS2 = fc11.s(vrl.c, this, vr20Var12, new ekv(vlmVar, (lnm) null), new mr20[]{mr20Var2, (xy0) obj4});
                if (objS2 != d9nVar) {
                    objS2 = rih1Var;
                }
                if (objS2 != d9nVar) {
                    objS2 = rih1Var;
                }
                return objS2 == d9nVar ? d9nVar : rih1Var;
            case 12:
                vr20 vr20Var13 = (vr20) this.c;
                Object obj16 = this.d;
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
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var13);
                Object objCollect2 = ((yzc0) this.e).j().collect(new wem(vr20Var13, (lls0) obj4, (mbr) obj16, (byte) 4), this);
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                return objCollect2 == d9nVar ? d9nVar : rih1Var;
            case 13:
                vr20 vr20Var14 = (vr20) this.c;
                Object obj17 = this.d;
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
                if (((Boolean) obj17).booleanValue()) {
                    huzVar3 = new qbk((ezc) this.e, (her) obj4, (byte) 28);
                    obj3 = null;
                } else {
                    obj3 = null;
                    huzVar3 = new huz((Object) null, (byte) 10);
                }
                this.c = obj3;
                this.d = obj3;
                this.b = true;
                return l4p1.s(vr20Var14, huzVar3, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                vr20 vr20Var15 = (vr20) this.c;
                Object obj18 = this.d;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    i1r i1rVar3 = (k1r) obj18;
                    boolean z21 = i1rVar3 instanceof j1r;
                    d6w d6wVar = h6w.t;
                    if (z21 || (i1rVar3 instanceof h1r)) {
                        huzVar4 = new huz(d6wVar, (byte) 10);
                    } else if (i1rVar3 instanceof i1r) {
                        h6w h6wVar = (h6w) this.e;
                        x5w x5wVar = (x5w) obj4;
                        c6w c6wVar = (c6w) i1rVar3.a;
                        som somVar = (som) o7h.s0(c6wVar.a);
                        if (somVar == null) {
                            huzVar4 = new huz(d6wVar, (byte) 10);
                        } else {
                            mum mumVar = somVar.c;
                            mum mumVar2 = mumVar instanceof mum ? mumVar : null;
                            if (mumVar2 == null || (str = mumVar2.c) == null) {
                                huzVar4 = new huz(d6wVar, (byte) 10);
                            } else {
                                String str12 = x5wVar.c;
                                if (str12 != null) {
                                    str2 = str12;
                                } else {
                                    xkk1 xkk1Var = c6wVar.c;
                                    if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.d)) == null) {
                                        str2 = null;
                                    } else {
                                        str12 = up70VarA.a.a;
                                        str2 = str12;
                                    }
                                }
                                jo70 jo70Var = c6wVar.b;
                                String str13 = jo70Var != null ? jo70Var.a : null;
                                String str14 = str13 == null ? "" : str13;
                                String strConcat = x5wVar.d;
                                if (strConcat != null) {
                                    try {
                                        if (!nhc1.Y(strConcat, "#", false)) {
                                            strConcat = "#".concat(strConcat);
                                        }
                                        int color = Color.parseColor(strConcat);
                                        numValueOf = color != -1 ? Integer.valueOf(color) : null;
                                        break;
                                    } catch (IllegalArgumentException unused) {
                                    }
                                    num = numValueOf;
                                } else {
                                    num = null;
                                }
                                String strX0 = ihc1.X0(somVar.a, ":");
                                String str15 = somVar.d;
                                huzVar4 = str15 == null ? new huz(new d6w(str, str14, x5wVar.b, x5wVar.a, strX0, str2, (String) null, (String) null, num), (byte) 10) : new f6w(d3p1.F(h6wVar.b, h6wVar.g, str15), str15, str, str14, x5wVar, strX0, str2, num);
                            }
                        }
                    } else {
                        eg.o();
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var15, huzVar4, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z20) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                vr20 vr20Var16 = (vr20) this.c;
                Object obj19 = this.d;
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
                i1r i1rVar4 = (k1r) obj19;
                boolean z23 = i1rVar4 instanceof i1r;
                c7w c7wVar = c7w.a;
                if (z23) {
                    hw2 hw2Var = (hw2) this.e;
                    String str16 = ((b7w) obj4).b;
                    List list8 = (List) i1rVar4.a;
                    d0r d0rVar = hw2Var.b;
                    pvc0 pvc0Var = (pvc0) o7h.s0(list8);
                    if (pvc0Var == null) {
                        huzVar5 = new huz(c7wVar, (byte) 10);
                    } else {
                        Map map3 = pvc0Var.f;
                        String str17 = pvc0Var.c;
                        if (str17.length() == 0) {
                            huzVar5 = new huz(c7wVar, (byte) 10);
                        } else {
                            String str18 = (String) map3.get("flair");
                            String str19 = str18 == null ? "" : str18;
                            String str20 = (String) map3.get("name");
                            z4 = true;
                            huzVar5 = new x010(d3p1.F(d0rVar, (o3r) hw2Var.h, str17), d3p1.F(d0rVar, (o3r) hw2Var.i, str16), new n93(str20 == null ? "" : str20, str17, str19, (lnm) null, (byte) 1), (byte) 1);
                        }
                    }
                    z4 = true;
                } else {
                    z4 = true;
                    huzVar5 = new huz(c7wVar, (byte) 10);
                }
                this.c = r20;
                this.d = 0;
                this.b = z4;
                return l4p1.s(vr20Var16, huzVar5, this) == d9nVar ? d9nVar : rih1Var;
            case 16:
                String str21 = (String) this.e;
                qlw qlwVar = (qlw) obj4;
                vr20 vr20Var17 = (vr20) this.c;
                Object obj20 = this.d;
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Map map4 = (Map) obj20;
                List list9 = (List) map4.get(ilw.c);
                h6a h6aVar2 = list9 != null ? new h6a(x4p1.h(yoi1.g(((g7h) qlwVar.d.b).c(str21 != null ? str21 : "", list9, false).distinctUntilChanged()), new rf2((byte) 13)), (byte) 4) : new huz(new fio[0], (byte) 9);
                List list10 = (List) map4.get(ilw.b);
                if (list10 != null) {
                    hku0 hku0Var = qlwVar.c;
                    List<String> list11 = list10;
                    ArrayList arrayList6 = new ArrayList(q7h.U(list11, 10));
                    for (String str22 : list11) {
                        arrayList6.add(new ld2(rqt0.u(x4p1.h(hu20.e(hku0Var.a.k(str22, hku0.b), new i64((byte) 22)), new w1e0((byte) 15))), str22, (byte) 26));
                    }
                    int i = hu20.a;
                    huzVar6 = new o6d0(new kge(arrayList6), (byte) 1);
                } else {
                    huzVar6 = new huz(new fio[0], (byte) 9);
                }
                List list12 = (List) map4.get(ilw.d);
                w5h w5hVar = w5h.d;
                if (list12 != null) {
                    qpj1 qpj1Var = qlwVar.e;
                    mwm1 mwm1Var = (mwm1) qpj1Var.b;
                    hf90 hf90VarP = IsCuratedRequest.p();
                    List list13 = list12;
                    hf90VarP.n(list13);
                    ek ekVar = new ek(new lt20(yoi1.g(mwm1Var.d(hf90VarP.build()).distinctUntilChanged()), new ysm1(3, null, (byte) 0), (byte) 0), (byte) 6);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj21 : list13) {
                        Set set3 = s4b1.f;
                        if (uic.x((String) obj21).c == blc0.fh) {
                            arrayList7.add(obj21);
                        }
                    }
                    if (arrayList7.isEmpty()) {
                        huzVar7 = new xkb1(ekVar, (byte) 24);
                    } else {
                        w4h w4hVar = (w4h) qpj1Var.c;
                        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
                        u4hVarQ.t(w5hVar);
                        u4hVarQ.n(arrayList7);
                        huzVar7 = new x010(ekVar, new ht20(new vlj1(new lt20(yoi1.g(w4hVar.c(u4hVarQ.build()).distinctUntilChanged()), new ysm1(3, null, (byte) 1), (byte) 0), arrayList7, (byte) 19), new e5m1(2, (lnm) null, (byte) 1)), new x4u0(3, (lnm) null, (byte) 1), (byte) 1);
                    }
                } else {
                    huzVar7 = new huz(new fio[0], (byte) 9);
                }
                List list14 = (List) map4.get(ilw.e);
                if (list14 != null) {
                    w4h w4hVar2 = (w4h) qlwVar.f.b;
                    u4h u4hVarQ2 = CollectionPlatformItemsRequest.q();
                    u4hVarQ2.t(w5h.c);
                    u4hVarQ2.n(list14);
                    huzVar8 = new huz(new cod0(new lt20(yoi1.g(w4hVar2.c(u4hVarQ2.build()).distinctUntilChanged()), new rf2(3, (lnm) null, (byte) 26), (byte) 0), list14, (byte) 0), (byte) 23);
                } else {
                    huzVar8 = new huz(new fio[0], (byte) 9);
                }
                List list15 = (List) map4.get(ilw.f);
                k6e0 k6e0Var2 = list15 != null ? new k6e0(new cod0(x4p1.h(yoi1.g(((BehaviorSubject) ((qut0) qlwVar.g.b).c.getValue()).distinctUntilChanged()), new w1e0((byte) 12)), list15, (byte) 1), (byte) 26) : new huz(new fio[0], (byte) 9);
                List list16 = (List) map4.get(ilw.g);
                if (list16 != null) {
                    ffe1 ffe1Var = qlwVar.h;
                    if (!((ol4) ((el3) ffe1Var.c).a.getValue()).a() || list16.isEmpty()) {
                        xkb1Var = huzVar7;
                        o6d0Var = huzVar6;
                        huzVar9 = huzVar8;
                        k6e0Var = k6e0Var2;
                        h6aVar = h6aVar2;
                        huzVar10 = new huz(new fio(b7x.a), (byte) 10);
                    } else {
                        List<String> list17 = list16;
                        ArrayList arrayList8 = new ArrayList(q7h.U(list17, 10));
                        for (String str23 : list17) {
                            xkb1 xkb1Var2 = huzVar7;
                            cig1 cig1Var = (cig1) ffe1Var.b;
                            arrayList8.add(new e521(new lt20(hu20.e(new m441(new l3g1(cig1Var, str23, (lnm) null, (byte) 2)), new c6e0((byte) 29, cig1Var, str23, (lnm) null)), new q8t0(3, null, (byte) 24), (byte) 0), str23, (byte) 1));
                            huzVar7 = xkb1Var2;
                            huzVar6 = huzVar6;
                            huzVar8 = huzVar8;
                            k6e0Var2 = k6e0Var2;
                            h6aVar2 = h6aVar2;
                        }
                        xkb1Var = huzVar7;
                        o6d0Var = huzVar6;
                        huzVar9 = huzVar8;
                        k6e0Var = k6e0Var2;
                        h6aVar = h6aVar2;
                        huzVar10 = new z4t0((mr20[]) o7h.l1(arrayList8).toArray(new mr20[0]), (byte) 15);
                    }
                } else {
                    xkb1Var = huzVar7;
                    o6d0Var = huzVar6;
                    huzVar9 = huzVar8;
                    k6e0Var = k6e0Var2;
                    h6aVar = h6aVar2;
                    huzVar10 = new huz(new fio[0], (byte) 9);
                }
                List list18 = (List) map4.get(ilw.h);
                if (list18 != null) {
                    w4h w4hVar3 = qlwVar.i.a;
                    u4h u4hVarQ3 = CollectionPlatformItemsRequest.q();
                    u4hVarQ3.t(w5hVar);
                    u4hVarQ3.n(list18);
                    c = 0;
                    huzVar11 = new wzv0(new cod0(new lt20(yoi1.g(w4hVar3.c(u4hVarQ3.build()).distinctUntilChanged()), new w1e0(3, (lnm) null, (byte) 16), (byte) 0), list18, (byte) 2), (byte) 0);
                } else {
                    c = 0;
                    huzVar11 = new huz(new fio[0], (byte) 9);
                }
                mr20[] mr20VarArr = new mr20[7];
                mr20VarArr[c] = h6aVar;
                mr20VarArr[1] = o6d0Var;
                mr20VarArr[2] = xkb1Var;
                mr20VarArr[3] = huzVar9;
                mr20VarArr[4] = k6e0Var;
                mr20VarArr[5] = huzVar10;
                mr20VarArr[6] = huzVar11;
                kge kgeVarD = hu20.d(mr20VarArr);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var17, kgeVarD, this) == d9nVar ? d9nVar : rih1Var;
            case 17:
                return e(obj);
            case 18:
                return h(obj);
            case 19:
                return g(obj);
            case 20:
                return i(obj);
            case 21:
                return j(obj);
            case 22:
                return m(obj);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return o(obj);
            case 24:
                return p(obj);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return r(obj);
            case 26:
                return s(obj);
            case 27:
                return t(obj);
            default:
                j2e0 j2e0Var = (j2e0) obj4;
                vr20 vr20Var18 = (vr20) this.c;
                Object[] objArr3 = (Object[]) this.d;
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
                ArrayList<mmr0> arrayListV1 = o7h.v1(((nbw) this.e).a, f46.Q0((k1r[]) objArr3));
                if (arrayListV1.isEmpty()) {
                    arrayList3 = new ArrayList();
                    for (mmr0 mmr0Var : arrayListV1) {
                        el50Var = (el50) mmr0Var.a;
                        i1rVar = (k1r) mmr0Var.b;
                        if (i1rVar instanceof i1r) {
                            i1rVar2 = i1rVar;
                        } else {
                            i1rVar2 = null;
                        }
                        if (i1rVar2 != null) {
                            i1e i1eVar = (i1e) i1rVar2.a;
                            str3 = el50Var.a;
                            strS = i1eVar.a;
                            if (strS == null) {
                                Set set4 = s4b1.f;
                                strS = uic.x(str3).s();
                                if (strS == null) {
                                    str4 = "";
                                } else {
                                    str4 = strS;
                                }
                            } else {
                                str4 = strS;
                            }
                            str5 = i1eVar.b;
                            if (str5 == null) {
                                str6 = "";
                            } else {
                                str6 = str5;
                            }
                            jl50Var = new jl50(str3, str4, str6, i1eVar.c, el50Var.b);
                        } else {
                            jl50Var = null;
                        }
                        if (jl50Var != null) {
                            arrayList3.add(jl50Var);
                        }
                    }
                    listA1 = o7h.a1(arrayList3, new xvd(j2e0Var, (byte) 19));
                    if (listA1.isEmpty()) {
                        cl50Var = new bl50(new RuntimeException("All member metadata loads failed"));
                    } else {
                        cl50Var = new cl50(listA1);
                    }
                } else {
                    Iterator it3 = arrayListV1.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            arrayList3 = new ArrayList();
                            while (r2.hasNext()) {
                                el50Var = (el50) mmr0Var.a;
                                i1rVar = (k1r) mmr0Var.b;
                                if (i1rVar instanceof i1r) {
                                    i1rVar2 = i1rVar;
                                } else {
                                    i1rVar2 = null;
                                }
                                if (i1rVar2 != null) {
                                    i1e i1eVar2 = (i1e) i1rVar2.a;
                                    str3 = el50Var.a;
                                    strS = i1eVar2.a;
                                    if (strS == null) {
                                        Set set5 = s4b1.f;
                                        strS = uic.x(str3).s();
                                        if (strS == null) {
                                            str4 = "";
                                        } else {
                                            str4 = strS;
                                        }
                                    } else {
                                        str4 = strS;
                                    }
                                    str5 = i1eVar2.b;
                                    if (str5 == null) {
                                        str6 = "";
                                    } else {
                                        str6 = str5;
                                    }
                                    jl50Var = new jl50(str3, str4, str6, i1eVar2.c, el50Var.b);
                                } else {
                                    jl50Var = null;
                                }
                                if (jl50Var != null) {
                                    arrayList3.add(jl50Var);
                                }
                            }
                            listA1 = o7h.a1(arrayList3, new xvd(j2e0Var, (byte) 19));
                            if (listA1.isEmpty()) {
                                cl50Var = new bl50(new RuntimeException("All member metadata loads failed"));
                            } else {
                                cl50Var = new cl50(listA1);
                            }
                        } else if (((k1r) ((mmr0) it3.next()).b) instanceof j1r) {
                            cl50Var = null;
                        }
                    }
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var18.emit(cl50Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd0(ru9 ru9Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 24;
        this.f = ru9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd0(zsc zscVar, Set set, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 4;
        this.e = zscVar;
        this.f = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd0(lnm lnmVar, Object obj, Object obj2, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd0(byte b, Object obj, String str, lnm lnmVar) {
        super(3, lnmVar);
        this.a = b;
        this.f = obj;
        this.e = str;
    }
}
