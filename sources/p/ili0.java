package p;

import android.app.Activity;
import com.spotify.familyviewservice.v1.GetMemberDetailsRequest;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ili0 implements h0r0 {
    public final yuj a;
    public final gj10 b;
    public final lli0 c;
    public final af10 d;
    public final lzn0 e;
    public final hwa0 f;
    public final rki0 g;
    public final mli0 h;
    public final wpv0 i;
    public final boolean j;
    public final zhh1 k;
    public final Activity l;
    public final u7e0 m;

    public ili0(yuj yujVar, gj10 gj10Var, lli0 lli0Var, af10 af10Var, lzn0 lzn0Var, hwa0 hwa0Var, rki0 rki0Var, mli0 mli0Var, wpv0 wpv0Var, boolean z, zhh1 zhh1Var, Activity activity, u7e0 u7e0Var) {
        this.a = yujVar;
        this.b = gj10Var;
        this.c = lli0Var;
        this.d = af10Var;
        this.e = lzn0Var;
        this.f = hwa0Var;
        this.g = rki0Var;
        this.h = mli0Var;
        this.i = wpv0Var;
        this.j = z;
        this.k = zhh1Var;
        this.l = activity;
        this.m = u7e0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.b4(), cfm0.i("spotify:account-management:member-details:", this.c.a(), nik1.h0), (nar0) null), new pu00(true), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        lli0 lli0Var = this.c;
        String strA = lli0Var.a();
        jo40 jo40VarO = GetMemberDetailsRequest.o();
        jo40VarO.n(strA);
        GetMemberDetailsRequest getMemberDetailsRequest = (GetMemberDetailsRequest) jo40VarO.build();
        gj10 gj10Var = this.b;
        hj10 hj10Var = gj10Var.a;
        getMemberDetailsRequest.getClass();
        return yuj.b(this.a, this.m.a(bbp1.g(hj10Var.g(getMemberDetailsRequest).map(new v9c(gj10Var, (byte) 10))), lli0Var.b() == 2, nik1.W1.a), apo.j(1171419755, new pah0(this, (byte) 5), true), new n7e0(new hli0(this), ish0.U0, yz10.N0));
    }
}
