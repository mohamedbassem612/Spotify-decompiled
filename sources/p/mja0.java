package p;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mja0 implements zpi0 {
    public static final /* synthetic */ mma0[] f = {new cey0(mja0.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    public final o860 b;
    public final nqb0 c;
    public final tqb0 d;
    public final toe0 e;

    public mja0(o860 o860Var, wb11 wb11Var, nqb0 nqb0Var) {
        this.b = o860Var;
        this.c = nqb0Var;
        this.d = new tqb0(o860Var, wb11Var, nqb0Var);
        this.e = new toe0((voe0) ((uw0) o860Var.b).d, new x5u(this, (byte) 17));
    }

    @Override // p.zpi0
    public final Collection a(ajn0 ajn0Var, int i) {
        lf30 lf30Var = this.c.f.a;
        ajn0Var.b();
        zpi0[] zpi0VarArrH = h();
        this.d.getClass();
        Collection collectionQ = z6x.a;
        for (zpi0 zpi0Var : zpi0VarArrH) {
            collectionQ = zpn1.q(collectionQ, zpi0Var.a(ajn0Var, i));
        }
        return collectionQ == null ? w7x.a : collectionQ;
    }

    @Override // p.zpi0
    public final Set b() {
        zpi0[] zpi0VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zpi0 zpi0Var : zpi0VarArrH) {
            r7h.W(zpi0Var.b(), linkedHashSet);
        }
        linkedHashSet.addAll(this.d.b());
        return linkedHashSet;
    }

    @Override // p.zpi0
    public final Collection c(ajn0 ajn0Var, int i) {
        lf30 lf30Var = this.c.f.a;
        ajn0Var.b();
        zpi0[] zpi0VarArrH = h();
        Collection collectionC = this.d.c(ajn0Var, i);
        for (zpi0 zpi0Var : zpi0VarArrH) {
            collectionC = zpn1.q(collectionC, zpi0Var.c(ajn0Var, i));
        }
        return collectionC == null ? w7x.a : collectionC;
    }

    @Override // p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        zpi0[] zpi0VarArrH = h();
        Collection collectionD = this.d.d(wgtVar, iu30Var);
        for (zpi0 zpi0Var : zpi0VarArrH) {
            collectionD = zpn1.q(collectionD, zpi0Var.d(wgtVar, iu30Var));
        }
        return collectionD == null ? w7x.a : collectionD;
    }

    @Override // p.zpi0
    public final Set e() {
        HashSet hashSetO = pto1.o(f46.G(h()));
        if (hashSetO == null) {
            return null;
        }
        hashSetO.addAll(this.d.e());
        return hashSetO;
    }

    @Override // p.zpi0
    public final Set f() {
        zpi0[] zpi0VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zpi0 zpi0Var : zpi0VarArrH) {
            r7h.W(zpi0Var.f(), linkedHashSet);
        }
        linkedHashSet.addAll(this.d.f());
        return linkedHashSet;
    }

    @Override // p.zpi0
    public final jfg g(ajn0 ajn0Var, int i) {
        lf30 lf30Var = this.c.f.a;
        ajn0Var.b();
        jfg jfgVar = null;
        beg begVarU = this.d.u(ajn0Var, null);
        if (begVarU != null) {
            return begVarU;
        }
        for (zpi0 zpi0Var : h()) {
            jfg jfgVarG = zpi0Var.g(ajn0Var, i);
            if (jfgVarG != null) {
                if (!(jfgVarG instanceof kfg) || !((zji0) jfgVarG).Z()) {
                    return jfgVarG;
                }
                if (jfgVar == null) {
                    jfgVar = jfgVarG;
                }
            }
        }
        return jfgVar;
    }

    public final zpi0[] h() {
        mma0 mma0Var = f[0];
        return (zpi0[]) this.e.invoke();
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
