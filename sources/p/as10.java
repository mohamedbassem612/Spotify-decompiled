package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.home.explicitfeedback.proto.FeedbackList;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.esperanto.proto.EsContextPlayerError;
import com.spotify.player.model.PlayerState;
import com.spotify.profileconfig.proto.v1.AvatarsResponse;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class as10 implements Function, s2i1, Init, Predicate, jue0, BiFunction {
    public final /* synthetic */ byte a;
    public static final as10 b = new as10(0);
    public static final as10 c = new as10(1);
    public static final as10 d = new as10(2);
    public static final as10 e = new as10(3);
    public static final as10 f = new as10(4);
    public static final as10 g = new as10(5);
    public static final as10 h = new as10(6);
    public static final as10 i = new as10(7);
    public static final as10 t = new as10(8);
    public static final as10 X = new as10(9);
    public static final as10 Y = new as10(10);
    public static final as10 Z = new as10(11);
    public static final as10 N0 = new as10(12);
    public static final as10 O0 = new as10(14);
    public static final as10 P0 = new as10(15);
    public static final as10 Q0 = new as10(16);
    public static final as10 R0 = new as10(17);
    public static final as10 S0 = new as10(18);
    public static final as10 T0 = new as10(19);
    public static final as10 U0 = new as10(20);
    public static final as10 V0 = new as10(21);
    public static final as10 W0 = new as10(22);
    public static final as10 X0 = new as10(23);
    public static final as10 Y0 = new as10(24);
    public static final as10 Z0 = new as10(25);
    public static final as10 a1 = new as10(26);
    public static final as10 b1 = new as10(27);
    public static final as10 c1 = new as10(28);
    public static final as10 d1 = new as10(29);

    public /* synthetic */ as10(byte b2) {
        this.a = b2;
    }

    public static j4e1 d(long j, long j2, long j3, long j4, long j5, long j6, b0k b0kVar, int i2) {
        long j7 = u7h.k;
        long j8 = (i2 & 16384) != 0 ? j7 : j6;
        dah dahVar = (dah) ((x340) b0kVar).k(eah.a);
        j4e1 j4e1VarB = dahVar.e0;
        if (j4e1VarB == null) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(390452338);
            x340Var.r(false);
            j4e1VarB = null;
        } else {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(390452339);
            rce1 rce1Var = (rce1) x340Var2.k(sce1.a);
            if (!u890.j(j4e1VarB.k, rce1Var)) {
                j4e1VarB = j4e1.b(j4e1VarB, rce1Var);
                dahVar.e0 = j4e1VarB;
            }
            x340Var2.r(false);
        }
        if (j4e1VarB == null) {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(-1788321191);
            long jD = eah.d(dahVar, 18);
            long jD2 = eah.d(dahVar, 18);
            long jB = u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14);
            long jD3 = eah.d(dahVar, 18);
            long j9 = u7h.j;
            j4e1 j4e1Var = new j4e1(jD, jD2, jB, jD3, j9, j9, j9, j9, eah.d(dahVar, 26), eah.d(dahVar, 2), (rce1) x340Var3.k(sce1.a), eah.d(dahVar, 26), eah.d(dahVar, 24), u7h.b(eah.d(dahVar, 18), 0.12f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 2), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 19), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 2), eah.d(dahVar, 26), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 2), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 19), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 2), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 19), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 19), eah.d(dahVar, 19), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 19), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, 19));
            dahVar.e0 = j4e1Var;
            x340Var3.r(false);
            j4e1VarB = j4e1Var;
        } else {
            x340 x340Var4 = (x340) b0kVar;
            x340Var4.i0(-1788515437);
            x340Var4.r(false);
        }
        return j4e1VarB.a(j, j7, j7, j7, j2, j3, j7, j7, j7, j7, (rce1) null, j4, j5, j7, j8, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7);
    }

    public static Set e(boolean z, boolean z2, boolean z3, boolean z4) {
        return dm61.B0(new aq21[]{new zp21(nbw0.class), new yp21(xkk1.class), new yp21(jo70.class), z3 ? new yp21(yo60.class) : new zp21(yo60.class), new yp21(prl.class), new yp21(hzy.class), z4 ? new zp21(mtl.class) : null, z ? new yp21(e2k1.class) : null, z2 ? new yp21(l1z.class) : null});
    }

    public static /* synthetic */ Set f(int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            z4 = false;
        }
        return e(z, z2, z3, z4);
    }

    public boolean a(Exception exc, String str, Object[] objArr) {
        return false;
    }

    public Object apply(Object obj) {
        h290 h290VarN;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                return th instanceof FileNotFoundException ? Single.just(FeedbackList.p()) : Single.error(th);
            case 1:
                return mq3.a;
            case 2:
            case 3:
            case 6:
            case 8:
            case 10:
            case 13:
            case 17:
            case 20:
            case 23:
            default:
                return Boolean.valueOf(y7y0.G((Map) obj));
            case 4:
                return new cu60(vs60.b);
            case 5:
                return Boolean.valueOf(y7y0.t("apply-child-content-restrictions", (Map) obj));
            case 7:
                AvatarsResponse avatarsResponse = (AvatarsResponse) ((sy21) obj).b;
                if (avatarsResponse != null && (h290VarN = avatarsResponse.n()) != null) {
                    return o7h.a1(h290VarN, new cvt((byte) 22));
                }
                eg.m("No avatars found");
                return null;
            case 9:
                return Boolean.valueOf(((r0e0) obj).f == 2);
            case 11:
                return new waf0(((Boolean) obj).booleanValue());
            case 12:
                li8 li8Var = (mi8) obj;
                if (li8Var instanceof ki8) {
                    eg.m("Failed to obtain plan manager authblob");
                    return null;
                }
                if (li8Var instanceof li8) {
                    return li8Var.a.c;
                }
                eg.o();
                return null;
            case 14:
                return ((PlayerState) obj).contextUri();
            case 15:
                Boolean bool = (Boolean) o7h.s0(((CollectionPlatformEsperantoContainsResponse) obj).o().p());
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 16:
                return new wuo0((q1a1) obj);
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline.BulkRedownloadPreflightResponse.u(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.BulkRedownloadPreflightResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 19:
                return ((EsOfflinePlugin.DownloadResponse) obj).toByteArray();
            case 21:
                return Boolean.valueOf(!yto.j((String) obj));
            case 22:
                return ((RecentlyPlayedResponse) ((mmr0) obj).a).getItems();
            case 24:
                Logger.d(((EsContextPlayerError.ContextPlayerError) obj).getMessage(), new Object[0]);
                return Observable.empty();
            case 25:
                return ((PlayerState) obj).playbackId();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0199  */
    /* JADX WARN: Code duplicated, block: B:103:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd A[PHI: r0 r5 r8
      0x00dd: PHI (r0v30 int) = (r0v14 int), (r0v32 int) binds: [B:82:0x00f1, B:72:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x00dd: PHI (r5v13 p.qim0) = (r5v10 p.qim0), (r5v16 p.qim0) binds: [B:82:0x00f1, B:72:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x00dd: PHI (r8v10 float) = (r8v7 float), (r8v11 float) binds: [B:82:0x00f1, B:72:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0117  */
    /* JADX WARN: Code duplicated, block: B:88:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x014d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0155  */
    /* JADX WARN: Code duplicated, block: B:94:0x0157  */
    /* JADX WARN: Code duplicated, block: B:96:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x0193  */
    public void b(boolean z, boolean z2, idn0 idn0Var, qim0 qim0Var, j4e1 j4e1Var, hw61 hw61Var, float f2, float f3, b0k b0kVar, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        int i5;
        int i6;
        float f4;
        float f5;
        boolean z3;
        qim0 qim0Var3;
        float f6;
        float f7;
        h311 h311VarV;
        boolean zBooleanValue;
        long jC;
        n8b1 n8b1VarW;
        tob1 tob1VarS;
        n8b1 n8b1VarW2;
        tob1 tob1VarS2;
        long j;
        float f8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1035477640);
        int i7 = (x340Var.h(z) ? 4 : 2) | i2 | (x340Var.h(z2) ? 32 : 16) | (x340Var.g(idn0Var) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                qim0Var2 = qim0Var;
                i7 |= x340Var.g(qim0Var2) ? 2048 : 1024;
            }
            if (x340Var.g(j4e1Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            int i9 = i7 | i4;
            if (x340Var.g(hw61Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i6 = i9 | i5;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    f4 = f2;
                    int i10 = x340Var.d(f4) ? 1048576 : 524288;
                    i6 |= i10;
                } else {
                    f4 = f2;
                }
                i6 |= i10;
            } else {
                f4 = f2;
            }
            if ((12582912 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    f5 = f3;
                    int i11 = x340Var.d(f5) ? 8388608 : 4194304;
                    i6 |= i11;
                } else {
                    f5 = f3;
                }
                i6 |= i11;
            } else {
                f5 = f3;
            }
            if ((38347923 & i6) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i6 & 1, z3)) {
                x340Var.d0();
                if ((i2 & 1) != 0 || x340Var.E()) {
                    if (i8 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                        f6 = 2.0f;
                    } else {
                        f6 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i6 &= -29360129;
                        f7 = 1.0f;
                    }
                    x340Var.s();
                    zBooleanValue = ((Boolean) e6p1.g(idn0Var, x340Var, (i6 >> 6) & 14).getValue()).booleanValue();
                    jC = j4e1Var.c(z, z2, zBooleanValue);
                    n8b1VarW = t890.w(x340Var, 5);
                    if (z) {
                        x340Var.i0(-1674507999);
                        tob1VarS = w191.a(jC, n8b1VarW, (String) null, x340Var, 0, 12);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1674427244);
                        tob1VarS = v8r.s(new u7h(jC), x340Var);
                        x340Var.r(false);
                    }
                    tob1 tob1Var = tob1VarS;
                    n8b1VarW2 = t890.w(x340Var, 2);
                    if (z) {
                        x340Var.i0(-1674245832);
                        if (zBooleanValue) {
                            f8 = f6;
                        } else {
                            f8 = f7;
                        }
                        tob1VarS2 = z95.a(f8, n8b1VarW2, (String) null, x340Var, 0, 12);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1674063769);
                        tob1VarS2 = v8r.s(new p3v(f7), x340Var);
                        x340Var.r(false);
                    }
                    ven0 ven0VarS = v8r.s(k1u.d(((p3v) tob1VarS2.getValue()).a, ((u7h) tob1Var.getValue()).a), x340Var);
                    if (!z) {
                        j = j4e1Var.g;
                    } else if (z2) {
                        j = j4e1Var.h;
                    } else if (zBooleanValue) {
                        j = j4e1Var.e;
                    } else {
                        j = j4e1Var.f;
                    }
                    x340 x340Var2 = x340Var;
                    tob1 tob1VarA = w191.a(j, t890.w(x340Var, 5), (String) null, x340Var2, 0, 12);
                    x340Var = x340Var2;
                    qqb qqbVar = (qqb) ven0VarS.getValue();
                    t1c.a(exd0.r(d1u.F(qim0Var3, qqbVar.a, qqbVar.b, hw61Var), new gub0(hw61Var, new ml70(new i1w(tob1VarA, tob1.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 11), (byte) 1), (byte) 24)), x340Var, 0);
                } else {
                    x340Var.b0();
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i6 &= -29360129;
                    }
                    qim0Var3 = qim0Var2;
                    f6 = f4;
                }
                f7 = f5;
                x340Var.s();
                zBooleanValue = ((Boolean) e6p1.g(idn0Var, x340Var, (i6 >> 6) & 14).getValue()).booleanValue();
                jC = j4e1Var.c(z, z2, zBooleanValue);
                n8b1VarW = t890.w(x340Var, 5);
                if (z) {
                    x340Var.i0(-1674507999);
                    tob1VarS = w191.a(jC, n8b1VarW, (String) null, x340Var, 0, 12);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1674427244);
                    tob1VarS = v8r.s(new u7h(jC), x340Var);
                    x340Var.r(false);
                }
                tob1 tob1Var2 = tob1VarS;
                n8b1VarW2 = t890.w(x340Var, 2);
                if (z) {
                    x340Var.i0(-1674245832);
                    if (zBooleanValue) {
                        f8 = f6;
                    } else {
                        f8 = f7;
                    }
                    tob1VarS2 = z95.a(f8, n8b1VarW2, (String) null, x340Var, 0, 12);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1674063769);
                    tob1VarS2 = v8r.s(new p3v(f7), x340Var);
                    x340Var.r(false);
                }
                ven0 ven0VarS2 = v8r.s(k1u.d(((p3v) tob1VarS2.getValue()).a, ((u7h) tob1Var2.getValue()).a), x340Var);
                if (!z) {
                    j = j4e1Var.g;
                } else if (z2) {
                    j = j4e1Var.h;
                } else if (zBooleanValue) {
                    j = j4e1Var.e;
                } else {
                    j = j4e1Var.f;
                }
                x340 x340Var3 = x340Var;
                tob1 tob1VarA2 = w191.a(j, t890.w(x340Var, 5), (String) null, x340Var3, 0, 12);
                x340Var = x340Var3;
                qqb qqbVar2 = (qqb) ven0VarS2.getValue();
                t1c.a(exd0.r(d1u.F(qim0Var3, qqbVar2.a, qqbVar2.b, hw61Var), new gub0(hw61Var, new ml70(new i1w(tob1VarA2, tob1.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 11), (byte) 1), (byte) 24)), x340Var, 0);
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                f6 = f4;
                f7 = f5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ktq0(this, z, z2, idn0Var, qim0Var3, j4e1Var, hw61Var, f6, f7, i2, i3);
            }
        }
        i7 |= 3072;
        qim0Var2 = qim0Var;
        if (x340Var.g(j4e1Var)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i12 = i7 | i4;
        if (x340Var.g(hw61Var)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        i6 = i12 | i5;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                f4 = f2;
                if (x340Var.d(f4)) {
                }
                i6 |= i10;
            } else {
                f4 = f2;
            }
            i6 |= i10;
        } else {
            f4 = f2;
        }
        if ((12582912 & i2) == 0) {
            if ((i3 & 128) == 0) {
                f5 = f3;
                if (x340Var.d(f5)) {
                }
                i6 |= i11;
            } else {
                f5 = f3;
            }
            i6 |= i11;
        } else {
            f5 = f3;
        }
        if ((38347923 & i6) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i6 & 1, z3)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    f6 = 2.0f;
                } else {
                    f6 = f4;
                }
                if ((i3 & 128) != 0) {
                    i6 &= -29360129;
                    f7 = 1.0f;
                } else {
                    f7 = f5;
                }
            } else {
                if (i8 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    f6 = 2.0f;
                } else {
                    f6 = f4;
                }
                if ((i3 & 128) != 0) {
                    i6 &= -29360129;
                    f7 = 1.0f;
                } else {
                    f7 = f5;
                }
            }
            x340Var.s();
            zBooleanValue = ((Boolean) e6p1.g(idn0Var, x340Var, (i6 >> 6) & 14).getValue()).booleanValue();
            jC = j4e1Var.c(z, z2, zBooleanValue);
            n8b1VarW = t890.w(x340Var, 5);
            if (z) {
                x340Var.i0(-1674507999);
                tob1VarS = w191.a(jC, n8b1VarW, (String) null, x340Var, 0, 12);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-1674427244);
                tob1VarS = v8r.s(new u7h(jC), x340Var);
                x340Var.r(false);
            }
            tob1 tob1Var3 = tob1VarS;
            n8b1VarW2 = t890.w(x340Var, 2);
            if (z) {
                x340Var.i0(-1674245832);
                if (zBooleanValue) {
                    f8 = f6;
                } else {
                    f8 = f7;
                }
                tob1VarS2 = z95.a(f8, n8b1VarW2, (String) null, x340Var, 0, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(-1674063769);
                tob1VarS2 = v8r.s(new p3v(f7), x340Var);
                x340Var.r(false);
            }
            ven0 ven0VarS3 = v8r.s(k1u.d(((p3v) tob1VarS2.getValue()).a, ((u7h) tob1Var3.getValue()).a), x340Var);
            if (!z) {
                j = j4e1Var.g;
            } else if (z2) {
                j = j4e1Var.h;
            } else if (zBooleanValue) {
                j = j4e1Var.e;
            } else {
                j = j4e1Var.f;
            }
            x340 x340Var4 = x340Var;
            tob1 tob1VarA3 = w191.a(j, t890.w(x340Var, 5), (String) null, x340Var4, 0, 12);
            x340Var = x340Var4;
            qqb qqbVar3 = (qqb) ven0VarS3.getValue();
            t1c.a(exd0.r(d1u.F(qim0Var3, qqbVar3.a, qqbVar3.b, hw61Var), new gub0(hw61Var, new ml70(new i1w(tob1VarA3, tob1.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 11), (byte) 1), (byte) 24)), x340Var, 0);
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            f6 = f4;
            f7 = f5;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ktq0(this, z, z2, idn0Var, qim0Var3, j4e1Var, hw61Var, f6, f7, i2, i3);
        }
    }

    public void c(String str, vu30 vu30Var, boolean z, boolean z2, elk1 elk1Var, idn0 idn0Var, boolean z3, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, vu30 vu30Var5, j4e1 j4e1Var, vzq0 vzq0Var, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        vzq0 vzq0Var2;
        vzq0 zzq0Var;
        int i4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1732281618);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.i(vu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.g(elk1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.g(idn0Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= b0kVar3.h(z3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= b0kVar3.i((Object) null) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= b0kVar3.i(vu30Var2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= b0kVar3.i((Object) null) ? 536870912 : 268435456;
        }
        int i5 = 1024;
        int i6 = 14155776 | (b0kVar3.i(vu30Var3) ? 4 : 2) | (b0kVar3.i(vu30Var4) ? 32 : 16) | (b0kVar3.i((Object) null) ? 256 : 128);
        if (b0kVar3.i(vu30Var5)) {
            i5 = 2048;
        }
        int i7 = i6 | i5 | (b0kVar3.g(j4e1Var) ? 16384 : 8192) | 65536;
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (4793491 & i7) == 4793490) ? false : true)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
                i4 = i7 & (-458753);
            } else {
                b0kVar3.b0();
                i4 = i7 & (-458753);
                zzq0Var = vzq0Var;
            }
            b0kVar3.s();
            boolean z4 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object objT = b0kVar3.T();
            if (z4 || objT == fkj0.X) {
                objT = elk1Var.d(new af5(str));
                b0kVar3.s0(objT);
            }
            String str2 = ((cgg1) objT).a.b;
            w5e1 w5e1Var = new w5e1();
            b0kVar3.i0(1927058812);
            b0kVar3.r(false);
            int i8 = i3 >> 9;
            int i9 = i4 << 21;
            b0kVar2 = b0kVar3;
            i3p1.f(2, str2, vu30Var, w5e1Var, (xu30) null, vu30Var2, (vu30) null, vu30Var3, vu30Var4, vu30Var5, z2, z, z3, idn0Var, zzq0Var, j4e1Var, j2iVar, b0kVar2, ((i3 << 3) & 896) | 6 | (i8 & 458752) | (i8 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), (i3 & 896) | ((i4 >> 9) & 14) | ((i3 >> 6) & 112) | (i8 & 7168) | ((i3 >> 3) & 57344) | ((i4 << 6) & 3670016) | 12582912);
            vzq0Var2 = zzq0Var;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            vzq0Var2 = vzq0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ltq0(this, str, vu30Var, z, z2, elk1Var, idn0Var, z3, vu30Var2, vu30Var3, vu30Var4, vu30Var5, j4e1Var, vzq0Var2, j2iVar, i2);
        }
    }

    public First e0(Object obj) {
        return First.b((qb50) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        int i2 = 0;
        switch (this.a) {
            case 2:
                String str3 = (String) linkedHashMap.get("session_id");
                if (str3 == null) {
                    return null;
                }
                return new la40(str3, str2, str, xkg0Var);
            case 6:
                return new m6a0(xkg0Var, str2, str);
            case 23:
                return new vst0(xkg0Var, str2, str);
            case 26:
                String str4 = (String) linkedHashMap.get("playlist_id");
                if (str4 == null || str4.length() != 22) {
                    return null;
                }
                int length = str4.length();
                while (i2 < length) {
                    char cCharAt = str4.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new vxu0(str4, xkg0Var, str2, str);
            default:
                String str5 = (String) linkedHashMap.get("playlist_id");
                if (str5 == null || str5.length() != 22) {
                    return null;
                }
                int length2 = str5.length();
                while (i2 < length2) {
                    char cCharAt2 = str5.charAt(i2);
                    if (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && ('0' > cCharAt2 || cCharAt2 >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new xxu0(str5, xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                return !jfv.o(((jfv) obj).a);
            default:
                return ((ln41) obj) instanceof kn41;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0((PlayerState) obj, (Map) obj2);
    }
}
