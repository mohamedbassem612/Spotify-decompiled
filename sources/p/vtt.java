package p;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vtt implements h0r0 {
    public final qyj a;
    public final ahi0 b;
    public final ytt c;
    public final iur d;
    public final stt e;
    public final fur f;
    public final knr g;
    public final ox90 h;
    public final wtr i;
    public final sev j;
    public final cbr0 k;

    public vtt(qyj qyjVar, ahi0 ahi0Var, ytt yttVar, iur iurVar, stt sttVar, fur furVar, knr knrVar, ox90 ox90Var, los losVar, Resources resources, wtr wtrVar, sev sevVar) {
        this.a = qyjVar;
        this.b = ahi0Var;
        this.c = yttVar;
        this.d = iurVar;
        this.e = sttVar;
        this.f = furVar;
        this.g = knrVar;
        this.h = ox90Var;
        this.i = wtrVar;
        this.j = sevVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.k = new cbr0(new dbr0[]{new bn70(yon1.T0(), nik1.C2, (nar0) null), new t1r0(true), new s9h1(14, true, false, false), new nxb(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.7f)), c(resources) ? ixb.b : ixb.a, (Integer) null, 1, (mxb) null, losVar, false, false, c(resources), (nsm0) null, 3796)}, false);
    }

    public static boolean c(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        if (f2 == 0.0f) {
            f2 = 1.0f;
        }
        return f / f2 < 600.0f;
    }

    public final cbr0 a() {
        return this.k;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(128211676, new utt(this, (byte) 0), true));
    }
}
