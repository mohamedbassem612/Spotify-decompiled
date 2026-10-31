package p;

import android.os.Parcelable;
import com.spotify.player.model.PlayOrigin;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class can0 implements h0r0 {
    public final uwn a;
    public final ean0 b;
    public final swm0 c;
    public final ioc d;
    public final myq0 e;
    public final p1f0 f;
    public final cbr0 g;

    public can0(uwn uwnVar, ean0 ean0Var, swm0 swm0Var, ioc iocVar, myq0 myq0Var, p1f0 p1f0Var) {
        this.a = uwnVar;
        this.b = ean0Var;
        this.c = swm0Var;
        this.d = iocVar;
        this.e = myq0Var;
        this.f = p1f0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("PRERELEASE_MUSIC_VIDEO", "prerelease/music-video", 1561, "prerelease");
        Parcelable.Creator creator = lik1.CREATOR;
        this.g = new cbr0(new dbr0[]{new bn70(p6r0VarG1, new lik1(ean0Var.a), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        PlayOrigin playOrigin = this.e.get();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return h72.s(uwn.a(this.a, this.c, this.d, playOrigin, yon1.G1("PRERELEASE_MUSIC_VIDEO", "prerelease/music-video", 1561, "prerelease")), this.b.a, vqo1.c(w7x.a, l9n0.Z), new mbj0(this, (byte) 25), b5n0.N0, (Function0) null, (iu30) null, 112);
    }
}
