package p;

import android.net.Uri;
import android.os.Bundle;
import androidx.datastore.core.CorruptionException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.playability.esperanto.proto.EsPlayability;
import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ekb implements n8n, dl4, bnh0, Function, dab1, k9n, dsn {
    public final /* synthetic */ byte a;

    public ekb(int i) {
        this.a = (byte) 29;
        new ime1(1, (lnm) null, (byte) 1);
        if ((i & 16) != 0) {
            new bpk1(4, (lnm) null);
        }
        if ((i & 32) != 0) {
            new whk1(2, (lnm) null, (byte) 1);
        }
        if ((i & 64) != 0) {
            new whk1(2, (lnm) null, (byte) 2);
        }
        if ((i & 128) != 0) {
            new whk1(2, (lnm) null, (byte) 3);
        }
        if ((i & 256) != 0) {
            new whk1(2, (lnm) null, (byte) 4);
        }
    }

    public static iv91 A(vu30 vu30Var) {
        pv91.b(pv91.a);
        synchronized (pv91.c) {
            pv91.h = o7h.O0(vu30Var, pv91.h);
        }
        return new iv91(vu30Var, (byte) 0);
    }

    public static void B(gv20 gv20Var) {
        synchronized (pv91.c) {
            pv91.i = o7h.O0(gv20Var, pv91.i);
        }
        pv91.c();
    }

    public static void C(jv91 jv91Var, jv91 jv91Var2, iu30 iu30Var) {
        if (jv91Var != jv91Var2) {
            jv91Var2.getClass();
            jv91.q(jv91Var);
            jv91Var2.c();
        } else if (jv91Var instanceof cog1) {
            ((cog1) jv91Var).r = iu30Var;
        } else if (jv91Var instanceof dog1) {
            ((dog1) jv91Var).h = iu30Var;
        } else {
            hhg1.o(jv91Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static void D() {
        boolean z;
        synchronized (pv91.c) {
            oen0 oen0Var = ((ten0) pv91.j).h;
            z = false;
            if (oen0Var != null && oen0Var.h()) {
                z = true;
            }
        }
        if (z) {
            pv91.c();
        }
    }

    public static ten0 E(waq0 waq0Var, gub0 gub0Var) {
        ten0 ten0VarC;
        ten0 ten0VarH = pv91.h();
        ten0 ten0Var = ten0VarH instanceof ten0 ? ten0VarH : null;
        if (ten0Var != null && (ten0VarC = ten0Var.C(waq0Var, gub0Var)) != null) {
            return ten0VarC;
        }
        eg.m("Cannot create a mutable snapshot of an read-only snapshot");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[RETURN] */
    public static c3e H(Bundle bundle) {
        c3e c3eVarR;
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice castDeviceF;
        c3e c3eVar;
        if (bundle != null) {
            try {
                bundle.setClassLoader(c3e.class.getClassLoader());
                if (bundle != null && (c3eVar = (c3e) jhc1.t(bundle, "com.spotify.connect.EXTRA_CAST_DEVICE_INFO", c3e.class)) != null) {
                    return c3eVar;
                }
                if (bundle == null && (castDeviceF = CastDevice.F(bundle)) != null) {
                    return iho1.r(castDeviceF);
                }
                if (bundle != null || (castDevice2 = (CastDevice) jhc1.t(bundle, "com.google.android.gms.dtdi.EXTRA_CAST_DEVICE", CastDevice.class)) == null) {
                    c3eVarR = null;
                } else {
                    c3eVarR = iho1.r(castDevice2);
                }
                if (c3eVarR == null) {
                    return c3eVarR;
                }
                if (bundle != null && (castDevice = (CastDevice) jhc1.t(bundle, "com.google.android.gms.cast.EXTRA_CAST_DEVICE", CastDevice.class)) != null) {
                    return iho1.r(castDevice);
                }
            } catch (Exception e) {
                Logger.d("CastBasic->%s", new Object[]{l1d.m("toCastDeviceInfo failed: ", e.getMessage())});
            }
        } else {
            if (bundle != null) {
                return c3eVar;
            }
            if (bundle == null) {
            }
            if (bundle != null) {
                c3eVarR = null;
            } else {
                c3eVarR = null;
            }
            if (c3eVarR == null) {
                return c3eVarR;
            }
            if (bundle != null) {
                return iho1.r(castDevice);
            }
        }
        return null;
    }

    public static bi90 k(mh90 mh90Var, String str) {
        Object next;
        Object next2;
        boolean zJ;
        List<mh90> list = mh90Var.f;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            mh90 mh90Var2 = (bi90) next;
            if (mh90Var2 instanceof mh90) {
                zJ = u890.j(mh90Var2.b, str);
            } else {
                if (!(mh90Var2 instanceof rh90)) {
                    eg.o();
                    return null;
                }
                zJ = u890.j(((rh90) mh90Var2).b, str);
            }
        } while (!zJ);
        bi90 bi90Var = (bi90) next;
        if (bi90Var == null) {
            for (mh90 mh90Var3 : list) {
                if (mh90Var3 instanceof mh90) {
                    Iterator it2 = mh90Var3.f.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        mh90 mh90Var4 = (bi90) next2;
                        if (((mh90Var4 instanceof mh90) && u890.j(mh90Var4.b, str)) || ((mh90Var4 instanceof rh90) && u890.j(((rh90) mh90Var4).b, str))) {
                            break;
                        }
                    }
                    bi90 bi90Var2 = (bi90) next2;
                    if (bi90Var2 != null) {
                        return bi90Var2;
                    }
                }
            }
        }
        return bi90Var;
    }

    public static Uri l(String str, String str2) {
        return Uri.parse("https://spotify.link/content_linking").buildUpon().appendQueryParameter("~campaign", str2).appendQueryParameter("$deeplink_path", str).appendQueryParameter("$fallback_url", str).build();
    }

    public static jv91 n() {
        return pv91.h();
    }

    public static jv91 o() {
        return (jv91) pv91.b.e();
    }

    public static jv91 u(jv91 jv91Var) {
        if (jv91Var instanceof cog1) {
            cog1 cog1Var = (cog1) jv91Var;
            if (cog1Var.t == t8p1.k()) {
                cog1Var.r = null;
                return jv91Var;
            }
        }
        if (jv91Var instanceof dog1) {
            dog1 dog1Var = (dog1) jv91Var;
            if (dog1Var.i == t8p1.k()) {
                dog1Var.h = null;
                return jv91Var;
            }
        }
        jv91 jv91VarE = pv91.e(jv91Var, (iu30) null, false);
        jv91VarE.j();
        return jv91VarE;
    }

    public static void v() {
        pv91.h().m();
    }

    public static Object x(kdt kdtVar, Function0 function0) {
        jv91 cog1Var;
        cog1 cog1Var2 = (jv91) pv91.b.e();
        if (cog1Var2 instanceof cog1) {
            cog1 cog1Var3 = cog1Var2;
            if (cog1Var3.t == t8p1.k()) {
                iu30 iu30Var = cog1Var3.r;
                iu30 iu30Var2 = cog1Var3.s;
                try {
                    cog1Var2.r = pv91.i(kdtVar, iu30Var, true);
                    cog1Var2.s = iu30Var2;
                    return function0.invoke();
                } finally {
                    cog1Var3.r = iu30Var;
                    cog1Var3.s = iu30Var2;
                }
            }
        }
        if (cog1Var2 == null || (cog1Var2 instanceof ten0)) {
            cog1Var = new cog1(cog1Var2 instanceof ten0 ? (ten0) cog1Var2 : null, kdtVar, (iu30) null, true, false);
        } else {
            cog1Var = cog1Var2.u(kdtVar);
        }
        try {
            jv91 jv91VarJ = cog1Var.j();
            try {
                Object objInvoke = function0.invoke();
                jv91.q(jv91VarJ);
                cog1Var.c();
                return objInvoke;
            } catch (Throwable th) {
                jv91.q(jv91VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            cog1Var.c();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r6 == r4) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(p.mj20 r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.co80
            if (r0 == 0) goto L13
            r0 = r8
            p.co80 r0 = (p.co80) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.co80 r0 = new p.co80
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r6 = r0.b
            int r8 = r0.d
            java.lang.String r1 = ""
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r8 == 0) goto L3f
            if (r8 == r3) goto L37
            if (r8 != r2) goto L30
            java.lang.Object r7 = r0.a
            java.lang.String r7 = (java.lang.String) r7
            p.hm5.M(r6)     // Catch: java.lang.Exception -> L76
            goto L73
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L37:
            java.lang.Object r7 = r0.a
            p.mj20 r7 = (p.mj20) r7
            p.hm5.M(r6)     // Catch: java.lang.Exception -> L60
            goto L57
        L3f:
            p.hm5.M(r6)
            r6 = r7
            p.lj20 r6 = (p.lj20) r6     // Catch: java.lang.Exception -> L60
            p.hfp1 r7 = r6.d()     // Catch: java.lang.Exception -> L60
            r0.a = r6     // Catch: java.lang.Exception -> L5f
            r0.d = r3     // Catch: java.lang.Exception -> L5f
            java.lang.Object r7 = p.u890.l(r7, r0)     // Catch: java.lang.Exception -> L5f
            if (r7 != r4) goto L54
            goto L72
        L54:
            r5 = r7
            r7 = r6
            r6 = r5
        L57:
            p.f19 r6 = (p.f19) r6     // Catch: java.lang.Exception -> L60
            java.lang.String r6 = r6.a     // Catch: java.lang.Exception -> L60
            r5 = r7
            r7 = r6
            r6 = r5
            goto L62
        L5f:
            r7 = r6
        L60:
            r6 = r7
            r7 = r1
        L62:
            p.lj20 r6 = (p.lj20) r6     // Catch: java.lang.Exception -> L76
            p.hfp1 r6 = r6.c()     // Catch: java.lang.Exception -> L76
            r0.a = r7     // Catch: java.lang.Exception -> L76
            r0.d = r2     // Catch: java.lang.Exception -> L76
            java.lang.Object r6 = p.u890.l(r6, r0)     // Catch: java.lang.Exception -> L76
            if (r6 != r4) goto L73
        L72:
            return r4
        L73:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L76
            r1 = r6
        L76:
            p.do80 r6 = new p.do80
            r6.<init>(r1, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ekb.a(p.mj20, p.onm):java.lang.Object");
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 10:
                Integer num = (Integer) obj;
                return Integer.valueOf(num.intValue() == -1 ? -7829368 : num.intValue());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                h290 h290VarN = ((YourLibraryResponse) obj).n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                Iterator it = h290VarN.iterator();
                while (it.hasNext()) {
                    arrayList.add(((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) it.next()).e().getUri());
                }
                return new ne81(arrayList);
            case grn1.d /* 12 */:
                r0e0 r0e0Var = (r0e0) obj;
                return new ef50(r0e0Var.d, r0e0Var.c);
            case 19:
                List<EsPlayability.LocallyPlayable> itemsList = ((EsPlayability.GetLocallyPlayableResponse) obj).getItemsList();
                ArrayList arrayList2 = new ArrayList(q7h.U(itemsList, 10));
                for (EsPlayability.LocallyPlayable locallyPlayable : itemsList) {
                    arrayList2.add(new htt0(locallyPlayable.getUri(), locallyPlayable.getLocallyPlayable()));
                }
                return new itt0(arrayList2);
            case 21:
                throw td6.k(obj);
            case 26:
                spq0 spq0VarPlaybackQuality = ((PlayerState) obj).playbackQuality();
                if (spq0VarPlaybackQuality.c()) {
                    BitrateLevel bitrateLevel = ((PlaybackQuality) spq0VarPlaybackQuality.b()).bitrateLevel();
                    switch (bitrateLevel != null ? ggc1.a[bitrateLevel.ordinal()] : -1) {
                        case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                        case 1:
                            break;
                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        default:
                            eg.o();
                            return null;
                        case 2:
                            return zfc1.b;
                        case 3:
                            return zfc1.c;
                        case 4:
                            return zfc1.d;
                        case 5:
                            return zfc1.e;
                        case 6:
                            return zfc1.f;
                        case 7:
                            return zfc1.g;
                    }
                }
                return zfc1.a;
            default:
                return kie1.b.get(obj);
        }
    }

    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    public j1h1 i(h0h1 h0h1Var, List list) {
        List parameters = h0h1Var.getParameters();
        y0h1 y0h1Var = (y0h1) o7h.C0(parameters);
        if (y0h1Var == null || !y0h1Var.N()) {
            return new z980((y0h1[]) parameters.toArray(new y0h1[0]), (e1h1[]) list.toArray(new e1h1[0]), false);
        }
        List parameters2 = h0h1Var.getParameters();
        ArrayList arrayList = new ArrayList(q7h.U(parameters2, 10));
        Iterator it = parameters2.iterator();
        while (it.hasNext()) {
            arrayList.add(((y0h1) it.next()).g());
        }
        return new qhb1(sqg0.T(o7h.v1(arrayList, list)), (byte) 1);
    }

    public String toString() {
        switch (this.a) {
            case 23:
                int iHashCode = hashCode();
                eth.h(16);
                return cy30.p("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", rc11.a.b(Bundle.class).r(), ">");
            default:
                return super.toString();
        }
    }

    public void w(Object obj) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.core.CorruptionException */
    public Object d(CorruptionException corruptionException) throws CorruptionException {
        throw corruptionException;
    }

    public /* synthetic */ ekb(byte b) {
        this.a = b;
    }

    public ekb(daq daqVar, teq teqVar) {
        this.a = (byte) 5;
    }
}
