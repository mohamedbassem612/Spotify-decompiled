package com.google.protobuf;

import java.io.IOException;
import java.util.Locale;
import p.cy30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class CodedOutputStream$OutOfSpaceException extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public CodedOutputStream$OutOfSpaceException(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbS = cy30.s(i, "Pos: ", ", limit: ");
        sbS.append(i2);
        sbS.append(", len: ");
        sbS.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbS.toString()), indexOutOfBoundsException);
    }

    public CodedOutputStream$OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public CodedOutputStream$OutOfSpaceException() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
