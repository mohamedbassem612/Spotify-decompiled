package p;

import android.util.Pair;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.AdvertisementType;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class r2c {
    public static final Pair a = new Pair(0, 10);

    static {
        b380.s((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, new Byte[]{(byte) -111, (byte) -29, (byte) -81, (byte) -84});
    }

    public static ByteBuffer a(ie30 ie30Var) {
        List list = ie30Var.s;
        dm5.n(list.size() >= 2, "csd-0 and/or csd-1 not found in the format for avcC box.");
        byte[] bArr = (byte[]) list.get(0);
        dm5.n(bArr.length > 0, "csd-0 is empty for avcC box.");
        byte[] bArr2 = (byte[]) list.get(1);
        dm5.n(bArr2.length > 0, "csd-1 is empty for avcC box.");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap2.limit() + byteBufferWrap.limit() + AdvertisementType.OTHER);
        byteBufferAllocate.put((byte) 1);
        bg11 bg11VarP = xyn1.p(byteBufferWrap);
        dm5.n(!bg11VarP.isEmpty(), "SPS data not found in csd0 for avcC box.");
        ByteBuffer byteBuffer = (ByteBuffer) bg11VarP.get(0);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[iRemaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        zin0 zin0VarB = mqn1.B(0, bArr3, iRemaining);
        byteBufferAllocate.put((byte) zin0VarB.a);
        byteBufferAllocate.put((byte) zin0VarB.b);
        byteBufferAllocate.put((byte) zin0VarB.c);
        byteBufferAllocate.put((byte) -1);
        byteBufferAllocate.put((byte) -31);
        byteBufferAllocate.putShort((short) byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer);
        byteBuffer.rewind();
        bg11 bg11VarP2 = xyn1.p(byteBufferWrap2);
        dm5.z(!bg11VarP2.isEmpty(), "PPS data not found in csd1 for avcC box.");
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) bg11VarP2.get(0);
        byteBufferAllocate.putShort((short) byteBuffer2.remaining());
        byteBufferAllocate.put(byteBuffer2);
        byteBuffer2.rewind();
        byteBufferAllocate.flip();
        return yoi1.V("avcC", byteBufferAllocate);
    }

    public static ByteBuffer b(ie30 ie30Var) {
        int i;
        int i2;
        ByteBuffer byteBufferV;
        int i3;
        int i4;
        int iD;
        int i5;
        String str = ie30Var.f66p;
        String str2 = ie30Var.l;
        List list = ie30Var.s;
        str.getClass();
        byte b = 8;
        char c = 1;
        z = true;
        boolean z = true;
        int i6 = 0;
        switch (str) {
            case "video/dolby-vision":
                Pair pairH = h(ie30Var);
                dm5.s(pairH, "Can't identify Dolby vision profile");
                ByteBuffer byteBufferK = ((Integer) pairH.first).intValue() <= 8 ? k(ie30Var) : a(ie30Var);
                int iIntValue = ((Integer) pairH.first).intValue();
                int iIntValue2 = ((Integer) pairH.second).intValue();
                byte[] bArr = kwg.a;
                byte[] bArr2 = new byte[24];
                if (iIntValue == 8) {
                    i = 4;
                    i2 = 0;
                } else if (iIntValue == 9) {
                    i = 2;
                    i2 = 1;
                } else {
                    i = 0;
                    i2 = 0;
                }
                bArr2[0] = 1;
                bArr2[1] = 0;
                byte b2 = (byte) ((iIntValue & 127) << 1);
                bArr2[2] = b2;
                bArr2[2] = (byte) ((b2 | ((iIntValue2 >> 5) & 1)) & 255);
                byte b3 = (byte) ((iIntValue2 & 31) << 3);
                bArr2[3] = b3;
                byte b4 = (byte) (b3 | 4);
                bArr2[3] = b4;
                byte b5 = b4;
                bArr2[3] = b5;
                bArr2[3] = (byte) (b5 | 1);
                byte b6 = (byte) (i << 4);
                bArr2[4] = b6;
                bArr2[4] = (byte) (b6 | (i2 << 2));
                int iIntValue3 = ((Integer) pairH.first).intValue();
                if (iIntValue3 == 5) {
                    byteBufferV = yoi1.V("dvcC", ByteBuffer.wrap(bArr2));
                } else {
                    if (iIntValue3 != 8 && iIntValue3 != 9) {
                        hhg1.n(f4i1.c(iIntValue3, "Unsupported Dolby Vision profile "));
                        return null;
                    }
                    byteBufferV = yoi1.V("dvvC", ByteBuffer.wrap(bArr2));
                }
                return yoi1.v(new ByteBuffer[]{byteBufferK, byteBufferV});
            case "video/3gpp":
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(7);
                byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
                byteBufferAllocate.put((byte) 0);
                Pair pair = a;
                if (str2 != null) {
                    List listC = tya1.a('.').c(str2);
                    if (listC.size() >= 3) {
                        try {
                            pair = new Pair(Integer.valueOf(Integer.parseInt((String) listC.get(1))), Integer.valueOf(Integer.parseInt((String) listC.get(2))));
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                byteBufferAllocate.put(((Integer) pair.second).byteValue());
                byteBufferAllocate.put(((Integer) pair.first).byteValue());
                byteBufferAllocate.flip();
                return yoi1.V("d263", byteBufferAllocate);
            case "video/av01":
                return yoi1.V("av1C", ByteBuffer.wrap((byte[]) list.get(0)));
            case "video/hevc":
                return k(ie30Var);
            case "audio/amr-wb":
                return d((short) -31745);
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return f(ie30Var);
            case "audio/raw":
                return ByteBuffer.allocate(0);
            case "video/mp4v-es":
                return f(ie30Var);
            case "video/apv":
                dm5.n(!list.isEmpty(), "csd-0 is not found in the format for apvC box");
                byte[] bArr3 = (byte[]) list.get(0);
                dm5.n(bArr3.length > 0, "csd-0 is empty for apvC box.");
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr3.length + 4);
                byteBufferAllocate2.putInt(0);
                byteBufferAllocate2.put(bArr3);
                byteBufferAllocate2.flip();
                return yoi1.V("apvC", byteBufferAllocate2);
            case "video/avc":
                return a(ie30Var);
            case "audio/3gpp":
                return d((short) -32257);
            case "audio/iamf":
                dm5.l("Expected only 1 byte array of initialization data for IAMF codec, but found %s.", list.size(), list.size() == 1);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) list.get(0));
                int iRemaining = byteBufferWrap.remaining();
                if (iRemaining < 0) {
                    hhg1.n("Value must be non-negative.");
                    return null;
                }
                int i7 = iRemaining;
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    i7 >>>= 7;
                    if (i7 == 0) {
                        byte[] bArr4 = new byte[i9];
                        int i10 = iRemaining;
                        while (true) {
                            byte b7 = (byte) (i10 & 127);
                            i10 >>>= 7;
                            if (i10 != 0) {
                                b7 = (byte) (b7 | 128);
                            }
                            int i11 = i6 + 1;
                            bArr4[i6] = b7;
                            if (i10 == 0) {
                                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(i8 + 2 + iRemaining);
                                byteBufferAllocate3.put((byte) 1);
                                byteBufferAllocate3.put(bArr4);
                                byteBufferAllocate3.put(byteBufferWrap);
                                byteBufferAllocate3.flip();
                                return yoi1.V("iacb", byteBufferAllocate3);
                            }
                            i6 = i11;
                        }
                    } else {
                        i8 = i9;
                    }
                }
                break;
            case "audio/opus":
                dm5.n(!list.isEmpty(), "csd-0 not found in the format for dOps box.");
                byte[] bArr5 = kwg.a;
                dm5.n(!list.isEmpty(), "csd-0 must be present for Opus.");
                byte[] bArr6 = (byte[]) list.get(0);
                dm5.m(bArr6.length >= 8);
                izr0 izr0Var = new izr0(bArr6);
                int length = bArr6.length;
                String strC = izr0Var.C(8, StandardCharsets.UTF_8);
                if (strC.equals("AOPUSHDR")) {
                    dm5.m(bArr6.length >= 24);
                    long jT = izr0Var.t();
                    dm5.m(16 + jT <= ((long) bArr6.length));
                    length = (int) jT;
                    i3 = 16;
                } else {
                    dm5.m(strC.equals("OpusHead"));
                    i3 = 0;
                }
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr6, i3, length + i3);
                dm5.m(bArrCopyOfRange.length >= 8);
                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(bArrCopyOfRange.length);
                byteBufferAllocate4.put(bArrCopyOfRange, 8, bArrCopyOfRange.length - 8);
                if (byteBufferAllocate4.get(0) != 0 && byteBufferAllocate4.get(0) != 1) {
                    z = false;
                }
                dm5.y(z);
                byteBufferAllocate4.put(0, (byte) 0);
                byteBufferAllocate4.flip();
                return yoi1.V("dOps", byteBufferAllocate4);
            case "video/x-vnd.on2.vp9":
                x8h x8hVar = ie30Var.H;
                dm5.n(!list.isEmpty(), "csd-0 is not found in the format for vpcC box");
                byte[] bArr7 = (byte[]) list.get(0);
                dm5.n(bArr7.length > 3, "csd-0 for vp9 is invalid.");
                if (bmq0.t(bArr7) == 16777216) {
                    return yoi1.V("vpcC", ByteBuffer.wrap(bArr7));
                }
                ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(AdvertisementType.OTHER);
                byteBufferAllocate5.putInt(16777216);
                if (x8hVar == null || (i4 = x8hVar.b) == -1) {
                    i4 = 0;
                }
                byte b8 = 0;
                byte b9 = 0;
                byte b10 = 10;
                for (int i12 = 0; i12 < bArr7.length; i12 += 3) {
                    byte b11 = bArr7[i12];
                    int i13 = i12 + 2;
                    if (b11 == 1) {
                        b8 = bArr7[i13];
                    } else if (b11 == 2) {
                        b10 = bArr7[i13];
                    } else if (b11 == 3) {
                        b = bArr7[i13];
                    } else if (b11 == 4) {
                        b9 = bArr7[i13];
                    }
                }
                ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(3);
                byteBufferAllocate6.put(b8);
                byteBufferAllocate6.put(b10);
                byteBufferAllocate6.put((byte) (i4 | (b << 4) | (b9 << 1)));
                byteBufferAllocate6.flip();
                byteBufferAllocate5.put(byteBufferAllocate6);
                if (x8hVar != null) {
                    int i14 = x8hVar.a;
                    char c2 = i14 != 2 ? i14 != 6 ? (char) 1 : '\t' : (char) 5;
                    iD = x8h.d(x8hVar.c);
                    i5 = i14 != 2 ? i14 != 6 ? 1 : 9 : 6;
                    c = c2;
                } else {
                    iD = 1;
                    i5 = 1;
                }
                byteBufferAllocate5.put((byte) c);
                byteBufferAllocate5.put((byte) iD);
                byteBufferAllocate5.put((byte) i5);
                byteBufferAllocate5.putShort((short) 0);
                byteBufferAllocate5.flip();
                return yoi1.V("vpcC", byteBufferAllocate5);
            default:
                hhg1.n("Unsupported format: ".concat(str));
                return null;
        }
    }

    public static String c(ie30 ie30Var) {
        String str = ie30Var.f66p;
        int i = ie30Var.M;
        str.getClass();
        switch (str) {
            case "video/dolby-vision":
                Pair pairH = h(ie30Var);
                dm5.s(pairH, "Dolby Vision profile and level is not found.");
                int iIntValue = ((Integer) pairH.first).intValue();
                if (iIntValue == 5) {
                    return "dvh1";
                }
                if (iIntValue == 8) {
                    return "hvc1";
                }
                if (iIntValue == 9) {
                    return "avc1";
                }
                eg.i("Unsupported profile ", pairH.first, " for format: ", str);
                return null;
            case "video/3gpp":
                return "s263";
            case "video/av01":
                return "av01";
            case "video/hevc":
                return "hvc1";
            case "audio/amr-wb":
                return "sawb";
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return "mp4a";
            case "audio/raw":
                if (i == 2) {
                    return "sowt";
                }
                if (i == 268435456) {
                    return "twos";
                }
                hhg1.n(f4i1.c(i, "Unsupported PCM encoding: "));
                return null;
            case "video/mp4v-es":
                return "mp4v-es";
            case "video/apv":
                return "apv1";
            case "video/avc":
                return "avc1";
            case "audio/3gpp":
                return "samr";
            case "audio/iamf":
                return "iamf";
            case "audio/opus":
                return "Opus";
            case "video/x-vnd.on2.vp9":
                return "vp09";
            default:
                hhg1.n("Unsupported format: ".concat(str));
                return null;
        }
    }

    public static ByteBuffer d(short s) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(AdvertisementType.OTHER);
        byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.flip();
        return yoi1.V("damr", byteBufferAllocate);
    }

    public static ByteBuffer e(long j, long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.putLong(j2);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer f(ie30 ie30Var) {
        ByteBuffer byteBufferWrap;
        Byte b;
        List list = ie30Var.s;
        dm5.n(!list.isEmpty(), "csd-0 not found in the format for esds box.");
        byte[] bArr = (byte[]) list.get(0);
        dm5.n(bArr.length > 0, "csd-0 is empty for esds box.");
        String str = ie30Var.f66p;
        str.getClass();
        if (str.equals("audio/vorbis")) {
            byte[] bArr2 = kwg.a;
            dm5.n(list.size() > 1, "csd-0 and csd-1 must be present for Vorbis.");
            byte[] bArr3 = (byte[]) list.get(0);
            byte[] bArr4 = (byte[]) list.get(1);
            int length = bArr3.length;
            int length2 = bArr4.length;
            int i = length / 255;
            byte[] bArr5 = new byte[i + 1];
            Arrays.fill(bArr5, (byte) -1);
            bArr5[i] = (byte) (length % 255);
            byte[] bArr6 = {23};
            Arrays.fill(bArr6, (byte) -1);
            byteBufferWrap = ByteBuffer.allocate(i + 3 + length + 23 + length2);
            byteBufferWrap.put((byte) 2);
            byteBufferWrap.put(bArr5);
            byteBufferWrap.put(bArr6);
            byteBufferWrap.put(bArr3);
            byteBufferWrap.put(new byte[]{3, 118, 111, 114, 98, 105, 115, 7, 0, 0, 0, 97, 110, 100, 114, 111, 105, 100, 0, 0, 0, 0, 1});
            byteBufferWrap.put(bArr4);
            byteBufferWrap.flip();
        } else {
            byteBufferWrap = ByteBuffer.wrap(bArr);
        }
        int i2 = ie30Var.j;
        int i3 = ie30Var.i;
        boolean zO = asj0.o(str);
        int iRemaining = byteBufferWrap.remaining();
        ByteBuffer byteBufferI = i(iRemaining);
        ByteBuffer byteBufferI2 = i(byteBufferI.remaining() + iRemaining + 14);
        ByteBuffer byteBufferI3 = i(byteBufferI2.remaining() + byteBufferI.remaining() + iRemaining + 21);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining + AdvertisementType.OTHER);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put(byteBufferI3);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(zO ? (byte) 31 : (byte) 0);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put(byteBufferI2);
        switch (str) {
            case "audio/vorbis":
                b = (byte) -35;
                break;
            case "audio/mp4a-latm":
                b = (byte) 64;
                break;
            case "video/mp4v-es":
                b = (byte) 32;
                break;
            default:
                b = null;
                break;
        }
        b.getClass();
        byteBufferAllocate.put(b.byteValue());
        byteBufferAllocate.put((byte) ((zO ? 16 : 20) | 1));
        byteBufferAllocate.putShort((short) (((zO ? 96000 : 768) >> 8) & 65535));
        byteBufferAllocate.put((byte) 0);
        if (i2 == -1) {
            i2 = 0;
        }
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3 != -1 ? i3 : 0);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.put(byteBufferI);
        byteBufferAllocate.put(byteBufferWrap);
        byteBufferWrap.rewind();
        byteBufferAllocate.put((byte) 6);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.flip();
        return yoi1.V("esds", byteBufferAllocate);
    }

    public static ByteBuffer g() {
        ArrayList arrayList = new ArrayList();
        String str = zoi1.a;
        arrayList.add(ByteBuffer.wrap("isom".getBytes(StandardCharsets.UTF_8)));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(131072);
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate);
        String[] strArr = {"isom", "iso2", "mp41"};
        for (int i = 0; i < 3; i++) {
            arrayList.add(ByteBuffer.wrap(strArr[i].getBytes(StandardCharsets.UTF_8)));
        }
        return yoi1.U("ftyp", arrayList);
    }

    public static Pair h(ie30 ie30Var) {
        String str = ie30Var.l;
        dm5.s(str, "Codec string is null for Dolby Vision format.");
        List listC = tya1.a('.').c(str);
        if (listC.size() < 3) {
            oon1.H("Invalid Dolby Vision codec string: ".concat(str));
            return null;
        }
        return Pair.create(Integer.valueOf(Integer.parseInt((String) listC.get(1))), Integer.valueOf(Integer.parseInt((String) listC.get(2))));
    }

    public static ByteBuffer i(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        while (true) {
            arrayDeque.push(Byte.valueOf((byte) (i2 | (i & 127))));
            i >>= 7;
            if (i <= 0) {
                break;
            }
            i2 = SemanticState.Focused;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            byteBufferAllocate.put(((Byte) arrayDeque.removeFirst()).byteValue());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer j(String str, String str2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(AdvertisementType.OTHER);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        String str3 = zoi1.a;
        Charset charset = StandardCharsets.UTF_8;
        byteBufferAllocate.put(str.getBytes(charset));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(str2.getBytes(charset));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return yoi1.V("hdlr", byteBufferAllocate);
    }

    public static ByteBuffer k(ie30 ie30Var) {
        List list = ie30Var.s;
        dm5.n(!list.isEmpty(), "csd-0 not found in the format for hvcC box.");
        byte[] bArr = (byte[]) list.get(0);
        dm5.n(bArr.length > 0, "csd-0 is empty for hvcC box.");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap.limit() + AdvertisementType.OTHER);
        bg11 bg11VarP = xyn1.p(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bg11VarP.d; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) bg11VarP.get(i);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(byteBuffer.limit());
            int i2 = 0;
            for (int i3 = 0; i3 < byteBuffer.limit(); i3++) {
                if (byteBuffer.get(i3) != 3 || i2 < 2) {
                    byteBufferAllocate2.put(byteBuffer.get(i3));
                }
                i2 = byteBuffer.get(i3) == 0 ? i2 + 1 : 0;
            }
            byteBufferAllocate2.flip();
            arrayList.add(byteBufferAllocate2);
        }
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) arrayList.get(0);
        if (byteBuffer2.get(byteBuffer2.position()) != 64) {
            hhg1.n("First NALU in csd-0 is not the VPS.");
            return null;
        }
        byteBufferAllocate.put(byteBuffer2.get(6));
        byteBufferAllocate.putInt(byteBuffer2.getInt(7));
        byteBufferAllocate.putInt(byteBuffer2.getInt(11));
        byteBufferAllocate.putShort(byteBuffer2.getShort(15));
        byteBufferAllocate.put(byteBuffer2.get(17));
        byteBufferAllocate.putShort((short) -4096);
        byteBufferAllocate.put((byte) -4);
        int i4 = bg11VarP.d;
        ByteBuffer byteBuffer3 = (ByteBuffer) bg11VarP.get(1);
        int iRemaining = byteBuffer3.remaining();
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer3.get(bArr2);
        byteBuffer3.rewind();
        win0 win0VarZ = mqn1.z(bArr2, 0, iRemaining, null);
        byte b = (byte) (win0VarZ.c | 252);
        byte b2 = (byte) (win0VarZ.d | 248);
        byte b3 = (byte) (win0VarZ.e | 248);
        byteBufferAllocate.put(b);
        byteBufferAllocate.put(b2);
        byteBufferAllocate.put(b3);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put((byte) 15);
        byteBufferAllocate.put((byte) i4);
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer4 = (ByteBuffer) bg11VarP.get(i5);
            byteBufferAllocate.put((byte) ((byteBuffer4.get(0) >> 1) & 63));
            byteBufferAllocate.putShort((short) 1);
            byteBufferAllocate.putShort((short) byteBuffer4.limit());
            byteBufferAllocate.put(byteBuffer4);
        }
        byteBufferAllocate.flip();
        return yoi1.V("hvcC", byteBufferAllocate);
    }

    /* JADX WARN: Code duplicated, block: B:295:0x09f8  */
    public static ByteBuffer l(ArrayList arrayList, zsc zscVar) {
        ByteBuffer byteBufferV;
        ByteBuffer byteBufferU;
        long j;
        String str;
        ByteBuffer byteBuffer;
        HashMap map;
        int i;
        String str2;
        long jN;
        int i2;
        ByteBuffer byteBufferAllocate;
        String str3;
        int i3;
        ByteBuffer byteBufferV2;
        ByteBuffer byteBufferU2;
        String str4;
        String str5;
        ByteBuffer byteBufferV3;
        HashMap map2;
        int i4;
        ByteBuffer byteBufferU3;
        int i5;
        int i6;
        byte[] bArrL0;
        long j2;
        int i7;
        ByteBuffer byteBufferAllocate2;
        short s;
        short s2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i8;
        ByteBuffer byteBufferAllocate3;
        ArrayList arrayList4 = arrayList;
        upm0 upm0Var = (upm0) zscVar.e;
        HashSet hashSet = (HashSet) zscVar.d;
        int i9 = (int) upm0Var.a;
        int i10 = (int) upm0Var.b;
        long jMin = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
            ejf1 ejf1Var = (ejf1) arrayList4.get(i11);
            if (!ejf1Var.c.isEmpty()) {
                jMin = Math.min(((qac) ejf1Var.c.get(0)).a, jMin);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = -9223372036854775807L;
        }
        if (jMin == -9223372036854775807L) {
            return ByteBuffer.allocate(0);
        }
        HashMap map3 = new HashMap();
        int i12 = 1;
        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
            ejf1 ejf1Var2 = (ejf1) arrayList4.get(i13);
            if (!ejf1Var2.c.isEmpty()) {
                map3.put(Integer.valueOf(ejf1Var2.a), Integer.valueOf(i12));
                i12++;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int i14 = 1;
        long jMax = 0;
        long j3 = 0;
        int i15 = 0;
        while (true) {
            int i16 = 4;
            if (i15 >= arrayList4.size()) {
                HashSet hashSet2 = hashSet;
                ArrayList arrayList7 = arrayList5;
                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(AdvertisementType.OTHER);
                byteBufferAllocate4.putInt(0);
                byteBufferAllocate4.putInt(i9);
                byteBufferAllocate4.putInt(i10);
                byteBufferAllocate4.putInt(10000);
                byteBufferAllocate4.putInt((int) n(jMax, 10000L));
                byteBufferAllocate4.putInt(65536);
                byteBufferAllocate4.putShort((short) 256);
                byteBufferAllocate4.putShort((short) 0);
                byteBufferAllocate4.putInt(0);
                byteBufferAllocate4.putInt(0);
                int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
                for (int i17 = 0; i17 < 9; i17++) {
                    byteBufferAllocate4.putInt(iArr[i17]);
                }
                for (int i18 = 0; i18 < 6; i18++) {
                    byteBufferAllocate4.putInt(0);
                }
                byteBufferAllocate4.putInt(i14);
                byteBufferAllocate4.flip();
                ByteBuffer byteBufferV4 = yoi1.V("mvhd", byteBufferAllocate4);
                rpm0 rpm0Var = (rpm0) zscVar.c;
                if (rpm0Var == null) {
                    byteBufferV = ByteBuffer.allocate(0);
                } else {
                    Object[] objArr = {Float.valueOf(rpm0Var.a), Float.valueOf(rpm0Var.b)};
                    String str6 = zoi1.a;
                    String str7 = String.format(Locale.US, "%+.4f%+.4f/", objArr);
                    ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(str7.length() + 4);
                    byteBufferAllocate5.putShort((short) (byteBufferAllocate5.capacity() - 4));
                    byteBufferAllocate5.putShort((short) 5575);
                    byteBufferAllocate5.put(str7.getBytes(StandardCharsets.UTF_8));
                    dm5.y(byteBufferAllocate5.limit() == byteBufferAllocate5.capacity());
                    byteBufferAllocate5.flip();
                    byteBufferV = yoi1.V("udta", yoi1.W(byteBufferAllocate5, new byte[]{-87, 120, 121, 122}));
                }
                if (hashSet2.isEmpty()) {
                    byteBufferU = ByteBuffer.allocate(0);
                } else {
                    ByteBuffer byteBufferJ = j("mdta", "");
                    ArrayList arrayListA = z1p1.A(hashSet2);
                    int length = 0;
                    for (int i19 = 0; i19 < arrayListA.size(); i19++) {
                        length += ((yeh0) arrayListA.get(i19)).a.length() + 8;
                    }
                    ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(length + 8);
                    byteBufferAllocate6.putInt(0);
                    byteBufferAllocate6.putInt(arrayListA.size());
                    for (int i20 = 0; i20 < arrayListA.size(); i20++) {
                        String str8 = ((yeh0) arrayListA.get(i20)).a;
                        String str9 = zoi1.a;
                        byteBufferAllocate6.put(yoi1.V("mdta", ByteBuffer.wrap(str8.getBytes(StandardCharsets.UTF_8))));
                    }
                    byteBufferAllocate6.flip();
                    ByteBuffer byteBufferV5 = yoi1.V("keys", byteBufferAllocate6);
                    ArrayList arrayListA2 = z1p1.A(hashSet2);
                    int length2 = 0;
                    for (int i21 = 0; i21 < arrayListA2.size(); i21++) {
                        length2 += ((yeh0) arrayListA2.get(i21)).b.length + 24;
                    }
                    ByteBuffer byteBufferAllocate7 = ByteBuffer.allocate(length2);
                    int i22 = 0;
                    while (i22 < arrayListA2.size()) {
                        int i23 = i22 + 1;
                        yeh0 yeh0Var = (yeh0) arrayListA2.get(i22);
                        ByteBuffer byteBufferAllocate8 = ByteBuffer.allocate(yeh0Var.b.length + 8);
                        byteBufferAllocate8.putInt(yeh0Var.d);
                        byteBufferAllocate8.putInt(yeh0Var.c);
                        byteBufferAllocate8.put(yeh0Var.b);
                        byteBufferAllocate8.flip();
                        ByteBuffer byteBufferV6 = yoi1.V("data", byteBufferAllocate8);
                        byteBufferAllocate7.putInt(byteBufferV6.remaining() + 8);
                        byteBufferAllocate7.putInt(i23);
                        byteBufferAllocate7.put(byteBufferV6);
                        i22 = i23;
                    }
                    byteBufferAllocate7.flip();
                    byteBufferU = yoi1.U("meta", Arrays.asList(byteBufferJ, byteBufferV5, yoi1.V("ilst", byteBufferAllocate7)));
                }
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(byteBufferV4);
                arrayList8.add(byteBufferV);
                arrayList8.add(byteBufferU);
                arrayList8.addAll(arrayList7);
                return yoi1.U("moov", arrayList8);
            }
            ejf1 ejf1Var3 = (ejf1) arrayList4.get(i15);
            if (ejf1Var3.c.isEmpty()) {
                map2 = map3;
                arrayList2 = arrayList5;
                j = jMin;
                i15 = i15;
                arrayList3 = arrayList6;
                j2 = j3;
                i6 = i10;
                i5 = i9;
            } else {
                ie30 ie30Var = ejf1Var3.b;
                ArrayList arrayList9 = ejf1Var3.c;
                if ((Objects.equals(ie30Var.f66p, "video/av01") || Objects.equals(ejf1Var3.b.f66p, "video/x-vnd.on2.vp9")) && ie30Var.s.isEmpty()) {
                    ge30 ge30VarA = ie30Var.a();
                    byte[] bArr = ejf1Var3.j;
                    bArr.getClass();
                    ge30VarA.r = b380.t(bArr);
                    ie30Var = new ie30(ge30VarA);
                }
                String str10 = ie30Var.d;
                int i24 = ie30Var.x;
                String iSO3Language = str10;
                int i25 = ie30Var.w;
                j = jMin;
                String str11 = ie30Var.f66p;
                if (iSO3Language == null) {
                    str = null;
                    byteBuffer = null;
                } else {
                    Locale localeForLanguageTag = Locale.forLanguageTag(iSO3Language);
                    if (!localeForLanguageTag.getISO3Language().isEmpty()) {
                        iSO3Language = localeForLanguageTag.getISO3Language();
                    }
                    str = iSO3Language;
                    byteBuffer = null;
                }
                int iA = ejf1Var3.a();
                int i26 = i14;
                ArrayList arrayList10 = arrayList6;
                long j4 = ejf1Var3.k;
                ArrayList arrayList11 = arrayList5;
                ArrayList arrayList12 = new ArrayList(arrayList9.size());
                String str12 = str;
                ArrayList arrayList13 = new ArrayList(arrayList9.size());
                int i27 = i10;
                if (arrayList9.isEmpty()) {
                    i = i24;
                    map = map3;
                    str2 = str11;
                } else {
                    long j5 = j3;
                    int i28 = 0;
                    boolean z = false;
                    while (i28 < arrayList9.size()) {
                        int i29 = i28;
                        long j6 = ((qac) arrayList9.get(i28)).a;
                        arrayList12.add(Long.valueOf(j6));
                        if (j6 < j5) {
                            z = true;
                        }
                        i28 = i29 + 1;
                        j5 = j6;
                    }
                    if (z) {
                        Collections.sort(arrayList12);
                    }
                    long jLongValue = ((Long) arrayList12.get(0)).longValue();
                    int i30 = 1;
                    while (true) {
                        map = map3;
                        if (i30 >= arrayList12.size()) {
                            break;
                        }
                        String str13 = str11;
                        int i31 = i30;
                        long jLongValue2 = ((Long) arrayList12.get(i30)).longValue();
                        int i32 = i24;
                        long j7 = iA;
                        long jN2 = n(jLongValue2, j7) - n(jLongValue, j7);
                        dm5.z(jN2 <= 2147483647L, "Only 32-bit sample duration is allowed");
                        arrayList13.add(Integer.valueOf((int) jN2));
                        i30 = i31 + 1;
                        jLongValue = jLongValue2;
                        map3 = map;
                        str11 = str13;
                        i24 = i32;
                    }
                    i = i24;
                    str2 = str11;
                    if (j4 != -9223372036854775807L) {
                        long j8 = iA;
                        jN = n(j4, j8) - n(jLongValue, j8);
                        dm5.z(jN <= 2147483647L, "Only 32-bit sample duration is allowed");
                    } else {
                        jN = -1;
                    }
                    int iIntValue = (int) jN;
                    if (iIntValue == -1) {
                        iIntValue = arrayList13.size() < 2 ? 0 : ((Integer) hr80.r(arrayList13)).intValue();
                    }
                    arrayList13.add(Integer.valueOf(iIntValue));
                }
                long jIntValue = j3;
                for (int i33 = 0; i33 < arrayList13.size(); i33++) {
                    jIntValue += (long) ((Integer) arrayList13.get(i33)).intValue();
                }
                long j9 = arrayList9.isEmpty() ? j3 : ((qac) arrayList9.get(0)).a;
                long jG0 = zoi1.g0(jIntValue, 1000000L, ejf1Var3.a(), RoundingMode.HALF_UP);
                long j10 = jIntValue;
                if (j9 < j3) {
                    jG0 -= Math.abs(j9);
                }
                int i34 = asj0.i(str2);
                ByteBuffer byteBufferAllocate9 = ByteBuffer.allocate((arrayList13.size() * 8) + AdvertisementType.OTHER);
                byteBufferAllocate9.putInt(0);
                int iPosition = byteBufferAllocate9.position();
                byteBufferAllocate9.putInt(0);
                long j11 = j9;
                int iPosition2 = -1;
                int i35 = 0;
                int i36 = 0;
                long j12 = -1;
                while (i35 < arrayList13.size()) {
                    int iIntValue2 = ((Integer) arrayList13.get(i35)).intValue();
                    long j13 = j10;
                    long j14 = iIntValue2;
                    if (j12 != j14) {
                        iPosition2 = byteBufferAllocate9.position();
                        byteBufferAllocate9.putInt(1);
                        byteBufferAllocate9.putInt(iIntValue2);
                        i36++;
                        j12 = j14;
                    } else {
                        byteBufferAllocate9.putInt(iPosition2, byteBufferAllocate9.getInt(iPosition2) + 1);
                    }
                    i35++;
                    j10 = j13;
                }
                long j15 = j10;
                byteBufferAllocate9.putInt(iPosition, i36);
                byteBufferAllocate9.flip();
                ByteBuffer byteBufferV7 = yoi1.V("stts", byteBufferAllocate9);
                if (asj0.o(str2)) {
                    int iA2 = ejf1Var3.a();
                    ArrayList arrayList14 = new ArrayList(arrayList9.size());
                    if (!arrayList9.isEmpty()) {
                        long j16 = ((qac) arrayList9.get(0)).a;
                        long j17 = j3;
                        long j18 = j17;
                        int i37 = 0;
                        boolean z2 = false;
                        while (i37 < arrayList9.size()) {
                            long j19 = ((qac) arrayList9.get(i37)).a - j16;
                            long j20 = j17;
                            long jN3 = n(j19, iA2) - j20;
                            dm5.z(jN3 <= 2147483647L, "Only 32-bit composition offset is allowed");
                            long jIntValue2 = j20 + ((long) ((Integer) arrayList13.get(i37)).intValue());
                            arrayList14.add(Integer.valueOf((int) jN3));
                            if (j19 < j18) {
                                z2 = true;
                            }
                            i37++;
                            j17 = jIntValue2;
                            iA2 = iA2;
                            j18 = j19;
                        }
                        if (!z2) {
                            arrayList14.clear();
                        }
                    }
                    if (arrayList14.isEmpty()) {
                        byteBufferAllocate = ByteBuffer.allocate(0);
                    } else {
                        ByteBuffer byteBufferAllocate10 = ByteBuffer.allocate((arrayList14.size() * 8) + 8);
                        byteBufferAllocate10.putInt(16777216);
                        int iPosition3 = byteBufferAllocate10.position();
                        byteBufferAllocate10.putInt(0);
                        int i38 = 0;
                        int i39 = -1;
                        int i40 = -1;
                        for (int i41 = 0; i41 < arrayList14.size(); i41++) {
                            int iIntValue3 = ((Integer) arrayList14.get(i41)).intValue();
                            if (i39 != iIntValue3) {
                                int iPosition4 = byteBufferAllocate10.position();
                                byteBufferAllocate10.putInt(1);
                                byteBufferAllocate10.putInt(iIntValue3);
                                i38++;
                                i40 = iPosition4;
                                i39 = iIntValue3;
                            } else {
                                byteBufferAllocate10.putInt(i40, byteBufferAllocate10.getInt(i40) + 1);
                            }
                        }
                        byteBufferAllocate10.putInt(iPosition3, i38);
                        byteBufferAllocate10.flip();
                        byteBufferAllocate = yoi1.V("ctts", byteBufferAllocate10);
                    }
                    i2 = 0;
                } else {
                    i2 = 0;
                    byteBufferAllocate = ByteBuffer.allocate(0);
                }
                ByteBuffer byteBuffer2 = byteBufferAllocate;
                ByteBuffer byteBufferAllocate11 = ByteBuffer.allocate((arrayList9.size() * 4) + AdvertisementType.OTHER);
                byteBufferAllocate11.putInt(i2);
                byteBufferAllocate11.putInt(i2);
                byteBufferAllocate11.putInt(arrayList9.size());
                for (int i42 = 0; i42 < arrayList9.size(); i42++) {
                    byteBufferAllocate11.putInt(((qac) arrayList9.get(i42)).b);
                }
                byteBufferAllocate11.flip();
                ByteBuffer byteBufferV8 = yoi1.V("stsz", byteBufferAllocate11);
                ArrayList arrayList15 = ejf1Var3.e;
                ByteBuffer byteBufferAllocate12 = ByteBuffer.allocate((arrayList15.size() * 12) + AdvertisementType.OTHER);
                byteBufferAllocate12.putInt(0);
                int iPosition5 = byteBufferAllocate12.position();
                byteBufferAllocate12.putInt(0);
                int i43 = 1;
                int i44 = 0;
                int i45 = -1;
                for (int i46 = 0; i46 < arrayList15.size(); i46++) {
                    int iIntValue4 = ((Integer) arrayList15.get(i46)).intValue();
                    if (iIntValue4 != i45) {
                        byteBufferAllocate12.putInt(i43);
                        byteBufferAllocate12.putInt(iIntValue4);
                        byteBufferAllocate12.putInt(1);
                        i44++;
                        i45 = iIntValue4;
                    }
                    i43++;
                }
                byteBufferAllocate12.putInt(iPosition5, i44);
                byteBufferAllocate12.flip();
                ByteBuffer byteBufferV9 = yoi1.V("stsc", byteBufferAllocate12);
                ArrayList arrayList16 = ejf1Var3.d;
                ByteBuffer byteBufferAllocate13 = ByteBuffer.allocate((arrayList16.size() * 8) + 8);
                byteBufferAllocate13.putInt(0);
                byteBufferAllocate13.putInt(arrayList16.size());
                for (int i47 = 0; i47 < arrayList16.size(); i47++) {
                    byteBufferAllocate13.putLong(((Long) arrayList16.get(i47)).longValue());
                }
                byteBufferAllocate13.flip();
                ByteBuffer byteBufferV10 = yoi1.V("co64", byteBufferAllocate13);
                int i48 = 5;
                if (i34 == -1 || i34 == 5) {
                    str3 = str2;
                    i3 = i;
                    ByteBuffer byteBufferAllocate14 = ByteBuffer.allocate(AdvertisementType.OTHER);
                    byteBufferAllocate14.putInt(0);
                    byteBufferAllocate14.flip();
                    ByteBuffer byteBufferV11 = yoi1.V("nmhd", byteBufferAllocate14);
                    if ("application/x-itut-t35".equals(str3)) {
                        List list = ie30Var.s;
                        dm5.m(list.size() == 1);
                        ByteBuffer byteBufferAllocate15 = ByteBuffer.allocate(AdvertisementType.OTHER);
                        byteBufferAllocate15.putInt(0);
                        byteBufferAllocate15.putShort((short) 0);
                        byteBufferAllocate15.putShort((short) 1);
                        if (((byte[]) list.get(0)).length > 255) {
                            hhg1.n("t35_identifier cannot be longer than 255 bytes.");
                            return byteBuffer;
                        }
                        byteBufferAllocate15.put((byte) ((byte[]) list.get(0)).length);
                        byteBufferAllocate15.put((byte[]) list.get(0));
                        byteBufferAllocate15.flip();
                        byteBufferV2 = yoi1.V("it35", byteBufferAllocate15);
                    } else {
                        ByteBuffer byteBufferAllocate16 = ByteBuffer.allocate(AdvertisementType.OTHER);
                        str3.getClass();
                        String str14 = zoi1.a;
                        byte[] bytes = str3.getBytes(StandardCharsets.UTF_8);
                        byteBufferAllocate16.putInt(0);
                        byteBufferAllocate16.putShort((short) 0);
                        byteBufferAllocate16.putShort((short) 1);
                        byteBufferAllocate16.put(bytes);
                        byteBufferAllocate16.put((byte) 0);
                        byteBufferAllocate16.put(bytes);
                        byteBufferAllocate16.put((byte) 0);
                        byteBufferAllocate16.flip();
                        byteBufferV2 = yoi1.V("mett", byteBufferAllocate16);
                    }
                    byteBufferU2 = yoi1.U("stbl", Arrays.asList(m(byteBufferV2), byteBufferV7, byteBufferV8, byteBufferV9, byteBufferV10));
                    str4 = "MetaHandle";
                    str5 = "meta";
                    byteBufferV3 = byteBufferV11;
                } else if (i34 == 1) {
                    i3 = i;
                    ByteBuffer byteBufferAllocate17 = ByteBuffer.allocate(AdvertisementType.OTHER);
                    byteBufferAllocate17.putInt(0);
                    byteBufferAllocate17.putShort((short) 0);
                    byteBufferAllocate17.putShort((short) 0);
                    byteBufferAllocate17.flip();
                    ByteBuffer byteBufferV12 = yoi1.V("smhd", byteBufferAllocate17);
                    String strC = c(ie30Var);
                    ByteBuffer byteBufferB = b(ie30Var);
                    ByteBuffer byteBufferAllocate18 = ByteBuffer.allocate(byteBufferB.remaining() + AdvertisementType.OTHER);
                    byteBufferAllocate18.putInt(0);
                    byteBufferAllocate18.putShort((short) 0);
                    byteBufferAllocate18.putShort((short) 1);
                    byteBufferAllocate18.putInt(0);
                    byteBufferAllocate18.putInt(0);
                    str3 = str2;
                    boolean zEquals = Objects.equals(str3, "audio/iamf");
                    byteBufferAllocate18.putShort((short) (zEquals ? 0 : ie30Var.J));
                    byteBufferAllocate18.putShort((short) 16);
                    byteBufferAllocate18.putShort((short) 0);
                    byteBufferAllocate18.putShort((short) 0);
                    byteBufferAllocate18.putInt((zEquals ? 0 : ie30Var.L) << 16);
                    byteBufferAllocate18.put(byteBufferB);
                    byteBufferAllocate18.flip();
                    byteBufferU2 = yoi1.U("stbl", Arrays.asList(m(yoi1.V(strC, byteBufferAllocate18)), byteBufferV7, byteBufferV8, byteBufferV9, byteBufferV10));
                    str5 = "soun";
                    str4 = "SoundHandle";
                    byteBufferV3 = byteBufferV12;
                } else {
                    if (i34 != 2) {
                        hhg1.n("Unsupported track type");
                        return byteBuffer;
                    }
                    ByteBuffer byteBufferAllocate19 = ByteBuffer.allocate(AdvertisementType.OTHER);
                    byteBufferAllocate19.putInt(0);
                    byteBufferAllocate19.putShort((short) 0);
                    byteBufferAllocate19.putShort((short) 0);
                    byteBufferAllocate19.putShort((short) 0);
                    byteBufferAllocate19.putShort((short) 0);
                    byteBufferAllocate19.flip();
                    byteBufferV3 = yoi1.V("vmhd", byteBufferAllocate19);
                    ByteBuffer byteBufferB2 = b(ie30Var);
                    x8h x8hVar = ie30Var.H;
                    String strC2 = c(ie30Var);
                    ByteBuffer byteBufferAllocate20 = ByteBuffer.allocate(byteBufferB2.limit() + AdvertisementType.OTHER);
                    byteBufferAllocate20.putInt(0);
                    byteBufferAllocate20.putShort((short) 0);
                    byteBufferAllocate20.putShort((short) 1);
                    byteBufferAllocate20.putShort((short) 0);
                    byteBufferAllocate20.putShort((short) 0);
                    byteBufferAllocate20.putInt(0);
                    byteBufferAllocate20.putInt(0);
                    byteBufferAllocate20.putInt(0);
                    byteBufferAllocate20.putShort(i25 != -1 ? (short) i25 : (short) 0);
                    i3 = i;
                    byteBufferAllocate20.putShort(i3 != -1 ? (short) i3 : (short) 0);
                    byteBufferAllocate20.putInt(4718592);
                    byteBufferAllocate20.putInt(4718592);
                    byteBufferAllocate20.putInt(0);
                    byteBufferAllocate20.putShort((short) 1);
                    long j21 = j3;
                    byteBufferAllocate20.putLong(j21);
                    byteBufferAllocate20.putLong(j21);
                    byteBufferAllocate20.putLong(j21);
                    byteBufferAllocate20.putLong(j21);
                    byteBufferAllocate20.putShort((short) 24);
                    byteBufferAllocate20.putShort((short) -1);
                    byteBufferAllocate20.put(byteBufferB2);
                    if (x8hVar != null && strC2.equals("vp09")) {
                        byte[] bArr2 = x8hVar.d;
                        if (bArr2 != null) {
                            ByteBuffer byteBufferAllocate21 = ByteBuffer.allocate(AdvertisementType.OTHER);
                            byteBufferAllocate21.putInt(0);
                            byteBufferAllocate21.put(bArr2);
                            byteBufferAllocate21.flip();
                            byteBufferAllocate3 = yoi1.V("SmDm", byteBufferAllocate21);
                        } else {
                            byteBufferAllocate3 = ByteBuffer.allocate(0);
                        }
                        byteBufferAllocate20.put(byteBufferAllocate3);
                    }
                    ByteBuffer byteBufferAllocate22 = ByteBuffer.allocate(8);
                    byteBufferAllocate22.putInt(65536);
                    byteBufferAllocate22.putInt(65536);
                    byteBufferAllocate22.rewind();
                    byteBufferAllocate20.put(yoi1.V("pasp", byteBufferAllocate22));
                    if (x8hVar != null) {
                        int i49 = x8hVar.a;
                        ByteBuffer byteBufferAllocate23 = ByteBuffer.allocate(20);
                        byteBufferAllocate23.put((byte) 110);
                        byteBufferAllocate23.put((byte) 99);
                        byteBufferAllocate23.put((byte) 108);
                        byteBufferAllocate23.put((byte) 120);
                        if (i49 != 2) {
                            i8 = 6;
                            i48 = i49 != 6 ? 1 : 9;
                        } else {
                            i8 = 6;
                        }
                        short s3 = (short) i48;
                        short sD = (short) x8h.d(x8hVar.c);
                        short s4 = (short) (i49 != 2 ? i49 != i8 ? 1 : 9 : 6);
                        byte b = x8hVar.b == 1 ? (byte) -128 : (byte) 0;
                        byteBufferAllocate23.putShort(s3);
                        byteBufferAllocate23.putShort(sD);
                        byteBufferAllocate23.putShort(s4);
                        byteBufferAllocate23.put(b);
                        byteBufferAllocate23.flip();
                        byteBufferAllocate20.put(yoi1.V("colr", byteBufferAllocate23));
                    }
                    byteBufferAllocate20.flip();
                    ByteBuffer byteBufferM = m(yoi1.V(strC2, byteBufferAllocate20));
                    ByteBuffer byteBufferAllocate24 = ByteBuffer.allocate((arrayList9.size() * 4) + AdvertisementType.OTHER);
                    byteBufferAllocate24.putInt(0);
                    int iPosition6 = byteBufferAllocate24.position();
                    byteBufferAllocate24.putInt(arrayList9.size());
                    int i50 = 1;
                    int i51 = 0;
                    for (int i52 = 0; i52 < arrayList9.size(); i52++) {
                        if ((((qac) arrayList9.get(i52)).c & 1) > 0) {
                            byteBufferAllocate24.putInt(i50);
                            i51++;
                        }
                        i50++;
                    }
                    byteBufferAllocate24.putInt(iPosition6, i51);
                    byteBufferAllocate24.flip();
                    byteBufferU2 = yoi1.U("stbl", Arrays.asList(byteBufferM, byteBufferV7, byteBuffer2, byteBufferV8, byteBufferV9, byteBufferV10, yoi1.V("stss", byteBufferAllocate24)));
                    str5 = "vide";
                    str4 = "VideoHandle";
                    str3 = str2;
                }
                HashMap map4 = new HashMap();
                Iterator it = ejf1Var3.h.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ArrayList arrayList17 = new ArrayList();
                    for (Integer num : (List) entry.getValue()) {
                        Iterator it2 = it;
                        HashMap map5 = map;
                        if (map5.containsKey(num)) {
                            arrayList17.add((Integer) map5.get(num));
                        }
                        map = map5;
                        it = it2;
                    }
                    Iterator it3 = it;
                    HashMap map6 = map;
                    if (!arrayList17.isEmpty()) {
                        map4.put((Integer) entry.getKey(), arrayList17);
                    }
                    map = map6;
                    it = it3;
                }
                HashMap map7 = map;
                if (map4.isEmpty()) {
                    byteBufferU3 = ByteBuffer.allocate(0);
                    map2 = map7;
                    i4 = 3;
                } else {
                    ArrayList arrayList18 = new ArrayList();
                    Iterator it4 = map4.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        int iIntValue5 = ((Integer) entry2.getKey()).intValue();
                        List list2 = (List) entry2.getValue();
                        ByteBuffer byteBufferAllocate25 = ByteBuffer.allocate(list2.size() * 4);
                        Iterator it5 = it4;
                        HashMap map8 = map7;
                        for (int i53 = 0; i53 < list2.size(); i53++) {
                            byteBufferAllocate25.putInt(((Integer) list2.get(i53)).intValue());
                        }
                        byteBufferAllocate25.flip();
                        String str15 = zoi1.a;
                        int iFloatToIntBits = Float.floatToIntBits(iIntValue5);
                        byte[] bArr3 = new byte[i16];
                        bArr3[0] = (byte) (iFloatToIntBits >> 24);
                        bArr3[1] = (byte) (iFloatToIntBits >> 16);
                        bArr3[2] = (byte) (iFloatToIntBits >> 8);
                        bArr3[3] = (byte) iFloatToIntBits;
                        arrayList18.add(yoi1.W(byteBufferAllocate25, bArr3));
                        it4 = it5;
                        map7 = map8;
                        i16 = 4;
                    }
                    map2 = map7;
                    i4 = 3;
                    byteBufferU3 = yoi1.U("tref", arrayList18);
                }
                int i54 = ((tpm0) zscVar.b).a;
                ByteBuffer byteBufferAllocate26 = ByteBuffer.allocate(AdvertisementType.OTHER);
                byteBufferAllocate26.putInt(7);
                i5 = i9;
                byteBufferAllocate26.putInt(i5);
                i6 = i27;
                byteBufferAllocate26.putInt(i6);
                byteBufferAllocate26.putInt(i26);
                byteBufferAllocate26.putInt(0);
                ByteBuffer byteBuffer3 = byteBufferU3;
                String str16 = str5;
                byteBufferAllocate26.putInt((int) n(jG0, 10000L));
                byteBufferAllocate26.putInt(0);
                byteBufferAllocate26.putInt(0);
                byteBufferAllocate26.putInt(0);
                byteBufferAllocate26.putShort(asj0.k(str3) ? (short) 256 : (short) 0);
                byteBufferAllocate26.putShort((short) 0);
                if (i54 == 0) {
                    bArrL0 = zoi1.l0(new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824});
                } else if (i54 == 90) {
                    bArrL0 = zoi1.l0(new int[]{0, 65536, 0, -65536, 0, 0, 0, 0, 1073741824});
                } else if (i54 == 180) {
                    bArrL0 = zoi1.l0(new int[]{-65536, 0, 0, 0, -65536, 0, 0, 0, 1073741824});
                } else {
                    if (i54 != 270) {
                        hhg1.n(f4i1.c(i54, "invalid orientation "));
                        return byteBuffer;
                    }
                    bArrL0 = zoi1.l0(new int[]{0, -65536, 0, 65536, 0, 0, 0, 0, 1073741824});
                }
                byteBufferAllocate26.put(bArrL0);
                if (i25 == -1) {
                    i25 = 0;
                }
                if (i3 == -1) {
                    i3 = 0;
                }
                byteBufferAllocate26.putInt(i25 << 16);
                byteBufferAllocate26.putInt(i3 << 16);
                byteBufferAllocate26.flip();
                ByteBuffer byteBufferV13 = yoi1.V("tkhd", byteBufferAllocate26);
                long jA = ejf1Var3.a();
                long j22 = j > 0 ? j11 - j : j11;
                if (j22 != 0) {
                    ByteBuffer byteBufferAllocate27 = ByteBuffer.allocate(50);
                    byteBufferAllocate27.putInt(16777216);
                    if (j22 > 0) {
                        byteBufferAllocate27.putInt(2);
                        byteBufferAllocate27.put(e(n(j22, 10000L), -1L));
                        byteBufferAllocate27.put(e(n(jG0, 10000L), 0L));
                        j2 = 0;
                    } else {
                        j2 = 0;
                        byteBufferAllocate27.putInt(1);
                        byteBufferAllocate27.put(e(n(jG0, 10000L), n(Math.abs(j22), jA)));
                    }
                    byteBufferAllocate27.flip();
                    byteBufferAllocate2 = yoi1.V("edts", yoi1.V("elst", byteBufferAllocate27));
                    i7 = 0;
                } else {
                    jG0 = jG0;
                    j2 = 0;
                    i7 = 0;
                    byteBufferAllocate2 = ByteBuffer.allocate(0);
                }
                int iA3 = ejf1Var3.a();
                ByteBuffer byteBufferAllocate28 = ByteBuffer.allocate(AdvertisementType.OTHER);
                byteBufferAllocate28.putInt(i7);
                byteBufferAllocate28.putInt(i5);
                byteBufferAllocate28.putInt(i6);
                byteBufferAllocate28.putInt(iA3);
                byteBufferAllocate28.putInt((int) j15);
                if (str12 == null) {
                    s = 0;
                    s2 = 0;
                } else {
                    byte[] bytes2 = str12.getBytes(StandardCharsets.UTF_8);
                    if (bytes2.length != i4) {
                        s = 0;
                        s2 = 0;
                    } else {
                        s2 = 0;
                        s = (short) (((bytes2[2] & 31) + ((bytes2[1] & 31) << 5) + ((bytes2[0] & 31) << 10)) & 32767);
                    }
                }
                byteBufferAllocate28.putShort(s);
                byteBufferAllocate28.putShort(s2);
                byteBufferAllocate28.flip();
                ByteBuffer byteBufferV14 = yoi1.V("mdhd", byteBufferAllocate28);
                ByteBuffer byteBufferJ2 = j(str16, str4);
                ByteBuffer byteBufferAllocate29 = ByteBuffer.allocate(4);
                byteBufferAllocate29.putInt(1);
                byteBufferAllocate29.flip();
                ByteBuffer[] byteBufferArr = {yoi1.V("url ", byteBufferAllocate29)};
                ByteBuffer byteBufferAllocate30 = ByteBuffer.allocate(8);
                byteBufferAllocate30.putInt(0);
                byteBufferAllocate30.putInt(1);
                byteBufferAllocate30.flip();
                ArrayList arrayList19 = new ArrayList();
                arrayList19.add(byteBufferAllocate30);
                Collections.addAll(arrayList19, byteBufferArr);
                ByteBuffer byteBufferU4 = yoi1.U("trak", Arrays.asList(byteBufferV13, byteBuffer3, byteBufferAllocate2, yoi1.U("mdia", Arrays.asList(byteBufferV14, byteBufferJ2, yoi1.U("minf", Arrays.asList(byteBufferV3, yoi1.V("dinf", yoi1.U("dref", arrayList19)), byteBufferU2))))));
                arrayList2 = arrayList11;
                arrayList2.add(byteBufferU4);
                jMax = Math.max(jMax, jG0);
                ByteBuffer byteBufferAllocate31 = ByteBuffer.allocate(24);
                byteBufferAllocate31.putInt(0);
                byteBufferAllocate31.putInt(i26);
                byteBufferAllocate31.putInt(1);
                byteBufferAllocate31.putInt(0);
                byteBufferAllocate31.putInt(0);
                byteBufferAllocate31.putInt(0);
                byteBufferAllocate31.flip();
                arrayList3 = arrayList10;
                arrayList3.add(yoi1.V("trex", byteBufferAllocate31));
                i14 = i26 + 1;
            }
            arrayList5 = arrayList2;
            arrayList6 = arrayList3;
            i9 = i5;
            i10 = i6;
            hashSet = hashSet;
            jMin = j;
            map3 = map2;
            j3 = j2;
            i15++;
            arrayList4 = arrayList;
        }
    }

    public static ByteBuffer m(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit() + AdvertisementType.OTHER);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return yoi1.V("stsd", byteBufferAllocate);
    }

    public static long n(long j, long j2) {
        return zoi1.g0(j, j2, 1000000L, RoundingMode.HALF_UP);
    }
}
