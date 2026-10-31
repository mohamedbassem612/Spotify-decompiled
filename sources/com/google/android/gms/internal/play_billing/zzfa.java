package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;
import p.cy30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzfa extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzfa(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbS = cy30.s(j, "Pos: ", ", limit: ");
        sbS.append(j2);
        sbS.append(", len: ");
        sbS.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbS.toString()), indexOutOfBoundsException);
    }

    public zzfa() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
