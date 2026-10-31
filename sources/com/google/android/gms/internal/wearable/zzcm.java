package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.Locale;
import p.cy30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzcm extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzcm(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbS = cy30.s(j, "Pos: ", ", limit: ");
        sbS.append(j2);
        sbS.append(", len: ");
        sbS.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbS.toString()), indexOutOfBoundsException);
    }

    public zzcm() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
