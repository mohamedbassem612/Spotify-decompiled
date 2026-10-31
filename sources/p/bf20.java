package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bf20 {
    public final en31 a;
    public final qs0 b = new qs0((byte) 6);

    public bf20(en31 en31Var) {
        this.a = en31Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(bf20 bf20Var, String str, onm onmVar) {
        ze20 ze20Var;
        if (onmVar instanceof ze20) {
            ze20Var = (ze20) onmVar;
            int i = ze20Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ze20Var.e = i - Integer.MIN_VALUE;
            } else {
                ze20Var = new ze20(bf20Var, onmVar);
            }
        } else {
            ze20Var = new ze20(bf20Var, onmVar);
        }
        Object obj = ze20Var.c;
        int i2 = ze20Var.e;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            ze20Var.a = bf20Var;
            ze20Var.b = str;
            ze20Var.e = 1;
            Object objZ = qyo1.z(ze20Var, new z5z(1, (byte) 10), bf20Var.a, false, true);
            if (objZ != d9nVar) {
                objZ = rih1Var;
            }
            if (objZ != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = ze20Var.b;
        bf20Var = ze20Var.a;
        hm5.M(obj);
        ze20Var.a = null;
        ze20Var.b = null;
        ze20Var.e = 2;
        Object objZ2 = qyo1.z(ze20Var, new cl1(z, str, (byte) 14), bf20Var.a, false, true);
        if (objZ2 != d9nVar) {
            objZ2 = rih1Var;
        }
        return objZ2 == d9nVar ? d9nVar : rih1Var;
    }
}
