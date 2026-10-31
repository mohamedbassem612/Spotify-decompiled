package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class udy0 {
    public n9r a;
    public int b;
    public lht c;
    public int e;
    public final rob0 h;
    public final ajn0 i;
    public final a8b0 j;
    public final /* synthetic */ vdy0 k;
    public tdy0 d = null;
    public j1h1 f = j1h1.a;
    public boolean g = true;

    public udy0(vdy0 vdy0Var) {
        this.k = vdy0Var;
        this.a = vdy0Var.k();
        this.b = vdy0Var.o();
        this.c = vdy0Var.getVisibility();
        this.e = vdy0Var.getKind();
        this.h = vdy0Var.U0;
        this.i = vdy0Var.getName();
        this.j = vdy0Var.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Collection, p.a9, p.bi91] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [p.fey0, p.ov30, p.rdy0] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [p.zdy0] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [p.fey0] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable, p.vdy0] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [p.rdy0, p.zdy0] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r4v15, types: [p.v120] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [p.a8b0] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r6v11, types: [p.v120] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, p.hyc, p.n9r, p.tdy0, p.vdy0] */
    public final vdy0 a() {
        rob0 rob0Var;
        rob0 rob0Var2;
        ?? zdy0Var;
        ?? fey0Var;
        l1h1 l1h1Var;
        Function0 function0;
        a8b0 a8b0VarH;
        n9r n9rVar = this.a;
        int i = this.b;
        lht lhtVar = this.c;
        tdy0 tdy0Var = this.d;
        int i2 = this.e;
        ajn0 ajn0Var = this.i;
        vdy0 vdy0Var = this.k;
        ?? Z1 = vdy0Var.z1(n9rVar, i, lhtVar, tdy0Var, i2, ajn0Var);
        List typeParameters = vdy0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        l1h1 l1h1VarO = jm5.o(typeParameters, this.f, Z1, arrayList);
        a8b0 a8b0Var = this.j;
        a8b0 a8b0VarH2 = l1h1VarO.h(3, a8b0Var);
        rob0 rob0Var3 = null;
        if (a8b0VarH2 != null) {
            int i3 = 2;
            a8b0 a8b0VarH3 = l1h1VarO.h(2, a8b0Var);
            if (a8b0VarH3 != null) {
                Z1.D1(a8b0VarH3);
            }
            rob0 rob0Var4 = this.h;
            if (rob0Var4 != null) {
                rob0 rob0VarD = rob0Var4.d(l1h1VarO);
                rob0Var = rob0VarD != null ? rob0VarD : null;
            }
            rob0 rob0Var5 = vdy0Var.V0;
            if (rob0Var5 == null || (a8b0VarH = l1h1VarO.h(2, rob0Var5.getType())) == null) {
                rob0Var2 = null;
            } else {
                rob0Var5.x1();
                rob0Var2 = new rob0(Z1, new kz00(Z1, a8b0VarH), rob0Var5.getAnnotations());
            }
            ArrayList arrayList2 = new ArrayList();
            for (rob0 rob0Var6 : vdy0Var.T0) {
                a8b0 a8b0VarH4 = l1h1VarO.h(i3, rob0Var6.getType());
                if (a8b0VarH4 != null) {
                    ajn0 ajn0VarV1 = ((gbm) rob0Var6.x1()).v1();
                    rob0Var6.x1();
                    rob0Var3 = new rob0(Z1, new gbm(Z1, a8b0VarH4, ajn0VarV1, (byte) 1), rob0Var6.getAnnotations());
                }
                if (rob0Var3 != null) {
                    arrayList2.add(rob0Var3);
                }
                rob0Var3 = rob0Var3;
                i3 = 2;
            }
            ?? r19 = rob0Var3;
            Z1.E1(a8b0VarH2, arrayList, rob0Var, rob0Var2, arrayList2);
            zdy0 zdy0Var2 = vdy0Var.X0;
            c9c c9cVar = mka1.m0;
            if (zdy0Var2 == null) {
                zdy0Var = r19;
            } else {
                fg5 annotations = zdy0Var2.getAnnotations();
                int i4 = this.b;
                lht visibility = vdy0Var.X0.getVisibility();
                if (this.e == 2 && mht.e(mht.g(visibility.a.m()))) {
                    visibility = mht.h;
                }
                lht lhtVar2 = visibility;
                zdy0 zdy0Var3 = vdy0Var.X0;
                boolean z = zdy0Var3.f;
                boolean z2 = zdy0Var3.g;
                boolean z3 = zdy0Var3.t;
                int i5 = this.e;
                tdy0 tdy0Var2 = this.d;
                zdy0Var = new zdy0(Z1, annotations, i4, lhtVar2, z, z2, z3, i5, tdy0Var2 == null ? r19 : tdy0Var2.b(), c9cVar);
            }
            if (zdy0Var != 0) {
                zdy0 zdy0Var4 = vdy0Var.X0;
                a8b0 a8b0Var2 = zdy0Var4.N0;
                zdy0Var.Z = vdy0.A1(l1h1VarO, zdy0Var4);
                zdy0Var.A1(a8b0Var2 != null ? l1h1VarO.h(3, a8b0Var2) : r19);
            }
            fey0 fey0Var2 = vdy0Var.Y0;
            if (fey0Var2 == null) {
                fey0Var = r19;
            } else {
                fg5 annotations2 = fey0Var2.getAnnotations();
                int i6 = this.b;
                lht visibility2 = vdy0Var.Y0.getVisibility();
                if (this.e == 2 && mht.e(mht.g(visibility2.a.m()))) {
                    visibility2 = mht.h;
                }
                lht lhtVar3 = visibility2;
                fey0 fey0Var3 = vdy0Var.Y0;
                boolean z4 = fey0Var3.f;
                boolean z5 = fey0Var3.g;
                boolean z6 = fey0Var3.t;
                int i7 = this.e;
                tdy0 tdy0Var3 = this.d;
                fey0Var = new fey0(Z1, annotations2, i6, lhtVar3, z4, z5, z6, i7, tdy0Var3 == null ? r19 : tdy0Var3.c(), c9cVar);
            }
            if (fey0Var != 0) {
                l1h1Var = l1h1VarO;
                List listA1 = qv30.A1(fey0Var, vdy0Var.Y0.F(), l1h1Var, false, false, null);
                if (listA1 == null) {
                    listA1 = Collections.singletonList(fey0.z1(fey0Var, kht.e(this.a).o(), ((tsi1) vdy0Var.Y0.F().get(0)).getAnnotations()));
                }
                if (listA1.size() != 1) {
                    bhn0.w();
                    return r19;
                }
                fey0Var.Z = vdy0.A1(l1h1Var, vdy0Var.Y0);
                tsi1 tsi1Var = (tsi1) listA1.get(0);
                if (tsi1Var == null) {
                    fey0.r0(6);
                    throw r19;
                }
                fey0Var.N0 = tsi1Var;
            } else {
                l1h1Var = l1h1VarO;
            }
            v120 v120Var = vdy0Var.Z0;
            ?? v120Var2 = v120Var == null ? r19 : new v120(v120Var.getAnnotations());
            v120 v120Var3 = vdy0Var.a1;
            Z1.B1(zdy0Var, fey0Var, v120Var2, v120Var3 == null ? r19 : new v120(v120Var3.getAnnotations()));
            if (this.g) {
                ?? bi91Var = new bi91();
                Iterator it = vdy0Var.l().iterator();
                while (it.hasNext()) {
                    bi91Var.add(((tdy0) it.next()).d(l1h1Var));
                }
                Z1.Y = bi91Var;
            }
            if (vdy0Var.V() && (function0 = vdy0Var.i) != null) {
                Z1.C1(vdy0Var.h, function0);
            }
            return Z1;
        }
        return null;
    }
}
