package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zs40 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs40(Set set, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = set;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Set set = this.c;
        switch (b) {
            case 0:
                zs40 zs40Var = new zs40(set, lnmVar, (byte) 0);
                zs40Var.b = obj;
                return zs40Var;
            default:
                zs40 zs40Var2 = new zs40(set, lnmVar, (byte) 1);
                zs40Var2.b = obj;
                return zs40Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Set set = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                cen0 cen0Var = (cen0) this.b;
                Set set2 = (Set) cen0Var.a.get(at40.g);
                if (set2 != null) {
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj2 : set2) {
                        if (!set.contains((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        cen0 cen0VarB = cen0Var.b();
                        cen0VarB.a(at40.g, dm61.v0(set2, arrayList));
                        for (String str : arrayList) {
                            ys40 ys40Var = at40.d;
                            mma0[] mma0VarArr = ys40.a;
                            ys40Var.getClass();
                            mnv0 mnv0VarH = rc2.H("provider:" + str);
                            if (cen0VarB.b.get()) {
                                eg.m("Do mutate preferences once returned to DataStore.");
                                return null;
                            }
                            cen0VarB.a.remove(mnv0VarH);
                        }
                        return cen0VarB.c();
                    }
                }
                return cen0Var;
            default:
                PlayerState playerState = (PlayerState) this.b;
                hm5.M(obj);
                Set set3 = set;
                int iS = zno1.s(q7h.U(set3, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : set3) {
                    String str2 = (String) obj3;
                    ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                    boolean zJ = u890.j(contextTrack != null ? contextTrack.uri() : null, str2);
                    boolean zJ2 = u890.j(playerState.contextUri(), str2);
                    yrt0 yrt0Var = (!playerState.isPlaying() || playerState.isPaused()) ? yrt0.c : yrt0.a;
                    if (!zJ && !zJ2) {
                        yrt0Var = yrt0.b;
                    }
                    linkedHashMap.put(obj3, yrt0Var);
                }
                return linkedHashMap;
        }
    }
}
