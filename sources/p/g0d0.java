package p;

import com.spotify.player.esperanto.proto.EsPlayOrigin;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g0d0 {
    public final b0d0 a;
    public final iac0 b;
    public final ruz c;
    public k0d0 d;
    public String e;
    public final bpb1 f;
    public final jge g;

    public g0d0(b0d0 b0d0Var, iac0 iac0Var, ruz ruzVar) {
        this.a = b0d0Var;
        this.b = iac0Var;
        this.c = ruzVar;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.f = bpb1VarB;
        this.g = hu20.e(bpb1VarB, new f0d0(3, (lnm) null, (byte) 0));
    }

    public final yzc0 a(String str) {
        if (str.equals(this.e)) {
            k0d0 k0d0Var = this.d;
            if (k0d0Var != null) {
                return k0d0Var;
            }
            u890.C("listPlayer");
            throw null;
        }
        this.e = str;
        huz huzVar = new huz(w7x.a, (byte) 10);
        huz huzVar2 = new huz((Object) null, (byte) 10);
        b7x b7xVar = b7x.a;
        huz huzVar3 = new huz(b7xVar, (byte) 10);
        huz huzVar4 = new huz(b7xVar, (byte) 10);
        zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
        zpzVarY.s("prerelease");
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        zpzVarY.w(yon1.h4().c);
        k0d0 k0d0VarB = this.a.b(str, huzVar, this.b, this.c, huzVar2, zpzVarY.build(), huzVar3, huzVar4);
        this.d = k0d0VarB;
        this.f.m((Object) null, k0d0VarB);
        k0d0 k0d0Var2 = this.d;
        if (k0d0Var2 != null) {
            return k0d0Var2;
        }
        u890.C("listPlayer");
        throw null;
    }
}
