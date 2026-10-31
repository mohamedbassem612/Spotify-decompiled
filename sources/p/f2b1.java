package p;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f2b1 extends qba implements w2i0 {
    public final f9v N0;
    public final sl21 O0;
    public final o5n P0;
    public final boolean Q0;
    public final mgc R0;
    public final Uri S0;
    public final e2b1 T0;
    public final yoh0 U0;
    public final k2r V0;
    public final uzr0 W0;
    public final byte X = 5;
    public eyh0 X0;
    public final jg10 Y;
    public o2r Y0;
    public final qma Z;
    public Handler Z0;
    public d5b1 a1;
    public eyh0 b1;
    public yeg1 c1;
    public final boolean d1;
    public final hoh0 i;
    public final bnh0 t;

    public f2b1(nfa0 nfa0Var, hoh0 hoh0Var, yoh0 yoh0Var, k2r k2rVar, Handler handler, bnh0 bnh0Var, jg10 jg10Var, qma qmaVar, f9v f9vVar, sl21 sl21Var, o5n o5nVar, boolean z) {
        d5b1 d5b1Var;
        this.i = hoh0Var;
        this.t = bnh0Var;
        this.Y = jg10Var;
        this.Z = qmaVar;
        this.N0 = f9vVar;
        this.O0 = sl21Var;
        this.P0 = o5nVar;
        this.Q0 = z;
        koh0 koh0VarA = yoh0Var.a();
        koh0VarA.c = "spotifyadaptive";
        this.U0 = koh0VarA.a();
        this.a1 = null;
        soh0 soh0Var = yoh0Var.b;
        if (soh0Var == null) {
            hhg1.n("Required value was null.");
            throw null;
        }
        this.S0 = soh0Var.a;
        this.R0 = e(null);
        this.V0 = k2rVar;
        this.d1 = qmaVar.t1;
        List list = soh0Var.e;
        vrv0 vrv0Var = new vrv0(nfa0Var, qmaVar, hoh0Var.c(), z);
        this.W0 = vrv0Var;
        List list2 = list;
        if (!list2.isEmpty()) {
            this.W0 = new w2z(vrv0Var, list, (byte) 22);
        }
        if (this.a1 != null) {
            if (!list2.isEmpty() && (d5b1Var = this.a1) != null) {
                d5b1Var.a(list);
            }
            this.T0 = null;
        } else {
            this.T0 = new e2b1(this);
        }
        b(handler, this);
        a(handler, bnh0Var);
    }

    public final void A() {
        d5b1 d5b1Var = this.a1;
        if (d5b1Var == null) {
            hhg1.n("Required value was null.");
            return;
        }
        rpl rplVar = (rpl) d5b1Var.a.get(0);
        long jW = zoi1.W(rplVar.c - rplVar.b);
        s(new c091(-9223372036854775807L, -9223372036854775807L, jW, jW, 0L, 0L, true, false, false, d5b1Var, this.U0, null));
    }

    public final void E(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var, int i2) {
        bnh0 bnh0Var = this.t;
        if (bnh0Var == null || qqh0Var.a != 4) {
            return;
        }
        bnh0Var.r();
    }

    public final void F(int i, p2i0 p2i0Var, qqh0 qqh0Var) {
        bnh0 bnh0Var = this.t;
        if (bnh0Var != null) {
            bnh0Var.p(qqh0Var.b, qqh0Var.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [p.bnh0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.List] */
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
    public final void d(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var) {
        z6x arrayList;
        Locale m231Var;
        zvw0 zvw0Var;
        Object next;
        ?? arrayList2;
        Object next2;
        Object next3;
        zvw0 zvw0Var2;
        Long lValueOf;
        Object next4;
        zvw0 zvw0Var3;
        Long lValueOf2;
        d5b1 d5b1Var = this.a1;
        if (d5b1Var != null) {
            List list = d5b1Var.a;
            ?? r3 = this.t;
            if (r3 == 0 || qqh0Var.a != 4) {
                return;
            }
            rrc1 rrc1Var = d5b1Var.c;
            z6x arrayList3 = z6x.a;
            if (rrc1Var != null) {
                arrayList3 = rrc1Var.a;
            }
            nn51 nn51Var = d5b1Var.d;
            rpl rplVar = (rpl) o7h.s0(list);
            if (rplVar == null) {
                arrayList = arrayList3;
            } else {
                List list2 = rplVar.d;
                ArrayList<xdx0> arrayList4 = new ArrayList();
                for (Object obj : list2) {
                    xdx0 xdx0Var = (xdx0) obj;
                    if (xdx0Var.a == 1 && xdx0Var.c != null) {
                        arrayList4.add(obj);
                    }
                }
                arrayList = new ArrayList();
                for (xdx0 xdx0Var2 : arrayList4) {
                    try {
                        String str = xdx0Var2.c;
                        m231Var = str != null ? Locale.forLanguageTag(str) : null;
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    Locale locale = m231Var;
                    nv7 nv7Var = (locale == null || (zvw0Var = (zvw0) o7h.s0(xdx0Var2.b)) == null) ? null : new nv7(locale, (zvw0Var.b.f & 1) != 0);
                    if (nv7Var != null) {
                        arrayList.add(nv7Var);
                    }
                }
            }
            xw7 xw7Var = d5b1Var.e;
            rpl rplVar2 = (rpl) o7h.s0(list);
            if (rplVar2 == null) {
                arrayList2 = arrayList3;
            } else {
                Iterator it = rplVar2.d.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((xdx0) next).a != 2);
                xdx0 xdx0Var3 = (xdx0) next;
                if (xdx0Var3 == null) {
                    arrayList2 = arrayList3;
                } else {
                    List list3 = xdx0Var3.b;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : list3) {
                        ie30 ie30Var = ((zvw0) obj2).b;
                        if (ie30Var.w != -1 && ie30Var.x != -1) {
                            arrayList5.add(obj2);
                        }
                    }
                    arrayList2 = new ArrayList(q7h.U(arrayList5, 10));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        ie30 ie30Var2 = ((zvw0) it2.next()).b;
                        arrayList2.add(new y1k1(ie30Var2.w, ie30Var2.x));
                    }
                }
            }
            rpl rplVar3 = (rpl) o7h.s0(list);
            if (rplVar3 != null) {
                Iterator it3 = rplVar3.d.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((xdx0) next2).a != 1);
                xdx0 xdx0Var4 = (xdx0) next2;
                if (xdx0Var4 != null) {
                    List list4 = xdx0Var4.b;
                    ArrayList arrayList6 = new ArrayList(q7h.U(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(Integer.valueOf(((zvw0) it4.next()).b.k));
                    }
                    arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList6) {
                        if (((Number) obj3).intValue() != -1) {
                            arrayList3.add(obj3);
                        }
                    }
                }
            }
            ?? r9 = arrayList3;
            rpl rplVar4 = (rpl) o7h.s0(list);
            if (rplVar4 == null) {
                lValueOf = null;
            } else {
                Iterator it5 = rplVar4.d.iterator();
                do {
                    if (!it5.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it5.next();
                } while (((xdx0) next3).a != 2);
                xdx0 xdx0Var5 = (xdx0) next3;
                if (xdx0Var5 == null || (zvw0Var2 = (zvw0) o7h.s0(xdx0Var5.b)) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(zvw0Var2.a);
                }
            }
            rpl rplVar5 = (rpl) o7h.s0(list);
            if (rplVar5 == null) {
                lValueOf2 = null;
            } else {
                Iterator it6 = rplVar5.d.iterator();
                do {
                    if (!it6.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it6.next();
                } while (((xdx0) next4).a != 1);
                xdx0 xdx0Var6 = (xdx0) next4;
                if (xdx0Var6 == null || (zvw0Var3 = (zvw0) o7h.s0(xdx0Var6.b)) == null) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(zvw0Var3.a);
                }
            }
            r3.G(arrayList3, arrayList, nn51Var, xw7Var, arrayList2, r9, 4, lValueOf, lValueOf2, d5b1Var.b);
        }
    }

    @Override // p.qba
    public final arh0 f(p2i0 p2i0Var, hw3 hw3Var, long j) {
        b9v b9vVar = new b9v(this.d.c, 0, p2i0Var);
        mgc mgcVarE = this.d1 ? e(p2i0Var) : this.R0;
        mgcVarE.getClass();
        o3b1 o3b1Var = new o3b1();
        o3b1Var.b = hw3Var;
        f9v f9vVar = this.N0;
        o3b1Var.c = f9vVar;
        o3b1Var.d = b9vVar;
        o3b1Var.e = mgcVarE;
        o3b1Var.a = this.X;
        d5b1 d5b1Var = this.a1;
        if (d5b1Var == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        eyh0 eyh0Var = this.b1;
        if (eyh0Var == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        yeg1 yeg1Var = this.c1;
        dbu0 dbu0Var = this.g;
        dbu0Var.getClass();
        return new c2b1(d5b1Var, yeg1Var, this.Y, o3b1Var, eyh0Var, f9vVar, dbu0Var, this.d1);
    }

    @Override // p.qba
    public final yoh0 m() {
        return this.U0;
    }

    @Override // p.qba
    public final void o() throws IOException {
        eyh0 eyh0Var = this.X0;
        if (eyh0Var != null) {
            eyh0Var.s();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.qba
    public final void r(yeg1 yeg1Var) {
        this.c1 = yeg1Var;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            hhg1.n("Required value was null.");
            return;
        }
        dbu0 dbu0Var = this.g;
        dbu0Var.getClass();
        f9v f9vVar = this.N0;
        f9vVar.h(looperMyLooper, dbu0Var);
        f9vVar.e();
        if (this.a1 != null) {
            A();
            return;
        }
        this.Y0 = this.V0.j();
        eyh0 eyh0Var = new eyh0("Loader:SpotifyAdaptiveMediaSource");
        this.X0 = eyh0Var;
        this.b1 = eyh0Var;
        this.Z0 = new Handler(looperMyLooper);
        o2r o2rVar = this.Y0;
        if (o2rVar == null) {
            hhg1.n("Required value was null.");
            return;
        }
        eyh0 eyh0Var2 = this.X0;
        if (eyh0Var2 == null) {
            hhg1.n("Required value was null.");
            return;
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.S0;
        dm5.s(uri, "The uri must be set.");
        vzr0 vzr0Var = new vzr0(o2rVar, new n3r(uri, 0L, 1, null, map, 0L, -1L, null, 1, zhg0.a), 4, this.W0);
        e2b1 e2b1Var = this.T0;
        if (e2b1Var == null) {
            hhg1.n("Required value was null.");
            return;
        }
        long jH = eyh0Var2.H(vzr0Var, e2b1Var, this.X);
        n3r n3rVar = vzr0Var.b;
        this.R0.L(new d2e0(vzr0Var.a, n3rVar, n3rVar.a, gg11.g, jH, 0L, 0L), vzr0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, 0);
    }

    public final void v(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var, IOException iOException, boolean z) {
        bnh0 bnh0Var = this.t;
        if (bnh0Var == null || qqh0Var.a != 4) {
            return;
        }
        bnh0Var.Q(iOException);
    }

    @Override // p.qba
    public final void w() {
        this.a1 = null;
        this.Y0 = null;
        this.b1 = null;
        eyh0 eyh0Var = this.X0;
        if (eyh0Var != null) {
            eyh0Var.x(null);
        }
        this.X0 = null;
        Handler handler = this.Z0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.Z0 = null;
        this.N0.release();
        sl21 sl21Var = this.O0;
        if (sl21Var != null) {
            sl21Var.run();
        }
    }

    public final void D(int i, p2i0 p2i0Var, qqh0 qqh0Var) {
    }

    public final void h(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var) {
    }
}
