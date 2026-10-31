package p;

import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y9e extends fae {
    public final int i;
    public final boolean j;
    public final boolean k;
    public List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f174p;
    public byte q;
    public byte r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 93, 237, 243, 250, 97, 98, 99, 100, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 102, 103, 104, 105, 106, 107, 108, 109, 110, ContentType.SHORT_FORM_ON_DEMAND, ContentType.LONG_FORM_ON_DEMAND, ContentType.LIVE, 114, 115, 116, 117, 118, 119, 120, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 226, AdvertisementType.BRANDED_AS_CONTENT, 238, 244, 251};
    public static final int[] E = {193, 201, AdvertisementType.ON_DEMAND_PRE_ROLL, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, ContentType.BUMPER, AdvertisementType.OTHER, 202, 203, AdvertisementType.BRANDED_DURING_LIVE, 206, 207, 239, AdvertisementType.ON_DEMAND_MID_ROLL, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, AdvertisementType.ON_DEMAND_POST_ROLL, 245, ContentType.USER_GENERATED_LIVE, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final izr0 h = new izr0();
    public final ArrayList m = new ArrayList();
    public x9e n = new x9e(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public y9e(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.k = false;
            this.j = false;
        } else if (i == 2) {
            this.k = true;
            this.j = false;
        } else if (i == 3) {
            this.k = false;
            this.j = true;
        } else if (i != 4) {
            oon1.H("Invalid channel. Defaulting to CC1.");
            this.k = false;
            this.j = false;
        } else {
            this.k = true;
            this.j = true;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // p.fae
    public final gae f() {
        List list = this.o;
        this.f174p = list;
        list.getClass();
        return new gae(list);
    }

    @Override // p.fae, p.ear
    public final void flush() {
        super.flush();
        this.o = null;
        this.f174p = null;
        l(0);
        this.r = (byte) 4;
        this.n.h = (byte) 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0198  */
    /* JADX WARN: Code duplicated, block: B:123:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01da  */
    /* JADX WARN: Code duplicated, block: B:148:0x0205 A[LOOP:1: B:146:0x01ff->B:148:0x0205, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x0209  */
    /* JADX WARN: Code duplicated, block: B:151:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0211  */
    /* JADX WARN: Code duplicated, block: B:153:0x0216  */
    /* JADX WARN: Code duplicated, block: B:154:0x021d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0228  */
    /* JADX WARN: Code duplicated, block: B:156:0x0233  */
    /* JADX WARN: Code duplicated, block: B:157:0x023e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0243  */
    /* JADX WARN: Code duplicated, block: B:159:0x0248  */
    /* JADX WARN: Code duplicated, block: B:161:0x0259  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // p.fae
    public final void g(dae daeVar) {
        boolean z2;
        int i;
        int[] iArr;
        int i2;
        int i3;
        byte b;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = daeVar.d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        izr0 izr0Var = this.h;
        izr0Var.P(bArrArray, iLimit);
        boolean z3 = false;
        while (true) {
            int iA = izr0Var.a();
            int i4 = this.i;
            if (iA < i4) {
                if (z3) {
                    byte b2 = this.q;
                    if (b2 == 1 || b2 == 3) {
                        this.o = j();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iE = i4 == 2 ? -4 : izr0Var.E();
            int iE2 = izr0Var.E();
            int iE3 = izr0Var.E();
            if ((iE & 2) == 0 && (iE & 1) == this.j) {
                byte b3 = (byte) (iE2 & 127);
                byte b4 = (byte) (iE3 & 127);
                if (b3 != 0 || b4 != 0) {
                    boolean z4 = this.s;
                    if ((iE & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iE2] && zArr[iE3]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    this.s = z2;
                    if (!z2 || (b3 & 240) != 16) {
                        this.t = false;
                        if (!z2) {
                            if (1 > b3 && b3 <= 15) {
                                this.x = false;
                            } else if ((b3 & 246) == 20) {
                                if (b4 == 32 && b4 != 47) {
                                    switch (b4) {
                                        default:
                                            switch (b4) {
                                                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                                    this.x = false;
                                                    break;
                                            }
                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                            this.x = true;
                                            break;
                                    }
                                } else {
                                    this.x = true;
                                }
                            }
                            if (this.x) {
                                i = b3 & 224;
                                if (i == 0) {
                                    this.w = (b3 >> 3) & 1;
                                }
                                if (this.w != this.k) {
                                    if (i == 0) {
                                        i2 = b3 & 247;
                                        if (i2 == 17 || (b4 & 240) != 48) {
                                            i3 = b3 & 246;
                                            if (i3 != 18 && (b4 & 224) == 32) {
                                                this.n.b();
                                                this.n.a((char) ((b3 & 1) == 0 ? E[b4 & 31] : F[b4 & 31]));
                                            } else if (i2 != 17 && (b4 & 240) == 32) {
                                                this.n.a(' ');
                                                boolean z5 = (b4 & 1) == 1;
                                                x9e x9eVar = this.n;
                                                x9eVar.a.add(new w9e((b4 >> 1) & 7, z5, x9eVar.c.length()));
                                            } else if ((b3 & 240) != 16 && (b4 & 192) == 64) {
                                                int i5 = z[b3 & 7];
                                                if ((b4 & 32) != 0) {
                                                    i5++;
                                                }
                                                x9e x9eVar2 = this.n;
                                                if (i5 != x9eVar2.d) {
                                                    if (this.q != 1 && !x9eVar2.e()) {
                                                        x9e x9eVar3 = new x9e(this.q, this.r);
                                                        this.n = x9eVar3;
                                                        this.m.add(x9eVar3);
                                                    }
                                                    x9eVar2 = this.n;
                                                    x9eVar2.d = i5;
                                                }
                                                boolean z6 = (b4 & 16) == 16;
                                                int i6 = (b4 >> 1) & 7;
                                                x9eVar2.a.add(new w9e(z6 ? 8 : i6, (b4 & 1) == 1, x9eVar2.c.length()));
                                                if (z6) {
                                                    this.n.e = A[i6];
                                                }
                                            } else if (i2 != 23 && b4 >= 33 && b4 <= 35) {
                                                this.n.f = b4 - 32;
                                            } else if (i3 == 20 && (b4 & 240) == 32) {
                                                if (b4 == 32) {
                                                    l(2);
                                                } else if (b4 != 41) {
                                                    switch (b4) {
                                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                            l(1);
                                                            this.r = (byte) 2;
                                                            this.n.h = (byte) 2;
                                                            break;
                                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                            l(1);
                                                            this.r = (byte) 3;
                                                            this.n.h = (byte) 3;
                                                            break;
                                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                                            l(1);
                                                            this.r = (byte) 4;
                                                            this.n.h = (byte) 4;
                                                            break;
                                                        default:
                                                            b = this.q;
                                                            if (b != 0) {
                                                                if (b4 != 33) {
                                                                    switch (b4) {
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                            this.o = Collections.EMPTY_LIST;
                                                                            if (b != 1 || b == 3) {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                            if (b == 1 && !this.n.e()) {
                                                                                x9e x9eVar4 = this.n;
                                                                                arrayList = x9eVar4.b;
                                                                                arrayList.add(x9eVar4.d());
                                                                                x9eVar4.c.setLength(0);
                                                                                x9eVar4.a.clear();
                                                                                iMin = Math.min((int) x9eVar4.h, x9eVar4.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                            k();
                                                                            break;
                                                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                            this.o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            this.n.a((char) D[b4 & 15]);
                                        }
                                    } else {
                                        x9e x9eVar5 = this.n;
                                        iArr = C;
                                        x9eVar5.a((char) iArr[(b3 & 127) - 32]);
                                        if ((b4 & 224) != 0) {
                                            this.n.a((char) iArr[(b4 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            k();
                            z3 = true;
                        }
                    } else if (this.t && this.u == b3 && this.v == b4) {
                        this.t = false;
                    } else {
                        this.t = true;
                        this.u = b3;
                        this.v = b4;
                        if (!z2) {
                            if (1 > b3) {
                                if ((b3 & 246) == 20) {
                                    if (b4 == 32) {
                                        this.x = true;
                                    } else {
                                        this.x = true;
                                    }
                                }
                            } else if ((b3 & 246) == 20) {
                                if (b4 == 32) {
                                    this.x = true;
                                } else {
                                    this.x = true;
                                }
                            }
                            if (this.x) {
                                i = b3 & 224;
                                if (i == 0) {
                                    this.w = (b3 >> 3) & 1;
                                }
                                if (this.w != this.k) {
                                    if (i == 0) {
                                        i2 = b3 & 247;
                                        if (i2 == 17) {
                                            i3 = b3 & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b3 & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b4 == 32) {
                                                                    l(2);
                                                                } else if (b4 != 41) {
                                                                    switch (b4) {
                                                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            l(1);
                                                                            this.r = (byte) 2;
                                                                            this.n.h = (byte) 2;
                                                                            break;
                                                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            l(1);
                                                                            this.r = (byte) 3;
                                                                            this.n.h = (byte) 3;
                                                                            break;
                                                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            l(1);
                                                                            this.r = (byte) 4;
                                                                            this.n.h = (byte) 4;
                                                                            break;
                                                                        default:
                                                                            b = this.q;
                                                                            if (b != 0) {
                                                                                if (b4 != 33) {
                                                                                    switch (b4) {
                                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.o = Collections.EMPTY_LIST;
                                                                                            if (b != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (b == 1) {
                                                                                                x9e x9eVar6 = this.n;
                                                                                                arrayList = x9eVar6.b;
                                                                                                arrayList.add(x9eVar6.d());
                                                                                                x9eVar6.c.setLength(0);
                                                                                                x9eVar6.a.clear();
                                                                                                iMin = Math.min((int) x9eVar6.h, x9eVar6.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            k();
                                                                                            break;
                                                                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.o = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (b == 1) {
                                                                                            x9e x9eVar7 = this.n;
                                                                                            arrayList = x9eVar7.b;
                                                                                            arrayList.add(x9eVar7.d());
                                                                                            x9eVar7.c.setLength(0);
                                                                                            x9eVar7.a.clear();
                                                                                            iMin = Math.min((int) x9eVar7.h, x9eVar7.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        k();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (b == 1) {
                                                                                            x9e x9eVar8 = this.n;
                                                                                            arrayList = x9eVar8.b;
                                                                                            arrayList.add(x9eVar8.d());
                                                                                            x9eVar8.c.setLength(0);
                                                                                            x9eVar8.a.clear();
                                                                                            iMin = Math.min((int) x9eVar8.h, x9eVar8.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        k();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar9 = this.n;
                                                                                        arrayList = x9eVar9.b;
                                                                                        arrayList.add(x9eVar9.d());
                                                                                        x9eVar9.c.setLength(0);
                                                                                        x9eVar9.a.clear();
                                                                                        iMin = Math.min((int) x9eVar9.h, x9eVar9.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b3 & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (b == 1) {
                                                                                            x9e x9eVar10 = this.n;
                                                                                            arrayList = x9eVar10.b;
                                                                                            arrayList.add(x9eVar10.d());
                                                                                            x9eVar10.c.setLength(0);
                                                                                            x9eVar10.a.clear();
                                                                                            iMin = Math.min((int) x9eVar10.h, x9eVar10.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        k();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar11 = this.n;
                                                                                        arrayList = x9eVar11.b;
                                                                                        arrayList.add(x9eVar11.d());
                                                                                        x9eVar11.c.setLength(0);
                                                                                        x9eVar11.a.clear();
                                                                                        iMin = Math.min((int) x9eVar11.h, x9eVar11.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar12 = this.n;
                                                                                        arrayList = x9eVar12.b;
                                                                                        arrayList.add(x9eVar12.d());
                                                                                        x9eVar12.c.setLength(0);
                                                                                        x9eVar12.a.clear();
                                                                                        iMin = Math.min((int) x9eVar12.h, x9eVar12.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (b == 1) {
                                                                                    x9e x9eVar13 = this.n;
                                                                                    arrayList = x9eVar13.b;
                                                                                    arrayList.add(x9eVar13.d());
                                                                                    x9eVar13.c.setLength(0);
                                                                                    x9eVar13.a.clear();
                                                                                    iMin = Math.min((int) x9eVar13.h, x9eVar13.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                k();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b3 & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (b == 1) {
                                                                                            x9e x9eVar14 = this.n;
                                                                                            arrayList = x9eVar14.b;
                                                                                            arrayList.add(x9eVar14.d());
                                                                                            x9eVar14.c.setLength(0);
                                                                                            x9eVar14.a.clear();
                                                                                            iMin = Math.min((int) x9eVar14.h, x9eVar14.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        k();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar15 = this.n;
                                                                                        arrayList = x9eVar15.b;
                                                                                        arrayList.add(x9eVar15.d());
                                                                                        x9eVar15.c.setLength(0);
                                                                                        x9eVar15.a.clear();
                                                                                        iMin = Math.min((int) x9eVar15.h, x9eVar15.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar16 = this.n;
                                                                                        arrayList = x9eVar16.b;
                                                                                        arrayList.add(x9eVar16.d());
                                                                                        x9eVar16.c.setLength(0);
                                                                                        x9eVar16.a.clear();
                                                                                        iMin = Math.min((int) x9eVar16.h, x9eVar16.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (b == 1) {
                                                                                    x9e x9eVar17 = this.n;
                                                                                    arrayList = x9eVar17.b;
                                                                                    arrayList.add(x9eVar17.d());
                                                                                    x9eVar17.c.setLength(0);
                                                                                    x9eVar17.a.clear();
                                                                                    iMin = Math.min((int) x9eVar17.h, x9eVar17.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                k();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b3 & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar18 = this.n;
                                                                                        arrayList = x9eVar18.b;
                                                                                        arrayList.add(x9eVar18.d());
                                                                                        x9eVar18.c.setLength(0);
                                                                                        x9eVar18.a.clear();
                                                                                        iMin = Math.min((int) x9eVar18.h, x9eVar18.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (b == 1) {
                                                                                    x9e x9eVar19 = this.n;
                                                                                    arrayList = x9eVar19.b;
                                                                                    arrayList.add(x9eVar19.d());
                                                                                    x9eVar19.c.setLength(0);
                                                                                    x9eVar19.a.clear();
                                                                                    iMin = Math.min((int) x9eVar19.h, x9eVar19.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                k();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (b == 1) {
                                                                                    x9e x9eVar110 = this.n;
                                                                                    arrayList = x9eVar110.b;
                                                                                    arrayList.add(x9eVar110.d());
                                                                                    x9eVar110.c.setLength(0);
                                                                                    x9eVar110.a.clear();
                                                                                    iMin = Math.min((int) x9eVar110.h, x9eVar110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                k();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b4 == 32) {
                                                    l(2);
                                                } else if (b4 != 41) {
                                                    switch (b4) {
                                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                            l(1);
                                                            this.r = (byte) 2;
                                                            this.n.h = (byte) 2;
                                                            break;
                                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                            l(1);
                                                            this.r = (byte) 3;
                                                            this.n.h = (byte) 3;
                                                            break;
                                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                                            l(1);
                                                            this.r = (byte) 4;
                                                            this.n.h = (byte) 4;
                                                            break;
                                                        default:
                                                            b = this.q;
                                                            if (b != 0) {
                                                                if (b4 != 33) {
                                                                    switch (b4) {
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                            this.o = Collections.EMPTY_LIST;
                                                                            if (b != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                            if (b == 1) {
                                                                                x9e x9eVar111 = this.n;
                                                                                arrayList = x9eVar111.b;
                                                                                arrayList.add(x9eVar111.d());
                                                                                x9eVar111.c.setLength(0);
                                                                                x9eVar111.a.clear();
                                                                                iMin = Math.min((int) x9eVar111.h, x9eVar111.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                            k();
                                                                            break;
                                                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                            this.o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            i3 = b3 & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b3 & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b4 == 32) {
                                                                    l(2);
                                                                } else if (b4 != 41) {
                                                                    switch (b4) {
                                                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            l(1);
                                                                            this.r = (byte) 2;
                                                                            this.n.h = (byte) 2;
                                                                            break;
                                                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            l(1);
                                                                            this.r = (byte) 3;
                                                                            this.n.h = (byte) 3;
                                                                            break;
                                                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            l(1);
                                                                            this.r = (byte) 4;
                                                                            this.n.h = (byte) 4;
                                                                            break;
                                                                        default:
                                                                            b = this.q;
                                                                            if (b != 0) {
                                                                                if (b4 != 33) {
                                                                                    switch (b4) {
                                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.o = Collections.EMPTY_LIST;
                                                                                            if (b != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (b == 1) {
                                                                                                x9e x9eVar112 = this.n;
                                                                                                arrayList = x9eVar112.b;
                                                                                                arrayList.add(x9eVar112.d());
                                                                                                x9eVar112.c.setLength(0);
                                                                                                x9eVar112.a.clear();
                                                                                                iMin = Math.min((int) x9eVar112.h, x9eVar112.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            k();
                                                                                            break;
                                                                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.o = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (b == 1) {
                                                                                            x9e x9eVar113 = this.n;
                                                                                            arrayList = x9eVar113.b;
                                                                                            arrayList.add(x9eVar113.d());
                                                                                            x9eVar113.c.setLength(0);
                                                                                            x9eVar113.a.clear();
                                                                                            iMin = Math.min((int) x9eVar113.h, x9eVar113.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        k();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (b == 1) {
                                                                                            x9e x9eVar114 = this.n;
                                                                                            arrayList = x9eVar114.b;
                                                                                            arrayList.add(x9eVar114.d());
                                                                                            x9eVar114.c.setLength(0);
                                                                                            x9eVar114.a.clear();
                                                                                            iMin = Math.min((int) x9eVar114.h, x9eVar114.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        k();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar115 = this.n;
                                                                                        arrayList = x9eVar115.b;
                                                                                        arrayList.add(x9eVar115.d());
                                                                                        x9eVar115.c.setLength(0);
                                                                                        x9eVar115.a.clear();
                                                                                        iMin = Math.min((int) x9eVar115.h, x9eVar115.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b3 & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (b == 1) {
                                                                                            x9e x9eVar116 = this.n;
                                                                                            arrayList = x9eVar116.b;
                                                                                            arrayList.add(x9eVar116.d());
                                                                                            x9eVar116.c.setLength(0);
                                                                                            x9eVar116.a.clear();
                                                                                            iMin = Math.min((int) x9eVar116.h, x9eVar116.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        k();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar117 = this.n;
                                                                                        arrayList = x9eVar117.b;
                                                                                        arrayList.add(x9eVar117.d());
                                                                                        x9eVar117.c.setLength(0);
                                                                                        x9eVar117.a.clear();
                                                                                        iMin = Math.min((int) x9eVar117.h, x9eVar117.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar118 = this.n;
                                                                                        arrayList = x9eVar118.b;
                                                                                        arrayList.add(x9eVar118.d());
                                                                                        x9eVar118.c.setLength(0);
                                                                                        x9eVar118.a.clear();
                                                                                        iMin = Math.min((int) x9eVar118.h, x9eVar118.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (b == 1) {
                                                                                    x9e x9eVar119 = this.n;
                                                                                    arrayList = x9eVar119.b;
                                                                                    arrayList.add(x9eVar119.d());
                                                                                    x9eVar119.c.setLength(0);
                                                                                    x9eVar119.a.clear();
                                                                                    iMin = Math.min((int) x9eVar119.h, x9eVar119.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                k();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b3 & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (b == 1) {
                                                                                            x9e x9eVar1110 = this.n;
                                                                                            arrayList = x9eVar1110.b;
                                                                                            arrayList.add(x9eVar1110.d());
                                                                                            x9eVar1110.c.setLength(0);
                                                                                            x9eVar1110.a.clear();
                                                                                            iMin = Math.min((int) x9eVar1110.h, x9eVar1110.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        k();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar1111 = this.n;
                                                                                        arrayList = x9eVar1111.b;
                                                                                        arrayList.add(x9eVar1111.d());
                                                                                        x9eVar1111.c.setLength(0);
                                                                                        x9eVar1111.a.clear();
                                                                                        iMin = Math.min((int) x9eVar1111.h, x9eVar1111.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar1112 = this.n;
                                                                                        arrayList = x9eVar1112.b;
                                                                                        arrayList.add(x9eVar1112.d());
                                                                                        x9eVar1112.c.setLength(0);
                                                                                        x9eVar1112.a.clear();
                                                                                        iMin = Math.min((int) x9eVar1112.h, x9eVar1112.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (b == 1) {
                                                                                    x9e x9eVar1113 = this.n;
                                                                                    arrayList = x9eVar1113.b;
                                                                                    arrayList.add(x9eVar1113.d());
                                                                                    x9eVar1113.c.setLength(0);
                                                                                    x9eVar1113.a.clear();
                                                                                    iMin = Math.min((int) x9eVar1113.h, x9eVar1113.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                k();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b3 & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (b == 1) {
                                                                                        x9e x9eVar1114 = this.n;
                                                                                        arrayList = x9eVar1114.b;
                                                                                        arrayList.add(x9eVar1114.d());
                                                                                        x9eVar1114.c.setLength(0);
                                                                                        x9eVar1114.a.clear();
                                                                                        iMin = Math.min((int) x9eVar1114.h, x9eVar1114.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    k();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (b == 1) {
                                                                                    x9e x9eVar1115 = this.n;
                                                                                    arrayList = x9eVar1115.b;
                                                                                    arrayList.add(x9eVar1115.d());
                                                                                    x9eVar1115.c.setLength(0);
                                                                                    x9eVar1115.a.clear();
                                                                                    iMin = Math.min((int) x9eVar1115.h, x9eVar1115.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                k();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (b == 1) {
                                                                                    x9e x9eVar1116 = this.n;
                                                                                    arrayList = x9eVar1116.b;
                                                                                    arrayList.add(x9eVar1116.d());
                                                                                    x9eVar1116.c.setLength(0);
                                                                                    x9eVar1116.a.clear();
                                                                                    iMin = Math.min((int) x9eVar1116.h, x9eVar1116.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                k();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b4 == 32) {
                                                    l(2);
                                                } else if (b4 != 41) {
                                                    switch (b4) {
                                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                            l(1);
                                                            this.r = (byte) 2;
                                                            this.n.h = (byte) 2;
                                                            break;
                                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                            l(1);
                                                            this.r = (byte) 3;
                                                            this.n.h = (byte) 3;
                                                            break;
                                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                                            l(1);
                                                            this.r = (byte) 4;
                                                            this.n.h = (byte) 4;
                                                            break;
                                                        default:
                                                            b = this.q;
                                                            if (b != 0) {
                                                                if (b4 != 33) {
                                                                    switch (b4) {
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                            this.o = Collections.EMPTY_LIST;
                                                                            if (b != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                            if (b == 1) {
                                                                                x9e x9eVar1117 = this.n;
                                                                                arrayList = x9eVar1117.b;
                                                                                arrayList.add(x9eVar1117.d());
                                                                                x9eVar1117.c.setLength(0);
                                                                                x9eVar1117.a.clear();
                                                                                iMin = Math.min((int) x9eVar1117.h, x9eVar1117.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                            k();
                                                                            break;
                                                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                            this.o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        x9e x9eVar20 = this.n;
                                        iArr = C;
                                        x9eVar20.a((char) iArr[(b3 & 127) - 32]);
                                        if ((b4 & 224) != 0) {
                                            this.n.a((char) iArr[(b4 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            k();
                            z3 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p.fae, p.ear
    /* JADX INFO: renamed from: h */
    public final eae b() {
        eae eaeVar;
        eae eaeVarB = super.b();
        if (eaeVarB != null) {
            return eaeVarB;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (eaeVar = (eae) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        gae gaeVarF = f();
        long j3 = this.e;
        eaeVar.b = j3;
        eaeVar.d = gaeVarF;
        eaeVar.e = j3;
        return eaeVar;
    }

    @Override // p.fae
    public final boolean i() {
        return this.o != this.f174p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            feo feoVarC = ((x9e) arrayList.get(i)).c(os00.INVALID_ID);
            arrayList2.add(feoVarC);
            if (feoVarC != null) {
                iMin = Math.min(iMin, feoVarC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            feo feoVarC2 = (feo) arrayList2.get(i2);
            if (feoVarC2 != null) {
                if (feoVarC2.i != iMin) {
                    feoVarC2 = ((x9e) arrayList.get(i2)).c(iMin);
                    feoVarC2.getClass();
                }
                arrayList3.add(feoVarC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        x9e x9eVar = this.n;
        x9eVar.g = this.q;
        x9eVar.a.clear();
        x9eVar.b.clear();
        x9eVar.c.setLength(0);
        x9eVar.d = 15;
        x9eVar.e = 0;
        x9eVar.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i) {
        byte b = this.q;
        if (b == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            k();
            if (b == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((x9e) arrayList.get(i2)).g = i;
            i2++;
        }
    }

    @Override // p.fae, p.ear
    public final void release() {
    }
}
