package p;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ien implements c7r0 {
    public final vu30 a;
    public final Function0 b;
    public final String c;
    public bbr0 d;
    public long e;
    public boolean f;
    public boolean g;

    public ien() {
        u2m u2mVar = u2m.c1;
        hen henVar = hen.a;
        this.a = u2mVar;
        this.b = henVar;
        this.c = Integer.toHexString(System.identityHashCode(this));
    }

    public final void a(upn1 upn1Var) {
        boolean z = upn1Var instanceof h7r0;
        Function0 function0 = this.b;
        if (z) {
            if (this.f) {
                return;
            }
            this.f = true;
            c("data loaded %s (+%dms)", ((h7r0) upn1Var).c ? "ok" : "failed", Long.valueOf((((Number) function0.invoke()).longValue() - this.e) / 1000000));
            return;
        }
        if (upn1Var.equals(j7r0.c)) {
            if (this.g) {
                return;
            }
            this.g = true;
            c("first frame (+%dms)", Long.valueOf((((Number) function0.invoke()).longValue() - this.e) / 1000000));
            return;
        }
        if (upn1Var instanceof k7r0) {
            c(((k7r0) upn1Var).c ? "focus on" : "focus off", new Object[0]);
        } else if (upn1Var.equals(n7r0.c)) {
            c("view destroyed", new Object[0]);
        }
    }

    public final void c(String str, Object... objArr) {
        String strPath;
        war0 war0VarB0;
        bn70 bn70VarA;
        n6r0 n6r0Var;
        String strConcat = "Page %s#%s ".concat(str);
        c8b1 c8b1Var = new c8b1(3);
        bbr0 bbr0Var = this.d;
        if (bbr0Var == null || (war0VarB0 = bbr0Var.b0(bn70.class)) == null || (bn70VarA = war0VarB0.a()) == null || (n6r0Var = bn70VarA.a) == null || (strPath = n6r0Var.path()) == null) {
            strPath = "?";
        }
        c8b1Var.a(strPath);
        c8b1Var.a(this.c);
        c8b1Var.b(objArr);
        ArrayList arrayList = c8b1Var.a;
        this.a.invoke(strConcat, arrayList.toArray(new Object[arrayList.size()]));
    }

    public final Bundle d() {
        return null;
    }

    public final void dispose() {
        c("disposed", new Object[0]);
    }

    public final void g(bbr0 bbr0Var) {
        this.d = bbr0Var;
        this.e = ((Number) this.b.invoke()).longValue();
        c("created", new Object[0]);
    }

    public final void b(Bundle bundle) {
    }
}
