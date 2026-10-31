package p;

import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.download.esperanto.proto.EsDownload$VideoBandwidthResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import retrofit2.HttpException;
import spotify.autodownload.esperanto.proto.SetEpisodeLimitResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vrg implements Function, Predicate, Init, Function3, Function5, BiFunction, zbr, np80 {
    public final /* synthetic */ byte a;
    public static final vrg b = new vrg(1);
    public static final vrg c = new vrg(2);
    public static final vrg d = new vrg(3);
    public static final vrg e = new vrg(4);
    public static final vrg f = new vrg(5);
    public static final vrg g = new vrg(6);
    public static final vrg h = new vrg(7);
    public static final vrg i = new vrg(8);
    public static final vrg t = new vrg(9);
    public static final vrg X = new vrg(10);
    public static final vrg Y = new vrg(11);
    public static final vrg Z = new vrg(12);
    public static final vrg N0 = new vrg(13);
    public static final vrg O0 = new vrg(14);
    public static final vrg P0 = new vrg(15);
    public static final vrg Q0 = new vrg(16);
    public static final vrg R0 = new vrg(17);
    public static final vrg S0 = new vrg(18);
    public static final vrg T0 = new vrg(19);
    public static final vrg U0 = new vrg(20);
    public static final vrg V0 = new vrg(21);
    public static final vrg W0 = new vrg(22);
    public static final vrg X0 = new vrg(23);
    public static final vrg Y0 = new vrg(24);
    public static final vrg Z0 = new vrg(25);
    public static final vrg a1 = new vrg(26);
    public static final vrg b1 = new vrg(27);
    public static final vrg c1 = new vrg(28);
    public static final vrg d1 = new vrg(29);

    public /* synthetic */ vrg(byte b2) {
        this.a = b2;
    }

    public static long b(b0k b0kVar) {
        return eah.e(b0kVar, 40);
    }

    public static hw61 c(b0k b0kVar) {
        return px61.b(b0kVar, 4);
    }

    public static long e(b0k b0kVar) {
        return u7h.b(eah.e(b0kVar, 30), 0.32f, 0.0f, 0.0f, 0.0f, 14);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x0143  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public void a(qim0 qim0Var, float f2, float f3, hw61 hw61Var, long j, b0k b0kVar, final int i2, final int i3) {
        qim0 qim0Var2;
        int i4;
        float f4;
        int i5;
        float f5;
        int i6;
        long j2;
        int i7;
        boolean z;
        final hw61 hw61Var2;
        final qim0 qim0Var3;
        final float f6;
        final float f7;
        final long j3;
        h311 h311VarV;
        qim0 qim0Var4;
        float f8;
        hw61 hw61Var3;
        int i8;
        qim0 qim0Var5;
        float f9;
        hw61 hw61Var4;
        float f10;
        long jE;
        String strQ;
        boolean zG;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1364277227);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i4 = i2 | (x340Var.g(qim0Var2) ? 4 : 2);
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 = i4 | 48;
            f4 = f2;
        } else {
            f4 = f2;
            i5 = i4 | (x340Var.d(f4) ? 32 : 16);
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i6 = i5 | 384;
            f5 = f3;
        } else {
            f5 = f3;
            i6 = i5 | (x340Var.d(f5) ? 256 : 128);
        }
        int i12 = i6 | 1024;
        if ((i3 & 16) == 0) {
            j2 = j;
            int i13 = x340Var.f(j2) ? 16384 : 8192;
            i7 = i12 | i13;
            if ((i7 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i7 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0 || x340Var.E()) {
                    if (i9 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i10 != 0) {
                        f8 = 32.0f;
                    } else {
                        f8 = f4;
                    }
                    if (i11 != 0) {
                        f5 = 4.0f;
                    }
                    hw61Var3 = ((mx61) x340Var.k(px61.a)).e;
                    i8 = i7 & (-7169);
                    if ((i3 & 16) != 0) {
                        qim0Var5 = qim0Var4;
                        f9 = f8;
                        hw61Var4 = hw61Var3;
                        f10 = f5;
                        i8 = i7 & (-64513);
                        jE = eah.e(x340Var, 19);
                    } else {
                        qim0Var5 = qim0Var4;
                        f9 = f8;
                        hw61Var4 = hw61Var3;
                        f10 = f5;
                        jE = j2;
                    }
                } else {
                    x340Var.b0();
                    int i14 = i7 & (-7169);
                    if ((i3 & 16) != 0) {
                        i14 = i7 & (-64513);
                    }
                    qim0Var5 = qim0Var2;
                    f9 = f4;
                    jE = j2;
                    hw61Var4 = hw61Var;
                    i8 = i14;
                    f10 = f5;
                }
                x340Var.s();
                strQ = bno1.q(x340Var, 2131957933);
                pxg1 pxg1Var = ly71.a;
                qim0 qim0VarZ = uyn1.z(0.0f, 22.0f, 1, qim0Var5);
                zG = x340Var.g(strQ);
                objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new jfa(strQ, (byte) 1);
                    x340Var.s0(objT);
                }
                w3d1.a(s161.b(qim0VarZ, false, (iu30) objT), hw61Var4, jE, 0L, 0.0f, 0.0f, (qqb) null, apo.r(-1039573072, new awb(f9, f10), x340Var), x340Var, 12582912 | ((i8 >> 6) & 896), 120);
                hw61Var2 = hw61Var4;
                j3 = jE;
                f7 = f10;
                qim0Var3 = qim0Var5;
                f6 = f9;
            } else {
                x340Var.b0();
                hw61Var2 = hw61Var;
                qim0Var3 = qim0Var2;
                f6 = f4;
                f7 = f5;
                j3 = j2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.zvb
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.a.a(qim0Var3, f6, f7, hw61Var2, j3, (b0k) obj, czo1.p(i2 | 1), i3);
                        return rih1.a;
                    }
                };
            }
        }
        j2 = j;
        i7 = i12 | i13;
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i7 & 1, z)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i10 != 0) {
                    f8 = 32.0f;
                } else {
                    f8 = f4;
                }
                if (i11 != 0) {
                    f5 = 4.0f;
                }
                hw61Var3 = ((mx61) x340Var.k(px61.a)).e;
                i8 = i7 & (-7169);
                if ((i3 & 16) != 0) {
                    qim0Var5 = qim0Var4;
                    f9 = f8;
                    hw61Var4 = hw61Var3;
                    f10 = f5;
                    i8 = i7 & (-64513);
                    jE = eah.e(x340Var, 19);
                } else {
                    qim0Var5 = qim0Var4;
                    f9 = f8;
                    hw61Var4 = hw61Var3;
                    f10 = f5;
                    jE = j2;
                }
            } else {
                if (i9 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i10 != 0) {
                    f8 = 32.0f;
                } else {
                    f8 = f4;
                }
                if (i11 != 0) {
                    f5 = 4.0f;
                }
                hw61Var3 = ((mx61) x340Var.k(px61.a)).e;
                i8 = i7 & (-7169);
                if ((i3 & 16) != 0) {
                    qim0Var5 = qim0Var4;
                    f9 = f8;
                    hw61Var4 = hw61Var3;
                    f10 = f5;
                    i8 = i7 & (-64513);
                    jE = eah.e(x340Var, 19);
                } else {
                    qim0Var5 = qim0Var4;
                    f9 = f8;
                    hw61Var4 = hw61Var3;
                    f10 = f5;
                    jE = j2;
                }
            }
            x340Var.s();
            strQ = bno1.q(x340Var, 2131957933);
            pxg1 pxg1Var2 = ly71.a;
            qim0 qim0VarZ2 = uyn1.z(0.0f, 22.0f, 1, qim0Var5);
            zG = x340Var.g(strQ);
            objT = x340Var.T();
            if (zG) {
                objT = new jfa(strQ, (byte) 1);
                x340Var.s0(objT);
            } else {
                objT = new jfa(strQ, (byte) 1);
                x340Var.s0(objT);
            }
            w3d1.a(s161.b(qim0VarZ2, false, (iu30) objT), hw61Var4, jE, 0L, 0.0f, 0.0f, (qqb) null, apo.r(-1039573072, new awb(f9, f10), x340Var), x340Var, 12582912 | ((i8 >> 6) & 896), 120);
            hw61Var2 = hw61Var4;
            j3 = jE;
            f7 = f10;
            qim0Var3 = qim0Var5;
            f6 = f9;
        } else {
            x340Var.b0();
            hw61Var2 = hw61Var;
            qim0Var3 = qim0Var2;
            f6 = f4;
            f7 = f5;
            j3 = j2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.zvb
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.a(qim0Var3, f6, f7, hw61Var2, j3, (b0k) obj, czo1.p(i2 | 1), i3);
                    return rih1.a;
                }
            };
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public Object apply(Object obj) throws HttpException {
        switch (this.a) {
            case 1:
                return new ar(((Boolean) obj).booleanValue());
            case 2:
                th8 th8Var = (th8) obj;
                if (!(th8Var instanceof mh8)) {
                    return Single.just(th8Var);
                }
                return Single.error(new IllegalStateException("AuthClient Authentication -- Failed with " + th8Var));
            case 3:
            case 6:
            case 7:
            case grn1.d /* 12 */:
            case 13:
            case 14:
            case 15:
            case 17:
            case 18:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
            default:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
            case 4:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof yh90) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 5:
                return Boolean.valueOf(((ck4) obj).d);
            case 8:
                return new yd8((String) obj);
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return SetEpisodeLimitResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.autodownload.esperanto.proto.SetEpisodeLimitResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 10:
                return Boolean.valueOf(((zib) obj) instanceof yib);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                sy21 sy21Var = (sy21) obj;
                if (!sy21Var.a.Q0) {
                    throw new HttpException(sy21Var);
                }
                Object obj3 = sy21Var.b;
                obj3.getClass();
                return (xn40) obj3;
            case 16:
                return new joh((ace0) obj);
            case 19:
                da61 da61Var = (da61) obj;
                return new z23(da61Var.a, da61Var.c);
            case 21:
                return (g331) ((feh) obj).e(j561.W0, mpi1.V0);
            case 22:
                return t3p1.D((nwq0) obj);
            case 23:
                return PlayerState.EMPTY;
            case 24:
                spq0 spq0Var = (spq0) obj;
                return Boolean.valueOf(spq0Var.c() && ((l0l) spq0Var.b()).getType() == f0u.Z);
            case 25:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsDownload$VideoBandwidthResponse.o(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.VideoBandwidthResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
        }
    }

    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new imb1(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (u2h) obj4, ((Boolean) obj5).booleanValue(), ((Boolean) obj3).booleanValue());
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 6:
                fa6 fa6Var = (fa6) obj;
                return fa6Var.e ? First.c(fa6.a(fa6Var, (y86) null, false, false, (String) null, (String) null, false, (String) null, (String) null, 2031), Collections.singleton(new l56(jzn1.t(fa6Var.c), (String) null))) : First.b(fa6Var);
            default:
                return First.b((r9f) obj);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new yvg1((Boolean) obj, (Boolean) obj2, (Integer) obj3);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return ((PlayerState) obj).track().c();
            case 7:
                return !((uv00) obj).f;
            case 17:
                return ((spq0) obj).c();
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 18:
                return new mmr0((pdm) obj, (PlayerState) obj2);
            default:
                return new suy(((Number) ((spq0) obj).b()).longValue(), (PlayerState) obj2);
        }
    }
}
