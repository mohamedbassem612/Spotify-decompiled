package p;

import android.graphics.Path;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gtv0 implements Function, Predicate, BiFunction, y830, chc, jgg1 {
    public final /* synthetic */ byte a;
    public static final gtv0 b = new gtv0((byte) 0);
    public static final gtv0 c = new gtv0((byte) 1);
    public static final gtv0 d = new gtv0((byte) 2);
    public static final gtv0 e = new gtv0((byte) 3);
    public static final gtv0 f = new gtv0((byte) 4);
    public static final gtv0 g = new gtv0((byte) 5);
    public static final gtv0 h = new gtv0((byte) 6);
    public static final gtv0 i = new gtv0((byte) 8);
    public static final /* synthetic */ gtv0 t = new gtv0((byte) 9);
    public static final /* synthetic */ gtv0 X = new gtv0((byte) 23);

    public gtv0(yaz0 yaz0Var) {
        this.a = (byte) 18;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    public static dzy c(PlayerState playerState) {
        dzy dzyVarD;
        dzy dzyVar;
        String str = (String) playerState.track().i(bx8.i).e("");
        if ("queue".equals(str)) {
            dzyVarD = dzy.T0;
        } else {
            String strH0 = ihc1.H0(str, "mft-lens/");
            dzyVarD = (!nhc1.Y(strH0, "mft/", false) || strH0.equals("mft/context_switch") || strH0.equals("mft/inject_filler_tracks/future")) ? dzy.r1 : dzy.c1;
        }
        dzy dzyVar2 = dzy.r1;
        if (dzyVarD == dzyVar2) {
            spq0 spq0VarTrack = playerState.track();
            boolean zContains = playerState.restrictions().disallowTogglingShuffleReasons().contains("mft_disallow");
            ContextTrack contextTrack = (ContextTrack) spq0VarTrack.h();
            if (contextTrack == null) {
                dzyVarD = dzyVar2;
            } else {
                if (l4o1.E(contextTrack)) {
                    dzyVarD = dzy.f;
                } else if (l4o1.V(contextTrack) || n3o1.s(contextTrack) || (zContains && l4o1.J(contextTrack))) {
                    dzyVarD = dzy.c1;
                } else if (l4o1.I(contextTrack)) {
                    dzyVarD = l4o1.P(contextTrack) ? dzy.X0 : dzy.S0;
                } else {
                    dzyVarD = dzyVar2;
                }
                if (dzyVarD == null) {
                    dzyVarD = dzyVar2;
                }
            }
            if (dzyVarD == dzyVar2) {
                String strViewUri = playerState.playOrigin().viewUri();
                if (strViewUri != null) {
                    dzyVarD = d(strViewUri);
                }
                if (dzyVarD == dzyVar2) {
                    if (o4p1.u(playerState)) {
                        dzyVarD = dzy.N0;
                    } else {
                        String strContextUri = playerState.contextUri();
                        j380 j380VarContextMetadata = playerState.contextMetadata();
                        blc0 blc0Var = blc0.TRACK;
                        Set set = s4b1.f;
                        if (blc0Var == uic.x(strContextUri).c) {
                            dzyVarD = dzy.d1;
                        } else {
                            s4b1 s4b1VarX = uic.x(strContextUri);
                            v5b1 v5b1Var = s4b1VarX.d;
                            jxu0 jxu0Var = v5b1Var instanceof jxu0 ? (jxu0) v5b1Var : null;
                            if (jxu0Var != null) {
                                dzyVar = u890.j(jxu0Var.a, "listening-party") ? dzy.R0 : dzy.U0;
                            } else {
                                int iOrdinal = s4b1VarX.c.ordinal();
                                if (iOrdinal == 189) {
                                    dzyVar = dzy.j1;
                                } else if (iOrdinal == 190) {
                                    dzyVar = dzy.k1;
                                } else if (iOrdinal == 192) {
                                    dzyVar = dzy.l1;
                                } else if (iOrdinal == 283) {
                                    dzyVar = dzy.Z;
                                } else if (iOrdinal == 478) {
                                    dzyVar = dzy.N0;
                                } else if (iOrdinal == 496) {
                                    dzyVar = dzy.R0;
                                } else if (iOrdinal == 757) {
                                    dzyVar = dzy.e1;
                                } else if (iOrdinal == 844 || iOrdinal == 860) {
                                    if (Boolean.parseBoolean((String) j380VarContextMetadata.get("is_audiobook"))) {
                                        dzyVar = dzy.t;
                                    } else {
                                        dzyVar = "video".equals(j380VarContextMetadata.get("media.type")) ? dzy.b1 : dzy.a1;
                                    }
                                } else if (iOrdinal != 900) {
                                    switch (iOrdinal) {
                                        case 752:
                                            dzyVar = dzy.h;
                                            break;
                                        case 753:
                                            dzyVar = dzy.X;
                                            break;
                                        case 754:
                                            dzyVar = dzy.P0;
                                            break;
                                        case 755:
                                            dzyVar = dzy.W0;
                                            break;
                                        default:
                                            dzyVar = dzyVar2;
                                            break;
                                    }
                                } else {
                                    dzyVar = dzy.Y0;
                                }
                            }
                            dzyVarD = dzyVar != dzyVar2 ? dzyVar : d(strContextUri);
                        }
                    }
                    if (dzyVarD == dzyVar2) {
                        dzyVarD = (dzy) dzy.e.get(playerState.playOrigin().featureIdentifier().toLowerCase(Locale.US));
                        if (dzyVarD == null) {
                            dzyVarD = dzyVar2;
                        }
                    }
                }
            }
        }
        switch (dzyVarD.ordinal()) {
            case 39:
                return dzy.g1;
            case 40:
                return dzy.h1;
            case 41:
                return dzy.i1;
            case 42:
                return dzy.j1;
            case PlaylistDecorationPolicy.EXTENSION_FIELD_NUMBER /* 43 */:
                return dzy.m1;
            case PlaylistDecorationPolicy.LENSES_FIELD_NUMBER /* 44 */:
                return dzy.k1;
            default:
                return dzyVarD;
        }
    }

    public static dzy d(String str) {
        if (nik1.M.a(str)) {
            return dzy.g;
        }
        if (nik1.C.a(str)) {
            return dzy.P0;
        }
        if (nik1.z.a(str)) {
            return dzy.X;
        }
        if (nik1.A.a(str)) {
            return dzy.h;
        }
        if (nik1.B.a(str)) {
            return dzy.e1;
        }
        if (nik1.D.a(str)) {
            return dzy.W0;
        }
        if (u890.j(nik1.y0.a, str)) {
            return dzy.Y0;
        }
        if (nik1.x.a(str)) {
            return dzy.P0;
        }
        if (nik1.u.a(str)) {
            return dzy.X;
        }
        if (nik1.v.a(str)) {
            return dzy.h;
        }
        if (nik1.w.a(str)) {
            return dzy.e1;
        }
        if (nik1.y.a(str)) {
            return dzy.W0;
        }
        if (nik1.t.a(str)) {
            return dzy.Z;
        }
        if (nik1.s.a(str)) {
            return dzy.Y0;
        }
        if (nik1.N.a(str)) {
            return dzy.i;
        }
        if (nik1.F.a(str) || nik1.K.a(str) || nik1.J.a(str)) {
            return dzy.U0;
        }
        if (nik1.L.a(str)) {
            return dzy.V0;
        }
        if (nik1.q.a(str)) {
            return dzy.Z0;
        }
        if (nik1.P.a(str)) {
            return dzy.o1;
        }
        if (u890.j(nik1.p2.a, str) || nik1.O.a(str)) {
            return dzy.n1;
        }
        if (nik1.Q.a(str)) {
            return dzy.p1;
        }
        if (u890.j(nik1.s2.a, str)) {
            return dzy.q1;
        }
        if (u890.j(nik1.y2.a, str)) {
            return dzy.j1;
        }
        if (u890.j(nik1.x2.a, str)) {
            return dzy.k1;
        }
        if (u890.j(nik1.w2.a, str)) {
            return dzy.l1;
        }
        if (u890.j(nik1.z0.a, str)) {
            return dzy.Q0;
        }
        if (u890.j(nik1.A0.a, str)) {
            return dzy.O0;
        }
        return (u890.j(nik1.t2.a, str) || nik1.R.a(str)) ? dzy.f1 : dzy.r1;
    }

    public static s8s0 e(File file) {
        String str = s8s0.b;
        String string = file.toString();
        rhc rhcVar = c.a;
        nac nacVar = new nac();
        nacVar.Y(string);
        return c.d(nacVar, false);
    }

    public static s8s0 f(String str) {
        rhc rhcVar = c.a;
        nac nacVar = new nac();
        nacVar.Y(str);
        return c.d(nacVar, false);
    }

    public static String g(eyh0 eyh0Var) {
        f0i0 f0i0VarF = eyh0Var.f();
        if (f0i0VarF == null) {
            n57.e("Controller Info is Null");
        }
        String strA = f0i0VarF.a();
        if (strA == null) {
            n57.e("Calling package name is Null");
        }
        return strA;
    }

    public static btl1 h() {
        return (btl1) lcl1.N0.invoke(ctl1.b);
    }

    public static Path i(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    public static acg j(String str) {
        acg acgVar = new acg(str);
        acg.d.put(str, acgVar);
        return acgVar;
    }

    public static voe1 k() {
        return new voe1(o9x0.R0.j());
    }

    public byte[] a(int i2, byte[] bArr, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                return new eao((int) ((Number) obj2).longValue(), ((Boolean) obj).booleanValue());
            default:
                bbz0 bbz0Var = (bbz0) obj;
                zaz0 zaz0Var = (zaz0) obj2;
                int iOrdinal = zaz0Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        return bbz0.a(bbz0Var, zaz0Var, null, null, 16379);
                    }
                    eg.o();
                    return null;
                }
                int i2 = bbz0Var.b;
                zaz0 zaz0Var2 = zaz0.a;
                if (i2 != 2) {
                    return bbz0.a(bbz0Var, zaz0Var2, null, null, 16379);
                }
                Set set = bbz0Var.k;
                abz0 abz0Var = abz0.c;
                return bbz0.a(bbz0Var, zaz0Var2, dm61.u0(abz0Var, bbz0Var.j), dm61.u0(abz0Var, set), 14843);
        }
    }

    public synchronized acg b(String str) {
        acg acgVar;
        String strConcat;
        try {
            LinkedHashMap linkedHashMap = acg.d;
            acgVar = (acg) linkedHashMap.get(str);
            if (acgVar == null) {
                if (nhc1.Y(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = nhc1.Y(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                acgVar = (acg) linkedHashMap.get(strConcat);
                if (acgVar == null) {
                    acgVar = new acg(str);
                }
                linkedHashMap.put(str, acgVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return acgVar;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return ((t020) obj).equals(r020.a);
            case 5:
                return ((th61) obj).b;
            default:
                return ((PlayerState) obj).track().c();
        }
    }

    public /* synthetic */ gtv0(byte b2) {
        this.a = b2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(nhc1.Y((String) obj, "opt-in-trial", false));
            case 1:
                return new e331(new hka1((ConfigurationResponse) obj));
            case 6:
                return ((th61) obj).a;
            default:
                return ((qgp1) obj).b();
        }
    }
}
