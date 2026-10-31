package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.model.PlayerState;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListCommentsResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dg90 implements Producer, n490, Function, i931, com.spotify.mobius.functions.Function, qiw, Predicate {
    public final /* synthetic */ byte a;
    public final Object b;

    public dg90(byte b) {
        this.a = b;
        switch (b) {
            case 8:
                shg0 shg0Var = new shg0();
                this.b = shg0Var;
                if (!shg0Var.b) {
                    if (shg0Var.c) {
                        cmv0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    shg0Var.a();
                    shg0Var.c = true;
                    break;
                }
                break;
            default:
                this.b = b380.m();
                break;
        }
    }

    public int a(char[] cArr, int i, int i2) {
        return ((lne) this.b).c(cArr, i, i2);
    }

    public Object apply(Object obj) {
        p0b0 p0b0Var;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                li8 li8Var = (mi8) obj;
                wza0 wza0Var = (wza0) obj2;
                idd1 idd1Var = wza0Var.n;
                if (!(li8Var instanceof li8)) {
                    Single singleJust = Single.just(j941.a);
                    singleJust.getClass();
                    return singleJust;
                }
                di8 di8Var = li8Var.a;
                String str = di8Var.a;
                SharedPreferences sharedPreferences = (SharedPreferences) idd1Var.getValue();
                p0b0 p0b0VarB = wza0Var.b(str, sharedPreferences != null ? sharedPreferences.getString(str, null) : null);
                if ((p0b0VarB != null ? p0b0VarB.c : null) == null) {
                    if (p0b0VarB == null) {
                        p0b0VarB = new p0b0(di8Var, (Long) null, 62);
                    }
                    Single map = wza0Var.e(p0b0VarB).map(new fey(p0b0VarB, wza0Var));
                    map.getClass();
                    return map;
                }
                SharedPreferences sharedPreferences2 = (SharedPreferences) idd1Var.getValue();
                p0b0 p0b0VarB2 = wza0Var.b(str, sharedPreferences2 != null ? sharedPreferences2.getString(str, null) : null);
                long jB = wza0Var.b.b();
                if (p0b0VarB2 != null) {
                    wd wdVar = di8Var.b;
                    if (wdVar == null) {
                        wdVar = p0b0VarB2.a.b;
                    }
                    p0b0Var = p0b0.a(p0b0VarB2, di8.a(di8Var, wdVar), Long.valueOf(jB), 30);
                } else {
                    p0b0Var = new p0b0(di8Var, Long.valueOf(jB), 24);
                }
                Single singleFlatMap = Single.just(wza0Var.f(p0b0Var)).flatMap(new x390(wza0Var, li8Var, (byte) 13));
                singleFlatMap.getClass();
                return singleFlatMap;
            case 5:
                String strE = ((odb0) obj2).d.a.e(ndb0.b, (String) null);
                return strE == null ? "" : strE;
            case 6:
            case 8:
            case 9:
            case 12:
            case 16:
            case 17:
            case 18:
            case 21:
            case 22:
            case 23:
            case 25:
            default:
                wv00 wv00Var = (uv00) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (mmr0 mmr0Var : ((g4r) obj2).a) {
                    String str2 = (String) mmr0Var.a;
                    Class cls = (Class) mmr0Var.b;
                    hoj0 hoj0VarL = k1u.l(wv00Var.a(cls, str2), wv00Var.f);
                    if (hoj0VarL != null) {
                        Object linkedHashMap2 = linkedHashMap.get(str2);
                        if (linkedHashMap2 == null) {
                            linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap.put(str2, linkedHashMap2);
                        }
                        ((Map) linkedHashMap2).put(cls, hoj0VarL);
                    }
                }
                return new mjj0(new ioj0(sqg0.U(linkedHashMap)));
            case 7:
                return ((q3c0) obj2).a.c().y(PlayerState.EMPTY);
            case 10:
                ru9 ru9Var = (ru9) obj2;
                return ((wp20) ru9Var.b).M((Context) ru9Var.d);
            case 11:
                return new FlowableOnBackpressureLatest(Flowable.G(0L, 1L, TimeUnit.SECONDS, ((ppd0) obj2).e)).J(new jpa0((Long) obj, (byte) 8));
            case 13:
                ListCommentsResponse listCommentsResponse = (ListCommentsResponse) obj;
                return new foh(new ijh(listCommentsResponse.o(), new uge1(listCommentsResponse.p()), 1, listCommentsResponse.n(), listCommentsResponse.getNextPageToken(), ((enh) obj2).b));
            case 14:
                g101 g101Var = (g101) obj;
                zd1 zd1Var = (zd1) obj2;
                return rqt0.F(o6x.a, new q4d0(zd1Var, g101Var, (lnm) null, (byte) 22)).onErrorReturn(new fad0(zd1Var, g101Var, (byte) 6));
            case 15:
                r5h r5hVar = ((s5e0) obj2).a;
                e3h e3hVarP = CollectionDecorateRequest.p();
                e3hVarP.n(((zzv0) obj).d);
                e3hVarP.y(s5e0.b);
                return r5hVar.e(e3hVarP.build()).map(xj20.X).onErrorReturn(yj20.t).map(zj20.t);
            case 19:
                return new jjf0(true, ((bif0) obj2).a);
            case 20:
                return ((gqb0) obj2).d((hkg0) obj);
            case 24:
                nki0 nki0Var = (nki0) obj;
                gj10 gj10Var = ((rki0) obj2).a;
                String str3 = nki0Var.b;
                boolean z = nki0Var.c;
                return gj10.k(gj10Var, str3, (String) null, (String) null, (Boolean) null, (Boolean) null, Boolean.valueOf(z), 30).d(Observable.just(new bli0(z))).onErrorReturn(new jpa0(nki0Var, (byte) 20));
            case 26:
                osj0 osj0Var = (osj0) obj;
                return Flowable.I(osj0Var.a).r(osj0Var.b == 0 ? 0L : 100L, (Scheduler) ((bjx) obj2).d);
        }
    }

    public void b() {
        shg0 shg0Var = (shg0) this.b;
        shg0Var.b = true;
        shg0Var.a = false;
        shg0Var.a();
    }

    public void c() {
        shg0 shg0Var = (shg0) this.b;
        if (shg0Var.b) {
            return;
        }
        if (shg0Var.c) {
            cmv0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        shg0Var.a();
        shg0Var.c = true;
    }

    public mr20 d() {
        return (mr20) ((idd1) this.b).getValue();
    }

    public y490 e() {
        return (y490) this.b;
    }

    public PlaybackStateCompat f() {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        a aVar = (a) this.b;
        MediaSessionCompat.Token token = aVar.e;
        if (token.a() != null) {
            try {
                return token.a().getPlaybackState();
            } catch (RemoteException unused) {
            }
        }
        PlaybackState playbackState = aVar.a.getPlaybackState();
        if (playbackState == null) {
            return null;
        }
        List listJ = l5u0.j(playbackState);
        if (listJ != null) {
            ArrayList arrayList2 = new ArrayList(listJ.size());
            for (Object obj : listJ) {
                if (obj != null) {
                    PlaybackState.CustomAction customAction2 = (PlaybackState.CustomAction) obj;
                    Bundle bundleL = l5u0.l(customAction2);
                    eyh0.b(bundleL);
                    customAction = new PlaybackStateCompat.CustomAction(l5u0.f(customAction2), l5u0.o(customAction2), l5u0.m(customAction2), bundleL);
                    customAction.e = customAction2;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle bundleA = m5u0.a(playbackState);
        eyh0.b(bundleA);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(l5u0.r(playbackState), l5u0.q(playbackState), l5u0.i(playbackState), l5u0.p(playbackState), l5u0.g(playbackState), 0, l5u0.k(playbackState), l5u0.n(playbackState), arrayList, l5u0.h(playbackState), bundleA);
        playbackStateCompat.Y = playbackState;
        return playbackStateCompat;
    }

    public ArrayList g() {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSession.QueueItem> queue = ((a) this.b).a.getQueue();
        if (queue == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(queue.size());
        for (MediaSession.QueueItem queueItem2 : queue) {
            if (queueItem2 != null) {
                MediaSession.QueueItem queueItem3 = queueItem2;
                queueItem = new MediaSessionCompat.QueueItem(queueItem3, MediaDescriptionCompat.a(dyh0.b(queueItem3)), dyh0.c(queueItem3));
            } else {
                queueItem = null;
            }
            arrayList.add(queueItem);
        }
        return arrayList;
    }

    public Object get() {
        return new DispatcherWorker(((vz90) this.b).b);
    }

    public Double h() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    public Boolean i() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public jfv j() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new jfv(fdg1.k0(bundle.getInt("firebase_sessions_sessions_restart_timeout"), ngv.e));
        }
        return null;
    }

    public MediaSessionCompat.Token k() {
        return ((y490) this.b).a();
    }

    public boolean l() {
        shg0 shg0Var = (shg0) this.b;
        return shg0Var.a && !shg0Var.c;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public Object m(o571 o571Var, List list, Uri uri, Uri uri2, b0a b0aVar, onm onmVar) {
        yjc0 yjc0Var;
        pz9 pz9Var;
        String str;
        if (onmVar instanceof yjc0) {
            yjc0Var = (yjc0) onmVar;
            int i = yjc0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yjc0Var.d = i - Integer.MIN_VALUE;
            } else {
                yjc0Var = new yjc0(this, onmVar);
            }
        } else {
            yjc0Var = new yjc0(this, onmVar);
        }
        Object obj = yjc0Var.b;
        int i2 = yjc0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            pz9 pz9Var2 = b0aVar.f;
            if (pz9Var2 != null) {
                p471 p471Var = p471.d;
                Object obj2 = d9n.a;
                if (o571Var == p471Var) {
                    yjc0Var.a = pz9Var2;
                    yjc0Var.d = 1;
                    Object objP = p(uri, uri2, yjc0Var);
                    if (objP != obj2) {
                        obj = objP;
                        pz9Var = pz9Var2;
                        str = (String) obj;
                        if (str != null) {
                            return new bkc0(str, pz9Var.b, pz9Var.c, pz9Var.d, pz9Var.e, pz9Var.f);
                        }
                    }
                } else {
                    if (aq8.B(list)) {
                        pz9Var = pz9Var2;
                        str = null;
                    } else {
                        yjc0Var.a = pz9Var2;
                        yjc0Var.d = 2;
                        Object objO = o(pz9Var2, uri, uri2, yjc0Var);
                        if (objO != obj2) {
                            obj = objO;
                            pz9Var = pz9Var2;
                            str = (String) obj;
                        }
                    }
                    if (str != null) {
                        return new bkc0(str, pz9Var.b, pz9Var.c, pz9Var.d, pz9Var.e, pz9Var.f);
                    }
                }
                return obj2;
            }
        } else if (i2 == 1) {
            pz9Var = yjc0Var.a;
            hm5.M(obj);
            str = (String) obj;
            if (str != null) {
                return new bkc0(str, pz9Var.b, pz9Var.c, pz9Var.d, pz9Var.e, pz9Var.f);
            }
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pz9Var = yjc0Var.a;
            hm5.M(obj);
            str = (String) obj;
            if (str != null) {
                return new bkc0(str, pz9Var.b, pz9Var.c, pz9Var.d, pz9Var.e, pz9Var.f);
            }
        }
        return null;
    }

    public ryk0 n() {
        return new ryk0((r6h1) this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r9 == r13) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(p.pz9 r10, android.net.Uri r11, android.net.Uri r12, p.onm r13) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            r3 = r0
            p.k3i0 r3 = (p.k3i0) r3
            boolean r0 = r13 instanceof p.zjc0
            if (r0 == 0) goto L18
            r0 = r13
            p.zjc0 r0 = (p.zjc0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r1 & r2
            if (r4 == 0) goto L18
            int r1 = r1 - r2
            r0.c = r1
            goto L1d
        L18:
            p.zjc0 r0 = new p.zjc0
            r0.<init>(r9, r13)
        L1d:
            java.lang.Object r9 = r0.a
            int r13 = r0.c
            r1 = 2
            r2 = 1
            r8 = 0
            if (r13 == 0) goto L38
            if (r13 == r2) goto L34
            if (r13 != r1) goto L2e
            p.hm5.M(r9)
            goto L87
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r8
        L34:
            p.hm5.M(r9)
            goto L64
        L38:
            p.hm5.M(r9)
            p.vz9 r9 = r10.a
            p.rz9 r10 = p.rz9.a
            boolean r10 = p.u890.j(r9, r10)
            p.d9n r13 = p.d9n.a
            if (r10 == 0) goto L68
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            r0.c = r2
            if (r11 == 0) goto L5e
            if (r12 == 0) goto L5e
            p.ae1 r1 = new p.ae1
            r6 = 0
            r7 = 15
            r5 = r11
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r11 = p.smo1.s(r1, r0)
            goto L60
        L5e:
            r5 = r11
            r11 = r5
        L60:
            if (r11 != r13) goto L63
            goto L86
        L63:
            r9 = r11
        L64:
            r12 = r9
            android.net.Uri r12 = (android.net.Uri) r12
            goto La3
        L68:
            r5 = r11
            r2 = r12
            p.sz9 r10 = p.sz9.a
            boolean r10 = p.u890.j(r9, r10)
            if (r10 == 0) goto L8d
            if (r5 == 0) goto L8b
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG
            r0.c = r1
            p.uaw0 r1 = new p.uaw0
            r6 = 0
            r4 = 20
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r9 = p.smo1.s(r1, r0)
            if (r9 != r13) goto L87
        L86:
            return r13
        L87:
            r12 = r9
            android.net.Uri r12 = (android.net.Uri) r12
            goto La3
        L8b:
            r12 = r8
            goto La3
        L8d:
            p.tz9 r10 = p.tz9.a
            boolean r10 = p.u890.j(r9, r10)
            if (r10 == 0) goto L97
            r12 = r2
            goto La3
        L97:
            boolean r10 = r9 instanceof p.uz9
            if (r10 == 0) goto Lab
            p.uz9 r9 = (p.uz9) r9
            java.lang.String r9 = r9.a
            android.net.Uri r12 = android.net.Uri.parse(r9)
        La3:
            if (r12 == 0) goto Laa
            java.lang.String r9 = r12.toString()
            return r9
        Laa:
            return r8
        Lab:
            p.eg.o()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dg90.o(p.pz9, android.net.Uri, android.net.Uri, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(Uri uri, Uri uri2, onm onmVar) {
        akc0 akc0Var;
        if (onmVar instanceof akc0) {
            akc0Var = (akc0) onmVar;
            int i = akc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                akc0Var.c = i - Integer.MIN_VALUE;
            } else {
                akc0Var = new akc0(this, onmVar);
            }
        } else {
            akc0Var = new akc0(this, onmVar);
        }
        Object obj = akc0Var.a;
        int i2 = akc0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            akc0Var.c = 1;
            Object objS = (uri == null || uri2 == null) ? uri : smo1.s(new ae1(uri2, (k3i0) this.b, Bitmap.CompressFormat.PNG, uri, (lnm) null, (byte) 15), akc0Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            obj = objS;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        Uri uri3 = (Uri) obj;
        if (uri3 != null) {
            return uri3.toString();
        }
        return null;
    }

    public void q() {
        shg0 shg0Var = (shg0) this.b;
        if (shg0Var.b) {
            return;
        }
        if (!shg0Var.c) {
            cmv0.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
        }
        if (!shg0Var.d.i()) {
            cmv0.a("Attempted to start retaining exited values with pending exited values");
        }
        shg0Var.c = false;
    }

    public boolean test(Object obj) {
        return u890.j(((mmr0) obj).a, (pta) this.b);
    }

    public void v(Object obj) {
        MessageInputView.y((MessageInputView) this.b, (String) ((spq0) obj).h());
    }

    public /* synthetic */ dg90(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public dg90(g0l g0lVar) {
        this.a = (byte) 0;
        this.b = new idd1(new x680(g0lVar, this, (byte) 10));
    }

    public dg90(Context context) {
        this.a = (byte) 16;
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public /* synthetic */ dg90(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public dg90(FileInputStream fileInputStream) {
        this.a = (byte) 2;
        this.b = new lne(fileInputStream, nne.a);
    }

    public dg90(Context context, eyh0 eyh0Var) {
        this.a = (byte) 22;
        MediaSessionCompat.Token token = ((yxh0) eyh0Var.b).c;
        if (token != null) {
            Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new vkh0(context, token);
                return;
            } else {
                this.b = new a(context, token);
                return;
            }
        }
        hhg1.n("sessionToken must not be null");
        throw null;
    }
}
