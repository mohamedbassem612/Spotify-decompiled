package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p.a810;
import p.ajn0;
import p.b810;
import p.b8a0;
import p.beg;
import p.dcc;
import p.g6b0;
import p.h0p1;
import p.hqb0;
import p.hyc;
import p.j141;
import p.jyc;
import p.kht;
import p.koa1;
import p.o9r;
import p.ov30;
import p.wpb1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {
    public static final b8a0 Companion = new b8a0();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public a810 getContract() {
        return a810.a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0032, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public b810 isOverridable(hyc hycVar, hyc hycVar2, beg begVar) {
        jyc jycVar;
        jyc jycVarX;
        ov30 ov30Var;
        if ((hycVar instanceof jyc) && (hycVar2 instanceof ov30) && !g6b0.A(hycVar2)) {
            int i = dcc.l;
            ov30 ov30Var2 = (ov30) hycVar2;
            o9r o9rVar = (o9r) ov30Var2;
            ajn0 name = o9rVar.getName();
            Set set = koa1.e;
            if (set.contains(name)) {
                jycVar = (jyc) hycVar;
                jycVarX = wpb1.x(jycVar);
                if (jycVarX == null) {
                    if (set.contains(jycVar.getName())) {
                        jycVarX = kht.b(jycVar, j141.t);
                    } else {
                        jycVarX = null;
                    }
                }
                boolean z = hycVar instanceof ov30;
                if (z) {
                }
                if (ov30Var == null) {
                    Companion.getClass();
                    if (!b8a0.a(hycVar, hycVar2)) {
                        return b810.c;
                    }
                } else {
                    Companion.getClass();
                    if (!b8a0.a(hycVar, hycVar2)) {
                        return b810.c;
                    }
                }
            } else {
                if (koa1.j.contains(o9rVar.getName())) {
                    jycVar = (jyc) hycVar;
                    jycVarX = wpb1.x(jycVar);
                    if (jycVarX == null) {
                        if (set.contains(jycVar.getName())) {
                            jycVarX = null;
                        } else {
                            jycVarX = kht.b(jycVar, j141.t);
                        }
                    }
                    boolean z2 = hycVar instanceof ov30;
                    ov30Var = z2 ? (ov30) hycVar : null;
                    if (((ov30Var == null && ov30Var2.j0() == ov30Var.j0()) || (jycVarX != null && ov30Var2.j0())) && (!(begVar instanceof hqb0) || ov30Var2.d0() != null || jycVarX == null || wpb1.y(begVar, jycVarX) || ((jycVarX instanceof ov30) && z2 && dcc.a((ov30) jycVarX) != null && h0p1.m(ov30Var2, 2).equals(h0p1.m(((ov30) hycVar).w1(), 2))))) {
                        Companion.getClass();
                        if (!b8a0.a(hycVar, hycVar2)) {
                            return b810.c;
                        }
                    }
                } else {
                    Companion.getClass();
                    if (!b8a0.a(hycVar, hycVar2)) {
                        return b810.c;
                    }
                }
            }
        } else {
            Companion.getClass();
            if (!b8a0.a(hycVar, hycVar2)) {
                return b810.c;
            }
        }
        return b810.b;
    }
}
