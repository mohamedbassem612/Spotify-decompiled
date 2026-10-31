package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.app.music.scaffolds.events.proto.SavedStateSizeTelemetry;
import com.spotify.base.java.logging.Logger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ve41 {
    public static final List f = p7h.M(new String[]{"androidx.lifecycle.BundlableSavedStateRegistry.key", "android:support:fragments"});
    public final List a;
    public final Function0 b;
    public final dr91 c;
    public final dqz0 d;
    public boolean e;

    public ve41(b5b1 b5b1Var, dr91 dr91Var) {
        cqz0 cqz0Var = dqz0.a;
        this.a = f;
        this.b = b5b1Var;
        this.c = dr91Var;
        this.d = cqz0Var;
    }

    public static Map a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (bundle2 == null) {
            return b7x.a;
        }
        Set<String> setKeySet = bundle2.keySet();
        int iS = zno1.s(q7h.U(setKeySet, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : setKeySet) {
            Object obj2 = bundle2.get((String) obj);
            int iU = 0;
            if (obj2 != null && (obj2 instanceof Bundle)) {
                iU = nho1.u((Parcelable) obj2);
            }
            linkedHashMap.put(obj, Integer.valueOf(iU));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    public static String b(LinkedHashMap linkedHashMap) {
        return o7h.y0(o7h.a1(linkedHashMap.entrySet(), new be21((byte) 2)), (CharSequence) null, (String) null, (String) null, o641.V0, 31);
    }

    public static LinkedHashMap c(Bundle bundle) {
        Set<String> setKeySet = bundle.keySet();
        int iS = zno1.s(q7h.U(setKeySet, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : setKeySet) {
            Object obj2 = bundle.get((String) obj);
            int iU = 0;
            if (obj2 != null && (obj2 instanceof Bundle)) {
                iU = nho1.u((Parcelable) obj2);
            }
            linkedHashMap.put(obj, Integer.valueOf(iU));
        }
        return linkedHashMap;
    }

    public final void d(int i, LinkedHashMap linkedHashMap, Bundle bundle, String str) {
        Map mapA = a(bundle);
        se41 se41VarP = SavedStateSizeTelemetry.p();
        se41VarP.t(i);
        se41VarP.s(str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), Long.valueOf(((Number) entry.getValue()).intValue()));
        }
        se41VarP.q(linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(zno1.s(mapA.size()));
        for (Map.Entry entry2 : mapA.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), Long.valueOf(((Number) entry2.getValue()).intValue()));
        }
        se41VarP.n(linkedHashMap3);
        se41VarP.r((String) this.b.invoke());
        SavedStateSizeTelemetry savedStateSizeTelemetry = (SavedStateSizeTelemetry) se41VarP.build();
        savedStateSizeTelemetry.getClass();
        this.c.invoke(savedStateSizeTelemetry);
    }

    public final void e(Bundle bundle) {
        int iU = nho1.u(bundle);
        if (iU > 204800 && !this.e) {
            this.e = true;
            LinkedHashMap linkedHashMapC = c(bundle);
            String strB = b(linkedHashMapC);
            String strY0 = o7h.y0(o7h.a1(a(bundle).entrySet(), new be21((byte) 1)), (CharSequence) null, (String) null, (String) null, o641.U0, 31);
            String str = (String) this.b.invoke();
            String strF = strY0.length() > 0 ? f4i1.f(", registry=[", strY0, "]") : "";
            String strF2 = str.length() > 0 ? f4i1.f(", nav=[", str, "]") : "";
            StringBuilder sb = new StringBuilder("total=");
            sb.append(iU);
            sb.append("b, keys=[");
            sb.append(strB);
            sb.append("]");
            String strN = l1d.n(strF, strF2, sb);
            if (this.d.g(100) < 1) {
                d(iU, linkedHashMapC, bundle, "REPORTING");
            }
            Logger.k("SavedStateTrimmer: SavedState exceeds reporting threshold: ".concat(strN), new Object[0]);
        }
        if (iU <= 409600) {
            return;
        }
        LinkedHashMap linkedHashMapC2 = c(bundle);
        Logger.d(ab80.n("SavedStateTrimmer: Saved instance state too large (", " bytes, limit 409600). Key sizes: ", iU, b(linkedHashMapC2)), new Object[0]);
        d(iU, linkedHashMapC2, bundle, "TRIMMING");
        for (String str2 : this.a) {
            if (iU <= 409600) {
                return;
            }
            Integer num = (Integer) linkedHashMapC2.get(str2);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 0) {
                bundle.remove(str2);
                iU -= iIntValue;
                Logger.d(gvg.j(l1d.s(iIntValue, "SavedStateTrimmer: Trimmed saved state key '", str2, "' (", " bytes), remaining: "), iU, " bytes"), new Object[0]);
            }
        }
    }
}
