package p;

import com.spotify.yourupdates.domain.models.FetchMode;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v2n1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2n1(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = false;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                wro0 wro0Var = (wro0) obj;
                String strM = upn1.m();
                r2n1 r2n1Var = ((w2n1) obj3).c;
                hbe0 hbe0Var = new hbe0(FetchMode.INITIAL);
                List listSingletonList = Collections.singletonList(wro0Var);
                List list = wro0Var.a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((kjo0) it.next()).f) {
                            z = true;
                        }
                    }
                }
                return new g2n1(strM, r2n1Var, hbe0Var, listSingletonList, z, false, false, z6x.a);
            default:
                l3n1 l3n1Var = (l3n1) obj2;
                m3n1 m3n1Var = (m3n1) obj3;
                klm klmVar = ((wn41) obj).a;
                return p7h.M(new go80[]{klmVar.a("BluetoothDaemon", new rap0(new qdp0(m3n1Var, (byte) 0), new mdp0(0, m3n1Var.i, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), (byte) 3)), klmVar.a("AnrWatchdogDaemon", new iyo0(new zap0(l3n1Var, (byte) 2), new mdp0(0, m3n1Var.j, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), new zap0(l3n1Var, (byte) 3), (byte) 5))});
        }
    }
}
