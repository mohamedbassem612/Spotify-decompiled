package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l1h1 {
    public static final l1h1 b = new l1h1(j1h1.a);
    public final j1h1 a;

    public l1h1(j1h1 j1h1Var) {
        this.a = j1h1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                                        case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                                        case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
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
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 37:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                objArr[0] = "typeParameterVariance";
                break;
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                                        case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 37:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                                    break;
                                default:
                                    switch (i) {
                                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                                        case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
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

    public static int b(int i, int i2) {
        if (i == 0) {
            a(38);
            throw null;
        }
        if (i2 == 0) {
            a(39);
            throw null;
        }
        if (i == 1) {
            if (i2 == 0) {
                a(40);
                throw null;
            }
        } else {
            if (i2 == 1) {
                if (i != 0) {
                    return i;
                }
                a(41);
                throw null;
            }
            if (i != i2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + xcg1.q(i) + "' and projection kind '" + xcg1.q(i2) + "' cannot be combined");
            }
            if (i2 == 0) {
                a(42);
                throw null;
            }
        }
        return i2;
    }

    public static int c(int i, int i2) {
        if (i == 2 && i2 == 3) {
            return 3;
        }
        return (i == 3 && i2 == 2) ? 2 : 1;
    }

    public static l1h1 d(a8b0 a8b0Var) {
        if (a8b0Var == null) {
            a(6);
            throw null;
        }
        return new l1h1(j0h1.b.i(a8b0Var.t0(), a8b0Var.r0()));
    }

    public static l1h1 e(j1h1 j1h1Var, j1h1 j1h1Var2) {
        if (j1h1Var == null) {
            a(3);
            throw null;
        }
        if (j1h1Var2 == null) {
            a(4);
            throw null;
        }
        if (j1h1Var.e()) {
            j1h1Var = j1h1Var2;
        } else if (!j1h1Var2.e()) {
            j1h1Var = new ldu(j1h1Var, j1h1Var2);
        }
        return new l1h1(j1h1Var);
    }

    public static String g(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ggo1.I(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final a8b0 f(int i, a8b0 a8b0Var) {
        if (a8b0Var == null) {
            a(9);
            throw null;
        }
        if (i == 0) {
            a(10);
            throw null;
        }
        if (this.a.e()) {
            return a8b0Var;
        }
        try {
            a8b0 a8b0VarB = i(new f1h1(i, a8b0Var), null, 0).b();
            if (a8b0VarB != null) {
                return a8b0VarB;
            }
            a(12);
            throw null;
        } catch (k1h1 e) {
            return bkz.b(zjz.X, e.getMessage());
        }
    }

    public final a8b0 h(int i, a8b0 a8b0Var) {
        if (a8b0Var == null) {
            a(14);
            throw null;
        }
        if (i == 0) {
            a(15);
            throw null;
        }
        j1h1 j1h1Var = this.a;
        e1h1 f1h1Var = new f1h1(i, j1h1Var.f(i, a8b0Var));
        if (!j1h1Var.e()) {
            try {
                f1h1Var = i(f1h1Var, null, 0);
            } catch (k1h1 unused) {
                f1h1Var = null;
            }
        }
        if (j1h1Var.a() || j1h1Var.b()) {
            boolean zB = j1h1Var.b();
            if (f1h1Var == null) {
                f1h1Var = null;
            } else if (!f1h1Var.c()) {
                a8b0 a8b0VarB = f1h1Var.b();
                if (o1h1.c(a8b0VarB, ye3.N0, null)) {
                    int iA = f1h1Var.a();
                    if (iA == 3) {
                        f1h1Var = new f1h1(iA, (a8b0) u2o1.h(a8b0VarB).b);
                    } else if (zB) {
                        f1h1Var = new f1h1(iA, (a8b0) u2o1.h(a8b0VarB).a);
                    } else {
                        rod rodVar = new rod();
                        l1h1 l1h1Var = new l1h1(rodVar);
                        if (!rodVar.e()) {
                            try {
                                f1h1Var = l1h1Var.i(f1h1Var, null, 0);
                            } catch (k1h1 unused2) {
                                f1h1Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (f1h1Var == null) {
            return null;
        }
        return f1h1Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:105:0x020d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0215  */
    /* JADX WARN: Code duplicated, block: B:108:0x0218  */
    /* JADX WARN: Code duplicated, block: B:110:0x021b  */
    /* JADX WARN: Code duplicated, block: B:111:0x021e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0221  */
    /* JADX WARN: Code duplicated, block: B:115:0x0225  */
    /* JADX WARN: Code duplicated, block: B:118:0x022d  */
    /* JADX WARN: Code duplicated, block: B:119:0x023c  */
    /* JADX WARN: Code duplicated, block: B:124:0x025d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0281  */
    /* JADX WARN: Code duplicated, block: B:128:0x0284  */
    /* JADX WARN: Code duplicated, block: B:131:0x0288  */
    /* JADX WARN: Code duplicated, block: B:134:0x028f  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0186  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x0199  */
    /* JADX WARN: Code duplicated, block: B:89:0x01af  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final e1h1 i(e1h1 e1h1Var, y0h1 y0h1Var, int i) throws k1h1 {
        a8b0 a8b0VarB;
        int iA;
        gmh1 gmh1VarW0;
        x xVar;
        qx81 qx81Var;
        List parameters;
        List listR0;
        ArrayList arrayList;
        boolean z;
        a8b0 a8b0VarY;
        y0h1 y0h1Var2;
        e1h1 e1h1Var2;
        e1h1 e1h1VarI;
        int iC;
        char c;
        int iX;
        boolean z2;
        l1h1 l1h1Var;
        z980 z980Var;
        int iC2;
        ve5 ve5VarW0;
        yro yroVar;
        a8b0 a8b0VarH;
        fg5 fg5VarC;
        int iC3;
        a8b0 a8b0VarH2 = null;
        if (e1h1Var == null) {
            a(18);
            throw null;
        }
        j1h1 j1h1Var = this.a;
        if (i > 100) {
            bhn0.v("Recursion too deep. Most likely infinite loop while substituting ", g(e1h1Var), "; substitution: ", g(j1h1Var));
            return null;
        }
        if (!e1h1Var.c()) {
            a8b0 a8b0VarB2 = e1h1Var.b();
            if (a8b0VarB2 instanceof p1h1) {
                p1h1 p1h1Var = (p1h1) a8b0VarB2;
                gmh1 gmh1VarO0 = p1h1Var.o0();
                a8b0 a8b0VarF = p1h1Var.f();
                e1h1 e1h1VarI2 = i(new f1h1(e1h1Var.a(), gmh1VarO0), y0h1Var, i + 1);
                return e1h1VarI2.c() ? e1h1VarI2 : new f1h1(e1h1VarI2.a(), vzn1.q(e1h1VarI2.b().w0(), h(e1h1Var.a(), a8b0VarF)));
            }
            a8b0VarB2.w0();
            if (!(a8b0VarB2.w0() instanceof nwz0)) {
                e1h1 e1h1VarD = j1h1Var.d(a8b0VarB2);
                if (e1h1VarD == null) {
                    e1h1VarD = null;
                } else if (a8b0VarB2.getAnnotations().d0(rfb1.y)) {
                    h0h1 h0h1VarT0 = e1h1VarD.b().t0();
                    if (h0h1VarT0 instanceof x8o0) {
                        e1h1 e1h1Var3 = ((x8o0) h0h1VarT0).a;
                        int iA2 = e1h1Var3.a();
                        if (c(e1h1Var.a(), iA2) == 3) {
                            e1h1VarD = new f1h1(e1h1Var3.b());
                        } else if (y0h1Var != null && c(y0h1Var.x(), iA2) == 3) {
                            e1h1VarD = new f1h1(e1h1Var3.b());
                        }
                    }
                }
                int iA3 = e1h1Var.a();
                if (e1h1VarD == null && (a8b0VarB2.w0() instanceof dq20)) {
                    ve5 ve5VarW1 = a8b0VarB2.w0();
                    yro yroVar2 = ve5VarW1 instanceof yro ? (yro) ve5VarW1 : null;
                    if (!(yroVar2 != null ? yroVar2.l0() : false)) {
                        dq20 dq20Var = (dq20) a8b0VarB2.w0();
                        qx81 qx81Var2 = dq20Var.c;
                        qx81 qx81Var3 = dq20Var.b;
                        int i2 = i + 1;
                        e1h1 e1h1VarI3 = i(new f1h1(iA3, qx81Var3), y0h1Var, i2);
                        e1h1 e1h1VarI4 = i(new f1h1(iA3, qx81Var2), y0h1Var, i2);
                        int iA4 = e1h1VarI3.a();
                        if (e1h1VarI3.b() != qx81Var3 || e1h1VarI4.b() != qx81Var2) {
                            return new f1h1(iA4, y3o1.Z(jzn1.p(e1h1VarI3.b()), jzn1.p(e1h1VarI4.b())));
                        }
                    } else if (!g6b0.F(a8b0VarB2)) {
                        if (e1h1VarD != null) {
                            iC2 = c(iA3, e1h1VarD.a());
                            if (!(a8b0VarB2.t0() instanceof sod)) {
                                iC3 = l1d.C(iC2);
                                if (iC3 != 1) {
                                    return new f1h1(3, a8b0VarB2.t0().e().p());
                                }
                                if (iC3 == 2) {
                                    throw new k1h1("Out-projection in in-position");
                                }
                            }
                            ve5VarW0 = a8b0VarB2.w0();
                            if (ve5VarW0 instanceof yro) {
                                yroVar = (yro) ve5VarW0;
                            } else {
                                yroVar = null;
                            }
                            if (yroVar != null) {
                                yroVar = null;
                            } else {
                                yroVar = null;
                            }
                            if (e1h1VarD.c()) {
                                return e1h1VarD;
                            }
                            if (yroVar != null) {
                                a8b0VarH = yroVar.c0(e1h1VarD.b());
                            } else {
                                a8b0VarH = o1h1.h(e1h1VarD.b(), a8b0VarB2.u0());
                            }
                            if (!a8b0VarB2.getAnnotations().isEmpty()) {
                                fg5VarC = j1h1Var.c(a8b0VarB2.getAnnotations());
                                if (fg5VarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (fg5VarC.d0(rfb1.y)) {
                                    fg5VarC = new lf20(fg5VarC, new tae1((byte) 2));
                                }
                                a8b0VarH = rzn1.z(a8b0VarH, new hg5(new fg5[]{a8b0VarH.getAnnotations(), fg5VarC}));
                            }
                            if (iC2 == 1) {
                                iA3 = b(iA3, e1h1VarD.a());
                            }
                            return new f1h1(iA3, a8b0VarH);
                        }
                        a8b0VarB = e1h1Var.b();
                        iA = e1h1Var.a();
                        if (!(a8b0VarB.t0().s() instanceof y0h1)) {
                            gmh1VarW0 = a8b0VarB.w0();
                            if (gmh1VarW0 instanceof x) {
                                xVar = (x) gmh1VarW0;
                            } else {
                                xVar = null;
                            }
                            if (xVar != null) {
                                qx81Var = xVar.c;
                            } else {
                                qx81Var = null;
                            }
                            if (qx81Var != null) {
                                if (j1h1Var instanceof z980) {
                                    z980Var = (z980) j1h1Var;
                                    if (z980Var.d) {
                                        l1h1Var = new l1h1(new z980(z980Var.b, z980Var.c, false));
                                    } else {
                                        l1h1Var = this;
                                    }
                                } else {
                                    l1h1Var = this;
                                }
                                a8b0VarH2 = l1h1Var.h(1, qx81Var);
                            }
                            parameters = a8b0VarB.t0().getParameters();
                            listR0 = a8b0VarB.r0();
                            arrayList = new ArrayList(parameters.size());
                            z = false;
                            for (int i3 = 0; i3 < parameters.size(); i3++) {
                                y0h1Var2 = (y0h1) parameters.get(i3);
                                e1h1Var2 = (e1h1) listR0.get(i3);
                                e1h1VarI = i(e1h1Var2, y0h1Var2, i + 1);
                                iC = l1d.C(c(y0h1Var2.x(), e1h1VarI.a()));
                                if (iC != 0) {
                                    if (iC != 1) {
                                        c = 2;
                                        if (iC == 2) {
                                        }
                                        z2 = true;
                                    } else {
                                        c = 2;
                                    }
                                    e1h1VarI = o1h1.j(y0h1Var2);
                                    z2 = true;
                                } else {
                                    c = 2;
                                    iX = y0h1Var2.x();
                                    z2 = true;
                                    if (iX != 1) {
                                        e1h1VarI = new f1h1(1, e1h1VarI.b());
                                    }
                                }
                                if (e1h1VarI != e1h1Var2) {
                                    z = z2;
                                }
                                arrayList.add(e1h1VarI);
                            }
                            if (z) {
                                listR0 = arrayList;
                            }
                            a8b0VarY = jzn1.y(a8b0VarB, listR0, j1h1Var.c(a8b0VarB.getAnnotations()), 4);
                            if (a8b0VarY instanceof qx81) {
                                a8b0VarY = mue1.Y((qx81) a8b0VarY, (qx81) a8b0VarH2);
                            }
                            return new f1h1(iA, a8b0VarY);
                        }
                    }
                } else if (!g6b0.F(a8b0VarB2) && !d4o1.i(a8b0VarB2)) {
                    if (e1h1VarD != null) {
                        iC2 = c(iA3, e1h1VarD.a());
                        if (!(a8b0VarB2.t0() instanceof sod)) {
                            iC3 = l1d.C(iC2);
                            if (iC3 != 1) {
                                return new f1h1(3, a8b0VarB2.t0().e().p());
                            }
                            if (iC3 == 2) {
                                throw new k1h1("Out-projection in in-position");
                            }
                        }
                        ve5VarW0 = a8b0VarB2.w0();
                        if (ve5VarW0 instanceof yro) {
                            yroVar = (yro) ve5VarW0;
                        } else {
                            yroVar = null;
                        }
                        if (yroVar != null || !yroVar.l0()) {
                            yroVar = null;
                        }
                        if (e1h1VarD.c()) {
                            return e1h1VarD;
                        }
                        if (yroVar != null) {
                            a8b0VarH = yroVar.c0(e1h1VarD.b());
                        } else {
                            a8b0VarH = o1h1.h(e1h1VarD.b(), a8b0VarB2.u0());
                        }
                        if (!a8b0VarB2.getAnnotations().isEmpty()) {
                            fg5VarC = j1h1Var.c(a8b0VarB2.getAnnotations());
                            if (fg5VarC != null) {
                                a(33);
                                throw null;
                            }
                            if (fg5VarC.d0(rfb1.y)) {
                                fg5VarC = new lf20(fg5VarC, new tae1((byte) 2));
                            }
                            a8b0VarH = rzn1.z(a8b0VarH, new hg5(new fg5[]{a8b0VarH.getAnnotations(), fg5VarC}));
                        }
                        if (iC2 == 1) {
                            iA3 = b(iA3, e1h1VarD.a());
                        }
                        return new f1h1(iA3, a8b0VarH);
                    }
                    a8b0VarB = e1h1Var.b();
                    iA = e1h1Var.a();
                    if (!(a8b0VarB.t0().s() instanceof y0h1)) {
                        gmh1VarW0 = a8b0VarB.w0();
                        if (gmh1VarW0 instanceof x) {
                            xVar = (x) gmh1VarW0;
                        } else {
                            xVar = null;
                        }
                        if (xVar != null) {
                            qx81Var = xVar.c;
                        } else {
                            qx81Var = null;
                        }
                        if (qx81Var != null) {
                            if (j1h1Var instanceof z980) {
                                z980Var = (z980) j1h1Var;
                                if (z980Var.d) {
                                    l1h1Var = this;
                                } else {
                                    l1h1Var = new l1h1(new z980(z980Var.b, z980Var.c, false));
                                }
                            } else {
                                l1h1Var = this;
                            }
                            a8b0VarH2 = l1h1Var.h(1, qx81Var);
                        }
                        parameters = a8b0VarB.t0().getParameters();
                        listR0 = a8b0VarB.r0();
                        arrayList = new ArrayList(parameters.size());
                        z = false;
                        while (i3 < parameters.size()) {
                            y0h1Var2 = (y0h1) parameters.get(i3);
                            e1h1Var2 = (e1h1) listR0.get(i3);
                            e1h1VarI = i(e1h1Var2, y0h1Var2, i + 1);
                            iC = l1d.C(c(y0h1Var2.x(), e1h1VarI.a()));
                            if (iC != 0) {
                                if (iC != 1) {
                                    c = 2;
                                    if (iC == 2) {
                                    }
                                    z2 = true;
                                } else {
                                    c = 2;
                                }
                                e1h1VarI = o1h1.j(y0h1Var2);
                                z2 = true;
                            } else {
                                c = 2;
                                iX = y0h1Var2.x();
                                z2 = true;
                                if (iX != 1 && !e1h1VarI.c()) {
                                    e1h1VarI = new f1h1(1, e1h1VarI.b());
                                }
                            }
                            if (e1h1VarI != e1h1Var2) {
                                z = z2;
                            }
                            arrayList.add(e1h1VarI);
                        }
                        if (z) {
                            listR0 = arrayList;
                        }
                        a8b0VarY = jzn1.y(a8b0VarB, listR0, j1h1Var.c(a8b0VarB.getAnnotations()), 4);
                        if ((a8b0VarY instanceof qx81) && (a8b0VarH2 instanceof qx81)) {
                            a8b0VarY = mue1.Y((qx81) a8b0VarY, (qx81) a8b0VarH2);
                        }
                        return new f1h1(iA, a8b0VarY);
                    }
                }
            }
        }
        return e1h1Var;
    }
}
