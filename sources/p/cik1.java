package p;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.recaptcha.internal.zzhm;
import com.google.protobuf.h;
import com.spotify.base.java.logging.Logger;
import com.spotify.recents.recentsdatasourceimpl.events.proto.RecentsDecorationErrorEvent;
import com.spotify.voiceassistants.playermodels.PlayIntent;
import com.spotify.voiceassistants.playermodels.SourceDevice;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import com.spotify.voting.proto.v2.SendVotesRequestV2;
import com.spotify.voting.proto.v2.VotingSharePage;
import com.spotify.wrapped.v1.proto.CardShareConfiguration;
import com.spotify.wrapped.v1.proto.ConsumerShareRequestParameters;
import com.spotify.wrapped.v1.proto.LandscapeShareImageResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;
import kotlinx.coroutines.TimeoutCancellationException;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.esperanto.proto.YourLibraryTagFilter;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cik1 implements Function, jn21, jpo1 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public cik1(byte b) {
        this.a = b;
        switch (b) {
            case 22:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = akp1.f;
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                this.e = new HashMap();
                break;
        }
    }

    public static boolean h(CardShareConfiguration cardShareConfiguration, int i) {
        boolean z = (cardShareConfiguration.s().isEmpty() || cardShareConfiguration.t().isEmpty() || ihc1.y0(cardShareConfiguration.r())) ? false : true;
        if (r8m1.a[l1d.C(i)] == 1) {
            return z && !cardShareConfiguration.q();
        }
        return z;
    }

    public static final /* synthetic */ elo1 p(cik1 cik1Var) {
        return (elo1) cik1Var.b;
    }

    public static final /* synthetic */ zzhm q(cik1 cik1Var, Exception exc) {
        x15 x15Var = (x15) cik1Var.c;
        boolean z = exc instanceof TimeoutCancellationException;
        tgo1 tgo1Var = tgo1.d;
        if (z) {
            return x15Var.a(exc, new zzhm(tgo1Var, ij81.e, exc.getMessage(), (Exception) null));
        }
        return exc instanceof zzhm ? x15Var.a(exc, (zzhm) exc) : x15Var.a(exc, new zzhm(tgo1Var, ij81.V0, exc.getMessage(), (Exception) null));
    }

    public static final /* synthetic */ alg1 r(cik1 cik1Var) {
        return (alg1) cik1Var.c;
    }

    public static final /* synthetic */ brk1 t(cik1 cik1Var) {
        return (brk1) cik1Var.b;
    }

    public static final /* synthetic */ exo1 u(cik1 cik1Var) {
        return (exo1) cik1Var.d;
    }

    public static final /* synthetic */ qeh1 v(cik1 cik1Var) {
        return (qeh1) cik1Var.e;
    }

    public void a(ZipFile zipFile, HashSet hashSet) {
        ((mxo1) this.e).c((lpn1) this.b, hashSet, new a1g1(this, (byte) 20));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return j2h1.D(o6x.a, new bj81((byte) 4, (vna1) ((tp7) this.b).i, ((PlayIntent) this.c).getUri(), ((SourceDevice) obj).getDeviceType(), (t45) this.d, (VoiceAssistantLoggingContext) this.e, (lnm) null));
            default:
                tpm1 tpm1Var = (tpm1) obj;
                eqm1 eqm1Var = (eqm1) this.b;
                lik1 lik1Var = (lik1) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                String str3 = tpm1Var.a;
                ltm1 ltm1Var = eqm1Var.b;
                dg30 dg30Var = eqm1Var.a;
                ltm1Var.getClass();
                igm igmVar = new igm(str2, new vfm(ltm1.e(dg30Var)), str3);
                smc0 smc0VarN = k4p1.n();
                int i = tpm1Var.c;
                e2t0 e2t0Var = e2t0.Y;
                if (i == 1) {
                    smc0VarN.add(eqm1Var.d.i(str, e2t0Var));
                } else if (i != 4) {
                    smc0VarN.add(eqm1Var.c.g(str, e2t0Var, lik1Var));
                }
                if (tpm1Var.b) {
                    smc0VarN.add(eqm1Var.f.a(str));
                }
                return new kjm(igmVar, k4p1.k(smc0VarN), 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object b(vr20 vr20Var, j1k0 j1k0Var, onm onmVar) {
        n4l1 n4l1Var;
        vr20 vr20Var2;
        Object obj;
        j1k0 j1k0Var2;
        cbk0 cbk0Var = (cbk0) this.b;
        if (onmVar instanceof n4l1) {
            n4l1Var = (n4l1) onmVar;
            int i = n4l1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n4l1Var.e = i - Integer.MIN_VALUE;
            } else {
                n4l1Var = new n4l1(this, onmVar);
            }
        } else {
            n4l1Var = new n4l1(this, onmVar);
        }
        Object obj2 = n4l1Var.c;
        int i2 = n4l1Var.e;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            gqj1 gqj1Var = new gqj1((Object) this, (Object) cbk0Var.g, lnmVar, (byte) 9);
            vr20Var2 = vr20Var;
            n4l1Var.a = vr20Var2;
            n4l1Var.b = j1k0Var;
            n4l1Var.e = 1;
            Object objO = rc2.O(5000L, gqj1Var, n4l1Var);
            if (objO != d9nVar) {
                obj = objO;
                j1k0Var2 = j1k0Var;
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj2);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j1k0Var2 = n4l1Var.b;
        vr20 vr20Var3 = n4l1Var.a;
        hm5.M(obj2);
        obj = obj2;
        vr20Var2 = vr20Var3;
        String str = (String) obj;
        if (str != null) {
            cbk0Var.g = str;
            o2k0 o2k0Var = new o2k0(j1k0Var2.a);
            n4l1Var.a = null;
            n4l1Var.b = null;
            n4l1Var.e = 2;
            if (vr20Var2.emit(o2k0Var, n4l1Var) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        kt91 kt91Var = (kt91) this.d;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958682});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", 2131958682, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
        n4l1Var.a = null;
        n4l1Var.b = null;
        n4l1Var.e = 3;
        if (vr20Var2.emit(n2k0.a, n4l1Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    public void c() {
        jw91 jw91Var = (jw91) this.e;
        t5o0 t5o0Var = (t5o0) this.d;
        SparseArray sparseArray = (SparseArray) jw91Var.c;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((t5o0) sparseArray.valueAt(size)) == t5o0Var) {
                sparseArray.removeAt(size);
            }
        }
    }

    public void d() {
        ((Executor) this.b).execute(new v241(this, (byte) 22));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object e(String str, onm onmVar) {
        wfm1 wfm1Var;
        if (onmVar instanceof wfm1) {
            wfm1Var = (wfm1) onmVar;
            int i = wfm1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wfm1Var.d = i - Integer.MIN_VALUE;
            } else {
                wfm1Var = new wfm1(this, onmVar);
            }
        } else {
            wfm1Var = new wfm1(this, onmVar);
        }
        Object objO = wfm1Var.b;
        int i2 = wfm1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                xfm1 xfm1Var = new xfm1(this, str, null, (byte) 0);
                wfm1Var.a = str;
                wfm1Var.d = 1;
                objO = rc2.O(5000L, xfm1Var, wfm1Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = wfm1Var.a;
                hm5.M(objO);
            }
            LandscapeShareImageResponse landscapeShareImageResponse = (LandscapeShareImageResponse) objO;
            if (landscapeShareImageResponse != null) {
                return new bgm1(landscapeShareImageResponse.o(), landscapeShareImageResponse.n());
            }
            m(2, "Wrapped share " + str + " timed out");
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            m(1, gvg.h("Failed to fetch Wrapped share ", str, ": ", e2.getMessage()));
            return null;
        }
    }

    public void f(String str, tv80 tv80Var) {
        huj.b((lzn0) this.e, (Activity) this.b, (ryf) this.c, oxf.b, str, tv80Var);
    }

    public int g(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        bhn0.h(((t5o0) this.d).c, cy30.r(i, "requested global type ", " does not belong to the adapter:"));
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x0109 A[LOOP:2: B:42:0x0103->B:44:0x0109, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:60:0x0151 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object i(String str, String str2, SendVotesRequestV2 sendVotesRequestV2, String str3, onm onmVar) {
        mxk1 mxk1Var;
        String str4;
        VotingSharePage votingSharePage;
        eyk1 eyk1Var;
        String strJ;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        Object objS;
        ArrayList arrayList4;
        Iterator it2;
        String str5 = str3;
        if (onmVar instanceof mxk1) {
            mxk1Var = (mxk1) onmVar;
            int i = mxk1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mxk1Var.f = i - Integer.MIN_VALUE;
            } else {
                mxk1Var = new mxk1(this, onmVar);
            }
        } else {
            mxk1Var = new mxk1(this, onmVar);
        }
        Object objB = mxk1Var.d;
        int i2 = mxk1Var.f;
        Object obj = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            jxk1 jxk1Var = (jxk1) this.b;
            x461 x461Var = (x461) sendVotesRequestV2.toBuilder();
            x461Var.s(str5);
            SendVotesRequestV2 sendVotesRequestV3 = (SendVotesRequestV2) x461Var.build();
            mxk1Var.a = str5;
            mxk1Var.f = 1;
            objB = jxk1Var.b(str, str2, sendVotesRequestV3, mxk1Var);
            if (objB != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            str5 = mxk1Var.a;
            hm5.M(objB);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eyk1 eyk1Var2 = mxk1Var.c;
                hm5.M(objB);
                return eyk1Var2;
            }
            votingSharePage = mxk1Var.b;
            str4 = mxk1Var.a;
            hm5.M(objB);
        }
        Set set = s4b1.f;
        strJ = uic.x(str4).j();
        if (strJ == null) {
            strJ = "";
        }
        String strN = votingSharePage.n();
        ArrayList arrayListA = zr7.A(str4, votingSharePage.q());
        eyk1Var = new eyk1(0, strJ, strN, votingSharePage.p(), votingSharePage.o(), arrayListA);
        mxk1Var.a = null;
        mxk1Var.b = null;
        mxk1Var.c = eyk1Var;
        mxk1Var.f = 3;
        arrayList = new ArrayList();
        for (Object obj2 : arrayListA) {
            if (obj2 instanceof s271) {
                arrayList.add(obj2);
            }
        }
        arrayList2 = new ArrayList();
        it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList5 = ((s271) it.next()).a;
            arrayList4 = new ArrayList(q7h.U(arrayList5, 10));
            it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((r271) it2.next()).b);
            }
            r7h.W(arrayList4, arrayList2);
        }
        arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!ihc1.y0((String) obj3)) {
                arrayList3.add(obj3);
            }
        }
        if (!arrayList3.isEmpty() && (objS = smo1.s(new vxg1(arrayList3, this, (lnm) null, (byte) 24), mxk1Var)) == d9nVar) {
            obj = objS;
        }
        if (obj != d9nVar) {
            return d9nVar;
        }
        return eyk1Var;
        VotingSharePage votingSharePage2 = (VotingSharePage) objB;
        mxk1Var.a = str5;
        mxk1Var.b = votingSharePage2;
        mxk1Var.f = 2;
        Object objY = fn31.Y((q8n) this.d, new nxk1(this, str5, (lnm) null, (byte) 1), mxk1Var);
        if (objY != d9nVar) {
            objY = obj;
        }
        if (objY != d9nVar) {
            str4 = str5;
            votingSharePage = votingSharePage2;
            Set set2 = s4b1.f;
            strJ = uic.x(str4).j();
            if (strJ == null) {
                strJ = "";
            }
            String strN2 = votingSharePage.n();
            ArrayList arrayListA2 = zr7.A(str4, votingSharePage.q());
            eyk1Var = new eyk1(0, strJ, strN2, votingSharePage.p(), votingSharePage.o(), arrayListA2);
            mxk1Var.a = null;
            mxk1Var.b = null;
            mxk1Var.c = eyk1Var;
            mxk1Var.f = 3;
            arrayList = new ArrayList();
            while (r2.hasNext()) {
                if (obj2 instanceof s271) {
                    arrayList.add(obj2);
                }
            }
            arrayList2 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList6 = ((s271) it.next()).a;
                arrayList4 = new ArrayList(q7h.U(arrayList6, 10));
                it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((r271) it2.next()).b);
                }
                r7h.W(arrayList4, arrayList2);
            }
            arrayList3 = new ArrayList();
            while (r2.hasNext()) {
                if (!ihc1.y0((String) obj3)) {
                    arrayList3.add(obj3);
                }
            }
            if (!arrayList3.isEmpty()) {
                obj = objS;
            }
            if (obj != d9nVar) {
                return eyk1Var;
            }
        }
        return d9nVar;
    }

    public int j(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey > -1) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        jw91 jw91Var = (jw91) this.e;
        t5o0 t5o0Var = (t5o0) this.d;
        int i2 = jw91Var.b;
        jw91Var.b = i2 + 1;
        ((SparseArray) jw91Var.c).put(i2, t5o0Var);
        sparseIntArray.put(i, i2);
        ((SparseIntArray) this.c).put(i2, i);
        return i2;
    }

    public synchronized boolean k(mn21 mn21Var) {
        try {
            String cacheKey = mn21Var.getCacheKey();
            boolean zContainsKey = ((HashMap) this.b).containsKey(cacheKey);
            HashMap map = (HashMap) this.b;
            if (!zContainsKey) {
                map.put(cacheKey, null);
                mn21Var.setNetworkRequestCompleteListener(this);
                if (vqk1.a) {
                    vqk1.a("new request, sending to network %s", new Object[]{cacheKey});
                }
                return false;
            }
            List arrayList = (List) map.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            mn21Var.addMarker("waiting-for-response");
            arrayList.add(mn21Var);
            ((HashMap) this.b).put(cacheKey, arrayList);
            if (vqk1.a) {
                vqk1.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[]{cacheKey});
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void l(mn21 mn21Var) {
        try {
            String cacheKey = mn21Var.getCacheKey();
            List list = (List) ((HashMap) this.b).remove(cacheKey);
            if (list != null && !list.isEmpty()) {
                if (vqk1.a) {
                    vqk1.b("%d waiting requests for cacheKey=%s; resend to network", new Object[]{Integer.valueOf(list.size()), cacheKey});
                }
                mn21 mn21Var2 = (mn21) list.remove(0);
                ((HashMap) this.b).put(cacheKey, list);
                mn21Var2.setNetworkRequestCompleteListener(this);
                try {
                    ((PriorityBlockingQueue) this.e).put(mn21Var2);
                } catch (InterruptedException e) {
                    vqk1.a("Couldn't add request to queue. %s", new Object[]{e.toString()});
                    Thread.currentThread().interrupt();
                    bqc bqcVar = (bqc) this.d;
                    bqcVar.e = true;
                    bqcVar.interrupt();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void m(int i, String str) {
        Logger.d(str, new Object[0]);
        t2j0 t2j0Var = (t2j0) this.e;
        wr01 wr01VarN = RecentsDecorationErrorEvent.n();
        wr01VarN.q(str);
        wr01VarN.r("wrapped_share_decorator");
        wr01VarN.n(eqq.j(i));
        t2j0Var.a(wr01VarN.build());
    }

    public void n(int i, String str, CardShareConfiguration cardShareConfiguration, ConsumerShareRequestParameters consumerShareRequestParameters, int i2, tv80 tv80Var) {
        tv80 tv80VarM;
        fp80 fp80VarB;
        qfm1 qfm1Var = (qfm1) this.e;
        vq71 vq71Var = ((g9l1) this.d).j;
        sju sjuVarA = ((mt71) ((g9l1) this.d).f15p.a.getValue()).a();
        String str2 = sjuVarA != null ? sjuVarA.c : null;
        pfm1 pfm1Var = (pfm1) qfm1Var.a.get();
        String str3 = pfm1Var.a;
        ofm1 ofm1Var = pfm1Var.b;
        if (u890.j(str3, str) && ofm1Var != null) {
            if (u890.j(ofm1Var.a, vq71Var != null ? vq71Var.b : null)) {
                sju sjuVar = vq71Var.g;
                str2 = sjuVar != null ? sjuVar.c : null;
            } else {
                str2 = ofm1Var.b;
            }
        }
        String str4 = (str2 == null || ihc1.y0(str2)) ? null : str2;
        String strConcat = "spotify:wrapped:".concat(str);
        if (tv80Var == null) {
            qpj1 qpj1Var = (qpj1) this.b;
            String strF = xvj1.f(i);
            bcl1 bcl1Var = (bcl1) qpj1Var.c;
            hp80 hp80VarP = qpj1Var.p();
            if (hp80VarP != null) {
                bcl1Var.getClass();
                fp80VarB = hp80VarP.b();
            } else {
                fp80VarB = null;
            }
            x6h1 x6h1VarC = bcl1Var.h(fp80VarB).a.c();
            x6h1VarC.i.add(new a7h1("watch_feed_component", "wrapped-share", (Integer) null, str, strF));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            b7x b7xVar = b7x.a;
            tv80VarM = bcl1Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        } else {
            tv80VarM = tv80Var;
        }
        h290<String> h290VarT = cardShareConfiguration.t();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarT, 10));
        for (String str5 : h290VarT) {
            String strR = cardShareConfiguration.r();
            str5.getClass();
            arrayList.add(new qhm1(strR, str5, consumerShareRequestParameters, str4));
        }
        Parcelable phm1Var = new phm1(i2, strConcat, arrayList);
        d290<k471> d290VarS = cardShareConfiguration.s();
        ArrayList arrayList2 = new ArrayList();
        for (k471 k471Var : d290VarS) {
            k471Var.getClass();
            o571 o571VarR = gyo1.R(k471Var);
            if (o571VarR != null) {
                arrayList2.add(o571VarR);
            }
        }
        Parcelable cmtVar = new cmt(arrayList2, 2);
        Bundle bundle = new Bundle();
        bundle.putParcelable("wrapped.share.loader_params", phm1Var);
        bundle.putParcelable("wrapped.share.destination_list_configuration", cmtVar);
        ((xh71) this.c).a((wa71) null, bundle, new vm71(xvj1.f(i)), tv80VarM, Collections.singletonList(dgm1.a));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Observable o(p7c0 p7c0Var) {
        YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfigN;
        ksm1 ksm1Var;
        mwm1 mwm1Var = (mwm1) this.b;
        if (p7c0Var.g) {
            nsm1 nsm1VarO = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
            nsm1VarO.q(osm1.INCLUDE_ALWAYS);
            h hVarBuild = nsm1VarO.build();
            hVarBuild.getClass();
            yourLibraryConfig$YourLibraryPredefinedPlaylistConfigN = (YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) hVarBuild;
        } else {
            yourLibraryConfig$YourLibraryPredefinedPlaylistConfigN = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.n();
            yourLibraryConfig$YourLibraryPredefinedPlaylistConfigN.getClass();
        }
        boolean zC = ((evm1) this.e).C();
        mml mmlVar = p7c0Var.j;
        psm1 psm1Var = (psm1) mqn1.J(p7c0Var.c).toBuilder();
        psm1Var.q(yourLibraryConfig$YourLibraryPredefinedPlaylistConfigN);
        boolean z = p7c0Var.m;
        nsm1 nsm1VarO2 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
        nsm1VarO2.q(z ? osm1.INCLUDE_IF_NOT_EMPTY : osm1.EXCLUDE);
        psm1Var.x((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) nsm1VarO2.build());
        YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs yourLibraryPredefinedPlaylistConfigsBuild = psm1Var.build();
        gvm1 gvm1VarO = YourLibraryRequest.o();
        gvm1VarO.s(yourLibraryPredefinedPlaylistConfigsBuild);
        gvm1VarO.t(100);
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        dia1 dia1Var = p7c0Var.f;
        if (dia1Var != null) {
            qsm1 qsm1VarN = YourLibraryConfig$YourLibrarySortOrder.n();
            int iOrdinal = dia1Var.ordinal();
            rsm1 rsm1Var = rsm1.CREATOR;
            switch (iOrdinal) {
                case 0:
                    rsm1Var = rsm1.RECENTLY_UPDATED;
                    qsm1VarN.n(rsm1Var);
                    hvm1VarQ.I((YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build());
                    break;
                case 1:
                    rsm1Var = rsm1.RECENTLY_ADDED;
                    qsm1VarN.n(rsm1Var);
                    hvm1VarQ.I((YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build());
                    break;
                case 2:
                    rsm1Var = rsm1.NAME;
                    qsm1VarN.n(rsm1Var);
                    hvm1VarQ.I((YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build());
                    break;
                case 3:
                case 6:
                    qsm1VarN.n(rsm1Var);
                    hvm1VarQ.I((YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build());
                    break;
                case 4:
                    rsm1Var = rsm1.CUSTOM;
                    qsm1VarN.n(rsm1Var);
                    hvm1VarQ.I((YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build());
                    break;
                case 5:
                    rsm1Var = zC ? rsm1.RECENTS : rsm1.RECENTLY_PLAYED_OR_ADDED;
                    qsm1VarN.n(rsm1Var);
                    hvm1VarQ.I((YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build());
                    break;
                case 7:
                    rsm1Var = rsm1.RELEVANCE;
                    qsm1VarN.n(rsm1Var);
                    hvm1VarQ.I((YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build());
                    break;
                case 8:
                    rsm1Var = rsm1.EVENT_START_TIME;
                    qsm1VarN.n(rsm1Var);
                    hvm1VarQ.I((YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build());
                    break;
                case 9:
                    rsm1Var = rsm1.RELEASE_DATE;
                    qsm1VarN.n(rsm1Var);
                    hvm1VarQ.I((YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build());
                    break;
                default:
                    eg.o();
                    return null;
            }
        }
        hvm1VarQ.C(p7c0Var.b);
        hvm1VarQ.G(p7c0Var.a);
        hvm1VarQ.L();
        List<d6c0> list = p7c0Var.k;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (d6c0 d6c0Var : list) {
            if (u890.j(d6c0Var, z4c0.b) || (d6c0Var instanceof h5c0)) {
                ksm1Var = ksm1.BY_SPOTIFY;
            } else if (u890.j(d6c0Var, a5c0.b) || (d6c0Var instanceof i5c0)) {
                ksm1Var = ksm1.BY_YOU;
            } else if (d6c0Var instanceof r5c0) {
                ksm1Var = ksm1.EVENT;
            } else if (u890.j(d6c0Var, b6c0.b)) {
                ksm1Var = ksm1.UPCOMING;
            } else if (u890.j(d6c0Var, c6c0.b)) {
                ksm1Var = ksm1.VENUE;
            } else if (u890.j(d6c0Var, x5c0.b)) {
                ksm1Var = ksm1.PAST;
            } else if (u890.j(d6c0Var, u5c0.b)) {
                ksm1Var = ksm1.IN_PROGRESS;
            } else if (u890.j(d6c0Var, a6c0.b)) {
                ksm1Var = ksm1.UNPLAYED;
            } else if ((d6c0Var instanceof y4c0) || u890.j(d6c0Var, k5c0.b)) {
                ksm1Var = ksm1.ALBUM;
            } else if ((d6c0Var instanceof b5c0) || (d6c0Var instanceof q5c0)) {
                ksm1Var = ksm1.DOWNLOADED;
            } else if ((d6c0Var instanceof e5c0) || u890.j(d6c0Var, l5c0.b)) {
                ksm1Var = ksm1.ARTIST;
            } else if ((d6c0Var instanceof g5c0) || u890.j(d6c0Var, m5c0.b)) {
                ksm1Var = ksm1.BOOK;
            } else if ((d6c0Var instanceof y5c0) || u890.j(d6c0Var, o5c0.b)) {
                ksm1Var = ksm1.PLAYLIST;
            } else if ((d6c0Var instanceof z5c0) || u890.j(d6c0Var, p5c0.b)) {
                ksm1Var = ksm1.SHOW;
            } else if (d6c0Var instanceof f5c0) {
                ksm1Var = ksm1.AUTHOR;
            } else if (d6c0Var instanceof s5c0) {
                ksm1Var = ksm1.FINISHED;
            } else if (u890.j(d6c0Var, d5c0.b) || (d6c0Var instanceof w5c0)) {
                ksm1Var = ksm1.IS_MIXED;
            } else if (u890.j(d6c0Var, c5c0.b) || (d6c0Var instanceof t5c0)) {
                ksm1Var = ksm1.FOLDER;
            } else {
                if (!(d6c0Var instanceof j5c0) && !(d6c0Var instanceof n5c0)) {
                    eg.o();
                    return null;
                }
                ksm1Var = ksm1.UNRECOGNIZED;
            }
            arrayList.add(ksm1Var);
        }
        jsm1 jsm1VarR = YourLibraryConfig$YourLibraryFilters.r();
        jsm1VarR.n(arrayList);
        hvm1VarQ.u((YourLibraryConfig$YourLibraryFilters) jsm1VarR.build());
        hvm1VarQ.F(p7c0Var.i);
        boolean z2 = mmlVar instanceof iml;
        hvm1VarQ.z(!z2);
        boolean z3 = false;
        hvm1VarQ.B(!z2 && p7c0Var.d);
        if (!z2 && p7c0Var.e) {
            z3 = true;
        }
        hvm1VarQ.y(z3);
        hvm1VarQ.x();
        hvm1VarQ.A(p7c0Var.h);
        if (z2) {
            String str = ((iml) mmlVar).a;
            rhc rhcVarV = u890.v(str);
            if (rhcVarV.a.length != 8) {
                hhg1.f("Invalid folderId, ".concat(str));
                return null;
            }
            hvm1VarQ.v(rhcVarV.a().asLongBuffer().get());
        } else if (mmlVar instanceof lml) {
            axm1 axm1VarN = YourLibraryTagFilter.n();
            axm1VarN.n(((lml) mmlVar).a);
            hvm1VarQ.J((YourLibraryTagFilter) axm1VarN.build());
            hvm1VarQ.q(true);
        } else if (mmlVar instanceof kml) {
            String str2 = ((kml) mmlVar).a;
            if (str2 != null) {
                hvm1VarQ.K(str2);
                hvm1VarQ.q(true);
            }
        } else if (!(mmlVar instanceof jml)) {
            eg.o();
            return null;
        }
        gvm1VarO.q((YourLibraryRequestHeader) hvm1VarQ.build());
        return mwm1Var.b((YourLibraryRequest) gvm1VarO.build()).map(new frl1(this, p7c0Var, (byte) 7));
    }

    public qwo1 s(String str, yln1 yln1Var, long j) {
        return new qwo1(new mug(this, str, yln1Var, j, (lnm) null, (byte) 9));
    }

    public bkp1 w() {
        zjp1 zjp1Var = (zjp1) this.b;
        if (zjp1Var == null) {
            k220.r("signature encoding is not set");
            return null;
        }
        xjp1 xjp1Var = (xjp1) this.c;
        if (xjp1Var == null) {
            k220.r("EC curve type is not set");
            return null;
        }
        yjp1 yjp1Var = (yjp1) this.d;
        if (yjp1Var == null) {
            k220.r("hash type is not set");
            return null;
        }
        akp1 akp1Var = (akp1) this.e;
        if (xjp1Var == xjp1.c && yjp1Var != yjp1.c) {
            k220.r("NIST_P256 requires SHA256");
            return null;
        }
        xjp1 xjp1Var2 = xjp1.d;
        yjp1 yjp1Var2 = yjp1.e;
        if (xjp1Var == xjp1Var2 && yjp1Var != yjp1.d && yjp1Var != yjp1Var2) {
            k220.r("NIST_P384 requires SHA384 or SHA512");
            return null;
        }
        if (xjp1Var != xjp1.e || yjp1Var == yjp1Var2) {
            return new bkp1(zjp1Var, xjp1Var, yjp1Var, akp1Var);
        }
        k220.r("NIST_P521 requires SHA512");
        return null;
    }

    public cik1(cik1 cik1Var, fqn1 fqn1Var, bz11 bz11Var) {
        this.a = (byte) 19;
        this.b = cik1Var;
        this.c = fqn1Var;
        this.d = bz11Var;
    }

    public cik1(brk1 brk1Var, exo1 exo1Var, x15 x15Var, qeh1 qeh1Var) {
        this.a = (byte) 20;
        this.b = brk1Var;
        this.d = exo1Var;
        this.c = x15Var;
        this.e = qeh1Var;
    }

    public cik1(elo1 elo1Var, alg1 alg1Var, qeh1 qeh1Var, mxa1 mxa1Var) {
        this.a = (byte) 18;
        this.b = elo1Var;
        this.c = alg1Var;
        this.e = qeh1Var;
        this.d = mxa1Var;
    }

    public cik1(mxo1 mxo1Var, lpn1 lpn1Var, HashSet hashSet, AtomicBoolean atomicBoolean) {
        this.a = (byte) 17;
        this.e = mxo1Var;
        this.b = lpn1Var;
        this.c = hashSet;
        this.d = atomicBoolean;
    }

    public /* synthetic */ cik1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public cik1(pgp1 pgp1Var) {
        this.a = (byte) 21;
        this.b = new HashMap(pgp1Var.a);
        this.c = new HashMap(pgp1Var.b);
        this.d = new HashMap(pgp1Var.c);
        this.e = new HashMap(pgp1Var.d);
    }

    public cik1(cbk0 cbk0Var, d0r d0rVar, kt91 kt91Var) {
        this.a = (byte) 4;
        this.b = cbk0Var;
        this.c = d0rVar;
        this.d = kt91Var;
        this.e = w3p1.o(new l4r(hvm.c, 1, eak1.a1, new j4r(new tak1(this, (byte) 9)), eak1.b1), eak1.Z0);
    }

    public cik1(bqc bqcVar, PriorityBlockingQueue priorityBlockingQueue, ouz ouzVar) {
        this.a = (byte) 5;
        this.b = new HashMap();
        this.c = ouzVar;
        this.d = bqcVar;
        this.e = priorityBlockingQueue;
    }

    public cik1(jw91 jw91Var, t5o0 t5o0Var) {
        this.a = (byte) 0;
        this.e = jw91Var;
        this.b = new SparseIntArray(1);
        this.c = new SparseIntArray(1);
        this.d = t5o0Var;
    }
}
