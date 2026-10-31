package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yph implements d6o0 {
    public final /* synthetic */ zph a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ ven0 c;

    public yph(zph zphVar, xtb0 xtb0Var, ven0 ven0Var) {
        this.a = zphVar;
        this.b = xtb0Var;
        this.c = ven0Var;
    }

    public final long h0(int i, long j, long j2) {
        zph zphVar = this.a;
        boolean zBooleanValue = ((Boolean) zphVar.a.getValue()).booleanValue();
        boolean zD = this.b.d();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        boolean z = i == 1;
        if (!zBooleanValue || zD || fIntBitsToFloat >= 0.0f || !z) {
            return 0L;
        }
        zphVar.a.setValue(Boolean.FALSE);
        ((Function0) this.c.getValue()).invoke();
        return 0L;
    }
}
