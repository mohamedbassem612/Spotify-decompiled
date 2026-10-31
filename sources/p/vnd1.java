package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.cosmos.util.proto.TrackArtistMetadata;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.messages.UbiProd1Impression;
import com.spotify.pending_events.esperanto.proto.ReplacePendingEventResponse;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vnd1 implements Function, pqw, mc41, m381 {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public vnd1(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                bpb1 bpb1VarB = gio1.b(w7x.a);
                this.c = bpb1VarB;
                this.b = d5p1.h(bpb1VarB);
                break;
            default:
                this.c = new ConcurrentHashMap();
                this.b = new ConcurrentHashMap();
                break;
        }
    }

    public void a(Function0 function0, iu30 iu30Var) {
        j7g1 j7g1Var = (j7g1) this.b;
        if (j7g1Var != null) {
            ((m7g1) j7g1Var).c = true;
            faa0 faa0Var = ((m7g1) j7g1Var).b;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
        }
        long j = jfv.f(0L, 0L) ? ((o7g1) this.c).c : 0L;
        o7g1 o7g1Var = (o7g1) this.c;
        mr20 mr20VarU = rqt0.u((mr20) function0.invoke());
        o7g1Var.getClass();
        w0h1.o(1, iu30Var);
        j7g1 j7g1Var2 = new j7g1(mr20VarU, iu30Var, o7g1Var.a(j) + o7g1Var.j);
        o7g1Var.b(j7g1Var2);
        this.b = j7g1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:122:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:123:0x040c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0417  */
    /* JADX WARN: Code duplicated, block: B:126:0x0432  */
    /* JADX WARN: Code duplicated, block: B:129:0x0445  */
    /* JADX WARN: Code duplicated, block: B:130:0x0450  */
    /* JADX WARN: Code duplicated, block: B:133:0x047f  */
    /* JADX WARN: Code duplicated, block: B:134:0x049d  */
    /* JADX WARN: Code duplicated, block: B:140:0x04de  */
    public Object apply(Object obj) {
        lnm lnmVar;
        Observable observableJust;
        vsf1 vsf1Var;
        o8n o8nVar;
        char c;
        rsf1 rsf1Var;
        o8n o8nVar2;
        Observable observableJust2;
        String link;
        huz huzVarG;
        lnm lnmVar2;
        huz huzVarU;
        Observable observableJust3;
        rsf1 rsf1Var2;
        String str;
        vsf1 vsf1Var2;
        o8n o8nVar3;
        CollectionTrack collectionTrack;
        char c2;
        Observable observableJust4;
        Observable observableJust5;
        boolean isLocal;
        z6x z6xVar;
        Observable observableJust6;
        Observable observableJust7;
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 7:
                return ((h691) ((im0) obj2).f).a((PlayerState) obj, (tv80) this.b);
            case 8:
                mmr0 mmr0Var = (mmr0) obj;
                dmf1 dmf1Var = (dmf1) this.b;
                CollectionTrack collectionTrack2 = (CollectionTrack) mmr0Var.a;
                lo7 lo7Var = (lo7) mmr0Var.b;
                rsf1 rsf1Var3 = (rsf1) obj2;
                idd1 idd1Var = rsf1Var3.f0;
                String strG = rsf1.g(collectionTrack2);
                if (strG == null || strG.length() == 0) {
                    Observable observableJust8 = Observable.just(new kjm((igm) null, (List) null, 7));
                    observableJust8.getClass();
                    return observableJust8;
                }
                String str2 = dmf1Var.c;
                String str3 = str2 == null ? "" : str2;
                Map map = dmf1Var.e;
                Map linkedHashMap = new LinkedHashMap();
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                lh7 lh7Var = (lh7) o7h.s0(lo7Var.a);
                if (lh7Var != null) {
                    linkedHashMap.put("audio_association", lh7Var.a);
                }
                Map map2 = !linkedHashMap.isEmpty() ? linkedHashMap : null;
                vsf1 vsf1Var3 = dmf1Var.d;
                lik1 lik1Var = dmf1Var.b;
                o8n o8nVar4 = rsf1Var3.Y;
                Set set = s4b1.f;
                blc0 blc0Var = uic.x(str3).c;
                boolean zF = rsf1.f(str3);
                Observable observableF = ((Observable) idd1Var.getValue()).switchMap(new ffe1(rsf1Var3, collectionTrack2.s().getLink(), (byte) 6)).replay(1).f();
                List artistList = collectionTrack2.s().getArtistList();
                List list = artistList;
                TrackArtistMetadata defaultInstance = (list == null || list.isEmpty()) ? TrackArtistMetadata.getDefaultInstance() : (TrackArtistMetadata) o7h.q0(artistList);
                boolean zF2 = rsf1.f(str3);
                o8n o8nVar5 = o6x.a;
                j5 j5Var = j5.a;
                if (zF2) {
                    lnmVar = null;
                    observableJust = rqt0.F(o8nVar5, new pec1(rsf1Var3, str3, (lnm) null, (byte) 23)).doOnError(iqa1.S0).map(p5x0.S0).toObservable();
                    observableJust.getClass();
                } else {
                    lnmVar = null;
                    observableJust = Observable.just(j5Var);
                    observableJust.getClass();
                }
                Observable observable = observableJust;
                String link2 = collectionTrack2.s().getLink();
                if (rsf1.f(str3)) {
                    lnm lnmVar3 = lnmVar;
                    vsf1Var = vsf1Var3;
                    o8nVar = o8nVar4;
                    rsf1Var = rsf1Var3;
                    o8nVar2 = o8nVar5;
                    c = 6;
                    observableJust2 = rqt0.F(o8nVar, new bfb1(rsf1Var, str3, link2, lnmVar3, (byte) 21)).flatMap(i5x0.R0).toObservable();
                    observableJust2.getClass();
                } else {
                    vsf1Var = vsf1Var3;
                    o8nVar = o8nVar4;
                    c = 6;
                    rsf1Var = rsf1Var3;
                    o8nVar2 = o8nVar5;
                    observableJust2 = Observable.just(j5Var);
                    observableJust2.getClass();
                }
                Observable observable2 = observableJust2;
                Observable observable3 = rsf1Var.i.g(collectionTrack2.s().getLink()).toObservable();
                Observable observable4 = rsf1Var.d0;
                Observable observableD = rsf1Var.d.d();
                sb40 sb40Var = rsf1Var.f;
                vsf1 vsf1Var4 = vsf1Var;
                Observable observableCombineLatest = Observable.combineLatest(observable4, observableD, sb40Var.b.f() ? sb40Var.c().map(ta20.d) : Observable.just(Boolean.FALSE), rsf1Var.e0, sb40Var.c().map(sa20.d), (Observable) idd1Var.getValue(), m9x0.T0);
                g7h g7hVar = rsf1Var.q;
                if (map2 == null || (link = (String) map2.get("save_track.uri")) == null) {
                    String str4 = map2 != null ? (String) map2.get("audio_association") : null;
                    link = str4 == null ? collectionTrack2.s().getLink() : str4;
                }
                Observable observableD2 = g7h.d(g7hVar, str3, new String[]{link});
                Observable observable5 = ((Single) rsf1Var.v.invoke(collectionTrack2.s().getLink(), str3)).toObservable();
                Observable observable6 = rsf1Var.B.b(collectionTrack2.s().getLink()).toObservable();
                Observable observableI = yoi1.i(rsf1Var.w.b(), o8nVar2);
                Observable observableI2 = yoi1.i(rsf1Var.F.a, o8nVar2);
                Boolean bool = Boolean.FALSE;
                Map map3 = map2;
                Observable observableOnErrorReturnItem = Observable.combineLatest(observableI2.onErrorReturnItem(bool), yoi1.i(rsf1Var.E.b, o8nVar2).onErrorReturnItem(bool), l9x0.T0).onErrorReturnItem(j5Var);
                g2z g2zVar = rsf1Var.A;
                String link3 = collectionTrack2.s().getLink();
                Map map4 = map3 == null ? b7x.a : map3;
                if (!nhc1.Y(link3, "spotify:local:", false)) {
                    ((upp0) g2zVar.d).getClass();
                    if (upp0.b(str3)) {
                        huzVarU = new huz(bool, (byte) 10);
                    } else {
                        lt0 lt0Var = new lt0(((ov20) g2zVar.a).c("streaming-rules", ""), (byte) 7);
                        ezc ezcVarB = ((rh11) g2zVar.c).b();
                        uop0 uop0Var = new uop0(yoi1.g(((xvo) g2zVar.b).a(true)), (byte) 27);
                        v5b1 v5b1Var = uic.x(str3).d;
                        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                            huzVarG = yoi1.g(((uu00) g2zVar.e).b(new oi("radio_eligibility", false, new q4z0(link3, (byte) 4))).filter(kcx0.d).map(new acn1(link3, (byte) 11)));
                        } else {
                            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                                huzVarG = yoi1.g(((uu00) g2zVar.e).b(new oi("radio_eligibility", false, new q4z0(link3, (byte) 4))).filter(kcx0.d).map(new acn1(link3, (byte) 11)));
                            } else {
                                huzVarG = new huz(bool, (byte) 10);
                            }
                        }
                        lnmVar2 = null;
                        huzVarU = rqt0.u(h5p1.r(lt0Var, ezcVarB, uop0Var, huzVarG, new woz0(g2zVar, map4, null)));
                    }
                    Observable observableI3 = yoi1.i(huzVarU, o8nVar2);
                    if (zF) {
                        observableJust3 = yoi1.i(new m441(new nsf1(rsf1Var, str3, lnmVar2)), o8nVar2);
                    } else {
                        observableJust3 = Observable.just(new cw8());
                    }
                    if (zF) {
                        str = str3;
                        vsf1Var2 = vsf1Var4;
                        o8nVar3 = o8nVar;
                        collectionTrack = collectionTrack2;
                        rsf1Var2 = rsf1Var;
                        c2 = 7;
                        observableJust4 = rqt0.F(o8nVar3, new nsf1(rsf1Var2, str, collectionTrack, vsf1Var2, (lnm) null, (byte) 0)).toObservable();
                    } else {
                        rsf1Var2 = rsf1Var;
                        str = str3;
                        vsf1Var2 = vsf1Var4;
                        o8nVar3 = o8nVar;
                        collectionTrack = collectionTrack2;
                        c2 = 7;
                        observableJust4 = Observable.just(j5Var);
                    }
                    observableJust4.getClass();
                    if (zF) {
                        observableJust5 = yoi1.i(rsf1Var2.W.a(str), o8nVar2);
                    } else {
                        observableJust5 = Observable.just(Boolean.TRUE);
                    }
                    Observable observableOnErrorReturnItem2 = yoi1.i(rsf1Var2.G.b, o8nVar2).onErrorReturnItem(u9p0.a);
                    char c3 = c2;
                    Observable observableSwitchMap = observableF.switchMap(new lvc1(rsf1Var2, str, collectionTrack, (byte) 19));
                    isLocal = collectionTrack.s().getIsLocal();
                    z6xVar = z6x.a;
                    if (isLocal) {
                        collectionTrack.s().getLink();
                        String str5 = vsf1Var2.b;
                        collectionTrack.s().getName();
                        observableJust6 = yoi1.i(new huz(z6xVar, (byte) 10), o8nVar2);
                    } else {
                        observableJust6 = Observable.just(z6xVar);
                    }
                    Observable observable7 = observableJust6;
                    if (rsf1Var2.b0.a(new m9d0[]{sc41.b, sc41.n}) || !collectionTrack.s().getIsLocal()) {
                        observableJust7 = Observable.just(j5Var);
                    } else {
                        observableJust7 = yoi1.i(o4p1.r(new m441(new bfb1(rsf1Var2, collectionTrack, (lnm) null, (byte) 20)), o8nVar3), o8nVar2);
                    }
                    Observable[] observableArr = new Observable[18];
                    observableArr[0] = observable;
                    observableArr[1] = observable2;
                    observableArr[2] = observable3;
                    observableArr[3] = observableCombineLatest;
                    observableArr[4] = observableD2;
                    observableArr[5] = observable5;
                    observableArr[c] = observable6;
                    observableArr[c3] = observableI;
                    observableArr[8] = observableF;
                    observableArr[9] = observableOnErrorReturnItem;
                    observableArr[10] = observableI3;
                    observableArr[11] = observableJust3;
                    observableArr[12] = observableJust4;
                    observableArr[13] = observableJust5;
                    observableArr[14] = observableOnErrorReturnItem2;
                    observableArr[15] = observableSwitchMap;
                    observableArr[16] = observable7;
                    observableArr[17] = observableJust7;
                    return Observable.combineLatest(p7h.M(observableArr), new ywv0(rsf1Var2, str, blc0Var, collectionTrack, artistList, defaultInstance, map3, vsf1Var2, lik1Var));
                }
                huzVarU = new huz(bool, (byte) 10);
                observable2 = observable2;
                lnmVar2 = null;
                Observable observableI4 = yoi1.i(huzVarU, o8nVar2);
                if (zF) {
                    observableJust3 = yoi1.i(new m441(new nsf1(rsf1Var, str3, lnmVar2)), o8nVar2);
                } else {
                    observableJust3 = Observable.just(new cw8());
                }
                if (zF) {
                    str = str3;
                    vsf1Var2 = vsf1Var4;
                    o8nVar3 = o8nVar;
                    collectionTrack = collectionTrack2;
                    rsf1Var2 = rsf1Var;
                    c2 = 7;
                    observableJust4 = rqt0.F(o8nVar3, new nsf1(rsf1Var2, str, collectionTrack, vsf1Var2, (lnm) null, (byte) 0)).toObservable();
                } else {
                    rsf1Var2 = rsf1Var;
                    str = str3;
                    vsf1Var2 = vsf1Var4;
                    o8nVar3 = o8nVar;
                    collectionTrack = collectionTrack2;
                    c2 = 7;
                    observableJust4 = Observable.just(j5Var);
                }
                observableJust4.getClass();
                if (zF) {
                    observableJust5 = yoi1.i(rsf1Var2.W.a(str), o8nVar2);
                } else {
                    observableJust5 = Observable.just(Boolean.TRUE);
                }
                Observable observableOnErrorReturnItem3 = yoi1.i(rsf1Var2.G.b, o8nVar2).onErrorReturnItem(u9p0.a);
                char c4 = c2;
                Observable observableSwitchMap2 = observableF.switchMap(new lvc1(rsf1Var2, str, collectionTrack, (byte) 19));
                isLocal = collectionTrack.s().getIsLocal();
                z6xVar = z6x.a;
                if (isLocal) {
                    collectionTrack.s().getLink();
                    String str6 = vsf1Var2.b;
                    collectionTrack.s().getName();
                    observableJust6 = yoi1.i(new huz(z6xVar, (byte) 10), o8nVar2);
                } else {
                    observableJust6 = Observable.just(z6xVar);
                }
                Observable observable8 = observableJust6;
                if (rsf1Var2.b0.a(new m9d0[]{sc41.b, sc41.n})) {
                    observableJust7 = Observable.just(j5Var);
                } else {
                    observableJust7 = Observable.just(j5Var);
                }
                Observable[] observableArr2 = new Observable[18];
                observableArr2[0] = observable;
                observableArr2[1] = observable2;
                observableArr2[2] = observable3;
                observableArr2[3] = observableCombineLatest;
                observableArr2[4] = observableD2;
                observableArr2[5] = observable5;
                observableArr2[c] = observable6;
                observableArr2[c4] = observableI;
                observableArr2[8] = observableF;
                observableArr2[9] = observableOnErrorReturnItem;
                observableArr2[10] = observableI4;
                observableArr2[11] = observableJust3;
                observableArr2[12] = observableJust4;
                observableArr2[13] = observableJust5;
                observableArr2[14] = observableOnErrorReturnItem3;
                observableArr2[15] = observableSwitchMap2;
                observableArr2[16] = observable8;
                observableArr2[17] = observableJust7;
                return Observable.combineLatest(p7h.M(observableArr2), new ywv0(rsf1Var2, str, blc0Var, collectionTrack, artistList, defaultInstance, map3, vsf1Var2, lik1Var));
            case 9:
                return ((mtf1) obj2).d.a((PlayerState) obj, (tv80) this.b);
            case 10:
                g7t g7tVar = (g7t) obj2;
                me20 me20Var = (me20) this.b;
                return ((uny) ((yfu) g7tVar.c).c).l(me20Var.a).map(mgx0.S0).flatMap(new lvc1(me20Var, g7tVar, (spq0) obj, (byte) 21));
            case 11:
                mmr0 mmr0Var2 = (mmr0) obj;
                qwf1 qwf1Var = (qwf1) this.b;
                s4b1 s4b1Var = (s4b1) obj2;
                Boolean bool2 = (Boolean) mmr0Var2.a;
                if (!((Boolean) mmr0Var2.b).booleanValue() && !s4b1Var.u() && !bool2.booleanValue()) {
                    return qwf1Var.f(s4b1Var);
                }
                Uri uri = s4b1Var.a;
                String queryParameter = uri != null ? uri.getQueryParameter("context") : null;
                if (queryParameter == null || queryParameter.length() == 0) {
                    return qwf1Var.c(s4b1Var).map(a2x0.U0).timeout(10L, TimeUnit.SECONDS, qwf1Var.b).onErrorResumeNext(w1x0.Y0).map(y1x0.T0);
                }
                s4b1 s4b1VarG = s4b1Var.g();
                return (s4b1VarG == null || s4b1VarG.c == blc0.o6) ? Single.just(new ern0(s4b1Var)) : Single.just(new ern0(s4b1VarG));
            default:
                ReplacePendingEventResponse replacePendingEventResponse = (ReplacePendingEventResponse) obj;
                if (!replacePendingEventResponse.o()) {
                    return Single.error(new c9h1("Can't replace pending event", replacePendingEventResponse.n()));
                }
                b9h1 b9h1Var = (b9h1) obj2;
                return Single.just(new b9h1(b9h1Var.a, (UbiProd1Impression) this.b, b9h1Var.c));
        }
    }

    public o3r b() {
        return (o3r) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r10 == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (r10 == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r10 != null) goto L35;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0090 -> B:34:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r8, p.lhg1 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.rig1
            if (r0 == 0) goto L13
            r0 = r10
            p.rig1 r0 = (p.rig1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.rig1 r0 = new p.rig1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L33
            int r8 = r0.d
            java.util.Iterator r9 = r0.c
            p.lhg1 r1 = r0.b
            java.lang.String r6 = r0.a
            p.hm5.M(r10)
            goto L93
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L3a:
            p.lhg1 r9 = r0.b
            java.lang.String r8 = r0.a
            p.hm5.M(r10)
            goto L56
        L42:
            p.hm5.M(r10)
            p.ruq0 r10 = r9.b
            java.lang.String r10 = r10.a
            r0.a = r8
            r0.b = r9
            r0.g = r3
            java.lang.Object r10 = r7.h(r8, r10, r0)
            if (r10 != r5) goto L56
            goto L92
        L56:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L5d
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L5d:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r1 = r10 instanceof java.util.Collection
            if (r1 == 0) goto L6e
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L6e
        L6c:
            r3 = r4
            goto L95
        L6e:
            java.util.Iterator r10 = r10.iterator()
            r6 = r8
            r1 = r9
            r9 = r10
            r8 = r4
        L76:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L6c
            java.lang.Object r10 = r9.next()
            p.vrc0 r10 = (p.vrc0) r10
            r0.a = r6
            r0.b = r1
            r0.c = r9
            r0.d = r8
            r0.g = r2
            java.lang.Object r10 = r7.s(r6, r10, r1, r0)
            if (r10 != r5) goto L93
        L92:
            return r5
        L93:
            if (r10 == 0) goto L76
        L95:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vnd1.c(java.lang.String, p.lhg1, p.onm):java.lang.Object");
    }

    public void cancel() {
        j7g1 j7g1Var = (j7g1) this.b;
        if (j7g1Var != null) {
            ((m7g1) j7g1Var).c = true;
            faa0 faa0Var = ((m7g1) j7g1Var).b;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
        }
    }

    public Bundle d(Object obj) {
        return ((mc41) this.c).d(obj);
    }

    public Object e(Bundle bundle, Object obj) {
        return ((mc41) this.c).e(bundle, ((iu30) this.b).invoke(obj));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(int i, String str, onm onmVar) {
        sig1 sig1Var;
        if (onmVar instanceof sig1) {
            sig1Var = (sig1) onmVar;
            int i2 = sig1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sig1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                sig1Var = new sig1(this, onmVar);
            }
        } else {
            sig1Var = new sig1(this, onmVar);
        }
        Object objI = sig1Var.a;
        int i3 = sig1Var.c;
        if (i3 == 0) {
            hm5.M(objI);
            qvc0 qvc0Var = new qvc0(str, (c3d0) null, (Set) null, new iqz0(i, 2), 6);
            rsc0 rsc0Var = (xrc0) this.c;
            sig1Var.c = 1;
            objI = rsc0Var.i(qvc0Var, sig1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        oy21 oy21Var = (py21) objI;
        if (oy21Var instanceof oy21) {
            return (List) oy21Var.a;
        }
        if (oy21Var instanceof ly21) {
            return null;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r12 == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r12 == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009a -> B:29:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.lang.String r10, p.lhg1 r11, p.onm r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p.tig1
            if (r0 == 0) goto L13
            r0 = r12
            p.tig1 r0 = (p.tig1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            p.tig1 r0 = new p.tig1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.h
            int r1 = r0.t
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L41
            if (r1 != r2) goto L3a
            int r10 = r0.g
            int r11 = r0.f
            int r1 = r0.e
            java.util.Iterator r3 = r0.d
            java.util.Collection r5 = r0.c
            java.util.Collection r5 = (java.util.Collection) r5
            p.lhg1 r6 = r0.b
            java.lang.String r7 = r0.a
            p.hm5.M(r12)
            goto L9d
        L3a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            r9 = 0
            return r9
        L41:
            p.lhg1 r11 = r0.b
            java.lang.String r10 = r0.a
            p.hm5.M(r12)
            goto L5d
        L49:
            p.hm5.M(r12)
            p.ruq0 r12 = r11.b
            java.lang.String r12 = r12.a
            r0.a = r10
            r0.b = r11
            r0.t = r3
            java.lang.Object r12 = r9.h(r10, r12, r0)
            if (r12 != r4) goto L5d
            goto L9c
        L5d:
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L64
            p.z6x r9 = p.z6x.a
            return r9
        L64:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r12.iterator()
            r3 = 0
            r7 = r10
            r6 = r11
            r5 = r1
            r10 = r3
            r11 = r10
            r1 = r11
            r3 = r12
        L77:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto La5
            java.lang.Object r12 = r3.next()
            p.vrc0 r12 = (p.vrc0) r12
            r0.a = r7
            r0.b = r6
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            r0.c = r8
            r0.d = r3
            r0.e = r1
            r0.f = r11
            r0.g = r10
            r0.t = r2
            java.lang.Object r12 = r9.s(r7, r12, r6, r0)
            if (r12 != r4) goto L9d
        L9c:
            return r4
        L9d:
            p.gjg1 r12 = (p.gjg1) r12
            if (r12 == 0) goto L77
            r5.add(r12)
            goto L77
        La5:
            java.util.List r5 = (java.util.List) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vnd1.g(java.lang.String, p.lhg1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, String str2, onm onmVar) {
        uig1 uig1Var;
        if (onmVar instanceof uig1) {
            uig1Var = (uig1) onmVar;
            int i = uig1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uig1Var.c = i - Integer.MIN_VALUE;
            } else {
                uig1Var = new uig1(this, onmVar);
            }
        } else {
            uig1Var = new uig1(this, onmVar);
        }
        Object objH = uig1Var.a;
        int i2 = uig1Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            rsc0 rsc0Var = (xrc0) this.c;
            uig1Var.c = 1;
            rsc0 rsc0Var2 = rsc0Var;
            objH = c921.H(rsc0Var2.c, new asc0(rsc0Var2, str, str2, (lnm) null, (byte) 1), uig1Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        oy21 oy21Var = (py21) objH;
        if (oy21Var != null) {
            if (oy21Var instanceof oy21) {
                return (List) oy21Var.a;
            }
            if (!(oy21Var instanceof ly21)) {
                eg.o();
                return null;
            }
        }
        return null;
    }

    public gmh1 i(o8a0 o8a0Var) {
        gmh1 gmh1VarA;
        qx81 qx81Var = o8a0Var.f;
        return (qx81Var == null || (gmh1VarA = rzn1.A(qx81Var)) == null) ? (wjz) ((idd1) this.c).getValue() : gmh1VarA;
    }

    public a8b0 j(y0h1 y0h1Var, o8a0 o8a0Var) {
        return (a8b0) ((qoe0) this.b).invoke(new d1h1(y0h1Var, o8a0Var));
    }

    public String k(x9p1 x9p1Var) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        y6h1 y6h1Var = ((txk0) this.c).b;
        boolean z = x9p1Var instanceof ykp0;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("switch_network_nudge", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA = x6h1VarC2.a();
            String str = ((ykp0) x9p1Var).c;
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            if (str == null) {
                str = "";
            }
            w7h1Var2 = new w7h1("", "", z7h1Var, new x7h1("disconnect_from_remote_device", 1, Collections.singletonMap("remote_device_id", str)), y6h1VarA, r6h1.c, System.currentTimeMillis());
        } else {
            if (x9p1Var instanceof zkp0) {
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("switch_network_nudge", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                w7h1Var = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("no_action", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            } else {
                if (!(x9p1Var instanceof xkp0)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC4 = y6h1Var.c();
                x6h1VarC4.i.add(new a7h1("switch_network_nudge", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            }
            w7h1Var2 = w7h1Var;
        }
        return ((i8h1) this.b).m(w7h1Var2, (xj61) null).a.a;
    }

    public void l() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((hxk0) this.c).a.c();
        x6h1VarC.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 m(String str) {
        i8h1 i8h1Var = (i8h1) ((ynb0) this.b).get();
        g5l0 g5l0Var = (g5l0) this.c;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("live_room_dialog", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, g5l0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public void n() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((hxk0) this.c).a.c();
        x6h1VarC.i.add(new a7h1("dismiss_area", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void o() {
        ((i8h1) this.b).f(((hxk0) this.c).e(), (Set) null);
    }

    public void p() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((pdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("invite_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void q(String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((xok0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("topup_details_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        qxc0 qxc0Var = ((ach1) obj).a;
        return qxc0Var != null && ((pch1) ((ech1) this.b).b.get()).b.g(o4o1.u(qxc0Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0129, code lost:
    
        if (r9.S0 == r6.S0) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s(java.lang.String r7, p.vrc0 r8, p.lhg1 r9, p.onm r10) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vnd1.s(java.lang.String, p.vrc0, p.lhg1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.a(r3, r1) == r6) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object t(p.onm r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.a4q0 r0 = (p.a4q0) r0
            boolean r1 = r8 instanceof p.gug1
            if (r1 == 0) goto L17
            r1 = r8
            p.gug1 r1 = (p.gug1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            p.gug1 r1 = new p.gug1
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.b
            int r2 = r1.d
            p.gtg1 r3 = p.gtg1.t
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L30
            p.hm5.M(r8)
            goto L6b
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L37:
            int r2 = r1.a
            p.hm5.M(r8)
            goto L4c
        L3d:
            p.hm5.M(r8)
            r2 = 0
            r1.a = r2
            r1.d = r5
            java.lang.Object r8 = r0.d(r3, r1)
            if (r8 != r6) goto L4c
            goto L6a
        L4c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6b
            java.lang.Object r7 = r7.b
            p.drj0 r7 = (p.drj0) r7
            p.ppg1 r8 = p.ppg1.X0
            boolean r7 = r7.m(r5, r8)
            if (r7 == 0) goto L6b
            r1.a = r2
            r1.d = r4
            java.lang.Object r7 = r0.a(r3, r1)
            if (r7 != r6) goto L6b
        L6a:
            return r6
        L6b:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vnd1.t(p.onm):java.lang.Object");
    }

    public void u(String str, double d, long j) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Object copyOnWriteArrayList = concurrentHashMap.get(str);
        if (copyOnWriteArrayList == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (copyOnWriteArrayList = new CopyOnWriteArrayList()))) != null) {
            copyOnWriteArrayList = objPutIfAbsent;
        }
        ((CopyOnWriteArrayList) copyOnWriteArrayList).add(new dpj0(d, j));
    }

    public void v(oqj0 oqj0Var) {
        ((ConcurrentHashMap) this.b).remove(oqj0Var);
    }

    public void w(Map map, o8n o8nVar) {
        x0e1 x0e1Var = new x0e1(map, this, (byte) 9);
        if (o8nVar != null) {
            fn31.T(smo1.e(flo1.l(guo1.B(), o8nVar)), (o8n) null, 0, new vbc1(x0e1Var, (lnm) null, (byte) 3), 3);
        } else {
            x0e1Var.invoke();
        }
    }

    public void x(View view, b3j0 b3j0Var) {
        byte b = 0;
        dm5.z(((jj11) this.b) != null, "Cannot show tinkerbell without a configuration");
        TooltipContainer tooltipContainer = (TooltipContainer) this.c;
        boolean z = tooltipContainer.d;
        if (z) {
            jj11 jj11Var = (jj11) this.b;
            a6f1 a6f1Var = tooltipContainer.a;
            if (tooltipContainer.e == view && !z) {
                a6f1Var.getLayoutParams().width = jj11Var.g() ? -1 : -2;
                a6f1Var.requestLayout();
                tooltipContainer.f(view, jj11Var);
                return;
            }
            d3j0 d3j0Var = new d3j0(b3j0Var, x2j0.a);
            esa1 esa1Var = tooltipContainer.t;
            if (esa1Var == null) {
                tooltipContainer.d(view, jj11Var, d3j0Var);
                return;
            }
            qd4 qd4Var = new qd4(tooltipContainer, view, jj11Var, d3j0Var, (byte) 7);
            iac0 iac0VarH = x9p1.h(view);
            if (iac0VarH == null) {
                return;
            }
            gaa0 gaa0VarF = op71.f();
            y22 y22Var = new y22(gaa0VarF, (byte) 20);
            j4f1 j4f1Var = new j4f1(gaa0VarF, b);
            int i = TooltipContainer.P0;
            jj11Var.a(new e4f1(j4f1Var, (byte) 1));
            fn31.S(zso1.H(iac0VarH.getLifecycle()), gaa0VarF, 1, new bj81((byte) 10, view, y22Var, esa1Var, d3j0Var, qd4Var, (lnm) null));
        }
    }

    public xj61 y(l1h1 l1h1Var, List list, o8a0 o8a0Var) {
        gmh1 gmh1VarZ;
        j1h1 j1h1Var = l1h1Var.a;
        xj61 xj61Var = new xj61();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            a8b0 a8b0Var = (a8b0) it.next();
            y0h1 y0h1VarS = a8b0Var.t0().s();
            if (y0h1VarS instanceof beg) {
                Set set = o8a0Var.e;
                dq20 dq20VarW0 = a8b0Var.w0();
                if (dq20VarW0 instanceof dq20) {
                    dq20 dq20Var = dq20VarW0;
                    qx81 qx81VarZ = dq20Var.b;
                    if (!qx81VarZ.t0().getParameters().isEmpty() && qx81VarZ.t0().s() != null) {
                        List<y0h1> parameters = qx81VarZ.t0().getParameters();
                        ArrayList arrayList = new ArrayList(q7h.U(parameters, 10));
                        for (y0h1 y0h1Var : parameters) {
                            phb1 phb1Var = (e1h1) o7h.t0(y0h1Var.getIndex(), a8b0Var.r0());
                            boolean z = set != null && set.contains(y0h1Var);
                            if (phb1Var == null || z || j1h1Var.d(phb1Var.b()) == null) {
                                phb1Var = new phb1(y0h1Var);
                            }
                            arrayList.add(phb1Var);
                        }
                        qx81VarZ = jzn1.z(qx81VarZ, arrayList, (e0h1) null, 2);
                    }
                    qx81 qx81VarZ2 = dq20Var.c;
                    if (!qx81VarZ2.t0().getParameters().isEmpty() && qx81VarZ2.t0().s() != null) {
                        List<y0h1> parameters2 = qx81VarZ2.t0().getParameters();
                        ArrayList arrayList2 = new ArrayList(q7h.U(parameters2, 10));
                        for (y0h1 y0h1Var2 : parameters2) {
                            phb1 phb1Var2 = (e1h1) o7h.t0(y0h1Var2.getIndex(), a8b0Var.r0());
                            boolean z2 = set != null && set.contains(y0h1Var2);
                            if (phb1Var2 == null || z2 || j1h1Var.d(phb1Var2.b()) == null) {
                                phb1Var2 = new phb1(y0h1Var2);
                            }
                            arrayList2.add(phb1Var2);
                        }
                        qx81VarZ2 = jzn1.z(qx81VarZ2, arrayList2, (e0h1) null, 2);
                    }
                    gmh1VarZ = y3o1.Z(qx81VarZ, qx81VarZ2);
                } else {
                    if (!(dq20VarW0 instanceof qx81)) {
                        eg.o();
                        return null;
                    }
                    gmh1 gmh1Var = (qx81) dq20VarW0;
                    if (gmh1Var.t0().getParameters().isEmpty() || gmh1Var.t0().s() == null) {
                        gmh1VarZ = gmh1Var;
                    } else {
                        List<y0h1> parameters3 = gmh1Var.t0().getParameters();
                        ArrayList arrayList3 = new ArrayList(q7h.U(parameters3, 10));
                        for (y0h1 y0h1Var3 : parameters3) {
                            phb1 phb1Var3 = (e1h1) o7h.t0(y0h1Var3.getIndex(), a8b0Var.r0());
                            boolean z3 = set != null && set.contains(y0h1Var3);
                            if (phb1Var3 == null || z3 || j1h1Var.d(phb1Var3.b()) == null) {
                                phb1Var3 = new phb1(y0h1Var3);
                            }
                            arrayList3.add(phb1Var3);
                        }
                        gmh1VarZ = jzn1.z(gmh1Var, arrayList3, (e0h1) null, 2);
                    }
                }
                xj61Var.add(l1h1Var.f(3, vzn1.q(gmh1VarZ, vzn1.l(dq20VarW0))));
            } else if (y0h1VarS instanceof y0h1) {
                Set set2 = o8a0Var.e;
                if (set2 == null || !set2.contains(y0h1VarS)) {
                    xj61Var.addAll(y(l1h1Var, y0h1VarS.getUpperBounds(), o8a0Var));
                } else {
                    xj61Var.add(i(o8a0Var));
                }
            }
        }
        return cwl1.j(xj61Var);
    }

    public /* synthetic */ vnd1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public vnd1(a4q0 a4q0Var, drj0 drj0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 17;
        this.c = a4q0Var;
        this.b = drj0Var;
    }

    public vnd1(i8h1 i8h1Var, fjl0 fjl0Var) {
        this.a = (byte) 19;
        this.b = i8h1Var;
        this.c = fjl0Var;
    }

    public vnd1(eoc eocVar) {
        this.a = (byte) 18;
        voe0 voe0Var = new voe0("Type parameter upper bound erasure results");
        this.c = new idd1(new jqb0(this, (byte) 24));
        this.b = voe0Var.a(new gqb0(this, (byte) 20));
    }

    public vnd1(i8h1 i8h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.b = i8h1Var;
                this.c = new brl0((byte) 17);
                break;
            default:
                this.b = i8h1Var;
                this.c = new hxk0();
                break;
        }
    }

    public /* synthetic */ vnd1(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    public vnd1(Context context, ViewGroup viewGroup) {
        this.a = (byte) 2;
        View viewInflate = LayoutInflater.from(context).inflate(2131626082, viewGroup, false);
        this.c = viewInflate;
        this.b = viewInflate.findViewById(2131429772);
    }

    public vnd1(ech1 ech1Var) {
        this.a = (byte) 27;
        this.b = ech1Var;
        this.c = w3p1.o(new l4r(pwc0.b, 2, hzg1.f, new j4r(new cch1(ech1Var, (byte) 0)), hzg1.g), hzg1.e);
    }
}
