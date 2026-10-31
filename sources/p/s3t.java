package p;

import android.content.Context;
import android.os.Process;
import android.util.DisplayMetrics;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s3t extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ui8 b;
    public final /* synthetic */ z2t c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3t(ui8 ui8Var, z2t z2tVar, kb61 kb61Var, byte b) {
        super(0);
        this.a = b;
        this.b = ui8Var;
        this.c = z2tVar;
    }

    public final Object invoke() {
        byte b = this.a;
        z2t z2tVar = this.c;
        ui8 ui8Var = this.b;
        switch (b) {
            case 0:
                ui8Var.a();
                kly0 kly0Var = z2tVar.a;
                return p7h.M(new jlq0[]{new yil1(new File(((Context) new fcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 16).invoke()).getApplicationInfo().dataDir), Process.myPid()), new fjg(new ht50((t2j0) new fcp0(0, z2tVar.S1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11).invoke(), (DisplayMetrics) new fcp0(0, z2tVar.i, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12).invoke(), (Context) new fcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13).invoke(), new z550((dma1) new fcp0(0, z2tVar.r0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14).invoke()), new uc4(true, (luk) new fcp0(0, z2tVar.j, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15).invoke())), (byte) 4), new opw((Context) new fcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10).invoke(), (byte) 1), new fjg((ejg) new fcp0(0, z2tVar.W0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9).invoke(), (byte) 0)});
            default:
                ui8Var.a();
                return p7h.M(new jlq0[]{new wo5(ui8Var.d(), (cue0) new fcp0(0, z2tVar.M1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7).invoke()), new b2n0(ui8Var.d(), (r2b1) new fcp0(0, z2tVar.f2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1).invoke(), (n2b1) new fcp0(0, z2tVar.O1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2).invoke()), new fjg((Context) new fcp0(0, z2tVar.a, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0).invoke(), (byte) 2), new wo5((w2n) new dcp0(0, z2tVar.J0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28).invoke(), ui8Var.d(), (byte) 3), new wo5((ndb0) new dcp0(0, z2tVar.N0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27).invoke(), ui8Var.d(), (byte) 0), new wo5((lur) new fcp0(0, z2tVar.P0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3).invoke(), ui8Var.d(), (byte) 6), new wo5((im01) new fcp0(0, z2tVar.L1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6).invoke(), ui8Var.d(), (byte) 8), new fjg((ktr) new dcp0(0, z2tVar.x0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29).invoke(), (byte) 1), new fjg((uwv0) new fcp0(0, z2tVar.a0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5).invoke(), (byte) 7), new wo5((m451) new fcp0(0, z2tVar.g1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8).invoke(), ui8Var.d(), (byte) 11), new fjg((q6v0) new fcp0(0, z2tVar.u0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4).invoke(), (byte) 6)});
        }
    }
}
