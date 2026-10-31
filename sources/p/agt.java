package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class agt implements Function0 {
    public final /* synthetic */ byte a;
    public final bgt b;

    public /* synthetic */ agt(bgt bgtVar, byte b) {
        this.a = b;
        this.b = bgtVar;
    }

    public final Object invoke() {
        byte b = this.a;
        bgt bgtVar = this.b;
        switch (b) {
            case 0:
                zdy0 zdy0VarB = bgtVar.z().z().b();
                if (zdy0VarB != null) {
                    return zdy0VarB;
                }
                zdy0 zdy0VarI = sj1.i(bgtVar.z().z(), rzs0.g);
                zdy0VarI.A1(bgtVar.z().z().getType());
                return zdy0VarI;
            default:
                return j82.z(bgtVar, true);
        }
    }
}
