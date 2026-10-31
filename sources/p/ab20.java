package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ab20 {
    public static final List e = Collections.singletonList(new y4c0());
    public static final List f = Collections.singletonList(new e5c0());
    public static final List g = Collections.singletonList(new y5c0());
    public static final List h = p7h.M(new d6c0[]{new y5c0(), new i5c0()});
    public static final List i = Collections.singletonList(new b5c0((List) null, 3));
    public static final List j = Collections.singletonList(a5c0.b);
    public static final List k = Collections.singletonList(z4c0.b);
    public static final List l = Collections.singletonList(d5c0.b);
    public static final List m = Collections.singletonList(c5c0.b);
    public static final List n = Collections.singletonList(new z5c0());
    public static final List o = p7h.M(new d6c0[]{new z5c0(), new q5c0()});

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f2p = Collections.singletonList(new g5c0());
    public static final List q = Collections.singletonList(new r5c0());
    public final w0t a;
    public final String b;
    public final s4b1 c;
    public final String d;

    public ab20(w0t w0tVar, String str, s4b1 s4b1Var, String str2) {
        this.a = w0tVar;
        this.b = str;
        this.c = s4b1Var;
        this.d = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r8.equals("downloaded") != false) goto L88;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a() {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ab20.a():java.util.List");
    }

    public final void b(List list) {
        if (this.c.c == blc0.q4) {
            w0t w0tVar = this.a;
            w0tVar.a.a = new mmr0(this.b, list);
            if (w0tVar.b()) {
                String strY0 = o7h.y0(list, ",", (String) null, (String) null, d0t.e, 30);
                hma1 hma1VarEdit = w0tVar.a().edit();
                hma1VarEdit.d(w0t.g, strY0);
                hma1VarEdit.h();
            }
        }
    }

    public final void c(lml lmlVar) {
        if (this.c.c == blc0.q4) {
            w0t w0tVar = this.a;
            if (lmlVar == null) {
                w0tVar.a.b = null;
                if (w0tVar.b()) {
                    hma1 hma1VarEdit = w0tVar.a().edit();
                    hma1VarEdit.f(w0t.h);
                    hma1VarEdit.f(w0t.i);
                    hma1VarEdit.h();
                    return;
                }
                return;
            }
            w0tVar.a.b = new mmr0(this.b, lmlVar);
            if (w0tVar.b()) {
                hma1 hma1VarEdit2 = w0tVar.a().edit();
                hma1VarEdit2.d(w0t.h, lmlVar.a);
                hma1VarEdit2.d(w0t.i, lmlVar.b);
                hma1VarEdit2.h();
            }
        }
    }
}
