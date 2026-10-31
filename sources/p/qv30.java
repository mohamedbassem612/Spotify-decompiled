package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class qv30 extends q9r implements ov30 {
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public rob0 X;
    public boolean X0;
    public int Y;
    public Collection Y0;
    public lht Z;
    public volatile na Z0;
    public final ov30 a1;
    public final int b1;
    public ov30 c1;
    public Map d1;
    public List f;
    public List g;
    public a8b0 h;
    public List i;
    public rob0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv30(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var) {
        super(n9rVar, fg5Var, ajn0Var, mka1Var);
        if (n9rVar == null) {
            r0(0);
            throw null;
        }
        if (fg5Var == null) {
            r0(1);
            throw null;
        }
        if (ajn0Var == null) {
            r0(2);
            throw null;
        }
        if (i == 0) {
            r0(3);
            throw null;
        }
        if (mka1Var == null) {
            r0(4);
            throw null;
        }
        this.Z = mht.i;
        this.N0 = false;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.R0 = false;
        this.S0 = false;
        this.T0 = false;
        this.U0 = false;
        this.V0 = false;
        this.W0 = true;
        this.X0 = false;
        this.Y0 = null;
        this.Z0 = null;
        this.c1 = null;
        this.d1 = null;
        this.a1 = ov30Var == null ? this : ov30Var;
        this.b1 = i;
    }

    public static ArrayList A1(ov30 ov30Var, List list, l1h1 l1h1Var, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            r0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tsi1 tsi1Var = (tsi1) it.next();
            a8b0 a8b0VarH = l1h1Var.h(2, tsi1Var.getType());
            a8b0 a8b0Var = tsi1Var.X;
            a8b0 a8b0VarH2 = a8b0Var == null ? null : l1h1Var.h(2, a8b0Var);
            if (a8b0VarH == null) {
                return null;
            }
            if ((a8b0VarH != tsi1Var.getType() || a8b0Var != a8b0VarH2) && zArr != null) {
                zArr[0] = true;
            }
            ea eaVar = tsi1Var instanceof ssi1 ? new ea((List) ((ssi1) tsi1Var).Z.getValue()) : null;
            tsi1 tsi1Var2 = z ? null : tsi1Var;
            int i = tsi1Var.g;
            fg5 annotations = tsi1Var.getAnnotations();
            ajn0 name = tsi1Var.getName();
            boolean zY1 = tsi1Var.y1();
            boolean z3 = tsi1Var.i;
            boolean z4 = tsi1Var.t;
            mka1 source = z2 ? tsi1Var.getSource() : mka1.m0;
            arrayList.add(eaVar == null ? new tsi1(ov30Var, tsi1Var2, i, annotations, name, a8b0VarH, zY1, z3, z4, a8b0VarH2, source) : new ssi1(ov30Var, tsi1Var2, i, annotations, name, a8b0VarH, zY1, z3, z4, a8b0VarH2, source, eaVar));
        }
        return arrayList;
    }

    public static /* synthetic */ void r0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public boolean A() {
        return this.R0;
    }

    public void B1(rob0 rob0Var, rob0 rob0Var2, List list, List list2, List list3, a8b0 a8b0Var, int i, lht lhtVar) {
        if (list == null) {
            r0(5);
            throw null;
        }
        if (list2 == null) {
            r0(6);
            throw null;
        }
        if (list3 == null) {
            r0(7);
            throw null;
        }
        if (lhtVar == null) {
            r0(8);
            throw null;
        }
        this.f = o7h.l1(list2);
        this.g = o7h.l1(list3);
        this.h = a8b0Var;
        this.Y = i;
        this.Z = lhtVar;
        this.t = rob0Var;
        this.X = rob0Var2;
        this.i = list;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            y0h1 y0h1Var = (y0h1) list2.get(i2);
            if (y0h1Var.getIndex() != i2) {
                StringBuilder sb = new StringBuilder();
                sb.append(y0h1Var);
                int index = y0h1Var.getIndex();
                sb.append(" index is ");
                sb.append(index);
                sb.append(" but position is ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i3 = 0; i3 < list3.size(); i3++) {
            tsi1 tsi1Var = (tsi1) list3.get(i3);
            if (tsi1Var.g != i3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tsi1Var);
                int i4 = tsi1Var.g;
                sb2.append("index is ");
                sb2.append(i4);
                sb2.append(" but position is ");
                sb2.append(i3);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final pv30 C1(l1h1 l1h1Var) {
        if (l1h1Var != null) {
            return new pv30(this, l1h1Var.a, k(), o(), getVisibility(), getKind(), F(), g0(), this.t, getReturnType());
        }
        r0(24);
        throw null;
    }

    public void D1(boolean z) {
        this.W0 = z;
    }

    public void E1(boolean z) {
        this.X0 = z;
    }

    @Override // p.hyc
    public final List F() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        r0(19);
        throw null;
    }

    public final void F1(qx81 qx81Var) {
        if (qx81Var != null) {
            this.h = qx81Var;
        } else {
            r0(11);
            throw null;
        }
    }

    @Override // p.hyc
    public final rob0 I() {
        return this.X;
    }

    @Override // p.hyc
    public final rob0 L() {
        return this.t;
    }

    @Override // p.zji0
    public final boolean S() {
        return false;
    }

    public boolean Y() {
        return this.X0;
    }

    @Override // p.zji0
    public final boolean Z() {
        return this.S0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.ov30] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // p.q9r, p.o9r, p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public ov30 w1() {
        ov30 ov30VarW1;
        ov30 ov30Var = this.a1;
        ?? r1 = this;
        if (ov30Var != this) {
            ov30VarW1 = ov30Var.w1();
        }
        if (r1 != 0) {
            r1 = ov30VarW1;
            return r1;
        }
        r1 = ov30VarW1;
        r0(20);
        throw null;
    }

    @Override // p.apc1
    public ov30 d(l1h1 l1h1Var) {
        if (l1h1Var == null) {
            r0(22);
            throw null;
        }
        if (l1h1Var.a.e()) {
            return this;
        }
        pv30 pv30VarC1 = C1(l1h1Var);
        pv30VarC1.e = w1();
        pv30VarC1.O0 = true;
        pv30VarC1.W0 = true;
        return pv30VarC1.X0.z1(pv30VarC1);
    }

    @Override // p.ov30
    public final ov30 d0() {
        return this.c1;
    }

    @Override // p.hyc
    public final List g0() {
        List list = this.i;
        if (list != null) {
            return list;
        }
        r0(13);
        throw null;
    }

    @Override // p.jyc
    public final int getKind() {
        int i = this.b1;
        if (i != 0) {
            return i;
        }
        r0(21);
        throw null;
    }

    @Override // p.hyc
    public a8b0 getReturnType() {
        return this.h;
    }

    @Override // p.hyc
    public final List getTypeParameters() {
        List list = this.f;
        if (list != null) {
            return list;
        }
        bhn0.A(this, "typeParameters == null for ");
        return null;
    }

    @Override // p.s9r
    public final lht getVisibility() {
        lht lhtVar = this.Z;
        if (lhtVar != null) {
            return lhtVar;
        }
        r0(16);
        throw null;
    }

    public boolean isExternal() {
        return this.P0;
    }

    @Override // p.ov30
    public final boolean isInfix() {
        if (this.O0) {
            return true;
        }
        Iterator it = w1().l().iterator();
        while (it.hasNext()) {
            if (((ov30) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.Q0;
    }

    @Override // p.ov30
    public final boolean isOperator() {
        if (this.N0) {
            return true;
        }
        Iterator it = w1().l().iterator();
        while (it.hasNext()) {
            if (((ov30) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.V0;
    }

    @Override // p.ov30
    public final boolean j0() {
        return this.T0;
    }

    public void k0(Collection collection) {
        if (collection == null) {
            r0(17);
            throw null;
        }
        this.Y0 = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((ov30) it.next()).m0()) {
                this.U0 = true;
                return;
            }
        }
    }

    @Override // p.jyc, p.hyc
    public Collection l() {
        na naVar = this.Z0;
        if (naVar != null) {
            this.Y0 = (Collection) naVar.invoke();
            this.Z0 = null;
        }
        Collection collection = this.Y0;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        r0(14);
        throw null;
    }

    @Override // p.ov30
    public final boolean m0() {
        return this.U0;
    }

    public nv30 n0() {
        return C1(l1h1.b);
    }

    @Override // p.zji0
    public final int o() {
        int i = this.Y;
        if (i != 0) {
            return i;
        }
        r0(15);
        throw null;
    }

    @Override // p.n9r
    public Object r(r9r r9rVar, Object obj) {
        return r9rVar.C(this, obj);
    }

    public Object w(yht yhtVar) {
        Map map = this.d1;
        if (map == null) {
            return null;
        }
        return map.get(yhtVar);
    }

    public final ov30 x1(n9r n9rVar, int i, lht lhtVar) {
        ov30 ov30VarBuild = n0().m(n9rVar).q(i).h(lhtVar).c(2).j().build();
        if (ov30VarBuild != null) {
            return ov30VarBuild;
        }
        r0(26);
        throw null;
    }

    public abstract qv30 y1(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var);

    /* JADX WARN: Code duplicated, block: B:103:0x0218  */
    /* JADX WARN: Code duplicated, block: B:106:0x021d  */
    /* JADX WARN: Code duplicated, block: B:114:0x023e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0242  */
    /* JADX WARN: Code duplicated, block: B:118:0x0245  */
    /* JADX WARN: Code duplicated, block: B:120:0x024d  */
    /* JADX WARN: Code duplicated, block: B:129:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x015d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:98:0x020e  */
    public qv30 z1(pv30 pv30Var) {
        fg5 annotations;
        char c;
        rob0 rob0Var;
        rob0 rob0Var2;
        rob0 rob0Var3;
        rob0 rob0Var4;
        ArrayList arrayListA1;
        a8b0 a8b0VarH;
        char c2;
        boolean z;
        Boolean bool;
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap;
        Map map;
        ov30 ov30Var;
        na naVar;
        rob0 rob0VarD;
        char c3;
        a8b0 a8b0VarH2;
        char c4;
        boolean[] zArr = new boolean[1];
        char c5 = 0;
        if (pv30Var.S0 != null) {
            annotations = getAnnotations();
            fg5 fg5Var = pv30Var.S0;
            if (annotations.isEmpty()) {
                annotations = fg5Var;
            } else if (!fg5Var.isEmpty()) {
                annotations = new hg5(new fg5[]{annotations, fg5Var});
            }
        } else {
            annotations = getAnnotations();
        }
        fg5 fg5Var2 = annotations;
        n9r n9rVar = pv30Var.b;
        ov30 ov30Var2 = pv30Var.e;
        int i = pv30Var.f;
        ajn0 ajn0Var = pv30Var.Y;
        mka1 source = pv30Var.O0 ? ((q9r) (ov30Var2 != null ? ov30Var2 : w1())).getSource() : mka1.m0;
        if (source == null) {
            r0(27);
            throw null;
        }
        qv30 qv30VarY1 = y1(i, fg5Var2, n9rVar, ov30Var2, ajn0Var, source);
        List typeParameters = pv30Var.R0;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = (zArr[0] ? 1 : 0) | (!typeParameters.isEmpty() ? 1 : 0);
        ArrayList arrayList = new ArrayList(typeParameters.size());
        l1h1 l1h1VarP = jm5.p(typeParameters, pv30Var.a, qv30VarY1, arrayList, zArr);
        if (l1h1VarP != null) {
            ArrayList arrayList2 = new ArrayList();
            if (pv30Var.h.isEmpty()) {
                c = c5;
                rob0Var = pv30Var.i;
                if (rob0Var != null) {
                    a8b0VarH2 = l1h1VarP.h(2, rob0Var.getType());
                    if (a8b0VarH2 != null) {
                        pv30Var.i.x1();
                        rob0 rob0Var5 = new rob0(qv30VarY1, new kz00(qv30VarY1, a8b0VarH2), pv30Var.i.getAnnotations());
                        boolean z2 = zArr[c];
                        if (a8b0VarH2 != pv30Var.i.getType()) {
                            c4 = 1;
                        } else {
                            c4 = c;
                        }
                        zArr[c] = c4 | (z2 ? 1 : 0);
                        rob0Var2 = rob0Var5;
                    }
                } else {
                    rob0Var2 = null;
                }
                rob0Var3 = pv30Var.t;
                if (rob0Var3 != null) {
                    rob0VarD = rob0Var3.d(l1h1VarP);
                    if (rob0VarD != null) {
                        boolean z3 = zArr[c];
                        if (rob0VarD != pv30Var.t) {
                            c3 = 1;
                        } else {
                            c3 = c;
                        }
                        zArr[c] = (z3 ? 1 : 0) | c3;
                        rob0Var4 = rob0VarD;
                    }
                } else {
                    rob0Var4 = null;
                }
                arrayListA1 = A1(qv30VarY1, pv30Var.g, l1h1VarP, pv30Var.P0, pv30Var.O0, zArr);
                if (arrayListA1 != null) {
                    boolean z4 = zArr[c];
                    if (a8b0VarH != pv30Var.X) {
                        c2 = 1;
                    } else {
                        c2 = c;
                    }
                    z = (z4 ? 1 : 0) | c2;
                    zArr[c] = z;
                    if (z != 0) {
                    }
                    qv30VarY1.B1(rob0Var2, rob0Var4, arrayList2, arrayList, arrayListA1, a8b0VarH, pv30Var.c, pv30Var.d);
                    qv30VarY1.N0 = this.N0;
                    qv30VarY1.O0 = this.O0;
                    qv30VarY1.P0 = this.P0;
                    qv30VarY1.Q0 = this.Q0;
                    qv30VarY1.R0 = this.R0;
                    qv30VarY1.V0 = this.V0;
                    qv30VarY1.S0 = this.S0;
                    qv30VarY1.D1(this.W0);
                    qv30VarY1.T0 = pv30Var.Q0;
                    qv30VarY1.U0 = pv30Var.T0;
                    bool = pv30Var.V0;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.X0;
                    }
                    qv30VarY1.E1(zBooleanValue);
                    if (pv30Var.U0.isEmpty()) {
                        linkedHashMap = pv30Var.U0;
                        map = this.d1;
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            qv30VarY1.d1 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            qv30VarY1.d1 = linkedHashMap;
                        }
                    } else {
                        linkedHashMap = pv30Var.U0;
                        map = this.d1;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            qv30VarY1.d1 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            qv30VarY1.d1 = linkedHashMap;
                        }
                    }
                    if (pv30Var.N0) {
                        ov30Var = this.c1;
                        if (ov30Var == null) {
                            ov30Var = this;
                        }
                        qv30VarY1.c1 = ov30Var.d(l1h1VarP);
                    } else {
                        ov30Var = this.c1;
                        if (ov30Var == null) {
                            ov30Var = this;
                        }
                        qv30VarY1.c1 = ov30Var.d(l1h1VarP);
                    }
                    if (pv30Var.Z) {
                        if (pv30Var.a.e()) {
                            naVar = this.Z0;
                            if (naVar != null) {
                                qv30VarY1.Z0 = naVar;
                                return qv30VarY1;
                            }
                            qv30VarY1.k0(l());
                            return qv30VarY1;
                        }
                        qv30VarY1.Z0 = new na((q9r) this, (Object) l1h1VarP, (byte) 13);
                    }
                    return qv30VarY1;
                }
            } else {
                int i2 = 0;
                for (rob0 rob0Var6 : pv30Var.h) {
                    a8b0 a8b0VarH3 = l1h1VarP.h(2, rob0Var6.getType());
                    if (a8b0VarH3 != null) {
                        char c6 = c5;
                        int i3 = i2 + 1;
                        arrayList2.add(sj1.h(qv30VarY1, a8b0VarH3, ((gbm) rob0Var6.x1()).v1(), rob0Var6.getAnnotations(), i2));
                        zArr[c6] = (zArr[c6] ? 1 : 0) | (a8b0VarH3 != rob0Var6.getType() ? (char) 1 : c6);
                        c5 = c6;
                        i2 = i3;
                    }
                }
                c = c5;
                rob0Var = pv30Var.i;
                if (rob0Var != null) {
                    a8b0VarH2 = l1h1VarP.h(2, rob0Var.getType());
                    if (a8b0VarH2 != null) {
                        pv30Var.i.x1();
                        rob0 rob0Var7 = new rob0(qv30VarY1, new kz00(qv30VarY1, a8b0VarH2), pv30Var.i.getAnnotations());
                        boolean z5 = zArr[c];
                        if (a8b0VarH2 != pv30Var.i.getType()) {
                            c4 = 1;
                        } else {
                            c4 = c;
                        }
                        zArr[c] = c4 | (z5 ? 1 : 0);
                        rob0Var2 = rob0Var7;
                    }
                } else {
                    rob0Var2 = null;
                }
                rob0Var3 = pv30Var.t;
                if (rob0Var3 != null) {
                    rob0VarD = rob0Var3.d(l1h1VarP);
                    if (rob0VarD != null) {
                        boolean z6 = zArr[c];
                        if (rob0VarD != pv30Var.t) {
                            c3 = 1;
                        } else {
                            c3 = c;
                        }
                        zArr[c] = (z6 ? 1 : 0) | c3;
                        rob0Var4 = rob0VarD;
                    }
                } else {
                    rob0Var4 = null;
                }
                arrayListA1 = A1(qv30VarY1, pv30Var.g, l1h1VarP, pv30Var.P0, pv30Var.O0, zArr);
                if (arrayListA1 != null && (a8b0VarH = l1h1VarP.h(3, pv30Var.X)) != null) {
                    boolean z7 = zArr[c];
                    if (a8b0VarH != pv30Var.X) {
                        c2 = 1;
                    } else {
                        c2 = c;
                    }
                    z = (z7 ? 1 : 0) | c2;
                    zArr[c] = z;
                    if (z != 0 && pv30Var.W0) {
                        return this;
                    }
                    qv30VarY1.B1(rob0Var2, rob0Var4, arrayList2, arrayList, arrayListA1, a8b0VarH, pv30Var.c, pv30Var.d);
                    qv30VarY1.N0 = this.N0;
                    qv30VarY1.O0 = this.O0;
                    qv30VarY1.P0 = this.P0;
                    qv30VarY1.Q0 = this.Q0;
                    qv30VarY1.R0 = this.R0;
                    qv30VarY1.V0 = this.V0;
                    qv30VarY1.S0 = this.S0;
                    qv30VarY1.D1(this.W0);
                    qv30VarY1.T0 = pv30Var.Q0;
                    qv30VarY1.U0 = pv30Var.T0;
                    bool = pv30Var.V0;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.X0;
                    }
                    qv30VarY1.E1(zBooleanValue);
                    if (pv30Var.U0.isEmpty() || this.d1 != null) {
                        linkedHashMap = pv30Var.U0;
                        map = this.d1;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            qv30VarY1.d1 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            qv30VarY1.d1 = linkedHashMap;
                        }
                    }
                    if (pv30Var.N0 || this.c1 != null) {
                        ov30Var = this.c1;
                        if (ov30Var == null) {
                            ov30Var = this;
                        }
                        qv30VarY1.c1 = ov30Var.d(l1h1VarP);
                    }
                    if (pv30Var.Z && !w1().l().isEmpty()) {
                        if (pv30Var.a.e()) {
                            naVar = this.Z0;
                            if (naVar != null) {
                                qv30VarY1.Z0 = naVar;
                                return qv30VarY1;
                            }
                            qv30VarY1.k0(l());
                            return qv30VarY1;
                        }
                        qv30VarY1.Z0 = new na((q9r) this, (Object) l1h1VarP, (byte) 13);
                    }
                    return qv30VarY1;
                }
            }
        }
        return null;
    }
}
