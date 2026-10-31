package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j9k0 implements h0r0 {
    public final qyj a;
    public final l9k0 b;
    public final bsp c;
    public final ysp d;
    public final kly0 e;
    public final f1n0 f;
    public final ahk0 g;
    public final cbr0 h;

    public j9k0(qyj qyjVar, l9k0 l9k0Var, bsp bspVar, ysp yspVar, bsp bspVar2, f1n0 f1n0Var, ahk0 ahk0Var) {
        this.a = qyjVar;
        this.b = l9k0Var;
        this.c = bspVar;
        this.d = yspVar;
        this.e = bspVar2;
        this.f = f1n0Var;
        this.g = ahk0Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarJ3 = yon1.J3();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.h = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarJ3, oap1.i("spotify:internal:playlist-overlap-messaging"), (nar0) null), new t1r0(true), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1282669299, new i9k0(this, (byte) 1), true));
    }
}
