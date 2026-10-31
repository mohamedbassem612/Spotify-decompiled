package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class img implements elc0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ img(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @Override // p.elc0
    public final Object a(imt imtVar, lnm lnmVar) {
        a481 a481Var;
        byte b = this.a;
        int i = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                i = imtVar.c ? 2 : 1;
                ((wqg) obj).getClass();
                return new jmt(new iio("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD"), i, imtVar.a);
            case 1:
                i = imtVar.c ? 2 : 1;
                ((xrm1) obj).getClass();
                return new jmt(new iio("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt"), i, imtVar.a);
            case 2:
                if (lnmVar instanceof a481) {
                    a481Var = (a481) lnmVar;
                    int i2 = a481Var.d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        a481Var.d = i2 - Integer.MIN_VALUE;
                    } else {
                        a481Var = new a481(this, (onm) lnmVar);
                    }
                } else {
                    a481Var = new a481(this, (onm) lnmVar);
                }
                Object objJ = a481Var.b;
                int i3 = a481Var.d;
                if (i3 == 0) {
                    hm5.M(objJ);
                    Single singleB = ((p981) obj).b((String) o7h.q0(imtVar.a));
                    a481Var.a = imtVar;
                    a481Var.d = 1;
                    objJ = fc11.j(singleB, a481Var);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i3 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    imtVar = a481Var.a;
                    hm5.M(objJ);
                }
                if (((pa81) objJ) == pa81.b && imtVar.c) {
                    i = 2;
                }
                return new jmt(gio.a, i, imtVar.a);
            default:
                ((agc0) obj).getClass();
                return new jmt(new iio("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ"), 2, imtVar.a);
        }
    }
}
