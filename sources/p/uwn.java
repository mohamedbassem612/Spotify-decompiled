package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uwn {
    public final /* synthetic */ z7e0 a;
    public final /* synthetic */ w6e0 b;
    public final /* synthetic */ kvn c;
    public final /* synthetic */ q8n d;
    public final /* synthetic */ zwz0 e;
    public final /* synthetic */ t2j0 f;
    public final /* synthetic */ hto g;

    public uwn(eoc eocVar, z7e0 z7e0Var, w6e0 w6e0Var, kvn kvnVar, q8n q8nVar, zwz0 zwz0Var, t2j0 t2j0Var, hto htoVar) {
        this.a = z7e0Var;
        this.b = w6e0Var;
        this.c = kvnVar;
        this.d = q8nVar;
        this.e = zwz0Var;
        this.f = t2j0Var;
        this.g = htoVar;
    }

    public static h72 a(uwn uwnVar, c7g1 c7g1Var, ioc iocVar, PlayOrigin playOrigin, n6r0 n6r0Var) {
        rwn rwnVar = rwn.b;
        t45 t45VarB = iocVar.b();
        o3e0 o3e0Var = new o3e0(new dp5(t45VarB, (byte) 23), iocVar, t45VarB, (byte) 4);
        z7e0 z7e0Var = uwnVar.a;
        w6e0 w6e0Var = uwnVar.b;
        return new h72(z7e0Var, w6e0Var, new kjk(w6e0Var, uwnVar.f, (byte) 27), uwnVar.c, uwnVar.d, c7g1Var, iocVar, o3e0Var, playOrigin, new m3n(uwnVar.g, n6r0Var, rwnVar, (byte) 1), uwnVar.e, (byte) 7);
    }
}
