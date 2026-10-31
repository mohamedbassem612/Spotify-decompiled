package p;

import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lue1 implements Comparator {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public lue1(long j, uvg1 uvg1Var) {
        this.b = j;
        this.c = uvg1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                uvg1 uvg1Var = (uvg1) obj;
                uvg1 uvg1Var2 = (uvg1) obj3;
                uvg1 uvg1Var3 = (uvg1) obj2;
                return pap1.t(Long.valueOf(Math.abs(uvg1Var.b - uvg1Var2.b) + Math.abs(uvg1Var.a - uvg1Var2.a) + Math.abs(uvg1Var.c - j)), Long.valueOf(Math.abs(uvg1Var3.b - uvg1Var2.b) + Math.abs(uvg1Var3.a - uvg1Var2.a) + Math.abs(uvg1Var3.c - j)));
            default:
                int iCompare = ((lue1) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : pap1.t(Long.valueOf(Math.abs(((uvg1) obj).c - j)), Long.valueOf(Math.abs(((uvg1) obj2).c - j)));
        }
    }

    public lue1(lue1 lue1Var, long j) {
        this.c = lue1Var;
        this.b = j;
    }
}
