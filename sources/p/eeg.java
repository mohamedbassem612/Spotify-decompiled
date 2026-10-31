package p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class eeg extends ceg {
    public Set X;
    public xdg Y;
    public final int g;
    public final int h;
    public final oeg i;
    public zpi0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeg(n9r n9rVar, ajn0 ajn0Var, int i, int i2, Collection collection, s1c1 s1c1Var) {
        super(s1c1Var, n9rVar, ajn0Var, mka1.m0);
        if (n9rVar == null) {
            l0(0);
            throw null;
        }
        if (ajn0Var == null) {
            l0(1);
            throw null;
        }
        if (i == 0) {
            l0(2);
            throw null;
        }
        if (i2 == 0) {
            l0(3);
            throw null;
        }
        if (s1c1Var == null) {
            l0(6);
            throw null;
        }
        this.g = i;
        this.h = i2;
        this.i = new oeg(this, Collections.EMPTY_LIST, collection, s1c1Var);
    }

    public static /* synthetic */ void l0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p.beg
    public final xdg B() {
        return this.Y;
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
        zpi0 zpi0Var = this.t;
        if (zpi0Var != null) {
            return zpi0Var;
        }
        l0(13);
        throw null;
    }

    @Override // p.beg
    public final int e0() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        l0(15);
        throw null;
    }

    @Override // p.jfg
    public final h0h1 g() {
        oeg oegVar = this.i;
        if (oegVar != null) {
            return oegVar;
        }
        l0(10);
        throw null;
    }

    public final fg5 getAnnotations() {
        return rzs0.g;
    }

    @Override // p.beg, p.zji0, p.s9r
    public final lht getVisibility() {
        return mht.e;
    }

    @Override // p.beg
    public final Collection h() {
        Set set = this.X;
        if (set != null) {
            return set;
        }
        l0(11);
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
        l0(18);
        throw null;
    }

    @Override // p.beg, p.zji0
    public final int o() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        l0(16);
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

    public final void r0(zpi0 zpi0Var, Set set, xdg xdgVar) {
        this.t = zpi0Var;
        this.X = set;
        this.Y = xdgVar;
    }

    public String toString() {
        return "class " + getName();
    }
}
