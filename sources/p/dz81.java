package p;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dz81 {
    public final /* synthetic */ byte a;
    public final toj1 b;

    public dz81() {
        this.a = (byte) 2;
        this.b = new s7u0();
    }

    public final npj1 a(Context context, x8h x8hVar, mpj1 mpj1Var, Executor executor, long j, boolean z) {
        byte b = this.a;
        toj1 toj1Var = this.b;
        switch (b) {
            case 0:
                return new ez81(context, (yys) toj1Var, x8hVar, mpj1Var, executor, z);
            case 1:
                return new mym0(context, (yys) toj1Var, x8hVar, mpj1Var, executor, z);
            default:
                try {
                    return ((dz81) dz81.class.getConstructor(toj1.class).newInstance((s7u0) toj1Var)).a(context, x8hVar, mpj1Var, executor, j, z);
                } catch (Exception e) {
                    bhn0.p(e);
                    return null;
                }
        }
    }

    public /* synthetic */ dz81(yys yysVar, byte b) {
        this.a = b;
        this.b = yysVar;
    }
}
