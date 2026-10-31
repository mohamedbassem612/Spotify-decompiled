package p;

import io.reactivex.rxjava3.functions.BiFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l141 implements BiFunction {
    public final List a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    public l141(xgy0 xgy0Var) throws UninitializedMessageException {
        List list = xgy0Var.c;
        if ((xgy0Var.b & 1) == 1) {
            int i = xgy0Var.d;
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                rgy0 rgy0VarG = (rgy0) obj;
                if (i2 >= i) {
                    rgy0VarG.getClass();
                    qgy0 qgy0VarP = rgy0.p(rgy0VarG);
                    qgy0VarP.d |= 2;
                    qgy0VarP.f = true;
                    rgy0VarG = qgy0VarP.g();
                    if (!rgy0VarG.isInitialized()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(rgy0VarG);
                i2 = i3;
            }
            list = arrayList;
        }
        this.a = list;
    }

    public rgy0 a(int i) {
        return (rgy0) this.a.get(i);
    }

    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj2;
        t9n[] t9nVarArr = ((mbn) obj).a;
        int length = t9nVarArr.length;
        List list = this.a;
        if (length != list.size()) {
            hhg1.n("Failed requirement.");
            return null;
        }
        if (map.size() != list.size()) {
            hhg1.n("Failed requirement.");
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i = 0;
        for (Object obj3 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            String str = (String) obj3;
            t9n t9nVar = t9nVarArr[i];
            Object obj4 = map.get(str);
            if (obj4 == null) {
                eg.m("Required value was null.");
                return null;
            }
            f7h f7hVar = (f7h) obj4;
            arrayList.add(new i430(t9nVar.a, t9nVar.b, str, f7hVar.a, f7hVar.b));
            i = i2;
        }
        return arrayList;
    }

    public ArrayList b(qxc0 qxc0Var) {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((tha1) obj).e(qxc0Var)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
