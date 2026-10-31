package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class dsm0 {
    public static final long a = fc11.G(14);

    public static final long b(long j, long j2) {
        if (!TextUnit.d(j2)) {
            hhg1.n(f4i1.f("The multiplier must be in em, but was ", TextUnit.f(j2), "."));
            return 0L;
        }
        if (TextUnit.d(j)) {
            eg.m(f4i1.f("Cannot convert Em to Px when style.fontSize is Em (", TextUnit.f(j2), "). Please declare the style.fontSize with Sp units instead."));
            return 0L;
        }
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            float fC = TextUnit.c(j2);
            fc11.o(j);
            return fc11.Y(TextUnit.c(j) * fC, j3);
        }
        float fC2 = TextUnit.c(j2);
        long j4 = a;
        fc11.o(j4);
        return fc11.Y(TextUnit.c(j4) * fC2, 1095216660480L & j4);
    }
}
