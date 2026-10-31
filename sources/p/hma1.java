package p;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class hma1 {
    public final SharedPreferences.Editor a;
    public final hfb b;
    public final boolean c;
    public boolean d;

    public hma1(SharedPreferences.Editor editor, hfb hfbVar, boolean z, yrg0 yrg0Var) {
        this.a = editor;
        this.b = hfbVar;
        this.c = z;
    }

    public final void a(bma1 bma1Var, boolean z) {
        this.a.putBoolean(bma1Var.a, z);
        i();
    }

    public final void b(bma1 bma1Var, int i) {
        this.a.putInt(bma1Var.a, i);
        i();
    }

    public final void c(bma1 bma1Var, long j) {
        this.a.putLong(bma1Var.a, j);
        i();
    }

    public final void d(bma1 bma1Var, String str) {
        this.a.putString(bma1Var.a, str);
        i();
    }

    public final void e(bma1 bma1Var, Set set) {
        this.a.putStringSet(bma1Var.a, set);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((String) it.next()).length();
            }
        }
        i();
    }

    public final void f(bma1 bma1Var) {
        this.a.remove(bma1Var.a);
        if (!this.c || this.b == null) {
            return;
        }
        gvg.s();
    }

    public final void g() {
        if (this.d) {
            eg.m("Must not use the same Editor instance twice");
        } else {
            this.a.apply();
            this.d = true;
        }
    }

    public final void h() {
        if (this.d) {
            eg.m("Must not use the same Editor instance twice");
            return;
        }
        boolean z = this.c;
        SharedPreferences.Editor editor = this.a;
        if (!z || this.b == null) {
            editor.commit();
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!((Boolean) new ipi1(System.currentTimeMillis() - jCurrentTimeMillis, Boolean.valueOf(editor.commit())).a()).booleanValue()) {
                gvg.s();
            }
        }
        this.d = true;
    }

    public final void i() {
        if (!this.c || this.b == null) {
            return;
        }
        gvg.s();
    }
}
