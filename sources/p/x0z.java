package p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x0z extends ceg {
    public final oeg g;
    public final w0z h;
    public final xgo0 i;
    public final fg5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0z(s1c1 s1c1Var, beg begVar, qx81 qx81Var, ajn0 ajn0Var, xgo0 xgo0Var, fg5 fg5Var, mka1 mka1Var) {
        super(s1c1Var, begVar, ajn0Var, mka1Var);
        if (s1c1Var == null) {
            l0(6);
            throw null;
        }
        if (begVar == null) {
            l0(7);
            throw null;
        }
        if (qx81Var == null) {
            l0(8);
            throw null;
        }
        if (xgo0Var == null) {
            l0(10);
            throw null;
        }
        this.t = fg5Var;
        this.g = new oeg(this, Collections.EMPTY_LIST, Collections.singleton(qx81Var), s1c1Var);
        this.h = new w0z(this, s1c1Var);
        this.i = xgo0Var;
    }

    public static /* synthetic */ void l0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static x0z r0(s1c1 s1c1Var, beg begVar, ajn0 ajn0Var, toe0 toe0Var, fg5 fg5Var, mka1 mka1Var) {
        if (s1c1Var == null) {
            l0(0);
            throw null;
        }
        if (begVar == null) {
            l0(1);
            throw null;
        }
        if (toe0Var != null) {
            return new x0z(s1c1Var, begVar, begVar.m(), ajn0Var, toe0Var, fg5Var, mka1Var);
        }
        l0(3);
        throw null;
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

    @Override // p.wim0
    public final zpi0 c0(g8b0 g8b0Var) {
        w0z w0zVar = this.h;
        if (w0zVar != null) {
            return w0zVar;
        }
        l0(14);
        throw null;
    }

    @Override // p.beg
    public final int e0() {
        return 4;
    }

    @Override // p.jfg
    public final h0h1 g() {
        oeg oegVar = this.g;
        if (oegVar != null) {
            return oegVar;
        }
        l0(17);
        throw null;
    }

    public final fg5 getAnnotations() {
        fg5 fg5Var = this.t;
        if (fg5Var != null) {
            return fg5Var;
        }
        l0(21);
        throw null;
    }

    @Override // p.beg, p.zji0, p.s9r
    public final lht getVisibility() {
        return mht.e;
    }

    @Override // p.beg
    public final Collection h() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        l0(16);
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
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        l0(22);
        throw null;
    }

    @Override // p.beg, p.zji0
    public final int o() {
        return 1;
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
        return "enum entry " + getName();
    }
}
