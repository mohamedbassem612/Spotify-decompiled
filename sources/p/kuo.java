package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kuo extends ryo1 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;

    public kuo(p811 p811Var, iu30 iu30Var) {
        this.c = (byte) 1;
        this.e = p811Var;
        this.d = iu30Var;
    }

    public void o(Object obj) {
        switch (this.c) {
            case 1:
                jyc jycVar = (jyc) obj;
                p811 p811Var = this.e;
                if (p811Var.a == null && ((Boolean) ((iu30) this.d).invoke(jycVar)).booleanValue()) {
                    p811Var.a = jycVar;
                    break;
                }
                break;
        }
    }

    public final boolean q(Object obj) {
        byte b = this.c;
        Object obj2 = this.d;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                if (((Boolean) ((iu30) obj2).invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                return ((p811) obj3).a == null;
            default:
                beg begVar = (beg) obj;
                p811 p811Var = (p811) obj3;
                String str = (String) obj2;
                String str2 = j8a0.a;
                heg hegVarG = j8a0.g(kht.g(begVar).a);
                String strL = cy30.l(hegVarG != null ? tia0.e(hegVarG) : si1.k(begVar, njx0.U0), '.', str);
                if (ria0.b.contains(strL)) {
                    p811Var.a = nia0.a;
                } else if (ria0.d.contains(strL)) {
                    p811Var.a = nia0.b;
                } else if (ria0.c.contains(strL)) {
                    p811Var.a = nia0.c;
                } else if (ria0.a.contains(strL)) {
                    p811Var.a = nia0.e;
                }
                return p811Var.a == null;
        }
    }

    public final Object z() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return Boolean.valueOf(((boolean[]) obj)[0]);
            case 1:
                return (jyc) ((p811) obj).a;
            default:
                nia0 nia0Var = (nia0) ((p811) obj).a;
                return nia0Var == null ? nia0.d : nia0Var;
        }
    }

    public /* synthetic */ kuo(Object obj, Serializable serializable, byte b) {
        this.c = b;
        this.d = obj;
        this.e = serializable;
    }
}
