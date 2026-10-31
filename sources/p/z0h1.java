package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z0h1 extends pa {
    public final ArrayList Y;
    public boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0h1(int i, int i2, fg5 fg5Var, n9r n9rVar, ajn0 ajn0Var, s1c1 s1c1Var, boolean z) {
        super(i, i2, fg5Var, n9rVar, ajn0Var, s1c1Var, z);
        if (n9rVar == null) {
            r0(19);
            throw null;
        }
        if (fg5Var == null) {
            r0(20);
            throw null;
        }
        if (i == 0) {
            r0(21);
            throw null;
        }
        if (ajn0Var == null) {
            r0(22);
            throw null;
        }
        if (s1c1Var == null) {
            r0(25);
            throw null;
        }
        this.Y = new ArrayList(1);
        this.Z = false;
    }

    public static z0h1 A1(y5 y5Var, int i, ajn0 ajn0Var, int i2, s1c1 s1c1Var) {
        eg5 eg5Var = rzs0.g;
        if (i == 0) {
            r0(2);
            throw null;
        }
        if (s1c1Var == null) {
            r0(4);
            throw null;
        }
        z0h1 z0h1VarZ1 = z1(i, i2, eg5Var, y5Var, ajn0Var, s1c1Var, false);
        qx81 qx81VarP = kht.e(y5Var).p();
        if (z0h1VarZ1.Z) {
            eg.m("Type parameter descriptor is already initialized: ".concat(z0h1VarZ1.B1()));
            return null;
        }
        if (!d4o1.i(qx81VarP)) {
            z0h1VarZ1.Y.add(qx81VarP);
        }
        if (z0h1VarZ1.Z) {
            eg.m("Type parameter descriptor is already initialized: ".concat(z0h1VarZ1.B1()));
            return null;
        }
        z0h1VarZ1.Z = true;
        return z0h1VarZ1;
    }

    public static /* synthetic */ void r0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static z0h1 z1(int i, int i2, fg5 fg5Var, n9r n9rVar, ajn0 ajn0Var, s1c1 s1c1Var, boolean z) {
        if (n9rVar == null) {
            r0(6);
            throw null;
        }
        if (fg5Var == null) {
            r0(7);
            throw null;
        }
        if (i == 0) {
            r0(8);
            throw null;
        }
        if (ajn0Var == null) {
            r0(9);
            throw null;
        }
        if (s1c1Var == null) {
            r0(11);
            throw null;
        }
        if (i != 0) {
            return new z0h1(i, i2, fg5Var, n9rVar, ajn0Var, s1c1Var, z);
        }
        r0(14);
        throw null;
    }

    public final String B1() {
        return getName() + " declared in " + iht.f(k());
    }

    @Override // p.pa
    public final List y1() {
        if (!this.Z) {
            eg.m("Type parameter descriptor is not initialized: ".concat(B1()));
            return null;
        }
        ArrayList arrayList = this.Y;
        if (arrayList != null) {
            return arrayList;
        }
        r0(28);
        throw null;
    }
}
