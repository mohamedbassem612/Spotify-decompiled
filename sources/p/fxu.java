package p;

import com.spotify.contentdelivery.downloadimpl.NullTransportException;
import com.spotify.download.esperanto.proto.EsDownload;
import com.spotify.download.esperanto.proto.a;
import com.spotify.download.esperanto.proto.b;
import com.spotify.download.esperanto.proto.c;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import j$.util.Base64;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fxu implements iru, e520 {
    public final ptu a;
    public final j25 b;
    public final Scheduler c;
    public final CompositeDisposable d = new CompositeDisposable();

    public fxu(ptu ptuVar, j25 j25Var, Scheduler scheduler) {
        this.a = ptuVar;
        this.b = j25Var;
        this.c = scheduler;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int a(ArrayList arrayList, ptl ptlVar) throws NoWhenBranchMatchedException {
        wmz wmzVar;
        vmz vmzVar;
        EsDownload.GetFirstCachedSegmentIndexResponse getFirstCachedSegmentIndexResponseN;
        anz anzVarO = EsDownload.GetFirstCachedSegmentIndexParams.o();
        anzVarO.n(arrayList);
        int iC = l1d.C(2);
        if (iC == 0) {
            wmzVar = wmz.c;
        } else {
            if (iC != 1) {
                eg.o();
                return 0;
            }
            wmzVar = wmz.b;
        }
        anzVarO.r(wmzVar);
        int iOrdinal = ptlVar.ordinal();
        if (iOrdinal == 0) {
            vmzVar = vmz.b;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return 0;
            }
            vmzVar = vmz.c;
        }
        anzVarO.q(vmzVar);
        try {
            byte[] bArrCallSync = this.a.callSync("spotify.download.esperanto.proto.Download", "GetFirstCachedSegmentIndex", anzVarO.build());
            try {
                getFirstCachedSegmentIndexResponseN = EsDownload.GetFirstCachedSegmentIndexResponse.n(bArrCallSync);
            } catch (Exception e) {
                bhn0.o(f4i1.f("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.GetFirstCachedSegmentIndexResponse: '", Base64.getEncoder().encodeToString(bArrCallSync), "' (Base64)"), e);
                getFirstCachedSegmentIndexResponseN = null;
            }
            return getFirstCachedSegmentIndexResponseN.getIndex();
        } catch (NullTransportException unused) {
            return -1;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Single b(String str, String str2, String str3, int i, mn41 mn41Var) throws NoWhenBranchMatchedException {
        gnz gnzVar;
        fnz fnzVar;
        enz enzVarN = EsDownload.MediaManifestParams.n();
        enzVarN.n(str);
        int iC = l1d.C(i);
        if (iC == 0) {
            gnzVar = gnz.b;
        } else if (iC == 1) {
            gnzVar = gnz.c;
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            gnzVar = gnz.d;
        }
        enzVarN.s(gnzVar);
        int iC2 = l1d.C(1);
        if (iC2 == 0) {
            fnzVar = fnz.b;
        } else {
            if (iC2 != 1) {
                eg.o();
                return null;
            }
            fnzVar = fnz.c;
        }
        enzVarN.q(fnzVar);
        if (str2 != null) {
            enzVarN.r(str2);
        }
        if (str3 != null) {
            enzVarN.t(str3);
        }
        return this.a.callSingle("spotify.download.esperanto.proto.Download", "GetMediaManifest", (EsDownload.MediaManifestParams) enzVarN.build()).map(u321.Z0).onErrorResumeNext(new jm(str, (byte) 1)).flatMap(new ahs(mn41Var, (byte) 2));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Observable c(int i, String str) throws NoWhenBranchMatchedException {
        cnz cnzVar;
        bnz bnzVarN = EsDownload.GetMediaHandleParams.n();
        bnzVarN.n(str);
        int iC = l1d.C(i);
        if (iC == 0) {
            cnzVar = cnz.b;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            cnzVar = cnz.c;
        }
        bnzVarN.q(cnzVar);
        s2j0 s2j0Var = (EsDownload.GetMediaHandleParams) bnzVarN.build();
        l811 l811Var = new l811();
        s2j0Var.getClass();
        return this.a.callStream("spotify.download.esperanto.proto.Download", "GetMediaHandleId", s2j0Var).map(s321.Z0).timeout(30L, TimeUnit.SECONDS).concatMap(new ogr(l811Var, (byte) 18)).takeUntil(ios.Z0).onErrorResumeNext(new lqr(l811Var, (byte) 18));
    }

    public final Single d(URL url) {
        b bVarN = EsDownload.IsFileFullyCachedParams.ProgressiveFileParams.n();
        bVarN.n(url.toString());
        a aVarN = EsDownload.IsFileFullyCachedParams.n();
        aVarN.n(bVarN);
        return this.a.callSingle("spotify.download.esperanto.proto.Download", "IsFileFullyCached", (EsDownload.IsFileFullyCachedParams) aVarN.build()).map(uh21.a1).map(fmv.Z0).onErrorResumeNext(v560.Z0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Single e(String str, ptl ptlVar) throws NoWhenBranchMatchedException {
        vmz vmzVar;
        c cVarN = EsDownload.IsFileFullyCachedParams.SegmentFileParams.n();
        cVarN.q(str);
        int iOrdinal = ptlVar.ordinal();
        if (iOrdinal == 0) {
            vmzVar = vmz.b;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            vmzVar = vmz.c;
        }
        cVarN.n(vmzVar);
        a aVarN = EsDownload.IsFileFullyCachedParams.n();
        aVarN.q(cVarN);
        return this.a.callSingle("spotify.download.esperanto.proto.Download", "IsFileFullyCached", (EsDownload.IsFileFullyCachedParams) aVarN.build()).map(uh21.a1).map(qz70.Z0).onErrorResumeNext(b6j0.Y0);
    }
}
