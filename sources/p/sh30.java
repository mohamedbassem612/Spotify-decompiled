package p;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sh30 implements ph30 {
    public final /* synthetic */ byte a;
    public final String b;
    public final /* synthetic */ th30 c;

    public /* synthetic */ sh30(th30 th30Var, String str, byte b) {
        this.a = b;
        this.c = th30Var;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        int i;
        int i2;
        byte b = this.a;
        Throwable th = null;
        String str = this.b;
        th30 th30Var = this.c;
        boolean z = false;
        switch (b) {
            case 0:
                su9 su9Var = (su9) th30Var.l.remove(str);
                if (su9Var != null) {
                    HashMap map = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        nu9 nu9Var = (nu9) it.next();
                        if (nu9Var.w) {
                            Iterator it2 = nu9Var.c.iterator();
                            while (it2.hasNext()) {
                                zf30 zf30Var = ((wi30) it2.next()).b;
                                if (zf30Var != null) {
                                    map.put(zf30Var.e, zf30Var);
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList3 = su9Var.a;
                    HashMap map2 = new HashMap(arrayList3.size());
                    for (String str2 : arrayList3) {
                        zf30 zf30Var2 = (zf30) map.get(str2);
                        if (zf30Var2 != null) {
                            map2.put(zf30Var2.e, zf30Var2);
                        } else {
                            Bundle bundleH = th30Var.c.H((Bundle) null, str2);
                            if (bundleH != null) {
                                ClassLoader classLoader = th30Var.x.e.getClassLoader();
                                zf30 zf30VarA = ((qi30) bundleH.getParcelable("state")).a(th30Var.N(), classLoader);
                                zf30VarA.b = bundleH;
                                if (bundleH.getBundle("savedInstanceState") == null) {
                                    zf30VarA.b.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = bundleH.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                zf30VarA.T0(bundle);
                                map2.put(zf30VarA.e, zf30VarA);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (ou9 ou9Var : su9Var.b) {
                        ArrayList arrayList5 = ou9Var.b;
                        nu9 nu9Var2 = new nu9(th30Var);
                        ou9Var.a(nu9Var2);
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            String str3 = (String) arrayList5.get(i3);
                            if (str3 != null) {
                                zf30 zf30Var3 = (zf30) map2.get(str3);
                                if (zf30Var3 != null) {
                                    ((wi30) nu9Var2.c.get(i3)).b = zf30Var3;
                                } else {
                                    eg.m(rjx.o(new StringBuilder("Restoring FragmentTransaction "), ou9Var.f, " failed due to missing saved state for Fragment (", str3, ")"));
                                }
                            }
                        }
                        arrayList4.add(nu9Var2);
                    }
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        ((nu9) it3.next()).a(arrayList, arrayList2);
                        z = true;
                    }
                }
                return z;
            default:
                int iE = th30Var.E(str, -1, true);
                if (iE < 0) {
                    return false;
                }
                for (int i4 = iE; i4 < th30Var.d.size(); i4++) {
                    nu9 nu9Var3 = (nu9) th30Var.d.get(i4);
                    if (!nu9Var3.r) {
                        th30Var.o0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + nu9Var3 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                int i5 = iE;
                while (i5 < th30Var.d.size()) {
                    nu9 nu9Var4 = (nu9) th30Var.d.get(i5);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    for (wi30 wi30Var : nu9Var4.c) {
                        zf30 zf30Var4 = wi30Var.b;
                        if (zf30Var4 != null) {
                            Throwable th2 = th;
                            if (wi30Var.c) {
                                int i6 = wi30Var.a;
                                i = i5;
                                if (i6 == 1 || i6 == 2 || i6 == 8) {
                                }
                                i2 = wi30Var.a;
                                if (i2 != 1 || i2 == 2) {
                                    hashSet3.add(zf30Var4);
                                }
                                i5 = i;
                                th = th2;
                            } else {
                                i = i5;
                            }
                            hashSet.add(zf30Var4);
                            hashSet2.add(zf30Var4);
                            i2 = wi30Var.a;
                            if (i2 != 1) {
                                hashSet3.add(zf30Var4);
                            } else {
                                hashSet3.add(zf30Var4);
                            }
                            i5 = i;
                            th = th2;
                        }
                    }
                    Throwable th3 = th;
                    int i7 = i5;
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder sbT = l1d.t("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        sbT.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        sbT.append(" in ");
                        sbT.append(nu9Var4);
                        sbT.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        th30Var.o0(new IllegalArgumentException(sbT.toString()));
                        throw th3;
                    }
                    i5 = i7 + 1;
                    th = th3;
                }
                Throwable th4 = th;
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    zf30 zf30Var5 = (zf30) arrayDeque.removeFirst();
                    if (zf30Var5.d1) {
                        StringBuilder sbT2 = l1d.t("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                        sbT2.append(hashSet.contains(zf30Var5) ? "direct reference to retained " : "retained child ");
                        sbT2.append("fragment ");
                        sbT2.append(zf30Var5);
                        th30Var.o0(new IllegalArgumentException(sbT2.toString()));
                        throw th4;
                    }
                    for (zf30 zf30Var6 : ((th30) zf30Var5.W0).c.p()) {
                        if (zf30Var6 != null) {
                            arrayDeque.addLast(zf30Var6);
                        }
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((zf30) it4.next()).e);
                }
                ArrayList arrayList7 = new ArrayList(th30Var.d.size() - iE);
                int i8 = iE;
                while (i8 < th30Var.d.size()) {
                    arrayList7.add(th4);
                    i8++;
                    th4 = null;
                }
                su9 su9Var2 = new su9(arrayList6, arrayList7);
                for (int size = th30Var.d.size() - 1; size >= iE; size--) {
                    nu9 nu9Var5 = (nu9) th30Var.d.remove(size);
                    nu9 nu9Var6 = new nu9(nu9Var5);
                    nu9Var6.e();
                    arrayList7.set(size - iE, new ou9(nu9Var6));
                    nu9Var5.w = true;
                    arrayList.add(nu9Var5);
                    arrayList2.add(Boolean.TRUE);
                }
                th30Var.l.put(str, su9Var2);
                return true;
        }
    }
}
