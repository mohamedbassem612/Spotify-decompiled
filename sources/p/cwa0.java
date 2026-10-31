package p;

import com.spotify.kidsaccount.api.v2.proto.NotEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cwa0 implements h0r0 {
    public final a8e0 a;
    public final bza0 b;
    public final c8w c;
    public final r8w d;
    public final yuj e;
    public final ge8 f;
    public final t8w g;
    public final boolean h;

    public cwa0(a8e0 a8e0Var, bza0 bza0Var, c8w c8wVar, r8w r8wVar, yuj yujVar, ge8 ge8Var, t8w t8wVar, boolean z) {
        this.a = a8e0Var;
        this.b = bza0Var;
        this.c = c8wVar;
        this.d = r8wVar;
        this.e = yujVar;
        this.f = ge8Var;
        this.g = t8wVar;
        this.h = z;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        t8w t8wVar = this.g;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(ezn1.r(t8wVar.a()), ezn1.v(t8wVar.a()), (nar0) null), new hgr0(egr0.a, 0, 2), new t1r0(true), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        if (this.h) {
            return yuj.b(this.e, f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 29)), apo.j(1775937311, new bt70(this, (byte) 15), true), new n7e0(new bwa0(this), new gs90(this, (byte) 12), xj20.h));
        }
        iza0 iza0Var = this.b.a;
        bgo0 bgo0VarO = NotEmpty.o();
        bgo0VarO.n();
        return a8e0.b(this.a, bbp1.g(iza0Var.c((NotEmpty) bgo0VarO.build()).map(o610.i).onErrorReturnItem(13)), new hu90(this, (byte) 17));
    }
}
