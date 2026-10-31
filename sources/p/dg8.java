package p;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.authentication.login5esperanto.EsInteractionRequired$InteractionRequiredProceedResult;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.concertview.concertfeedview.v1.GetFeedResponse;
import com.spotify.concertview.concertfeedview.v1.Location;
import com.spotify.concertview.concertfeedview.v1.PageHeader;
import com.spotify.concertview.concertfeedview.v1.Section;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dg8 implements Function, u7u, lc51, av30, pie, xi7, k1q0, t441, x9k1, com.spotify.mobius.functions.Function {
    public final /* synthetic */ byte a;
    public Object b;

    public dg8(ghl ghlVar, kio kioVar) {
        this.a = (byte) 29;
        this.b = kioVar;
    }

    public static void j(dg8 dg8Var, tw4 tw4Var) {
        dg8Var.i(tw4Var, 1);
    }

    public static void m(dg8 dg8Var, float f, float f2, int i) {
        cab cabVar = (cab) dg8Var.b;
        if ((i & 4) != 0) {
            f = Float.intBitsToFloat((int) (cabVar.u() >> 32));
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = Float.intBitsToFloat((int) (cabVar.u() & 4294967295L));
        }
        dg8Var.k(0.0f, 0.0f, f3, f2, 1);
    }

    public Object a(onm onmVar) {
        return (ArrayList) this.b;
    }

    public Object apply(Object obj) {
        ihe0 jhe0Var;
        f470 f470Var;
        int i = 1;
        byte b = 0;
        a6x a6xVar = null;
        switch (this.a) {
            case 0:
                ((Function0) this.b).invoke();
                return xf8.e[((EsInteractionRequired$InteractionRequiredProceedResult) obj).n().o().ordinal()] == 1 ? new yv80(new ug8(400, "Esperanto failure: unknown context")) : new yv80(new ug8(400, "Esperanto failure: incomplete response"));
            case 3:
                YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity = (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj;
                k9 k9Var = (k9) this.b;
                yourLibraryDecoratedEntity.getClass();
                return k9Var.A0(yourLibraryDecoratedEntity);
            case 4:
                mmr0 mmr0Var = (mmr0) obj;
                String str = (String) mmr0Var.a;
                return ((hna) this.b).a((gxu) mmr0Var.b, str).map(new njp1(str, (byte) 3));
            case 6:
                if (((sy21) obj).a.Q0) {
                    Single map = rqt0.F(o6x.a, new f0b((g0b) this.b, a6xVar, b)).map(j561.Z);
                    map.getClass();
                    return map;
                }
                Single singleJust = Single.just(new ajo(3));
                singleJust.getClass();
                return singleJust;
            case 7:
                return ((x0b) this.b).a(((t4b) obj).g).onErrorReturnItem(new yaa0()).toObservable();
            case 9:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to fetch next page of Bridge Tracks", new Object[0]);
                return (p4c) this.b;
            case 13:
                ima1 ima1Var = (dma1) obj;
                l5d l5dVar = (l5d) this.b;
                bma1 bma1Var = l5d.f;
                return !ima1Var.n(bma1Var) ? Single.just(0) : Single.just(Integer.valueOf((int) ((l5dVar.c.b() - ima1Var.g(bma1Var, 0L)) / 3600000)));
            case 17:
                return apo.x((chm0) this.b);
            case 28:
                GetFeedResponse getFeedResponse = (GetFeedResponse) obj;
                qfl1 qfl1Var = (qfl1) this.b;
                PageHeader pageHeaderN = getFeedResponse.n();
                String title = pageHeaderN.getTitle();
                Location locationO = pageHeaderN.o();
                int i2 = xlk.c[locationO.o().ordinal()];
                if (i2 == -1) {
                    jhe0Var = new jhe0("");
                } else if (i2 == 1 || i2 == 2 || i2 == 3) {
                    jhe0Var = new jhe0(locationO.getDisplayName());
                } else if (i2 != 4) {
                    if (i2 != 5) {
                        eg.o();
                        return null;
                    }
                    jhe0Var = new jhe0("");
                } else {
                    jhe0Var = new ihe0(locationO.getDisplayName());
                }
                if (pageHeaderN.p()) {
                    int iOrdinal = pageHeaderN.o().o().ordinal();
                    if (iOrdinal == 1) {
                        i = 2;
                    } else if (iOrdinal == 2) {
                        i = 3;
                    }
                    f470Var = new f470(i);
                } else {
                    f470Var = null;
                }
                zu50 zu50Var = new zu50("", title, jhe0Var, new w160(f470Var));
                h290<Section> h290VarO = getFeedResponse.o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (Section section : h290VarO) {
                    section.getClass();
                    arrayList.add(xto.x(section));
                }
                h290 h290VarO2 = getFeedResponse.o();
                Context context = qfl1Var.a;
                return new rod0(zu50Var, arrayList, (pa30) null, h290VarO2.isEmpty() ? new a6x(context.getString(2131957211), context.getString(2131957210), new oxc(context.getString(2131957209), nik1.y1.a)) : null, getFeedResponse.getNextPageToken());
            default:
                nj3 nj3Var = (nj3) obj;
                kio kioVar = (kio) this.b;
                if (nj3Var instanceof kj3) {
                    return kioVar instanceof iio ? new kj3(new ij3(((iio) kioVar).a, z6x.a)) : new kj3(hj3.c);
                }
                if (nj3Var instanceof lj3) {
                    return kioVar instanceof iio ? new lj3(new jj3(((iio) kioVar).a)) : new lj3(hj3.d);
                }
                n57.e("Should not be reached, this is a constrained integration.");
                return nj3Var;
        }
    }

    public void b() {
        Consumer consumer = (Consumer) ((s59) this.b).b;
        if (consumer != null) {
            consumer.accept(a59.a);
        }
    }

    public void c(s9k1 s9k1Var) {
        boolean zEquals = s9k1Var.equals(l8k1.a);
        xmh xmhVar = (xmh) this.b;
        if (!zEquals) {
            xmhVar.Q0.l(s9k1Var);
            return;
        }
        ogh oghVar = xmhVar.R0;
        if (oghVar != null) {
            o0c.C(oghVar.e.d);
        }
        xmhVar.O0.invoke();
    }

    public void d(jo31 jo31Var) {
        l2a l2aVar = ((f8h) this.b).a;
        l2aVar.getClass();
        int i = jo31Var.i();
        if (i == -65281) {
            i = jo31Var.l();
        }
        ((h47) l2aVar.b).b.invoke(new b07(Integer.valueOf(i)));
    }

    public void e(String str) {
        q0d q0dVarM0 = ((CallingCodePickerActivity) this.b).m0();
        if (str.length() > 0 && !q0dVarM0.i) {
            q0dVarM0.i = true;
            i8h1 i8h1Var = q0dVarM0.d;
            x6h1 x6h1VarC = q0dVarM0.g.b.c();
            x6h1VarC.i.add(new a7h1("country_field", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            i8h1Var.j(new w7h1("", "", new z7h1("key_stroke", 1, b7x.a), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
        }
        CallingCodePickerActivity callingCodePickerActivity = q0dVarM0.j;
        if (callingCodePickerActivity != null) {
            lq80 lq80Var = callingCodePickerActivity.e1;
            lq80Var.getClass();
            lq80Var.i = str.toLowerCase(new Locale(upn1.m()));
            lq80Var.B();
        }
    }

    public Object f(List list, onm onmVar) {
        w4h w4hVar = (w4h) this.b;
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.n(list);
        u4hVarQ.t(w5h.c);
        Object objI = fc11.i(w4hVar.a(u4hVarQ.build()).ignoreElement(), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objI != d9nVar) {
            objI = rih1Var;
        }
        return objI == d9nVar ? objI : rih1Var;
    }

    public boolean g() {
        return false;
    }

    public Object h(List list, onm onmVar) {
        w4h w4hVar = (w4h) this.b;
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.n(list);
        u4hVarQ.t(w5h.f);
        Object objI = fc11.i(w4hVar.a(u4hVarQ.build()).ignoreElement(), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objI != d9nVar) {
            objI = rih1Var;
        }
        return objI == d9nVar ? objI : rih1Var;
    }

    public void i(u8s0 u8s0Var, int i) {
        ((cab) this.b).p().t(u8s0Var, i);
    }

    public void k(float f, float f2, float f3, float f4, int i) {
        ((cab) this.b).p().g(f, f2, f3, f4, i);
    }

    public Single l(Intent intent, th61 th61Var) {
        return yoi1.i(((nzf) ((wf2) this.b).b).a.a("child-can-request-account-closure", false), o6x.a).firstOrError().map(cq41.O0).onErrorReturn(uml1.O0);
    }

    public jhm n(int i, String str, String str2) {
        int i2;
        int iC = l1d.C(i);
        byte b = 1;
        if (iC == 0) {
            i2 = 2131954335;
        } else if (iC == 1) {
            i2 = 2131954338;
        } else if (iC == 2) {
            i2 = 2131954337;
        } else {
            if (iC != 3) {
                eg.o();
                return null;
            }
            i2 = 2131954336;
        }
        return new jhm("podcast_browse_show", j9c.a[l1d.C(i)] == 4 ? pkx.c : mrx.c, (fhm) null, Integer.valueOf(i2), (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(iub.U0, new w8c(str, b)), new oo6((Object) this, (Object) str, (Object) str2, (byte) 27)), 244);
    }

    public vpc o() {
        zv81 zv81Var = (zv81) this.b;
        zv81Var.getClass();
        return new vpc(zv81Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable p(int i, onm onmVar) {
        eo9 eo9Var;
        if (onmVar instanceof eo9) {
            eo9Var = (eo9) onmVar;
            int i2 = eo9Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eo9Var.d = i2 - Integer.MIN_VALUE;
            } else {
                eo9Var = new eo9(this, onmVar);
            }
        } else {
            eo9Var = new eo9(this, onmVar);
        }
        Object objI = eo9Var.b;
        int i3 = eo9Var.d;
        if (i3 == 0) {
            hm5.M(objI);
            vwm1 vwm1Var = (vwm1) this.b;
            gvm1 gvm1VarO = YourLibraryRequest.o();
            hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
            hvm1VarQ.C(30);
            hvm1VarQ.D();
            jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
            jsm1VarR.q(ksm1.d);
            jsm1VarR.q(ksm1.X0);
            hvm1VarQ.u(jsm1VarR.build());
            qsm1 qsm1VarN = YourLibraryConfig.YourLibrarySortOrder.n();
            qsm1VarN.n(rsm1.g);
            hvm1VarQ.I(qsm1VarN.build());
            gvm1VarO.n(hvm1VarQ);
            psm1 psm1VarP = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
            nsm1 nsm1VarO = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
            nsm1VarO.q(osm1.c);
            psm1VarP.u(nsm1VarO);
            gvm1VarO.r(psm1VarP);
            uji1 uji1VarD = vwm1Var.d(gvm1VarO.build());
            eo9Var.a = i;
            eo9Var.d = 1;
            objI = b5p1.i(uji1VarD, eo9Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = eo9Var.a;
            hm5.M(objI);
        }
        h290 h290VarN = ((YourLibraryResponse) objI).n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h290VarN) {
            YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity = (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj;
            if (yourLibraryDecoratedEntity.hasPlaylist() && !ul9.a.contains(yourLibraryDecoratedEntity.e().getUri())) {
                h290 h290VarY = yourLibraryDecoratedEntity.w().y();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : h290VarY) {
                    if (((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) obj2).i() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) it.next()).h());
                }
                if (!arrayList3.isEmpty()) {
                    if (!arrayList3.isEmpty()) {
                        Iterator it2 = arrayList3.iterator();
                        do {
                            if (it2.hasNext()) {
                            }
                        } while (ul9.b.contains((clc0) it2.next()));
                    }
                    arrayList.add(obj);
                    break;
                }
            }
        }
        List<YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity> listD1 = o7h.d1(arrayList, i);
        ArrayList arrayList4 = new ArrayList(q7h.U(listD1, 10));
        for (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity2 : listD1) {
            arrayList4.add(new ao9(yourLibraryDecoratedEntity2.e().getUri(), yourLibraryDecoratedEntity2.e().getName(), yourLibraryDecoratedEntity2.e().q()));
        }
        return arrayList4;
    }

    public boolean q(byte[] bArr) {
        svz0 svz0Var = svz0.d;
        boolean zIsEmpty = svz0.d.a.c.isEmpty();
        try {
            svz0 svz0VarN = ulc.n(bArr);
            if (svz0VarN.b.isEmpty() && zIsEmpty) {
                return false;
            }
            if (bArr.length != 0) {
                v1k v1kVar = (v1k) this.b;
                synchronized (v1kVar) {
                    ne neVar = (ne) v1kVar.b;
                    ((cj4) neVar.d).f(svz0VarN);
                    sz11 sz11Var = (sz11) neVar.b;
                    if (sz11Var != null) {
                        sz11Var.b(mgo1.j(((hm61) neVar.a).a));
                    }
                }
            }
            ((v1k) this.b).t();
            return true;
        } catch (InvalidProtocolBufferException e) {
            utw0 utw0Var = ike1.a;
            utw0Var.y("RCS");
            utw0Var.s(e, "Invalid format of configuration.", new Object[0]);
            return false;
        }
    }

    public void r(float f, float f2, float f3, float f4) {
        cab cabVar = (cab) this.b;
        fid fidVarP = cabVar.p();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cabVar.u() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cabVar.u() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            pf80.a("Width and height must be greater than or equal to zero");
        }
        cabVar.D(jFloatToRawIntBits);
        fidVarP.h(f, f2);
    }

    public void s(float f, long j) {
        fid fidVarP = ((cab) this.b).p();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        fidVarP.h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        fidVarP.n(f);
        fidVarP.h(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void t(float f, float f2, long j) {
        fid fidVarP = ((cab) this.b).p();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        fidVarP.h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        fidVarP.b(f, f2);
        fidVarP.h(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void u(zv81 zv81Var) {
        this.b = zv81Var;
    }

    public ezc v(List list, w5h w5hVar) {
        w4h w4hVar = (w4h) this.b;
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.t(w5hVar);
        u4hVarQ.n(list);
        return yoi1.g(w4hVar.c(u4hVarQ.build()).map(new b3h(list)));
    }

    public xs4 w(String str) {
        return new xs4(v(Collections.singletonList(str), w5h.c), str, (byte) 2);
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.b;
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? hsl1Var : null;
        if (!Objects.equals(collapsingToolbarLayout.b1, hsl1Var2)) {
            collapsingToolbarLayout.b1 = hsl1Var2;
            collapsingToolbarLayout.requestLayout();
        }
        return hsl1Var.a.c();
    }

    public void y(float[] fArr) {
        ((cab) this.b).p().s(fArr);
    }

    public void z(float f, float f2) {
        ((cab) this.b).p().h(f, f2);
    }

    public dg8(Function0 function0, fg8 fg8Var) {
        this.a = (byte) 0;
        this.b = function0;
    }

    public /* synthetic */ dg8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public dg8(j4u j4uVar, int i) {
        this.a = (byte) 16;
        this.b = j4uVar;
    }

    public dg8() {
        this.a = (byte) 11;
    }
}
