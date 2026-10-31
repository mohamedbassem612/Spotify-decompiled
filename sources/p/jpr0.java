package p;

import com.google.protobuf.Duration;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetDetailsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jpr0 implements BiFunction, Function {
    public final Set a;

    public boolean a(Object obj) {
        Set set = this.a;
        if (set != null) {
            return set.contains(obj);
        }
        return true;
    }

    public Object apply(Object obj) {
        hix0 gix0Var;
        ResumptionProgressEsperanto$GetDetailsResponse resumptionProgressEsperanto$GetDetailsResponse = (ResumptionProgressEsperanto$GetDetailsResponse) obj;
        if (resumptionProgressEsperanto$GetDetailsResponse.o() != w831.RESPONSE_RESULT_SUCCESS) {
            Set set = this.a;
            int iS = zno1.s(q7h.U(set, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
            for (Object obj2 : set) {
                linkedHashMap.put(obj2, new hix0(false, 0L));
            }
            return linkedHashMap;
        }
        h290 h290VarN = resumptionProgressEsperanto$GetDetailsResponse.n();
        ArrayList<ResumptionProgressEsperanto.ItemDetails> arrayList = new ArrayList();
        for (Object obj3 : h290VarN) {
            if (((ResumptionProgressEsperanto.ItemDetails) obj3).p() == r831.c) {
                arrayList.add(obj3);
            }
        }
        int iS2 = zno1.s(q7h.U(arrayList, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
        for (ResumptionProgressEsperanto.ItemDetails itemDetails : arrayList) {
            String strO = itemDetails.o();
            Duration duration = itemDetails.n().getDuration();
            long jP = duration.p();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long jO = (((long) duration.o()) / 1000000) + timeUnit.toMillis(jP);
            Duration durationP = itemDetails.n().p();
            long jO2 = (((long) durationP.o()) / 1000000) + timeUnit.toMillis(durationP.p());
            boolean z = itemDetails.q() == y831.STATE_FINISHED;
            int i = b931.a[itemDetails.n().o().ordinal()];
            if (i == 1) {
                gix0Var = new gix0(jO, jO2, z);
            } else if (i != 2) {
                gix0Var = i != 3 ? new hix0(false, 0L) : new hix0(false, jO);
            } else {
                gix0Var = new hix0(true, jO);
            }
            linkedHashMap2.put(strO, gix0Var);
        }
        return linkedHashMap2;
    }

    public jpr0(Set set, nt21 nt21Var) {
        this.a = set;
    }

    public Object apply(Object obj, Object obj2) {
        vw01 vw01Var;
        Map map = (Map) obj;
        bx01 bx01Var = (bx01) obj2;
        Set set = this.a;
        int iS = zno1.s(q7h.U(set, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj3 : set) {
            String str = (String) obj3;
            f7h f7hVar = (f7h) map.get(str);
            if ((f7hVar != null && f7hVar.a) || bx01Var.a.containsKey(str)) {
                vw01Var = vw01.b;
            } else {
                vw01Var = vw01.a;
            }
            linkedHashMap.put(obj3, vw01Var);
        }
        return linkedHashMap;
    }
}
