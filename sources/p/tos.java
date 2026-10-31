package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tos {
    public final kly0 a;
    public final kly0 b;
    public final kly0 c;
    public final iac0 d;

    public tos(r7q r7qVar, r7q r7qVar2, thq thqVar, iac0 iac0Var) {
        this.a = r7qVar;
        this.b = r7qVar2;
        this.c = thqVar;
        this.d = iac0Var;
    }

    public final Object a(String str, p1r p1rVar) {
        rsc0 rsc0Var = (xrc0) this.a.get();
        iqz0 iqz0Var = new iqz0(0, 1);
        Set setSingleton = Collections.singleton(tqc0.a);
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        hru0VarS.v(iou0VarV);
        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
        llu0VarR.s(EpisodeDecorationPolicy.newBuilder().setLink(true));
        hru0VarS.t(llu0VarR);
        return rsc0Var.f(str, new trc0(hru0VarS.build(), (g3d0) null, setSingleton, false, (src0) null, iqz0Var, (prc0) null, 0, (List) null, 474), p1rVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(String str, fi4 fi4Var, boolean z, onm onmVar) {
        ros rosVar;
        String str2;
        if (onmVar instanceof ros) {
            rosVar = (ros) onmVar;
            int i = rosVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rosVar.e = i - Integer.MIN_VALUE;
            } else {
                rosVar = new ros(this, onmVar);
            }
        } else {
            rosVar = new ros(this, onmVar);
        }
        ros rosVar2 = rosVar;
        Object objP = rosVar2.c;
        int i2 = rosVar2.e;
        if (i2 == 0) {
            hm5.M(objP);
            xyc0 xyc0Var = (iyc0) this.b.get();
            String str3 = fi4Var.a;
            rosVar2.a = str;
            rosVar2.b = fi4Var;
            rosVar2.e = 1;
            objP = xyc0Var.p(str, str3, z, false, rosVar2);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fi4Var = rosVar2.b;
            str2 = rosVar2.a;
            hm5.M(objP);
        }
        ly21 ly21Var = (py21) objP;
        if (ly21Var instanceof ly21) {
            Logger.k("Failed to set lens %s on %s: %s", new Object[]{fi4Var.a, str2, ly21Var.a});
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, fi4 fi4Var, onm onmVar) {
        sos sosVar;
        String str2;
        Iterator d7Var;
        fi4 fi4Var2;
        Object obj;
        if (onmVar instanceof sos) {
            sosVar = (sos) onmVar;
            int i = sosVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sosVar.f = i - Integer.MIN_VALUE;
            } else {
                sosVar = new sos(this, onmVar);
            }
        } else {
            sosVar = new sos(this, onmVar);
        }
        Object obj2 = sosVar.d;
        int i2 = sosVar.f;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj2);
            str2 = str;
            d7Var = new d7(fi4.d, (byte) 0);
            fi4Var2 = fi4Var;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d7Var = sosVar.c;
            fi4 fi4Var3 = sosVar.b;
            String str3 = sosVar.a;
            hm5.M(obj2);
            fi4Var2 = fi4Var3;
            str2 = str3;
        }
        while (true) {
            boolean zHasNext = d7Var.hasNext();
            fi4 fi4Var4 = fi4.DISABLED;
            obj = d9n.a;
            if (!zHasNext) {
                if (fi4Var2 != fi4Var4) {
                    sosVar.a = null;
                    sosVar.b = null;
                    sosVar.c = null;
                    sosVar.f = 2;
                    if (b(str2, fi4Var2, true, sosVar) == obj) {
                        break;
                    }
                }
                return rih1Var;
            }
            fi4 fi4Var5 = (fi4) d7Var.next();
            if (fi4Var5 != fi4Var4 && fi4Var5 != fi4Var2) {
                sosVar.a = str2;
                sosVar.b = fi4Var2;
                sosVar.c = d7Var;
                sosVar.f = 1;
                if (b(str2, fi4Var5, false, sosVar) == obj) {
                    break;
                }
            }
        }
        return obj;
    }
}
