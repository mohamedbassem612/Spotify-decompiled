package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class rdy0 extends q9r implements ov30 {
    public final int X;
    public lht Y;
    public ov30 Z;
    public boolean f;
    public final boolean g;
    public final int h;
    public final tdy0 i;
    public final boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdy0(int i, lht lhtVar, tdy0 tdy0Var, fg5 fg5Var, ajn0 ajn0Var, boolean z, boolean z2, boolean z3, int i2, mka1 mka1Var) {
        super(tdy0Var.k(), fg5Var, ajn0Var, mka1Var);
        if (i == 0) {
            r0(0);
            throw null;
        }
        if (lhtVar == null) {
            r0(1);
            throw null;
        }
        if (fg5Var == null) {
            r0(3);
            throw null;
        }
        if (mka1Var == null) {
            r0(5);
            throw null;
        }
        this.Z = null;
        this.h = i;
        this.Y = lhtVar;
        this.i = tdy0Var;
        this.f = z;
        this.g = z2;
        this.t = z3;
        this.X = i2;
    }

    public static /* synthetic */ void r0(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p.ov30
    public final boolean A() {
        return false;
    }

    @Override // p.hyc
    public final rob0 I() {
        return this.i.I();
    }

    @Override // p.hyc
    public final rob0 L() {
        return this.i.L();
    }

    @Override // p.zji0
    public final boolean S() {
        return false;
    }

    @Override // p.hyc
    public final boolean Y() {
        return false;
    }

    @Override // p.zji0
    public final boolean Z() {
        return false;
    }

    @Override // p.ov30, p.apc1
    public final ov30 d(l1h1 l1h1Var) {
        if (l1h1Var != null) {
            return this;
        }
        r0(7);
        throw null;
    }

    @Override // p.ov30
    public final ov30 d0() {
        return this.Z;
    }

    @Override // p.hyc
    public final List g0() {
        List listG0 = this.i.g0();
        if (listG0 != null) {
            return listG0;
        }
        r0(14);
        throw null;
    }

    @Override // p.jyc
    public final int getKind() {
        int i = this.X;
        if (i != 0) {
            return i;
        }
        r0(6);
        throw null;
    }

    @Override // p.hyc
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        r0(9);
        throw null;
    }

    @Override // p.s9r
    public final lht getVisibility() {
        lht lhtVar = this.Y;
        if (lhtVar != null) {
            return lhtVar;
        }
        r0(11);
        throw null;
    }

    @Override // p.zji0
    public final boolean isExternal() {
        return this.g;
    }

    @Override // p.ov30
    public final boolean isInfix() {
        return false;
    }

    @Override // p.ov30
    public final boolean isInline() {
        return this.t;
    }

    @Override // p.ov30
    public final boolean isOperator() {
        return false;
    }

    @Override // p.ov30
    public final boolean isSuspend() {
        return false;
    }

    @Override // p.ov30
    public final boolean j0() {
        return false;
    }

    @Override // p.jyc
    public final void k0(Collection collection) {
        if (collection != null) {
            return;
        }
        r0(16);
        throw null;
    }

    @Override // p.ov30
    public final boolean m0() {
        return false;
    }

    @Override // p.zji0
    public final int o() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        r0(10);
        throw null;
    }

    @Override // p.jyc
    public final jyc v(n9r n9rVar, int i, lht lhtVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // p.hyc
    public final Object w(yht yhtVar) {
        return null;
    }

    public final tdy0 x1() {
        return this.i;
    }

    public final ArrayList y1(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (tdy0 tdy0Var : this.i.l()) {
            ve5 ve5VarB = z ? tdy0Var.b() : tdy0Var.c();
            if (ve5VarB != null) {
                arrayList.add(ve5VarB);
            }
        }
        return arrayList;
    }

    @Override // p.apc1
    public final /* bridge */ /* synthetic */ p9r d(l1h1 l1h1Var) {
        d(l1h1Var);
        return this;
    }
}
