package p;

import android.content.ComponentName;
import android.content.Intent;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class spl1 {
    public static final HashSet n;
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final ynb0 d;
    public final ynb0 e;
    public final ynb0 f;
    public final ynb0 g;
    public final ynb0 h;
    public final ynb0 i;
    public final ynb0 j;
    public final ynb0 k;
    public final j0d1 l;
    public final llm m;

    static {
        HashSet hashSet = new HashSet();
        d7 d7Var = new d7(qol1.i, (byte) 0);
        while (d7Var.hasNext()) {
            hashSet.add(((qol1) d7Var.next()).a);
        }
        n = hashSet;
    }

    public spl1(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, ynb0 ynb0Var6, ynb0 ynb0Var7, ynb0 ynb0Var8, ynb0 ynb0Var9, ynb0 ynb0Var10, ynb0 ynb0Var11, q8n q8nVar) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
        this.d = ynb0Var4;
        this.e = ynb0Var5;
        this.f = ynb0Var6;
        this.g = ynb0Var7;
        this.h = ynb0Var8;
        this.i = ynb0Var9;
        this.j = ynb0Var10;
        this.k = ynb0Var11;
        j0d1 j0d1VarB = guo1.B();
        this.l = j0d1VarB;
        this.m = smo1.e(flo1.l(q8nVar, j0d1VarB));
    }

    public final String a() {
        if (!((p85) this.e.get()).i()) {
            return "com.spotify.widgets.widgets.ACTION_REFRESH";
        }
        ((y011) ((ne11) this.d.get())).b = true;
        return "com.spotify.widgets.widgets.ACTION_UPDATE";
    }

    public final void b(int i, ComponentName componentName) {
        fn31.T(this.m, (o8n) null, 0, new zi3(this, componentName, i, (lnm) null, (byte) 18), 3);
    }

    public final void c(int[] iArr) {
        fn31.T(this.m, (o8n) null, 0, new gqj1((Object) this, (Object) iArr, (lnm) null, (byte) 17), 3);
    }

    public final void d() {
        fn31.T(this.m, (o8n) null, 0, new qpl1(this, null, (byte) 0), 3);
    }

    public final void e() {
        fn31.T(this.m, (o8n) null, 0, new qpl1(this, null, (byte) 1), 3);
    }

    public final void f(Intent intent) {
        String action = intent.getAction();
        if (action != null && n.contains(action)) {
            fn31.T(this.m, (o8n) null, 0, new vxg1(this, action, intent, (lnm) null, (byte) 27), 3);
        }
    }

    public final void g(int[] iArr, ComponentName componentName) {
        fn31.T(this.m, (o8n) null, 0, new rpl1(this, iArr, componentName, null), 3);
    }
}
