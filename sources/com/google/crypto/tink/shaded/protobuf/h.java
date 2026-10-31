package com.google.crypto.tink.shaded.protobuf;

import p.a010;
import p.m36;
import p.ohc;
import p.pze0;
import p.rm41;
import p.td6;
import p.tz00;
import p.u8;
import p.we40;
import p.wih1;
import p.yb01;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h implements rm41 {
    public final u8 a;
    public final j b;
    public final a010 c;

    public h(j jVar, a010 a010Var, u8 u8Var) {
        this.b = jVar;
        a010Var.getClass();
        this.c = a010Var;
        this.a = u8Var;
    }

    public static h k(j jVar, a010 a010Var, u8 u8Var) {
        return new h(jVar, a010Var, u8Var);
    }

    public final void a(Object obj) {
        this.b.getClass();
        ((e) obj).unknownFields.e = false;
        this.c.getClass();
        pze0.m(obj);
        throw null;
    }

    public final boolean b(Object obj) {
        this.c.getClass();
        pze0.m(obj);
        throw null;
    }

    public final Object c() {
        return ((we40) this.a.f(5)).b();
    }

    public final void d(Object obj, d dVar) {
        this.c.getClass();
        pze0.m(obj);
        throw null;
    }

    public final boolean e(e eVar, e eVar2) {
        wih1 wih1Var = this.b;
        wih1Var.getClass();
        k kVar = eVar.unknownFields;
        wih1Var.getClass();
        return kVar.equals(eVar2.unknownFields);
    }

    public final int f(e eVar) {
        this.b.getClass();
        return eVar.unknownFields.hashCode();
    }

    public final int g(u8 u8Var) {
        this.b.getClass();
        k kVar = ((e) u8Var).unknownFields;
        int i = kVar.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < kVar.a; i2++) {
            int i3 = kVar.b[i2] >>> 3;
            iA += c.a(3, (ohc) kVar.c[i2]) + c.i(i3) + c.h(2) + (c.h(1) * 2);
        }
        kVar.d = iA;
        return iA;
    }

    public final void h(e eVar, e eVar2) {
        i.w(this.b, eVar, eVar2);
    }

    public final void i(Object obj, byte[] bArr, int i, int i2, m36 m36Var) {
        e eVar = (e) obj;
        if (eVar.unknownFields == k.f) {
            eVar.unknownFields = k.b();
        }
        throw td6.k(obj);
    }

    public final void j(Object obj, yb01 yb01Var, tz00 tz00Var) {
        this.b.getClass();
        e eVar = (e) obj;
        if (eVar.unknownFields == k.f) {
            eVar.unknownFields = k.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
