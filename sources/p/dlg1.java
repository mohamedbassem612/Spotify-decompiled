package p;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.protobuf.Empty;
import com.spotify.alignedcuration.transitioncurationimpl.MixConversionException;
import com.spotify.base.java.logging.Logger;
import com.spotify.offline_esperanto.proto.EsOffline;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dlg1 implements Function {
    public static dlg1 d;
    public Object a;
    public Object b;
    public Object c;

    public dlg1(byte b) {
        switch (b) {
            case 12:
                bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
                this.a = bpb1VarB;
                this.b = bpb1VarB;
                this.c = gio1.b(0);
                break;
            default:
                this.a = new WeakHashMap();
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                break;
        }
    }

    public static String k(iby ibyVar) {
        dem1 dem1Var = ibyVar.e;
        if (dem1Var instanceof syy) {
            return "artist";
        }
        if (dem1Var instanceof qyy) {
            return "album";
        }
        if (dem1Var instanceof xyy) {
            return "episode";
        }
        if (dem1Var instanceof yyy) {
            return "playlist";
        }
        if (dem1Var instanceof zyy) {
            return "show";
        }
        if (dem1Var instanceof azy) {
            return "track";
        }
        if (dem1Var.equals(bzy.b)) {
            return "user";
        }
        if (dem1Var instanceof uyy) {
            return "audiobook";
        }
        if (dem1Var instanceof vyy) {
            return "audiobook_chapter";
        }
        eg.o();
        return null;
    }

    public static dlg1 m(Context context) {
        dlg1 dlg1Var = d;
        if (dlg1Var != null) {
            return dlg1Var;
        }
        Context applicationContext = context.getApplicationContext();
        LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
        dlg1 dlg1Var2 = new dlg1();
        dlg1Var2.c = new rxg1();
        dlg1Var2.a = applicationContext;
        dlg1Var2.b = locationManager;
        d = dlg1Var2;
        return dlg1Var2;
    }

    public void A() {
        bpb1 bpb1Var = (bpb1) this.c;
        bpb1Var.m((Object) null, Integer.valueOf(((Number) bpb1Var.getValue()).intValue() + 1));
    }

    public void B() {
        this.c = itk0.d;
    }

    public void C(r6h1 r6h1Var) {
        this.b = r6h1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(onm onmVar) {
        uqh1 uqh1Var;
        Boolean m231Var;
        if (onmVar instanceof uqh1) {
            uqh1Var = (uqh1) onmVar;
            int i = uqh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uqh1Var.c = i - Integer.MIN_VALUE;
            } else {
                uqh1Var = new uqh1(this, onmVar);
            }
        } else {
            uqh1Var = new uqh1(this, onmVar);
        }
        Object objJ = uqh1Var.a;
        int i2 = uqh1Var.c;
        boolean z = true;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single map = ((vpp0) this.b).callSingle("spotify.offline_esperanto.proto.Offline", "BulkRedownloadPreflight", Empty.n()).map(as10.S0);
                uqh1Var.c = 1;
                objJ = fc11.j(map, uqh1Var);
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
            if (((EsOffline.BulkRedownloadPreflightResponse) objJ).t() <= 0) {
                z = false;
            }
            m231Var = Boolean.valueOf(z);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "UpdateExistingDownloadsEnabledStateProvider: preflight failed", new Object[0]);
        }
        Boolean bool = Boolean.FALSE;
        if (m231Var instanceof m231) {
            m231Var = bool;
        }
        return m231Var.booleanValue() ? iax.a : new gax(new Integer(2131963517), (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(String str, List list, onm onmVar, boolean z) {
        blg1 blg1Var;
        if (onmVar instanceof blg1) {
            blg1Var = (blg1) onmVar;
            int i = blg1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                blg1Var.e = i - Integer.MIN_VALUE;
            } else {
                blg1Var = new blg1(this, onmVar);
            }
        } else {
            blg1Var = new blg1(this, onmVar);
        }
        Object obj = blg1Var.c;
        int i2 = blg1Var.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (!list.isEmpty()) {
                iyc0 iyc0Var = (iyc0) this.c;
                blg1Var.a = str;
                blg1Var.b = z;
                blg1Var.e = 1;
                if (iyc0.c(iyc0Var, str, list, blg1Var) != d9nVar) {
                }
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            Object obj2 = ((e331) obj).a;
            return rih1Var;
        }
        z = blg1Var.b;
        str = blg1Var.a;
        hm5.M(obj);
        if (z) {
            qjk0 qjk0Var = (jjk0) this.a;
            blg1Var.a = null;
            blg1Var.b = z;
            blg1Var.e = 2;
            if (qjk0Var.e(str, blg1Var, false) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object F(String str, String str2, String str3, String str4, boolean z, zxc0 zxc0Var, onm onmVar) throws MixConversionException {
        clg1 clg1Var;
        String str5;
        zxc0 zxc0Var2;
        boolean z2;
        String str6;
        String str7;
        String str8;
        String str9;
        Object objE;
        String str10;
        String str11;
        boolean z3;
        oy21 oy21Var;
        boolean z4 = z;
        if (onmVar instanceof clg1) {
            clg1Var = (clg1) onmVar;
            int i = clg1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                clg1Var.i = i - Integer.MIN_VALUE;
            } else {
                clg1Var = new clg1(this, onmVar);
            }
        } else {
            clg1Var = new clg1(this, onmVar);
        }
        clg1 clg1Var2 = clg1Var;
        Object objM = clg1Var2.g;
        int i2 = clg1Var2.i;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z5 = clg1Var2.f;
                zxc0 zxc0Var3 = clg1Var2.e;
                String str12 = clg1Var2.d;
                str11 = clg1Var2.c;
                String str13 = clg1Var2.b;
                String str14 = clg1Var2.a;
                hm5.M(objM);
                objE = ((e331) objM).a;
                zxc0Var2 = zxc0Var3;
                z4 = z5;
                str10 = str14;
                str5 = str12;
                str9 = str13;
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = clg1Var2.f;
                hm5.M(objM);
            }
            oy21Var = (py21) objM;
            if (oy21Var instanceof oy21) {
                return new elg1((List) oy21Var.a, z3);
            }
            if (oy21Var instanceof ly21) {
                eg.m("copyTransitionToPlaylist failed");
                return null;
            }
            eg.o();
            return null;
        }
        hm5.M(objM);
        if (z4) {
            qjk0 qjk0Var = (jjk0) this.a;
            clg1Var2.a = str;
            str9 = str2;
            clg1Var2.b = str9;
            clg1Var2.c = str3;
            str5 = str4;
            clg1Var2.d = str5;
            zxc0Var2 = zxc0Var;
            clg1Var2.e = zxc0Var2;
            clg1Var2.f = z4;
            clg1Var2.i = 1;
            objE = qjk0Var.e(str, clg1Var2, true);
            if (objE != d9nVar) {
                str10 = str;
                str11 = str3;
            }
        } else {
            str5 = str4;
            zxc0Var2 = zxc0Var;
            z2 = z4;
            str6 = str2;
            str7 = str3;
            str8 = str;
            qt61 qt61Var = new qt61(this, str8, str6, str7, str5, zxc0Var2, (lnm) null, (byte) 9);
            clg1Var2.a = null;
            clg1Var2.b = null;
            clg1Var2.c = null;
            clg1Var2.d = null;
            clg1Var2.e = null;
            clg1Var2.f = z2;
            clg1Var2.i = 2;
            objM = rc2.M(30000L, qt61Var, clg1Var2);
            if (objM != d9nVar) {
                z3 = z2;
                oy21Var = (py21) objM;
                if (oy21Var instanceof oy21) {
                    return new elg1((List) oy21Var.a, z3);
                }
                if (oy21Var instanceof ly21) {
                    eg.m("copyTransitionToPlaylist failed");
                    return null;
                }
                eg.o();
                return null;
            }
        }
        return d9nVar;
        Throwable thA = e331.a(objE);
        if (thA != null) {
            throw new MixConversionException("Mix conversion failed", thA);
        }
        z2 = z4;
        str6 = str9;
        str7 = str11;
        str8 = str10;
        qt61 qt61Var2 = new qt61(this, str8, str6, str7, str5, zxc0Var2, (lnm) null, (byte) 9);
        clg1Var2.a = null;
        clg1Var2.b = null;
        clg1Var2.c = null;
        clg1Var2.d = null;
        clg1Var2.e = null;
        clg1Var2.f = z2;
        clg1Var2.i = 2;
        objM = rc2.M(30000L, qt61Var2, clg1Var2);
        if (objM != d9nVar) {
            z3 = z2;
            oy21Var = (py21) objM;
            if (oy21Var instanceof oy21) {
                return new elg1((List) oy21Var.a, z3);
            }
            if (oy21Var instanceof ly21) {
                eg.m("copyTransitionToPlaylist failed");
                return null;
            }
            eg.o();
            return null;
        }
        return d9nVar;
    }

    public void G(long j) {
        xab1 xab1Var = (xab1) this.b;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        ((hrr0) this.a).setValue(Boolean.TRUE);
        if (j != Long.MAX_VALUE) {
            this.b = fn31.T(((t4h1) this.c).c, (o8n) null, 0, new kv2(j, this, (lnm) null, (byte) 15), 3);
        }
    }

    public void a(qhi1 qhi1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-113053535);
        int i2 = (x340Var.i(qhi1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            otw.c(qhi1Var.a, qhi1Var.b, (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(this, qhi1Var, i, (byte) 28);
        }
    }

    public Object apply(Object obj) {
        String str = (String) this.b;
        String str2 = (String) this.a;
        if (((Boolean) obj).booleanValue() && !ihc1.y0(str2)) {
            String strConcat = (str == null || ihc1.y0(str)) ? "spotify:presents:listeningstatsinstanceshare:".concat(str2) : gvg.h("spotify:presents:listeningstatsinstanceshare:", str2, "?", str);
            Intent intent = (Intent) this.c;
            intent.setData(Uri.parse(strConcat));
            return new drn0(intent);
        }
        if (ihc1.y0(str2)) {
            Logger.d("Invalid or missing share ID for instance share.", new Object[0]);
        } else {
            Logger.d("Feature is disabled, won't navigate to instance share.", new Object[0]);
        }
        Set set = s4b1.f;
        return new ern0(uic.x(nik1.z0.a));
    }

    public void b(thi1 thi1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1040378570);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(thi1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ((wtq) this.b).a();
                x340Var.s0(objT);
            }
            t2f1 t2f1Var = (t2f1) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new hhz((fhi1) this.c, function0);
                x340Var.s0(objT2);
            }
            nyx.a(2, (wux) null, apo.r(-528873251, new wpg1(t2f1Var, thi1Var, (hhz) objT2), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(this, thi1Var, function0, qim0Var2, i, (byte) 18);
        }
    }

    public void c(c380 c380Var, vzq0 vzq0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-807435021);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(this) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = gio1.b(0);
                x340Var2.s0(objT);
            }
            wen0 wen0Var = (wen0) objT;
            xtb0 xtb0VarA = aub0.a(((Number) rwq.h(wen0Var, x340Var2, 0).getValue()).intValue(), x340Var2, 2);
            qim0 qim0VarN = anm1.N("user-stats-list", qim0Var);
            boolean zI = x340Var2.i(c380Var) | x340Var2.i(this);
            Object objT2 = x340Var2.T();
            byte b = 20;
            if (zI || objT2 == m4cVar) {
                objT2 = new rzf1(c380Var, this, (byte) 20);
                x340Var2.s0(objT2);
            }
            ujo1.d(qim0VarN, xtb0VarA, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT2, x340Var2, (i2 << 3) & 896, 504);
            x340Var = x340Var2;
            boolean zI2 = x340Var.i(xtb0VarA) | x340Var.i(wen0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new k6g1(xtb0VarA, wen0Var, null, b);
                x340Var.s0(objT3);
            }
            qxd0.t(xtb0VarA, x340Var, (vu30) objT3);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, c380Var, vzq0Var, qim0Var, (byte) 19);
        }
    }

    public void d(whi1 whi1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2082280974);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(whi1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ((wtq) this.b).a();
                x340Var.s0(objT);
            }
            nyx.a(2, (wux) null, apo.r(-1163475323, new bvd1((t2f1) objT, whi1Var, iu30Var, this), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, whi1Var, iu30Var, qim0Var, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (r2.a(r4, r3) == r8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(p.bq1 r21, p.onm r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof p.hri1
            if (r3 == 0) goto L19
            r3 = r2
            p.hri1 r3 = (p.hri1) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.d = r4
            goto L1e
        L19:
            p.hri1 r3 = new p.hri1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.b
            int r4 = r3.d
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r4 == 0) goto L3e
            if (r4 == r6) goto L38
            if (r4 != r5) goto L32
            p.hm5.M(r2)
            goto La9
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r7
        L38:
            p.bq1 r1 = r3.a
            p.hm5.M(r2)     // Catch: java.util.concurrent.CancellationException -> L59 java.lang.Exception -> L5b
            goto L52
        L3e:
            p.hm5.M(r2)
            java.lang.Object r2 = r0.b     // Catch: java.util.concurrent.CancellationException -> L59 java.lang.Exception -> L5b
            p.bl3 r2 = (p.bl3) r2     // Catch: java.util.concurrent.CancellationException -> L59 java.lang.Exception -> L5b
            p.ak3 r4 = r1.a     // Catch: java.util.concurrent.CancellationException -> L59 java.lang.Exception -> L5b
            r3.a = r1     // Catch: java.util.concurrent.CancellationException -> L59 java.lang.Exception -> L5b
            r3.d = r6     // Catch: java.util.concurrent.CancellationException -> L59 java.lang.Exception -> L5b
            java.lang.Object r2 = r2.i(r4, r3)     // Catch: java.util.concurrent.CancellationException -> L59 java.lang.Exception -> L5b
            if (r2 != r8) goto L52
            goto La8
        L52:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.util.concurrent.CancellationException -> L59 java.lang.Exception -> L5b
            boolean r2 = r2.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L59 java.lang.Exception -> L5b
            goto L5c
        L59:
            r0 = move-exception
            goto Lac
        L5b:
            r2 = 0
        L5c:
            if (r2 == 0) goto L69
            p.es1 r0 = new p.es1
            p.cwo r1 = new p.cwo
            r1.<init>(r7)
            r0.<init>(r1)
            goto Lab
        L69:
            java.lang.Object r2 = r0.c
            p.yx1 r2 = (p.yx1) r2
            p.tp1 r4 = new p.tp1
            java.lang.Object r0 = r0.a
            p.av1 r0 = (p.av1) r0
            p.cqn r6 = new p.cqn
            java.lang.String r9 = r1.b
            if (r9 != 0) goto L81
            p.zu1 r9 = r0.b
            if (r9 == 0) goto L80
            java.lang.String r9 = r9.a
            goto L81
        L80:
            r9 = r7
        L81:
            java.lang.String r15 = r0.c
            java.lang.String r0 = r0.e
            p.zpn r10 = new p.zpn
            r18 = 0
            r19 = 831(0x33f, float:1.164E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6.<init>(r9, r7, r10, r5)
            p.tv80 r0 = r1.c
            r4.<init>(r6, r0)
            r3.a = r7
            r3.d = r5
            java.lang.Object r0 = r2.a(r4, r3)
            if (r0 != r8) goto La9
        La8:
            return r8
        La9:
            p.is1 r0 = p.is1.a
        Lab:
            return r0
        Lac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dlg1.e(p.bq1, p.onm):java.lang.Object");
    }

    public r6h1 f() {
        ArrayList arrayList = new ArrayList();
        r6h1 r6h1Var = (r6h1) this.b;
        if (r6h1Var != null) {
            arrayList.addAll(r6h1Var.a);
        }
        y6h1 y6h1Var = (y6h1) this.a;
        if (y6h1Var == null && ((u8h1) this.c) == null) {
            gxo1.o(y6h1Var, "location");
        }
        y6h1 y6h1Var2 = (y6h1) this.a;
        if (y6h1Var2 != null) {
            arrayList.add(y6h1Var2);
        }
        u8h1 u8h1Var = (u8h1) this.c;
        if (u8h1Var == null) {
            r6h1 r6h1Var2 = (r6h1) this.b;
            u8h1Var = r6h1Var2 != null ? r6h1Var2.b : null;
        }
        return new r6h1(arrayList, u8h1Var);
    }

    public boolean g(lch1 lch1Var) {
        return q(zbh1.d) && lch1Var.e && lch1Var.d;
    }

    public jhm h(String str) {
        return new jhm("unmute_chat", jpx.c, (fhm) null, 2131958559, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(hzg1.W0, hzg1.X0), new rzf1(this, str, (byte) 13)), 244);
    }

    public jhm i(String str, e2t0 e2t0Var) {
        int i;
        switch (e2t0Var.ordinal()) {
            case 0:
                i = 2131954471;
                break;
            case 1:
                i = 2131954473;
                break;
            case 2:
                i = 2131954474;
                break;
            case 3:
                i = 2131954472;
                break;
            case 4:
                i = 2131954475;
                break;
            case 5:
                i = 2131954476;
                break;
            case 6:
                i = 2131954477;
                break;
            case 7:
                i = 2131954479;
                break;
            case 8:
                i = 2131954484;
                break;
            case 9:
                i = 2131954485;
                break;
            case 10:
                i = 2131954483;
                break;
            case 11:
                i = 2131954482;
                break;
            case 12:
                ((npm1) this.b).getClass();
                i = !str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") ? 2131954480 : 2131954478;
                break;
            case 13:
                i = 2131954481;
                break;
            default:
                eg.o();
                return null;
        }
        return new jhm("your_library_pin_to_your_library", wpx.c, (fhm) null, Integer.valueOf(i), (String) null, false, (tm81) null, new ihm(new ygm(2), hhm.b, new ghm(hzg1.Y0, new ysf1(str, (byte) 15)), new rzf1(this, str, (byte) 14)), 244);
    }

    public String j(long j) {
        Context context = (Context) this.a;
        d6r d6rVar = (d6r) this.b;
        idd1 idd1Var = d6r.c;
        yqg yqgVar = d6rVar.a;
        String id = yqgVar.g().getID();
        if (id.equals("Asia/Hanoi") && !((Set) d6r.c.getValue()).contains("Asia/Hanoi")) {
            id = "Asia/Ho_Chi_Minh";
        } else if (!id.equals("GMT") && !((Set) d6r.c.getValue()).contains(id)) {
            n57.e("Not a valid time zone: ".concat(id));
            id = "UTC";
        }
        ZoneId zoneIdOf = ZoneId.of(id);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(yqgVar.b());
        ZoneId zoneId = d6rVar.b;
        int epochDay = (int) (ZonedDateTime.ofInstant(instantOfEpochMilli, zoneId).withZoneSameInstant(zoneIdOf).toLocalDate().toEpochDay() - ZonedDateTime.ofInstant(Instant.ofEpochSecond(j), zoneId).withZoneSameInstant(zoneIdOf).toLocalDate().toEpochDay());
        if (epochDay != 0) {
            return epochDay != 1 ? context.getString(2131956848, ((DateFormat) this.c).format(new Date(TimeUnit.SECONDS.toMillis(j)))) : context.getString(2131956850);
        }
        return context.getString(2131956849);
    }

    public bpl0 l() {
        return (bpl0) ((sfs) this.b).a.get();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: all -> 0x0031, CancellationException -> 0x0034, Exception -> 0x00b8, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:14:0x002c, B:35:0x00b0, B:37:0x00b4, B:46:0x00c9), top: B:50:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public Object n(String str, onm onmVar) throws Throwable {
        nei1 nei1Var;
        String str2;
        String str3;
        mqm mqmVar;
        rzq rzqVarF;
        rzq rzqVar;
        Boolean bool;
        if (onmVar instanceof nei1) {
            nei1Var = (nei1) onmVar;
            int i = nei1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nei1Var.e = i - Integer.MIN_VALUE;
            } else {
                nei1Var = new nei1(this, onmVar);
            }
        } else {
            nei1Var = new nei1(this, onmVar);
        }
        nei1 nei1Var2 = nei1Var;
        Object objI = nei1Var2.c;
        rzq rzqVar2 = nei1Var2.e;
        boolean zBooleanValue = false;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (rzqVar2 == 0) {
                    hm5.M(objI);
                    mr20 mr20Var = (mr20) this.b;
                    nei1Var2.a = str;
                    nei1Var2.e = 1;
                    objI = b5p1.i(mr20Var, nei1Var2);
                    if (objI != d9nVar) {
                        str2 = str;
                    }
                    return d9nVar;
                }
                if (rzqVar2 != 1) {
                    if (rzqVar2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rzqVar = nei1Var2.b;
                    try {
                        hm5.M(objI);
                        bool = (Boolean) objI;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                    rzqVar.l();
                    return Boolean.valueOf(zBooleanValue);
                }
                str2 = nei1Var2.a;
                hm5.M(objI);
                nsf1 nsf1Var = new nsf1((byte) 10, rzqVarF, this, mqmVar, str3, (lnm) null);
                nei1Var2.a = null;
                nei1Var2.b = rzqVarF;
                nei1Var2.e = 2;
                objI = rc2.O(5000L, nsf1Var, nei1Var2);
                if (objI != d9nVar) {
                    rzqVar = rzqVarF;
                    bool = (Boolean) objI;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    rzqVar.l();
                    return Boolean.valueOf(zBooleanValue);
                }
                return d9nVar;
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception unused2) {
                rzqVar = rzqVarF;
            } catch (Throwable th) {
                th = th;
                rzqVar2 = rzqVarF;
                rzqVar2.l();
                throw th;
            }
            String str4 = ((th61) objI).a;
            Set set = s4b1.f;
            String strZ = uic.C(str4, (String) null).z();
            if (strZ == null) {
                strZ = l1d.m("spotify:user:", Uri.encode(str4));
            }
            str3 = strZ;
            mqmVar = new mqm(new jvm(str2, (String) null, (String) null), new lqm(Collections.singletonList(ovm.a), Collections.singletonList(cvm.a), (qle1) null, 4));
            j3r j3rVar = rzq.y;
            rzqVarF = l2p1.f((dmh1) this.a);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void o() {
        xab1 xab1Var = (xab1) this.b;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        ((hrr0) this.a).setValue(Boolean.FALSE);
    }

    public boolean p(lch1 lch1Var, boolean z) {
        zb91 zb91Var = (zb91) this.a;
        Map map = lch1Var.i;
        if (!z && lch1Var.f) {
            if (lch1Var.a.contains("UPDATE_PROMPT") && lch1Var.b && q(zbh1.b)) {
                return lch1Var.g == 0 || lch1Var.h.contains(dlc0.d) || !zb91Var.f(map).isEmpty();
            }
            if (q(zbh1.d) && lch1Var.d && !zb91Var.f(map).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean q(m9d0 m9d0Var) {
        return ((Map) ((u601) ((idd1) this.c).getValue()).getValue()).get(m9d0Var) instanceof ul10;
    }

    public boolean r() {
        if (((tob1) this.a).getValue() != this.c) {
            return true;
        }
        dlg1 dlg1Var = (dlg1) this.b;
        return dlg1Var != null && dlg1Var.r();
    }

    public void s(y6h1 y6h1Var) {
        this.a = y6h1Var;
    }

    public tv80 t(iby ibyVar, String str) {
        i8h1 i8h1Var = (i8h1) this.a;
        xok0 xok0Var = (xok0) this.b;
        String str2 = (String) this.c;
        x6h1 x6h1VarC = xok0Var.b.c();
        x6h1VarC.i.add(new a7h1("episode_associations", (String) null, (Integer) null, str2, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        String strK = k(ibyVar);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("row", strK, (Integer) null, str, (String) null));
        x6h1VarC2.j = true;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 u(String str) {
        i8h1 i8h1Var = (i8h1) ((idd1) this.c).getValue();
        x6h1 x6h1VarC = ((h7l0) this.b).b.c();
        x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void v() {
        i8h1 i8h1Var = (i8h1) ((idd1) this.c).getValue();
        h7l0 h7l0Var = (h7l0) this.b;
        x6h1 x6h1VarC = h7l0Var.b.c();
        x6h1VarC.i.add(new a7h1("transition_failure_message", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = h7l0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public tv80 w(String str) {
        i8h1 i8h1Var = (i8h1) ((idd1) this.c).getValue();
        x6h1 x6h1VarC = ((h7l0) this.b).b.c();
        x6h1VarC.i.add(new a7h1("open_member_details_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void x() {
        i8h1 i8h1Var = (i8h1) ((idd1) this.c).getValue();
        h7l0 h7l0Var = (h7l0) this.b;
        x6h1 x6h1VarC = h7l0Var.b.c();
        x6h1VarC.i.add(new a7h1("transition_timeout_message", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = h7l0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public void y() {
        i8h1 i8h1Var = (i8h1) ((idd1) this.c).getValue();
        x6h1 x6h1VarC = ((h7l0) this.b).b.c();
        x6h1VarC.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void z(String str, tv80 tv80Var) {
        if (str.equals("spotify:now-playing:queue")) {
            g5p0.b((g5p0) this.c, tv80Var.a, 2);
            return;
        }
        lzn0 lzn0Var = (lzn0) this.a;
        if (((zgh1) this.b).a) {
            str = oon1.l(str);
        }
        lzn0Var.a(str, tv80Var, (Bundle) null);
    }

    public dlg1(dmh1 dmh1Var, mr20 mr20Var) {
        this.a = dmh1Var;
        this.b = mr20Var;
        this.c = w3p1.o(new l4r(hvm.a, 1, kei1.h, new j4r(kei1.t), kei1.i), kei1.X);
    }

    public dlg1(hsq hsqVar, h7l0 h7l0Var) {
        this.a = hsqVar;
        this.b = h7l0Var;
        this.c = new idd1(new j4f1(this, (byte) 16));
    }

    public /* synthetic */ dlg1(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public dlg1(t4h1 t4h1Var) {
        this.c = t4h1Var;
        this.a = v8r.q(Boolean.FALSE);
    }
}
