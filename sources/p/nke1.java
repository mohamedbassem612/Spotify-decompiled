package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nke1 {
    public final krh a;

    public nke1(krh krhVar) {
        this.a = krhVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(at50 at50Var, Resources resources, onm onmVar) {
        mke1 mke1Var;
        String string;
        if (onmVar instanceof mke1) {
            mke1Var = (mke1) onmVar;
            int i = mke1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mke1Var.e = i - Integer.MIN_VALUE;
            } else {
                mke1Var = new mke1(this, onmVar);
            }
        } else {
            mke1Var = new mke1(this, onmVar);
        }
        Object objA = mke1Var.c;
        int i2 = mke1Var.e;
        String string2 = null;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                krh krhVar = this.a;
                ql10 ql10Var = ql10.a;
                mke1Var.a = at50Var;
                mke1Var.b = resources;
                mke1Var.e = 1;
                objA = krhVar.a(ql10Var, 1, mke1Var);
                Object obj = d9n.a;
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                resources = mke1Var.b;
                at50Var = mke1Var.a;
                hm5.M(objA);
            }
            if (((qlz0) objA) == qlz0.c) {
                int iOrdinal = at50Var.ordinal();
                if (iOrdinal == 0) {
                    string = null;
                } else if (iOrdinal == 1) {
                    string = resources.getString(2131956514);
                } else if (iOrdinal == 2) {
                    string = null;
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    string = resources.getString(2131956512);
                }
                int iOrdinal2 = at50Var.ordinal();
                if (iOrdinal2 == 0) {
                    string2 = resources.getString(2131956515);
                } else if (iOrdinal2 == 1) {
                    string2 = resources.getString(2131956513);
                } else if (iOrdinal2 == 2) {
                    string2 = resources.getString(2131956511);
                } else if (iOrdinal2 != 3) {
                    eg.o();
                    return null;
                }
                return new lke1(string, string2);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
