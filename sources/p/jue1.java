package p;

import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jue1 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uvg1 b;

    public /* synthetic */ jue1(uvg1 uvg1Var, byte b) {
        this.a = b;
        this.b = uvg1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        uvg1 uvg1Var = this.b;
        switch (b) {
            case 0:
                return pap1.t(Long.valueOf(Math.abs(((uvg1) obj).a - uvg1Var.a)), Long.valueOf(Math.abs(((uvg1) obj2).a - uvg1Var.a)));
            default:
                return pap1.t(Long.valueOf(Math.abs(((uvg1) obj).b - uvg1Var.b)), Long.valueOf(Math.abs(((uvg1) obj2).b - uvg1Var.b)));
        }
    }
}
