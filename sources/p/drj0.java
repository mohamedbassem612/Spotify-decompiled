package p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.widget.ScrollView;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import com.spotify.liveroom.listeningparty.proto.ObservePartyResponse;
import com.spotify.liveroom.listeningparty.proto.PinnedMessageData;
import com.spotify.liveroom.listeningparty.proto.User;
import com.spotify.music.spotlets.offline.util.events.proto.DownloadInteraction;
import com.spotify.scrollsita.v1.NpvScrollResponse;
import com.spotify.scrollsita.v1.ResponseInfo;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class drj0 implements m381, Function, zso0, BiFunction {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public drj0(m7k0 m7k0Var) {
        this.a = (byte) 2;
        this.c = m7k0Var;
        l4r l4rVar = new l4r(pwc0.b, 1, hxj0.T0, new j4r(new l7k0(m7k0Var, (byte) 0)), hxj0.U0);
        l4r l4rVar2 = new l4r(jd0.x, 2, hxj0.N0, new j4r(hxj0.X), hxj0.O0);
        hvm hvmVar = hvm.d;
        this.b = w3p1.l(l4rVar, l4rVar2, new l4r(hvmVar, 2, hxj0.P0, new j4r(hxj0.Y), hxj0.Q0), new l4r(hvmVar, 2, hxj0.R0, new j4r(hxj0.Z), hxj0.S0), eej0.d1);
    }

    public static CollectionPlatformItemsRequest l(String str) {
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.r(str);
        u4hVarQ.t(w5h.X);
        return u4hVarQ.build();
    }

    public void a(int i, hmb0 hmb0Var) {
        ((bfn0) this.b).a(i, hmb0Var);
        ((g24) this.c).invoke();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a0  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object apply(Object obj) {
        int i;
        i5w0 i5w0Var;
        int i2;
        String str;
        String strO;
        Observable observableJust;
        Object next;
        ibf ibfVar;
        y4i1 y4i1Var;
        y4i1 y4i1Var2;
        byte b = this.a;
        int i3 = 5;
        int i4 = 4;
        int i5 = 6;
        int i6 = 0;
        String str2 = null;
        int i7 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 5:
                return Observable.fromIterable(((g4r) obj3).a).flatMap(new rok0((cvm0) obj2, (uv00) obj, (byte) 1)).toList().map(b610.P0).toObservable();
            case 12:
                l9o0 l9o0Var = (l9o0) obj3;
                r9c r9cVar = (r9c) obj2;
                List<i1z> items = ((vn90) obj).getItems();
                ArrayList arrayList = new ArrayList();
                for (i1z i1zVar : items) {
                    String str3 = r9cVar.b;
                    mre0 mre0Var = (mre0) l9o0Var.c;
                    int i8 = i3;
                    boolean z = i1zVar.C == g1z.b ? i7 : i6;
                    int i9 = z != 0 ? i5 : i1zVar.m ? i4 : i7;
                    g281 g281Var = i1zVar.z;
                    String str4 = g281Var != null ? g281Var.d : str2;
                    long j = i1zVar.q;
                    Integer num = i1zVar.r;
                    String strL = ((zwg) mre0Var.b).L(new m4v0(j, num != null ? num.intValue() : -1L, i1zVar.s, new Date(((long) i1zVar.y) * 1000), false, i1zVar.m, z, false, str4, (iix0) null, i9, (String) null, 2704));
                    tu00 tu00Var = i1zVar.D;
                    boolean z2 = i1zVar.s;
                    int i10 = i1zVar.q;
                    Integer num2 = i1zVar.r;
                    String str5 = i1zVar.a;
                    b9v0 b9v0VarA = tu00Var.a(b9v0.class);
                    int i11 = (b9v0VarA == null || !b9v0VarA.a || b9v0VarA.b) ? 0 : i7;
                    if (i1zVar.f11p && i11 == 0) {
                        double dIntValue = z2 ? 1.0d : (num2 == null || num2.intValue() >= i10 || i10 <= 0) ? 0.0d : 1.0d - (((double) num2.intValue()) / ((double) i10));
                        if (i1zVar.m) {
                            i2 = 4;
                        } else if (z2) {
                            i2 = 3;
                        } else {
                            i2 = (num2 == null || num2.intValue() >= i10) ? 1 : 2;
                        }
                        Uri uri = Uri.EMPTY;
                        Uri uri2 = Uri.parse(str5);
                        String str6 = i1zVar.c;
                        xwp0 xwp0Var = i1zVar.A;
                        xwp0Var.getClass();
                        boolean z3 = xwp0Var instanceof hwp0;
                        Set set = s4b1.f;
                        Uri uri3 = Uri.parse(uic.x(str5).y());
                        Uri uri4 = Uri.parse(i1zVar.b(1));
                        Double dValueOf = Double.valueOf(dIntValue);
                        boolean z4 = i1zVar.k;
                        boolean z5 = i1zVar.l;
                        Integer numValueOf = Integer.valueOf(i10);
                        Integer num3 = num2 != null ? num2 : null;
                        String strD = k4s0.d(i8);
                        List list = (List) spq0.a(tu00Var.a(v740.class)).i(new cwa((byte) 11)).h();
                        if (list == null || list.isEmpty()) {
                            i = 0;
                        } else {
                            i = 0;
                            u740 u740Var = (u740) list.get(0);
                            if (str5.equals(u740Var.a)) {
                                ArrayList arrayList2 = u740Var.b;
                                if (!arrayList2.isEmpty()) {
                                    str = ((wsi1) arrayList2.get(0)).a;
                                }
                            }
                            i5w0Var = new i5w0(new u310(str5, (String) null, str6, strL, uri4, (Uri) null, uri, uri, uri, uri2, uri3, 1, z3, z4, z5, false, 2, i2, dValueOf, numValueOf, num3, false, strD, str3, (Integer) null, 0, (y310) null, (String) null, (Long) null, str, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12));
                        }
                        str = null;
                        i5w0Var = new i5w0(new u310(str5, (String) null, str6, strL, uri4, (Uri) null, uri, uri, uri, uri2, uri3, 1, z3, z4, z5, false, 2, i2, dValueOf, numValueOf, num3, false, strD, str3, (Integer) null, 0, (y310) null, (String) null, (Long) null, str, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12));
                    } else {
                        r9cVar = r9cVar;
                        i = 0;
                        i5w0Var = j5.a;
                    }
                    u310 u310Var = (u310) i5w0Var.h();
                    if (u310Var != null) {
                        arrayList.add(u310Var);
                    }
                    i6 = i;
                    i3 = i8;
                    r9cVar = r9cVar;
                    i4 = 4;
                    i5 = 6;
                    str2 = null;
                    i7 = 1;
                }
                return new z310(new ArrayList(arrayList), new f410(14, l9o0Var.b.getString(2131953999), (String) null, (List) null), (m510) null, (String) null);
            case 17:
                if (obj == null) {
                    return new etx0(hwb.x(), ((qfl1) obj3).b(2131958177, new Object[0]), ((yqg) obj2).b());
                }
                bhn0.d();
                return null;
            case 18:
                Object[] objArr = (Object[]) obj;
                ResponseInfo responseInfoN = ((NpvScrollResponse) obj3).n();
                ArrayList arrayList3 = new ArrayList();
                int length = objArr.length;
                while (i6 < length) {
                    Object obj4 = objArr[i6];
                    if (obj4 instanceof Notification) {
                        arrayList3.add(obj4);
                    }
                    i6++;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    eyo0 eyo0Var = (eyo0) ((Notification) it.next()).d();
                    if (eyo0Var != null) {
                        arrayList4.add(eyo0Var);
                    }
                }
                return new fbr(responseInfoN, arrayList4, o7h.l1((ArrayList) obj2));
            case 22:
                ObservePartyResponse observePartyResponse = (ObservePartyResponse) obj;
                int iQ = observePartyResponse.q();
                int i12 = iQ == 0 ? -1 : ajp0.b[l1d.C(iQ)];
                if (i12 == -1) {
                    strO = null;
                } else if (i12 == 1) {
                    strO = observePartyResponse.o().o();
                } else if (i12 == 2) {
                    strO = observePartyResponse.p().p();
                } else if (i12 != 3) {
                    if (i12 != 4 && i12 != 5) {
                        eg.o();
                        return null;
                    }
                    strO = null;
                } else {
                    strO = observePartyResponse.n().o();
                }
                if (strO != null) {
                    if (ihc1.y0(strO)) {
                        strO = null;
                    }
                    if (strO != null) {
                        ((zip0) obj3).b.put(((y6b1) obj2).toString(), strO);
                        if (observePartyResponse.t()) {
                            Long lValueOf = Long.valueOf(bjp0.a(observePartyResponse.p().o()));
                            Iterator it2 = observePartyResponse.p().q().o().o().iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    long jA = bjp0.a(((PinnedMessageData.PinnedMessage) next).p());
                                    do {
                                        Object next2 = it2.next();
                                        long jA2 = bjp0.a(((PinnedMessageData.PinnedMessage) next2).p());
                                        if (jA < jA2) {
                                            next = next2;
                                            jA = jA2;
                                        }
                                    } while (it2.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            PinnedMessageData.PinnedMessage pinnedMessage = (PinnedMessageData.PinnedMessage) next;
                            if (pinnedMessage == null || !pinnedMessage.r()) {
                                ibfVar = null;
                            } else {
                                String strN = pinnedMessage.n();
                                bbe1 bbe1Var = pinnedMessage.s() ? new bbe1(pinnedMessage.q().n()) : null;
                                ybf ybfVar = new ybf(null, Boolean.TRUE);
                                User userO = pinnedMessage.o();
                                int iQ2 = userO.q();
                                int i13 = iQ2 != 0 ? ajp0.a[l1d.C(iQ2)] : -1;
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        y4i1Var2 = null;
                                    } else {
                                        dbi1 dbi1Var = new dbi1(userO.n().getUsername());
                                        String displayName = userO.n().getDisplayName();
                                        String imageUrl = userO.n().getImageUrl();
                                        if (imageUrl.length() == 0) {
                                            imageUrl = null;
                                        }
                                        y4i1Var = new y4i1(dbi1Var, displayName, imageUrl);
                                    }
                                    if (y4i1Var2 == null) {
                                        ibfVar = null;
                                    } else {
                                        ibfVar = new ibf(strN, bbe1Var, ybfVar, y4i1Var2, Instant.ofEpochMilli(bjp0.a(pinnedMessage.p())).toString());
                                    }
                                } else {
                                    hbi1 hbi1Var = new hbi1(userO.p().o());
                                    String displayName2 = userO.p().getDisplayName();
                                    String imageUrl2 = userO.p().getImageUrl();
                                    if (imageUrl2.length() == 0) {
                                        imageUrl2 = null;
                                    }
                                    y4i1Var = new y4i1(hbi1Var, displayName2, imageUrl2);
                                }
                                y4i1Var2 = y4i1Var;
                                if (y4i1Var2 == null) {
                                    ibfVar = null;
                                } else {
                                    ibfVar = new ibf(strN, bbe1Var, ybfVar, y4i1Var2, Instant.ofEpochMilli(bjp0.a(pinnedMessage.p())).toString());
                                }
                            }
                            observableJust = Observable.just(new s3s0(strO, lValueOf, ibfVar));
                        } else {
                            if (!observePartyResponse.s() && !observePartyResponse.r()) {
                                eg.m("Got a party message token in an unexpected state");
                                return null;
                            }
                            observableJust = Observable.just(new s3s0(strO, 6));
                        }
                        if (observableJust != null) {
                            return observableJust;
                        }
                    }
                }
                return Observable.just(new s3s0(null, 7));
            default:
                m900 m900Var = (m900) ((rzo0) obj3).d;
                boolean z6 = !((Boolean) obj).booleanValue();
                m900Var.getClass();
                return Single.defer(new wtu((String) obj2, z6, m900Var, (byte) 1)).subscribeOn(m900Var.b).flatMapMaybe(s9w.d1);
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public void c(int i) {
        bto0 bto0Var = (bto0) this.b;
        if (i == 1) {
            fn31.T(zso1.H(bto0Var.a), bto0Var.b, 0, new uug0((za80) this.c, (lnm) null, (byte) 29), 2);
        }
    }

    public void d(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(l1d.q(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    public void f() {
        ((bfn0) this.b).g();
        ((g24) this.c).invoke();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0126  */
    public rxj0 g() {
        int i;
        wx4 wx4Var = (wx4) this.b;
        boolean zJ0 = wx4Var.j0();
        boolean zS = wx4Var.S();
        int iA = wx4Var.A();
        boolean zY = wx4Var.y();
        boolean zJ1 = wx4Var.j0();
        boolean zJ2 = wx4Var.j0();
        hdl1 hdl1Var = new hdl1();
        float fZ = wx4Var.Z() / 1000.0f;
        int iH = wx4Var.h();
        boolean zC = wx4Var.c();
        int iB = wx4Var.B();
        int iF = wx4Var.f();
        boolean zT = wx4Var.t();
        boolean zS2 = wx4Var.s();
        boolean zN = wx4Var.N();
        boolean zD0 = wx4Var.d0();
        boolean zE0 = wx4Var.e0();
        boolean zC2 = wx4Var.C();
        boolean zK = wx4Var.K();
        boolean zJ = wx4Var.J();
        long jM = wx4Var.M();
        boolean zG = wx4Var.G();
        boolean zO = wx4Var.O();
        int iF0 = wx4Var.f0();
        boolean zL = wx4Var.l();
        int iL = wx4Var.L();
        boolean zD = wx4Var.d();
        int iZ = wx4Var.z();
        boolean zQ = wx4Var.Q();
        boolean zE = wx4Var.E();
        boolean zB = wx4Var.b();
        boolean zK2 = wx4Var.k();
        boolean zG2 = wx4Var.g();
        boolean zR = wx4Var.R();
        boolean zH0 = wx4Var.h0();
        boolean zI0 = wx4Var.i0();
        boolean zG0 = wx4Var.g0();
        boolean zA0 = wx4Var.a0();
        boolean zY2 = wx4Var.Y();
        boolean zR2 = wx4Var.r();
        boolean zI = wx4Var.I();
        boolean zH = wx4Var.H();
        boolean zP = wx4Var.P();
        boolean zE2 = wx4Var.e();
        boolean zD2 = wx4Var.D();
        boolean zA = ((tp4) this.c).a();
        boolean zI2 = wx4Var.i();
        boolean zN2 = wx4Var.n();
        boolean zX = wx4Var.x();
        int iC0 = wx4Var.b0() ? wx4Var.c0() : 0;
        boolean zX2 = wx4Var.X();
        boolean zJ3 = wx4Var.j();
        boolean zA2 = wx4Var.a();
        int iV = wx4Var.v();
        int iW = wx4Var.W();
        String str = wx4Var.V().a;
        int iHashCode = str.hashCode();
        int i2 = 1;
        if (iHashCode != 1864483865) {
            switch (iHashCode) {
                case 1112748157:
                    if (!str.equals("relatedKey1")) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    break;
                case 1112748158:
                    str.equals("relatedKey2");
                    i = 3;
                    break;
                case 1112748159:
                    if (!str.equals("relatedKey3")) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                    break;
                default:
                    i = 3;
                    break;
            }
        } else if (str.equals("sameKey")) {
            i = 1;
        } else {
            i = 3;
        }
        String str2 = wx4Var.U().a;
        int iHashCode2 = str2.hashCode();
        int i3 = i;
        if (iHashCode2 != -1263050736) {
            if (iHashCode2 != -475310673) {
                if (iHashCode2 == 3444122) {
                    str2.equals("plus");
                }
            } else if (str2.equals("plusAlt")) {
                i2 = 2;
            }
        } else if (str2.equals("addBelow")) {
            i2 = 3;
        }
        return new rxj0(zJ0, zJ1, zJ2, zY, hdl1Var, zS, iA, fZ, iH, zC, iB, iF, zT, zS2, zN, zD0, zE0, zC2, zK, zJ, jM, zG, zO, iF0, zL, iL, zD, iZ, zQ, zE, zB, zK2, zG2, zR, zH0, zI0, zG0, zA0, zY2, zR2, zI, zH, zP, zE2, zD2, zA, zI2, zN2, zX, iC0, zX2, zJ3, zA2, iV, iW, i3, i2, wx4Var.u(), wx4Var.T(), wx4Var.F(), wx4Var.o(), wx4Var.p(), wx4Var.q());
    }

    public g471 h(o571 o571Var) {
        g471 g471Var = (g471) ((Map) ((idd1) this.c).getValue()).get(o571Var);
        if (g471Var != null) {
            return g471Var;
        }
        throw new NoSuchElementException("Destination with id " + o571Var + " not found");
    }

    public bfn0 i() {
        return (bfn0) this.b;
    }

    public void j(String str, int i, boolean z) {
        String str2;
        lik1 lik1Var = (lik1) this.b;
        hxu hxuVarN = DownloadInteraction.n();
        hxuVarN.n(str);
        hxuVarN.r(z);
        hxuVarN.s(lik1Var.a);
        if (i == 1) {
            str2 = "header-toggle";
        } else if (i == 2) {
            str2 = "header-button";
        } else if (i == 3) {
            str2 = "item-row";
        } else if (i == 4) {
            str2 = "context-menu";
        } else {
            if (i != 5) {
                throw null;
            }
            str2 = "options-menu";
        }
        hxuVarN.q(str2);
        ((t2j0) this.c).a(hxuVarN.build());
    }

    public Object k(int i) {
        Object objL = ((bfn0) this.b).l(i);
        ((g24) this.c).invoke();
        return objL;
    }

    public boolean m(int i, iu30 iu30Var) {
        bnj0 bnj0Var;
        kt91 kt91Var = (kt91) this.b;
        i8h1 i8h1Var = ((lto) this.c).a;
        int iC = l1d.C(i);
        if (iC == 0) {
            bnj0Var = new bnj0(i8h1Var, new zok0(2), (byte) 28);
        } else {
            if (iC != 1) {
                eg.o();
                return false;
            }
            bnj0Var = new bnj0(i8h1Var, new zok0(1), (byte) 28);
        }
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963401});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963401});
        er91 er91Var = new er91((fs91) null, "", 2131963401, (String) null, 2131963400, new t230(bnj0Var, iu30Var, (byte) 22), (cvr) null, (xq91) null, false);
        if (!kt91Var.g()) {
            return false;
        }
        kt91Var.k(er91Var);
        ((i8h1) bnj0Var.b).f(((zok0) bnj0Var.c).e(), (Set) null);
        return true;
    }

    public String n(EventCardInfoResponse eventCardInfoResponse) {
        String string;
        Context context = (Context) this.b;
        if (eventCardInfoResponse.q() && eventCardInfoResponse.u()) {
            string = context.getResources().getString(2131955764, eventCardInfoResponse.r());
        } else {
            string = eventCardInfoResponse.q() ? context.getResources().getString(2131955765) : context.getResources().getString(2131955766);
        }
        string.getClass();
        return string;
    }

    public mr20 o(Activity activity) {
        ezc ezcVarG = yoi1.g(((dg0) this.b).a(activity));
        axn0 axn0Var = (axn0) this.c;
        return rqt0.u(new x010(ezcVarG, yoi1.g(Observable.combineLatest(axn0Var.b, axn0Var.c, ta20.Q0).distinctUntilChanged()), new xv5(3, (lnm) null, (byte) 1), (byte) 1));
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        k7k0 k7k0Var = (k7k0) obj;
        m7k0 m7k0Var = (m7k0) this.c;
        Set set = s4b1.f;
        return uic.x(vhc1Var.getUri()).c == blc0.ti && z6k0.a(k7k0Var.a.X) && (vhc1Var instanceof thc1) && !k7k0Var.b && m7k0Var.c.a(k7k0Var.c, k7k0Var.d).b();
    }

    public String toString() {
        switch (this.a) {
            case 21:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void e() {
    }

    public /* synthetic */ drj0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ drj0(Object obj) {
        this.a = (byte) 21;
        this.c = obj;
        this.b = new ArrayList();
    }

    public drj0(e93 e93Var, m4c m4cVar) {
        this.a = (byte) 23;
        this.b = e93Var;
        this.c = new idd1(new pdp0(this, (byte) 5));
    }

    public drj0(i8h1 i8h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 14:
                this.b = i8h1Var;
                this.c = new tdl0((byte) 29);
                break;
            default:
                this.b = i8h1Var;
                this.c = new bqk0((byte) 5);
                break;
        }
    }

    public drj0(hwb hwbVar, qfl1 qfl1Var, yqg yqgVar) {
        this.a = (byte) 17;
        this.b = qfl1Var;
        this.c = yqgVar;
    }

    public drj0(t2j0 t2j0Var, lik1 lik1Var) {
        this.a = (byte) 25;
        this.b = lik1Var;
        this.c = t2j0Var;
    }

    public drj0(ScrollView scrollView, PrimaryButtonView primaryButtonView, PrimaryButtonView primaryButtonView2) {
        this.a = (byte) 13;
        this.b = scrollView;
        this.c = primaryButtonView2;
    }

    public /* synthetic */ drj0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public drj0(bg11 bg11Var, int[] iArr) {
        this.a = (byte) 8;
        this.b = b380.p(bg11Var);
        this.c = iArr;
    }

    public Object apply(Object obj, Object obj2) {
        Object next;
        List list = (List) obj;
        b8p1 b8p1Var = (b8p1) this.c;
        List list2 = (List) this.b;
        List list3 = (List) obj2;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list3) {
            if (((rsp0) obj3).c == 1) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((rsp0) it.next()).a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list3) {
            if (((rsp0) obj4).c == 2) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((rsp0) it2.next()).a);
        }
        Iterator it3 = list3.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((rsp0) next).c != 3);
        rsp0 rsp0Var = (rsp0) next;
        String str = rsp0Var != null ? rsp0Var.a : null;
        list.size();
        arrayList4.toString();
        arrayList2.toString();
        if (str != null) {
            list2.add(new cup0(com.spotify.player.model.Context.fromUri(str), true));
        }
        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList5.add(new cup0(com.spotify.player.model.Context.fromUri((String) it4.next()), false));
        }
        list2.addAll(arrayList5);
        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            arrayList6.add(new cup0(com.spotify.player.model.Context.fromUri((String) it5.next()), false));
        }
        list2.addAll(arrayList6);
        List list4 = list;
        if (!list4.isEmpty()) {
            list2.add(new cup0(com.spotify.player.model.Context.fromTrackUris("", b380.p(list4)), true));
        }
        list2.size();
        if (list2.isEmpty()) {
            return j5.a;
        }
        cup0 cup0Var = (cup0) list2.get(b8p1Var.b);
        int i = b8p1Var.b + 1;
        int size = list2.size();
        int i2 = i % size;
        b8p1Var.b = i2 + (size & (((i2 ^ size) & ((-i2) | i2)) >> 31));
        return spq0.d(cup0Var);
    }
}
