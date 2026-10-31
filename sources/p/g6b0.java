package p;

import com.spotify.accountswitching.v1.Account;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class g6b0 {
    public static final ajn0 e = ajn0.g("<built-ins module>");
    public ajm0 a;
    public final toe0 b;
    public final qoe0 c;
    public final voe0 d;

    public g6b0(voe0 voe0Var) {
        this.d = voe0Var;
        this.b = new toe0(voe0Var, new x5u(this, (byte) 20));
        this.c = voe0Var.a(new bg5(this, (byte) 1));
    }

    public static boolean A(n9r n9rVar) {
        if (n9rVar != null) {
            return iht.h(n9rVar, zbc.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(a8b0 a8b0Var, lf30 lf30Var) {
        if (a8b0Var == null) {
            a(97);
            throw null;
        }
        if (lf30Var != null) {
            return J(a8b0Var.t0(), lf30Var);
        }
        a(98);
        throw null;
    }

    public static boolean C(a8b0 a8b0Var, lf30 lf30Var) {
        if (lf30Var != null) {
            return B(a8b0Var, lf30Var) && !a8b0Var.u0();
        }
        a(135);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean D(q9r q9rVar) {
        if (q9rVar.w1().getAnnotations().d0(rfb1.m)) {
            return true;
        }
        if (!(q9rVar instanceof tdy0)) {
            return false;
        }
        tdy0 tdy0Var = (tdy0) q9rVar;
        boolean zK = tdy0Var.K();
        zdy0 zdy0VarB = tdy0Var.b();
        fey0 fey0VarC = tdy0Var.c();
        if (zdy0VarB == null || !D(zdy0VarB)) {
            return false;
        }
        if (zK) {
            return fey0VarC != null && D(fey0VarC);
        }
        return true;
    }

    public static boolean E(a8b0 a8b0Var, lf30 lf30Var) {
        if (a8b0Var == null) {
            a(105);
            throw null;
        }
        if (lf30Var != null) {
            return !a8b0Var.u0() && B(a8b0Var, lf30Var);
        }
        a(106);
        throw null;
    }

    public static boolean F(a8b0 a8b0Var) {
        if (a8b0Var != null) {
            return B(a8b0Var, rfb1.b) && !o1h1.e(a8b0Var);
        }
        a(136);
        throw null;
    }

    public static boolean G(a8b0 a8b0Var) {
        if (a8b0Var.u0()) {
            return false;
        }
        jfg jfgVarS = a8b0Var.t0().s();
        return (jfgVarS instanceof beg) && u((beg) jfgVarS) != null;
    }

    public static boolean H(beg begVar) {
        if (begVar != null) {
            return b(begVar, rfb1.a) || b(begVar, rfb1.b);
        }
        a(107);
        throw null;
    }

    public static boolean I(a8b0 a8b0Var) {
        return E(a8b0Var, rfb1.f);
    }

    public static boolean J(h0h1 h0h1Var, lf30 lf30Var) {
        if (h0h1Var == null) {
            a(101);
            throw null;
        }
        if (lf30Var != null) {
            jfg jfgVarS = h0h1Var.s();
            return (jfgVarS instanceof beg) && b((beg) jfgVarS, lf30Var);
        }
        a(102);
        throw null;
    }

    public static boolean K(n9r n9rVar) {
        while (n9rVar != null) {
            if (n9rVar instanceof dzq0) {
                kf30 kf30Var = ((ezq0) ((dzq0) n9rVar)).f;
                return kf30Var.a.h(sfb1.k);
            }
            n9rVar = n9rVar.k();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                        case 29:
                        case 30:
                        case 31:
                        case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                        case 33:
                        case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                        case 35:
                        case 36:
                        case 37:
                        case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                        case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                        case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                        case 29:
                        case 30:
                        case 31:
                        case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                        case 33:
                        case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                        case 35:
                        case 36:
                        case 37:
                        case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                        case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                        case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 35:
            case 36:
            case 37:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case Account.MANAGED_ACCOUNT_FIELD_NUMBER /* 103 */:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER /* 104 */:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i == 81 || i == 84) {
            objArr[1] = "getArrayType";
        } else if (i == 86) {
            objArr[1] = "getEnumType";
        } else if (i != 87) {
            switch (i) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                            objArr[1] = "getMutableList";
                            break;
                        case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                            objArr[1] = "getSet";
                            break;
                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                            objArr[1] = "getMutableSet";
                            break;
                        case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                            objArr[1] = "getMap";
                            break;
                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 35:
            case 36:
            case 37:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case Account.MANAGED_ACCOUNT_FIELD_NUMBER /* 103 */:
            case Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER /* 104 */:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                        case 29:
                        case 30:
                        case 31:
                        case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                        case 33:
                        case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                        case 35:
                        case 36:
                        case 37:
                        case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                        case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                        case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(beg begVar, lf30 lf30Var) {
        if (begVar == null) {
            a(Account.MANAGED_ACCOUNT_FIELD_NUMBER);
            throw null;
        }
        if (lf30Var != null) {
            return begVar.getName().equals(lf30Var.g()) && lf30Var.equals(iht.f(begVar));
        }
        a(Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER);
        throw null;
    }

    public static tnw0 s(jfg jfgVar) {
        if (rfb1.e0.contains(jfgVar.getName())) {
            return (tnw0) rfb1.g0.get(iht.f(jfgVar));
        }
        return null;
    }

    public static tnw0 u(beg begVar) {
        if (rfb1.d0.contains(begVar.getName())) {
            return (tnw0) rfb1.f0.get(iht.f(begVar));
        }
        return null;
    }

    public static boolean y(a8b0 a8b0Var) {
        if (a8b0Var != null) {
            return B(a8b0Var, rfb1.a);
        }
        a(139);
        throw null;
    }

    public static boolean z(a8b0 a8b0Var) {
        if (a8b0Var != null) {
            return B(a8b0Var, rfb1.g);
        }
        a(88);
        throw null;
    }

    public final void c(boolean z) {
        ajn0 ajn0Var = e;
        voe0 voe0Var = this.d;
        ajm0 ajm0Var = new ajm0(ajn0Var, voe0Var, this, 48);
        this.a = ajm0Var;
        BuiltInsLoader.a.getClass();
        ajm0Var.i = ((BuiltInsLoader) ybc.b.getValue()).createPackageFragmentProvider(voe0Var, this.a, n(), q(), d(), z);
        ajm0 ajm0Var2 = this.a;
        ajm0Var2.getClass();
        ajm0Var2.h = new yim0(f46.Q0(new ajm0[]{ajm0Var2}));
    }

    public yz1 d() {
        return s9w.e;
    }

    public final beg e() {
        return l("Any");
    }

    public final qx81 f() {
        qx81 qx81VarM = l("Any").m();
        if (qx81VarM != null) {
            return qx81VarM;
        }
        a(51);
        throw null;
    }

    public final a8b0 g(a8b0 a8b0Var) {
        if (a8b0Var == null) {
            a(68);
            throw null;
        }
        a8b0 a8b0VarH = h(a8b0Var);
        if (a8b0VarH != null) {
            return a8b0VarH;
        }
        bhn0.A(a8b0Var, "not array: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public final a8b0 h(a8b0 a8b0Var) {
        heg hegVarF;
        heg hegVar;
        beg begVarH;
        qx81 qx81VarM;
        if (a8b0Var == null) {
            a(70);
            throw null;
        }
        if (!z(a8b0Var)) {
            gmh1 gmh1VarG = o1h1.g(a8b0Var, false);
            a8b0 a8b0Var2 = (a8b0) ((f6b0) this.b.invoke()).b.get(gmh1VarG);
            if (a8b0Var2 != null) {
                return a8b0Var2;
            }
            int i = iht.a;
            jfg jfgVarS = gmh1VarG.t0().s();
            zim0 zim0VarD = jfgVarS == null ? null : iht.d(jfgVarS);
            if (zim0VarD != null) {
                jfg jfgVarS2 = gmh1VarG.t0().s();
                if (jfgVarS2 == null) {
                    qx81VarM = null;
                } else {
                    Set set = qlh1.a;
                    if (!qlh1.d.contains(jfgVarS2.getName()) || (hegVarF = kht.f(jfgVarS2)) == null || (hegVar = (heg) qlh1.b.get(hegVarF)) == null || (begVarH = x1p1.h(zim0VarD, hegVar)) == null) {
                        qx81VarM = null;
                    } else {
                        qx81VarM = begVarH.m();
                    }
                }
                if (qx81VarM != null) {
                    return qx81VarM;
                }
            }
        } else if (a8b0Var.r0().size() == 1) {
            return ((e1h1) a8b0Var.r0().get(0)).b();
        }
        return null;
    }

    public final qx81 i(int i, a8b0 a8b0Var, fg5 fg5Var) {
        if (i == 0) {
            a(78);
            throw null;
        }
        if (a8b0Var != null) {
            return y3o1.h0(prn1.w(fg5Var), l("Array"), Collections.singletonList(new f1h1(i, a8b0Var)));
        }
        a(79);
        throw null;
    }

    public final qx81 j(a8b0 a8b0Var) {
        if (a8b0Var != null) {
            return i(1, a8b0Var, rzs0.g);
        }
        a(83);
        throw null;
    }

    public final beg k(kf30 kf30Var) {
        if (kf30Var == null) {
            a(12);
            throw null;
        }
        beg begVarR = lm5.r(m(), kf30Var);
        if (begVarR != null) {
            return begVarR;
        }
        a(13);
        throw null;
    }

    public final beg l(String str) {
        if (str != null) {
            return (beg) this.c.invoke(ajn0.e(str));
        }
        a(14);
        throw null;
    }

    public final ajm0 m() {
        this.a.getClass();
        ajm0 ajm0Var = this.a;
        if (ajm0Var != null) {
            return ajm0Var;
        }
        a(7);
        throw null;
    }

    public Iterable n() {
        List listSingletonList = Collections.singletonList(new vbc(this.d, m()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final qx81 o() {
        qx81 qx81VarM = l("Nothing").m();
        if (qx81VarM != null) {
            return qx81VarM;
        }
        a(49);
        throw null;
    }

    public final qx81 p() {
        qx81 qx81VarA0 = f().x0(true);
        if (qx81VarA0 != null) {
            return qx81VarA0;
        }
        a(52);
        throw null;
    }

    public qct0 q() {
        return o610.W0;
    }

    public final qx81 r(tnw0 tnw0Var) {
        if (tnw0Var == null) {
            a(73);
            throw null;
        }
        qx81 qx81Var = (qx81) ((f6b0) this.b.invoke()).a.get(tnw0Var);
        if (qx81Var != null) {
            return qx81Var;
        }
        a(74);
        throw null;
    }

    public final qx81 t(tnw0 tnw0Var) {
        if (tnw0Var == null) {
            a(54);
            throw null;
        }
        qx81 qx81VarM = l(tnw0Var.a.b()).m();
        if (qx81VarM != null) {
            return qx81VarM;
        }
        a(55);
        throw null;
    }

    public final qx81 v() {
        qx81 qx81VarM = l("String").m();
        if (qx81VarM != null) {
            return qx81VarM;
        }
        a(66);
        throw null;
    }

    public final beg w(int i) {
        return k(sfb1.f.a(ajn0.e(((yv30) xv30.d).b + i)));
    }

    public final qx81 x() {
        qx81 qx81VarM = l("Unit").m();
        if (qx81VarM != null) {
            return qx81VarM;
        }
        a(65);
        throw null;
    }
}
