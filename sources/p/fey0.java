package p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fey0 extends rdy0 {
    public tsi1 N0;
    public final fey0 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fey0(tdy0 tdy0Var, fg5 fg5Var, int i, lht lhtVar, boolean z, boolean z2, boolean z3, int i2, fey0 fey0Var, mka1 mka1Var) {
        super(i, lhtVar, tdy0Var, fg5Var, ajn0.g("<set-" + tdy0Var.getName() + ">"), z, z2, z3, i2, mka1Var);
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
        if (i2 == 0) {
            r0(4);
            throw null;
        }
        if (mka1Var == null) {
            r0(5);
            throw null;
        }
        this.O0 = fey0Var != null ? fey0Var : this;
    }

    public static /* synthetic */ void r0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static tsi1 z1(fey0 fey0Var, a8b0 a8b0Var, fg5 fg5Var) {
        if (a8b0Var == null) {
            r0(8);
            throw null;
        }
        if (fg5Var != null) {
            return new tsi1(fey0Var, null, 0, fg5Var, moa1.g, a8b0Var, false, false, false, null, mka1.m0);
        }
        r0(9);
        throw null;
    }

    @Override // p.q9r
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public final fey0 w1() {
        fey0 fey0Var = this.O0;
        if (fey0Var != null) {
            return fey0Var;
        }
        r0(13);
        throw null;
    }

    @Override // p.hyc
    public final List F() {
        tsi1 tsi1Var = this.N0;
        if (tsi1Var == null) {
            bhn0.w();
            return null;
        }
        List listSingletonList = Collections.singletonList(tsi1Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        r0(11);
        throw null;
    }

    @Override // p.hyc
    public final a8b0 getReturnType() {
        return kht.e(this).x();
    }

    @Override // p.jyc, p.hyc
    public final Collection l() {
        return y1(false);
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.k(this, obj);
    }
}
