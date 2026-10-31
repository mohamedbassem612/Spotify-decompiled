package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j3e extends vr31 {
    public final /* synthetic */ byte b = 0;
    public final Object c;
    public final Object d;

    public j3e(String str, i3e i3eVar) {
        super(str);
        this.c = i3eVar.c;
        this.d = new idd1(new rqa(this, str, i3eVar));
    }

    public void f() {
        String str;
        switch (this.b) {
            case 1:
                l7s l7sVar = (l7s) this.d;
                jqd0 jqd0VarA = l7sVar.a();
                jqd0 jqd0Var = null;
                Object obj = null;
                if (jqd0VarA != null) {
                    List list = (List) jqd0VarA.d;
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        str = this.a;
                        if (zHasNext) {
                            Object next = it.next();
                            if (u890.j(((gvh0) next).g(), str)) {
                                obj = next;
                            }
                        }
                    }
                    gvh0 gvh0Var = (gvh0) obj;
                    if (gvh0Var != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(list);
                        boolean z = jqd0VarA.b;
                        new ArrayList();
                        new ArrayList();
                        new HashSet();
                        new ArrayList();
                        Bundle bundle = new Bundle(gvh0Var.a);
                        ArrayList arrayListE = gvh0Var.e();
                        ArrayList arrayListB = gvh0Var.b();
                        HashSet hashSetA = gvh0Var.a();
                        List list2 = gvh0Var.c;
                        String str2 = gvh0Var.b;
                        bundle.putInt("connectionState", 2);
                        bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
                        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListE));
                        bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
                        gvh0 gvh0Var2 = new gvh0(str2, bundle, list2);
                        if (arrayList.contains(gvh0Var2)) {
                            hhg1.n("route descriptor already added");
                        } else {
                            arrayList.add(gvh0Var2);
                            jqd0VarA = new jqd0(arrayList, z);
                        }
                    } else {
                        Logger.k(f4i1.f("GOS->Route with id ", str, " not found in descriptor"), new Object[0]);
                    }
                    jqd0Var = jqd0VarA;
                } else {
                    Logger.k("GOS->No descriptor available to select route", new Object[0]);
                }
                pvh0 pvh0Var = l7sVar.a;
                if (pvh0Var != null) {
                    pvh0Var.g(jqd0Var);
                }
                break;
        }
    }

    public final void g(int i) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                pr31 pr31Var = (pr31) ((idd1) this.d).getValue();
                if (pr31Var != null) {
                    lwh0 lwh0Var = pr31Var.l;
                    if (lwh0Var == null) {
                        eg.m("Required value was null.");
                    } else {
                        lwh0Var.i(i);
                        ((m0s) obj).d(i, this.a);
                    }
                }
                break;
            default:
                ((y7l) obj).b(i);
                break;
        }
    }

    public final void j(int i) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                m0s m0sVar = (m0s) obj;
                pr31 pr31Var = (pr31) ((idd1) this.d).getValue();
                if (pr31Var != null) {
                    lwh0 lwh0Var = pr31Var.l;
                    if (lwh0Var == null) {
                        eg.m("Required value was null.");
                    } else {
                        lwh0Var.j(i);
                        String str = this.a;
                        if (i > 0) {
                            m0sVar.c(str);
                        } else if (i < 0) {
                            m0sVar.b(str);
                        }
                    }
                }
                break;
            default:
                ((y7l) obj).c(i);
                break;
        }
    }

    public j3e(String str, xa80 xa80Var) {
        super(str);
        this.c = xa80Var.a;
        this.d = xa80Var.b;
    }
}
