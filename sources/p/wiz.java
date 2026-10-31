package p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class wiz implements zpi0 {
    public final String b;

    public wiz(int i, String... strArr) {
        String str;
        switch (i) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case 5:
                str = "Scope for stub type %s";
                break;
            case 6:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case 7:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // p.zpi0
    public /* bridge */ /* synthetic */ Collection a(ajn0 ajn0Var, int i) {
        return i(ajn0Var);
    }

    @Override // p.zpi0
    public Set b() {
        return w7x.a;
    }

    @Override // p.zpi0
    public /* bridge */ /* synthetic */ Collection c(ajn0 ajn0Var, int i) {
        return h(ajn0Var);
    }

    @Override // p.zpi0
    public Collection d(wgt wgtVar, iu30 iu30Var) {
        return z6x.a;
    }

    @Override // p.zpi0
    public Set e() {
        return w7x.a;
    }

    @Override // p.zpi0
    public Set f() {
        return w7x.a;
    }

    @Override // p.zpi0
    public jfg g(ajn0 ajn0Var, int i) {
        return new kgz(ajn0.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{ajn0Var}, 1))));
    }

    public Set h(ajn0 ajn0Var) {
        lhz lhzVar = new lhz(bkz.c, null, rzs0.g, ajn0.g("<Error function>"), 1, mka1.m0);
        wjz wjzVarB = bkz.b(zjz.e, new String[0]);
        lht lhtVar = mht.e;
        z6x z6xVar = z6x.a;
        lhzVar.B1(null, null, z6xVar, z6xVar, z6xVar, wjzVarB, 3, lhtVar);
        return Collections.singleton(lhzVar);
    }

    public Set i(ajn0 ajn0Var) {
        return bkz.f;
    }

    public String toString() {
        return gvg.k(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
