package p;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x6b0 implements Function0 {
    public final /* synthetic */ byte a;
    public final y6b0 b;

    public /* synthetic */ x6b0(y6b0 y6b0Var, byte b) {
        this.a = b;
        this.b = y6b0Var;
    }

    public final Object invoke() {
        GenericDeclaration genericDeclarationZ;
        i0d i0dVarT;
        GenericDeclaration genericDeclarationY;
        i0d i0dVarT2;
        byte b = this.a;
        boolean z = false;
        y6b0 y6b0Var = this.b;
        switch (b) {
            case 0:
                y6b0 y6b0Var2 = this.b;
                return i3o1.j(y6b0Var2, y6b0Var2.w(), y6b0Var2.x(), y6b0Var2.A(), y6b0Var2.z(), true);
            case 1:
                y6b0 y6b0Var3 = this.b;
                return fc11.N(y6b0Var3) ? i3o1.j(y6b0Var3, y6b0Var3.w(), y6b0Var3.x(), y6b0Var3.A(), y6b0Var3.z(), false) : y6b0Var3.f();
            case 2:
                boolean zP = fc11.P(y6b0Var);
                bla0 bla0Var = y6b0Var.b;
                if (!zP && !(bla0Var instanceof ema0)) {
                    bhn0.s(y6b0Var, "Only constructors and top-level functions are supported for now: ");
                    return null;
                }
                ija0 ija0VarY = y6b0Var.y();
                String str = ija0VarY.d;
                if (!fc11.P(y6b0Var) || ((bla0Var instanceof bla0) && bla0Var.p())) {
                    genericDeclarationZ = bla0Var.z(ija0VarY.c, str);
                } else {
                    if (fc11.M(y6b0Var)) {
                        Class clsN = bla0Var.n();
                        List parameters = y6b0Var.getParameters();
                        ArrayList arrayList = new ArrayList(q7h.U(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((hc11) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new mf5(clsN, arrayList, 2);
                    }
                    genericDeclarationZ = mla0.J(bla0Var.n(), bpi1.l(bb11.d(bla0Var.n()), str, false).h());
                }
                if (genericDeclarationZ instanceof Constructor) {
                    i0dVarT = y6b0Var.s((Constructor) genericDeclarationZ, false);
                } else {
                    if (!(genericDeclarationZ instanceof Method)) {
                        mna0.d(y6b0Var, "Could not compute caller for function: ");
                        return null;
                    }
                    i0dVarT = y6b0Var.t((Method) genericDeclarationZ, false);
                }
                return yxo1.u(z6x.a, i0dVarT, y6b0Var, false);
            default:
                boolean zP2 = fc11.P(y6b0Var);
                bla0 bla0Var2 = y6b0Var.b;
                if (!zP2 && !(bla0Var2 instanceof ema0)) {
                    bhn0.s(y6b0Var, "Only constructors and top-level functions are supported for now: ");
                    return null;
                }
                ija0 ija0VarY2 = y6b0Var.y();
                ArrayList arrayList2 = new ArrayList();
                if (!fc11.P(y6b0Var) || ((bla0Var2 instanceof bla0) && bla0Var2.p())) {
                    hur hurVarZ = s1p1.z(y6b0Var, ija0VarY2.d);
                    arrayList2.addAll((Set) hurVarZ.c);
                    String str2 = ija0VarY2.c;
                    String str3 = (String) hurVarZ.b;
                    Member memberB = y6b0Var.getCaller().b();
                    memberB.getClass();
                    boolean z2 = !Modifier.isStatic(memberB.getModifiers());
                    List listF = y6b0Var.f();
                    if (!(listF instanceof Collection) || !listF.isEmpty()) {
                        Iterator it2 = listF.iterator();
                        while (it2.hasNext()) {
                            if (((hc11) it2.next()).s() == 3) {
                                z = true;
                            }
                        }
                    }
                    genericDeclarationY = bla0Var2.y(str2, z2, str3, z);
                } else {
                    if (fc11.M(y6b0Var)) {
                        Class clsN2 = bla0Var2.n();
                        List parameters2 = y6b0Var.getParameters();
                        ArrayList arrayList3 = new ArrayList(q7h.U(parameters2, 10));
                        Iterator it3 = parameters2.iterator();
                        while (it3.hasNext()) {
                            String name2 = ((hc11) it3.next()).getName();
                            name2.getClass();
                            arrayList3.add(name2);
                        }
                        return new mf5(clsN2, arrayList3, 1);
                    }
                    hur hurVarZ2 = s1p1.z(y6b0Var, y6b0Var.y().d);
                    arrayList2.addAll((Set) hurVarZ2.c);
                    String str4 = (String) hurVarZ2.b;
                    Class clsN3 = bla0Var2.n();
                    ArrayList arrayList4 = new ArrayList();
                    mla0.w(arrayList4, bpi1.l(bb11.d(bla0Var2.n()), str4, false).h(), true, false);
                    genericDeclarationY = mla0.J(clsN3, arrayList4);
                }
                if (genericDeclarationY instanceof Constructor) {
                    i0dVarT2 = y6b0Var.s((Constructor) genericDeclarationY, true);
                } else {
                    i0dVarT2 = genericDeclarationY instanceof Method ? y6b0Var.t((Method) genericDeclarationY, y6b0Var.getCaller().c()) : null;
                }
                if (i0dVarT2 != null) {
                    return yxo1.u(arrayList2, i0dVarT2, y6b0Var, true);
                }
                return null;
        }
    }
}
