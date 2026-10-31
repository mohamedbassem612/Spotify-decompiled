package p;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lwj1 implements h0r0 {
    public final qyj a;
    public final yup0 b;
    public final Context c;
    public final a1r0 d;
    public final kt91 e;
    public final los f;
    public final kly0 g;
    public final dhl0 h = new dhl0();
    public final cbr0 i;

    public lwj1(qyj qyjVar, yup0 yup0Var, Context context, a1r0 a1r0Var, kt91 kt91Var, los losVar, ttq ttqVar) {
        this.a = qyjVar;
        this.b = yup0Var;
        this.c = context;
        this.d = a1r0Var;
        this.e = kt91Var;
        this.f = losVar;
        this.g = ttqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.i = new cbr0(new dbr0[]{new bn70(yon1.G1("NOWPLAYING_VIDEOSETTINGS_VIDEOQUALITYSELECTION", "nowplaying/videosettings/videoqualityselection", 1365, "nowplaying"), nik1.v1, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    public final cbr0 a() {
        return this.i;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-102335812, new jwj1(this, (byte) 1), true));
    }
}
