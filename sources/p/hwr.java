package p;

import android.util.Pair;
import android.util.SparseArray;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.common.ParserException;
import app.p000rive.runtime.kotlin.renderers.RendererMetrics;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.AdvertisementType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hwr {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final iti1 c = new iti1((byte) 0);
    public z8c0 d;
    public byte e;
    public int f;
    public long g;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:165:0x0295  */
    /* JADX WARN: Code duplicated, block: B:310:0x0465  */
    /* JADX WARN: Code duplicated, block: B:461:0x06b2 A[PHI: r3 r12 r28
      0x06b2: PHI (r3v118 p.bg11) = (r3v81 p.bg11), (r3v86 p.bg11), (r3v111 p.bg11), (r3v120 p.bg11) binds: [B:508:0x0833, B:502:0x0815, B:472:0x06fc, B:460:0x06b0] A[DONT_GENERATE, DONT_INLINE]
      0x06b2: PHI (r12v67 java.lang.String) = (r12v50 java.lang.String), (r12v53 java.lang.String), (r12v60 java.lang.String), (r12v68 java.lang.String) binds: [B:508:0x0833, B:502:0x0815, B:472:0x06fc, B:460:0x06b0] A[DONT_GENERATE, DONT_INLINE]
      0x06b2: PHI (r28v49 java.lang.String) = (r28v18 java.lang.String), (r28v20 java.lang.String), (r28v39 java.lang.String), (r28v50 java.lang.String) binds: [B:508:0x0833, B:502:0x0815, B:472:0x06fc, B:460:0x06b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:464:0x06bf A[PHI: r3 r4 r12 r28
      0x06bf: PHI (r3v115 p.bg11) = (r3v111 p.bg11), (r3v120 p.bg11) binds: [B:472:0x06fc, B:460:0x06b0] A[DONT_GENERATE, DONT_INLINE]
      0x06bf: PHI (r4v62 int) = (r4v58 int), (r4v66 int) binds: [B:472:0x06fc, B:460:0x06b0] A[DONT_GENERATE, DONT_INLINE]
      0x06bf: PHI (r12v65 java.lang.String) = (r12v60 java.lang.String), (r12v68 java.lang.String) binds: [B:472:0x06fc, B:460:0x06b0] A[DONT_GENERATE, DONT_INLINE]
      0x06bf: PHI (r28v46 java.lang.String) = (r28v39 java.lang.String), (r28v50 java.lang.String) binds: [B:472:0x06fc, B:460:0x06b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:631:0x0b1e  */
    /* JADX WARN: Code duplicated, block: B:633:0x0b2d  */
    /* JADX WARN: Code duplicated, block: B:634:0x0b34  */
    /* JADX WARN: Code duplicated, block: B:638:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:639:0x0b43  */
    /* JADX WARN: Code duplicated, block: B:642:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:643:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:645:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:647:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:649:0x0b73  */
    /* JADX WARN: Code duplicated, block: B:652:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:654:0x0b80  */
    /* JADX WARN: Code duplicated, block: B:657:0x0b87  */
    /* JADX WARN: Code duplicated, block: B:661:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:663:0x0b9a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:666:0x0b9f  */
    /* JADX WARN: Code duplicated, block: B:670:0x0baf  */
    /* JADX WARN: Code duplicated, block: B:672:0x0bb8 A[PHI: r3
      0x0bb8: PHI (r3v153 int) = (r3v121 int), (r3v128 int) binds: [B:671:0x0bb6, B:674:0x0bbd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:673:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:678:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:679:0x0bc7  */
    /* JADX WARN: Code duplicated, block: B:681:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:682:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:685:0x0bd6  */
    /* JADX WARN: Code duplicated, block: B:705:0x0c8c  */
    /* JADX WARN: Code duplicated, block: B:708:0x0c99  */
    /* JADX WARN: Code duplicated, block: B:711:0x0cac  */
    /* JADX WARN: Code duplicated, block: B:714:0x0cb1  */
    /* JADX WARN: Code duplicated, block: B:733:0x0cfe  */
    /* JADX WARN: Code duplicated, block: B:735:0x0d16  */
    /* JADX WARN: Code duplicated, block: B:737:0x0d1c  */
    /* JADX WARN: Code duplicated, block: B:752:0x0d47  */
    /* JADX WARN: Code duplicated, block: B:757:0x0d5b  */
    /* JADX WARN: Code duplicated, block: B:758:0x0d5e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r5v102 */
    /* JADX WARN: Type inference failed for: r5v105 */
    /* JADX WARN: Type inference failed for: r5v108 */
    /* JADX WARN: Type inference failed for: r5v111 */
    /* JADX WARN: Type inference failed for: r5v114 */
    /* JADX WARN: Type inference failed for: r5v117 */
    /* JADX WARN: Type inference failed for: r5v120 */
    /* JADX WARN: Type inference failed for: r5v123 */
    /* JADX WARN: Type inference failed for: r5v125 */
    /* JADX WARN: Type inference failed for: r5v126 */
    /* JADX WARN: Type inference failed for: r5v144 */
    /* JADX WARN: Type inference failed for: r5v145, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r5v146 */
    /* JADX WARN: Type inference failed for: r5v159 */
    /* JADX WARN: Type inference failed for: r5v160, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r5v230 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v99 */
    /* JADX WARN: Type inference failed for: r6v113 */
    public final boolean a(fc10 fc10Var) throws ParserException {
        int i;
        boolean z;
        int i2;
        String str;
        int i3;
        int iA;
        String str2;
        ?? r5;
        bg11 bg11VarSingletonList;
        int i4;
        ?? r6;
        String str3;
        int i5;
        String str4;
        String str5;
        int i6;
        Pair pair;
        String str6;
        String str7;
        String str8;
        int i7;
        int i8;
        bg11 bg11Var;
        int i9;
        int i10;
        int i11;
        String str9;
        int i12;
        int i13;
        int i14;
        bg11 bg11VarT;
        int iG;
        int I;
        int i15;
        String str10;
        int i16;
        ge30 ge30Var;
        int i17;
        int i18;
        float f;
        int i19;
        int i20;
        int i21;
        byte[] bArr;
        String str11;
        int iIntValue;
        int i22;
        int i23;
        int i24;
        int i25;
        String str12;
        String str13;
        xr6 xr6VarB;
        int i26;
        this.d.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.b;
            gwr gwrVar = (gwr) arrayDeque.peek();
            int i27 = 0;
            if (gwrVar != null) {
                i = 8;
                if (fc10Var.getPosition() >= gwrVar.b) {
                    z8c0 z8c0Var = this.d;
                    int i28 = ((gwr) arrayDeque.pop()).a;
                    rch0 rch0Var = (rch0) z8c0Var.b;
                    Map map = rch0.v0;
                    SparseArray sparseArray = rch0Var.E;
                    SparseArray sparseArray2 = rch0Var.c;
                    rch0Var.p0.getClass();
                    if (i28 == 128) {
                        nch0 nch0Var = rch0Var.z;
                        nch0Var.getClass();
                        if (nch0Var.f != null || (str2 = nch0Var.h) == null) {
                            return true;
                        }
                        nch0Var.f = str2;
                        String str14 = nch0Var.i;
                        if (str14 == null) {
                            return true;
                        }
                        nch0Var.g = str14;
                        return true;
                    }
                    if (i28 == 160) {
                        if (rch0Var.U != 2) {
                            return true;
                        }
                        qch0 qch0Var = (qch0) sparseArray2.get(rch0Var.a0);
                        qch0Var.d0.getClass();
                        if (rch0Var.f0 > 0 && "A_OPUS".equals(qch0Var.c)) {
                            izr0 izr0Var = rch0Var.q;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(rch0Var.f0).array();
                            izr0Var.getClass();
                            izr0Var.P(bArrArray, bArrArray.length);
                        }
                        int i29 = 0;
                        for (int i30 = 0; i30 < rch0Var.Y; i30++) {
                            i29 += rch0Var.Z[i30];
                        }
                        int i31 = 0;
                        while (i31 < rch0Var.Y) {
                            long j = rch0Var.V + ((long) ((qch0Var.g * i31) / 1000));
                            int i32 = rch0Var.c0;
                            if (i31 == 0 && !rch0Var.e0) {
                                i32 |= 1;
                            }
                            int i33 = rch0Var.Z[i31];
                            int i34 = i29 - i33;
                            rch0Var.h(qch0Var, j, i32, i33, i34);
                            i31++;
                            i29 = i34;
                        }
                        rch0Var.U = (byte) 0;
                        return true;
                    }
                    String str15 = "video/webm";
                    if (i28 != 174) {
                        if (i28 == 17849) {
                            while (i27 < sparseArray2.size()) {
                                rch0Var.o((qch0) sparseArray2.valueAt(i27));
                                i27++;
                            }
                        } else {
                            if (i28 == 19899) {
                                int i35 = rch0Var.C;
                                if (i35 != -1) {
                                    long j2 = rch0Var.D;
                                    if (j2 != -1) {
                                        if (i35 == 475249515) {
                                            rch0Var.M = j2;
                                            return true;
                                        }
                                        if (i35 == 374648427) {
                                            rch0Var.O = j2;
                                            return true;
                                        }
                                    }
                                }
                                throw ParserException.a((RuntimeException) null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i28 == 25152) {
                                rch0Var.g(i28);
                                qch0 qch0Var2 = rch0Var.A;
                                if (qch0Var2.j) {
                                    ftf1 ftf1Var = qch0Var2.l;
                                    if (ftf1Var == null) {
                                        throw ParserException.a((RuntimeException) null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    qch0Var2.n = new x8v(new w8v(whc.b, null, "video/webm", ftf1Var.b));
                                    return true;
                                }
                            } else if (i28 == 28032) {
                                rch0Var.g(i28);
                                qch0 qch0Var3 = rch0Var.A;
                                if (qch0Var3.j && qch0Var3.k != null) {
                                    throw ParserException.a((RuntimeException) null, "Combining encryption and compression is not supported");
                                }
                            } else if (i28 == 357149030) {
                                if (rch0Var.u == -9223372036854775807L) {
                                    rch0Var.u = 1000000L;
                                }
                                long j3 = rch0Var.v;
                                if (j3 != -9223372036854775807L) {
                                    rch0Var.w = rch0Var.n(j3);
                                    return true;
                                }
                            } else if (i28 == 374648427) {
                                if (sparseArray2.size() == 0) {
                                    throw ParserException.a((RuntimeException) null, "No valid tracks were found");
                                }
                                ?? r1 = !rch0Var.e || rch0Var.M == -1 || rch0Var.B;
                                int i36 = -1;
                                int i37 = -1;
                                int i38 = -1;
                                int i39 = -1;
                                for (int i40 = 0; i40 < sparseArray2.size(); i40++) {
                                    qch0 qch0Var4 = (qch0) sparseArray2.valueAt(i40);
                                    int i41 = qch0Var4.f;
                                    if (i41 == 2) {
                                        if (qch0Var4.b0) {
                                            i36 = qch0Var4.d;
                                        }
                                        if (i37 == -1) {
                                            i37 = qch0Var4.d;
                                        }
                                    } else if (i41 == 1) {
                                        if (qch0Var4.b0) {
                                            i38 = qch0Var4.d;
                                        }
                                        if (i39 == -1) {
                                            i39 = qch0Var4.d;
                                        }
                                    }
                                    if (r1 != false && !qch0Var4.X) {
                                        rch0Var.o(qch0Var4);
                                        qch0Var4.d0.getClass();
                                        gtf1 gtf1Var = qch0Var4.d0;
                                        ie30 ie30Var = qch0Var4.e0;
                                        ie30Var.getClass();
                                        gtf1Var.a(ie30Var);
                                    }
                                }
                                if (i36 != -1) {
                                    rch0Var.K = i36;
                                } else if (i37 != -1) {
                                    rch0Var.K = i37;
                                } else if (i38 != -1) {
                                    rch0Var.K = i38;
                                } else if (i39 != -1) {
                                    rch0Var.K = i39;
                                } else {
                                    rch0Var.K = sparseArray2.size() > 0 ? ((qch0) sparseArray2.valueAt(0)).d : -1;
                                }
                                rch0Var.R = true;
                                if (r1 != false) {
                                    rch0Var.k();
                                    return true;
                                }
                            } else if (i28 != 475249515) {
                                if (i28 == 182) {
                                    nch0 nch0Var2 = rch0Var.z;
                                    nch0Var2.getClass();
                                    long j4 = nch0Var2.a;
                                    if (j4 != 0) {
                                        rch0Var.d.put(j4, nch0Var2);
                                    }
                                    rch0Var.z = null;
                                    return true;
                                }
                                if (i28 == 183 && !rch0Var.B) {
                                    rch0Var.f(i28);
                                    if (rch0Var.G != -9223372036854775807L && (i26 = rch0Var.H) != -1 && rch0Var.I != -1) {
                                        List arrayList = (List) sparseArray.get(i26);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            sparseArray.put(rch0Var.H, arrayList);
                                        }
                                        arrayList.add(new och0(rch0Var.G, rch0Var.t + rch0Var.I, rch0Var.J));
                                        return true;
                                    }
                                }
                            } else if (!rch0Var.B) {
                                int i42 = 0;
                                while (true) {
                                    if (i42 < sparseArray.size()) {
                                        if (((List) sparseArray.valueAt(i42)).isEmpty()) {
                                            i42++;
                                        } else if (rch0Var.w != -9223372036854775807L) {
                                            for (int i43 = 0; i43 < sparseArray.size(); i43++) {
                                                Collections.sort((List) sparseArray.valueAt(i43));
                                            }
                                            rch0Var.p0.c(new pch0(sparseArray, rch0Var.w, rch0Var.K, rch0Var.t, rch0Var.s));
                                        }
                                    }
                                    rch0Var.p0.c(new bc9(rch0Var.w));
                                }
                                rch0Var.B = true;
                                rch0Var.F = false;
                                while (i27 < sparseArray2.size()) {
                                    qch0 qch0Var5 = (qch0) sparseArray2.valueAt(i27);
                                    if (!qch0Var5.X) {
                                        rch0Var.o(qch0Var5);
                                        qch0Var5.d0.getClass();
                                        gtf1 gtf1Var2 = qch0Var5.d0;
                                        ie30 ie30Var2 = qch0Var5.e0;
                                        ie30Var2.getClass();
                                        gtf1Var2.a(ie30Var2);
                                    }
                                    i27++;
                                }
                                rch0Var.k();
                                return true;
                            }
                        }
                        return true;
                    }
                    qch0 qch0Var6 = rch0Var.A;
                    qch0Var6.getClass();
                    String str16 = qch0Var6.c;
                    if (str16 == null) {
                        throw ParserException.a((RuntimeException) null, "CodecId is missing in TrackEntry element");
                    }
                    switch (str16) {
                        case "V_MPEG4/ISO/AP":
                        case "V_MPEG4/ISO/SP":
                        case "A_MS/ACM":
                        case "A_TRUEHD":
                        case "A_VORBIS":
                        case "A_MPEG/L2":
                        case "A_MPEG/L3":
                        case "V_MS/VFW/FOURCC":
                        case "S_DVBSUB":
                        case "V_MPEG4/ISO/ASP":
                        case "V_MPEG4/ISO/AVC":
                        case "S_VOBSUB":
                        case "A_DTS/LOSSLESS":
                        case "A_AAC":
                        case "A_AC3":
                        case "A_DTS":
                        case "V_AV1":
                        case "V_VP8":
                        case "V_VP9":
                        case "S_HDMV/PGS":
                        case "V_THEORA":
                        case "A_DTS/EXPRESS":
                        case "A_PCM/FLOAT/IEEE":
                        case "A_PCM/INT/BIG":
                        case "A_PCM/INT/LIT":
                        case "S_TEXT/ASS":
                        case "S_TEXT/SSA":
                        case "V_MPEGH/ISO/HEVC":
                        case "S_TEXT/WEBVTT":
                        case "S_TEXT/UTF8":
                        case "V_MPEG2":
                        case "A_ALAC":
                        case "A_EAC3":
                        case "A_FLAC":
                        case "A_OPUS":
                            int i44 = qch0Var6.d;
                            switch (str16) {
                                case "V_MPEG4/ISO/AP":
                                    r5 = 0;
                                    break;
                                case "V_MPEG4/ISO/SP":
                                    r5 = 1;
                                    break;
                                case "A_MS/ACM":
                                    r5 = 2;
                                    break;
                                case "A_TRUEHD":
                                    r5 = 3;
                                    break;
                                case "A_VORBIS":
                                    r5 = 4;
                                    break;
                                case "A_MPEG/L2":
                                    r5 = 5;
                                    break;
                                case "A_MPEG/L3":
                                    r5 = 6;
                                    break;
                                case "V_MS/VFW/FOURCC":
                                    r5 = 7;
                                    break;
                                case "S_DVBSUB":
                                    r5 = 8;
                                    break;
                                case "V_MPEG4/ISO/ASP":
                                    r5 = 9;
                                    break;
                                case "V_MPEG4/ISO/AVC":
                                    r5 = 10;
                                    break;
                                case "S_VOBSUB":
                                    r5 = 11;
                                    break;
                                case "A_DTS/LOSSLESS":
                                    r5 = 12;
                                    break;
                                case "A_AAC":
                                    r5 = 13;
                                    break;
                                case "A_AC3":
                                    r5 = 14;
                                    break;
                                case "A_DTS":
                                    r5 = 15;
                                    break;
                                case "V_AV1":
                                    r5 = 16;
                                    break;
                                case "V_VP8":
                                    r5 = 17;
                                    break;
                                case "V_VP9":
                                    r5 = 18;
                                    break;
                                case "S_HDMV/PGS":
                                    r5 = 19;
                                    break;
                                case "V_THEORA":
                                    r5 = 20;
                                    break;
                                case "A_DTS/EXPRESS":
                                    r5 = 21;
                                    break;
                                case "A_PCM/FLOAT/IEEE":
                                    r5 = 22;
                                    break;
                                case "A_PCM/INT/BIG":
                                    r5 = 23;
                                    break;
                                case "A_PCM/INT/LIT":
                                    r5 = 24;
                                    break;
                                case "S_TEXT/ASS":
                                    r5 = 25;
                                    break;
                                case "S_TEXT/SSA":
                                    r5 = 26;
                                    break;
                                case "V_MPEGH/ISO/HEVC":
                                    r5 = 27;
                                    break;
                                case "S_TEXT/WEBVTT":
                                    r5 = 28;
                                    break;
                                case "S_TEXT/UTF8":
                                    r5 = 29;
                                    break;
                                case "V_MPEG2":
                                    r5 = 30;
                                    break;
                                case "A_ALAC":
                                    r5 = 31;
                                    break;
                                case "A_EAC3":
                                    r5 = 32;
                                    break;
                                case "A_FLAC":
                                    r5 = 33;
                                    break;
                                case "A_OPUS":
                                    r5 = 34;
                                    break;
                                default:
                                    r5 = -1;
                                    break;
                            }
                            String str17 = "video/x-unknown";
                            switch (r5) {
                                case 0:
                                case 1:
                                case 9:
                                    str15 = "video/webm";
                                    byte[] bArr2 = qch0Var6.m;
                                    str17 = "video/mp4v-es";
                                    bg11VarSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z2 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i45 = (z2 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17 || (i23 = qch0Var6.s) == i17) {
                                                f = -1.0f;
                                            } else {
                                                f = (qch0Var6.f119p * i18) / (qch0Var6.o * i23);
                                            }
                                            if (i12 == -1 && i8 == -1) {
                                                if (i13 == -1 && qch0Var6.C == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i46 = i12;
                                            int i47 = i13;
                                            int i48 = i8;
                                            if (i6 != -1 && (i6 = qch0Var6.q) == -1) {
                                                i19 = 8;
                                            } else {
                                                i19 = i6;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f || qch0Var6.G == -1.0f || qch0Var6.H == -1.0f || qch0Var6.I == -1.0f || qch0Var6.J == -1.0f || qch0Var6.K == -1.0f || qch0Var6.L == -1.0f || qch0Var6.M == -1.0f || qch0Var6.N == -1.0f || qch0Var6.O == -1.0f) {
                                                bArr = null;
                                            } else {
                                                byte[] bArr3 = new byte[25];
                                                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                                                byteBufferOrder.put((byte) 0);
                                                byteBufferOrder.putShort((short) ((qch0Var6.F * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((qch0Var6.G * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((qch0Var6.H * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((qch0Var6.I * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((qch0Var6.J * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((qch0Var6.K * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((qch0Var6.L * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((qch0Var6.M * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) (qch0Var6.N + 0.5f));
                                                byteBufferOrder.putShort((short) (qch0Var6.O + 0.5f));
                                                byteBufferOrder.putShort((short) qch0Var6.D);
                                                byteBufferOrder.putShort((short) qch0Var6.E);
                                                bArr = bArr3;
                                            }
                                            x8h x8hVar = new x8h(i46, i47, i48, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null && map.containsKey(str11)) {
                                                iIntValue = ((Integer) map.get(qch0Var6.b)).intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0 || Float.compare(qch0Var6.v, 0.0f) != 0 || Float.compare(qch0Var6.w, 0.0f) != 0) {
                                                i22 = iIntValue;
                                            } else if (Float.compare(qch0Var6.x, 0.0f) == 0) {
                                                i22 = 0;
                                            } else if (Float.compare(qch0Var6.x, 90.0f) == 0) {
                                                i22 = 90;
                                            } else if (Float.compare(qch0Var6.x, -180.0f) == 0 || Float.compare(qch0Var6.x, 180.0f) == 0) {
                                                i22 = 180;
                                            } else if (Float.compare(qch0Var6.x, -90.0f) == 0) {
                                                i22 = 270;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar;
                                        } else if (!"application/x-subrip".equals(str10) && !"text/x-ssa".equals(str10) && !"text/vtt".equals(str10) && !"application/vobsub".equals(str10) && !"application/pgs".equals(str10) && !"application/dvbsubs".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null && !map.containsKey(str12)) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i45;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z3 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i49 = (z3 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i410 = i12;
                                        int i411 = i13;
                                        int i412 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar2 = new x8h(i410, i411, i412, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar2;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i49;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 2:
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str15 = "video/webm";
                                    izr0 izr0Var2 = new izr0(qch0Var6.a(qch0Var6.c));
                                    try {
                                        int iX = izr0Var2.x();
                                        if (iX != 1) {
                                            if (iX == 65534) {
                                                izr0Var2.R(20);
                                                int iW = izr0Var2.w();
                                                if ((iW >> 18) == 0 && (iW == 0 || Integer.bitCount(iW) == qch0Var6.Q)) {
                                                    qch0Var6.S = iW == 0 ? -1 : iW << 2;
                                                }
                                                long jY = izr0Var2.y();
                                                UUID uuid = rch0.u0;
                                                if (jY != uuid.getMostSignificantBits() || izr0Var2.y() != uuid.getLeastSignificantBits()) {
                                                }
                                                str5 = "audio/x-unknown";
                                                i6 = -1;
                                                i5 = -1;
                                                i4 = -1;
                                                i12 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                str7 = null;
                                                bg11VarSingletonList = null;
                                                if (qch0Var6.P != null) {
                                                    i15 = i5;
                                                    xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                                    if (xr6VarB != null) {
                                                        str10 = "video/dolby-vision";
                                                        str7 = xr6VarB.a;
                                                    }
                                                    boolean z4 = qch0Var6.b0;
                                                    if (qch0Var6.a0) {
                                                        i16 = 2;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    int i413 = (z4 ? 1 : 0) | i16;
                                                    ge30Var = new ge30();
                                                    if (asj0.k(str10)) {
                                                        ge30Var.I = qch0Var6.Q;
                                                        ge30Var.J = qch0Var6.S;
                                                        ge30Var.K = qch0Var6.T;
                                                        ge30Var.L = i4;
                                                    } else if (asj0.o(str10)) {
                                                        if (qch0Var6.t == 0) {
                                                            i24 = qch0Var6.r;
                                                            i17 = -1;
                                                            if (i24 == -1) {
                                                                i24 = qch0Var6.o;
                                                            }
                                                            qch0Var6.r = i24;
                                                            i25 = qch0Var6.s;
                                                            if (i25 == -1) {
                                                                i25 = qch0Var6.f119p;
                                                            }
                                                            qch0Var6.s = i25;
                                                        } else {
                                                            i17 = -1;
                                                        }
                                                        i18 = qch0Var6.r;
                                                        if (i18 != i17) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (i12 == -1) {
                                                            if (i13 == -1) {
                                                                i12 = qch0Var6.A;
                                                                i8 = qch0Var6.B;
                                                                i13 = qch0Var6.C;
                                                            } else {
                                                                i12 = qch0Var6.A;
                                                                i8 = qch0Var6.B;
                                                                i13 = qch0Var6.C;
                                                            }
                                                        }
                                                        int i414 = i12;
                                                        int i415 = i13;
                                                        int i416 = i8;
                                                        if (i6 != -1) {
                                                            i19 = i6;
                                                        } else {
                                                            i19 = 8;
                                                        }
                                                        if (i14 != -1) {
                                                            i21 = i14;
                                                        } else {
                                                            i20 = qch0Var6.q;
                                                            if (i20 != -1) {
                                                                i21 = i20;
                                                            } else {
                                                                i21 = 8;
                                                            }
                                                        }
                                                        if (qch0Var6.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        x8h x8hVar3 = new x8h(i414, i415, i416, bArr, i19, i21);
                                                        str11 = qch0Var6.b;
                                                        if (str11 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (qch0Var6.u == 0) {
                                                            i22 = iIntValue;
                                                        } else {
                                                            i22 = iIntValue;
                                                        }
                                                        ge30Var.v = qch0Var6.o;
                                                        ge30Var.w = qch0Var6.f119p;
                                                        ge30Var.D = f;
                                                        ge30Var.B = i22;
                                                        ge30Var.E = qch0Var6.y;
                                                        ge30Var.F = qch0Var6.z;
                                                        ge30Var.G = x8hVar3;
                                                    } else if (!"application/x-subrip".equals(str10)) {
                                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                    }
                                                    str12 = qch0Var6.b;
                                                    if (str12 != null) {
                                                        ge30Var.b = qch0Var6.b;
                                                    }
                                                    ge30Var.a = Integer.toString(i44);
                                                    if (qch0Var6.a) {
                                                        str13 = str15;
                                                    } else {
                                                        str13 = "video/x-matroska";
                                                    }
                                                    ge30Var.n = asj0.p(str13);
                                                    ge30Var.o = asj0.p(str10);
                                                    ge30Var.f52p = i15;
                                                    ge30Var.d = qch0Var6.c0;
                                                    ge30Var.e = i413;
                                                    ge30Var.r = bg11VarSingletonList;
                                                    ge30Var.k = str7;
                                                    ge30Var.s = qch0Var6.n;
                                                    qch0Var6.e0 = new ie30(ge30Var);
                                                    rch0Var = rch0Var;
                                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                                } else {
                                                    i15 = i5;
                                                }
                                                str10 = str5;
                                                boolean z5 = qch0Var6.b0;
                                                if (qch0Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i417 = (z5 ? 1 : 0) | i16;
                                                ge30Var = new ge30();
                                                if (asj0.k(str10)) {
                                                    ge30Var.I = qch0Var6.Q;
                                                    ge30Var.J = qch0Var6.S;
                                                    ge30Var.K = qch0Var6.T;
                                                    ge30Var.L = i4;
                                                } else if (asj0.o(str10)) {
                                                    if (qch0Var6.t == 0) {
                                                        i24 = qch0Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = qch0Var6.o;
                                                        }
                                                        qch0Var6.r = i24;
                                                        i25 = qch0Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = qch0Var6.f119p;
                                                        }
                                                        qch0Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = qch0Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        } else {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        }
                                                    }
                                                    int i418 = i12;
                                                    int i419 = i13;
                                                    int i4110 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = qch0Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (qch0Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    x8h x8hVar4 = new x8h(i418, i419, i4110, bArr, i19, i21);
                                                    str11 = qch0Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (qch0Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    ge30Var.v = qch0Var6.o;
                                                    ge30Var.w = qch0Var6.f119p;
                                                    ge30Var.D = f;
                                                    ge30Var.B = i22;
                                                    ge30Var.E = qch0Var6.y;
                                                    ge30Var.F = qch0Var6.z;
                                                    ge30Var.G = x8hVar4;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                }
                                                str12 = qch0Var6.b;
                                                if (str12 != null) {
                                                    ge30Var.b = qch0Var6.b;
                                                }
                                                ge30Var.a = Integer.toString(i44);
                                                if (qch0Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                ge30Var.n = asj0.p(str13);
                                                ge30Var.o = asj0.p(str10);
                                                ge30Var.f52p = i15;
                                                ge30Var.d = qch0Var6.c0;
                                                ge30Var.e = i417;
                                                ge30Var.r = bg11VarSingletonList;
                                                ge30Var.k = str7;
                                                ge30Var.s = qch0Var6.n;
                                                qch0Var6.e0 = new ie30(ge30Var);
                                                rch0Var = rch0Var;
                                                qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                sparseArray2.put(qch0Var6.d, qch0Var6);
                                            }
                                            oon1.H("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                            str5 = "audio/x-unknown";
                                            i6 = -1;
                                            i5 = -1;
                                            i4 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            str7 = null;
                                            bg11VarSingletonList = null;
                                            if (qch0Var6.P != null) {
                                                i15 = i5;
                                                xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                                if (xr6VarB != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = xr6VarB.a;
                                                }
                                                boolean z6 = qch0Var6.b0;
                                                if (qch0Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111 = (z6 ? 1 : 0) | i16;
                                                ge30Var = new ge30();
                                                if (asj0.k(str10)) {
                                                    ge30Var.I = qch0Var6.Q;
                                                    ge30Var.J = qch0Var6.S;
                                                    ge30Var.K = qch0Var6.T;
                                                    ge30Var.L = i4;
                                                } else if (asj0.o(str10)) {
                                                    if (qch0Var6.t == 0) {
                                                        i24 = qch0Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = qch0Var6.o;
                                                        }
                                                        qch0Var6.r = i24;
                                                        i25 = qch0Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = qch0Var6.f119p;
                                                        }
                                                        qch0Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = qch0Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        } else {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        }
                                                    }
                                                    int i4112 = i12;
                                                    int i4113 = i13;
                                                    int i4114 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = qch0Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (qch0Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    x8h x8hVar5 = new x8h(i4112, i4113, i4114, bArr, i19, i21);
                                                    str11 = qch0Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (qch0Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    ge30Var.v = qch0Var6.o;
                                                    ge30Var.w = qch0Var6.f119p;
                                                    ge30Var.D = f;
                                                    ge30Var.B = i22;
                                                    ge30Var.E = qch0Var6.y;
                                                    ge30Var.F = qch0Var6.z;
                                                    ge30Var.G = x8hVar5;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                }
                                                str12 = qch0Var6.b;
                                                if (str12 != null) {
                                                    ge30Var.b = qch0Var6.b;
                                                }
                                                ge30Var.a = Integer.toString(i44);
                                                if (qch0Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                ge30Var.n = asj0.p(str13);
                                                ge30Var.o = asj0.p(str10);
                                                ge30Var.f52p = i15;
                                                ge30Var.d = qch0Var6.c0;
                                                ge30Var.e = i4111;
                                                ge30Var.r = bg11VarSingletonList;
                                                ge30Var.k = str7;
                                                ge30Var.s = qch0Var6.n;
                                                qch0Var6.e0 = new ie30(ge30Var);
                                                rch0Var = rch0Var;
                                                qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                sparseArray2.put(qch0Var6.d, qch0Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z7 = qch0Var6.b0;
                                            if (qch0Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i4115 = (z7 ? 1 : 0) | i16;
                                            ge30Var = new ge30();
                                            if (asj0.k(str10)) {
                                                ge30Var.I = qch0Var6.Q;
                                                ge30Var.J = qch0Var6.S;
                                                ge30Var.K = qch0Var6.T;
                                                ge30Var.L = i4;
                                            } else if (asj0.o(str10)) {
                                                if (qch0Var6.t == 0) {
                                                    i24 = qch0Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = qch0Var6.o;
                                                    }
                                                    qch0Var6.r = i24;
                                                    i25 = qch0Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = qch0Var6.f119p;
                                                    }
                                                    qch0Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = qch0Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    } else {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    }
                                                }
                                                int i4116 = i12;
                                                int i4117 = i13;
                                                int i4118 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = qch0Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (qch0Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                x8h x8hVar6 = new x8h(i4116, i4117, i4118, bArr, i19, i21);
                                                str11 = qch0Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (qch0Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                ge30Var.v = qch0Var6.o;
                                                ge30Var.w = qch0Var6.f119p;
                                                ge30Var.D = f;
                                                ge30Var.B = i22;
                                                ge30Var.E = qch0Var6.y;
                                                ge30Var.F = qch0Var6.z;
                                                ge30Var.G = x8hVar6;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                            }
                                            str12 = qch0Var6.b;
                                            if (str12 != null) {
                                                ge30Var.b = qch0Var6.b;
                                            }
                                            ge30Var.a = Integer.toString(i44);
                                            if (qch0Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            ge30Var.n = asj0.p(str13);
                                            ge30Var.o = asj0.p(str10);
                                            ge30Var.f52p = i15;
                                            ge30Var.d = qch0Var6.c0;
                                            ge30Var.e = i4115;
                                            ge30Var.r = bg11VarSingletonList;
                                            ge30Var.k = str7;
                                            ge30Var.s = qch0Var6.n;
                                            qch0Var6.e0 = new ie30(ge30Var);
                                            rch0Var = rch0Var;
                                            qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                            sparseArray2.put(qch0Var6.d, qch0Var6);
                                            break;
                                        }
                                        int i50 = qch0Var6.R;
                                        String str18 = zoi1.a;
                                        int I2 = zoi1.I(i50, ByteOrder.LITTLE_ENDIAN);
                                        if (I2 == 0) {
                                            oon1.H("Unsupported PCM bit depth: " + qch0Var6.R + ". Setting mimeType to audio/x-unknown");
                                            str5 = "audio/x-unknown";
                                            i6 = -1;
                                            i5 = -1;
                                            i4 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            str7 = null;
                                            bg11VarSingletonList = null;
                                            if (qch0Var6.P != null) {
                                                i15 = i5;
                                                xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                                if (xr6VarB != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = xr6VarB.a;
                                                }
                                                boolean z8 = qch0Var6.b0;
                                                if (qch0Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4119 = (z8 ? 1 : 0) | i16;
                                                ge30Var = new ge30();
                                                if (asj0.k(str10)) {
                                                    ge30Var.I = qch0Var6.Q;
                                                    ge30Var.J = qch0Var6.S;
                                                    ge30Var.K = qch0Var6.T;
                                                    ge30Var.L = i4;
                                                } else if (asj0.o(str10)) {
                                                    if (qch0Var6.t == 0) {
                                                        i24 = qch0Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = qch0Var6.o;
                                                        }
                                                        qch0Var6.r = i24;
                                                        i25 = qch0Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = qch0Var6.f119p;
                                                        }
                                                        qch0Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = qch0Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        } else {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        }
                                                    }
                                                    int i41110 = i12;
                                                    int i41111 = i13;
                                                    int i41112 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = qch0Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (qch0Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    x8h x8hVar7 = new x8h(i41110, i41111, i41112, bArr, i19, i21);
                                                    str11 = qch0Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (qch0Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    ge30Var.v = qch0Var6.o;
                                                    ge30Var.w = qch0Var6.f119p;
                                                    ge30Var.D = f;
                                                    ge30Var.B = i22;
                                                    ge30Var.E = qch0Var6.y;
                                                    ge30Var.F = qch0Var6.z;
                                                    ge30Var.G = x8hVar7;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                }
                                                str12 = qch0Var6.b;
                                                if (str12 != null) {
                                                    ge30Var.b = qch0Var6.b;
                                                }
                                                ge30Var.a = Integer.toString(i44);
                                                if (qch0Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                ge30Var.n = asj0.p(str13);
                                                ge30Var.o = asj0.p(str10);
                                                ge30Var.f52p = i15;
                                                ge30Var.d = qch0Var6.c0;
                                                ge30Var.e = i4119;
                                                ge30Var.r = bg11VarSingletonList;
                                                ge30Var.k = str7;
                                                ge30Var.s = qch0Var6.n;
                                                qch0Var6.e0 = new ie30(ge30Var);
                                                rch0Var = rch0Var;
                                                qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                sparseArray2.put(qch0Var6.d, qch0Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z9 = qch0Var6.b0;
                                            if (qch0Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41113 = (z9 ? 1 : 0) | i16;
                                            ge30Var = new ge30();
                                            if (asj0.k(str10)) {
                                                ge30Var.I = qch0Var6.Q;
                                                ge30Var.J = qch0Var6.S;
                                                ge30Var.K = qch0Var6.T;
                                                ge30Var.L = i4;
                                            } else if (asj0.o(str10)) {
                                                if (qch0Var6.t == 0) {
                                                    i24 = qch0Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = qch0Var6.o;
                                                    }
                                                    qch0Var6.r = i24;
                                                    i25 = qch0Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = qch0Var6.f119p;
                                                    }
                                                    qch0Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = qch0Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    } else {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    }
                                                }
                                                int i41114 = i12;
                                                int i41115 = i13;
                                                int i41116 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = qch0Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (qch0Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                x8h x8hVar8 = new x8h(i41114, i41115, i41116, bArr, i19, i21);
                                                str11 = qch0Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (qch0Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                ge30Var.v = qch0Var6.o;
                                                ge30Var.w = qch0Var6.f119p;
                                                ge30Var.D = f;
                                                ge30Var.B = i22;
                                                ge30Var.E = qch0Var6.y;
                                                ge30Var.F = qch0Var6.z;
                                                ge30Var.G = x8hVar8;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                            }
                                            str12 = qch0Var6.b;
                                            if (str12 != null) {
                                                ge30Var.b = qch0Var6.b;
                                            }
                                            ge30Var.a = Integer.toString(i44);
                                            if (qch0Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            ge30Var.n = asj0.p(str13);
                                            ge30Var.o = asj0.p(str10);
                                            ge30Var.f52p = i15;
                                            ge30Var.d = qch0Var6.c0;
                                            ge30Var.e = i41113;
                                            ge30Var.r = bg11VarSingletonList;
                                            ge30Var.k = str7;
                                            ge30Var.s = qch0Var6.n;
                                            qch0Var6.e0 = new ie30(ge30Var);
                                            rch0Var = rch0Var;
                                            qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                            sparseArray2.put(qch0Var6.d, qch0Var6);
                                        } else {
                                            i4 = I2;
                                            str5 = "audio/raw";
                                            i6 = -1;
                                            i5 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            str7 = null;
                                            bg11VarSingletonList = null;
                                            if (qch0Var6.P != null) {
                                                i15 = i5;
                                                xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                                if (xr6VarB != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = xr6VarB.a;
                                                }
                                                boolean z10 = qch0Var6.b0;
                                                if (qch0Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i41117 = (z10 ? 1 : 0) | i16;
                                                ge30Var = new ge30();
                                                if (asj0.k(str10)) {
                                                    ge30Var.I = qch0Var6.Q;
                                                    ge30Var.J = qch0Var6.S;
                                                    ge30Var.K = qch0Var6.T;
                                                    ge30Var.L = i4;
                                                } else if (asj0.o(str10)) {
                                                    if (qch0Var6.t == 0) {
                                                        i24 = qch0Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = qch0Var6.o;
                                                        }
                                                        qch0Var6.r = i24;
                                                        i25 = qch0Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = qch0Var6.f119p;
                                                        }
                                                        qch0Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = qch0Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        } else {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        }
                                                    }
                                                    int i41118 = i12;
                                                    int i41119 = i13;
                                                    int i411110 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = qch0Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (qch0Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    x8h x8hVar9 = new x8h(i41118, i41119, i411110, bArr, i19, i21);
                                                    str11 = qch0Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (qch0Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    ge30Var.v = qch0Var6.o;
                                                    ge30Var.w = qch0Var6.f119p;
                                                    ge30Var.D = f;
                                                    ge30Var.B = i22;
                                                    ge30Var.E = qch0Var6.y;
                                                    ge30Var.F = qch0Var6.z;
                                                    ge30Var.G = x8hVar9;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                }
                                                str12 = qch0Var6.b;
                                                if (str12 != null) {
                                                    ge30Var.b = qch0Var6.b;
                                                }
                                                ge30Var.a = Integer.toString(i44);
                                                if (qch0Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                ge30Var.n = asj0.p(str13);
                                                ge30Var.o = asj0.p(str10);
                                                ge30Var.f52p = i15;
                                                ge30Var.d = qch0Var6.c0;
                                                ge30Var.e = i41117;
                                                ge30Var.r = bg11VarSingletonList;
                                                ge30Var.k = str7;
                                                ge30Var.s = qch0Var6.n;
                                                qch0Var6.e0 = new ie30(ge30Var);
                                                rch0Var = rch0Var;
                                                qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                sparseArray2.put(qch0Var6.d, qch0Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z11 = qch0Var6.b0;
                                            if (qch0Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i411111 = (z11 ? 1 : 0) | i16;
                                            ge30Var = new ge30();
                                            if (asj0.k(str10)) {
                                                ge30Var.I = qch0Var6.Q;
                                                ge30Var.J = qch0Var6.S;
                                                ge30Var.K = qch0Var6.T;
                                                ge30Var.L = i4;
                                            } else if (asj0.o(str10)) {
                                                if (qch0Var6.t == 0) {
                                                    i24 = qch0Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = qch0Var6.o;
                                                    }
                                                    qch0Var6.r = i24;
                                                    i25 = qch0Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = qch0Var6.f119p;
                                                    }
                                                    qch0Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = qch0Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    } else {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    }
                                                }
                                                int i411112 = i12;
                                                int i411113 = i13;
                                                int i411114 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = qch0Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (qch0Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                x8h x8hVar10 = new x8h(i411112, i411113, i411114, bArr, i19, i21);
                                                str11 = qch0Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (qch0Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                ge30Var.v = qch0Var6.o;
                                                ge30Var.w = qch0Var6.f119p;
                                                ge30Var.D = f;
                                                ge30Var.B = i22;
                                                ge30Var.E = qch0Var6.y;
                                                ge30Var.F = qch0Var6.z;
                                                ge30Var.G = x8hVar10;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                            }
                                            str12 = qch0Var6.b;
                                            if (str12 != null) {
                                                ge30Var.b = qch0Var6.b;
                                            }
                                            ge30Var.a = Integer.toString(i44);
                                            if (qch0Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            ge30Var.n = asj0.p(str13);
                                            ge30Var.o = asj0.p(str10);
                                            ge30Var.f52p = i15;
                                            ge30Var.d = qch0Var6.c0;
                                            ge30Var.e = i411111;
                                            ge30Var.r = bg11VarSingletonList;
                                            ge30Var.k = str7;
                                            ge30Var.s = qch0Var6.n;
                                            qch0Var6.e0 = new ie30(ge30Var);
                                            rch0Var = rch0Var;
                                            qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                            sparseArray2.put(qch0Var6.d, qch0Var6);
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused) {
                                        throw ParserException.a((RuntimeException) null, "Error parsing MS/ACM codec private");
                                    }
                                    break;
                                case 3:
                                    str15 = "video/webm";
                                    qch0Var6.W = new bwg1();
                                    str17 = "audio/true-hd";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z12 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411115 = (z12 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411116 = i12;
                                            int i411117 = i13;
                                            int i411118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11 = new x8h(i411116, i411117, i411118, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411115;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z13 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411119 = (z13 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i4111110 = i12;
                                        int i4111111 = i13;
                                        int i4111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar12 = new x8h(i4111110, i4111111, i4111112, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar12;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411119;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 4:
                                    byte[] bArrA = qch0Var6.a(str16);
                                    try {
                                        r6 = bArrA[0];
                                        try {
                                            if (r6 != 2) {
                                                throw ParserException.a((RuntimeException) null, "Error parsing vorbis codec private");
                                            }
                                            int i51 = 1;
                                            int i52 = 0;
                                            while (true) {
                                                int i53 = i51;
                                                int i54 = bArrA[i51] & 255;
                                                if (i54 != 255) {
                                                    int i55 = i53 + 1;
                                                    int i56 = i52 + i54;
                                                    int i57 = 0;
                                                    while (true) {
                                                        int i58 = bArrA[i55] & 255;
                                                        if (i58 != 255) {
                                                            int i59 = i55 + 1;
                                                            int i60 = i57 + i58;
                                                            if (bArrA[i59] != 1) {
                                                                throw ParserException.a((RuntimeException) null, "Error parsing vorbis codec private");
                                                            }
                                                            byte[] bArr4 = new byte[i56];
                                                            System.arraycopy(bArrA, i59, bArr4, 0, i56);
                                                            int i61 = i59 + i56;
                                                            if (bArrA[i61] != 3) {
                                                                throw ParserException.a((RuntimeException) null, "Error parsing vorbis codec private");
                                                            }
                                                            int i62 = i61 + i60;
                                                            if (bArrA[i62] != 5) {
                                                                throw ParserException.a((RuntimeException) null, "Error parsing vorbis codec private");
                                                            }
                                                            byte[] bArr5 = new byte[bArrA.length - i62];
                                                            System.arraycopy(bArrA, i62, bArr5, 0, bArrA.length - i62);
                                                            bg11 arrayList2 = new ArrayList(2);
                                                            arrayList2.add(bArr4);
                                                            arrayList2.add(bArr5);
                                                            str3 = "audio/vorbis";
                                                            i5 = SemanticState.Multiline;
                                                            bg11VarSingletonList = arrayList2;
                                                            str5 = str3;
                                                            i6 = -1;
                                                            i4 = -1;
                                                            i12 = -1;
                                                            i13 = -1;
                                                            i14 = -1;
                                                            i8 = -1;
                                                            str7 = null;
                                                            if (qch0Var6.P != null) {
                                                                i15 = i5;
                                                                xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                                                if (xr6VarB != null) {
                                                                    str10 = "video/dolby-vision";
                                                                    str7 = xr6VarB.a;
                                                                }
                                                                boolean z14 = qch0Var6.b0;
                                                                if (qch0Var6.a0) {
                                                                    i16 = 2;
                                                                } else {
                                                                    i16 = 0;
                                                                }
                                                                int i4111113 = (z14 ? 1 : 0) | i16;
                                                                ge30Var = new ge30();
                                                                if (asj0.k(str10)) {
                                                                    ge30Var.I = qch0Var6.Q;
                                                                    ge30Var.J = qch0Var6.S;
                                                                    ge30Var.K = qch0Var6.T;
                                                                    ge30Var.L = i4;
                                                                } else if (asj0.o(str10)) {
                                                                    if (qch0Var6.t == 0) {
                                                                        i24 = qch0Var6.r;
                                                                        i17 = -1;
                                                                        if (i24 == -1) {
                                                                            i24 = qch0Var6.o;
                                                                        }
                                                                        qch0Var6.r = i24;
                                                                        i25 = qch0Var6.s;
                                                                        if (i25 == -1) {
                                                                            i25 = qch0Var6.f119p;
                                                                        }
                                                                        qch0Var6.s = i25;
                                                                    } else {
                                                                        i17 = -1;
                                                                    }
                                                                    i18 = qch0Var6.r;
                                                                    if (i18 != i17) {
                                                                        f = -1.0f;
                                                                    } else {
                                                                        f = -1.0f;
                                                                    }
                                                                    if (i12 == -1) {
                                                                        if (i13 == -1) {
                                                                            i12 = qch0Var6.A;
                                                                            i8 = qch0Var6.B;
                                                                            i13 = qch0Var6.C;
                                                                        } else {
                                                                            i12 = qch0Var6.A;
                                                                            i8 = qch0Var6.B;
                                                                            i13 = qch0Var6.C;
                                                                        }
                                                                    }
                                                                    int i4111114 = i12;
                                                                    int i4111115 = i13;
                                                                    int i4111116 = i8;
                                                                    if (i6 != -1) {
                                                                        i19 = i6;
                                                                    } else {
                                                                        i19 = 8;
                                                                    }
                                                                    if (i14 != -1) {
                                                                        i21 = i14;
                                                                    } else {
                                                                        i20 = qch0Var6.q;
                                                                        if (i20 != -1) {
                                                                            i21 = i20;
                                                                        } else {
                                                                            i21 = 8;
                                                                        }
                                                                    }
                                                                    if (qch0Var6.F != -1.0f) {
                                                                        bArr = null;
                                                                    } else {
                                                                        bArr = null;
                                                                    }
                                                                    x8h x8hVar13 = new x8h(i4111114, i4111115, i4111116, bArr, i19, i21);
                                                                    str11 = qch0Var6.b;
                                                                    if (str11 == null) {
                                                                        iIntValue = -1;
                                                                    } else {
                                                                        iIntValue = -1;
                                                                    }
                                                                    if (qch0Var6.u == 0) {
                                                                        i22 = iIntValue;
                                                                    } else {
                                                                        i22 = iIntValue;
                                                                    }
                                                                    ge30Var.v = qch0Var6.o;
                                                                    ge30Var.w = qch0Var6.f119p;
                                                                    ge30Var.D = f;
                                                                    ge30Var.B = i22;
                                                                    ge30Var.E = qch0Var6.y;
                                                                    ge30Var.F = qch0Var6.z;
                                                                    ge30Var.G = x8hVar13;
                                                                } else if (!"application/x-subrip".equals(str10)) {
                                                                    throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                                }
                                                                str12 = qch0Var6.b;
                                                                if (str12 != null) {
                                                                    ge30Var.b = qch0Var6.b;
                                                                }
                                                                ge30Var.a = Integer.toString(i44);
                                                                if (qch0Var6.a) {
                                                                    str13 = str15;
                                                                } else {
                                                                    str13 = "video/x-matroska";
                                                                }
                                                                ge30Var.n = asj0.p(str13);
                                                                ge30Var.o = asj0.p(str10);
                                                                ge30Var.f52p = i15;
                                                                ge30Var.d = qch0Var6.c0;
                                                                ge30Var.e = i4111113;
                                                                ge30Var.r = bg11VarSingletonList;
                                                                ge30Var.k = str7;
                                                                ge30Var.s = qch0Var6.n;
                                                                qch0Var6.e0 = new ie30(ge30Var);
                                                                rch0Var = rch0Var;
                                                                qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                                sparseArray2.put(qch0Var6.d, qch0Var6);
                                                            } else {
                                                                i15 = i5;
                                                            }
                                                            str10 = str5;
                                                            boolean z15 = qch0Var6.b0;
                                                            if (qch0Var6.a0) {
                                                                i16 = 2;
                                                            } else {
                                                                i16 = 0;
                                                            }
                                                            int i4111117 = (z15 ? 1 : 0) | i16;
                                                            ge30Var = new ge30();
                                                            if (asj0.k(str10)) {
                                                                ge30Var.I = qch0Var6.Q;
                                                                ge30Var.J = qch0Var6.S;
                                                                ge30Var.K = qch0Var6.T;
                                                                ge30Var.L = i4;
                                                            } else if (asj0.o(str10)) {
                                                                if (qch0Var6.t == 0) {
                                                                    i24 = qch0Var6.r;
                                                                    i17 = -1;
                                                                    if (i24 == -1) {
                                                                        i24 = qch0Var6.o;
                                                                    }
                                                                    qch0Var6.r = i24;
                                                                    i25 = qch0Var6.s;
                                                                    if (i25 == -1) {
                                                                        i25 = qch0Var6.f119p;
                                                                    }
                                                                    qch0Var6.s = i25;
                                                                } else {
                                                                    i17 = -1;
                                                                }
                                                                i18 = qch0Var6.r;
                                                                if (i18 != i17) {
                                                                    f = -1.0f;
                                                                } else {
                                                                    f = -1.0f;
                                                                }
                                                                if (i12 == -1) {
                                                                    if (i13 == -1) {
                                                                        i12 = qch0Var6.A;
                                                                        i8 = qch0Var6.B;
                                                                        i13 = qch0Var6.C;
                                                                    } else {
                                                                        i12 = qch0Var6.A;
                                                                        i8 = qch0Var6.B;
                                                                        i13 = qch0Var6.C;
                                                                    }
                                                                }
                                                                int i4111118 = i12;
                                                                int i4111119 = i13;
                                                                int i41111110 = i8;
                                                                if (i6 != -1) {
                                                                    i19 = i6;
                                                                } else {
                                                                    i19 = 8;
                                                                }
                                                                if (i14 != -1) {
                                                                    i21 = i14;
                                                                } else {
                                                                    i20 = qch0Var6.q;
                                                                    if (i20 != -1) {
                                                                        i21 = i20;
                                                                    } else {
                                                                        i21 = 8;
                                                                    }
                                                                }
                                                                if (qch0Var6.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                x8h x8hVar14 = new x8h(i4111118, i4111119, i41111110, bArr, i19, i21);
                                                                str11 = qch0Var6.b;
                                                                if (str11 == null) {
                                                                    iIntValue = -1;
                                                                } else {
                                                                    iIntValue = -1;
                                                                }
                                                                if (qch0Var6.u == 0) {
                                                                    i22 = iIntValue;
                                                                } else {
                                                                    i22 = iIntValue;
                                                                }
                                                                ge30Var.v = qch0Var6.o;
                                                                ge30Var.w = qch0Var6.f119p;
                                                                ge30Var.D = f;
                                                                ge30Var.B = i22;
                                                                ge30Var.E = qch0Var6.y;
                                                                ge30Var.F = qch0Var6.z;
                                                                ge30Var.G = x8hVar14;
                                                            } else if (!"application/x-subrip".equals(str10)) {
                                                                throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                            }
                                                            str12 = qch0Var6.b;
                                                            if (str12 != null) {
                                                                ge30Var.b = qch0Var6.b;
                                                            }
                                                            ge30Var.a = Integer.toString(i44);
                                                            if (qch0Var6.a) {
                                                                str13 = str15;
                                                            } else {
                                                                str13 = "video/x-matroska";
                                                            }
                                                            ge30Var.n = asj0.p(str13);
                                                            ge30Var.o = asj0.p(str10);
                                                            ge30Var.f52p = i15;
                                                            ge30Var.d = qch0Var6.c0;
                                                            ge30Var.e = i4111117;
                                                            ge30Var.r = bg11VarSingletonList;
                                                            ge30Var.k = str7;
                                                            ge30Var.s = qch0Var6.n;
                                                            qch0Var6.e0 = new ie30(ge30Var);
                                                            rch0Var = rch0Var;
                                                            qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                            sparseArray2.put(qch0Var6.d, qch0Var6);
                                                        } else {
                                                            i57 += 255;
                                                            i55++;
                                                        }
                                                    }
                                                } else {
                                                    i52 += 255;
                                                    i51 = i53 + 1;
                                                }
                                                break;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException unused2) {
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                        r6 = 0;
                                    }
                                    throw ParserException.a((RuntimeException) r6, "Error parsing vorbis codec private");
                                case 5:
                                    str4 = "audio/mpeg-L2";
                                    rch0Var = rch0Var;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = str4;
                                    i6 = -1;
                                    i5 = SemanticState.Obscured;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z16 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111 = (z16 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i41111112 = i12;
                                            int i41111113 = i13;
                                            int i41111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar15 = new x8h(i41111112, i41111113, i41111114, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar15;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111111;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z17 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111115 = (z17 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i41111116 = i12;
                                        int i41111117 = i13;
                                        int i41111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar16 = new x8h(i41111116, i41111117, i41111118, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar16;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i41111115;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 6:
                                    str4 = "audio/mpeg";
                                    rch0Var = rch0Var;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = str4;
                                    i6 = -1;
                                    i5 = SemanticState.Obscured;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z18 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111119 = (z18 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111110 = i12;
                                            int i411111111 = i13;
                                            int i411111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar17 = new x8h(i411111110, i411111111, i411111112, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar17;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111119;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z19 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111113 = (z19 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i411111114 = i12;
                                        int i411111115 = i13;
                                        int i411111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar18 = new x8h(i411111114, i411111115, i411111116, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar18;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411111113;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 7:
                                    izr0 izr0Var3 = new izr0(qch0Var6.a(qch0Var6.c));
                                    try {
                                        izr0Var3.S(16);
                                        long jV = izr0Var3.v();
                                        try {
                                            if (jV == 1482049860) {
                                                pair = new Pair("video/divx", null);
                                            } else if (jV != 859189832) {
                                                if (jV == 826496599) {
                                                    int i63 = izr0Var3.b + 20;
                                                    byte[] bArr6 = izr0Var3.a;
                                                    while (true) {
                                                        if (i63 >= bArr6.length - 4) {
                                                            throw ParserException.a((RuntimeException) null, "Failed to find FourCC VC1 initialization data");
                                                        }
                                                        if (bArr6[i63] == 0 && bArr6[i63 + 1] == 0 && bArr6[i63 + 2] == 1) {
                                                            if (bArr6[i63 + 3] == 15) {
                                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr6, i63, bArr6.length)));
                                                            }
                                                        }
                                                        i63++;
                                                    }
                                                } else {
                                                    oon1.H("Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str6 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                }
                                                str7 = str6;
                                                str5 = (String) pair.first;
                                                bg11VarSingletonList = (List) pair.second;
                                                i6 = -1;
                                                i5 = -1;
                                                i4 = -1;
                                                i12 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                if (qch0Var6.P != null) {
                                                    i15 = i5;
                                                    xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                                    if (xr6VarB != null) {
                                                        str10 = "video/dolby-vision";
                                                        str7 = xr6VarB.a;
                                                    }
                                                    boolean z110 = qch0Var6.b0;
                                                    if (qch0Var6.a0) {
                                                        i16 = 2;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    int i411111117 = (z110 ? 1 : 0) | i16;
                                                    ge30Var = new ge30();
                                                    if (asj0.k(str10)) {
                                                        ge30Var.I = qch0Var6.Q;
                                                        ge30Var.J = qch0Var6.S;
                                                        ge30Var.K = qch0Var6.T;
                                                        ge30Var.L = i4;
                                                    } else if (asj0.o(str10)) {
                                                        if (qch0Var6.t == 0) {
                                                            i24 = qch0Var6.r;
                                                            i17 = -1;
                                                            if (i24 == -1) {
                                                                i24 = qch0Var6.o;
                                                            }
                                                            qch0Var6.r = i24;
                                                            i25 = qch0Var6.s;
                                                            if (i25 == -1) {
                                                                i25 = qch0Var6.f119p;
                                                            }
                                                            qch0Var6.s = i25;
                                                        } else {
                                                            i17 = -1;
                                                        }
                                                        i18 = qch0Var6.r;
                                                        if (i18 != i17) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (i12 == -1) {
                                                            if (i13 == -1) {
                                                                i12 = qch0Var6.A;
                                                                i8 = qch0Var6.B;
                                                                i13 = qch0Var6.C;
                                                            } else {
                                                                i12 = qch0Var6.A;
                                                                i8 = qch0Var6.B;
                                                                i13 = qch0Var6.C;
                                                            }
                                                        }
                                                        int i411111118 = i12;
                                                        int i411111119 = i13;
                                                        int i4111111110 = i8;
                                                        if (i6 != -1) {
                                                            i19 = i6;
                                                        } else {
                                                            i19 = 8;
                                                        }
                                                        if (i14 != -1) {
                                                            i21 = i14;
                                                        } else {
                                                            i20 = qch0Var6.q;
                                                            if (i20 != -1) {
                                                                i21 = i20;
                                                            } else {
                                                                i21 = 8;
                                                            }
                                                        }
                                                        if (qch0Var6.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        x8h x8hVar19 = new x8h(i411111118, i411111119, i4111111110, bArr, i19, i21);
                                                        str11 = qch0Var6.b;
                                                        if (str11 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (qch0Var6.u == 0) {
                                                            i22 = iIntValue;
                                                        } else {
                                                            i22 = iIntValue;
                                                        }
                                                        ge30Var.v = qch0Var6.o;
                                                        ge30Var.w = qch0Var6.f119p;
                                                        ge30Var.D = f;
                                                        ge30Var.B = i22;
                                                        ge30Var.E = qch0Var6.y;
                                                        ge30Var.F = qch0Var6.z;
                                                        ge30Var.G = x8hVar19;
                                                    } else if (!"application/x-subrip".equals(str10)) {
                                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                    }
                                                    str12 = qch0Var6.b;
                                                    if (str12 != null) {
                                                        ge30Var.b = qch0Var6.b;
                                                    }
                                                    ge30Var.a = Integer.toString(i44);
                                                    if (qch0Var6.a) {
                                                        str13 = str15;
                                                    } else {
                                                        str13 = "video/x-matroska";
                                                    }
                                                    ge30Var.n = asj0.p(str13);
                                                    ge30Var.o = asj0.p(str10);
                                                    ge30Var.f52p = i15;
                                                    ge30Var.d = qch0Var6.c0;
                                                    ge30Var.e = i411111117;
                                                    ge30Var.r = bg11VarSingletonList;
                                                    ge30Var.k = str7;
                                                    ge30Var.s = qch0Var6.n;
                                                    qch0Var6.e0 = new ie30(ge30Var);
                                                    rch0Var = rch0Var;
                                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                                } else {
                                                    i15 = i5;
                                                }
                                                str10 = str5;
                                                boolean z111 = qch0Var6.b0;
                                                if (qch0Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111111111 = (z111 ? 1 : 0) | i16;
                                                ge30Var = new ge30();
                                                if (asj0.k(str10)) {
                                                    ge30Var.I = qch0Var6.Q;
                                                    ge30Var.J = qch0Var6.S;
                                                    ge30Var.K = qch0Var6.T;
                                                    ge30Var.L = i4;
                                                } else if (asj0.o(str10)) {
                                                    if (qch0Var6.t == 0) {
                                                        i24 = qch0Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = qch0Var6.o;
                                                        }
                                                        qch0Var6.r = i24;
                                                        i25 = qch0Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = qch0Var6.f119p;
                                                        }
                                                        qch0Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = qch0Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        } else {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        }
                                                    }
                                                    int i4111111112 = i12;
                                                    int i4111111113 = i13;
                                                    int i4111111114 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = qch0Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (qch0Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    x8h x8hVar110 = new x8h(i4111111112, i4111111113, i4111111114, bArr, i19, i21);
                                                    str11 = qch0Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (qch0Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    ge30Var.v = qch0Var6.o;
                                                    ge30Var.w = qch0Var6.f119p;
                                                    ge30Var.D = f;
                                                    ge30Var.B = i22;
                                                    ge30Var.E = qch0Var6.y;
                                                    ge30Var.F = qch0Var6.z;
                                                    ge30Var.G = x8hVar110;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                }
                                                str12 = qch0Var6.b;
                                                if (str12 != null) {
                                                    ge30Var.b = qch0Var6.b;
                                                }
                                                ge30Var.a = Integer.toString(i44);
                                                if (qch0Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                ge30Var.n = asj0.p(str13);
                                                ge30Var.o = asj0.p(str10);
                                                ge30Var.f52p = i15;
                                                ge30Var.d = qch0Var6.c0;
                                                ge30Var.e = i4111111111;
                                                ge30Var.r = bg11VarSingletonList;
                                                ge30Var.k = str7;
                                                ge30Var.s = qch0Var6.n;
                                                qch0Var6.e0 = new ie30(ge30Var);
                                                rch0Var = rch0Var;
                                                qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                sparseArray2.put(qch0Var6.d, qch0Var6);
                                            } else {
                                                pair = new Pair("video/3gpp", null);
                                            }
                                            str6 = null;
                                            str7 = str6;
                                            str5 = (String) pair.first;
                                            bg11VarSingletonList = (List) pair.second;
                                            i6 = -1;
                                            i5 = -1;
                                            i4 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            if (qch0Var6.P != null) {
                                                i15 = i5;
                                                xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                                if (xr6VarB != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = xr6VarB.a;
                                                }
                                                boolean z112 = qch0Var6.b0;
                                                if (qch0Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111111115 = (z112 ? 1 : 0) | i16;
                                                ge30Var = new ge30();
                                                if (asj0.k(str10)) {
                                                    ge30Var.I = qch0Var6.Q;
                                                    ge30Var.J = qch0Var6.S;
                                                    ge30Var.K = qch0Var6.T;
                                                    ge30Var.L = i4;
                                                } else if (asj0.o(str10)) {
                                                    if (qch0Var6.t == 0) {
                                                        i24 = qch0Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = qch0Var6.o;
                                                        }
                                                        qch0Var6.r = i24;
                                                        i25 = qch0Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = qch0Var6.f119p;
                                                        }
                                                        qch0Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = qch0Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        } else {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        }
                                                    }
                                                    int i4111111116 = i12;
                                                    int i4111111117 = i13;
                                                    int i4111111118 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = qch0Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (qch0Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    x8h x8hVar111 = new x8h(i4111111116, i4111111117, i4111111118, bArr, i19, i21);
                                                    str11 = qch0Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (qch0Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    ge30Var.v = qch0Var6.o;
                                                    ge30Var.w = qch0Var6.f119p;
                                                    ge30Var.D = f;
                                                    ge30Var.B = i22;
                                                    ge30Var.E = qch0Var6.y;
                                                    ge30Var.F = qch0Var6.z;
                                                    ge30Var.G = x8hVar111;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                }
                                                str12 = qch0Var6.b;
                                                if (str12 != null) {
                                                    ge30Var.b = qch0Var6.b;
                                                }
                                                ge30Var.a = Integer.toString(i44);
                                                if (qch0Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                ge30Var.n = asj0.p(str13);
                                                ge30Var.o = asj0.p(str10);
                                                ge30Var.f52p = i15;
                                                ge30Var.d = qch0Var6.c0;
                                                ge30Var.e = i4111111115;
                                                ge30Var.r = bg11VarSingletonList;
                                                ge30Var.k = str7;
                                                ge30Var.s = qch0Var6.n;
                                                qch0Var6.e0 = new ie30(ge30Var);
                                                rch0Var = rch0Var;
                                                qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                sparseArray2.put(qch0Var6.d, qch0Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z113 = qch0Var6.b0;
                                            if (qch0Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i4111111119 = (z113 ? 1 : 0) | i16;
                                            ge30Var = new ge30();
                                            if (asj0.k(str10)) {
                                                ge30Var.I = qch0Var6.Q;
                                                ge30Var.J = qch0Var6.S;
                                                ge30Var.K = qch0Var6.T;
                                                ge30Var.L = i4;
                                            } else if (asj0.o(str10)) {
                                                if (qch0Var6.t == 0) {
                                                    i24 = qch0Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = qch0Var6.o;
                                                    }
                                                    qch0Var6.r = i24;
                                                    i25 = qch0Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = qch0Var6.f119p;
                                                    }
                                                    qch0Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = qch0Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    } else {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    }
                                                }
                                                int i41111111110 = i12;
                                                int i41111111111 = i13;
                                                int i41111111112 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = qch0Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (qch0Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                x8h x8hVar112 = new x8h(i41111111110, i41111111111, i41111111112, bArr, i19, i21);
                                                str11 = qch0Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (qch0Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                ge30Var.v = qch0Var6.o;
                                                ge30Var.w = qch0Var6.f119p;
                                                ge30Var.D = f;
                                                ge30Var.B = i22;
                                                ge30Var.E = qch0Var6.y;
                                                ge30Var.F = qch0Var6.z;
                                                ge30Var.G = x8hVar112;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                            }
                                            str12 = qch0Var6.b;
                                            if (str12 != null) {
                                                ge30Var.b = qch0Var6.b;
                                            }
                                            ge30Var.a = Integer.toString(i44);
                                            if (qch0Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            ge30Var.n = asj0.p(str13);
                                            ge30Var.o = asj0.p(str10);
                                            ge30Var.f52p = i15;
                                            ge30Var.d = qch0Var6.c0;
                                            ge30Var.e = i4111111119;
                                            ge30Var.r = bg11VarSingletonList;
                                            ge30Var.k = str7;
                                            ge30Var.s = qch0Var6.n;
                                            qch0Var6.e0 = new ie30(ge30Var);
                                            rch0Var = rch0Var;
                                            qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                            sparseArray2.put(qch0Var6.d, qch0Var6);
                                        } catch (ArrayIndexOutOfBoundsException unused4) {
                                            throw ParserException.a((RuntimeException) r5, "Error parsing FourCC private data");
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                        r5 = 0;
                                    }
                                    break;
                                case 8:
                                    byte[] bArr7 = new byte[4];
                                    System.arraycopy(qch0Var6.a(str16), 0, bArr7, 0, 4);
                                    bg11VarSingletonList = b380.t(bArr7);
                                    str5 = "application/dvbsubs";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z114 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111113 = (z114 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i41111111114 = i12;
                                            int i41111111115 = i13;
                                            int i41111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar113 = new x8h(i41111111114, i41111111115, i41111111116, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111111113;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z115 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111117 = (z115 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i41111111118 = i12;
                                        int i41111111119 = i13;
                                        int i411111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar114 = new x8h(i41111111118, i41111111119, i411111111110, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i41111111117;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 10:
                                    yb9 yb9VarA = yb9.a(new izr0(qch0Var6.a(qch0Var6.c)));
                                    bg11 bg11Var2 = yb9VarA.a;
                                    qch0Var6.f0 = yb9VarA.b;
                                    str8 = yb9VarA.l;
                                    i7 = yb9VarA.g;
                                    i8 = yb9VarA.i;
                                    bg11Var = bg11Var2;
                                    i9 = yb9VarA.h;
                                    i10 = yb9VarA.e;
                                    i11 = yb9VarA.f;
                                    str9 = "video/avc";
                                    i13 = i9;
                                    str5 = str9;
                                    i12 = i7;
                                    bg11VarSingletonList = bg11Var;
                                    i14 = i11;
                                    i6 = i10;
                                    str7 = str8;
                                    i5 = -1;
                                    i4 = -1;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z116 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111 = (z116 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111112 = i12;
                                            int i411111111113 = i13;
                                            int i411111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar115 = new x8h(i411111111112, i411111111113, i411111111114, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411111111111;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z117 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111115 = (z117 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i411111111116 = i12;
                                        int i411111111117 = i13;
                                        int i411111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar116 = new x8h(i411111111116, i411111111117, i411111111118, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411111111115;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 11:
                                    bg11VarSingletonList = b380.t(qch0Var6.a(str16));
                                    str5 = "application/vobsub";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z118 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111119 = (z118 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i4111111111110 = i12;
                                            int i4111111111111 = i13;
                                            int i4111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar117 = new x8h(i4111111111110, i4111111111111, i4111111111112, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411111111119;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z119 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111113 = (z119 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i4111111111114 = i12;
                                        int i4111111111115 = i13;
                                        int i4111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar118 = new x8h(i4111111111114, i4111111111115, i4111111111116, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i4111111111113;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 12:
                                    str15 = "video/webm";
                                    str17 = "audio/vnd.dts.hd";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z1110 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111117 = (z1110 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i4111111111118 = i12;
                                            int i4111111111119 = i13;
                                            int i41111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar119 = new x8h(i4111111111118, i4111111111119, i41111111111110, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i4111111111117;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111 = (z1111 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i41111111111112 = i12;
                                        int i41111111111113 = i13;
                                        int i41111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar1110 = new x8h(i41111111111112, i41111111111113, i41111111111114, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar1110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i41111111111111;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 13:
                                    bg11 bg11VarSingletonList2 = Collections.singletonList(qch0Var6.a(str16));
                                    byte[] bArr8 = qch0Var6.m;
                                    v vVarV = c8o.v(new bae(bArr8, bArr8.length), false);
                                    qch0Var6.T = vVarV.a;
                                    qch0Var6.Q = vVarV.b;
                                    bg11VarSingletonList = bg11VarSingletonList2;
                                    str7 = vVarV.c;
                                    str5 = "audio/mp4a-latm";
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z1112 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111115 = (z1112 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i41111111111116 = i12;
                                            int i41111111111117 = i13;
                                            int i41111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar1111 = new x8h(i41111111111116, i41111111111117, i41111111111118, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar1111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111111111115;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1113 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111119 = (z1113 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i411111111111110 = i12;
                                        int i411111111111111 = i13;
                                        int i411111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar1112 = new x8h(i411111111111110, i411111111111111, i411111111111112, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar1112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i41111111111119;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 14:
                                    str15 = "video/webm";
                                    str17 = "audio/ac3";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z1114 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111113 = (z1114 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111114 = i12;
                                            int i411111111111115 = i13;
                                            int i411111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar1113 = new x8h(i411111111111114, i411111111111115, i411111111111116, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar1113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411111111111113;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1115 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111117 = (z1115 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i411111111111118 = i12;
                                        int i411111111111119 = i13;
                                        int i4111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar1114 = new x8h(i411111111111118, i411111111111119, i4111111111111110, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar1114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411111111111117;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 15:
                                    str15 = "video/webm";
                                    qch0Var6.X = true;
                                    str17 = "audio/vnd.dts";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z1116 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111 = (z1116 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i4111111111111112 = i12;
                                            int i4111111111111113 = i13;
                                            int i4111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar1115 = new x8h(i4111111111111112, i4111111111111113, i4111111111111114, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar1115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i4111111111111111;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1117 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111115 = (z1117 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i4111111111111116 = i12;
                                        int i4111111111111117 = i13;
                                        int i4111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar1116 = new x8h(i4111111111111116, i4111111111111117, i4111111111111118, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar1116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i4111111111111115;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 16:
                                    str15 = "video/webm";
                                    byte[] bArr9 = qch0Var6.m;
                                    str17 = "video/av01";
                                    if (bArr9 != null) {
                                        bg11VarT = b380.t(bArr9);
                                        j89 j89VarB = j89.b(qch0Var6.m);
                                        if (j89VarB != null) {
                                            int i64 = j89VarB.b;
                                            i8 = j89VarB.d;
                                            int i65 = j89VarB.c;
                                            i6 = j89VarB.a;
                                            bg11VarSingletonList = bg11VarT;
                                            str5 = "video/av01";
                                            i13 = i65;
                                            i14 = i6;
                                            str7 = j89VarB.e;
                                            i12 = i64;
                                            i5 = -1;
                                            i4 = -1;
                                            if (qch0Var6.P != null) {
                                                i15 = i5;
                                                xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                                if (xr6VarB != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = xr6VarB.a;
                                                }
                                                boolean z1118 = qch0Var6.b0;
                                                if (qch0Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111111111111119 = (z1118 ? 1 : 0) | i16;
                                                ge30Var = new ge30();
                                                if (asj0.k(str10)) {
                                                    ge30Var.I = qch0Var6.Q;
                                                    ge30Var.J = qch0Var6.S;
                                                    ge30Var.K = qch0Var6.T;
                                                    ge30Var.L = i4;
                                                } else if (asj0.o(str10)) {
                                                    if (qch0Var6.t == 0) {
                                                        i24 = qch0Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = qch0Var6.o;
                                                        }
                                                        qch0Var6.r = i24;
                                                        i25 = qch0Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = qch0Var6.f119p;
                                                        }
                                                        qch0Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = qch0Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        } else {
                                                            i12 = qch0Var6.A;
                                                            i8 = qch0Var6.B;
                                                            i13 = qch0Var6.C;
                                                        }
                                                    }
                                                    int i41111111111111110 = i12;
                                                    int i41111111111111111 = i13;
                                                    int i41111111111111112 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = qch0Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (qch0Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    x8h x8hVar1117 = new x8h(i41111111111111110, i41111111111111111, i41111111111111112, bArr, i19, i21);
                                                    str11 = qch0Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (qch0Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    ge30Var.v = qch0Var6.o;
                                                    ge30Var.w = qch0Var6.f119p;
                                                    ge30Var.D = f;
                                                    ge30Var.B = i22;
                                                    ge30Var.E = qch0Var6.y;
                                                    ge30Var.F = qch0Var6.z;
                                                    ge30Var.G = x8hVar1117;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                                }
                                                str12 = qch0Var6.b;
                                                if (str12 != null) {
                                                    ge30Var.b = qch0Var6.b;
                                                }
                                                ge30Var.a = Integer.toString(i44);
                                                if (qch0Var6.a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                ge30Var.n = asj0.p(str13);
                                                ge30Var.o = asj0.p(str10);
                                                ge30Var.f52p = i15;
                                                ge30Var.d = qch0Var6.c0;
                                                ge30Var.e = i4111111111111119;
                                                ge30Var.r = bg11VarSingletonList;
                                                ge30Var.k = str7;
                                                ge30Var.s = qch0Var6.n;
                                                qch0Var6.e0 = new ie30(ge30Var);
                                                rch0Var = rch0Var;
                                                qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                                sparseArray2.put(qch0Var6.d, qch0Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z1119 = qch0Var6.b0;
                                            if (qch0Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111113 = (z1119 ? 1 : 0) | i16;
                                            ge30Var = new ge30();
                                            if (asj0.k(str10)) {
                                                ge30Var.I = qch0Var6.Q;
                                                ge30Var.J = qch0Var6.S;
                                                ge30Var.K = qch0Var6.T;
                                                ge30Var.L = i4;
                                            } else if (asj0.o(str10)) {
                                                if (qch0Var6.t == 0) {
                                                    i24 = qch0Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = qch0Var6.o;
                                                    }
                                                    qch0Var6.r = i24;
                                                    i25 = qch0Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = qch0Var6.f119p;
                                                    }
                                                    qch0Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = qch0Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    } else {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    }
                                                }
                                                int i41111111111111114 = i12;
                                                int i41111111111111115 = i13;
                                                int i41111111111111116 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = qch0Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (qch0Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                x8h x8hVar1118 = new x8h(i41111111111111114, i41111111111111115, i41111111111111116, bArr, i19, i21);
                                                str11 = qch0Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (qch0Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                ge30Var.v = qch0Var6.o;
                                                ge30Var.w = qch0Var6.f119p;
                                                ge30Var.D = f;
                                                ge30Var.B = i22;
                                                ge30Var.E = qch0Var6.y;
                                                ge30Var.F = qch0Var6.z;
                                                ge30Var.G = x8hVar1118;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                            }
                                            str12 = qch0Var6.b;
                                            if (str12 != null) {
                                                ge30Var.b = qch0Var6.b;
                                            }
                                            ge30Var.a = Integer.toString(i44);
                                            if (qch0Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            ge30Var.n = asj0.p(str13);
                                            ge30Var.o = asj0.p(str10);
                                            ge30Var.f52p = i15;
                                            ge30Var.d = qch0Var6.c0;
                                            ge30Var.e = i41111111111111113;
                                            ge30Var.r = bg11VarSingletonList;
                                            ge30Var.k = str7;
                                            ge30Var.s = qch0Var6.n;
                                            qch0Var6.e0 = new ie30(ge30Var);
                                            rch0Var = rch0Var;
                                            qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                            sparseArray2.put(qch0Var6.d, qch0Var6);
                                        }
                                        bg11VarSingletonList = bg11VarT;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        if (qch0Var6.P != null) {
                                            i15 = i5;
                                            xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                            if (xr6VarB != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = xr6VarB.a;
                                            }
                                            boolean z11110 = qch0Var6.b0;
                                            if (qch0Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111117 = (z11110 ? 1 : 0) | i16;
                                            ge30Var = new ge30();
                                            if (asj0.k(str10)) {
                                                ge30Var.I = qch0Var6.Q;
                                                ge30Var.J = qch0Var6.S;
                                                ge30Var.K = qch0Var6.T;
                                                ge30Var.L = i4;
                                            } else if (asj0.o(str10)) {
                                                if (qch0Var6.t == 0) {
                                                    i24 = qch0Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = qch0Var6.o;
                                                    }
                                                    qch0Var6.r = i24;
                                                    i25 = qch0Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = qch0Var6.f119p;
                                                    }
                                                    qch0Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = qch0Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    } else {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    }
                                                }
                                                int i41111111111111118 = i12;
                                                int i41111111111111119 = i13;
                                                int i411111111111111110 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = qch0Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (qch0Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                x8h x8hVar1119 = new x8h(i41111111111111118, i41111111111111119, i411111111111111110, bArr, i19, i21);
                                                str11 = qch0Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (qch0Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                ge30Var.v = qch0Var6.o;
                                                ge30Var.w = qch0Var6.f119p;
                                                ge30Var.D = f;
                                                ge30Var.B = i22;
                                                ge30Var.E = qch0Var6.y;
                                                ge30Var.F = qch0Var6.z;
                                                ge30Var.G = x8hVar1119;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                            }
                                            str12 = qch0Var6.b;
                                            if (str12 != null) {
                                                ge30Var.b = qch0Var6.b;
                                            }
                                            ge30Var.a = Integer.toString(i44);
                                            if (qch0Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            ge30Var.n = asj0.p(str13);
                                            ge30Var.o = asj0.p(str10);
                                            ge30Var.f52p = i15;
                                            ge30Var.d = qch0Var6.c0;
                                            ge30Var.e = i41111111111111117;
                                            ge30Var.r = bg11VarSingletonList;
                                            ge30Var.k = str7;
                                            ge30Var.s = qch0Var6.n;
                                            qch0Var6.e0 = new ie30(ge30Var);
                                            rch0Var = rch0Var;
                                            qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                            sparseArray2.put(qch0Var6.d, qch0Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z11111 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111 = (z11111 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111111112 = i12;
                                            int i411111111111111113 = i13;
                                            int i411111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11110 = new x8h(i411111111111111112, i411111111111111113, i411111111111111114, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11110;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411111111111111111;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    }
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z11112 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111115 = (z11112 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111111116 = i12;
                                            int i411111111111111117 = i13;
                                            int i411111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11111 = new x8h(i411111111111111116, i411111111111111117, i411111111111111118, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411111111111111115;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11113 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111119 = (z11113 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i4111111111111111110 = i12;
                                        int i4111111111111111111 = i13;
                                        int i4111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar11112 = new x8h(i4111111111111111110, i4111111111111111111, i4111111111111111112, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar11112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411111111111111119;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 17:
                                    str15 = "video/webm";
                                    str17 = "video/x-vnd.on2.vp8";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z11114 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111113 = (z11114 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i4111111111111111114 = i12;
                                            int i4111111111111111115 = i13;
                                            int i4111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11113 = new x8h(i4111111111111111114, i4111111111111111115, i4111111111111111116, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i4111111111111111113;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11115 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111117 = (z11115 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i4111111111111111118 = i12;
                                        int i4111111111111111119 = i13;
                                        int i41111111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar11114 = new x8h(i4111111111111111118, i4111111111111111119, i41111111111111111110, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar11114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i4111111111111111117;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 18:
                                    str15 = "video/webm";
                                    byte[] bArr10 = qch0Var6.m;
                                    bg11VarT = bArr10 == null ? null : b380.t(bArr10);
                                    str17 = "video/x-vnd.on2.vp9";
                                    bg11VarSingletonList = bg11VarT;
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z11116 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111 = (z11116 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i41111111111111111112 = i12;
                                            int i41111111111111111113 = i13;
                                            int i41111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11115 = new x8h(i41111111111111111112, i41111111111111111113, i41111111111111111114, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111111111111111111;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11117 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111115 = (z11117 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i41111111111111111116 = i12;
                                        int i41111111111111111117 = i13;
                                        int i41111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar11116 = new x8h(i41111111111111111116, i41111111111111111117, i41111111111111111118, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar11116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i41111111111111111115;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 19:
                                    str5 = "application/pgs";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z11118 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111119 = (z11118 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111111111110 = i12;
                                            int i411111111111111111111 = i13;
                                            int i411111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11117 = new x8h(i411111111111111111110, i411111111111111111111, i411111111111111111112, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111111111111111119;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11119 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111113 = (z11119 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i411111111111111111114 = i12;
                                        int i411111111111111111115 = i13;
                                        int i411111111111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar11118 = new x8h(i411111111111111111114, i411111111111111111115, i411111111111111111116, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar11118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411111111111111111113;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 20:
                                    str15 = "video/webm";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z111110 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111117 = (z111110 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111111111118 = i12;
                                            int i411111111111111111119 = i13;
                                            int i4111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11119 = new x8h(i411111111111111111118, i411111111111111111119, i4111111111111111111110, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411111111111111111117;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111111 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111 = (z111111 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i4111111111111111111112 = i12;
                                        int i4111111111111111111113 = i13;
                                        int i4111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar111110 = new x8h(i4111111111111111111112, i4111111111111111111113, i4111111111111111111114, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i4111111111111111111111;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 21:
                                    str15 = "video/webm";
                                    str17 = "audio/vnd.dts.hd;profile=lbr";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z111112 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111115 = (z111112 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i4111111111111111111116 = i12;
                                            int i4111111111111111111117 = i13;
                                            int i4111111111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar111111 = new x8h(i4111111111111111111116, i4111111111111111111117, i4111111111111111111118, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar111111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i4111111111111111111115;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111113 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111119 = (z111113 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i41111111111111111111110 = i12;
                                        int i41111111111111111111111 = i13;
                                        int i41111111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar111112 = new x8h(i41111111111111111111110, i41111111111111111111111, i41111111111111111111112, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar111112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i4111111111111111111119;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 22:
                                    str15 = "video/webm";
                                    int i66 = qch0Var6.R;
                                    String str19 = zoi1.a;
                                    iG = zoi1.G(i66, ByteOrder.LITTLE_ENDIAN);
                                    if (iG == 0) {
                                        oon1.H("Unsupported floating point PCM bit depth: " + qch0Var6.R + ". Setting mimeType to audio/x-unknown");
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = "audio/x-unknown";
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        bg11VarSingletonList = null;
                                        if (qch0Var6.P != null) {
                                            i15 = i5;
                                            xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                            if (xr6VarB != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = xr6VarB.a;
                                            }
                                            boolean z111114 = qch0Var6.b0;
                                            if (qch0Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111111111113 = (z111114 ? 1 : 0) | i16;
                                            ge30Var = new ge30();
                                            if (asj0.k(str10)) {
                                                ge30Var.I = qch0Var6.Q;
                                                ge30Var.J = qch0Var6.S;
                                                ge30Var.K = qch0Var6.T;
                                                ge30Var.L = i4;
                                            } else if (asj0.o(str10)) {
                                                if (qch0Var6.t == 0) {
                                                    i24 = qch0Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = qch0Var6.o;
                                                    }
                                                    qch0Var6.r = i24;
                                                    i25 = qch0Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = qch0Var6.f119p;
                                                    }
                                                    qch0Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = qch0Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    } else {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    }
                                                }
                                                int i41111111111111111111114 = i12;
                                                int i41111111111111111111115 = i13;
                                                int i41111111111111111111116 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = qch0Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (qch0Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                x8h x8hVar111113 = new x8h(i41111111111111111111114, i41111111111111111111115, i41111111111111111111116, bArr, i19, i21);
                                                str11 = qch0Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (qch0Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                ge30Var.v = qch0Var6.o;
                                                ge30Var.w = qch0Var6.f119p;
                                                ge30Var.D = f;
                                                ge30Var.B = i22;
                                                ge30Var.E = qch0Var6.y;
                                                ge30Var.F = qch0Var6.z;
                                                ge30Var.G = x8hVar111113;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                            }
                                            str12 = qch0Var6.b;
                                            if (str12 != null) {
                                                ge30Var.b = qch0Var6.b;
                                            }
                                            ge30Var.a = Integer.toString(i44);
                                            if (qch0Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            ge30Var.n = asj0.p(str13);
                                            ge30Var.o = asj0.p(str10);
                                            ge30Var.f52p = i15;
                                            ge30Var.d = qch0Var6.c0;
                                            ge30Var.e = i41111111111111111111113;
                                            ge30Var.r = bg11VarSingletonList;
                                            ge30Var.k = str7;
                                            ge30Var.s = qch0Var6.n;
                                            qch0Var6.e0 = new ie30(ge30Var);
                                            rch0Var = rch0Var;
                                            qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                            sparseArray2.put(qch0Var6.d, qch0Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z111115 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111117 = (z111115 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i41111111111111111111118 = i12;
                                            int i41111111111111111111119 = i13;
                                            int i411111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar111114 = new x8h(i41111111111111111111118, i41111111111111111111119, i411111111111111111111110, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar111114;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111111111111111111117;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    }
                                    i4 = iG;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "audio/raw";
                                    i6 = -1;
                                    i5 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z111116 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111 = (z111116 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111111111111112 = i12;
                                            int i411111111111111111111113 = i13;
                                            int i411111111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar111115 = new x8h(i411111111111111111111112, i411111111111111111111113, i411111111111111111111114, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar111115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411111111111111111111111;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111117 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111115 = (z111117 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i411111111111111111111116 = i12;
                                        int i411111111111111111111117 = i13;
                                        int i411111111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar111116 = new x8h(i411111111111111111111116, i411111111111111111111117, i411111111111111111111118, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar111116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411111111111111111111115;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 23:
                                    str15 = "video/webm";
                                    iG = zoi1.I(qch0Var6.R, ByteOrder.BIG_ENDIAN);
                                    if (iG == 0) {
                                        oon1.H("Unsupported big endian PCM bit depth: " + qch0Var6.R + ". Setting mimeType to audio/x-unknown");
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = "audio/x-unknown";
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        bg11VarSingletonList = null;
                                        if (qch0Var6.P != null) {
                                            i15 = i5;
                                            xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                            if (xr6VarB != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = xr6VarB.a;
                                            }
                                            boolean z111118 = qch0Var6.b0;
                                            if (qch0Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i411111111111111111111119 = (z111118 ? 1 : 0) | i16;
                                            ge30Var = new ge30();
                                            if (asj0.k(str10)) {
                                                ge30Var.I = qch0Var6.Q;
                                                ge30Var.J = qch0Var6.S;
                                                ge30Var.K = qch0Var6.T;
                                                ge30Var.L = i4;
                                            } else if (asj0.o(str10)) {
                                                if (qch0Var6.t == 0) {
                                                    i24 = qch0Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = qch0Var6.o;
                                                    }
                                                    qch0Var6.r = i24;
                                                    i25 = qch0Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = qch0Var6.f119p;
                                                    }
                                                    qch0Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = qch0Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    } else {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    }
                                                }
                                                int i4111111111111111111111110 = i12;
                                                int i4111111111111111111111111 = i13;
                                                int i4111111111111111111111112 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = qch0Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (qch0Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                x8h x8hVar111117 = new x8h(i4111111111111111111111110, i4111111111111111111111111, i4111111111111111111111112, bArr, i19, i21);
                                                str11 = qch0Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (qch0Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                ge30Var.v = qch0Var6.o;
                                                ge30Var.w = qch0Var6.f119p;
                                                ge30Var.D = f;
                                                ge30Var.B = i22;
                                                ge30Var.E = qch0Var6.y;
                                                ge30Var.F = qch0Var6.z;
                                                ge30Var.G = x8hVar111117;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                            }
                                            str12 = qch0Var6.b;
                                            if (str12 != null) {
                                                ge30Var.b = qch0Var6.b;
                                            }
                                            ge30Var.a = Integer.toString(i44);
                                            if (qch0Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            ge30Var.n = asj0.p(str13);
                                            ge30Var.o = asj0.p(str10);
                                            ge30Var.f52p = i15;
                                            ge30Var.d = qch0Var6.c0;
                                            ge30Var.e = i411111111111111111111119;
                                            ge30Var.r = bg11VarSingletonList;
                                            ge30Var.k = str7;
                                            ge30Var.s = qch0Var6.n;
                                            qch0Var6.e0 = new ie30(ge30Var);
                                            rch0Var = rch0Var;
                                            qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                            sparseArray2.put(qch0Var6.d, qch0Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z111119 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111113 = (z111119 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111114 = i12;
                                            int i4111111111111111111111115 = i13;
                                            int i4111111111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar111118 = new x8h(i4111111111111111111111114, i4111111111111111111111115, i4111111111111111111111116, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar111118;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i4111111111111111111111113;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    }
                                    i4 = iG;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "audio/raw";
                                    i6 = -1;
                                    i5 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z1111110 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111117 = (z1111110 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111118 = i12;
                                            int i4111111111111111111111119 = i13;
                                            int i41111111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar111119 = new x8h(i4111111111111111111111118, i4111111111111111111111119, i41111111111111111111111110, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar111119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i4111111111111111111111117;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111111 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111111111111 = (z1111111 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111112 = i12;
                                        int i41111111111111111111111113 = i13;
                                        int i41111111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar1111110 = new x8h(i41111111111111111111111112, i41111111111111111111111113, i41111111111111111111111114, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar1111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i41111111111111111111111111;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 24:
                                    str15 = "video/webm";
                                    int i67 = qch0Var6.R;
                                    String str20 = zoi1.a;
                                    iG = zoi1.I(i67, ByteOrder.LITTLE_ENDIAN);
                                    if (iG == 0) {
                                        oon1.H("Unsupported little endian PCM bit depth: " + qch0Var6.R + ". Setting mimeType to audio/x-unknown");
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = "audio/x-unknown";
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        bg11VarSingletonList = null;
                                        if (qch0Var6.P != null) {
                                            i15 = i5;
                                            xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                            if (xr6VarB != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = xr6VarB.a;
                                            }
                                            boolean z1111112 = qch0Var6.b0;
                                            if (qch0Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111111111111115 = (z1111112 ? 1 : 0) | i16;
                                            ge30Var = new ge30();
                                            if (asj0.k(str10)) {
                                                ge30Var.I = qch0Var6.Q;
                                                ge30Var.J = qch0Var6.S;
                                                ge30Var.K = qch0Var6.T;
                                                ge30Var.L = i4;
                                            } else if (asj0.o(str10)) {
                                                if (qch0Var6.t == 0) {
                                                    i24 = qch0Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = qch0Var6.o;
                                                    }
                                                    qch0Var6.r = i24;
                                                    i25 = qch0Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = qch0Var6.f119p;
                                                    }
                                                    qch0Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = qch0Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    } else {
                                                        i12 = qch0Var6.A;
                                                        i8 = qch0Var6.B;
                                                        i13 = qch0Var6.C;
                                                    }
                                                }
                                                int i41111111111111111111111116 = i12;
                                                int i41111111111111111111111117 = i13;
                                                int i41111111111111111111111118 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = qch0Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (qch0Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                x8h x8hVar1111111 = new x8h(i41111111111111111111111116, i41111111111111111111111117, i41111111111111111111111118, bArr, i19, i21);
                                                str11 = qch0Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (qch0Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                ge30Var.v = qch0Var6.o;
                                                ge30Var.w = qch0Var6.f119p;
                                                ge30Var.D = f;
                                                ge30Var.B = i22;
                                                ge30Var.E = qch0Var6.y;
                                                ge30Var.F = qch0Var6.z;
                                                ge30Var.G = x8hVar1111111;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                            }
                                            str12 = qch0Var6.b;
                                            if (str12 != null) {
                                                ge30Var.b = qch0Var6.b;
                                            }
                                            ge30Var.a = Integer.toString(i44);
                                            if (qch0Var6.a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            ge30Var.n = asj0.p(str13);
                                            ge30Var.o = asj0.p(str10);
                                            ge30Var.f52p = i15;
                                            ge30Var.d = qch0Var6.c0;
                                            ge30Var.e = i41111111111111111111111115;
                                            ge30Var.r = bg11VarSingletonList;
                                            ge30Var.k = str7;
                                            ge30Var.s = qch0Var6.n;
                                            qch0Var6.e0 = new ie30(ge30Var);
                                            rch0Var = rch0Var;
                                            qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                            sparseArray2.put(qch0Var6.d, qch0Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z1111113 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111119 = (z1111113 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111110 = i12;
                                            int i411111111111111111111111111 = i13;
                                            int i411111111111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar1111112 = new x8h(i411111111111111111111111110, i411111111111111111111111111, i411111111111111111111111112, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar1111112;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111111111111111111111119;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    }
                                    i4 = iG;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "audio/raw";
                                    i6 = -1;
                                    i5 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z1111114 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111113 = (z1111114 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111114 = i12;
                                            int i411111111111111111111111115 = i13;
                                            int i411111111111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar1111113 = new x8h(i411111111111111111111111114, i411111111111111111111111115, i411111111111111111111111116, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar1111113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411111111111111111111111113;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111115 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111117 = (z1111115 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i411111111111111111111111118 = i12;
                                        int i411111111111111111111111119 = i13;
                                        int i4111111111111111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar1111114 = new x8h(i411111111111111111111111118, i411111111111111111111111119, i4111111111111111111111111110, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar1111114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411111111111111111111111117;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 25:
                                case 26:
                                    str15 = "video/webm";
                                    rch0Var = rch0Var;
                                    bg11VarSingletonList = b380.u(rch0.r0, qch0Var6.a(str16));
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "text/x-ssa";
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z1111116 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111111 = (z1111116 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111111112 = i12;
                                            int i4111111111111111111111111113 = i13;
                                            int i4111111111111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar1111115 = new x8h(i4111111111111111111111111112, i4111111111111111111111111113, i4111111111111111111111111114, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar1111115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i4111111111111111111111111111;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111117 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111115 = (z1111117 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111116 = i12;
                                        int i4111111111111111111111111117 = i13;
                                        int i4111111111111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar1111116 = new x8h(i4111111111111111111111111116, i4111111111111111111111111117, i4111111111111111111111111118, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar1111116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i4111111111111111111111111115;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                    y760 y760VarA = y760.a(new izr0(qch0Var6.a(qch0Var6.c)), false, null);
                                    bg11 bg11Var3 = y760VarA.a;
                                    qch0Var6.f0 = y760VarA.b;
                                    str8 = y760VarA.n;
                                    i7 = y760VarA.h;
                                    i8 = y760VarA.j;
                                    bg11Var = bg11Var3;
                                    i9 = y760VarA.i;
                                    i10 = y760VarA.f;
                                    i11 = y760VarA.g;
                                    str9 = "video/hevc";
                                    i13 = i9;
                                    str5 = str9;
                                    i12 = i7;
                                    bg11VarSingletonList = bg11Var;
                                    i14 = i11;
                                    i6 = i10;
                                    str7 = str8;
                                    i5 = -1;
                                    i4 = -1;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z1111118 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111119 = (z1111118 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i41111111111111111111111111110 = i12;
                                            int i41111111111111111111111111111 = i13;
                                            int i41111111111111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar1111117 = new x8h(i41111111111111111111111111110, i41111111111111111111111111111, i41111111111111111111111111112, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar1111117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i4111111111111111111111111119;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111119 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111111111111113 = (z1111119 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111111114 = i12;
                                        int i41111111111111111111111111115 = i13;
                                        int i41111111111111111111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar1111118 = new x8h(i41111111111111111111111111114, i41111111111111111111111111115, i41111111111111111111111111116, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar1111118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i41111111111111111111111111113;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                    str15 = "video/webm";
                                    rch0Var = rch0Var;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "text/vtt";
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z11111110 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111111117 = (z11111110 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i41111111111111111111111111118 = i12;
                                            int i41111111111111111111111111119 = i13;
                                            int i411111111111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar1111119 = new x8h(i41111111111111111111111111118, i41111111111111111111111111119, i411111111111111111111111111110, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar1111119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111111111111111111111111117;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111111 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111111111 = (z11111111 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i411111111111111111111111111112 = i12;
                                        int i411111111111111111111111111113 = i13;
                                        int i411111111111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar11111110 = new x8h(i411111111111111111111111111112, i411111111111111111111111111113, i411111111111111111111111111114, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar11111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411111111111111111111111111111;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                    str5 = "application/x-subrip";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z11111112 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111111115 = (z11111112 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111111116 = i12;
                                            int i411111111111111111111111111117 = i13;
                                            int i411111111111111111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11111111 = new x8h(i411111111111111111111111111116, i411111111111111111111111111117, i411111111111111111111111111118, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11111111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411111111111111111111111111115;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111113 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111111119 = (z11111113 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111111110 = i12;
                                        int i4111111111111111111111111111111 = i13;
                                        int i4111111111111111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar11111112 = new x8h(i4111111111111111111111111111110, i4111111111111111111111111111111, i4111111111111111111111111111112, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar11111112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411111111111111111111111111119;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case RendererMetrics.SAMPLES /* 30 */:
                                    str15 = "video/webm";
                                    str17 = "video/mpeg2";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z11111114 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111111113 = (z11111114 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111111111114 = i12;
                                            int i4111111111111111111111111111115 = i13;
                                            int i4111111111111111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11111113 = new x8h(i4111111111111111111111111111114, i4111111111111111111111111111115, i4111111111111111111111111111116, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11111113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i4111111111111111111111111111113;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111115 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111111117 = (z11111115 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111111118 = i12;
                                        int i4111111111111111111111111111119 = i13;
                                        int i41111111111111111111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar11111114 = new x8h(i4111111111111111111111111111118, i4111111111111111111111111111119, i41111111111111111111111111111110, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar11111114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i4111111111111111111111111111117;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 31:
                                    str15 = "video/webm";
                                    bg11VarT = Collections.singletonList(qch0Var6.a(str16));
                                    int i68 = qch0Var6.R;
                                    String str21 = zoi1.a;
                                    I = zoi1.I(i68, ByteOrder.LITTLE_ENDIAN);
                                    str17 = "audio/alac";
                                    if (I == 0) {
                                        bg11VarSingletonList = bg11VarT;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                    } else {
                                        rch0Var = rch0Var;
                                        bg11VarSingletonList = bg11VarT;
                                        i4 = I;
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                    }
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z11111116 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111111111111 = (z11111116 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i41111111111111111111111111111112 = i12;
                                            int i41111111111111111111111111111113 = i13;
                                            int i41111111111111111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11111115 = new x8h(i41111111111111111111111111111112, i41111111111111111111111111111113, i41111111111111111111111111111114, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11111115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111111111111111111111111111111;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111117 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111111111111111115 = (z11111117 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111111111116 = i12;
                                        int i41111111111111111111111111111117 = i13;
                                        int i41111111111111111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar11111116 = new x8h(i41111111111111111111111111111116, i41111111111111111111111111111117, i41111111111111111111111111111118, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar11111116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i41111111111111111111111111111115;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case 32:
                                    str15 = "video/webm";
                                    str17 = "audio/eac3";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    bg11VarSingletonList = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z11111118 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111111111119 = (z11111118 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111111111110 = i12;
                                            int i411111111111111111111111111111111 = i13;
                                            int i411111111111111111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11111117 = new x8h(i411111111111111111111111111111110, i411111111111111111111111111111111, i411111111111111111111111111111112, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11111117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i41111111111111111111111111111119;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111119 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111111111113 = (z11111119 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i411111111111111111111111111111114 = i12;
                                        int i411111111111111111111111111111115 = i13;
                                        int i411111111111111111111111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar11111118 = new x8h(i411111111111111111111111111111114, i411111111111111111111111111111115, i411111111111111111111111111111116, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar11111118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i411111111111111111111111111111113;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                    str15 = "video/webm";
                                    bg11VarT = Collections.singletonList(qch0Var6.a(str16));
                                    int i69 = qch0Var6.R;
                                    String str22 = zoi1.a;
                                    I = zoi1.I(i69, ByteOrder.LITTLE_ENDIAN);
                                    str17 = "audio/flac";
                                    if (I == 0) {
                                        bg11VarSingletonList = bg11VarT;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                    } else {
                                        rch0Var = rch0Var;
                                        bg11VarSingletonList = bg11VarT;
                                        i4 = I;
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                    }
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z111111110 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111111111117 = (z111111110 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111111111118 = i12;
                                            int i411111111111111111111111111111119 = i13;
                                            int i4111111111111111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar11111119 = new x8h(i411111111111111111111111111111118, i411111111111111111111111111111119, i4111111111111111111111111111111110, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar11111119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i411111111111111111111111111111117;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111111111 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111111111111 = (z111111111 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111111111112 = i12;
                                        int i4111111111111111111111111111111113 = i13;
                                        int i4111111111111111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar111111110 = new x8h(i4111111111111111111111111111111112, i4111111111111111111111111111111113, i4111111111111111111111111111111114, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar111111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i4111111111111111111111111111111111;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                    bg11 arrayList3 = new ArrayList(3);
                                    arrayList3.add(qch0Var6.a(qch0Var6.c));
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                    arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(qch0Var6.U).array());
                                    arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(qch0Var6.V).array());
                                    str3 = "audio/opus";
                                    i5 = 5760;
                                    bg11VarSingletonList = arrayList3;
                                    str5 = str3;
                                    i6 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (qch0Var6.P != null) {
                                        i15 = i5;
                                        xr6VarB = xr6.b(new izr0(qch0Var6.P));
                                        if (xr6VarB != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = xr6VarB.a;
                                        }
                                        boolean z111111112 = qch0Var6.b0;
                                        if (qch0Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111111111115 = (z111111112 ? 1 : 0) | i16;
                                        ge30Var = new ge30();
                                        if (asj0.k(str10)) {
                                            ge30Var.I = qch0Var6.Q;
                                            ge30Var.J = qch0Var6.S;
                                            ge30Var.K = qch0Var6.T;
                                            ge30Var.L = i4;
                                        } else if (asj0.o(str10)) {
                                            if (qch0Var6.t == 0) {
                                                i24 = qch0Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = qch0Var6.o;
                                                }
                                                qch0Var6.r = i24;
                                                i25 = qch0Var6.s;
                                                if (i25 == -1) {
                                                    i25 = qch0Var6.f119p;
                                                }
                                                qch0Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = qch0Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                } else {
                                                    i12 = qch0Var6.A;
                                                    i8 = qch0Var6.B;
                                                    i13 = qch0Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111111111111116 = i12;
                                            int i4111111111111111111111111111111117 = i13;
                                            int i4111111111111111111111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = qch0Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (qch0Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            x8h x8hVar111111111 = new x8h(i4111111111111111111111111111111116, i4111111111111111111111111111111117, i4111111111111111111111111111111118, bArr, i19, i21);
                                            str11 = qch0Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (qch0Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            ge30Var.v = qch0Var6.o;
                                            ge30Var.w = qch0Var6.f119p;
                                            ge30Var.D = f;
                                            ge30Var.B = i22;
                                            ge30Var.E = qch0Var6.y;
                                            ge30Var.F = qch0Var6.z;
                                            ge30Var.G = x8hVar111111111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                        }
                                        str12 = qch0Var6.b;
                                        if (str12 != null) {
                                            ge30Var.b = qch0Var6.b;
                                        }
                                        ge30Var.a = Integer.toString(i44);
                                        if (qch0Var6.a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        ge30Var.n = asj0.p(str13);
                                        ge30Var.o = asj0.p(str10);
                                        ge30Var.f52p = i15;
                                        ge30Var.d = qch0Var6.c0;
                                        ge30Var.e = i4111111111111111111111111111111115;
                                        ge30Var.r = bg11VarSingletonList;
                                        ge30Var.k = str7;
                                        ge30Var.s = qch0Var6.n;
                                        qch0Var6.e0 = new ie30(ge30Var);
                                        rch0Var = rch0Var;
                                        qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                        sparseArray2.put(qch0Var6.d, qch0Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111111113 = qch0Var6.b0;
                                    if (qch0Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111111111119 = (z111111113 ? 1 : 0) | i16;
                                    ge30Var = new ge30();
                                    if (asj0.k(str10)) {
                                        ge30Var.I = qch0Var6.Q;
                                        ge30Var.J = qch0Var6.S;
                                        ge30Var.K = qch0Var6.T;
                                        ge30Var.L = i4;
                                    } else if (asj0.o(str10)) {
                                        if (qch0Var6.t == 0) {
                                            i24 = qch0Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = qch0Var6.o;
                                            }
                                            qch0Var6.r = i24;
                                            i25 = qch0Var6.s;
                                            if (i25 == -1) {
                                                i25 = qch0Var6.f119p;
                                            }
                                            qch0Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = qch0Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            } else {
                                                i12 = qch0Var6.A;
                                                i8 = qch0Var6.B;
                                                i13 = qch0Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111111111111110 = i12;
                                        int i41111111111111111111111111111111111 = i13;
                                        int i41111111111111111111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = qch0Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (qch0Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        x8h x8hVar111111112 = new x8h(i41111111111111111111111111111111110, i41111111111111111111111111111111111, i41111111111111111111111111111111112, bArr, i19, i21);
                                        str11 = qch0Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (qch0Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        ge30Var.v = qch0Var6.o;
                                        ge30Var.w = qch0Var6.f119p;
                                        ge30Var.D = f;
                                        ge30Var.B = i22;
                                        ge30Var.E = qch0Var6.y;
                                        ge30Var.F = qch0Var6.z;
                                        ge30Var.G = x8hVar111111112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw ParserException.a((RuntimeException) null, "Unexpected MIME type.");
                                    }
                                    str12 = qch0Var6.b;
                                    if (str12 != null) {
                                        ge30Var.b = qch0Var6.b;
                                    }
                                    ge30Var.a = Integer.toString(i44);
                                    if (qch0Var6.a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    ge30Var.n = asj0.p(str13);
                                    ge30Var.o = asj0.p(str10);
                                    ge30Var.f52p = i15;
                                    ge30Var.d = qch0Var6.c0;
                                    ge30Var.e = i4111111111111111111111111111111119;
                                    ge30Var.r = bg11VarSingletonList;
                                    ge30Var.k = str7;
                                    ge30Var.s = qch0Var6.n;
                                    qch0Var6.e0 = new ie30(ge30Var);
                                    rch0Var = rch0Var;
                                    qch0Var6.d0 = rch0Var.p0.w(qch0Var6.d, qch0Var6.f);
                                    sparseArray2.put(qch0Var6.d, qch0Var6);
                                    break;
                                default:
                                    throw ParserException.a((RuntimeException) null, "Unrecognized codec identifier.");
                            }
                            break;
                    }
                    rch0Var.A = null;
                    return true;
                }
            } else {
                i = 8;
            }
            boolean z20 = true;
            byte b = this.e;
            iti1 iti1Var = this.c;
            if (b == 0) {
                int i70 = 4;
                int i71 = 0;
                long jB = iti1Var.b(fc10Var, true, false, 4);
                if (jB == -2) {
                    fc10Var.f();
                    while (true) {
                        byte[] bArr11 = this.a;
                        fc10Var.h(i71, bArr11, i70);
                        byte b2 = bArr11[i71];
                        int i72 = i;
                        int i73 = 0;
                        while (true) {
                            if (i73 >= i72) {
                                i3 = -1;
                            } else if ((iti1.d[i73] & ((long) b2)) != 0) {
                                i3 = i73 + 1;
                            } else {
                                i73++;
                                i72 = 8;
                            }
                        }
                        if (i3 != -1 && i3 <= 4) {
                            iA = (int) iti1.a(i3, false, bArr11);
                            Object obj = this.d.b;
                            if (iA == 357149030 || iA == 272869232 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                            }
                        }
                        fc10Var.u(1);
                        i70 = 4;
                        i71 = 0;
                        i = 8;
                    }
                    fc10Var.u(i3);
                    jB = iA;
                }
                z20 = true;
                if (jB == -1) {
                    return false;
                }
                z = false;
                this.f = (int) jB;
                this.e = (byte) 1;
                b = 1;
            } else {
                z = false;
            }
            if (b == z20) {
                this.g = iti1Var.b(fc10Var, z, z20, 8);
                this.e = (byte) 2;
            }
            z8c0 z8c0Var2 = this.d;
            int i74 = this.f;
            Object obj2 = z8c0Var2.b;
            switch (i74) {
                case SemanticState.Focused /* 128 */:
                case 143:
                case 160:
                case 166:
                case 174:
                case 182:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 17849:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 272869232:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i2 = 1;
                    break;
                case 131:
                case 136:
                case 137:
                case 145:
                case 146:
                case 152:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL /* 231 */:
                case 238:
                case 240:
                case 241:
                case 247:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 29636:
                case 29637:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i2 = 2;
                    break;
                case 133:
                case 134:
                case 17026:
                case 17276:
                case 21358:
                case 2274716:
                    i2 = 3;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i2 = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i2 = 5;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    long position = fc10Var.getPosition();
                    arrayDeque.push(new gwr(this.f, this.g + position));
                    this.d.k(this.f, position, this.g);
                    this.e = (byte) 0;
                    return true;
                }
                if (i2 == 2) {
                    long j5 = this.g;
                    if (j5 <= 8) {
                        z8c0Var2.f(i74, b(fc10Var, (int) j5));
                        this.e = (byte) 0;
                        return true;
                    }
                    throw ParserException.a((RuntimeException) null, "Invalid integer size: " + this.g);
                }
                if (i2 == 3) {
                    byte b3 = 0;
                    long j6 = this.g;
                    if (j6 > 2147483647L) {
                        throw ParserException.a((RuntimeException) null, "String element size: " + this.g);
                    }
                    int i75 = (int) j6;
                    if (i75 == 0) {
                        str = "";
                    } else {
                        byte[] bArr12 = new byte[i75];
                        fc10Var.readFully(bArr12, 0, i75);
                        while (i75 > 0 && bArr12[i75 - 1] == 0) {
                            i75--;
                        }
                        b3 = 0;
                        str = new String(bArr12, 0, i75);
                    }
                    z8c0Var2.m(i74, str);
                    this.e = b3;
                    return true;
                }
                if (i2 == 4) {
                    z8c0Var2.a(i74, (int) this.g, fc10Var);
                    this.e = (byte) 0;
                    return true;
                }
                if (i2 != 5) {
                    throw ParserException.a((RuntimeException) null, "Invalid element type " + i2);
                }
                long j7 = this.g;
                if (j7 != 4 && j7 != 8) {
                    throw ParserException.a((RuntimeException) null, "Invalid float size: " + this.g);
                }
                int i76 = (int) j7;
                long jB2 = b(fc10Var, i76);
                double dIntBitsToFloat = i76 == 4 ? Float.intBitsToFloat((int) jB2) : Double.longBitsToDouble(jB2);
                rch0 rch0Var2 = (rch0) z8c0Var2.b;
                if (i74 == 181) {
                    rch0Var2.g(i74);
                    rch0Var2.A.T = (int) dIntBitsToFloat;
                } else if (i74 != 17545) {
                    switch (i74) {
                        case 21969:
                            rch0Var2.g(i74);
                            rch0Var2.A.F = (float) dIntBitsToFloat;
                            break;
                        case 21970:
                            rch0Var2.g(i74);
                            rch0Var2.A.G = (float) dIntBitsToFloat;
                            break;
                        case 21971:
                            rch0Var2.g(i74);
                            rch0Var2.A.H = (float) dIntBitsToFloat;
                            break;
                        case 21972:
                            rch0Var2.g(i74);
                            rch0Var2.A.I = (float) dIntBitsToFloat;
                            break;
                        case 21973:
                            rch0Var2.g(i74);
                            rch0Var2.A.J = (float) dIntBitsToFloat;
                            break;
                        case 21974:
                            rch0Var2.g(i74);
                            rch0Var2.A.K = (float) dIntBitsToFloat;
                            break;
                        case 21975:
                            rch0Var2.g(i74);
                            rch0Var2.A.L = (float) dIntBitsToFloat;
                            break;
                        case 21976:
                            rch0Var2.g(i74);
                            rch0Var2.A.M = (float) dIntBitsToFloat;
                            break;
                        case 21977:
                            rch0Var2.g(i74);
                            rch0Var2.A.N = (float) dIntBitsToFloat;
                            break;
                        case 21978:
                            rch0Var2.g(i74);
                            rch0Var2.A.O = (float) dIntBitsToFloat;
                            break;
                        default:
                            switch (i74) {
                                case 30323:
                                    rch0Var2.g(i74);
                                    rch0Var2.A.v = (float) dIntBitsToFloat;
                                    break;
                                case 30324:
                                    rch0Var2.g(i74);
                                    rch0Var2.A.w = (float) dIntBitsToFloat;
                                    break;
                                case 30325:
                                    rch0Var2.g(i74);
                                    rch0Var2.A.x = (float) dIntBitsToFloat;
                                    break;
                            }
                            break;
                    }
                } else {
                    rch0Var2.v = (long) dIntBitsToFloat;
                }
                this.e = (byte) 0;
                return true;
            }
            fc10Var.u((int) this.g);
            this.e = (byte) 0;
        }
    }

    public final long b(fc10 fc10Var, int i) {
        byte[] bArr = this.a;
        fc10Var.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
