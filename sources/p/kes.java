package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kes extends jkr0 {
    public static final df41 I = kyo1.t(new ia4(7), new llj(9));
    public final hrr0 H;

    public kes(int i, float f, Function0 function0) {
        super(i, f);
        this.H = xto.t(function0);
    }

    @Override // p.jkr0
    public final int l() {
        return ((Number) ((Function0) this.H.getValue()).invoke()).intValue();
    }
}
