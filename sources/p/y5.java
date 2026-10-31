package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class y5 extends wim0 {
    public final ajn0 a;
    public final toe0 b;
    public final toe0 c;
    public final toe0 d;

    public y5(s1c1 s1c1Var, ajn0 ajn0Var) {
        byte b = 0;
        if (s1c1Var == null) {
            l0(0);
            throw null;
        }
        byte b2 = 1;
        if (ajn0Var == null) {
            l0(1);
            throw null;
        }
        this.a = ajn0Var;
        voe0 voe0Var = (voe0) s1c1Var;
        this.b = new toe0(voe0Var, new x5(this, b));
        this.c = new toe0(voe0Var, new x5(this, b2));
        this.d = new toe0(voe0Var, new x5(this, (byte) 2));
    }

    public static /* synthetic */ void l0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.beg
    public zpi0 O() {
        zpi0 zpi0Var = (zpi0) this.c.invoke();
        if (zpi0Var != null) {
            return zpi0Var;
        }
        l0(4);
        throw null;
    }

    @Override // p.beg
    public zpi0 R() {
        kht.h(iht.c(this));
        zpi0 zpi0VarC0 = c0(g8b0.b);
        if (zpi0VarC0 != null) {
            return zpi0VarC0;
        }
        l0(17);
        throw null;
    }

    @Override // p.beg
    public List T() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        l0(6);
        throw null;
    }

    @Override // p.n9r
    public final ajn0 getName() {
        ajn0 ajn0Var = this.a;
        if (ajn0Var != null) {
            return ajn0Var;
        }
        l0(2);
        throw null;
    }

    @Override // p.beg, p.jfg
    public final qx81 m() {
        qx81 qx81Var = (qx81) this.b.invoke();
        if (qx81Var != null) {
            return qx81Var;
        }
        l0(20);
        throw null;
    }

    @Override // p.apc1
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public beg d(l1h1 l1h1Var) {
        if (l1h1Var != null) {
            return l1h1Var.a.e() ? this : new qvb0(this, l1h1Var);
        }
        l0(18);
        throw null;
    }

    @Override // p.beg
    public final rob0 q0() {
        rob0 rob0Var = (rob0) this.d.invoke();
        if (rob0Var != null) {
            return rob0Var;
        }
        l0(5);
        throw null;
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.p(this, obj);
    }

    @Override // p.beg
    public final zpi0 y(j1h1 j1h1Var) {
        kht.h(iht.c(this));
        zpi0 zpi0VarF = f(j1h1Var, g8b0.b);
        if (zpi0VarF != null) {
            return zpi0VarF;
        }
        l0(16);
        throw null;
    }

    @Override // p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final n9r w1() {
        return this;
    }

    @Override // p.beg, p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final beg w1() {
        return this;
    }

    @Override // p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final jfg w1() {
        return this;
    }
}
