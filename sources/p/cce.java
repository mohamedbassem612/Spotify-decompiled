package p;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.spotify.base.java.logging.Logger;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cce implements ps40, qs40, k2i1, Function, f080, SingleOnSubscribe {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public cce(d0r d0rVar, l0k l0kVar) {
        this.a = (byte) 29;
        this.b = d0rVar;
        this.c = l0kVar;
        jd11 jd11Var = rc11.a;
        this.d = w3p1.g(new l4r(new xv00(jd11Var.b(tdv0.class)), 3, o0k.N0, new j4r(cjj.Z0), o0k.O0), new l4r(new xv00(jd11Var.b(s211.class)), 3, o0k.P0, new j4r(cjj.a1), o0k.Q0), new l4r(new xv00(jd11Var.b(q2o.class)), 3, o0k.R0, new j4r(cjj.b1), o0k.S0), new l4r(new xv00(jd11Var.b(us6.class)), 3, o0k.T0, new j4r(cjj.c1), o0k.U0), new l4r(new xv00(jd11Var.b(ljh1.class)), 3, o0k.V0, new j4r(cjj.d1), o0k.e), new l4r(new xv00(jd11Var.b(jo70.class)), 3, o0k.f, new j4r(cjj.e1), o0k.g), new l4r(new xv00(jd11Var.b(kl11.class)), 3, o0k.h, new j4r(o0k.b), o0k.i), new l4r(new xv00(jd11Var.b(pnt.class)), 3, o0k.t, new j4r(o0k.c), o0k.X), new l4r(hvm.c, 3, o0k.Y, new j4r(o0k.d), o0k.Z), n0k.b);
    }

    public static boolean D(lnn1 lnn1Var, String str, lik1 lik1Var) {
        boolean z = lnn1Var instanceof i2z;
        i2z i2zVar = z ? (i2z) lnn1Var : null;
        if (i2zVar == null) {
            return false;
        }
        String str2 = i2zVar.c;
        if (str2.length() <= 0 || !str2.equals(str) || !z) {
            return false;
        }
        i2z i2zVar2 = (i2z) lnn1Var;
        if (i2zVar2.f.equals(lik1Var.a)) {
            return true;
        }
        return i2zVar2.e.equals("queue") && i2zVar2.d.equals(lik1Var.a);
    }

    public static hf2 n(cce cceVar) {
        return new hf2((a62) cceVar.b, (mwn0) cceVar.c, (hnl) cceVar.d, true);
    }

    public static int s(lnn1 lnn1Var) {
        i2z i2zVar = lnn1Var instanceof i2z ? (i2z) lnn1Var : null;
        if (i2zVar == null) {
            return 0;
        }
        long j = i2zVar.h;
        if (j > 0) {
            return (int) (j / 1000);
        }
        return 0;
    }

    public void A(int i, int i2, int i3, String str, boolean z) {
        i8h1 i8h1Var = (i8h1) this.b;
        gxk0 gxk0Var = (gxk0) this.d;
        int i4 = z ? 1 : 2;
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = gxk0Var.a.c();
        x6h1VarC.i.add(new a7h1("comment_row", ktk0.h(i4), numValueOf, str, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        String strM = ab80.m(i3, i2, ":");
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("timestamp", (String) null, (Integer) null, (String) null, strM));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA2;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    public ArrayList B(ArrayList arrayList) {
        Object z2kVar;
        v3h1 v3h1VarP;
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        IdentityHashMap identityHashMap2 = new IdentityHashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            identityHashMap2.put((tzj) it.next(), rih1.a);
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            tzj tzjVar = (tzj) it2.next();
            z2k z2kVar2 = (z2k) this.b;
            err0 err0Var = tzjVar.d;
            IdentityHashMap identityHashMap3 = (IdentityHashMap) this.d;
            g2g g2gVar = (g2g) identityHashMap3.get(tzjVar);
            if (g2gVar != null) {
                int i = g2gVar.c;
                int iS = err0Var.s();
                v3h1VarP = g2gVar.a;
                if (i != iS) {
                    v3h1VarP.b(z2kVar2);
                    for (xku xkuVar : g2gVar.b) {
                        xku xkuVar2 = xkuVar instanceof xku ? xkuVar : null;
                        if (xkuVar2 != null) {
                            xkuVar2.dispose();
                        }
                    }
                    z2kVar = identityHashMap.get(tzjVar);
                    if (z2kVar == null) {
                        z2kVar = new z2k(tzjVar);
                        identityHashMap.put(tzjVar, z2kVar);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    v3h1VarP = q0o1.p((z2k) z2kVar, tzjVar.f, arrayList3);
                    v3h1VarP.n(z2kVar2);
                    identityHashMap3.put(tzjVar, new g2g(v3h1VarP, arrayList3, err0Var.s()));
                }
            } else {
                z2kVar = identityHashMap.get(tzjVar);
                if (z2kVar == null) {
                    z2kVar = new z2k(tzjVar);
                    identityHashMap.put(tzjVar, z2kVar);
                }
                ArrayList arrayList4 = new ArrayList();
                v3h1VarP = q0o1.p((z2k) z2kVar, tzjVar.f, arrayList4);
                v3h1VarP.n(z2kVar2);
                identityHashMap3.put(tzjVar, new g2g(v3h1VarP, arrayList4, err0Var.s()));
            }
            arrayList2.add(v3h1VarP);
        }
        Set setKeySet = identityHashMap.keySet();
        ArrayList<tzj> arrayList5 = new ArrayList();
        for (Object obj : setKeySet) {
            if (!identityHashMap2.containsKey((tzj) obj)) {
                arrayList5.add(obj);
            }
        }
        for (tzj tzjVar2 : arrayList5) {
            tzjVar2.getClass();
            p(tzjVar2);
        }
        return arrayList2;
    }

    public void C(String str) {
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(String str, onm onmVar) {
        fde fdeVar;
        if (onmVar instanceof fde) {
            fdeVar = (fde) onmVar;
            int i = fdeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fdeVar.c = i - Integer.MIN_VALUE;
            } else {
                fdeVar = new fde(this, onmVar);
            }
        } else {
            fdeVar = new fde(this, onmVar);
        }
        Object obj = fdeVar.a;
        int i2 = fdeVar.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                bza0 bza0Var = (bza0) this.b;
                fdeVar.c = 1;
                Object objF = bza0Var.f(str, fdeVar);
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
            return lde.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return lde.b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0134  */
    public ArrayList F(List list, wqn0 wqn0Var) {
        rhd1 rhd1Var;
        t7y t7yVar = (t7y) this.b;
        boolean z = wqn0Var instanceof ypn0;
        if (z) {
            if (t7yVar.o(2)) {
                List<Object> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (Object objE : list2) {
                    if (objE instanceof dpd) {
                        dpd dpdVar = (dpd) objE;
                        if (dpdVar.g != 2 && dpdVar.h != null) {
                            objE = dpd.e(dpdVar, null, o7h.d1(dpdVar.b, 8), 1021);
                        }
                    }
                    arrayList.add(objE);
                }
                list = arrayList;
            }
            if (t7yVar.o(1)) {
                List list3 = list;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list3) {
                    if (obj instanceof dpd) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((dpd) obj2).g == 2) {
                        arrayList3.add(obj2);
                    }
                }
                dpd dpdVar2 = (dpd) o7h.s0(arrayList3);
                if (dpdVar2 != null) {
                    smc0 smc0VarN = k4p1.n();
                    smc0VarN.add(dpd.e(dpdVar2, null, z561.k0(z561.j0(z561.X(cjj.Y0, new i46(arrayList3, (byte) 1)), 6)), 1020));
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list3) {
                        if (((fpd) obj3).getKind() != 2) {
                            arrayList4.add(obj3);
                        }
                    }
                    smc0VarN.addAll(arrayList4);
                    list = k4p1.k(smc0VarN);
                }
            }
        }
        if (!z || !t7yVar.o(2)) {
            List list4 = list;
            ArrayList arrayList5 = new ArrayList(q7h.U(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList5.add(new rhd1((fpd) it.next(), false));
            }
            return arrayList5;
        }
        ArrayList arrayList6 = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (fpd fpdVar : list) {
            boolean z2 = (fpdVar instanceof dpd) && ((dpd) fpdVar).g != 2;
            boolean z3 = z2 && ((dpd) fpdVar).h != null && i >= 4;
            if (!z3) {
                if (z2) {
                    i++;
                }
                rhd1Var = new rhd1(fpdVar, z3);
            } else if (i2 >= 5) {
                rhd1Var = null;
            } else {
                i2++;
                if (z2) {
                    i++;
                }
                rhd1Var = new rhd1(fpdVar, z3);
            }
            if (rhd1Var != null) {
                arrayList6.add(rhd1Var);
            }
        }
        return arrayList6;
    }

    public void G() {
        synchronized (this) {
            ((AtomicInteger) this.c).decrementAndGet();
            if (((AtomicInteger) this.c).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void H() {
        Set set = Collections.EMPTY_SET;
        d46 d46Var = (d46) this.b;
        if (d46Var == null) {
            d46Var = new d46(0);
            this.b = d46Var;
        }
        d46Var.addAll(set);
    }

    public void I(String str) {
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    public void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        z0i z0iVar2 = z0iVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1693763980);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(z0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zG = x340Var.g(rc11.a.b(z0iVar.getClass()));
            Object objT = x340Var.T();
            w0i w0iVar = null;
            if (zG || objT == m4cVar) {
                LinkedHashMap linkedHashMap = ((x1i) this.c).a;
                Class<?> cls = z0iVar.getClass();
                Object arrayList = linkedHashMap.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(cls, arrayList);
                }
                o1i o1iVarC = (o1i) r7h.c0((List) arrayList);
                if (o1iVarC == null) {
                    l6l1 l6l1Var = (l6l1) this.b;
                    String str = (String) ((Map) l6l1Var.b.getValue()).get(z0iVar.getClass());
                    if (str == null) {
                        o1iVarC = null;
                    } else {
                        kly0 kly0Var = (kly0) l6l1Var.a.get(str);
                        j0i j0iVar = kly0Var != null ? (j0i) kly0Var.get() : null;
                        if (j0iVar != null) {
                            o1iVarC = j0iVar.c();
                        } else {
                            o1iVarC = null;
                        }
                    }
                }
                objT = o1iVarC;
                x340Var.s0(objT);
            }
            o1i o1iVar = (o1i) objT;
            if (o1iVar == null) {
                x340Var.i0(-1646519960);
                x340Var.r(false);
            } else {
                x340Var.i0(-1646519959);
                o1iVar.a(((i3 >> 3) & 14) | 64 | ((i3 << 3) & 112) | (i3 & 896), o0iVar, z0iVar2, x340Var, qim0Var2);
                x0i x0iVarB = o1iVar.b(z0iVar, o0iVar);
                if (x0iVarB != null) {
                    z0iVar2 = z0iVar2;
                    w0iVar = x0iVarB.a;
                }
                z0iVar2 = z0iVar2;
                w0i w0iVar2 = w0iVar;
                if (w0iVar2 == null) {
                    x340Var.i0(184220301);
                } else {
                    x340Var.i0(184220302);
                    c(o0iVar, z0iVar2, w0iVar2, x340Var, (i3 & 7168) | (i3 & 14) | 8 | (i3 & 112) | NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS);
                }
                x340Var.r(false);
                boolean zI = x340Var.i(this) | x340Var.i(o1iVar) | x340Var.i(z0iVar);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new o0d(this, o1iVar, z0iVar, (byte) 13);
                    x340Var.s0(objT2);
                }
                qxd0.i(o1iVar, (iu30) objT2, x340Var);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, o0iVar, z0iVar2, qim0Var, (byte) 0);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 19:
                String str = (String) obj;
                a4h a4hVar = (a4h) this.b;
                p811 p811Var = (p811) this.c;
                nx30 nx30Var = new nx30(p811Var, (l24) this.d, (byte) 11);
                aod aodVar = new aod(p811Var, a4hVar, (byte) 15);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                return new CompletableFromAction(new bm0(a4hVar, new er91((fs91) null, str, (Integer) null, (String) null, 2131954000, new c20(nx30Var, (byte) 19), (cvr) null, new z3h(aodVar, (byte) 0), false), (byte) 17)).s(a4hVar.d);
            default:
                qjh qjhVar = (qjh) obj;
                tjh tjhVar = (tjh) this.b;
                ojh ojhVar = new ojh((String) this.c, (String) this.d);
                qjhVar.getClass();
                return Single.create(new cce((Object) tjhVar, (Object) ojhVar, (Object) qjhVar, (byte) 23)).subscribeOn(tjhVar.a);
        }
    }

    public void b(Uri uri) {
        v5g v5gVarB = ((x8g) this.c).b((zxf) this.b, uri);
        if (v5gVarB == null) {
            n57.s("Invalid UC Choice Screen URI: " + uri);
        } else {
            try {
                ((fg0) this.d).b(v5gVarB);
            } catch (IllegalStateException e) {
                Logger.e(e, "Exception when launching checkout", new Object[0]);
            }
        }
    }

    public void c(o0i o0iVar, z0i z0iVar, w0i w0iVar, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1498650866);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(z0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 ? x340Var.g(w0iVar) : x340Var.i(w0iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = x340Var.g(z0iVar);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var) | x340Var.i(this);
            if ((i2 & 896) == 256 || ((i2 & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 && x340Var.i(w0iVar))) {
                z = true;
            }
            boolean z2 = zI | z;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new o0d(this, w0iVar, ven0Var, (byte) 14);
                x340Var.s0(objT2);
            }
            oto1.c(z0iVar, o0iVar, (iu30) objT2, x340Var, ((i2 >> 3) & 14) | 64 | ((i2 << 3) & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, o0iVar, z0iVar, w0iVar, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public Object d(xtv xtvVar, onm onmVar) {
        jee jeeVar;
        if (onmVar instanceof jee) {
            jeeVar = (jee) onmVar;
            int i = jeeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jeeVar.c = i - Integer.MIN_VALUE;
            } else {
                jeeVar = new jee(this, onmVar);
            }
        } else {
            jeeVar = new jee(this, onmVar);
        }
        Object objB = jeeVar.a;
        int i2 = jeeVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            iyc0 iyc0Var = (iyc0) this.c;
            List listSingletonList = Collections.singletonList((String) this.b);
            wls0 wls0Var = xtvVar.a ? wls0.d : wls0.c;
            jeeVar.c = 1;
            objB = iyc0.b(iyc0Var, listSingletonList, wls0Var, jeeVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        boolean z = objB instanceof oy21;
        if (!z) {
            kt91 kt91Var = (kt91) this.d;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131955267});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", 2131955267, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        return new yuv(z);
    }

    public void e(int i, Bitmap bitmap) {
        ImageView imageView = (ImageView) this.b;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof AnimationDrawable) {
                ((AnimationDrawable) drawable).stop();
            }
            imageView.setImageBitmap(bitmap);
        }
        new tfp0(bitmap).b(new uq8(this, (byte) 16));
    }

    public synchronized void f(ss40 ss40Var, long j) {
        ((o0g1) this.c).q(ss40Var, j);
    }

    public void g(Drawable drawable) {
        ImageView imageView = (ImageView) this.b;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (imageView.getDrawable() instanceof AnimationDrawable) {
                ((AnimationDrawable) imageView.getDrawable()).start();
            }
        }
    }

    public synchronized void h() {
        ((o0g1) this.c).s();
    }

    public boolean i() {
        synchronized (this) {
            if (((AtomicBoolean) this.d).get()) {
                return false;
            }
            ((AtomicInteger) this.c).incrementAndGet();
            return true;
        }
    }

    public void j(ss40 ss40Var) {
        ((roj1) this.d).f(new ace(this, ss40Var, (byte) 0), true);
    }

    public synchronized void k() {
        ((o0g1) this.c).k();
    }

    public d520 l() {
        return new d520((String) this.c, (String) this.d, (d46) this.b);
    }

    public void m(Drawable drawable) {
        ImageView imageView = (ImageView) this.b;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        ((iu30) this.d).invoke((Object) null);
    }

    public void o() {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        IdentityHashMap identityHashMap2 = (IdentityHashMap) this.c;
        for (tzj tzjVar : o7h.l1(identityHashMap2.keySet())) {
            tzjVar.getClass();
            p(tzjVar);
        }
        for (g2g g2gVar : identityHashMap.values()) {
            g2gVar.a.b((z2k) this.b);
            q0o1.i(g2gVar.b);
        }
        identityHashMap.clear();
        identityHashMap2.clear();
    }

    public synchronized void onFlush() {
        ((o0g1) this.c).onFlush();
        roj1 roj1Var = (roj1) this.d;
        final rs40 rs40Var = (rs40) this.b;
        Objects.requireNonNull(rs40Var);
        final byte b = 0;
        roj1Var.f(new qoj1() { // from class: p.bce
            public final void run() {
                byte b2 = b;
                rs40 rs40Var2 = rs40Var;
                switch (b2) {
                    case 0:
                        rs40Var2.flush();
                        break;
                    default:
                        rs40Var2.a();
                        break;
                }
            }
        }, true);
    }

    public void p(tzj tzjVar) {
        g2g g2gVar = (g2g) ((IdentityHashMap) this.d).remove(tzjVar);
        if (g2gVar != null) {
            g2gVar.a.b((z2k) this.b);
            q0o1.i(g2gVar.b);
        }
        z2k z2kVar = (z2k) ((IdentityHashMap) this.c).remove(tzjVar);
        if (z2kVar != null) {
            z2kVar.dispose();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r13 == r9) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(p.onm r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            r12 = this;
            java.lang.Object r0 = r12.d
            p.mdg r0 = (p.mdg) r0
            java.lang.String r1 = r0.b
            java.lang.String r2 = r0.a
            boolean r3 = r13 instanceof p.fdg
            if (r3 == 0) goto L1b
            r3 = r13
            p.fdg r3 = (p.fdg) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1b
            int r4 = r4 - r5
            r3.c = r4
            goto L20
        L1b:
            p.fdg r3 = new p.fdg
            r3.<init>(r12, r13)
        L20:
            java.lang.Object r13 = r3.a
            int r4 = r3.c
            r5 = 0
            r6 = 2
            r7 = 0
            r8 = 1
            p.d9n r9 = p.d9n.a
            if (r4 == 0) goto L3e
            if (r4 == r8) goto L3a
            if (r4 != r6) goto L34
            p.hm5.M(r13)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            goto L95
        L34:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r7
        L3a:
            p.hm5.M(r13)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            goto L52
        L3e:
            p.hm5.M(r13)
            p.awe r13 = new p.awe     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            r4 = 6
            r13.<init>(r12, r7, r4)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            r3.c = r8     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            r10 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r13 = p.rc2.M(r10, r13, r3)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            if (r13 != r9) goto L52
            goto L94
        L52:
            p.py21 r13 = (p.py21) r13     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            boolean r4 = r13 instanceof p.ly21     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            if (r4 == 0) goto L74
            p.bdg r12 = new p.bdg     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            p.ly21 r13 = (p.ly21) r13     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            p.jy21 r13 = r13.a     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            boolean r3 = r13 instanceof p.dy21     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            if (r3 != 0) goto L70
            boolean r3 = r13 instanceof p.gy21     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            if (r3 != 0) goto L70
            boolean r3 = r13 instanceof p.by21     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            if (r3 != 0) goto L70
            boolean r13 = r13 instanceof p.cy21     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            if (r13 == 0) goto L6f
            goto L70
        L6f:
            r8 = r5
        L70:
            r12.<init>(r1, r2, r8)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            return r12
        L74:
            boolean r4 = r13 instanceof p.oy21     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            if (r4 == 0) goto L9e
            p.oy21 r13 = (p.oy21) r13     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            java.lang.Object r13 = r13.a     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            p.hyc0 r13 = (p.hyc0) r13     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            p.x7i1 r4 = r13.b     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            if (r4 != 0) goto L88
            p.bdg r12 = new p.bdg     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            r12.<init>(r1, r2, r8)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            return r12
        L88:
            boolean r13 = r13.a     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            if (r13 == 0) goto L98
            r3.c = r6     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            java.lang.Object r13 = r12.r(r4, r3)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            if (r13 != r9) goto L95
        L94:
            return r9
        L95:
            p.edg r13 = (p.edg) r13     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            return r13
        L98:
            p.cdg r12 = new p.cdg     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            r12.<init>(r2)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            return r12
        L9e:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            r12.<init>()     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
            throw r12     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lae kotlinx.coroutines.TimeoutCancellationException -> Lb0
        La4:
            java.lang.String r12 = r0.b
            java.lang.String r13 = r0.a
            p.bdg r0 = new p.bdg
            r0.<init>(r12, r13, r5)
            goto Lb9
        Lae:
            r12 = move-exception
            throw r12
        Lb0:
            java.lang.String r12 = r0.b
            java.lang.String r13 = r0.a
            p.bdg r0 = new p.bdg
            r0.<init>(r12, r13, r5)
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cce.q(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public Object r(x7i1 x7i1Var, onm onmVar) {
        gdg gdgVar;
        py21 py21Var;
        xyc0 xyc0Var;
        x7i1 x7i1Var2;
        py21 py21Var2;
        xyc0 xyc0Var2 = (iyc0) this.c;
        mdg mdgVar = (mdg) this.d;
        String str = mdgVar.a;
        if (onmVar instanceof gdg) {
            gdgVar = (gdg) onmVar;
            int i = gdgVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gdgVar.e = i - Integer.MIN_VALUE;
            } else {
                gdgVar = new gdg(this, onmVar);
            }
        } else {
            gdgVar = new gdg(this, onmVar);
        }
        gdg gdgVar2 = gdgVar;
        Object objF = gdgVar2.c;
        int i2 = gdgVar2.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objF);
            String str2 = mdgVar.b;
            gdgVar2.a = x7i1Var;
            gdgVar2.e = 1;
            xyc0 xyc0Var3 = xyc0Var2;
            if (fn31.Y(xyc0Var3.c, new n0a0(xyc0Var3, str, str2, (lnm) null, (byte) 15), gdgVar2) != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            x7i1Var = gdgVar2.a;
            hm5.M(objF);
        } else {
            if (i2 == 2) {
                x7i1Var = gdgVar2.a;
                hm5.M(objF);
                py21Var = (py21) objF;
                gdgVar2.a = x7i1Var;
                gdgVar2.b = py21Var;
                gdgVar2.e = 3;
                xyc0Var = xyc0Var2;
                if (fn31.Y(xyc0Var.c, new ss90(xyc0Var, str, (lnm) null, (byte) 27), gdgVar2) != d9nVar) {
                    x7i1Var2 = x7i1Var;
                    py21Var2 = py21Var;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            py21Var2 = gdgVar2.b;
            x7i1Var2 = gdgVar2.a;
            hm5.M(objF);
        }
        return py21Var2.b(new syf(this, (byte) 3), new syf(x7i1Var2, (byte) 4));
        rsc0 rsc0Var = (xrc0) this.b;
        trc0 trc0Var = hdg.a;
        gdgVar2.a = x7i1Var;
        gdgVar2.e = 2;
        objF = rsc0Var.f(str, trc0Var, gdgVar2);
        if (objF != d9nVar) {
            py21Var = (py21) objF;
            gdgVar2.a = x7i1Var;
            gdgVar2.b = py21Var;
            gdgVar2.e = 3;
            xyc0Var = xyc0Var2;
            if (fn31.Y(xyc0Var.c, new ss90(xyc0Var, str, (lnm) null, (byte) 27), gdgVar2) != d9nVar) {
                x7i1Var2 = x7i1Var;
                py21Var2 = py21Var;
                return py21Var2.b(new syf(this, (byte) 3), new syf(x7i1Var2, (byte) 4));
            }
        }
        return d9nVar;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        qjh qjhVar = (qjh) this.d;
        tjh tjhVar = (tjh) this.b;
        LinkedHashMap linkedHashMap = tjhVar.e;
        ojh ojhVar = (ojh) this.c;
        pjh pjhVar = (pjh) linkedHashMap.get(ojhVar);
        if (pjhVar != null) {
            if (tjhVar.b.b() - pjhVar.b <= TimeUnit.MINUTES.toMillis(tjhVar.d.a()) && !qjhVar.b) {
                singleEmitter.onSuccess(pjhVar.a);
                return;
            }
        }
        n4b n4bVar = tjhVar.c;
        String str = ojhVar.b;
        ldi1 ldi1Var = (ldi1) n4bVar.b;
        pl40 pl40VarO = GetCommentCardRequest.o();
        pl40VarO.n(str);
        ldi1Var.b(pl40VarO.build()).delay(qjhVar.a, TimeUnit.MILLISECONDS).blockingSubscribe(new qg7(tjhVar, ojhVar, singleEmitter, (byte) 4), new a21(qjhVar, singleEmitter, (byte) 23));
    }

    public ArrayList t() {
        Collection collectionValues = ((IdentityHashMap) this.d).values();
        ArrayList arrayList = new ArrayList(q7h.U(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((g2g) it.next()).a);
        }
        return arrayList;
    }

    public boolean u(boolean z) {
        return z && ((t7y) this.b).o(4);
    }

    public int v() {
        return ((t7y) this.b).o(3) ? 3 : 4;
    }

    public tv80 w(int i, String str, String str2, boolean z) {
        i8h1 i8h1Var = (i8h1) this.b;
        gxk0 gxk0Var = (gxk0) this.d;
        int i2 = z ? 1 : 2;
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = gxk0Var.a.c();
        x6h1VarC.i.add(new a7h1("comment_row", ktk0.h(i2), numValueOf, str, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("author_name_image", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 x(String str, int i, boolean z) {
        i8h1 i8h1Var = (i8h1) this.b;
        gxk0 gxk0Var = (gxk0) this.d;
        int i2 = z ? 1 : 2;
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = gxk0Var.a.c();
        x6h1VarC.i.add(new a7h1("comment_row", ktk0.h(i2), numValueOf, str, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void y() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((gxk0) this.d).a.c();
        x6h1VarC.i.add(new a7h1("sensitive_comments_disclaimer", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 z(int i, int i2, int i3, String str, boolean z) {
        i8h1 i8h1Var = (i8h1) this.b;
        gxk0 gxk0Var = (gxk0) this.d;
        int i4 = z ? 1 : 2;
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = gxk0Var.a.c();
        x6h1VarC.i.add(new a7h1("comment_row", ktk0.h(i4), numValueOf, str, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        String strM = ab80.m(i3, i2, ":");
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("timestamp", (String) null, (Integer) null, (String) null, strM));
        x6h1VarC2.j = true;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", (String) this.c)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public cce(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                break;
            default:
                this.b = new ArrayList();
                ClientPollResponse clientPollResponseN = ClientPollResponse.n();
                this.c = clientPollResponseN;
                this.d = BehaviorSubject.g(clientPollResponseN);
                break;
        }
    }

    public cce(lik1 lik1Var, jma jmaVar) {
        this.a = (byte) 21;
        this.b = jmaVar;
        this.c = lik1Var;
        this.d = new i2z("", "", "", "", false, 0L);
    }

    public cce(mh0 mh0Var, fyf fyfVar, zxf zxfVar, x8g x8gVar) {
        this.a = (byte) 9;
        this.b = zxfVar;
        this.c = x8gVar;
        this.d = mh0Var.i(new g5g(), new qka(1, ChoiceScreenUcActivity.y1, f5g.class, "isMyResult", "isMyResult(Landroid/content/Intent;)Z", 0, (byte) 23), new v8g(fyfVar, (byte) 0));
    }

    public cce(z1p z1pVar, txk0 txk0Var) {
        this.a = (byte) 2;
        this.b = z1pVar;
        this.c = txk0Var;
        this.d = new idd1(new ptb(this, (byte) 22));
    }

    public cce(i8h1 i8h1Var, String str, byte b) {
        this.a = b;
        switch (b) {
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                this.b = i8h1Var;
                this.c = str;
                this.d = new gxk0(str);
                break;
            default:
                this.b = i8h1Var;
                this.c = str;
                this.d = new idd1(new lwe(this, (byte) 1));
                break;
        }
    }

    public cce(mr20 mr20Var, gmt gmtVar, fzw fzwVar) {
        this.a = (byte) 7;
        this.b = gmtVar;
        this.c = fzwVar;
        this.d = new x010(new ht20(h4p1.f(new hsc(this, (lnm) null, (byte) 28)), new sd0(2, null, (byte) 20)), new otf(rqt0.t(mr20Var, fnt0.O0), (byte) 0), new l2(this, (lnm) null, (byte) 22), (byte) 1);
    }

    public cce(z2k z2kVar) {
        this.a = (byte) 8;
        this.b = z2kVar;
        this.c = new IdentityHashMap();
        this.d = new IdentityHashMap();
    }

    public cce(k0h k0hVar, String str, ynb0 ynb0Var, ki91 ki91Var, o241 o241Var, b7n b7nVar, zwz0 zwz0Var) {
        this.a = (byte) 17;
        this.b = k0hVar;
        this.c = ynb0Var;
        Observable observableDefer = Observable.defer(new yj1(this, (byte) 3));
        Observable map = ((hj91) ki91Var).d(str).map(j561.Q0);
        Observable map2 = ((p241) o241Var).a.map(mpi1.P0);
        mr20 mr20VarA = b7nVar.a(s6n.a);
        o6x o6xVar = o6x.a;
        this.d = Observable.combineLatest(map2, yoi1.i(mr20VarA, o6xVar), yoi1.i(zwz0Var.c(), o6xVar), observableDefer, map, vrg.P0).distinctUntilChanged();
    }

    public cce(y52 y52Var) {
        this.a = (byte) 15;
        this.b = y52Var;
        this.c = new AtomicInteger(0);
        this.d = new AtomicBoolean(false);
    }

    public cce(i8h1 i8h1Var, bqk0 bqk0Var, s4b1 s4b1Var) {
        this.a = (byte) 18;
        this.b = i8h1Var;
        this.c = bqk0Var;
        String strZ = s4b1Var.z();
        this.d = strZ == null ? "" : strZ;
    }

    public /* synthetic */ cce(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public cce(ks40 ks40Var, rs40 rs40Var, rs40 rs40Var2, roj1 roj1Var) {
        this.a = (byte) 0;
        dm5.o(rs40Var != rs40Var2, "Creating a self loop in the chain: %s", rs40Var);
        this.b = rs40Var;
        this.c = new o0g1(ks40Var, rs40Var2, roj1Var);
        this.d = roj1Var;
    }
}
