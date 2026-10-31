package androidx.glance.appwidget.protobuf;

import p.fhc;
import p.fp8;
import p.owg;
import p.pze0;
import p.qm41;
import p.sz00;
import p.ve40;
import p.zz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h implements qm41 {
    public final a a;
    public final j b;
    public final zz00 c;

    public h(j jVar, zz00 zz00Var, a aVar) {
        this.b = jVar;
        zz00Var.getClass();
        this.c = zz00Var;
        this.a = aVar;
    }

    @Override // p.qm41
    public final void a(Object obj) {
        ((l) this.b).getClass();
        k kVar = ((e) obj).unknownFields;
        if (kVar.e) {
            kVar.e = false;
        }
        this.c.getClass();
        pze0.m(obj);
        throw null;
    }

    @Override // p.qm41
    public final boolean b(Object obj) {
        this.c.getClass();
        pze0.m(obj);
        throw null;
    }

    @Override // p.qm41
    public final e c() {
        e eVar = this.a;
        return eVar instanceof e ? eVar.h() : ((ve40) eVar.b(5)).b();
    }

    @Override // p.qm41
    public final void d(Object obj, Object obj2) {
        i.k(this.b, obj, obj2);
    }

    @Override // p.qm41
    public final int e(e eVar) {
        ((l) this.b).getClass();
        return eVar.unknownFields.hashCode();
    }

    @Override // p.qm41
    public final void f(Object obj, fp8 fp8Var) {
        this.c.getClass();
        pze0.m(obj);
        throw null;
    }

    @Override // p.qm41
    public final int g(e eVar) {
        ((l) this.b).getClass();
        k kVar = eVar.unknownFields;
        int i = kVar.d;
        if (i != -1) {
            return i;
        }
        int iI0 = 0;
        for (int i2 = 0; i2 < kVar.a; i2++) {
            int i3 = kVar.b[i2] >>> 3;
            iI0 += owg.i0(3, (fhc) kVar.c[i2]) + owg.l0(i3) + owg.k0(2) + (owg.k0(1) * 2);
        }
        kVar.d = iI0;
        return iI0;
    }

    @Override // p.qm41
    public final void h(Object obj, d dVar, sz00 sz00Var) {
        this.b.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p.qm41
    public final boolean i(e eVar, e eVar2) {
        l lVar = (l) this.b;
        lVar.getClass();
        k kVar = eVar.unknownFields;
        lVar.getClass();
        return kVar.equals(eVar2.unknownFields);
    }
}
