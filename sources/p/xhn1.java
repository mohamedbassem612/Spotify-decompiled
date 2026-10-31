package p;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xhn1 implements jfp0 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final u120 f = new u120("key", td6.n(xvj1.n(ogn1.class, new ken1(1))));
    public static final u120 g = new u120("value", td6.n(xvj1.n(ogn1.class, new ken1(2))));
    public static final ehn1 h = ehn1.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final ziy0 d = new ziy0(this, (byte) 1);

    public xhn1(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    public static int j(u120 u120Var) throws EncodingException {
        ogn1 ogn1Var = (ogn1) u120Var.b(ogn1.class);
        if (ogn1Var != null) {
            return ogn1Var.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final jfp0 a(u120 u120Var, Object obj) {
        g(u120Var, obj, true);
        return this;
    }

    public final jfp0 b(u120 u120Var, double d) throws IOException {
        f(u120Var, d, true);
        return this;
    }

    public final /* synthetic */ jfp0 c(u120 u120Var, int i) {
        h(u120Var, i, true);
        return this;
    }

    public final /* synthetic */ jfp0 d(u120 u120Var, boolean z) {
        h(u120Var, z ? 1 : 0, true);
        return this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    public final /* synthetic */ jfp0 e(u120 u120Var, long j) throws EncodingException, IOException {
        i(u120Var, j, true);
        return this;
    }

    public final void f(u120 u120Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        l((j(u120Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(u120 u120Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((j(u120Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(e);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(u120Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                k(h, u120Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            f(u120Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            l((j(u120Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            i(u120Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            h(u120Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((j(u120Var) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        ifp0 ifp0Var = (ifp0) this.b.get(obj.getClass());
        if (ifp0Var != null) {
            k(ifp0Var, u120Var, obj, z);
            return;
        }
        msi1 msi1Var = (msi1) this.c.get(obj.getClass());
        if (msi1Var != null) {
            ziy0 ziy0Var = this.d;
            ziy0Var.b = false;
            ziy0Var.d = u120Var;
            ziy0Var.c = z;
            msi1Var.a(obj, ziy0Var);
            return;
        }
        if (obj instanceof tfn1) {
            h(u120Var, ((tfn1) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(u120Var, ((Enum) obj).ordinal(), true);
        } else {
            k(ehn1.c, u120Var, obj, z);
        }
    }

    public final void h(u120 u120Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        ogn1 ogn1Var = (ogn1) u120Var.b(ogn1.class);
        if (ogn1Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = ogn1Var.zzb().ordinal();
        if (iOrdinal == 0) {
            l(ogn1Var.zza() << 3);
            l(i);
        } else if (iOrdinal == 1) {
            l(ogn1Var.zza() << 3);
            l((i + i) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((ogn1Var.zza() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    public final void i(u120 u120Var, long j, boolean z) throws EncodingException, IOException {
        if (z && j == 0) {
            return;
        }
        ogn1 ogn1Var = (ogn1) u120Var.b(ogn1.class);
        if (ogn1Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = ogn1Var.zzb().ordinal();
        if (iOrdinal == 0) {
            l(ogn1Var.zza() << 3);
            m(j);
        } else if (iOrdinal == 1) {
            l(ogn1Var.zza() << 3);
            m((j >> 63) ^ (j + j));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((ogn1Var.zza() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void k(ifp0 ifp0Var, u120 u120Var, Object obj, boolean z) throws IOException {
        x2c0 x2c0Var = new x2c0((byte) 1);
        x2c0Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = x2c0Var;
            try {
                ifp0Var.a(obj, this);
                this.a = outputStream;
                long j = x2c0Var.b;
                x2c0Var.close();
                if (z && j == 0) {
                    return;
                }
                l((j(u120Var) << 3) | 2);
                m(j);
                ifp0Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                x2c0Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void l(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
