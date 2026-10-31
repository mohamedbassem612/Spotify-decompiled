package p;

import androidx.car.app.k;
import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import androidx.car.app.model.SectionHeader;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class db51 extends ed10 implements xo31 {
    public final i8h1 Q0;
    public final t64 R0;
    public final l7m0 S0;
    public final vhd T0;
    public final xok0 U0;
    public MobiusLoop V0;
    public String W0;
    public final String X0;
    public final r6h1 Y0;
    public final ouk0 Z0;
    public sxd1 a1;
    public final dt71 b1;
    public final dt71 c1;
    public final l451 d1;
    public final mqn0 e1;
    public final lwc f1;
    public final xaz0 g1;

    public db51(k kVar, fna fnaVar, t551 t551Var, md10 md10Var, qzn0 qzn0Var, i8h1 i8h1Var, t64 t64Var, l7m0 l7m0Var, vhd vhdVar, String str) {
        super(kVar, fnaVar, i8h1Var, qzn0Var, md10Var, t64Var);
        this.Q0 = i8h1Var;
        this.R0 = t64Var;
        this.S0 = l7m0Var;
        this.T0 = vhdVar;
        xok0 xok0Var = new xok0((byte) 14);
        this.U0 = xok0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        yon1.U4();
        this.X0 = yon1.U4().c;
        r6h1 r6h1VarB = xok0Var.b();
        this.Y0 = r6h1VarB;
        lnm lnmVar = null;
        this.Z0 = new ouk0(0, (String) null, (String) null, r6h1VarB);
        this.b1 = mgo1.e(0, 1, 2, 1);
        this.c1 = mgo1.e(0, 1, 2, 1);
        yon1.U4();
        ((ap41) this).d = "spotify:search";
        fn31.T(cto1.q(this), (o8n) null, 0, new p5o(this, t551Var, str, (lnm) null, (byte) 3), 3).L(new mn41(this, (byte) 9));
        fn31.T(cto1.q(this), (o8n) null, 0, new bb51(this, lnmVar, (byte) 0), 3);
        fn31.T(cto1.q(this), (o8n) null, 0, new bb51(this, lnmVar, (byte) 1), 3);
        this.d1 = new l451(this, (byte) 5);
        this.e1 = new mqn0();
        this.f1 = new lwc(" ");
        this.g1 = new xaz0(this, (byte) 22);
    }

    public final String a() {
        return this.X0;
    }

    public final sxd1 d() {
        sxd1 sxd1VarK = k();
        if (!((k84) this.S0.b).c()) {
            this.a1 = null;
            return sxd1VarK;
        }
        sxd1 sxd1Var = this.a1;
        if (sxd1Var == null || sxd1Var.getClass() == sxd1VarK.getClass()) {
            this.a1 = sxd1VarK;
            return sxd1VarK;
        }
        Class<?> cls = sxd1Var.getClass();
        jd11 jd11Var = rc11.a;
        Logger.b("[CAL] Returning last known template " + jd11Var.b(cls) + " instead of " + jd11Var.b(sxd1VarK.getClass()) + " to avoid Android Auto exception.", new Object[0]);
        this.a1 = null;
        fn31.T(cto1.q(this), (o8n) null, 0, new b751(this, (lnm) null, (byte) 1), 3);
        return sxd1Var;
    }

    @Override // p.xvc
    public final Function0 e() {
        return this.d1;
    }

    @Override // p.xvc
    public final wqn0 f() {
        return this.e1;
    }

    @Override // p.ed10
    public final r6h1 h() {
        return this.Y0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r32v6, types: [java.lang.Throwable] */
    public final sxd1 k() {
        db51 db51Var = this;
        MobiusLoop mobiusLoop = db51Var.V0;
        String str = null;
        if (mobiusLoop == null) {
            u890.C("mobiusLoop");
            throw null;
        }
        a651 a651Var = (a651) mobiusLoop.i;
        if (a651Var == null) {
            a651Var = new a651(null, null, 15);
        }
        a651 a651Var2 = a651Var;
        if (!u890.j(a651Var2.d, db51Var.W0)) {
            ((LinkedHashMap) db51Var.T0.d).clear();
            db51Var.W0 = a651Var2.d;
        }
        fb51 fb51Var = a651Var2.c;
        if (fb51Var instanceof eb51) {
            return y3o1.g0(((ap41) db51Var).a.getString(2131961556), (ArrayList) null, db51Var.f1, (String) null, db51Var.g1, 26);
        }
        byte b = 0;
        int i = 10;
        if (fb51Var instanceof gb51) {
            lwc lwcVar = db51Var.f1;
            String string = ((ap41) db51Var).a.getString(2131961556);
            String str2 = a651Var2.d;
            xaz0 xaz0Var = db51Var.g1;
            List list = a651Var2.a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                apd apdVar = (apd) obj;
                arrayList.add(x760.D(apdVar.a, apdVar.b, apdVar.c, (Integer) null, (nwc) null, (Boolean) null, x1p1.n(apdVar.f), false, false, (Float) null, new cb51(db51Var, apdVar, i2, b), 1912));
                i2 = i3;
            }
            return y3o1.g0(string, arrayList, lwcVar, str2, xaz0Var, 16);
        }
        if (!(fb51Var instanceof fb51)) {
            eg.o();
            return null;
        }
        int iC = l1d.C(fb51Var.c);
        if (iC == 0) {
            return y3o1.g0(((ap41) db51Var).a.getString(2131961556), (ArrayList) null, new kwc(2131961557), (String) null, db51Var.g1, 26);
        }
        if (iC == 1) {
            int i4 = 0;
            List list2 = a651Var2.a;
            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
            for (Object obj2 : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                apd apdVar2 = (apd) obj2;
                arrayList2.add(x760.D(apdVar2.a, apdVar2.b, apdVar2.c, (Integer) null, (nwc) null, (Boolean) null, x1p1.n(apdVar2.f), false, false, (Float) null, new cb51(db51Var, apdVar2, i4, (byte) 1), 1912));
                i4 = i5;
            }
            return y3o1.g0(((ap41) db51Var).a.getString(2131961556), arrayList2, db51Var.f1, a651Var2.d, db51Var.g1, 16);
        }
        if (iC != 2) {
            if (iC == 3) {
                return y3o1.g0(((ap41) db51Var).a.getString(2131961556), (ArrayList) null, new kwc(2131961557), (String) null, db51Var.g1, 26);
            }
            eg.o();
            return null;
        }
        Header headerR = x1p1.r(a651Var2.d, Action.BACK, (smc0) null, 4);
        ArrayList arrayListG = ed10.g(db51Var);
        List list3 = a651Var2.b;
        ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
        int i6 = 0;
        for (Object obj3 : list3) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                ?? r32 = str;
                p7h.T();
                throw r32;
            }
            fpd fpdVar = (fpd) obj3;
            ouk0 ouk0Var = new ouk0(Integer.valueOf(i6), str, str, db51Var.Y0);
            String title = fpdVar.getTitle();
            List items = fpdVar.getItems();
            ArrayList arrayList4 = new ArrayList(q7h.U(items, i));
            ArrayList arrayList5 = arrayList4;
            int i8 = b;
            for (Object obj4 : items) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    ?? r33 = str;
                    p7h.T();
                    throw r33;
                }
                apd apdVar3 = (apd) obj4;
                ArrayList arrayList6 = arrayList5;
                arrayList6.add(x760.D(apdVar3.a, apdVar3.b, apdVar3.c, (Integer) null, (nwc) null, (Boolean) null, x1p1.n(apdVar3.f), false, false, (Float) null, new ka0(db51Var, apdVar3, i8, ouk0Var, (byte) 13), 1912));
                db51Var = db51Var;
                arrayList5 = arrayList6;
                fpdVar = fpdVar;
                i8 = i9;
                str = str;
            }
            fpd fpdVar2 = fpdVar;
            db51 db51Var2 = db51Var;
            String str3 = str;
            ArrayList arrayList7 = arrayList5;
            vhd vhdVar = db51Var2.T0;
            List items2 = fpdVar2.getItems();
            ArrayList arrayList8 = new ArrayList(q7h.U(items2, 10));
            Iterator it = items2.iterator();
            while (it.hasNext()) {
                arrayList8.add(l0p1.l((apd) it.next()));
            }
            arrayList3.add(lgo1.t(title, arrayList7, (String) null, (Function0) null, vhdVar.d(i6, "search-results", arrayList8, i6 == p7h.L(a651Var2.b), new v721(db51Var2, ouk0Var, fpdVar2, (byte) 27)), (SectionHeader) null, 44));
            db51Var = db51Var2;
            i6 = i7;
            str = str3;
            b = 0;
            i = 10;
        }
        return lgo1.w(false, headerR, arrayListG, arrayList3, 16);
    }

    public final void l(apd apdVar, int i, ouk0 ouk0Var) {
        p80 p80Var = apdVar.d;
        if ((p80Var instanceof n80) && (p80Var instanceof j80)) {
            j80 j80Var = (j80) p80Var;
            String str = j80Var.b;
            if (str == null) {
                str = j80Var.a;
            }
            String str2 = str;
            Integer numValueOf = Integer.valueOf(i);
            ouk0Var.getClass();
            x6h1 x6h1VarC = ouk0Var.b.c();
            x6h1VarC.i.add(new a7h1("item", (String) null, numValueOf, str2, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
            if (str2 == null) {
                str2 = "";
            }
            w7h1 w7h1Var = new w7h1("", "", z7h1Var, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2)), y6h1VarA, ouk0Var.a, System.currentTimeMillis());
            tv80 tv80VarM = this.Q0.m(w7h1Var, (xj61) null);
            this.R0.a(w7h1Var, tv80VarM.a);
            MobiusLoop mobiusLoop = this.V0;
            if (mobiusLoop != null) {
                mym.l(mobiusLoop, new h051(j80Var, tv80VarM));
            } else {
                u890.C("mobiusLoop");
                throw null;
            }
        }
    }

    @Override // p.xvc
    public final void onResume(iac0 iac0Var) {
        super.onResume(iac0Var);
        ((LinkedHashMap) this.T0.d).clear();
    }

    public final void onStop(iac0 iac0Var) {
        if (((k84) this.S0.b).c() && this.a1 == null) {
            this.a1 = k();
        }
    }
}
