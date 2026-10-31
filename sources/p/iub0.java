package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iub0 implements zpi0 {
    public final /* synthetic */ byte b = 0;
    public final Object c;

    public iub0(s1c1 s1c1Var, Function0 function0) {
        this.c = new toe0((voe0) s1c1Var, new bit(function0, (byte) 1));
    }

    @Override // p.zpi0
    public Collection a(ajn0 ajn0Var, int i) {
        switch (this.b) {
            case 1:
                return j9k1.E(k(ajn0Var, i), j141.N0);
            default:
                return k(ajn0Var, i);
        }
    }

    @Override // p.zpi0
    public final Set b() {
        return l().b();
    }

    @Override // p.zpi0
    public Collection c(ajn0 ajn0Var, int i) {
        switch (this.b) {
            case 1:
                return j9k1.E(j(ajn0Var, i), j141.Z);
            default:
                return j(ajn0Var, i);
        }
    }

    @Override // p.zpi0
    public Collection d(wgt wgtVar, iu30 iu30Var) {
        switch (this.b) {
            case 1:
                Collection collectionI = i(wgtVar, iu30Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((n9r) obj) instanceof hyc) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return o7h.N0(arrayList2, j9k1.E(arrayList, j141.O0));
            default:
                return i(wgtVar, iu30Var);
        }
    }

    @Override // p.zpi0
    public final Set e() {
        return l().e();
    }

    @Override // p.zpi0
    public final Set f() {
        return l().f();
    }

    @Override // p.zpi0
    public final jfg g(ajn0 ajn0Var, int i) {
        return l().g(ajn0Var, i);
    }

    public final zpi0 h() {
        return l() instanceof iub0 ? ((iub0) l()).h() : l();
    }

    public final Collection i(wgt wgtVar, iu30 iu30Var) {
        return l().d(wgtVar, iu30Var);
    }

    public final Collection j(ajn0 ajn0Var, int i) {
        return l().c(ajn0Var, i);
    }

    public final Collection k(ajn0 ajn0Var, int i) {
        return l().a(ajn0Var, i);
    }

    public final zpi0 l() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (zpi0) ((toe0) obj).invoke();
            default:
                return (zpi0) obj;
        }
    }

    public iub0(zpi0 zpi0Var) {
        this.c = zpi0Var;
    }
}
