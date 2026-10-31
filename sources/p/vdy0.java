package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class vdy0 extends gti1 implements tdy0 {
    public final int N0;
    public final boolean O0;
    public final boolean P0;
    public final boolean Q0;
    public final boolean R0;
    public final boolean S0;
    public List T0;
    public rob0 U0;
    public rob0 V0;
    public ArrayList W0;
    public lht X;
    public zdy0 X0;
    public Collection Y;
    public fey0 Y0;
    public final tdy0 Z;
    public v120 Z0;
    public v120 a1;
    public final boolean g;
    public soe0 h;
    public Function0 i;
    public final int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdy0(n9r n9rVar, tdy0 tdy0Var, fg5 fg5Var, int i, lht lhtVar, boolean z, ajn0 ajn0Var, int i2, mka1 mka1Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(n9rVar, fg5Var, ajn0Var, null, mka1Var);
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
        if (i2 == 0) {
            r0(5);
            throw null;
        }
        if (mka1Var == null) {
            r0(6);
            throw null;
        }
        this.g = z;
        this.Y = null;
        this.T0 = Collections.EMPTY_LIST;
        this.t = i;
        this.X = lhtVar;
        this.Z = tdy0Var == null ? this : tdy0Var;
        this.N0 = i2;
        this.O0 = z2;
        this.P0 = z3;
        this.Q0 = z4;
        this.R0 = z5;
        this.S0 = z6;
    }

    public static ov30 A1(l1h1 l1h1Var, rdy0 rdy0Var) {
        if (rdy0Var == null) {
            r0(31);
            throw null;
        }
        ov30 ov30Var = rdy0Var.Z;
        if (ov30Var != null) {
            return ov30Var.d(l1h1Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void r0(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static vdy0 y1(n9r n9rVar, int i, boolean z, ajn0 ajn0Var, int i2, mka1 mka1Var) {
        eg5 eg5Var = rzs0.g;
        lht lhtVar = mht.e;
        if (n9rVar == null) {
            r0(7);
            throw null;
        }
        if (i == 0) {
            r0(9);
            throw null;
        }
        if (ajn0Var == null) {
            r0(11);
            throw null;
        }
        if (i2 == 0) {
            r0(12);
            throw null;
        }
        if (mka1Var != null) {
            return new vdy0(n9rVar, null, eg5Var, i, lhtVar, z, ajn0Var, i2, mka1Var, false, false, false, false, false);
        }
        r0(13);
        throw null;
    }

    public final void B1(zdy0 zdy0Var, fey0 fey0Var, v120 v120Var, v120 v120Var2) {
        this.X0 = zdy0Var;
        this.Y0 = fey0Var;
        this.Z0 = v120Var;
        this.a1 = v120Var2;
    }

    public final void C1(soe0 soe0Var, Function0 function0) {
        if (function0 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.i = function0;
        if (soe0Var == null) {
            soe0Var = (soe0) function0.invoke();
        }
        this.h = soe0Var;
    }

    public final void E1(a8b0 a8b0Var, List list, rob0 rob0Var, rob0 rob0Var2, List list2) {
        if (a8b0Var == null) {
            r0(17);
            throw null;
        }
        if (list == null) {
            r0(18);
            throw null;
        }
        if (list2 == null) {
            r0(19);
            throw null;
        }
        this.f = a8b0Var;
        this.W0 = new ArrayList(list);
        this.V0 = rob0Var2;
        this.U0 = rob0Var;
        this.T0 = list2;
    }

    @Override // p.hyc
    public final rob0 I() {
        return this.U0;
    }

    @Override // p.fti1
    public final boolean K() {
        return this.g;
    }

    @Override // p.gti1, p.hyc
    public final rob0 L() {
        return this.V0;
    }

    @Override // p.tdy0
    public final v120 M() {
        return this.a1;
    }

    @Override // p.zji0
    public final boolean S() {
        return false;
    }

    public boolean V() {
        return this.P0;
    }

    @Override // p.zji0
    public final boolean Z() {
        return this.Q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.tdy0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // p.q9r
    /* JADX INFO: renamed from: a */
    public final tdy0 w1() {
        tdy0 tdy0VarW1;
        tdy0 tdy0Var = this.Z;
        ?? r1 = this;
        if (tdy0Var != this) {
            tdy0VarW1 = tdy0Var.w1();
        }
        if (r1 != 0) {
            r1 = tdy0VarW1;
            return r1;
        }
        r1 = tdy0VarW1;
        r0(38);
        throw null;
    }

    @Override // p.tdy0
    public final zdy0 b() {
        return this.X0;
    }

    @Override // p.fti1
    public final sgl b0() {
        soe0 soe0Var = this.h;
        if (soe0Var != null) {
            return (sgl) soe0Var.invoke();
        }
        return null;
    }

    @Override // p.tdy0
    public final fey0 c() {
        return this.Y0;
    }

    @Override // p.apc1
    public final tdy0 d(l1h1 l1h1Var) {
        if (l1h1Var == null) {
            r0(27);
            throw null;
        }
        j1h1 j1h1Var = l1h1Var.a;
        if (j1h1Var.e()) {
            return this;
        }
        udy0 udy0Var = new udy0(this);
        udy0Var.f = j1h1Var;
        udy0Var.d = w1();
        return udy0Var.a();
    }

    @Override // p.tdy0
    public final v120 f0() {
        return this.Z0;
    }

    @Override // p.gti1, p.hyc
    public final List g0() {
        List list = this.T0;
        if (list != null) {
            return list;
        }
        r0(22);
        throw null;
    }

    @Override // p.jyc
    public final int getKind() {
        int i = this.N0;
        if (i != 0) {
            return i;
        }
        r0(39);
        throw null;
    }

    @Override // p.gti1, p.hyc
    public final a8b0 getReturnType() {
        a8b0 type = getType();
        if (type != null) {
            return type;
        }
        r0(23);
        throw null;
    }

    @Override // p.gti1, p.hyc
    public final List getTypeParameters() {
        ArrayList arrayList = this.W0;
        if (arrayList != null) {
            return arrayList;
        }
        bhn0.A(this, "typeParameters == null for ");
        return null;
    }

    @Override // p.s9r
    public final lht getVisibility() {
        lht lhtVar = this.X;
        if (lhtVar != null) {
            return lhtVar;
        }
        r0(25);
        throw null;
    }

    @Override // p.fti1
    public final boolean h0() {
        return this.O0;
    }

    public boolean isExternal() {
        return this.R0;
    }

    @Override // p.jyc
    public final void k0(Collection collection) {
        if (collection != null) {
            this.Y = collection;
        } else {
            r0(40);
            throw null;
        }
    }

    @Override // p.hyc
    public final Collection l() {
        Collection collection = this.Y;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        r0(41);
        throw null;
    }

    @Override // p.zji0
    public final int o() {
        int i = this.t;
        if (i != 0) {
            return i;
        }
        r0(24);
        throw null;
    }

    @Override // p.tdy0
    public final ArrayList q() {
        ArrayList arrayList = new ArrayList(2);
        zdy0 zdy0Var = this.X0;
        if (zdy0Var != null) {
            arrayList.add(zdy0Var);
        }
        fey0 fey0Var = this.Y0;
        if (fey0Var != null) {
            arrayList.add(fey0Var);
        }
        return arrayList;
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.F(this, obj);
    }

    public Object w(yht yhtVar) {
        return null;
    }

    @Override // p.jyc
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final vdy0 v(n9r n9rVar, int i, lht lhtVar) {
        udy0 udy0Var = new udy0(this);
        udy0Var.a = n9rVar;
        udy0Var.d = null;
        if (i != 0) {
            udy0Var.b = i;
            udy0Var.c = lhtVar;
            udy0Var.e = 2;
            udy0Var.g = false;
            vdy0 vdy0VarA = udy0Var.a();
            if (vdy0VarA != null) {
                return vdy0VarA;
            }
            r0(42);
            throw null;
        }
        Object[] objArr = new Object[3];
        switch (6) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        switch (6) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p.tdy0
    public final boolean z() {
        return this.S0;
    }

    public vdy0 z1(n9r n9rVar, int i, lht lhtVar, tdy0 tdy0Var, int i2, ajn0 ajn0Var) {
        if (n9rVar == null) {
            r0(32);
            throw null;
        }
        if (i == 0) {
            r0(33);
            throw null;
        }
        if (lhtVar == null) {
            r0(34);
            throw null;
        }
        if (i2 == 0) {
            r0(35);
            throw null;
        }
        if (ajn0Var == null) {
            r0(36);
            throw null;
        }
        return new vdy0(n9rVar, tdy0Var, getAnnotations(), i, lhtVar, this.g, ajn0Var, i2, mka1.m0, this.O0, V(), this.Q0, isExternal(), this.S0);
    }

    public void D1(a8b0 a8b0Var) {
    }
}
