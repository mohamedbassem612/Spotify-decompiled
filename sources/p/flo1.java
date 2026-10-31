package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import app.p000rive.semantics.SemanticState;
import com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class flo1 implements hv30 {
    public static final jm a = new jm("NO_THREAD_ELEMENTS", (byte) 5);
    public static final f6f0 b = new f6f0(24);
    public static final f6f0 c = new f6f0(25);
    public static final f6f0 d = new f6f0(26);
    public static b180 e;

    public static final void a(int i, String str, String str2, Function0 function0, b0k b0kVar) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(860421491);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.i(function0) ? SemanticState.Hidden : SemanticState.Focused);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("artist_link_row", u291.f(nim0.a, 1.0f)), (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, (xu30) null, apo.r(-625481124, new p3(str2, (byte) 17), b0kVar3), (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(336502967, new p3(str, (byte) 18), b0kVar3), b0kVar2, 805306368, 196608, 32190);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tq6(str, str2, function0, i, (byte) 0);
        }
    }

    public static final void b(b9x b9xVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(647555020);
        int i2 = i | (x340Var.i(b9xVar) ? 4 : 2) | 48;
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(z));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N("empty_stats", qim0Var3), 1.0f);
            long jK = f5p1.k(x340Var, 2131101284);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarF2 = dug.f(qim0VarF, jK, er31.b(8.0f));
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 12.0f, 1, qim0VarF2);
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = b9xVar.b;
            lee1 lee1Var = cbx.d(x340Var).k;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.z(12.0f, 0.0f, 2, qim0Var3), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            vnr0 vnr0VarG = b9xVar.c.g((djc0) null, x340Var, 1);
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0Var2 = qim0Var3;
            qgo1.f(vnr0VarG, uyn1.z(12.0f, 0.0f, 2, qim0Var2), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozw(b9xVar, qim0Var2, i, (byte) 5);
        }
    }

    public static final boolean c(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -1958346218:
                return str.equals("com.google.android.googlequicksearchbox");
            case -1046965711:
                return str.equals("com.android.vending");
            case 1230702594:
                return str.equals("com.google.android.engage.verifyapp");
            case 1255183367:
                return str.equals("com.google.android.projection.gearhead");
            case 1354605707:
                return str.equals("com.google.android.apps.pixel.subzero");
            case 1764015680:
                return str.equals("com.google.android.apps.mediahome.launcher");
            default:
                return false;
        }
    }

    public static ygz0 d(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrJ = j(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrJ2 = j(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        j2h1.o("QuirkSettingsLoader");
        j2h1.o("QuirkSettingsLoader");
        Arrays.toString(strArrJ);
        j2h1.o("QuirkSettingsLoader");
        Arrays.toString(strArrJ2);
        j2h1.o("QuirkSettingsLoader");
        return new ygz0(z, new HashSet(o(strArrJ)), new HashSet(o(strArrJ2)));
    }

    public static oge e(Throwable th) {
        return new oge(th);
    }

    public static final yr41 f(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((yr41) arrayList.get(i2)).a == i) {
                return (yr41) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final nyh1 g(nhb1 nhb1Var) {
        uzh1 uzh1Var = nhb1Var.g;
        if (uzh1Var instanceof uzh1) {
            return new lyh1(uzh1Var);
        }
        if ((uzh1Var instanceof tzh1) || uzh1Var == null) {
            return myh1.a;
        }
        eg.o();
        return null;
    }

    public static final boolean h(wxr0 wxr0Var) {
        if ((wxr0Var instanceof vxr0) || (wxr0Var instanceof uxr0)) {
            return true;
        }
        if (wxr0Var instanceof txr0) {
            return false;
        }
        eg.o();
        return false;
    }

    public static final y9e1 i(o161 o161Var) {
        iu30 iu30Var;
        ArrayList arrayList = new ArrayList();
        Object objG = o161Var.a.g(m161.a);
        if (objG == null) {
            objG = null;
        }
        we weVar = (we) objG;
        if (weVar == null || (iu30Var = weVar.b) == null || !((Boolean) iu30Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (y9e1) arrayList.get(0);
    }

    public static String[] j(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            j2h1.M("QuirkSettingsLoader");
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException unused) {
            j2h1.N("QuirkSettingsLoader");
            return new String[0];
        }
    }

    public static final kge k(uu00 uu00Var, iu30 iu30Var) {
        Flowable flowable = ((zu00) uu00Var).b(new oi("campfire-platform", false, iu30Var)).toFlowable(BackpressureStrategy.d);
        vbm[] vbmVarArr = q601.a;
        return new kge((moy0) flowable);
    }

    public static o8n l(o8n o8nVar, o8n o8nVar2) {
        return o8nVar2 == o6x.a ? o8nVar : (o8n) o8nVar2.o(o8nVar, new n75((byte) 20));
    }

    public static final String m(nhb1 nhb1Var, String str) {
        lyh1 lyh1VarG = g(nhb1Var);
        if (lyh1VarG.equals(myh1.a)) {
            return str;
        }
        if (lyh1VarG instanceof lyh1) {
            return lyh1VarG.a.b;
        }
        eg.o();
        return null;
    }

    public static final eqb0 n(o860 o860Var, m7a0 m7a0Var) {
        return new eqb0(o860Var, m7a0Var, false);
    }

    public static HashSet o(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
                if (!xgz0.class.isAssignableFrom(cls)) {
                    j2h1.M("QuirkSettingsLoader");
                    cls = null;
                }
            } catch (ClassNotFoundException unused) {
                j2h1.N("QuirkSettingsLoader");
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }

    public static final void p(o8n o8nVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof pge1)) {
            ((yfe1) o8nVar.o((Object) null, c)).u(obj);
            return;
        }
        pge1 pge1Var = (pge1) obj;
        yfe1[] yfe1VarArr = pge1Var.c;
        int length = yfe1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            yfe1 yfe1Var = yfe1VarArr[length];
            yfe1Var.getClass();
            yfe1Var.u(pge1Var.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final k75 q(q75 q75Var, int i) {
        Object next;
        Iterator it = q75Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hmb0) ((Map.Entry) next).getKey()).b != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (k75) entry.getValue();
        }
        return null;
    }

    public static void r(Context context) {
        context.startActivity(new Intent(context, (Class<?>) NotificationPermissionRequestActivity.class));
    }

    public static final Object s(o8n o8nVar) {
        Object objO = o8nVar.o(0, b);
        objO.getClass();
        return objO;
    }

    public static final String t(String str) {
        String strY0 = o7h.y0(ihc1.Q0(str, new String[]{"_"}, 0, 6), "", (String) null, (String) null, axb1.c1, 30);
        if (strY0.length() <= 0) {
            return strY0;
        }
        return ((Object) String.valueOf(strY0.charAt(0)).toLowerCase(Locale.ROOT)) + strY0.substring(1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final pux u(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        fwx fwxVarG;
        long jK = f5p1.k(b0kVar, 2131101556);
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-717713348);
            nkx nkxVar = nkx.c;
            uwr uwrVar = cbx.a;
            fwxVarG = hso1.G(nkxVar, cbx.a(x340Var).b.b, jK, x340Var, nkx.d, 20);
            x340Var.r(false);
        } else if (iC == 1) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-717485219);
            ltx ltxVar = ltx.c;
            uwr uwrVar2 = cbx.a;
            fwxVarG = hso1.G(ltxVar, cbx.a(x340Var2).b.b, jK, x340Var2, ltx.d, 20);
            x340Var2.r(false);
        } else if (iC == 2) {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(-717254982);
            grx grxVar = grx.c;
            uwr uwrVar3 = cbx.a;
            fwxVarG = hso1.G(grxVar, cbx.a(x340Var3).b.b, jK, x340Var3, grx.d, 20);
            x340Var3.r(false);
        } else {
            if (iC != 3) {
                throw p3d1.k((x340) b0kVar, 1639414318, false);
            }
            x340 x340Var4 = (x340) b0kVar;
            x340Var4.i0(-717025830);
            grx grxVar2 = grx.c;
            uwr uwrVar4 = cbx.a;
            fwxVarG = hso1.G(grxVar2, cbx.a(x340Var4).b.b, jK, x340Var4, grx.d, 20);
            x340Var4.r(false);
        }
        return new pux(fwxVarG, fwxVarG);
    }

    public static final String v(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final Object w(o8n o8nVar, Object obj) {
        if (obj == null) {
            obj = s(o8nVar);
        }
        if (obj == 0) {
            return a;
        }
        return obj instanceof Integer ? o8nVar.o(new pge1(((Number) obj).intValue(), o8nVar), d) : ((yfe1) obj).G();
    }

    public static final nwo1 x(int i, int i2, vu30 vu30Var) {
        return new nwo1(i, vu30Var, new Integer(i2));
    }
}
