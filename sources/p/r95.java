package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r95 implements y95, Function {
    public final ArrayList a;

    public r95() {
        this.a = new ArrayList();
    }

    public void a(jbh0 jbh0Var, o860 o860Var) {
        this.a.add(new qy8(jbh0Var, o860Var));
    }

    public Object apply(Object obj) {
        s190 s190VarP = ((CollectionPlatformEsperantoContainsResponse) obj).o().p();
        ArrayList arrayList = this.a;
        Map mapT = sqg0.T(o7h.v1(arrayList, s190VarP));
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : arrayList) {
            Boolean bool = (Boolean) mapT.get((String) obj2);
            linkedHashMap.put(obj2, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        }
        return linkedHashMap;
    }

    public fba c0() {
        ArrayList arrayList = this.a;
        return ((sua0) arrayList.get(0)).c() ? new aav0(arrayList) : new z8s0(arrayList);
    }

    public List l0() {
        return this.a;
    }

    public boolean o0() {
        ArrayList arrayList = this.a;
        return arrayList.size() == 1 && ((sua0) arrayList.get(0)).c();
    }
}
