package p;

import android.net.Uri;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z4c extends a8d1 implements vu30 {
    public String a;
    public trc0 b;
    public int c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a5c f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Set i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4c(a5c a5cVar, int i, boolean z, Set set, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.f = a5cVar;
        this.g = i;
        this.h = z;
        this.i = set;
        this.t = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        z4c z4cVar = new z4c(this.f, this.g, this.h, this.i, this.t, lnmVar);
        z4cVar.e = obj;
        return z4cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0161 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        Object objF;
        String str;
        trc0 trc0Var;
        trc0 trc0Var2;
        int i;
        Object objN;
        c9n c9nVar = (c9n) this.e;
        byte b = this.d;
        a5c a5cVar = this.f;
        int i2 = 1;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                trc0Var = this.b;
                str = this.a;
                hm5.M(obj);
                objF = obj;
            } else {
                if (b != 2) {
                    if (b == 3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.c;
                trc0 trc0Var3 = this.b;
                String str2 = this.a;
                hm5.M(obj);
                trc0Var2 = trc0Var3;
                str = str2;
            }
            s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new el0(a5cVar, str, trc0Var2, this.i, this.t, (lnm) null, (byte) 12), 3);
            long j = a5c.m;
            w4c w4cVar = new w4c(s2tVarQ, (lnm) null, (byte) 0);
            this.e = null;
            this.a = null;
            this.b = null;
            this.c = i;
            this.d = (byte) 3;
            objN = rc2.N(j, w4cVar, this);
            if (objN != d9nVar) {
                return d9nVar;
            }
            return objN;
        }
        hm5.M(obj);
        String queryParameter = Uri.parse(a5cVar.d).getQueryParameter("playlist");
        if (queryParameter == null) {
            queryParameter = "";
        }
        Set set = s4b1.f;
        String strConcat = "spotify:list:assisted-curation-tracks:".concat(uic.x(queryParameter).h());
        iqz0 iqz0Var = new iqz0(0, this.g);
        xj61 xj61Var = new xj61();
        xj61Var.add(sqc0.a);
        xj61Var.add(xqc0.a);
        if (!this.h) {
            xj61Var.add(yqc0.a);
        }
        xj61 xj61VarJ = cwl1.j(xj61Var);
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        sku0VarP.t();
        hru0VarS.x(sku0VarP);
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        hru0VarS.v(iou0VarV);
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setPlayable(true));
        hru0VarS.z(vwu0VarR);
        trc0 trc0Var4 = new trc0(hru0VarS.build(), (g3d0) null, xj61VarJ, false, (src0) null, iqz0Var, (prc0) null, 0, (List) null, 474);
        rsc0 rsc0Var = a5cVar.f;
        this.e = c9nVar;
        this.a = strConcat;
        this.b = trc0Var4;
        this.d = (byte) 1;
        objF = rsc0Var.f(strConcat, trc0Var4, this);
        if (objF != d9nVar) {
            str = strConcat;
            trc0Var = trc0Var4;
        }
        return d9nVar;
        wsc0 wsc0Var = (wsc0) ((py21) objF).d();
        List list = wsc0Var.f.z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    i2 = 0;
                    break;
                }
            } while (!u890.j(((ll81) it.next()).a, "reload"));
        } else {
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            return wsc0Var;
        }
        xyc0 xyc0Var = a5cVar.g;
        this.e = c9nVar;
        this.a = str;
        this.b = trc0Var;
        this.c = i2;
        this.d = (byte) 2;
        if (xyc0Var.u(str, ddd1.d1, this) != d9nVar) {
            trc0Var2 = trc0Var;
            i = i2;
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new el0(a5cVar, str, trc0Var2, this.i, this.t, (lnm) null, (byte) 12), 3);
            long j2 = a5c.m;
            w4c w4cVar2 = new w4c(s2tVarQ2, (lnm) null, (byte) 0);
            this.e = null;
            this.a = null;
            this.b = null;
            this.c = i;
            this.d = (byte) 3;
            objN = rc2.N(j2, w4cVar2, this);
            if (objN != d9nVar) {
                return objN;
            }
        }
        return d9nVar;
    }
}
