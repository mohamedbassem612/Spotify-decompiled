package com.google.crypto.tink.shaded.protobuf;

import p.qxy0;
import p.yb01;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class j {
    public final boolean a(Object obj, yb01 yb01Var) throws InvalidProtocolBufferException {
        int tag = yb01Var.getTag();
        int iX = qxy0.x(tag);
        int iY = qxy0.y(tag);
        if (iY == 0) {
            ((k) obj).c(qxy0.A(iX, 0), Long.valueOf(yb01Var.F()));
            return true;
        }
        if (iY == 1) {
            ((k) obj).c(qxy0.A(iX, 1), Long.valueOf(yb01Var.a()));
            return true;
        }
        if (iY == 2) {
            ((k) obj).c(qxy0.A(iX, 2), yb01Var.n());
            return true;
        }
        if (iY != 3) {
            if (iY == 4) {
                return false;
            }
            if (iY != 5) {
                throw InvalidProtocolBufferException.b();
            }
            ((k) obj).c(qxy0.A(iX, 5), Integer.valueOf(yb01Var.t()));
            return true;
        }
        k kVarB = k.b();
        int iA = qxy0.A(iX, 4);
        while (yb01Var.z() != Integer.MAX_VALUE && a(kVarB, yb01Var)) {
        }
        if (iA != yb01Var.getTag()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        kVarB.e = false;
        ((k) obj).c(qxy0.A(iX, 3), kVarB);
        return true;
    }
}
