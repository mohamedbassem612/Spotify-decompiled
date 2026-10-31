package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class moy extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xoy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ moy(xoy xoyVar, byte b) {
        super(2);
        this.a = b;
        this.b = xoyVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        xoy xoyVar = this.b;
        switch (b) {
            case 0:
                koy koyVar = (koy) obj;
                loy loyVar = (loy) obj2;
                String str = koyVar.c;
                int i = koyVar.b;
                if (u890.j(koyVar.a, loyVar.a) && i == loyVar.b && u890.j(koyVar.e, loyVar.l)) {
                    return !str.equals(loyVar.m) ? Next.h(loy.a(loyVar, null, null, null, false, false, null, null, null, null, str, 4095)) : Next.j();
                }
                o3r o3rVar = zoy.a;
                loy loyVar2 = new loy(koyVar.a, koyVar.b, "", null, null, false, true, x4m.a, q840.a, ast0.c, null, koyVar.e, str);
                koy koyVar2 = i == 2 ? koyVar : null;
                return Next.i(loyVar2, Collections.singleton(new aoy(koyVar, koyVar2 != null ? xoyVar.f(koyVar2) : null)));
            default:
                koy koyVar3 = (koy) obj;
                loy loyVar3 = (loy) obj2;
                koy koyVar4 = koyVar3.b == 2 ? koyVar3 : null;
                return First.c(loyVar3, Collections.singleton(new aoy(koyVar3, koyVar4 != null ? xoyVar.f(koyVar4) : null)));
        }
    }
}
