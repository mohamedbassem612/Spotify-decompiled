package p;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum nja0 {
    BOOLEAN(tnw0.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(tnw0.CHAR, "char", "C", "java.lang.Character"),
    BYTE(tnw0.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(tnw0.SHORT, "short", "S", "java.lang.Short"),
    INT(tnw0.INT, "int", "I", "java.lang.Integer"),
    FLOAT(tnw0.FLOAT, "float", "F", "java.lang.Float"),
    LONG(tnw0.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(tnw0.DOUBLE, "double", "D", "java.lang.Double");

    public final tnw0 a;
    public final String b;
    public final String c;
    public final kf30 d;
    public static final HashMap Z = new HashMap();
    public static final EnumMap N0 = new EnumMap(tnw0.class);
    public static final HashMap O0 = new HashMap();
    public static final HashSet P0 = new HashSet();
    public static final HashMap Q0 = new HashMap();

    static {
        for (nja0 nja0Var : values()) {
            HashMap map = Z;
            String str = nja0Var.b;
            String str2 = nja0Var.c;
            map.put(str, nja0Var);
            N0.put(nja0Var.c(), nja0Var);
            O0.put(str2, nja0Var);
            String strReplace = nja0Var.d.a.a.replace('.', '/');
            P0.add(strReplace);
            Q0.put(strReplace, cy30.p("(", str2, ")L", strReplace, ";"));
        }
    }

    nja0(tnw0 tnw0Var, String str, String str2, String str3) {
        if (tnw0Var == null) {
            a(8);
            throw null;
        }
        this.a = tnw0Var;
        this.b = str;
        this.c = str2;
        this.d = new kf30(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
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
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static nja0 b(String str) {
        nja0 nja0Var = (nja0) Z.get(str);
        if (nja0Var != null) {
            return nja0Var;
        }
        eg.f("Non-primitive type name passed: ".concat(str));
        return null;
    }

    public final tnw0 c() {
        tnw0 tnw0Var = this.a;
        if (tnw0Var != null) {
            return tnw0Var;
        }
        a(12);
        throw null;
    }
}
