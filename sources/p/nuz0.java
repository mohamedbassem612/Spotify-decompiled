package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nuz0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fsl b;

    public /* synthetic */ nuz0(fsl fslVar, byte b) {
        this.a = b;
        this.b = fslVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        fsl fslVar = this.b;
        switch (b) {
            case 0:
                t01 t01Var = (t01) fslVar.d;
                t8r0 t8r0Var = (t8r0) t01Var.d;
                ((i8h1) ((ynb0) t8r0Var.a).get()).m(((tdl0) t8r0Var.b).r(ywx0.a(2)).s().q(), (xj61) null);
                ((lzn0) ((fsl) t01Var.u().i).g).e();
                break;
            case 1:
                ((t01) fslVar.d).z(((muz0) fslVar.c).a);
                break;
            default:
                ((t01) fslVar.d).z(((muz0) fslVar.c).a);
                break;
        }
    }
}
