package com.spotify.coremediarenderer.bridge;

import java.util.ArrayList;
import kotlin.Metadata;
import p.flo1;
import p.fn31;
import p.fns;
import p.gke;
import p.guo1;
import p.igu;
import p.j0d1;
import p.llm;
import p.lnm;
import p.lr80;
import p.ltg;
import p.o8n;
import p.otg;
import p.pid;
import p.pyf0;
import p.q7h;
import p.rr80;
import p.rtg;
import p.smo1;
import p.sr80;
import p.stg;
import p.tsg;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/coremediarenderer/bridge/CmrVideoQualityCallback;", "", "", "playbackId", "Lp/rih1;", "onCurrentPlaybackChanged", "(Ljava/lang/String;)V", "", "values", "onVideoQualityChanged", "(Ljava/lang/String;[J)V", "src_main_java_com_spotify_coremediarenderer_bridge-bridge"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CmrVideoQualityCallback {
    public final otg a;
    public final tsg b;
    public final llm c;

    public CmrVideoQualityCallback(otg otgVar, tsg tsgVar) {
        this.a = otgVar;
        this.b = tsgVar;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        this.c = smo1.e(flo1.l(j0d1VarB, pyf0.a));
    }

    public final void onCurrentPlaybackChanged(String playbackId) {
        fn31.T(this.c, (o8n) null, 0, new pid(this, playbackId, (lnm) null, (byte) 22), 3);
    }

    public final void onVideoQualityChanged(String playbackId, long[] values) {
        ltg ltgVar;
        long j = values[0];
        long j2 = 0;
        lnm lnmVar = null;
        stg stgVar = j < 0 ? null : new stg(j, values[1]);
        rr80 rr80VarO = yoi1.O(yoi1.Q(5, values.length), 3);
        ArrayList arrayList = new ArrayList(q7h.U(rr80VarO, 10));
        lr80 it = rr80VarO.iterator();
        while (((sr80) it).c) {
            int iNextInt = it.nextInt();
            long j3 = values[iNextInt];
            long j4 = values[iNextInt + 1];
            arrayList.add(new ltg(j3, j4 < j2 ? null : new stg(j4, values[iNextInt + 2])));
            j2 = j2;
        }
        long j5 = j2;
        long j6 = values[2];
        if (j6 < j5) {
            ltgVar = null;
        } else {
            long j7 = values[3];
            ltgVar = new ltg(j6, j7 < j5 ? null : new stg(j7, values[4]));
        }
        fn31.T(this.c, (o8n) null, 0, new gke(this, playbackId, new rtg(stgVar, arrayList, ltgVar), lnmVar, (byte) 5), 3);
    }
}
