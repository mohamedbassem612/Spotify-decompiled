package p;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e551 extends hab0 implements Function0 {
    public final /* synthetic */ xtb0 a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;
    public final /* synthetic */ List h;
    public final /* synthetic */ ven0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e551(xtb0 xtb0Var, ven0 ven0Var, ven0 ven0Var2, boolean z, int i, int i2, List list, List list2, ven0 ven0Var3) {
        super(0);
        this.a = xtb0Var;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = list;
        this.h = list2;
        this.i = ven0Var3;
    }

    public final Object invoke() {
        boolean zIsEmpty;
        tob1 tob1Var;
        Map map;
        Set setEntrySet;
        x751 x751Var;
        x751 x751Var2;
        ptb0 ptb0VarH = this.a.h();
        qtb0 qtb0Var = (qtb0) o7h.C0(ptb0VarH.l);
        tob1 tob1Var2 = this.b;
        Map map2 = (tob1Var2 == null || (x751Var2 = (x751) tob1Var2.getValue()) == null) ? null : x751Var2.d;
        boolean z = false;
        if ((tob1Var2 == null || (x751Var = (x751) tob1Var2.getValue()) == null || !x751Var.c) && ((map2 == null || ((tob1Var = this.c) != null && (map = (Map) tob1Var.getValue()) != null && (setEntrySet = map.entrySet()) != null && setEntrySet.containsAll(map2.entrySet()))) && (!this.d || ((rnc0) this.i.getValue()).a != this.e))) {
            int iC = l1d.C(this.f);
            List list = this.h;
            List list2 = this.g;
            if (iC == 0) {
                int size = ptb0VarH.l.size();
                if (list2.isEmpty()) {
                    zIsEmpty = list.isEmpty();
                } else {
                    zIsEmpty = !list.isEmpty() && k1o1.l(list, list2) && size > 0;
                }
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                zIsEmpty = k1o1.m(list2, list, qtb0Var != null ? qtb0Var.a : -1, qtb0Var != null ? qtb0Var.p + qtb0Var.q : -1, ptb0VarH.n);
            }
            if (zIsEmpty) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
