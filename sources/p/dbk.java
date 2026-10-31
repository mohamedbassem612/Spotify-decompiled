package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dbk implements mj00 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public dbk(Context context, o241 o241Var, frp0 frp0Var) {
        this.a = (byte) 1;
        this.b = context;
        this.c = o241Var;
    }

    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (((xrk) ((kp00) obj).c).b()) {
                    ji50Var.b.put(n6k.class, new r3r(new wzq(fdg1.m0(((mmr) ((kly0) obj2).get()).a(ji50Var.a), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), xj.V0), v30.X, (vu30) null));
                }
                break;
            case 1:
                nso0 nso0Var = new nso0(this, (byte) 8);
                k8b0 k8b0Var = k8b0.Z0;
                ibi0 ibi0Var = ibi0.g;
                ji50Var.b.put(erp0.class, new vw21(k8b0Var, b7x.a, new fc3(nso0Var, (byte) 5), ibi0Var, (vu30) null));
                break;
            case 2:
                LinkedHashMap linkedHashMap = ji50Var.b;
                u9c u9cVar = (u9c) obj2;
                boolean zC = ((w25) obj).C();
                Map mapSingletonMap = Collections.singletonMap(1, (Set) u9cVar.f);
                ent0 ent0Var = ent0.b;
                if (!zC) {
                    t1t0 t1t0Var = new t1t0(u9cVar, (byte) 7);
                    linkedHashMap.put(dmt0.class, new vw21(ent0Var, mapSingletonMap, new fc3(t1t0Var, (byte) 5), fnt0.c, (vu30) null));
                } else {
                    linkedHashMap.put(dmt0.class, new r3r(u9cVar.i(ji50Var.a), fnt0.b, (vu30) null));
                }
                break;
            default:
                dj71 dj71Var = new dj71(this, (byte) 19);
                dw81 dw81Var = dw81.c;
                ibi0 ibi0Var2 = ibi0.e1;
                ji50Var.b.put(bw81.class, new vw21(dw81Var, b7x.a, new fc3(dj71Var, (byte) 5), ibi0Var2, (vu30) null));
                break;
        }
        return ji50Var;
    }

    public /* synthetic */ dbk(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
