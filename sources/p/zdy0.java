package p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zdy0 extends rdy0 {
    public a8b0 N0;
    public final zdy0 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdy0(tdy0 tdy0Var, fg5 fg5Var, int i, lht lhtVar, boolean z, boolean z2, boolean z3, int i2, zdy0 zdy0Var, mka1 mka1Var) {
        super(i, lhtVar, tdy0Var, fg5Var, ajn0.g("<get-" + tdy0Var.getName() + ">"), z, z2, z3, i2, mka1Var);
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
        this.O0 = zdy0Var != null ? zdy0Var : this;
    }

    public static /* synthetic */ void r0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final void A1(a8b0 a8b0Var) {
        if (a8b0Var == null) {
            a8b0Var = this.i.getType();
        }
        this.N0 = a8b0Var;
    }

    @Override // p.hyc
    public final List F() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        r0(7);
        throw null;
    }

    @Override // p.hyc
    public final a8b0 getReturnType() {
        return this.N0;
    }

    @Override // p.jyc, p.hyc
    public final Collection l() {
        return y1(true);
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.y(this, obj);
    }

    @Override // p.q9r
    /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
    public final zdy0 w1() {
        zdy0 zdy0Var = this.O0;
        if (zdy0Var != null) {
            return zdy0Var;
        }
        r0(8);
        throw null;
    }
}
