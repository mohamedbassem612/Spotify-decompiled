package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c770 extends e770 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c770(EnumSet enumSet, fe70 fe70Var, byte b) {
        super(enumSet, fe70Var);
        this.f = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, p.tvd] */
    @Override // p.e770, p.f770
    public void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        switch (this.f) {
            case 2:
                wrd wrdVar = (wrd) nx40Var;
                ld70 ld70Var = ((dd70) y570Var.k()).a.c;
                n57.k(ld70Var != null, "main image missing, id=%s", new Object[]{y570Var.a()});
                ?? r4 = ((rtd) wrdVar).a;
                m(r4.getImageView(), ld70Var);
                ywo1.i((View) r4);
                r4.setAccessoryDrawable(e770.l(r4.getContext(), y570Var.g()));
                two1.r(l670Var, (View) r4, y570Var);
                if (y570Var.j().containsKey("longClick")) {
                    o670 o670Var = new o670(l670Var.c);
                    o670Var.c("longClick");
                    o670Var.g(y570Var);
                    o670Var.f(r4);
                    o670Var.e();
                }
                break;
            default:
                super.f(nx40Var, y570Var, l670Var, yfuVar);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View, p.tvd] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View, p.tvd] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, p.tvd] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, p.tvd] */
    @Override // p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.f) {
            case 0:
                sua suaVar = vvd.b.a;
                ?? tvdVar = new tvd(context);
                rtd rtdVar = new rtd(tvdVar, jsd.g);
                tvdVar.setTag(2131429011, rtdVar);
                rtdVar.a(vrd.b);
                return rtdVar;
            case 1:
                sua suaVar2 = vvd.b.a;
                ?? tvdVar2 = new tvd(context);
                rtd rtdVar2 = new rtd(tvdVar2, jsd.e);
                tvdVar2.setTag(2131429011, rtdVar2);
                rtdVar2.a(vrd.b);
                return rtdVar2;
            case 2:
                sua suaVar3 = vvd.b.a;
                ?? tvdVar3 = new tvd(context);
                rtd rtdVar3 = new rtd(tvdVar3, jsd.f);
                tvdVar3.setTag(2131429011, rtdVar3);
                rtdVar3.a(vrd.b);
                return rtdVar3;
            default:
                vvd.b.getClass();
                ?? tvdVar4 = new tvd(context);
                rtd rtdVar4 = new rtd(tvdVar4, jsd.b);
                tvdVar4.setTag(2131429011, rtdVar4);
                rtdVar4.a(vrd.b);
                return rtdVar4;
        }
    }

    @Override // p.e770
    public void j(wrd wrdVar, y570 y570Var, l670 l670Var) {
        switch (this.f) {
            case 2:
                throw null;
            default:
                super.j(wrdVar, y570Var, l670Var);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c770(fe70 fe70Var, Class cls, byte b) {
        super(fe70Var, cls);
        this.f = b;
    }
}
