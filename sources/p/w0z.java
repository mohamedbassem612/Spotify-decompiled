package p;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w0z extends aqi0 {
    public final qoe0 b;
    public final qoe0 c;
    public final toe0 d;
    public final /* synthetic */ x0z e;

    public w0z(x0z x0zVar, s1c1 s1c1Var) {
        byte b = 0;
        if (s1c1Var == null) {
            h(0);
            throw null;
        }
        this.e = x0zVar;
        voe0 voe0Var = (voe0) s1c1Var;
        this.b = voe0Var.a(new v0z(this, b));
        this.c = voe0Var.a(new v0z(this, (byte) 1));
        this.d = new toe0(voe0Var, new x5u(this, (byte) 4));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static /* synthetic */ void h(int i) {
        String str;
        int i2;
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
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
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = "name";
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i != 12) {
            switch (i) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case 16:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case 18:
                    objArr[1] = "getClassifierNames";
                    break;
                case 19:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.aqi0, p.zpi0
    public final Collection a(ajn0 ajn0Var, int i) {
        if (ajn0Var == null) {
            h(1);
            throw null;
        }
        if (i != 0) {
            return (Collection) this.c.invoke(ajn0Var);
        }
        h(2);
        throw null;
    }

    @Override // p.aqi0, p.zpi0
    public final Set b() {
        Set set = (Set) this.e.i.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // p.aqi0, p.zpi0
    public final Collection c(ajn0 ajn0Var, int i) {
        if (ajn0Var == null) {
            h(5);
            throw null;
        }
        if (i != 0) {
            return (Collection) this.b.invoke(ajn0Var);
        }
        h(6);
        throw null;
    }

    @Override // p.aqi0, p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        if (wgtVar == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // p.aqi0, p.zpi0
    public final Set e() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override // p.aqi0, p.zpi0
    public final Set f() {
        Set set = (Set) this.e.i.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final zpi0 i() {
        zpi0 zpi0VarE = ((a8b0) ((ma) this.e.g()).d().iterator().next()).E();
        if (zpi0VarE != null) {
            return zpi0VarE;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(ajn0 ajn0Var, Collection collection) {
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        exq0.c.h(ajn0Var, collection, Collections.EMPTY_SET, this.e, new tht(linkedHashSet, (byte) 1));
        return linkedHashSet;
    }
}
