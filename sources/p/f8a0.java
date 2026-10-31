package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class f8a0 extends vdy0 implements o7a0 {
    public final boolean b1;
    public final mmr0 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8a0(n9r n9rVar, fg5 fg5Var, int i, lht lhtVar, boolean z, ajn0 ajn0Var, mka1 mka1Var, tdy0 tdy0Var, int i2, boolean z2, mmr0 mmr0Var) {
        super(n9rVar, tdy0Var, fg5Var, i, lhtVar, z, ajn0Var, i2, mka1Var, false, false, false, false, false);
        if (n9rVar == null) {
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
        if (lhtVar == null) {
            r0(3);
            throw null;
        }
        if (ajn0Var == null) {
            r0(4);
            throw null;
        }
        if (mka1Var == null) {
            r0(5);
            throw null;
        }
        if (i2 == 0) {
            r0(6);
            throw null;
        }
        this.b1 = z2;
        this.c1 = mmr0Var;
    }

    public static f8a0 F1(n9r n9rVar, eqb0 eqb0Var, lht lhtVar, boolean z, ajn0 ajn0Var, g141 g141Var, boolean z2) {
        if (n9rVar == null) {
            r0(7);
            throw null;
        }
        if (ajn0Var != null) {
            return new f8a0(n9rVar, eqb0Var, 1, lhtVar, z, ajn0Var, g141Var, null, 1, z2, null);
        }
        r0(11);
        throw null;
    }

    public static /* synthetic */ void r0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p.vdy0, p.fti1
    public final boolean V() {
        a8b0 type = getType();
        if (!this.b1) {
            return false;
        }
        if (((!g6b0.G(type) && !qlh1.a(type)) || o1h1.e(type)) && !g6b0.I(type)) {
            return false;
        }
        hg5 hg5Var = p0h1.a;
        c4x0 c4x0Var = c4x0.N0;
        return !type.getAnnotations().d0(eia0.r) || g6b0.I(type);
    }

    @Override // p.gti1, p.hyc
    public final boolean Y() {
        return false;
    }

    @Override // p.o7a0
    public final o7a0 s(a8b0 a8b0Var, ArrayList arrayList, a8b0 a8b0Var2, mmr0 mmr0Var) {
        a8b0 a8b0Var3;
        zdy0 zdy0Var;
        fey0 fey0Var;
        tdy0 tdy0VarW1 = w1() == this ? null : w1();
        f8a0 f8a0Var = new f8a0(k(), getAnnotations(), o(), getVisibility(), this.g, getName(), getSource(), tdy0VarW1, getKind(), this.b1, mmr0Var);
        zdy0 zdy0Var2 = this.X0;
        if (zdy0Var2 != null) {
            zdy0 zdy0Var3 = new zdy0(f8a0Var, zdy0Var2.getAnnotations(), zdy0Var2.o(), zdy0Var2.getVisibility(), zdy0Var2.f, zdy0Var2.g, zdy0Var2.t, getKind(), tdy0VarW1 == null ? null : tdy0VarW1.b(), zdy0Var2.getSource());
            zdy0Var3.Z = zdy0Var2.Z;
            a8b0Var3 = a8b0Var2;
            zdy0Var3.N0 = a8b0Var3;
            zdy0Var = zdy0Var3;
        } else {
            a8b0Var3 = a8b0Var2;
            zdy0Var = null;
        }
        fey0 fey0Var2 = this.Y0;
        if (fey0Var2 != null) {
            fey0Var = new fey0(f8a0Var, fey0Var2.getAnnotations(), fey0Var2.o(), fey0Var2.getVisibility(), fey0Var2.f, fey0Var2.g, fey0Var2.t, getKind(), tdy0VarW1 == null ? null : tdy0VarW1.c(), fey0Var2.getSource());
            fey0Var.Z = fey0Var.Z;
            tsi1 tsi1Var = (tsi1) fey0Var2.F().get(0);
            if (tsi1Var == null) {
                fey0.r0(6);
                throw null;
            }
            fey0Var.N0 = tsi1Var;
        } else {
            fey0Var = null;
        }
        f8a0Var.B1(zdy0Var, fey0Var, this.Z0, this.a1);
        Function0 function0 = this.i;
        if (function0 != null) {
            f8a0Var.C1(this.h, function0);
        }
        f8a0Var.k0(l());
        f8a0Var.E1(a8b0Var3, getTypeParameters(), this.U0, a8b0Var != null ? sj1.n(this, a8b0Var, rzs0.g) : null, z6x.a);
        return f8a0Var;
    }

    @Override // p.vdy0, p.hyc
    public final Object w(yht yhtVar) {
        mmr0 mmr0Var = this.c1;
        if (mmr0Var == null || !((yht) mmr0Var.a).equals(yhtVar)) {
            return null;
        }
        return mmr0Var.b;
    }

    @Override // p.vdy0
    public final vdy0 z1(n9r n9rVar, int i, lht lhtVar, tdy0 tdy0Var, int i2, ajn0 ajn0Var) {
        if (n9rVar == null) {
            r0(13);
            throw null;
        }
        if (i == 0) {
            r0(14);
            throw null;
        }
        if (lhtVar == null) {
            r0(15);
            throw null;
        }
        if (i2 == 0) {
            r0(16);
            throw null;
        }
        if (ajn0Var == null) {
            r0(17);
            throw null;
        }
        return new f8a0(n9rVar, getAnnotations(), i, lhtVar, this.g, ajn0Var, mka1.m0, tdy0Var, i2, this.b1, this.c1);
    }

    @Override // p.vdy0
    public final void D1(a8b0 a8b0Var) {
    }
}
