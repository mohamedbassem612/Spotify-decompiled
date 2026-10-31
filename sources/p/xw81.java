package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class xw81 extends qv30 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw81(n9r n9rVar, xw81 xw81Var, fg5 fg5Var, ajn0 ajn0Var, int i, mka1 mka1Var) {
        super(i, fg5Var, n9rVar, xw81Var, ajn0Var, mka1Var);
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
        if (mka1Var != null) {
        } else {
            r0(4);
            throw null;
        }
    }

    public static xw81 H1(n9r n9rVar, ajn0 ajn0Var, int i, mka1 mka1Var) {
        eg5 eg5Var = rzs0.g;
        if (ajn0Var == null) {
            r0(7);
            throw null;
        }
        if (i == 0) {
            r0(8);
            throw null;
        }
        if (mka1Var != null) {
            return new xw81(n9rVar, null, eg5Var, ajn0Var, i, mka1Var);
        }
        r0(9);
        throw null;
    }

    public static /* synthetic */ void r0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.jyc
    /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
    public xw81 v(n9r n9rVar, int i, lht lhtVar) {
        return (xw81) x1(n9rVar, i, lhtVar);
    }

    @Override // p.q9r
    /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final xw81 w1() {
        xw81 xw81Var = (xw81) super.w1();
        if (xw81Var != null) {
            return xw81Var;
        }
        r0(24);
        throw null;
    }

    @Override // p.qv30
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public final xw81 B1(rob0 rob0Var, rob0 rob0Var2, List list, List list2, List list3, a8b0 a8b0Var, int i, lht lhtVar) {
        if (list == null) {
            r0(14);
            throw null;
        }
        if (list2 == null) {
            r0(15);
            throw null;
        }
        if (list3 == null) {
            r0(16);
            throw null;
        }
        if (lhtVar != null) {
            return K1(rob0Var, rob0Var2, list, list2, list3, a8b0Var, i, lhtVar, null);
        }
        r0(17);
        throw null;
    }

    public xw81 K1(rob0 rob0Var, rob0 rob0Var2, List list, List list2, List list3, a8b0 a8b0Var, int i, lht lhtVar, Map map) {
        if (list == null) {
            r0(19);
            throw null;
        }
        if (list2 == null) {
            r0(20);
            throw null;
        }
        if (list3 == null) {
            r0(21);
            throw null;
        }
        if (lhtVar == null) {
            r0(22);
            throw null;
        }
        super.B1(rob0Var, rob0Var2, list, list2, list3, a8b0Var, i, lhtVar);
        if (map != null && !map.isEmpty()) {
            this.d1 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // p.qv30, p.ov30
    public nv30 n0() {
        return C1(l1h1.b);
    }

    @Override // p.qv30
    public qv30 y1(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var) {
        if (n9rVar == null) {
            r0(25);
            throw null;
        }
        if (i == 0) {
            r0(26);
            throw null;
        }
        if (fg5Var == null) {
            r0(27);
            throw null;
        }
        xw81 xw81Var = (xw81) ov30Var;
        if (ajn0Var == null) {
            ajn0Var = getName();
        }
        return new xw81(n9rVar, xw81Var, fg5Var, ajn0Var, i, mka1Var);
    }
}
