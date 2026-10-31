package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ubb0 implements h0r0 {
    public final qyj a;
    public final fcb0 b;
    public final ecb0 c;
    public final i8h1 d;
    public final cbr0 e;

    public ubb0(qyj qyjVar, fcb0 fcb0Var, ecb0 ecb0Var, i8h1 i8h1Var) {
        this.a = qyjVar;
        this.b = fcb0Var;
        this.c = ecb0Var;
        this.d = i8h1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.G1("LYRICS_LANGUAGE_PICKER", "lyrics/language-picker", 969, "lyrics"), nik1.T0, (nar0) null), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(1001472822, new gs90(this, (byte) 22), true));
    }
}
