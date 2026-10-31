package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c8a0 extends xw81 implements o7a0 {
    public static final yht g1 = new yht();
    public static final yht h1 = new yht();
    public int e1;
    public final boolean f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8a0(n9r n9rVar, xw81 xw81Var, fg5 fg5Var, ajn0 ajn0Var, int i, mka1 mka1Var, boolean z) {
        super(n9rVar, xw81Var, fg5Var, ajn0Var, i, mka1Var);
        if (n9rVar == null) {
            r0(0);
            throw null;
        }
        if (fg5Var == null) {
            r0(1);
            throw null;
        }
        if (ajn0Var == null) {
            r0(2);
            throw null;
        }
        if (i == 0) {
            r0(3);
            throw null;
        }
        this.e1 = 0;
        this.f1 = z;
    }

    public static c8a0 L1(n9r n9rVar, eqb0 eqb0Var, ajn0 ajn0Var, g141 g141Var, boolean z) {
        if (n9rVar == null) {
            r0(5);
            throw null;
        }
        if (ajn0Var != null) {
            return new c8a0(n9rVar, null, eqb0Var, ajn0Var, 1, g141Var, z);
        }
        r0(7);
        throw null;
    }

    public static /* synthetic */ void r0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.xw81
    public final xw81 K1(rob0 rob0Var, rob0 rob0Var2, List list, List list2, List list3, a8b0 a8b0Var, int i, lht lhtVar, Map map) {
        bvf bvfVar;
        if (list == null) {
            r0(9);
            throw null;
        }
        if (list2 == null) {
            r0(10);
            throw null;
        }
        if (list3 == null) {
            r0(11);
            throw null;
        }
        if (lhtVar == null) {
            r0(12);
            throw null;
        }
        super.K1(rob0Var, rob0Var2, list, list2, list3, a8b0Var, i, lhtVar, map);
        for (bzf bzfVar : cmq0.a) {
            se11 se11Var = bzfVar.b;
            ajn0 ajn0Var = bzfVar.a;
            if (ajn0Var == null || u890.j(getName(), ajn0Var)) {
                if (se11Var == null || se11Var.e(getName().b())) {
                    Collection collection = bzfVar.c;
                    if (collection == null || collection.contains(getName())) {
                        for (htf htfVar : bzfVar.e) {
                            if (htfVar.b(this) != null) {
                                bvfVar = new bvf(false);
                                this.N0 = bvfVar.a;
                                return this;
                            }
                        }
                        bvfVar = ((String) bzfVar.d.invoke(this)) != null ? new bvf(false) : bvf.c;
                        this.N0 = bvfVar.a;
                        return this;
                    }
                }
            }
        }
        bvfVar = bvf.b;
        this.N0 = bvfVar.a;
        return this;
    }

    public final void M1(boolean z, boolean z2) {
        int i;
        if (z) {
            i = z2 ? 4 : 2;
        } else {
            i = z2 ? 3 : 1;
        }
        this.e1 = i;
    }

    @Override // p.qv30, p.hyc
    public final boolean Y() {
        return ab80.f(this.e1);
    }

    @Override // p.o7a0
    public final o7a0 s(a8b0 a8b0Var, ArrayList arrayList, a8b0 a8b0Var2, mmr0 mmr0Var) {
        ArrayList arrayListW = xto1.w(arrayList, F(), this);
        rob0 rob0VarN = a8b0Var == null ? null : sj1.n(this, a8b0Var, rzs0.g);
        pv30 pv30VarC1 = C1(l1h1.b);
        pv30VarC1.g = arrayListW;
        pv30VarC1.X = a8b0Var2;
        pv30VarC1.i = rob0VarN;
        pv30VarC1.P0 = true;
        pv30VarC1.O0 = true;
        c8a0 c8a0Var = (c8a0) pv30VarC1.X0.z1(pv30VarC1);
        if (mmr0Var != null) {
            yht yhtVar = (yht) mmr0Var.a;
            Object obj = mmr0Var.b;
            Map linkedHashMap = c8a0Var.d1;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                c8a0Var.d1 = linkedHashMap;
            }
            linkedHashMap.put(yhtVar, obj);
        }
        if (c8a0Var != null) {
            return c8a0Var;
        }
        r0(21);
        throw null;
    }

    @Override // p.xw81, p.qv30
    public final qv30 y1(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var) {
        if (n9rVar == null) {
            r0(14);
            throw null;
        }
        if (i == 0) {
            r0(15);
            throw null;
        }
        if (fg5Var == null) {
            r0(16);
            throw null;
        }
        xw81 xw81Var = (xw81) ov30Var;
        if (ajn0Var == null) {
            ajn0Var = getName();
        }
        c8a0 c8a0Var = new c8a0(n9rVar, xw81Var, fg5Var, ajn0Var, i, mka1Var, this.f1);
        int i2 = this.e1;
        boolean z = false;
        if (i2 != 1) {
            if (i2 == 2) {
                z = true;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw null;
                }
                z = true;
            }
        }
        c8a0Var.M1(z, ab80.f(i2));
        return c8a0Var;
    }
}
