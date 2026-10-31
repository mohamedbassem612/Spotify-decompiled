package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.websocket.esperanto.proto.EsWebsocketEvent;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.PinResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jcx0 implements Function, Predicate, BiFunction, Init, t2n, com.spotify.mobius.functions.Function, y190, vjm1 {
    public final /* synthetic */ byte a;
    public static final jcx0 b = new jcx0(0);
    public static final jcx0 c = new jcx0(1);
    public static final jcx0 d = new jcx0(2);
    public static final jcx0 e = new jcx0(3);
    public static final jcx0 f = new jcx0(4);
    public static final jcx0 g = new jcx0(5);
    public static final jcx0 h = new jcx0(6);
    public static final jcx0 i = new jcx0(7);
    public static final jcx0 t = new jcx0(8);
    public static final jcx0 X = new jcx0(9);
    public static final jcx0 Y = new jcx0(10);
    public static final jcx0 Z = new jcx0(11);
    public static final jcx0 N0 = new jcx0(12);
    public static final jcx0 O0 = new jcx0(13);
    public static final jcx0 P0 = new jcx0(14);
    public static final jcx0 Q0 = new jcx0(15);
    public static final jcx0 R0 = new jcx0(16);
    public static final jcx0 S0 = new jcx0(17);
    public static final jcx0 T0 = new jcx0(18);
    public static final jcx0 U0 = new jcx0(19);
    public static final jcx0 V0 = new jcx0(20);
    public static final jcx0 W0 = new jcx0(21);
    public static final jcx0 X0 = new jcx0(22);
    public static final jcx0 Y0 = new jcx0(23);
    public static final jcx0 Z0 = new jcx0(24);
    public static final jcx0 a1 = new jcx0(25);
    public static final jcx0 b1 = new jcx0(26);

    public /* synthetic */ jcx0(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #3 {, blocks: (B:11:0x0018, B:15:0x0022, B:23:0x0036, B:29:0x004b, B:21:0x0031, B:18:0x002d, B:26:0x0047), top: B:44:0x0018, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public dp5 a() {
        dp5 dp5Var;
        dp5 dp5Var2 = null;
        if (dhn.a.contains(dp5.class)) {
            dp5Var = null;
        } else {
            try {
                dp5Var = dp5.d;
            } catch (Throwable th) {
                dhn.a(dp5.class, th);
                dp5Var = null;
            }
        }
        if (dp5Var != null) {
            return dp5Var;
        }
        synchronized (this) {
            if (!wf10.q.get()) {
                return null;
            }
            if (dhn.a.contains(dp5.class)) {
                if (dp5Var2 == null) {
                    dp5Var2 = new dp5((byte) 0);
                    if (!dhn.a.contains(dp5.class)) {
                        try {
                            dp5.d = dp5Var2;
                        } catch (Throwable th2) {
                            dhn.a(dp5.class, th2);
                        }
                    }
                }
                return dp5Var2;
            }
            try {
                dp5Var2 = dp5.d;
            } catch (Throwable th3) {
                dhn.a(dp5.class, th3);
            }
            if (dp5Var2 == null) {
                dp5Var2 = new dp5((byte) 0);
                if (!dhn.a.contains(dp5.class)) {
                    dp5.d = dp5Var2;
                }
            }
            return dp5Var2;
            throw th;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new ebe0((eww0) obj);
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    return new hrn0(huy0.class, aqr0.a, new c6w0(1, false, (hd5) null, 14));
                }
                return crn0.a;
            case 2:
                return new py01((Throwable) obj);
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 12:
            case 15:
            case 19:
            case 21:
            default:
                return Boolean.valueOf(((PinResponse) obj).p() == d2t0.d);
            case 6:
                return Observable.fromIterable(((vqx0) obj).a);
            case 9:
                return Boolean.valueOf(((xs61) obj).a);
            case 10:
                iam iamVar = ((tv00) obj).b;
                iamVar.getClass();
                return iamVar;
            case 11:
                return ((qq81) obj).e;
            case 13:
                return ((jdu0) obj).a;
            case 14:
                return ((Boolean) obj).booleanValue() ? d3a1.a : c3a1.a;
            case 16:
                return ((Boolean) obj).booleanValue() ? new ofc1(1) : new ofc1(2);
            case 17:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Transport unavailable";
                }
                return new y0f1(message);
            case 18:
                return ((ContextTrack) ((PlayerState) obj).track().b()).uri();
            case 20:
                if (((Boolean) obj).booleanValue()) {
                    return new frn0((Bundle) null, kii1.class);
                }
                Logger.d("Feature is disabled, won't navigate to feature.", new Object[0]);
                Set set = s4b1.f;
                return new ern0(uic.x(nik1.z0.a));
            case 22:
                return new xrk1((l0l) ((spq0) obj).h());
            case 23:
                return ((EsWebsocketEvent.WebSocketEvent) obj).toByteArray();
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 5:
                return First.b((yi21) obj);
            default:
                bmg1 bmg1Var = (bmg1) obj;
                return First.c(bmg1Var, u890.j(bmg1Var.h, fmg1.a) ? Collections.singleton(llg1.b) : w7x.a);
        }
    }

    public v190 findValueByNumber(int i2) {
        return d01.a(i2);
    }

    public Object g(Object obj) {
        return Float.valueOf(((uz21) obj).f());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    public qwa j(String str, int i2, int i3, int i4, Map map) {
        int i5;
        char c2;
        int i6;
        int i7;
        int i8;
        owa owaVarD;
        int i9;
        int i10;
        int iAbs;
        owa owaVarW;
        int i11;
        int i12;
        LinkedList linkedListA;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        EnumMap enumMap = (EnumMap) map;
        qax qaxVar = qax.b;
        if (enumMap.containsKey(qaxVar)) {
            charsetForName = Charset.forName(enumMap.get(qaxVar).toString());
        }
        qax qaxVar2 = qax.a;
        int i13 = enumMap.containsKey(qaxVar2) ? Integer.parseInt(enumMap.get(qaxVar2).toString()) : 33;
        qax qaxVar3 = qax.t;
        int i14 = enumMap.containsKey(qaxVar3) ? Integer.parseInt(enumMap.get(qaxVar3).toString()) : 0;
        int i15 = 1;
        if (i2 != 1) {
            hhg1.n("Can only encode AZTEC, but got ".concat(l1d.D(i2)));
            return null;
        }
        byte[] bytes = str.getBytes(charsetForName);
        List<nob1> listSingletonList = Collections.singletonList(nob1.e);
        int i16 = 0;
        while (true) {
            int i17 = 4;
            i5 = 2;
            c2 = '\n';
            i6 = 5;
            i7 = 3;
            if (i16 >= bytes.length) {
                break;
            }
            int i18 = i16 + 1;
            byte b2 = i18 < bytes.length ? bytes[i18] : (byte) 0;
            byte b3 = bytes[i16];
            if (b3 != 13) {
                if (b3 != 44) {
                    if (b3 != 46) {
                        if (b3 != 58 || b2 != 32) {
                            i6 = 0;
                        }
                    } else if (b2 == 32) {
                        i6 = 3;
                    } else {
                        i6 = 0;
                    }
                } else if (b2 == 32) {
                    i6 = 4;
                } else {
                    i6 = 0;
                }
            } else if (b2 == 10) {
                i6 = 2;
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                LinkedList linkedList = new LinkedList();
                for (nob1 nob1Var : listSingletonList) {
                    nob1 nob1VarB = nob1Var.b(i16);
                    linkedList.add(nob1VarB.d(4, i6));
                    if (nob1Var.a != 4) {
                        linkedList.add(nob1VarB.e(4, i6));
                    }
                    if (i6 == 3 || i6 == 4) {
                        linkedList.add(nob1VarB.d(2, 16 - i6).d(2, i15));
                    }
                    if (nob1Var.c > 0) {
                        linkedList.add(nob1Var.a(i16).a(i18));
                    }
                }
                linkedListA = f960.a(linkedList);
                i12 = i15;
                i16 = i18;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (nob1 nob1Var2 : listSingletonList) {
                    char c3 = (char) (bytes[i16] & 255);
                    int[][] iArr = f960.c;
                    int i19 = nob1Var2.a;
                    int i20 = iArr[i19][c3] > 0 ? i15 : 0;
                    nob1 nob1VarB2 = null;
                    int i21 = 0;
                    while (i21 <= i17) {
                        int i22 = i15;
                        int i23 = iArr[i21][c3];
                        if (i23 > 0) {
                            if (nob1VarB2 == null) {
                                nob1VarB2 = nob1Var2.b(i16);
                            }
                            if (i20 == 0 || i21 == i19 || i21 == 2) {
                                linkedList2.add(nob1VarB2.d(i21, i23));
                            }
                            if (i20 == 0 && f960.d[i19][i21] >= 0) {
                                linkedList2.add(nob1VarB2.e(i21, i23));
                            }
                        }
                        i21++;
                        i15 = i22;
                        i17 = 4;
                    }
                    int i24 = i15;
                    if (nob1Var2.c > 0 || iArr[i19][c3] == 0) {
                        linkedList2.add(nob1Var2.a(i16));
                    }
                    i15 = i24;
                    i17 = 4;
                }
                i12 = i15;
                linkedListA = f960.a(linkedList2);
            }
            listSingletonList = linkedListA;
            i16++;
            i15 = i12;
        }
        int i25 = i15;
        nob1 nob1Var3 = (nob1) Collections.min(listSingletonList, new cvt((byte) 12));
        nob1Var3.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (uze1 uze1Var = nob1Var3.b(bytes.length).b; uze1Var != null; uze1Var = uze1Var.a) {
            linkedList3.addFirst(uze1Var);
        }
        owa owaVar = new owa();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((uze1) it.next()).a(owaVar, bytes);
        }
        int i26 = owaVar.b;
        int iJ = ywx0.j(i26, i13, 100, 11);
        int i27 = i26 + iJ;
        int[] iArr2 = rqg0.c;
        if (i14 != 0) {
            i10 = i14 < 0 ? i25 : 0;
            iAbs = Math.abs(i14);
            if (iAbs > (i10 != 0 ? 4 : 32)) {
                hhg1.n(gvg.e(i14, "Illegal value ", " for layers"));
                return null;
            }
            i8 = ((i10 != 0 ? 88 : 112) + (iAbs << 4)) * iAbs;
            i9 = iArr2[iAbs];
            int i28 = i8 - (i8 % i9);
            owaVarD = rqg0.D(owaVar, i9);
            int i29 = owaVarD.b;
            if (iJ + i29 > i28) {
                hhg1.n("Data to large for user specified layer");
                return null;
            }
            if (i10 != 0 && i29 > (i9 << 6)) {
                hhg1.n("Data to large for user specified layer");
                return null;
            }
        } else {
            owa owaVarD2 = null;
            int i30 = 0;
            int i31 = 0;
            while (true) {
                if (i30 > 32) {
                    hhg1.n("Data too large for an Aztec code");
                    return null;
                }
                int i32 = i30 <= i7 ? i25 : 0;
                int i33 = i32 != 0 ? i30 + 1 : i30;
                int i34 = ((i32 != 0 ? 88 : 112) + (i33 << 4)) * i33;
                if (i27 <= i34) {
                    if (owaVarD2 == null || i31 != iArr2[i33]) {
                        int i35 = iArr2[i33];
                        owaVarD2 = rqg0.D(owaVar, i35);
                        i31 = i35;
                    }
                    int i36 = i34 - (i34 % i31);
                    if ((i32 == 0 || owaVarD2.b <= (i31 << 6)) && owaVarD2.b + iJ <= i36) {
                        i8 = i34;
                        owaVarD = owaVarD2;
                        i9 = i31;
                        i10 = i32;
                        iAbs = i33;
                        break;
                    }
                }
                i30++;
                i6 = i6;
                c2 = c2;
                i5 = i5;
                i7 = 3;
            }
        }
        owa owaVarW2 = rqg0.w(owaVarD, i8, i9);
        int i37 = owaVarD.b / i9;
        owa owaVar2 = new owa();
        if (i10 != 0) {
            owaVar2.b(iAbs - 1, i5);
            owaVar2.b(i37 - 1, 6);
            owaVarW = rqg0.w(owaVar2, 28, 4);
        } else {
            owaVar2.b(iAbs - 1, i6);
            owaVar2.b(i37 - 1, 11);
            owaVarW = rqg0.w(owaVar2, 40, 4);
        }
        int i38 = (i10 == 0 ? 14 : 11) + (iAbs << 2);
        int[] iArr3 = new int[i38];
        if (i10 != 0) {
            for (int i39 = 0; i39 < i38; i39++) {
                iArr3[i39] = i39;
            }
            i11 = i38;
        } else {
            int i40 = i38 / 2;
            i11 = (((i40 - 1) / 15) * i5) + i38 + 1;
            int i41 = i11 / 2;
            for (int i42 = 0; i42 < i40; i42++) {
                int i43 = (i42 / 15) + i42;
                iArr3[(i40 - i42) - 1] = (i41 - i43) - 1;
                iArr3[i40 + i42] = i43 + i41 + 1;
            }
        }
        qwa qwaVar = new qwa(i11, i11);
        int i44 = 0;
        int i45 = 0;
        while (i44 < iAbs) {
            int i46 = ((iAbs - i44) << i5) + (i10 != 0 ? 9 : 12);
            for (int i47 = 0; i47 < i46; i47++) {
                int i48 = i47 << 1;
                int i49 = 0;
                while (i49 < i5) {
                    int i50 = i5;
                    if (owaVarW2.e(i45 + i48 + i49)) {
                        int i51 = i44 << 1;
                        qwaVar.b(iArr3[i51 + i49], iArr3[i51 + i47]);
                    }
                    if (owaVarW2.e((i46 << 1) + i45 + i48 + i49)) {
                        int i52 = i44 << 1;
                        qwaVar.b(iArr3[i52 + i47], iArr3[((i38 - 1) - i52) - i49]);
                    }
                    if (owaVarW2.e((i46 << 2) + i45 + i48 + i49)) {
                        int i53 = (i38 - 1) - (i44 << 1);
                        qwaVar.b(iArr3[i53 - i49], iArr3[i53 - i47]);
                    }
                    if (owaVarW2.e((i46 * 6) + i45 + i48 + i49)) {
                        int i54 = i44 << 1;
                        qwaVar.b(iArr3[((i38 - 1) - i54) - i47], iArr3[i54 + i49]);
                    }
                    i49++;
                    i5 = i50;
                }
            }
            i45 += i46 << 3;
            i44++;
            i5 = i5;
        }
        int i55 = i11 / 2;
        if (i10 != 0) {
            for (int i56 = 0; i56 < 7; i56++) {
                int i57 = (i55 - 3) + i56;
                if (owaVarW.e(i56)) {
                    qwaVar.b(i57, i55 - 5);
                }
                if (owaVarW.e(i56 + 7)) {
                    qwaVar.b(i55 + 5, i57);
                }
                if (owaVarW.e(20 - i56)) {
                    qwaVar.b(i57, i55 + 5);
                }
                if (owaVarW.e(27 - i56)) {
                    qwaVar.b(i55 - 5, i57);
                }
            }
        } else {
            for (int i58 = 0; i58 < 10; i58++) {
                int i59 = (i58 / 5) + (i55 - 5) + i58;
                if (owaVarW.e(i58)) {
                    qwaVar.b(i59, i55 - 7);
                }
                if (owaVarW.e(i58 + 10)) {
                    qwaVar.b(i55 + 7, i59);
                }
                if (owaVarW.e(29 - i58)) {
                    qwaVar.b(i59, i55 + 7);
                }
                if (owaVarW.e(39 - i58)) {
                    qwaVar.b(i55 - 7, i59);
                }
            }
        }
        if (i10 != 0) {
            rqg0.v(qwaVar, i55, 5);
        } else {
            rqg0.v(qwaVar, i55, 7);
            int i60 = 0;
            int i61 = 0;
            while (i60 < (i38 / 2) - 1) {
                for (int i62 = i55 & 1; i62 < i11; i62 += 2) {
                    int i63 = i55 - i61;
                    qwaVar.b(i63, i62);
                    int i64 = i55 + i61;
                    qwaVar.b(i64, i62);
                    qwaVar.b(i62, i63);
                    qwaVar.b(i62, i64);
                }
                i60 += 15;
                i61 += 16;
            }
        }
        int i65 = qwaVar.a;
        int iMax = Math.max(200, i65);
        int i66 = qwaVar.b;
        int iMax2 = Math.max(200, i66);
        int iMin = Math.min(iMax / i65, iMax2 / i66);
        int i67 = (iMax - (i65 * iMin)) / 2;
        int i68 = (iMax2 - (i66 * iMin)) / 2;
        qwa qwaVar2 = new qwa(iMax, iMax2);
        int i69 = 0;
        while (i69 < i66) {
            int i70 = i67;
            int i71 = 0;
            while (i71 < i65) {
                if (qwaVar.a(i71, i69)) {
                    qwaVar2.d(i70, i68, iMin, iMin);
                }
                i71++;
                i70 += iMin;
            }
            i69++;
            i68 += iMin;
        }
        return qwaVar2;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return !((uv00) obj).f;
            default:
                spq0 spq0Var = (spq0) obj;
                return spq0Var.c() && !l4o1.G((ContextTrack) spq0Var.b());
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                return new mmr0((PlayerState) obj, (Boolean) obj2);
            case 12:
                return new mmr0((String) obj, (Boolean) obj2);
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ivq0 ivq0Var = ivq0.c;
                if (!zBooleanValue && bool.booleanValue()) {
                    ivq0Var = ivq0.a;
                }
                return new hvq0(ivq0Var, true);
        }
    }
}
