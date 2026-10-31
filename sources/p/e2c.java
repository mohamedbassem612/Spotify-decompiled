package p;

import android.util.Pair;
import androidx.media3.common.ParserException;
import app.p000rive.semantics.SemanticState;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class e2c {
    public static final byte[] a;

    static {
        String str = zoi1.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(izr0 izr0Var) {
        int i = izr0Var.b;
        izr0Var.S(4);
        if (izr0Var.q() != 1751411826) {
            i += 4;
        }
        izr0Var.R(i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:196:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:265:0x0562  */
    /* JADX WARN: Code duplicated, block: B:277:0x0589  */
    /* JADX WARN: Code duplicated, block: B:283:0x0596  */
    /* JADX WARN: Code duplicated, block: B:357:0x069a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0158  */
    public static void b(izr0 izr0Var, int i, int i2, int i3, int i4, String str, boolean z, x8v x8vVar, b2c b2cVar, int i5) throws ParserException {
        int iL;
        int iQ;
        int I;
        int iRound;
        int iG;
        x8v x8vVarA;
        String str2;
        String str3;
        int i6;
        String str4;
        bg11 bg11VarT;
        int i7;
        int i8;
        String str5;
        int i9;
        int i10;
        int i11;
        bg11 bg11VarT2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean zF;
        int iG2;
        int iG3;
        int i17;
        int i18;
        boolean z2;
        boolean zF2;
        int i19;
        int iG4;
        String str6;
        izr0 izr0Var2 = izr0Var;
        int iIntValue = i;
        int i20 = i3;
        izr0Var2.R(i2 + 16);
        if (z) {
            iL = izr0Var2.L();
            izr0Var2.S(6);
        } else {
            izr0Var2.S(8);
            iL = 0;
        }
        int i21 = 4;
        int i22 = 2;
        if (iL == 0 || iL == 1) {
            i21 = 4;
            int iL2 = izr0Var2.L();
            izr0Var2.S(6);
            int iF = izr0Var2.F();
            izr0Var2.R(izr0Var2.b - 4);
            iQ = izr0Var2.q();
            if (iL == 1) {
                izr0Var2.S(16);
            }
            I = iL2;
            iRound = iF;
            iG = -1;
        } else {
            if (iL != 2) {
                return;
            }
            izr0Var2.S(16);
            iRound = (int) Math.round(Double.longBitsToDouble(izr0Var2.y()));
            I = izr0Var2.I();
            izr0Var2.S(4);
            int I2 = izr0Var2.I();
            int I3 = izr0Var2.I();
            boolean z3 = (I3 & 1) != 0;
            boolean z4 = (I3 & 2) != 0;
            iG = z3 ? zoi1.G(I2, z4 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN) : zoi1.I(I2, z4 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            if (iG == 0) {
                iG = -1;
            }
            izr0Var2.S(8);
            iQ = 0;
        }
        if (iIntValue == 1767992678) {
            iRound = -1;
            I = -1;
        } else {
            if (iIntValue != 1935764850) {
                iRound = iIntValue == 1935767394 ? mpd.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            }
            I = 1;
        }
        int i23 = izr0Var2.b;
        if (iIntValue == 1701733217) {
            Pair pairH = h(izr0Var2, i2, i20);
            if (pairH != null) {
                iIntValue = ((Integer) pairH.first).intValue();
                x8vVarA = x8vVar == null ? null : x8vVar.a(((dnf1) pairH.second).b);
                ((dnf1[]) b2cVar.c)[i5] = (dnf1) pairH.second;
            } else {
                x8vVarA = x8vVar;
            }
            izr0Var2.R(i23);
        } else {
            x8vVarA = x8vVar;
        }
        String str7 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue != 1936684916) {
            if (iIntValue == 1953984371) {
                iG = 268435456;
            } else if (iIntValue == 1819304813) {
                if (iG == -1) {
                    iG = i22;
                }
            } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                str2 = "audio/mpeg";
            } else if (iIntValue == 1835557169) {
                str2 = "audio/mha1";
            } else if (iIntValue == 1835560241) {
                str2 = "audio/mhm1";
            } else if (iIntValue == 1634492771) {
                str2 = "audio/alac";
            } else if (iIntValue == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (iIntValue == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (iIntValue == 1332770163) {
                str2 = "audio/opus";
            } else if (iIntValue == 1716281667) {
                str2 = "audio/flac";
            } else if (iIntValue == 1835823201) {
                str2 = "audio/true-hd";
            } else {
                str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
            }
            str2 = "audio/raw";
        } else {
            iG = i22;
            str2 = "audio/raw";
        }
        z1c z1cVar = null;
        String strF = null;
        bg11 bg11VarT3 = null;
        x1c x1cVar = null;
        while (i23 - i2 < i20) {
            izr0Var2.R(i23);
            int iQ2 = izr0Var2.q();
            iG = iG;
            jto1.q("childAtomSize must be positive", iQ2 > 0);
            int iQ3 = izr0Var2.q();
            strF = strF;
            if (iQ3 == 1835557187) {
                izr0Var2.R(i23 + 8);
                izr0Var2.S(1);
                int iE = izr0Var2.E();
                izr0Var2.S(1);
                strF = Objects.equals(str2, str7) ? String.format("mhm1.%02X", Integer.valueOf(iE)) : String.format("mha1.%02X", Integer.valueOf(iE));
                int iL3 = izr0Var2.L();
                byte[] bArr = new byte[iL3];
                str3 = str2;
                izr0Var2.o(0, bArr, iL3);
                bg11VarT3 = bg11VarT3 == null ? b380.t(bArr) : b380.u(bArr, (byte[]) bg11VarT3.get(0));
            } else {
                str3 = str2;
                if (iQ3 == 1835557200) {
                    izr0Var2.R(i23 + 8);
                    int iE2 = izr0Var2.E();
                    if (iE2 > 0) {
                        byte[] bArr2 = new byte[iE2];
                        izr0Var2.o(0, bArr2, iE2);
                        bg11VarT3 = bg11VarT3 == null ? b380.t(bArr2) : b380.u((byte[]) bg11VarT3.get(0), bArr2);
                    }
                    strF = strF;
                } else {
                    if (iQ3 == 1702061171) {
                        i6 = 1702061171;
                    } else if (z && iQ3 == 2002876005) {
                        i6 = 1702061171;
                    } else if (iQ3 == 1651798644) {
                        izr0Var2.R(i23 + 8);
                        izr0Var2.S(i21);
                        str4 = str7;
                        z1cVar = z1cVar;
                        strF = strF;
                        x1cVar = new x1c(izr0Var2.G(), izr0Var2.G());
                        i23 = i23;
                        bg11VarT = bg11VarT3;
                        iG = iG;
                        i8 = iQ2;
                        iIntValue = iIntValue;
                    } else {
                        i8 = iQ2;
                        str4 = str7;
                        int[] iArr = sj1.d;
                        int[] iArr2 = sj1.b;
                        if (iQ3 == 1684103987) {
                            izr0Var2.R(i23 + 8);
                            String string = Integer.toString(i4);
                            bae baeVar = new bae();
                            baeVar.k(izr0Var2);
                            int i24 = iArr2[baeVar.g(i22)];
                            baeVar.o(8);
                            int i25 = iArr[baeVar.g(3)];
                            if (baeVar.g(1) != 0) {
                                i25++;
                            }
                            int i26 = sj1.e[baeVar.g(5)] * 1000;
                            baeVar.c();
                            izr0Var2.R(baeVar.d());
                            ge30 ge30Var = new ge30();
                            ge30Var.a = string;
                            ge30Var.o = asj0.p("audio/ac3");
                            ge30Var.I = i25;
                            ge30Var.K = i24;
                            ge30Var.s = x8vVarA;
                            ge30Var.d = str;
                            ge30Var.i = i26;
                            ge30Var.j = i26;
                            b2cVar.d = new ie30(ge30Var);
                            iIntValue = iIntValue;
                            i10 = I;
                            bg11VarT = bg11VarT3;
                        } else if (iQ3 == 1684366131) {
                            izr0Var2.R(i23 + 8);
                            String string2 = Integer.toString(i4);
                            bae baeVar2 = new bae();
                            baeVar2.k(izr0Var2);
                            int iG5 = baeVar2.g(13) * 1000;
                            baeVar2.o(3);
                            int i27 = iArr2[baeVar2.g(2)];
                            baeVar2.o(10);
                            int i28 = iArr[baeVar2.g(3)];
                            if (baeVar2.g(1) != 0) {
                                i28++;
                            }
                            baeVar2.o(3);
                            int iG6 = baeVar2.g(4);
                            baeVar2.o(1);
                            int i29 = i28;
                            if (iG6 > 0) {
                                baeVar2.o(6);
                                i28 = baeVar2.g(1) != 0 ? i29 + 2 : i29;
                                baeVar2.o(1);
                            }
                            bg11VarT = bg11VarT3;
                            if (baeVar2.b() > 7) {
                                baeVar2.o(7);
                                if (baeVar2.g(1) != 0) {
                                    str6 = "audio/eac3-joc";
                                } else {
                                    str6 = "audio/eac3";
                                }
                            } else {
                                str6 = "audio/eac3";
                            }
                            baeVar2.c();
                            izr0Var2.R(baeVar2.d());
                            ge30 ge30Var2 = new ge30();
                            ge30Var2.a = string2;
                            ge30Var2.o = asj0.p(str6);
                            ge30Var2.I = i28;
                            ge30Var2.K = i27;
                            ge30Var2.s = x8vVarA;
                            ge30Var2.d = str;
                            ge30Var2.j = iG5;
                            b2cVar.d = new ie30(ge30Var2);
                            iIntValue = iIntValue;
                            i10 = I;
                        } else {
                            bg11VarT = bg11VarT3;
                            if (iQ3 == 1684103988) {
                                izr0Var2.R(i23 + 8);
                                String string3 = Integer.toString(i4);
                                bae baeVar3 = new bae();
                                baeVar3.k(izr0Var2);
                                int iB = baeVar3.b();
                                int iG7 = baeVar3.g(3);
                                if (iG7 > 1) {
                                    throw ParserException.d("Unsupported AC-4 DSI version: " + iG7);
                                }
                                int iG8 = baeVar3.g(7);
                                int i30 = baeVar3.f() ? 48000 : 44100;
                                baeVar3.o(4);
                                int iG9 = baeVar3.g(9);
                                if (iG8 > 1) {
                                    if (iG7 == 0) {
                                        throw ParserException.d("Invalid AC-4 DSI version: " + iG7);
                                    }
                                    if (baeVar3.f()) {
                                        baeVar3.o(16);
                                        if (baeVar3.f()) {
                                            baeVar3.o(SemanticState.Focused);
                                        }
                                    }
                                }
                                if (iG7 == 1) {
                                    if (baeVar3.b() < 66) {
                                        throw ParserException.d("Invalid AC-4 DSI bitrate.");
                                    }
                                    baeVar3.o(66);
                                    baeVar3.c();
                                }
                                wa waVar = new wa();
                                waVar.f = true;
                                waVar.a = -1;
                                waVar.b = -1;
                                waVar.g = true;
                                waVar.c = 2;
                                waVar.d = 1;
                                waVar.e = 0;
                                int i31 = 0;
                                while (true) {
                                    if (i31 < iG9) {
                                        if (iG7 == 0) {
                                            i12 = iRound;
                                            zF = baeVar3.f();
                                            iG2 = baeVar3.g(5);
                                            iG3 = baeVar3.g(5);
                                            i17 = 0;
                                            i18 = 0;
                                            z2 = false;
                                        } else {
                                            int i32 = iG9;
                                            int iG10 = baeVar3.g(8);
                                            i12 = iRound;
                                            int iG11 = baeVar3.g(8);
                                            if (iG11 == 255) {
                                                iG11 = baeVar3.g(16) + iG11;
                                            }
                                            if (iG10 > 2) {
                                                baeVar3.o(iG11 * 8);
                                                i31++;
                                                iG9 = i32;
                                                iRound = i12;
                                            } else {
                                                int iB2 = (iB - baeVar3.b()) / 8;
                                                int i33 = iG11;
                                                int iG12 = baeVar3.g(5);
                                                z2 = iG12 == 31;
                                                iG2 = iG12;
                                                i18 = iB2;
                                                i17 = i33;
                                                iG3 = iG10;
                                                zF = false;
                                            }
                                        }
                                        waVar.d = iG3;
                                        i13 = I;
                                        if (zF || z2 || iG2 != 6) {
                                            waVar.e = baeVar3.g(3);
                                            if (baeVar3.f()) {
                                                baeVar3.o(5);
                                            }
                                            baeVar3.o(2);
                                            int i34 = 1;
                                            if (iG7 == 1 && (iG3 == 1 || iG3 == 2)) {
                                                baeVar3.o(2);
                                            }
                                            baeVar3.o(5);
                                            baeVar3.o(10);
                                            if (iG7 == 1) {
                                                if (iG3 > 0) {
                                                    waVar.f = baeVar3.f();
                                                }
                                                if (waVar.f) {
                                                    if (iG3 != 1) {
                                                        i19 = 2;
                                                        if (iG3 == 2) {
                                                            iG4 = baeVar3.g(5);
                                                            if (iG4 >= 0 && iG4 <= 15) {
                                                                waVar.a = iG4;
                                                            }
                                                            if (iG4 >= 11 || iG4 > 14) {
                                                                i19 = 2;
                                                            } else {
                                                                waVar.g = baeVar3.f();
                                                                i19 = 2;
                                                                waVar.c = baeVar3.g(2);
                                                            }
                                                        }
                                                    } else {
                                                        iG4 = baeVar3.g(5);
                                                        if (iG4 >= 0) {
                                                            waVar.a = iG4;
                                                        }
                                                        if (iG4 >= 11) {
                                                            i19 = 2;
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                    }
                                                    baeVar3.o(24);
                                                    i34 = 1;
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (iG3 == i34 || iG3 == i19) {
                                                    if (baeVar3.f() && baeVar3.f()) {
                                                        baeVar3.o(i19);
                                                    }
                                                    if (baeVar3.f()) {
                                                        baeVar3.n();
                                                        int i35 = 8;
                                                        int iG13 = baeVar3.g(8);
                                                        int i36 = 0;
                                                        while (i36 < iG13) {
                                                            baeVar3.o(i35);
                                                            i36++;
                                                            i35 = 8;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!zF && !z2) {
                                                baeVar3.n();
                                                if (iG2 == 0 || iG2 == 1 || iG2 == 2) {
                                                    if (iG3 == 0) {
                                                        for (int i37 = 0; i37 < 2; i37++) {
                                                            j82.K(baeVar3, waVar);
                                                        }
                                                    } else {
                                                        for (int i38 = 0; i38 < 2; i38++) {
                                                            j82.L(baeVar3, waVar);
                                                        }
                                                    }
                                                } else if (iG2 == 3 || iG2 == 4) {
                                                    if (iG3 == 0) {
                                                        for (int i39 = 0; i39 < 3; i39++) {
                                                            j82.K(baeVar3, waVar);
                                                        }
                                                    } else {
                                                        for (int i40 = 0; i40 < 3; i40++) {
                                                            j82.L(baeVar3, waVar);
                                                        }
                                                    }
                                                } else if (iG2 != 5) {
                                                    int iG14 = baeVar3.g(7);
                                                    for (int i41 = 0; i41 < iG14; i41++) {
                                                        baeVar3.o(8);
                                                    }
                                                } else if (iG3 == 0) {
                                                    j82.K(baeVar3, waVar);
                                                } else {
                                                    int iG15 = baeVar3.g(3);
                                                    for (int i42 = 0; i42 < iG15 + 2; i42++) {
                                                        j82.L(baeVar3, waVar);
                                                    }
                                                }
                                            } else if (iG3 == 0) {
                                                j82.K(baeVar3, waVar);
                                            } else {
                                                j82.L(baeVar3, waVar);
                                            }
                                            baeVar3.n();
                                            zF2 = baeVar3.f();
                                        } else {
                                            iG3 = iG3;
                                            zF2 = true;
                                        }
                                        if (zF2) {
                                            int iG16 = baeVar3.g(7);
                                            for (int i43 = 0; i43 < iG16; i43++) {
                                                baeVar3.o(15);
                                            }
                                        }
                                        if (iG3 <= 0) {
                                            i14 = 8;
                                        } else {
                                            if (baeVar3.f()) {
                                                if (baeVar3.b() < 66) {
                                                    throw ParserException.d("Can't parse bitrate DSI.");
                                                }
                                                baeVar3.o(66);
                                            }
                                            if (baeVar3.f()) {
                                                baeVar3.c();
                                                baeVar3.p(baeVar3.g(16));
                                                int iG17 = baeVar3.g(5);
                                                for (int i44 = 0; i44 < iG17; i44++) {
                                                    baeVar3.o(3);
                                                    baeVar3.o(8);
                                                }
                                                i14 = 8;
                                            } else {
                                                i14 = 8;
                                            }
                                        }
                                        baeVar3.c();
                                        if (iG7 == 1) {
                                            int iB3 = ((iB - baeVar3.b()) / 8) - i18;
                                            if (i17 < iB3) {
                                                throw ParserException.d("pres_bytes is smaller than presentation bytes read.");
                                            }
                                            baeVar3.p(i17 - iB3);
                                        }
                                        if (waVar.f && waVar.a == -1) {
                                            throw ParserException.d("Can't determine channel mode of presentation " + i31);
                                        }
                                    } else {
                                        iIntValue = iIntValue;
                                        i12 = iRound;
                                        i13 = I;
                                        i14 = 8;
                                    }
                                    int i45 = 12;
                                    if (waVar.f) {
                                        int i46 = waVar.a;
                                        boolean z5 = waVar.g;
                                        int i47 = waVar.c;
                                        switch (i46) {
                                            case 0:
                                                i15 = 11;
                                                i16 = 1;
                                                break;
                                            case 1:
                                                i15 = 11;
                                                i16 = 2;
                                                break;
                                            case 2:
                                                i15 = 11;
                                                i16 = 3;
                                                break;
                                            case 3:
                                                i15 = 11;
                                                i16 = 5;
                                                break;
                                            case 4:
                                                i15 = 11;
                                                i16 = 6;
                                                break;
                                            case 5:
                                            case 7:
                                            case 9:
                                                i15 = 11;
                                                i16 = 7;
                                                break;
                                            case 6:
                                            case 8:
                                            case 10:
                                                i16 = i14;
                                                i15 = 11;
                                                break;
                                            case 11:
                                                i15 = 11;
                                                i16 = 11;
                                                break;
                                            case 12:
                                                i16 = 12;
                                                i15 = 11;
                                                break;
                                            case 13:
                                                i15 = 11;
                                                i16 = 13;
                                                break;
                                            case 14:
                                                i15 = 11;
                                                i16 = 14;
                                                break;
                                            case 15:
                                                i15 = 11;
                                                i16 = 24;
                                                break;
                                            default:
                                                i15 = 11;
                                                i16 = -1;
                                                break;
                                        }
                                        if (i46 == i15 || i46 == 12 || i46 == 13 || i46 == 14) {
                                            if (!z5) {
                                                i16 -= 2;
                                            }
                                            if (i47 == 0) {
                                                i16 -= 4;
                                            } else if (i47 == 1) {
                                                i16 -= 2;
                                            }
                                        }
                                        i45 = i16;
                                    } else {
                                        int i48 = waVar.b;
                                        int i49 = waVar.e;
                                        if (i48 > 0) {
                                            int i50 = i48 + 1;
                                            if (i49 == 4 && i50 == 17) {
                                                i50 = 21;
                                            }
                                            i45 = i50;
                                        } else if (i49 == 0) {
                                            i45 = 2;
                                        } else if (i49 == 1) {
                                            i45 = 6;
                                        } else if (i49 == 2) {
                                            i45 = i14;
                                        } else if (i49 == 3) {
                                            i45 = 10;
                                        } else if (i49 != 4) {
                                            oon1.H("AC-4 level " + waVar.e + " has not been defined.");
                                            i45 = 2;
                                        }
                                    }
                                    if (i45 <= 0) {
                                        throw ParserException.d("Cannot determine channel count of presentation.");
                                    }
                                    Object[] objArr = {Integer.valueOf(iG8), Integer.valueOf(waVar.d), Integer.valueOf(waVar.e)};
                                    String str8 = zoi1.a;
                                    String str9 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                    ge30 ge30Var3 = new ge30();
                                    ge30Var3.a = string3;
                                    ge30Var3.o = asj0.p("audio/ac4");
                                    ge30Var3.I = i45;
                                    ge30Var3.K = i30;
                                    ge30Var3.s = x8vVarA;
                                    ge30Var3.d = str;
                                    ge30Var3.k = str9;
                                    b2cVar.d = new ie30(ge30Var3);
                                    iRound = i12;
                                    i10 = i13;
                                    iIntValue = iIntValue;
                                }
                            } else {
                                iIntValue = iIntValue;
                                iRound = iRound;
                                I = I;
                                i23 = i23;
                                if (iQ3 != 1684892784) {
                                    if (iQ3 == 1684305011 || iQ3 == 1969517683) {
                                        iIntValue = iIntValue;
                                        ge30 ge30Var4 = new ge30();
                                        ge30Var4.a = Integer.toString(i4);
                                        ge30Var4.o = asj0.p(str3);
                                        i10 = I;
                                        ge30Var4.I = i10;
                                        iRound = iRound;
                                        ge30Var4.K = iRound;
                                        ge30Var4.s = x8vVarA;
                                        ge30Var4.d = str;
                                        b2cVar.d = new ie30(ge30Var4);
                                    } else {
                                        if (iQ3 == 1682927731) {
                                            int i51 = i8 - 8;
                                            byte[] bArr3 = a;
                                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i51);
                                            izr0Var2.R(i23 + 8);
                                            izr0Var2.o(bArr3.length, bArrCopyOf, i51);
                                            bg11VarT2 = bs51.l(bArrCopyOf);
                                        } else if (iQ3 == 1684425825) {
                                            byte[] bArr4 = new byte[i8 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[2] = 97;
                                            bArr4[3] = 67;
                                            izr0Var2.R(i23 + 12);
                                            izr0Var2.o(4, bArr4, i8 - 12);
                                            bg11VarT2 = b380.t(bArr4);
                                        } else if (iQ3 == 1634492771) {
                                            int i52 = i8 - 12;
                                            byte[] bArr5 = new byte[i52];
                                            izr0Var2.R(i23 + 12);
                                            izr0Var2.o(0, bArr5, i52);
                                            byte[] bArr6 = kwg.a;
                                            izr0 izr0Var3 = new izr0(bArr5);
                                            izr0Var3.R(5);
                                            int iE3 = izr0Var3.E();
                                            izr0Var3.R(9);
                                            int iE4 = izr0Var3.E();
                                            izr0Var3.R(20);
                                            int[] iArr3 = {izr0Var3.I(), iE4, iE3};
                                            int i53 = iArr3[0];
                                            int i54 = iArr3[1];
                                            int i55 = iArr3[2];
                                            String str10 = zoi1.a;
                                            int I4 = zoi1.I(i55, ByteOrder.LITTLE_ENDIAN);
                                            if (I4 == 0) {
                                                I4 = -1;
                                            }
                                            iG = I4;
                                            iRound = i53;
                                            I = i54;
                                            bg11VarT = b380.t(bArr5);
                                            i8 = i8;
                                            i23 = i23;
                                            iIntValue = iIntValue;
                                            z1cVar = z1cVar;
                                            strF = strF;
                                        } else if (iQ3 == 1767990114) {
                                            izr0Var2.R(i23 + 9);
                                            int iJ = izr0Var2.J();
                                            byte[] bArr7 = new byte[iJ];
                                            izr0Var2.o(0, bArr7, iJ);
                                            byte[] bArr8 = kwg.a;
                                            izr0 izr0Var4 = new izr0(bArr7);
                                            String str11 = null;
                                            String strC = null;
                                            while (izr0Var4.a() > 0 && (str11 == null || strC == null)) {
                                                int iE5 = izr0Var4.E();
                                                int i56 = iE5 >> 3;
                                                boolean z6 = (iE5 & 2) != 0;
                                                boolean z7 = (iE5 & 1) != 0;
                                                int iJ2 = izr0Var4.J();
                                                if (i56 > 4 && i56 < 24 && z6) {
                                                    do {
                                                    } while ((izr0Var4.E() & SemanticState.Focused) != 0);
                                                    for (i11 = SemanticState.Focused; (izr0Var4.E() & i11) != 0; i11 = SemanticState.Focused) {
                                                    }
                                                }
                                                if (z7) {
                                                    izr0Var4.S(izr0Var4.J());
                                                }
                                                int i57 = izr0Var4.b + iJ2;
                                                if (i56 == 31) {
                                                    izr0Var4.S(4);
                                                    Object[] objArr2 = {Integer.valueOf(izr0Var4.E()), Integer.valueOf(izr0Var4.E())};
                                                    String str12 = zoi1.a;
                                                    str11 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                                } else {
                                                    if (i56 == 0) {
                                                        while ((izr0Var4.E() & SemanticState.Focused) != 0) {
                                                        }
                                                        strC = izr0Var4.C(4, StandardCharsets.UTF_8);
                                                        if (strC.equals("mp4a")) {
                                                            while ((izr0Var4.E() & SemanticState.Focused) != 0) {
                                                            }
                                                            izr0Var4.S(2);
                                                            bae baeVar4 = new bae();
                                                            baeVar4.k(izr0Var4);
                                                            int iG18 = baeVar4.g(5);
                                                            if (iG18 == 31) {
                                                                iG18 = baeVar4.g(6) + 32;
                                                            }
                                                            strC = l1d.k(iG18, strC, ".40.");
                                                        }
                                                        izr0Var4.R(i57);
                                                    }
                                                    izr0Var4.R(i57);
                                                }
                                                izr0Var4.R(i57);
                                            }
                                            strF = (str11 == null || strC == null) ? null : f4i1.f(str11, ".", strC);
                                            bg11VarT = b380.t(bArr7);
                                            iG = iG;
                                            iIntValue = iIntValue;
                                        } else if (iQ3 == 1885564227) {
                                            izr0Var2.R(i23 + 12);
                                            ByteOrder byteOrder = (izr0Var2.E() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int iE6 = izr0Var2.E();
                                            iIntValue = iIntValue;
                                            int I5 = iIntValue == 1768973165 ? zoi1.I(iE6, byteOrder) : iIntValue == 1718641517 ? zoi1.G(iE6, byteOrder) : iG;
                                            if (I5 == 0) {
                                                I5 = -1;
                                            }
                                            strF = strF;
                                            iG = I5;
                                            if (I5 != -1) {
                                                str3 = "audio/raw";
                                            }
                                        } else {
                                            iIntValue = iIntValue;
                                            iRound = iRound;
                                            i10 = I;
                                        }
                                        bg11VarT = bg11VarT2;
                                        iRound = iRound;
                                        I = I;
                                    }
                                    strF = strF;
                                    I = i10;
                                    i8 = i8;
                                    i23 = i23;
                                    z1cVar = z1cVar;
                                } else {
                                    if (iQ <= 0) {
                                        throw ParserException.a((RuntimeException) null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iQ);
                                    }
                                    iRound = iQ;
                                    I = 2;
                                }
                            }
                        }
                        strF = strF;
                        I = i10;
                        i8 = i8;
                        i23 = i23;
                        z1cVar = z1cVar;
                    }
                    int i58 = iQ2;
                    str4 = str7;
                    I = I;
                    int i59 = i23;
                    bg11VarT = bg11VarT3;
                    if (iQ3 == i6) {
                        i8 = i58;
                        i7 = i59;
                        i23 = i7;
                    } else {
                        i7 = izr0Var2.b;
                        i23 = i59;
                        jto1.q((String) null, i7 >= i23);
                        while (true) {
                            i8 = i58;
                            if (i7 - i23 < i8) {
                                izr0Var2.R(i7);
                                int iQ4 = izr0Var2.q();
                                jto1.q("childAtomSize must be positive", iQ4 > 0);
                                if (izr0Var2.q() != 1702061171) {
                                    i7 += iQ4;
                                    i58 = i8;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                    }
                    if (i7 != -1) {
                        z1c z1cVarC = c(i7, izr0Var2);
                        str5 = (String) z1cVarC.c;
                        byte[] bArr9 = (byte[]) z1cVarC.d;
                        if (bArr9 != null) {
                            if ("audio/vorbis".equals(str5)) {
                                u280 u280Var = muk1.a;
                                izr0 izr0Var5 = new izr0(bArr9);
                                izr0Var5.S(1);
                                int i60 = 0;
                                while (izr0Var5.a() > 0 && izr0Var5.n() == 255) {
                                    i60 += 255;
                                    izr0Var5.S(1);
                                }
                                int iE7 = izr0Var5.E() + i60;
                                int i61 = 0;
                                while (true) {
                                    if (izr0Var5.a() > 0) {
                                        z1cVar = z1cVarC;
                                        if (izr0Var5.n() == 255) {
                                            i61 += 255;
                                            izr0Var5.S(1);
                                            z1cVarC = z1cVar;
                                        }
                                    } else {
                                        z1cVar = z1cVarC;
                                    }
                                }
                                int iE8 = izr0Var5.E() + i61;
                                byte[] bArr10 = new byte[iE7];
                                int i62 = izr0Var5.b;
                                System.arraycopy(bArr9, i62, bArr10, 0, iE7);
                                int i63 = i62 + iE7 + iE8;
                                int length = bArr9.length - i63;
                                byte[] bArr11 = new byte[length];
                                System.arraycopy(bArr9, i63, bArr11, 0, length);
                                bg11VarT = b380.u(bArr10, bArr11);
                            } else {
                                if ("audio/mp4a-latm".equals(str5)) {
                                    v vVarV = c8o.v(new bae(bArr9, bArr9.length), false);
                                    iRound = vVarV.a;
                                    i9 = vVarV.b;
                                    strF = vVarV.c;
                                } else {
                                    strF = strF;
                                    i9 = I;
                                }
                                z1cVar = z1cVarC;
                                bg11VarT = b380.t(bArr9);
                                I = i9;
                            }
                            str3 = str5;
                            iG = iG;
                        } else {
                            z1cVar = z1cVarC;
                        }
                    } else {
                        strF = strF;
                        str5 = str3;
                    }
                    z1cVar = z1cVar;
                    str3 = str5;
                    iG = iG;
                }
                int i64 = i23 + i8;
                i22 = 2;
                i21 = 4;
                i20 = i3;
                i23 = i64;
                z1cVar = z1cVar;
                iIntValue = iIntValue;
                str2 = str3;
                str7 = str4;
                bg11VarT3 = bg11VarT;
                izr0Var2 = izr0Var;
            }
            iIntValue = iIntValue;
            str4 = str7;
            i23 = i23;
            bg11VarT = bg11VarT3;
            i8 = iQ2;
            z1cVar = z1cVar;
            int i65 = i23 + i8;
            i22 = 2;
            i21 = 4;
            i20 = i3;
            i23 = i65;
            z1cVar = z1cVar;
            iIntValue = iIntValue;
            str2 = str3;
            str7 = str4;
            bg11VarT3 = bg11VarT;
            izr0Var2 = izr0Var;
        }
        String str13 = str2;
        String str14 = strF;
        int i66 = I;
        int i67 = iG;
        bg11 bg11Var = bg11VarT3;
        if (((ie30) b2cVar.d) != null || str13 == null) {
            return;
        }
        ge30 ge30Var5 = new ge30();
        ge30Var5.a = Integer.toString(i4);
        ge30Var5.o = asj0.p(str13);
        ge30Var5.k = str14;
        ge30Var5.I = i66;
        ge30Var5.K = iRound;
        ge30Var5.L = i67;
        ge30Var5.r = bg11Var;
        ge30Var5.s = x8vVarA;
        ge30Var5.d = str;
        if (z1cVar != null) {
            z1c z1cVar2 = z1cVar;
            ge30Var5.i = bmq0.Z(z1cVar2.a);
            ge30Var5.j = bmq0.Z(z1cVar2.b);
        } else {
            x1c x1cVar2 = x1cVar;
            if (x1cVar2 != null) {
                ge30Var5.i = bmq0.Z(x1cVar2.a);
                ge30Var5.j = bmq0.Z(x1cVar2.b);
            }
        }
        b2cVar.d = new ie30(ge30Var5);
    }

    public static z1c c(int i, izr0 izr0Var) {
        izr0Var.R(i + 12);
        izr0Var.S(1);
        d(izr0Var);
        izr0Var.S(2);
        int iE = izr0Var.E();
        if ((iE & SemanticState.Focused) != 0) {
            izr0Var.S(2);
        }
        if ((iE & 64) != 0) {
            izr0Var.S(izr0Var.E());
        }
        if ((iE & 32) != 0) {
            izr0Var.S(2);
        }
        izr0Var.S(1);
        d(izr0Var);
        String strF = asj0.f(izr0Var.E());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new z1c(strF, null, -1L, -1L);
        }
        izr0Var.S(4);
        long jG = izr0Var.G();
        long jG2 = izr0Var.G();
        izr0Var.S(1);
        int iD = d(izr0Var);
        long j = jG2;
        byte[] bArr = new byte[iD];
        izr0Var.o(0, bArr, iD);
        if (j <= 0) {
            j = -1;
        }
        return new z1c(strF, bArr, j, jG > 0 ? jG : -1L);
    }

    public static int d(izr0 izr0Var) {
        int iE = izr0Var.E();
        int i = iE & 127;
        while ((iE & SemanticState.Focused) == 128) {
            iE = izr0Var.E();
            i = (i << 7) | (iE & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static hjj0 f(mpm0 mpm0Var) {
        yeh0 yeh0Var;
        npm0 npm0VarN = mpm0Var.n(1751411826);
        npm0 npm0VarN2 = mpm0Var.n(1801812339);
        npm0 npm0VarN3 = mpm0Var.n(1768715124);
        if (npm0VarN == null || npm0VarN2 == null || npm0VarN3 == null) {
            return null;
        }
        izr0 izr0Var = npm0VarN.e;
        izr0Var.R(16);
        if (izr0Var.q() != 1835299937) {
            return null;
        }
        izr0 izr0Var2 = npm0VarN2.e;
        izr0Var2.R(12);
        int iQ = izr0Var2.q();
        String[] strArr = new String[iQ];
        for (int i = 0; i < iQ; i++) {
            int iQ2 = izr0Var2.q();
            izr0Var2.S(4);
            strArr[i] = izr0Var2.C(iQ2 - 8, StandardCharsets.UTF_8);
        }
        izr0 izr0Var3 = npm0VarN3.e;
        izr0Var3.R(8);
        ArrayList arrayList = new ArrayList();
        while (izr0Var3.a() > 8) {
            int i2 = izr0Var3.b;
            int iQ3 = izr0Var3.q();
            int iQ4 = izr0Var3.q() - 1;
            if (iQ4 < 0 || iQ4 >= iQ) {
                td6.p(iQ4, "Skipped metadata with unknown key index: ");
            } else {
                String str = strArr[iQ4];
                int i3 = i2 + iQ3;
                while (true) {
                    int i4 = izr0Var3.b;
                    if (i4 < i3) {
                        int iQ5 = izr0Var3.q();
                        if (izr0Var3.q() == 1684108385) {
                            int iQ6 = izr0Var3.q();
                            int iQ7 = izr0Var3.q();
                            int i5 = iQ5 - 16;
                            byte[] bArr = new byte[i5];
                            izr0Var3.o(0, bArr, i5);
                            try {
                                yeh0Var = new yeh0(str, bArr, iQ7, iQ6);
                                break;
                            } catch (Exception unused) {
                                ktd.r("Failed to parse metadata entry with key: ", str);
                                yeh0Var = null;
                                break;
                            }
                        }
                        izr0Var3.R(i4 + iQ5);
                    }
                    yeh0Var = null;
                    break;
                }
                if (yeh0Var != null) {
                    arrayList.add(yeh0Var);
                }
            }
            izr0Var3.R(i2 + iQ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new hjj0(arrayList);
    }

    public static upm0 g(izr0 izr0Var) {
        long jY;
        long jY2;
        izr0Var.R(8);
        if (e(izr0Var.q()) == 0) {
            jY = izr0Var.G();
            jY2 = izr0Var.G();
        } else {
            jY = izr0Var.y();
            jY2 = izr0Var.y();
        }
        return new upm0(jY, jY2, izr0Var.G());
    }

    public static Pair h(izr0 izr0Var, int i, int i2) {
        dnf1 dnf1Var;
        Pair pairCreate;
        int i3;
        int i4;
        int i5 = izr0Var.b;
        while (i5 - i < i2) {
            izr0Var.R(i5);
            int iQ = izr0Var.q();
            jto1.q("childAtomSize must be positive", iQ > 0);
            if (izr0Var.q() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strC = null;
                while (i6 - i5 < iQ) {
                    izr0Var.R(i6);
                    int iQ2 = izr0Var.q();
                    int iQ3 = izr0Var.q();
                    if (iQ3 == 1718775137) {
                        numValueOf = Integer.valueOf(izr0Var.q());
                    } else if (iQ3 == 1935894637) {
                        izr0Var.S(4);
                        strC = izr0Var.C(4, StandardCharsets.UTF_8);
                    } else if (iQ3 == 1935894633) {
                        i8 = i6;
                        i7 = iQ2;
                    }
                    i6 += iQ2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strC) || "cbc1".equals(strC) || "cens".equals(strC) || "cbcs".equals(strC)) {
                    jto1.q("frma atom is mandatory", numValueOf != null);
                    jto1.q("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            dnf1Var = null;
                            break;
                        }
                        izr0Var.R(i9);
                        int iQ4 = izr0Var.q();
                        if (izr0Var.q() == 1952804451) {
                            int iE = e(izr0Var.q());
                            izr0Var.S(1);
                            if (iE == 0) {
                                izr0Var.S(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iE2 = izr0Var.E();
                                i3 = iE2 & 15;
                                i4 = (iE2 & 240) >> 4;
                            }
                            boolean z = izr0Var.E() == 1;
                            int iE3 = izr0Var.E();
                            byte[] bArr2 = new byte[16];
                            izr0Var.o(0, bArr2, 16);
                            if (z && iE3 == 0) {
                                int iE4 = izr0Var.E();
                                byte[] bArr3 = new byte[iE4];
                                izr0Var.o(0, bArr3, iE4);
                                bArr = bArr3;
                            }
                            dnf1Var = new dnf1(z, strC, iE3, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iQ4;
                    }
                    jto1.q("tenc atom is mandatory", dnf1Var != null);
                    String str = zoi1.a;
                    pairCreate = Pair.create(numValueOf, dnf1Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iQ;
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:167:0x0330  */
    public static b2c i(izr0 izr0Var, d2c d2cVar, String str, x8v x8vVar, boolean z) throws ParserException {
        x8v x8vVar2;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        String str3;
        String str4;
        d2c d2cVar2;
        int iJ;
        String str5;
        int i5;
        poj0 poj0Var;
        int i6;
        int i7;
        int i8;
        byte[] bArrCopyOfRange;
        int i9;
        int i10;
        int iE;
        int iE2;
        int i11;
        int i12;
        x8v x8vVarA;
        String str6;
        List listT;
        long j;
        izr0 izr0Var2 = izr0Var;
        d2c d2cVar3 = d2cVar;
        String str7 = str;
        int i13 = d2cVar3.a;
        izr0Var2.R(12);
        int iQ = izr0Var2.q();
        b2c b2cVar = new b2c();
        b2cVar.c = new dnf1[iQ];
        boolean z2 = false;
        b2cVar.b = false;
        int i14 = 0;
        while (i14 < iQ) {
            int i15 = izr0Var2.b;
            int iQ2 = izr0Var2.q();
            String str8 = "childAtomSize must be positive";
            jto1.q("childAtomSize must be positive", iQ2 > 0 ? true : z2);
            int iQ3 = izr0Var2.q();
            byte b = 3;
            int i16 = 8;
            String str9 = null;
            if (iQ3 == 1635148593 || iQ3 == 1635148595 || iQ3 == 1701733238 || iQ3 == 1831958048 || iQ3 == 1836070006 || iQ3 == 1752589105 || iQ3 == 1751479857 || iQ3 == 1987470129 || iQ3 == 1987471665 || iQ3 == 1932670515 || iQ3 == 1211250227 || iQ3 == 1748121139 || iQ3 == 1987063864 || iQ3 == 1987063865 || iQ3 == 1635135537 || iQ3 == 1685479798 || iQ3 == 1685479729 || iQ3 == 1685481573 || iQ3 == 1685481521 || iQ3 == 1634760241 || iQ3 == 1684108849) {
                izr0Var2.R(i15 + 16);
                izr0Var2.S(16);
                int iL = izr0Var2.L();
                int iL2 = izr0Var2.L();
                izr0Var2.S(50);
                int i17 = izr0Var2.b;
                if (iQ3 == 1701733238) {
                    Pair pairH = h(izr0Var2, i15, iQ2);
                    if (pairH != null) {
                        iQ3 = ((Integer) pairH.first).intValue();
                        x8vVarA = x8vVar == null ? null : x8vVar.a(((dnf1) pairH.second).b);
                        ((dnf1[]) b2cVar.c)[i14] = (dnf1) pairH.second;
                    } else {
                        i15 = i15;
                        x8vVarA = x8vVar;
                    }
                    izr0Var2.R(i17);
                    x8vVar2 = x8vVarA;
                } else {
                    i15 = i15;
                    x8vVar2 = x8vVar;
                }
                if (iQ3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iQ3 == 1211250227 ? "video/3gpp" : null;
                }
                x8v x8vVar3 = x8vVar2;
                i = iQ;
                int i18 = 8;
                poj0 poj0Var2 = null;
                bg11 bg11VarT = null;
                String string = null;
                byte[] bArr = null;
                ByteBuffer byteBuffer = null;
                xr6 xr6VarB = null;
                x1c x1cVar = null;
                z1c z1cVar = null;
                String str10 = str2;
                float fI = 1.0f;
                int i19 = i17;
                int i20 = -1;
                int i21 = -1;
                int i22 = -1;
                boolean z3 = false;
                int i23 = -1;
                int i24 = -1;
                int i25 = -1;
                int i26 = -1;
                i2 = i14;
                i3 = i13;
                int i27 = 8;
                int i28 = -1;
                while (i19 - i15 < iQ2) {
                    izr0Var2.R(i19);
                    int i29 = izr0Var2.b;
                    int i30 = i19;
                    int iQ4 = izr0Var2.q();
                    if (iQ4 == 0 && izr0Var2.b - i15 == iQ2) {
                        break;
                    }
                    jto1.q(str8, iQ4 > 0);
                    int iQ5 = izr0Var2.q();
                    int i31 = iQ2;
                    if (iQ5 == 1635148611) {
                        jto1.q(str9, str10 == null);
                        izr0Var2.R(i29 + 8);
                        yb9 yb9VarA = yb9.a(izr0Var2);
                        bg11VarT = yb9VarA.a;
                        b2cVar.a = yb9VarA.b;
                        float f = !z3 ? yb9VarA.k : fI;
                        String str11 = yb9VarA.l;
                        int i32 = yb9VarA.j;
                        i22 = yb9VarA.g;
                        int i33 = yb9VarA.h;
                        int i34 = yb9VarA.i;
                        int i35 = yb9VarA.e;
                        i6 = yb9VarA.f;
                        i7 = iQ3;
                        str8 = str8;
                        i24 = i32;
                        i28 = i33;
                        fI = f;
                        iJ = i34;
                        i27 = i35;
                        i16 = i16;
                        str5 = "video/avc";
                        string = str11;
                    } else {
                        int i36 = iQ3;
                        if (iQ5 == 1752589123) {
                            jto1.q((String) null, str10 == null);
                            izr0Var2.R(i29 + 8);
                            y760 y760VarA = y760.a(izr0Var2, false, null);
                            bg11VarT = y760VarA.a;
                            b2cVar.a = y760VarA.b;
                            float f2 = !z3 ? y760VarA.l : fI;
                            int i37 = y760VarA.m;
                            int i38 = y760VarA.c;
                            String str12 = y760VarA.n;
                            int i39 = y760VarA.k;
                            if (i39 != -1) {
                                i20 = i39;
                            }
                            int i40 = y760VarA.d;
                            int i41 = y760VarA.e;
                            int i42 = y760VarA.h;
                            int i43 = y760VarA.i;
                            int i44 = i20;
                            int i45 = y760VarA.j;
                            int i46 = y760VarA.f;
                            i6 = y760VarA.g;
                            str5 = "video/hevc";
                            str8 = str8;
                            i26 = i40;
                            i25 = i41;
                            fI = f2;
                            i22 = i42;
                            i28 = i43;
                            i20 = i44;
                            iJ = i45;
                            i27 = i46;
                            i7 = i36;
                            i23 = i38;
                            string = str12;
                            i24 = i37;
                            poj0Var2 = y760VarA.o;
                            i16 = i16;
                        } else {
                            i20 = i20;
                            if (iQ5 == 1818785347) {
                                jto1.q("lhvC must follow hvcC atom", "video/hevc".equals(str10));
                                jto1.q("must have at least two layers", poj0Var2 != null && ((b380) poj0Var2.b).size() >= 2);
                                izr0Var2.R(i29 + 8);
                                poj0Var2.getClass();
                                y760 y760VarA2 = y760.a(izr0Var2, true, poj0Var2);
                                jto1.q("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", b2cVar.a == y760VarA2.b);
                                int i47 = y760VarA2.h;
                                if (i47 != -1) {
                                    jto1.q("colorSpace must be the same for both views", i22 == i47);
                                }
                                int i48 = y760VarA2.i;
                                if (i48 != -1) {
                                    jto1.q("colorRange must be the same for both views", i28 == i48);
                                }
                                int i49 = y760VarA2.j;
                                if (i49 != -1) {
                                    jto1.q("colorTransfer must be the same for both views", i21 == i49);
                                }
                                jto1.q("bitdepthLuma must be the same for both views", i27 == y760VarA2.f);
                                jto1.q("bitdepthChroma must be the same for both views", i18 == y760VarA2.g);
                                if (bg11VarT != null) {
                                    v280 v280VarM = b380.m();
                                    v280VarM.e(bg11VarT);
                                    v280VarM.e(y760VarA2.a);
                                    bg11VarT = v280VarM.g();
                                } else {
                                    jto1.q("initializationData must be already set from hvcC atom", false);
                                }
                                string = y760VarA2.n;
                                str5 = "video/mv-hevc";
                                iJ = i21;
                                i6 = i18;
                            } else if (iQ5 == 1987470147) {
                                jto1.q((String) null, str10 == null);
                                izr0Var2.R(i29 + 8);
                                try {
                                    if (izr0Var2.q() != 0) {
                                        throw ParserException.a((RuntimeException) null, "Unsupported VVC version");
                                    }
                                    int iE3 = izr0Var2.E();
                                    int i50 = (iE3 >> 1) & 3;
                                    boolean z4 = (iE3 & 1) != 0;
                                    int i51 = i50 + 1;
                                    String str13 = "L";
                                    if (z4) {
                                        izr0Var2.S(1);
                                        int iE4 = (izr0Var2.E() >> 4) & 7;
                                        iE = (izr0Var2.E() >> 5) & 7;
                                        int iE5 = izr0Var2.E() & 63;
                                        int iE6 = izr0Var2.E();
                                        i11 = (iE6 >> 1) & 127;
                                        str13 = (iE6 & 1) != 0 ? "H" : "L";
                                        iE2 = izr0Var2.E();
                                        izr0Var2.S(iE5);
                                        int i52 = 1;
                                        if (iE4 > 1) {
                                            int iE7 = izr0Var2.E();
                                            int i53 = 0;
                                            while (true) {
                                                int i54 = i52;
                                                if (i53 >= iE4 - 1) {
                                                    break;
                                                }
                                                if (((iE7 >> (7 - i53)) & 1) != 0) {
                                                    izr0Var2.S(i54);
                                                }
                                                i53++;
                                                i52 = 1;
                                            }
                                        }
                                        izr0Var2.S(izr0Var2.E() * 4);
                                        izr0Var2.S(6);
                                    } else {
                                        iE = 0;
                                        iE2 = 0;
                                        i11 = 0;
                                    }
                                    int iE8 = izr0Var2.E();
                                    int i55 = izr0Var2.b;
                                    int i56 = iE;
                                    int i57 = 0;
                                    int i58 = 0;
                                    while (true) {
                                        i12 = 13;
                                        if (i58 >= iE8) {
                                            break;
                                        }
                                        int i59 = i58;
                                        int iE9 = izr0Var2.E() & 31;
                                        int iL3 = (iE9 == 13 || iE9 == 12) ? 1 : izr0Var2.L();
                                        int i60 = 0;
                                        while (i60 < iL3) {
                                            int i61 = i57;
                                            int iL4 = izr0Var2.L();
                                            izr0Var2.S(iL4);
                                            i60++;
                                            i57 = iL4 + 4 + i61;
                                        }
                                        i58 = i59 + 1;
                                    }
                                    izr0Var2.R(i55);
                                    byte[] bArr2 = new byte[i57];
                                    int i62 = 0;
                                    int i63 = 0;
                                    while (i62 < iE8) {
                                        int i64 = iE8;
                                        int iE10 = izr0Var2.E() & 31;
                                        int iL5 = (iE10 == i12 || iE10 == 12) ? 1 : izr0Var2.L();
                                        int i65 = 0;
                                        while (i65 < iL5) {
                                            int i66 = iL5;
                                            int iL6 = izr0Var2.L();
                                            System.arraycopy(mqn1.a, 0, bArr2, i63, 4);
                                            int i67 = i63 + 4;
                                            izr0Var2.o(i67, bArr2, iL6);
                                            i63 = i67 + iL6;
                                            i65++;
                                            iL5 = i66;
                                            i62 = i62;
                                            i21 = i21;
                                        }
                                        i62++;
                                        iE8 = i64;
                                        i12 = 13;
                                    }
                                    iJ = i21;
                                    Locale locale = Locale.US;
                                    String str14 = "vvc1." + i11 + "." + str13 + iE2;
                                    bg11VarT = b380.t(bArr2);
                                    i27 = i56 + 8;
                                    b2cVar.a = i51;
                                    str5 = "video/vvc";
                                    string = str14;
                                    i6 = i27;
                                    i24 = 16;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    throw ParserException.a(e, "Error parsing VVC configuration");
                                }
                            } else {
                                iJ = i21;
                                i28 = i28;
                                if (iQ5 == 1986361461) {
                                    izr0Var2.R(i29 + 8);
                                    int i68 = izr0Var2.b;
                                    l2a l2aVar = null;
                                    while (i68 - i29 < iQ4) {
                                        izr0Var2.R(i68);
                                        int iQ6 = izr0Var2.q();
                                        jto1.q(str8, iQ6 > 0);
                                        if (izr0Var2.q() == 1702454643) {
                                            izr0Var2.R(i68 + 8);
                                            int i69 = izr0Var2.b;
                                            while (true) {
                                                if (i69 - i68 >= iQ6) {
                                                    l2aVar = null;
                                                    break;
                                                }
                                                izr0Var2.R(i69);
                                                int iQ7 = izr0Var2.q();
                                                jto1.q(str8, iQ7 > 0);
                                                if (izr0Var2.q() == 1937011305) {
                                                    izr0Var2.S(4);
                                                    int iE11 = izr0Var2.E();
                                                    l2aVar = new l2a(new yw7((iE11 & 1) == 1, (iE11 & 2) == 2, (iE11 & 8) == i16), (byte) 5);
                                                    break;
                                                }
                                                i69 += iQ7;
                                                i16 = 8;
                                            }
                                        }
                                        i68 += iQ6;
                                        i16 = 8;
                                    }
                                    uq8 uq8Var = l2aVar == null ? null : new uq8(l2aVar, (byte) 4);
                                    if (uq8Var != null) {
                                        yw7 yw7Var = (yw7) ((l2a) uq8Var.b).b;
                                        boolean z5 = yw7Var.c;
                                        if (poj0Var2 == null || ((b380) poj0Var2.b).size() < 2) {
                                            i20 = i20;
                                            if (i20 == -1) {
                                                i20 = z5 ? 5 : 4;
                                            }
                                        } else {
                                            jto1.q("both eye views must be marked as available", yw7Var.a && yw7Var.b);
                                            jto1.q("for MV-HEVC, eye_views_reversed must be set to false", !z5);
                                            i20 = i20;
                                        }
                                    } else {
                                        i20 = i20;
                                    }
                                    str8 = str8;
                                    str5 = str10;
                                    i6 = i18;
                                    i7 = i36;
                                } else {
                                    i20 = i20;
                                    if (iQ5 == 1685480259 || iQ5 == 1685485123 || iQ5 == 1685485379) {
                                        str8 = str8;
                                        str5 = str10;
                                        i5 = i27;
                                        poj0Var = poj0Var2;
                                        i6 = i18;
                                        i7 = i36;
                                        i16 = 8;
                                        iJ = iJ;
                                        xr6VarB = xr6.b(izr0Var2);
                                    } else if (iQ5 == 1987076931) {
                                        jto1.q((String) null, str10 == null);
                                        String str15 = i36 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        izr0Var2.R(i29 + 12);
                                        byte bE = (byte) izr0Var2.E();
                                        byte bE2 = (byte) izr0Var2.E();
                                        int iE12 = izr0Var2.E();
                                        int i70 = iE12 >> 4;
                                        byte b2 = (byte) ((iE12 >> 1) & 7);
                                        if (str15.equals("video/x-vnd.on2.vp9")) {
                                            byte[] bArr3 = kwg.a;
                                            byte[] bArr4 = new byte[12];
                                            bArr4[0] = 1;
                                            bArr4[1] = 1;
                                            bArr4[2] = bE;
                                            bArr4[b] = 2;
                                            bArr4[4] = 1;
                                            bArr4[5] = bE2;
                                            bArr4[6] = b;
                                            bArr4[7] = 1;
                                            bArr4[8] = (byte) i70;
                                            bArr4[9] = 4;
                                            bArr4[10] = 1;
                                            bArr4[11] = b2;
                                            bg11VarT = b380.t(bArr4);
                                        }
                                        boolean z6 = (iE12 & 1) != 0;
                                        int iE13 = izr0Var2.E();
                                        int iE14 = izr0Var2.E();
                                        i22 = x8h.i(iE13);
                                        int i71 = z6 ? 1 : 2;
                                        iJ = x8h.j(iE14);
                                        i7 = i36;
                                        str8 = str8;
                                        str5 = str15;
                                        i27 = i70;
                                        i6 = i27;
                                        i28 = i71;
                                    } else {
                                        i7 = i36;
                                        int i72 = 11;
                                        if (iQ5 == 1635135811) {
                                            int i73 = iQ4 - 8;
                                            byte[] bArr5 = new byte[i73];
                                            izr0Var2.o(0, bArr5, i73);
                                            bg11VarT = b380.t(bArr5);
                                            j89 j89VarB = j89.b(bArr5);
                                            if (j89VarB != null) {
                                                i27 = j89VarB.a;
                                                i22 = j89VarB.b;
                                                i9 = j89VarB.c;
                                                i10 = j89VarB.d;
                                                string = j89VarB.e;
                                                i18 = i27;
                                            } else {
                                                i9 = i28;
                                                i10 = iJ;
                                            }
                                            str5 = "video/av01";
                                            i28 = i9;
                                            iJ = i10;
                                        } else if (iQ5 == 1668050025) {
                                            ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                            byteBufferOrder.position(21);
                                            byteBufferOrder.putShort(izr0Var2.B());
                                            byteBufferOrder.putShort(izr0Var2.B());
                                            byteBuffer = byteBufferOrder;
                                            str5 = str10;
                                        } else {
                                            if (iQ5 == 1835295606) {
                                                ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                short sB = izr0Var2.B();
                                                short sB2 = izr0Var2.B();
                                                short sB3 = izr0Var2.B();
                                                i7 = i7;
                                                short sB4 = izr0Var2.B();
                                                str8 = str8;
                                                short sB5 = izr0Var2.B();
                                                str5 = str10;
                                                short sB6 = izr0Var2.B();
                                                i5 = i27;
                                                short sB7 = izr0Var2.B();
                                                poj0Var = poj0Var2;
                                                short sB8 = izr0Var2.B();
                                                long jG = izr0Var2.G();
                                                long jG2 = izr0Var2.G();
                                                i6 = i18;
                                                byteBufferOrder2.position(1);
                                                byteBufferOrder2.putShort(sB5);
                                                byteBufferOrder2.putShort(sB6);
                                                byteBufferOrder2.putShort(sB);
                                                byteBufferOrder2.putShort(sB2);
                                                byteBufferOrder2.putShort(sB3);
                                                byteBufferOrder2.putShort(sB4);
                                                byteBufferOrder2.putShort(sB7);
                                                byteBufferOrder2.putShort(sB8);
                                                byteBufferOrder2.putShort((short) (jG / 10000));
                                                byteBufferOrder2.putShort((short) (jG2 / 10000));
                                                byteBuffer = byteBufferOrder2;
                                            } else {
                                                i7 = i7;
                                                str8 = str8;
                                                str5 = str10;
                                                i5 = i27;
                                                poj0Var = poj0Var2;
                                                i6 = i18;
                                                if (iQ5 == 1681012275) {
                                                    jto1.q((String) null, str5 == null);
                                                    str5 = "video/3gpp";
                                                } else {
                                                    if (iQ5 == 1702061171) {
                                                        jto1.q((String) null, str5 == null);
                                                        z1c z1cVarC = c(i29, izr0Var2);
                                                        String str16 = (String) z1cVarC.c;
                                                        byte[] bArr6 = (byte[]) z1cVarC.d;
                                                        if (bArr6 != null) {
                                                            bg11VarT = b380.t(bArr6);
                                                        }
                                                        z1cVar = z1cVarC;
                                                        str5 = str16;
                                                    } else if (iQ5 == 1651798644) {
                                                        izr0Var2.R(i29 + 8);
                                                        izr0Var2.S(4);
                                                        x1cVar = new x1c(izr0Var2.G(), izr0Var2.G());
                                                    } else if (iQ5 == 1885434736) {
                                                        izr0Var2.R(i29 + 8);
                                                        fI = izr0Var2.I() / izr0Var2.I();
                                                        i27 = i5;
                                                        poj0Var2 = poj0Var;
                                                        i16 = 8;
                                                        z3 = true;
                                                    } else if (iQ5 == 1937126244) {
                                                        int i74 = i29 + 8;
                                                        while (true) {
                                                            if (i74 - i29 >= iQ4) {
                                                                bArrCopyOfRange = null;
                                                                break;
                                                            }
                                                            izr0Var2.R(i74);
                                                            int iQ8 = izr0Var2.q();
                                                            if (izr0Var2.q() == 1886547818) {
                                                                bArrCopyOfRange = Arrays.copyOfRange(izr0Var2.a, i74, iQ8 + i74);
                                                                break;
                                                            }
                                                            i74 += iQ8;
                                                        }
                                                        bArr = bArrCopyOfRange;
                                                    } else if (iQ5 == 1936995172) {
                                                        int iE15 = izr0Var2.E();
                                                        byte b3 = b;
                                                        izr0Var2.S(b3);
                                                        if (iE15 == 0) {
                                                            int iE16 = izr0Var2.E();
                                                            if (iE16 == 0) {
                                                                i20 = 0;
                                                            } else if (iE16 == 1) {
                                                                i20 = 1;
                                                            } else if (iE16 == 2) {
                                                                i20 = 2;
                                                            } else if (iE16 == b3) {
                                                                i20 = b3;
                                                            }
                                                        }
                                                    } else if (iQ5 == 1634760259) {
                                                        int i75 = iQ4 - 12;
                                                        byte[] bArr7 = new byte[i75];
                                                        izr0Var2.R(i29 + 12);
                                                        izr0Var2.o(0, bArr7, i75);
                                                        byte[] bArr8 = kwg.a;
                                                        dm5.l("Invalid APV CSD length: %s", i75, i75 >= 17);
                                                        byte b4 = bArr7[0];
                                                        dm5.l("Invalid APV CSD version: %s", b4, b4 == 1);
                                                        int i76 = bArr7[5] & 255;
                                                        int i77 = bArr7[6] & 255;
                                                        int i78 = bArr7[7] & 255;
                                                        String str17 = zoi1.a;
                                                        Locale locale2 = Locale.US;
                                                        StringBuilder sbQ = cy30.q(i76, i77, "apv1.apvf", ".apvl", ".apvb");
                                                        sbQ.append(i78);
                                                        string = sbQ.toString();
                                                        bg11VarT = b380.t(bArr7);
                                                        izr0 izr0Var3 = new izr0(bArr7);
                                                        bae baeVar = new bae(bArr7, i75);
                                                        i16 = 8;
                                                        baeVar.m(izr0Var3.b * 8);
                                                        baeVar.p(1);
                                                        int iG = baeVar.g(8);
                                                        int i79 = -1;
                                                        int i80 = 0;
                                                        int i81 = -1;
                                                        int i82 = -1;
                                                        int i83 = -1;
                                                        int i84 = -1;
                                                        while (i80 < iG) {
                                                            baeVar.p(1);
                                                            int iG2 = baeVar.g(8);
                                                            int iG3 = i84;
                                                            int i85 = i83;
                                                            int i86 = i82;
                                                            int i87 = i81;
                                                            int iJ2 = i79;
                                                            int i88 = 0;
                                                            while (i88 < iG2) {
                                                                baeVar.o(6);
                                                                boolean zF = baeVar.f();
                                                                baeVar.n();
                                                                baeVar.p(i72);
                                                                baeVar.o(4);
                                                                iG3 = baeVar.g(4) + 8;
                                                                baeVar.p(1);
                                                                if (zF) {
                                                                    int iG4 = baeVar.g(8);
                                                                    int iG5 = baeVar.g(8);
                                                                    baeVar.p(1);
                                                                    boolean zF2 = baeVar.f();
                                                                    int i89 = x8h.i(iG4);
                                                                    i85 = zF2 ? 1 : 2;
                                                                    i86 = i89;
                                                                    iJ2 = x8h.j(iG5);
                                                                }
                                                                i88++;
                                                                i87 = iG3;
                                                                i72 = 11;
                                                            }
                                                            i80++;
                                                            i79 = iJ2;
                                                            i81 = i87;
                                                            i82 = i86;
                                                            i83 = i85;
                                                            i84 = iG3;
                                                            i72 = 11;
                                                        }
                                                        str5 = "video/apv";
                                                        iJ = i79;
                                                        i27 = i81;
                                                        i22 = i82;
                                                        i28 = i83;
                                                        i6 = i84;
                                                        poj0Var2 = poj0Var;
                                                    } else {
                                                        i16 = 8;
                                                        if (iQ5 == 1668246642) {
                                                            i8 = iJ;
                                                            if (i22 == -1 && i8 == -1) {
                                                                int iQ9 = izr0Var2.q();
                                                                if (iQ9 == 1852009592 || iQ9 == 1852009571) {
                                                                    int iL7 = izr0Var2.L();
                                                                    int iL8 = izr0Var2.L();
                                                                    izr0Var2.S(2);
                                                                    boolean z7 = iQ4 == 19 && (izr0Var2.E() & SemanticState.Focused) != 0;
                                                                    int i90 = x8h.i(iL7);
                                                                    int i91 = z7 ? 1 : 2;
                                                                    iJ = x8h.j(iL8);
                                                                    i28 = i91;
                                                                    i27 = i5;
                                                                    poj0Var2 = poj0Var;
                                                                    i22 = i90;
                                                                } else {
                                                                    oon1.H("Unsupported color type: ".concat(dn90.d(iQ9)));
                                                                }
                                                            }
                                                        } else {
                                                            i8 = iJ;
                                                        }
                                                        iJ = i8;
                                                    }
                                                    i27 = i5;
                                                    poj0Var2 = poj0Var;
                                                    i16 = 8;
                                                }
                                            }
                                            i27 = i5;
                                            poj0Var2 = poj0Var;
                                        }
                                        i6 = i18;
                                    }
                                    i27 = i5;
                                    poj0Var2 = poj0Var;
                                }
                                i16 = 8;
                            }
                            i7 = i36;
                        }
                    }
                    i19 = i30 + iQ4;
                    i16 = i16;
                    iQ2 = i31;
                    iQ3 = i7;
                    i28 = i28;
                    i21 = iJ;
                    str8 = str8;
                    str10 = str5;
                    i18 = i6;
                    b = 3;
                    str9 = null;
                }
                i4 = iQ2;
                int i92 = i21;
                String str18 = str10;
                int i93 = i27;
                int i94 = i28;
                int i95 = i18;
                if (xr6VarB != null) {
                    str3 = xr6VarB.a;
                    str4 = "video/dolby-vision";
                } else {
                    str3 = string;
                    str4 = str18;
                }
                if (str4 == null) {
                    d2cVar2 = d2cVar;
                    str7 = str;
                } else {
                    ge30 ge30Var = new ge30();
                    ge30Var.a = Integer.toString(i3);
                    ge30Var.o = asj0.p(str4);
                    ge30Var.k = str3;
                    ge30Var.v = iL;
                    ge30Var.w = iL2;
                    ge30Var.y = i26;
                    ge30Var.z = i25;
                    ge30Var.D = fI;
                    d2cVar2 = d2cVar;
                    ge30Var.B = d2cVar2.c;
                    ge30Var.C = d2cVar2.d;
                    ge30Var.E = bArr;
                    ge30Var.F = i20;
                    ge30Var.r = bg11VarT;
                    ge30Var.q = i24;
                    ge30Var.H = i23;
                    ge30Var.s = x8vVar3;
                    str7 = str;
                    ge30Var.d = str7;
                    ge30Var.G = new x8h(i22, i94, i92, byteBuffer != null ? byteBuffer.array() : null, i93, i95);
                    x1c x1cVar2 = x1cVar;
                    if (x1cVar2 != null) {
                        ge30Var.i = bmq0.Z(x1cVar2.a);
                        ge30Var.j = bmq0.Z(x1cVar2.b);
                    } else {
                        z1c z1cVar2 = z1cVar;
                        if (z1cVar2 != null) {
                            ge30Var.i = bmq0.Z(z1cVar2.a);
                            ge30Var.j = bmq0.Z(z1cVar2.b);
                        }
                    }
                    b2cVar.d = new ie30(ge30Var);
                }
            } else {
                if (iQ3 == 1836069985 || iQ3 == 1701733217 || iQ3 == 1633889587 || iQ3 == 1700998451 || iQ3 == 1633889588 || iQ3 == 1835823201 || iQ3 == 1685353315 || iQ3 == 1685353317 || iQ3 == 1685353320 || iQ3 == 1685353324 || iQ3 == 1685353336 || iQ3 == 1935764850 || iQ3 == 1935767394 || iQ3 == 1819304813 || iQ3 == 1936684916 || iQ3 == 1953984371 || iQ3 == 778924082 || iQ3 == 778924083 || iQ3 == 1835557169 || iQ3 == 1835560241 || iQ3 == 1634492771 || iQ3 == 1634492791 || iQ3 == 1970037111 || iQ3 == 1332770163 || iQ3 == 1716281667 || iQ3 == 1767992678 || iQ3 == 1768973165 || iQ3 == 1718641517) {
                    izr0Var2 = izr0Var;
                    i15 = i15;
                    iQ2 = iQ2;
                    b(izr0Var2, iQ3, i15, iQ2, d2cVar3.a, str7, z, x8vVar, b2cVar, i14);
                    str7 = str;
                } else if (iQ3 == 1414810956 || iQ3 == 1954034535 || iQ3 == 2004251764 || iQ3 == 1937010800 || iQ3 == 1664495672 || iQ3 == 1836070003 || iQ3 == 1952807028) {
                    izr0Var2.R(i15 + 16);
                    String str19 = "application/ttml+xml";
                    long j2 = Long.MAX_VALUE;
                    if (iQ3 != 1414810956) {
                        if (iQ3 == 1954034535) {
                            int i96 = iQ2 - 16;
                            byte[] bArr9 = new byte[i96];
                            izr0Var2.o(0, bArr9, i96);
                            listT = b380.t(bArr9);
                            str19 = "application/x-quicktime-tx3g";
                            i15 = i15;
                            iQ2 = iQ2;
                        } else {
                            if (iQ3 == 2004251764) {
                                str19 = "application/x-mp4-vtt";
                            } else if (iQ3 == 1937010800) {
                                j2 = 0;
                            } else if (iQ3 == 1664495672) {
                                b2cVar.b = true;
                                str19 = "application/x-mp4-cea-608";
                            } else if (iQ3 == 1836070003) {
                                int i97 = izr0Var2.b;
                                izr0Var2.S(4);
                                if (izr0Var2.q() == 1702061171) {
                                    byte[] bArr10 = (byte[]) c(i97, izr0Var2).d;
                                    if (bArr10 == null || bArr10.length != 64) {
                                        i15 = i15;
                                        iQ2 = iQ2;
                                    } else {
                                        int i98 = d2cVar3.e;
                                        int i99 = d2cVar3.f;
                                        dm5.y(bArr10.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i100 = 0;
                                        while (i100 < bArr10.length - 3) {
                                            byte[] bArr11 = bArr10;
                                            int iU = bmq0.u(bArr10[i100], bArr10[i100 + 1], bArr10[i100 + 2], bArr11[i100 + 3]);
                                            int i101 = (iU >> 16) & 255;
                                            int i102 = ((iU >> 8) & 255) - 128;
                                            int i103 = (iU & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(zoi1.j(ywx0.j(i103, 17790, 10000, i101), 0, 255) | (zoi1.j((i101 - ((i103 * 3455) / 10000)) - ((i102 * 7169) / 10000), 0, 255) << 8) | (zoi1.j(ywx0.j(i102, 14075, 10000, i101), 0, 255) << 16))));
                                            i100 += 4;
                                            bArr10 = bArr11;
                                            i15 = i15;
                                            iQ2 = iQ2;
                                        }
                                        i15 = i15;
                                        iQ2 = iQ2;
                                        StringBuilder sbQ2 = cy30.q(i98, i99, "size: ", "x", "\npalette: ");
                                        sbQ2.append(new cfa0(", ").c(arrayList));
                                        sbQ2.append("\n");
                                        String string2 = sbQ2.toString();
                                        String str20 = zoi1.a;
                                        listT = b380.t(string2.getBytes(StandardCharsets.UTF_8));
                                        str6 = "application/vobsub";
                                    }
                                } else {
                                    i15 = i15;
                                    iQ2 = iQ2;
                                    str6 = null;
                                    listT = null;
                                }
                                str19 = str6;
                            } else {
                                if (iQ3 != 1952807028) {
                                    bhn0.w();
                                    return null;
                                }
                                str19 = "text/x-unknown";
                                listT = null;
                            }
                            listT = null;
                        }
                        j = j2;
                        if (str19 != null) {
                            ge30 ge30Var2 = new ge30();
                            ge30Var2.a = Integer.toString(i13);
                            ge30Var2.o = asj0.p(str19);
                            ge30Var2.d = str7;
                            ge30Var2.t = j;
                            ge30Var2.r = listT;
                            b2cVar.d = new ie30(ge30Var2);
                        }
                    } else {
                        listT = null;
                        j = j2;
                        if (str19 != null) {
                            ge30 ge30Var3 = new ge30();
                            ge30Var3.a = Integer.toString(i13);
                            ge30Var3.o = asj0.p(str19);
                            ge30Var3.d = str7;
                            ge30Var3.t = j;
                            ge30Var3.r = listT;
                            b2cVar.d = new ie30(ge30Var3);
                        }
                    }
                    izr0Var2 = izr0Var;
                    i2 = i14;
                    d2cVar2 = d2cVar3;
                    i = iQ;
                    i15 = i15;
                    i4 = iQ2;
                    i3 = i13;
                } else if (iQ3 == 1835365492 || iQ3 == 1769222965) {
                    izr0Var2.R(i15 + 16);
                    if (iQ3 == 1835365492) {
                        izr0Var2.z();
                        String strZ = izr0Var2.z();
                        if (strZ != null) {
                            ge30 ge30Var4 = new ge30();
                            ge30Var4.a = Integer.toString(i13);
                            ge30Var4.o = asj0.p(strZ);
                            b2cVar.d = new ie30(ge30Var4);
                        }
                    } else if (iQ3 == 1769222965) {
                        int iE17 = izr0Var2.E();
                        byte[] bArr12 = new byte[iE17];
                        izr0Var2.o(0, bArr12, iE17);
                        ge30 ge30Var5 = new ge30();
                        ge30Var5.a = Integer.toString(i13);
                        ge30Var5.o = asj0.p("application/x-itut-t35");
                        ge30Var5.r = b380.t(bArr12);
                        b2cVar.d = new ie30(ge30Var5);
                    }
                } else if (iQ3 == 1667329389) {
                    ge30 ge30Var6 = new ge30();
                    ge30Var6.a = Integer.toString(i13);
                    ge30Var6.o = asj0.p("application/x-camera-motion");
                    b2cVar.d = new ie30(ge30Var6);
                }
                i15 = i15;
                i4 = iQ2;
                i2 = i14;
                d2cVar2 = d2cVar3;
                i3 = i13;
                i = iQ;
            }
            izr0Var2.R(i15 + i4);
            i14 = i2 + 1;
            d2cVar3 = d2cVar2;
            i13 = i3;
            iQ = i;
            z2 = false;
        }
        return b2cVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:108:0x0207  */
    /* JADX WARN: Code duplicated, block: B:109:0x0213 A[LOOP:18: B:98:0x01e3->B:109:0x0213, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0253  */
    /* JADX WARN: Code duplicated, block: B:123:0x0279  */
    /* JADX WARN: Code duplicated, block: B:125:0x0286  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:199:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:203:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:204:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:206:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:208:0x0401  */
    /* JADX WARN: Code duplicated, block: B:209:0x040b  */
    /* JADX WARN: Code duplicated, block: B:265:0x05be  */
    /* JADX WARN: Code duplicated, block: B:268:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:269:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:271:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:274:0x05d9 A[LOOP:1: B:272:0x05d3->B:274:0x05d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:277:0x05ec A[LOOP:2: B:276:0x05ea->B:277:0x05ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:280:0x0609  */
    /* JADX WARN: Code duplicated, block: B:282:0x061d A[LOOP:4: B:281:0x061b->B:282:0x061d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:286:0x0666  */
    /* JADX WARN: Code duplicated, block: B:288:0x066a  */
    /* JADX WARN: Code duplicated, block: B:290:0x066e  */
    /* JADX WARN: Code duplicated, block: B:292:0x0672  */
    /* JADX WARN: Code duplicated, block: B:294:0x067e  */
    /* JADX WARN: Code duplicated, block: B:296:0x0681  */
    /* JADX WARN: Code duplicated, block: B:297:0x0684  */
    /* JADX WARN: Code duplicated, block: B:300:0x068a  */
    /* JADX WARN: Code duplicated, block: B:301:0x068d  */
    /* JADX WARN: Code duplicated, block: B:304:0x0693  */
    /* JADX WARN: Code duplicated, block: B:305:0x0696  */
    /* JADX WARN: Code duplicated, block: B:308:0x069c  */
    /* JADX WARN: Code duplicated, block: B:309:0x069f  */
    /* JADX WARN: Code duplicated, block: B:312:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:314:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:316:0x06c6 A[LOOP:14: B:313:0x06be->B:316:0x06c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:321:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:323:0x0702  */
    /* JADX WARN: Code duplicated, block: B:324:0x0707 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:325:0x0709 A[ADDED_TO_REGION, LOOP:15: B:325:0x0709->B:327:0x070d, LOOP_START, PHI: r10 r29 r30
      0x0709: PHI (r10v20 int) = (r10v16 int), (r10v21 int) binds: [B:324:0x0707, B:327:0x070d] A[DONT_GENERATE, DONT_INLINE]
      0x0709: PHI (r29v5 int) = (r29v1 int), (r29v6 int) binds: [B:324:0x0707, B:327:0x070d] A[DONT_GENERATE, DONT_INLINE]
      0x0709: PHI (r30v11 int) = (r30v9 int), (r30v13 int) binds: [B:324:0x0707, B:327:0x070d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:331:0x0723  */
    /* JADX WARN: Code duplicated, block: B:333:0x0726  */
    /* JADX WARN: Code duplicated, block: B:335:0x0733  */
    /* JADX WARN: Code duplicated, block: B:336:0x0735  */
    /* JADX WARN: Code duplicated, block: B:339:0x073a  */
    /* JADX WARN: Code duplicated, block: B:340:0x0746  */
    /* JADX WARN: Code duplicated, block: B:354:0x0793 A[DONT_INVERT, LOOP:16: B:354:0x0793->B:358:0x079d, LOOP_START, PHI: r29
      0x0793: PHI (r29v2 int) = (r29v1 int), (r29v3 int) binds: [B:353:0x0791, B:358:0x079d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:355:0x0795  */
    /* JADX WARN: Code duplicated, block: B:358:0x079d A[LOOP:16: B:354:0x0793->B:358:0x079d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:359:0x07a3 A[EDGE_INSN: B:359:0x07a3->B:360:0x07a4 BREAK  A[LOOP:16: B:354:0x0793->B:358:0x079d]] */
    /* JADX WARN: Code duplicated, block: B:368:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:370:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:371:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:376:0x0800  */
    /* JADX WARN: Code duplicated, block: B:383:0x084b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:384:0x084d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0867  */
    /* JADX WARN: Code duplicated, block: B:389:0x0877  */
    /* JADX WARN: Code duplicated, block: B:395:0x089a  */
    /* JADX WARN: Code duplicated, block: B:397:0x089f  */
    /* JADX WARN: Code duplicated, block: B:399:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:403:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:427:0x097e  */
    /* JADX WARN: Code duplicated, block: B:429:0x0985  */
    /* JADX WARN: Code duplicated, block: B:438:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:439:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:442:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:444:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:447:0x0a22  */
    /* JADX WARN: Code duplicated, block: B:449:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:450:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:457:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:468:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:476:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:480:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:481:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:484:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:485:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:487:0x0aaf  */
    /* JADX WARN: Code duplicated, block: B:488:0x0ab2  */
    /* JADX WARN: Code duplicated, block: B:490:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:492:0x0ab9  */
    /* JADX WARN: Code duplicated, block: B:493:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:495:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:496:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:499:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:501:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:502:0x0af2  */
    /* JADX WARN: Code duplicated, block: B:505:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:507:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:510:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:514:0x0b33 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:522:0x0b76  */
    /* JADX WARN: Code duplicated, block: B:544:0x08ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x0a34 A[EDGE_INSN: B:549:0x0a34->B:454:0x0a34 BREAK  A[LOOP:8: B:445:0x0a1f->B:453:0x0a31], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0a31 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0a4b A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x0a6c A[ADDED_TO_REGION, EDGE_INSN: B:555:0x0a6c->B:471:0x0a6c BREAK  A[LOOP:10: B:466:0x0a59->B:470:0x0a65], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x0b44 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x0780 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x06e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x06db A[EDGE_INSN: B:569:0x06db->B:317:0x06db BREAK  A[LOOP:14: B:313:0x06be->B:316:0x06c6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x07a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x079b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0167  */
    /* JADX WARN: Code duplicated, block: B:79:0x016a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0177  */
    /* JADX WARN: Code duplicated, block: B:83:0x017a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0188  */
    /* JADX WARN: Code duplicated, block: B:88:0x018f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code duplicated, block: B:96:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e5  */
    public static ArrayList j(mpm0 mpm0Var, e440 e440Var, long j, x8v x8vVar, boolean z, boolean z2, su30 su30Var, boolean z3) {
        int i;
        long j2;
        long jG0;
        long jG;
        int i2;
        int i3;
        int i4;
        boolean z4;
        d2c d2cVar;
        long j3;
        long j4;
        long jG1;
        long j5;
        izr0 izr0Var;
        int iE;
        int i5;
        long jG2;
        int i6;
        int i7;
        ArrayList arrayList;
        int i8;
        long j6;
        ArrayList arrayList2;
        int i9;
        char[] cArr;
        int i10;
        int i11;
        String str;
        npm0 npm0VarN;
        b2c b2cVarI;
        mpm0 mpm0VarM;
        int iQ;
        f380 f380Var;
        f380 f380Var2;
        ie30 ie30Var;
        int i12;
        ljf1 ljf1Var;
        lpm0 lpm0Var;
        hjj0 hjj0Var;
        hjj0 hjj0Var2;
        mpm0 mpm0VarM2;
        Pair pairCreate;
        npm0 npm0VarN2;
        char c;
        int i13;
        int i14;
        long jK;
        a2c c2cVar;
        boolean z5;
        int I;
        int I2;
        int I3;
        int iD;
        boolean z6;
        ArrayList arrayList3;
        boolean z7;
        long[] jArr;
        izr0 izr0Var2;
        int[] iArrCopyOf;
        a2c a2cVar;
        long[] jArr2;
        int[] iArr;
        izr0 izr0Var3;
        int i15;
        int i16;
        long j7;
        long j8;
        long j9;
        int iQ2;
        int i17;
        int i18;
        int I4;
        int i19;
        int i20;
        int[] iArrCopyOf2;
        long[] jArr3;
        int i21;
        long[] jArrCopyOf;
        boolean z8;
        String str2;
        int[] iArr2;
        int i22;
        long j10;
        int i23;
        long j11;
        long j12;
        int i24;
        boolean zA;
        int i25;
        int iA;
        long[] jArr4;
        int I5;
        int i26;
        long j13;
        int i27;
        long j14;
        ie30 ie30Var2;
        f380 f380Var3;
        f380 f380Var4;
        long jG3;
        int[] iArrB0;
        int i28;
        long[] jArr5;
        int[] iArr3;
        long[] jArr6;
        int[] iArr4;
        int i29;
        int i30;
        int[] iArr5;
        int i31;
        boolean z9;
        int[] iArr6;
        int[] iArr7;
        int i32;
        int i33;
        int i34;
        boolean z10;
        f380 f380Var5;
        int[] iArr8;
        int[] iArr9;
        boolean z11;
        boolean z12;
        long[] jArr7;
        int[] iArr10;
        int[] iArr11;
        ArrayList arrayList4;
        long[] jArr8;
        int i35;
        boolean z13;
        int i36;
        long jA;
        ie30 ie30Var3;
        uzf1 uzf1Var;
        long jA2;
        int i37;
        boolean z14;
        int i38;
        int[] iArr12;
        int i39;
        int i40;
        long jG4;
        int[] iArr13;
        long jA3;
        int i41;
        long jG5;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        boolean z15;
        int i48;
        uzf1 uzf1Var2;
        long jA4;
        int i49;
        long jG6;
        long jG7;
        int i50;
        long[] jArr9;
        int[] iArr14;
        long j15;
        int i51;
        int i52;
        int iG;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        long j16;
        int iMax;
        int i58;
        int i59;
        int i60;
        mpm0 mpm0Var2 = mpm0Var;
        ArrayList arrayList5 = mpm0Var2.g;
        ArrayList arrayList6 = new ArrayList();
        int i61 = 0;
        while (i61 < arrayList5.size()) {
            mpm0 mpm0Var3 = (mpm0) arrayList5.get(i61);
            if (mpm0Var3.b != 1953653099) {
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                i11 = i61;
            } else {
                npm0 npm0VarN3 = mpm0Var2.n(1836476516);
                npm0VarN3.getClass();
                mpm0 mpm0VarM3 = mpm0Var3.m(1835297121);
                mpm0VarM3.getClass();
                npm0 npm0VarN4 = mpm0VarM3.n(1751411826);
                npm0VarN4.getClass();
                izr0 izr0Var4 = npm0VarN4.e;
                izr0Var4.R(16);
                int iQ3 = izr0Var4.q();
                if (iQ3 == 1936684398) {
                    i = 1;
                } else if (iQ3 == 1986618469) {
                    i = 2;
                } else if (iQ3 == 1952807028 || iQ3 == 1935832172 || iQ3 == 1937072756 || iQ3 == 1668047728 || iQ3 == 1937072752) {
                    i = 3;
                } else {
                    i = iQ3 == 1835365473 ? 5 : -1;
                }
                int i62 = 1;
                if (i == -1) {
                    su30Var = su30Var;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    i11 = i61;
                    mpm0Var3 = mpm0Var3;
                    ljf1Var = null;
                    j2 = 0;
                } else {
                    j2 = 0;
                    npm0 npm0VarN5 = mpm0Var3.n(1953196132);
                    npm0VarN5.getClass();
                    izr0 izr0Var5 = npm0VarN5.e;
                    izr0Var5.R(8);
                    int iE2 = e(izr0Var5.q());
                    izr0Var5.S(iE2 != 0 ? 16 : 8);
                    int iQ4 = izr0Var5.q();
                    izr0Var5.S(4);
                    int i63 = izr0Var5.b;
                    int i64 = iE2 == 0 ? 4 : 8;
                    int i65 = 0;
                    while (true) {
                        jG0 = -9223372036854775807L;
                        if (i65 >= i64) {
                            izr0Var5.S(i64);
                        } else {
                            if (izr0Var5.a[i63 + i65] != -1) {
                                jG = iE2 == 0 ? izr0Var5.G() : izr0Var5.K();
                                if (jG != 0) {
                                    break;
                                }
                                break;
                            }
                            i65++;
                        }
                        jG = -9223372036854775807L;
                        break;
                    }
                    izr0Var5.S(10);
                    int iL = izr0Var5.L();
                    izr0Var5.S(4);
                    int iQ5 = izr0Var5.q();
                    int iQ6 = izr0Var5.q();
                    izr0Var5.S(4);
                    int iQ7 = izr0Var5.q();
                    int iQ8 = izr0Var5.q();
                    if (iQ5 == 0 && iQ6 == 65536 && ((iQ7 == -65536 || iQ7 == 65536) && iQ8 == 0)) {
                        i2 = 90;
                    } else if (iQ5 == 0 && iQ6 == -65536 && ((iQ7 == 65536 || iQ7 == -65536) && iQ8 == 0)) {
                        i2 = 270;
                    } else {
                        if ((iQ5 == -65536 || iQ5 == 65536) && iQ6 == 0 && iQ7 == 0 && iQ8 == -65536) {
                            i2 = 180;
                        } else {
                            i3 = 0;
                        }
                        izr0Var5.S(16);
                        short sB = izr0Var5.B();
                        izr0Var5.S(2);
                        short sB2 = izr0Var5.B();
                        i4 = i61;
                        if ((((long) iQ5) * ((long) iQ8)) - (((long) iQ6) * ((long) iQ7)) < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        d2cVar = new d2c(iQ4, jG, iL, i3, z4, sB, sB2);
                        if (j == -9223372036854775807L) {
                            j3 = jG;
                        } else {
                            j3 = j;
                        }
                        j4 = g(npm0VarN3.e).c;
                        if (j3 == -9223372036854775807L) {
                            j5 = j4;
                            jG1 = -9223372036854775807L;
                        } else {
                            String str3 = zoi1.a;
                            jG1 = zoi1.g0(j3, 1000000L, j4, RoundingMode.DOWN);
                            j5 = j4;
                        }
                        mpm0 mpm0VarM4 = mpm0VarM3.m(1835626086);
                        mpm0VarM4.getClass();
                        mpm0 mpm0VarM5 = mpm0VarM4.m(1937007212);
                        mpm0VarM5.getClass();
                        npm0 npm0VarN6 = mpm0VarM3.n(1835296868);
                        npm0VarN6.getClass();
                        izr0Var = npm0VarN6.e;
                        izr0Var.R(8);
                        iE = e(izr0Var.q());
                        if (iE == 0) {
                            i5 = 8;
                        } else {
                            i5 = 16;
                        }
                        izr0Var.S(i5);
                        jG2 = izr0Var.G();
                        i6 = izr0Var.b;
                        if (iE == 0) {
                            i7 = 4;
                        } else {
                            i7 = 8;
                        }
                        arrayList = arrayList5;
                        i8 = 0;
                        while (true) {
                            if (i8 < i7) {
                                izr0Var.S(i7);
                                break;
                            }
                            i13 = i8;
                            i14 = iE;
                            if (izr0Var.a[i6 + i13] != -1) {
                                if (i14 == 0) {
                                    jK = izr0Var.G();
                                } else {
                                    jK = izr0Var.K();
                                }
                                if (jK != 0) {
                                    String str4 = zoi1.a;
                                    jG0 = zoi1.g0(jK, 1000000L, jG2, RoundingMode.DOWN);
                                }
                                break;
                            }
                            arrayList6 = arrayList6;
                            i8 = i13 + 1;
                            iE = i14;
                        }
                        j6 = jG0;
                        int iL2 = izr0Var.L();
                        char c2 = (char) (((iL2 >> 10) & 31) + 96);
                        char c3 = (char) (((iL2 >> 5) & 31) + 96);
                        char c4 = (char) ((iL2 & 31) + 96);
                        arrayList2 = arrayList6;
                        i9 = 3;
                        cArr = new char[]{c2, c3, c4};
                        i10 = 0;
                        while (true) {
                            if (i10 < i9) {
                                i11 = i4;
                                str = new String(cArr);
                                break;
                            }
                            c = cArr[i10];
                            i11 = i4;
                            if (c >= 'a' || c > 'z') {
                                str = null;
                                break;
                            }
                            i10++;
                            i4 = i11;
                            i9 = 3;
                        }
                        npm0VarN = mpm0VarM5.n(1937011556);
                        if (npm0VarN == null) {
                            oon1.H("Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                            mpm0Var3 = mpm0Var3;
                        } else {
                            b2cVarI = i(npm0VarN.e, d2cVar, str, x8vVar, z2);
                            mpm0VarM = mpm0Var3.m(1953654118);
                            if (mpm0VarM != null || (npm0VarN2 = mpm0VarM.n(1667785072)) == null) {
                                iQ = -1;
                            } else {
                                izr0 izr0Var6 = npm0VarN2.e;
                                izr0Var6.R(8);
                                if (izr0Var6.a() >= 4) {
                                    iQ = izr0Var6.q();
                                } else {
                                    iQ = -1;
                                }
                            }
                            if (!z || (mpm0VarM2 = mpm0Var3.m(1701082227)) == null) {
                                j6 = j6;
                                mpm0Var3 = mpm0Var3;
                                jG1 = jG1;
                                iQ = iQ;
                            } else {
                                npm0 npm0VarN7 = mpm0VarM2.n(1701606260);
                                if (npm0VarN7 == null) {
                                    pairCreate = null;
                                } else {
                                    izr0 izr0Var7 = npm0VarN7.e;
                                    izr0Var7.R(8);
                                    int iE3 = e(izr0Var7.q());
                                    int I6 = izr0Var7.I();
                                    dm5.l("Invalid initialCapacity: %s", I6, I6 >= 0);
                                    long[] jArr10 = new long[I6];
                                    dm5.l("Invalid initialCapacity: %s", I6, I6 >= 0);
                                    long[] jArrCopyOf2 = new long[I6];
                                    int i66 = 0;
                                    long[] jArrCopyOf3 = jArr10;
                                    int i67 = 0;
                                    int i68 = 0;
                                    while (i67 < I6) {
                                        long jK2 = iE3 == i62 ? izr0Var7.K() : izr0Var7.G();
                                        int i69 = i68 + 1;
                                        int i70 = i67;
                                        if (i69 > jArrCopyOf3.length) {
                                            int length = jArrCopyOf3.length;
                                            if (i69 < 0) {
                                                eg.f("cannot store more than MAX_VALUE elements");
                                                return null;
                                            }
                                            int iHighestOneBit = length + (length >> 1) + 1;
                                            if (iHighestOneBit < i69) {
                                                iHighestOneBit = Integer.highestOneBit(i68) << 1;
                                            }
                                            if (iHighestOneBit < 0) {
                                                iHighestOneBit = Integer.MAX_VALUE;
                                            }
                                            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, iHighestOneBit);
                                        }
                                        long[] jArr11 = jArrCopyOf3;
                                        jArrCopyOf3[i68] = jK2;
                                        int i71 = i68 + 1;
                                        int i72 = i66 + 1;
                                        long jY = iE3 == 1 ? izr0Var7.y() : izr0Var7.q();
                                        if (i72 > jArrCopyOf2.length) {
                                            int length2 = jArrCopyOf2.length;
                                            if (i72 < 0) {
                                                eg.f("cannot store more than MAX_VALUE elements");
                                                return null;
                                            }
                                            int iHighestOneBit2 = length2 + (length2 >> 1) + 1;
                                            if (iHighestOneBit2 < i72) {
                                                iHighestOneBit2 = Integer.highestOneBit(i66) << 1;
                                            }
                                            if (iHighestOneBit2 < 0) {
                                                iHighestOneBit2 = Integer.MAX_VALUE;
                                            }
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, iHighestOneBit2);
                                        }
                                        long[] jArr12 = jArrCopyOf2;
                                        jArrCopyOf2[i66] = jY;
                                        i66++;
                                        if (izr0Var7.B() != 1) {
                                            hhg1.n("Unsupported media rate.");
                                            return null;
                                        }
                                        izr0Var7.S(2);
                                        jArrCopyOf2 = jArr12;
                                        i67 = i70 + 1;
                                        jArrCopyOf3 = jArr11;
                                        i68 = i71;
                                        i62 = 1;
                                    }
                                    f380 f380Var6 = f380.c;
                                    f380 f380Var7 = i68 == 0 ? f380Var6 : new f380(jArrCopyOf3, i68);
                                    if (i66 != 0) {
                                        f380Var6 = new f380(jArrCopyOf2, i66);
                                    }
                                    pairCreate = Pair.create(f380Var7, f380Var6);
                                }
                                if (pairCreate != null) {
                                    f380Var2 = (f380) pairCreate.first;
                                    f380Var = (f380) pairCreate.second;
                                }
                                ie30Var = (ie30) b2cVarI.d;
                                if (ie30Var != null) {
                                    i12 = d2cVar.b;
                                    if (i12 != 0) {
                                        lpm0Var = new lpm0(i12);
                                        ge30 ge30VarA = ie30Var.a();
                                        hjj0Var = ((ie30) b2cVarI.d).m;
                                        if (hjj0Var != null) {
                                            hjj0Var2 = hjj0Var.a(lpm0Var);
                                        } else {
                                            hjj0Var2 = new hjj0(lpm0Var);
                                        }
                                        ge30VarA.l = hjj0Var2;
                                        ie30Var = new ie30(ge30VarA);
                                    }
                                    boolean z16 = !Objects.equals(ie30Var.f66p, "text/x-unknown");
                                    ajf1 ajf1Var = new ajf1();
                                    ajf1Var.m = true;
                                    ajf1Var.n = -1;
                                    ajf1Var.a = d2cVar.a;
                                    ajf1Var.b = i;
                                    ajf1Var.c = jG2;
                                    ajf1Var.d = j5;
                                    ajf1Var.e = jG1;
                                    ajf1Var.f = j6;
                                    ajf1Var.g = ie30Var;
                                    ajf1Var.h = b2cVarI.b;
                                    ajf1Var.i = (dnf1[]) ((dnf1[]) b2cVarI.c).clone();
                                    ajf1Var.j = b2cVarI.a;
                                    ajf1Var.k = f380Var2;
                                    ajf1Var.l = f380Var;
                                    ajf1Var.m = z16;
                                    ajf1Var.n = iQ;
                                    ajf1Var.g.getClass();
                                    ljf1Var = new ljf1(ajf1Var);
                                    su30Var = su30Var;
                                }
                            }
                            f380Var = null;
                            f380Var2 = null;
                            ie30Var = (ie30) b2cVarI.d;
                            if (ie30Var != null) {
                                i12 = d2cVar.b;
                                if (i12 != 0) {
                                    lpm0Var = new lpm0(i12);
                                    ge30 ge30VarA2 = ie30Var.a();
                                    hjj0Var = ((ie30) b2cVarI.d).m;
                                    if (hjj0Var != null) {
                                        hjj0Var2 = hjj0Var.a(lpm0Var);
                                    } else {
                                        hjj0Var2 = new hjj0(lpm0Var);
                                    }
                                    ge30VarA2.l = hjj0Var2;
                                    ie30Var = new ie30(ge30VarA2);
                                }
                                boolean z17 = !Objects.equals(ie30Var.f66p, "text/x-unknown");
                                ajf1 ajf1Var2 = new ajf1();
                                ajf1Var2.m = true;
                                ajf1Var2.n = -1;
                                ajf1Var2.a = d2cVar.a;
                                ajf1Var2.b = i;
                                ajf1Var2.c = jG2;
                                ajf1Var2.d = j5;
                                ajf1Var2.e = jG1;
                                ajf1Var2.f = j6;
                                ajf1Var2.g = ie30Var;
                                ajf1Var2.h = b2cVarI.b;
                                ajf1Var2.i = (dnf1[]) ((dnf1[]) b2cVarI.c).clone();
                                ajf1Var2.j = b2cVarI.a;
                                ajf1Var2.k = f380Var2;
                                ajf1Var2.l = f380Var;
                                ajf1Var2.m = z17;
                                ajf1Var2.n = iQ;
                                ajf1Var2.g.getClass();
                                ljf1Var = new ljf1(ajf1Var2);
                                su30Var = su30Var;
                            }
                        }
                        ljf1Var = null;
                    }
                    i3 = i2;
                    izr0Var5.S(16);
                    short sB3 = izr0Var5.B();
                    izr0Var5.S(2);
                    short sB4 = izr0Var5.B();
                    i4 = i61;
                    if ((((long) iQ5) * ((long) iQ8)) - (((long) iQ6) * ((long) iQ7)) < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    d2cVar = new d2c(iQ4, jG, iL, i3, z4, sB3, sB4);
                    if (j == -9223372036854775807L) {
                        j3 = jG;
                    } else {
                        j3 = j;
                    }
                    j4 = g(npm0VarN3.e).c;
                    if (j3 == -9223372036854775807L) {
                        j5 = j4;
                        jG1 = -9223372036854775807L;
                    } else {
                        String str5 = zoi1.a;
                        jG1 = zoi1.g0(j3, 1000000L, j4, RoundingMode.DOWN);
                        j5 = j4;
                    }
                    mpm0 mpm0VarM6 = mpm0VarM3.m(1835626086);
                    mpm0VarM6.getClass();
                    mpm0 mpm0VarM7 = mpm0VarM6.m(1937007212);
                    mpm0VarM7.getClass();
                    npm0 npm0VarN8 = mpm0VarM3.n(1835296868);
                    npm0VarN8.getClass();
                    izr0Var = npm0VarN8.e;
                    izr0Var.R(8);
                    iE = e(izr0Var.q());
                    if (iE == 0) {
                        i5 = 8;
                    } else {
                        i5 = 16;
                    }
                    izr0Var.S(i5);
                    jG2 = izr0Var.G();
                    i6 = izr0Var.b;
                    if (iE == 0) {
                        i7 = 4;
                    } else {
                        i7 = 8;
                    }
                    arrayList = arrayList5;
                    i8 = 0;
                    while (true) {
                        if (i8 < i7) {
                            izr0Var.S(i7);
                            break;
                        }
                        i13 = i8;
                        i14 = iE;
                        if (izr0Var.a[i6 + i13] != -1) {
                            if (i14 == 0) {
                                jK = izr0Var.G();
                            } else {
                                jK = izr0Var.K();
                            }
                            if (jK != 0) {
                                String str6 = zoi1.a;
                                jG0 = zoi1.g0(jK, 1000000L, jG2, RoundingMode.DOWN);
                            }
                            break;
                            break;
                        }
                        arrayList6 = arrayList6;
                        i8 = i13 + 1;
                        iE = i14;
                    }
                    j6 = jG0;
                    int iL3 = izr0Var.L();
                    char c5 = (char) (((iL3 >> 10) & 31) + 96);
                    char c6 = (char) (((iL3 >> 5) & 31) + 96);
                    char c7 = (char) ((iL3 & 31) + 96);
                    arrayList2 = arrayList6;
                    i9 = 3;
                    cArr = new char[]{c5, c6, c7};
                    i10 = 0;
                    while (true) {
                        if (i10 < i9) {
                            i11 = i4;
                            str = new String(cArr);
                            break;
                        }
                        c = cArr[i10];
                        i11 = i4;
                        if (c >= 'a') {
                        }
                        str = null;
                        break;
                        i10++;
                        i4 = i11;
                        i9 = 3;
                    }
                    npm0VarN = mpm0VarM7.n(1937011556);
                    if (npm0VarN == null) {
                        oon1.H("Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        mpm0Var3 = mpm0Var3;
                    } else {
                        b2cVarI = i(npm0VarN.e, d2cVar, str, x8vVar, z2);
                        mpm0VarM = mpm0Var3.m(1953654118);
                        if (mpm0VarM != null) {
                            iQ = -1;
                        } else {
                            iQ = -1;
                        }
                        if (z) {
                            j6 = j6;
                            mpm0Var3 = mpm0Var3;
                            jG1 = jG1;
                            iQ = iQ;
                            f380Var = null;
                            f380Var2 = null;
                        } else {
                            j6 = j6;
                            mpm0Var3 = mpm0Var3;
                            jG1 = jG1;
                            iQ = iQ;
                            f380Var = null;
                            f380Var2 = null;
                        }
                        ie30Var = (ie30) b2cVarI.d;
                        if (ie30Var != null) {
                            i12 = d2cVar.b;
                            if (i12 != 0) {
                                lpm0Var = new lpm0(i12);
                                ge30 ge30VarA3 = ie30Var.a();
                                hjj0Var = ((ie30) b2cVarI.d).m;
                                if (hjj0Var != null) {
                                    hjj0Var2 = hjj0Var.a(lpm0Var);
                                } else {
                                    hjj0Var2 = new hjj0(lpm0Var);
                                }
                                ge30VarA3.l = hjj0Var2;
                                ie30Var = new ie30(ge30VarA3);
                            }
                            boolean z18 = !Objects.equals(ie30Var.f66p, "text/x-unknown");
                            ajf1 ajf1Var3 = new ajf1();
                            ajf1Var3.m = true;
                            ajf1Var3.n = -1;
                            ajf1Var3.a = d2cVar.a;
                            ajf1Var3.b = i;
                            ajf1Var3.c = jG2;
                            ajf1Var3.d = j5;
                            ajf1Var3.e = jG1;
                            ajf1Var3.f = j6;
                            ajf1Var3.g = ie30Var;
                            ajf1Var3.h = b2cVarI.b;
                            ajf1Var3.i = (dnf1[]) ((dnf1[]) b2cVarI.c).clone();
                            ajf1Var3.j = b2cVarI.a;
                            ajf1Var3.k = f380Var2;
                            ajf1Var3.l = f380Var;
                            ajf1Var3.m = z18;
                            ajf1Var3.n = iQ;
                            ajf1Var3.g.getClass();
                            ljf1Var = new ljf1(ajf1Var3);
                            su30Var = su30Var;
                        }
                    }
                    ljf1Var = null;
                }
                ljf1 ljf1Var2 = (ljf1) su30Var.apply(ljf1Var);
                if (ljf1Var2 == null) {
                    arrayList2 = arrayList2;
                } else {
                    ie30 ie30Var4 = ljf1Var2.g;
                    mpm0 mpm0VarM8 = mpm0Var3.m(1835297121);
                    mpm0VarM8.getClass();
                    mpm0 mpm0VarM9 = mpm0VarM8.m(1835626086);
                    mpm0VarM9.getClass();
                    mpm0 mpm0VarM10 = mpm0VarM9.m(1937007212);
                    mpm0VarM10.getClass();
                    npm0 npm0VarN9 = mpm0VarM10.n(1937011578);
                    if (npm0VarN9 != null) {
                        c2cVar = new pyp0(npm0VarN9, ie30Var4);
                    } else {
                        npm0 npm0VarN10 = mpm0VarM10.n(1937013298);
                        if (npm0VarN10 == null) {
                            throw ParserException.a((RuntimeException) null, "Track has no sample table size information");
                        }
                        c2cVar = new c2c(npm0VarN10);
                    }
                    int iK = c2cVar.k();
                    if (iK == 0) {
                        uzf1Var = new uzf1(ljf1Var2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (ljf1Var2.b == 2) {
                            long j17 = ljf1Var2.f;
                            if (j17 > j2) {
                                ge30 ge30VarA4 = ie30Var4.a();
                                ge30VarA4.c(iK / (j17 / 1000000.0f));
                                ie30 ie30Var5 = new ie30(ge30VarA4);
                                ajf1 ajf1VarA = ljf1Var2.a();
                                ajf1VarA.g = ie30Var5;
                                ljf1Var2 = new ljf1(ajf1VarA);
                            }
                        }
                        ie30 ie30Var6 = ljf1Var2.g;
                        npm0 npm0VarN11 = mpm0VarM10.n(1937007471);
                        if (npm0VarN11 == null) {
                            npm0VarN11 = mpm0VarM10.n(1668232756);
                            npm0VarN11.getClass();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        izr0 izr0Var8 = npm0VarN11.e;
                        npm0 npm0VarN12 = mpm0VarM10.n(1937011555);
                        npm0VarN12.getClass();
                        izr0 izr0Var9 = npm0VarN12.e;
                        npm0 npm0VarN13 = mpm0VarM10.n(1937011827);
                        npm0VarN13.getClass();
                        izr0 izr0Var10 = npm0VarN13.e;
                        npm0 npm0VarN14 = mpm0VarM10.n(1937011571);
                        izr0 izr0Var11 = npm0VarN14 != null ? npm0VarN14.e : null;
                        npm0 npm0VarN15 = mpm0VarM10.n(1668576371);
                        izr0 izr0Var12 = npm0VarN15 != null ? npm0VarN15.e : null;
                        y1c y1cVar = new y1c(izr0Var9, izr0Var8, z5);
                        izr0Var10.R(12);
                        int I7 = izr0Var10.I() - 1;
                        int I8 = izr0Var10.I();
                        int I9 = izr0Var10.I();
                        if (izr0Var12 != null) {
                            izr0Var12.R(12);
                            I = izr0Var12.I();
                        } else {
                            I = 0;
                        }
                        if (izr0Var11 != null) {
                            izr0Var11.R(12);
                            I2 = izr0Var11.I();
                            if (I2 > 0) {
                                I3 = izr0Var11.I() - 1;
                            } else {
                                izr0Var11 = null;
                            }
                            iD = c2cVar.d();
                            String str7 = ie30Var6.f66p;
                            if (iD == -1 && (("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && I7 == 0 && I == 0 && I2 == 0)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            arrayList3 = new ArrayList();
                            if (izr0Var11 == null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z6) {
                                i50 = y1cVar.a;
                                jArr9 = new long[i50];
                                iArr14 = new int[i50];
                                while (y1cVar.a()) {
                                    int i73 = y1cVar.b;
                                    jArr9[i73] = y1cVar.d;
                                    iArr14[i73] = y1cVar.c;
                                }
                                j15 = I9;
                                i51 = SemanticState.Multiline / iD;
                                iG = 0;
                                for (i52 = 0; i52 < i50; i52++) {
                                    iG += zoi1.g(iArr14[i52], i51);
                                }
                                jArr3 = new long[iG];
                                iArr2 = new int[iG];
                                jArrCopyOf = new long[iG];
                                iArrCopyOf2 = new int[iG];
                                i53 = 0;
                                i54 = 0;
                                i55 = 0;
                                i56 = 0;
                                i57 = 0;
                                while (i54 < i50) {
                                    int i74 = iArr14[i54];
                                    j16 = jArr9[i54];
                                    int i75 = i57;
                                    int i76 = i50;
                                    iMax = i56;
                                    i58 = i75;
                                    i59 = i53;
                                    i60 = i74;
                                    while (i60 > 0) {
                                        int iMin = Math.min(i51, i60);
                                        jArr3[i58] = j16;
                                        int i77 = i60;
                                        int i78 = iD * iMin;
                                        iArr2[i58] = i78;
                                        i59 += i78;
                                        iMax = Math.max(iMax, i78);
                                        long j18 = j15;
                                        jArrCopyOf[i58] = j18 * ((long) i55);
                                        iArrCopyOf2[i58] = 1;
                                        j16 += (long) iArr2[i58];
                                        i55 += iMin;
                                        i60 = i77 - iMin;
                                        i58++;
                                        iArr14 = iArr14;
                                        j15 = j18;
                                    }
                                    i54++;
                                    int i79 = i58;
                                    i56 = iMax;
                                    i50 = i76;
                                    i57 = i79;
                                    i53 = i59;
                                }
                                long j19 = j15 * ((long) i55);
                                j11 = i53;
                                if (z3) {
                                    jArr3 = new long[0];
                                }
                                if (z3) {
                                    iArr2 = new int[0];
                                }
                                if (z3) {
                                    jArrCopyOf = new long[0];
                                }
                                if (z3) {
                                    iArrCopyOf2 = new int[0];
                                }
                                j10 = j19;
                                i22 = iG;
                                i23 = i56;
                                arrayList3 = arrayList3;
                            } else {
                                if (z3) {
                                    jArr = new long[0];
                                } else {
                                    jArr = new long[iK];
                                }
                                izr0Var2 = izr0Var12;
                                if (z3) {
                                    iArrCopyOf = new int[0];
                                } else {
                                    iArrCopyOf = new int[iK];
                                }
                                a2cVar = c2cVar;
                                if (z3) {
                                    jArr2 = new long[0];
                                } else {
                                    jArr2 = new long[iK];
                                }
                                int i80 = I2;
                                if (z3) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[iK];
                                }
                                izr0Var3 = izr0Var11;
                                i15 = I;
                                i16 = i80;
                                j7 = j2;
                                j8 = j7;
                                j9 = j8;
                                iK = 0;
                                iQ2 = 0;
                                i17 = 0;
                                i18 = 0;
                                I4 = 0;
                                while (true) {
                                    if (iK < iK) {
                                        long[] jArr13 = jArr2;
                                        i19 = I7;
                                        i20 = I8;
                                        iArrCopyOf2 = iArr;
                                        jArr3 = jArr;
                                        i21 = i18;
                                        jArrCopyOf = jArr13;
                                        break;
                                    }
                                    j12 = j9;
                                    i24 = i18;
                                    zA = true;
                                    while (i24 == 0) {
                                        zA = y1cVar.a();
                                        if (zA) {
                                            break;
                                        }
                                        int i81 = I7;
                                        long j20 = y1cVar.d;
                                        i24 = y1cVar.c;
                                        j12 = j20;
                                        I7 = i81;
                                        I8 = I8;
                                        iK = iK;
                                    }
                                    i25 = iK;
                                    i19 = I7;
                                    i20 = I8;
                                    if (!zA) {
                                        oon1.H("Unexpected end of chunk data");
                                        if (z3) {
                                            jArrCopyOf = jArr2;
                                            iArrCopyOf2 = iArr;
                                            jArr3 = jArr;
                                        } else {
                                            long[] jArrCopyOf4 = Arrays.copyOf(jArr, iK);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iK);
                                            jArr3 = jArrCopyOf4;
                                            jArrCopyOf = Arrays.copyOf(jArr2, iK);
                                            iArrCopyOf2 = Arrays.copyOf(iArr, iK);
                                        }
                                        i21 = i24;
                                        break;
                                    }
                                    if (izr0Var2 != null) {
                                        while (I4 == 0 && i15 > 0) {
                                            I4 = izr0Var2.I();
                                            iQ2 = izr0Var2.q();
                                            i15--;
                                        }
                                        I4--;
                                    }
                                    iA = a2cVar.a();
                                    long j21 = iA;
                                    j8 += j21;
                                    if (iA > i17) {
                                        i17 = iA;
                                    }
                                    if (z3) {
                                        jArr4 = jArr2;
                                    } else {
                                        jArr[iK] = j12;
                                        iArrCopyOf[iK] = iA;
                                        jArr4 = jArr2;
                                        jArr4[iK] = j7 + ((long) iQ2);
                                        if (izr0Var3 == null) {
                                            i26 = 1;
                                        } else {
                                            i26 = 0;
                                        }
                                        iArr[iK] = i26;
                                        if (iK == I3) {
                                            iArr[iK] = 1;
                                            arrayList3.add(Integer.valueOf(iK));
                                        }
                                    }
                                    if (izr0Var3 != null && iK == I3 && (i16 = i16 - 1) > 0) {
                                        I3 = izr0Var3.I() - 1;
                                    }
                                    j7 += (long) I9;
                                    I5 = i20 - 1;
                                    if (I5 != 0 && i19 > 0) {
                                        I5 = izr0Var10.I();
                                        i19--;
                                        I9 = izr0Var10.q();
                                    }
                                    i18 = i24 - 1;
                                    iK++;
                                    j9 = j12 + j21;
                                    I7 = i19;
                                    jArr2 = jArr4;
                                    I8 = I5;
                                    iK = i25;
                                }
                                long j22 = j7 + ((long) iQ2);
                                if (izr0Var2 != null) {
                                    z8 = true;
                                    break;
                                }
                                while (true) {
                                    if (i15 > 0) {
                                        z8 = true;
                                        break;
                                    }
                                    if (izr0Var2.I() != 0) {
                                        z8 = false;
                                        break;
                                    }
                                    izr0Var2.q();
                                    i15--;
                                }
                                if (i16 == 0 || i20 != 0 || i21 != 0 || i19 != 0 || I4 != 0 || !z8) {
                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                    ktd.p(ljf1Var2.a, i16, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb);
                                    ktd.p(i20, i21, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb);
                                    sb.append(i19);
                                    sb.append(", remainingSamplesAtTimestampOffset ");
                                    sb.append(I4);
                                    if (z8) {
                                        str2 = "";
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb.append(str2);
                                    oon1.H(sb.toString());
                                }
                                iArr2 = iArrCopyOf;
                                i22 = iK;
                                j10 = j22;
                                i23 = i17;
                                j11 = j8;
                            }
                            j13 = ljf1Var2.f;
                            if (j13 > j2) {
                                jG7 = zoi1.g0(j11 * 8, 1000000L, j13, RoundingMode.HALF_DOWN);
                                if (jG7 > j2 && jG7 < 2147483647L) {
                                    ge30 ge30VarA5 = ie30Var6.a();
                                    ge30VarA5.i = (int) jG7;
                                    ie30 ie30Var7 = new ie30(ge30VarA5);
                                    ajf1 ajf1VarA2 = ljf1Var2.a();
                                    ajf1VarA2.g = ie30Var7;
                                    ljf1Var2 = new ljf1(ajf1VarA2);
                                }
                            }
                            i27 = ljf1Var2.b;
                            j14 = ljf1Var2.c;
                            ie30Var2 = ljf1Var2.g;
                            f380Var3 = ljf1Var2.j;
                            f380Var4 = ljf1Var2.i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jG3 = zoi1.g0(j10, 1000000L, j14, roundingMode);
                            iArrB0 = bmq0.b0(arrayList3);
                            if (f380Var4 == null) {
                                if (!z3) {
                                    zoi1.f0(jArrCopyOf, j14);
                                }
                                uzf1Var2 = new uzf1(ljf1Var2, jArr3, iArr2, i23, jArrCopyOf, iArrCopyOf2, iArrB0, z7, jG3, i22);
                            } else {
                                i28 = i23;
                                jArr5 = jArr3;
                                iArr3 = iArr2;
                                jArr6 = jArrCopyOf;
                                iArr4 = iArrCopyOf2;
                                i29 = f380Var4.b;
                                if (z3) {
                                    f380Var3.getClass();
                                    if (i29 == 1 || f380Var4.a(0) != j2) {
                                        jA4 = j2;
                                        for (i49 = 0; i49 < i29; i49++) {
                                            if (f380Var3.a(i49) != -1) {
                                                jA4 = f380Var4.a(i49) + jA4;
                                            }
                                        }
                                        jG6 = zoi1.g0(jA4, 1000000L, ljf1Var2.d, RoundingMode.DOWN);
                                    } else {
                                        jG6 = zoi1.g0(j10 - f380Var3.a(0), 1000000L, ljf1Var2.c, roundingMode);
                                    }
                                    uzf1Var2 = new uzf1(ljf1Var2, jArr5, iArr3, i28, jArr6, iArr4, iArrB0, z7, jG6, i22);
                                } else {
                                    if (i29 == 1 || i27 != 1 || jArr6.length < 2) {
                                        i30 = 1;
                                    } else {
                                        f380Var3.getClass();
                                        long jA5 = f380Var3.a(0);
                                        long jG8 = jA5 + zoi1.g0(f380Var4.a(0), ljf1Var2.c, ljf1Var2.d, roundingMode);
                                        int length3 = jArr6.length - 1;
                                        int iJ = zoi1.j(4, 0, length3);
                                        int iJ2 = zoi1.j(jArr6.length - 4, 0, length3);
                                        if (jArr6[0] <= jA5 && jA5 < jArr6[iJ] && jArr6[iJ2] < jG8 && jG8 <= j10 + 2) {
                                            long j23 = j2;
                                            long jMax = Math.max(j23, j10 - jG8);
                                            long jG9 = zoi1.g0(jA5 - jArr6[0], ie30Var2.L, ljf1Var2.c, roundingMode);
                                            long jG10 = zoi1.g0(jMax, ie30Var2.L, ljf1Var2.c, roundingMode);
                                            if ((jG9 != j23 || jG10 != j23) && jG9 <= 2147483647L && jG10 <= 2147483647L) {
                                                e440Var.a = (int) jG9;
                                                e440Var.b = (int) jG10;
                                                zoi1.f0(jArr6, j14);
                                                uzf1Var2 = new uzf1(ljf1Var2, jArr5, iArr3, i28, jArr6, iArr4, iArrB0, z7, zoi1.g0(f380Var4.a(0), 1000000L, ljf1Var2.d, roundingMode), i22);
                                            }
                                        }
                                        i30 = 1;
                                    }
                                    if (i29 == i30 || f380Var4.a(0) != 0) {
                                        iArr5 = iArr4;
                                        i31 = i22;
                                        if (i27 == 1) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        iArr6 = new int[i29];
                                        iArr7 = new int[i29];
                                        f380Var3.getClass();
                                        i32 = 0;
                                        i33 = 0;
                                        i34 = 0;
                                        z10 = false;
                                        while (i34 < i29) {
                                            int[] iArr15 = iArr5;
                                            iArr13 = iArr7;
                                            jA3 = f380Var3.a(i34);
                                            if (jA3 != -1) {
                                                i41 = i34;
                                                boolean z19 = z10;
                                                jG5 = zoi1.g0(f380Var4.a(i34), ljf1Var2.c, ljf1Var2.d, RoundingMode.DOWN) + jA3;
                                                iArr6[i41] = zoi1.f(jArr6, jA3, true);
                                                int iB = zoi1.b(jArr6, jG5, z9);
                                                i42 = iB - 1;
                                                i44 = 0;
                                                for (i43 = iB; i43 < jArr6.length; i43++) {
                                                    if (jArr6[i43] >= jG5) {
                                                        i44++;
                                                        if (i44 > ie30Var2.r) {
                                                            break;
                                                        }
                                                    } else {
                                                        i42 = i43;
                                                    }
                                                }
                                                iArr13[i41] = i42 + 1;
                                                i45 = iArr6[i41];
                                                while (true) {
                                                    i46 = iArr6[i41];
                                                    if (i46 > 0 || (iArr15[i46] & 1) != 0) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr6[i41] = i46 - 1;
                                                }
                                                if (i46 == 0 && (iArr15[0] & 1) == 0) {
                                                    iArr6[i41] = i45;
                                                    while (true) {
                                                        i48 = iArr6[i41];
                                                        if (i48 < iArr13[i41] || (iArr15[i48] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr6[i41] = i48 + 1;
                                                    }
                                                }
                                                int i82 = iArr13[i41];
                                                i47 = iArr6[i41];
                                                int i83 = (i82 - i47) + i32;
                                                if (i33 != i47) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                i33 = i82;
                                                z10 = z19 | z15;
                                                i32 = i83;
                                            } else {
                                                i41 = i34;
                                            }
                                            i34 = i41 + 1;
                                            iArr7 = iArr13;
                                            f380Var4 = f380Var4;
                                            z9 = z9;
                                            iArr5 = iArr15;
                                        }
                                        f380Var5 = f380Var4;
                                        iArr8 = iArr5;
                                        iArr9 = iArr7;
                                        boolean z20 = z10;
                                        if (i32 != i31) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        z12 = z20 | z11;
                                        if (z12) {
                                            jArr7 = new long[i32];
                                        } else {
                                            jArr7 = jArr5;
                                        }
                                        if (z12) {
                                            iArr10 = new int[i32];
                                        } else {
                                            iArr10 = iArr3;
                                        }
                                        if (z12) {
                                            i28 = 0;
                                        }
                                        if (z12) {
                                            iArr11 = new int[i32];
                                        } else {
                                            iArr11 = iArr8;
                                        }
                                        if (z12) {
                                            arrayList4 = new ArrayList();
                                        } else {
                                            arrayList4 = arrayList3;
                                        }
                                        jArr8 = new long[i32];
                                        i35 = 0;
                                        z13 = false;
                                        i36 = 0;
                                        jA = 0;
                                        while (i35 < i29) {
                                            jA2 = f380Var3.a(i35);
                                            int i84 = i29;
                                            i37 = iArr6[i35];
                                            z14 = z12;
                                            i38 = iArr9[i35];
                                            ie30 ie30Var8 = ie30Var2;
                                            if (z14) {
                                                int i85 = i38 - i37;
                                                System.arraycopy(jArr5, i37, jArr7, i36, i85);
                                                System.arraycopy(iArr3, i37, iArr10, i36, i85);
                                                iArr12 = iArr8;
                                                System.arraycopy(iArr12, i37, iArr11, i36, i85);
                                            } else {
                                                iArr12 = iArr8;
                                            }
                                            i39 = i28;
                                            while (i37 < i38) {
                                                i40 = i37;
                                                int i86 = i38;
                                                long j24 = ljf1Var2.d;
                                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                long jG11 = zoi1.g0(jA, 1000000L, j24, roundingMode2);
                                                jG4 = zoi1.g0(jArr6[i40] - jA2, 1000000L, ljf1Var2.c, roundingMode2);
                                                if (jG4 < 0) {
                                                    z13 = true;
                                                }
                                                jArr8[i36] = jG11 + jG4;
                                                if (z14 && iArr10[i36] > i39) {
                                                    i39 = iArr3[i40];
                                                }
                                                if (!z14 && !z7 && (iArr11[i36] & 1) != 0) {
                                                    arrayList4.add(Integer.valueOf(i36));
                                                }
                                                i36++;
                                                i37 = i40 + 1;
                                                i38 = i86;
                                            }
                                            jA = f380Var5.a(i35) + jA;
                                            i35++;
                                            i28 = i39;
                                            iArr8 = iArr12;
                                            i29 = i84;
                                            z12 = z14;
                                            ie30Var2 = ie30Var8;
                                            f380Var3 = f380Var3;
                                        }
                                        ie30Var3 = ie30Var2;
                                        long jG12 = zoi1.g0(jA, 1000000L, ljf1Var2.d, RoundingMode.DOWN);
                                        if (z13) {
                                            ge30 ge30VarA6 = ie30Var3.a();
                                            ge30VarA6.u = true;
                                            ie30 ie30Var9 = new ie30(ge30VarA6);
                                            ajf1 ajf1VarA3 = ljf1Var2.a();
                                            ajf1VarA3.g = ie30Var9;
                                            ljf1Var2 = new ljf1(ajf1VarA3);
                                        }
                                        uzf1 uzf1Var3 = new uzf1(ljf1Var2, jArr7, iArr10, i28, jArr8, iArr11, bmq0.b0(arrayList4), z7, jG12, jArr7.length);
                                        arrayList2 = arrayList2;
                                        uzf1Var = uzf1Var3;
                                    } else {
                                        f380Var3.getClass();
                                        long jA6 = f380Var3.a(0);
                                        for (int i87 = 0; i87 < jArr6.length; i87++) {
                                            jArr6[i87] = zoi1.g0(jArr6[i87] - jA6, 1000000L, ljf1Var2.c, RoundingMode.DOWN);
                                        }
                                        uzf1Var2 = new uzf1(ljf1Var2, jArr5, iArr3, i28, jArr6, iArr4, iArrB0, z7, zoi1.g0(j10 - jA6, 1000000L, ljf1Var2.c, RoundingMode.DOWN), i22);
                                    }
                                    arrayList2.add(uzf1Var);
                                }
                            }
                            uzf1Var = uzf1Var2;
                        } else {
                            I2 = 0;
                        }
                        I3 = -1;
                        iD = c2cVar.d();
                        String str8 = ie30Var6.f66p;
                        if (iD == -1) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        arrayList3 = new ArrayList();
                        if (izr0Var11 == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z6) {
                            i50 = y1cVar.a;
                            jArr9 = new long[i50];
                            iArr14 = new int[i50];
                            while (y1cVar.a()) {
                                int i710 = y1cVar.b;
                                jArr9[i710] = y1cVar.d;
                                iArr14[i710] = y1cVar.c;
                            }
                            j15 = I9;
                            i51 = SemanticState.Multiline / iD;
                            iG = 0;
                            while (i52 < i50) {
                                iG += zoi1.g(iArr14[i52], i51);
                            }
                            jArr3 = new long[iG];
                            iArr2 = new int[iG];
                            jArrCopyOf = new long[iG];
                            iArrCopyOf2 = new int[iG];
                            i53 = 0;
                            i54 = 0;
                            i55 = 0;
                            i56 = 0;
                            i57 = 0;
                            while (i54 < i50) {
                                int i711 = iArr14[i54];
                                j16 = jArr9[i54];
                                int i712 = i57;
                                int i713 = i50;
                                iMax = i56;
                                i58 = i712;
                                i59 = i53;
                                i60 = i711;
                                while (i60 > 0) {
                                    int iMin2 = Math.min(i51, i60);
                                    jArr3[i58] = j16;
                                    int i714 = i60;
                                    int i715 = iD * iMin2;
                                    iArr2[i58] = i715;
                                    i59 += i715;
                                    iMax = Math.max(iMax, i715);
                                    long j110 = j15;
                                    jArrCopyOf[i58] = j110 * ((long) i55);
                                    iArrCopyOf2[i58] = 1;
                                    j16 += (long) iArr2[i58];
                                    i55 += iMin2;
                                    i60 = i714 - iMin2;
                                    i58++;
                                    iArr14 = iArr14;
                                    j15 = j110;
                                }
                                i54++;
                                int i716 = i58;
                                i56 = iMax;
                                i50 = i713;
                                i57 = i716;
                                i53 = i59;
                            }
                            long j111 = j15 * ((long) i55);
                            j11 = i53;
                            if (z3) {
                                jArr3 = new long[0];
                            }
                            if (z3) {
                                iArr2 = new int[0];
                            }
                            if (z3) {
                                jArrCopyOf = new long[0];
                            }
                            if (z3) {
                                iArrCopyOf2 = new int[0];
                            }
                            j10 = j111;
                            i22 = iG;
                            i23 = i56;
                            arrayList3 = arrayList3;
                        } else {
                            if (z3) {
                                jArr = new long[0];
                            } else {
                                jArr = new long[iK];
                            }
                            izr0Var2 = izr0Var12;
                            if (z3) {
                                iArrCopyOf = new int[0];
                            } else {
                                iArrCopyOf = new int[iK];
                            }
                            a2cVar = c2cVar;
                            if (z3) {
                                jArr2 = new long[0];
                            } else {
                                jArr2 = new long[iK];
                            }
                            int i88 = I2;
                            if (z3) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[iK];
                            }
                            izr0Var3 = izr0Var11;
                            i15 = I;
                            i16 = i88;
                            j7 = j2;
                            j8 = j7;
                            j9 = j8;
                            iK = 0;
                            iQ2 = 0;
                            i17 = 0;
                            i18 = 0;
                            I4 = 0;
                            while (true) {
                                if (iK < iK) {
                                    long[] jArr14 = jArr2;
                                    i19 = I7;
                                    i20 = I8;
                                    iArrCopyOf2 = iArr;
                                    jArr3 = jArr;
                                    i21 = i18;
                                    jArrCopyOf = jArr14;
                                    break;
                                }
                                j12 = j9;
                                i24 = i18;
                                zA = true;
                                while (i24 == 0) {
                                    zA = y1cVar.a();
                                    if (zA) {
                                        break;
                                        break;
                                    }
                                    int i89 = I7;
                                    long j25 = y1cVar.d;
                                    i24 = y1cVar.c;
                                    j12 = j25;
                                    I7 = i89;
                                    I8 = I8;
                                    iK = iK;
                                }
                                i25 = iK;
                                i19 = I7;
                                i20 = I8;
                                if (!zA) {
                                    oon1.H("Unexpected end of chunk data");
                                    if (z3) {
                                        long[] jArrCopyOf5 = Arrays.copyOf(jArr, iK);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iK);
                                        jArr3 = jArrCopyOf5;
                                        jArrCopyOf = Arrays.copyOf(jArr2, iK);
                                        iArrCopyOf2 = Arrays.copyOf(iArr, iK);
                                    } else {
                                        jArrCopyOf = jArr2;
                                        iArrCopyOf2 = iArr;
                                        jArr3 = jArr;
                                    }
                                    i21 = i24;
                                    break;
                                }
                                if (izr0Var2 != null) {
                                    while (I4 == 0) {
                                        I4 = izr0Var2.I();
                                        iQ2 = izr0Var2.q();
                                        i15--;
                                    }
                                    I4--;
                                }
                                iA = a2cVar.a();
                                long j26 = iA;
                                j8 += j26;
                                if (iA > i17) {
                                    i17 = iA;
                                }
                                if (z3) {
                                    jArr[iK] = j12;
                                    iArrCopyOf[iK] = iA;
                                    jArr4 = jArr2;
                                    jArr4[iK] = j7 + ((long) iQ2);
                                    if (izr0Var3 == null) {
                                        i26 = 1;
                                    } else {
                                        i26 = 0;
                                    }
                                    iArr[iK] = i26;
                                    if (iK == I3) {
                                        iArr[iK] = 1;
                                        arrayList3.add(Integer.valueOf(iK));
                                    }
                                } else {
                                    jArr4 = jArr2;
                                }
                                if (izr0Var3 != null) {
                                    I3 = izr0Var3.I() - 1;
                                }
                                j7 += (long) I9;
                                I5 = i20 - 1;
                                if (I5 != 0) {
                                }
                                i18 = i24 - 1;
                                iK++;
                                j9 = j12 + j26;
                                I7 = i19;
                                jArr2 = jArr4;
                                I8 = I5;
                                iK = i25;
                            }
                            long j27 = j7 + ((long) iQ2);
                            if (izr0Var2 != null) {
                                z8 = true;
                                break;
                            }
                            while (true) {
                                if (i15 > 0) {
                                    z8 = true;
                                    break;
                                }
                                if (izr0Var2.I() != 0) {
                                    z8 = false;
                                    break;
                                }
                                izr0Var2.q();
                                i15--;
                            }
                            if (i16 == 0) {
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                ktd.p(ljf1Var2.a, i16, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb2);
                                ktd.p(i20, i21, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb2);
                                sb2.append(i19);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(I4);
                                if (z8) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb2.append(str2);
                                oon1.H(sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                ktd.p(ljf1Var2.a, i16, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb3);
                                ktd.p(i20, i21, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb3);
                                sb3.append(i19);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(I4);
                                if (z8) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb3.append(str2);
                                oon1.H(sb3.toString());
                            }
                            iArr2 = iArrCopyOf;
                            i22 = iK;
                            j10 = j27;
                            i23 = i17;
                            j11 = j8;
                        }
                        j13 = ljf1Var2.f;
                        if (j13 > j2) {
                            jG7 = zoi1.g0(j11 * 8, 1000000L, j13, RoundingMode.HALF_DOWN);
                            if (jG7 > j2) {
                                ge30 ge30VarA7 = ie30Var6.a();
                                ge30VarA7.i = (int) jG7;
                                ie30 ie30Var10 = new ie30(ge30VarA7);
                                ajf1 ajf1VarA4 = ljf1Var2.a();
                                ajf1VarA4.g = ie30Var10;
                                ljf1Var2 = new ljf1(ajf1VarA4);
                            }
                        }
                        i27 = ljf1Var2.b;
                        j14 = ljf1Var2.c;
                        ie30Var2 = ljf1Var2.g;
                        f380Var3 = ljf1Var2.j;
                        f380Var4 = ljf1Var2.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        jG3 = zoi1.g0(j10, 1000000L, j14, roundingMode3);
                        iArrB0 = bmq0.b0(arrayList3);
                        if (f380Var4 == null) {
                            if (!z3) {
                                zoi1.f0(jArrCopyOf, j14);
                            }
                            uzf1Var2 = new uzf1(ljf1Var2, jArr3, iArr2, i23, jArrCopyOf, iArrCopyOf2, iArrB0, z7, jG3, i22);
                        } else {
                            i28 = i23;
                            jArr5 = jArr3;
                            iArr3 = iArr2;
                            jArr6 = jArrCopyOf;
                            iArr4 = iArrCopyOf2;
                            i29 = f380Var4.b;
                            if (z3) {
                                f380Var3.getClass();
                                if (i29 == 1) {
                                    jA4 = j2;
                                    while (i49 < i29) {
                                        if (f380Var3.a(i49) != -1) {
                                            jA4 = f380Var4.a(i49) + jA4;
                                        }
                                    }
                                    jG6 = zoi1.g0(jA4, 1000000L, ljf1Var2.d, RoundingMode.DOWN);
                                } else {
                                    jA4 = j2;
                                    while (i49 < i29) {
                                        if (f380Var3.a(i49) != -1) {
                                            jA4 = f380Var4.a(i49) + jA4;
                                        }
                                    }
                                    jG6 = zoi1.g0(jA4, 1000000L, ljf1Var2.d, RoundingMode.DOWN);
                                }
                                uzf1Var2 = new uzf1(ljf1Var2, jArr5, iArr3, i28, jArr6, iArr4, iArrB0, z7, jG6, i22);
                            } else if (i29 == 1) {
                                i30 = 1;
                                if (i29 == i30) {
                                }
                                iArr5 = iArr4;
                                i31 = i22;
                                if (i27 == 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                iArr6 = new int[i29];
                                iArr7 = new int[i29];
                                f380Var3.getClass();
                                i32 = 0;
                                i33 = 0;
                                i34 = 0;
                                z10 = false;
                                while (i34 < i29) {
                                    int[] iArr16 = iArr5;
                                    iArr13 = iArr7;
                                    jA3 = f380Var3.a(i34);
                                    if (jA3 != -1) {
                                        i41 = i34;
                                        boolean z110 = z10;
                                        jG5 = zoi1.g0(f380Var4.a(i34), ljf1Var2.c, ljf1Var2.d, RoundingMode.DOWN) + jA3;
                                        iArr6[i41] = zoi1.f(jArr6, jA3, true);
                                        int iB2 = zoi1.b(jArr6, jG5, z9);
                                        i42 = iB2 - 1;
                                        i44 = 0;
                                        while (i43 < jArr6.length) {
                                            if (jArr6[i43] >= jG5) {
                                                i44++;
                                                if (i44 > ie30Var2.r) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                i42 = i43;
                                            }
                                        }
                                        iArr13[i41] = i42 + 1;
                                        i45 = iArr6[i41];
                                        while (true) {
                                            i46 = iArr6[i41];
                                            if (i46 > 0) {
                                                break;
                                            }
                                            iArr6[i41] = i46 - 1;
                                        }
                                        if (i46 == 0) {
                                            iArr6[i41] = i45;
                                            while (true) {
                                                i48 = iArr6[i41];
                                                if (i48 < iArr13[i41]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr6[i41] = i48 + 1;
                                            }
                                        }
                                        int i810 = iArr13[i41];
                                        i47 = iArr6[i41];
                                        int i811 = (i810 - i47) + i32;
                                        if (i33 != i47) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        i33 = i810;
                                        z10 = z110 | z15;
                                        i32 = i811;
                                    } else {
                                        i41 = i34;
                                    }
                                    i34 = i41 + 1;
                                    iArr7 = iArr13;
                                    f380Var4 = f380Var4;
                                    z9 = z9;
                                    iArr5 = iArr16;
                                }
                                f380Var5 = f380Var4;
                                iArr8 = iArr5;
                                iArr9 = iArr7;
                                boolean z21 = z10;
                                if (i32 != i31) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z21 | z11;
                                if (z12) {
                                    jArr7 = new long[i32];
                                } else {
                                    jArr7 = jArr5;
                                }
                                if (z12) {
                                    iArr10 = new int[i32];
                                } else {
                                    iArr10 = iArr3;
                                }
                                if (z12) {
                                    i28 = 0;
                                }
                                if (z12) {
                                    iArr11 = new int[i32];
                                } else {
                                    iArr11 = iArr8;
                                }
                                if (z12) {
                                    arrayList4 = new ArrayList();
                                } else {
                                    arrayList4 = arrayList3;
                                }
                                jArr8 = new long[i32];
                                i35 = 0;
                                z13 = false;
                                i36 = 0;
                                jA = 0;
                                while (i35 < i29) {
                                    jA2 = f380Var3.a(i35);
                                    int i812 = i29;
                                    i37 = iArr6[i35];
                                    z14 = z12;
                                    i38 = iArr9[i35];
                                    ie30 ie30Var11 = ie30Var2;
                                    if (z14) {
                                        int i813 = i38 - i37;
                                        System.arraycopy(jArr5, i37, jArr7, i36, i813);
                                        System.arraycopy(iArr3, i37, iArr10, i36, i813);
                                        iArr12 = iArr8;
                                        System.arraycopy(iArr12, i37, iArr11, i36, i813);
                                    } else {
                                        iArr12 = iArr8;
                                    }
                                    i39 = i28;
                                    while (i37 < i38) {
                                        i40 = i37;
                                        int i814 = i38;
                                        long j28 = ljf1Var2.d;
                                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                                        long jG13 = zoi1.g0(jA, 1000000L, j28, roundingMode4);
                                        jG4 = zoi1.g0(jArr6[i40] - jA2, 1000000L, ljf1Var2.c, roundingMode4);
                                        if (jG4 < 0) {
                                            z13 = true;
                                        }
                                        jArr8[i36] = jG13 + jG4;
                                        if (z14) {
                                            i39 = iArr3[i40];
                                        }
                                        if (!z14) {
                                        }
                                        i36++;
                                        i37 = i40 + 1;
                                        i38 = i814;
                                    }
                                    jA = f380Var5.a(i35) + jA;
                                    i35++;
                                    i28 = i39;
                                    iArr8 = iArr12;
                                    i29 = i812;
                                    z12 = z14;
                                    ie30Var2 = ie30Var11;
                                    f380Var3 = f380Var3;
                                }
                                ie30Var3 = ie30Var2;
                                long jG14 = zoi1.g0(jA, 1000000L, ljf1Var2.d, RoundingMode.DOWN);
                                if (z13) {
                                    ge30 ge30VarA8 = ie30Var3.a();
                                    ge30VarA8.u = true;
                                    ie30 ie30Var12 = new ie30(ge30VarA8);
                                    ajf1 ajf1VarA5 = ljf1Var2.a();
                                    ajf1VarA5.g = ie30Var12;
                                    ljf1Var2 = new ljf1(ajf1VarA5);
                                }
                                uzf1 uzf1Var4 = new uzf1(ljf1Var2, jArr7, iArr10, i28, jArr8, iArr11, bmq0.b0(arrayList4), z7, jG14, jArr7.length);
                                arrayList2 = arrayList2;
                                uzf1Var = uzf1Var4;
                                arrayList2.add(uzf1Var);
                            } else {
                                i30 = 1;
                                if (i29 == i30) {
                                }
                                iArr5 = iArr4;
                                i31 = i22;
                                if (i27 == 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                iArr6 = new int[i29];
                                iArr7 = new int[i29];
                                f380Var3.getClass();
                                i32 = 0;
                                i33 = 0;
                                i34 = 0;
                                z10 = false;
                                while (i34 < i29) {
                                    int[] iArr17 = iArr5;
                                    iArr13 = iArr7;
                                    jA3 = f380Var3.a(i34);
                                    if (jA3 != -1) {
                                        i41 = i34;
                                        boolean z111 = z10;
                                        jG5 = zoi1.g0(f380Var4.a(i34), ljf1Var2.c, ljf1Var2.d, RoundingMode.DOWN) + jA3;
                                        iArr6[i41] = zoi1.f(jArr6, jA3, true);
                                        int iB3 = zoi1.b(jArr6, jG5, z9);
                                        i42 = iB3 - 1;
                                        i44 = 0;
                                        while (i43 < jArr6.length) {
                                            if (jArr6[i43] >= jG5) {
                                                i44++;
                                                if (i44 > ie30Var2.r) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                i42 = i43;
                                            }
                                        }
                                        iArr13[i41] = i42 + 1;
                                        i45 = iArr6[i41];
                                        while (true) {
                                            i46 = iArr6[i41];
                                            if (i46 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr6[i41] = i46 - 1;
                                        }
                                        if (i46 == 0) {
                                            iArr6[i41] = i45;
                                            while (true) {
                                                i48 = iArr6[i41];
                                                if (i48 < iArr13[i41]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr6[i41] = i48 + 1;
                                            }
                                        }
                                        int i815 = iArr13[i41];
                                        i47 = iArr6[i41];
                                        int i816 = (i815 - i47) + i32;
                                        if (i33 != i47) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        i33 = i815;
                                        z10 = z111 | z15;
                                        i32 = i816;
                                    } else {
                                        i41 = i34;
                                    }
                                    i34 = i41 + 1;
                                    iArr7 = iArr13;
                                    f380Var4 = f380Var4;
                                    z9 = z9;
                                    iArr5 = iArr17;
                                }
                                f380Var5 = f380Var4;
                                iArr8 = iArr5;
                                iArr9 = iArr7;
                                boolean z22 = z10;
                                if (i32 != i31) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z22 | z11;
                                if (z12) {
                                    jArr7 = new long[i32];
                                } else {
                                    jArr7 = jArr5;
                                }
                                if (z12) {
                                    iArr10 = new int[i32];
                                } else {
                                    iArr10 = iArr3;
                                }
                                if (z12) {
                                    i28 = 0;
                                }
                                if (z12) {
                                    iArr11 = new int[i32];
                                } else {
                                    iArr11 = iArr8;
                                }
                                if (z12) {
                                    arrayList4 = new ArrayList();
                                } else {
                                    arrayList4 = arrayList3;
                                }
                                jArr8 = new long[i32];
                                i35 = 0;
                                z13 = false;
                                i36 = 0;
                                jA = 0;
                                while (i35 < i29) {
                                    jA2 = f380Var3.a(i35);
                                    int i817 = i29;
                                    i37 = iArr6[i35];
                                    z14 = z12;
                                    i38 = iArr9[i35];
                                    ie30 ie30Var13 = ie30Var2;
                                    if (z14) {
                                        int i818 = i38 - i37;
                                        System.arraycopy(jArr5, i37, jArr7, i36, i818);
                                        System.arraycopy(iArr3, i37, iArr10, i36, i818);
                                        iArr12 = iArr8;
                                        System.arraycopy(iArr12, i37, iArr11, i36, i818);
                                    } else {
                                        iArr12 = iArr8;
                                    }
                                    i39 = i28;
                                    while (i37 < i38) {
                                        i40 = i37;
                                        int i819 = i38;
                                        long j29 = ljf1Var2.d;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jG15 = zoi1.g0(jA, 1000000L, j29, roundingMode5);
                                        jG4 = zoi1.g0(jArr6[i40] - jA2, 1000000L, ljf1Var2.c, roundingMode5);
                                        if (jG4 < 0) {
                                            z13 = true;
                                        }
                                        jArr8[i36] = jG15 + jG4;
                                        if (z14) {
                                            i39 = iArr3[i40];
                                        }
                                        if (!z14) {
                                        }
                                        i36++;
                                        i37 = i40 + 1;
                                        i38 = i819;
                                    }
                                    jA = f380Var5.a(i35) + jA;
                                    i35++;
                                    i28 = i39;
                                    iArr8 = iArr12;
                                    i29 = i817;
                                    z12 = z14;
                                    ie30Var2 = ie30Var13;
                                    f380Var3 = f380Var3;
                                }
                                ie30Var3 = ie30Var2;
                                long jG16 = zoi1.g0(jA, 1000000L, ljf1Var2.d, RoundingMode.DOWN);
                                if (z13) {
                                    ge30 ge30VarA9 = ie30Var3.a();
                                    ge30VarA9.u = true;
                                    ie30 ie30Var14 = new ie30(ge30VarA9);
                                    ajf1 ajf1VarA6 = ljf1Var2.a();
                                    ajf1VarA6.g = ie30Var14;
                                    ljf1Var2 = new ljf1(ajf1VarA6);
                                }
                                uzf1 uzf1Var5 = new uzf1(ljf1Var2, jArr7, iArr10, i28, jArr8, iArr11, bmq0.b0(arrayList4), z7, jG16, jArr7.length);
                                arrayList2 = arrayList2;
                                uzf1Var = uzf1Var5;
                                arrayList2.add(uzf1Var);
                            }
                        }
                        uzf1Var = uzf1Var2;
                    }
                    arrayList2.add(uzf1Var);
                }
            }
            i61 = i11 + 1;
            mpm0Var2 = mpm0Var;
            arrayList6 = arrayList2;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:212:0x036e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0373 A[EDGE_INSN: B:215:0x0373->B:218:0x0393 BREAK  A[LOOP:4: B:176:0x02ff->B:216:0x0385]] */
    /* JADX WARN: Code duplicated, block: B:274:0x02c0 A[SYNTHETIC] */
    public static hjj0 k(npm0 npm0Var, boolean z) {
        int i;
        boolean z2;
        hjj0 hjj0Var;
        hjj0 hjj0Var2;
        hjj0 hjj0VarB;
        hjj0 hjj0Var3;
        hjj0 hjj0Var4;
        int iF;
        hjj0 hjj0Var5;
        Object objQ;
        izr0 izr0Var = npm0Var.e;
        int i2 = 8;
        izr0Var.R(8);
        boolean z3 = false;
        hjj0 hjj0Var6 = new hjj0(new rij0[0]);
        while (izr0Var.a() >= i2) {
            int i3 = izr0Var.b;
            int iQ = izr0Var.q();
            int iQ2 = izr0Var.q();
            String str = null;
            if (iQ2 == 1835365473) {
                izr0Var.R(i3);
                int i4 = i3 + iQ;
                izr0Var.S(i2);
                a(izr0Var);
                while (true) {
                    int i5 = izr0Var.b;
                    if (i5 < i4) {
                        int iQ3 = izr0Var.q();
                        if (izr0Var.q() == 1768715124) {
                            izr0Var.R(i5);
                            int i6 = i5 + iQ3;
                            izr0Var.S(i2);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i7 = izr0Var.b;
                                if (i7 >= i6) {
                                    break;
                                }
                                int iQ4 = izr0Var.q();
                                if (iQ4 < i2) {
                                    oon1.H("Skipped empty metadata entry");
                                } else {
                                    int i8 = i7 + iQ4;
                                    int iQ5 = izr0Var.q();
                                    int i9 = (iQ5 >> 24) & 255;
                                    try {
                                        if (i8 - izr0Var.b < i2) {
                                            oon1.H("Skipped empty metadata entry: ".concat(dn90.d(iQ5)));
                                            izr0Var.R(i8);
                                        } else if (i9 == 169 || i9 == 253) {
                                            int i10 = 16777215 & iQ5;
                                            if (i10 == 6516084) {
                                                int iQ6 = izr0Var.q();
                                                if (izr0Var.q() == 1684108385) {
                                                    izr0Var.S(8);
                                                    String strA = izr0Var.A(iQ6 - 16);
                                                    objQ = new igh("und", strA, strA);
                                                } else {
                                                    oon1.H("Failed to parse comment attribute: ".concat(dn90.d(iQ5)));
                                                    objQ = null;
                                                }
                                            } else if (i10 == 7233901 || i10 == 7631467) {
                                                objQ = zzo1.q(iQ5, "TIT2", izr0Var);
                                            } else if (i10 == 6516589 || i10 == 7828084) {
                                                objQ = zzo1.q(iQ5, "TCOM", izr0Var);
                                            } else if (i10 == 6578553) {
                                                objQ = zzo1.q(iQ5, "TDRC", izr0Var);
                                            } else if (i10 == 4280916) {
                                                objQ = zzo1.q(iQ5, "TPE1", izr0Var);
                                            } else if (i10 == 7630703) {
                                                objQ = zzo1.q(iQ5, "TSSE", izr0Var);
                                            } else if (i10 == 6384738) {
                                                objQ = zzo1.q(iQ5, "TALB", izr0Var);
                                            } else if (i10 == 7108978) {
                                                objQ = zzo1.q(iQ5, "USLT", izr0Var);
                                            } else if (i10 == 6776174) {
                                                objQ = zzo1.q(iQ5, "TCON", izr0Var);
                                            } else if (i10 == 6779504) {
                                                objQ = zzo1.q(iQ5, "TIT1", izr0Var);
                                            } else if (i10 == 7173742) {
                                                objQ = zzo1.q(iQ5, "MVNM", izr0Var);
                                            } else if (i10 == 7173737) {
                                                objQ = zzo1.p(iQ5, "MVIN", izr0Var, true, false);
                                            } else {
                                                oon1.s("Skipped unknown metadata entry: ".concat(dn90.d(iQ5)));
                                                izr0Var.R(i8);
                                                objQ = null;
                                            }
                                            izr0Var.R(i8);
                                        } else {
                                            if (iQ5 == 1735291493) {
                                                String strA2 = cm70.a(zzo1.o(izr0Var) - 1);
                                                if (strA2 != null) {
                                                    objQ = new v8e1("TCON", str, b380.t(strA2));
                                                } else {
                                                    oon1.H("Failed to parse standard genre code");
                                                }
                                            } else if (iQ5 == 1684632427) {
                                                objQ = zzo1.n(iQ5, "TPOS", izr0Var);
                                            } else if (iQ5 == 1953655662) {
                                                objQ = zzo1.n(iQ5, "TRCK", izr0Var);
                                            } else if (iQ5 == 1953329263) {
                                                objQ = zzo1.p(iQ5, "TBPM", izr0Var, true, z3);
                                            } else if (iQ5 == 1668311404) {
                                                objQ = zzo1.p(iQ5, "TCMP", izr0Var, true, true);
                                            } else if (iQ5 == 1668249202) {
                                                objQ = z ? str : zzo1.m(izr0Var);
                                            } else if (iQ5 == 1631670868) {
                                                objQ = zzo1.q(iQ5, "TPE2", izr0Var);
                                            } else if (iQ5 == 1936682605) {
                                                objQ = zzo1.q(iQ5, "TSOT", izr0Var);
                                            } else if (iQ5 == 1936679276) {
                                                objQ = zzo1.q(iQ5, "TSOA", izr0Var);
                                            } else if (iQ5 == 1936679282) {
                                                objQ = zzo1.q(iQ5, "TSOP", izr0Var);
                                            } else if (iQ5 == 1936679265) {
                                                objQ = zzo1.q(iQ5, "TSO2", izr0Var);
                                            } else if (iQ5 == 1936679791) {
                                                objQ = zzo1.q(iQ5, "TSOC", izr0Var);
                                            } else if (iQ5 == 1920233063) {
                                                objQ = zzo1.p(iQ5, "ITUNESADVISORY", izr0Var, z3, z3);
                                            } else if (iQ5 == 1885823344) {
                                                objQ = zzo1.p(iQ5, "ITUNESGAPLESS", izr0Var, z3, true);
                                            } else if (iQ5 == 1936683886) {
                                                objQ = zzo1.q(iQ5, "TVSHOWSORT", izr0Var);
                                            } else if (iQ5 == 1953919848) {
                                                objQ = zzo1.q(iQ5, "TVSHOW", izr0Var);
                                            } else if (iQ5 == 757935405) {
                                                String strA3 = str;
                                                String strA4 = strA3;
                                                int i11 = -1;
                                                int i12 = -1;
                                                while (true) {
                                                    int i13 = izr0Var.b;
                                                    if (i13 >= i8) {
                                                        break;
                                                    }
                                                    int iQ7 = izr0Var.q();
                                                    int iQ8 = izr0Var.q();
                                                    izr0Var.S(4);
                                                    if (iQ8 == 1835360622) {
                                                        strA3 = izr0Var.A(iQ7 - 12);
                                                    } else if (iQ8 == 1851878757) {
                                                        strA4 = izr0Var.A(iQ7 - 12);
                                                    } else {
                                                        if (iQ8 == 1684108385) {
                                                            i11 = i13;
                                                            i12 = iQ7;
                                                        }
                                                        izr0Var.S(iQ7 - 12);
                                                    }
                                                }
                                                if (strA3 == null || strA4 == null || i11 == -1) {
                                                    objQ = null;
                                                } else {
                                                    izr0Var.R(i11);
                                                    izr0Var.S(16);
                                                    objQ = new z390(strA3, strA4, izr0Var.A(i12 - 16));
                                                }
                                                izr0Var.R(i8);
                                            } else {
                                                oon1.s("Skipped unknown metadata entry: ".concat(dn90.d(iQ5)));
                                                izr0Var.R(i8);
                                                objQ = null;
                                            }
                                            izr0Var.R(i8);
                                        }
                                        if (objQ != null) {
                                            arrayList.add(objQ);
                                        }
                                        i2 = 8;
                                        z3 = false;
                                        str = null;
                                    } catch (Throwable th) {
                                        izr0Var.R(i8);
                                        throw th;
                                    }
                                }
                                objQ = str;
                                if (objQ != null) {
                                    arrayList.add(objQ);
                                }
                                i2 = 8;
                                z3 = false;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                hjj0Var5 = new hjj0(arrayList);
                                break;
                            }
                            break;
                        }
                        izr0Var.R(i5 + iQ3);
                        i2 = 8;
                        z3 = false;
                        str = null;
                    }
                    hjj0Var5 = null;
                    break;
                }
                hjj0Var6 = hjj0Var6.b(hjj0Var5);
                i = 8;
            } else {
                if (iQ2 == 1936553057) {
                    izr0Var.R(i3);
                    int i14 = i3 + iQ;
                    izr0Var.S(12);
                    while (true) {
                        int i15 = izr0Var.b;
                        if (i15 < i14) {
                            int iQ9 = izr0Var.q();
                            if (izr0Var.q() == 1935766900) {
                                if (iQ9 >= 16) {
                                    izr0Var.S(4);
                                    int i16 = -1;
                                    int i17 = 0;
                                    for (int i18 = 0; i18 < 2; i18++) {
                                        int iE = izr0Var.E();
                                        int iE2 = izr0Var.E();
                                        if (iE == 0) {
                                            i16 = iE2;
                                        } else if (iE == 1) {
                                            i17 = iE2;
                                        }
                                    }
                                    if (i16 != 12) {
                                        if (i16 != 13) {
                                            if (i16 != 21) {
                                                iF = -2147483647;
                                            } else {
                                                i = 8;
                                                if (izr0Var.a() < 8 || izr0Var.b + 8 > i14) {
                                                    iF = -2147483647;
                                                } else {
                                                    int iQ10 = izr0Var.q();
                                                    int iQ11 = izr0Var.q();
                                                    if (iQ10 < 12 || iQ11 != 1936877170) {
                                                        iF = -2147483647;
                                                    } else {
                                                        iF = izr0Var.F();
                                                    }
                                                }
                                            }
                                            if (iF == -2147483647) {
                                                hjj0Var4 = new hjj0(new uq91(iF, i17));
                                                break;
                                            }
                                            break;
                                        }
                                        iF = 120;
                                    } else {
                                        iF = 240;
                                    }
                                    i = 8;
                                    if (iF == -2147483647) {
                                        hjj0Var4 = new hjj0(new uq91(iF, i17));
                                        break;
                                    }
                                    break;
                                }
                                hjj0Var4 = null;
                                i = 8;
                                break;
                            }
                            izr0Var.R(i15 + iQ9);
                        } else {
                            i = 8;
                        }
                        hjj0Var4 = null;
                        break;
                    }
                    hjj0Var6 = hjj0Var6.b(hjj0Var4);
                } else {
                    i = 8;
                    if (iQ2 == -1451722374) {
                        short sB = izr0Var.B();
                        izr0Var.S(2);
                        String strC = izr0Var.C(sB, StandardCharsets.UTF_8);
                        int iMax = Math.max(strC.lastIndexOf(43), strC.lastIndexOf(45));
                        try {
                            try {
                                rpm0 rpm0Var = new rpm0(Float.parseFloat(strC.substring(0, iMax)), Float.parseFloat(strC.substring(iMax, strC.length() - 1)));
                                rij0[] rij0VarArr = new rij0[1];
                                z2 = false;
                                try {
                                    rij0VarArr[0] = rpm0Var;
                                    hjj0Var3 = new hjj0(rij0VarArr);
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    hjj0Var3 = null;
                                }
                            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                                z2 = false;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                            z2 = false;
                        }
                        hjj0VarB = hjj0Var6.b(hjj0Var3);
                    } else {
                        z2 = false;
                        if (iQ2 == 1667788908) {
                            try {
                                izr0Var.S(5);
                                int iQ12 = izr0Var.q();
                                ArrayList arrayList2 = new ArrayList();
                                for (int i19 = 0; i19 < iQ12; i19++) {
                                    long jY = izr0Var.y() / 10000;
                                    if (jY < 0) {
                                        jY = -9223372036854775807L;
                                    }
                                    hjj0Var = null;
                                    try {
                                        arrayList2.add(new jhe(jY, -9223372036854775807L, false, new u9b0(null, izr0Var.C(izr0Var.E(), StandardCharsets.UTF_8))));
                                    } catch (IndexOutOfBoundsException unused4) {
                                    }
                                }
                                hjj0Var = null;
                                hjj0Var2 = arrayList2.isEmpty() ? hjj0Var : new hjj0(arrayList2);
                            } catch (IndexOutOfBoundsException unused5) {
                                hjj0Var = null;
                            }
                            hjj0VarB = hjj0Var6.b(hjj0Var2);
                        }
                    }
                    hjj0Var6 = hjj0VarB;
                }
                izr0Var.R(i3 + iQ);
                i2 = i;
                z3 = z2;
            }
            z2 = false;
            izr0Var.R(i3 + iQ);
            i2 = i;
            z3 = z2;
        }
        return hjj0Var6;
    }
}
