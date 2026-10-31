package p;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.spotify.base.java.logging.Logger;
import com.spotify.culturalmoments.stories.v1.PlaylistStory;
import com.spotify.fandomcollectibles.protos.FreeAchievementCardStory;
import com.spotify.playlistmixing.proto.ExplicitFeedbackSubmission;
import com.spotify.playlistmixing.proto.PresentedTransition;
import com.spotify.smartshuffle.signalsimpl.proto.SignalPayloadProto$CurrentItem;
import com.spotify.smartshuffle.signalsimpl.proto.SignalPayloadProto$HistoryItem;
import com.spotify.smartshuffle.signalsimpl.proto.SignalPayloadProto$PlayHistory;
import com.spotify.smartshuffle.signalsimpl.proto.SignalPayloadProto$SignalPayload;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hp91 implements Function, l381, d5q0, m381, SingleTransformer, dec, ix30 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public hp91(teb1 teb1Var) {
        this.a = (byte) 15;
        this.c = teb1Var;
        this.b = w3p1.n(new l4r(pwc0.b, 1, seb1.c, new j4r(new reb1(teb1Var, (byte) 0)), seb1.d), new l4r(hvm.b, 2, rdb1.e1, new j4r(rdb1.d1), seb1.b), nva1.X);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(f1k0 f1k0Var, onm onmVar) {
        tmc1 tmc1Var;
        if (onmVar instanceof tmc1) {
            tmc1Var = (tmc1) onmVar;
            int i = tmc1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmc1Var.c = i - Integer.MIN_VALUE;
            } else {
                tmc1Var = new tmc1(this, onmVar);
            }
        } else {
            tmc1Var = new tmc1(this, onmVar);
        }
        tmc1 tmc1Var2 = tmc1Var;
        Object objT = tmc1Var2.a;
        int i2 = tmc1Var2.c;
        if (i2 == 0) {
            hm5.M(objT);
            List<sr10> list = f1k0Var.d;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (sr10 sr10Var : list) {
                n6w0 n6w0VarN = PresentedTransition.n();
                n6w0VarN.n(sr10Var.b);
                n6w0VarN.q(kkg1.c(sr10Var.c));
                arrayList.add(n6w0VarN.build());
            }
            is00 is00VarO = ExplicitFeedbackSubmission.o();
            is00VarO.r(f1k0Var.a);
            is00VarO.s(f1k0Var.b);
            is00VarO.q(f1k0Var.c);
            is00VarO.n(arrayList);
            ExplicitFeedbackSubmission explicitFeedbackSubmissionBuild = is00VarO.build();
            xyc0 xyc0Var = (iyc0) this.c;
            cbk0 cbk0Var = (cbk0) this.b;
            String str = cbk0Var.a;
            String str2 = cbk0Var.b.b;
            phc byteString = explicitFeedbackSubmissionBuild.toByteString();
            tmc1Var2.c = 1;
            objT = xyc0Var.t(str, str2, "explicit-feedback-submit", byteString, tmc1Var2);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        ly21 ly21Var = (py21) objT;
        if (ly21Var instanceof ly21) {
            Logger.k("Failed to submit transition feedback: %s", new Object[]{ly21Var.a});
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00d1  */
    public Object apply(Object obj) {
        mmr0 mmr0Var;
        switch (this.a) {
            case 0:
                jdu0 jdu0Var = (jdu0) obj;
                ip91 ip91Var = (ip91) this.c;
                List list = (List) this.b;
                if (!jdu0Var.j || jdu0Var.k) {
                    mmr0Var = new mmr0((Object) null, list);
                } else {
                    kkt0 kkt0Var = (kkt0) o7h.s0(list);
                    if (u890.j(kkt0Var != null ? kkt0Var.a : null, jdu0Var.d)) {
                        mmr0Var = new mmr0(o7h.s0(list), o7h.k0(list, 1));
                    } else {
                        mmr0Var = new mmr0((Object) null, list);
                    }
                }
                kkt0 kkt0Var2 = (kkt0) mmr0Var.a;
                List list2 = (List) mmr0Var.b;
                boolean zG = ((t35) ip91Var.c.a.get()).g();
                bm81 bm81VarN = SignalPayloadProto$SignalPayload.n();
                am81 am81VarO = SignalPayloadProto$PlayHistory.o();
                if (kkt0Var2 != null) {
                    yl81 yl81VarN = SignalPayloadProto$CurrentItem.n();
                    yl81VarN.t(kkt0Var2.b);
                    yl81VarN.n(ip91.m(kkt0Var2.a));
                    yl81VarN.q(kkt0Var2.c);
                    yl81VarN.r(kkt0Var2.d);
                    yl81VarN.s(kkt0Var2.e);
                    am81VarO.q((SignalPayloadProto$CurrentItem) yl81VarN.build());
                }
                List<kkt0> list3 = list2;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                for (kkt0 kkt0Var3 : list3) {
                    zl81 zl81VarN = SignalPayloadProto$HistoryItem.n();
                    zl81VarN.t(kkt0Var3.b);
                    zl81VarN.n(ip91.m(kkt0Var3.a));
                    zl81VarN.q(kkt0Var3.c);
                    zl81VarN.r(kkt0Var3.d);
                    zl81VarN.s(kkt0Var3.e);
                    arrayList.add((SignalPayloadProto$HistoryItem) zl81VarN.build());
                }
                am81VarO.n(arrayList);
                bm81VarN.q((SignalPayloadProto$PlayHistory) am81VarO.build());
                bm81VarN.n(zG);
                return (SignalPayloadProto$SignalPayload) bm81VarN.build();
            case 1:
            case 2:
            default:
                jac1 jac1Var = (jac1) obj;
                return new CompletableToSingle((Completable) ((l5b1) this.b).invoke(Integer.valueOf(jac1Var.c)), new aj91(jac1Var, (byte) 3), (Object) null).onErrorReturn(new esa1(jac1Var, (String) this.c, (byte) 12)).toObservable();
            case 3:
                Observable observable = (Observable) obj;
                return Observable.concat(observable.take(1L), observable.buffer(((no4) ((b0a0) this.b).a.get()).c0(), TimeUnit.SECONDS, (Scheduler) this.c).filter(hgx0.P0).map(mgx0.O0));
            case 4:
                return Collections.singletonMap(((sp01) this.c).d.a, new sda(new ivd((List) obj, false, (el51) null, w7x.a, new r87(31)).n((List) this.b)));
        }
    }

    public o3r b() {
        switch (this.a) {
            case 6:
                break;
        }
        return (o3r) this.b;
    }

    public Single c(Single single) {
        sjb1 sjb1Var = (sjb1) this.b;
        pjb1 pjb1Var = (pjb1) this.c;
        return single.doOnSuccess(new rjb1(sjb1Var, pjb1Var, (byte) 0)).doOnError(new rjb1(sjb1Var, pjb1Var, (byte) 1));
    }

    public void d() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    public void e() {
        fvc1 fvc1Var = (fvc1) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet = fvc1Var.d;
        kwc1 kwc1Var = (kwc1) this.c;
        copyOnWriteArraySet.remove(kwc1Var);
        faa0 faa0Var = (faa0) fvc1Var.e.remove(new lwc1(kwc1Var.e()));
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        muc1 muc1Var = fvc1Var.a;
        c921.y(muc1Var.c, (o8n) null, 0, new ku91((Object) null, muc1Var, kwc1Var, (lnm) null, (byte) 9), 3);
    }

    public void f(q881 q881Var, Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 19:
                g8c1 g8c1Var = (g8c1) this.b;
                lzn0 lzn0Var = g8c1Var.b;
                PlaylistStory playlistStory = (PlaylistStory) this.c;
                String playlistUri = playlistStory.getPlaylistUri();
                yt91 yt91Var = g8c1Var.d;
                String strR = playlistStory.o().r();
                String playlistUri2 = playlistStory.getPlaylistUri();
                i8h1 i8h1Var = (i8h1) yt91Var.b;
                x6h1 x6h1VarC = ((yok0) yt91Var.d).b.c();
                x6h1VarC.i.add(new a7h1("story_container", strR, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("playlist_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                lzn0Var.a(playlistUri, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", playlistUri2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                break;
            default:
                f8c1 f8c1Var = (f8c1) this.b;
                hp91 hp91Var = f8c1Var.d;
                FreeAchievementCardStory freeAchievementCardStory = (FreeAchievementCardStory) this.c;
                String uri = freeAchievementCardStory.D().getUri();
                i8h1 i8h1Var2 = (i8h1) hp91Var.b;
                x6h1 x6h1VarC3 = ((txk0) hp91Var.c).b.c();
                x6h1VarC3.i.add(new a7h1("story_container", "", (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("free_scene_upsell_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                f8c1Var.b.f(new dwn0(freeAchievementCardStory.D().getUri(), "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                break;
        }
    }

    public void g(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void h() {
        long jA = ((yqg) this.b).a();
        Iterator it = ((LinkedHashMap) this.c).values().iterator();
        while (it.hasNext() && jA - ((Number) it.next()).longValue() > 86400000000000L) {
            it.remove();
        }
    }

    public void i(Exception exc) {
        String str = (String) this.b;
        Logger.d(gvg.h("Error requesting install of ", str, ": ", exc.getMessage()), new Object[0]);
        SplitInstallSessionState splitInstallSessionStateCreate = SplitInstallSessionState.create(0, 6, exc instanceof SplitInstallException ? ((SplitInstallException) exc).getErrorCode() : -100, 0L, 0L, Collections.singletonList(str), z6x.a);
        bpb1 bpb1Var = (wen0) this.c;
        splitInstallSessionStateCreate.getClass();
        bpb1Var.m((Object) null, pya1.e(splitInstallSessionStateCreate));
    }

    public void j(czo1 czo1Var, azo1 azo1Var) {
        czo1 nnd1Var;
        Object ind1Var;
        int i;
        if (azo1Var instanceof mnd1) {
            if (!(czo1Var instanceof nnd1)) {
                if (czo1Var instanceof pnd1) {
                    mnd1 mnd1Var = (mnd1) azo1Var;
                    czo1Var = new ond1(mnd1Var.c, mnd1Var.d);
                } else if (!(czo1Var instanceof rnd1) && !(czo1Var instanceof snd1)) {
                    if (czo1Var instanceof qnd1) {
                        czo1Var = new qnd1(((qnd1) czo1Var).c, ((mnd1) azo1Var).c);
                    } else if (!(czo1Var instanceof ond1)) {
                        eg.o();
                        return;
                    }
                }
            }
        } else {
            if (!(azo1Var instanceof lnd1)) {
                eg.o();
                return;
            }
            if (!(czo1Var instanceof nnd1)) {
                if (czo1Var instanceof pnd1) {
                    if (((lnd1) azo1Var).c == 2) {
                        int i2 = ((pnd1) czo1Var).c;
                        nnd1Var = new qnd1(i2, i2);
                        czo1Var = nnd1Var;
                    }
                } else if (!(czo1Var instanceof rnd1) && !(czo1Var instanceof snd1)) {
                    if (czo1Var instanceof qnd1) {
                        if (((lnd1) azo1Var).c == 1) {
                            qnd1 qnd1Var = (qnd1) czo1Var;
                            int i3 = qnd1Var.c;
                            int i4 = qnd1Var.d;
                            nnd1Var = i3 > i4 ? new rnd1(i4) : new snd1(i4);
                            czo1Var = nnd1Var;
                        }
                    } else if (!(czo1Var instanceof ond1)) {
                        eg.o();
                        return;
                    } else if (((lnd1) azo1Var).c == 1) {
                        ond1 ond1Var = (ond1) czo1Var;
                        nnd1Var = new nnd1(ond1Var.c, ond1Var.d);
                        czo1Var = nnd1Var;
                    }
                }
            }
        }
        if (czo1Var instanceof nnd1) {
            nnd1 nnd1Var2 = (nnd1) czo1Var;
            ind1Var = new jnd1(nnd1Var2.c, nnd1Var2.d);
        } else if (czo1Var instanceof pnd1) {
            ind1Var = null;
        } else if (czo1Var instanceof rnd1) {
            ind1Var = new hnd1(((rnd1) czo1Var).c);
        } else if (czo1Var instanceof snd1) {
            ind1Var = new ind1(((snd1) czo1Var).c);
        } else {
            if (!(czo1Var instanceof qnd1) && !(czo1Var instanceof ond1)) {
                eg.o();
                return;
            }
            ind1Var = null;
        }
        if (ind1Var != null) {
            ((b1c1) this.b).invoke(ind1Var);
            if (ind1Var instanceof hnd1) {
                i = ((hnd1) ind1Var).a;
            } else if (ind1Var instanceof ind1) {
                i = ((ind1) ind1Var).a;
            } else {
                if (!(ind1Var instanceof jnd1)) {
                    eg.o();
                    return;
                }
                i = ((jnd1) ind1Var).a;
            }
            czo1Var = new pnd1(i);
        }
        this.c = czo1Var;
    }

    public mr20 k() {
        return rqt0.u(new zo51(new any(rqt0.u(new any(((ov20) this.c).c("type", ""), (byte) 19)), (byte) 20), this, (byte) 26));
    }

    public void l(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        g(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            kab1 kab1Var = (kab1) ((ArrayList) this.c).get(size);
            int i4 = kab1Var.a;
            if (i4 >= i) {
                kab1Var.a = i4 + i2;
            }
        }
    }

    public void m(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        g(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            kab1 kab1Var = (kab1) ((ArrayList) this.c).get(size);
            int i4 = kab1Var.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.c).remove(size);
                } else {
                    kab1Var.a = i4 - i2;
                }
            }
        }
    }

    public synchronized void n(byte[] bArr) {
        ((LinkedHashMap) this.c).remove(new zzc1(bArr));
    }

    public void o(String str, y570 y570Var) {
        HashSet hashSet = (HashSet) this.b;
        if (hashSet.contains(y570Var.a())) {
            return;
        }
        StringBuilder sbN = gvg.n(str, ": ", l1d.n(y570Var.h().b(), "]", gvg.n("model with id \"", y570Var.a(), "\" and componentId/category [", y570Var.h().a(), ", ")), ". Current ViewUri: ", String.valueOf(((jik1) this.c).getViewUri()));
        sbN.append("]");
        new ntj0(sbN.toString()).getMessage();
        hashSet.add(y570Var.a());
    }

    public void onFailure(Throwable th) {
        if (th instanceof h4d1) {
            o0c.q((String) null, ((pzc) this.c).cancel(false));
        } else {
            o0c.q((String) null, ((mzc) this.b).b((Object) null));
        }
    }

    public void onSuccess(Object obj) {
        o0c.q((String) null, ((mzc) this.b).b((Object) null));
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        qeb1 qeb1Var = (qeb1) obj;
        teb1 teb1Var = (teb1) this.c;
        String str = teb1Var.b;
        String str2 = teb1Var.c;
        vnb1 vnb1Var = qeb1Var.b;
        boolean z = vnb1Var != null && vnb1Var.b;
        boolean z2 = vnb1Var != null && vnb1Var.a;
        qxc0 qxc0Var = qeb1Var.a;
        u3a u3aVarS = dko1.s(vhc1Var, str, z, z2, qxc0Var.h, str2, (String) null, qxc0Var.W0, qxc0Var.X);
        return (u3aVarS instanceof u3a ? u3aVarS : null) != null;
    }

    public boolean t(Object obj) {
        qxc0 qxc0Var = (qxc0) obj;
        pha1 pha1Var = (pha1) this.c;
        le30 le30VarA = pha1Var.e.a(qxc0Var.e);
        d2f1 d2f1Var = pha1Var.d;
        String str = pha1Var.a;
        boolean z = qxc0Var.X0;
        x7i1 x7i1Var = qxc0Var.t;
        Map map = qxc0Var.X;
        boolean zL = gyo1.L(qxc0Var.O0);
        jq4 jq4Var = d2f1Var.c;
        if (zL) {
            return false;
        }
        if (d2f1.a(str, le30VarA)) {
            return jq4Var.e();
        }
        if (z) {
            return jq4Var.h() || x7i1Var.b;
        }
        CharSequence charSequence = (CharSequence) map.get("image_url");
        if (charSequence == null || charSequence.length() == 0) {
            return jq4Var.f();
        }
        return false;
    }

    public /* synthetic */ hp91(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ hp91(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public hp91(sp01 sp01Var, List list) {
        this.a = (byte) 4;
        this.c = sp01Var;
        this.b = list;
    }

    public hp91(b1c1 b1c1Var) {
        this.a = (byte) 29;
        this.b = b1c1Var;
        this.c = new pnd1(0);
    }

    public hp91(yqg yqgVar, byte b) {
        this.a = b;
        switch (b) {
            case 25:
                this.b = yqgVar;
                this.c = new LinkedHashMap();
                break;
            default:
                nva1 nva1Var = nva1.f;
                this.b = yqgVar;
                this.c = nva1Var;
                break;
        }
    }

    public hp91(jik1 jik1Var) {
        this.a = (byte) 12;
        this.b = new HashSet();
        jik1Var.getClass();
        this.c = jik1Var;
    }

    public hp91(pha1 pha1Var) {
        this.a = (byte) 6;
        this.c = pha1Var;
        this.b = pha1Var.h;
    }
}
