package p;

import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o1q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ o1q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final xoy a(d0r d0rVar, ruz ruzVar, iac0 iac0Var, String str, p6r0 p6r0Var, String str2, iu30 iu30Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                i2q i2qVar = (i2q) r7qVar;
                ycm ycmVar = (ycm) i2qVar.c.Z0.get();
                teq teqVar = i2qVar.b;
                return new xoy(ycmVar, (wh1) teqVar.a.b9.get(), (j6q) teqVar.a.c9.get(), teqVar.B2(), new a5m(), teqVar.Y0(), new t0b((byte) 2), (b0d0) teqVar.Z6.get(), (q8n) i2qVar.a.r2.get(), d0rVar, ruzVar, iac0Var, str, p6r0Var, str2, iu30Var);
            case 1:
                r7q r7qVar2 = r7qVar;
                s7q s7qVar = (s7q) r7qVar2.d;
                return new xoy((ycm) s7qVar.Y4.get(), (wh1) s7qVar.B6.get(), (j6q) s7qVar.C6.get(), s7qVar.G3(), new a5m(), vwn.v((abm) s7qVar.h5.get(), Optional.of(s7qVar.b.j2())), new t0b((byte) 2), (b0d0) s7qVar.z6.get(), (q8n) r7qVar2.b.r2.get(), d0rVar, ruzVar, iac0Var, str, p6r0Var, str2, iu30Var);
            default:
                thq thqVar = (thq) r7qVar;
                teq teqVar2 = thqVar.c;
                return new xoy((ycm) teqVar2.b.P.get(), (wh1) teqVar2.a.b9.get(), (j6q) teqVar2.a.c9.get(), teqVar2.B2(), new a5m(), teqVar2.Y0(), new t0b((byte) 2), (b0d0) teqVar2.Z6.get(), (q8n) thqVar.b.r2.get(), d0rVar, ruzVar, iac0Var, str, p6r0Var, str2, iu30Var);
        }
    }
}
