package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wu70 implements syq {
    public static final /* synthetic */ mma0[] W0 = {new cey0(wu70.class, "dataPool", "getDataPool()Lcom/spotify/kodiak/dataloader/DataPool;", 0)};
    public final gw70 N0;
    public final kly0 O0;
    public final u3e0 P0 = o2p1.n();
    public final f4r Q0;
    public final js20 R0;
    public final idd1 S0;
    public final qtw T0;
    public final ia00 U0;
    public final osw V0;
    public final boolean X;
    public final hs00 Y;
    public final l0x0 Z;
    public final kly0 a;
    public final u0i b;
    public final lzn0 c;
    public final vgm d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public wu70(kly0 kly0Var, u0i u0iVar, lzn0 lzn0Var, vgm vgmVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, hs00 hs00Var, l0x0 l0x0Var, gw70 gw70Var, jly0 jly0Var) {
        this.a = kly0Var;
        this.b = u0iVar;
        this.c = lzn0Var;
        this.d = vgmVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.t = z6;
        this.X = z7;
        this.Y = hs00Var;
        this.Z = l0x0Var;
        this.N0 = gw70Var;
        this.O0 = jly0Var;
        g4r g4rVar = new g4r((byte) 0);
        g4rVar.j(pu70.a, new xy50(this, (byte) 5));
        this.Q0 = g4rVar.k();
        this.R0 = w3p1.q(new uu70(this, (byte) 0), zr70.a1, new jb50(this, (byte) 15), (o8n) null, (iu30) null, 24);
        this.S0 = new idd1(new nd70(this, (byte) 4));
        this.T0 = f6o1.A(new c491(), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2);
        this.U0 = n3o1.q(this).a(oe60.O0, new bt70(this, (byte) 1));
        this.V0 = z5 ? f6o1.C(new rzj(this, (byte) 5)) : dxo1.v(new i6a(this, (byte) 3));
    }

    public final rqw a() {
        return this.U0;
    }

    public final rsw c() {
        return this.V0;
    }

    @Override // p.wul1
    public final d0r e() {
        mma0 mma0Var = W0[0];
        return this.P0.a();
    }

    public final ArrayList f(hv70 hv70Var) {
        List list = hv70Var.c;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            arrayList.add(new mu70((String) obj, i, hv70Var.a, r1p1.j(), hv70Var.f, this.f, this.g, hv70Var.e, false, this.h, this.Z, this.X, 4352));
            i = i2;
        }
        return arrayList;
    }

    public final mqw getBehavior() {
        return this.R0;
    }

    @Override // p.wul1
    public final f4r getData() {
        return this.Q0;
    }
}
