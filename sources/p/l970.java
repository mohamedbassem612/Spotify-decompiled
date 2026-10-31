package p;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l970 extends f770 {
    public final fe70 d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l970(fe70 fe70Var, Class cls, byte b) {
        super(EnumSet.of(ix40.b, ix40.d), cls, (byte) 1);
        this.e = b;
        fe70Var.getClass();
        this.d = fe70Var;
    }

    @Override // p.f770
    public void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        switch (this.e) {
            case 1:
                rtd rtdVar = (rtd) nx40Var;
                i(rtdVar, y570Var, l670Var);
                rtdVar.a.setTitle(hxo1.r(y570Var));
                break;
            case 2:
                rtd rtdVar2 = (rtd) nx40Var;
                i(rtdVar2, y570Var, l670Var);
                CharSequence charSequenceR = hxo1.r(y570Var);
                tvd tvdVar = rtdVar2.a;
                tvdVar.setTitle(charSequenceR);
                tvdVar.setSubtitle(hxo1.q(y570Var));
                break;
            case 3:
                rtd rtdVar3 = (rtd) nx40Var;
                i(rtdVar3, y570Var, l670Var);
                CharSequence charSequenceR2 = hxo1.r(y570Var);
                tvd tvdVar2 = rtdVar3.a;
                tvdVar2.setTitle(charSequenceR2);
                CharSequence charSequenceQ = hxo1.q(y570Var);
                if (TextUtils.isEmpty(charSequenceQ)) {
                    charSequenceQ = hxo1.v(((id70) y570Var.n()).a.d, y570Var.g().b("glue:descriptionAsHtml", false));
                }
                tvdVar2.setSubtitle(charSequenceQ);
                break;
            default:
                i((wrd) nx40Var, y570Var, l670Var);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View, p.tvd] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, p.tvd] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, p.tvd] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, p.tvd] */
    @Override // p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.e) {
            case 0:
                sua suaVar = vvd.b.a;
                ?? tvdVar = new tvd(context);
                rtd rtdVar = new rtd(tvdVar, jsd.a);
                tvdVar.setTag(2131429011, rtdVar);
                return rtdVar;
            case 1:
                vvd.b.getClass();
                ?? tvdVar2 = new tvd(context);
                rtd rtdVar2 = new rtd(tvdVar2, jsd.b);
                tvdVar2.setTag(2131429011, rtdVar2);
                return rtdVar2;
            case 2:
                vvd.b.getClass();
                ?? tvdVar3 = new tvd(context);
                rtd rtdVar3 = new rtd(tvdVar3, jsd.d);
                tvdVar3.setTag(2131429011, rtdVar3);
                return rtdVar3;
            default:
                vvd.b.getClass();
                ?? tvdVar4 = new tvd(context);
                rtd rtdVar4 = new rtd(tvdVar4, jsd.c);
                tvdVar4.setTag(2131429011, rtdVar4);
                return rtdVar4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, p.tvd] */
    public final void i(wrd wrdVar, y570 y570Var, l670 l670Var) {
        j970 j970Var;
        rtd rtdVar = (rtd) wrdVar;
        ?? r0 = rtdVar.a;
        this.d.d(r0.getImageView(), ((dd70) y570Var.k()).a.c, fa70.CARD);
        Object objJ = y570Var.g().j("textLayout");
        if (objJ instanceof j970) {
            j970Var = (j970) objJ;
        } else {
            j970Var = objJ instanceof String ? (j970) i970.a.G(objJ.toString()).e(j970.DEFAULT) : j970.DEFAULT;
        }
        rtdVar.a(j970Var.b);
        ywo1.i((View) r0);
        two1.r(l670Var, (View) r0, y570Var);
        if (y570Var.j().containsKey("longClick")) {
            o670 o670Var = new o670(l670Var.c);
            o670Var.c("longClick");
            o670Var.g(y570Var);
            o670Var.f(r0);
            o670Var.e();
        }
    }
}
