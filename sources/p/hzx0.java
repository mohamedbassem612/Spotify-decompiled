package p;

import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hzx0 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ hzx0(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                return pap1.t(Integer.valueOf(ihc1.w0(str, ((wwx0) ((mmr0) obj2).a).g, 0, false, 6)), Integer.valueOf(ihc1.w0(str, ((wwx0) ((mmr0) obj).a).g, 0, false, 6)));
            case 1:
                a0s0 a0s0Var = (a0s0) obj;
                a0s0 a0s0Var2 = (a0s0) obj2;
                return sxh.a.e(a0s0Var.e, a0s0Var2.e).e(u890.j(a0s0Var.f, str), u890.j(a0s0Var2.f, str)).f();
            default:
                return pap1.t(Integer.valueOf(ihc1.w0(str, ((mae1) obj).a, 0, false, 6)), Integer.valueOf(ihc1.w0(str, ((mae1) obj2).a, 0, false, 6)));
        }
    }
}
