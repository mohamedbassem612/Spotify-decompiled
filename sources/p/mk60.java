package p;

import android.net.Uri;
import android.os.Handler;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mk60 {
    public final w62 a;
    public final h9n b;
    public final o4a c;
    public final b380 d;
    public final b380 e;
    public final b380 f;
    public final b380 g;
    public final HashSet h;
    public final HashSet i;
    public final wdd1 j;
    public boolean k;
    public String l;
    public b380 m;

    public mk60(nk60 nk60Var, h1s h1sVar, h9n h9nVar, o4a o4aVar) {
        this.a = new w62(new nay(nk60Var, (byte) 26));
        this.b = h9nVar;
        this.c = o4aVar;
        b380 b380VarC = h1sVar.c(0);
        b380VarC.getClass();
        this.d = b380VarC;
        b380 b380VarC2 = h1sVar.c(1);
        b380VarC2.getClass();
        this.e = b380VarC2;
        b380 b380VarC3 = h1sVar.c(2);
        b380VarC3.getClass();
        this.f = b380VarC3;
        b380 b380VarC4 = h1sVar.c(3);
        b380VarC4.getClass();
        this.g = b380VarC4;
        dm5.y(!b380VarC.isEmpty());
        ml60 ml60Var = (ml60) b380VarC.get(0);
        ml60Var.getClass();
        this.h = new HashSet((Collection) ml60Var.a());
        this.i = new HashSet();
        this.j = new wdd1(new Handler(zoi1.D(), null));
        this.l = ((ml60) b380VarC.get(0)).d;
    }

    public static Uri.Builder b(Uri uri, oub1 oub1Var) {
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        String str = oub1Var.a;
        if (str != null) {
            builderClearQuery.authority(str);
        }
        TreeMap treeMap = new TreeMap();
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str2);
            queryParameter.getClass();
            treeMap.put(str2, queryParameter);
        }
        treeMap.putAll(oub1Var.b);
        for (Map.Entry entry : treeMap.entrySet()) {
            builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderClearQuery;
    }

    public static void d(nub1 nub1Var, List list, v280 v280Var, v280 v280Var2) {
        Uri uriBuild;
        oub1 oub1Var = nub1Var.c;
        j380 j380Var = oub1Var.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ml60 ml60Var = (ml60) it.next();
            Uri uri = (Uri) ml60Var.b.get(nub1Var.a);
            String str = ml60Var.a.b;
            uri.getClass();
            if (j380Var.containsKey(str)) {
                uriBuild = (Uri) j380Var.get(str);
                uriBuild.getClass();
            } else {
                uriBuild = b(uri, oub1Var).build();
            }
            if (uriBuild != null) {
                v280Var.c(uriBuild);
                v280Var2.c(uri);
            }
        }
    }

    public final boolean a(long j) {
        if (!this.k || this.m == null) {
            return false;
        }
        String str = this.l;
        e(j);
        if (this.l.equals(str)) {
            return false;
        }
        this.i.add(str);
        this.j.g(new ag20(this, str, (byte) 5), j);
        return true;
    }

    public final void c(long j) {
        String str = this.l;
        h1s h1sVar = (h1s) this.b.b;
        boolean z = j == -9223372036854775807L && h1sVar.S0 == null;
        for (g1s g1sVar : h1sVar.d.values()) {
            Uri uriB = j != -9223372036854775807L ? g1sVar.a.b() : null;
            if (uriB == null) {
                g1sVar.f(str, z);
            } else {
                g1sVar.a(j, uriB, str);
            }
        }
    }

    public final void e(long j) {
        String str = this.l;
        w280 w280VarR = this.m.r(0);
        while (w280VarR.hasNext()) {
            String str2 = (String) w280VarR.next();
            if (j == -9223372036854775807L || !str2.equals(str)) {
                if (this.h.contains(str2) && !this.i.contains(str2)) {
                    this.l = str2;
                    break;
                }
            }
        }
        if (this.l.equals(str)) {
            return;
        }
        c(j);
    }

    public final void f() {
        w62 w62Var = this.a;
        eyh0 eyh0Var = (eyh0) w62Var.k;
        if (eyh0Var != null) {
            eyh0Var.x(null);
            w62Var.k = null;
        }
        wdd1 wdd1Var = (wdd1) w62Var.j;
        if (wdd1Var != null) {
            wdd1Var.h();
            w62Var.j = null;
        }
        w62Var.g = null;
        w62Var.i = null;
        w62Var.h = null;
        w62Var.b = false;
        this.j.h();
        this.k = false;
    }
}
