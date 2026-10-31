package p;

import androidx.datastore.preferences.protobuf.a;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xng0 {
    /* JADX WARN: Code duplicated, block: B:43:0x0118  */
    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:49:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0145  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x0169  */
    /* JADX WARN: Code duplicated, block: B:59:0x0171  */
    /* JADX WARN: Code duplicated, block: B:60:0x0178  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0186  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0191  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121 A[SYNTHETIC] */
    public static int a(int i, Object obj, Object obj2) {
        int iE0;
        int i2;
        mul1 mul1Var;
        int iR0;
        rng0 rng0Var = (rng0) obj;
        eng0 eng0Var = (eng0) obj2;
        if (rng0Var.isEmpty()) {
            return 0;
        }
        int iT0 = 0;
        for (Map.Entry entry : rng0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            eng0Var.getClass();
            int iR1 = qwg.R0(i);
            uo5 uo5Var = eng0Var.a;
            mul1 mul1Var2 = (mul1) uo5Var.b;
            int i3 = n220.c;
            int iE1 = 1;
            int iR2 = qwg.R0(1);
            dul1 dul1Var = mul1.d;
            if (mul1Var2 == dul1Var) {
                iR2 *= 2;
            }
            switch (mul1Var2.ordinal()) {
                case 0:
                    ((Double) key).getClass();
                    iE0 = 8;
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i4 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i4) + i4 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i5 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i5) + i5 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i6 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i6) + i6 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i7 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i7) + i7 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i8 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i8) + i8 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i9 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i9) + i9 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i10 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i10) + i10 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11) + i11 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i12 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i12) + i12 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i13 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i13) + i13 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i14 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i14) + i14 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i15 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i15) + i15 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i16 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i16) + i16 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i17 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i17) + i17 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i18 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i18) + i18 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i19 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i19) + i19 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i110) + i110 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111) + i111 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 1:
                    ((Float) key).getClass();
                    iE0 = 4;
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i112) + i112 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i113) + i113 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i114) + i114 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i115) + i115 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i116) + i116 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i117) + i117 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i118) + i118 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i119) + i119 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i1110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1110) + i1110 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i1111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111) + i1111 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i1112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1112) + i1112 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i1113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1113) + i1113 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i1114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1114) + i1114 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i1115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1115) + i1115 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i1116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1116) + i1116 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1117) + i1117 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i1118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1118) + i1118 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i1119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1119) + i1119 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 2:
                    iE0 = qwg.E0(((Long) key).longValue());
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i11110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11110) + i11110 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i11111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111) + i11111 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i11112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11112) + i11112 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i11113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11113) + i11113 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i11114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11114) + i11114 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i11115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11115) + i11115 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11116) + i11116 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11117) + i11117 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i11118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11118) + i11118 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i11119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11119) + i11119 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111110) + i111110 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111) + i111111 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111112) + i111112 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111113) + i111113 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111114) + i111114 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111115) + i111115 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111116) + i111116 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111117) + i111117 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 3:
                    iE0 = qwg.V0(((Long) key).longValue());
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111118) + i111118 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111119) + i111119 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i1111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111110) + i1111110 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i1111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111) + i1111111 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i1111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111112) + i1111112 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111113) + i1111113 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i1111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111114) + i1111114 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111115) + i1111115 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i1111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111116) + i1111116 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i1111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111117) + i1111117 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i1111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111118) + i1111118 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i1111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111119) + i1111119 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i11111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111110) + i11111110 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i11111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111) + i11111111 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111112) + i11111112 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i11111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111113) + i11111113 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i11111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111114) + i11111114 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i11111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111115) + i11111115 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 4:
                    iE0 = qwg.C0(((Integer) key).intValue());
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i11111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111116) + i11111116 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i11111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111117) + i11111117 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i11111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111118) + i11111118 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i11111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111119) + i11111119 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111110) + i111111110 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111) + i111111111 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111112) + i111111112 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111113) + i111111113 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111114) + i111111114 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111115) + i111111115 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111116) + i111111116 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111117) + i111111117 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111118) + i111111118 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111119) + i111111119 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i1111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111110) + i1111111110 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111) + i1111111111 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i1111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111112) + i1111111112 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i1111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111113) + i1111111113 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 5:
                    ((Long) key).getClass();
                    iE0 = 8;
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i1111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111114) + i1111111114 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i1111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111115) + i1111111115 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i1111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111116) + i1111111116 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i1111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111117) + i1111111117 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i1111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111118) + i1111111118 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111119) + i1111111119 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111110) + i11111111110 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111) + i11111111111 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i11111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111112) + i11111111112 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i11111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111113) + i11111111113 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i11111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111114) + i11111111114 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i11111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111115) + i11111111115 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i11111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111116) + i11111111116 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i11111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111117) + i11111111117 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111118) + i11111111118 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i11111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111119) + i11111111119 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111110) + i111111111110 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111) + i111111111111 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 6:
                    ((Integer) key).getClass();
                    iE0 = 4;
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111112) + i111111111112 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111113) + i111111111113 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111114) + i111111111114 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111115) + i111111111115 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111116) + i111111111116 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111117) + i111111111117 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111118) + i111111111118 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111119) + i111111111119 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i1111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111110) + i1111111111110 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i1111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111) + i1111111111111 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i1111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111112) + i1111111111112 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i1111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111113) + i1111111111113 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i1111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111114) + i1111111111114 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i1111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111115) + i1111111111115 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i1111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111116) + i1111111111116 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111117) + i1111111111117 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i1111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111118) + i1111111111118 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i1111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111119) + i1111111111119 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 7:
                    ((Boolean) key).getClass();
                    iE0 = 1;
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i11111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111110) + i11111111111110 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i11111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111) + i11111111111111 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i11111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111112) + i11111111111112 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i11111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111113) + i11111111111113 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i11111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111114) + i11111111111114 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i11111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111115) + i11111111111115 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111116) + i11111111111116 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111117) + i11111111111117 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i11111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111118) + i11111111111118 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i11111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111119) + i11111111111119 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111110) + i111111111111110 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111) + i111111111111111 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111112) + i111111111111112 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111113) + i111111111111113 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111114) + i111111111111114 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111115) + i111111111111115 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111116) + i111111111111116 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111117) + i111111111111117 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 8:
                    iE0 = key instanceof ihc ? qwg.s0((ihc) key) : qwg.Q0((String) key);
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111118) + i111111111111118 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111119) + i111111111111119 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i1111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111110) + i1111111111111110 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i1111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111) + i1111111111111111 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i1111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111112) + i1111111111111112 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111113) + i1111111111111113 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i1111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111114) + i1111111111111114 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111115) + i1111111111111115 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i1111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111116) + i1111111111111116 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i1111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111117) + i1111111111111117 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i1111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111118) + i1111111111111118 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i1111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111119) + i1111111111111119 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i11111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111110) + i11111111111111110 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i11111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111) + i11111111111111111 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111112) + i11111111111111112 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i11111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111113) + i11111111111111113 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i11111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111114) + i11111111111111114 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i11111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111115) + i11111111111111115 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 9:
                    iE0 = qwg.A0((a) key);
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i11111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111116) + i11111111111111116 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i11111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111117) + i11111111111111117 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i11111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111118) + i11111111111111118 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i11111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111119) + i11111111111111119 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111110) + i111111111111111110 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111) + i111111111111111111 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111112) + i111111111111111112 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111113) + i111111111111111113 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111114) + i111111111111111114 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111115) + i111111111111111115 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111116) + i111111111111111116 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111117) + i111111111111111117 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111118) + i111111111111111118 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111119) + i111111111111111119 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i1111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111110) + i1111111111111111110 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111) + i1111111111111111111 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i1111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111112) + i1111111111111111112 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i1111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111113) + i1111111111111111113 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 10:
                    iE0 = qwg.G0((a) key);
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i1111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111114) + i1111111111111111114 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i1111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111115) + i1111111111111111115 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i1111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111116) + i1111111111111111116 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i1111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111117) + i1111111111111111117 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i1111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111118) + i1111111111111111118 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111119) + i1111111111111111119 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111110) + i11111111111111111110 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111) + i11111111111111111111 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i11111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111112) + i11111111111111111112 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i11111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111113) + i11111111111111111113 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i11111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111114) + i11111111111111111114 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i11111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111115) + i11111111111111111115 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i11111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111116) + i11111111111111111116 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i11111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111117) + i11111111111111111117 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111118) + i11111111111111111118 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i11111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111119) + i11111111111111111119 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111110) + i111111111111111111110 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111) + i111111111111111111111 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 11:
                    iE0 = key instanceof ihc ? qwg.s0((ihc) key) : qwg.q0((byte[]) key);
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111112) + i111111111111111111112 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111113) + i111111111111111111113 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111114) + i111111111111111111114 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111115) + i111111111111111111115 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111116) + i111111111111111111116 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111117) + i111111111111111111117 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111118) + i111111111111111111118 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111119) + i111111111111111111119 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i1111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111110) + i1111111111111111111110 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i1111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111) + i1111111111111111111111 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i1111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111112) + i1111111111111111111112 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i1111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111113) + i1111111111111111111113 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i1111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111114) + i1111111111111111111114 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i1111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111115) + i1111111111111111111115 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i1111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111116) + i1111111111111111111116 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111117) + i1111111111111111111117 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i1111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111118) + i1111111111111111111118 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i1111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111119) + i1111111111111111111119 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 12:
                    iE0 = qwg.T0(((Integer) key).intValue());
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i11111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111110) + i11111111111111111111110 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i11111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111) + i11111111111111111111111 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i11111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111112) + i11111111111111111111112 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i11111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111113) + i11111111111111111111113 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i11111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111114) + i11111111111111111111114 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i11111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111115) + i11111111111111111111115 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111116) + i11111111111111111111116 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111117) + i11111111111111111111117 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i11111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111118) + i11111111111111111111118 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i11111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111119) + i11111111111111111111119 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i111111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111110) + i111111111111111111111110 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i111111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111) + i111111111111111111111111 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i111111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111112) + i111111111111111111111112 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i111111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111113) + i111111111111111111111113 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i111111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111114) + i111111111111111111111114 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i111111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111115) + i111111111111111111111115 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i111111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111116) + i111111111111111111111116 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i111111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111117) + i111111111111111111111117 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 13:
                    iE0 = qwg.v0(((Integer) key).intValue());
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i111111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111118) + i111111111111111111111118 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i111111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111119) + i111111111111111111111119 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i1111111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111110) + i1111111111111111111111110 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i1111111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111) + i1111111111111111111111111 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i1111111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111112) + i1111111111111111111111112 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111113) + i1111111111111111111111113 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i1111111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111114) + i1111111111111111111111114 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111115) + i1111111111111111111111115 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i1111111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111116) + i1111111111111111111111116 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i1111111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111117) + i1111111111111111111111117 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i1111111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111118) + i1111111111111111111111118 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i1111111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111119) + i1111111111111111111111119 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i11111111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111110) + i11111111111111111111111110 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i11111111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111) + i11111111111111111111111111 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111112) + i11111111111111111111111112 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i11111111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111113) + i11111111111111111111111113 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i11111111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111114) + i11111111111111111111111114 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i11111111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111115) + i11111111111111111111111115 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 14:
                    ((Integer) key).getClass();
                    iE0 = 4;
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i11111111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111116) + i11111111111111111111111116 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i11111111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111117) + i11111111111111111111111117 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i11111111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111118) + i11111111111111111111111118 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i11111111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111119) + i11111111111111111111111119 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i111111111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111110) + i111111111111111111111111110 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i111111111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111) + i111111111111111111111111111 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i111111111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111112) + i111111111111111111111111112 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111113) + i111111111111111111111111113 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i111111111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111114) + i111111111111111111111111114 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i111111111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111115) + i111111111111111111111111115 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i111111111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111116) + i111111111111111111111111116 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i111111111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111117) + i111111111111111111111111117 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i111111111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111118) + i111111111111111111111111118 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i111111111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111119) + i111111111111111111111111119 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i1111111111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111110) + i1111111111111111111111111110 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111) + i1111111111111111111111111111 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i1111111111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111112) + i1111111111111111111111111112 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i1111111111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111113) + i1111111111111111111111111113 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 15:
                    ((Long) key).getClass();
                    iE0 = 8;
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i1111111111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111114) + i1111111111111111111111111114 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i1111111111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111115) + i1111111111111111111111111115 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i1111111111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111116) + i1111111111111111111111111116 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i1111111111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111117) + i1111111111111111111111111117 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i1111111111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111118) + i1111111111111111111111111118 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111119) + i1111111111111111111111111119 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111110) + i11111111111111111111111111110 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111) + i11111111111111111111111111111 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i11111111111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111112) + i11111111111111111111111111112 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i11111111111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111113) + i11111111111111111111111111113 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i11111111111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111114) + i11111111111111111111111111114 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i11111111111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111115) + i11111111111111111111111111115 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i11111111111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111116) + i11111111111111111111111111116 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i11111111111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111117) + i11111111111111111111111111117 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111118) + i11111111111111111111111111118 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i11111111111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111119) + i11111111111111111111111111119 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i111111111111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111110) + i111111111111111111111111111110 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i111111111111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111111) + i111111111111111111111111111111 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 16:
                    iE0 = qwg.M0(((Integer) key).intValue());
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i111111111111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111112) + i111111111111111111111111111112 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i111111111111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111113) + i111111111111111111111111111113 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i111111111111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111114) + i111111111111111111111111111114 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i111111111111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111115) + i111111111111111111111111111115 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i111111111111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111116) + i111111111111111111111111111116 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i111111111111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111117) + i111111111111111111111111111117 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i111111111111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111118) + i111111111111111111111111111118 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111119) + i111111111111111111111111111119 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i1111111111111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111110) + i1111111111111111111111111111110 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i1111111111111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111111) + i1111111111111111111111111111111 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i1111111111111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111112) + i1111111111111111111111111111112 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i1111111111111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111113) + i1111111111111111111111111111113 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i1111111111111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111114) + i1111111111111111111111111111114 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i1111111111111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111115) + i1111111111111111111111111111115 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i1111111111111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111116) + i1111111111111111111111111111116 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i1111111111111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111117) + i1111111111111111111111111111117 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i1111111111111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111118) + i1111111111111111111111111111118 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i1111111111111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i1111111111111111111111111111119) + i1111111111111111111111111111119 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                case 17:
                    iE0 = qwg.O0(((Long) key).longValue());
                    i2 = iE0 + iR2;
                    mul1Var = (mul1) uo5Var.c;
                    iR0 = qwg.R0(2);
                    if (mul1Var == dul1Var) {
                        iR0 *= 2;
                    }
                    switch (mul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iE1 = 8;
                            int i11111111111111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111110) + i11111111111111111111111111111110 + iR1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iE1 = 4;
                            int i11111111111111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111111) + i11111111111111111111111111111111 + iR1;
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            int i11111111111111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111112) + i11111111111111111111111111111112 + iR1;
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            int i11111111111111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111113) + i11111111111111111111111111111113 + iR1;
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            int i11111111111111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111114) + i11111111111111111111111111111114 + iR1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i11111111111111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111115) + i11111111111111111111111111111115 + iR1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i11111111111111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111116) + i11111111111111111111111111111116 + iR1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111117) + i11111111111111111111111111111117 + iR1;
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            int i11111111111111111111111111111118 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111118) + i11111111111111111111111111111118 + iR1;
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            int i11111111111111111111111111111119 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i11111111111111111111111111111119) + i11111111111111111111111111111119 + iR1;
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            int i111111111111111111111111111111110 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111111110) + i111111111111111111111111111111110 + iR1;
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            int i111111111111111111111111111111111 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111111111) + i111111111111111111111111111111111 + iR1;
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            int i111111111111111111111111111111112 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111111112) + i111111111111111111111111111111112 + iR1;
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            int i111111111111111111111111111111113 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111111113) + i111111111111111111111111111111113 + iR1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iE1 = 4;
                            int i111111111111111111111111111111114 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111111114) + i111111111111111111111111111111114 + iR1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iE1 = 8;
                            int i111111111111111111111111111111115 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111111115) + i111111111111111111111111111111115 + iR1;
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            int i111111111111111111111111111111116 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111111116) + i111111111111111111111111111111116 + iR1;
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            int i111111111111111111111111111111117 = iE1 + iR0 + i2;
                            iT0 += qwg.T0(i111111111111111111111111111111117) + i111111111111111111111111111111117 + iR1;
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                    }
                    break;
                default:
                    jah.g("There is no way to get here, but the compiler thinks otherwise.");
                    return 0;
            }
        }
        return iT0;
    }

    public static rng0 b(Object obj, Object obj2) {
        rng0 rng0VarB = (rng0) obj;
        rng0 rng0Var = (rng0) obj2;
        if (!rng0Var.isEmpty()) {
            if (!rng0VarB.a) {
                rng0VarB = rng0VarB.b();
            }
            rng0VarB.a();
            if (!rng0Var.isEmpty()) {
                rng0VarB.putAll(rng0Var);
            }
        }
        return rng0VarB;
    }
}
