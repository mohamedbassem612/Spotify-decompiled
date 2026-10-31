package p;

import com.google.protobuf.Empty;
import com.spotify.offline_esperanto.proto.EsOffline$SetOfflinePlaybackAllowedRequest;
import com.spotify.offline_esperanto.proto.EsOffline$SetOfflinePlaybackAllowedResponse;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bup0 extends ov61 {
    public static final long c;
    public final vpp0 a;
    public final lt20 b;

    static {
        ytw0 ytw0Var = jfv.b;
        c = fdg1.k0(1, ngv.e);
    }

    public bup0(vpp0 vpp0Var) {
        this.a = vpp0Var;
        this.b = new lt20(new tu41(new uop0(yoi1.g(vpp0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeOfflinePlaybackStatus", Empty.n()).map(cj20.T0)), (byte) 2), (byte) 9), new q8t0(3, (lnm) null, (byte) 13), (byte) 0);
    }

    public final mr20 getValue() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, tv80 tv80Var, lnm lnmVar) {
        ztp0 ztp0Var;
        boolean z2;
        jt61 jt61Var;
        if (lnmVar instanceof ztp0) {
            ztp0Var = (ztp0) lnmVar;
            int i = ztp0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ztp0Var.e = i - Integer.MIN_VALUE;
            } else {
                ztp0Var = new ztp0(this, (onm) lnmVar);
            }
        } else {
            ztp0Var = new ztp0(this, (onm) lnmVar);
        }
        Object objJ = ztp0Var.c;
        int i2 = ztp0Var.e;
        boolean zBooleanValue = false;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            hpz hpzVarN = EsOffline$SetOfflinePlaybackAllowedRequest.n();
            hpzVarN.n(z);
            Single map = this.a.callSingle("spotify.offline_esperanto.proto.Offline", "SetOfflinePlaybackAllowed", (EsOffline$SetOfflinePlaybackAllowedRequest) hpzVarN.build()).map(ud20.T0);
            ztp0Var.a = bool;
            ztp0Var.b = z;
            ztp0Var.e = 1;
            objJ = fc11.j(map, ztp0Var);
            if (objJ != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z = ztp0Var.b;
            bool = ztp0Var.a;
            hm5.M(objJ);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = ztp0Var.b;
            bool = ztp0Var.a;
            hm5.M(objJ);
        }
        jt61Var = (jt61) objJ;
        if (jt61Var == null) {
            return jt61Var;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (z2) {
            zBooleanValue = true;
        }
        return new it61(Boolean.valueOf(zBooleanValue));
        boolean z3 = z;
        if (!((EsOffline$SetOfflinePlaybackAllowedResponse) objJ).n()) {
            return new ht61((Integer) null, 0);
        }
        hl0 hl0Var = new hl0(this, z3, new n811(), (lnm) null, (byte) 17);
        ztp0Var.a = bool;
        ztp0Var.b = z3;
        ztp0Var.e = 2;
        objJ = rc2.P(c, hl0Var, ztp0Var);
        if (objJ != d9nVar) {
            z2 = z3;
            jt61Var = (jt61) objJ;
            if (jt61Var == null) {
                return jt61Var;
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else if (z2) {
                zBooleanValue = true;
            }
            return new it61(Boolean.valueOf(zBooleanValue));
        }
        return d9nVar;
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), tv80Var, lnmVar);
    }
}
