package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b4q implements n3d0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ b4q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final r3d0 a(String str) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                thq thqVar = (thq) r7qVar;
                Context context = (Context) thqVar.b.x1.a;
                v5q v5qVar = thqVar.c;
                return new r3d0(context, str, (e4q) v5qVar.N1.get(), v5qVar.g0());
            default:
                r7q r7qVar2 = r7qVar;
                Context context2 = (Context) r7qVar2.b.x1.a;
                teq teqVar = r7qVar2.d;
                return new r3d0(context2, str, (e4q) teqVar.S5.get(), teqVar.i2());
        }
    }
}
