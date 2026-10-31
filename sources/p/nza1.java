package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nza1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qza1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nza1(qza1 qza1Var, byte b) {
        super(1);
        this.a = b;
        this.b = qza1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        qza1 qza1Var = this.b;
        switch (b) {
            case 0:
                String str = qza1Var.a;
                kby kbyVar = ((cxc0) obj).f;
                String str2 = kbyVar.b;
                CharSequence charSequence = (CharSequence) kbyVar.q.get("image_url");
                return new b0b1(str, str2, ((charSequence == null || charSequence.length() == 0) ? (byte) 1 : (byte) 0) ^ 1);
            default:
                orq orqVar = qza1Var.f;
                zo51 zo51Var = new zo51(qza1Var.d.i, qza1Var, (byte) 29);
                ur00 ur00Var = qza1Var.b;
                jnq jnqVar = (jnq) orqVar.a.c;
                av0 av0Var = (av0) ((jbq) jnqVar.d).a.a.s2.get();
                c8o.l(av0Var);
                jbq jbqVar = (jbq) jnqVar.d;
                fza1 fza1Var = (fza1) jbqVar.a.Df.get();
                c8o.l(fza1Var);
                teq teqVar = jbqVar.b;
                lzn0 lzn0Var = (lzn0) teqVar.i.get();
                c8o.l(lzn0Var);
                pxc pxcVar = (pxc) teqVar.t7.get();
                c8o.l(pxcVar);
                daq daqVar = jbqVar.a;
                ao0 ao0Var = (ao0) daqVar.Hk.get();
                c8o.l(ao0Var);
                n0b1 n0b1Var = (n0b1) ((jly0) jnqVar.a).get();
                n0b1 n0b1Var2 = (n0b1) ((jly0) jnqVar.a).get();
                Flowable flowable = (Flowable) daqVar.D5.get();
                c8o.l(flowable);
                return new kpg0(new r8s(av0Var, fza1Var, lzn0Var, pxcVar, ao0Var, n0b1Var, n0b1Var2, flowable, zo51Var, ur00Var, (zob1) obj), new nza1(qza1Var, b2));
        }
    }
}
