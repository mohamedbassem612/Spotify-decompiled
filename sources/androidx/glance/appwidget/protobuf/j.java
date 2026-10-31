package androidx.glance.appwidget.protobuf;

import p.czh0;
import p.ngc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class j {
    public k a(Object obj) {
        e eVar = (e) obj;
        k kVar = eVar.unknownFields;
        if (kVar != k.f) {
            return kVar;
        }
        k kVar2 = new k(0, new int[8], new Object[8], true);
        eVar.unknownFields = kVar2;
        return kVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final boolean b(int i, d dVar, Object obj) throws InvalidProtocolBufferException {
        ngc ngcVar = dVar.a;
        int i2 = dVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            dVar.w(0);
            ((k) obj).c(i3 << 3, Long.valueOf(ngcVar.p()));
            return true;
        }
        if (i4 == 1) {
            dVar.w(1);
            ((k) obj).c((i3 << 3) | 1, Long.valueOf(ngcVar.m()));
            return true;
        }
        if (i4 == 2) {
            ((k) obj).c((i3 << 3) | 2, dVar.f());
            return true;
        }
        if (i4 != 3) {
            if (i4 != 4) {
                if (i4 == 5) {
                    dVar.w(5);
                    ((k) obj).c(5 | (i3 << 3), Integer.valueOf(ngcVar.l()));
                    return true;
                }
                czh0.d();
            }
            return false;
        }
        k kVar = new k(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (dVar.b() != Integer.MAX_VALUE && b(i7, dVar, kVar)) {
        }
        if (i6 != dVar.b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (kVar.e) {
            kVar.e = false;
        }
        ((k) obj).c(i5 | 3, kVar);
        return true;
    }
}
