package p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oa extends ma {
    public final djx0 c;
    public final /* synthetic */ pa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(pa paVar, s1c1 s1c1Var) {
        super(s1c1Var);
        djx0 djx0Var = djx0.R0;
        if (s1c1Var == null) {
            i(0);
            throw null;
        }
        this.d = paVar;
        this.c = djx0Var;
    }

    public static /* synthetic */ void i(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.ma
    public final Collection a() {
        List listY1 = this.d.y1();
        if (listY1 != null) {
            return listY1;
        }
        i(1);
        throw null;
    }

    @Override // p.ma
    public final djx0 c() {
        djx0 djx0Var = this.c;
        if (djx0Var != null) {
            return djx0Var;
        }
        i(5);
        throw null;
    }

    public final g6b0 e() {
        g6b0 g6b0VarE = kht.e(this.d);
        if (g6b0VarE != null) {
            return g6b0VarE;
        }
        i(4);
        throw null;
    }

    @Override // p.ma
    public final boolean g(jfg jfgVar) {
        if (!(jfgVar instanceof y0h1)) {
            return false;
        }
        return rzs0.Z0.b(this.d, (y0h1) jfgVar, true, q5.R0);
    }

    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        i(2);
        throw null;
    }

    @Override // p.ma
    public final List h(List list) {
        List listX1 = this.d.x1(list);
        if (listX1 != null) {
            return listX1;
        }
        i(8);
        throw null;
    }

    public final jfg s() {
        return this.d;
    }

    public final boolean t() {
        return true;
    }

    public final String toString() {
        return this.d.getName().a;
    }
}
