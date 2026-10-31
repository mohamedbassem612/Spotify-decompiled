package p;

import android.net.Uri;
import android.os.SystemClock;
import android.view.Choreographer;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.messages.NebulaRequest;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.on_demand_set.proto.ResponseStatus;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.commons.nebula.GetAttributesResponse;
import com.spotify.remoteconfig.fetcherimpl.network.NebulaRequestFailedException;
import com.spotify.search.esperanto.proto.OfflineSearchResponse;
import com.spotify.search.proto.OfflineAlbum;
import com.spotify.search.proto.OfflineAudioEpisode;
import com.spotify.search.proto.OfflinePlaylist;
import com.spotify.search.proto.OfflineTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableErrorSupplier;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ewn0 implements Function, qiw, Predicate {
    public final /* synthetic */ byte a;
    public Object b;

    public ewn0(CoordinatorLayout coordinatorLayout, ComposeView composeView) {
        this.a = (byte) 24;
        this.b = coordinatorLayout;
    }

    public static ewn0 e(Number number) {
        return new ewn0((Object) number, (byte) 15);
    }

    public Object a() {
        return (Number) this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x02f8  */
    public Object apply(Object obj) {
        k560 k560Var;
        int i;
        mmr0 mmr0Var;
        MaybeEmpty maybeEmptyFlatMapMaybe;
        boolean z = true;
        switch (this.a) {
            case 1:
                if (((Long) obj).longValue() >= 0) {
                    return CompletableEmpty.a;
                }
                q1o0 q1o0Var = ((t1o0) this.b).c;
                return q1o0Var.b().flatMapCompletable(new yfc0(q1o0Var, (byte) 22));
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            default:
                rmq0 rmq0Var = (rmq0) ((Map) obj).get((mmq0) this.b);
                return rmq0Var == null ? new rmq0(false, false) : rmq0Var;
            case 5:
                return zr7.I(((PlayerState) obj).restrictions()).c ? CompletableEmpty.a : ((qzo0) this.b).b.a(new n9u0()).ignoreElement();
            case 8:
                j23 j23Var = ((bip0) this.b).a;
                return j23Var.d.b("nls://playlist-ai-creation", b03.e).map(pzs0.f).filter(new clv(((qqx0) obj).a, (byte) 3)).distinctUntilChanged().concatMap(new bv40(j23Var, (byte) 10));
            case 9:
                ob0 ob0Var = (tb0) this.b;
                if (((Boolean) obj).booleanValue()) {
                    Observable observableJust = Observable.just(psy0.a);
                    observableJust.getClass();
                    return observableJust;
                }
                ob0 ob0Var2 = (rb0) ob0Var;
                boolean z2 = ob0Var2 instanceof ob0;
                if (z2) {
                    k560Var = ob0Var2.a;
                } else {
                    if (!(ob0Var2 instanceof sb0)) {
                        eg.o();
                        return null;
                    }
                    k560Var = ((sb0) ob0Var2).a;
                }
                if (z2) {
                    z = ob0Var2.b;
                } else if (!(ob0Var2 instanceof sb0)) {
                    eg.o();
                    return null;
                }
                Observable observableJust2 = Observable.just(new nsy0(k560Var, z));
                observableJust2.getClass();
                return observableJust2;
            case 10:
                List<EsOffline.Item> itemsList = ((EsOffline.GetItemsResponse) obj).getItemsList();
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
                ArrayList arrayList = new ArrayList();
                for (EsOffline.Item item : itemsList) {
                    int iOrdinal = item.o().ordinal();
                    if (iOrdinal == 0) {
                        i = 1;
                    } else if (iOrdinal == 1) {
                        i = 2;
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        i = 0;
                    }
                    if (i == 0) {
                        mmr0Var = null;
                    } else {
                        a2v a2vVar = new a2v(item.getUri(), i);
                        if (linkedHashSet.contains(a2vVar)) {
                            int i2 = ypp0.b[item.p().ordinal()];
                            g2v e2vVar = f2v.a;
                            switch (i2) {
                                case -1:
                                case 1:
                                case 2:
                                case 9:
                                    mmr0Var = new mmr0(a2vVar, e2vVar);
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return null;
                                case 3:
                                    e2vVar = d2v.a;
                                    mmr0Var = new mmr0(a2vVar, e2vVar);
                                    break;
                                case 4:
                                    e2vVar = c2v.a;
                                    mmr0Var = new mmr0(a2vVar, e2vVar);
                                    break;
                                case 5:
                                    e2vVar = new e2v(yoi1.o(item.getSyncProgress() / 100.0f, 0.0f, 1.0f));
                                    mmr0Var = new mmr0(a2vVar, e2vVar);
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                    e2vVar = g2v.a;
                                    mmr0Var = new mmr0(a2vVar, e2vVar);
                                    break;
                            }
                        } else {
                            mmr0Var = null;
                        }
                    }
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                return sqg0.T(arrayList);
            case 11:
                return e821.f(((jtp0) this.b).b, (YourLibraryResponse) obj, true, false, false, false, 160);
            case 12:
                mmr0 mmr0Var2 = (mmr0) obj;
                OfflineSearchResponse offlineSearchResponse = (OfflineSearchResponse) mmr0Var2.a;
                Map map = (Map) mmr0Var2.b;
                rzo0 rzo0Var = (rzo0) this.b;
                List<OfflineTrack> tracksList = offlineSearchResponse.getTracksList();
                ArrayList arrayList2 = new ArrayList(q7h.U(tracksList, 10));
                for (OfflineTrack offlineTrack : tracksList) {
                    boolean zJ = u890.j(map.get(offlineTrack.getUri()), Boolean.TRUE);
                    String uri = offlineTrack.getUri();
                    String name = offlineTrack.getName();
                    String strQ = offlineTrack.q();
                    h290 h290VarO = offlineTrack.o();
                    ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO, 10));
                    Iterator it = h290VarO.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new txp0((String) it.next()));
                    }
                    arrayList2.add(new oxp0(uri, name, strQ, arrayList3, new rxp0(offlineTrack.n(), (String) null), offlineTrack.p(), offlineTrack.r(), zJ));
                }
                yxp0 yxp0Var = new yxp0(arrayList2);
                h290<OfflinePlaylist> h290VarP = offlineSearchResponse.p();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarP, 10));
                for (OfflinePlaylist offlinePlaylist : h290VarP) {
                    arrayList4.add(new dup0(offlinePlaylist.getUri(), offlinePlaylist.getName(), offlinePlaylist.n()));
                }
                fup0 fup0Var = new fup0(arrayList4);
                h290<OfflineAudioEpisode> h290VarO2 = offlineSearchResponse.o();
                ArrayList arrayList5 = new ArrayList(q7h.U(h290VarO2, 10));
                for (OfflineAudioEpisode offlineAudioEpisode : h290VarO2) {
                    arrayList5.add(new krp0(offlineAudioEpisode.n(), offlineAudioEpisode.p(), offlineAudioEpisode.getUri(), offlineAudioEpisode.getName(), offlineAudioEpisode.o()));
                }
                mrp0 mrp0Var = new mrp0(arrayList5);
                h290<OfflineAlbum> h290VarN = offlineSearchResponse.n();
                ArrayList arrayList6 = new ArrayList(q7h.U(h290VarN, 10));
                for (OfflineAlbum offlineAlbum : h290VarN) {
                    arrayList6.add(new ynp0(offlineAlbum.getUri(), offlineAlbum.n(), offlineAlbum.getName(), offlineAlbum.o()));
                }
                ovp0 ovp0Var = new ovp0("", yxp0Var, mrp0Var, fup0Var, arrayList6);
                if (arrayList6.isEmpty()) {
                    return Single.just(yz10.h(ovp0Var, b7x.a));
                }
                ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                Iterator it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((ynp0) it2.next()).a);
                }
                return ((nw41) rzo0Var.d).a.b(new oi("search", false, new k011(arrayList7, (byte) 2))).filter(y1x0.i).map(a2x0.t).map(new l1p0(ovp0Var, (byte) 6)).firstOrError().onErrorReturn(new tym0(ovp0Var, (byte) 13));
            case 13:
                ResponseStatus responseStatus = (ResponseStatus) obj;
                return responseStatus.getStatusCode() == 200 ? CompletableEmpty.a : new CompletableErrorSupplier(new m3q0((n3q0) this.b, responseStatus, (byte) 1));
            case 14:
                hma1 hma1VarEdit = ((jux0) ((o4e0) this.b).b).a.edit();
                hma1VarEdit.a(jux0.b, true);
                hma1VarEdit.h();
                return Observable.just(wrx0.a);
            case 18:
                i1z i1zVar = (i1z) obj;
                dds0 dds0Var = (dds0) this.b;
                g281 g281Var = i1zVar.z;
                String str = g281Var != null ? g281Var.a : null;
                if (str == null) {
                    maybeEmptyFlatMapMaybe = MaybeEmpty.a;
                    maybeEmptyFlatMapMaybe.getClass();
                } else {
                    x3v0 x3v0Var = dds0Var.a;
                    List listSingletonList = Collections.singletonList(str);
                    Boolean bool = Boolean.TRUE;
                    maybeEmptyFlatMapMaybe = x3v0Var.c(listSingletonList, new t3v0((Map) null, (Map) null, sqg0.J(new mmr0[]{new mmr0("isBook", bool), new mmr0("name", bool), new mmr0("covers", bool), new mmr0("publisher", bool)}), (List) null, p7h.M(new Integer[]{31, 164}), 95)).flatMapMaybe(new t4o(str, (byte) 6));
                    maybeEmptyFlatMapMaybe.getClass();
                }
                return maybeEmptyFlatMapMaybe.f(new qkn0(i1zVar, (byte) 15));
            case 21:
                return (tjm) this.b;
        }
    }

    public ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            i0v0 i0v0VarA = ((k1v0) obj).a((ksk) this.b);
            k0v0 k0v0Var = i0v0VarA != null ? new k0v0(i, i0v0VarA) : null;
            if (k0v0Var != null) {
                arrayList.add(k0v0Var);
            }
            i = i2;
        }
        return arrayList;
    }

    public void c(Exception exc, x020 x020Var, long j) {
        String str;
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.B(exc, "Nebula request failed within %d ms", new Object[]{Long.valueOf(j)});
        if (exc instanceof NebulaRequestFailedException) {
            d(((NebulaRequestFailedException) exc).a, a020.e1, x020Var, j);
            return;
        }
        if (!(exc instanceof SocketTimeoutException)) {
            Iterator it = z561.c0(htn0.Z, exc).iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "unknown";
                    break;
                } else if (((Throwable) it.next()) instanceof InvalidProtocolBufferException) {
                    str = "invalid_nebula_payload";
                    break;
                }
            }
        } else {
            str = "timeout";
        }
        g5o0 g5o0VarN = NebulaRequest.n();
        g5o0VarN.s(j);
        g5o0VarN.r(x020Var.name());
        g5o0VarN.u();
        g5o0VarN.q(str);
        String message = exc.getMessage();
        if (message != null) {
            g5o0VarN.n(message);
        }
        ((lmw) this.b).w("NebulaRequest", ((NebulaRequest) g5o0VarN.build()).toByteArray());
    }

    public void d(sy21 sy21Var, quw0 quw0Var, x020 x020Var, long j) {
        long serializedSize;
        int i;
        String strF;
        uz21 uz21Var = sy21Var.c;
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        Long lValueOf = Long.valueOf(j);
        ry21 ry21Var = sy21Var.a;
        int i2 = ry21Var.d;
        utw0Var.o("Nebula responded in %d ms with code %d", new Object[]{lValueOf, Integer.valueOf(i2)});
        g5o0 g5o0VarN = NebulaRequest.n();
        g5o0VarN.s(j);
        g5o0VarN.r(x020Var.name());
        g5o0VarN.u();
        g5o0VarN.v(i2);
        GetAttributesResponse getAttributesResponse = (GetAttributesResponse) sy21Var.b;
        if (getAttributesResponse != null) {
            serializedSize = getAttributesResponse.getSerializedSize();
        } else {
            serializedSize = 0;
            if (uz21Var != null) {
                long jD = uz21Var.d();
                if (jD >= 0) {
                    serializedSize = jD;
                }
            }
        }
        g5o0VarN.t(serializedSize);
        if (!quw0Var.equals(sa20.e1)) {
            if (quw0Var instanceof puw0) {
                String strV = z0o1.v(((puw0) quw0Var).a);
                if (strV != null) {
                    g5o0VarN.n(strV);
                }
            } else if (quw0Var instanceof ouw0) {
                g5o0VarN.q("no_product_state");
                String strV2 = z0o1.v(((ouw0) quw0Var).a);
                if (strV2 == null) {
                    strV2 = "Nebula response contains no Product State";
                }
                g5o0VarN.n(strV2);
            } else {
                if (!quw0Var.equals(a020.e1)) {
                    eg.o();
                    return;
                }
                if (ry21Var.Q0) {
                    g5o0VarN.q("invalid_nebula_payload");
                    g5o0VarN.n("Body is null");
                } else {
                    if (i2 == 404) {
                        i = 7;
                    } else if (i2 == 408 || i2 == 504) {
                        i = 2;
                    } else if (i2 >= 500) {
                        i = 6;
                    } else {
                        i = i2 >= 400 ? 5 : 1;
                    }
                    g5o0VarN.q(zjy.i(i));
                    String strC = ry21Var.f.c("grpc-message");
                    if (strC == null) {
                        strC = null;
                        if (uz21Var != null && (strF = uz21Var.f()) != null && !strF.equals("")) {
                            strC = strF;
                        }
                        if (strC == null) {
                            strC = ry21Var.c;
                        }
                    }
                    g5o0VarN.n(strC);
                }
            }
        }
        ((lmw) this.b).w("NebulaRequest", ((NebulaRequest) g5o0VarN.build()).toByteArray());
    }

    public void f(kas0 kas0Var) {
        ((las0) this.b).a.onNext(kas0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object g(u771 u771Var, p371 p371Var, g471 g471Var, ela1 ela1Var, String str, z771 z771Var, onm onmVar) {
        sjs0 sjs0Var;
        yy61 yy61Var;
        if (onmVar instanceof sjs0) {
            sjs0Var = (sjs0) onmVar;
            int i = sjs0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjs0Var.c = i - Integer.MIN_VALUE;
            } else {
                sjs0Var = new sjs0(this, onmVar);
            }
        } else {
            sjs0Var = new sjs0(this, onmVar);
        }
        sjs0 sjs0Var2 = sjs0Var;
        Object objM = sjs0Var2.a;
        int i2 = sjs0Var2.c;
        if (i2 == 0) {
            hm5.M(objM);
            c9 c9VarB = g471Var.b();
            yy61 yy61Var2 = yy61.c;
            yy61 yy61Var3 = yy61.d;
            yy61 yy61Var4 = yy61.e;
            yy61 yy61Var5 = yy61.f;
            yy61 yy61Var6 = yy61.b;
            yy61 yy61Var7 = yy61.g;
            if (c9VarB == null || !c9VarB.isEmpty()) {
                ListIterator listIterator = c9VarB.listIterator(0);
                while (listIterator.hasNext()) {
                    yy61 yy61Var8 = (yy61) listIterator.next();
                    if (p371Var instanceof g9c1) {
                        yy61Var = yy61Var5;
                    } else if (p371Var instanceof f9c1) {
                        yy61Var = yy61Var4;
                    } else if (p371Var instanceof h9c1) {
                        yy61Var = yy61Var7;
                    } else if (p371Var instanceof pz70) {
                        yy61Var = yy61Var3;
                    } else {
                        if (p371Var instanceof a6j0) {
                            String str2 = ((a6j0) p371Var).b;
                            if (str2 != null && !ihc1.y0(str2)) {
                                yy61Var = yy61Var2;
                            }
                        } else if (!(p371Var instanceof vkc0)) {
                            eg.o();
                            return null;
                        }
                        yy61Var = yy61Var6;
                    }
                    yy61Var8.getClass();
                    if (yy61Var8 == yy61Var || (yy61Var8 == yy61.h && yy61Var == yy61Var7)) {
                        ne neVar = (ne) this.b;
                        z771 z771Var2 = u771Var.a.b;
                        sjs0Var2.c = 1;
                        objM = neVar.M(g471Var, p371Var, ela1Var, z771Var2, str, z771Var, sjs0Var2);
                        d9n d9nVar = d9n.a;
                        if (objM == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
            }
            if (p371Var instanceof g9c1) {
                yy61Var2 = yy61Var5;
            } else if (p371Var instanceof f9c1) {
                yy61Var2 = yy61Var4;
            } else if (p371Var instanceof h9c1) {
                yy61Var2 = yy61Var7;
            } else if (p371Var instanceof pz70) {
                yy61Var2 = yy61Var3;
            } else {
                if (p371Var instanceof a6j0) {
                    String str3 = ((a6j0) p371Var).b;
                    if (str3 == null || ihc1.y0(str3)) {
                    }
                } else if (!(p371Var instanceof vkc0)) {
                    eg.o();
                    return null;
                }
                yy61Var2 = yy61Var6;
            }
            throw new IllegalArgumentException("Share capability [" + yy61Var2 + "] is not handled by " + g471Var);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objM);
        return ((ho71) objM).a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Comparable h(String str, onm onmVar) {
        v9v0 v9v0Var;
        String str2;
        if (onmVar instanceof v9v0) {
            v9v0Var = (v9v0) onmVar;
            int i = v9v0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9v0Var.c = i - Integer.MIN_VALUE;
            } else {
                v9v0Var = new v9v0(this, onmVar);
            }
        } else {
            v9v0Var = new v9v0(this, onmVar);
        }
        Object objA = v9v0Var.a;
        int i2 = v9v0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            u271 u271Var = (u271) this.b;
            v9v0Var.c = 1;
            objA = u271Var.a(str, v9v0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        d7u0 d7u0Var = (d7u0) objA;
        if (d7u0Var != null) {
            Iterator it = d7u0Var.b.iterator();
            while (it.hasNext()) {
                str2 = ((tqj1) it.next()).b.a;
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    if (str2 != null) {
                        return Uri.parse(wqn1.n(str2));
                    }
                }
            }
            str2 = null;
            if (str2 != null) {
                return Uri.parse(wqn1.n(str2));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    public boolean i() {
        boolean z;
        xun0 xun0VarH;
        String str;
        String str2;
        xun0 xun0VarM;
        xg30 xg30VarA;
        xg30 xg30VarA2;
        yun0 yun0Var = (yun0) this.b;
        ArrayDeque arrayDequeI = yun0Var.i();
        if (arrayDequeI == null || !arrayDequeI.isEmpty()) {
            Iterator it = arrayDequeI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    xun0VarH = yun0Var.h();
                    str = null;
                    if (xun0VarH != null || (xg30VarA2 = xun0VarH.a()) == null) {
                        str2 = null;
                    } else {
                        str2 = xg30VarA2.b;
                    }
                    if (u890.j(str2, "spotify:home")) {
                        xun0VarM = yun0Var.m();
                        if (xun0VarM != null && (xg30VarA = xun0VarM.a()) != null) {
                            str = xg30VarA.b;
                        }
                        if (u890.j(str, "spotify:home")) {
                            z = false;
                        }
                    }
                } else if (u890.j(((q0a) it.next()).b.b, "spotify:home")) {
                }
                z = true;
            }
        } else {
            xun0VarH = yun0Var.h();
            str = null;
            if (xun0VarH != null) {
                str2 = null;
            } else {
                str2 = null;
            }
            if (u890.j(str2, "spotify:home")) {
                xun0VarM = yun0Var.m();
                if (xun0VarM != null) {
                    str = xg30VarA.b;
                }
                if (u890.j(str, "spotify:home")) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        return !z;
    }

    public boolean test(Object obj) {
        return ((pqq0) obj) == ((pqq0) ((g2z) this.b).b);
    }

    public void v(Object obj) {
        xfx0 xfx0Var = (xfx0) obj;
        l0x0 l0x0Var = ((j2p0) this.b).X0;
        long j = xfx0Var.a;
        long j2 = xfx0Var.b;
        float f = xfx0Var.c;
        l0x0Var.getClass();
        Choreographer choreographer = (Choreographer) l0x0Var.c;
        long j3 = f == 0.0f ? j : j2;
        int i = (int) j2;
        ((ProgressBar) l0x0Var.b).setMax(i);
        if (f > 0.0f) {
            i = (int) (i / f);
        }
        int iMax = Math.max(i / 1080, 200);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        od5 od5Var = (od5) l0x0Var.d;
        if (od5Var != null) {
            choreographer.removeFrameCallback(od5Var);
            l0x0Var.d = null;
        }
        od5 od5Var2 = new od5(new cfx0(l0x0Var, jElapsedRealtime, f, j, j3, iMax), (byte) 1);
        l0x0Var.d = od5Var2;
        choreographer.postFrameCallback(od5Var2);
    }

    public /* synthetic */ ewn0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ ewn0() {
        this.a = (byte) 3;
    }
}
