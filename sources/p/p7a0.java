package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p7a0 extends xdg implements o7a0 {
    public Boolean f1;
    public Boolean g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7a0(beg begVar, p7a0 p7a0Var, fg5 fg5Var, boolean z, int i, mka1 mka1Var) {
        super(begVar, p7a0Var, fg5Var, z, i, mka1Var);
        if (begVar == null) {
            r0(0);
            throw null;
        }
        if (fg5Var == null) {
            r0(1);
            throw null;
        }
        if (i == 0) {
            r0(2);
            throw null;
        }
        if (mka1Var == null) {
            r0(3);
            throw null;
        }
        this.f1 = null;
        this.g1 = null;
    }

    public static p7a0 N1(beg begVar, fg5 fg5Var, boolean z, g141 g141Var) {
        if (begVar != null) {
            return new p7a0(begVar, null, fg5Var, z, 1, g141Var);
        }
        r0(4);
        throw null;
    }

    public static /* synthetic */ void r0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.qv30
    public final void D1(boolean z) {
        this.f1 = Boolean.valueOf(z);
    }

    @Override // p.qv30
    public final void E1(boolean z) {
        this.g1 = Boolean.valueOf(z);
    }

    @Override // p.xdg
    /* JADX INFO: renamed from: G1 */
    public final /* bridge */ /* synthetic */ xdg y1(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var) {
        return O1(n9rVar, ov30Var, i, fg5Var, mka1Var);
    }

    public final p7a0 O1(n9r n9rVar, ov30 ov30Var, int i, fg5 fg5Var, mka1 mka1Var) {
        if (n9rVar == null) {
            r0(7);
            throw null;
        }
        if (i == 0) {
            r0(8);
            throw null;
        }
        if (fg5Var == null) {
            r0(9);
            throw null;
        }
        if (mka1Var == null) {
            r0(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(n9rVar);
            swg0.h(sb, "\nkind: ", z5c.t(i));
            return null;
        }
        beg begVar = (beg) n9rVar;
        p7a0 p7a0Var = (p7a0) ov30Var;
        if (i == 0) {
            r0(13);
            throw null;
        }
        p7a0 p7a0Var2 = new p7a0(begVar, p7a0Var, fg5Var, this.e1, i, mka1Var);
        Boolean bool = this.f1;
        bool.getClass();
        p7a0Var2.f1 = bool;
        Boolean bool2 = this.g1;
        bool2.getClass();
        p7a0Var2.g1 = bool2;
        return p7a0Var2;
    }

    @Override // p.qv30, p.hyc
    public final boolean Y() {
        return this.g1.booleanValue();
    }

    @Override // p.o7a0
    public final o7a0 s(a8b0 a8b0Var, ArrayList arrayList, a8b0 a8b0Var2, mmr0 mmr0Var) {
        p7a0 p7a0VarO1 = O1(k(), null, getKind(), getAnnotations(), getSource());
        p7a0VarO1.B1(a8b0Var == null ? null : sj1.n(p7a0VarO1, a8b0Var, rzs0.g), this.X, z6x.a, getTypeParameters(), xto1.w(arrayList, F(), p7a0VarO1), a8b0Var2, o(), getVisibility());
        if (mmr0Var != null) {
            yht yhtVar = (yht) mmr0Var.a;
            Object obj = mmr0Var.b;
            Map linkedHashMap = p7a0VarO1.d1;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                p7a0VarO1.d1 = linkedHashMap;
            }
            linkedHashMap.put(yhtVar, obj);
        }
        return p7a0VarO1;
    }

    @Override // p.xdg, p.qv30
    public final /* bridge */ /* synthetic */ qv30 y1(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var) {
        return O1(n9rVar, ov30Var, i, fg5Var, mka1Var);
    }
}
