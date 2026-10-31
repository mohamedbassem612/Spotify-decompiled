package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fgk0 {
    public final z6k0 a;
    public final xrc0 b;
    public final rxj0 c;
    public final vek0 d;
    public final vwm1 e;
    public final YourLibraryRequest f;
    public final PlaylistRequestDecorationPolicy g;

    public fgk0(z6k0 z6k0Var, xrc0 xrc0Var, rxj0 rxj0Var, vek0 vek0Var, vwm1 vwm1Var) {
        this.a = z6k0Var;
        this.b = xrc0Var;
        this.c = rxj0Var;
        this.d = vek0Var;
        this.e = vwm1Var;
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
        jsm1VarR.q(ksm1.d);
        jsm1VarR.q(ksm1.P0);
        jsm1VarR.q(ksm1.X);
        hvm1VarQ.u(jsm1VarR.build());
        hvm1VarQ.q(true);
        hvm1VarQ.L();
        hvm1VarQ.C(1);
        gvm1VarO.n(hvm1VarQ);
        this.f = gvm1VarO.build();
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        sku0VarP.W();
        hru0VarS.x(sku0VarP);
        this.g = hru0VarS.build();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, onm onmVar) {
        egk0 egk0Var;
        String str2;
        wsc0 wsc0Var;
        Object objB;
        wsc0 wsc0Var2;
        Object obj;
        wd21 wd21Var;
        if (onmVar instanceof egk0) {
            egk0Var = (egk0) onmVar;
            int i = egk0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                egk0Var.e = i - Integer.MIN_VALUE;
            } else {
                egk0Var = new egk0(this, onmVar);
            }
        } else {
            egk0Var = new egk0(this, onmVar);
        }
        Object objI = egk0Var.c;
        int i2 = egk0Var.e;
        rxj0 rxj0Var = this.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            if (!rxj0Var.t) {
                return Boolean.FALSE;
            }
            mr20 mr20VarU = rqt0.u(new lt20(new e6s(this.e.d(this.f), (byte) 4), new i440(3, (lnm) null, (byte) 12), (byte) 0));
            str2 = str;
            egk0Var.a = str2;
            egk0Var.e = 1;
            objI = b5p1.i(mr20VarU, egk0Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            str2 = egk0Var.a;
            hm5.M(objI);
        } else {
            if (i2 == 2) {
                str2 = egk0Var.a;
                hm5.M(objI);
                wsc0Var = (wsc0) ((py21) objI).d();
                if (!wsc0Var.f.j) {
                    return Boolean.FALSE;
                }
                egk0Var.a = null;
                egk0Var.b = wsc0Var;
                egk0Var.e = 3;
                objB = this.d.b(str2, z6x.a, egk0Var);
                if (objB != d9nVar) {
                    wsc0Var2 = wsc0Var;
                    obj = objB;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wsc0Var2 = egk0Var.b;
            hm5.M(objI);
            obj = ((e331) objI).a;
        }
        wd21Var = (wd21) (obj instanceof m231 ? null : obj);
        if (wd21Var == null) {
            return Boolean.FALSE;
        }
        if (wsc0Var2.e.size() - wd21Var.a.size() >= rxj0Var.z) {
            return Boolean.FALSE;
        }
        Map map = wsc0Var2.f.q;
        this.a.getClass();
        return Boolean.parseBoolean((String) map.get("has-custom-transitions")) ? Boolean.FALSE : Boolean.TRUE;
        if (!((Boolean) objI).booleanValue()) {
            return Boolean.FALSE;
        }
        trc0 trc0Var = new trc0(this.g, (g3d0) null, (Set) null, false, ggk0.a, hqz0.a, (prc0) null, 0, (List) null, 462);
        egk0Var.a = str2;
        egk0Var.e = 2;
        objI = this.b.f(str2, trc0Var, egk0Var);
        if (objI != d9nVar) {
            wsc0Var = (wsc0) ((py21) objI).d();
            if (!wsc0Var.f.j) {
                return Boolean.FALSE;
            }
            egk0Var.a = null;
            egk0Var.b = wsc0Var;
            egk0Var.e = 3;
            objB = this.d.b(str2, z6x.a, egk0Var);
            if (objB != d9nVar) {
                wsc0Var2 = wsc0Var;
                obj = objB;
                wd21Var = (wd21) (obj instanceof m231 ? null : obj);
                if (wd21Var == null) {
                    return Boolean.FALSE;
                }
                if (wsc0Var2.e.size() - wd21Var.a.size() >= rxj0Var.z) {
                    return Boolean.FALSE;
                }
                Map map2 = wsc0Var2.f.q;
                this.a.getClass();
                if (Boolean.parseBoolean((String) map2.get("has-custom-transitions"))) {
                }
            }
        }
        return d9nVar;
    }
}
