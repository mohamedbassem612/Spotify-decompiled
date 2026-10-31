package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.TypedValue;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.gms.tasks.Task;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class o0c {
    public static final pl10[] a = {new pl10(-1, 1, "usage_and_diagnostics_listener", true), new pl10(-1, 1, "usage_and_diagnostics_consents", true), new pl10(-1, 1, "usage_and_diagnostics_check_consents", true), new pl10(-1, 1, "usage_and_diagnostics_settings_access", true), new pl10(-1, 1, "el_capitan", false)};
    public static b180 b;

    public static ewq A(byte[] bArr) {
        if (bArr.length > 10240) {
            eg.m("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return ewq.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            bhn0.f(f4i1.c(s2, "Unsupported version number: "));
                        }
                    } else {
                        bhn0.f(f4i1.c(s, "Magic number doesn't match: "));
                    }
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        linkedHashMap.put(dataInputStream.readUTF(), B(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        u890.p(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException unused) {
            int i4 = b5r.a;
            qs10.a().getClass();
        } catch (ClassNotFoundException unused2) {
            int i5 = b5r.a;
            qs10.a().getClass();
        }
        return new ewq(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable B(DataInputStream dataInputStream, byte b2) throws IOException {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b2 == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b2 == 9) {
            int i3 = dataInputStream.readInt();
            ?? r1 = new Byte[i3];
            while (i < i3) {
                r1[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r1;
        }
        if (b2 == 10) {
            int i4 = dataInputStream.readInt();
            ?? r2 = new Integer[i4];
            while (i < i4) {
                r2[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r2;
        }
        if (b2 == 11) {
            int i5 = dataInputStream.readInt();
            ?? r3 = new Long[i5];
            while (i < i5) {
                r3[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r3;
        }
        if (b2 == 12) {
            int i6 = dataInputStream.readInt();
            ?? r4 = new Float[i6];
            while (i < i6) {
                r4[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r4;
        }
        if (b2 == 13) {
            int i7 = dataInputStream.readInt();
            ?? r5 = new Double[i7];
            while (i < i7) {
                r5[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r5;
        }
        if (b2 != 14) {
            eg.m(f4i1.c(b2, "Unsupported type "));
            return null;
        }
        int i8 = dataInputStream.readInt();
        ?? r6 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (u890.j(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i] = utf;
            i++;
        }
        return r6;
    }

    public static final void C(EditText editText) {
        editText.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public static final boolean D(sy21 sy21Var, yqg yqgVar) {
        ry21 ry21Var = sy21Var.a;
        ry21 ry21Var2 = ry21Var.t;
        if (ry21Var2 == null) {
            return false;
        }
        upc upcVarA = ry21Var.a.a();
        if (upcVarA.j && upcVarA.h == Integer.MAX_VALUE) {
            return true;
        }
        if (ry21Var2 == null) {
            return false;
        }
        upc upcVar = upc.n;
        int i = nyn1.Y(ry21Var2.f).c;
        if (i != -1) {
            return yqgVar.b() <= TimeUnit.SECONDS.toMillis((long) i) + ry21Var2.Z;
        }
        return true;
    }

    public static final boolean E(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (u890.q(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean F(int i, boolean z, boolean z2) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return z;
        }
        if (iC == 1) {
            return z2;
        }
        if (iC == 2) {
            return false;
        }
        eg.o();
        return false;
    }

    public static final boolean G(vsb0 vsb0Var, int i) {
        return i <= vsb0Var.b() && vsb0Var.h() <= i;
    }

    public static final qim0 H(qim0 qim0Var) {
        return qim0Var.then(eoa0.a);
    }

    public static PorterDuff.Mode I(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static gc31 J(cxc cxcVar, String str, i8b0 i8b0Var, Scheduler scheduler) {
        k370 k370Var = new k370();
        k370Var.i(m3i1.b);
        k370Var.e(str);
        l370 l370VarB = k370Var.b();
        ne neVar = new ne((byte) 10);
        neVar.h(l370VarB);
        neVar.l(cxcVar);
        if (scheduler == null) {
            bhn0.i("scheduler == null");
            return null;
        }
        ((ArrayList) neVar.d).add(new j241(scheduler, false));
        neVar.c(tpq0.d());
        neVar.c(tpq0.c());
        neVar.c(i8b0Var);
        return neVar.j();
    }

    public static final byte[] K(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        w(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static final long L(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void M(EditText editText) {
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager == null || inputMethodManager.showSoftInput(editText, 1)) {
            return;
        }
        inputMethodManager.toggleSoftInput(2, 0);
    }

    public static byte[] N(ewq ewqVar) {
        HashMap map = ewqVar.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    O(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            int i = b5r.a;
            qs10.a().getClass();
            return new byte[0];
        }
    }

    public static final void O(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                tw20.t(rc11.a.b(obj.getClass()).r(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            jd11 jd11Var = rc11.a;
            tka0 tka0VarB = jd11Var.b(cls);
            if (tka0VarB.equals(jd11Var.b(Boolean[].class))) {
                i = 8;
            } else if (tka0VarB.equals(jd11Var.b(Byte[].class))) {
                i = 9;
            } else if (tka0VarB.equals(jd11Var.b(Integer[].class))) {
                i = 10;
            } else if (tka0VarB.equals(jd11Var.b(Long[].class))) {
                i = 11;
            } else if (tka0VarB.equals(jd11Var.b(Float[].class))) {
                i = 12;
            } else if (tka0VarB.equals(jd11Var.b(Double[].class))) {
                i = 13;
            } else {
                if (!tka0VarB.equals(jd11Var.b(String[].class))) {
                    tw20.t(jd11Var.b(objArr.getClass()).o(), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final long P(long j) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j >> 32));
        return (((long) ((int) Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32);
    }

    public static final int Q(PlayerState playerState, String str) {
        if (sgy.h(str) || sgy.g(str)) {
            return 3;
        }
        boolean z = (sgy.i(str) || sgy.e(str)) ? false : true;
        if (str.equals(o4p1.o(playerState)) || ((z && str.equals(playerState.contextUri())) || (sgy.c(str) && str.equals(playerState.contextUri())))) {
            return playerState.isPaused() ? 2 : 1;
        }
        return 3;
    }

    public static final long R(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static hfp1 S(List list) {
        if (list == null || list.isEmpty()) {
            return z(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                bhn0.i("null tasks are not accepted");
                return null;
            }
        }
        hfp1 hfp1Var = new hfp1();
        yen1 yen1Var = new yen1(list.size(), hfp1Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            m5u m5uVar = dsd1.b;
            task.d(m5uVar, yen1Var);
            task.c(m5uVar, yen1Var);
            task.a(m5uVar, yen1Var);
        }
        return hfp1Var;
    }

    public static final Iterator T(Iterator it, int i, int i2, boolean z, boolean z2) {
        return !it.hasNext() ? y6x.a : j2h1.A(new gc91(i, i2, it, z2, z, null));
    }

    public static Object U(Task task) throws ExecutionException {
        if (task.j()) {
            return task.g();
        }
        if (((hfp1) task).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.f());
    }

    public static yw21 a(int i, FontWeight fontWeight, ja30 ja30Var) {
        if ((i & 2) != 0) {
            FontWeight fontWeight2 = FontWeight.b;
            fontWeight = w8p1.s();
        }
        return new yw21(2131296258, fontWeight, ja30Var);
    }

    public static yw21 b(int i, FontWeight fontWeight) {
        return new yw21(i, fontWeight, new ja30(new ga30[0]));
    }

    public static final long c(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static qim0 d(qim0 qim0Var, ni20 ni20Var, int i) {
        if ((i & 1) != 0) {
            n511 n511Var = ckk1.a;
            ni20Var = irn1.l0(0.0f, 400.0f, new yr80(4294967297L), 1);
        }
        return i1p1.r(qim0Var).then(new m291(ni20Var, een.d));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c9 A[Catch: jj90 -> 0x01a7, TryCatch #5 {jj90 -> 0x01a7, blocks: (B:35:0x00c5, B:37:0x00c9, B:39:0x00cf, B:53:0x00fd, B:57:0x0127, B:61:0x012f), top: B:109:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x017d -> B:18:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(p.vsb0 r28, int r29, int r30, int r31, p.wat r32, p.onm r33) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o0c.e(p.vsb0, int, int, int, p.wat, p.onm):java.lang.Object");
    }

    public static final boolean f(boolean z, vsb0 vsb0Var, int i, int i2) {
        if (z) {
            if (vsb0Var.h() > i) {
                return true;
            }
            return vsb0Var.h() == i && vsb0Var.g() > i2;
        }
        if (vsb0Var.h() < i) {
            return true;
        }
        return vsb0Var.h() == i && vsb0Var.g() < i2;
    }

    public static Object g(Task task) throws InterruptedException {
        zod.q();
        zod.t(task, "Task must not be null");
        if (task.i()) {
            return U(task);
        }
        y1t0 y1t0Var = new y1t0((byte) 22);
        m5u m5uVar = dsd1.b;
        task.d(m5uVar, y1t0Var);
        task.c(m5uVar, y1t0Var);
        task.a(m5uVar, y1t0Var);
        ((CountDownLatch) y1t0Var.b).await();
        return U(task);
    }

    public static Object h(Task task, long j, TimeUnit timeUnit) throws TimeoutException {
        zod.q();
        zod.t(task, "Task must not be null");
        zod.t(timeUnit, "TimeUnit must not be null");
        if (task.i()) {
            return U(task);
        }
        y1t0 y1t0Var = new y1t0((byte) 22);
        m5u m5uVar = dsd1.b;
        task.d(m5uVar, y1t0Var);
        task.c(m5uVar, y1t0Var);
        task.a(m5uVar, y1t0Var);
        if (((CountDownLatch) y1t0Var.b).await(j, timeUnit)) {
            return U(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static hfp1 i(Executor executor, Callable callable) {
        zod.t(executor, "Executor must not be null");
        hfp1 hfp1Var = new hfp1();
        executor.execute(new ni(hfp1Var, callable, false, (byte) 12));
        return hfp1Var;
    }

    public static final boolean j(String str, boolean z, boolean z2) {
        return sgy.i(str) && z && !z2;
    }

    public static void k(String str, boolean z) {
        if (z) {
            return;
        }
        hhg1.n(str);
    }

    public static void l(boolean z) {
        if (z) {
            return;
        }
        bhn0.q();
    }

    public static void m(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void n(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void o(int i) {
        if (i >= 0) {
            return;
        }
        bhn0.q();
    }

    public static void p(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bhn0.i(str);
    }

    public static void q(String str, boolean z) {
        if (z) {
            return;
        }
        eg.m(str);
    }

    public static final void r(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            hhg1.f(i != i2 ? l1d.j(i, i2, "Both size ", " and step ", " must be greater than zero.") : gvg.e(i, "size ", " must be greater than zero."));
        }
    }

    public static byte s(long j) {
        dm5.j(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    public static float t(float f, float f2, float f3) {
        if (f > f2) {
            f2 = f;
            f = f2;
        }
        if (f3 <= f) {
            return f;
        }
        return f3 >= f2 ? f2 : f3;
    }

    public static ry21 u(uf01 uf01Var, ln21 ln21Var, String str, ry21 ry21Var) {
        ry21 ry21VarA;
        ne neVarB = ln21Var.b();
        ((t360) neVarB.c).b("client-token", str);
        zx21 zx21VarC = uf01Var.b(new ln21(neVarB)).c();
        if (ry21Var != null) {
            zx21 zx21VarC2 = ry21Var.c();
            zx21VarC2.g = uz21.a;
            ry21VarA = zx21VarC2.a();
        } else {
            ry21VarA = null;
        }
        zx21VarC.k = ry21VarA;
        return zx21VarC.a();
    }

    public static final void v(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    f4i1.h(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    j2h1.h(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    bhn0.q();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static long w(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    public static float x(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static hfp1 y(Exception exc) {
        hfp1 hfp1Var = new hfp1();
        hfp1Var.q(exc);
        return hfp1Var;
    }

    public static hfp1 z(Object obj) {
        hfp1 hfp1Var = new hfp1();
        hfp1Var.r(obj);
        return hfp1Var;
    }
}
