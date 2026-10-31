package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lfb implements c290, Predicate, av30, Function, yz20, hyp0, Init, wv91 {
    public final /* synthetic */ byte a;

    public static final void a(Throwable th) {
        Logger.e(th, "Something went wrong while fetching category.", new Object[0]);
    }

    public static Bundle d(String str) {
        return pzm.f("extra_graduation_token", str, "extra_interaction_id", (String) null);
    }

    public static int e(String str) {
        Object next;
        t0z t0zVar = q7t0.g;
        ArrayList arrayList = new ArrayList();
        t0zVar.getClass();
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            Object next2 = d7Var.next();
            if (((q7t0) next2) != q7t0.e) {
                arrayList.add(next2);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((q7t0) next).a.equals(str));
        q7t0 q7t0Var = (q7t0) next;
        return q7t0Var != null ? q7t0Var.b : q7t0.e.b;
    }

    public static String f(Map map) {
        String str = !map.containsKey("story_video_preview_video_url") ? null : (String) map.get("story_video_preview_video_url");
        if (str != null) {
            return str;
        }
        if (map.containsKey("story_video_preview_source_identifier")) {
            return (String) map.get("story_video_preview_source_identifier");
        }
        return null;
    }

    public static boolean g(String str) {
        return str != null && (nhc1.Y(str, "publish", false) || nhc1.Y(str, "manage", false) || s1f0.c.contains(str));
    }

    public static drn0 h(Intent intent) {
        return new drn0(intent);
    }

    public static ern0 j(s4b1 s4b1Var) {
        return new ern0(s4b1Var);
    }

    public static grn0 k(brm1 brm1Var) {
        return new grn0(brm1Var);
    }

    public static hrn0 l(Class cls, Parcelable parcelable, e6w0 e6w0Var) {
        return new hrn0(cls, parcelable, e6w0Var);
    }

    public static hrn0 m(Class cls, Parcelable parcelable) {
        return new hrn0(cls, parcelable, a6w0.a);
    }

    public static ArrayList n(List list) {
        List<k6w0> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (k6w0 k6w0Var : list2) {
            arrayList.add(new n3j0(k6w0Var.a, k6w0Var.b));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return p.kpy0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0112, code lost:
    
        if (r5.b != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0135, code lost:
    
        if (r5.b != false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lfb.apply(java.lang.Object):java.lang.Object");
    }

    public i c(hi90 hi90Var) {
        if (hi90Var instanceof yh90) {
            yh90 yh90Var = (yh90) hi90Var;
            String str = yh90Var.a;
            String str2 = yh90Var.b;
            String str3 = yh90Var.c;
            boolean z = yh90Var.t;
            boolean z2 = yh90Var.Y;
            String str4 = yh90Var.f;
            boolean z3 = yh90Var.g;
            boolean z4 = yh90Var.i;
            boolean z5 = yh90Var.h;
            List<xh90> list = yh90Var.X;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (xh90 xh90Var : list) {
                arrayList.add(new f(xh90Var.a, xh90Var.b));
            }
            return new g(str, str2, str3, str4, true, z3, z4, z5, z, arrayList, null, z2);
        }
        if (hi90Var instanceof eh90) {
            eh90 eh90Var = (eh90) hi90Var;
            String str5 = eh90Var.a;
            String str6 = eh90Var.b;
            String str7 = eh90Var.d;
            float f = eh90Var.e;
            List list2 = eh90Var.Y;
            String str8 = eh90Var.c;
            boolean z6 = eh90Var.h;
            return new d(str5, str6, str8, eh90Var.f, true, z6, false, false, str7, f, "", eh90Var.g, eh90Var.i, eh90Var.t, eh90Var.X, list2, eh90Var.Z);
        }
        if (!(hi90Var instanceof jh90)) {
            hhg1.n(f4i1.e(hi90Var.getUri(), " is not supported"));
            return null;
        }
        jh90 jh90Var = (jh90) hi90Var;
        return new e(jh90Var.a, jh90Var.b, jh90Var.c, jh90Var.e, true, jh90Var.g, false, jh90Var.h, jh90Var.d, jh90Var.f, jh90Var.i, jh90Var.t);
    }

    public Object convert(int i) {
        switch (this.a) {
            case 1:
                vls0 vls0VarA = vls0.a(i);
                return vls0VarA == null ? vls0.b : vls0VarA;
            default:
                w80 w80VarA = w80.a(i);
                return w80VarA == null ? w80.f : w80VarA;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 20:
                lvv0 lvv0Var = (lvv0) obj;
                svv0 svv0Var = lvv0Var.c;
                boolean z = svv0Var instanceof pvv0;
                euv0 euv0Var = buv0.a;
                if (z) {
                    return First.c(lvv0Var, Collections.singleton(euv0Var));
                }
                if (svv0Var instanceof ovv0) {
                    return First.c(lvv0.a(lvv0Var, (String) null, new rvv0(false), false, 59), Collections.singleton(euv0Var));
                }
                if (svv0Var instanceof rvv0) {
                    return First.c(lvv0Var, Effects.a(new euv0[]{new duv0(), euv0Var}));
                }
                if (svv0Var instanceof qvv0) {
                    djw0 djw0Var = lvv0Var.d;
                    return First.c(lvv0Var, Collections.singleton(djw0Var != null ? new ztv0(djw0Var.b) : null));
                }
                if (svv0Var instanceof nvv0) {
                    return First.b(lvv0.a(lvv0Var, (String) null, new rvv0(false), false, 59));
                }
                eg.o();
                return null;
            default:
                return First.b((fhm0) obj);
        }
    }

    public boolean test(Object obj) {
        return Boolean.parseBoolean((String) ((PlayerState) obj).contextMetadata().get("is_audiobook"));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[RETURN] */
    public boolean x(Object obj, Object obj2) {
        y5e1 y5e1Var = (y5e1) obj;
        y5e1 y5e1Var2 = (y5e1) obj2;
        if (y5e1Var == null || y5e1Var2 == null) {
            if ((y5e1Var == null) ^ (y5e1Var2 == null)) {
                return false;
            }
            return true;
        }
        if (y5e1Var.e == y5e1Var2.e && y5e1Var.f == y5e1Var2.f && y5e1Var.b == y5e1Var2.b && u890.j(y5e1Var.c, y5e1Var2.c) && hjl.c(y5e1Var.d, y5e1Var2.d)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ lfb(byte b) {
        this.a = b;
    }

    public int i(int i) {
        return i;
    }

    public int o(int i) {
        return i;
    }
}
