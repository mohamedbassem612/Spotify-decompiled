package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class zr implements Function {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ cs b;
    public final /* synthetic */ lw c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public zr(String str, q941 q941Var, cs csVar, lw lwVar, String str2, boolean z) {
        this.d = str;
        this.g = q941Var;
        this.b = csVar;
        this.c = lwVar;
        this.e = str2;
        this.f = z;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.g;
        char c = 1;
        switch (b) {
            case 0:
                th61 th61Var = (th61) obj;
                boolean z = th61Var.b && u890.j(th61Var.a, this.d);
                m941 m941Var = (q941) obj2;
                this.b.h.a(new jnb1(cs.n(m941Var instanceof m941 ? m941Var.a : null), this.c.c, this.e, this.f));
                return Single.just(Boolean.valueOf(z));
            default:
                q941 q941Var = (q941) obj;
                if (q941Var.equals(k941.a)) {
                    return Single.just(Boolean.FALSE);
                }
                boolean zEquals = q941Var.equals(o941.a);
                lw lwVar = this.c;
                cs csVar = this.b;
                Single singleFlatMap = !zEquals ? csVar.a.a(lwVar.b(), true).map(new pr(c == true ? 1 : 0, csVar, lwVar)).flatMap(new rr(csVar, (byte) 2)) : Single.just(Boolean.TRUE);
                singleFlatMap.getClass();
                return singleFlatMap.flatMap(new as(csVar, lwVar, (ai8) obj2, this.d, q941Var, this.e, this.f));
        }
    }

    public zr(cs csVar, lw lwVar, ai8 ai8Var, String str, String str2, boolean z) {
        this.b = csVar;
        this.c = lwVar;
        this.g = ai8Var;
        this.d = str;
        this.e = str2;
        this.f = z;
    }
}
