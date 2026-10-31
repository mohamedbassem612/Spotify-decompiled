package p;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class swm0 implements gvt0, c7g1, Function, w3b1, qiw {
    public final /* synthetic */ byte a;
    public final Object b;

    public swm0(Flowable flowable, Flowable flowable2) {
        this.a = (byte) 10;
        this.b = new rt40(h4p1.g(new ofk0((Object) this, (Object) flowable, (Object) flowable2, (lnm) null, (byte) 13)), (byte) 1);
    }

    public static boolean t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static void x(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public boolean a(String str) {
        String strJ = j(str);
        return "1".equals(strJ) || Boolean.parseBoolean(strJ);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v18 java.lang.Object, still in use, count: 2, list:
          (r6v18 java.lang.Object) from 0x00bd: PHI (r6 I:??) = (r6v11 java.lang.Object), (r6v18 java.lang.Object) binds: [B:31:0x00bc, B:114:0x00bd] A[DONT_GENERATE, DONT_INLINE]
          (r6v18 java.lang.Object) from 0x00af: CHECK_CAST (p.mo11) (r6v18 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.swm0.apply(java.lang.Object):java.lang.Object");
    }

    public f9v b(v8v v8vVar, int i, b8c0 b8c0Var, String str) {
        return new ppt0((o5n) this.b, str);
    }

    public boolean c(m0u0 m0u0Var) {
        String identifier = ((twm0) this.b).getIdentifier();
        if (identifier != null) {
            return u890.j(m0u0Var.a.d.get("video_surface_identifier"), identifier);
        }
        return false;
    }

    public Object d(String str, ioj0 ioj0Var, lnm lnmVar) {
        goj0 goj0VarA;
        jo70 jo70Var;
        hoj0 hoj0VarC = ioj0Var.c(jo70.class, str);
        if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null && (jo70Var = (jo70) goj0VarA.a) != null) {
            List<ho70> list = jo70Var.d;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (ho70 ho70Var : list) {
                arrayList.add(new uto(ho70Var.b, ho70Var.a));
            }
            if (!arrayList.isEmpty()) {
                return new qto(arrayList);
            }
        }
        return rto.a;
    }

    public Object e(String str, ioj0 ioj0Var, boj0 boj0Var) {
        return ((c7g1) this.b).e(str, ioj0Var, boj0Var);
    }

    public Integer f(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strJ));
        } catch (NumberFormatException unused) {
            x(str);
            return null;
        }
    }

    public JSONArray g(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return new JSONArray(strJ);
        } catch (JSONException unused) {
            x(str);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object h(String str, onm onmVar) {
        kku0 kku0Var;
        if (onmVar instanceof kku0) {
            kku0Var = (kku0) onmVar;
            int i = kku0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kku0Var.c = i - Integer.MIN_VALUE;
            } else {
                kku0Var = new kku0(this, onmVar);
            }
        } else {
            kku0Var = new kku0(this, onmVar);
        }
        Object objF = kku0Var.a;
        int i2 = kku0Var.c;
        if (i2 == 0) {
            hm5.M(objF);
            rsc0 rsc0Var = (xrc0) this.b;
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            sku0 sku0VarP = PlaylistDecorationPolicy.p();
            sku0VarP.R();
            sku0VarP.H();
            sku0VarP.u();
            sku0VarP.k0();
            hru0VarS.w(sku0VarP.build());
            trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, (mqz0) null, (prc0) null, 0, (List) null, 510);
            kku0Var.c = 1;
            objF = rsc0Var.f(str, trc0Var, kku0Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        kby kbyVar = ((wsc0) ((py21) objF).d()).f;
        boolean zContains = kbyVar.w.h.b.contains(wls0.f);
        return new jku0(kbyVar.p, kbyVar.b, kbyVar.v, zContains);
    }

    public String i(Resources resources, String str, String str2) {
        String[] strArr;
        String strJ = j(str2);
        if (!TextUtils.isEmpty(strJ)) {
            return strJ;
        }
        String strJ2 = j(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strJ2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strJ2, "string", str);
        if (identifier == 0) {
            x(str2.concat("_loc_key"));
            return null;
        }
        JSONArray jSONArrayG = g(str2.concat("_loc_args"));
        if (jSONArrayG == null) {
            strArr = null;
        } else {
            int length = jSONArrayG.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayG.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            x(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    public String j(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public String k(String str, ioj0 ioj0Var) {
        return ((c7g1) this.b).k(str, ioj0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object l(cdw cdwVar, onm onmVar) {
        rrn0 rrn0Var;
        if (onmVar instanceof rrn0) {
            rrn0Var = (rrn0) onmVar;
            int i = rrn0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rrn0Var.c = i - Integer.MIN_VALUE;
            } else {
                rrn0Var = new rrn0(this, onmVar);
            }
        } else {
            rrn0Var = new rrn0(this, onmVar);
        }
        Object obj = rrn0Var.a;
        int i2 = rrn0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                f1n0 f1n0Var = (f1n0) this.b;
                String str = "spotify:listening-activity:group-details:" + Uri.encode(cdwVar.a);
                tv80 tv80Var = cdwVar.b;
                Bundle bundleH = mno1.h(new mmr0[]{new mmr0("isOpenedFromChat", Boolean.TRUE)});
                rrn0Var.c = 1;
                Object objE = f1n0Var.e(str, tv80Var, bundleH, rrn0Var);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Exception e) {
            Logger.d(l1d.m("BUZZ: ListeningActivityButton navigate to group details failed: ", e.getMessage()), new Object[0]);
        }
        return rih1.a;
    }

    public Set m() {
        Set<zp21> setM = ((c7g1) this.b).m();
        ArrayList arrayList = new ArrayList(q7h.U(setM, 10));
        for (zp21 zp21Var : setM) {
            if (u890.j((Class) zp21Var.getKey(), zoy0.class)) {
                zp21Var = new zp21(zp21Var.getKey());
            }
            arrayList.add(zp21Var);
        }
        return o7h.p1(arrayList);
    }

    public mmr0 n(String str, ioj0 ioj0Var) {
        return ((c7g1) this.b).n(str, ioj0Var);
    }

    public long o(String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        zoy0 zoy0Var;
        hoj0 hoj0VarC = ioj0Var.c(zoy0.class, str);
        if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (zoy0Var = (zoy0) goj0VarA.a) == null) {
            return 0L;
        }
        return zoy0Var.c;
    }

    public String p(String str, ioj0 ioj0Var) {
        return ((c7g1) this.b).p(str, ioj0Var);
    }

    public String q(String str, ioj0 ioj0Var) {
        return ((c7g1) this.b).q(str, ioj0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(ndw ndwVar, onm onmVar) {
        qrn0 qrn0Var;
        if (onmVar instanceof qrn0) {
            qrn0Var = (qrn0) onmVar;
            int i = qrn0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qrn0Var.c = i - Integer.MIN_VALUE;
            } else {
                qrn0Var = new qrn0(this, onmVar);
            }
        } else {
            qrn0Var = new qrn0(this, onmVar);
        }
        Object obj = qrn0Var.a;
        int i2 = qrn0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                f1n0 f1n0Var = (f1n0) this.b;
                String str = "spotify:listening-activity:details:" + Uri.encode(ndwVar.a);
                tv80 tv80Var = ndwVar.f;
                Bundle bundleH = mno1.h(new mmr0[]{new mmr0("entityUri", ndwVar.b), new mmr0("contextUri", ndwVar.c), new mmr0("isPlaying", Boolean.valueOf(ndwVar.d)), new mmr0("timestamp", ndwVar.e), new mmr0("isOpenedFromChat", Boolean.TRUE), new mmr0("groupChatId", ndwVar.g)});
                qrn0Var.c = 1;
                Object objE = f1n0Var.e(str, tv80Var, bundleH, qrn0Var);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Exception e) {
            Logger.d(l1d.m("BUZZ: ListeningActivityButton navigate to user details failed: ", e.getMessage()), new Object[0]);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(String str, onm onmVar) {
        d5s0 d5s0Var;
        if (onmVar instanceof d5s0) {
            d5s0Var = (d5s0) onmVar;
            int i = d5s0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d5s0Var.c = i - Integer.MIN_VALUE;
            } else {
                d5s0Var = new d5s0(this, onmVar);
            }
        } else {
            d5s0Var = new d5s0(this, onmVar);
        }
        Object objJ = d5s0Var.a;
        int i2 = d5s0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single map = ((a7z) this.b).a(Collections.singletonList(str)).map(zz10.V0);
            d5s0Var.c = 1;
            objJ = fc11.j(map, d5s0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public boolean u() {
        int mode = ((mw7) this.b).a.getMode();
        return mode == 2 || mode == 1;
    }

    public void v(Object obj) {
        Set set = (Set) obj;
        k9v0 k9v0Var = (k9v0) this.b;
        set.getClass();
        MobiusLoop mobiusLoop = k9v0Var.b;
        if (mobiusLoop != null) {
            mobiusLoop.a(new g9v0(set));
        } else {
            u890.C("loop");
            throw null;
        }
    }

    public Bundle w() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public swm0() {
        this.a = (byte) 2;
        this.b = new mta((byte) 3, false);
    }

    public /* synthetic */ swm0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public swm0(Bundle bundle) {
        this.a = (byte) 6;
        this.b = new Bundle(bundle);
    }
}
