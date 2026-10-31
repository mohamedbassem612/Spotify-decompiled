package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vn31 extends fmb0 {
    public static final vn31 c = new vn31("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn31(String str, byte b) {
        super(str);
        this.b = b;
    }

    @Override // p.gfh0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo23measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                b7x b7xVar = b7x.a;
                if (size == 0) {
                    return ifh0Var.S(hjl.k(j), hjl.j(j), b7xVar, new ia4((byte) 15));
                }
                if (size == 1) {
                    q5t0 q5t0VarH = ((afh0) list.get(0)).H(j);
                    return ifh0Var.S(jjl.g(q5t0VarH.a, j), jjl.f(q5t0VarH.b, j), b7xVar, new aa4(q5t0VarH, (byte) 1));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    q5t0 q5t0VarH2 = ((afh0) list.get(i)).H(j);
                    iMax = Math.max(q5t0VarH2.a, iMax);
                    iMax2 = Math.max(q5t0VarH2.b, iMax2);
                    arrayList.add(q5t0VarH2);
                }
                return ifh0Var.S(jjl.g(iMax, j), jjl.f(iMax2, j), b7xVar, new z94(arrayList, (byte) 4));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
