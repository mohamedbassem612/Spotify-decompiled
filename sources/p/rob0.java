package p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rob0 extends o9r implements lpr0 {
    public final /* synthetic */ byte d = 0;
    public final n9r e;
    public final yl01 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rob0(n9r n9rVar, k9 k9Var, fg5 fg5Var, ajn0 ajn0Var) {
        super(fg5Var, ajn0Var);
        if (n9rVar == null) {
            r0(3);
            throw null;
        }
        if (fg5Var == null) {
            r0(5);
            throw null;
        }
        if (ajn0Var == null) {
            r0(6);
            throw null;
        }
        this.e = n9rVar;
        this.f = k9Var;
    }

    public static /* synthetic */ void r0(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void w1(int i) {
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
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
        w1(7);
        throw null;
    }

    @Override // p.hyc
    public final rob0 L() {
        return null;
    }

    @Override // p.hyc
    public final boolean Y() {
        return false;
    }

    @Override // p.hyc
    public final a8b0 getReturnType() {
        return getType();
    }

    @Override // p.p9r
    public final mka1 getSource() {
        return mka1.m0;
    }

    @Override // p.lsi1
    public final a8b0 getType() {
        a8b0 type = x1().getType();
        if (type != null) {
            return type;
        }
        w1(6);
        throw null;
    }

    @Override // p.hyc
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        w1(5);
        throw null;
    }

    @Override // p.s9r
    public final lht getVisibility() {
        return mht.f;
    }

    @Override // p.n9r
    public final n9r k() {
        byte b = this.d;
        n9r n9rVar = this.e;
        switch (b) {
            case 0:
                return (beg) n9rVar;
            default:
                if (n9rVar != null) {
                    return n9rVar;
                }
                r0(8);
                throw null;
        }
    }

    @Override // p.hyc
    public final Collection l() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        w1(8);
        throw null;
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.s(this, obj);
    }

    @Override // p.o9r
    public String toString() {
        switch (this.d) {
            case 0:
                return "class " + ((beg) this.e).getName() + "::this";
            default:
                return super.toString();
        }
    }

    public final yl01 x1() {
        byte b = this.d;
        k9 k9Var = this.f;
        switch (b) {
            case 0:
                return (w380) k9Var;
            default:
                k9 k9Var2 = k9Var;
                if (k9Var2 != null) {
                    return k9Var2;
                }
                r0(7);
                throw null;
        }
    }

    @Override // p.apc1
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public final rob0 d(l1h1 l1h1Var) {
        if (l1h1Var == null) {
            w1(3);
            throw null;
        }
        if (!l1h1Var.a.e()) {
            a8b0 a8b0VarH = k() instanceof beg ? l1h1Var.h(3, getType()) : l1h1Var.h(1, getType());
            if (a8b0VarH == null) {
                return null;
            }
            if (a8b0VarH != getType()) {
                return new rob0(k(), new tgg1(a8b0VarH), getAnnotations());
            }
        }
        return this;
    }

    @Override // p.o9r, p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final n9r w1() {
        return this;
    }

    @Override // p.o9r, p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final hyc w1() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rob0(n9r n9rVar, k9 k9Var, fg5 fg5Var) {
        this(n9rVar, k9Var, fg5Var, moa1.d);
        if (n9rVar == null) {
            r0(0);
            throw null;
        }
        if (fg5Var != null) {
        } else {
            r0(2);
            throw null;
        }
    }

    public rob0(beg begVar) {
        super(rzs0.g, moa1.d);
        this.e = begVar;
        this.f = new w380(begVar);
    }
}
