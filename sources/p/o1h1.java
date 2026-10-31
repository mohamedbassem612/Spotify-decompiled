package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class o1h1 {
    public static final wjz a = bkz.b(zjz.Y, new String[0]);
    public static final wjz b = bkz.b(zjz.i, new String[0]);
    public static final n1h1 c = new n1h1("NO_EXPECTED_TYPE");
    public static final n1h1 d = new n1h1("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
            case 30:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                objArr[0] = "typeArguments";
                break;
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                objArr[0] = "typeParameters";
                break;
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                objArr[0] = "typeParameterConstructors";
                break;
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(a8b0 a8b0Var) {
        if (a8b0Var == null) {
            a(28);
            throw null;
        }
        if (a8b0Var.u0()) {
            return true;
        }
        return (a8b0Var.w0() instanceof dq20) && b(((dq20) a8b0Var.w0()).c);
    }

    public static boolean c(a8b0 a8b0Var, iu30 iu30Var, bi91 bi91Var) {
        if (a8b0Var == null) {
            return false;
        }
        gmh1 gmh1VarW0 = a8b0Var.w0();
        if (l(a8b0Var)) {
            return ((Boolean) iu30Var.invoke(gmh1VarW0)).booleanValue();
        }
        if (bi91Var != null && bi91Var.contains(a8b0Var)) {
            return false;
        }
        if (((Boolean) iu30Var.invoke(gmh1VarW0)).booleanValue()) {
            return true;
        }
        if (bi91Var == null) {
            bi91Var = new bi91();
        }
        bi91Var.add(a8b0Var);
        dq20 dq20Var = gmh1VarW0 instanceof dq20 ? (dq20) gmh1VarW0 : null;
        if (dq20Var != null && (c(dq20Var.b, iu30Var, bi91Var) || c(dq20Var.c, iu30Var, bi91Var))) {
            return true;
        }
        if ((gmh1VarW0 instanceof g4t) && c(((g4t) gmh1VarW0).b, iu30Var, bi91Var)) {
            return true;
        }
        h0h1 h0h1VarT0 = a8b0Var.t0();
        if (h0h1VarT0 instanceof e890) {
            Iterator it = ((e890) h0h1VarT0).b.iterator();
            while (it.hasNext()) {
                if (c((a8b0) it.next(), iu30Var, bi91Var)) {
                    return true;
                }
            }
            return false;
        }
        for (e1h1 e1h1Var : a8b0Var.r0()) {
            if (!e1h1Var.c() && c(e1h1Var.b(), iu30Var, bi91Var)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f1h1(((y0h1) it.next()).m()));
        }
        return o7h.l1(arrayList);
    }

    public static boolean e(a8b0 a8b0Var) {
        if (a8b0Var == null) {
            a(27);
            throw null;
        }
        if (!a8b0Var.u0() && (!(a8b0Var.w0() instanceof dq20) || !e(((dq20) a8b0Var.w0()).c))) {
            if (!(a8b0Var.w0() instanceof g4t)) {
                if (f(a8b0Var)) {
                    if (!(a8b0Var.t0().s() instanceof beg)) {
                        l1h1 l1h1VarD = l1h1.d(a8b0Var);
                        Collection<a8b0> collectionD = a8b0Var.t0().d();
                        ArrayList arrayList = new ArrayList(collectionD.size());
                        for (a8b0 a8b0Var2 : collectionD) {
                            if (a8b0Var2 == null) {
                                a(21);
                                throw null;
                            }
                            a8b0 a8b0VarH = l1h1VarD.h(1, a8b0Var2);
                            a8b0 a8b0VarH2 = a8b0VarH != null ? h(a8b0VarH, a8b0Var.u0()) : null;
                            if (a8b0VarH2 != null) {
                                arrayList.add(a8b0VarH2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((a8b0) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                h0h1 h0h1VarT0 = a8b0Var.t0();
                if (h0h1VarT0 instanceof e890) {
                    Iterator it2 = ((e890) h0h1VarT0).b.iterator();
                    while (it2.hasNext()) {
                        if (e((a8b0) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(a8b0 a8b0Var) {
        if (a8b0Var == null) {
            a(60);
            throw null;
        }
        if ((a8b0Var.t0().s() instanceof y0h1 ? (y0h1) a8b0Var.t0().s() : null) != null) {
            return true;
        }
        a8b0Var.t0();
        return false;
    }

    public static gmh1 g(a8b0 a8b0Var, boolean z) {
        if (a8b0Var == null) {
            a(3);
            throw null;
        }
        gmh1 gmh1VarX0 = a8b0Var.w0().x0(z);
        if (gmh1VarX0 != null) {
            return gmh1VarX0;
        }
        a(4);
        throw null;
    }

    public static a8b0 h(a8b0 a8b0Var, boolean z) {
        if (a8b0Var != null) {
            return z ? g(a8b0Var, true) : a8b0Var;
        }
        a(8);
        throw null;
    }

    public static qx81 i(qx81 qx81Var, boolean z) {
        if (qx81Var == null) {
            a(5);
            throw null;
        }
        if (!z) {
            return qx81Var;
        }
        qx81 qx81VarX0 = qx81Var.x0(true);
        if (qx81VarX0 != null) {
            return qx81VarX0;
        }
        a(6);
        throw null;
    }

    public static phb1 j(y0h1 y0h1Var) {
        if (y0h1Var != null) {
            return new phb1(y0h1Var);
        }
        a(45);
        throw null;
    }

    public static e1h1 k(y0h1 y0h1Var, o8a0 o8a0Var) {
        if (y0h1Var != null) {
            return o8a0Var.a == 1 ? new f1h1(1, jzn1.B(y0h1Var)) : new phb1(y0h1Var);
        }
        a(46);
        throw null;
    }

    public static boolean l(a8b0 a8b0Var) {
        if (a8b0Var != null) {
            return a8b0Var == c || a8b0Var == d;
        }
        a(0);
        throw null;
    }
}
