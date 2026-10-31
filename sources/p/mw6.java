package p;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mw6 {
    public final op31 a;
    public final kt91 b;
    public final lzn0 c;
    public final kly0 d;
    public final bqk0 e;
    public final bpb1 f;
    public final xe01 g;

    public mw6(op31 op31Var, kt91 kt91Var, lzn0 lzn0Var, fwo fwoVar, bqk0 bqk0Var) {
        this.a = op31Var;
        this.b = kt91Var;
        this.c = lzn0Var;
        this.d = fwoVar;
        this.e = bqk0Var;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.f = bpb1VarB;
        this.g = d5p1.h(bpb1VarB);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(liu0 liu0Var, onm onmVar) {
        jw6 jw6Var;
        if (onmVar instanceof jw6) {
            jw6Var = (jw6) onmVar;
            int i = jw6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jw6Var.c = i - Integer.MIN_VALUE;
            } else {
                jw6Var = new jw6(this, onmVar);
            }
        } else {
            jw6Var = new jw6(this, onmVar);
        }
        jw6 jw6Var2 = jw6Var;
        Object objB = jw6Var2.a;
        int i2 = jw6Var2.c;
        rih1 rih1Var = rih1.a;
        bpb1 bpb1Var = this.f;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                Boolean bool = Boolean.FALSE;
                if (!bpb1Var.k(bool, Boolean.TRUE)) {
                    return rih1Var;
                }
                String str = liu0Var.a;
                List list = liu0Var.b;
                if (ihc1.y0(str) || list.isEmpty()) {
                    b();
                    bpb1Var.m((Object) null, bool);
                    return rih1Var;
                }
                op31 op31Var = this.a;
                String str2 = liu0Var.a;
                String str3 = liu0Var.c;
                String str4 = liu0Var.d;
                lp31 lp31Var = new lp31(str4);
                jw6Var2.c = 1;
                objB = op31.b(op31Var, str2, list, str3, str4, lp31Var, jw6Var2);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            ((py21) objB).b(new rr6(this, (byte) 1), new n5(1, this, mw6.class, "showSuccess", "showSuccess(Ljava/lang/String;)V", 0, (byte) 14));
            bpb1Var.m((Object) null, Boolean.FALSE);
            return rih1Var;
        } catch (Throwable th) {
            bpb1Var.m((Object) null, Boolean.FALSE);
            throw th;
        }
    }

    public final void b() {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958057});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.b.k(new er91((fs91) null, "", 2131958057, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }
}
