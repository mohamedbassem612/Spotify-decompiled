package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class eaf1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (r13 == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.spotify.wrapped.v1.proto.SceneTemplate.TopFive r8, p.gw70 r9, p.pe r10, p.tjs0 r11, p.bju r12, p.onm r13) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eaf1.a(com.spotify.wrapped.v1.proto.SceneTemplate$TopFive, p.gw70, p.pe, p.tjs0, p.bju, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(SceneTemplate.TopFive topFive, gw70 gw70Var, bju bjuVar, onm onmVar) {
        v9f1 v9f1Var;
        if (onmVar instanceof v9f1) {
            v9f1Var = (v9f1) onmVar;
            int i = v9f1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9f1Var.c = i - Integer.MIN_VALUE;
            } else {
                v9f1Var = new v9f1(onmVar);
            }
        } else {
            v9f1Var = new v9f1(onmVar);
        }
        Object objS = v9f1Var.b;
        int i2 = v9f1Var.c;
        if (i2 == 0) {
            hm5.M(objS);
            u9f1 u9f1Var = new u9f1(topFive.q(), null, bjuVar, gw70Var, (byte) 0);
            v9f1Var.a = topFive;
            v9f1Var.c = 1;
            objS = smo1.s(u9f1Var, v9f1Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            topFive = v9f1Var.a;
            hm5.M(objS);
        }
        return new h9f1(new w9f1(topFive, (byte) 0), (List) objS);
    }
}
