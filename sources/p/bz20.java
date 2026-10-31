package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class bz20 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bz20(int i, Collection collection) {
        this.a = (byte) 4;
        this.b = i;
        this.c = collection;
    }

    public final Object invoke(Object obj) {
        boolean zN1;
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i2 = 0;
        Object obj2 = this.c;
        int i3 = this.b;
        switch (b) {
            case 0:
                zN1 = ((d030) obj).N1(i3);
                ((p811) obj2).a = Boolean.valueOf(zN1);
                break;
            case 1:
                rsb0 rsb0Var = (rsb0) obj;
                j5s j5sVar = ((upb0) obj2).a;
                jv91 jv91VarO = ekb.o();
                ekb.C(jv91VarO, ekb.u(jv91VarO), jv91VarO != null ? jv91VarO.e() : null);
                j5sVar.getClass();
                int i4 = rsb0Var.a;
                i = i4 != -1 ? i4 : 2;
                while (i2 < i) {
                    rsb0Var.a(i3 + i2);
                    i2++;
                }
                return rih1Var;
            case 2:
                rsb0 rsb0Var2 = (rsb0) obj;
                l5s l5sVar = ((xtb0) obj2).a;
                jv91 jv91VarO2 = ekb.o();
                ekb.C(jv91VarO2, ekb.u(jv91VarO2), jv91VarO2 != null ? jv91VarO2.e() : null);
                l5sVar.getClass();
                int i5 = rsb0Var2.a;
                i = i5 != -1 ? i5 : 2;
                while (i2 < i) {
                    rsb0Var2.a(i3 + i2);
                    i2++;
                }
                return rih1Var;
            case 3:
                ArrayList arrayList = (ArrayList) obj2;
                p5t0 p5t0Var = (p5t0) obj;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    q5t0 q5t0Var = (q5t0) arrayList.get(i6);
                    p5t0.l(0, (i3 - q5t0Var.b) / 2, p5t0Var, q5t0Var);
                }
                return rih1Var;
            default:
                zN1 = ((List) obj).addAll(i3, (Collection) obj2);
                break;
        }
        return Boolean.valueOf(zN1);
    }

    public /* synthetic */ bz20(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
