package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate$WrappedPlacesContent$Card2;
import com.spotify.wrapped.v1.proto.SceneTemplate$WrappedPlacesContent$GradientStyle;
import com.spotify.wrapped.v1.proto.SceneTemplate$WrappedPlacesContent$Track;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class odm1 implements a3k {
    public final pe a;
    public final tjs0 b;
    public final gw70 c;
    public final Context d;
    public final cxc e;
    public final idm1 f;
    public final mr20 g;

    public odm1(pe peVar, tjs0 tjs0Var, gw70 gw70Var, Context context, cxc cxcVar, idm1 idm1Var) {
        this.a = peVar;
        this.b = tjs0Var;
        this.c = gw70Var;
        this.d = context;
        this.e = cxcVar;
        this.f = idm1Var;
        this.g = rqt0.u(h4p1.f(new nsf1(context, peVar, tjs0Var, (lnm) null, (byte) 23)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.spotify.wrapped.v1.proto.SceneTemplate$WrappedPlacesContent$Card2, java.lang.String, p.g7m1] */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(g7m1 g7m1Var, lnm lnmVar) {
        jdm1 jdm1Var;
        boolean zV;
        String str;
        g7m1 g7m1Var2;
        SceneTemplate$WrappedPlacesContent$Card2 sceneTemplate$WrappedPlacesContent$Card2;
        int i;
        int i2;
        qdm1 qdm1Var;
        qdm1 qdm1VarD;
        Object obj;
        qem1 qem1Var;
        cdm1 cdm1Var;
        cdm1 cdm1Var2;
        cdm1 cdm1Var3;
        if (lnmVar instanceof jdm1) {
            jdm1Var = (jdm1) lnmVar;
            int i3 = jdm1Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jdm1Var.i = i3 - Integer.MIN_VALUE;
            } else {
                jdm1Var = new jdm1(this, (onm) lnmVar);
            }
        } else {
            jdm1Var = new jdm1(this, (onm) lnmVar);
        }
        jdm1 jdm1Var2 = jdm1Var;
        Object objA = jdm1Var2.g;
        int i4 = jdm1Var2.i;
        d9n d9nVar = d9n.a;
        if (i4 != 0) {
            if (i4 == 1) {
                int i5 = jdm1Var2.e;
                zV = jdm1Var2.f;
                int i6 = jdm1Var2.d;
                str = jdm1Var2.c;
                SceneTemplate$WrappedPlacesContent$Card2 sceneTemplate$WrappedPlacesContent$Card3 = jdm1Var2.b;
                g7m1 g7m1Var3 = jdm1Var2.a;
                hm5.M(objA);
                i = i5;
                sceneTemplate$WrappedPlacesContent$Card2 = sceneTemplate$WrappedPlacesContent$Card3;
                i2 = i6;
                g7m1Var2 = g7m1Var3;
            } else {
                if (i4 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            return (wj41) objA;
        }
        hm5.M(objA);
        SceneTemplate$WrappedPlacesContent$Card2 sceneTemplate$WrappedPlacesContent$Card2N = g7m1Var.a.q().N();
        zV = pwo1.v(this.a, this.b);
        int i7 = (zV && sceneTemplate$WrappedPlacesContent$Card2N.D()) ? 1 : 0;
        String url = sceneTemplate$WrappedPlacesContent$Card2N.B().getUrl();
        str = ihc1.y0(url) ? null : url;
        if (ihc1.y0(sceneTemplate$WrappedPlacesContent$Card2N.B().o())) {
            hhg1.n("Places panorama requires a thumbnail url");
            return null;
        }
        bju bjuVar = g7m1Var.b;
        ob01 ob01Var = new ob01(sceneTemplate$WrappedPlacesContent$Card2N, this, (lnm) null, (byte) 24);
        jdm1Var2.a = g7m1Var;
        jdm1Var2.b = sceneTemplate$WrappedPlacesContent$Card2N;
        jdm1Var2.c = str;
        jdm1Var2.d = 0;
        jdm1Var2.f = zV;
        jdm1Var2.e = i7;
        jdm1Var2.i = 1;
        Object objC = bjuVar.c("panorama_thumbnail", ob01Var, jdm1Var2);
        if (objC == d9nVar) {
            return d9nVar;
        }
        g7m1Var2 = g7m1Var;
        sceneTemplate$WrappedPlacesContent$Card2 = sceneTemplate$WrappedPlacesContent$Card2N;
        i = i7;
        objA = objC;
        i2 = 0;
        Bitmap bitmap = (Bitmap) objA;
        kdm1 kdm1Var = new kdm1(sceneTemplate$WrappedPlacesContent$Card2, (byte) 1);
        kdm1 kdm1Var2 = new kdm1(sceneTemplate$WrappedPlacesContent$Card2, (byte) 2);
        kdm1 kdm1Var3 = i != 0 ? new kdm1(sceneTemplate$WrappedPlacesContent$Card2, (byte) 3) : null;
        kdm1 kdm1Var4 = new kdm1(sceneTemplate$WrappedPlacesContent$Card2, (byte) 4);
        SceneTemplate$WrappedPlacesContent$GradientStyle sceneTemplate$WrappedPlacesContent$GradientStyleY = sceneTemplate$WrappedPlacesContent$Card2.y();
        if (!sceneTemplate$WrappedPlacesContent$Card2.E()) {
            sceneTemplate$WrappedPlacesContent$GradientStyleY = null;
        }
        ddm1 ddm1VarA = qon1.A(sceneTemplate$WrappedPlacesContent$GradientStyleY, sceneTemplate$WrappedPlacesContent$Card2.t());
        SceneTemplate$WrappedPlacesContent$GradientStyle sceneTemplate$WrappedPlacesContent$GradientStyleN = sceneTemplate$WrappedPlacesContent$Card2.n();
        if (!sceneTemplate$WrappedPlacesContent$Card2.C()) {
            sceneTemplate$WrappedPlacesContent$GradientStyleN = null;
        }
        ddm1 ddm1VarA2 = qon1.A(sceneTemplate$WrappedPlacesContent$GradientStyleN, sceneTemplate$WrappedPlacesContent$Card2.t());
        String manifestId = sceneTemplate$WrappedPlacesContent$Card2.B().getManifestId();
        String url2 = sceneTemplate$WrappedPlacesContent$Card2.B().getUrl();
        SceneTemplate$WrappedPlacesContent$Track sceneTemplate$WrappedPlacesContent$TrackZ = sceneTemplate$WrappedPlacesContent$Card2.z();
        if (!sceneTemplate$WrappedPlacesContent$Card2.F()) {
            sceneTemplate$WrappedPlacesContent$TrackZ = null;
        }
        if (sceneTemplate$WrappedPlacesContent$TrackZ != null) {
            qdm1Var = null;
            qdm1VarD = d(sceneTemplate$WrappedPlacesContent$TrackZ, aof1.a, gem1.a);
        } else {
            qdm1Var = null;
            qdm1VarD = null;
        }
        SceneTemplate$WrappedPlacesContent$Track sceneTemplate$WrappedPlacesContent$TrackA = sceneTemplate$WrappedPlacesContent$Card2.A();
        if (!sceneTemplate$WrappedPlacesContent$Card2.G()) {
            sceneTemplate$WrappedPlacesContent$TrackA = qdm1Var;
        }
        qdm1 qdm1VarD2 = sceneTemplate$WrappedPlacesContent$TrackA != null ? d(sceneTemplate$WrappedPlacesContent$TrackA, aof1.b, gem1.b) : qdm1Var;
        String strS = sceneTemplate$WrappedPlacesContent$Card2.s();
        String strV = sceneTemplate$WrappedPlacesContent$Card2.v();
        String strU = ror0.a(sceneTemplate$WrappedPlacesContent$Card2.u()).u();
        String strU2 = ror0.a(sceneTemplate$WrappedPlacesContent$Card2.w()).u();
        if (strU2 == null || ihc1.y0(strU2)) {
            obj = strU2;
            obj = qdm1Var;
        }
        rdm1 rdm1Var = new rdm1(kdm1Var, kdm1Var2, kdm1Var3, kdm1Var4, ddm1VarA, ddm1VarA2, manifestId, url2, bitmap, qdm1VarD, qdm1VarD2, strS, strV, strU, obj != null ? new kdm1(sceneTemplate$WrappedPlacesContent$Card2, (byte) 0) : qdm1Var);
        qdm1 qdm1Var2 = qdm1VarD;
        qdm1 qdm1Var3 = qdm1VarD2;
        Context context = this.d;
        if (str != null) {
            try {
                Uri uri = Uri.parse(str);
                uri.getClass();
                qem1Var = new qem1(context, this.e, uri);
            } catch (Exception unused) {
                k220.f("Error parsing uri: ".concat(str));
                return qdm1Var;
            }
        } else {
            qem1Var = qdm1Var;
        }
        if (qdm1Var2 != null) {
            cdm1Var3 = qdm1Var2.e;
        } else {
            cdm1Var = qdm1Var;
        }
        if (qdm1Var3 != null) {
            cdm1Var = cdm1Var3;
            cdm1Var2 = qdm1Var3.e;
        } else {
            cdm1Var = cdm1Var3;
            cdm1Var2 = qdm1Var;
        }
        List listI0 = f46.i0(new cdm1[]{cdm1Var, cdm1Var2});
        ela elaVar = new ela(rdm1Var, zV, this, qem1Var, (qem1Var == 0 && listI0.isEmpty()) ? qdm1Var : new ycm1(context, qem1Var, listI0, !zV), g7m1Var2, (lnm) null);
        ?? r1 = qdm1Var;
        jdm1Var2.a = r1;
        jdm1Var2.b = r1;
        jdm1Var2.c = r1;
        jdm1Var2.d = i2;
        jdm1Var2.f = zV;
        jdm1Var2.e = i;
        jdm1Var2.i = 2;
        objA = u3k.a.a(elaVar, jdm1Var2);
        if (objA == d9nVar) {
            return d9nVar;
        }
        return (wj41) objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, ob01 ob01Var, onm onmVar) {
        ldm1 ldm1Var;
        if (onmVar instanceof ldm1) {
            ldm1Var = (ldm1) onmVar;
            int i = ldm1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ldm1Var.d = i - Integer.MIN_VALUE;
            } else {
                ldm1Var = new ldm1(this, onmVar);
            }
        } else {
            ldm1Var = new ldm1(this, onmVar);
        }
        Object obj = ldm1Var.b;
        int i2 = ldm1Var.d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = ldm1Var.a;
                hm5.M(obj);
                return obj;
            }
            hm5.M(obj);
            ldm1Var.a = str;
            ldm1Var.d = 1;
            Object objInvoke = ob01Var.invoke(ldm1Var);
            d9n d9nVar = d9n.a;
            return objInvoke == d9nVar ? d9nVar : objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, str, new Object[0]);
            return null;
        }
    }

    public final qdm1 d(SceneTemplate$WrappedPlacesContent$Track sceneTemplate$WrappedPlacesContent$Track, aof1 aof1Var, long j) {
        String host;
        Uri uri = Uri.parse(sceneTemplate$WrappedPlacesContent$Track.q());
        if ((!nhc1.S(uri.getScheme(), "http", true) && !nhc1.S(uri.getScheme(), "https", true)) || (host = uri.getHost()) == null || ihc1.y0(host)) {
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        Image imageP = sceneTemplate$WrappedPlacesContent$Track.p();
        return new qdm1(new mdm1(sceneTemplate$WrappedPlacesContent$Track, (byte) 0), new mdm1(sceneTemplate$WrappedPlacesContent$Track, (byte) 1), sceneTemplate$WrappedPlacesContent$Track.getUri(), new ndm1(!ihc1.y0(imageP.getUrl()) ? imageP : null, this, aof1Var, null, (byte) 0), new cdm1(aof1Var, j, uri));
    }
}
