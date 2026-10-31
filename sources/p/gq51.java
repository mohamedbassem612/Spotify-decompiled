package p;

import com.spotify.download.esperanto.proto.EsDownload;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gq51 {
    public final ptu a;
    public final fxu b;
    public final String c;
    public final ptl d;
    public final String e;
    public final String f;
    public final jq51 g;
    public final Scheduler h;
    public Integer i;
    public volatile Single j;
    public final mgc k;

    public gq51(ptu ptuVar, fxu fxuVar, String str, ptl ptlVar, String str2, String str3, jq51 jq51Var, Scheduler scheduler) {
        this.a = ptuVar;
        this.b = fxuVar;
        this.c = str;
        this.d = ptlVar;
        this.e = str2;
        this.f = str3;
        this.g = jq51Var;
        this.h = scheduler;
        int i = jq51Var.d;
        this.k = i > 0 ? new mgc(i, (byte) 27) : null;
    }

    public final synchronized void a() {
        try {
            Integer num = this.i;
            if (num != null) {
                int iIntValue = num.intValue();
                try {
                    fxu fxuVar = this.b;
                    ptu ptuVar = fxuVar.a;
                    knz knzVarO = EsDownload.SegmentFileStreamerId.o();
                    knzVarO.n(iIntValue);
                    ptuVar.callSingle("spotify.download.esperanto.proto.Download", "DestroySegmentFileStreamer", knzVarO.build()).map(qzs0.a1).subscribe(dxu.c, dxu.d, fxuVar.d);
                    this.i = null;
                    this.j = null;
                } catch (Throwable th) {
                    this.i = null;
                    this.j = null;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Single b() {
        wmz wmzVar;
        vmz vmzVar;
        lnz lnzVarN = EsDownload.SegmentFileStreamerParams.n();
        lnzVarN.r(this.c);
        int iC = l1d.C(2);
        if (iC == 0) {
            wmzVar = wmz.c;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            wmzVar = wmz.b;
        }
        lnzVarN.q(wmzVar);
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            vmzVar = vmz.LONG;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            vmzVar = vmz.SHORT;
        }
        lnzVarN.n(vmzVar);
        lnzVarN.s(this.e);
        lnzVarN.t(this.f);
        EsDownload.SegmentFileStreamerParams segmentFileStreamerParamsBuild = lnzVarN.build();
        segmentFileStreamerParamsBuild.getClass();
        return this.a.callSingle("spotify.download.esperanto.proto.Download", "CreateSegmentFileStreamer", segmentFileStreamerParamsBuild).map(olj0.Z0).map(new bb01(this, (byte) 19));
    }

    public final void finalize() {
        a();
    }
}
