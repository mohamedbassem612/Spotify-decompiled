package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class es11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es11(zl5 zl5Var, byte b) {
        super(1);
        this.a = b;
        this.b = zl5Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zl5 zl5Var = this.b;
        switch (b) {
            case 0:
                return new cy6(((uv11) obj).a, ((lik1) zl5Var.h).a);
            case 1:
                String str = (String) obj;
                asn asnVar = (asn) zl5Var.u;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) asnVar.b;
                Object objB = concurrentHashMap.get(str);
                if (objB == null) {
                    objB = gio1.b(ols0.a);
                    ((bbc) asnVar.c).l(str);
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, objB);
                    if (objPutIfAbsent != null) {
                        objB = objPutIfAbsent;
                    }
                }
                return t5p1.j(new p90((zob1) objB, (byte) 9), 3);
            default:
                i0p i0pVar = (i0p) zl5Var.c;
                i0pVar.getClass();
                return l6o1.A(f6o1.A(new kpg0(new ey6((ycm) ((zwg) ((wzn) i0pVar.a.c).a).d, (ymd0) obj), new es11(zl5Var, (byte) 0)), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2));
        }
    }
}
