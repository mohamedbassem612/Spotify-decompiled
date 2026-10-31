package p;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bkz {
    public static final bkz a = new bkz();
    public static final yhz b = yhz.a;
    public static final kgz c = new kgz(ajn0.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final wjz d = b(zjz.h, new String[0]);
    public static final wjz e = b(zjz.U0, new String[0]);
    public static final Set f = Collections.singleton(new fiz());

    public static final wiz a(int i, boolean z, String... strArr) {
        if (!z) {
            return new wiz(i, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new ghe1(i, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final wjz b(zjz zjzVar, String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return d(zjzVar, z6x.a, c(zjzVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static yjz c(zjz zjzVar, String... strArr) {
        return new yjz(zjzVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static wjz d(zjz zjzVar, List list, h0h1 h0h1Var, String... strArr) {
        return new wjz(h0h1Var, a(7, false, (String[]) Arrays.copyOf(new String[]{h0h1Var.toString()}, 1)), zjzVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean e(n9r n9rVar) {
        if (n9rVar != null) {
            return (n9rVar instanceof kgz) || (n9rVar.k() instanceof kgz) || n9rVar == b;
        }
        return false;
    }
}
