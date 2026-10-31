package com.google.protobuf;

import p.poz0;
import p.zb01;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class m {
    public n a(Object obj) {
        h hVar = (h) obj;
        n nVar = hVar.unknownFields;
        if (nVar != n.f) {
            return nVar;
        }
        n nVar2 = new n();
        hVar.unknownFields = nVar2;
        return nVar2;
    }

    public final boolean b(int i, Object obj, zb01 zb01Var) throws InvalidProtocolBufferException {
        int tag = zb01Var.getTag();
        int iW = poz0.w(tag);
        int iX = poz0.x(tag);
        if (iX == 0) {
            ((n) obj).f(poz0.E(iW, 0), Long.valueOf(zb01Var.F()));
            return true;
        }
        if (iX == 1) {
            ((n) obj).f(poz0.E(iW, 1), Long.valueOf(zb01Var.a()));
            return true;
        }
        if (iX == 2) {
            ((n) obj).f(poz0.E(iW, 2), zb01Var.n());
            return true;
        }
        if (iX != 3) {
            if (iX == 4) {
                if (i != 0) {
                    return false;
                }
                throw InvalidProtocolBufferException.a();
            }
            if (iX != 5) {
                throw InvalidProtocolBufferException.d();
            }
            ((n) obj).f(poz0.E(iW, 5), Integer.valueOf(zb01Var.t()));
            return true;
        }
        n nVar = new n();
        int iE = poz0.E(iW, 4);
        int i2 = i + 1;
        if (i2 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zb01Var.z() != Integer.MAX_VALUE && b(i2, nVar, zb01Var)) {
        }
        if (iE != zb01Var.getTag()) {
            throw InvalidProtocolBufferException.a();
        }
        if (nVar.e) {
            nVar.e = false;
        }
        ((n) obj).f(poz0.E(iW, 3), nVar);
        return true;
    }

    public void c(Object obj, Object obj2) {
        ((h) obj).unknownFields = (n) obj2;
    }
}
