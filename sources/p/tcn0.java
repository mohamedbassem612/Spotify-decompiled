package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tcn0 extends ceg {
    public ArrayList X;
    public final ArrayList Y;
    public final s1c1 Z;
    public final int g;
    public int h;
    public lht i;
    public oeg t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcn0(h7x h7xVar, ajn0 ajn0Var, s1c1 s1c1Var) {
        super(s1c1Var, h7xVar, ajn0Var, mka1.m0);
        if (s1c1Var == null) {
            l0(4);
            throw null;
        }
        this.Y = new ArrayList();
        this.Z = s1c1Var;
        this.g = 2;
    }

    public static /* synthetic */ void l0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p.beg
    public final xdg B() {
        return null;
    }

    @Override // p.beg
    public final ksi1 Q() {
        return null;
    }

    @Override // p.zji0
    public final boolean S() {
        return false;
    }

    @Override // p.beg
    public final boolean U() {
        return false;
    }

    @Override // p.beg
    public final boolean W() {
        return false;
    }

    @Override // p.zji0
    public final boolean Z() {
        return false;
    }

    @Override // p.beg
    public final zpi0 a0() {
        return ypi0.b;
    }

    @Override // p.beg
    public final int e0() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        l0(8);
        throw null;
    }

    @Override // p.jfg
    public final h0h1 g() {
        oeg oegVar = this.t;
        if (oegVar != null) {
            return oegVar;
        }
        l0(11);
        throw null;
    }

    public final fg5 getAnnotations() {
        return rzs0.g;
    }

    @Override // p.beg, p.zji0, p.s9r
    public final lht getVisibility() {
        lht lhtVar = this.i;
        if (lhtVar != null) {
            return lhtVar;
        }
        l0(10);
        throw null;
    }

    @Override // p.beg
    public final Collection h() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        l0(13);
        throw null;
    }

    @Override // p.beg
    public final boolean isInline() {
        return false;
    }

    @Override // p.kfg
    public final boolean j() {
        return false;
    }

    @Override // p.beg, p.kfg
    public final List n() {
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            return arrayList;
        }
        l0(15);
        throw null;
    }

    @Override // p.beg, p.zji0
    public final int o() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        l0(7);
        throw null;
    }

    @Override // p.beg
    public final boolean p() {
        return false;
    }

    @Override // p.beg
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return o9r.v1(this);
    }
}
