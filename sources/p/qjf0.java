package p;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qjf0 implements h0r0 {
    public final qyj a;
    public final mqp b;
    public final wjf0 c;
    public final lzn0 d;
    public final a1r0 e;
    public final Activity f;
    public final cbr0 g;

    /* JADX WARN: Multi-variable type inference failed */
    public qjf0(qyj qyjVar, mqp mqpVar, wjf0 wjf0Var, lzn0 lzn0Var, a1r0 a1r0Var, Activity activity, e5b0 e5b0Var) {
        this.a = qyjVar;
        this.b = mqpVar;
        this.c = wjf0Var;
        this.d = lzn0Var;
        this.e = a1r0Var;
        this.f = activity;
        yxe1 yxe1Var = new yxe1(new ehc1("Lyrics Fullscreen"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("LYRICS_FULLSCREEN", "lyrics/fullscreen", 968, "lyrics"), nik1.R0, (nar0) null), new t1r0(true), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(780328272, new mbf0(this, (byte) 1), true));
    }
}
