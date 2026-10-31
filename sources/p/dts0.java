package p;

import android.content.Context;
import android.net.Uri;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dts0 implements rhh0 {
    public final Context a;
    public final zuz b;
    public final o3e0 c;
    public final n3q0 d;
    public final ytp0 e;
    public final o241 f;

    public dts0(Context context, zuz zuzVar, o3e0 o3e0Var, n3q0 n3q0Var, ytp0 ytp0Var, o241 o241Var, rh11 rh11Var) {
        this.a = context;
        this.b = zuzVar;
        this.c = o3e0Var;
        this.d = n3q0Var;
        this.e = ytp0Var;
        this.f = o241Var;
    }

    public final Observable a(r9c r9cVar) {
        return e(r9cVar, 0);
    }

    public final Single b(r9c r9cVar) {
        return d(r9cVar, 0).map(sa20.X0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    public final ArrayList c(l510 l510Var, List list, r9c r9cVar, boolean z, boolean z2) {
        Uri uri;
        q510 q510Var;
        String str;
        String str2;
        q510 q510Var2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (p510 p510Var : l510Var.a) {
            int i2 = i + 1;
            String str3 = p510Var.d;
            if (str3 == null) {
                uri = null;
            } else {
                if (ihc1.y0(str3)) {
                    str3 = null;
                }
                if (str3 != null) {
                    uri = Uri.parse(str3);
                } else {
                    uri = null;
                }
            }
            hh31 hh31Var = p510Var.i;
            if (hh31Var != null) {
                String str4 = hh31Var.a;
                if (str4 == null || ihc1.y0(str4)) {
                    str4 = null;
                }
                yg51 yg51Var = hh31Var.b;
                if (yg51Var == null || (str = yg51Var.a) == null || ihc1.y0(str)) {
                    str = null;
                }
                if (yg51Var == null || (str2 = yg51Var.b) == null || ihc1.y0(str2)) {
                    str2 = null;
                }
                String str5 = hh31Var.c;
                if (str5 == null || ihc1.y0(str5)) {
                    str5 = null;
                }
                boolean z3 = (str4 == null || str == null || str2 == null) ? false : true;
                if (z3 || str5 != null) {
                    if (!z3) {
                        str4 = null;
                    }
                    if (!z3) {
                        str = null;
                    }
                    q510Var2 = new q510(str4, str, str5);
                } else {
                    q510Var2 = null;
                }
                q510Var = q510Var2;
            } else {
                q510Var = null;
            }
            p710 p710Var = new p710(16, Integer.valueOf(i), "SECTION", p510Var.a, p510Var.c, (String) null);
            if (!u890.j(p510Var.a, "nft-home-recently-played") || r9cVar.o) {
                int i3 = 0;
                for (t510 t510Var : p510Var.e) {
                    int i4 = i3 + 1;
                    spq0 spq0VarC = this.c.c(t510Var, p510Var.b, Boolean.valueOf(r9cVar.i), z, z2, this.d, new y310(p7h.M(new p710[]{p710Var, new p710(18, Integer.valueOf(i3), "ITEM", (String) null, t510Var.c, (String) null)})), 1, r9cVar.e, p510Var.f, p510Var.g);
                    if (spq0VarC.c()) {
                        arrayList.add(u310.b((u310) spq0VarC.b(), (String) null, (String) null, (Uri) null, 0, (Double) null, (String) null, 0, (y310) null, (String) null, (Map) null, uri, q510Var, -1, 3));
                    }
                    i3 = i4;
                }
            } else if (list != null) {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                int i5 = 0;
                for (Object obj : list2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw null;
                    }
                    u310 u310Var = (u310) obj;
                    arrayList2.add(u310.b(u310Var, (String) null, (String) null, (Uri) null, 0, (Double) null, (String) null, 0, new y310(p7h.M(new p710[]{p710Var, new p710(18, Integer.valueOf(i5), "ITEM", (String) null, u310Var.a, (String) null)})), (String) null, (Map) null, uri, q510Var, -67108865, 3));
                    i5 = i6;
                }
                arrayList.addAll(arrayList2);
            } else {
                continue;
            }
            i = i2;
        }
        return arrayList;
    }

    public final Single d(r9c r9cVar, int i) {
        return this.f.a.firstOrError().flatMap(new mgc(this, r9cVar, i, (byte) 25));
    }

    public final Observable e(r9c r9cVar, int i) {
        return this.e.y(r9cVar, i).withLatestFrom(this.f.a, ua20.W0).switchMap(new zhq0((Object) this, (Object) r9cVar, (byte) 19));
    }
}
