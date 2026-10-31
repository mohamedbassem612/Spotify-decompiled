package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qvb0 extends wim0 {
    public final wim0 a;
    public final l1h1 b;
    public l1h1 c;
    public ArrayList d;
    public ArrayList e;
    public oeg f;

    public qvb0(wim0 wim0Var, l1h1 l1h1Var) {
        this.a = wim0Var;
        this.b = l1h1Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void l0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 8) {
            objArr[0] = "typeArguments";
        } else if (i == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // p.beg
    public final xdg B() {
        return this.a.B();
    }

    @Override // p.beg
    public final zpi0 O() {
        zpi0 zpi0VarO = this.a.O();
        if (zpi0VarO != null) {
            return zpi0VarO;
        }
        l0(28);
        throw null;
    }

    @Override // p.beg
    public final ksi1 Q() {
        ksi1 ksi1VarQ = this.a.Q();
        if (ksi1VarQ == null) {
            return null;
        }
        boolean z = ksi1VarQ instanceof uf80;
        l1h1 l1h1Var = this.b;
        if (z) {
            uf80 uf80Var = (uf80) ksi1VarQ;
            ajn0 ajn0Var = uf80Var.a;
            qx81 qx81Var = (qx81) uf80Var.b;
            if (qx81Var != null && !l1h1Var.a.e()) {
                qx81Var = (qx81) o0().h(1, qx81Var);
            }
            return new uf80(ajn0Var, qx81Var);
        }
        if (!(ksi1VarQ instanceof brm0)) {
            eg.o();
            return null;
        }
        ArrayList<mmr0> arrayList = ((brm0) ksi1VarQ).a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (mmr0 mmr0Var : arrayList) {
            ajn0 ajn0Var2 = (ajn0) mmr0Var.a;
            qx81 qx81Var2 = (qx81) ((qh31) mmr0Var.b);
            if (qx81Var2 != null && !l1h1Var.a.e()) {
                qx81Var2 = (qx81) o0().h(1, qx81Var2);
            }
            arrayList2.add(new mmr0(ajn0Var2, qx81Var2));
        }
        return new brm0(arrayList2);
    }

    @Override // p.beg
    public final zpi0 R() {
        kht.h(iht.c(this.a));
        return c0(g8b0.b);
    }

    @Override // p.zji0
    public final boolean S() {
        return this.a.S();
    }

    @Override // p.beg
    public final List T() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        l0(17);
        throw null;
    }

    @Override // p.beg
    public final boolean U() {
        return this.a.U();
    }

    @Override // p.beg
    public final boolean W() {
        return this.a.W();
    }

    @Override // p.zji0
    public final boolean Z() {
        return this.a.Z();
    }

    @Override // p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final beg w1() {
        beg begVarW1 = this.a.w1();
        if (begVarW1 != null) {
            return begVarW1;
        }
        l0(21);
        throw null;
    }

    @Override // p.beg
    public final zpi0 a0() {
        zpi0 zpi0VarA0 = this.a.a0();
        if (zpi0VarA0 != null) {
            return zpi0VarA0;
        }
        l0(15);
        throw null;
    }

    @Override // p.wim0
    public final zpi0 c0(g8b0 g8b0Var) {
        zpi0 zpi0VarC0 = this.a.c0(g8b0Var);
        if (!this.b.a.e()) {
            return new dpc1(zpi0VarC0, o0());
        }
        if (zpi0VarC0 != null) {
            return zpi0VarC0;
        }
        l0(14);
        throw null;
    }

    @Override // p.apc1
    public final p9r d(l1h1 l1h1Var) {
        if (l1h1Var != null) {
            j1h1 j1h1Var = l1h1Var.a;
            return j1h1Var.e() ? this : new qvb0(this, l1h1.e(j1h1Var, o0().a));
        }
        l0(23);
        throw null;
    }

    @Override // p.beg
    public final int e0() {
        int iE0 = this.a.e0();
        if (iE0 != 0) {
            return iE0;
        }
        l0(25);
        throw null;
    }

    @Override // p.wim0
    public final zpi0 f(j1h1 j1h1Var, g8b0 g8b0Var) {
        zpi0 zpi0VarF = this.a.f(j1h1Var, g8b0Var);
        if (!this.b.a.e()) {
            return new dpc1(zpi0VarF, o0());
        }
        if (zpi0VarF != null) {
            return zpi0VarF;
        }
        l0(7);
        throw null;
    }

    @Override // p.jfg
    public final h0h1 g() {
        h0h1 h0h1VarG = this.a.g();
        if (this.b.a.e()) {
            if (h0h1VarG != null) {
                return h0h1VarG;
            }
            l0(0);
            throw null;
        }
        oeg oegVar = this.f;
        if (oegVar != null) {
            return oegVar;
        }
        l1h1 l1h1VarO0 = o0();
        Collection collectionD = h0h1VarG.d();
        ArrayList arrayList = new ArrayList(collectionD.size());
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add(l1h1VarO0.h(1, (a8b0) it.next()));
        }
        oeg oegVar2 = new oeg(this, this.d, arrayList, voe0.e);
        this.f = oegVar2;
        return oegVar2;
    }

    public final fg5 getAnnotations() {
        fg5 annotations = this.a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        l0(19);
        throw null;
    }

    @Override // p.n9r
    public final ajn0 getName() {
        ajn0 name = this.a.getName();
        if (name != null) {
            return name;
        }
        l0(20);
        throw null;
    }

    @Override // p.p9r
    public final mka1 getSource() {
        return mka1.m0;
    }

    @Override // p.beg, p.zji0, p.s9r
    public final lht getVisibility() {
        lht visibility = this.a.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        l0(27);
        throw null;
    }

    @Override // p.beg
    public final Collection h() {
        Collection<xdg> collectionH = this.a.h();
        ArrayList arrayList = new ArrayList(collectionH.size());
        for (xdg xdgVar : collectionH) {
            xdgVar.getClass();
            pv30 pv30VarC1 = xdgVar.C1(l1h1.b);
            pv30VarC1.e = xdgVar.w1();
            pv30VarC1.q(xdgVar.o());
            pv30VarC1.h(xdgVar.getVisibility());
            pv30VarC1.c(xdgVar.getKind());
            pv30VarC1.Z = false;
            arrayList.add(((xdg) pv30VarC1.X0.z1(pv30VarC1)).d(o0()));
        }
        return arrayList;
    }

    @Override // p.zji0
    public final boolean isExternal() {
        return this.a.isExternal();
    }

    @Override // p.beg
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // p.kfg
    public final boolean j() {
        return this.a.j();
    }

    @Override // p.n9r
    public final n9r k() {
        n9r n9rVarK = this.a.k();
        if (n9rVarK != null) {
            return n9rVarK;
        }
        l0(22);
        throw null;
    }

    @Override // p.beg, p.jfg
    public final qx81 m() {
        e0h1 e0h1VarD;
        List listD = o1h1.d(g().getParameters());
        fg5 annotations = getAnnotations();
        if (annotations.isEmpty()) {
            e0h1.b.getClass();
            e0h1VarD = e0h1.c;
        } else {
            ffe1 ffe1Var = e0h1.b;
            List listSingletonList = Collections.singletonList(new ig5(annotations));
            ffe1Var.getClass();
            e0h1VarD = ffe1.d(listSingletonList);
        }
        return y3o1.j0(listD, R(), e0h1VarD, g(), false);
    }

    @Override // p.beg, p.kfg
    public final List n() {
        o0();
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            return arrayList;
        }
        l0(30);
        throw null;
    }

    @Override // p.beg, p.zji0
    public final int o() {
        int iO = this.a.o();
        if (iO != 0) {
            return iO;
        }
        l0(26);
        throw null;
    }

    public final l1h1 o0() {
        if (this.c == null) {
            l1h1 l1h1Var = this.b;
            if (l1h1Var.a.e()) {
                this.c = l1h1Var;
            } else {
                List parameters = this.a.g().getParameters();
                ArrayList arrayList = new ArrayList(parameters.size());
                this.d = arrayList;
                this.c = jm5.o(parameters, l1h1Var.a, this, arrayList);
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!((y0h1) obj).N()) {
                        arrayList3.add(obj);
                    }
                }
                this.e = arrayList3;
            }
        }
        return this.c;
    }

    @Override // p.beg
    public final boolean p() {
        return this.a.p();
    }

    @Override // p.beg
    public final boolean p0() {
        return this.a.p0();
    }

    @Override // p.beg
    public final rob0 q0() {
        throw new UnsupportedOperationException();
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.p(this, obj);
    }

    @Override // p.beg
    public final zpi0 y(j1h1 j1h1Var) {
        kht.h(iht.c(this));
        return f(j1h1Var, g8b0.b);
    }
}
