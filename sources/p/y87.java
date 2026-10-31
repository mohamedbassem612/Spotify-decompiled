package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y87 implements b031 {
    public final qdy0 a;
    public final yvd b;
    public final rg7 c;
    public final zx11 d;
    public final sx3 e;
    public final qns0 f;
    public final djo g;

    public y87(qdy0 qdy0Var, yvd yvdVar, o241 o241Var, xvo xvoVar, rg7 rg7Var, zx11 zx11Var, Flowable flowable, ec7 ec7Var, yh2 yh2Var, zr00 zr00Var, ux3 ux3Var, sx3 sx3Var, qns0 qns0Var, djo djoVar) {
        this.a = qdy0Var;
        this.b = yvdVar;
        this.c = rg7Var;
        this.d = zx11Var;
        this.e = sx3Var;
        this.f = qns0Var;
        this.g = djoVar;
    }

    public final void a(Bundle bundle) {
        Iterator it = this.b.e.entrySet().iterator();
        while (it.hasNext()) {
            ((x9a) ((Map.Entry) it.next()).getValue()).i(bundle);
        }
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        LinkedHashMap linkedHashMap = this.b.e;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ((x9a) entry.getValue()).j(bundle);
            linkedHashMap2.put(key, rih1.a);
        }
        return bundle;
    }
}
