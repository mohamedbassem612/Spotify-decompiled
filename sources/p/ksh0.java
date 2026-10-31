package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ksh0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ksh0(pt ptVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = ptVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        pt ptVar = this.b;
        switch (b) {
            case 0:
                ((r3d) ptVar.f).a(new gu2(ptVar, 1, iu30Var, (byte) 23));
                break;
            default:
                r3d r3dVar = (r3d) ptVar.f;
                r3dVar.c = new gu2(ptVar, 2, iu30Var, (byte) 23);
                r3dVar.f = 2;
                if (x74.j(r3dVar.a, "android.permission.CAMERA") != 0) {
                    r3dVar.j.a("android.permission.CAMERA");
                } else {
                    r3dVar.c();
                }
                break;
        }
        return rih1Var;
    }
}
