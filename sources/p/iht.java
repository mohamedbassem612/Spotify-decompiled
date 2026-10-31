package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class iht {
    public static final /* synthetic */ int a = 0;

    static {
        new kf30("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                objArr[2] = "hasAbstractMembers";
                break;
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(hyc hycVar, LinkedHashSet linkedHashSet) {
        if (hycVar == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(hycVar)) {
            return;
        }
        Iterator it = hycVar.w1().l().iterator();
        while (it.hasNext()) {
            hyc hycVarW1 = ((hyc) it.next()).w1();
            b(hycVarW1, linkedHashSet);
            linkedHashSet.add(hycVarW1);
        }
    }

    public static zim0 c(n9r n9rVar) {
        if (n9rVar == null) {
            a(21);
            throw null;
        }
        zim0 zim0VarD = d(n9rVar);
        if (zim0VarD != null) {
            return zim0VarD;
        }
        a(22);
        throw null;
    }

    public static zim0 d(n9r n9rVar) {
        if (n9rVar == null) {
            a(23);
            throw null;
        }
        while (n9rVar != null) {
            if (n9rVar instanceof zim0) {
                return (zim0) n9rVar;
            }
            if (n9rVar instanceof dub0) {
                return ((dub0) n9rVar).d;
            }
            n9rVar = n9rVar.k();
        }
        return null;
    }

    public static e4x0 e(n9r n9rVar) {
        e4x0 e4x0Var = e4x0.P0;
        if (n9rVar instanceof fey0) {
            n9rVar = ((fey0) n9rVar).i;
        }
        if (n9rVar instanceof p9r) {
            ((p9r) n9rVar).getSource().getClass();
        }
        return e4x0Var;
    }

    public static lf30 f(n9r n9rVar) {
        if (n9rVar != null) {
            kf30 kf30VarG = g(n9rVar);
            return kf30VarG != null ? kf30VarG.a : f(n9rVar.k()).a(n9rVar.getName());
        }
        a(2);
        throw null;
    }

    public static kf30 g(n9r n9rVar) {
        if (n9rVar == null) {
            a(5);
            throw null;
        }
        if ((n9rVar instanceof zim0) || bkz.e(n9rVar)) {
            return kf30.c;
        }
        if (n9rVar instanceof dub0) {
            return ((dub0) n9rVar).e;
        }
        if (n9rVar instanceof dzq0) {
            return ((ezq0) ((dzq0) n9rVar)).f;
        }
        return null;
    }

    public static n9r h(n9r n9rVar, Class cls, boolean z) {
        if (n9rVar == null) {
            return null;
        }
        if (z) {
            n9rVar = n9rVar.k();
        }
        while (n9rVar != null) {
            if (cls.isInstance(n9rVar)) {
                return n9rVar;
            }
            n9rVar = n9rVar.k();
        }
        return null;
    }

    public static beg i(beg begVar) {
        if (begVar == null) {
            a(44);
            throw null;
        }
        for (a8b0 a8b0Var : begVar.g().d()) {
            if (a8b0Var == null) {
                a(45);
                throw null;
            }
            h0h1 h0h1VarT0 = a8b0Var.t0();
            if (h0h1VarT0 == null) {
                a(46);
                throw null;
            }
            beg begVar2 = (beg) h0h1VarT0.s();
            if (begVar2 == null) {
                a(47);
                throw null;
            }
            if (begVar2.e0() != 2) {
                return begVar2;
            }
        }
        return null;
    }

    public static boolean j(n9r n9rVar) {
        return l(n9rVar, 1) && n9rVar.getName().equals(moa1.a);
    }

    public static boolean k(n9r n9rVar) {
        return l(n9rVar, 6) && ((beg) n9rVar).U();
    }

    public static boolean l(n9r n9rVar, int i) {
        if (i != 0) {
            return (n9rVar instanceof beg) && ((beg) n9rVar).e0() == i;
        }
        a(37);
        throw null;
    }

    public static boolean m(n9r n9rVar) {
        if (n9rVar == null) {
            a(1);
            throw null;
        }
        while (n9rVar != null) {
            if (j(n9rVar) || ((n9rVar instanceof s9r) && ((s9r) n9rVar).getVisibility() == mht.f)) {
                return true;
            }
            n9rVar = n9rVar.k();
        }
        return false;
    }

    public static boolean n(n9r n9rVar) {
        return (l(n9rVar, 1) || l(n9rVar, 2)) && ((beg) n9rVar).o() == 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static boolean o(a8b0 a8b0Var, n9r n9rVar) {
        boolean z;
        if (a8b0Var == null) {
            a(32);
            throw null;
        }
        if (n9rVar == null) {
            a(33);
            throw null;
        }
        if (a8b0Var == null) {
            a(30);
            throw null;
        }
        if (n9rVar == null) {
            a(31);
            throw null;
        }
        jfg jfgVarS = a8b0Var.t0().s();
        if (jfgVarS != null) {
            n9r n9rVarW1 = jfgVarS.w1();
            if ((n9rVarW1 instanceof jfg) && (n9rVar instanceof jfg) && ((jfg) n9rVar).g().equals(((jfg) n9rVarW1).g())) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            Iterator it = a8b0Var.t0().d().iterator();
            while (it.hasNext()) {
                if (o((a8b0) it.next(), n9rVar)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean p(n9r n9rVar) {
        return n9rVar != null && (n9rVar.k() instanceof dzq0);
    }

    public static jyc q(jyc jycVar) {
        while (jycVar.getKind() == 2) {
            Collection collectionL = jycVar.l();
            if (collectionL.isEmpty()) {
                bhn0.A(jycVar, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            jycVar = (jyc) collectionL.iterator().next();
        }
        return jycVar;
    }
}
