package p;

import com.spotify.prefetch_esperanto.proto.EsMediaPrefetch;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class huh0 {
    public final be a;
    public final spq0 b;
    public final sb4 c;

    public huh0(be beVar, spq0 spq0Var, sb4 sb4Var) {
        this.a = beVar;
        this.b = spq0Var;
        this.c = sb4Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Completable a(String str, gx30 gx30Var) throws NoWhenBranchMatchedException {
        if (this.c.a() && ((Boolean) ((kly0) this.b.e(j690.d)).get()).booleanValue()) {
            return CompletableEmpty.a;
        }
        ArrayList arrayList = new ArrayList();
        for (dh90 dh90Var : gx30Var.a()) {
            if (dh90Var instanceof dh90) {
                goz gozVarN = EsMediaPrefetch.Item.n();
                doz dozVarN = EsMediaPrefetch.AudioPreviewResource.n();
                dozVarN.n(dh90Var.a());
                gozVarN.n(dozVarN.build());
                arrayList.add(gozVarN.build());
            } else if (dh90Var instanceof th90) {
                goz gozVarN2 = EsMediaPrefetch.Item.n();
                hoz hozVarN = EsMediaPrefetch.ProgressiveVideoResource.n();
                hozVarN.n(((th90) dh90Var).a());
                gozVarN2.q(hozVarN.build());
                arrayList.add(gozVarN2.build());
            } else {
                if (!(dh90Var instanceof uh90)) {
                    eg.o();
                    return null;
                }
                goz gozVarN3 = EsMediaPrefetch.Item.n();
                joz jozVarN = EsMediaPrefetch.SegmentedVideoResource.n();
                uh90 uh90Var = (uh90) dh90Var;
                String strW = wqn1.w(uh90Var.c());
                if (strW == null) {
                    strW = uh90Var.c();
                }
                jozVarN.r(phc.i(strW));
                Integer numB = uh90Var.b();
                if (numB != null) {
                    jozVarN.q(numB.intValue());
                }
                Integer numA = uh90Var.a();
                if (numA != null) {
                    jozVarN.n(numA.intValue());
                }
                gozVarN3.r(jozVarN.build());
                arrayList.add(gozVarN3.build());
            }
        }
        koz kozVarN = EsMediaPrefetch.UpdateFutureRequest.n();
        kozVarN.n(str);
        foz fozVarO = EsMediaPrefetch.Future.o();
        fozVarO.n(arrayList);
        kozVarN.q(fozVarO.build());
        EsMediaPrefetch.UpdateFutureRequest updateFutureRequestBuild = kozVarN.build();
        updateFutureRequestBuild.getClass();
        return this.a.j(updateFutureRequestBuild).ignoreElement();
    }

    public final void b(qq51 qq51Var) {
        ioz iozVarP = EsMediaPrefetch.SegmentProfileSelectionConfig.p();
        Iterator it = qq51Var.b.iterator();
        while (it.hasNext()) {
            iozVarP.n(blo1.i((lzx) it.next()));
        }
        Iterator it2 = qq51Var.a.iterator();
        while (it2.hasNext()) {
            iozVarP.q(blo1.j((dij1) it2.next()));
        }
        iozVarP.r(qq51Var.c);
        EsMediaPrefetch.SegmentProfileSelectionConfig segmentProfileSelectionConfigBuild = iozVarP.build();
        segmentProfileSelectionConfigBuild.getClass();
        this.a.k(segmentProfileSelectionConfigBuild).ignoreElement().subscribe();
    }
}
