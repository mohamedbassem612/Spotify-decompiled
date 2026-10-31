package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h8w0 implements h0r0 {
    public final d8w0 a;
    public final hvj b;
    public final smp0 c;
    public final f8w0 d;
    public final yqu0 e;
    public final h3h1 f = new h3h1(new g8w0(this, (byte) 1));
    public final cbr0 g;

    public h8w0(d8w0 d8w0Var, hvj hvjVar, smp0 smp0Var, f8w0 f8w0Var, yqu0 yqu0Var) {
        this.a = d8w0Var;
        this.b = hvjVar;
        this.c = smp0Var;
        this.d = f8w0Var;
        this.e = yqu0Var;
        dbr0 stm0Var = new stm0();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{stm0Var, new bn70(yon1.G1("BLUEJAY_BRIEF_PRESET_PICKER", "bluejay/brief-preset-picker", 224, "bluejay"), nik1.q6, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return hvj.b(this.b, f4p1.g(this.a), new j2i(-891561507, new dvt0(this, (byte) 13), true));
    }
}
