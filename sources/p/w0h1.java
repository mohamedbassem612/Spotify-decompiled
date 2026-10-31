package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetFileDescriptor;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.FacebookSdkNotInitializedException;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNullPointerException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class w0h1 {
    public static final zbg a = new zbg(3);
    public static final Object b = new Object();
    public static final /* synthetic */ int c = 0;

    public static final scn0 A(y60... y60VarArr) {
        ArrayList arrayList = new ArrayList(y60VarArr.length);
        for (y60 y60Var : y60VarArr) {
            arrayList.add(oqn1.n(y60Var.a(), y60Var.b()));
        }
        mmr0[] mmr0VarArr = (mmr0[]) arrayList.toArray(new mmr0[0]);
        return new scn0(sqg0.M((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length)));
    }

    public static final void B(String str, String str2) {
        if (str.length() > 0) {
            return;
        }
        hhg1.f(f4i1.f("Argument '", str2, "' cannot be empty"));
    }

    public static final void C(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                bhn0.i("Container 'requests' cannot contain null values");
                return;
            }
        }
        if (collection.isEmpty()) {
            hhg1.f("Container 'requests' cannot be empty");
        }
    }

    public static final void D(String str, String str2) {
        if (str == null || str.length() <= 0) {
            hhg1.f(f4i1.f("Argument '", str2, "' cannot be null or empty"));
        }
    }

    public static rkj0 E(MappedByteBuffer mappedByteBuffer) {
        long jX;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        zud0 zud0Var = new zud0(byteBufferDuplicate);
        zud0Var.z(4);
        int iY = zud0Var.y();
        if (iY > 100) {
            k220.i("Cannot read metadata.");
            return null;
        }
        zud0Var.z(6);
        int i = 0;
        while (true) {
            if (i >= iY) {
                jX = -1;
                break;
            }
            int iW = zud0Var.w();
            zud0Var.z(4);
            jX = zud0Var.x();
            zud0Var.z(4);
            if (1835365473 == iW) {
                break;
            }
            i++;
        }
        if (jX != -1) {
            zud0Var.z((int) (jX - zud0Var.o()));
            zud0Var.z(12);
            long jX2 = zud0Var.x();
            for (int i2 = 0; i2 < jX2; i2++) {
                int iW2 = zud0Var.w();
                long jX3 = zud0Var.x();
                zud0Var.x();
                if (1164798569 == iW2 || 1701669481 == iW2) {
                    byteBufferDuplicate.position((int) new n4t((byte) 4, jX3 + jX).a());
                    rkj0 rkj0Var = new rkj0();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    ((akd1) rkj0Var).b = byteBufferDuplicate;
                    ((akd1) rkj0Var).a = iPosition;
                    int i3 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    ((akd1) rkj0Var).c = i3;
                    ((akd1) rkj0Var).d = ((akd1) rkj0Var).b.getShort(i3);
                    return rkj0Var;
                }
            }
        }
        k220.i("Cannot read metadata.");
        return null;
    }

    public static final Disposable F(llm llmVar, Runnable runnable, long j, iu30 iu30Var) {
        o8n o8nVar = llmVar.a;
        Objects.requireNonNull(runnable, "run is null");
        AtomicReference atomicReference = new AtomicReference(null);
        Runnable runnable2 = (Runnable) iu30Var.invoke(new x241(atomicReference, o8nVar, runnable));
        if (!smo1.u(llmVar)) {
            return EmptyDisposable.a;
        }
        if (j <= 0) {
            runnable2.run();
            Disposable disposableE = Disposable.e(Functions.b);
            atomicReference.set(disposableE);
            return disposableE;
        }
        qku qkuVarF = hap1.l(o8nVar).f(j, runnable2, o8nVar);
        qku qkuVarW = op71.w(op71.z(o8nVar), qkuVarF);
        lxl1 lxl1Var = new lxl1(qkuVarF, qkuVarW);
        if (fd21.k(atomicReference, lxl1Var)) {
            return lxl1Var;
        }
        qkuVarW.dispose();
        return Disposable.e(Functions.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [p.o8n] */
    /* JADX WARN: Type inference failed for: r6v1, types: [p.o8n] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    public static final Object G(AtomicReference atomicReference, o8n o8nVar, Runnable runnable, lnm lnmVar) {
        w241 w241Var;
        qku qkuVarA;
        qku qkuVarA2;
        if (lnmVar instanceof w241) {
            w241Var = (w241) lnmVar;
            int i = w241Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w241Var.d = i - Integer.MIN_VALUE;
            } else {
                w241Var = new w241(lnmVar);
            }
        } else {
            w241Var = new w241(lnmVar);
        }
        Object obj = w241Var.c;
        int i2 = w241Var.d;
        rih1 rih1Var = rih1.a;
        lxl1 lxl1Var = null;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Object obj2 = atomicReference.get();
                Disposable disposable = obj2 instanceof Disposable ? (Disposable) obj2 : null;
                if (disposable == null || !disposable.isDisposed()) {
                    an31 an31Var = new an31(runnable, (byte) 1);
                    w241Var.a = atomicReference;
                    w241Var.b = (o8n) o8nVar;
                    w241Var.d = 1;
                    Object objU = k4k.u(an31Var, w241Var);
                    d9n d9nVar = d9n.a;
                    if (objU == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o8n o8nVar2 = w241Var.b;
            atomicReference = w241Var.a;
            hm5.M(obj);
            o8nVar = fd21.i(atomicReference);
            if (o8nVar == 0) {
                Object obj3 = atomicReference.get();
                lxl1Var = obj3 instanceof lxl1 ? (lxl1) obj3 : null;
                if (lxl1Var != null && (qkuVarA2 = lxl1Var.a()) != null) {
                    qkuVarA2.dispose();
                    return rih1Var;
                }
            }
        } catch (Throwable th) {
            try {
                u(th, o8nVar);
            } finally {
                if (!fd21.i(atomicReference)) {
                    Object obj4 = atomicReference.get();
                    lxl1Var = obj4 instanceof lxl1 ? (lxl1) obj4 : null;
                    if (lxl1Var != null && (qkuVarA = lxl1Var.a()) != null) {
                        qkuVarA.dispose();
                    }
                }
            }
        }
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookSdkNotInitializedException */
    public static final void H() throws FacebookSdkNotInitializedException {
        if (!wf10.q.get()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static void I(TextView textView, int i) {
        o0c.o(i);
        if (Build.VERSION.SDK_INT >= 28) {
            ph5.R(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void J(TextView textView, int i) {
        o0c.o(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void K(TextView textView, int i) {
        o0c.o(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static final long L(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final int M(jez jezVar) {
        switch (jezVar.ordinal()) {
            case 0:
                return 2131958712;
            case 1:
                return 2131958716;
            case 2:
                return 2131958704;
            case 3:
                return 2131958703;
            case 4:
                return 2131958706;
            case 5:
                return 2131958702;
            case 6:
                return 2131958711;
            case 7:
                return 2131958709;
            case 8:
                return 2131958708;
            case 9:
                return 2131958714;
            case 10:
                return 2131958713;
            case 11:
                return 2131958710;
            case 12:
                return 2131958715;
            case 13:
                return 2131958705;
            case 14:
                return 2131958717;
            default:
                eg.o();
                return 0;
        }
    }

    public static final int N(rx30 rx30Var) {
        switch (rx30Var.ordinal()) {
            case 0:
                return 2131958697;
            case 1:
                return 2131958699;
            case 2:
                return 2131958698;
            case 3:
                return 2131958700;
            case 4:
                return 2131958694;
            case 5:
                return 2131958695;
            case 6:
                return 2131958692;
            case 7:
                return 2131958693;
            case 8:
                return 2131958689;
            case 9:
                return 2131958688;
            case 10:
                return 2131958690;
            case 11:
                return 2131958691;
            case 12:
                return 2131958701;
            default:
                eg.o();
                return 0;
        }
    }

    public static void O(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(f4i1.f(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        u890.y(classCastException, w0h1.class.getName());
        throw classCastException;
    }

    public static ActionMode.Callback P(ActionMode.Callback callback) {
        return (!(callback instanceof xee1) || Build.VERSION.SDK_INT < 26) ? callback : ((xee1) callback).a();
    }

    public static ActionMode.Callback Q(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof xee1) || callback == null) ? callback : new xee1(callback, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static File R(ParcelFileDescriptor parcelFileDescriptor, File file) {
        IOException e;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        try {
            file.mkdirs();
            File fileCreateTempFile = File.createTempFile("asset", ".tmp", file);
            AssetFileDescriptor.AutoCloseInputStream autoCloseInputStream2 = 0;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int i = autoCloseInputStream.read(bArr);
                            if (i < 0) {
                                S(autoCloseInputStream);
                                S(fileOutputStream);
                                S(autoCloseInputStream);
                                return fileCreateTempFile;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    th = th;
                    autoCloseInputStream2 = ".tmp";
                    S(autoCloseInputStream);
                    S(autoCloseInputStream2);
                    fileCreateTempFile.delete();
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                S(autoCloseInputStream);
                S(autoCloseInputStream2);
                fileCreateTempFile.delete();
                throw th;
            }
        } catch (Throwable th3) {
            S(autoCloseInputStream);
            throw th3;
        }
    }

    public static void S(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1 A[PHI: r2 r5 r7 r13
      0x00d1: PHI (r2v18 int) = (r2v13 int), (r2v20 int) binds: [B:90:0x00f1, B:78:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r5v9 long) = (r5v7 long), (r5v6 long) binds: [B:90:0x00f1, B:78:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r7v5 long) = (r7v3 long), (r7v2 long) binds: [B:90:0x00f1, B:78:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r13v12 p.qim0) = (r13v10 p.qim0), (r13v14 p.qim0) binds: [B:90:0x00f1, B:78:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void a(hux huxVar, ksl kslVar, qim0 qim0Var, long j, long j2, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        long jP;
        long j3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        b0k b0kVar2;
        qim0 qim0Var3;
        long j4;
        long j5;
        boolean z4;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        long j6;
        boolean z5;
        long j7;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1008685861);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(huxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(kslVar) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    jP = j;
                    int i7 = b0kVar3.f(jP) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    jP = j;
                }
                i3 |= i7;
            } else {
                jP = j;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j2;
                    int i8 = b0kVar3.f(j3) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    j3 = j2;
                }
                i3 |= i8;
            } else {
                j3 = j2;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (b0kVar3.h(z2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (b0kVar3.Y(i3 & 1, z3)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i6 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i2 & 8) != 0) {
                            int i9 = u7h.l;
                            i3 &= -7169;
                            jP = nfb.p();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j3 = jP;
                        }
                        qim0Var5 = qim0Var4;
                        if (i4 != 0) {
                            j6 = j3;
                            z5 = false;
                            j7 = jP;
                        }
                        b0kVar3.s();
                        b0kVar2 = b0kVar3;
                        b(huxVar.a, huxVar.b, kslVar, qim0Var5, j7, j6, z5, b0kVar2, (i3 << 3) & 4194176);
                        qim0Var3 = qim0Var5;
                        j4 = j7;
                        j5 = j6;
                        z4 = z5;
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        qim0Var5 = qim0Var2;
                    }
                    j7 = jP;
                    j6 = j3;
                    z5 = z2;
                    b0kVar3.s();
                    b0kVar2 = b0kVar3;
                    b(huxVar.a, huxVar.b, kslVar, qim0Var5, j7, j6, z5, b0kVar2, (i3 << 3) & 4194176);
                    qim0Var3 = qim0Var5;
                    j4 = j7;
                    j5 = j6;
                    z4 = z5;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    j4 = jP;
                    j5 = j3;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new jjx(huxVar, kslVar, qim0Var3, j4, j5, z4, i, i2);
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i3 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        int i10 = u7h.l;
                        i3 &= -7169;
                        jP = nfb.p();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j3 = jP;
                    }
                    qim0Var5 = qim0Var4;
                    if (i4 != 0) {
                        j6 = j3;
                        z5 = false;
                        j7 = jP;
                    } else {
                        j7 = jP;
                        j6 = j3;
                        z5 = z2;
                    }
                } else {
                    if (i6 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        int i11 = u7h.l;
                        i3 &= -7169;
                        jP = nfb.p();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j3 = jP;
                    }
                    qim0Var5 = qim0Var4;
                    if (i4 != 0) {
                        j6 = j3;
                        z5 = false;
                        j7 = jP;
                    } else {
                        j7 = jP;
                        j6 = j3;
                        z5 = z2;
                    }
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                b(huxVar.a, huxVar.b, kslVar, qim0Var5, j7, j6, z5, b0kVar2, (i3 << 3) & 4194176);
                qim0Var3 = qim0Var5;
                j4 = j7;
                j5 = j6;
                z4 = z5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                j4 = jP;
                j5 = j3;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new jjx(huxVar, kslVar, qim0Var3, j4, j5, z4, i, i2);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jP = j;
                if (b0kVar3.f(jP)) {
                }
                i3 |= i7;
            } else {
                jP = j;
            }
            i3 |= i7;
        } else {
            jP = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j3 = j2;
                if (b0kVar3.f(j3)) {
                }
                i3 |= i8;
            } else {
                j3 = j2;
            }
            i3 |= i8;
        } else {
            j3 = j2;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (b0kVar3.h(z2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i3 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        int i12 = u7h.l;
                        i3 &= -7169;
                        jP = nfb.p();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j3 = jP;
                    }
                    qim0Var5 = qim0Var4;
                    if (i4 != 0) {
                        j6 = j3;
                        z5 = false;
                        j7 = jP;
                    } else {
                        j7 = jP;
                        j6 = j3;
                        z5 = z2;
                    }
                } else {
                    if (i6 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        int i13 = u7h.l;
                        i3 &= -7169;
                        jP = nfb.p();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j3 = jP;
                    }
                    qim0Var5 = qim0Var4;
                    if (i4 != 0) {
                        j6 = j3;
                        z5 = false;
                        j7 = jP;
                    } else {
                        j7 = jP;
                        j6 = j3;
                        z5 = z2;
                    }
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                b(huxVar.a, huxVar.b, kslVar, qim0Var5, j7, j6, z5, b0kVar2, (i3 << 3) & 4194176);
                qim0Var3 = qim0Var5;
                j4 = j7;
                j5 = j6;
                z4 = z5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                j4 = jP;
                j5 = j3;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new jjx(huxVar, kslVar, qim0Var3, j4, j5, z4, i, i2);
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b0kVar3.Y(i3 & 1, z3)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 8) != 0) {
                    int i14 = u7h.l;
                    i3 &= -7169;
                    jP = nfb.p();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j3 = jP;
                }
                qim0Var5 = qim0Var4;
                if (i4 != 0) {
                    j6 = j3;
                    z5 = false;
                    j7 = jP;
                } else {
                    j7 = jP;
                    j6 = j3;
                    z5 = z2;
                }
            } else {
                if (i6 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 8) != 0) {
                    int i15 = u7h.l;
                    i3 &= -7169;
                    jP = nfb.p();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j3 = jP;
                }
                qim0Var5 = qim0Var4;
                if (i4 != 0) {
                    j6 = j3;
                    z5 = false;
                    j7 = jP;
                } else {
                    j7 = jP;
                    j6 = j3;
                    z5 = z2;
                }
            }
            b0kVar3.s();
            b0kVar2 = b0kVar3;
            b(huxVar.a, huxVar.b, kslVar, qim0Var5, j7, j6, z5, b0kVar2, (i3 << 3) & 4194176);
            qim0Var3 = qim0Var5;
            j4 = j7;
            j5 = j6;
            z4 = z5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            j4 = jP;
            j5 = j3;
            z4 = z2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jjx(huxVar, kslVar, qim0Var3, j4, j5, z4, i, i2);
        }
    }

    public static final void b(dsx dsxVar, dsx dsxVar2, ksl kslVar, qim0 qim0Var, long j, long j2, boolean z, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b180 b180Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1940588459);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(dsxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(dsxVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(kslVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.f(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.h(z) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            b0kVar3.i0(889712249);
            long j3 = j != 16 ? j : ((u7h) b0kVar3.k(qgx.a)).a;
            b0kVar3.r(false);
            long j4 = j2 != 16 ? j2 : j3;
            if (z) {
                j3 = j4;
            }
            b0kVar3.i0(889718949);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            zro1.s(b0kVar3);
            float fX0 = watVar.X0(16.0f);
            b0kVar3.r(false);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xto.t(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (!z || dsxVar2 == null) {
                b180Var = ((Boolean) ven0Var.getValue()).booleanValue() ? dsxVar.a : dsxVar.b;
            } else {
                b180Var = ((Boolean) ven0Var.getValue()).booleanValue() ? dsxVar2.a : dsxVar2.b;
            }
            boolean zI = b0kVar3.i(ven0Var) | b0kVar3.d(fX0);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new kjx(fX0, ven0Var);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarU = lrn1.u(qim0Var, (iu30) objT2);
            dui1 dui1VarS = byo1.s(b180Var, b0kVar3);
            jsl jslVar = kslVar instanceof jsl ? (jsl) kslVar : null;
            b0kVar2 = b0kVar3;
            nl70.c(dui1VarS, jslVar != null ? jslVar.a : null, qim0VarU, j3, b0kVar2, 8, 0);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ljx(dsxVar, dsxVar2, kslVar, qim0Var, j, j2, z, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x0158  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162  */
    /* JADX WARN: Code duplicated, block: B:122:0x016c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0179  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:161:0x0204  */
    /* JADX WARN: Code duplicated, block: B:162:0x0207  */
    /* JADX WARN: Code duplicated, block: B:165:0x028e  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    public static final void c(jkr0 jkr0Var, qim0 qim0Var, vzq0 vzq0Var, gdr0 gdr0Var, int i, float f, pl3 pl3Var, ru91 ru91Var, boolean z, iu30 iu30Var, d6o0 d6o0Var, xu91 xu91Var, hxq0 hxq0Var, j2i j2iVar, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        vzq0 vzq0Var2;
        int i6;
        int i7;
        gdr0 gdr0Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f2;
        int i13;
        int i14;
        pl3 pl3Var2;
        int i15;
        ru91 ru91Var2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z2;
        x340 x340Var;
        boolean z3;
        hxq0 hxq0Var2;
        qim0 qim0Var3;
        pl3 pl3Var3;
        ru91 ru91Var3;
        vzq0 vzq0Var3;
        gdr0 gdr0Var3;
        iu30 iu30Var2;
        d6o0 d6o0Var2;
        xu91 xu91Var2;
        h311 h311VarV;
        int i29;
        qqq0 qqq0Var;
        qim0 qim0Var4;
        vzq0 vzq0VarF;
        pl3 pl3Var4;
        jkr0 jkr0Var2;
        x340 x340Var2;
        ru91 ru91VarJ;
        int i30;
        iu30 iu30Var3;
        xu91 xu91Var3;
        int i31;
        qim0 qim0Var5;
        int i32;
        iu30 iu30Var4;
        vzq0 vzq0Var4;
        float f3;
        hxq0 hxq0VarB;
        d6o0 d6o0Var3;
        pl3 pl3Var5;
        int i33;
        boolean z4;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1860873769);
        if ((i2 & 6) == 0) {
            i4 = (x340Var3.g(jkr0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i34 = i3 & 2;
        if (i34 == 0) {
            if ((i2 & 48) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var3.g(qim0Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    vzq0Var2 = vzq0Var;
                    if (x340Var3.g(vzq0Var2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        gdr0Var2 = gdr0Var;
                        if (x340Var3.g(gdr0Var2)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            i10 = i;
                            if (x340Var3.e(i10)) {
                                i11 = 16384;
                            } else {
                                i11 = 8192;
                            }
                            i4 |= i11;
                        }
                        i12 = i3 & 32;
                        if (i12 != 0) {
                            i4 |= 196608;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & 196608) == 0) {
                                if (x340Var3.d(f2)) {
                                    i13 = 131072;
                                } else {
                                    i13 = 65536;
                                }
                                i4 |= i13;
                            }
                        }
                        i14 = i3 & 64;
                        if (i14 != 0) {
                            i4 |= 1572864;
                            pl3Var2 = pl3Var;
                        } else {
                            pl3Var2 = pl3Var;
                            if ((i2 & 1572864) == 0) {
                                if (x340Var3.g(pl3Var2)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i4 |= i15;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & 128) == 0) {
                                ru91Var2 = ru91Var;
                                int i35 = x340Var3.g(ru91Var2) ? 8388608 : 4194304;
                                i4 |= i35;
                            } else {
                                ru91Var2 = ru91Var;
                            }
                            i4 |= i35;
                        } else {
                            ru91Var2 = ru91Var;
                        }
                        i16 = i3 & 256;
                        if (i16 != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (x340Var3.h(z)) {
                                i17 = 67108864;
                            } else {
                                i17 = 33554432;
                            }
                            i4 |= i17;
                        }
                        i18 = i4 | 805306368;
                        i19 = i3 & 1024;
                        if (i19 != 0) {
                            i22 = 24582;
                            i20 = 24576;
                        } else {
                            i20 = 24576;
                            if (x340Var3.i(iu30Var)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i22 = 24576 | i21;
                        }
                        i23 = i22;
                        i24 = i23 | 16;
                        i25 = i3 & 4096;
                        if (i25 != 0) {
                            i27 = i23 | 400;
                        } else {
                            if (x340Var3.g(xu91Var)) {
                                i26 = 256;
                            } else {
                                i26 = 128;
                            }
                            i27 = i24 | i26;
                        }
                        i28 = i27 | 1024;
                        if ((306783379 & i18) == 306783378 || (i28 & 9363) != 9362) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var3.Y(i18 & 1, z2)) {
                            x340Var3.d0();
                            i29 = i2 & 1;
                            qqq0Var = qqq0.b;
                            if (i29 != 0 || x340Var3.E()) {
                                if (i34 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i5 != 0) {
                                    vzq0VarF = uyn1.f(0.0f);
                                } else {
                                    vzq0VarF = vzq0Var2;
                                }
                                if (i7 != 0) {
                                    gdr0Var2 = ak20.S0;
                                }
                                if (i9 != 0) {
                                    i10 = 0;
                                }
                                if (i12 != 0) {
                                    f2 = 0.0f;
                                }
                                if (i14 != 0) {
                                    pl3Var4 = een.N0;
                                } else {
                                    pl3Var4 = pl3Var2;
                                }
                                if ((i3 & 128) != 0) {
                                    ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                                    jkr0Var2 = jkr0Var;
                                    x340Var2 = x340Var3;
                                    i30 = i18 & (-29360129);
                                } else {
                                    jkr0Var2 = jkr0Var;
                                    x340Var2 = x340Var3;
                                    ru91VarJ = ru91Var2;
                                    i30 = i18;
                                }
                                boolean z5 = i16 == 0 ? z : true;
                                if (i19 != 0) {
                                    iu30Var3 = null;
                                } else {
                                    iu30Var3 = iu30Var;
                                }
                                d6o0 d6o0VarL = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                                if (i25 != 0) {
                                    xu91Var3 = zov0.g;
                                } else {
                                    xu91Var3 = xu91Var;
                                }
                                qim0 qim0Var6 = qim0Var4;
                                i31 = i28 & (-7281);
                                qim0Var5 = qim0Var6;
                                iu30 iu30Var5 = iu30Var3;
                                i32 = i30;
                                iu30Var4 = iu30Var5;
                                vzq0Var4 = vzq0VarF;
                                f3 = f2;
                                hxq0VarB = jxq0.b(x340Var2);
                                x340Var = x340Var2;
                                d6o0Var3 = d6o0VarL;
                                pl3Var5 = pl3Var4;
                                i33 = i10;
                                z4 = z5;
                            } else {
                                x340Var3.b0();
                                int i36 = (i3 & 128) != 0 ? i18 & (-29360129) : i18;
                                xu91Var3 = xu91Var;
                                x340Var = x340Var3;
                                i33 = i10;
                                pl3Var5 = pl3Var2;
                                ru91VarJ = ru91Var2;
                                vzq0Var4 = vzq0Var2;
                                z4 = z;
                                iu30Var4 = iu30Var;
                                d6o0Var3 = d6o0Var;
                                i32 = i36;
                                i31 = i28 & (-7281);
                                qim0Var5 = qim0Var2;
                                f3 = f2;
                                hxq0VarB = hxq0Var;
                            }
                            gdr0 gdr0Var4 = gdr0Var2;
                            x340Var.s();
                            qim0 qim0Var7 = qim0Var5;
                            int i37 = i31;
                            int i38 = i32 >> 6;
                            int i39 = i32 << 12;
                            smo1.i(qim0Var7, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var4, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i38 & 458752) | (i38 & 3670016) | (i39 & 234881024) | (i39 & 1879048192), ((i37 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i38 & 57344) | ((i37 << 9) & 458752) | 1572864);
                            float f4 = f3;
                            ru91Var3 = ru91VarJ;
                            gdr0Var3 = gdr0Var4;
                            z3 = z4;
                            i10 = i33;
                            pl3Var3 = pl3Var5;
                            hxq0Var2 = hxq0VarB;
                            f2 = f4;
                            iu30 iu30Var6 = iu30Var4;
                            d6o0Var2 = d6o0Var3;
                            iu30Var2 = iu30Var6;
                            vzq0Var3 = vzq0Var4;
                            xu91Var2 = xu91Var3;
                            qim0Var3 = qim0Var7;
                        } else {
                            x340Var = x340Var3;
                            x340Var.b0();
                            z3 = z;
                            hxq0Var2 = hxq0Var;
                            qim0Var3 = qim0Var2;
                            pl3Var3 = pl3Var2;
                            ru91Var3 = ru91Var2;
                            vzq0Var3 = vzq0Var2;
                            gdr0Var3 = gdr0Var2;
                            iu30Var2 = iu30Var;
                            d6o0Var2 = d6o0Var;
                            xu91Var2 = xu91Var;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                        }
                    }
                    i4 |= 24576;
                    i10 = i;
                    i12 = i3 & 32;
                    if (i12 != 0) {
                        i4 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 196608) == 0) {
                            if (x340Var3.d(f2)) {
                                i13 = 131072;
                            } else {
                                i13 = 65536;
                            }
                            i4 |= i13;
                        }
                    }
                    i14 = i3 & 64;
                    if (i14 != 0) {
                        i4 |= 1572864;
                        pl3Var2 = pl3Var;
                    } else {
                        pl3Var2 = pl3Var;
                        if ((i2 & 1572864) == 0) {
                            if (x340Var3.g(pl3Var2)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i4 |= i15;
                        }
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & 128) == 0) {
                            ru91Var2 = ru91Var;
                            if (x340Var3.g(ru91Var2)) {
                            }
                            i4 |= i35;
                        } else {
                            ru91Var2 = ru91Var;
                        }
                        i4 |= i35;
                    } else {
                        ru91Var2 = ru91Var;
                    }
                    i16 = i3 & 256;
                    if (i16 != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (x340Var3.h(z)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i4 |= i17;
                    }
                    i18 = i4 | 805306368;
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i22 = 24582;
                        i20 = 24576;
                    } else {
                        i20 = 24576;
                        if (x340Var3.i(iu30Var)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i22 = 24576 | i21;
                    }
                    i23 = i22;
                    i24 = i23 | 16;
                    i25 = i3 & 4096;
                    if (i25 != 0) {
                        i27 = i23 | 400;
                    } else {
                        if (x340Var3.g(xu91Var)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i27 = i24 | i26;
                    }
                    i28 = i27 | 1024;
                    if ((306783379 & i18) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (x340Var3.Y(i18 & 1, z2)) {
                        x340Var3.d0();
                        i29 = i2 & 1;
                        qqq0Var = qqq0.b;
                        if (i29 != 0) {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                vzq0VarF = uyn1.f(0.0f);
                            } else {
                                vzq0VarF = vzq0Var2;
                            }
                            if (i7 != 0) {
                                gdr0Var2 = ak20.S0;
                            }
                            if (i9 != 0) {
                                i10 = 0;
                            }
                            if (i12 != 0) {
                                f2 = 0.0f;
                            }
                            if (i14 != 0) {
                                pl3Var4 = een.N0;
                            } else {
                                pl3Var4 = pl3Var2;
                            }
                            if ((i3 & 128) != 0) {
                                ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                i30 = i18 & (-29360129);
                            } else {
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                ru91VarJ = ru91Var2;
                                i30 = i18;
                            }
                            if (i16 == 0) {
                            }
                            if (i19 != 0) {
                                iu30Var3 = null;
                            } else {
                                iu30Var3 = iu30Var;
                            }
                            d6o0 d6o0VarL2 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                            if (i25 != 0) {
                                xu91Var3 = zov0.g;
                            } else {
                                xu91Var3 = xu91Var;
                            }
                            qim0 qim0Var8 = qim0Var4;
                            i31 = i28 & (-7281);
                            qim0Var5 = qim0Var8;
                            iu30 iu30Var7 = iu30Var3;
                            i32 = i30;
                            iu30Var4 = iu30Var7;
                            vzq0Var4 = vzq0VarF;
                            f3 = f2;
                            hxq0VarB = jxq0.b(x340Var2);
                            x340Var = x340Var2;
                            d6o0Var3 = d6o0VarL2;
                            pl3Var5 = pl3Var4;
                            i33 = i10;
                            z4 = z5;
                        } else {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                vzq0VarF = uyn1.f(0.0f);
                            } else {
                                vzq0VarF = vzq0Var2;
                            }
                            if (i7 != 0) {
                                gdr0Var2 = ak20.S0;
                            }
                            if (i9 != 0) {
                                i10 = 0;
                            }
                            if (i12 != 0) {
                                f2 = 0.0f;
                            }
                            if (i14 != 0) {
                                pl3Var4 = een.N0;
                            } else {
                                pl3Var4 = pl3Var2;
                            }
                            if ((i3 & 128) != 0) {
                                ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                i30 = i18 & (-29360129);
                            } else {
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                ru91VarJ = ru91Var2;
                                i30 = i18;
                            }
                            if (i16 == 0) {
                            }
                            if (i19 != 0) {
                                iu30Var3 = null;
                            } else {
                                iu30Var3 = iu30Var;
                            }
                            d6o0 d6o0VarL3 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                            if (i25 != 0) {
                                xu91Var3 = zov0.g;
                            } else {
                                xu91Var3 = xu91Var;
                            }
                            qim0 qim0Var9 = qim0Var4;
                            i31 = i28 & (-7281);
                            qim0Var5 = qim0Var9;
                            iu30 iu30Var8 = iu30Var3;
                            i32 = i30;
                            iu30Var4 = iu30Var8;
                            vzq0Var4 = vzq0VarF;
                            f3 = f2;
                            hxq0VarB = jxq0.b(x340Var2);
                            x340Var = x340Var2;
                            d6o0Var3 = d6o0VarL3;
                            pl3Var5 = pl3Var4;
                            i33 = i10;
                            z4 = z5;
                        }
                        gdr0 gdr0Var5 = gdr0Var2;
                        x340Var.s();
                        qim0 qim0Var10 = qim0Var5;
                        int i310 = i31;
                        int i311 = i32 >> 6;
                        int i312 = i32 << 12;
                        smo1.i(qim0Var10, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var5, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i311 & 458752) | (i311 & 3670016) | (i312 & 234881024) | (i312 & 1879048192), ((i310 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i311 & 57344) | ((i310 << 9) & 458752) | 1572864);
                        float f5 = f3;
                        ru91Var3 = ru91VarJ;
                        gdr0Var3 = gdr0Var5;
                        z3 = z4;
                        i10 = i33;
                        pl3Var3 = pl3Var5;
                        hxq0Var2 = hxq0VarB;
                        f2 = f5;
                        iu30 iu30Var9 = iu30Var4;
                        d6o0Var2 = d6o0Var3;
                        iu30Var2 = iu30Var9;
                        vzq0Var3 = vzq0Var4;
                        xu91Var2 = xu91Var3;
                        qim0Var3 = qim0Var10;
                    } else {
                        x340Var = x340Var3;
                        x340Var.b0();
                        z3 = z;
                        hxq0Var2 = hxq0Var;
                        qim0Var3 = qim0Var2;
                        pl3Var3 = pl3Var2;
                        ru91Var3 = ru91Var2;
                        vzq0Var3 = vzq0Var2;
                        gdr0Var3 = gdr0Var2;
                        iu30Var2 = iu30Var;
                        d6o0Var2 = d6o0Var;
                        xu91Var2 = xu91Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                    }
                }
                i4 |= 3072;
                gdr0Var2 = gdr0Var;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        i10 = i;
                        if (x340Var3.e(i10)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 32;
                    if (i12 != 0) {
                        i4 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 196608) == 0) {
                            if (x340Var3.d(f2)) {
                                i13 = 131072;
                            } else {
                                i13 = 65536;
                            }
                            i4 |= i13;
                        }
                    }
                    i14 = i3 & 64;
                    if (i14 != 0) {
                        i4 |= 1572864;
                        pl3Var2 = pl3Var;
                    } else {
                        pl3Var2 = pl3Var;
                        if ((i2 & 1572864) == 0) {
                            if (x340Var3.g(pl3Var2)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i4 |= i15;
                        }
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & 128) == 0) {
                            ru91Var2 = ru91Var;
                            if (x340Var3.g(ru91Var2)) {
                            }
                            i4 |= i35;
                        } else {
                            ru91Var2 = ru91Var;
                        }
                        i4 |= i35;
                    } else {
                        ru91Var2 = ru91Var;
                    }
                    i16 = i3 & 256;
                    if (i16 != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (x340Var3.h(z)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i4 |= i17;
                    }
                    i18 = i4 | 805306368;
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i22 = 24582;
                        i20 = 24576;
                    } else {
                        i20 = 24576;
                        if (x340Var3.i(iu30Var)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i22 = 24576 | i21;
                    }
                    i23 = i22;
                    i24 = i23 | 16;
                    i25 = i3 & 4096;
                    if (i25 != 0) {
                        i27 = i23 | 400;
                    } else {
                        if (x340Var3.g(xu91Var)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i27 = i24 | i26;
                    }
                    i28 = i27 | 1024;
                    if ((306783379 & i18) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (x340Var3.Y(i18 & 1, z2)) {
                        x340Var3.d0();
                        i29 = i2 & 1;
                        qqq0Var = qqq0.b;
                        if (i29 != 0) {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                vzq0VarF = uyn1.f(0.0f);
                            } else {
                                vzq0VarF = vzq0Var2;
                            }
                            if (i7 != 0) {
                                gdr0Var2 = ak20.S0;
                            }
                            if (i9 != 0) {
                                i10 = 0;
                            }
                            if (i12 != 0) {
                                f2 = 0.0f;
                            }
                            if (i14 != 0) {
                                pl3Var4 = een.N0;
                            } else {
                                pl3Var4 = pl3Var2;
                            }
                            if ((i3 & 128) != 0) {
                                ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                i30 = i18 & (-29360129);
                            } else {
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                ru91VarJ = ru91Var2;
                                i30 = i18;
                            }
                            if (i16 == 0) {
                            }
                            if (i19 != 0) {
                                iu30Var3 = null;
                            } else {
                                iu30Var3 = iu30Var;
                            }
                            d6o0 d6o0VarL4 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                            if (i25 != 0) {
                                xu91Var3 = zov0.g;
                            } else {
                                xu91Var3 = xu91Var;
                            }
                            qim0 qim0Var11 = qim0Var4;
                            i31 = i28 & (-7281);
                            qim0Var5 = qim0Var11;
                            iu30 iu30Var10 = iu30Var3;
                            i32 = i30;
                            iu30Var4 = iu30Var10;
                            vzq0Var4 = vzq0VarF;
                            f3 = f2;
                            hxq0VarB = jxq0.b(x340Var2);
                            x340Var = x340Var2;
                            d6o0Var3 = d6o0VarL4;
                            pl3Var5 = pl3Var4;
                            i33 = i10;
                            z4 = z5;
                        } else {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                vzq0VarF = uyn1.f(0.0f);
                            } else {
                                vzq0VarF = vzq0Var2;
                            }
                            if (i7 != 0) {
                                gdr0Var2 = ak20.S0;
                            }
                            if (i9 != 0) {
                                i10 = 0;
                            }
                            if (i12 != 0) {
                                f2 = 0.0f;
                            }
                            if (i14 != 0) {
                                pl3Var4 = een.N0;
                            } else {
                                pl3Var4 = pl3Var2;
                            }
                            if ((i3 & 128) != 0) {
                                ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                i30 = i18 & (-29360129);
                            } else {
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                ru91VarJ = ru91Var2;
                                i30 = i18;
                            }
                            if (i16 == 0) {
                            }
                            if (i19 != 0) {
                                iu30Var3 = null;
                            } else {
                                iu30Var3 = iu30Var;
                            }
                            d6o0 d6o0VarL5 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                            if (i25 != 0) {
                                xu91Var3 = zov0.g;
                            } else {
                                xu91Var3 = xu91Var;
                            }
                            qim0 qim0Var12 = qim0Var4;
                            i31 = i28 & (-7281);
                            qim0Var5 = qim0Var12;
                            iu30 iu30Var11 = iu30Var3;
                            i32 = i30;
                            iu30Var4 = iu30Var11;
                            vzq0Var4 = vzq0VarF;
                            f3 = f2;
                            hxq0VarB = jxq0.b(x340Var2);
                            x340Var = x340Var2;
                            d6o0Var3 = d6o0VarL5;
                            pl3Var5 = pl3Var4;
                            i33 = i10;
                            z4 = z5;
                        }
                        gdr0 gdr0Var6 = gdr0Var2;
                        x340Var.s();
                        qim0 qim0Var13 = qim0Var5;
                        int i313 = i31;
                        int i314 = i32 >> 6;
                        int i315 = i32 << 12;
                        smo1.i(qim0Var13, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var6, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i314 & 458752) | (i314 & 3670016) | (i315 & 234881024) | (i315 & 1879048192), ((i313 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i314 & 57344) | ((i313 << 9) & 458752) | 1572864);
                        float f6 = f3;
                        ru91Var3 = ru91VarJ;
                        gdr0Var3 = gdr0Var6;
                        z3 = z4;
                        i10 = i33;
                        pl3Var3 = pl3Var5;
                        hxq0Var2 = hxq0VarB;
                        f2 = f6;
                        iu30 iu30Var12 = iu30Var4;
                        d6o0Var2 = d6o0Var3;
                        iu30Var2 = iu30Var12;
                        vzq0Var3 = vzq0Var4;
                        xu91Var2 = xu91Var3;
                        qim0Var3 = qim0Var13;
                    } else {
                        x340Var = x340Var3;
                        x340Var.b0();
                        z3 = z;
                        hxq0Var2 = hxq0Var;
                        qim0Var3 = qim0Var2;
                        pl3Var3 = pl3Var2;
                        ru91Var3 = ru91Var2;
                        vzq0Var3 = vzq0Var2;
                        gdr0Var3 = gdr0Var2;
                        iu30Var2 = iu30Var;
                        d6o0Var2 = d6o0Var;
                        xu91Var2 = xu91Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                    }
                }
                i4 |= 24576;
                i10 = i;
                i12 = i3 & 32;
                if (i12 != 0) {
                    i4 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (x340Var3.d(f2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 64;
                if (i14 != 0) {
                    i4 |= 1572864;
                    pl3Var2 = pl3Var;
                } else {
                    pl3Var2 = pl3Var;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var3.g(pl3Var2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i4 |= i15;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        ru91Var2 = ru91Var;
                        if (x340Var3.g(ru91Var2)) {
                        }
                        i4 |= i35;
                    } else {
                        ru91Var2 = ru91Var;
                    }
                    i4 |= i35;
                } else {
                    ru91Var2 = ru91Var;
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (x340Var3.h(z)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i4 |= i17;
                }
                i18 = i4 | 805306368;
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i22 = 24582;
                    i20 = 24576;
                } else {
                    i20 = 24576;
                    if (x340Var3.i(iu30Var)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i22 = 24576 | i21;
                }
                i23 = i22;
                i24 = i23 | 16;
                i25 = i3 & 4096;
                if (i25 != 0) {
                    i27 = i23 | 400;
                } else {
                    if (x340Var3.g(xu91Var)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i27 = i24 | i26;
                }
                i28 = i27 | 1024;
                if ((306783379 & i18) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var3.Y(i18 & 1, z2)) {
                    x340Var3.d0();
                    i29 = i2 & 1;
                    qqq0Var = qqq0.b;
                    if (i29 != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL6 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var14 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var14;
                        iu30 iu30Var13 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var13;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL6;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL7 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var15 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var15;
                        iu30 iu30Var14 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var14;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL7;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    }
                    gdr0 gdr0Var7 = gdr0Var2;
                    x340Var.s();
                    qim0 qim0Var16 = qim0Var5;
                    int i316 = i31;
                    int i317 = i32 >> 6;
                    int i318 = i32 << 12;
                    smo1.i(qim0Var16, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var7, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i317 & 458752) | (i317 & 3670016) | (i318 & 234881024) | (i318 & 1879048192), ((i316 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i317 & 57344) | ((i316 << 9) & 458752) | 1572864);
                    float f7 = f3;
                    ru91Var3 = ru91VarJ;
                    gdr0Var3 = gdr0Var7;
                    z3 = z4;
                    i10 = i33;
                    pl3Var3 = pl3Var5;
                    hxq0Var2 = hxq0VarB;
                    f2 = f7;
                    iu30 iu30Var15 = iu30Var4;
                    d6o0Var2 = d6o0Var3;
                    iu30Var2 = iu30Var15;
                    vzq0Var3 = vzq0Var4;
                    xu91Var2 = xu91Var3;
                    qim0Var3 = qim0Var16;
                } else {
                    x340Var = x340Var3;
                    x340Var.b0();
                    z3 = z;
                    hxq0Var2 = hxq0Var;
                    qim0Var3 = qim0Var2;
                    pl3Var3 = pl3Var2;
                    ru91Var3 = ru91Var2;
                    vzq0Var3 = vzq0Var2;
                    gdr0Var3 = gdr0Var2;
                    iu30Var2 = iu30Var;
                    d6o0Var2 = d6o0Var;
                    xu91Var2 = xu91Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                }
            }
            i4 |= 384;
            vzq0Var2 = vzq0Var;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    gdr0Var2 = gdr0Var;
                    if (x340Var3.g(gdr0Var2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        i10 = i;
                        if (x340Var3.e(i10)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 32;
                    if (i12 != 0) {
                        i4 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 196608) == 0) {
                            if (x340Var3.d(f2)) {
                                i13 = 131072;
                            } else {
                                i13 = 65536;
                            }
                            i4 |= i13;
                        }
                    }
                    i14 = i3 & 64;
                    if (i14 != 0) {
                        i4 |= 1572864;
                        pl3Var2 = pl3Var;
                    } else {
                        pl3Var2 = pl3Var;
                        if ((i2 & 1572864) == 0) {
                            if (x340Var3.g(pl3Var2)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i4 |= i15;
                        }
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & 128) == 0) {
                            ru91Var2 = ru91Var;
                            if (x340Var3.g(ru91Var2)) {
                            }
                            i4 |= i35;
                        } else {
                            ru91Var2 = ru91Var;
                        }
                        i4 |= i35;
                    } else {
                        ru91Var2 = ru91Var;
                    }
                    i16 = i3 & 256;
                    if (i16 != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (x340Var3.h(z)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i4 |= i17;
                    }
                    i18 = i4 | 805306368;
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i22 = 24582;
                        i20 = 24576;
                    } else {
                        i20 = 24576;
                        if (x340Var3.i(iu30Var)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i22 = 24576 | i21;
                    }
                    i23 = i22;
                    i24 = i23 | 16;
                    i25 = i3 & 4096;
                    if (i25 != 0) {
                        i27 = i23 | 400;
                    } else {
                        if (x340Var3.g(xu91Var)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i27 = i24 | i26;
                    }
                    i28 = i27 | 1024;
                    if ((306783379 & i18) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (x340Var3.Y(i18 & 1, z2)) {
                        x340Var3.d0();
                        i29 = i2 & 1;
                        qqq0Var = qqq0.b;
                        if (i29 != 0) {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                vzq0VarF = uyn1.f(0.0f);
                            } else {
                                vzq0VarF = vzq0Var2;
                            }
                            if (i7 != 0) {
                                gdr0Var2 = ak20.S0;
                            }
                            if (i9 != 0) {
                                i10 = 0;
                            }
                            if (i12 != 0) {
                                f2 = 0.0f;
                            }
                            if (i14 != 0) {
                                pl3Var4 = een.N0;
                            } else {
                                pl3Var4 = pl3Var2;
                            }
                            if ((i3 & 128) != 0) {
                                ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                i30 = i18 & (-29360129);
                            } else {
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                ru91VarJ = ru91Var2;
                                i30 = i18;
                            }
                            if (i16 == 0) {
                            }
                            if (i19 != 0) {
                                iu30Var3 = null;
                            } else {
                                iu30Var3 = iu30Var;
                            }
                            d6o0 d6o0VarL8 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                            if (i25 != 0) {
                                xu91Var3 = zov0.g;
                            } else {
                                xu91Var3 = xu91Var;
                            }
                            qim0 qim0Var17 = qim0Var4;
                            i31 = i28 & (-7281);
                            qim0Var5 = qim0Var17;
                            iu30 iu30Var16 = iu30Var3;
                            i32 = i30;
                            iu30Var4 = iu30Var16;
                            vzq0Var4 = vzq0VarF;
                            f3 = f2;
                            hxq0VarB = jxq0.b(x340Var2);
                            x340Var = x340Var2;
                            d6o0Var3 = d6o0VarL8;
                            pl3Var5 = pl3Var4;
                            i33 = i10;
                            z4 = z5;
                        } else {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                vzq0VarF = uyn1.f(0.0f);
                            } else {
                                vzq0VarF = vzq0Var2;
                            }
                            if (i7 != 0) {
                                gdr0Var2 = ak20.S0;
                            }
                            if (i9 != 0) {
                                i10 = 0;
                            }
                            if (i12 != 0) {
                                f2 = 0.0f;
                            }
                            if (i14 != 0) {
                                pl3Var4 = een.N0;
                            } else {
                                pl3Var4 = pl3Var2;
                            }
                            if ((i3 & 128) != 0) {
                                ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                i30 = i18 & (-29360129);
                            } else {
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                ru91VarJ = ru91Var2;
                                i30 = i18;
                            }
                            if (i16 == 0) {
                            }
                            if (i19 != 0) {
                                iu30Var3 = null;
                            } else {
                                iu30Var3 = iu30Var;
                            }
                            d6o0 d6o0VarL9 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                            if (i25 != 0) {
                                xu91Var3 = zov0.g;
                            } else {
                                xu91Var3 = xu91Var;
                            }
                            qim0 qim0Var18 = qim0Var4;
                            i31 = i28 & (-7281);
                            qim0Var5 = qim0Var18;
                            iu30 iu30Var17 = iu30Var3;
                            i32 = i30;
                            iu30Var4 = iu30Var17;
                            vzq0Var4 = vzq0VarF;
                            f3 = f2;
                            hxq0VarB = jxq0.b(x340Var2);
                            x340Var = x340Var2;
                            d6o0Var3 = d6o0VarL9;
                            pl3Var5 = pl3Var4;
                            i33 = i10;
                            z4 = z5;
                        }
                        gdr0 gdr0Var8 = gdr0Var2;
                        x340Var.s();
                        qim0 qim0Var19 = qim0Var5;
                        int i319 = i31;
                        int i3110 = i32 >> 6;
                        int i3111 = i32 << 12;
                        smo1.i(qim0Var19, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var8, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i3110 & 458752) | (i3110 & 3670016) | (i3111 & 234881024) | (i3111 & 1879048192), ((i319 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i3110 & 57344) | ((i319 << 9) & 458752) | 1572864);
                        float f8 = f3;
                        ru91Var3 = ru91VarJ;
                        gdr0Var3 = gdr0Var8;
                        z3 = z4;
                        i10 = i33;
                        pl3Var3 = pl3Var5;
                        hxq0Var2 = hxq0VarB;
                        f2 = f8;
                        iu30 iu30Var18 = iu30Var4;
                        d6o0Var2 = d6o0Var3;
                        iu30Var2 = iu30Var18;
                        vzq0Var3 = vzq0Var4;
                        xu91Var2 = xu91Var3;
                        qim0Var3 = qim0Var19;
                    } else {
                        x340Var = x340Var3;
                        x340Var.b0();
                        z3 = z;
                        hxq0Var2 = hxq0Var;
                        qim0Var3 = qim0Var2;
                        pl3Var3 = pl3Var2;
                        ru91Var3 = ru91Var2;
                        vzq0Var3 = vzq0Var2;
                        gdr0Var3 = gdr0Var2;
                        iu30Var2 = iu30Var;
                        d6o0Var2 = d6o0Var;
                        xu91Var2 = xu91Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                    }
                }
                i4 |= 24576;
                i10 = i;
                i12 = i3 & 32;
                if (i12 != 0) {
                    i4 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (x340Var3.d(f2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 64;
                if (i14 != 0) {
                    i4 |= 1572864;
                    pl3Var2 = pl3Var;
                } else {
                    pl3Var2 = pl3Var;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var3.g(pl3Var2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i4 |= i15;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        ru91Var2 = ru91Var;
                        if (x340Var3.g(ru91Var2)) {
                        }
                        i4 |= i35;
                    } else {
                        ru91Var2 = ru91Var;
                    }
                    i4 |= i35;
                } else {
                    ru91Var2 = ru91Var;
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (x340Var3.h(z)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i4 |= i17;
                }
                i18 = i4 | 805306368;
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i22 = 24582;
                    i20 = 24576;
                } else {
                    i20 = 24576;
                    if (x340Var3.i(iu30Var)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i22 = 24576 | i21;
                }
                i23 = i22;
                i24 = i23 | 16;
                i25 = i3 & 4096;
                if (i25 != 0) {
                    i27 = i23 | 400;
                } else {
                    if (x340Var3.g(xu91Var)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i27 = i24 | i26;
                }
                i28 = i27 | 1024;
                if ((306783379 & i18) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var3.Y(i18 & 1, z2)) {
                    x340Var3.d0();
                    i29 = i2 & 1;
                    qqq0Var = qqq0.b;
                    if (i29 != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL10 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var110 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var110;
                        iu30 iu30Var19 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var19;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL10;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL11 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var111 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var111;
                        iu30 iu30Var110 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var110;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL11;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    }
                    gdr0 gdr0Var9 = gdr0Var2;
                    x340Var.s();
                    qim0 qim0Var112 = qim0Var5;
                    int i3112 = i31;
                    int i3113 = i32 >> 6;
                    int i3114 = i32 << 12;
                    smo1.i(qim0Var112, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var9, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i3113 & 458752) | (i3113 & 3670016) | (i3114 & 234881024) | (i3114 & 1879048192), ((i3112 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i3113 & 57344) | ((i3112 << 9) & 458752) | 1572864);
                    float f9 = f3;
                    ru91Var3 = ru91VarJ;
                    gdr0Var3 = gdr0Var9;
                    z3 = z4;
                    i10 = i33;
                    pl3Var3 = pl3Var5;
                    hxq0Var2 = hxq0VarB;
                    f2 = f9;
                    iu30 iu30Var111 = iu30Var4;
                    d6o0Var2 = d6o0Var3;
                    iu30Var2 = iu30Var111;
                    vzq0Var3 = vzq0Var4;
                    xu91Var2 = xu91Var3;
                    qim0Var3 = qim0Var112;
                } else {
                    x340Var = x340Var3;
                    x340Var.b0();
                    z3 = z;
                    hxq0Var2 = hxq0Var;
                    qim0Var3 = qim0Var2;
                    pl3Var3 = pl3Var2;
                    ru91Var3 = ru91Var2;
                    vzq0Var3 = vzq0Var2;
                    gdr0Var3 = gdr0Var2;
                    iu30Var2 = iu30Var;
                    d6o0Var2 = d6o0Var;
                    xu91Var2 = xu91Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                }
            }
            i4 |= 3072;
            gdr0Var2 = gdr0Var;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    i10 = i;
                    if (x340Var3.e(i10)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 32;
                if (i12 != 0) {
                    i4 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (x340Var3.d(f2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 64;
                if (i14 != 0) {
                    i4 |= 1572864;
                    pl3Var2 = pl3Var;
                } else {
                    pl3Var2 = pl3Var;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var3.g(pl3Var2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i4 |= i15;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        ru91Var2 = ru91Var;
                        if (x340Var3.g(ru91Var2)) {
                        }
                        i4 |= i35;
                    } else {
                        ru91Var2 = ru91Var;
                    }
                    i4 |= i35;
                } else {
                    ru91Var2 = ru91Var;
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (x340Var3.h(z)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i4 |= i17;
                }
                i18 = i4 | 805306368;
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i22 = 24582;
                    i20 = 24576;
                } else {
                    i20 = 24576;
                    if (x340Var3.i(iu30Var)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i22 = 24576 | i21;
                }
                i23 = i22;
                i24 = i23 | 16;
                i25 = i3 & 4096;
                if (i25 != 0) {
                    i27 = i23 | 400;
                } else {
                    if (x340Var3.g(xu91Var)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i27 = i24 | i26;
                }
                i28 = i27 | 1024;
                if ((306783379 & i18) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var3.Y(i18 & 1, z2)) {
                    x340Var3.d0();
                    i29 = i2 & 1;
                    qqq0Var = qqq0.b;
                    if (i29 != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL12 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var113 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var113;
                        iu30 iu30Var112 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var112;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL12;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL13 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var114 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var114;
                        iu30 iu30Var113 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var113;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL13;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    }
                    gdr0 gdr0Var10 = gdr0Var2;
                    x340Var.s();
                    qim0 qim0Var115 = qim0Var5;
                    int i3115 = i31;
                    int i3116 = i32 >> 6;
                    int i3117 = i32 << 12;
                    smo1.i(qim0Var115, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var10, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i3116 & 458752) | (i3116 & 3670016) | (i3117 & 234881024) | (i3117 & 1879048192), ((i3115 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i3116 & 57344) | ((i3115 << 9) & 458752) | 1572864);
                    float f10 = f3;
                    ru91Var3 = ru91VarJ;
                    gdr0Var3 = gdr0Var10;
                    z3 = z4;
                    i10 = i33;
                    pl3Var3 = pl3Var5;
                    hxq0Var2 = hxq0VarB;
                    f2 = f10;
                    iu30 iu30Var114 = iu30Var4;
                    d6o0Var2 = d6o0Var3;
                    iu30Var2 = iu30Var114;
                    vzq0Var3 = vzq0Var4;
                    xu91Var2 = xu91Var3;
                    qim0Var3 = qim0Var115;
                } else {
                    x340Var = x340Var3;
                    x340Var.b0();
                    z3 = z;
                    hxq0Var2 = hxq0Var;
                    qim0Var3 = qim0Var2;
                    pl3Var3 = pl3Var2;
                    ru91Var3 = ru91Var2;
                    vzq0Var3 = vzq0Var2;
                    gdr0Var3 = gdr0Var2;
                    iu30Var2 = iu30Var;
                    d6o0Var2 = d6o0Var;
                    xu91Var2 = xu91Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                }
            }
            i4 |= 24576;
            i10 = i;
            i12 = i3 & 32;
            if (i12 != 0) {
                i4 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 196608) == 0) {
                    if (x340Var3.d(f2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
            }
            i14 = i3 & 64;
            if (i14 != 0) {
                i4 |= 1572864;
                pl3Var2 = pl3Var;
            } else {
                pl3Var2 = pl3Var;
                if ((i2 & 1572864) == 0) {
                    if (x340Var3.g(pl3Var2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i4 |= i15;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    ru91Var2 = ru91Var;
                    if (x340Var3.g(ru91Var2)) {
                    }
                    i4 |= i35;
                } else {
                    ru91Var2 = ru91Var;
                }
                i4 |= i35;
            } else {
                ru91Var2 = ru91Var;
            }
            i16 = i3 & 256;
            if (i16 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (x340Var3.h(z)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i4 |= i17;
            }
            i18 = i4 | 805306368;
            i19 = i3 & 1024;
            if (i19 != 0) {
                i22 = 24582;
                i20 = 24576;
            } else {
                i20 = 24576;
                if (x340Var3.i(iu30Var)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i22 = 24576 | i21;
            }
            i23 = i22;
            i24 = i23 | 16;
            i25 = i3 & 4096;
            if (i25 != 0) {
                i27 = i23 | 400;
            } else {
                if (x340Var3.g(xu91Var)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i27 = i24 | i26;
            }
            i28 = i27 | 1024;
            if ((306783379 & i18) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var3.Y(i18 & 1, z2)) {
                x340Var3.d0();
                i29 = i2 & 1;
                qqq0Var = qqq0.b;
                if (i29 != 0) {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vzq0VarF = uyn1.f(0.0f);
                    } else {
                        vzq0VarF = vzq0Var2;
                    }
                    if (i7 != 0) {
                        gdr0Var2 = ak20.S0;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if (i12 != 0) {
                        f2 = 0.0f;
                    }
                    if (i14 != 0) {
                        pl3Var4 = een.N0;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if ((i3 & 128) != 0) {
                        ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        i30 = i18 & (-29360129);
                    } else {
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        ru91VarJ = ru91Var2;
                        i30 = i18;
                    }
                    if (i16 == 0) {
                    }
                    if (i19 != 0) {
                        iu30Var3 = null;
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    d6o0 d6o0VarL14 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                    if (i25 != 0) {
                        xu91Var3 = zov0.g;
                    } else {
                        xu91Var3 = xu91Var;
                    }
                    qim0 qim0Var116 = qim0Var4;
                    i31 = i28 & (-7281);
                    qim0Var5 = qim0Var116;
                    iu30 iu30Var115 = iu30Var3;
                    i32 = i30;
                    iu30Var4 = iu30Var115;
                    vzq0Var4 = vzq0VarF;
                    f3 = f2;
                    hxq0VarB = jxq0.b(x340Var2);
                    x340Var = x340Var2;
                    d6o0Var3 = d6o0VarL14;
                    pl3Var5 = pl3Var4;
                    i33 = i10;
                    z4 = z5;
                } else {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vzq0VarF = uyn1.f(0.0f);
                    } else {
                        vzq0VarF = vzq0Var2;
                    }
                    if (i7 != 0) {
                        gdr0Var2 = ak20.S0;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if (i12 != 0) {
                        f2 = 0.0f;
                    }
                    if (i14 != 0) {
                        pl3Var4 = een.N0;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if ((i3 & 128) != 0) {
                        ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        i30 = i18 & (-29360129);
                    } else {
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        ru91VarJ = ru91Var2;
                        i30 = i18;
                    }
                    if (i16 == 0) {
                    }
                    if (i19 != 0) {
                        iu30Var3 = null;
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    d6o0 d6o0VarL15 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                    if (i25 != 0) {
                        xu91Var3 = zov0.g;
                    } else {
                        xu91Var3 = xu91Var;
                    }
                    qim0 qim0Var117 = qim0Var4;
                    i31 = i28 & (-7281);
                    qim0Var5 = qim0Var117;
                    iu30 iu30Var116 = iu30Var3;
                    i32 = i30;
                    iu30Var4 = iu30Var116;
                    vzq0Var4 = vzq0VarF;
                    f3 = f2;
                    hxq0VarB = jxq0.b(x340Var2);
                    x340Var = x340Var2;
                    d6o0Var3 = d6o0VarL15;
                    pl3Var5 = pl3Var4;
                    i33 = i10;
                    z4 = z5;
                }
                gdr0 gdr0Var11 = gdr0Var2;
                x340Var.s();
                qim0 qim0Var118 = qim0Var5;
                int i3118 = i31;
                int i3119 = i32 >> 6;
                int i31110 = i32 << 12;
                smo1.i(qim0Var118, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var11, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i3119 & 458752) | (i3119 & 3670016) | (i31110 & 234881024) | (i31110 & 1879048192), ((i3118 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i3119 & 57344) | ((i3118 << 9) & 458752) | 1572864);
                float f11 = f3;
                ru91Var3 = ru91VarJ;
                gdr0Var3 = gdr0Var11;
                z3 = z4;
                i10 = i33;
                pl3Var3 = pl3Var5;
                hxq0Var2 = hxq0VarB;
                f2 = f11;
                iu30 iu30Var117 = iu30Var4;
                d6o0Var2 = d6o0Var3;
                iu30Var2 = iu30Var117;
                vzq0Var3 = vzq0Var4;
                xu91Var2 = xu91Var3;
                qim0Var3 = qim0Var118;
            } else {
                x340Var = x340Var3;
                x340Var.b0();
                z3 = z;
                hxq0Var2 = hxq0Var;
                qim0Var3 = qim0Var2;
                pl3Var3 = pl3Var2;
                ru91Var3 = ru91Var2;
                vzq0Var3 = vzq0Var2;
                gdr0Var3 = gdr0Var2;
                iu30Var2 = iu30Var;
                d6o0Var2 = d6o0Var;
                xu91Var2 = xu91Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
            }
        }
        i4 |= 48;
        qim0Var2 = qim0Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                vzq0Var2 = vzq0Var;
                if (x340Var3.g(vzq0Var2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    gdr0Var2 = gdr0Var;
                    if (x340Var3.g(gdr0Var2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        i10 = i;
                        if (x340Var3.e(i10)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 32;
                    if (i12 != 0) {
                        i4 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 196608) == 0) {
                            if (x340Var3.d(f2)) {
                                i13 = 131072;
                            } else {
                                i13 = 65536;
                            }
                            i4 |= i13;
                        }
                    }
                    i14 = i3 & 64;
                    if (i14 != 0) {
                        i4 |= 1572864;
                        pl3Var2 = pl3Var;
                    } else {
                        pl3Var2 = pl3Var;
                        if ((i2 & 1572864) == 0) {
                            if (x340Var3.g(pl3Var2)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i4 |= i15;
                        }
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & 128) == 0) {
                            ru91Var2 = ru91Var;
                            if (x340Var3.g(ru91Var2)) {
                            }
                            i4 |= i35;
                        } else {
                            ru91Var2 = ru91Var;
                        }
                        i4 |= i35;
                    } else {
                        ru91Var2 = ru91Var;
                    }
                    i16 = i3 & 256;
                    if (i16 != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (x340Var3.h(z)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i4 |= i17;
                    }
                    i18 = i4 | 805306368;
                    i19 = i3 & 1024;
                    if (i19 != 0) {
                        i22 = 24582;
                        i20 = 24576;
                    } else {
                        i20 = 24576;
                        if (x340Var3.i(iu30Var)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i22 = 24576 | i21;
                    }
                    i23 = i22;
                    i24 = i23 | 16;
                    i25 = i3 & 4096;
                    if (i25 != 0) {
                        i27 = i23 | 400;
                    } else {
                        if (x340Var3.g(xu91Var)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i27 = i24 | i26;
                    }
                    i28 = i27 | 1024;
                    if ((306783379 & i18) == 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (x340Var3.Y(i18 & 1, z2)) {
                        x340Var3.d0();
                        i29 = i2 & 1;
                        qqq0Var = qqq0.b;
                        if (i29 != 0) {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                vzq0VarF = uyn1.f(0.0f);
                            } else {
                                vzq0VarF = vzq0Var2;
                            }
                            if (i7 != 0) {
                                gdr0Var2 = ak20.S0;
                            }
                            if (i9 != 0) {
                                i10 = 0;
                            }
                            if (i12 != 0) {
                                f2 = 0.0f;
                            }
                            if (i14 != 0) {
                                pl3Var4 = een.N0;
                            } else {
                                pl3Var4 = pl3Var2;
                            }
                            if ((i3 & 128) != 0) {
                                ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                i30 = i18 & (-29360129);
                            } else {
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                ru91VarJ = ru91Var2;
                                i30 = i18;
                            }
                            if (i16 == 0) {
                            }
                            if (i19 != 0) {
                                iu30Var3 = null;
                            } else {
                                iu30Var3 = iu30Var;
                            }
                            d6o0 d6o0VarL16 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                            if (i25 != 0) {
                                xu91Var3 = zov0.g;
                            } else {
                                xu91Var3 = xu91Var;
                            }
                            qim0 qim0Var119 = qim0Var4;
                            i31 = i28 & (-7281);
                            qim0Var5 = qim0Var119;
                            iu30 iu30Var118 = iu30Var3;
                            i32 = i30;
                            iu30Var4 = iu30Var118;
                            vzq0Var4 = vzq0VarF;
                            f3 = f2;
                            hxq0VarB = jxq0.b(x340Var2);
                            x340Var = x340Var2;
                            d6o0Var3 = d6o0VarL16;
                            pl3Var5 = pl3Var4;
                            i33 = i10;
                            z4 = z5;
                        } else {
                            if (i34 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                vzq0VarF = uyn1.f(0.0f);
                            } else {
                                vzq0VarF = vzq0Var2;
                            }
                            if (i7 != 0) {
                                gdr0Var2 = ak20.S0;
                            }
                            if (i9 != 0) {
                                i10 = 0;
                            }
                            if (i12 != 0) {
                                f2 = 0.0f;
                            }
                            if (i14 != 0) {
                                pl3Var4 = een.N0;
                            } else {
                                pl3Var4 = pl3Var2;
                            }
                            if ((i3 & 128) != 0) {
                                ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                i30 = i18 & (-29360129);
                            } else {
                                jkr0Var2 = jkr0Var;
                                x340Var2 = x340Var3;
                                ru91VarJ = ru91Var2;
                                i30 = i18;
                            }
                            if (i16 == 0) {
                            }
                            if (i19 != 0) {
                                iu30Var3 = null;
                            } else {
                                iu30Var3 = iu30Var;
                            }
                            d6o0 d6o0VarL17 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                            if (i25 != 0) {
                                xu91Var3 = zov0.g;
                            } else {
                                xu91Var3 = xu91Var;
                            }
                            qim0 qim0Var1110 = qim0Var4;
                            i31 = i28 & (-7281);
                            qim0Var5 = qim0Var1110;
                            iu30 iu30Var119 = iu30Var3;
                            i32 = i30;
                            iu30Var4 = iu30Var119;
                            vzq0Var4 = vzq0VarF;
                            f3 = f2;
                            hxq0VarB = jxq0.b(x340Var2);
                            x340Var = x340Var2;
                            d6o0Var3 = d6o0VarL17;
                            pl3Var5 = pl3Var4;
                            i33 = i10;
                            z4 = z5;
                        }
                        gdr0 gdr0Var12 = gdr0Var2;
                        x340Var.s();
                        qim0 qim0Var1111 = qim0Var5;
                        int i31111 = i31;
                        int i31112 = i32 >> 6;
                        int i31113 = i32 << 12;
                        smo1.i(qim0Var1111, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var12, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i31112 & 458752) | (i31112 & 3670016) | (i31113 & 234881024) | (i31113 & 1879048192), ((i31111 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i31112 & 57344) | ((i31111 << 9) & 458752) | 1572864);
                        float f12 = f3;
                        ru91Var3 = ru91VarJ;
                        gdr0Var3 = gdr0Var12;
                        z3 = z4;
                        i10 = i33;
                        pl3Var3 = pl3Var5;
                        hxq0Var2 = hxq0VarB;
                        f2 = f12;
                        iu30 iu30Var1110 = iu30Var4;
                        d6o0Var2 = d6o0Var3;
                        iu30Var2 = iu30Var1110;
                        vzq0Var3 = vzq0Var4;
                        xu91Var2 = xu91Var3;
                        qim0Var3 = qim0Var1111;
                    } else {
                        x340Var = x340Var3;
                        x340Var.b0();
                        z3 = z;
                        hxq0Var2 = hxq0Var;
                        qim0Var3 = qim0Var2;
                        pl3Var3 = pl3Var2;
                        ru91Var3 = ru91Var2;
                        vzq0Var3 = vzq0Var2;
                        gdr0Var3 = gdr0Var2;
                        iu30Var2 = iu30Var;
                        d6o0Var2 = d6o0Var;
                        xu91Var2 = xu91Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                    }
                }
                i4 |= 24576;
                i10 = i;
                i12 = i3 & 32;
                if (i12 != 0) {
                    i4 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (x340Var3.d(f2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 64;
                if (i14 != 0) {
                    i4 |= 1572864;
                    pl3Var2 = pl3Var;
                } else {
                    pl3Var2 = pl3Var;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var3.g(pl3Var2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i4 |= i15;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        ru91Var2 = ru91Var;
                        if (x340Var3.g(ru91Var2)) {
                        }
                        i4 |= i35;
                    } else {
                        ru91Var2 = ru91Var;
                    }
                    i4 |= i35;
                } else {
                    ru91Var2 = ru91Var;
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (x340Var3.h(z)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i4 |= i17;
                }
                i18 = i4 | 805306368;
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i22 = 24582;
                    i20 = 24576;
                } else {
                    i20 = 24576;
                    if (x340Var3.i(iu30Var)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i22 = 24576 | i21;
                }
                i23 = i22;
                i24 = i23 | 16;
                i25 = i3 & 4096;
                if (i25 != 0) {
                    i27 = i23 | 400;
                } else {
                    if (x340Var3.g(xu91Var)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i27 = i24 | i26;
                }
                i28 = i27 | 1024;
                if ((306783379 & i18) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var3.Y(i18 & 1, z2)) {
                    x340Var3.d0();
                    i29 = i2 & 1;
                    qqq0Var = qqq0.b;
                    if (i29 != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL18 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var1112 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var1112;
                        iu30 iu30Var1111 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var1111;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL18;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL19 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var1113 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var1113;
                        iu30 iu30Var1112 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var1112;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL19;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    }
                    gdr0 gdr0Var13 = gdr0Var2;
                    x340Var.s();
                    qim0 qim0Var1114 = qim0Var5;
                    int i31114 = i31;
                    int i31115 = i32 >> 6;
                    int i31116 = i32 << 12;
                    smo1.i(qim0Var1114, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var13, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i31115 & 458752) | (i31115 & 3670016) | (i31116 & 234881024) | (i31116 & 1879048192), ((i31114 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i31115 & 57344) | ((i31114 << 9) & 458752) | 1572864);
                    float f13 = f3;
                    ru91Var3 = ru91VarJ;
                    gdr0Var3 = gdr0Var13;
                    z3 = z4;
                    i10 = i33;
                    pl3Var3 = pl3Var5;
                    hxq0Var2 = hxq0VarB;
                    f2 = f13;
                    iu30 iu30Var1113 = iu30Var4;
                    d6o0Var2 = d6o0Var3;
                    iu30Var2 = iu30Var1113;
                    vzq0Var3 = vzq0Var4;
                    xu91Var2 = xu91Var3;
                    qim0Var3 = qim0Var1114;
                } else {
                    x340Var = x340Var3;
                    x340Var.b0();
                    z3 = z;
                    hxq0Var2 = hxq0Var;
                    qim0Var3 = qim0Var2;
                    pl3Var3 = pl3Var2;
                    ru91Var3 = ru91Var2;
                    vzq0Var3 = vzq0Var2;
                    gdr0Var3 = gdr0Var2;
                    iu30Var2 = iu30Var;
                    d6o0Var2 = d6o0Var;
                    xu91Var2 = xu91Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                }
            }
            i4 |= 3072;
            gdr0Var2 = gdr0Var;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    i10 = i;
                    if (x340Var3.e(i10)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 32;
                if (i12 != 0) {
                    i4 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (x340Var3.d(f2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 64;
                if (i14 != 0) {
                    i4 |= 1572864;
                    pl3Var2 = pl3Var;
                } else {
                    pl3Var2 = pl3Var;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var3.g(pl3Var2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i4 |= i15;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        ru91Var2 = ru91Var;
                        if (x340Var3.g(ru91Var2)) {
                        }
                        i4 |= i35;
                    } else {
                        ru91Var2 = ru91Var;
                    }
                    i4 |= i35;
                } else {
                    ru91Var2 = ru91Var;
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (x340Var3.h(z)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i4 |= i17;
                }
                i18 = i4 | 805306368;
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i22 = 24582;
                    i20 = 24576;
                } else {
                    i20 = 24576;
                    if (x340Var3.i(iu30Var)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i22 = 24576 | i21;
                }
                i23 = i22;
                i24 = i23 | 16;
                i25 = i3 & 4096;
                if (i25 != 0) {
                    i27 = i23 | 400;
                } else {
                    if (x340Var3.g(xu91Var)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i27 = i24 | i26;
                }
                i28 = i27 | 1024;
                if ((306783379 & i18) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var3.Y(i18 & 1, z2)) {
                    x340Var3.d0();
                    i29 = i2 & 1;
                    qqq0Var = qqq0.b;
                    if (i29 != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL110 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var1115 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var1115;
                        iu30 iu30Var1114 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var1114;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL110;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL111 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var1116 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var1116;
                        iu30 iu30Var1115 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var1115;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL111;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    }
                    gdr0 gdr0Var14 = gdr0Var2;
                    x340Var.s();
                    qim0 qim0Var1117 = qim0Var5;
                    int i31117 = i31;
                    int i31118 = i32 >> 6;
                    int i31119 = i32 << 12;
                    smo1.i(qim0Var1117, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var14, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i31118 & 458752) | (i31118 & 3670016) | (i31119 & 234881024) | (i31119 & 1879048192), ((i31117 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i31118 & 57344) | ((i31117 << 9) & 458752) | 1572864);
                    float f14 = f3;
                    ru91Var3 = ru91VarJ;
                    gdr0Var3 = gdr0Var14;
                    z3 = z4;
                    i10 = i33;
                    pl3Var3 = pl3Var5;
                    hxq0Var2 = hxq0VarB;
                    f2 = f14;
                    iu30 iu30Var1116 = iu30Var4;
                    d6o0Var2 = d6o0Var3;
                    iu30Var2 = iu30Var1116;
                    vzq0Var3 = vzq0Var4;
                    xu91Var2 = xu91Var3;
                    qim0Var3 = qim0Var1117;
                } else {
                    x340Var = x340Var3;
                    x340Var.b0();
                    z3 = z;
                    hxq0Var2 = hxq0Var;
                    qim0Var3 = qim0Var2;
                    pl3Var3 = pl3Var2;
                    ru91Var3 = ru91Var2;
                    vzq0Var3 = vzq0Var2;
                    gdr0Var3 = gdr0Var2;
                    iu30Var2 = iu30Var;
                    d6o0Var2 = d6o0Var;
                    xu91Var2 = xu91Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                }
            }
            i4 |= 24576;
            i10 = i;
            i12 = i3 & 32;
            if (i12 != 0) {
                i4 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 196608) == 0) {
                    if (x340Var3.d(f2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
            }
            i14 = i3 & 64;
            if (i14 != 0) {
                i4 |= 1572864;
                pl3Var2 = pl3Var;
            } else {
                pl3Var2 = pl3Var;
                if ((i2 & 1572864) == 0) {
                    if (x340Var3.g(pl3Var2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i4 |= i15;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    ru91Var2 = ru91Var;
                    if (x340Var3.g(ru91Var2)) {
                    }
                    i4 |= i35;
                } else {
                    ru91Var2 = ru91Var;
                }
                i4 |= i35;
            } else {
                ru91Var2 = ru91Var;
            }
            i16 = i3 & 256;
            if (i16 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (x340Var3.h(z)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i4 |= i17;
            }
            i18 = i4 | 805306368;
            i19 = i3 & 1024;
            if (i19 != 0) {
                i22 = 24582;
                i20 = 24576;
            } else {
                i20 = 24576;
                if (x340Var3.i(iu30Var)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i22 = 24576 | i21;
            }
            i23 = i22;
            i24 = i23 | 16;
            i25 = i3 & 4096;
            if (i25 != 0) {
                i27 = i23 | 400;
            } else {
                if (x340Var3.g(xu91Var)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i27 = i24 | i26;
            }
            i28 = i27 | 1024;
            if ((306783379 & i18) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var3.Y(i18 & 1, z2)) {
                x340Var3.d0();
                i29 = i2 & 1;
                qqq0Var = qqq0.b;
                if (i29 != 0) {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vzq0VarF = uyn1.f(0.0f);
                    } else {
                        vzq0VarF = vzq0Var2;
                    }
                    if (i7 != 0) {
                        gdr0Var2 = ak20.S0;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if (i12 != 0) {
                        f2 = 0.0f;
                    }
                    if (i14 != 0) {
                        pl3Var4 = een.N0;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if ((i3 & 128) != 0) {
                        ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        i30 = i18 & (-29360129);
                    } else {
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        ru91VarJ = ru91Var2;
                        i30 = i18;
                    }
                    if (i16 == 0) {
                    }
                    if (i19 != 0) {
                        iu30Var3 = null;
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    d6o0 d6o0VarL112 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                    if (i25 != 0) {
                        xu91Var3 = zov0.g;
                    } else {
                        xu91Var3 = xu91Var;
                    }
                    qim0 qim0Var1118 = qim0Var4;
                    i31 = i28 & (-7281);
                    qim0Var5 = qim0Var1118;
                    iu30 iu30Var1117 = iu30Var3;
                    i32 = i30;
                    iu30Var4 = iu30Var1117;
                    vzq0Var4 = vzq0VarF;
                    f3 = f2;
                    hxq0VarB = jxq0.b(x340Var2);
                    x340Var = x340Var2;
                    d6o0Var3 = d6o0VarL112;
                    pl3Var5 = pl3Var4;
                    i33 = i10;
                    z4 = z5;
                } else {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vzq0VarF = uyn1.f(0.0f);
                    } else {
                        vzq0VarF = vzq0Var2;
                    }
                    if (i7 != 0) {
                        gdr0Var2 = ak20.S0;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if (i12 != 0) {
                        f2 = 0.0f;
                    }
                    if (i14 != 0) {
                        pl3Var4 = een.N0;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if ((i3 & 128) != 0) {
                        ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        i30 = i18 & (-29360129);
                    } else {
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        ru91VarJ = ru91Var2;
                        i30 = i18;
                    }
                    if (i16 == 0) {
                    }
                    if (i19 != 0) {
                        iu30Var3 = null;
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    d6o0 d6o0VarL113 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                    if (i25 != 0) {
                        xu91Var3 = zov0.g;
                    } else {
                        xu91Var3 = xu91Var;
                    }
                    qim0 qim0Var1119 = qim0Var4;
                    i31 = i28 & (-7281);
                    qim0Var5 = qim0Var1119;
                    iu30 iu30Var1118 = iu30Var3;
                    i32 = i30;
                    iu30Var4 = iu30Var1118;
                    vzq0Var4 = vzq0VarF;
                    f3 = f2;
                    hxq0VarB = jxq0.b(x340Var2);
                    x340Var = x340Var2;
                    d6o0Var3 = d6o0VarL113;
                    pl3Var5 = pl3Var4;
                    i33 = i10;
                    z4 = z5;
                }
                gdr0 gdr0Var15 = gdr0Var2;
                x340Var.s();
                qim0 qim0Var11110 = qim0Var5;
                int i311110 = i31;
                int i311111 = i32 >> 6;
                int i311112 = i32 << 12;
                smo1.i(qim0Var11110, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var15, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i311111 & 458752) | (i311111 & 3670016) | (i311112 & 234881024) | (i311112 & 1879048192), ((i311110 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i311111 & 57344) | ((i311110 << 9) & 458752) | 1572864);
                float f15 = f3;
                ru91Var3 = ru91VarJ;
                gdr0Var3 = gdr0Var15;
                z3 = z4;
                i10 = i33;
                pl3Var3 = pl3Var5;
                hxq0Var2 = hxq0VarB;
                f2 = f15;
                iu30 iu30Var1119 = iu30Var4;
                d6o0Var2 = d6o0Var3;
                iu30Var2 = iu30Var1119;
                vzq0Var3 = vzq0Var4;
                xu91Var2 = xu91Var3;
                qim0Var3 = qim0Var11110;
            } else {
                x340Var = x340Var3;
                x340Var.b0();
                z3 = z;
                hxq0Var2 = hxq0Var;
                qim0Var3 = qim0Var2;
                pl3Var3 = pl3Var2;
                ru91Var3 = ru91Var2;
                vzq0Var3 = vzq0Var2;
                gdr0Var3 = gdr0Var2;
                iu30Var2 = iu30Var;
                d6o0Var2 = d6o0Var;
                xu91Var2 = xu91Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
            }
        }
        i4 |= 384;
        vzq0Var2 = vzq0Var;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                gdr0Var2 = gdr0Var;
                if (x340Var3.g(gdr0Var2)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    i10 = i;
                    if (x340Var3.e(i10)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 32;
                if (i12 != 0) {
                    i4 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (x340Var3.d(f2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i4 |= i13;
                    }
                }
                i14 = i3 & 64;
                if (i14 != 0) {
                    i4 |= 1572864;
                    pl3Var2 = pl3Var;
                } else {
                    pl3Var2 = pl3Var;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var3.g(pl3Var2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i4 |= i15;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        ru91Var2 = ru91Var;
                        if (x340Var3.g(ru91Var2)) {
                        }
                        i4 |= i35;
                    } else {
                        ru91Var2 = ru91Var;
                    }
                    i4 |= i35;
                } else {
                    ru91Var2 = ru91Var;
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (x340Var3.h(z)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i4 |= i17;
                }
                i18 = i4 | 805306368;
                i19 = i3 & 1024;
                if (i19 != 0) {
                    i22 = 24582;
                    i20 = 24576;
                } else {
                    i20 = 24576;
                    if (x340Var3.i(iu30Var)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i22 = 24576 | i21;
                }
                i23 = i22;
                i24 = i23 | 16;
                i25 = i3 & 4096;
                if (i25 != 0) {
                    i27 = i23 | 400;
                } else {
                    if (x340Var3.g(xu91Var)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i27 = i24 | i26;
                }
                i28 = i27 | 1024;
                if ((306783379 & i18) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (x340Var3.Y(i18 & 1, z2)) {
                    x340Var3.d0();
                    i29 = i2 & 1;
                    qqq0Var = qqq0.b;
                    if (i29 != 0) {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL114 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var11111 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var11111;
                        iu30 iu30Var11110 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var11110;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL114;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    } else {
                        if (i34 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vzq0VarF = uyn1.f(0.0f);
                        } else {
                            vzq0VarF = vzq0Var2;
                        }
                        if (i7 != 0) {
                            gdr0Var2 = ak20.S0;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i12 != 0) {
                            f2 = 0.0f;
                        }
                        if (i14 != 0) {
                            pl3Var4 = een.N0;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if ((i3 & 128) != 0) {
                            ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            i30 = i18 & (-29360129);
                        } else {
                            jkr0Var2 = jkr0Var;
                            x340Var2 = x340Var3;
                            ru91VarJ = ru91Var2;
                            i30 = i18;
                        }
                        if (i16 == 0) {
                        }
                        if (i19 != 0) {
                            iu30Var3 = null;
                        } else {
                            iu30Var3 = iu30Var;
                        }
                        d6o0 d6o0VarL115 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                        if (i25 != 0) {
                            xu91Var3 = zov0.g;
                        } else {
                            xu91Var3 = xu91Var;
                        }
                        qim0 qim0Var11112 = qim0Var4;
                        i31 = i28 & (-7281);
                        qim0Var5 = qim0Var11112;
                        iu30 iu30Var11111 = iu30Var3;
                        i32 = i30;
                        iu30Var4 = iu30Var11111;
                        vzq0Var4 = vzq0VarF;
                        f3 = f2;
                        hxq0VarB = jxq0.b(x340Var2);
                        x340Var = x340Var2;
                        d6o0Var3 = d6o0VarL115;
                        pl3Var5 = pl3Var4;
                        i33 = i10;
                        z4 = z5;
                    }
                    gdr0 gdr0Var16 = gdr0Var2;
                    x340Var.s();
                    qim0 qim0Var11113 = qim0Var5;
                    int i311113 = i31;
                    int i311114 = i32 >> 6;
                    int i311115 = i32 << 12;
                    smo1.i(qim0Var11113, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var16, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i311114 & 458752) | (i311114 & 3670016) | (i311115 & 234881024) | (i311115 & 1879048192), ((i311113 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i311114 & 57344) | ((i311113 << 9) & 458752) | 1572864);
                    float f16 = f3;
                    ru91Var3 = ru91VarJ;
                    gdr0Var3 = gdr0Var16;
                    z3 = z4;
                    i10 = i33;
                    pl3Var3 = pl3Var5;
                    hxq0Var2 = hxq0VarB;
                    f2 = f16;
                    iu30 iu30Var11112 = iu30Var4;
                    d6o0Var2 = d6o0Var3;
                    iu30Var2 = iu30Var11112;
                    vzq0Var3 = vzq0Var4;
                    xu91Var2 = xu91Var3;
                    qim0Var3 = qim0Var11113;
                } else {
                    x340Var = x340Var3;
                    x340Var.b0();
                    z3 = z;
                    hxq0Var2 = hxq0Var;
                    qim0Var3 = qim0Var2;
                    pl3Var3 = pl3Var2;
                    ru91Var3 = ru91Var2;
                    vzq0Var3 = vzq0Var2;
                    gdr0Var3 = gdr0Var2;
                    iu30Var2 = iu30Var;
                    d6o0Var2 = d6o0Var;
                    xu91Var2 = xu91Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
                }
            }
            i4 |= 24576;
            i10 = i;
            i12 = i3 & 32;
            if (i12 != 0) {
                i4 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 196608) == 0) {
                    if (x340Var3.d(f2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
            }
            i14 = i3 & 64;
            if (i14 != 0) {
                i4 |= 1572864;
                pl3Var2 = pl3Var;
            } else {
                pl3Var2 = pl3Var;
                if ((i2 & 1572864) == 0) {
                    if (x340Var3.g(pl3Var2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i4 |= i15;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    ru91Var2 = ru91Var;
                    if (x340Var3.g(ru91Var2)) {
                    }
                    i4 |= i35;
                } else {
                    ru91Var2 = ru91Var;
                }
                i4 |= i35;
            } else {
                ru91Var2 = ru91Var;
            }
            i16 = i3 & 256;
            if (i16 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (x340Var3.h(z)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i4 |= i17;
            }
            i18 = i4 | 805306368;
            i19 = i3 & 1024;
            if (i19 != 0) {
                i22 = 24582;
                i20 = 24576;
            } else {
                i20 = 24576;
                if (x340Var3.i(iu30Var)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i22 = 24576 | i21;
            }
            i23 = i22;
            i24 = i23 | 16;
            i25 = i3 & 4096;
            if (i25 != 0) {
                i27 = i23 | 400;
            } else {
                if (x340Var3.g(xu91Var)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i27 = i24 | i26;
            }
            i28 = i27 | 1024;
            if ((306783379 & i18) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var3.Y(i18 & 1, z2)) {
                x340Var3.d0();
                i29 = i2 & 1;
                qqq0Var = qqq0.b;
                if (i29 != 0) {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vzq0VarF = uyn1.f(0.0f);
                    } else {
                        vzq0VarF = vzq0Var2;
                    }
                    if (i7 != 0) {
                        gdr0Var2 = ak20.S0;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if (i12 != 0) {
                        f2 = 0.0f;
                    }
                    if (i14 != 0) {
                        pl3Var4 = een.N0;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if ((i3 & 128) != 0) {
                        ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        i30 = i18 & (-29360129);
                    } else {
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        ru91VarJ = ru91Var2;
                        i30 = i18;
                    }
                    if (i16 == 0) {
                    }
                    if (i19 != 0) {
                        iu30Var3 = null;
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    d6o0 d6o0VarL116 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                    if (i25 != 0) {
                        xu91Var3 = zov0.g;
                    } else {
                        xu91Var3 = xu91Var;
                    }
                    qim0 qim0Var11114 = qim0Var4;
                    i31 = i28 & (-7281);
                    qim0Var5 = qim0Var11114;
                    iu30 iu30Var11113 = iu30Var3;
                    i32 = i30;
                    iu30Var4 = iu30Var11113;
                    vzq0Var4 = vzq0VarF;
                    f3 = f2;
                    hxq0VarB = jxq0.b(x340Var2);
                    x340Var = x340Var2;
                    d6o0Var3 = d6o0VarL116;
                    pl3Var5 = pl3Var4;
                    i33 = i10;
                    z4 = z5;
                } else {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vzq0VarF = uyn1.f(0.0f);
                    } else {
                        vzq0VarF = vzq0Var2;
                    }
                    if (i7 != 0) {
                        gdr0Var2 = ak20.S0;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if (i12 != 0) {
                        f2 = 0.0f;
                    }
                    if (i14 != 0) {
                        pl3Var4 = een.N0;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if ((i3 & 128) != 0) {
                        ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        i30 = i18 & (-29360129);
                    } else {
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        ru91VarJ = ru91Var2;
                        i30 = i18;
                    }
                    if (i16 == 0) {
                    }
                    if (i19 != 0) {
                        iu30Var3 = null;
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    d6o0 d6o0VarL117 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                    if (i25 != 0) {
                        xu91Var3 = zov0.g;
                    } else {
                        xu91Var3 = xu91Var;
                    }
                    qim0 qim0Var11115 = qim0Var4;
                    i31 = i28 & (-7281);
                    qim0Var5 = qim0Var11115;
                    iu30 iu30Var11114 = iu30Var3;
                    i32 = i30;
                    iu30Var4 = iu30Var11114;
                    vzq0Var4 = vzq0VarF;
                    f3 = f2;
                    hxq0VarB = jxq0.b(x340Var2);
                    x340Var = x340Var2;
                    d6o0Var3 = d6o0VarL117;
                    pl3Var5 = pl3Var4;
                    i33 = i10;
                    z4 = z5;
                }
                gdr0 gdr0Var17 = gdr0Var2;
                x340Var.s();
                qim0 qim0Var11116 = qim0Var5;
                int i311116 = i31;
                int i311117 = i32 >> 6;
                int i311118 = i32 << 12;
                smo1.i(qim0Var11116, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var17, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i311117 & 458752) | (i311117 & 3670016) | (i311118 & 234881024) | (i311118 & 1879048192), ((i311116 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i311117 & 57344) | ((i311116 << 9) & 458752) | 1572864);
                float f17 = f3;
                ru91Var3 = ru91VarJ;
                gdr0Var3 = gdr0Var17;
                z3 = z4;
                i10 = i33;
                pl3Var3 = pl3Var5;
                hxq0Var2 = hxq0VarB;
                f2 = f17;
                iu30 iu30Var11115 = iu30Var4;
                d6o0Var2 = d6o0Var3;
                iu30Var2 = iu30Var11115;
                vzq0Var3 = vzq0Var4;
                xu91Var2 = xu91Var3;
                qim0Var3 = qim0Var11116;
            } else {
                x340Var = x340Var3;
                x340Var.b0();
                z3 = z;
                hxq0Var2 = hxq0Var;
                qim0Var3 = qim0Var2;
                pl3Var3 = pl3Var2;
                ru91Var3 = ru91Var2;
                vzq0Var3 = vzq0Var2;
                gdr0Var3 = gdr0Var2;
                iu30Var2 = iu30Var;
                d6o0Var2 = d6o0Var;
                xu91Var2 = xu91Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
            }
        }
        i4 |= 3072;
        gdr0Var2 = gdr0Var;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                i10 = i;
                if (x340Var3.e(i10)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i4 |= i11;
            }
            i12 = i3 & 32;
            if (i12 != 0) {
                i4 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 196608) == 0) {
                    if (x340Var3.d(f2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
            }
            i14 = i3 & 64;
            if (i14 != 0) {
                i4 |= 1572864;
                pl3Var2 = pl3Var;
            } else {
                pl3Var2 = pl3Var;
                if ((i2 & 1572864) == 0) {
                    if (x340Var3.g(pl3Var2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i4 |= i15;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    ru91Var2 = ru91Var;
                    if (x340Var3.g(ru91Var2)) {
                    }
                    i4 |= i35;
                } else {
                    ru91Var2 = ru91Var;
                }
                i4 |= i35;
            } else {
                ru91Var2 = ru91Var;
            }
            i16 = i3 & 256;
            if (i16 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (x340Var3.h(z)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i4 |= i17;
            }
            i18 = i4 | 805306368;
            i19 = i3 & 1024;
            if (i19 != 0) {
                i22 = 24582;
                i20 = 24576;
            } else {
                i20 = 24576;
                if (x340Var3.i(iu30Var)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i22 = 24576 | i21;
            }
            i23 = i22;
            i24 = i23 | 16;
            i25 = i3 & 4096;
            if (i25 != 0) {
                i27 = i23 | 400;
            } else {
                if (x340Var3.g(xu91Var)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i27 = i24 | i26;
            }
            i28 = i27 | 1024;
            if ((306783379 & i18) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var3.Y(i18 & 1, z2)) {
                x340Var3.d0();
                i29 = i2 & 1;
                qqq0Var = qqq0.b;
                if (i29 != 0) {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vzq0VarF = uyn1.f(0.0f);
                    } else {
                        vzq0VarF = vzq0Var2;
                    }
                    if (i7 != 0) {
                        gdr0Var2 = ak20.S0;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if (i12 != 0) {
                        f2 = 0.0f;
                    }
                    if (i14 != 0) {
                        pl3Var4 = een.N0;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if ((i3 & 128) != 0) {
                        ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        i30 = i18 & (-29360129);
                    } else {
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        ru91VarJ = ru91Var2;
                        i30 = i18;
                    }
                    if (i16 == 0) {
                    }
                    if (i19 != 0) {
                        iu30Var3 = null;
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    d6o0 d6o0VarL118 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                    if (i25 != 0) {
                        xu91Var3 = zov0.g;
                    } else {
                        xu91Var3 = xu91Var;
                    }
                    qim0 qim0Var11117 = qim0Var4;
                    i31 = i28 & (-7281);
                    qim0Var5 = qim0Var11117;
                    iu30 iu30Var11116 = iu30Var3;
                    i32 = i30;
                    iu30Var4 = iu30Var11116;
                    vzq0Var4 = vzq0VarF;
                    f3 = f2;
                    hxq0VarB = jxq0.b(x340Var2);
                    x340Var = x340Var2;
                    d6o0Var3 = d6o0VarL118;
                    pl3Var5 = pl3Var4;
                    i33 = i10;
                    z4 = z5;
                } else {
                    if (i34 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vzq0VarF = uyn1.f(0.0f);
                    } else {
                        vzq0VarF = vzq0Var2;
                    }
                    if (i7 != 0) {
                        gdr0Var2 = ak20.S0;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if (i12 != 0) {
                        f2 = 0.0f;
                    }
                    if (i14 != 0) {
                        pl3Var4 = een.N0;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if ((i3 & 128) != 0) {
                        ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        i30 = i18 & (-29360129);
                    } else {
                        jkr0Var2 = jkr0Var;
                        x340Var2 = x340Var3;
                        ru91VarJ = ru91Var2;
                        i30 = i18;
                    }
                    if (i16 == 0) {
                    }
                    if (i19 != 0) {
                        iu30Var3 = null;
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    d6o0 d6o0VarL119 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                    if (i25 != 0) {
                        xu91Var3 = zov0.g;
                    } else {
                        xu91Var3 = xu91Var;
                    }
                    qim0 qim0Var11118 = qim0Var4;
                    i31 = i28 & (-7281);
                    qim0Var5 = qim0Var11118;
                    iu30 iu30Var11117 = iu30Var3;
                    i32 = i30;
                    iu30Var4 = iu30Var11117;
                    vzq0Var4 = vzq0VarF;
                    f3 = f2;
                    hxq0VarB = jxq0.b(x340Var2);
                    x340Var = x340Var2;
                    d6o0Var3 = d6o0VarL119;
                    pl3Var5 = pl3Var4;
                    i33 = i10;
                    z4 = z5;
                }
                gdr0 gdr0Var18 = gdr0Var2;
                x340Var.s();
                qim0 qim0Var11119 = qim0Var5;
                int i311119 = i31;
                int i3111110 = i32 >> 6;
                int i3111111 = i32 << 12;
                smo1.i(qim0Var11119, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var18, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i3111110 & 458752) | (i3111110 & 3670016) | (i3111111 & 234881024) | (i3111111 & 1879048192), ((i311119 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i3111110 & 57344) | ((i311119 << 9) & 458752) | 1572864);
                float f18 = f3;
                ru91Var3 = ru91VarJ;
                gdr0Var3 = gdr0Var18;
                z3 = z4;
                i10 = i33;
                pl3Var3 = pl3Var5;
                hxq0Var2 = hxq0VarB;
                f2 = f18;
                iu30 iu30Var11118 = iu30Var4;
                d6o0Var2 = d6o0Var3;
                iu30Var2 = iu30Var11118;
                vzq0Var3 = vzq0Var4;
                xu91Var2 = xu91Var3;
                qim0Var3 = qim0Var11119;
            } else {
                x340Var = x340Var3;
                x340Var.b0();
                z3 = z;
                hxq0Var2 = hxq0Var;
                qim0Var3 = qim0Var2;
                pl3Var3 = pl3Var2;
                ru91Var3 = ru91Var2;
                vzq0Var3 = vzq0Var2;
                gdr0Var3 = gdr0Var2;
                iu30Var2 = iu30Var;
                d6o0Var2 = d6o0Var;
                xu91Var2 = xu91Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
            }
        }
        i4 |= 24576;
        i10 = i;
        i12 = i3 & 32;
        if (i12 != 0) {
            i4 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            if ((i2 & 196608) == 0) {
                if (x340Var3.d(f2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i4 |= i13;
            }
        }
        i14 = i3 & 64;
        if (i14 != 0) {
            i4 |= 1572864;
            pl3Var2 = pl3Var;
        } else {
            pl3Var2 = pl3Var;
            if ((i2 & 1572864) == 0) {
                if (x340Var3.g(pl3Var2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i4 |= i15;
            }
        }
        if ((i2 & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                ru91Var2 = ru91Var;
                if (x340Var3.g(ru91Var2)) {
                }
                i4 |= i35;
            } else {
                ru91Var2 = ru91Var;
            }
            i4 |= i35;
        } else {
            ru91Var2 = ru91Var;
        }
        i16 = i3 & 256;
        if (i16 != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (x340Var3.h(z)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i4 |= i17;
        }
        i18 = i4 | 805306368;
        i19 = i3 & 1024;
        if (i19 != 0) {
            i22 = 24582;
            i20 = 24576;
        } else {
            i20 = 24576;
            if (x340Var3.i(iu30Var)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i22 = 24576 | i21;
        }
        i23 = i22;
        i24 = i23 | 16;
        i25 = i3 & 4096;
        if (i25 != 0) {
            i27 = i23 | 400;
        } else {
            if (x340Var3.g(xu91Var)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i27 = i24 | i26;
        }
        i28 = i27 | 1024;
        if ((306783379 & i18) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (x340Var3.Y(i18 & 1, z2)) {
            x340Var3.d0();
            i29 = i2 & 1;
            qqq0Var = qqq0.b;
            if (i29 != 0) {
                if (i34 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    vzq0VarF = uyn1.f(0.0f);
                } else {
                    vzq0VarF = vzq0Var2;
                }
                if (i7 != 0) {
                    gdr0Var2 = ak20.S0;
                }
                if (i9 != 0) {
                    i10 = 0;
                }
                if (i12 != 0) {
                    f2 = 0.0f;
                }
                if (i14 != 0) {
                    pl3Var4 = een.N0;
                } else {
                    pl3Var4 = pl3Var2;
                }
                if ((i3 & 128) != 0) {
                    ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                    jkr0Var2 = jkr0Var;
                    x340Var2 = x340Var3;
                    i30 = i18 & (-29360129);
                } else {
                    jkr0Var2 = jkr0Var;
                    x340Var2 = x340Var3;
                    ru91VarJ = ru91Var2;
                    i30 = i18;
                }
                if (i16 == 0) {
                }
                if (i19 != 0) {
                    iu30Var3 = null;
                } else {
                    iu30Var3 = iu30Var;
                }
                d6o0 d6o0VarL1110 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                if (i25 != 0) {
                    xu91Var3 = zov0.g;
                } else {
                    xu91Var3 = xu91Var;
                }
                qim0 qim0Var111110 = qim0Var4;
                i31 = i28 & (-7281);
                qim0Var5 = qim0Var111110;
                iu30 iu30Var11119 = iu30Var3;
                i32 = i30;
                iu30Var4 = iu30Var11119;
                vzq0Var4 = vzq0VarF;
                f3 = f2;
                hxq0VarB = jxq0.b(x340Var2);
                x340Var = x340Var2;
                d6o0Var3 = d6o0VarL1110;
                pl3Var5 = pl3Var4;
                i33 = i10;
                z4 = z5;
            } else {
                if (i34 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    vzq0VarF = uyn1.f(0.0f);
                } else {
                    vzq0VarF = vzq0Var2;
                }
                if (i7 != 0) {
                    gdr0Var2 = ak20.S0;
                }
                if (i9 != 0) {
                    i10 = 0;
                }
                if (i12 != 0) {
                    f2 = 0.0f;
                }
                if (i14 != 0) {
                    pl3Var4 = een.N0;
                } else {
                    pl3Var4 = pl3Var2;
                }
                if ((i3 & 128) != 0) {
                    ru91VarJ = q0o1.j(jkr0Var, (bkr0) null, (pxg1) null, x340Var3, (i18 & 14) | 196608, 30);
                    jkr0Var2 = jkr0Var;
                    x340Var2 = x340Var3;
                    i30 = i18 & (-29360129);
                } else {
                    jkr0Var2 = jkr0Var;
                    x340Var2 = x340Var3;
                    ru91VarJ = ru91Var2;
                    i30 = i18;
                }
                if (i16 == 0) {
                }
                if (i19 != 0) {
                    iu30Var3 = null;
                } else {
                    iu30Var3 = iu30Var;
                }
                d6o0 d6o0VarL1111 = q0o1.l(jkr0Var2, qqq0Var, x340Var2, (i30 & 14) | 432);
                if (i25 != 0) {
                    xu91Var3 = zov0.g;
                } else {
                    xu91Var3 = xu91Var;
                }
                qim0 qim0Var111111 = qim0Var4;
                i31 = i28 & (-7281);
                qim0Var5 = qim0Var111111;
                iu30 iu30Var111110 = iu30Var3;
                i32 = i30;
                iu30Var4 = iu30Var111110;
                vzq0Var4 = vzq0VarF;
                f3 = f2;
                hxq0VarB = jxq0.b(x340Var2);
                x340Var = x340Var2;
                d6o0Var3 = d6o0VarL1111;
                pl3Var5 = pl3Var4;
                i33 = i10;
                z4 = z5;
            }
            gdr0 gdr0Var19 = gdr0Var2;
            x340Var.s();
            qim0 qim0Var111112 = qim0Var5;
            int i3111112 = i31;
            int i3111113 = i32 >> 6;
            int i3111114 = i32 << 12;
            smo1.i(qim0Var111112, jkr0Var, vzq0Var4, qqq0Var, ru91VarJ, z4, hxq0VarB, i33, f3, gdr0Var19, d6o0Var3, iu30Var4, een.Q0, pl3Var5, xu91Var3, j2iVar, x340Var, ((i32 >> 3) & 14) | i20 | ((i32 << 3) & 112) | (i32 & 896) | ((i32 >> 18) & 7168) | (i3111113 & 458752) | (i3111113 & 3670016) | (i3111114 & 234881024) | (i3111114 & 1879048192), ((i3111112 << 6) & 896) | ((i32 >> 9) & 14) | 3072 | (i3111113 & 57344) | ((i3111112 << 9) & 458752) | 1572864);
            float f19 = f3;
            ru91Var3 = ru91VarJ;
            gdr0Var3 = gdr0Var19;
            z3 = z4;
            i10 = i33;
            pl3Var3 = pl3Var5;
            hxq0Var2 = hxq0VarB;
            f2 = f19;
            iu30 iu30Var111111 = iu30Var4;
            d6o0Var2 = d6o0Var3;
            iu30Var2 = iu30Var111111;
            vzq0Var3 = vzq0Var4;
            xu91Var2 = xu91Var3;
            qim0Var3 = qim0Var111112;
        } else {
            x340Var = x340Var3;
            x340Var.b0();
            z3 = z;
            hxq0Var2 = hxq0Var;
            qim0Var3 = qim0Var2;
            pl3Var3 = pl3Var2;
            ru91Var3 = ru91Var2;
            vzq0Var3 = vzq0Var2;
            gdr0Var3 = gdr0Var2;
            iu30Var2 = iu30Var;
            d6o0Var2 = d6o0Var;
            xu91Var2 = xu91Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new njr0(jkr0Var, qim0Var3, vzq0Var3, gdr0Var3, i10, f2, pl3Var3, ru91Var3, z3, iu30Var2, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2, i3);
        }
    }

    public static mga0 d(iu30 iu30Var) {
        mfa0 mfa0Var = nfa0.d;
        tfa0 tfa0Var = new tfa0();
        vfa0 vfa0Var = mfa0Var.a;
        tfa0Var.a = vfa0Var.a;
        tfa0Var.b = vfa0Var.f;
        tfa0Var.c = vfa0Var.b;
        tfa0Var.d = vfa0Var.c;
        tfa0Var.e = vfa0Var.e;
        String str = vfa0Var.g;
        tfa0Var.f = str;
        tfa0Var.g = vfa0Var.h;
        tfa0Var.h = vfa0Var.i;
        tfa0Var.i = vfa0Var.l;
        tfa0Var.j = vfa0Var.k;
        tfa0Var.k = vfa0Var.j;
        tfa0Var.l = vfa0Var.d;
        tfa0Var.m = mfa0Var.b;
        tfa0Var.n = vfa0Var.m;
        iu30Var.invoke(tfa0Var);
        if (tfa0Var.e) {
            if (!str.equals("    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        hhg1.f("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                        return null;
                    }
                }
            }
        } else if (!str.equals("    ")) {
            hhg1.n("Indent should not be specified when default printing mode is used");
            return null;
        }
        vfa0 vfa0Var2 = new vfa0(tfa0Var.a, tfa0Var.c, tfa0Var.d, tfa0Var.l, tfa0Var.e, tfa0Var.b, tfa0Var.f, tfa0Var.g, tfa0Var.h, tfa0Var.k, tfa0Var.j, tfa0Var.i, tfa0Var.n);
        kl1 kl1Var = tfa0Var.m;
        mga0 mga0Var = new mga0(vfa0Var2, kl1Var);
        zmo1.d();
        if (kl1Var != j761.a) {
            kl1Var.n(new m980(vfa0Var2));
        }
        return mga0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0064 A[LOOP:0: B:4:0x000d->B:35:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0067 A[EDGE_INSN: B:43:0x0067->B:36:0x0067 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0064], SYNTHETIC] */
    public static final v161 e(hmb0 hmb0Var, boolean z) {
        pim0 pim0Var = (pim0) hmb0Var.e1.g;
        pim0 pim0Var2 = null;
        if ((pim0Var.d & 8) != 0) {
            loop0: while (pim0Var != null) {
                if ((pim0Var.c & 8) == 0) {
                    if ((pim0Var.d & 8) != 0) {
                        break;
                        break;
                    }
                    pim0Var = pim0Var.f;
                } else {
                    pim0 pim0VarE = pim0Var;
                    bfn0 bfn0Var = null;
                    while (pim0VarE != null) {
                        if (pim0VarE instanceof t161) {
                            pim0Var2 = pim0VarE;
                            break loop0;
                        }
                        if ((pim0VarE.c & 8) != 0 && (pim0VarE instanceof l5t)) {
                            int i = 0;
                            for (pim0 pim0Var3 = ((l5t) pim0VarE).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                if ((pim0Var3.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        pim0VarE = pim0Var3;
                                    } else {
                                        if (bfn0Var == null) {
                                            bfn0Var = new bfn0(0, new pim0[16]);
                                        }
                                        if (pim0VarE != null) {
                                            bfn0Var.b(pim0VarE);
                                            pim0VarE = null;
                                        }
                                        bfn0Var.b(pim0Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        pim0VarE = oap1.e(bfn0Var);
                    }
                    if ((pim0Var.d & 8) != 0) {
                        break;
                    }
                    pim0Var = pim0Var.f;
                }
            }
        }
        pim0Var2.getClass();
        pim0 pim0Var4 = ((t161) pim0Var2).a;
        o161 o161VarX = hmb0Var.x();
        if (o161VarX == null) {
            o161VarX = new o161();
        }
        return new v161(pim0Var4, z, hmb0Var, o161VarX);
    }

    public static final void f(jkr0 jkr0Var, qim0 qim0Var, zzq0 zzq0Var, int i, float f, nl3 nl3Var, ru91 ru91Var, boolean z, iu30 iu30Var, d6o0 d6o0Var, xu91 xu91Var, hxq0 hxq0Var, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0Var2;
        b0k b0kVar2;
        nl3 nl3Var2;
        boolean z2;
        d6o0 d6o0Var2;
        xu91 xu91Var2;
        hxq0 hxq0Var2;
        xu91 xu91Var3;
        boolean z3;
        hxq0 hxq0VarB;
        nl3 nl3Var3;
        ak20 ak20Var = ak20.S0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1590376023);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.g(jkr0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            qim0Var2 = qim0Var;
            i3 |= b0kVar3.g(qim0Var2) ? 32 : 16;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.g(zzq0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.g(ak20Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.d(f) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i4 |= b0kVar3.g(ru91Var) ? 8388608 : 4194304;
        }
        int i5 = i4 | 905969664;
        if (b0kVar3.Y(i5 & 1, (306783379 & i5) != 306783378)) {
            b0kVar3.d0();
            int i6 = i2 & 1;
            qqq0 qqq0Var = qqq0.a;
            if (i6 == 0 || b0kVar3.E()) {
                nl3 nl3Var4 = een.Q0;
                d6o0 d6o0VarL = q0o1.l(jkr0Var, qqq0Var, b0kVar3, (i5 & 14) | 432);
                xu91Var3 = zov0.g;
                z3 = true;
                hxq0VarB = jxq0.b(b0kVar3);
                nl3Var3 = nl3Var4;
                d6o0Var2 = d6o0VarL;
            } else {
                b0kVar3.b0();
                nl3Var3 = nl3Var;
                z3 = z;
                d6o0Var2 = d6o0Var;
                xu91Var3 = xu91Var;
                hxq0VarB = hxq0Var;
            }
            b0kVar3.s();
            int i7 = i5 >> 6;
            int i8 = (i5 & 896) | ((i5 >> 3) & 14) | 24576 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i7 & 458752) | (i7 & 3670016);
            int i9 = i5 << 12;
            int i10 = i8 | (i9 & 234881024) | (i9 & 1879048192);
            int i11 = i5 >> 9;
            b0kVar2 = b0kVar3;
            smo1.i(qim0Var2, jkr0Var, zzq0Var, qqq0Var, ru91Var, z3, hxq0VarB, i, f, ak20Var, d6o0Var2, iu30Var, nl3Var3, een.N0, xu91Var3, j2iVar, b0kVar2, i10, (i11 & 7168) | (i11 & 14) | 24960 | 1769472);
            nl3 nl3Var5 = nl3Var3;
            hxq0Var2 = hxq0VarB;
            nl3Var2 = nl3Var5;
            z2 = z3;
            xu91Var2 = xu91Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            nl3Var2 = nl3Var;
            z2 = z;
            d6o0Var2 = d6o0Var;
            xu91Var2 = xu91Var;
            hxq0Var2 = hxq0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qjr0(jkr0Var, qim0Var, zzq0Var, i, f, nl3Var2, ru91Var, z2, iu30Var, d6o0Var2, xu91Var2, hxq0Var2, j2iVar, i2);
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final q8n h(Scheduler scheduler) {
        return scheduler instanceof egu ? ((egu) scheduler).c : new lm41(scheduler);
    }

    public static Collection i(Object obj) {
        if ((obj instanceof ola0) && !(obj instanceof pla0)) {
            O(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            u890.y(e, w0h1.class.getName());
            throw e;
        }
    }

    public static List j(Iterable iterable) {
        if ((iterable instanceof ola0) && !(iterable instanceof qla0)) {
            O(iterable, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) iterable;
        } catch (ClassCastException e) {
            u890.y(e, w0h1.class.getName());
            throw e;
        }
    }

    public static Map k(Object obj) {
        if ((obj instanceof ola0) && !(obj instanceof sla0)) {
            O(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            u890.y(e, w0h1.class.getName());
            throw e;
        }
    }

    public static Set l(Object obj) {
        if ((obj instanceof ola0) && !(obj instanceof ama0)) {
            O(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            u890.y(e, w0h1.class.getName());
            throw e;
        }
    }

    public static final Scheduler m(q8n q8nVar) {
        return q8nVar instanceof lm41 ? ((lm41) q8nVar).c : new egu(q8nVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNullPointerException */
    public static final Object n(n8d0 n8d0Var, onm onmVar) throws Throwable {
        try {
            if (n8d0Var.isDone()) {
                return t9.i((Future) n8d0Var);
            }
            ohd ohdVar = new ohd(1, aym.t(onmVar));
            n8d0Var.b(new aih0(n8d0Var, ohdVar, false, (byte) 28), j5u.a);
            ohdVar.n(new l6d0(n8d0Var, (byte) 4));
            return ohdVar.r();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            u890.y(kotlinNullPointerException, u890.class.getName());
            throw kotlinNullPointerException;
        }
    }

    public static void o(int i, Object obj) {
        if (obj == null || y(i, obj)) {
            return;
        }
        O(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static j4u p(kkn kknVar) {
        m4u m4uVar;
        int i;
        l4u l4uVar;
        i4u i4uVar;
        int i2;
        int i3;
        m4u m4uVar2;
        m4u m4uVar3;
        int iB;
        int i4;
        int i5;
        int i6;
        int iB2;
        int i7;
        int i8;
        int iR = kknVar.r();
        int iQ = kknVar.q();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        l4u l4uVar2 = new l4u();
        int i9 = 0;
        l4uVar2.a = 0;
        l4uVar2.b = iR;
        l4uVar2.c = 0;
        l4uVar2.d = iQ;
        arrayList2.add(l4uVar2);
        int i10 = iR + iQ;
        int i11 = 1;
        int i12 = (((i10 + 1) / 2) * 2) + 1;
        h4u h4uVar = new h4u(i12, (byte) 0);
        h4u h4uVar2 = new h4u(i12, (byte) 0);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            l4u l4uVar3 = (l4u) arrayList2.remove(arrayList2.size() - i11);
            if (l4uVar3.b() >= i11 && l4uVar3.a() >= i11) {
                int iA = ((l4uVar3.a() + l4uVar3.b()) + i11) / 2;
                h4uVar.i(i11, l4uVar3.a);
                h4uVar2.i(i11, l4uVar3.b);
                int i13 = i9;
                while (true) {
                    if (i13 >= iA) {
                        m4uVar = null;
                        break;
                    }
                    int i14 = Math.abs(l4uVar3.b() - l4uVar3.a()) % 2 == i11 ? i11 : i9;
                    int iB3 = l4uVar3.b() - l4uVar3.a();
                    int i15 = -i13;
                    int i16 = i15;
                    while (true) {
                        if (i16 > i13) {
                            i2 = i9;
                            i3 = iA;
                            m4uVar2 = null;
                            break;
                        }
                        if (i16 == i15 || (i16 != i13 && h4uVar.b(i16 + 1) > h4uVar.b(i16 - 1))) {
                            iB2 = h4uVar.b(i16 + 1);
                            i7 = iB2;
                        } else {
                            iB2 = h4uVar.b(i16 - 1);
                            i7 = iB2 + 1;
                        }
                        int i17 = ((i7 - l4uVar3.a) + l4uVar3.c) - i16;
                        if (i13 != 0 && i7 == iB2) {
                            i17--;
                        }
                        int i18 = iA;
                        int i19 = i7;
                        int i20 = i17;
                        i3 = i18;
                        int i21 = i14;
                        while (i19 < l4uVar3.b && i20 < l4uVar3.d && kknVar.j(i19, i20)) {
                            i19++;
                            i20++;
                        }
                        h4uVar.i(i16, i19);
                        if (i21 != 0) {
                            int i22 = iB3 - i16;
                            i8 = iB3;
                            if (i22 >= i15 + 1 && i22 <= i13 - 1 && h4uVar2.b(i22) <= i19) {
                                m4uVar2 = new m4u();
                                m4uVar2.a = iB2;
                                m4uVar2.b = i17;
                                m4uVar2.c = i19;
                                m4uVar2.d = i20;
                                i2 = 0;
                                m4uVar2.e = false;
                                break;
                            }
                        } else {
                            i8 = iB3;
                        }
                        i16 += 2;
                        i9 = 0;
                        iA = i3;
                        i14 = i21;
                        iB3 = i8;
                    }
                    if (m4uVar2 != null) {
                        m4uVar = m4uVar2;
                        break;
                    }
                    int i23 = (l4uVar3.b() - l4uVar3.a()) % 2 == 0 ? 1 : i2;
                    int iB4 = l4uVar3.b() - l4uVar3.a();
                    int i24 = i15;
                    while (true) {
                        if (i24 > i13) {
                            m4uVar3 = null;
                            break;
                        }
                        if (i24 == i15 || (i24 != i13 && h4uVar2.b(i24 + 1) < h4uVar2.b(i24 - 1))) {
                            iB = h4uVar2.b(i24 + 1);
                            i4 = iB;
                        } else {
                            iB = h4uVar2.b(i24 - 1);
                            i4 = iB - 1;
                        }
                        int i25 = l4uVar3.d - ((l4uVar3.b - i4) - i24);
                        int i26 = (i13 == 0 || i4 != iB) ? i25 : i25 + 1;
                        int i27 = i23;
                        while (true) {
                            if (i4 > l4uVar3.a && i25 > l4uVar3.c) {
                                i5 = iB4;
                                if (!kknVar.j(i4 - 1, i25 - 1)) {
                                    break;
                                }
                                i4--;
                                i25--;
                                iB4 = i5;
                            } else {
                                i5 = iB4;
                                break;
                            }
                        }
                        h4uVar2.i(i24, i4);
                        if (i27 != 0 && (i6 = i5 - i24) >= i15 && i6 <= i13 && h4uVar.b(i6) >= i4) {
                            m4uVar3 = new m4u();
                            m4uVar3.a = i4;
                            m4uVar3.b = i25;
                            m4uVar3.c = iB;
                            m4uVar3.d = i26;
                            m4uVar3.e = true;
                            break;
                        }
                        i24 += 2;
                        i23 = i27;
                        iB4 = i5;
                    }
                    if (m4uVar3 != null) {
                        m4uVar = m4uVar3;
                        break;
                    }
                    i13++;
                    iA = i3;
                    i11 = 1;
                    i9 = 0;
                }
            } else {
                m4uVar = null;
                break;
            }
            if (m4uVar != null) {
                if (m4uVar.a() > 0) {
                    int i28 = m4uVar.d;
                    int i29 = m4uVar.b;
                    int i30 = i28 - i29;
                    int i31 = m4uVar.c;
                    int i32 = m4uVar.a;
                    int i33 = i31 - i32;
                    if (i30 == i33) {
                        i4uVar = new i4u(i32, i29, i33);
                    } else if (m4uVar.e) {
                        i4uVar = new i4u(i32, i29, m4uVar.a());
                    } else {
                        i4uVar = i30 > i33 ? new i4u(i32, i29 + 1, m4uVar.a()) : new i4u(i32 + 1, i29, m4uVar.a());
                    }
                    arrayList.add(i4uVar);
                }
                if (arrayList3.isEmpty()) {
                    l4uVar = new l4u();
                    i = 1;
                } else {
                    i = 1;
                    l4uVar = (l4u) arrayList3.remove(arrayList3.size() - 1);
                }
                l4uVar.a = l4uVar3.a;
                l4uVar.c = l4uVar3.c;
                l4uVar.b = m4uVar.a;
                l4uVar.d = m4uVar.b;
                arrayList2.add(l4uVar);
                l4uVar3.b = l4uVar3.b;
                l4uVar3.d = l4uVar3.d;
                l4uVar3.a = m4uVar.c;
                l4uVar3.c = m4uVar.d;
                arrayList2.add(l4uVar3);
            } else {
                i = 1;
                arrayList3.add(l4uVar3);
            }
            i11 = i;
            i9 = 0;
        }
        Collections.sort(arrayList, a);
        return new j4u(kknVar, arrayList, h4uVar.a(), h4uVar2.a());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method q(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        ?? r11;
        boolean z;
        int length = methodArr.length;
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            method = methodArr[i];
            if (str.equals(method.getName()) || nhc1.Y(method.getName(), str.concat("-"), z2)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z3 = z2;
                    ?? r12 = z3;
                    while (r11 < length2) {
                        Class<?> cls = parameterTypes[r11];
                        int i2 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        jd11 jd11Var = rc11.a;
                        if (jd11Var.b(cls).equals(jd11Var.b(cls2)) || cls.isAssignableFrom(cls2)) {
                            r11 = z3;
                            r11 = z3;
                            z = true;
                        } else {
                            r11 = z3;
                            z = false;
                        }
                        arrayList.add(Boolean.valueOf(z));
                        r12 = i2;
                        r11++;
                    }
                    r11 = z3;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (((Boolean) it.next()).booleanValue());
                    }
                    if (method != null) {
                        return method;
                    }
                    throw new NoSuchMethodException(str.concat(" not found"));
                }
                continue;
            }
            i++;
            z2 = false;
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static final int r(rzc rzcVar) {
        return rzcVar.a().size();
    }

    public static final qim0 s(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        zov0 zov0Var = cbx.b(b0kVar).g;
        return xcg1.k(cbx.a, i1p1.q(u291.v(nim0.a, 64.0f), oto1.l(b0kVar)));
    }

    public static zlv0 t(AppCompatTextView appCompatTextView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new zlv0(ph5.B(appCompatTextView));
        }
        w4c0 w4c0Var = new w4c0(new TextPaint(appCompatTextView.getPaint()));
        w4c0Var.I(appCompatTextView.getBreakStrategy());
        w4c0Var.J(appCompatTextView.getHyphenationFrequency());
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    textDirectionHeuristic = !z ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(ph5.p(h7p1.v(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        w4c0Var.K(textDirectionHeuristic);
        return w4c0Var.b();
    }

    public static final void u(Throwable th, o8n o8nVar) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            RxJavaPlugins.b(th);
        } catch (Throwable th2) {
            j2h1.h(th, th2);
            omo1.p(th, o8nVar);
        }
    }

    public static final boolean v(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities != null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (u890.j(activityInfo.name, "com.facebook.CustomTabActivity") && u890.j(activityInfo.packageName, context.getPackageName())) {
                    z = true;
                }
            }
            return z;
        }
        return false;
    }

    public static void w(String str, String str2, x340 x340Var, Object... objArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Method methodQ;
        Method method;
        Class<?> cls = Class.forName(str);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList();
        int length = objArrCopyOf.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArrCopyOf[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                tr80 tr80VarQ = yoi1.Q(0, iCeil);
                ArrayList arrayList2 = new ArrayList(q7h.U(tr80VarQ, 10));
                Iterator it = tr80VarQ.iterator();
                while (((sr80) it).c) {
                    ((lr80) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                c8b1 c8b1Var = new c8b1(3);
                c8b1Var.b(clsArr);
                c8b1Var.a(b0k.class);
                c8b1Var.b(clsArr2);
                methodQ = q(declaredMethods, str2, (Class[]) c8b1Var.d(new Class[c8b1Var.c()]));
            } catch (ReflectiveOperationException unused) {
                Method[] declaredMethods2 = cls.getDeclaredMethods();
                int length3 = declaredMethods2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        method = null;
                        break;
                    }
                    method = declaredMethods2[i2];
                    if (u890.j(method.getName(), str2)) {
                        break;
                    }
                    if (nhc1.Y(method.getName(), str2 + "-", false)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                methodQ = method;
            }
        } catch (ReflectiveOperationException unused2) {
            methodQ = null;
        }
        if (methodQ == null) {
            throw new NoSuchMethodException(cy30.p("Composable ", str, ".", str2, " not found"));
        }
        methodQ.setAccessible(true);
        if (Modifier.isStatic(methodQ.getModifiers())) {
            x(methodQ, null, x340Var, Arrays.copyOf(objArr, objArr.length));
        } else {
            x(methodQ, cls.getConstructor(null).newInstance(null), x340Var, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    public static void x(Method method, Object obj, x340 x340Var, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (u890.j(parameterTypes[length], b0k.class)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        int i3 = i + 1;
        int iCeil = (i != 0 ? (int) Math.ceil(((double) ((obj != null ? 1 : 0) + i)) / 10.0d) : 1) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iCeil ? (int) Math.ceil(((double) i) / 31.0d) : 0) + iCeil != length2) {
            eg.m("params don't add up to total params");
            return;
        }
        Object[] objArr2 = new Object[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            if (i4 < 0 || i4 >= i) {
                if (i4 == i) {
                    objValueOf = x340Var;
                } else if (i3 <= i4 && i4 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (iCeil > i4 || i4 >= length2) {
                        eg.m("Unexpected index");
                        return;
                    }
                    objValueOf = 2097151;
                }
            } else if (i4 < 0 || i4 >= objArr.length) {
                switch (method.getParameterTypes()[i4].getName()) {
                    case "double":
                        objValueOf = Double.valueOf(0.0d);
                        break;
                    case "int":
                        objValueOf = 0;
                        break;
                    case "byte":
                        objValueOf = (byte) 0;
                        break;
                    case "char":
                        objValueOf = (char) 0;
                        break;
                    case "long":
                        objValueOf = 0L;
                        break;
                    case "boolean":
                        objValueOf = Boolean.FALSE;
                        break;
                    case "float":
                        objValueOf = Float.valueOf(0.0f);
                        break;
                    case "short":
                        objValueOf = (short) 0;
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                objValueOf = objArr[i4];
            }
            objArr2[i4] = objValueOf;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public static boolean y(int i, Object obj) {
        int arity;
        if (obj instanceof cv30) {
            if (obj instanceof jv30) {
                arity = ((jv30) obj).getArity();
            } else if (obj instanceof Function0) {
                arity = 0;
            } else if (obj instanceof iu30) {
                arity = 1;
            } else if (obj instanceof vu30) {
                arity = 2;
            } else if (obj instanceof xu30) {
                arity = 3;
            } else if (obj instanceof zu30) {
                arity = 4;
            } else if (obj instanceof bv30) {
                arity = 5;
            } else if (obj instanceof dv30) {
                arity = 6;
            } else if (obj instanceof ev30) {
                arity = 7;
            } else if (obj instanceof fv30) {
                arity = 8;
            } else if (obj instanceof gv30) {
                arity = 9;
            } else if (obj instanceof hu30) {
                arity = 10;
            } else if (obj instanceof ju30) {
                arity = 11;
            } else if (obj instanceof ku30) {
                arity = 12;
            } else if (obj instanceof lu30) {
                arity = 13;
            } else if (obj instanceof mu30) {
                arity = 14;
            } else if (obj instanceof nu30) {
                arity = 15;
            } else if (obj instanceof ou30) {
                arity = 16;
            } else if (obj instanceof pu30) {
                arity = 17;
            } else if (obj instanceof qu30) {
                arity = 18;
            } else if (obj instanceof ru30) {
                arity = 19;
            } else if (obj instanceof tu30) {
                arity = 20;
            } else if (obj instanceof uu30) {
                arity = 21;
            } else {
                arity = obj instanceof bw30 ? 22 : -1;
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static final void z(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            qs10 qs10VarA = qs10.a();
            String[] strArr = pvl1.a;
            qs10VarA.getClass();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            String[] strArrA = pvl1.a();
            int iS = zno1.s(strArrA.length);
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (String str : strArrA) {
                mmr0 mmr0VarN = oqn1.n(new File(databasePath.getPath() + str), new File(noBackupFilesDir.getPath() + str));
                linkedHashMap.put(mmr0VarN.a, mmr0VarN.b);
            }
            for (Map.Entry entry : sqg0.P(linkedHashMap, oqn1.n(databasePath, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        qs10 qs10VarA2 = qs10.a();
                        String[] strArr2 = pvl1.a;
                        file2.toString();
                        qs10VarA2.getClass();
                    }
                    if (file.renameTo(file2)) {
                        file.toString();
                        file2.toString();
                    } else {
                        file.toString();
                        file2.toString();
                    }
                    qs10 qs10VarA3 = qs10.a();
                    String[] strArr3 = pvl1.a;
                    qs10VarA3.getClass();
                }
            }
        }
    }
}
