package p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.concertsgalleryview.v1.GetGalleryPageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import spotify.autodownload.esperanto.proto.DisableAllEnabledShowsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ps7 implements Function, l6u0, is31, ya, itd, c0g, Producer {
    public final /* synthetic */ byte a;
    public Object b;

    public ps7(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.b = new bfn0(0, new wtl[16]);
                break;
            case 22:
                this.b = new HashMap();
                break;
            default:
                this.b = wf10.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
                break;
        }
    }

    public static final /* synthetic */ bfn0 a(ps7 ps7Var) {
        return (bfn0) ps7Var.b;
    }

    public boolean accept(Object obj) {
        return ((jq4) this.b).b();
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 2:
                dma1 dma1Var = (dma1) obj;
                ye8 ye8Var = (ye8) this.b;
                ymm0 ymm0Var = ye8Var.b;
                if (((u54) ymm0Var.b).d()) {
                    bma1 bma1Var = ye8.d;
                    u54 u54Var = (u54) ymm0Var.b;
                    if (!dma1Var.h(i5x0.j(u54Var.c()), false) && dma1Var.l(i5x0.k(ymm0Var.b()), 0) < u54Var.b() && ((int) ((System.currentTimeMillis() - dma1Var.g(i5x0.l(u54Var.c()), 0L)) / 3600000)) >= u54Var.a()) {
                        return ye8Var.a.b("audiobook-onboarding-completed").firstOrError().map(vf61.f);
                    }
                }
                Single singleJust = Single.just(Boolean.FALSE);
                singleJust.getClass();
                return singleJust;
            case 4:
                return ((Boolean) obj).booleanValue() ? ((mt8) ((ix7) this.b).b).callSingle("spotify.autodownload_esperanto.proto.AutoDownloadService", "DisableAllEnabledShows", DisableAllEnabledShowsRequest.n()).map(mpi1.X).map(stf0.N0) : Single.just(Boolean.FALSE);
            case 16:
                PlayerState playerState = (PlayerState) obj;
                return ne.w(playerState, ((LinkedHashSet) ((ne) this.b).b).contains((String) playerState.track().i(bx8.h).e("")));
            case 20:
                return j2h1.D(o6x.a, new ic01(((cz1) this.b).b, (lnm) null, (byte) 2)).d(Observable.just(p051.a));
            case 23:
                mls0 mls0Var = (mls0) obj;
                boolean z2 = mls0Var.a;
                Integer num = mls0Var.b;
                m0h m0hVar = (m0h) this.b;
                return new t1h(z2, num, m0hVar.a, m0hVar.b, m0hVar.c);
            case 24:
                return ((a4h) this.b).e.getString(2131962612, (String) obj);
            case 25:
                return new zsq0(new mmr0((atq0) this.b, (Map) obj));
            default:
                kby kbyVar = ((wsc0) obj).f;
                boolean z3 = kbyVar.w.b;
                le30 le30VarA = ((ghl) this.b).d.a(kbyVar.p);
                if (z3 && le30VarA != le30.b1 && le30VarA != le30.c1) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public void b(CancellationException cancellationException) {
        bfn0 bfn0Var = (bfn0) this.b;
        int i = bfn0Var.c;
        mhd[] mhdVarArr = new mhd[i];
        for (int i2 = 0; i2 < i; i2++) {
            mhdVarArr[i2] = ((wtl) bfn0Var.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            mhdVarArr[i3].q(cancellationException);
        }
        if (bfn0Var.c == 0) {
            return;
        }
        tf80.c("uncancelled requests present");
    }

    public Object c(String str, String str2, a8d1 a8d1Var) {
        mn40 mn40VarN = GetGalleryPageRequest.n();
        mn40VarN.q(str);
        if (str2 != null && str2.length() != 0) {
            mn40VarN.n(str2);
        }
        GetGalleryPageRequest getGalleryPageRequestBuild = mn40VarN.build();
        mrk mrkVar = (mrk) this.b;
        getGalleryPageRequestBuild.getClass();
        return mrkVar.a(getGalleryPageRequestBuild, a8d1Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object d(wkt wktVar, Uri uri, wa71 wa71Var, int i, zve1 zve1Var, onm onmVar) {
        os7 os7Var;
        zve1 zve1Var2;
        int i2;
        if (onmVar instanceof os7) {
            os7Var = (os7) onmVar;
            int i3 = os7Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                os7Var.f = i3 - Integer.MIN_VALUE;
            } else {
                os7Var = new os7(this, onmVar);
            }
        } else {
            os7Var = new os7(this, onmVar);
        }
        os7 os7Var2 = os7Var;
        Object objB = os7Var2.d;
        int i4 = os7Var2.f;
        d9n d9nVar = d9n.a;
        if (i4 == 0) {
            hm5.M(objB);
            bnt bntVar = uri != null ? new bnt(uri) : null;
            ant antVar = new ant(i, i);
            vmt vmtVarB = gqg.b((gqg) this.b, wktVar.a(), wktVar.g());
            os7Var2.a = wktVar;
            zve1Var2 = zve1Var;
            os7Var2.b = zve1Var2;
            os7Var2.c = i;
            os7Var2.f = 1;
            objB = vmtVarB.b(wa71Var, antVar, bntVar, (Uri) null);
            if (objB != d9nVar) {
                i2 = i;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                hm5.M(objB);
                return objB;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = os7Var2.c;
        zve1 zve1Var3 = os7Var2.b;
        wkt wktVar2 = os7Var2.a;
        hm5.M(objB);
        zve1Var2 = zve1Var3;
        wktVar = wktVar2;
        p371 p371Var = (p371) objB;
        sg0 sg0Var = new sg0(1, (lnm) null, (byte) 2);
        sg0 sg0Var2 = new sg0(1, (lnm) null, (byte) 3);
        ssd ssdVar = zve1Var2 != null ? new ssd(zve1Var2) : tsd.c;
        os7Var2.a = null;
        os7Var2.b = null;
        os7Var2.c = i2;
        os7Var2.f = 2;
        Object objK = fq7.K(wktVar, p371Var, sg0Var, sg0Var2, (n7q0) null, ssdVar, os7Var2, 24);
        return objK == d9nVar ? d9nVar : objK;
    }

    public mr20 e(boolean z) {
        return z ? ((drg) this.b).c.a.a("child-can-request-account-closure", false) : new huz(Boolean.TRUE, (byte) 10);
    }

    public Intent f(Intent intent) {
        return ((b72) this.b).e(intent, true);
    }

    public Observable g(String str, DynamicTagsMetadata dynamicTagsMetadata) {
        return ljg.c((ljg) this.b, str, (TriggerType) null, (String) null, (List) null, (tv80) null, (uy31) null, dynamicTagsMetadata, (ConflictResolutionStrategy) null, (d3j0) null, 446).flatMapObservable(new v5d(this));
    }

    public Object get() {
        return new SchedulerWorkRunner(((p1m) this.b).c);
    }

    public void h() {
        bfn0 bfn0Var = (bfn0) this.b;
        tr80 tr80VarQ = yoi1.Q(0, bfn0Var.c);
        int i = ((rr80) tr80VarQ).a;
        int i2 = ((rr80) tr80VarQ).b;
        if (i <= i2) {
            while (true) {
                ((wtl) bfn0Var.a[i]).b.resumeWith(rih1.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        bfn0Var.g();
    }

    public Object i(int i, String str, r6h1 r6h1Var, String str2) {
        int i2;
        int[] iArrH = l1d.H(3);
        int length = iArrH.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i2 = 0;
                break;
            }
            i2 = iArrH[i3];
            if (v8i0.d(i2).equals(str2)) {
                break;
            }
            i3++;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        sqk0 sqk0Var = new sqk0(i2, Integer.valueOf(i), str, new jpk0(new py9(r6h1Var, (byte) 13), (byte) 0));
        this.b = sqk0Var;
        return sqk0Var;
    }

    public Object j(String str, ova ovaVar, kmv kmvVar) {
        Object objS = smo1.s(new og5(str, ovaVar, this, (lnm) null, (byte) 4), kmvVar);
        return objS == d9n.a ? objS : rih1.a;
    }

    public w7h1 k(ctd ctdVar, String str) {
        if (!ctdVar.equals(ctd.a)) {
            eg.o();
            return null;
        }
        sqk0 sqk0Var = (sqk0) this.b;
        if (sqk0Var != null) {
            return sqk0Var.a(str);
        }
        u890.C("releaseCard");
        throw null;
    }

    public /* synthetic */ ps7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ps7(x3v0 x3v0Var, a0b a0bVar) {
        this.a = (byte) 29;
        this.b = x3v0Var;
    }

    public void apply(long j) {
        mna mnaVar = (mna) this.b;
        mnaVar.x1 = ina.a(mnaVar.x1, (jgc1) null, j, false, false, 0.0f, 0.0f, 0, 0, false, false, false, false, 0, 0, (String) null, 0, (String) null, (String) null, 262141);
        mna.W(mnaVar, mnaVar.t1.b(), (String) null, 6);
    }
}
