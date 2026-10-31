package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bgn1 implements tap1 {
    public final /* synthetic */ byte a = 0;
    public final byte[] b;
    public final Object c;
    public final Object d;

    public bgn1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!boo1.D(1)) {
            bhn0.p(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
            throw null;
        }
        if (bArr.length != 32) {
            hhg1.n("Given public key's length is not 32.");
            throw null;
        }
        this.b = (byte[]) bArr.clone();
        this.d = bArr2;
        this.c = bArr3;
        if (hcp1.a != null) {
            return;
        }
        eg.m("Could not initialize Ed25519.");
        throw null;
    }

    public static byte[] c(kap1 kap1Var) throws GeneralSecurityException {
        mhn1 mhn1VarA;
        clv clvVar = (clv) kap1Var.d;
        String str = clvVar.b;
        Integer num = (Integer) kap1Var.e;
        if (clvVar == clv.h) {
            if (num != null) {
                k220.r("RAW output prefix type cannot have an id requirement");
                return null;
            }
            mhn1VarA = sep1.a;
        } else {
            if (num == null) {
                throw new GeneralSecurityException(l1d.q(new StringBuilder(str.length() + 40), "idRequirement must be non-null for ", str, " type"));
            }
            if (clvVar == clv.f) {
                mhn1VarA = sep1.b(num.intValue());
            } else {
                if (clvVar != clv.g && clvVar != clv.i) {
                    throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(str));
                }
                mhn1VarA = sep1.a(num.intValue());
            }
        }
        return mhn1VarA.b();
    }

    @Override // p.tap1
    public final void a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        byte b = this.a;
        byte[] bArr3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                tap1 tap1Var = (tap1) obj2;
                byte[] bArr4 = (byte[]) obj;
                int length = bArr3.length;
                if (length == 0 && bArr4.length == 0) {
                    tap1Var.a(bArr, bArr2);
                } else if (!xgp1.a(bArr3, bArr)) {
                    k220.r("Invalid signature (output prefix mismatch)");
                } else {
                    if (bArr4.length != 0) {
                        bArr2 = z0o1.x(new byte[][]{bArr2, bArr4});
                    }
                    tap1Var.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                }
                break;
            case 1:
                if (!xgp1.a(bArr3, bArr)) {
                    k220.r("Invalid signature (output prefix mismatch)");
                    break;
                } else {
                    int length2 = bArr.length;
                    int length3 = bArr3.length;
                    if (length2 != length3 + 7856) {
                        k220.r("Invalid signature length");
                        break;
                    } else {
                        Signature signature = Signature.getInstance("SLH-DSA-SHA2-128S", (Provider) obj);
                        signature.initVerify((PublicKey) obj2);
                        signature.update(bArr2);
                        if (!signature.verify(bArr, length3, 7856)) {
                            k220.r("Invalid signature");
                            break;
                        }
                    }
                }
                break;
            default:
                byte[] bArr5 = (byte[]) obj2;
                byte[] bArr6 = (byte[]) obj;
                int length4 = bArr6.length;
                if (length4 == 0 && bArr5.length == 0) {
                    b(bArr, bArr2);
                } else if (!xgp1.a(bArr6, bArr)) {
                    k220.r("Invalid signature (output prefix mismatch)");
                } else {
                    if (bArr5.length != 0) {
                        bArr2 = z0o1.x(new byte[][]{bArr2, bArr5});
                    }
                    b(Arrays.copyOfRange(bArr, length4, bArr.length), bArr2);
                }
                break;
        }
    }

    public void b(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            k220.r("The length of the signature is not 64.");
            return;
        }
        if (bArr.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 32, 64);
            for (int i = 31; i >= 0; i--) {
                int i2 = bArrCopyOfRange[i] & 255;
                int i3 = fcp1.c[i] & 255;
                if (i2 != i3) {
                    if (i2 >= i3) {
                        break;
                    }
                    MessageDigest messageDigest = (MessageDigest) ygn1.c.a.zza("SHA-512");
                    messageDigest.update(bArr, 0, 32);
                    byte[] bArr3 = this.b;
                    messageDigest.update(bArr3);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jI = fcp1.i(bArrDigest, 0) & 2097151;
                    long j = fcp1.j(bArrDigest, 2) >> 5;
                    long jI2 = fcp1.i(bArrDigest, 5) >> 2;
                    long j2 = fcp1.j(bArrDigest, 7) >> 7;
                    long j3 = fcp1.j(bArrDigest, 10) >> 4;
                    long jI3 = fcp1.i(bArrDigest, 13) >> 1;
                    long j4 = fcp1.j(bArrDigest, 15) >> 6;
                    long jI4 = fcp1.i(bArrDigest, 18) >> 3;
                    long jI5 = fcp1.i(bArrDigest, 21) & 2097151;
                    long j5 = fcp1.j(bArrDigest, 23) >> 5;
                    long jI6 = fcp1.i(bArrDigest, 26) >> 2;
                    long j6 = fcp1.j(bArrDigest, 28) >> 7;
                    long j7 = fcp1.j(bArrDigest, 31) >> 4;
                    long jI7 = fcp1.i(bArrDigest, 34) >> 1;
                    long j8 = fcp1.j(bArrDigest, 36) >> 6;
                    long jI8 = fcp1.i(bArrDigest, 39) >> 3;
                    long jI9 = fcp1.i(bArrDigest, 42) & 2097151;
                    long j9 = fcp1.j(bArrDigest, 44) >> 5;
                    long jI10 = (fcp1.i(bArrDigest, 47) >> 2) & 2097151;
                    long j10 = (fcp1.j(bArrDigest, 49) >> 7) & 2097151;
                    long j11 = (fcp1.j(bArrDigest, 52) >> 4) & 2097151;
                    long jI11 = (fcp1.i(bArrDigest, 55) >> 1) & 2097151;
                    long j12 = (fcp1.j(bArrDigest, 57) >> 6) & 2097151;
                    long j13 = fcp1.j(bArrDigest, 60) >> 3;
                    long j14 = (j11 * 666643) + jI5;
                    long j15 = (j10 * 666643) + jI4;
                    long j16 = (jI10 * 666643) + (j4 & 2097151);
                    long j17 = (j16 + 1048576) >> 21;
                    long j18 = j17 << 21;
                    long j19 = (jI10 * 654183) + (j10 * 470296) + j14;
                    long j20 = (j19 + 1048576) >> 21;
                    long j21 = j20 << 21;
                    long j22 = (jI10 * 136657) + (((j11 * 654183) + ((jI11 * 470296) + ((j12 * 666643) + (jI6 & 2097151)))) - (j10 * 997805));
                    long j23 = (j22 + 1048576) >> 21;
                    long j24 = j23 << 21;
                    long j25 = ((j11 * 136657) + (((j12 * 654183) + ((j13 * 470296) + (j7 & 2097151))) - (jI11 * 997805))) - (j10 * 683901);
                    long j26 = (j25 + 1048576) >> 21;
                    long j27 = ((j12 * 136657) + ((j8 & 2097151) - (j13 * 997805))) - (jI11 * 683901);
                    long j28 = (j27 + 1048576) >> 21;
                    long j29 = j28 << 21;
                    long j30 = jI9 - (j13 * 683901);
                    long j31 = (j30 + 1048576) >> 21;
                    long j32 = (jI10 * 470296) + j15 + j17;
                    long j33 = (j32 + 1048576) >> 21;
                    long j34 = j33 << 21;
                    long j35 = (((j10 * 654183) + ((j11 * 470296) + ((jI11 * 666643) + (j5 & 2097151)))) - (jI10 * 997805)) + j20;
                    long j36 = (j35 + 1048576) >> 21;
                    long j37 = j36 << 21;
                    long j38 = (((j10 * 136657) + (((jI11 * 654183) + ((j12 * 470296) + ((j13 * 666643) + (j6 & 2097151)))) - (j11 * 997805))) - (jI10 * 683901)) + j23;
                    long j39 = (j38 + 1048576) >> 21;
                    long j40 = j39 << 21;
                    long j41 = (((jI11 * 136657) + (((j13 * 654183) + (jI7 & 2097151)) - (j12 * 997805))) - (j11 * 683901)) + j26;
                    long j42 = (j41 + 1048576) >> 21;
                    long j43 = (((j13 * 136657) + jI8) - (j12 * 683901)) + j28;
                    long j44 = (j43 + 1048576) >> 21;
                    long j45 = (j25 - (j26 << 21)) + j39;
                    long j46 = (j45 * 666643) + jI;
                    long j47 = (j46 + 1048576) >> 21;
                    long j48 = j47 << 21;
                    long j49 = (j27 - j29) + j42;
                    long j50 = j41 - (j42 << 21);
                    long j51 = (j45 * 654183) + (j50 * 470296) + (j49 * 666643) + (jI2 & 2097151);
                    long j52 = (j51 + 1048576) >> 21;
                    long j53 = j52 << 21;
                    long j54 = (j30 - (j31 << 21)) + j44;
                    long j55 = j43 - (j44 << 21);
                    long j56 = (j45 * 136657) + (((j49 * 654183) + ((j55 * 470296) + ((j54 * 666643) + (j3 & 2097151)))) - (j50 * 997805));
                    long j57 = (j56 + 1048576) >> 21;
                    long j58 = j57 << 21;
                    long j59 = (j9 & 2097151) + j31;
                    long j60 = ((j49 * 136657) + (((j54 * 654183) + ((j59 * 470296) + (j16 - j18))) - (j55 * 997805))) - (j50 * 683901);
                    long j61 = (j60 + 1048576) >> 21;
                    long j62 = j61 << 21;
                    long j63 = ((j54 * 136657) + (((j19 - j21) + j33) - (j59 * 997805))) - (j55 * 683901);
                    long j64 = (j63 + 1048576) >> 21;
                    long j65 = j64 << 21;
                    long j66 = ((j22 - j24) + j36) - (j59 * 683901);
                    long j67 = (j66 + 1048576) >> 21;
                    long j68 = j67 << 21;
                    long j69 = (j45 * 470296) + (j50 * 666643) + (j & 2097151) + j47;
                    long j70 = (j69 + 1048576) >> 21;
                    long j71 = (((j50 * 654183) + ((j49 * 470296) + ((j55 * 666643) + (j2 & 2097151)))) - (j45 * 997805)) + j52;
                    long j72 = (j71 + 1048576) >> 21;
                    long j73 = (((j50 * 136657) + (((j55 * 654183) + ((j54 * 470296) + ((j59 * 666643) + (jI3 & 2097151)))) - (j49 * 997805))) - (j45 * 683901)) + j57;
                    long j74 = (j73 + 1048576) >> 21;
                    long j75 = (((j55 * 136657) + (((j59 * 654183) + (j32 - j34)) - (j54 * 997805))) - (j49 * 683901)) + j61;
                    long j76 = (j75 + 1048576) >> 21;
                    long j77 = (((j59 * 136657) + (j35 - j37)) - (j54 * 683901)) + j64;
                    long j78 = (j77 + 1048576) >> 21;
                    long j79 = (j38 - j40) + j67;
                    long j80 = (j79 + 1048576) >> 21;
                    long j81 = j80 << 21;
                    long j82 = (j80 * 666643) + (j46 - j48);
                    long j83 = j82 >> 21;
                    long j84 = j83 << 21;
                    long j85 = (j80 * 470296) + (j69 - (j70 << 21)) + j83;
                    long j86 = j85 >> 21;
                    long j87 = j86 << 21;
                    long j88 = (j80 * 654183) + (j51 - j53) + j70 + j86;
                    long j89 = j88 >> 21;
                    long j90 = j89 << 21;
                    long j91 = ((j71 - (j72 << 21)) - (j80 * 997805)) + j89;
                    long j92 = j91 >> 21;
                    long j93 = j92 << 21;
                    long j94 = (j80 * 136657) + (j56 - j58) + j72 + j92;
                    long j95 = j94 >> 21;
                    long j96 = j95 << 21;
                    long j97 = ((j73 - (j74 << 21)) - (j80 * 683901)) + j95;
                    long j98 = j97 >> 21;
                    long j99 = j98 << 21;
                    long j100 = (j60 - j62) + j74 + j98;
                    long j101 = j100 >> 21;
                    long j102 = j101 << 21;
                    long j103 = (j75 - (j76 << 21)) + j101;
                    long j104 = j103 >> 21;
                    long j105 = j104 << 21;
                    long j106 = (j63 - j65) + j76 + j104;
                    long j107 = j106 >> 21;
                    long j108 = j107 << 21;
                    long j109 = (j77 - (j78 << 21)) + j107;
                    long j110 = j109 >> 21;
                    long j111 = j110 << 21;
                    long j112 = (j66 - j68) + j78 + j110;
                    long j113 = j112 >> 21;
                    long j114 = j113 << 21;
                    long j115 = (j79 - j81) + j113;
                    long j116 = j115 >> 21;
                    long j117 = j116 << 21;
                    long j118 = (666643 * j116) + (j82 - j84);
                    long j119 = j118 >> 21;
                    long j120 = j119 << 21;
                    long j121 = (470296 * j116) + (j85 - j87) + j119;
                    long j122 = j121 >> 21;
                    long j123 = j122 << 21;
                    long j124 = (654183 * j116) + (j88 - j90) + j122;
                    long j125 = j124 >> 21;
                    long j126 = j125 << 21;
                    long j127 = ((j91 - j93) - (997805 * j116)) + j125;
                    long j128 = j127 >> 21;
                    long j129 = j128 << 21;
                    long j130 = (136657 * j116) + (j94 - j96) + j128;
                    long j131 = j130 >> 21;
                    long j132 = j131 << 21;
                    long j133 = ((j97 - j99) - (j116 * 683901)) + j131;
                    long j134 = j133 >> 21;
                    long j135 = j134 << 21;
                    long j136 = (j100 - j102) + j134;
                    long j137 = j136 >> 21;
                    long j138 = j137 << 21;
                    long j139 = (j103 - j105) + j137;
                    long j140 = j139 >> 21;
                    long j141 = j140 << 21;
                    long j142 = (j106 - j108) + j140;
                    long j143 = j142 >> 21;
                    long j144 = j143 << 21;
                    long j145 = (j109 - j111) + j143;
                    long j146 = j145 >> 21;
                    long j147 = j146 << 21;
                    long j148 = (j112 - j114) + j146;
                    long j149 = j148 >> 21;
                    long j150 = j118 - j120;
                    bArrDigest[0] = (byte) j150;
                    long j151 = j139 - j141;
                    long j152 = j136 - j138;
                    long j153 = j133 - j135;
                    long j154 = j130 - j132;
                    long j155 = j127 - j129;
                    long j156 = j124 - j126;
                    long j157 = j121 - j123;
                    bArrDigest[1] = (byte) (j150 >> 8);
                    bArrDigest[2] = (byte) ((j150 >> 16) | (j157 << 5));
                    bArrDigest[3] = (byte) (j157 >> 3);
                    bArrDigest[4] = (byte) (j157 >> 11);
                    bArrDigest[5] = (byte) ((j157 >> 19) | (j156 << 2));
                    bArrDigest[6] = (byte) (j156 >> 6);
                    bArrDigest[7] = (byte) ((j156 >> 14) | (j155 << 7));
                    bArrDigest[8] = (byte) (j155 >> 1);
                    bArrDigest[9] = (byte) (j155 >> 9);
                    bArrDigest[10] = (byte) ((j155 >> 17) | (j154 << 4));
                    bArrDigest[11] = (byte) (j154 >> 4);
                    bArrDigest[12] = (byte) (j154 >> 12);
                    bArrDigest[13] = (byte) ((j154 >> 20) | (j153 + j153));
                    bArrDigest[14] = (byte) (j153 >> 7);
                    bArrDigest[15] = (byte) ((j153 >> 15) | (j152 << 6));
                    bArrDigest[16] = (byte) (j152 >> 2);
                    bArrDigest[17] = (byte) (j152 >> 10);
                    bArrDigest[18] = (byte) ((j152 >> 18) | (j151 << 3));
                    long j158 = j148 - (j149 << 21);
                    long j159 = (j115 - j117) + j149;
                    long j160 = j145 - j147;
                    long j161 = j142 - j144;
                    bArrDigest[19] = (byte) (j151 >> 5);
                    bArrDigest[20] = (byte) (j151 >> 13);
                    bArrDigest[21] = (byte) j161;
                    bArrDigest[22] = (byte) (j161 >> 8);
                    bArrDigest[23] = (byte) ((j161 >> 16) | (j160 << 5));
                    bArrDigest[24] = (byte) (j160 >> 3);
                    bArrDigest[25] = (byte) (j160 >> 11);
                    bArrDigest[26] = (byte) ((j160 >> 19) | (j158 << 2));
                    bArrDigest[27] = (byte) (j158 >> 6);
                    bArrDigest[28] = (byte) ((j158 >> 14) | (j159 << 7));
                    bArrDigest[29] = (byte) (j159 >> 1);
                    bArrDigest[30] = (byte) (j159 >> 9);
                    bArrDigest[31] = (byte) (j159 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrB = zqo1.B(bArr3);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    zqo1.A(jArr4, jArrB);
                    zqo1.z(jArr5, jArr4, hcp1.a);
                    zqo1.w(jArr4, jArr4, jArr2);
                    zqo1.v(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    zqo1.A(jArr8, jArr5);
                    zqo1.z(jArr8, jArr8, jArr5);
                    zqo1.A(jArr, jArr8);
                    zqo1.z(jArr, jArr, jArr5);
                    zqo1.z(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    zqo1.A(jArr9, jArr);
                    zqo1.A(jArr10, jArr9);
                    zqo1.A(jArr10, jArr10);
                    zqo1.z(jArr10, jArr, jArr10);
                    zqo1.z(jArr9, jArr9, jArr10);
                    zqo1.A(jArr9, jArr9);
                    zqo1.z(jArr9, jArr10, jArr9);
                    zqo1.A(jArr10, jArr9);
                    for (int i4 = 1; i4 < 5; i4++) {
                        zqo1.A(jArr10, jArr10);
                    }
                    zqo1.z(jArr9, jArr10, jArr9);
                    zqo1.A(jArr10, jArr9);
                    for (int i5 = 1; i5 < 10; i5++) {
                        zqo1.A(jArr10, jArr10);
                    }
                    zqo1.z(jArr10, jArr10, jArr9);
                    zqo1.A(jArr11, jArr10);
                    for (int i6 = 1; i6 < 20; i6++) {
                        zqo1.A(jArr11, jArr11);
                    }
                    zqo1.z(jArr10, jArr11, jArr10);
                    zqo1.A(jArr10, jArr10);
                    for (int i7 = 1; i7 < 10; i7++) {
                        zqo1.A(jArr10, jArr10);
                    }
                    zqo1.z(jArr9, jArr10, jArr9);
                    zqo1.A(jArr10, jArr9);
                    for (int i8 = 1; i8 < 50; i8++) {
                        zqo1.A(jArr10, jArr10);
                    }
                    zqo1.z(jArr10, jArr10, jArr9);
                    zqo1.A(jArr11, jArr10);
                    for (int i9 = 1; i9 < 100; i9++) {
                        zqo1.A(jArr11, jArr11);
                    }
                    zqo1.z(jArr10, jArr11, jArr10);
                    zqo1.A(jArr10, jArr10);
                    for (int i10 = 1; i10 < 50; i10++) {
                        zqo1.A(jArr10, jArr10);
                    }
                    zqo1.z(jArr9, jArr10, jArr9);
                    zqo1.A(jArr9, jArr9);
                    zqo1.A(jArr9, jArr9);
                    zqo1.z(jArr, jArr9, jArr);
                    zqo1.z(jArr, jArr, jArr8);
                    zqo1.z(jArr, jArr, jArr4);
                    zqo1.A(jArr6, jArr);
                    zqo1.z(jArr6, jArr6, jArr5);
                    zqo1.w(jArr7, jArr6, jArr4);
                    if (fcp1.c(jArr7)) {
                        zqo1.v(jArr7, jArr6, jArr4);
                        if (fcp1.c(jArr7)) {
                            k220.r("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                            return;
                        }
                        zqo1.z(jArr, jArr, hcp1.c);
                    }
                    if (!fcp1.c(jArr) && ((bArr3[31] & 255) >> 7) != 0) {
                        k220.r("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                        return;
                    }
                    int i11 = 255;
                    if ((zqo1.C(jArr)[0] & 1) == ((bArr3[31] & 255) >> 7)) {
                        for (int i12 = 0; i12 < 10; i12++) {
                            jArr[i12] = -jArr[i12];
                        }
                    }
                    zqo1.z(jArr3, jArr, jArrB);
                    fqn1 fqn1Var = new fqn1(jArr, jArrB, jArr2, false, (byte) 12);
                    sbp1[] sbp1VarArr = new sbp1[8];
                    sbp1VarArr[0] = new sbp1(new bym1(fqn1Var, jArr3, (byte) 16));
                    frl1 frl1Var = new frl1(new fqn1(), new long[10], (byte) 23);
                    fcp1.f(frl1Var, fqn1Var);
                    bym1 bym1Var = new bym1(frl1Var, (byte) 0);
                    for (int i13 = 1; i13 < 8; i13++) {
                        fcp1.d(frl1Var, bym1Var, sbp1VarArr[i13 - 1]);
                        sbp1VarArr[i13] = new sbp1(new bym1(frl1Var, (byte) 0));
                    }
                    byte[] bArrH = fcp1.h(bArrDigest);
                    byte[] bArrH2 = fcp1.h(bArrCopyOfRange);
                    frl1 frl1Var2 = new frl1((byte) 23);
                    bym1 bym1Var2 = new bym1();
                    while (i11 >= 0 && bArrH[i11] == 0 && bArrH2[i11] == 0) {
                        i11--;
                    }
                    while (i11 >= 0) {
                        fcp1.f(frl1Var2, new fqn1(frl1Var2));
                        byte b = bArrH[i11];
                        if (b > 0) {
                            bym1.k(bym1Var2, frl1Var2);
                            fcp1.d(frl1Var2, bym1Var2, sbp1VarArr[bArrH[i11] / 2]);
                        } else if (b < 0) {
                            bym1.k(bym1Var2, frl1Var2);
                            fcp1.e(frl1Var2, bym1Var2, sbp1VarArr[(-bArrH[i11]) / 2]);
                        }
                        byte b2 = bArrH2[i11];
                        if (b2 > 0) {
                            bym1.k(bym1Var2, frl1Var2);
                            fcp1.d(frl1Var2, bym1Var2, hcp1.e[bArrH2[i11] / 2]);
                        } else if (b2 < 0) {
                            bym1.k(bym1Var2, frl1Var2);
                            fcp1.e(frl1Var2, bym1Var2, hcp1.e[(-bArrH2[i11]) / 2]);
                        }
                        i11--;
                    }
                    byte[] bArrH3 = new fqn1(frl1Var2).h();
                    for (int i14 = 0; i14 < 32; i14++) {
                        if (bArrH3[i14] != bArr[i14]) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        k220.r("Signature check failed.");
    }

    public bgn1(byte[] bArr, PublicKey publicKey, Provider provider) {
        this.b = bArr;
        this.c = publicKey;
        this.d = provider;
    }

    public bgn1(tap1 tap1Var, byte[] bArr, byte[] bArr2) {
        this.c = tap1Var;
        this.b = bArr;
        this.d = bArr2;
    }
}
