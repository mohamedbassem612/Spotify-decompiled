package androidx.datastore.preferences.protobuf;

import p.ac01;
import p.b010;
import p.ihc;
import p.jc9;
import p.pze0;
import p.qwg;
import p.tm41;
import p.wz00;
import p.xih1;
import p.ye40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h implements tm41 {
    public final a a;
    public final j b;
    public final b010 c;

    public h(j jVar, b010 b010Var, a aVar) {
        this.b = jVar;
        b010Var.getClass();
        this.c = b010Var;
        this.a = aVar;
    }

    public static h j(j jVar, b010 b010Var, a aVar) {
        return new h(jVar, b010Var, aVar);
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
        return ((ye40) this.a.d(5)).b();
    }

    public final int d(a aVar) {
        this.b.getClass();
        k kVar = ((e) aVar).unknownFields;
        int i = kVar.d;
        if (i != -1) {
            return i;
        }
        int iR0 = 0;
        for (int i2 = 0; i2 < kVar.a; i2++) {
            int i3 = kVar.b[i2] >>> 3;
            iR0 += qwg.r0(3, (ihc) kVar.c[i2]) + qwg.S0(2, i3) + (qwg.R0(1) * 2);
        }
        kVar.d = iR0;
        return iR0;
    }

    public final void e(e eVar, e eVar2) {
        i.w(this.b, eVar, eVar2);
    }

    public final void f(Object obj, jc9 jc9Var) {
        this.c.getClass();
        pze0.m(obj);
        throw null;
    }

    public final int g(e eVar) {
        this.b.getClass();
        return eVar.unknownFields.hashCode();
    }

    public final boolean h(e eVar, e eVar2) {
        xih1 xih1Var = this.b;
        xih1Var.getClass();
        k kVar = eVar.unknownFields;
        xih1Var.getClass();
        return kVar.equals(eVar2.unknownFields);
    }

    public final void i(Object obj, ac01 ac01Var, wz00 wz00Var) {
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
