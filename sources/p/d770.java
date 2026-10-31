package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d770 extends e770 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d770(fe70 fe70Var, byte b) {
        super(fe70Var, rtd.class);
        this.f = b;
    }

    @Override // p.e770, p.f770
    public final void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        rtd rtdVar = (rtd) nx40Var;
        j(rtdVar, y570Var, l670Var);
        rtdVar.a.setSubtitle(((id70) y570Var.n()).a.b);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [android.view.View, p.tvd] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, p.tvd] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, p.tvd] */
    @Override // p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.f) {
            case 0:
                sua suaVar = vvd.b.a;
                ?? tvdVar = new tvd(context);
                rtd rtdVar = new rtd(tvdVar, jsd.h);
                tvdVar.setTag(2131429011, rtdVar);
                rtdVar.a(vrd.b);
                rtdVar.a(vrd.c);
                return rtdVar;
            case 1:
                vvd.b.getClass();
                ?? tvdVar2 = new tvd(context);
                rtd rtdVar2 = new rtd(tvdVar2, jsd.d);
                tvdVar2.setTag(2131429011, rtdVar2);
                rtdVar2.a(vrd.b);
                return rtdVar2;
            default:
                vvd.b.getClass();
                ?? tvdVar3 = new tvd(context);
                rtd rtdVar3 = new rtd(tvdVar3, jsd.c);
                tvdVar3.setTag(2131429011, rtdVar3);
                rtdVar3.a(vrd.b);
                return rtdVar3;
        }
    }
}
