package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lt20 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ xu30 c;

    public /* synthetic */ lt20(mr20 mr20Var, xu30 xu30Var, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = xu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        kt20 kt20Var;
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Serializable serializable = d9n.a;
        xu30 xu30Var = this.c;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                if (lnmVar instanceof kt20) {
                    kt20Var = (kt20) lnmVar;
                    int i2 = kt20Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        kt20Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        kt20Var = new kt20(this, lnmVar);
                    }
                } else {
                    kt20Var = new kt20(this, lnmVar);
                }
                Object obj = kt20Var.a;
                int i3 = kt20Var.b;
                if (i3 == 0) {
                    hm5.M(obj);
                    kt20Var.d = vr20Var;
                    kt20Var.e = 0;
                    kt20Var.b = 1;
                    Serializable serializableI = x4p1.i(mr20Var, vr20Var, kt20Var);
                    if (serializableI != serializable) {
                        i = 0;
                        obj = serializableI;
                    }
                    return serializable;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = kt20Var.e;
                vr20 vr20Var2 = kt20Var.d;
                hm5.M(obj);
                i = i4;
                vr20Var = vr20Var2;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    return rih1Var;
                }
                kt20Var.d = null;
                kt20Var.e = i;
                kt20Var.b = 2;
                if (xu30Var.invoke(vr20Var, th, kt20Var) != serializable) {
                    return rih1Var;
                }
                return serializable;
            default:
                p811 p811Var = new p811();
                p811Var.a = wqn1.a;
                Object objCollect = mr20Var.collect(new wem((Serializable) p811Var, (Object) xu30Var, vr20Var, (byte) 21), lnmVar);
                return objCollect == serializable ? objCollect : rih1Var;
        }
    }
}
