package p;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.car.app.navigation.model.Maneuver;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cae extends fae {
    public final izr0 h = new izr0();
    public final bae i = new bae();
    public int j = -1;
    public final int k;
    public final aae[] l;
    public aae m;
    public List n;
    public List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public bae f22p;
    public int q;

    public cae(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = kwg.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new aae[8];
        int i2 = 0;
        while (true) {
            aae[] aaeVarArr = this.l;
            if (i2 >= 8) {
                this.m = aaeVarArr[0];
                return;
            } else {
                aaeVarArr[i2] = new aae();
                i2++;
            }
        }
    }

    @Override // p.fae
    public final gae f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new gae(list);
    }

    @Override // p.fae, p.ear
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.f22p = null;
    }

    @Override // p.fae
    public final void g(dae daeVar) {
        bae baeVar;
        ByteBuffer byteBuffer = daeVar.d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        izr0 izr0Var = this.h;
        izr0Var.P(bArrArray, iLimit);
        while (izr0Var.a() >= 3) {
            int iE = izr0Var.E();
            int i = iE & 3;
            boolean z = (iE & 4) == 4;
            byte bE = (byte) izr0Var.E();
            byte bE2 = (byte) izr0Var.E();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (bE & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            oon1.H("Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bE & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        baeVar = new bae(i2, i4);
                        this.f22p = baeVar;
                        byte[] bArr = baeVar.b;
                        baeVar.e = 1;
                        bArr[0] = bE2;
                    } else {
                        dm5.m(i == 2);
                        baeVar = this.f22p;
                        if (baeVar == null) {
                            oon1.v("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = baeVar.b;
                            int i5 = baeVar.e;
                            int i6 = i5 + 1;
                            baeVar.e = i6;
                            bArr2[i5] = bE;
                            baeVar.e = i5 + 2;
                            bArr2[i6] = bE2;
                        }
                    }
                    if (baeVar.e == (baeVar.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // p.fae
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:230:0x053b  */
    public final void j() {
        boolean z;
        char c;
        bae baeVar = this.f22p;
        if (baeVar == null) {
            return;
        }
        int i = 2;
        boolean z2 = true;
        if (baeVar.e != (baeVar.d * 2) - 1) {
            oon1.s("DtvCcPacket ended prematurely; size is " + ((this.f22p.d * 2) - 1) + ", but current index is " + this.f22p.e + " (sequence number " + this.f22p.c + ");");
        }
        bae baeVar2 = this.f22p;
        byte[] bArr = baeVar2.b;
        int i2 = baeVar2.e;
        bae baeVar3 = this.i;
        baeVar3.l(bArr, i2);
        boolean z3 = false;
        while (baeVar3.b() > 0) {
            int i3 = 3;
            int iG = baeVar3.g(3);
            int iG2 = baeVar3.g(5);
            int i4 = 7;
            if (iG == 7) {
                baeVar3.o(i);
                iG = baeVar3.g(6);
                if (iG < 7) {
                    td6.p(iG, "Invalid extended service number: ");
                }
            }
            if (iG2 == 0) {
                if (iG != 0) {
                    oon1.H("serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                }
                if (z3) {
                    this.n = k();
                }
                this.f22p = null;
            }
            if (iG != this.k) {
                baeVar3.p(iG2);
            } else {
                int iE = (iG2 * 8) + baeVar3.e();
                while (baeVar3.e() < iE) {
                    int iG3 = baeVar3.g(8);
                    if (iG3 != 16) {
                        if (iG3 <= 31) {
                            if (iG3 != 0) {
                                if (iG3 == i3) {
                                    this.n = k();
                                } else if (iG3 != 8) {
                                    switch (iG3) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iG3 >= 17 && iG3 <= 23) {
                                                oon1.H("Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                baeVar3.o(8);
                                            } else if (iG3 < 24 || iG3 > 31) {
                                                td6.p(iG3, "Invalid C0 command: ");
                                            } else {
                                                oon1.H("Currently unsupported COMMAND_P16 Command: " + iG3);
                                                baeVar3.o(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iG3 <= 127) {
                            aae aaeVar = this.m;
                            if (iG3 == 127) {
                                aaeVar.a((char) 9835);
                            } else {
                                aaeVar.a((char) (iG3 & 255));
                            }
                            z3 = true;
                        } else {
                            if (iG3 <= 159) {
                                aae[] aaeVarArr = this.l;
                                switch (iG3) {
                                    case SemanticState.Focused /* 128 */:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        i3 = i3;
                                        z = true;
                                        int i5 = iG3 - 128;
                                        if (this.q != i5) {
                                            this.q = i5;
                                            this.m = aaeVarArr[i5];
                                        }
                                        break;
                                    case 136:
                                        i3 = i3;
                                        z = true;
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (baeVar3.f()) {
                                                aae aaeVar2 = aaeVarArr[8 - i6];
                                                aaeVar2.a.clear();
                                                aaeVar2.b.clear();
                                                aaeVar2.o = -1;
                                                aaeVar2.f10p = -1;
                                                aaeVar2.q = -1;
                                                aaeVar2.s = -1;
                                                aaeVar2.u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        i3 = i3;
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (baeVar3.f()) {
                                                aaeVarArr[8 - i7].d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 138:
                                        i3 = i3;
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (baeVar3.f()) {
                                                aaeVarArr[8 - i8].d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 139:
                                        i3 = i3;
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (baeVar3.f()) {
                                                aae aaeVar3 = aaeVarArr[8 - i9];
                                                aaeVar3.d = !aaeVar3.d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        i3 = i3;
                                        for (int i10 = 1; i10 <= 8; i10++) {
                                            if (baeVar3.f()) {
                                                aaeVarArr[8 - i10].d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 141:
                                        i3 = i3;
                                        baeVar3.o(8);
                                        z = true;
                                        break;
                                    case 142:
                                        i3 = i3;
                                        z = true;
                                        break;
                                    case 143:
                                        i3 = i3;
                                        l();
                                        z = true;
                                        break;
                                    case 144:
                                        int i11 = i;
                                        if (this.m.c) {
                                            baeVar3.g(4);
                                            baeVar3.g(i11);
                                            baeVar3.g(i11);
                                            boolean zF = baeVar3.f();
                                            boolean zF2 = baeVar3.f();
                                            i3 = 3;
                                            baeVar3.g(3);
                                            baeVar3.g(3);
                                            this.m.e(zF, zF2);
                                        } else {
                                            baeVar3.o(16);
                                            i3 = 3;
                                        }
                                        z = true;
                                        break;
                                    case 145:
                                        if (this.m.c) {
                                            int iC = aae.c(baeVar3.g(2), baeVar3.g(2), baeVar3.g(2), baeVar3.g(2));
                                            int iC2 = aae.c(baeVar3.g(2), baeVar3.g(2), baeVar3.g(2), baeVar3.g(2));
                                            baeVar3.o(2);
                                            aae.c(baeVar3.g(2), baeVar3.g(2), baeVar3.g(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            baeVar3.o(24);
                                        }
                                        i3 = 3;
                                        z = true;
                                        break;
                                    case 146:
                                        if (this.m.c) {
                                            baeVar3.o(4);
                                            int iG4 = baeVar3.g(4);
                                            baeVar3.o(2);
                                            baeVar3.g(6);
                                            aae aaeVar4 = this.m;
                                            if (aaeVar4.u != iG4) {
                                                aaeVar4.a('\n');
                                            }
                                            aaeVar4.u = iG4;
                                        } else {
                                            baeVar3.o(16);
                                        }
                                        i3 = 3;
                                        z = true;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        td6.p(iG3, "Invalid C1 command: ");
                                        i3 = i3;
                                        z = true;
                                        break;
                                    case 151:
                                        if (this.m.c) {
                                            int iC3 = aae.c(baeVar3.g(2), baeVar3.g(2), baeVar3.g(2), baeVar3.g(2));
                                            baeVar3.g(2);
                                            aae.c(baeVar3.g(2), baeVar3.g(2), baeVar3.g(2), 0);
                                            baeVar3.f();
                                            baeVar3.f();
                                            baeVar3.g(2);
                                            baeVar3.g(2);
                                            int iG5 = baeVar3.g(2);
                                            baeVar3.o(8);
                                            aae aaeVar5 = this.m;
                                            aaeVar5.n = iC3;
                                            aaeVar5.k = iG5;
                                        } else {
                                            baeVar3.o(32);
                                        }
                                        i3 = 3;
                                        z = true;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i12 = iG3 - 152;
                                        aae aaeVar6 = aaeVarArr[i12];
                                        baeVar3.o(i);
                                        boolean zF3 = baeVar3.f();
                                        baeVar3.o(i);
                                        int iG6 = baeVar3.g(i3);
                                        boolean zF4 = baeVar3.f();
                                        int iG7 = baeVar3.g(i4);
                                        int iG8 = baeVar3.g(8);
                                        int iG9 = baeVar3.g(4);
                                        int iG10 = baeVar3.g(4);
                                        baeVar3.o(i);
                                        baeVar3.o(6);
                                        baeVar3.o(i);
                                        int iG11 = baeVar3.g(i3);
                                        int iG12 = baeVar3.g(i3);
                                        ArrayList arrayList = aaeVar6.a;
                                        aaeVar6.c = true;
                                        aaeVar6.d = zF3;
                                        aaeVar6.e = iG6;
                                        aaeVar6.f = zF4;
                                        aaeVar6.g = iG7;
                                        aaeVar6.h = iG8;
                                        aaeVar6.i = iG9;
                                        int i13 = iG10 + 1;
                                        if (aaeVar6.j != i13) {
                                            aaeVar6.j = i13;
                                            while (true) {
                                                if (arrayList.size() >= aaeVar6.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iG11 != 0 && aaeVar6.l != iG11) {
                                            aaeVar6.l = iG11;
                                            int i14 = iG11 - 1;
                                            int i15 = aae.B[i14];
                                            boolean z4 = aae.A[i14];
                                            int i16 = aae.y[i14];
                                            int i17 = aae.z[i14];
                                            int i18 = aae.x[i14];
                                            aaeVar6.n = i15;
                                            aaeVar6.k = i18;
                                        }
                                        if (iG12 != 0 && aaeVar6.m != iG12) {
                                            aaeVar6.m = iG12;
                                            int i19 = iG12 - 1;
                                            int i20 = aae.D[i19];
                                            int i21 = aae.C[i19];
                                            aaeVar6.e(false, false);
                                            aaeVar6.f(aae.v, aae.E[i19]);
                                        }
                                        if (this.q != i12) {
                                            this.q = i12;
                                            this.m = aaeVarArr[i12];
                                        }
                                        i3 = 3;
                                        z = true;
                                        break;
                                }
                            } else {
                                i3 = i3;
                                z = true;
                                if (iG3 <= 255) {
                                    this.m.a((char) (iG3 & 255));
                                } else {
                                    td6.p(iG3, "Invalid base command: ");
                                }
                                i = 2;
                                i4 = 7;
                            }
                            z3 = z;
                            i = 2;
                            i4 = 7;
                        }
                        z = true;
                    } else {
                        i3 = i3;
                        z = true;
                        int iG13 = baeVar3.g(8);
                        if (iG13 <= 31) {
                            i4 = 7;
                            if (iG13 > 7) {
                                if (iG13 <= 15) {
                                    baeVar3.o(8);
                                } else if (iG13 <= 23) {
                                    baeVar3.o(16);
                                } else if (iG13 <= 31) {
                                    baeVar3.o(24);
                                }
                            }
                        } else {
                            i4 = 7;
                            if (iG13 <= 127) {
                                if (iG13 == 32) {
                                    this.m.a(' ');
                                } else if (iG13 == 33) {
                                    this.m.a((char) 160);
                                } else if (iG13 == 37) {
                                    this.m.a((char) 8230);
                                } else if (iG13 == 42) {
                                    this.m.a((char) 352);
                                } else if (iG13 == 44) {
                                    this.m.a((char) 338);
                                } else if (iG13 == 63) {
                                    this.m.a((char) 376);
                                } else if (iG13 == 57) {
                                    this.m.a((char) 8482);
                                } else if (iG13 == 58) {
                                    this.m.a((char) 353);
                                } else if (iG13 == 60) {
                                    this.m.a((char) 339);
                                } else if (iG13 != 61) {
                                    switch (iG13) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                            this.m.a((char) 8216);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                            this.m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (iG13) {
                                                case 118:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case ContentType.USER_GENERATED_LIVE /* 123 */:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    td6.p(iG13, "Invalid G2 character: ");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                z3 = true;
                            } else {
                                if (iG13 > 159) {
                                    i = 2;
                                    c = 6;
                                    if (iG13 <= 255) {
                                        if (iG13 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            td6.p(iG13, "Invalid G3 character: ");
                                            this.m.a('_');
                                        }
                                        z3 = true;
                                    } else {
                                        td6.p(iG13, "Invalid extended command: ");
                                    }
                                } else if (iG13 <= 135) {
                                    baeVar3.o(32);
                                } else if (iG13 <= 143) {
                                    baeVar3.o(40);
                                } else if (iG13 <= 159) {
                                    i = 2;
                                    baeVar3.o(2);
                                    c = 6;
                                    baeVar3.o(baeVar3.g(6) * 8);
                                }
                                boolean z5 = z;
                                i3 = i3;
                                i = i;
                                z2 = z5;
                                i4 = i4;
                            }
                        }
                        i = 2;
                    }
                    c = 6;
                    boolean z6 = z;
                    i3 = i3;
                    i = i;
                    z2 = z6;
                    i4 = i4;
                }
            }
        }
        if (z3) {
            this.n = k();
        }
        this.f22p = null;
    }

    public final List k() {
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            aae[] aaeVarArr = this.l;
            aae aaeVar = aaeVarArr[i];
            if (aaeVar.c && (!aaeVar.a.isEmpty() || aaeVar.b.length() != 0)) {
                aae aaeVar2 = aaeVarArr[i];
                if (aaeVar2.d) {
                    ArrayList arrayList2 = aaeVar2.a;
                    z9e z9eVar = null;
                    if (aaeVar2.c && (!arrayList2.isEmpty() || aaeVar2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) aaeVar2.b());
                        int i3 = aaeVar2.k;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                bhn0.e(aaeVar2.k, "Unexpected justification value: ");
                                return null;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z = aaeVar2.f;
                        int i4 = aaeVar2.h;
                        int i5 = aaeVar2.g;
                        if (z) {
                            f = i4 / 99.0f;
                            f2 = i5 / 99.0f;
                        } else {
                            f = i4 / 209.0f;
                            f2 = i5 / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i6 = aaeVar2.i;
                        int i7 = i6 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = i6 % 3;
                        int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                        int i11 = aaeVar2.n;
                        z9eVar = new z9e(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 != aae.w, i11, aaeVar2.e);
                    }
                    if (z9eVar != null) {
                        arrayList.add(z9eVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, z9e.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((z9e) arrayList.get(i12)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
