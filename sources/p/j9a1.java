package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j9a1 implements ebr0 {
    public ynb0 a;

    public final h0r0 a(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        i9a1 i9a1Var = (i9a1) parcelable;
        v8a1 v8a1Var = (v8a1) this.a.get();
        v8a1Var.getClass();
        ((rih1) obj).getClass();
        goq goqVar = new goq(v8a1Var, i9a1Var, q7r0Var);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("SONG_DNA", "song-dna", 1917, "song-dna");
        hvj hvjVar = (hvj) v8a1Var.b.get();
        c8o.l(hvjVar);
        return new u8a1(p6r0VarG1, hvjVar, i9a1Var, (jly0) goqVar.d, (jly0) goqVar.e);
    }
}
