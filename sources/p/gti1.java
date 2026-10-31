package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class gti1 extends q9r implements fti1 {
    public a8b0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gti1(n9r n9rVar, fg5 fg5Var, ajn0 ajn0Var, a8b0 a8b0Var, mka1 mka1Var) {
        super(n9rVar, fg5Var, ajn0Var, mka1Var);
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
        if (mka1Var == null) {
            r0(3);
            throw null;
        }
        this.f = a8b0Var;
    }

    public static /* synthetic */ void r0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p.hyc
    public final List F() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        r0(6);
        throw null;
    }

    @Override // p.hyc
    public rob0 L() {
        return null;
    }

    public boolean Y() {
        return false;
    }

    @Override // p.hyc
    public List g0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        r0(9);
        throw null;
    }

    @Override // p.hyc
    public a8b0 getReturnType() {
        a8b0 type = getType();
        if (type != null) {
            return type;
        }
        r0(10);
        throw null;
    }

    @Override // p.lsi1
    public final a8b0 getType() {
        a8b0 a8b0Var = this.f;
        if (a8b0Var != null) {
            return a8b0Var;
        }
        r0(4);
        throw null;
    }

    @Override // p.hyc
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        r0(8);
        throw null;
    }
}
