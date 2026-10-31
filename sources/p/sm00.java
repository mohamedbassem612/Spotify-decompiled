package p;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sm00 {
    public static final String[] R;
    public static final int[] S;
    public static final byte[] T;
    public static final qm00 U;
    public static final qm00[][] V;
    public static final qm00[] W;
    public static final qm00 X;
    public static final qm00 Y;
    public static final HashMap[] Z;
    public static final HashMap[] a0;
    public static final HashSet b0;
    public static final HashMap c0;
    public static final Charset d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final Pattern g0;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public byte[] l;
    public int m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f108p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public static final boolean u = Log.isLoggable("ExifInterface", 3);
    public static final List v = Arrays.asList(1, 6, 3, 8);
    public static final List w = Arrays.asList(2, 7, 4, 5);
    public static final int[] x = {8, 8, 8};
    public static final int[] y = {8};
    public static final byte[] z = {-1, -40, -1};
    public static final byte[] A = {102, 116, 121, 112};
    public static final byte[] B = {109, 105, 102, 49};
    public static final byte[] C = {104, 101, 105, 99};
    public static final byte[] D = {79, 76, 89, 77, 80, 0};
    public static final byte[] E = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] F = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] G = {101, 88, 73, 102};
    public static final byte[] H = {73, 72, 68, 82};
    public static final byte[] I = {73, 69, 78, 68};
    public static final byte[] J = {82, 73, 70, 70};
    public static final byte[] K = {87, 69, 66, 80};
    public static final byte[] L = {69, 88, 73, 70};
    public static final byte[] M = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] O = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "ANMF".getBytes(Charset.defaultCharset());

    static {
        "XMP ".getBytes(Charset.defaultCharset());
        R = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        S = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        T = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        qm00[] qm00VarArr = {new qm00("NewSubfileType", 254, 4), new qm00("SubfileType", 255, 4), new qm00("ImageWidth", 256), new qm00("ImageLength", 257), new qm00("BitsPerSample", 258, 3), new qm00("Compression", 259, 3), new qm00("PhotometricInterpretation", 262, 3), new qm00("ImageDescription", 270, 2), new qm00("Make", 271, 2), new qm00("Model", 272, 2), new qm00("StripOffsets", 273), new qm00("Orientation", 274, 3), new qm00("SamplesPerPixel", 277, 3), new qm00("RowsPerStrip", 278), new qm00("StripByteCounts", 279), new qm00("XResolution", 282, 5), new qm00("YResolution", 283, 5), new qm00("PlanarConfiguration", 284, 3), new qm00("ResolutionUnit", 296, 3), new qm00("TransferFunction", 301, 3), new qm00("Software", 305, 2), new qm00("DateTime", 306, 2), new qm00("Artist", 315, 2), new qm00("WhitePoint", 318, 5), new qm00("PrimaryChromaticities", 319, 5), new qm00("SubIFDPointer", 330, 4), new qm00("JPEGInterchangeFormat", NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SKIP_BYTE_COUNTS_TOO_SHORT, 4), new qm00("JPEGInterchangeFormatLength", NativeMediaProcessor.PROCESS_SAMPLE_RESULT_PROCESS_BYTE_COUNTS_TOO_SHORT, 4), new qm00("YCbCrCoefficients", 529, 5), new qm00("YCbCrSubSampling", 530, 3), new qm00("YCbCrPositioning", 531, 3), new qm00("ReferenceBlackWhite", 532, 5), new qm00("Copyright", 33432, 2), new qm00("ExifIFDPointer", 34665, 4), new qm00("GPSInfoIFDPointer", 34853, 4), new qm00("SensorTopBorder", 4, 4), new qm00("SensorLeftBorder", 5, 4), new qm00("SensorBottomBorder", 6, 4), new qm00("SensorRightBorder", 7, 4), new qm00("ISO", 23, 3), new qm00("JpgFromRaw", 46, 7), new qm00("Xmp", 700, 1)};
        qm00[] qm00VarArr2 = {new qm00("ExposureTime", 33434, 5), new qm00("FNumber", 33437, 5), new qm00("ExposureProgram", 34850, 3), new qm00("SpectralSensitivity", 34852, 2), new qm00("PhotographicSensitivity", 34855, 3), new qm00("OECF", 34856, 7), new qm00("SensitivityType", 34864, 3), new qm00("StandardOutputSensitivity", 34865, 4), new qm00("RecommendedExposureIndex", 34866, 4), new qm00("ISOSpeed", 34867, 4), new qm00("ISOSpeedLatitudeyyy", 34868, 4), new qm00("ISOSpeedLatitudezzz", 34869, 4), new qm00("ExifVersion", 36864, 2), new qm00("DateTimeOriginal", 36867, 2), new qm00("DateTimeDigitized", 36868, 2), new qm00("OffsetTime", 36880, 2), new qm00("OffsetTimeOriginal", 36881, 2), new qm00("OffsetTimeDigitized", 36882, 2), new qm00("ComponentsConfiguration", 37121, 7), new qm00("CompressedBitsPerPixel", 37122, 5), new qm00("ShutterSpeedValue", 37377, 10), new qm00("ApertureValue", 37378, 5), new qm00("BrightnessValue", 37379, 10), new qm00("ExposureBiasValue", 37380, 10), new qm00("MaxApertureValue", 37381, 5), new qm00("SubjectDistance", 37382, 5), new qm00("MeteringMode", 37383, 3), new qm00("LightSource", 37384, 3), new qm00("Flash", 37385, 3), new qm00("FocalLength", 37386, 5), new qm00("SubjectArea", 37396, 3), new qm00("MakerNote", 37500, 7), new qm00("UserComment", 37510, 7), new qm00("SubSecTime", 37520, 2), new qm00("SubSecTimeOriginal", 37521, 2), new qm00("SubSecTimeDigitized", 37522, 2), new qm00("FlashpixVersion", 40960, 7), new qm00("ColorSpace", 40961, 3), new qm00("PixelXDimension", 40962), new qm00("PixelYDimension", 40963), new qm00("RelatedSoundFile", 40964, 2), new qm00("InteroperabilityIFDPointer", 40965, 4), new qm00("FlashEnergy", 41483, 5), new qm00("SpatialFrequencyResponse", 41484, 7), new qm00("FocalPlaneXResolution", 41486, 5), new qm00("FocalPlaneYResolution", 41487, 5), new qm00("FocalPlaneResolutionUnit", 41488, 3), new qm00("SubjectLocation", 41492, 3), new qm00("ExposureIndex", 41493, 5), new qm00("SensingMethod", 41495, 3), new qm00("FileSource", 41728, 7), new qm00("SceneType", 41729, 7), new qm00("CFAPattern", 41730, 7), new qm00("CustomRendered", 41985, 3), new qm00("ExposureMode", 41986, 3), new qm00("WhiteBalance", 41987, 3), new qm00("DigitalZoomRatio", 41988, 5), new qm00("FocalLengthIn35mmFilm", 41989, 3), new qm00("SceneCaptureType", 41990, 3), new qm00("GainControl", 41991, 3), new qm00("Contrast", 41992, 3), new qm00("Saturation", 41993, 3), new qm00("Sharpness", 41994, 3), new qm00("DeviceSettingDescription", 41995, 7), new qm00("SubjectDistanceRange", 41996, 3), new qm00("ImageUniqueID", 42016, 2), new qm00("CameraOwnerName", 42032, 2), new qm00("BodySerialNumber", 42033, 2), new qm00("LensSpecification", 42034, 5), new qm00("LensMake", 42035, 2), new qm00("LensModel", 42036, 2), new qm00("Gamma", 42240, 5), new qm00("DNGVersion", 50706, 1), new qm00("DefaultCropSize", 50720)};
        qm00[] qm00VarArr3 = {new qm00("GPSVersionID", 0, 1), new qm00("GPSLatitudeRef", 1, 2), new qm00("GPSLatitude", 2, 5), new qm00("GPSLongitudeRef", 3, 2), new qm00("GPSLongitude", 4, 5), new qm00("GPSAltitudeRef", 5, 1), new qm00("GPSAltitude", 6, 5), new qm00("GPSTimeStamp", 7, 5), new qm00("GPSSatellites", 8, 2), new qm00("GPSStatus", 9, 2), new qm00("GPSMeasureMode", 10, 2), new qm00("GPSDOP", 11, 5), new qm00("GPSSpeedRef", 12, 2), new qm00("GPSSpeed", 13, 5), new qm00("GPSTrackRef", 14, 2), new qm00("GPSTrack", 15, 5), new qm00("GPSImgDirectionRef", 16, 2), new qm00("GPSImgDirection", 17, 5), new qm00("GPSMapDatum", 18, 2), new qm00("GPSDestLatitudeRef", 19, 2), new qm00("GPSDestLatitude", 20, 5), new qm00("GPSDestLongitudeRef", 21, 2), new qm00("GPSDestLongitude", 22, 5), new qm00("GPSDestBearingRef", 23, 2), new qm00("GPSDestBearing", 24, 5), new qm00("GPSDestDistanceRef", 25, 2), new qm00("GPSDestDistance", 26, 5), new qm00("GPSProcessingMethod", 27, 7), new qm00("GPSAreaInformation", 28, 7), new qm00("GPSDateStamp", 29, 2), new qm00("GPSDifferential", 30, 3), new qm00("GPSHPositioningError", 31, 5)};
        qm00[] qm00VarArr4 = {new qm00("InteroperabilityIndex", 1, 2)};
        qm00[] qm00VarArr5 = {new qm00("NewSubfileType", 254, 4), new qm00("SubfileType", 255, 4), new qm00("ThumbnailImageWidth", 256), new qm00("ThumbnailImageLength", 257), new qm00("BitsPerSample", 258, 3), new qm00("Compression", 259, 3), new qm00("PhotometricInterpretation", 262, 3), new qm00("ImageDescription", 270, 2), new qm00("Make", 271, 2), new qm00("Model", 272, 2), new qm00("StripOffsets", 273), new qm00("ThumbnailOrientation", 274, 3), new qm00("SamplesPerPixel", 277, 3), new qm00("RowsPerStrip", 278), new qm00("StripByteCounts", 279), new qm00("XResolution", 282, 5), new qm00("YResolution", 283, 5), new qm00("PlanarConfiguration", 284, 3), new qm00("ResolutionUnit", 296, 3), new qm00("TransferFunction", 301, 3), new qm00("Software", 305, 2), new qm00("DateTime", 306, 2), new qm00("Artist", 315, 2), new qm00("WhitePoint", 318, 5), new qm00("PrimaryChromaticities", 319, 5), new qm00("SubIFDPointer", 330, 4), new qm00("JPEGInterchangeFormat", NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SKIP_BYTE_COUNTS_TOO_SHORT, 4), new qm00("JPEGInterchangeFormatLength", NativeMediaProcessor.PROCESS_SAMPLE_RESULT_PROCESS_BYTE_COUNTS_TOO_SHORT, 4), new qm00("YCbCrCoefficients", 529, 5), new qm00("YCbCrSubSampling", 530, 3), new qm00("YCbCrPositioning", 531, 3), new qm00("ReferenceBlackWhite", 532, 5), new qm00("Copyright", 33432, 2), new qm00("ExifIFDPointer", 34665, 4), new qm00("GPSInfoIFDPointer", 34853, 4), new qm00("DNGVersion", 50706, 1), new qm00("DefaultCropSize", 50720)};
        U = new qm00("StripOffsets", 273, 3);
        V = new qm00[][]{qm00VarArr, qm00VarArr2, qm00VarArr3, qm00VarArr4, qm00VarArr5, qm00VarArr, new qm00[]{new qm00("ThumbnailImage", 256, 7), new qm00("CameraSettingsIFDPointer", 8224, 4), new qm00("ImageProcessingIFDPointer", 8256, 4)}, new qm00[]{new qm00("PreviewImageStart", 257, 4), new qm00("PreviewImageLength", 258, 4)}, new qm00[]{new qm00("AspectFrame", 4371, 3)}, new qm00[]{new qm00("ColorSpace", 55, 3)}};
        W = new qm00[]{new qm00("SubIFDPointer", 330, 4), new qm00("ExifIFDPointer", 34665, 4), new qm00("GPSInfoIFDPointer", 34853, 4), new qm00("InteroperabilityIFDPointer", 40965, 4), new qm00("CameraSettingsIFDPointer", 8224, 1), new qm00("ImageProcessingIFDPointer", 8256, 1)};
        X = new qm00("JPEGInterchangeFormat", NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SKIP_BYTE_COUNTS_TOO_SHORT, 4);
        Y = new qm00("JPEGInterchangeFormatLength", NativeMediaProcessor.PROCESS_SAMPLE_RESULT_PROCESS_BYTE_COUNTS_TOO_SHORT, 4);
        Z = new HashMap[10];
        a0 = new HashMap[10];
        b0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        c0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        d0 = charsetForName;
        e0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            qm00[][] qm00VarArr6 = V;
            if (i >= qm00VarArr6.length) {
                HashMap map = c0;
                qm00[] qm00VarArr7 = W;
                map.put(Integer.valueOf(qm00VarArr7[0].a), 5);
                map.put(Integer.valueOf(qm00VarArr7[1].a), 1);
                map.put(Integer.valueOf(qm00VarArr7[2].a), 2);
                map.put(Integer.valueOf(qm00VarArr7[3].a), 3);
                map.put(Integer.valueOf(qm00VarArr7[4].a), 7);
                map.put(Integer.valueOf(qm00VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                g0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            Z[i] = new HashMap();
            a0[i] = new HashMap();
            for (qm00 qm00Var : qm00VarArr6[i]) {
                Z[i].put(Integer.valueOf(qm00Var.a), qm00Var);
                a0[i].put(qm00Var.b, qm00Var);
            }
            i++;
        }
    }

    public sm00(File file) throws Throwable {
        boolean z2;
        qm00[][] qm00VarArr = V;
        this.e = new HashMap[qm00VarArr.length];
        this.f = new HashSet(qm00VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        String absolutePath = file.getAbsolutePath();
        if (absolutePath == null) {
            bhn0.i("filename cannot be null");
            return;
        }
        FileInputStream fileInputStream = null;
        this.c = null;
        this.a = absolutePath;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(absolutePath);
            try {
                try {
                    Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    z2 = false;
                }
                if (z2) {
                    this.b = fileInputStream2.getFD();
                } else {
                    this.b = null;
                }
                x(fileInputStream2);
                c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static ByteOrder A(nm00 nm00Var) throws IOException {
        short s = nm00Var.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        k220.h(Integer.toHexString(s), "Invalid byte order: ");
        return null;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] d(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 != iMin) {
                k220.i("Failed to copy the given amount of bytes from the inputstream to the output stream.");
                return;
            } else {
                i -= i2;
                outputStream.write(bArr, 0, i2);
            }
        }
    }

    public static void g(nm00 nm00Var, om00 om00Var, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (nm00Var.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = d0;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int i = nm00Var.readInt();
            om00Var.write(bArr3);
            om00Var.d(i);
            if (i % 2 == 1) {
                i++;
            }
            f(nm00Var, om00Var, i);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static Pair u(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairU = u(strArrSplit[0]);
            if (((Integer) pairU.first).intValue() == 2) {
                return pairU;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairU2 = u(strArrSplit[i]);
                int iIntValue = (((Integer) pairU2.first).equals(pairU.first) || ((Integer) pairU2.second).equals(pairU.first)) ? ((Integer) pairU.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairU.second).intValue() == -1 || !(((Integer) pairU2.first).equals(pairU.second) || ((Integer) pairU2.second).equals(pairU.second))) ? -1 : ((Integer) pairU.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairU = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairU = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairU;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > 65535) {
                        return j < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void B(byte[] bArr, int i) throws IOException {
        nm00 nm00Var = new nm00(bArr);
        y(nm00Var, bArr.length);
        C(nm00Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    public final void C(nm00 nm00Var, int i) throws IOException {
        boolean z2;
        HashMap[] mapArr;
        long j;
        long j2;
        int i2;
        boolean z3;
        long j3;
        int i3;
        int unsignedShort;
        long j4;
        Integer numValueOf = Integer.valueOf(nm00Var.d);
        HashSet hashSet = this.f;
        hashSet.add(numValueOf);
        int i4 = nm00Var.d + 2;
        int i5 = nm00Var.c;
        if (i4 > i5) {
            return;
        }
        short s = nm00Var.readShort();
        if ((s * 12) + nm00Var.d > i5 || s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            z2 = u;
            mapArr = this.e;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = nm00Var.readUnsignedShort();
            int unsignedShort3 = nm00Var.readUnsignedShort();
            int i6 = nm00Var.readInt();
            long j5 = ((long) nm00Var.d) + 4;
            qm00 qm00Var = (qm00) Z[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), qm00Var != null ? qm00Var.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6));
            }
            if (qm00Var != null && unsignedShort3 > 0) {
                int[] iArr = S;
                if (unsignedShort3 < iArr.length) {
                    byte b = qm00Var.c;
                    if (b == 7 || unsignedShort3 == 7 || b == unsignedShort3 || (i2 = qm00Var.d) == unsignedShort3 || (((b == 4 || i2 == 4) && unsignedShort3 == 3) || (((b == 9 || i2 == 9) && unsignedShort3 == 8) || ((b == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = b;
                        }
                        j = j5;
                        j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                        z3 = j2 >= 0 && j2 <= 2147483647L;
                    } else {
                        if (z2 != 0) {
                            String str = R[unsignedShort3];
                        }
                        j = j5;
                        j2 = 0;
                    }
                } else {
                    j = j5;
                    j2 = 0;
                }
            } else {
                j = j5;
                j2 = 0;
            }
            if (z3) {
                long j6 = j;
                if (j2 > 4) {
                    int i7 = nm00Var.readInt();
                    int i8 = this.d;
                    if (i8 == 7) {
                        if ("MakerNote".equals(qm00Var.b)) {
                            this.o = i7;
                        } else if (i == 6 && "ThumbnailImage".equals(qm00Var.b)) {
                            this.f108p = i7;
                            this.q = i6;
                            pm00 pm00VarE = pm00.e(6, this.g);
                            j3 = j2;
                            pm00 pm00VarB = pm00.b(this.f108p, this.g);
                            i3 = unsignedShort3;
                            pm00 pm00VarB2 = pm00.b(this.q, this.g);
                            mapArr[4].put("Compression", pm00VarE);
                            mapArr[4].put("JPEGInterchangeFormat", pm00VarB);
                            mapArr[4].put("JPEGInterchangeFormatLength", pm00VarB2);
                        }
                        j3 = j2;
                        i3 = unsignedShort3;
                    } else {
                        j3 = j2;
                        i3 = unsignedShort3;
                        if (i8 == 10 && "JpgFromRaw".equals(qm00Var.b)) {
                            this.r = i7;
                        }
                    }
                    long j7 = i7;
                    if (j7 + j3 <= i5) {
                        nm00Var.a(j7);
                    } else {
                        nm00Var.a(j6);
                    }
                } else {
                    j3 = j2;
                    i3 = unsignedShort3;
                }
                Integer num = (Integer) c0.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    int i9 = i3;
                    if (i9 != 3) {
                        if (i9 == 4) {
                            j4 = ((long) nm00Var.readInt()) & 4294967295L;
                        } else if (i9 == 8) {
                            unsignedShort = nm00Var.readShort();
                        } else if (i9 == 9 || i9 == 13) {
                            unsignedShort = nm00Var.readInt();
                        } else {
                            j4 = -1;
                        }
                        if (z2) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j4), qm00Var.b);
                        }
                        if (j4 > 0 && j4 < i5 && !hashSet.contains(Integer.valueOf((int) j4))) {
                            nm00Var.a(j4);
                            C(nm00Var, num.intValue());
                        }
                        nm00Var.a(j6);
                    } else {
                        unsignedShort = nm00Var.readUnsignedShort();
                    }
                    j4 = unsignedShort;
                    if (z2) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j4), qm00Var.b);
                    }
                    if (j4 > 0) {
                        nm00Var.a(j4);
                        C(nm00Var, num.intValue());
                    }
                    nm00Var.a(j6);
                } else {
                    byte[] bArr = new byte[(int) j3];
                    nm00Var.readFully(bArr);
                    pm00 pm00Var = new pm00(i3, bArr, i6, 0);
                    HashMap map = mapArr[i];
                    String str2 = qm00Var.b;
                    map.put(str2, pm00Var);
                    if ("DNGVersion".equals(str2)) {
                        this.d = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && pm00Var.i(this.g).contains("PENTAX")) || ("Compression".equals(str2) && pm00Var.h(this.g) == 65535)) {
                        this.d = 8;
                    }
                    if (nm00Var.d != j6) {
                        nm00Var.a(j6);
                    }
                }
                s2 = (short) (s2 + 1);
                s = s;
            } else {
                nm00Var.a(j);
            }
            s2 = (short) (s2 + 1);
            s = s;
        }
        if (nm00Var.d + 4 <= i5) {
            int i10 = nm00Var.readInt();
            if (z2) {
                String.format("nextIfdOffset: %d", Integer.valueOf(i10));
            }
            long j8 = i10;
            if (j8 <= 0 || i10 >= i5 || hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            nm00Var.a(j8);
            if (mapArr[4].isEmpty()) {
                C(nm00Var, 4);
            } else if (mapArr[5].isEmpty()) {
                C(nm00Var, 5);
            }
        }
    }

    public final void D(String str) {
        for (int i = 0; i < V.length; i++) {
            this.e[i].remove(str);
        }
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (u) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        om00 om00Var = new om00(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() != -1) {
            k220.i("Invalid marker");
            return;
        }
        om00Var.c(-1);
        if (dataInputStream.readByte() != -40) {
            k220.i("Invalid marker");
            return;
        }
        om00Var.c(-40);
        String strH = h("Xmp");
        HashMap[] mapArr = this.e;
        pm00 pm00Var = (strH == null || !this.t) ? null : (pm00) mapArr[0].remove("Xmp");
        om00Var.c(-1);
        om00Var.c(-31);
        M(om00Var);
        if (pm00Var != null) {
            mapArr[0].put("Xmp", pm00Var);
        }
        byte[] bArr = new byte[4096];
        while (dataInputStream.readByte() == -1) {
            byte b = dataInputStream.readByte();
            if (b == -39 || b == -38) {
                om00Var.c(-1);
                om00Var.c(b);
                e(dataInputStream, om00Var);
                return;
            }
            if (b != -31) {
                om00Var.c(-1);
                om00Var.c(b);
                int unsignedShort = dataInputStream.readUnsignedShort();
                om00Var.g(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    k220.i("Invalid length");
                    return;
                }
                while (i > 0) {
                    int i2 = dataInputStream.read(bArr, 0, Math.min(i, 4096));
                    if (i2 < 0) {
                        break;
                    }
                    om00Var.write(bArr, 0, i2);
                    i -= i2;
                }
            } else {
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    k220.i("Invalid length");
                    return;
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (dataInputStream.read(bArr2) != 6) {
                        k220.i("Invalid exif");
                        return;
                    } else if (Arrays.equals(bArr2, e0)) {
                        int i4 = unsignedShort2 - 8;
                        if (dataInputStream.skipBytes(i4) != i4) {
                            k220.i("Invalid length");
                            return;
                        }
                    }
                }
                om00Var.c(-1);
                om00Var.c(b);
                om00Var.g(unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    om00Var.write(bArr2);
                }
                while (i3 > 0) {
                    int i5 = dataInputStream.read(bArr, 0, Math.min(i3, 4096));
                    if (i5 < 0) {
                        break;
                    }
                    om00Var.write(bArr, 0, i5);
                    i3 -= i5;
                }
            }
        }
        k220.i("Invalid marker");
    }

    public final void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (u) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        om00 om00Var = new om00(bufferedOutputStream, byteOrder);
        byte[] bArr = F;
        f(dataInputStream, om00Var, bArr.length);
        int i = this.n;
        if (i == 0) {
            int i2 = dataInputStream.readInt();
            om00Var.d(i2);
            f(dataInputStream, om00Var, i2 + 8);
        } else {
            f(dataInputStream, om00Var, (i - bArr.length) - 8);
            dataInputStream.skipBytes(dataInputStream.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                om00 om00Var2 = new om00(byteArrayOutputStream2, byteOrder);
                M(om00Var2);
                byte[] byteArray = ((ByteArrayOutputStream) om00Var2.a).toByteArray();
                om00Var.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                om00Var.d((int) crc32.getValue());
                c(byteArrayOutputStream2);
                e(dataInputStream, om00Var);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void G(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (u) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        nm00 nm00Var = new nm00(bufferedInputStream, byteOrder);
        OutputStream om00Var = new om00(bufferedOutputStream, byteOrder);
        byte[] bArr = J;
        f(nm00Var, om00Var, bArr.length);
        byte[] bArr2 = K;
        nm00Var.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    om00 om00Var2 = new om00(byteArrayOutputStream2, byteOrder);
                    int i = this.n;
                    if (i != 0) {
                        f(nm00Var, om00Var2, (i - ((bArr.length + 4) + bArr2.length)) - 8);
                        nm00Var.skipBytes(4);
                        nm00Var.skipBytes(nm00Var.readInt());
                        M(om00Var2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (nm00Var.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = M;
                        boolean zEquals = Arrays.equals(bArr3, bArr4);
                        byte[] bArr5 = N;
                        byte[] bArr6 = O;
                        if (zEquals) {
                            int i2 = nm00Var.readInt();
                            byte[] bArr7 = new byte[i2 % 2 == 1 ? i2 + 1 : i2];
                            nm00Var.read(bArr7);
                            byte b = (byte) (bArr7[0] | 8);
                            bArr7[0] = b;
                            boolean z2 = ((b >> 1) & 1) == 1;
                            om00Var2.write(bArr4);
                            om00Var2.d(i2);
                            om00Var2.write(bArr7);
                            if (z2) {
                                g(nm00Var, om00Var2, P, null);
                                while (true) {
                                    byte[] bArr8 = new byte[4];
                                    bufferedInputStream.read(bArr8);
                                    if (!Arrays.equals(bArr8, Q)) {
                                        break;
                                    }
                                    int i3 = nm00Var.readInt();
                                    om00Var2.write(bArr8);
                                    om00Var2.d(i3);
                                    if (i3 % 2 == 1) {
                                        i3++;
                                    }
                                    f(nm00Var, om00Var2, i3);
                                }
                                M(om00Var2);
                            } else {
                                g(nm00Var, om00Var2, bArr6, bArr5);
                                M(om00Var2);
                            }
                        } else if (Arrays.equals(bArr3, bArr6) || Arrays.equals(bArr3, bArr5)) {
                            throw new IOException("WebP files with only VP8 or VP8L chunks are currently not supported");
                        }
                    }
                    e(nm00Var, om00Var2);
                    om00Var.d(byteArrayOutputStream2.size() + bArr2.length);
                    om00Var.write(bArr2);
                    byteArrayOutputStream2.writeTo(om00Var);
                    c(byteArrayOutputStream2);
                } catch (Exception e) {
                    e = e;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0296  */
    /* JADX WARN: Code duplicated, block: B:101:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124 A[LOOP:1: B:61:0x0121->B:63:0x0124, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0144 A[LOOP:2: B:65:0x0142->B:66:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165 A[LOOP:3: B:69:0x0162->B:71:0x0165, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7 A[LOOP:4: B:73:0x01a5->B:74:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d8 A[LOOP:5: B:78:0x01d5->B:80:0x01d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f8 A[LOOP:6: B:82:0x01f6->B:83:0x01f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x020e  */
    /* JADX WARN: Code duplicated, block: B:88:0x021c A[LOOP:7: B:86:0x0219->B:88:0x021c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x024a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0258 A[LOOP:8: B:91:0x0255->B:93:0x0258, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0270  */
    /* JADX WARN: Code duplicated, block: B:98:0x027e A[LOOP:9: B:96:0x027b->B:98:0x027e, LOOP_END] */
    public final void H(String str, String str2) {
        qm00 qm00Var;
        int[] iArr;
        int i;
        int i2;
        pm00 pm00Var;
        int i3;
        String[] strArrSplit;
        int[] iArr2;
        int i4;
        String[] strArrSplit2;
        long[] jArr;
        int i5;
        int i6;
        String[] strArrSplit3;
        rm00[] rm00VarArr;
        int i7;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i8;
        ByteBuffer byteBufferWrap;
        int i9;
        String[] strArrSplit5;
        int length2;
        rm00[] rm00VarArr2;
        int i10;
        rm00[] rm00VarArr3;
        ByteBuffer byteBufferWrap2;
        int i11;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i12;
        ByteBuffer byteBufferWrap3;
        int i13;
        String string = str2;
        String str3 = "ISOSpeedRatings".equals(str) ? "PhotographicSensitivity" : str;
        byte b = 2;
        int i14 = 1;
        if (string != null && b0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = g0.matcher(string);
                if (!matcher.find()) {
                    return;
                }
                string = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    string = new rm00(Double.parseDouble(string)).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        int i15 = 0;
        int i16 = 0;
        while (i16 < V.length) {
            if ((i16 != 4 || this.h) && (qm00Var = (qm00) a0[i16].get(str3)) != null) {
                int i17 = qm00Var.d;
                byte b2 = qm00Var.c;
                HashMap[] mapArr = this.e;
                if (string != null) {
                    Pair pairU = u(string);
                    int i18 = -1;
                    if (b2 == ((Integer) pairU.first).intValue() || b2 == ((Integer) pairU.second).intValue()) {
                        i17 = b2;
                        iArr = S;
                        switch (i17) {
                            case 1:
                                HashMap map = mapArr[i16];
                                i = i14;
                                i2 = 0;
                                if (string.length() == i || string.charAt(0) < '0' || string.charAt(0) > '1') {
                                    byte[] bytes = string.getBytes(d0);
                                    pm00Var = new pm00(i, bytes, bytes.length, 0);
                                } else {
                                    byte[] bArr = new byte[i];
                                    bArr[0] = (byte) (string.charAt(0) - '0');
                                    pm00Var = new pm00(i, bArr, i, 0);
                                }
                                map.put(str3, pm00Var);
                                break;
                            case 2:
                            case 7:
                                i3 = i14;
                                mapArr[i16].put(str3, pm00.a(string));
                                i = i3;
                                i2 = 0;
                                break;
                            case 3:
                                i3 = i14;
                                strArrSplit = string.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i4 < strArrSplit.length) {
                                    iArr2[i4] = Integer.parseInt(strArrSplit[i4]);
                                }
                                mapArr[i16].put(str3, pm00.f(iArr2, this.g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 4:
                                i3 = i14;
                                strArrSplit2 = string.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i5 < strArrSplit2.length) {
                                    jArr[i5] = Long.parseLong(strArrSplit2[i5]);
                                }
                                mapArr[i16].put(str3, pm00.c(jArr, this.g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 5:
                                i3 = i14;
                                i6 = -1;
                                strArrSplit3 = string.split(",", -1);
                                rm00VarArr = new rm00[strArrSplit3.length];
                                i7 = 0;
                                while (i7 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i7].split("/", i6);
                                    rm00VarArr[i7] = new rm00((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i3]));
                                    i7++;
                                    i6 = -1;
                                }
                                mapArr[i16].put(str3, pm00.d(rm00VarArr, this.g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 9:
                                i3 = i14;
                                strArrSplit4 = string.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i8 < strArrSplit4.length) {
                                    iArr3[i8] = Integer.parseInt(strArrSplit4[i8]);
                                }
                                HashMap map2 = mapArr[i16];
                                ByteOrder byteOrder = this.g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i9 < length) {
                                    byteBufferWrap.putInt(iArr3[i9]);
                                }
                                map2.put(str3, new pm00(9, byteBufferWrap.array(), length, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 10:
                                strArrSplit5 = string.split(",", -1);
                                length2 = strArrSplit5.length;
                                rm00VarArr2 = new rm00[length2];
                                i10 = i15;
                                while (i10 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i10].split("/", i18);
                                    rm00[] rm00VarArr4 = rm00VarArr2;
                                    rm00VarArr4[i10] = new rm00((long) Double.parseDouble(strArrSplit8[i15]), (long) Double.parseDouble(strArrSplit8[i14]));
                                    i10++;
                                    i14 = i14;
                                    rm00VarArr2 = rm00VarArr4;
                                    i15 = 0;
                                    i18 = -1;
                                }
                                i3 = i14;
                                rm00VarArr3 = rm00VarArr2;
                                HashMap map3 = mapArr[i16];
                                ByteOrder byteOrder2 = this.g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                while (i11 < length2) {
                                    rm00 rm00Var = rm00VarArr3[i11];
                                    byteBufferWrap2.putInt((int) rm00Var.a);
                                    byteBufferWrap2.putInt((int) rm00Var.b);
                                }
                                map3.put(str3, new pm00(10, byteBufferWrap2.array(), length2, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 12:
                                strArrSplit6 = string.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i12 < strArrSplit6.length) {
                                    dArr[i12] = Double.parseDouble(strArrSplit6[i12]);
                                }
                                HashMap map4 = mapArr[i16];
                                ByteOrder byteOrder3 = this.g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                while (i13 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i13]);
                                }
                                map4.put(str3, new pm00(12, byteBufferWrap3.array(), length3, i15));
                                break;
                        }
                    } else if (i17 != -1 && (i17 == ((Integer) pairU.first).intValue() || i17 == ((Integer) pairU.second).intValue())) {
                        iArr = S;
                        switch (i17) {
                            case 1:
                                HashMap map5 = mapArr[i16];
                                i = i14;
                                i2 = 0;
                                if (string.length() == i) {
                                    byte[] bytes2 = string.getBytes(d0);
                                    pm00Var = new pm00(i, bytes2, bytes2.length, 0);
                                } else {
                                    byte[] bytes3 = string.getBytes(d0);
                                    pm00Var = new pm00(i, bytes3, bytes3.length, 0);
                                }
                                map5.put(str3, pm00Var);
                                break;
                            case 2:
                            case 7:
                                i3 = i14;
                                mapArr[i16].put(str3, pm00.a(string));
                                i = i3;
                                i2 = 0;
                                break;
                            case 3:
                                i3 = i14;
                                strArrSplit = string.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i4 = 0; i4 < strArrSplit.length; i4++) {
                                    iArr2[i4] = Integer.parseInt(strArrSplit[i4]);
                                }
                                mapArr[i16].put(str3, pm00.f(iArr2, this.g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 4:
                                i3 = i14;
                                strArrSplit2 = string.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i5 = 0; i5 < strArrSplit2.length; i5++) {
                                    jArr[i5] = Long.parseLong(strArrSplit2[i5]);
                                }
                                mapArr[i16].put(str3, pm00.c(jArr, this.g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 5:
                                i3 = i14;
                                i6 = -1;
                                strArrSplit3 = string.split(",", -1);
                                rm00VarArr = new rm00[strArrSplit3.length];
                                i7 = 0;
                                while (i7 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i7].split("/", i6);
                                    rm00VarArr[i7] = new rm00((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[i3]));
                                    i7++;
                                    i6 = -1;
                                }
                                mapArr[i16].put(str3, pm00.d(rm00VarArr, this.g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 9:
                                i3 = i14;
                                strArrSplit4 = string.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i8 = 0; i8 < strArrSplit4.length; i8++) {
                                    iArr3[i8] = Integer.parseInt(strArrSplit4[i8]);
                                }
                                HashMap map6 = mapArr[i16];
                                ByteOrder byteOrder4 = this.g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder4);
                                for (i9 = 0; i9 < length; i9++) {
                                    byteBufferWrap.putInt(iArr3[i9]);
                                }
                                map6.put(str3, new pm00(9, byteBufferWrap.array(), length, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 10:
                                strArrSplit5 = string.split(",", -1);
                                length2 = strArrSplit5.length;
                                rm00VarArr2 = new rm00[length2];
                                i10 = i15;
                                while (i10 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i10].split("/", i18);
                                    rm00[] rm00VarArr5 = rm00VarArr2;
                                    rm00VarArr5[i10] = new rm00((long) Double.parseDouble(strArrSplit10[i15]), (long) Double.parseDouble(strArrSplit10[i14]));
                                    i10++;
                                    i14 = i14;
                                    rm00VarArr2 = rm00VarArr5;
                                    i15 = 0;
                                    i18 = -1;
                                }
                                i3 = i14;
                                rm00VarArr3 = rm00VarArr2;
                                HashMap map7 = mapArr[i16];
                                ByteOrder byteOrder5 = this.g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder5);
                                for (i11 = 0; i11 < length2; i11++) {
                                    rm00 rm00Var2 = rm00VarArr3[i11];
                                    byteBufferWrap2.putInt((int) rm00Var2.a);
                                    byteBufferWrap2.putInt((int) rm00Var2.b);
                                }
                                map7.put(str3, new pm00(10, byteBufferWrap2.array(), length2, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 12:
                                strArrSplit6 = string.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i12 = i15; i12 < strArrSplit6.length; i12++) {
                                    dArr[i12] = Double.parseDouble(strArrSplit6[i12]);
                                }
                                HashMap map8 = mapArr[i16];
                                ByteOrder byteOrder6 = this.g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                for (i13 = i15; i13 < length3; i13++) {
                                    byteBufferWrap3.putDouble(dArr[i13]);
                                }
                                map8.put(str3, new pm00(12, byteBufferWrap3.array(), length3, i15));
                                break;
                        }
                    } else if (b2 == i14 || b2 == 7 || b2 == b) {
                        i17 = b2;
                        iArr = S;
                        switch (i17) {
                            case 1:
                                HashMap map9 = mapArr[i16];
                                i = i14;
                                i2 = 0;
                                if (string.length() == i) {
                                    byte[] bytes4 = string.getBytes(d0);
                                    pm00Var = new pm00(i, bytes4, bytes4.length, 0);
                                } else {
                                    byte[] bytes5 = string.getBytes(d0);
                                    pm00Var = new pm00(i, bytes5, bytes5.length, 0);
                                }
                                map9.put(str3, pm00Var);
                                break;
                            case 2:
                            case 7:
                                i3 = i14;
                                mapArr[i16].put(str3, pm00.a(string));
                                i = i3;
                                i2 = 0;
                                break;
                            case 3:
                                i3 = i14;
                                strArrSplit = string.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i4 < strArrSplit.length) {
                                    iArr2[i4] = Integer.parseInt(strArrSplit[i4]);
                                }
                                mapArr[i16].put(str3, pm00.f(iArr2, this.g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 4:
                                i3 = i14;
                                strArrSplit2 = string.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i5 < strArrSplit2.length) {
                                    jArr[i5] = Long.parseLong(strArrSplit2[i5]);
                                }
                                mapArr[i16].put(str3, pm00.c(jArr, this.g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 5:
                                i3 = i14;
                                i6 = -1;
                                strArrSplit3 = string.split(",", -1);
                                rm00VarArr = new rm00[strArrSplit3.length];
                                i7 = 0;
                                while (i7 < strArrSplit3.length) {
                                    String[] strArrSplit11 = strArrSplit3[i7].split("/", i6);
                                    rm00VarArr[i7] = new rm00((long) Double.parseDouble(strArrSplit11[0]), (long) Double.parseDouble(strArrSplit11[i3]));
                                    i7++;
                                    i6 = -1;
                                }
                                mapArr[i16].put(str3, pm00.d(rm00VarArr, this.g));
                                i = i3;
                                i2 = 0;
                                break;
                            case 9:
                                i3 = i14;
                                strArrSplit4 = string.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i8 < strArrSplit4.length) {
                                    iArr3[i8] = Integer.parseInt(strArrSplit4[i8]);
                                }
                                HashMap map10 = mapArr[i16];
                                ByteOrder byteOrder7 = this.g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder7);
                                while (i9 < length) {
                                    byteBufferWrap.putInt(iArr3[i9]);
                                }
                                map10.put(str3, new pm00(9, byteBufferWrap.array(), length, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 10:
                                strArrSplit5 = string.split(",", -1);
                                length2 = strArrSplit5.length;
                                rm00VarArr2 = new rm00[length2];
                                i10 = i15;
                                while (i10 < strArrSplit5.length) {
                                    String[] strArrSplit12 = strArrSplit5[i10].split("/", i18);
                                    rm00[] rm00VarArr6 = rm00VarArr2;
                                    rm00VarArr6[i10] = new rm00((long) Double.parseDouble(strArrSplit12[i15]), (long) Double.parseDouble(strArrSplit12[i14]));
                                    i10++;
                                    i14 = i14;
                                    rm00VarArr2 = rm00VarArr6;
                                    i15 = 0;
                                    i18 = -1;
                                }
                                i3 = i14;
                                rm00VarArr3 = rm00VarArr2;
                                HashMap map11 = mapArr[i16];
                                ByteOrder byteOrder8 = this.g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder8);
                                while (i11 < length2) {
                                    rm00 rm00Var3 = rm00VarArr3[i11];
                                    byteBufferWrap2.putInt((int) rm00Var3.a);
                                    byteBufferWrap2.putInt((int) rm00Var3.b);
                                }
                                map11.put(str3, new pm00(10, byteBufferWrap2.array(), length2, 0));
                                i = i3;
                                i2 = 0;
                                break;
                            case 12:
                                strArrSplit6 = string.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i12 < strArrSplit6.length) {
                                    dArr[i12] = Double.parseDouble(strArrSplit6[i12]);
                                }
                                HashMap map12 = mapArr[i16];
                                ByteOrder byteOrder9 = this.g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder9);
                                while (i13 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i13]);
                                }
                                map12.put(str3, new pm00(12, byteBufferWrap3.array(), length3, i15));
                                break;
                        }
                    } else if (u) {
                        String[] strArr = R;
                        String str4 = strArr[b2];
                        if (i17 != -1) {
                            String str5 = strArr[i17];
                        }
                        String str6 = strArr[((Integer) pairU.first).intValue()];
                        if (((Integer) pairU.second).intValue() != -1) {
                            String str7 = strArr[((Integer) pairU.second).intValue()];
                        }
                    }
                } else {
                    mapArr[i16].remove(str3);
                }
                i2 = i15;
                i = i14;
            } else {
                i2 = i15;
                i = i14;
            }
            i16++;
            i14 = i;
            i15 = i2;
            b = 2;
        }
    }

    public final void I(nm00 nm00Var) throws Throwable {
        pm00 pm00Var;
        HashMap map = this.e[4];
        pm00 pm00Var2 = (pm00) map.get("Compression");
        if (pm00Var2 == null) {
            this.m = 6;
            v(nm00Var, map);
            return;
        }
        int iH = pm00Var2.h(this.g);
        this.m = iH;
        if (iH != 1) {
            if (iH == 6) {
                v(nm00Var, map);
                return;
            } else if (iH != 7) {
                return;
            }
        }
        pm00 pm00Var3 = (pm00) map.get("BitsPerSample");
        if (pm00Var3 != null) {
            int[] iArr = (int[]) pm00Var3.j(this.g);
            int[] iArr2 = x;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.d != 3 || (pm00Var = (pm00) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iH2 = pm00Var.h(this.g);
                if ((iH2 != 1 || !Arrays.equals(iArr, y)) && (iH2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            pm00 pm00Var4 = (pm00) map.get("StripOffsets");
            pm00 pm00Var5 = (pm00) map.get("StripByteCounts");
            if (pm00Var4 == null || pm00Var5 == null) {
                return;
            }
            long[] jArrD = d(pm00Var4.j(this.g));
            long[] jArrD2 = d(pm00Var5.j(this.g));
            if (jArrD == null || jArrD.length == 0 || jArrD2 == null || jArrD2.length == 0 || jArrD.length != jArrD2.length) {
                return;
            }
            long j = 0;
            for (long j2 : jArrD2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            this.i = true;
            this.h = true;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < jArrD.length; i4++) {
                int i5 = (int) jArrD[i4];
                int i6 = (int) jArrD2[i4];
                if (i4 < jArrD.length - 1 && i5 + i6 != jArrD[i4 + 1]) {
                    this.i = false;
                }
                int i7 = i5 - i2;
                nm00Var.a(i7);
                int i8 = i2 + i7;
                byte[] bArr2 = new byte[i6];
                nm00Var.read(bArr2);
                i2 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.l = bArr;
            if (this.i) {
                this.j = ((int) jArrD[0]) + this.n;
                this.k = i;
            }
        }
    }

    public final void J(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.e;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        pm00 pm00Var = (pm00) mapArr[i].get("ImageLength");
        pm00 pm00Var2 = (pm00) mapArr[i].get("ImageWidth");
        pm00 pm00Var3 = (pm00) mapArr[i2].get("ImageLength");
        pm00 pm00Var4 = (pm00) mapArr[i2].get("ImageWidth");
        if (pm00Var == null || pm00Var2 == null || pm00Var3 == null || pm00Var4 == null) {
            return;
        }
        int iH = pm00Var.h(this.g);
        int iH2 = pm00Var2.h(this.g);
        int iH3 = pm00Var3.h(this.g);
        int iH4 = pm00Var4.h(this.g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void K(nm00 nm00Var, int i) throws Throwable {
        pm00 pm00Var;
        pm00 pm00VarE;
        pm00 pm00VarE2;
        HashMap[] mapArr = this.e;
        pm00 pm00Var2 = (pm00) mapArr[i].get("DefaultCropSize");
        pm00 pm00Var3 = (pm00) mapArr[i].get("SensorTopBorder");
        pm00 pm00Var4 = (pm00) mapArr[i].get("SensorLeftBorder");
        pm00 pm00Var5 = (pm00) mapArr[i].get("SensorBottomBorder");
        pm00 pm00Var6 = (pm00) mapArr[i].get("SensorRightBorder");
        if (pm00Var2 != null) {
            int i2 = pm00Var2.a;
            ByteOrder byteOrder = this.g;
            if (i2 == 5) {
                rm00[] rm00VarArr = (rm00[]) pm00Var2.j(byteOrder);
                if (rm00VarArr == null || rm00VarArr.length != 2) {
                    Arrays.toString(rm00VarArr);
                    return;
                } else {
                    pm00VarE = pm00.d(new rm00[]{rm00VarArr[0]}, this.g);
                    pm00VarE2 = pm00.d(new rm00[]{rm00VarArr[1]}, this.g);
                }
            } else {
                int[] iArr = (int[]) pm00Var2.j(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    pm00VarE = pm00.e(iArr[0], this.g);
                    pm00VarE2 = pm00.e(iArr[1], this.g);
                }
            }
            mapArr[i].put("ImageWidth", pm00VarE);
            mapArr[i].put("ImageLength", pm00VarE2);
            return;
        }
        if (pm00Var3 == null || pm00Var4 == null || pm00Var5 == null || pm00Var6 == null) {
            pm00 pm00Var7 = (pm00) mapArr[i].get("ImageLength");
            pm00 pm00Var8 = (pm00) mapArr[i].get("ImageWidth");
            if ((pm00Var7 == null || pm00Var8 == null) && (pm00Var = (pm00) mapArr[i].get("JPEGInterchangeFormat")) != null) {
                l(nm00Var, pm00Var.h(this.g), i);
                return;
            }
            return;
        }
        int iH = pm00Var3.h(this.g);
        int iH2 = pm00Var5.h(this.g);
        int iH3 = pm00Var6.h(this.g);
        int iH4 = pm00Var4.h(this.g);
        if (iH2 <= iH || iH3 <= iH4) {
            return;
        }
        pm00 pm00VarE3 = pm00.e(iH2 - iH, this.g);
        pm00 pm00VarE4 = pm00.e(iH3 - iH4, this.g);
        mapArr[i].put("ImageLength", pm00VarE3);
        mapArr[i].put("ImageWidth", pm00VarE4);
    }

    public final void L() throws Throwable {
        J(0, 5);
        J(0, 4);
        J(5, 4);
        HashMap[] mapArr = this.e;
        pm00 pm00Var = (pm00) mapArr[1].get("PixelXDimension");
        pm00 pm00Var2 = (pm00) mapArr[1].get("PixelYDimension");
        if (pm00Var != null && pm00Var2 != null) {
            mapArr[0].put("ImageWidth", pm00Var);
            mapArr[0].put("ImageLength", pm00Var2);
        }
        if (mapArr[4].isEmpty() && w(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        w(mapArr[4]);
    }

    public final void M(om00 om00Var) {
        HashMap[] mapArr;
        int[] iArr;
        qm00[][] qm00VarArr = V;
        int[] iArr2 = new int[qm00VarArr.length];
        int[] iArr3 = new int[qm00VarArr.length];
        qm00[] qm00VarArr2 = W;
        for (qm00 qm00Var : qm00VarArr2) {
            D(qm00Var.b);
        }
        qm00 qm00Var2 = X;
        String str = qm00Var2.b;
        String str2 = qm00Var2.b;
        D(str);
        qm00 qm00Var3 = Y;
        D(qm00Var3.b);
        int i = 0;
        while (true) {
            int length = qm00VarArr.length;
            mapArr = this.e;
            if (i >= length) {
                break;
            }
            for (Object obj : mapArr[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    mapArr[i].remove(entry.getKey());
                }
            }
            i++;
        }
        int i2 = 1;
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(qm00VarArr2[1].b, pm00.b(0L, this.g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(qm00VarArr2[2].b, pm00.b(0L, this.g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(qm00VarArr2[3].b, pm00.b(0L, this.g));
        }
        if (this.h) {
            mapArr[4].put(str2, pm00.b(0L, this.g));
            mapArr[4].put(qm00Var3.b, pm00.b(this.k, this.g));
        }
        int i3 = 0;
        while (true) {
            int length2 = qm00VarArr.length;
            iArr = S;
            if (i3 >= length2) {
                break;
            }
            Iterator it = mapArr[i3].entrySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                pm00 pm00Var = (pm00) ((Map.Entry) it.next()).getValue();
                pm00Var.getClass();
                int i5 = i2;
                int i6 = iArr[pm00Var.a] * pm00Var.b;
                if (i6 > 4) {
                    i4 += i6;
                }
                i2 = i5;
            }
            iArr3[i3] = iArr3[i3] + i4;
            i3++;
            i2 = i2;
        }
        int i7 = i2;
        int size = 8;
        for (int i8 = 0; i8 < qm00VarArr.length; i8++) {
            if (!mapArr[i8].isEmpty()) {
                iArr2[i8] = size;
                size = (mapArr[i8].size() * 12) + 6 + iArr3[i8] + size;
            }
        }
        if (this.h) {
            mapArr[4].put(str2, pm00.b(size, this.g));
            this.j = this.n + size;
            size += this.k;
        }
        if (this.d == 4) {
            size += 8;
        }
        if (u) {
            for (int i9 = 0; i9 < qm00VarArr.length; i9++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i9), Integer.valueOf(iArr2[i9]), Integer.valueOf(mapArr[i9].size()), Integer.valueOf(iArr3[i9]), Integer.valueOf(size));
            }
        }
        if (!mapArr[i7].isEmpty()) {
            mapArr[0].put(qm00VarArr2[i7].b, pm00.b(iArr2[i7], this.g));
        }
        if (!mapArr[r10].isEmpty()) {
            mapArr[0].put(qm00VarArr2[r10].b, pm00.b(iArr2[2], this.g));
        }
        if (!mapArr[r10].isEmpty()) {
            mapArr[i7].put(qm00VarArr2[r10].b, pm00.b(iArr2[3], this.g));
        }
        int i10 = this.d;
        if (i10 == 4) {
            om00Var.g(size);
            om00Var.write(e0);
        } else if (i10 == 13) {
            om00Var.d(size);
            om00Var.write(G);
        } else if (i10 == 14) {
            om00Var.write(L);
            om00Var.d(size);
        }
        om00Var.e(this.g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        om00Var.a(this.g);
        om00Var.g(42);
        om00Var.f(8L);
        for (int i11 = 0; i11 < qm00VarArr.length; i11++) {
            if (!mapArr[i11].isEmpty()) {
                om00Var.g(mapArr[i11].size());
                int size2 = (mapArr[i11].size() * 12) + iArr2[i11] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i11].entrySet()) {
                    char c = ((qm00) a0[i11].get(entry2.getKey())).a;
                    pm00 pm00Var2 = (pm00) entry2.getValue();
                    pm00Var2.getClass();
                    int i12 = pm00Var2.b;
                    int i13 = pm00Var2.a;
                    int i14 = iArr[i13] * i12;
                    om00Var.g(c);
                    om00Var.g(i13);
                    om00Var.d(i12);
                    if (i14 > 4) {
                        om00Var.f(size2);
                        size2 += i14;
                    } else {
                        om00Var.write(pm00Var2.c);
                        if (i14 < 4) {
                            while (i14 < 4) {
                                om00Var.c(0);
                                i14++;
                            }
                        }
                    }
                }
                if (i11 != 0 || mapArr[4].isEmpty()) {
                    om00Var.f(0L);
                } else {
                    om00Var.f(iArr2[4]);
                }
                Iterator it2 = mapArr[i11].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((pm00) ((Map.Entry) it2.next()).getValue()).c;
                    if (bArr.length > 4) {
                        om00Var.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.h) {
            om00Var.write(s());
        }
        if (this.d == 14 && size % 2 == i7) {
            om00Var.c(0);
        }
        om00Var.a(ByteOrder.BIG_ENDIAN);
    }

    public final void a() {
        String strH = h("DateTimeOriginal");
        HashMap[] mapArr = this.e;
        if (strH != null && h("DateTime") == null) {
            mapArr[0].put("DateTime", pm00.a(strH));
        }
        if (h("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", pm00.b(0L, this.g));
        }
        if (h("ImageLength") == null) {
            mapArr[0].put("ImageLength", pm00.b(0L, this.g));
        }
        if (h("Orientation") == null) {
            mapArr[0].put("Orientation", pm00.b(0L, this.g));
        }
        if (h("LightSource") == null) {
            mapArr[1].put("LightSource", pm00.b(0L, this.g));
        }
    }

    public final String h(String str) {
        if (str == null) {
            bhn0.i("tag shouldn't be null");
            return null;
        }
        pm00 pm00VarJ = j(str);
        if (pm00VarJ != null) {
            if (!b0.contains(str)) {
                return pm00VarJ.i(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = pm00VarJ.a;
                if (i == 5 || i == 10) {
                    rm00[] rm00VarArr = (rm00[]) pm00VarJ.j(this.g);
                    if (rm00VarArr == null || rm00VarArr.length != 3) {
                        Arrays.toString(rm00VarArr);
                        return null;
                    }
                    rm00 rm00Var = rm00VarArr[0];
                    Integer numValueOf = Integer.valueOf((int) (rm00Var.a / rm00Var.b));
                    rm00 rm00Var2 = rm00VarArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (rm00Var2.a / rm00Var2.b));
                    rm00 rm00Var3 = rm00VarArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (rm00Var3.a / rm00Var3.b)));
                }
            } else {
                try {
                    return Double.toString(pm00VarJ.g(this.g));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public final int i(int i, String str) {
        pm00 pm00VarJ = j(str);
        if (pm00VarJ != null) {
            try {
                return pm00VarJ.h(this.g);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final pm00 j(String str) {
        if (str == null) {
            bhn0.i("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < V.length; i++) {
            pm00 pm00Var = (pm00) this.e[i].get(str);
            if (pm00Var != null) {
                return pm00Var;
            }
        }
        return null;
    }

    public final void k(nm00 nm00Var) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource((MediaDataSource) new mm00(nm00Var));
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(strExtractMetadata6)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(strExtractMetadata7)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                strExtractMetadata = null;
                strExtractMetadata2 = null;
                strExtractMetadata3 = null;
            }
            HashMap[] mapArr = this.e;
            if (strExtractMetadata != null) {
                mapArr[0].put("ImageWidth", pm00.e(Integer.parseInt(strExtractMetadata), this.g));
            }
            if (strExtractMetadata2 != null) {
                mapArr[0].put("ImageLength", pm00.e(Integer.parseInt(strExtractMetadata2), this.g));
            }
            if (strExtractMetadata3 != null) {
                int i2 = Integer.parseInt(strExtractMetadata3);
                if (i2 == 90) {
                    i = 6;
                } else if (i2 != 180) {
                    i = i2 != 270 ? 1 : 8;
                } else {
                    i = 3;
                }
                mapArr[0].put("Orientation", pm00.e(i, this.g));
            }
            if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                int i3 = Integer.parseInt(strExtractMetadata4);
                int i4 = Integer.parseInt(strExtractMetadata5);
                if (i4 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                nm00Var.a(i3);
                byte[] bArr = new byte[6];
                if (nm00Var.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i5 = i3 + 6;
                int i6 = i4 - 6;
                if (!Arrays.equals(bArr, e0)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i6];
                if (nm00Var.read(bArr2) != i6) {
                    throw new IOException("Can't read exif");
                }
                this.n = i5;
                B(bArr2, 0);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc A[LOOP:2: B:65:0x00f2->B:70:0x00fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135 A[LOOP:0: B:10:0x002a->B:80:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x009f A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void l(p.nm00 r17, int r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sm00.l(p.nm00, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x014e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0155 A[LOOP:3: B:113:0x0149->B:118:0x0155, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x015f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0169 A[LOOP:4: B:120:0x015a->B:125:0x0169, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x016f A[LOOP:2: B:108:0x013c->B:128:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0168 A[EDGE_INSN: B:160:0x0168->B:124:0x0168 BREAK  A[LOOP:3: B:113:0x0149->B:118:0x0155], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0168 A[EDGE_INSN: B:162:0x0168->B:124:0x0168 BREAK  A[LOOP:3: B:113:0x0149->B:118:0x0155], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    public final int m(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        nm00 nm00Var;
        nm00 nm00Var2;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6;
        byte[] bArr3;
        nm00 nm00Var3;
        short s;
        long j;
        bufferedInputStream.mark(CrashReportManager.TIME_WINDOW);
        byte[] bArr4 = new byte[CrashReportManager.TIME_WINDOW];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr5 = z;
            if (i7 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i7] != bArr5[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    if (bArr4[i8] != bytes[i8]) {
                        nm00 nm00Var4 = null;
                        try {
                            try {
                                try {
                                    nm00Var = new nm00(bArr4);
                                    try {
                                        try {
                                            long j2 = nm00Var.readInt();
                                            byte[] bArr6 = new byte[4];
                                            nm00Var.read(bArr6);
                                            if (Arrays.equals(bArr6, A)) {
                                                if (j2 == 1) {
                                                    j2 = nm00Var.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                } else {
                                                    j = 8;
                                                }
                                                if (j2 > 5000) {
                                                    j2 = 5000;
                                                }
                                                long j3 = j2 - j;
                                                if (j3 >= 8) {
                                                    byte[] bArr7 = new byte[4];
                                                    long j4 = 0;
                                                    boolean z2 = false;
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (j4 >= j3 / 4) {
                                                            i = 0;
                                                            break;
                                                        }
                                                        i = 0;
                                                        try {
                                                            if (nm00Var.read(bArr7) != 4) {
                                                                break;
                                                            }
                                                            if (j4 != 1) {
                                                                if (Arrays.equals(bArr7, B)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr7, C)) {
                                                                    z3 = true;
                                                                }
                                                                if (z2 && z3) {
                                                                    nm00Var.close();
                                                                    return 12;
                                                                }
                                                            }
                                                            j4++;
                                                        } catch (Exception unused) {
                                                            if (nm00Var != null) {
                                                                break;
                                                            }
                                                            nm00Var2 = new nm00(bArr4);
                                                            ByteOrder byteOrderA = A(nm00Var2);
                                                            this.g = byteOrderA;
                                                            nm00Var2.b = byteOrderA;
                                                            s = nm00Var2.readShort();
                                                            if (s != 20306) {
                                                                i2 = 1;
                                                            } else {
                                                                i2 = 1;
                                                            }
                                                            nm00Var2.close();
                                                            if (i2 != 0) {
                                                                return 7;
                                                            }
                                                            try {
                                                                nm00Var3 = new nm00(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderA2 = A(nm00Var3);
                                                                    this.g = byteOrderA2;
                                                                    nm00Var3.b = byteOrderA2;
                                                                    i3 = nm00Var3.readShort() != 85 ? i : 1;
                                                                    nm00Var3.close();
                                                                } catch (Exception unused2) {
                                                                    nm00Var4 = nm00Var3;
                                                                    if (nm00Var4 != null) {
                                                                        nm00Var4.close();
                                                                    }
                                                                    i3 = i;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    nm00Var4 = nm00Var3;
                                                                    if (nm00Var4 != null) {
                                                                        nm00Var4.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused3) {
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                            }
                                                            if (i3 != 0) {
                                                                return 10;
                                                            }
                                                            i4 = i;
                                                            while (true) {
                                                                bArr = F;
                                                                if (i4 >= bArr.length) {
                                                                    return 13;
                                                                }
                                                                if (bArr4[i4] != bArr[i4]) {
                                                                    i5 = i;
                                                                    while (true) {
                                                                        bArr2 = J;
                                                                        if (i5 >= bArr2.length) {
                                                                            i6 = i;
                                                                            while (true) {
                                                                                bArr3 = K;
                                                                                if (i6 >= bArr3.length) {
                                                                                    return 14;
                                                                                }
                                                                                if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                                    break;
                                                                                }
                                                                                i6++;
                                                                            }
                                                                        } else {
                                                                            if (bArr4[i5] != bArr2[i5]) {
                                                                                break;
                                                                            }
                                                                            i5++;
                                                                        }
                                                                    }
                                                                    return i;
                                                                }
                                                                i4++;
                                                            }
                                                        }
                                                    }
                                                    nm00Var.close();
                                                    nm00Var2 = new nm00(bArr4);
                                                    ByteOrder byteOrderA3 = A(nm00Var2);
                                                    this.g = byteOrderA3;
                                                    nm00Var2.b = byteOrderA3;
                                                    s = nm00Var2.readShort();
                                                    if (s != 20306 || s == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    nm00Var2.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    nm00Var3 = new nm00(bArr4);
                                                    ByteOrder byteOrderA4 = A(nm00Var3);
                                                    this.g = byteOrderA4;
                                                    nm00Var3.b = byteOrderA4;
                                                    if (nm00Var3.readShort() != 85) {
                                                    }
                                                    nm00Var3.close();
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = F;
                                                        if (i4 >= bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            i5 = i;
                                                            while (true) {
                                                                bArr2 = J;
                                                                if (i5 >= bArr2.length) {
                                                                    i6 = i;
                                                                    while (true) {
                                                                        bArr3 = K;
                                                                        if (i6 >= bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i6++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i5] != bArr2[i5]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i5++;
                                                                }
                                                            }
                                                            return i;
                                                        }
                                                        i4++;
                                                    }
                                                }
                                            }
                                            nm00Var.close();
                                            i = 0;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            nm00Var4 = nm00Var;
                                            if (nm00Var4 != null) {
                                                nm00Var4.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception unused4) {
                                        i = 0;
                                    }
                                } catch (Exception unused5) {
                                    i = 0;
                                    nm00Var = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                ByteOrder byteOrderA5 = A(nm00Var2);
                                this.g = byteOrderA5;
                                nm00Var2.b = byteOrderA5;
                                s = nm00Var2.readShort();
                                if (s != 20306) {
                                    i2 = 1;
                                } else {
                                    i2 = 1;
                                }
                                nm00Var2.close();
                            } catch (Exception unused6) {
                                if (nm00Var2 != null) {
                                    nm00Var2.close();
                                }
                                i2 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                nm00Var4 = nm00Var2;
                                if (nm00Var4 != null) {
                                    nm00Var4.close();
                                }
                                throw th;
                            }
                            nm00Var2 = new nm00(bArr4);
                        } catch (Exception unused7) {
                            nm00Var2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i2 != 0) {
                            return 7;
                        }
                        nm00Var3 = new nm00(bArr4);
                        ByteOrder byteOrderA6 = A(nm00Var3);
                        this.g = byteOrderA6;
                        nm00Var3.b = byteOrderA6;
                        if (nm00Var3.readShort() != 85) {
                        }
                        nm00Var3.close();
                        if (i3 != 0) {
                            return 10;
                        }
                        i4 = i;
                        while (true) {
                            bArr = F;
                            if (i4 >= bArr.length) {
                                return 13;
                            }
                            if (bArr4[i4] != bArr[i4]) {
                                i5 = i;
                                while (true) {
                                    bArr2 = J;
                                    if (i5 >= bArr2.length) {
                                        i6 = i;
                                        while (true) {
                                            bArr3 = K;
                                            if (i6 >= bArr3.length) {
                                                return 14;
                                            }
                                            if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                break;
                                                break;
                                            }
                                            i6++;
                                        }
                                    } else {
                                        if (bArr4[i5] != bArr2[i5]) {
                                            break;
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                                return i;
                            }
                            i4++;
                        }
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    public final void n(nm00 nm00Var) throws Throwable {
        int i;
        int i2;
        q(nm00Var);
        HashMap[] mapArr = this.e;
        pm00 pm00Var = (pm00) mapArr[1].get("MakerNote");
        if (pm00Var != null) {
            nm00 nm00Var2 = new nm00(pm00Var.c);
            nm00Var2.b = this.g;
            byte[] bArr = D;
            byte[] bArr2 = new byte[bArr.length];
            nm00Var2.readFully(bArr2);
            nm00Var2.a(0L);
            byte[] bArr3 = E;
            byte[] bArr4 = new byte[bArr3.length];
            nm00Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                nm00Var2.a(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                nm00Var2.a(12L);
            }
            C(nm00Var2, 6);
            pm00 pm00Var2 = (pm00) mapArr[7].get("PreviewImageStart");
            pm00 pm00Var3 = (pm00) mapArr[7].get("PreviewImageLength");
            if (pm00Var2 != null && pm00Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", pm00Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", pm00Var3);
            }
            pm00 pm00Var4 = (pm00) mapArr[8].get("AspectFrame");
            if (pm00Var4 != null) {
                int[] iArr = (int[]) pm00Var4.j(this.g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                pm00 pm00VarE = pm00.e(i5, this.g);
                pm00 pm00VarE2 = pm00.e(i6, this.g);
                mapArr[0].put("ImageWidth", pm00VarE);
                mapArr[0].put("ImageLength", pm00VarE2);
            }
        }
    }

    public final void o(nm00 nm00Var) throws Throwable {
        if (u) {
            Objects.toString(nm00Var);
        }
        nm00Var.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = F;
        nm00Var.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = nm00Var.readInt();
                byte[] bArr2 = new byte[4];
                if (nm00Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, H)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, I)) {
                    return;
                }
                if (Arrays.equals(bArr2, G)) {
                    byte[] bArr3 = new byte[i];
                    if (nm00Var.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int i3 = nm00Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.n = i2;
                        B(bArr3, 0);
                        L();
                        return;
                    } else {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                    }
                }
                int i4 = i + 4;
                nm00Var.skipBytes(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                k220.i("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void p(nm00 nm00Var) throws IOException {
        nm00Var.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        nm00Var.read(bArr);
        nm00Var.skipBytes(4);
        nm00Var.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        l(nm00Var, i, 5);
        nm00Var.a(i2);
        nm00Var.b = ByteOrder.BIG_ENDIAN;
        int i3 = nm00Var.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            int unsignedShort = nm00Var.readUnsignedShort();
            int unsignedShort2 = nm00Var.readUnsignedShort();
            if (unsignedShort == U.a) {
                short s = nm00Var.readShort();
                short s2 = nm00Var.readShort();
                pm00 pm00VarE = pm00.e(s, this.g);
                pm00 pm00VarE2 = pm00.e(s2, this.g);
                HashMap[] mapArr = this.e;
                mapArr[0].put("ImageLength", pm00VarE);
                mapArr[0].put("ImageWidth", pm00VarE2);
                return;
            }
            nm00Var.skipBytes(unsignedShort2);
        }
    }

    public final void q(nm00 nm00Var) throws Throwable {
        y(nm00Var, nm00Var.a.available());
        C(nm00Var, 0);
        K(nm00Var, 0);
        K(nm00Var, 5);
        K(nm00Var, 4);
        L();
        if (this.d == 8) {
            HashMap[] mapArr = this.e;
            pm00 pm00Var = (pm00) mapArr[1].get("MakerNote");
            if (pm00Var != null) {
                nm00 nm00Var2 = new nm00(pm00Var.c);
                nm00Var2.b = this.g;
                nm00Var2.a(6L);
                C(nm00Var2, 9);
                pm00 pm00Var2 = (pm00) mapArr[9].get("ColorSpace");
                if (pm00Var2 != null) {
                    mapArr[1].put("ColorSpace", pm00Var2);
                }
            }
        }
    }

    public final void r(nm00 nm00Var) throws Throwable {
        q(nm00Var);
        HashMap[] mapArr = this.e;
        if (((pm00) mapArr[0].get("JpgFromRaw")) != null) {
            l(nm00Var, this.r, 5);
        }
        pm00 pm00Var = (pm00) mapArr[0].get("ISO");
        pm00 pm00Var2 = (pm00) mapArr[1].get("PhotographicSensitivity");
        if (pm00Var == null || pm00Var2 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", pm00Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005d A[Catch: all -> 0x0084, Exception -> 0x00a1, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x00a1, all -> 0x0084, blocks: (B:36:0x005d, B:39:0x006d, B:41:0x0079, B:48:0x0086, B:49:0x008b, B:50:0x008c, B:51:0x0091, B:52:0x0092, B:53:0x0097), top: B:77:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x006d A[Catch: all -> 0x0084, Exception -> 0x00a1, TRY_ENTER, TryCatch #8 {Exception -> 0x00a1, all -> 0x0084, blocks: (B:36:0x005d, B:39:0x006d, B:41:0x0079, B:48:0x0086, B:49:0x008b, B:50:0x008c, B:51:0x0091, B:52:0x0092, B:53:0x0097), top: B:77:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079 A[Catch: all -> 0x0084, Exception -> 0x00a1, TRY_LEAVE, TryCatch #8 {Exception -> 0x00a1, all -> 0x0084, blocks: (B:36:0x005d, B:39:0x006d, B:41:0x0079, B:48:0x0086, B:49:0x008b, B:50:0x008c, B:51:0x0091, B:52:0x0092, B:53:0x0097), top: B:77:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0086 A[Catch: all -> 0x0084, Exception -> 0x00a1, TRY_ENTER, TryCatch #8 {Exception -> 0x00a1, all -> 0x0084, blocks: (B:36:0x005d, B:39:0x006d, B:41:0x0079, B:48:0x0086, B:49:0x008b, B:50:0x008c, B:51:0x0091, B:52:0x0092, B:53:0x0097), top: B:77:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x008c A[Catch: all -> 0x0084, Exception -> 0x00a1, TryCatch #8 {Exception -> 0x00a1, all -> 0x0084, blocks: (B:36:0x005d, B:39:0x006d, B:41:0x0079, B:48:0x0086, B:49:0x008b, B:50:0x008c, B:51:0x0091, B:52:0x0092, B:53:0x0097), top: B:77:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092 A[Catch: all -> 0x0084, Exception -> 0x00a1, TryCatch #8 {Exception -> 0x00a1, all -> 0x0084, blocks: (B:36:0x005d, B:39:0x006d, B:41:0x0079, B:48:0x0086, B:49:0x008b, B:50:0x008c, B:51:0x0091, B:52:0x0092, B:53:0x0097), top: B:77:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final byte[] s() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        byte[] bArr;
        InputStream inputStream = null;
        if (this.h) {
            byte[] bArr2 = this.l;
            if (bArr2 != null) {
                return bArr2;
            }
            try {
                fileInputStream = this.c;
                if (fileInputStream == null) {
                    if (this.a != null) {
                        fileInputStream = new FileInputStream(this.a);
                        fileDescriptor = null;
                        if (fileInputStream == null) {
                            throw new FileNotFoundException();
                        }
                        if (fileInputStream.skip(this.j) != this.j) {
                            throw new IOException("Corrupted image");
                        }
                        bArr = new byte[this.k];
                        if (fileInputStream.read(bArr) != this.k) {
                            throw new IOException("Corrupted image");
                        }
                        this.l = bArr;
                        c(fileInputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        return bArr;
                    }
                    FileDescriptor fileDescriptor2 = this.b;
                    if (fileDescriptor2 != null) {
                        FileDescriptor fileDescriptorDup = Os.dup(fileDescriptor2);
                        try {
                            Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                            fileDescriptor = fileDescriptorDup;
                            fileInputStream = new FileInputStream(fileDescriptorDup);
                        } catch (Exception unused) {
                            fileDescriptor = fileDescriptorDup;
                            fileInputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            fileDescriptor = fileDescriptorDup;
                            c(inputStream);
                            if (fileDescriptor != null) {
                                Os.close(fileDescriptor);
                            }
                            throw th;
                        }
                    } else {
                        fileInputStream = null;
                        fileDescriptor = null;
                    }
                    if (fileInputStream == null) {
                        throw new FileNotFoundException();
                    }
                    if (fileInputStream.skip(this.j) != this.j) {
                        throw new IOException("Corrupted image");
                    }
                    bArr = new byte[this.k];
                    if (fileInputStream.read(bArr) != this.k) {
                        throw new IOException("Corrupted image");
                    }
                    this.l = bArr;
                    c(fileInputStream);
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    return bArr;
                }
                try {
                    if (!fileInputStream.markSupported()) {
                        c(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                    try {
                        if (fileInputStream == null) {
                            throw new FileNotFoundException();
                        }
                        if (fileInputStream.skip(this.j) != this.j) {
                            throw new IOException("Corrupted image");
                        }
                        bArr = new byte[this.k];
                        if (fileInputStream.read(bArr) != this.k) {
                            throw new IOException("Corrupted image");
                        }
                        this.l = bArr;
                        c(fileInputStream);
                        if (fileDescriptor != null) {
                            try {
                                Os.close(fileDescriptor);
                            } catch (Exception unused2) {
                            }
                        }
                        return bArr;
                    } catch (Exception unused3) {
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = fileInputStream;
                        c(inputStream);
                        if (fileDescriptor != null) {
                            try {
                                Os.close(fileDescriptor);
                            } catch (Exception unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused5) {
                    fileDescriptor = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileDescriptor = null;
                    inputStream = fileInputStream;
                    c(inputStream);
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    throw th;
                }
                c(fileInputStream);
                if (fileDescriptor != null) {
                    try {
                        Os.close(fileDescriptor);
                    } catch (Exception unused6) {
                    }
                }
            } catch (Exception unused7) {
                fileInputStream = null;
                fileDescriptor = null;
            } catch (Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
        }
        return null;
    }

    public final void t(nm00 nm00Var) throws IOException {
        if (u) {
            Objects.toString(nm00Var);
        }
        nm00Var.b = ByteOrder.LITTLE_ENDIAN;
        nm00Var.skipBytes(J.length);
        int i = nm00Var.readInt() + 8;
        int iSkipBytes = nm00Var.skipBytes(K.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (nm00Var.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = nm00Var.readInt();
                int i3 = iSkipBytes + 8;
                if (Arrays.equals(L, bArr)) {
                    byte[] bArr2 = new byte[i2];
                    if (nm00Var.read(bArr2) == i2) {
                        this.n = i3;
                        B(bArr2, 0);
                        this.n = i3;
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                int i4 = i3 + i2;
                if (i4 == i) {
                    return;
                }
                if (i4 > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int iSkipBytes2 = nm00Var.skipBytes(i2);
                if (iSkipBytes2 != i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                iSkipBytes = i3 + iSkipBytes2;
            } catch (EOFException unused) {
                k220.i("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void v(nm00 nm00Var, HashMap map) throws Throwable {
        pm00 pm00Var = (pm00) map.get("JPEGInterchangeFormat");
        pm00 pm00Var2 = (pm00) map.get("JPEGInterchangeFormatLength");
        if (pm00Var == null || pm00Var2 == null) {
            return;
        }
        int iH = pm00Var.h(this.g);
        int iH2 = pm00Var2.h(this.g);
        if (this.d == 7) {
            iH += this.o;
        }
        int iMin = Math.min(iH2, nm00Var.c - iH);
        if (iH <= 0 || iMin <= 0) {
            return;
        }
        this.h = true;
        int i = iH + this.n;
        this.j = i;
        this.k = iMin;
        if (this.a == null && this.c == null && this.b == null) {
            byte[] bArr = new byte[iMin];
            nm00Var.a(i);
            nm00Var.readFully(bArr);
            this.l = bArr;
        }
    }

    public final boolean w(HashMap map) {
        pm00 pm00Var = (pm00) map.get("ImageLength");
        pm00 pm00Var2 = (pm00) map.get("ImageWidth");
        if (pm00Var == null || pm00Var2 == null) {
            return false;
        }
        return pm00Var.h(this.g) <= 512 && pm00Var2.h(this.g) <= 512;
    }

    public final void x(InputStream inputStream) throws Throwable {
        boolean z2 = u;
        for (int i = 0; i < V.length; i++) {
            try {
                try {
                    this.e[i] = new HashMap();
                } catch (IOException unused) {
                    this.s = false;
                    a();
                    if (z2) {
                        z();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                a();
                if (z2) {
                    z();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, CrashReportManager.TIME_WINDOW);
        this.d = m(bufferedInputStream);
        nm00 nm00Var = new nm00(bufferedInputStream);
        switch (this.d) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                q(nm00Var);
                break;
            case 4:
                l(nm00Var, 0, 0);
                break;
            case 7:
                n(nm00Var);
                break;
            case 9:
                p(nm00Var);
                break;
            case 10:
                r(nm00Var);
                break;
            case 12:
                k(nm00Var);
                break;
            case 13:
                o(nm00Var);
                break;
            case 14:
                t(nm00Var);
                break;
        }
        I(nm00Var);
        this.s = true;
        a();
        if (z2) {
            z();
        }
    }

    public final void y(nm00 nm00Var, int i) throws IOException {
        ByteOrder byteOrderA = A(nm00Var);
        this.g = byteOrderA;
        nm00Var.b = byteOrderA;
        int unsignedShort = nm00Var.readUnsignedShort();
        int i2 = this.d;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            k220.h(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i3 = nm00Var.readInt();
        if (i3 < 8 || i3 >= i) {
            k220.i(f4i1.c(i3, "Invalid first Ifd offset: "));
            return;
        }
        int i4 = i3 - 8;
        if (i4 <= 0 || nm00Var.skipBytes(i4) == i4) {
            return;
        }
        k220.i(f4i1.c(i4, "Couldn't jump to first Ifd: "));
    }

    public final void z() throws Throwable {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.e;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                pm00 pm00Var = (pm00) entry.getValue();
                pm00Var.toString();
                pm00Var.i(this.g);
            }
            i++;
        }
    }

    public sm00(InputStream inputStream) throws Throwable {
        qm00[][] qm00VarArr = V;
        this.e = new HashMap[qm00VarArr.length];
        this.f = new HashSet(qm00VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
                this.c = null;
                this.b = null;
            }
        } else {
            this.c = null;
            this.b = null;
        }
        x(inputStream);
    }
}
