package p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o7c0 implements mu61 {
    public final /* synthetic */ byte a;
    public final kly0 b;
    public final p6r0 c;
    public final lik1 d;
    public final Set e;

    public o7c0(jly0 jly0Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = jly0Var;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                this.c = yon1.G1("HIFI_SETTINGS_SHEET_QUALITY", "hifi/settings-sheet/quality", 792, "hifi");
                this.d = nik1.d3;
                this.e = Collections.singleton(blc0.Ia);
                break;
            default:
                this.b = jly0Var;
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                this.c = yon1.i5();
                this.d = nik1.w4;
                this.e = Collections.singleton(blc0.N9);
                break;
        }
    }

    @Override // p.mu61
    public final Set a() {
        byte b = this.a;
        return this.e;
    }

    @Override // p.mu61
    public final kly0 c() {
        byte b = this.a;
        return this.b;
    }

    @Override // p.mu61
    public final p6r0 e() {
        byte b = this.a;
        return this.c;
    }

    @Override // p.mu61
    public final lik1 getViewUri() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    public o7c0(thq thqVar) {
        this.a = (byte) 1;
        this.b = thqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = yon1.G1("LISTENINGACTIVITY_SETTINGS", "listeningactivity/settings", 916, "listeningactivity");
        this.d = nik1.x4;
        this.e = Collections.singleton(blc0.V9);
    }
}
