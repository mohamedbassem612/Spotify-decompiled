package p;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.spotify.base.java.logging.Logger;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.musicvideos.musicvideowidget.proto.v1.TrackRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class kqi0 implements Function, zso0 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public kqi0(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                String string = UUID.randomUUID().toString();
                rhc rhcVar = new rhc(string.getBytes(nne.a));
                rhcVar.c = string;
                this.b = rhcVar;
                this.d = kwm0.e;
                this.c = new ArrayList();
                break;
        }
    }

    public boolean A(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            if (((qti0) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void B(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((qti0) it.next()).b(menu);
        }
    }

    public Object C(String str, tv80 tv80Var, v4e0 v4e0Var) {
        f1n0 f1n0Var = (f1n0) this.d;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
            if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                ncn0.d(s4b1VarX, " URI is not supported, only Playlist URIs are supported.");
                return null;
            }
        }
        dwn0 dwn0Var = new dwn0("spotify:internal:playlist-mixing-extended-versions:".concat(s4b1VarX.h()), "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0(tv80Var));
        boolean zJ = f1n0Var.a.j((Activity) this.b);
        d9n d9nVar = d9n.a;
        if (zJ) {
            Object objD = f1n0.d(f1n0Var, dwn0Var, v4e0Var);
            if (objD == d9nVar) {
                return objD;
            }
        } else {
            b1r0 b1r0Var = (b1r0) this.c;
            ou80 ou80Var = tv80Var.a;
            Object objA = b1r0.a(b1r0Var, dwn0Var.a, ou80Var != null ? ou80Var.a : null, (Bundle) null, v4e0Var, 12);
            if (objA == d9nVar) {
                return objA;
            }
        }
        return rih1.a;
    }

    public void D(qti0 qti0Var) {
        ((CopyOnWriteArrayList) this.d).remove(qti0Var);
        qsi0 qsi0Var = (qsi0) ((HashMap) this.c).remove(qti0Var);
        if (qsi0Var != null) {
            qsi0Var.a.d(qsi0Var.b);
            qsi0Var.b = null;
        }
        ((Runnable) this.b).run();
    }

    public uhd E(g030 g030Var) {
        zwg zwgVar = (zwg) this.d;
        zao0 zao0Var = new zao0();
        zao0Var.a = g030Var;
        return zwgVar.c(zao0Var, (qga0) this.c);
    }

    public void F(r8i0 r8i0Var) {
        if (r8i0Var.b.equals("multipart")) {
            this.d = r8i0Var;
        } else {
            bhn0.s(r8i0Var, "multipart != ");
        }
    }

    public void a(qti0 qti0Var) {
        ((CopyOnWriteArrayList) this.d).add(qti0Var);
        ((Runnable) this.b).run();
    }

    public Object apply(Object obj) {
        LinkedHashMap linkedHashMap;
        String strUid;
        switch (this.a) {
            case 5:
                xu00 xu00Var = (xu00) obj;
                sjj0 sjj0Var = (sjj0) this.b;
                Map map = xu00Var.a;
                List list = (List) map.get(gh3.class);
                LinkedHashMap linkedHashMap2 = b7x.a;
                if (list != null) {
                    List<vu00> list2 = list;
                    int iS = zno1.s(q7h.U(list2, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iS);
                    for (vu00 vu00Var : list2) {
                        String str = vu00Var.a;
                        gh3 gh3Var = vu00Var.b;
                        if (gh3Var == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.albumv4.AlbumV4");
                            return null;
                        }
                        linkedHashMap.put(str, gh3Var);
                    }
                } else {
                    linkedHashMap = linkedHashMap2;
                }
                List list3 = (List) map.get(z1g1.class);
                if (list3 != null) {
                    List<vu00> list4 = list3;
                    int iS2 = zno1.s(q7h.U(list4, 10));
                    linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                    for (vu00 vu00Var2 : list4) {
                        String str2 = vu00Var2.a;
                        z1g1 z1g1Var = vu00Var2.b;
                        if (z1g1Var == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.trackv4.TrackV4");
                            return null;
                        }
                        linkedHashMap2.put(str2, z1g1Var);
                    }
                }
                Single singleSingleOrError = sjj0Var.b.b("audio-preview-url-template").take(1L).singleOrError();
                f8b f8bVar = sjj0Var.c;
                ArrayList arrayListN0 = o7h.N0((ArrayList) this.c, (ArrayList) this.d);
                Collection collectionValues = linkedHashMap2.values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    r7h.W(((z1g1) it.next()).g, arrayList);
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((s1g1) it2.next()).a);
                }
                ArrayList arrayListN1 = o7h.N0(arrayList2, arrayListN0);
                Collection collectionValues2 = linkedHashMap.values();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = collectionValues2.iterator();
                while (it3.hasNext()) {
                    r7h.W(((gh3) it3.next()).d, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((dh3) it4.next()).a);
                }
                Single singleFirstOrError = f8bVar.a(o7h.N0(arrayList4, arrayListN1)).firstOrError();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((z1g1) entry.getValue()).f) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                return Single.zip(singleSingleOrError, singleFirstOrError, rqt0.F(igu.b, new d7i0(sjj0Var, o7h.l1(linkedHashMap3.keySet()), (lnm) null, (byte) 11)), new upa0(xu00Var, (byte) 24));
            case 14:
                ContextTrack contextTrack = (ContextTrack) this.d;
                if (!((z7n0) obj).a) {
                    MaybeEmpty maybeEmpty = MaybeEmpty.a;
                    maybeEmpty.getClass();
                    return maybeEmpty;
                }
                phi0 phi0Var = (phi0) this.b;
                String strUri = contextTrack.uri();
                String str3 = "";
                if (strUri == null) {
                    strUri = "";
                }
                String strA0 = l4o1.a0(contextTrack, "artist_uri");
                if (strA0 == null) {
                    strA0 = "";
                }
                String str4 = (String) contextTrack.metadata().get("media.type");
                ContextTrack contextTrack2 = u890.j(str4 != null ? str4.toLowerCase(Locale.ROOT) : null, "video") ? contextTrack : null;
                if (contextTrack2 != null && (strUid = contextTrack2.uid()) != null) {
                    str3 = strUid;
                }
                boolean z = ((ocn0) this.c).b;
                boolean zX = l4o1.X(contextTrack);
                s8n0 s8n0Var = (s8n0) phi0Var.b;
                mwf1 mwf1VarN = TrackRequest.n();
                mwf1VarN.r(strUri);
                mwf1VarN.n(strA0);
                mwf1VarN.s(str3);
                mwf1VarN.q(z);
                return s8n0Var.a(mwf1VarN.build()).flatMapMaybe(new jqd0(zX, strUri, phi0Var, (byte) 5));
            default:
                String string = ((Context) this.b).getString(2131962662);
                boolean z2 = ((kuo0) obj).a;
                kt91 kt91Var = (kt91) this.d;
                return z2 ? new CompletableAndThenCompletable(Completable.u(1000L, TimeUnit.MILLISECONDS, (Scheduler) this.c), new CompletableFromAction(new tt60(kt91Var, string, (byte) 9))).w() : new CompletableFromAction(new tt60(kt91Var, string, (byte) 9)).w();
        }
    }

    public void b(qti0 qti0Var, iac0 iac0Var) {
        a(qti0Var);
        x8c0 lifecycle = iac0Var.getLifecycle();
        HashMap map = (HashMap) this.c;
        qsi0 qsi0Var = (qsi0) map.remove(qti0Var);
        if (qsi0Var != null) {
            qsi0Var.a.d(qsi0Var.b);
            qsi0Var.b = null;
        }
        map.put(qti0Var, new qsi0(lifecycle, new zzh(this, qti0Var, (byte) 3)));
    }

    public void c(int i) {
        int iC = l1d.C(i);
        if (iC != 0) {
            byte b = 1;
            if (iC == 1 || iC == 2) {
                fn31.T((u9c0) this.b, null, 0, new kvo0(this, null, b), 3);
            } else {
                eg.o();
            }
        }
    }

    public void d(v360 v360Var, tn21 tn21Var) {
        if (v360Var.c("Content-Type") != null) {
            hhg1.n("Unexpected header: Content-Type");
        } else if (v360Var.c("Content-Length") == null) {
            f(new jwm0(v360Var, tn21Var));
        } else {
            hhg1.n("Unexpected header: Content-Length");
        }
    }

    public void f(jwm0 jwm0Var) {
        ((ArrayList) this.c).add(jwm0Var);
    }

    public kwm0 g() {
        ArrayList arrayList = (ArrayList) this.c;
        if (!arrayList.isEmpty()) {
            return new kwm0((rhc) this.b, (r8i0) this.d, z4n1.j(arrayList));
        }
        eg.m("Multipart body must have at least one part.");
        return null;
    }

    public List h(String str, String str2, String str3, who0 who0Var) {
        jhm jhmVarC;
        boolean z = who0Var.g;
        kpm kpmVar = who0Var.e;
        String str4 = who0Var.b;
        List list = who0Var.c;
        if (str4 != null && z) {
            jhmVarC = ((ruc0) this.d).c(str, str4, str2, str3, !list.isEmpty());
        } else if (!list.isEmpty()) {
            jhmVarC = ((ne) this.c).n(str, list, str2, str3);
        } else {
            if (!z || kpmVar == null || !kpmVar.a || !who0Var.d || !who0Var.f) {
                return z6x.a;
            }
            jhmVarC = ((ifl1) this.b).c(str, str2, str3);
        }
        return Collections.singletonList(jhmVarC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(boolean z, onm onmVar) {
        w4o0 w4o0Var;
        if (onmVar instanceof w4o0) {
            w4o0Var = (w4o0) onmVar;
            int i = w4o0Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                w4o0Var.d = i - os00.INVALID_ID;
            } else {
                w4o0Var = new w4o0(this, onmVar);
            }
        } else {
            w4o0Var = new w4o0(this, onmVar);
        }
        Object objP = w4o0Var.b;
        int i2 = w4o0Var.d;
        boolean z2 = true;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objP);
            if (Build.VERSION.SDK_INT < 31) {
                return Boolean.FALSE;
            }
            if (z) {
                w4o0Var.a = z;
                w4o0Var.d = 1;
                objP = p(w4o0Var);
                if (objP != obj) {
                }
            }
            if (z) {
                eg.o();
                return null;
            }
            return Boolean.valueOf(z2);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objP);
                return objP;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = w4o0Var.a;
        hm5.M(objP);
        if (!((Boolean) objP).booleanValue()) {
            z2 = false;
            return Boolean.valueOf(z2);
        }
        w4o0Var.a = z;
        w4o0Var.d = 2;
        Object objO = o(w4o0Var);
        return objO == obj ? obj : objO;
    }

    public Notification j() {
        Context context = (Context) this.b;
        dko0 dko0Var = new dko0(context, "spotify_updates_channel");
        dko0Var.g = (PendingIntent) ((xs80) this.d).d.getValue();
        Notification notification = dko0Var.D;
        notification.icon = 2131233418;
        dko0Var.j(context.getString(2131959195));
        dko0Var.v = 1;
        notification.vibrate = new long[]{0};
        dko0Var.j = -1;
        dko0Var.u = context.getColor(2131102443);
        ((zo5) this.c).a(AppLifecycleServicePendingIntent.PLAYBACK_NOTIFICATION_CLOSE, new Bundle());
        dko0Var.r(new jko0());
        return dko0Var.c();
    }

    public jhm k(ugo0 ugo0Var) {
        return new jhm("explicit_feedback_not_interested", itx.c, (fhm) null, 2131956587, (String) null, false, (tm81) null, new ihm(new ygm(3), hhm.b, new ghm(qfo0.f, new lgo0(ugo0Var, (byte) 0)), new j9n0(ugo0Var, this, (byte) 16)), 244);
    }

    public boolean l() {
        return ((zwg) this.d).r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r2 != 2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p.kxy0 m() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.d
            p.efp0 r0 = (p.efp0) r0
            p.dma1 r0 = r0.a
            java.lang.Object r1 = r2.b
            p.tym0 r1 = (p.tym0) r1
            java.lang.Object r2 = r2.c
            android.content.Context r2 = (android.content.Context) r2
            boolean r2 = r1.g(r2)
            if (r2 == 0) goto L17
            p.kxy0 r2 = p.kxy0.f
            return r2
        L17:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r2 >= r1) goto L1e
            goto L39
        L1e:
            p.bma1 r2 = p.efp0.b
            r1 = 0
            boolean r2 = r0.h(r2, r1)
            if (r2 == 0) goto L28
            goto L36
        L28:
            p.bma1 r2 = p.efp0.c
            int r2 = r0.l(r2, r1)
            if (r2 == 0) goto L3f
            r0 = 1
            if (r2 == r0) goto L3c
            r0 = 2
            if (r2 == r0) goto L39
        L36:
            p.kxy0 r2 = p.kxy0.b
            return r2
        L39:
            p.kxy0 r2 = p.kxy0.e
            return r2
        L3c:
            p.kxy0 r2 = p.kxy0.d
            return r2
        L3f:
            p.kxy0 r2 = p.kxy0.c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kqi0.m():p.kxy0");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object n(Uri uri, onm onmVar) {
        ymn0 ymn0Var;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        Uri uri5;
        if (onmVar instanceof ymn0) {
            ymn0Var = (ymn0) onmVar;
            int i = ymn0Var.e;
            if ((i & os00.INVALID_ID) != 0) {
                ymn0Var.e = i - os00.INVALID_ID;
            } else {
                ymn0Var = new ymn0(this, onmVar);
            }
        } else {
            ymn0Var = new ymn0(this, onmVar);
        }
        Object obj = ymn0Var.c;
        int i2 = ymn0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            Objects.toString(uri);
            String string = uri.toString();
            int iV0 = ihc1.v0(string, '?', 0, 6);
            if (iV0 >= 0) {
                Uri uri6 = Uri.parse(string.substring(0, iV0));
                uri6.getClass();
                uri2 = uri6;
            } else {
                uri2 = uri;
            }
            try {
                Uri uri7 = ((w911) this.c).b;
                String string2 = uri7 != null ? uri7.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                CompletableCreate completableCreateD = j2h1.D(o6x.a, new bj81((byte) 4, (vna1) this.b, uri2, "smartphone", (Object) null, new VoiceAssistantLoggingContext(string2, uri2.toString(), (String) null, (String) null, 12, (DefaultConstructorMarker) null), (lnm) null));
                uri3 = uri;
                try {
                    ymn0Var.a = uri3;
                    ymn0Var.b = uri2;
                    ymn0Var.e = 1;
                    Object objI = fc11.i(completableCreateD, ymn0Var);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                    uri4 = uri3;
                    uri5 = uri2;
                } catch (Exception e) {
                    e = e;
                    Logger.e(e, "Playback for " + uri3 + " failed: " + e.getMessage(), new Object[0]);
                    return new wr50(e);
                }
            } catch (Exception e2) {
                e = e2;
                uri3 = uri;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri5 = ymn0Var.b;
            uri4 = ymn0Var.a;
            try {
                hm5.M(obj);
            } catch (Exception e3) {
                e = e3;
                uri3 = uri4;
                Logger.e(e, "Playback for " + uri3 + " failed: " + e.getMessage(), new Object[0]);
                return new wr50(e);
            }
        }
        Objects.toString(uri5);
        ((qfl1) this.d).c(uri4);
        return xr50.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(onm onmVar) {
        x4o0 x4o0Var;
        if (onmVar instanceof x4o0) {
            x4o0Var = (x4o0) onmVar;
            int i = x4o0Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                x4o0Var.c = i - os00.INVALID_ID;
            } else {
                x4o0Var = new x4o0(this, onmVar);
            }
        } else {
            x4o0Var = new x4o0(this, onmVar);
        }
        Object objJ = x4o0Var.a;
        int i2 = x4o0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            v1o0 v1o0Var = (v1o0) this.b;
            Single map = v1o0Var.a().map(new fjb(v1o0Var, (byte) 17));
            x4o0Var.c = 1;
            objJ = fc11.j(map, x4o0Var);
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
        Integer num = (Integer) objJ;
        num.getClass();
        return Boolean.valueOf(!(num.intValue() >= ((h84) this.c).d()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(onm onmVar) {
        y4o0 y4o0Var;
        if (onmVar instanceof y4o0) {
            y4o0Var = (y4o0) onmVar;
            int i = y4o0Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                y4o0Var.c = i - os00.INVALID_ID;
            } else {
                y4o0Var = new y4o0(this, onmVar);
            }
        } else {
            y4o0Var = new y4o0(this, onmVar);
        }
        Object objJ = y4o0Var.a;
        int i2 = y4o0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single map = ((v1o0) this.b).a().map(kc20.Q0);
            y4o0Var.c = 1;
            objJ = fc11.j(map, y4o0Var);
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
        Long l = (Long) objJ;
        l.getClass();
        return Boolean.valueOf(!(((yqg) this.d).b() - l.longValue() < TimeUnit.MILLISECONDS.convert((long) ((h84) this.c).e(), TimeUnit.SECONDS)));
    }

    public tv80 q() {
        i8h1 i8h1Var = (i8h1) this.b;
        m1m0 m1m0Var = (m1m0) ((idd1) this.c).getValue();
        m1m0Var.getClass();
        x6h1 x6h1VarC = m1m0Var.a.c();
        x6h1VarC.i.add(new a7h1("success_modal_container", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 r() {
        i8h1 i8h1Var = (i8h1) this.b;
        m1m0 m1m0Var = (m1m0) ((idd1) this.c).getValue();
        m1m0Var.getClass();
        x6h1 x6h1VarC = m1m0Var.a.c();
        x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void s() {
        ((uj7) this.b).set(0);
        ((zwg) this.d).q(new g6f0((byte) 6));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Object t(Uri uri, tv80 tv80Var, onm onmVar) throws Throwable {
        waj0 waj0Var;
        Throwable th;
        boolean zBooleanValue;
        Exception exc;
        f8h1 f8h1Var;
        g7h1 g7h1Var = (g7h1) this.c;
        if (onmVar instanceof waj0) {
            waj0Var = (waj0) onmVar;
            int i = waj0Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                waj0Var.d = i - os00.INVALID_ID;
            } else {
                waj0Var = new waj0(this, onmVar);
            }
        } else {
            waj0Var = new waj0(this, onmVar);
        }
        waj0 waj0Var2 = waj0Var;
        Object obj = waj0Var2.b;
        int i2 = waj0Var2.d;
        bwn0 bwn0Var = null;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(obj);
                    agj0 agj0Var = (agj0) this.b;
                    if (tv80Var != null) {
                        agj0Var.getClass();
                        bwn0Var = new bwn0(tv80Var);
                    }
                    f8h1 f8h1VarA = agj0Var.a(uri, bwn0Var);
                    if (f8h1VarA == null) {
                        return Boolean.FALSE;
                    }
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    g7h1Var.a(yon1.G1("INAPPMESSAGE_EXTERNAL_WEB", "inappmessage/external-web", 832, "inappmessage"), uri.toString(), tv80Var);
                    try {
                        ldj0 ldj0Var = (ldj0) this.d;
                        try {
                            String string = f8h1VarA.a.toString();
                            waj0Var2.a = f8h1VarA;
                            waj0Var2.d = 1;
                            Object objC = ldj0Var.c(string, tv80Var, (Bundle) null, (kdj0) null, waj0Var2);
                            d9n d9nVar = d9n.a;
                            if (objC == d9nVar) {
                                return d9nVar;
                            }
                            obj = objC;
                            f8h1Var = f8h1VarA;
                        } catch (Exception e) {
                            exc = e;
                            f8h1Var = f8h1VarA;
                            Logger.e(exc, "Unable to launch external URL", new Object[0]);
                            zBooleanValue = false;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f8h1Var = waj0Var2.a;
                    try {
                        hm5.M(obj);
                    } catch (Exception e3) {
                        exc = e3;
                        Logger.e(exc, "Unable to launch external URL", new Object[0]);
                        zBooleanValue = false;
                    }
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    try {
                        f8h1Var.a();
                    } catch (Throwable th2) {
                        th = th2;
                        if (zBooleanValue) {
                            throw th;
                        }
                        g7h1Var.b.set(false);
                        throw th;
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                if (!zBooleanValue) {
                    g7h1Var.b.set(false);
                }
                return boolValueOf;
            } catch (Throwable th3) {
                th = th3;
                zBooleanValue = false;
            }
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    public String toString() {
        switch (this.a) {
            case 17:
                String str = (String) this.c;
                String str2 = (String) this.d;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Object u(n0o0 n0o0Var, r4o0 r4o0Var) {
        String str = nik1.k5.a;
        ser serVar = (ser) this.b;
        Parcelable h2o0Var = new h2o0(2131231039, n0o0Var.a, n0o0Var.c, n0o0Var.b);
        Bundle bundle = new Bundle();
        bundle.putParcelable("bluetooth.permission.info.bottom.sheet.args", h2o0Var);
        serVar.a((String) null, str, bundle);
        return rih1.a;
    }

    public Object v(p0o0 p0o0Var, boolean z, r4o0 r4o0Var) {
        String str = nik1.j5.a;
        ser serVar = (ser) this.b;
        p0o0Var.getClass();
        Parcelable q3o0Var = new q3o0(2131231039, p0o0Var.a, p0o0Var.b, z, p0o0Var.d);
        Bundle bundle = new Bundle();
        bundle.putParcelable("bluetooth.permission.request.bottom.sheet.args", q3o0Var);
        serVar.a((String) null, str, bundle);
        return rih1.a;
    }

    public Object w(r0o0 r0o0Var, boolean z, r4o0 r4o0Var) {
        Object objInvoke;
        dwn0 dwn0Var = new dwn0(nik1.i5.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, zvn0.a);
        ser serVar = (ser) this.b;
        int i = r0o0Var.a;
        String str = r0o0Var.b;
        List<q0o0> list = r0o0Var.c;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (q0o0 q0o0Var : list) {
            arrayList.add(new c4o0(q0o0Var.b, q0o0Var.c, q0o0Var.a));
        }
        Parcelable d4o0Var = new d4o0(i, str, arrayList, z, r0o0Var.e, r0o0Var.f);
        Bundle bundle = new Bundle();
        bundle.putParcelable("bluetooth.permission.request.full.screen.sheet.args", d4o0Var);
        Activity activityA = serVar.a.a();
        if (activityA != null) {
            activityA.runOnUiThread(new hw9(serVar, activityA, dwn0Var, bundle, (byte) 4));
        }
        iu30 iu30Var = r0o0Var.g;
        return (iu30Var == null || (objInvoke = iu30Var.invoke(r4o0Var)) != d9n.a) ? rih1.a : objInvoke;
    }

    public void x() {
        ((rfr) this.c).a();
    }

    public void y(Menu menu, MenuInflater menuInflater) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((qti0) it.next()).d(menu, menuInflater);
        }
    }

    public void z(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((qti0) it.next()).a(menu);
        }
    }

    public void e() {
    }

    public /* synthetic */ kqi0(z6k0 z6k0Var, koc0 koc0Var, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = koc0Var;
        this.d = obj;
        this.c = obj2;
    }

    public kqi0(i8h1 i8h1Var, sqi0 sqi0Var) {
        this.a = (byte) 0;
        this.b = i8h1Var;
        this.d = sqi0Var;
        this.c = new idd1(new z8i0(this, (byte) 10));
    }

    public kqi0(i8h1 i8h1Var, tri0 tri0Var) {
        this.a = (byte) 1;
        this.b = i8h1Var;
        this.d = tri0Var;
        this.c = new idd1(new z8i0(this, (byte) 11));
    }

    public kqi0(j311 j311Var) {
        this.a = (byte) 24;
        this.b = new uj7(0);
        this.d = new zwg((byte) 18);
        this.c = new qga0((Object) this, (Object) j311Var, (byte) 8);
    }

    public kqi0(Intent intent) {
        this.a = (byte) 17;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.b = data;
        this.d = action;
        this.c = type;
    }

    public kqi0(Runnable runnable) {
        this.a = (byte) 2;
        this.d = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.b = runnable;
    }

    public /* synthetic */ kqi0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
