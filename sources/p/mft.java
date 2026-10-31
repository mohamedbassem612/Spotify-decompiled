package p;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mft implements Function0 {
    public final /* synthetic */ byte a;
    public final nft b;

    public /* synthetic */ mft(nft nftVar, byte b) {
        this.a = b;
        this.b = nftVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    public final Object invoke() throws i9n {
        Object objZ;
        i0d i0dVarZ;
        i0d f0dVar;
        GenericDeclaration genericDeclarationJ;
        i0d i0dVarZ2;
        tka0 tka0Var;
        Object next;
        gc11 gc11Var;
        byte b = this.a;
        nft nftVar = this.b;
        switch (b) {
            case 0:
                heg hegVar = i141.a;
                ov30 ov30VarA = nftVar.A();
                mla0 mla0Var = nftVar.h;
                jon1 jon1VarC = i141.c(ov30VarA);
                if (jon1VarC instanceof cja0) {
                    if (fc11.M(nftVar)) {
                        Class clsN = mla0Var.n();
                        List parameters = nftVar.getParameters();
                        ArrayList arrayList = new ArrayList(q7h.U(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((hc11) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new mf5(clsN, arrayList, 2);
                    }
                    objZ = mla0.J(mla0Var.n(), bpi1.l(bb11.d(mla0Var.n()), ((cja0) jon1VarC).c.e, false).h());
                } else if (jon1VarC instanceof dja0) {
                    fja0 fja0Var = ((dja0) jon1VarC).c;
                    objZ = mla0Var.z(fja0Var.d, fja0Var.e);
                } else if (jon1VarC instanceof bja0) {
                    objZ = ((bja0) jon1VarC).c;
                } else {
                    if (!(jon1VarC instanceof aja0)) {
                        if (!(jon1VarC instanceof zia0)) {
                            eg.o();
                            return null;
                        }
                        List list = ((zia0) jon1VarC).c;
                        Class clsN2 = mla0Var.n();
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new mf5(clsN2, arrayList2, 2, 1, list);
                    }
                    objZ = ((aja0) jon1VarC).c;
                }
                if (objZ instanceof Constructor) {
                    i0dVarZ = nftVar.y((Constructor) objZ, nftVar.A(), false);
                } else {
                    if (!(objZ instanceof Method)) {
                        throw new i9n("Could not compute caller for function: " + nftVar.A() + " (member = " + objZ + ')');
                    }
                    Method method = (Method) objZ;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        f0dVar = fc11.N(nftVar) ? new e0d(method, fc11.A(nftVar)) : new h0d(method, (byte) 0);
                    } else if (nftVar.A().getAnnotations().F(bpi1.a) != null) {
                        f0dVar = fc11.N(nftVar) ? new f0d(method) : new h0d(method);
                    } else {
                        i0dVarZ = nftVar.z(method, false);
                    }
                    i0dVarZ = f0dVar;
                }
                return yxo1.u(z6x.a, i0dVarZ, nftVar, false);
            case 1:
                ArrayList arrayList3 = new ArrayList();
                heg hegVar2 = i141.a;
                ov30 ov30VarA2 = nftVar.A();
                tka0 tka0Var2 = nftVar.h;
                jon1 jon1VarC2 = i141.c(ov30VarA2);
                if (jon1VarC2 instanceof dja0) {
                    ArrayList arrayListU = upn1.u(nftVar);
                    if (arrayListU.isEmpty()) {
                        if (tka0Var2 instanceof tka0) {
                            tka0Var = tka0Var2;
                        } else {
                            tka0Var = null;
                        }
                        if (tka0Var == null && tka0Var.p()) {
                            Member memberB = nftVar.getCaller().b();
                            memberB.getClass();
                            if (Modifier.isStatic(memberB.getModifiers())) {
                                Collection<ov30> collectionL = nftVar.A().l();
                                ArrayList arrayList4 = new ArrayList(q7h.U(collectionL, 10));
                                for (ov30 ov30Var : collectionL) {
                                    Class clsP = bpi1.p((beg) ov30Var.k());
                                    if (clsP == null) {
                                        mna0.d(nftVar, "Unknown container class for overridden function: ");
                                        return null;
                                    }
                                    arrayList4.add(new nft(rc11.a.b(clsP), ov30Var));
                                }
                                Iterator it3 = arrayList4.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        ArrayList arrayListU2 = upn1.u((gc11) next);
                                        if (!arrayListU2.isEmpty()) {
                                            Iterator it4 = arrayListU2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    hc11 hc11Var = (hc11) it4.next();
                                                    if (hc11Var == null) {
                                                        hc11Var = null;
                                                    }
                                                    if (hc11Var == null || !hc11Var.l()) {
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                gc11Var = (gc11) next;
                            } else {
                                gc11Var = null;
                            }
                        } else {
                            gc11Var = null;
                        }
                    } else {
                        Iterator it5 = arrayListU.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                hc11 hc11Var2 = (hc11) it5.next();
                                if (hc11Var2 == null) {
                                    hc11Var2 = null;
                                }
                                if (hc11Var2 == null || !hc11Var2.l()) {
                                }
                            } else {
                                if (tka0Var2 instanceof tka0) {
                                    tka0Var = tka0Var2;
                                } else {
                                    tka0Var = null;
                                }
                                if (tka0Var == null) {
                                }
                            }
                            gc11Var = null;
                        }
                    }
                    if (gc11Var != null) {
                        String strY0 = ihc1.Y0(gc11Var.getSignature(), '(');
                        hur hurVarZ = s1p1.z(gc11Var, gc11Var.getSignature().substring(strY0.length()));
                        arrayList3.addAll((Set) hurVarZ.c);
                        genericDeclarationJ = tka0Var2.y(strY0, true, (String) hurVarZ.b, nftVar.A().L() != null);
                    } else {
                        fja0 fja0Var2 = ((dja0) jon1VarC2).c;
                        hur hurVarZ2 = s1p1.z(nftVar, fja0Var2.e);
                        arrayList3.addAll((Set) hurVarZ2.c);
                        String str = fja0Var2.d;
                        String str2 = (String) hurVarZ2.b;
                        Member memberB2 = nftVar.getCaller().b();
                        memberB2.getClass();
                        genericDeclarationJ = tka0Var2.y(str, !Modifier.isStatic(memberB2.getModifiers()), str2, nftVar.A().L() != null);
                    }
                } else if (jon1VarC2 instanceof cja0) {
                    if (fc11.M(nftVar)) {
                        Class clsN3 = tka0Var2.n();
                        List parameters2 = nftVar.getParameters();
                        ArrayList arrayList5 = new ArrayList(q7h.U(parameters2, 10));
                        Iterator it6 = parameters2.iterator();
                        while (it6.hasNext()) {
                            String name2 = ((hc11) it6.next()).getName();
                            name2.getClass();
                            arrayList5.add(name2);
                        }
                        return new mf5(clsN3, arrayList5, 1);
                    }
                    hur hurVarZ3 = s1p1.z(nftVar, ((cja0) jon1VarC2).c.e);
                    arrayList3.addAll((Set) hurVarZ3.c);
                    String str3 = (String) hurVarZ3.b;
                    Class clsN4 = tka0Var2.n();
                    ArrayList arrayList6 = new ArrayList();
                    mla0.w(arrayList6, bpi1.l(bb11.d(tka0Var2.n()), str3, false).h(), true, false);
                    genericDeclarationJ = mla0.J(clsN4, arrayList6);
                } else {
                    if (jon1VarC2 instanceof zia0) {
                        List list3 = ((zia0) jon1VarC2).c;
                        Class clsN5 = tka0Var2.n();
                        List list4 = list3;
                        ArrayList arrayList7 = new ArrayList(q7h.U(list4, 10));
                        Iterator it7 = list4.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(((Method) it7.next()).getName());
                        }
                        return new mf5(clsN5, arrayList7, 1, 1, list3);
                    }
                    genericDeclarationJ = null;
                }
                if (genericDeclarationJ instanceof Constructor) {
                    i0dVarZ2 = nftVar.y((Constructor) genericDeclarationJ, nftVar.A(), true);
                } else if (!(genericDeclarationJ instanceof Method)) {
                    i0dVarZ2 = null;
                } else if (nftVar.A().getAnnotations().F(bpi1.a) == null || ((beg) nftVar.A().k()).U()) {
                    i0dVarZ2 = nftVar.z((Method) genericDeclarationJ, nftVar.getCaller().c());
                } else {
                    Method method2 = (Method) genericDeclarationJ;
                    i0dVarZ2 = fc11.N(nftVar) ? new f0d(method2) : new h0d(method2);
                }
                if (i0dVarZ2 != null) {
                    return yxo1.u(arrayList3, i0dVarZ2, nftVar, true);
                }
                return null;
            default:
                Type typeU = s1p1.u(nftVar);
                return typeU == null ? nftVar.getCaller().getReturnType() : typeU;
        }
    }
}
