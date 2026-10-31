package p;

import java.util.Optional;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lwb1 implements tyq {
    public final d0r a;
    public final gw70 b;
    public final Optional c;
    public final g931 d;
    public volatile Function0 e;
    public final o3r f = w3p1.n(new l4r(v061.c, 1, cgb1.Y0, new j4r(cgb1.T0), cgb1.Z0), new l4r(hvm.d, 2, cgb1.W0, new j4r(cgb1.U0), cgb1.X0), nva1.T0);
    public final js20 g = x3p1.n(new jwb1(this, 0), cgb1.R0, new wh91(this, 26), (o8n) null, new jwb1(this, 1), 8);
    public final ia00 h = n3o1.q(this).a(vva1.V0, vva1.W0);
    public final psw i;

    public lwb1(d0r d0rVar, gw70 gw70Var, Optional optional, t9q t9qVar) {
        this.a = d0rVar;
        this.b = gw70Var;
        this.c = optional;
        this.d = new g931(d0rVar, (t2j0) t9qVar.a.a.f2.get());
        j2i j2iVar = new j2i(-1578621299, new vsb1(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.g;
    }

    public final f4r getData() {
        return this.f;
    }
}
