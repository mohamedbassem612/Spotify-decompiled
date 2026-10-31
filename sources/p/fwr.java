package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fwr {
    public final p7s a;
    public final l7s b;
    public final y7l c;
    public final String d;

    public fwr(p7s p7sVar, l7s l7sVar, y7l y7lVar, String str, ekb ekbVar) {
        this.a = p7sVar;
        this.b = l7sVar;
        this.c = y7lVar;
        this.d = str;
    }

    public static kvh0 b(gvh0 gvh0Var) {
        new ArrayList();
        new ArrayList();
        new HashSet();
        new ArrayList();
        Bundle bundle = new Bundle(gvh0Var.a);
        ArrayList arrayListE = gvh0Var.e();
        ArrayList arrayListB = gvh0Var.b();
        HashSet hashSetA = gvh0Var.a();
        List list = gvh0Var.c;
        String str = gvh0Var.b;
        bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListE));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
        return new kvh0(new gvh0(str, bundle, list), 3, false, false, false);
    }

    public final String a(String str) {
        Object next;
        p7s p7sVar = this.a;
        p7sVar.c();
        owh0.b();
        Iterator it = irn1.m0(p7sVar.f, owh0.c().e()).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ArrayList arrayList = ((sn50) next).c;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (ihc1.h0(((pr31) it2.next()).a, str, false)) {
                        break loop0;
                    }
                }
            }
        }
        sn50 sn50Var = (sn50) next;
        if (sn50Var != null) {
            return sn50Var.a.b;
        }
        return null;
    }
}
