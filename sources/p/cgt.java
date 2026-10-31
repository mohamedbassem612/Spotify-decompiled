package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cgt implements Function0 {
    public final /* synthetic */ byte a;
    public final dgt b;

    public /* synthetic */ cgt(dgt dgtVar, byte b) {
        this.a = b;
        this.b = dgtVar;
    }

    public final Object invoke() {
        byte b = this.a;
        dgt dgtVar = this.b;
        switch (b) {
            case 0:
                fey0 fey0VarC = dgtVar.z().z().c();
                return fey0VarC == null ? sj1.j(dgtVar.z().z(), rzs0.g) : fey0VarC;
            default:
                return j82.z(dgtVar, false);
        }
    }
}
