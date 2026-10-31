package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ja6 implements phv {
    public Long X;
    public m4d Y;
    public final ndc1 a;
    public final itz b;
    public final l7s c;
    public final y7l d;
    public final llm e;
    public va6 f;
    public gvh0 g;
    public List h = z6x.a;
    public boolean i;
    public boolean t;

    public ja6(ndc1 ndc1Var, itz itzVar, l7s l7sVar, y7l y7lVar, q8n q8nVar) {
        this.a = ndc1Var;
        this.b = itzVar;
        this.c = l7sVar;
        this.d = y7lVar;
        this.e = i3a.k(q8nVar);
    }

    @Override // p.phv
    public final void a() {
        smo1.p(this.e, (CancellationException) null);
    }

    @Override // p.phv
    public final void b() {
        m(this.f);
    }

    @Override // p.phv
    public final void c(String str) {
        k(str, false, new ia6(this, null, (byte) 1));
    }

    @Override // p.phv
    public final void d(int i) {
        gvh0 gvh0Var;
        this.d.b(i);
        gvh0 gvh0Var2 = this.g;
        if (gvh0Var2 != null) {
            new ArrayList();
            new ArrayList();
            new HashSet();
            new ArrayList();
            Bundle bundle = new Bundle(gvh0Var2.a);
            ArrayList arrayListE = gvh0Var2.e();
            ArrayList arrayListB = gvh0Var2.b();
            HashSet hashSetA = gvh0Var2.a();
            List list = gvh0Var2.c;
            String str = gvh0Var2.b;
            bundle.putInt("volume", i);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListE));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
            gvh0Var = new gvh0(str, bundle, list);
        } else {
            gvh0Var = null;
        }
        this.g = gvh0Var;
        h();
    }

    @Override // p.phv
    public final void e(m4d m4dVar) {
        this.Y = m4dVar;
        lnm lnmVar = null;
        ha6 ha6Var = new ha6(this, lnmVar, (byte) 0);
        llm llmVar = this.e;
        fn31.T(llmVar, (o8n) null, 0, ha6Var, 3);
        fn31.T(llmVar, (o8n) null, 0, new ha6(this, lnmVar, (byte) 1), 3);
    }

    @Override // p.phv
    public final boolean f(Intent intent, hwh0 hwh0Var) {
        return false;
    }

    @Override // p.phv
    public final void g(List list) {
        Objects.toString(list);
    }

    public final void h() {
        gvh0 gvh0Var = this.g;
        if (gvh0Var != null) {
            gvh0Var.g();
            this.h.size();
            m4d m4dVar = this.Y;
            if (m4dVar != null) {
                m4dVar.invoke(new ihv(gvh0Var, this.h));
            } else {
                u890.C("onDescriptorsChanged");
                throw null;
            }
        }
    }

    @Override // p.phv
    public final void i(String str) {
        k(str, true, new ia6(this, null, (byte) 0));
    }

    @Override // p.phv
    public final void j(int i) {
        this.d.c(i);
    }

    public final void k(String str, boolean z, vu30 vu30Var) {
        boolean z2 = this.i;
        if (!z2 || this.t || this.X != null) {
            Logger.d("GOS->Artisanal Cast mutation ignored: routeId=" + str + " initialMembershipConfirmed=" + z2 + " mutationStarting=" + this.t + " pendingRequestId=" + this.X, new Object[0]);
            return;
        }
        va6 va6Var = this.f;
        ab6 ab6VarA = va6Var != null ? va6Var.a(str) : null;
        if (ab6VarA == null) {
            Logger.d(f4i1.f("GOS->Artisanal Cast mutation ignored: routeId=", str, " has no state route"), new Object[0]);
            return;
        }
        if (z && !ab6VarA.h) {
            Logger.d(f4i1.f("GOS->Artisanal Cast add member ignored: routeId=", str, " is not groupable"), new Object[0]);
        } else if (!z && !ab6VarA.i) {
            Logger.d(f4i1.f("GOS->Artisanal Cast remove member ignored: routeId=", str, " is not removable"), new Object[0]);
        } else {
            this.t = true;
            fn31.T(this.e, (o8n) null, 0, new wc5(vu30Var, ab6VarA, this, (lnm) null, (byte) 2), 3);
        }
    }

    @Override // p.phv
    public final void l() {
        smo1.p(this.e, (CancellationException) null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:104:0x0201  */
    /* JADX WARN: Code duplicated, block: B:105:0x0205  */
    /* JADX WARN: Code duplicated, block: B:108:0x0214  */
    /* JADX WARN: Code duplicated, block: B:159:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01be  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    public final void m(va6 va6Var) {
        Object next;
        ?? SingletonList;
        String str;
        Object obj;
        String strJ;
        gvh0 gvh0Var;
        boolean z;
        boolean zJ;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        kvh0 kvh0Var;
        ab6 ab6Var;
        ndc1 ndc1Var = this.a;
        String str2 = ndc1Var.a;
        boolean z4 = false;
        int i3 = 1;
        if (!a6o1.p(va6Var)) {
            this.i = false;
        } else if ((va6Var != null ? va6Var.b : 0) == 1) {
            this.i = false;
        }
        jqd0 jqd0VarA = this.c.a();
        List list = jqd0VarA != null ? (List) jqd0VarA.d : null;
        List list2 = z6x.a;
        if (list == null) {
            list = list2;
        }
        List list3 = list;
        Iterator it = list3.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((gvh0) next).g(), str2));
        gvh0 gvh0Var2 = (gvh0) next;
        if (gvh0Var2 == null) {
            Logger.d("GOS->Artisanal Cast initial descriptor missing: routeId=%s", new Object[]{str2});
            return;
        }
        List list4 = va6Var != null ? va6Var.d : null;
        if (list4 == null) {
            list4 = list2;
        }
        List list5 = list4;
        int iS = zno1.s(q7h.U(list5, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : list5) {
            linkedHashMap.put(((ab6) obj2).a, obj2);
        }
        if (a6o1.p(va6Var) && (ab6Var = (ab6) linkedHashMap.get(str2)) != null && ab6Var.g) {
            this.i = true;
        }
        list.size();
        int iS2 = zno1.s(q7h.U(list3, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
        for (Object obj3 : list3) {
            linkedHashMap2.put(((gvh0) obj3).g(), obj3);
        }
        Collection collectionValues = linkedHashMap2.values();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            gvh0 gvh0Var3 = (gvh0) it2.next();
            if (this.i || u890.j(gvh0Var3.g(), str2)) {
                ab6 ab6Var2 = (ab6) linkedHashMap.get(gvh0Var3.g());
                if (ab6Var2 != null || u890.j(gvh0Var3.g(), str2)) {
                    new ArrayList();
                    new ArrayList();
                    new HashSet();
                    new ArrayList();
                    Bundle bundle = new Bundle(gvh0Var3.a);
                    ArrayList arrayListE = gvh0Var3.e();
                    ArrayList arrayListB = gvh0Var3.b();
                    HashSet hashSetA = gvh0Var3.a();
                    List list6 = gvh0Var3.c;
                    String str3 = gvh0Var3.b;
                    if (ab6Var2 != null) {
                        gvh0Var = gvh0Var2;
                        if (ab6Var2.g) {
                            bundle.putInt("volumeHandling", 1);
                            bundle.putInt("volumeMax", 100);
                            z = false;
                            bundle.putInt("volume", yoi1.p(jch0.S(ab6Var2.e * 100.0d), 0, 100));
                        }
                        bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
                        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListE));
                        bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
                        gvh0 gvh0Var4 = new gvh0(str3, bundle, list6);
                        if (this.i) {
                            zJ = u890.j(gvh0Var3.g(), str2);
                        } else if (ab6Var2 == null && ab6Var2.g) {
                            zJ = true;
                        } else {
                            zJ = z;
                        }
                        gvh0Var3.g();
                        gvh0Var4.l();
                        gvh0Var4.k();
                        gvh0Var4.m();
                        if (this.i || !a6o1.p(va6Var) || ab6Var2 == null || !ab6Var2.h) {
                            z2 = z;
                        } else {
                            z2 = true;
                        }
                        if (this.i || !a6o1.p(va6Var) || ab6Var2 == null) {
                            i = 1;
                        } else {
                            i = 1;
                            if (ab6Var2.i) {
                                z3 = true;
                            }
                            if (zJ) {
                                i2 = 3;
                            } else {
                                i2 = i;
                            }
                            kvh0Var = new kvh0(gvh0Var4, i2, z3, z2, true);
                        }
                        z3 = z;
                        if (zJ) {
                            i2 = 3;
                        } else {
                            i2 = i;
                        }
                        kvh0Var = new kvh0(gvh0Var4, i2, z3, z2, true);
                    } else {
                        gvh0Var = gvh0Var2;
                    }
                    z = false;
                    bundle.putInt("volumeHandling", 0);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListE));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
                    gvh0 gvh0Var5 = new gvh0(str3, bundle, list6);
                    if (this.i) {
                        zJ = u890.j(gvh0Var3.g(), str2);
                    } else if (ab6Var2 == null) {
                        zJ = z;
                    } else {
                        zJ = z;
                    }
                    gvh0Var3.g();
                    gvh0Var5.l();
                    gvh0Var5.k();
                    gvh0Var5.m();
                    if (this.i) {
                        z2 = z;
                    } else {
                        z2 = z;
                    }
                    if (this.i) {
                        i = 1;
                        z3 = z;
                    } else {
                        i = 1;
                        z3 = z;
                    }
                    if (zJ) {
                        i2 = 3;
                    } else {
                        i2 = i;
                    }
                    kvh0Var = new kvh0(gvh0Var5, i2, z3, z2, true);
                } else {
                    gvh0Var3.g();
                }
                if (kvh0Var != null) {
                    arrayList.add(kvh0Var);
                }
                i3 = i;
                z4 = z;
                it2 = it2;
                list2 = list2;
                list3 = list3;
                gvh0Var2 = gvh0Var;
            } else {
                gvh0Var3.g();
            }
            gvh0Var = gvh0Var2;
            kvh0Var = null;
            z = z4;
            i = i3;
            if (kvh0Var != null) {
                arrayList.add(kvh0Var);
            }
            i3 = i;
            z4 = z;
            it2 = it2;
            list2 = list2;
            list3 = list3;
            gvh0Var2 = gvh0Var;
        }
        List list7 = list2;
        List list8 = list3;
        gvh0 gvh0Var6 = gvh0Var2;
        this.h = arrayList;
        if (this.i) {
            List list9 = va6Var != null ? va6Var.d : null;
            List list10 = list9 == null ? list7 : list9;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : list10) {
                if (((ab6) obj4).g) {
                    arrayList2.add(obj4);
                }
            }
            SingletonList = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                SingletonList.add(((ab6) it3.next()).a);
            }
        } else {
            SingletonList = Collections.singletonList(str2);
        }
        ur31 ur31VarA = this.d.a();
        SingletonList.toString();
        if (!this.i || !a6o1.p(va6Var)) {
            str = null;
        } else if (va6Var == null || (str = va6Var.c) == null) {
            str = (String) o7h.X0((List) SingletonList);
        }
        Iterator it4 = list8.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            }
            Object next2 = it4.next();
            if (u890.j(((gvh0) next2).g(), str)) {
                obj = next2;
                break;
            }
        }
        gvh0 gvh0Var7 = (gvh0) obj;
        if (gvh0Var7 == null || (strJ = gvh0Var7.j()) == null) {
            strJ = gvh0Var6.j();
        }
        wmy wmyVar = new wmy(ndc1Var.b, strJ);
        wmyVar.v(2);
        wmyVar.G(ur31VarA.a ? 1 : 0);
        wmyVar.F(ur31VarA.b);
        wmyVar.H(ur31VarA.c);
        wmyVar.d(gvh0Var6.b());
        this.g = wmyVar.h();
        h();
    }

    public final void n(va6 va6Var) {
        za6 za6Var;
        if (!a6o1.p(va6Var)) {
            this.X = null;
            return;
        }
        Long l = this.X;
        if (l != null) {
            long jLongValue = l.longValue();
            if (va6Var == null || (za6Var = va6Var.e) == null) {
                return;
            }
            if (za6Var.a != jLongValue) {
                za6Var = null;
            }
            if (za6Var == null) {
                return;
            }
            int i = za6Var.c;
            if (i == 4 || i == 5) {
                this.X = null;
            }
        }
    }
}
