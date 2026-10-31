package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ikb0 extends hab0 implements Function0 {
    public final /* synthetic */ r3d a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ q8n f;
    public final /* synthetic */ long g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ pbr0 i;
    public final /* synthetic */ yqg t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikb0(r3d r3dVar, c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, Context context, q8n q8nVar, long j, ven0 ven0Var3, pbr0 pbr0Var, yqg yqgVar) {
        super(0);
        this.a = r3dVar;
        this.b = c9nVar;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = context;
        this.f = q8nVar;
        this.g = j;
        this.h = ven0Var3;
        this.i = pbr0Var;
        this.t = yqgVar;
    }

    public final Object invoke() {
        hkb0 hkb0Var = new hkb0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t);
        r3d r3dVar = this.a;
        r3dVar.c = hkb0Var;
        r3dVar.f = 2;
        if (x74.j(r3dVar.a, "android.permission.CAMERA") == 0) {
            r3dVar.c();
        } else {
            r3dVar.j.a("android.permission.CAMERA");
        }
        return rih1.a;
    }
}
