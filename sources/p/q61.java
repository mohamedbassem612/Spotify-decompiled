package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q61 extends hab0 implements vu30 {
    public final /* synthetic */ LinkedHashMap a;
    public final /* synthetic */ List b;
    public final /* synthetic */ yae1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ lee1 i;
    public final /* synthetic */ Map t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q61(LinkedHashMap linkedHashMap, ArrayList arrayList, yae1 yae1Var, String str, int i, boolean z, int i2, long j, lee1 lee1Var, Map map) {
        super(2);
        this.a = linkedHashMap;
        this.b = arrayList;
        this.c = yae1Var;
        this.d = str;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = j;
        this.i = lee1Var;
        this.t = map;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        m61 m61Var = new m61(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        LinkedHashMap linkedHashMap = this.a;
        Object objA = linkedHashMap.get(m61Var);
        yae1 yae1Var = this.c;
        long j2 = this.h;
        lee1 lee1Var = this.i;
        Map map = this.t;
        if (objA == null) {
            j = j2;
            objA = yae1.a(yae1Var, this.d, r61.c(lee1Var, map, m61Var), this.e, this.f, this.g, j, (flb0) null, (xat) null, 960);
            linkedHashMap.put(m61Var, objA);
        } else {
            j = j2;
        }
        return Boolean.valueOf((((y9e1) objA).d() || r61.b(this.b, lee1Var, map, yae1Var, j, m61Var)) ? false : true);
    }
}
