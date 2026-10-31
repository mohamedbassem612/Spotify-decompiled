package p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class xdg extends qv30 implements pjl {
    public final boolean e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdg(beg begVar, pjl pjlVar, fg5 fg5Var, boolean z, int i, mka1 mka1Var) {
        super(i, fg5Var, begVar, pjlVar, moa1.e, mka1Var);
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
        this.e1 = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void r0(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.qv30
    /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
    public xdg y1(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var) {
        if (n9rVar == null) {
            r0(23);
            throw null;
        }
        if (i == 0) {
            r0(24);
            throw null;
        }
        if (fg5Var == null) {
            r0(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new xdg((beg) n9rVar, this, fg5Var, this.e1, 1, mka1Var);
        }
        StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        sb.append(this);
        sb.append("\nnewOwner: ");
        sb.append(n9rVar);
        swg0.h(sb, "\nkind: ", z5c.t(i));
        return null;
    }

    public final beg H1() {
        beg begVarK = k();
        if (begVarK != null) {
            return begVarK;
        }
        r0(18);
        throw null;
    }

    @Override // p.q9r, p.n9r
    /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
    public final beg k() {
        beg begVar = (beg) super.k();
        if (begVar != null) {
            return begVar;
        }
        r0(17);
        throw null;
    }

    @Override // p.q9r
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public final xdg w1() {
        xdg xdgVar = (xdg) super.w1();
        if (xdgVar != null) {
            return xdgVar;
        }
        r0(19);
        throw null;
    }

    public final void K1(List list, lht lhtVar) {
        if (list != null) {
            L1(list, lhtVar, k().n());
        } else {
            r0(13);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    public final void L1(List list, lht lhtVar, List list2) {
        rob0 rob0VarQ0;
        List listT;
        if (list == null) {
            r0(10);
            throw null;
        }
        if (list2 == null) {
            r0(12);
            throw null;
        }
        beg begVarK = k();
        if (begVarK.j()) {
            n9r n9rVarK = begVarK.k();
            if (n9rVarK instanceof beg) {
                rob0VarQ0 = ((beg) n9rVarK).q0();
            } else {
                rob0VarQ0 = null;
            }
        } else {
            rob0VarQ0 = null;
        }
        beg begVarK2 = k();
        if (begVarK2.T().isEmpty()) {
            listT = Collections.EMPTY_LIST;
            if (listT == null) {
                r0(16);
                throw null;
            }
        } else {
            listT = begVarK2.T();
            if (listT == null) {
                r0(15);
                throw null;
            }
        }
        B1(null, rob0VarQ0, listT, list2, list, null, 1, lhtVar);
    }

    @Override // p.qv30, p.apc1
    /* JADX INFO: renamed from: M1, reason: merged with bridge method [inline-methods] */
    public final xdg d(l1h1 l1h1Var) {
        if (l1h1Var != null) {
            return (xdg) super.d(l1h1Var);
        }
        r0(20);
        throw null;
    }

    @Override // p.qv30, p.jyc
    public final void k0(Collection collection) {
        if (collection != null) {
            return;
        }
        r0(22);
        throw null;
    }

    @Override // p.qv30, p.jyc, p.hyc
    public final Collection l() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        r0(21);
        throw null;
    }

    @Override // p.qv30, p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.G(this, obj);
    }

    @Override // p.jyc
    public final jyc v(n9r n9rVar, int i, lht lhtVar) {
        return (xdg) x1(n9rVar, i, lhtVar);
    }
}
