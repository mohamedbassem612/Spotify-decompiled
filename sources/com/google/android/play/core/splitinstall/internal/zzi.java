package com.google.android.play.core.splitinstall.internal;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p.bhn0;
import p.cy30;
import p.f4i1;
import p.gvg;
import p.hhg1;
import p.k220;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzi {
    public static X509Certificate[][] zza(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair pairZzc = zzj.zzc(randomAccessFile2);
            try {
                if (pairZzc == null) {
                    throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile2.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairZzc.first;
                long jLongValue = ((Long) pairZzc.second).longValue();
                long j = jLongValue - 20;
                if (j >= 0) {
                    randomAccessFile2.seek(j);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzf("ZIP64 APK not supported");
                    }
                }
                long jZza = zzj.zza(byteBuffer);
                if (jZza >= jLongValue) {
                    throw new zzf("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
                }
                if (zzj.zzb(byteBuffer) + jZza != jLongValue) {
                    throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZza < 32) {
                    throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(jZza - ((long) byteBufferAllocate.capacity()));
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new zzf("No APK Signing Block before ZIP Central Directory");
                }
                long j2 = byteBufferAllocate.getLong(0);
                if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
                    throw new zzf("APK Signing Block size out of range: " + j2);
                }
                int i = (int) (8 + j2);
                long j3 = jZza - ((long) i);
                if (j3 < 0) {
                    throw new zzf("APK Signing Block offset out of range: " + j3);
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j3);
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                randomAccessFile = randomAccessFile2;
                long j4 = byteBufferAllocate2.getLong(0);
                if (j4 != j2) {
                    throw new zzf("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j3));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                if (iCapacity < 8) {
                    throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i2 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i2++;
                        if (byteBufferSlice.remaining() < 8) {
                            throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i2);
                        }
                        long j5 = byteBufferSlice.getLong();
                        if (j5 < 4 || j5 > 2147483647L) {
                            throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + j5);
                        }
                        int i3 = (int) j5;
                        int iPosition2 = byteBufferSlice.position() + i3;
                        if (i3 > byteBufferSlice.remaining()) {
                            throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrZzl = zzl(randomAccessFile.getChannel(), new zze(zze(byteBufferSlice, i3 - 4), jLongValue2, jZza, jLongValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrZzl;
                        }
                        long j6 = jLongValue2;
                        long j7 = jZza;
                        long j8 = jLongValue;
                        byteBufferSlice.position(iPosition2);
                        jLongValue = j8;
                        jZza = j7;
                        jLongValue2 = j6;
                    }
                    throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = randomAccessFile2;
        }
    }

    private static int zzb(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        hhg1.n(f4i1.c(i, "Unknown content digest algorthm: "));
        return 0;
    }

    private static int zzc(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                hhg1.n("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                return 0;
        }
    }

    private static String zzd(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        hhg1.n(f4i1.c(i, "Unknown content digest algorthm: "));
        return null;
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            k220.i(f4i1.c(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
            return null;
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            hhg1.n("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return zze(byteBuffer, i);
        }
        k220.i(cy30.i(i, "Length-prefixed field longer than remaining buffer. Field length: ", byteBuffer.remaining(), ", remaining: "));
        return null;
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzc zzcVar = new zzc(fileChannel, 0L, j);
        zzc zzcVar2 = new zzc(fileChannel, j2, j3 - j2);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzj.zzd(byteBufferDuplicate, j);
        zza zzaVar = new zza(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrZzk = zzk(iArr, new zzb[]{zzcVar, zzcVar2, zzaVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), bArrZzk[i2])) {
                    throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            k220.i("Negative length");
            return null;
        }
        if (i > byteBuffer.remaining()) {
            k220.i(cy30.i(i, "Underflow while reading length-prefixed value. Length: ", byteBuffer.remaining(), ", available: "));
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzf = zzf(byteBuffer);
        ByteBuffer byteBufferZzf2 = zzf(byteBuffer);
        byte[] bArrZzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferZzf2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferZzf3 = zzf(byteBufferZzf2);
                if (byteBufferZzf3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferZzf3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iZzc = zzc(i3);
                    int iZzc2 = zzc(i);
                    if (iZzc != 1 && iZzc2 == 1) {
                    }
                }
                bArrZzi3 = zzi(byteBufferZzf3);
                i = i3;
            } catch (IOException e) {
                e = e;
                throw new SecurityException(f4i1.c(i2, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(f4i1.c(i2, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    hhg1.n("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    hhg1.n("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzi));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzf);
            if (!signature.verify(bArrZzi3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferZzf.clear();
            ByteBuffer byteBufferZzf4 = zzf(byteBufferZzf);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferZzf4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferZzf5 = zzf(byteBufferZzf4);
                    if (byteBufferZzf5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferZzf5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrZzi2 = zzi(byteBufferZzf5);
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IOException(f4i1.c(i4, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    throw new IOException(f4i1.c(i4, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZzc3 = zzc(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzc3), bArrZzi2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzi2)) {
                throw new SecurityException(zzd(iZzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferZzf6 = zzf(byteBufferZzf);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferZzf6.hasRemaining()) {
                i6++;
                byte[] bArrZzi4 = zzi(byteBufferZzf6);
                try {
                    arrayList3.add(new zzg((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi4)), bArrZzi4));
                } catch (CertificateException e5) {
                    throw new SecurityException(f4i1.c(i6, "Failed to decode certificate #"), e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException(f4i1.f("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException(f4i1.f("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException(f4i1.f("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException(f4i1.f("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException(f4i1.f("Failed to verify ", str2, " signature"), e);
        }
    }

    private static byte[][] zzk(int[] iArr, zzb[] zzbVarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2;
        byte[][] bArr;
        String str;
        int i3 = 0;
        long jZza = 0;
        while (true) {
            j = 1048576;
            i = 3;
            if (i3 >= 3) {
                break;
            }
            jZza += (zzbVarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(l1d.l(jZza, "Too many chunks: "));
        }
        byte[][] bArr2 = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            i2 = 1;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) jZza;
            byte[] bArr3 = new byte[(zzb(iArr[i4]) * i5) + 5];
            bArr3[0] = 90;
            zzg(i5, bArr3, 1);
            bArr2[i4] = bArr3;
            i4++;
        }
        byte[] bArr4 = new byte[5];
        bArr4[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i6 = 0;
        while (true) {
            bArr = null;
            str = " digest not supported";
            if (i6 >= iArr.length) {
                break;
            }
            String strZzd = zzd(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strZzd);
                i6++;
            } catch (NoSuchAlgorithmException e) {
                bhn0.o(strZzd.concat(" digest not supported"), e);
                return null;
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            zzb zzbVar = zzbVarArr[i8];
            int i10 = i8;
            long jZza2 = zzbVar.zza();
            long j2 = 0;
            while (jZza2 > 0) {
                String str2 = str;
                int i11 = i7;
                int iMin = (int) Math.min(jZza2, j);
                zzg(iMin, bArr4, i2);
                for (int i12 = 0; i12 < length; i12++) {
                    messageDigestArr[i12].update(bArr4);
                }
                long j3 = j2;
                try {
                    zzbVar.zzb(messageDigestArr, j3, iMin);
                    char c2 = c;
                    int i13 = 0;
                    while (i13 < iArr.length) {
                        int i14 = iArr[i13];
                        byte[] bArr5 = bArr2[i13];
                        int iZzb = zzb(i14);
                        byte[][] bArr6 = bArr;
                        MessageDigest messageDigest = messageDigestArr[i13];
                        int i15 = i13;
                        int iDigest = messageDigest.digest(bArr5, (i9 * iZzb) + 5, iZzb);
                        if (iDigest != iZzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i13 = i15 + 1;
                        bArr = bArr6;
                    }
                    long j4 = iMin;
                    long j5 = j3 + j4;
                    jZza2 -= j4;
                    i9++;
                    c = c2;
                    str = str2;
                    i7 = i11;
                    i2 = 1;
                    j2 = j5;
                    j = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(cy30.i(i9, "Failed to digest chunk #", i11, " of section #"), e2);
                }
            }
            i7++;
            i8 = i10 + 1;
            j = 1048576;
            i = 3;
            i2 = 1;
        }
        String str3 = str;
        byte[][] bArr7 = bArr;
        byte[][] bArr8 = new byte[iArr.length][];
        for (int i16 = 0; i16 < iArr.length; i16++) {
            int i17 = iArr[i16];
            byte[] bArr9 = bArr2[i16];
            String strZzd2 = zzd(i17);
            try {
                bArr8[i16] = MessageDigest.getInstance(strZzd2).digest(bArr9);
            } catch (NoSuchAlgorithmException e3) {
                bhn0.o(strZzd2.concat(str3), e3);
                return bArr7;
            }
        }
        return bArr8;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zze zzeVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferZzf = zzf(zzeVar.zza);
                int i = 0;
                while (byteBufferZzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(byteBufferZzf), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(gvg.e(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzh(map, fileChannel, zzeVar.zzb, zzeVar.zzc, zzeVar.zzd, zzeVar.zze);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            bhn0.o("Failed to obtain X.509 CertificateFactory", e3);
            return null;
        }
    }
}
