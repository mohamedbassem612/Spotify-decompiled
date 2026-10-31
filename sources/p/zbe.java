package p;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zbe implements zpi0 {
    public final String b;
    public final zpi0[] c;

    public zbe(String str, zpi0[] zpi0VarArr) {
        this.b = str;
        this.c = zpi0VarArr;
    }

    @Override // p.zpi0
    public final Collection a(ajn0 ajn0Var, int i) {
        zpi0[] zpi0VarArr = this.c;
        int length = zpi0VarArr.length;
        if (length == 0) {
            return z6x.a;
        }
        if (length == 1) {
            return zpi0VarArr[0].a(ajn0Var, i);
        }
        Collection collectionQ = null;
        for (zpi0 zpi0Var : zpi0VarArr) {
            collectionQ = zpn1.q(collectionQ, zpi0Var.a(ajn0Var, i));
        }
        return collectionQ == null ? w7x.a : collectionQ;
    }

    @Override // p.zpi0
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zpi0 zpi0Var : this.c) {
            r7h.W(zpi0Var.b(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // p.zpi0
    public final Collection c(ajn0 ajn0Var, int i) {
        zpi0[] zpi0VarArr = this.c;
        int length = zpi0VarArr.length;
        if (length == 0) {
            return z6x.a;
        }
        if (length == 1) {
            return zpi0VarArr[0].c(ajn0Var, i);
        }
        Collection collectionQ = null;
        for (zpi0 zpi0Var : zpi0VarArr) {
            collectionQ = zpn1.q(collectionQ, zpi0Var.c(ajn0Var, i));
        }
        return collectionQ == null ? w7x.a : collectionQ;
    }

    @Override // p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        zpi0[] zpi0VarArr = this.c;
        int length = zpi0VarArr.length;
        if (length == 0) {
            return z6x.a;
        }
        if (length == 1) {
            return zpi0VarArr[0].d(wgtVar, iu30Var);
        }
        Collection collectionQ = null;
        for (zpi0 zpi0Var : zpi0VarArr) {
            collectionQ = zpn1.q(collectionQ, zpi0Var.d(wgtVar, iu30Var));
        }
        return collectionQ == null ? w7x.a : collectionQ;
    }

    @Override // p.zpi0
    public final Set e() {
        return pto1.o(f46.G(this.c));
    }

    @Override // p.zpi0
    public final Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zpi0 zpi0Var : this.c) {
            r7h.W(zpi0Var.f(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // p.zpi0
    public final jfg g(ajn0 ajn0Var, int i) {
        jfg jfgVar = null;
        for (zpi0 zpi0Var : this.c) {
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

    public final String toString() {
        return this.b;
    }
}
