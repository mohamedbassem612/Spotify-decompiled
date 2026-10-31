package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y3v0 implements Function {
    public final /* synthetic */ byte a;
    public final List b;

    /* JADX WARN: Multi-variable type inference failed */
    public y3v0(dj81 dj81Var, iqf iqfVar, pue1 pue1Var, lym1 lym1Var, mu01 mu01Var, ee2 ee2Var, mu01 mu01Var2, gvd1 gvd1Var, jcd0 jcd0Var, mu01 mu01Var3, thq thqVar, jcd0 jcd0Var2) {
        this.a = (byte) 2;
        thqVar = dj81Var.a() != 1 ? null : thqVar;
        this.b = f46.i0(new oh81[]{thqVar != null ? (xt) thqVar.get() : null, lym1Var, pue1Var, mu01Var, gvd1Var, jcd0Var, mu01Var2, jcd0Var2, iqfVar, ee2Var, mu01Var3});
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    public Object apply(Object obj) {
        String str;
        mq70 mq70Var;
        byte b = this.a;
        List<String> list = this.b;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                List<String> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (String str2 : list2) {
                    i1z i1zVar = (i1z) map.get(str2);
                    arrayList.add(i1zVar != null ? new w2u0(i1zVar) : new v2u0(str2));
                }
                return arrayList;
            default:
                uv00 uv00Var = (uv00) obj;
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : list) {
                    xkk1 xkk1Var = uv00Var.a(xkk1.class, str3).b;
                    if (xkk1Var == null || (mq70Var = xkk1Var.a) == null) {
                        str = null;
                    } else {
                        up70 up70VarA = mq70Var.a(vp70.b);
                        if (up70VarA == null || (str = up70VarA.a.a) == null) {
                            up70 up70VarA2 = mq70Var.a(vp70.c);
                            if (up70VarA2 != null) {
                                str = up70VarA2.a.a;
                            } else {
                                str = null;
                            }
                        }
                    }
                    ft01 ft01Var = str != null ? new ft01(str, str3) : null;
                    if (ft01Var != null) {
                        arrayList2.add(ft01Var);
                    }
                }
                return new gv01(arrayList2, list.size());
        }
    }

    public /* synthetic */ y3v0(List list, byte b) {
        this.a = b;
        this.b = list;
    }
}
