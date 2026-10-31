package p;

import com.spotify.accountswitching.v1.Account;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class exq0 {
    public static final List b = o7h.l1(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
    public static final exq0 c;
    public static final q3c d;
    public final b8b0 a;

    static {
        q3c q3cVar = new q3c();
        d = q3cVar;
        c = new exq0(q3cVar);
    }

    public exq0(b8b0 b8b0Var) {
        if (b8b0Var != null) {
            this.a = b8b0Var;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                        case 33:
                        case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                        case 33:
                        case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                        case 35:
                        case 36:
                        case 37:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
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
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 35:
            case 36:
            case 37:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                objArr[0] = "subDescriptor";
                break;
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                objArr[0] = "firstParameters";
                break;
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER /* 104 */:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case Account.MANAGED_ACCOUNT_FIELD_NUMBER /* 103 */:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                        case 33:
                        case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 35:
            case 36:
            case 37:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case Account.MANAGED_ACCOUNT_FIELD_NUMBER /* 103 */:
            case Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER /* 104 */:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                        case 33:
                        case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
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

    public static boolean b(a8b0 a8b0Var, a8b0 a8b0Var2, teb tebVar) {
        if (a8b0Var == null) {
            a(44);
            throw null;
        }
        if (a8b0Var2 == null) {
            a(45);
            throw null;
        }
        if (d4o1.i(a8b0Var) && d4o1.i(a8b0Var2)) {
            return true;
        }
        return p9w.f(tebVar, a8b0Var.w0(), a8b0Var2.w0());
    }

    public static void c(jyc jycVar, LinkedHashSet linkedHashSet) {
        if (jycVar == null) {
            a(17);
            throw null;
        }
        if (jycVar.getKind() != 2) {
            linkedHashSet.add(jycVar);
        } else {
            if (jycVar.l().isEmpty()) {
                bhn0.A(jycVar, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator it = jycVar.l().iterator();
            while (it.hasNext()) {
                c((jyc) it.next(), linkedHashSet);
            }
        }
    }

    public static ArrayList d(hyc hycVar) {
        rob0 rob0VarL = hycVar.L();
        ArrayList arrayList = new ArrayList();
        if (rob0VarL != null) {
            arrayList.add(rob0VarL.getType());
        }
        Iterator it = hycVar.F().iterator();
        while (it.hasNext()) {
            arrayList.add(((tsi1) it.next()).getType());
        }
        return arrayList;
    }

    public static void e(Collection collection, beg begVar, mgo1 mgo1Var) {
        int iO;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (begVar == null) {
            a(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            jyc jycVar = (jyc) obj;
            if (!mht.e(jycVar.getVisibility()) && mht.f(jycVar, begVar)) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        if (!zIsEmpty) {
            collection = arrayList;
        }
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            iO = 3;
            if (!it.hasNext()) {
                if (begVar.Z() && begVar.o() != 4 && begVar.o() != 2) {
                    z = true;
                }
                if (z2 && !z3) {
                    break;
                }
                if (!z2 && z3) {
                    iO = z ? begVar.o() : 4;
                    if (iO != 0) {
                        break;
                    }
                    a(90);
                    throw null;
                }
                HashSet<jyc> hashSet = new HashSet();
                for (jyc jycVar2 : collection) {
                    if (jycVar2 == null) {
                        a(15);
                        throw null;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    c(jycVar2, linkedHashSet);
                    hashSet.addAll(linkedHashSet);
                }
                if (!hashSet.isEmpty()) {
                    n9r n9rVar = (n9r) hashSet.iterator().next();
                    int i = kht.a;
                    if (iht.c(n9rVar).t(cgj1.a) != null) {
                        bhn0.d();
                        return;
                    }
                }
                if (hashSet.size() > 1) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    for (Object obj2 : hashSet) {
                        Iterator it2 = linkedHashSet2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                linkedHashSet2.add(obj2);
                                break;
                            }
                            hyc hycVar = (hyc) obj2;
                            hyc hycVar2 = (hyc) it2.next();
                            if (!q(hycVar, hycVar2)) {
                                if (q(hycVar2, hycVar)) {
                                    break;
                                }
                            } else {
                                it2.remove();
                            }
                        }
                    }
                    hashSet = linkedHashSet2;
                }
                int iO2 = begVar.o();
                if (iO2 == 0) {
                    a(92);
                    throw null;
                }
                iO = 4;
                for (jyc jycVar3 : hashSet) {
                    int iO3 = (z && jycVar3.o() == 4) ? iO2 : jycVar3.o();
                    if (l1d.c(iO3, iO) < 0) {
                        iO = iO3;
                    }
                }
                break;
            }
            jyc jycVar4 = (jyc) it.next();
            int iC = l1d.C(jycVar4.o());
            if (iC == 0) {
                iO = 1;
                break;
            } else if (iC == 1) {
                bhn0.A(jycVar4, "Member cannot have SEALED modality: ");
                return;
            } else if (iC == 2) {
                z2 = true;
            } else if (iC == 3) {
                z3 = true;
            }
        }
        jyc jycVarV = ((jyc) s(collection, new ryq((byte) 8))).v(begVar, iO, zIsEmpty ? mht.h : mht.g);
        mgo1Var.x(jycVarV, collection);
        mgo1Var.k(jycVarV);
    }

    public static ArrayList g(Object obj, LinkedList linkedList, iu30 iu30Var, iu30 iu30Var2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayListH = ydh.h(obj);
        hyc hycVar = (hyc) iu30Var.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            hyc hycVar2 = (hyc) iu30Var.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(hycVar, hycVar2);
                if (iJ == 1) {
                    arrayListH.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    iu30Var2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayListH;
    }

    public static dxq0 i(hyc hycVar, hyc hycVar2) {
        boolean z;
        dxq0 dxq0VarC;
        if (hycVar == null) {
            a(38);
            throw null;
        }
        if (hycVar2 == null) {
            a(39);
            throw null;
        }
        boolean z2 = hycVar instanceof ov30;
        if ((z2 && !(hycVar2 instanceof ov30)) || (((z = hycVar instanceof tdy0)) && !(hycVar2 instanceof tdy0))) {
            return dxq0.c("Member kind mismatch");
        }
        if (!z2 && !z) {
            hhg1.g(hycVar, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!hycVar.getName().equals(hycVar2.getName())) {
            return dxq0.c("Name mismatch");
        }
        if ((hycVar.L() == null) != (hycVar2.L() == null)) {
            dxq0VarC = dxq0.c("Receiver presence mismatch");
        } else {
            dxq0VarC = hycVar.F().size() != hycVar2.F().size() ? dxq0.c("Value parameter number mismatch") : null;
        }
        if (dxq0VarC != null) {
            return dxq0VarC;
        }
        return null;
    }

    public static int j(hyc hycVar, hyc hycVar2) {
        exq0 exq0Var = c;
        int iB = exq0Var.l(hycVar2, hycVar, null).b();
        int iB2 = exq0Var.m(hycVar, hycVar2, null, false).b();
        if (iB == 1 && iB2 == 1) {
            return 1;
        }
        return (iB == 3 || iB2 == 3) ? 3 : 2;
    }

    public static boolean k(hyc hycVar, hyc hycVar2) {
        if (hycVar == null) {
            a(65);
            throw null;
        }
        if (hycVar2 == null) {
            a(66);
            throw null;
        }
        a8b0 returnType = hycVar.getReturnType();
        a8b0 returnType2 = hycVar2.getReturnType();
        if (p(hycVar, hycVar2)) {
            teb tebVarF = c.f(hycVar.getTypeParameters(), hycVar2.getTypeParameters());
            if (hycVar instanceof ov30) {
                return o(hycVar, returnType, hycVar2, returnType2, tebVarF);
            }
            if (!(hycVar instanceof tdy0)) {
                tw20.t(hycVar.getClass(), "Unexpected callable: ");
                return false;
            }
            tdy0 tdy0Var = (tdy0) hycVar;
            tdy0 tdy0Var2 = (tdy0) hycVar2;
            fey0 fey0VarC = tdy0Var.c();
            fey0 fey0VarC2 = tdy0Var2.c();
            if ((fey0VarC == null || fey0VarC2 == null) ? true : p(fey0VarC, fey0VarC2)) {
                if (tdy0Var.K() && tdy0Var2.K()) {
                    return p9w.f(tebVarF, returnType.w0(), returnType2.w0());
                }
                if ((tdy0Var.K() || !tdy0Var2.K()) && o(hycVar, returnType, hycVar2, returnType2, tebVarF)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(hyc hycVar, a8b0 a8b0Var, hyc hycVar2, a8b0 a8b0Var2, teb tebVar) {
        if (hycVar == null) {
            a(71);
            throw null;
        }
        if (a8b0Var == null) {
            a(72);
            throw null;
        }
        if (hycVar2 == null) {
            a(73);
            throw null;
        }
        if (a8b0Var2 == null) {
            a(74);
            throw null;
        }
        gmh1 gmh1VarW0 = a8b0Var.w0();
        gmh1 gmh1VarW1 = a8b0Var2.w0();
        if (gmh1VarW0 == gmh1VarW1) {
            return true;
        }
        if (!tebVar.f(gmh1VarW0, gmh1VarW1)) {
            return false;
        }
        return p9w.c.e(tebVar, (m1h1) tebVar.d, gmh1VarW0, gmh1VarW1);
    }

    public static boolean p(hyc hycVar, hyc hycVar2) {
        Integer numB = mht.b(hycVar.getVisibility(), hycVar2.getVisibility());
        return numB == null || numB.intValue() >= 0;
    }

    public static boolean q(hyc hycVar, hyc hycVar2) {
        rzs0 rzs0Var = rzs0.Z0;
        if (hycVar == null) {
            a(13);
            throw null;
        }
        if (hycVar2 == null) {
            a(14);
            throw null;
        }
        if (!hycVar.equals(hycVar2) && rzs0Var.a(hycVar.w1(), hycVar2.w1(), false)) {
            return true;
        }
        hyc hycVarW1 = hycVar2.w1();
        int i = iht.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        iht.b(hycVar.w1(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (rzs0Var.a(hycVarW1, (hyc) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(jyc jycVar, iu30 iu30Var) {
        lht lhtVar;
        lht lhtVarG;
        lht lhtVar2;
        if (jycVar == null) {
            a(105);
            throw null;
        }
        for (jyc jycVar2 : jycVar.l()) {
            if (jycVar2.getVisibility() == mht.g) {
                r(jycVar2, iu30Var);
            }
        }
        if (jycVar.getVisibility() != mht.g) {
            return;
        }
        Collection<jyc> collectionL = jycVar.l();
        if (collectionL == null) {
            a(107);
            throw null;
        }
        if (!collectionL.isEmpty()) {
            Iterator it = collectionL.iterator();
            loop3: while (true) {
                lhtVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    lht visibility = ((jyc) it.next()).getVisibility();
                    if (lhtVar != null) {
                        Integer numB = mht.b(visibility, lhtVar);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    lhtVar = visibility;
                }
            }
            if (lhtVar == null) {
                lhtVarG = null;
                break;
            }
            Iterator it2 = collectionL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    lhtVarG = lhtVar;
                    break;
                }
                Integer numB2 = mht.b(lhtVar, ((jyc) it2.next()).getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    lhtVarG = null;
                    break;
                }
            }
        } else {
            lhtVarG = mht.k;
        }
        if (lhtVarG == null) {
            lhtVarG = null;
            break;
        }
        if (jycVar.getKind() == 2) {
            for (jyc jycVar3 : collectionL) {
                if (jycVar3.o() != 4 && !jycVar3.getVisibility().equals(lhtVarG)) {
                    lhtVarG = null;
                    break;
                }
            }
        } else {
            lhtVarG = mht.g(lhtVarG.a.m());
        }
        if (lhtVarG == null) {
            if (iu30Var != null) {
                iu30Var.invoke(jycVar);
            }
            lhtVar2 = mht.e;
        } else {
            lhtVar2 = lhtVarG;
        }
        if (jycVar instanceof vdy0) {
            ((vdy0) jycVar).X = lhtVar2;
            Iterator it3 = ((tdy0) jycVar).q().iterator();
            while (it3.hasNext()) {
                r((rdy0) it3.next(), lhtVarG == null ? null : iu30Var);
            }
            return;
        }
        if (jycVar instanceof qv30) {
            ((qv30) jycVar).Z = lhtVar2;
            return;
        }
        rdy0 rdy0Var = (rdy0) jycVar;
        rdy0Var.Y = lhtVar2;
        if (lhtVar2 != rdy0Var.i.getVisibility()) {
            rdy0Var.f = false;
        }
    }

    public static Object s(Collection collection, iu30 iu30Var) {
        Object next;
        if (collection.size() == 1) {
            Object objP0 = o7h.p0(collection);
            if (objP0 != null) {
                return objP0;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(q7h.U(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(iu30Var.invoke(it.next()));
        }
        Object objP1 = o7h.p0(collection);
        hyc hycVar = (hyc) iu30Var.invoke(objP1);
        for (Object obj : collection) {
            hyc hycVar2 = (hyc) iu30Var.invoke(obj);
            if (hycVar2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(hycVar2, (hyc) it2.next()));
            if (k(hycVar2, hycVar) && !k(hycVar, hycVar2)) {
                objP1 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objP1 != null) {
                return objP1;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objP2 = o7h.p0(arrayList);
            if (objP2 != null) {
                return objP2;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((hyc) iu30Var.invoke(next)).getReturnType().w0() instanceof dq20);
        if (next != null) {
            return next;
        }
        Object objP3 = o7h.p0(arrayList);
        if (objP3 != null) {
            return objP3;
        }
        a(82);
        throw null;
    }

    public final teb f(List list, List list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        b8b0 b8b0Var = this.a;
        if (zIsEmpty) {
            return new sjq0((Object) null, b8b0Var, (byte) 2).z0();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((y0h1) list.get(i)).g(), ((y0h1) list2.get(i)).g());
        }
        return new sjq0(map, b8b0Var, (byte) 2).z0();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection, p.a9, p.bi91] */
    public final void h(ajn0 ajn0Var, Collection collection, Collection collection2, beg begVar, mgo1 mgo1Var) {
        Integer numB;
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (begVar == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            jyc jycVar = (jyc) it.next();
            if (jycVar == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            ?? bi91Var = new bi91();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                jyc jycVar2 = (jyc) it2.next();
                int iB = l(jycVar2, jycVar, begVar).b();
                boolean z = !mht.e(jycVar2.getVisibility()) && mht.f(jycVar2, jycVar);
                int iC = l1d.C(iB);
                if (iC == 0) {
                    if (z) {
                        bi91Var.add(jycVar2);
                    }
                    arrayList.add(jycVar2);
                } else if (iC == 2) {
                    if (z) {
                        mgo1Var.n(jycVar2, jycVar);
                    }
                    arrayList.add(jycVar2);
                }
            }
            mgo1Var.x(jycVar, (Collection) bi91Var);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            n9r n9rVarK = ((jyc) linkedHashSet.iterator().next()).k();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((jyc) it3.next()).k() != n9rVarK) {
                        LinkedList<jyc> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            jyc jycVar3 = null;
                            for (jyc jycVar4 : linkedList) {
                                if (jycVar3 == null || ((numB = mht.b(jycVar3.getVisibility(), jycVar4.getVisibility())) != null && numB.intValue() < 0)) {
                                    jycVar3 = jycVar4;
                                }
                            }
                            jycVar3.getClass();
                            e(g(jycVar3, linkedList, new ryq((byte) 9), new wgb0(mgo1Var, jycVar3, (byte) 1)), begVar, mgo1Var);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((jyc) it4.next()), begVar, mgo1Var);
        }
    }

    public final dxq0 l(hyc hycVar, hyc hycVar2, beg begVar) {
        if (hycVar == null) {
            a(19);
            throw null;
        }
        if (hycVar2 != null) {
            return m(hycVar, hycVar2, begVar, false);
        }
        a(20);
        throw null;
    }

    public final dxq0 m(hyc hycVar, hyc hycVar2, beg begVar, boolean z) {
        if (hycVar == null) {
            a(22);
            throw null;
        }
        if (hycVar2 == null) {
            a(23);
            throw null;
        }
        dxq0 dxq0VarN = n(hycVar, hycVar2, z);
        boolean z2 = dxq0VarN.b() == 1;
        List<ExternalOverridabilityCondition> list = b;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            a810 a810Var = a810.a;
            if (!zHasNext) {
                if (!z2) {
                    return dxq0VarN;
                }
                for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
                    if (externalOverridabilityCondition.getContract() == a810Var) {
                        int iOrdinal = externalOverridabilityCondition.isOverridable(hycVar, hycVar2, begVar).ordinal();
                        if (iOrdinal == 0) {
                            eg.h("Contract violation in ", externalOverridabilityCondition.getClass().getName(), " condition. It's not supposed to end with success");
                            return null;
                        }
                        if (iOrdinal == 1) {
                            return dxq0.c("External condition");
                        }
                    }
                }
                dxq0 dxq0Var = dxq0.c;
                if (dxq0Var != null) {
                    return dxq0Var;
                }
                dxq0.a(0);
                throw null;
            }
            ExternalOverridabilityCondition externalOverridabilityCondition2 = (ExternalOverridabilityCondition) it.next();
            if (externalOverridabilityCondition2.getContract() != a810Var && (!z2 || externalOverridabilityCondition2.getContract() != a810.b)) {
                int iOrdinal2 = externalOverridabilityCondition2.isOverridable(hycVar, hycVar2, begVar).ordinal();
                if (iOrdinal2 == 0) {
                    z2 = true;
                } else if (iOrdinal2 == 1) {
                    return dxq0.c("External condition");
                }
            }
        }
    }

    public final dxq0 n(hyc hycVar, hyc hycVar2, boolean z) {
        if (hycVar == null) {
            a(28);
            throw null;
        }
        if (hycVar2 == null) {
            a(29);
            throw null;
        }
        dxq0 dxq0VarI = i(hycVar, hycVar2);
        if (dxq0VarI != null) {
            return dxq0VarI;
        }
        ArrayList arrayListD = d(hycVar);
        ArrayList arrayListD2 = d(hycVar2);
        List typeParameters = hycVar.getTypeParameters();
        List typeParameters2 = hycVar2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i = 0; i < arrayListD.size(); i++) {
                if (!c8b0.a.a((a8b0) arrayListD.get(i), (a8b0) arrayListD2.get(i))) {
                    return dxq0.c("Type parameter number mismatch");
                }
            }
            return new dxq0(3, "Type parameter number mismatch");
        }
        teb tebVarF = f(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            y0h1 y0h1Var = (y0h1) typeParameters.get(i2);
            y0h1 y0h1Var2 = (y0h1) typeParameters2.get(i2);
            if (y0h1Var == null) {
                a(47);
                throw null;
            }
            if (y0h1Var2 == null) {
                a(48);
                throw null;
            }
            List<a8b0> upperBounds = y0h1Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(y0h1Var2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (a8b0 a8b0Var : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(a8b0Var, (a8b0) listIterator.next(), tebVarF));
                    listIterator.remove();
                }
            }
            return dxq0.c("Type parameter bounds mismatch");
        }
        for (int i3 = 0; i3 < arrayListD.size(); i3++) {
            if (!b((a8b0) arrayListD.get(i3), (a8b0) arrayListD2.get(i3), tebVarF)) {
                return dxq0.c("Value parameter type mismatch");
            }
        }
        if ((hycVar instanceof ov30) && (hycVar2 instanceof ov30) && ((ov30) hycVar).isSuspend() != ((ov30) hycVar2).isSuspend()) {
            return new dxq0(3, "Incompatible suspendability");
        }
        if (z) {
            a8b0 returnType = hycVar.getReturnType();
            a8b0 returnType2 = hycVar2.getReturnType();
            if (returnType != null && returnType2 != null && (!d4o1.i(returnType2) || !d4o1.i(returnType))) {
                gmh1 gmh1VarW0 = returnType2.w0();
                gmh1 gmh1VarW1 = returnType.w0();
                if (!(gmh1VarW0 == gmh1VarW1 ? true : p9w.c.e(tebVarF, (m1h1) tebVarF.d, gmh1VarW0, gmh1VarW1))) {
                    return new dxq0(3, "Return type mismatch");
                }
            }
        }
        dxq0 dxq0Var = dxq0.c;
        if (dxq0Var != null) {
            return dxq0Var;
        }
        dxq0.a(0);
        throw null;
    }
}
