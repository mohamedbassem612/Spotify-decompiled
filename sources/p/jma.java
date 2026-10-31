package p;

import android.net.Uri;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jma implements pqc, c290, BiFunction, Function, av30, Init {
    public final /* synthetic */ byte a;

    public jma() {
        this.a = (byte) 19;
        f4s0 f4s0Var = f4s0.b;
    }

    public static final boolean b(Request request) {
        Map headers = request.getHeaders();
        if (headers == null || !headers.containsKey("force-request") || !u890.j(headers.get("force-request"), "true")) {
            String uri = request.getUri();
            if (uri == null) {
                eg.m("Required value was null.");
                return false;
            }
            if (!nhc1.Y(uri, "sp://esperanto/spotify.connectivity.auth.client_token.esperanto.proto.ClientTokenProvider/getToken", false) && !nhc1.Y(uri, "sp://esperanto/spotify.authentication.login5esperanto.Login5/", false)) {
                return true;
            }
        }
        return false;
    }

    public static final String c(String str, String str2, String str3, xge0 xge0Var) {
        bma1 bma1Var = t6b1.t;
        oi oiVar = ((wge0) xge0Var).a;
        l420 l420VarK = oiVar.k(str);
        l420 l420VarO = oiVar.o(str.substring(0, str.length() - str2.length()), str3);
        l420 l420VarA = l420VarO.a();
        l420VarA.getClass();
        if (l420VarA.b.exists() ? true : l420VarA.mkdirs()) {
            if (l420VarK.renameTo(new File(l420VarO.b.getPath()))) {
                return l420VarO.toString();
            }
            n57.e("Could not move cache location from " + str + " to " + l420VarO);
        }
        return str;
    }

    public static qdd1 e(int i, int i2) {
        return new qdd1(i, i2, 0, dw81.Y);
    }

    public static String f(String str) {
        Set set = s4b1.f;
        String strZ = uic.x("spotify:internal:ai-playlist:report-a-problem:".concat(str)).z();
        if (strZ != null) {
            return strZ;
        }
        eg.m("Required value was null.");
        return null;
    }

    public static o3r g(jma jmaVar, boolean z, boolean z2, String str, boolean z3, int i) {
        String str2 = (i & 16) != 0 ? null : str;
        boolean z4 = (i & 32) != 0 ? false : z3;
        smc0 smc0VarN = k4p1.n();
        jd11 jd11Var = rc11.a;
        smc0VarN.add(new l4r(new xv00(jd11Var.b(jo70.class)), !z4 ? 2 : 1, iwf1.N0, new j4r(iwf1.h), iwf1.O0));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(hll.class)), !z4 ? 2 : 1, iwf1.P0, new j4r(iwf1.i), iwf1.Q0));
        if (z) {
            smc0VarN.add(new l4r(new xv00(jd11Var.b(xkk1.class)), 2, iwf1.Y, new j4r(iwf1.t), iwf1.Z));
        }
        return new o3r(k4p1.k(smc0VarN), new k3u0(0L, str2, z2), false);
    }

    public static qdd1 h() {
        return new qdd1(0, 0, 2, d6d1.U0);
    }

    public static int j(PlayabilityRestriction playabilityRestriction) {
        int i = luz.a[playabilityRestriction.ordinal()];
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5) {
                        i2 = 6;
                        if (i != 6) {
                            return 1;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public String a(n3r n3rVar) {
        String str = n3rVar.h;
        if (str != null) {
            return str;
        }
        Uri uri = n3rVar.a;
        String path = uri.getPath();
        return (path == null || path.length() == 0) ? uri.toString() : path;
    }

    public Object apply(Object obj, Object obj2) {
        gk40 gk40Var = (gk40) obj;
        r560 r560Var = (r560) obj2;
        fk40 fk40Var = fk40.a;
        boolean zEquals = gk40Var.equals(fk40Var);
        r560 r560Var2 = r560.a;
        if (!zEquals && r560Var == r560Var2) {
            return fbl.c;
        }
        if (gk40Var.equals(fk40Var)) {
            return r560Var == r560Var2 ? fbl.b : fbl.d;
        }
        return fbl.a;
    }

    public Object convert(int i) {
        he30 he30Var;
        switch (this.a) {
            case 3:
                if (i == 0) {
                    he30Var = he30.b;
                } else if (i == 1) {
                    he30Var = he30.c;
                } else if (i == 2) {
                    he30Var = he30.d;
                } else if (i == 3) {
                    he30Var = he30.e;
                } else if (i != 4) {
                    he30Var = i != 5 ? null : he30.g;
                } else {
                    he30Var = he30.f;
                }
                return he30Var == null ? he30.h : he30Var;
            case grn1.d /* 12 */:
                ul51 ul51VarA = ul51.a(i);
                return ul51VarA == null ? ul51.g : ul51VarA;
            default:
                hz00 hz00VarB = hz00.b(i);
                return hz00VarB == null ? hz00.V5 : hz00VarB;
        }
    }

    public ArrayList d(List list) {
        if (!list.isEmpty()) {
            List<gd70> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            boolean z = false;
            for (gd70 gd70VarX : list2) {
                ArrayList arrayListD = d(gd70VarX.s());
                if (arrayListD != null) {
                    wwo1 builder = gd70VarX.toBuilder();
                    if (!zxo1.A(((fd70) builder).l, arrayListD)) {
                        wwo1 ed70Var = new ed70(builder);
                        ((ed70) ed70Var).l.b(arrayListD.isEmpty() ? null : zxo1.q(arrayListD));
                        builder = ed70Var;
                    }
                    gd70VarX = builder.x();
                    z = true;
                }
                gd70 gd70VarX2 = gd70VarX == null ? null : u890.j(gd70VarX.h().a(), "glue2:trackCloud") ? gd70VarX.toBuilder().P("glue2:TrackCloudExperiment", s570.d.a).x() : gd70VarX;
                if (gd70VarX2 != null) {
                    gd70VarX = gd70VarX2;
                    z = true;
                }
                arrayList.add(gd70VarX);
            }
            if (z) {
                return arrayList;
            }
        }
        return null;
    }

    public First e0(Object obj) {
        return First.b((ywi1) obj);
    }

    public int i(i1z i1zVar, int i, h131 h131Var) {
        if (h131Var.a(i)) {
            return 2;
        }
        return !i1zVar.o ? 1 : 3;
    }

    public /* synthetic */ jma(byte b) {
        this.a = b;
    }

    public /* synthetic */ jma(byte b, boolean z) {
        this.a = b;
    }

    public jma(daq daqVar, teq teqVar) {
        this.a = (byte) 5;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 19:
                return f4s0.b.get(obj);
            default:
                return rc51.b.get(obj);
        }
    }
}
