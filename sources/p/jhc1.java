package p;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.adsinternal.adscore.model.Format;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class jhc1 {
    public static ClassLoader a;
    public static Thread b;
    public static final fm00 c = new fm00();
    public static final int[] d = {R.attr.stateListAnimator};

    public static mc11 A(jyc jycVar, Function0 function0) {
        if (function0 != null) {
            return new mc11(jycVar, function0);
        }
        hhg1.n("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }

    public static MappedByteBuffer B(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static String C(String str) {
        return z561.d0(new sgg1(new jfa("    ", (byte) 14), ihc1.C0(str)), "\n");
    }

    public static final void D(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    public static void E(AppBarLayout appBarLayout, float f) {
        int integer = appBarLayout.getResources().getInteger(2131492869);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, 2130970303, -2130970304}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static boolean F(String str) {
        return str == null || str.isEmpty();
    }

    public static final ji0 G(ks0 ks0Var, String str) {
        a7j1 a7j1Var;
        String strF = ks0Var.f();
        String strM = l1d.m("spotify:ad:", ks0Var.f());
        String strA = ks0Var.a();
        String strB = ks0Var.b();
        xkg0 xkg0Var = new xkg0();
        xkg0Var.put("buttonMessage", ks0Var.d());
        xkg0Var.put("tagline", ks0Var.j());
        xkg0Var.put("logoImage", ks0Var.h());
        xkg0Var.put("product_name", ks0Var.i());
        xkg0 xkg0VarB = xkg0Var.b();
        List listE = ks0Var.e();
        ArrayList arrayList = new ArrayList(q7h.U(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            String strA2 = ((gs0) it.next()).a();
            if (strA2 == null) {
                strA2 = "";
            }
            arrayList.add(new gq70(p57.a(strA2)));
        }
        List<js0> listL = ks0Var.l();
        ArrayList arrayList2 = new ArrayList();
        for (js0 js0Var : listL) {
            String strB2 = js0Var.b();
            if (strB2 == null || strB2.length() == 0) {
                a7j1Var = null;
            } else {
                Integer numA = js0Var.a();
                a7j1Var = new a7j1("video/mp4", 0, 0, 0, nhc1.Y(js0Var.b(), "http", false) ? p57.a(js0Var.b()) : o57.a(js0Var.b()), Long.valueOf(numA != null ? numA.intValue() : 0L));
            }
            if (a7j1Var != null) {
                arrayList2.add(a7j1Var);
            }
        }
        fgh0 fgh0Var = new fgh0(4, arrayList, arrayList2);
        String strG = ks0Var.g();
        String strC = ks0Var.c();
        Format format = ks0Var.l().isEmpty() ? !ks0Var.e().isEmpty() ? Format.BANNER : Format.UNKNOWN : Format.VIDEO;
        Map mapK = ks0Var.k();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapK.size()));
        for (Map.Entry entry : mapK.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((ygc1) entry.getValue()).a());
        }
        return new ji0(strF, strM, strA, "", strB, 1, xkg0VarB, fgh0Var, strG, strC, str, false, false, format, false, z6x.a, "app-open", linkedHashMap, 262144);
    }

    public static final int H(ie81 ie81Var) {
        int iOrdinal = ie81Var.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 1 : 5;
        }
        return 4;
    }

    public static final int I(je81 je81Var) {
        int iOrdinal = je81Var.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 1 : 5;
        }
        return 4;
    }

    public static String J(String str) throws IOException {
        int length;
        List listD0 = ihc1.D0(str);
        List list = listD0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!ihc1.y0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!eth.H(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) o7h.G0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listD0.size();
        cix0 cix0Var = new cix0((byte) 22);
        int iL = p7h.L(listD0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            String str3 = null;
            if (length < 0) {
                p7h.T();
                throw null;
            }
            String str4 = (String) obj2;
            if (((length != 0 && length != iL) || !ihc1.y0(str4)) && (str3 = (String) cix0Var.invoke(ihc1.l0(iIntValue, str4))) == null) {
                str3 = str4;
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        o7h.x0(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String K(String str) throws IOException {
        String str2;
        if (ihc1.y0("|")) {
            hhg1.n("marginPrefix must be non-blank string.");
            return null;
        }
        List listD0 = ihc1.D0(str);
        int length = str.length();
        listD0.size();
        cix0 cix0Var = new cix0((byte) 22);
        int iL = p7h.L(listD0);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listD0) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            String str3 = (String) obj;
            if ((i == 0 || i == iL) && ihc1.y0(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!eth.H(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && str3.startsWith("|", i3)) ? str3.substring("|".length() + i3) : null;
                if (strSubstring != null && (str2 = (String) cix0Var.invoke(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        o7h.x0(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static byte L(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[Catch: all -> 0x009e, PHI: r1
      0x00a2: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v19 java.lang.Thread) binds: [B:7:0x000a, B:46:0x009a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x0098, B:61:0x00c2, B:12:0x001f, B:51:0x00a1, B:52:0x00a2, B:64:0x00c6, B:53:0x00a3, B:59:0x00c0, B:58:0x00ad, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0073, B:42:0x0083, B:43:0x0096, B:18:0x003c), top: B:78:0x0003, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader M() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        classLoader = a;
        if (classLoader == null) {
            Thread thread2 = b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = b.getContextClassLoader();
                    } catch (SecurityException e2) {
                        new StringBuilder(String.valueOf(e2.getMessage()).length() + 41);
                    }
                }
                classLoader = contextClassLoader;
                a = classLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        Thread oo21Var = new oo21(threadGroup);
                                        try {
                                            oo21Var.setContextClassLoader(null);
                                            oo21Var.start();
                                            thread = oo21Var;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = oo21Var;
                                            new StringBuilder(String.valueOf(e.getMessage()).length() + 39);
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (SecurityException e5) {
                                e = e5;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = b.getContextClassLoader();
                    }
                }
                classLoader = contextClassLoader;
                a = classLoader;
            }
        }
        return classLoader;
    }

    public static Boolean N(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(577353771);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var, (uvx) null, (max) null, false, (idn0) null, (ga80) null, smo1.C(function0), (gbx) null, zqi.a, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(2002956911, new z3y(str, (byte) 10), b0kVar3), b0kVar2, ((i2 >> 6) & 14) | 100663296, 196608, 32446);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var, i, (byte) 10);
        }
    }

    public static final qb4 b(String str) {
        return new qb4(Collections.singleton(str));
    }

    public static final long c(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0197  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x0120  */
    /* JADX WARN: Code duplicated, block: B:86:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:0x0153  */
    /* JADX WARN: Code duplicated, block: B:90:0x015d  */
    /* JADX WARN: Code duplicated, block: B:91:0x015f  */
    /* JADX WARN: Code duplicated, block: B:94:0x016a  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    public static final void d(int i, qim0 qim0Var, long j, int i2, xu30 xu30Var, j2i j2iVar, b0k b0kVar, int i3, int i4) {
        int i5;
        qim0 qim0Var2;
        long j2;
        int i6;
        int iC;
        int i7;
        int i8;
        j2i j2iVar2;
        boolean z;
        qim0 qim0Var3;
        int i9;
        xu30 xu30Var2;
        long j3;
        h311 h311VarV;
        qim0 qim0Var4;
        int i10;
        int i11;
        xu30 xu30VarR;
        qim0 qim0Var5;
        es41 es41VarC;
        Object objT;
        Object obj;
        c9n c9nVar;
        pxg1 pxg1VarP;
        boolean zG;
        Object objT2;
        dt41 dt41Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objT3;
        int i12;
        int i13;
        int i14;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-514993535);
        if ((i3 & 6) == 0) {
            i5 = (x340Var.e(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 == 0) {
            if ((i3 & 48) == 0) {
                qim0Var2 = qim0Var;
                i5 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                j2 = j;
                if ((i4 & 4) == 0 || !x340Var.f(j2)) {
                    i14 = 128;
                } else {
                    i14 = 256;
                }
                i5 |= i14;
            } else {
                j2 = j;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                if (i2 == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i2);
                }
                if (x340Var.e(iC)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            i8 = i5 | 24576;
            if ((196608 & i3) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i8 |= i13;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((74899 & i8) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i8 & 1, z)) {
                x340Var.d0();
                if ((i3 & 1) != 0 || x340Var.E()) {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 4) != 0) {
                        uwr uwrVar = cbx.a;
                        j2 = cbx.a(x340Var).a.c;
                        i8 &= -897;
                    }
                    if (i6 != 0) {
                        i10 = 1;
                    } else {
                        i10 = i2;
                    }
                    i11 = i10;
                    xu30VarR = apo.r(-334366650, new vxx((byte) 0, i, i10), x340Var);
                    qim0Var5 = qim0Var4;
                } else {
                    x340Var.b0();
                    if ((i4 & 4) != 0) {
                        i8 &= -897;
                    }
                    i11 = i2;
                    qim0Var5 = qim0Var2;
                    xu30VarR = xu30Var;
                }
                x340Var.s();
                uwr uwrVar2 = cbx.a;
                mta mtaVar = cbx.b(x340Var).d;
                es41VarC = l6o1.C(0, 0, 1, x340Var);
                objT = x340Var.T();
                obj = fkj0.X;
                if (objT == obj) {
                    objT = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT);
                }
                c9nVar = (c9n) objT;
                pxg1VarP = p(x340Var);
                zG = x340Var.g(es41VarC) | x340Var.g(c9nVar);
                objT2 = x340Var.T();
                if (zG || objT2 == obj) {
                    objT2 = new dt41(es41VarC, c9nVar, pxg1VarP);
                    x340Var.s0(objT2);
                }
                dt41Var = (dt41) objT2;
                qim0 qim0VarF = nho1.F(crm0.v(l6o1.t(u291.B(u291.f(qim0Var5, 1.0f), een.g, 2), es41VarC, 14), es41VarC, 48.0f, j2));
                boolean zD = x340Var.d(48.0f);
                if ((458752 & i8) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = z2 | zD;
                if ((57344 & i8) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean zI = z6 | z3 | x340Var.i(dt41Var);
                if ((i8 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zI | z4;
                objT3 = x340Var.T();
                if (!z5 || objT3 == obj) {
                    j2i j2iVar3 = j2iVar2;
                    i12 = 0;
                    f61 f61Var = new f61(48.0f, j2iVar3, dt41Var, i, xu30VarR);
                    x340Var.s0(f61Var);
                    objT3 = f61Var;
                } else {
                    i12 = 0;
                }
                ejo1.l(i12, i12, x340Var, (vu30) objT3, qim0VarF);
                qim0Var3 = qim0Var5;
                xu30Var2 = xu30VarR;
                i9 = i11;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                i9 = i2;
                xu30Var2 = xu30Var;
            }
            j3 = j2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wxx(i, qim0Var3, j3, i9, xu30Var2, j2iVar, i3, i4);
            }
        }
        i5 |= 48;
        qim0Var2 = qim0Var;
        if ((i3 & 384) == 0) {
            j2 = j;
            if ((i4 & 4) == 0) {
                i14 = 128;
            } else {
                i14 = 128;
            }
            i5 |= i14;
        } else {
            j2 = j;
        }
        i6 = i4 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            if (i2 == 0) {
                iC = -1;
            } else {
                iC = l1d.C(i2);
            }
            if (x340Var.e(iC)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i5 |= i7;
        }
        i8 = i5 | 24576;
        if ((196608 & i3) == 0) {
            j2iVar2 = j2iVar;
            if (x340Var.i(j2iVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i8 |= i13;
        } else {
            j2iVar2 = j2iVar;
        }
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i8 & 1, z)) {
            x340Var.d0();
            if ((i3 & 1) != 0) {
                if (i15 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i4 & 4) != 0) {
                    uwr uwrVar3 = cbx.a;
                    j2 = cbx.a(x340Var).a.c;
                    i8 &= -897;
                }
                if (i6 != 0) {
                    i10 = 1;
                } else {
                    i10 = i2;
                }
                i11 = i10;
                xu30VarR = apo.r(-334366650, new vxx((byte) 0, i, i10), x340Var);
                qim0Var5 = qim0Var4;
            } else {
                if (i15 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i4 & 4) != 0) {
                    uwr uwrVar4 = cbx.a;
                    j2 = cbx.a(x340Var).a.c;
                    i8 &= -897;
                }
                if (i6 != 0) {
                    i10 = 1;
                } else {
                    i10 = i2;
                }
                i11 = i10;
                xu30VarR = apo.r(-334366650, new vxx((byte) 0, i, i10), x340Var);
                qim0Var5 = qim0Var4;
            }
            x340Var.s();
            uwr uwrVar5 = cbx.a;
            mta mtaVar2 = cbx.b(x340Var).d;
            es41VarC = l6o1.C(0, 0, 1, x340Var);
            objT = x340Var.T();
            obj = fkj0.X;
            if (objT == obj) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9nVar = (c9n) objT;
            pxg1VarP = p(x340Var);
            zG = x340Var.g(es41VarC) | x340Var.g(c9nVar);
            objT2 = x340Var.T();
            if (zG) {
                objT2 = new dt41(es41VarC, c9nVar, pxg1VarP);
                x340Var.s0(objT2);
            } else {
                objT2 = new dt41(es41VarC, c9nVar, pxg1VarP);
                x340Var.s0(objT2);
            }
            dt41Var = (dt41) objT2;
            qim0 qim0VarF2 = nho1.F(crm0.v(l6o1.t(u291.B(u291.f(qim0Var5, 1.0f), een.g, 2), es41VarC, 14), es41VarC, 48.0f, j2));
            boolean zD2 = x340Var.d(48.0f);
            if ((458752 & i8) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z7 = z2 | zD2;
            if ((57344 & i8) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zI2 = z7 | z3 | x340Var.i(dt41Var);
            if ((i8 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = zI2 | z4;
            objT3 = x340Var.T();
            if (z5) {
                j2i j2iVar4 = j2iVar2;
                i12 = 0;
                f61 f61Var2 = new f61(48.0f, j2iVar4, dt41Var, i, xu30VarR);
                x340Var.s0(f61Var2);
                objT3 = f61Var2;
            } else {
                j2i j2iVar5 = j2iVar2;
                i12 = 0;
                f61 f61Var3 = new f61(48.0f, j2iVar5, dt41Var, i, xu30VarR);
                x340Var.s0(f61Var3);
                objT3 = f61Var3;
            }
            ejo1.l(i12, i12, x340Var, (vu30) objT3, qim0VarF2);
            qim0Var3 = qim0Var5;
            xu30Var2 = xu30VarR;
            i9 = i11;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            i9 = i2;
            xu30Var2 = xu30Var;
        }
        j3 = j2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wxx(i, qim0Var3, j3, i9, xu30Var2, j2iVar, i3, i4);
        }
    }

    public static final void e(jqi0 jqi0Var, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(537354487);
        int i2 = i | (x340Var.g(jqi0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            j2i j2iVarR = apo.r(910834398, new cy00(jqi0Var, iu30Var, iu30Var2, (byte) 10), x340Var);
            qim0Var2 = nim0.a;
            irn1.u(qim0Var2, (vu30) null, (vu30) null, (erl1) null, j2iVarR, x340Var, 24582, 14);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(jqi0Var, iu30Var, iu30Var2, qim0Var2, i, (byte) 25);
        }
    }

    public static j420 f(s8s0 s8s0Var, i520 i520Var, String str, lf01 lf01Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            lf01Var = null;
        }
        return new j420(s8s0Var, i520Var, str, lf01Var);
    }

    public static qka1 g(gbc gbcVar, i520 i520Var) {
        return new qka1(gbcVar, i520Var, (m5n1) null);
    }

    public static final void h(dji0 dji0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1518472433);
        int i2 = i | (b0kVar3.g(dji0Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var, (uvx) null, (max) null, false, (idn0) null, (ga80) null, smo1.C(function0), (gbx) null, apo.r(-2004325819, new ph50(dji0Var, (byte) 0), b0kVar3), (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1889320779, new ph50(dji0Var, (byte) 1), b0kVar3), b0kVar2, ((i2 >> 6) & 14) | 100663296, 196608, 32446);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00(dji0Var, function0, qim0Var, i, (byte) 26);
        }
    }

    public static final void i(gon0 gon0Var, Object obj, qim0 qim0Var, tl3 tl3Var, Map map, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, iu30 iu30Var5, b0k b0kVar, int i) {
        int i2;
        Map map2;
        tl3 tl3Var2;
        qim0 qim0Var2;
        iu30 iu30Var6;
        iu30 iu30Var7;
        iu30 iu30Var8;
        iu30 iu30Var9;
        x340 x340Var;
        Map map3;
        qim0 qim0Var3;
        tl3 tl3Var3;
        iu30 iu30Var10;
        iu30 iu30Var11;
        iu30 iu30Var12;
        iu30 iu30Var13;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1476019057);
        int i3 = i | (x340Var2.i(gon0Var) ? 4 : 2) | 316370304;
        int i4 = (x340Var2.i(iu30Var5) ? ' ' : (char) 16) | 6;
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && x340Var2.H()) {
            x340Var2.b0();
            qim0Var3 = qim0Var;
            tl3Var3 = tl3Var;
            map3 = map;
            iu30Var10 = iu30Var;
            iu30Var11 = iu30Var2;
            iu30Var12 = iu30Var3;
            iu30Var13 = iu30Var4;
            x340Var = x340Var2;
        } else {
            x340Var2.d0();
            if ((i & 1) == 0 || x340Var2.E()) {
                tl3 tl3Var4 = een.d;
                iu30 iu30Var14 = sbn0.W0;
                iu30 iu30Var15 = sbn0.X0;
                i2 = i3 & (-2113929217);
                qim0 qim0Var4 = nim0.a;
                map2 = b7x.a;
                tl3Var2 = tl3Var4;
                qim0Var2 = qim0Var4;
                iu30Var6 = iu30Var14;
                iu30Var7 = iu30Var6;
                iu30Var8 = iu30Var15;
                iu30Var9 = iu30Var8;
            } else {
                x340Var2.b0();
                i2 = i3 & (-2113929217);
                qim0Var2 = qim0Var;
                tl3Var2 = tl3Var;
                map2 = map;
                iu30Var6 = iu30Var;
                iu30Var8 = iu30Var2;
                iu30Var7 = iu30Var3;
                iu30Var9 = iu30Var4;
            }
            x340Var2.s();
            boolean zG = ((i4 & 112) == 32) | x340Var2.g((Object) null) | x340Var2.g(obj);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                eon0 eon0Var = new eon0(gon0Var.k(), obj, map2);
                iu30Var5.invoke(eon0Var);
                objT = eon0Var.c();
                x340Var2.s0(objT);
            }
            x340Var = x340Var2;
            k(gon0Var, (don0) objT, qim0Var2, tl3Var2, iu30Var6, iu30Var8, iu30Var7, iu30Var9, x340Var, (i2 & 8078) | 100884480);
            map3 = map2;
            qim0Var3 = qim0Var2;
            tl3Var3 = tl3Var2;
            iu30Var10 = iu30Var6;
            iu30Var11 = iu30Var8;
            iu30Var12 = iu30Var7;
            iu30Var13 = iu30Var9;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hon0(gon0Var, obj, qim0Var3, tl3Var3, map3, iu30Var10, iu30Var11, iu30Var12, iu30Var13, iu30Var5, i);
        }
    }

    public static final void j(gon0 gon0Var, String str, qim0 qim0Var, tl3 tl3Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, iu30 iu30Var5, b0k b0kVar, int i) {
        int i2;
        tl3 tl3Var2;
        iu30 iu30Var6;
        iu30 iu30Var7;
        iu30 iu30Var8;
        iu30 iu30Var9;
        x340 x340Var;
        tl3 tl3Var3;
        iu30 iu30Var10;
        iu30 iu30Var11;
        iu30 iu30Var12;
        iu30 iu30Var13;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1840250294);
        int i3 = i | (x340Var2.i(gon0Var) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.g(qim0Var) ? 256 : 128) | 844852224;
        char c2 = x340Var2.i(iu30Var5) ? (char) 4 : (char) 2;
        if ((306783379 & i3) == 306783378 && (c2 & 3) == 2 && x340Var2.H()) {
            x340Var2.b0();
            tl3Var3 = tl3Var;
            iu30Var10 = iu30Var;
            iu30Var11 = iu30Var2;
            iu30Var12 = iu30Var3;
            iu30Var13 = iu30Var4;
            x340Var = x340Var2;
        } else {
            x340Var2.d0();
            if ((i & 1) == 0 || x340Var2.E()) {
                i2 = i3 & (-264241153);
                tl3Var2 = een.d;
                iu30Var6 = sbn0.Z0;
                iu30Var7 = iu30Var6;
                iu30Var8 = sbn0.a1;
                iu30Var9 = iu30Var8;
            } else {
                x340Var2.b0();
                i2 = i3 & (-264241153);
                tl3Var2 = tl3Var;
                iu30Var6 = iu30Var;
                iu30Var8 = iu30Var2;
                iu30Var7 = iu30Var3;
                iu30Var9 = iu30Var4;
            }
            x340Var2.s();
            boolean z = ((i2 & 112) == 32) | ((c2 & 14) == 4);
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                eon0 eon0Var = new eon0(gon0Var.k(), str);
                iu30Var5.invoke(eon0Var);
                objT = eon0Var.c();
                x340Var2.s0(objT);
            }
            x340Var = x340Var2;
            k(gon0Var, (don0) objT, qim0Var, tl3Var2, iu30Var6, iu30Var8, iu30Var7, iu30Var9, x340Var, (i2 & 8078) | 100884480);
            tl3Var3 = tl3Var2;
            iu30Var10 = iu30Var6;
            iu30Var11 = iu30Var8;
            iu30Var12 = iu30Var7;
            iu30Var13 = iu30Var9;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(gon0Var, str, qim0Var, tl3Var3, iu30Var10, iu30Var11, iu30Var12, iu30Var13, iu30Var5, i);
        }
    }

    public static final void k(gon0 gon0Var, don0 don0Var, qim0 qim0Var, tl3 tl3Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, b0k b0kVar, int i) {
        int i2;
        don0 don0Var2;
        qim0 qim0Var2;
        tl3 tl3Var2;
        iu30 iu30Var5;
        iu30 iu30Var6;
        uvj uvjVar;
        ven0 ven0Var;
        e3u e3uVar;
        boolean z;
        boolean z2;
        int i3;
        mhg1 mhg1Var;
        Map map;
        uvj uvjVar2;
        ven0 ven0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1964664536);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(gon0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            don0Var2 = don0Var;
            i2 |= x340Var.i(don0Var2) ? 32 : 16;
        } else {
            don0Var2 = don0Var;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            tl3Var2 = tl3Var;
            i2 |= x340Var.g(tl3Var2) ? 2048 : 1024;
        } else {
            tl3Var2 = tl3Var;
        }
        if ((i & 24576) == 0) {
            iu30Var5 = iu30Var;
            i2 |= x340Var.i(iu30Var5) ? 16384 : 8192;
        } else {
            iu30Var5 = iu30Var;
        }
        if ((196608 & i) == 0) {
            iu30Var6 = iu30Var2;
            i2 |= x340Var.i(iu30Var6) ? 131072 : 65536;
        } else {
            iu30Var6 = iu30Var2;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var.i(iu30Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var.i(iu30Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= x340Var.i((Object) null) ? 67108864 : 33554432;
        }
        if ((i2 & 38347923) == 38347922 && x340Var.H()) {
            x340Var.b0();
        } else {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            sck1 sck1VarA = ahe0.a(x340Var);
            if (sck1VarA == null) {
                eg.m("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            gon0Var.E(sck1VarA.o());
            gon0Var.B(don0Var);
            uvj uvjVarB = gon0Var.k().b("composable");
            uvj uvjVar3 = uvjVarB instanceof uvj ? uvjVarB : null;
            if (uvjVar3 == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mon0(gon0Var, don0Var2, qim0Var2, tl3Var2, iu30Var5, iu30Var6, iu30Var3, iu30Var4, i, (byte) 1);
                    return;
                }
                return;
            }
            ven0 ven0VarJ = xto.j(uvjVar3.k(), x340Var);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = exd0.u(0.0f);
                x340Var.s0(objT);
            }
            drr0 drr0Var = (drr0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = xto.t(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var3 = (ven0) objT2;
            boolean z3 = ((List) ven0VarJ.getValue()).size() > 1;
            boolean zG = x340Var.g(ven0VarJ) | x340Var.g(uvjVar3);
            Object objT3 = x340Var.T();
            if (zG || objT3 == obj) {
                uvj uvjVar4 = uvjVar3;
                objT3 = new ary(uvjVar4, drr0Var, ven0VarJ, ven0Var3, (lnm) null, (byte) 23);
                uvjVar = uvjVar4;
                ven0Var = ven0VarJ;
                x340Var.s0(objT3);
            } else {
                uvj uvjVar5 = uvjVar3;
                ven0Var = ven0VarJ;
                uvjVar = uvjVar5;
            }
            si1.h(z3, (vu30) objT3, x340Var, 0);
            boolean zI = x340Var.i(gon0Var) | x340Var.i(iac0Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == obj) {
                objT4 = new j9n0(gon0Var, iac0Var, (byte) 7);
                x340Var.s0(objT4);
            }
            qxd0.i(iac0Var, (iu30) objT4, x340Var);
            ld41 ld41VarG = sgc1.G(x340Var);
            ven0 ven0VarJ2 = xto.j(gon0Var.n(), x340Var);
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = xto.l(new u6j0((Object) ven0VarJ2, (byte) 5));
                x340Var.s0(objT5);
            }
            tob1 tob1Var = (tob1) objT5;
            hnn0 hnn0Var = (hnn0) o7h.C0((List) tob1Var.getValue());
            Object objT6 = x340Var.T();
            if (objT6 == obj) {
                objT6 = new LinkedHashMap();
                x340Var.s0(objT6);
            }
            Map map2 = (Map) objT6;
            x340Var.i0(653353748);
            if (hnn0Var != null) {
                boolean zG2 = x340Var.g(uvjVar) | ((((3670016 & i2) ^ 1572864) > 1048576 && x340Var.g(iu30Var3)) || (i2 & 1572864) == 1048576) | ((57344 & i2) == 16384);
                Object objT7 = x340Var.T();
                if (zG2 || objT7 == obj) {
                    z2 = true;
                    i3 = i2;
                    non0 non0Var = new non0(uvjVar, iu30Var3, iu30Var, ven0Var3, (byte) 0);
                    x340Var.s0(non0Var);
                    objT7 = non0Var;
                } else {
                    i3 = i2;
                    z2 = true;
                }
                iu30 iu30Var7 = (iu30) objT7;
                boolean zG3 = x340Var.g(uvjVar) | (((((29360128 & i3) ^ 12582912) <= 8388608 || !x340Var.g(iu30Var4)) && (i3 & 12582912) != 8388608) ? false : z2) | ((458752 & i3) == 131072 ? z2 : false);
                Object objT8 = x340Var.T();
                if (zG3 || objT8 == obj) {
                    non0 non0Var2 = new non0(uvjVar, iu30Var4, iu30Var2, ven0Var3, (byte) 1);
                    x340Var.s0(non0Var2);
                    objT8 = non0Var2;
                }
                iu30 iu30Var8 = (iu30) objT8;
                boolean z4 = (234881024 & i3) == 67108864 ? z2 : false;
                Object objT9 = x340Var.T();
                if (z4 || objT9 == obj) {
                    objT9 = new nrj0((byte) 17);
                    x340Var.s0(objT9);
                }
                iu30 iu30Var9 = (iu30) objT9;
                Boolean bool = Boolean.TRUE;
                boolean zG4 = x340Var.g(uvjVar);
                Object objT10 = x340Var.T();
                if (zG4 || objT10 == obj) {
                    objT10 = new j9n0(tob1Var, uvjVar, (byte) 8);
                    x340Var.s0(objT10);
                }
                qxd0.i(bool, (iu30) objT10, x340Var);
                Object objT11 = x340Var.T();
                if (objT11 == obj) {
                    objT11 = new jo51(hnn0Var);
                    x340Var.s0(objT11);
                }
                jo51 jo51Var = (jo51) objT11;
                mhg1 mhg1VarU = bno1.u(jo51Var, "entry", x340Var, 56, 0);
                if (((Boolean) ven0Var3.getValue()).booleanValue()) {
                    x340Var.i0(-1218592968);
                    Float fValueOf = Float.valueOf(drr0Var.s());
                    boolean zG5 = x340Var.g(ven0Var) | x340Var.i(jo51Var);
                    Object objT12 = x340Var.T();
                    if (zG5 || objT12 == obj) {
                        e3uVar = null;
                        objT12 = new wkk0(jo51Var, ven0Var, drr0Var, (lnm) null, (byte) 17);
                        x340Var.s0(objT12);
                    } else {
                        e3uVar = null;
                    }
                    qxd0.t(fValueOf, x340Var, (vu30) objT12);
                    x340Var.r(false);
                    mhg1Var = mhg1VarU;
                } else {
                    e3uVar = null;
                    x340Var.i0(-1218337931);
                    boolean zI2 = x340Var.i(jo51Var) | x340Var.i(hnn0Var) | x340Var.g(mhg1VarU);
                    Object objT13 = x340Var.T();
                    if (zI2 || objT13 == obj) {
                        mhg1Var = mhg1VarU;
                        objT13 = new k1e0(jo51Var, hnn0Var, mhg1Var, (lnm) null, (byte) 14);
                        x340Var.s0(objT13);
                    } else {
                        mhg1Var = mhg1VarU;
                    }
                    qxd0.t(hnn0Var, x340Var, (vu30) objT13);
                    x340Var.r(false);
                }
                boolean zI3 = x340Var.i(map2) | x340Var.g(uvjVar) | x340Var.g(iu30Var7) | x340Var.g(iu30Var8) | x340Var.g(iu30Var9);
                Object objT14 = x340Var.T();
                if (zI3 || objT14 == obj) {
                    uvj uvjVar6 = uvjVar;
                    objT14 = new kon0(map2, uvjVar6, iu30Var7, iu30Var8, iu30Var9, tob1Var, ven0Var3);
                    map = map2;
                    uvjVar2 = uvjVar6;
                    ven0Var2 = ven0Var3;
                    x340Var.s0(objT14);
                } else {
                    uvjVar2 = uvjVar;
                    map = map2;
                    ven0Var2 = ven0Var3;
                }
                mhg1 mhg1Var2 = mhg1Var;
                hm5.b(mhg1Var2, qim0Var, (iu30) objT14, tl3Var, sbn0.Y0, apo.r(820763100, new lon0(ld41VarG, ven0Var2, tob1Var), x340Var), x340Var, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                Object objP0 = mhg1Var2.a.P0();
                Object value = mhg1Var2.d.getValue();
                boolean zG6 = x340Var.g(mhg1Var2) | x340Var.g(uvjVar2) | x340Var.i(map);
                Object objT15 = x340Var.T();
                if (zG6 || objT15 == obj) {
                    objT15 = new c6h0(mhg1Var2, map, tob1Var, uvjVar2, (lnm) null, (byte) 6);
                    x340Var.s0(objT15);
                }
                qxd0.s(objP0, value, (vu30) objT15, x340Var);
                z = false;
            } else {
                e3uVar = null;
                z = false;
            }
            x340Var.r(z);
            e3u e3uVarB = gon0Var.k().b("dialog");
            e3u e3uVar2 = e3uVarB instanceof e3u ? e3uVarB : e3uVar;
            if (e3uVar2 == null) {
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new mon0(gon0Var, don0Var, qim0Var, tl3Var, iu30Var, iu30Var2, iu30Var3, iu30Var4, i, (byte) 2);
                    return;
                }
                return;
            }
            cwl1.a(e3uVar2, x340Var, 0);
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new mon0(gon0Var, don0Var, qim0Var, tl3Var, iu30Var, iu30Var2, iu30Var3, iu30Var4, i, (byte) 0);
        }
    }

    public static void l(Appendable appendable, Object obj, iu30 iu30Var) throws IOException {
        if (iu30Var != null) {
            appendable.append((CharSequence) iu30Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0290  */
    /* JADX WARN: Code duplicated, block: B:207:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:209:0x02db  */
    /* JADX WARN: Code duplicated, block: B:211:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:213:0x0302  */
    /* JADX WARN: Code duplicated, block: B:236:0x0370  */
    /* JADX WARN: Code duplicated, block: B:238:0x038a  */
    /* JADX WARN: Code duplicated, block: B:240:0x038f  */
    /* JADX WARN: Code duplicated, block: B:244:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:254:0x0420  */
    /* JADX WARN: Code duplicated, block: B:410:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:413:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:414:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:417:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:418:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:420:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:422:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:425:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:427:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x06f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v33, types: [int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v40 */
    public static void m(djl djlVar, yic0 yic0Var, ArrayList arrayList, int i) {
        int i2;
        tbe[] tbeVarArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        cjl cjlVar;
        yic0 yic0Var2;
        cjl cjlVar2;
        p6a1 p6a1Var;
        lhl lhlVar;
        p6a1 p6a1Var2;
        cjl cjlVar3;
        int i6;
        lhl[] lhlVarArr;
        lhl lhlVar2;
        p6a1 p6a1Var3;
        int i7;
        lhl[] lhlVarArr2;
        int i8;
        lhl lhlVar3;
        lhl lhlVar4;
        p6a1 p6a1Var4;
        lhl lhlVar5;
        p6a1 p6a1Var5;
        int size;
        ArrayList arrayList2;
        float f;
        float f2;
        float f3;
        p6a1 p6a1Var6;
        p6a1 p6a1Var7;
        p6a1 p6a1Var8;
        p6a1 p6a1Var9;
        c46 c46VarL;
        float f4;
        lhl lhlVar6;
        cjl cjlVar4;
        int i9;
        ?? r4;
        int i10;
        ?? r28;
        cjl cjlVar5;
        float f5;
        ?? r29;
        djl djlVar2 = djlVar;
        if (i == 0) {
            i2 = djlVar2.D0;
            tbeVarArr = djlVar2.G0;
            i3 = 0;
        } else {
            i2 = djlVar2.E0;
            tbeVarArr = djlVar2.F0;
            i3 = 2;
        }
        int i11 = i2;
        tbe[] tbeVarArr2 = tbeVarArr;
        int i12 = 0;
        while (i12 < i11) {
            tbe tbeVar = tbeVarArr2[i12];
            boolean z4 = tbeVar.q;
            cjl cjlVar6 = tbeVar.a;
            lhl[] lhlVarArr3 = cjlVar6.R;
            bjl bjlVar = bjl.c;
            int i13 = 8;
            float f6 = 0.0f;
            if (z4) {
                i4 = i12;
            } else {
                boolean z5 = tbeVar.l;
                int i14 = (z5 ? 1 : 0) * 2;
                cjl cjlVar7 = cjlVar6;
                cjl cjlVar8 = cjlVar7;
                boolean z6 = false;
                while (!z6) {
                    tbeVar.i++;
                    cjl[] cjlVarArr = cjlVar7.p0;
                    lhl[] lhlVarArr4 = cjlVar7.R;
                    cjlVarArr[r4] = null;
                    cjlVar7.o0[r4] = null;
                    if (cjlVar7.i0 != i13) {
                        cjlVar7.l((int) r4);
                        lhlVarArr4[i14].e();
                        int i15 = i14 + 1;
                        lhlVarArr4[i15].e();
                        lhlVarArr4[i14].e();
                        lhlVarArr4[i15].e();
                        if (tbeVar.b == null) {
                            r4 = z5;
                            tbeVar.b = cjlVar7;
                        }
                        r4 = z5;
                        tbeVar.d = cjlVar7;
                        bjl bjlVar2 = cjlVar7.U[r4];
                        if (bjlVar2 == bjlVar) {
                            int i16 = cjlVar7.u[r4];
                            i10 = i12;
                            if (i16 == 0 || i16 == 3 || i16 == 2) {
                                tbeVar.j++;
                                float f7 = cjlVar7.n0[r4];
                                if (f7 > 0.0f) {
                                    f5 = f7;
                                    tbeVar.k += f5;
                                } else {
                                    f5 = f7;
                                }
                                ?? r210 = r4;
                                if (cjlVar7.i0 != 8 && bjlVar2 == bjlVar && (i16 == 0 || i16 == 3)) {
                                    if (f5 < 0.0f) {
                                        tbeVar.n = true;
                                    } else {
                                        tbeVar.o = true;
                                    }
                                    ArrayList arrayList3 = tbeVar.h;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        tbeVar.h = arrayList3;
                                    }
                                    arrayList3.add(cjlVar7);
                                }
                                if (tbeVar.f == null) {
                                    tbeVar.f = cjlVar7;
                                }
                                cjl cjlVar9 = tbeVar.g;
                                if (cjlVar9 != null) {
                                    cjlVar9.o0[r210 == true ? 1 : 0] = cjlVar7;
                                }
                                tbeVar.g = cjlVar7;
                                r29 = r210;
                            } else {
                                r29 = r4;
                            }
                            if (r29 == 0) {
                                if (cjlVar7.s == 0 && cjlVar7.v == 0) {
                                    r28 = r29;
                                    r28 = r29;
                                    int i17 = cjlVar7.w;
                                    r28 = r29;
                                }
                            } else if (cjlVar7.t == 0 && cjlVar7.y == 0) {
                                r28 = r29;
                                r28 = r29;
                                int i18 = cjlVar7.z;
                                r28 = r29;
                            }
                        } else {
                            r4 = z5;
                            i10 = i12;
                            r28 = r4;
                        }
                    } else {
                        r4 = z5;
                        i10 = i12;
                        r28 = r4;
                    }
                    r28 = r29;
                    r28 = r29;
                    r28 = r29;
                    r28 = r29;
                    r28 = r29;
                    r28 = r29;
                    cjl cjlVar10 = cjlVar8;
                    if (cjlVar10 != cjlVar7) {
                        cjlVar10.p0[r28] = cjlVar7;
                    }
                    lhl lhlVar7 = lhlVarArr4[i14 + 1].f;
                    if (lhlVar7 != null) {
                        cjlVar5 = lhlVar7.d;
                        lhl lhlVar8 = cjlVar5.R[i14].f;
                        if (lhlVar8 == null || lhlVar8.d != cjlVar7) {
                            cjlVar5 = null;
                        }
                    } else {
                        cjlVar5 = null;
                    }
                    if (cjlVar5 == null) {
                        cjlVar5 = cjlVar7;
                        z6 = true;
                    }
                    cjlVar8 = cjlVar7;
                    r4 = r28;
                    i13 = 8;
                    cjlVar7 = cjlVar5;
                    i12 = i10;
                }
                r4 = z5;
                i4 = i12;
                ?? r211 = r4;
                cjl cjlVar11 = tbeVar.b;
                if (cjlVar11 != null) {
                    cjlVar11.R[i14].e();
                }
                cjl cjlVar12 = tbeVar.d;
                if (cjlVar12 != null) {
                    cjlVar12.R[i14 + 1].e();
                }
                tbeVar.c = cjlVar7;
                if (r211 == 0 && tbeVar.m) {
                    tbeVar.e = cjlVar7;
                } else {
                    tbeVar.e = cjlVar6;
                }
                tbeVar.p = tbeVar.o && tbeVar.n;
            }
            tbeVar.q = true;
            if (arrayList == 0 || arrayList.contains(cjlVar6)) {
                cjl cjlVar13 = tbeVar.c;
                cjl cjlVar14 = tbeVar.b;
                cjl cjlVar15 = tbeVar.d;
                cjl cjlVar16 = tbeVar.e;
                float f8 = tbeVar.k;
                bjl[] bjlVarArr = ((cjl) djlVar2).U;
                lhl[] lhlVarArr5 = lhlVarArr3;
                lhl[] lhlVarArr6 = ((cjl) djlVar2).R;
                boolean z7 = bjlVarArr[i] == bjl.b;
                if (i == 0) {
                    int i19 = cjlVar16.l0;
                    boolean z8 = i19 == 0;
                    z2 = i19 == 1;
                    z3 = i19 == 2;
                    z = z8;
                } else {
                    int i20 = cjlVar16.m0;
                    z = i20 == 0;
                    z2 = i20 == 1;
                    z3 = i20 == 2;
                }
                boolean z9 = z2;
                boolean z10 = false;
                while (!z10) {
                    lhl[] lhlVarArr7 = cjlVar6.R;
                    lhl lhlVar9 = lhlVarArr7[i3];
                    int i21 = z3 ? 1 : 4;
                    int iE = lhlVar9.e();
                    boolean z11 = z3;
                    boolean z12 = cjlVar6.U[i] == bjlVar && cjlVar6.u[i] == 0;
                    lhl lhlVar10 = lhlVar9.f;
                    if (lhlVar10 != null && cjlVar6 != cjlVar6) {
                        iE = lhlVar10.e() + iE;
                    }
                    int i22 = iE;
                    if (z11 && cjlVar6 != cjlVar6 && cjlVar6 != cjlVar14) {
                        i21 = 8;
                    }
                    cjl cjlVar17 = cjlVar6;
                    lhl lhlVar11 = lhlVar9.f;
                    if (lhlVar11 != null) {
                        p6a1 p6a1Var10 = lhlVar9.i;
                        p6a1 p6a1Var11 = lhlVar11.i;
                        if (cjlVar6 == cjlVar14) {
                            yic0Var.f(p6a1Var10, p6a1Var11, i22, 6);
                        } else {
                            yic0Var.f(p6a1Var10, p6a1Var11, i22, 8);
                        }
                        if (z12 && !z11) {
                            i21 = 5;
                        }
                        yic0Var.e(lhlVar9.i, lhlVar9.f.i, i22, (cjlVar6 == cjlVar14 && z11 && cjlVar6.T[i]) ? 5 : i21);
                    } else {
                        i11 = i11;
                    }
                    if (z7) {
                        if (cjlVar6.i0 == 8 || cjlVar6.U[i] != bjlVar) {
                            i9 = 0;
                        } else {
                            i9 = 0;
                            yic0Var.f(lhlVarArr7[i3 + 1].i, lhlVarArr7[i3].i, 0, 5);
                        }
                        yic0Var.f(lhlVarArr7[i3].i, lhlVarArr6[i3].i, i9, 8);
                    }
                    lhl lhlVar12 = lhlVarArr7[i3 + 1].f;
                    if (lhlVar12 != null) {
                        cjlVar4 = lhlVar12.d;
                        lhl lhlVar13 = cjlVar4.R[i3].f;
                        if (lhlVar13 == null || lhlVar13.d != cjlVar6) {
                            cjlVar4 = null;
                        }
                    } else {
                        cjlVar4 = null;
                    }
                    if (cjlVar4 != null) {
                        cjlVar6 = cjlVar4;
                    } else {
                        z10 = true;
                    }
                    cjlVar6 = cjlVar17;
                    z3 = z11;
                    i11 = i11;
                }
                boolean z13 = z3;
                i5 = i11;
                if (cjlVar15 != null) {
                    int i23 = i3 + 1;
                    if (cjlVar13.R[i23].f != null) {
                        lhl lhlVar14 = cjlVar15.R[i23];
                        if (cjlVar15.U[i] == bjlVar && cjlVar15.u[i] == 0 && !z13) {
                            lhl lhlVar15 = lhlVar14.f;
                            if (lhlVar15.d == djlVar2) {
                                yic0Var.e(lhlVar14.i, lhlVar15.i, -lhlVar14.e(), 5);
                            } else if (z13) {
                                lhlVar6 = lhlVar14.f;
                                if (lhlVar6.d == djlVar2) {
                                    yic0Var.e(lhlVar14.i, lhlVar6.i, -lhlVar14.e(), 4);
                                }
                            }
                        } else if (z13) {
                            lhlVar6 = lhlVar14.f;
                            if (lhlVar6.d == djlVar2) {
                                yic0Var.e(lhlVar14.i, lhlVar6.i, -lhlVar14.e(), 4);
                            }
                        }
                        yic0Var.g(lhlVar14.i, cjlVar13.R[i23].f.i, -lhlVar14.e(), 6);
                    }
                }
                if (z7 != 0) {
                    int i24 = i3 + 1;
                    p6a1 p6a1Var12 = lhlVarArr6[i24].i;
                    lhl lhlVar16 = cjlVar13.R[i24];
                    yic0Var.f(p6a1Var12, lhlVar16.i, lhlVar16.e(), 8);
                }
                ArrayList arrayList4 = tbeVar.h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    float f9 = (!tbeVar.n || tbeVar.p) ? f8 : tbeVar.j;
                    cjl cjlVar18 = null;
                    float f10 = 0.0f;
                    int i25 = 0;
                    while (i25 < size) {
                        cjl cjlVar19 = (cjl) arrayList4.get(i25);
                        float[] fArr = cjlVar19.n0;
                        lhl[] lhlVarArr8 = cjlVar19.R;
                        float f11 = fArr[i];
                        if (f11 >= f6) {
                            arrayList2 = arrayList4;
                            if (f11 == f6) {
                                yic0Var.e(lhlVarArr8[i3 + 1].i, lhlVarArr8[i3].i, 0, 8);
                                size = size;
                                f2 = f6;
                                f3 = f9;
                            } else {
                                i25 = i25;
                                if (cjlVar18 != null) {
                                    lhl[] lhlVarArr9 = cjlVar18.R;
                                    p6a1Var6 = lhlVarArr9[i3].i;
                                    int i26 = i3 + 1;
                                    p6a1Var7 = lhlVarArr9[i26].i;
                                    p6a1Var8 = lhlVarArr8[i3].i;
                                    p6a1Var9 = lhlVarArr8[i26].i;
                                    c46VarL = yic0Var.l();
                                    f4 = f6;
                                    c46VarL.b = f4;
                                    f2 = f4;
                                    if (f9 != f4 || f10 == f11) {
                                        f3 = f9;
                                        f = f11;
                                        c46VarL.d.g(p6a1Var6, 1.0f);
                                        c46VarL.d.g(p6a1Var7, -1.0f);
                                        c46VarL.d.g(p6a1Var9, 1.0f);
                                        c46VarL.d.g(p6a1Var8, -1.0f);
                                    } else {
                                        o36 o36Var = c46VarL.d;
                                        if (f10 == f2) {
                                            f3 = f9;
                                            o36Var.g(p6a1Var6, 1.0f);
                                            c46VarL.d.g(p6a1Var7, -1.0f);
                                            f = f11;
                                        } else {
                                            f3 = f9;
                                            f = f11;
                                            if (f11 == f6) {
                                                o36Var.g(p6a1Var8, 1.0f);
                                                c46VarL.d.g(p6a1Var9, -1.0f);
                                            } else {
                                                float f12 = (f10 / f3) / (f / f3);
                                                o36Var.g(p6a1Var6, 1.0f);
                                                c46VarL.d.g(p6a1Var7, -1.0f);
                                                c46VarL.d.g(p6a1Var9, f12);
                                                c46VarL.d.g(p6a1Var8, -f12);
                                            }
                                        }
                                    }
                                    yic0Var.c(c46VarL);
                                } else {
                                    f = f11;
                                    f2 = f6;
                                    f3 = f9;
                                }
                                cjlVar18 = cjlVar19;
                                f10 = f;
                            }
                        } else {
                            if (tbeVar.p) {
                                arrayList2 = arrayList4;
                                yic0Var.e(lhlVarArr8[i3 + 1].i, lhlVarArr8[i3].i, 0, 4);
                            } else {
                                f11 = 1.0f;
                                arrayList2 = arrayList4;
                                if (f11 == f6) {
                                    yic0Var.e(lhlVarArr8[i3 + 1].i, lhlVarArr8[i3].i, 0, 8);
                                } else {
                                    i25 = i25;
                                    if (cjlVar18 != null) {
                                        lhl[] lhlVarArr10 = cjlVar18.R;
                                        p6a1Var6 = lhlVarArr10[i3].i;
                                        int i27 = i3 + 1;
                                        p6a1Var7 = lhlVarArr10[i27].i;
                                        p6a1Var8 = lhlVarArr8[i3].i;
                                        p6a1Var9 = lhlVarArr8[i27].i;
                                        c46VarL = yic0Var.l();
                                        f4 = f6;
                                        c46VarL.b = f4;
                                        f2 = f4;
                                        if (f9 != f4) {
                                            f3 = f9;
                                            f = f11;
                                            c46VarL.d.g(p6a1Var6, 1.0f);
                                            c46VarL.d.g(p6a1Var7, -1.0f);
                                            c46VarL.d.g(p6a1Var9, 1.0f);
                                            c46VarL.d.g(p6a1Var8, -1.0f);
                                        } else {
                                            f3 = f9;
                                            f = f11;
                                            c46VarL.d.g(p6a1Var6, 1.0f);
                                            c46VarL.d.g(p6a1Var7, -1.0f);
                                            c46VarL.d.g(p6a1Var9, 1.0f);
                                            c46VarL.d.g(p6a1Var8, -1.0f);
                                        }
                                        yic0Var.c(c46VarL);
                                    } else {
                                        f = f11;
                                        f2 = f6;
                                        f3 = f9;
                                    }
                                    cjlVar18 = cjlVar19;
                                    f10 = f;
                                }
                            }
                            size = size;
                            f2 = f6;
                            f3 = f9;
                        }
                        i25++;
                        f9 = f3;
                        arrayList4 = arrayList2;
                        size = size;
                        f6 = f2;
                    }
                }
                if (cjlVar14 == null || !(cjlVar14 == cjlVar15 || z13)) {
                    cjlVar = cjlVar15;
                    if (z && cjlVar14 != null) {
                        int i28 = tbeVar.j;
                        boolean z14 = i28 > 0 && tbeVar.i == i28;
                        cjl cjlVar20 = cjlVar14;
                        cjl cjlVar21 = cjlVar20;
                        while (true) {
                            lhl[] lhlVarArr11 = cjlVar21.R;
                            if (cjlVar20 == null) {
                                break;
                            }
                            lhl[] lhlVarArr12 = cjlVar20.R;
                            cjl cjlVar22 = cjlVar20.p0[i];
                            while (true) {
                                if (cjlVar22 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (cjlVar22.i0 != 8) {
                                    break;
                                } else {
                                    cjlVar22 = cjlVar22.p0[i];
                                }
                            }
                            if (cjlVar22 != null || cjlVar20 == cjlVar) {
                                lhl lhlVar17 = lhlVarArr12[i3];
                                p6a1 p6a1Var13 = lhlVar17.i;
                                lhl lhlVar18 = lhlVar17.f;
                                p6a1 p6a1Var14 = lhlVar18 != null ? lhlVar18.i : null;
                                if (cjlVar21 != cjlVar20) {
                                    p6a1Var14 = lhlVarArr11[i3 + 1].i;
                                } else if (cjlVar20 == cjlVar14) {
                                    lhl lhlVar19 = lhlVarArr5[i3].f;
                                    p6a1Var14 = lhlVar19 != null ? lhlVar19.i : null;
                                }
                                int iE2 = lhlVar17.e();
                                int i29 = i3 + 1;
                                int iE3 = lhlVarArr12[i29].e();
                                if (cjlVar22 != null) {
                                    lhlVar2 = cjlVar22.R[i3];
                                    lhlVarArr = lhlVarArr11;
                                    p6a1Var3 = lhlVar2.i;
                                } else {
                                    lhlVarArr = lhlVarArr11;
                                    lhlVar2 = cjlVar13.R[i29].f;
                                    p6a1Var3 = lhlVar2 != null ? lhlVar2.i : null;
                                }
                                p6a1 p6a1Var15 = lhlVarArr12[i29].i;
                                if (lhlVar2 != null) {
                                    iE3 += lhlVar2.e();
                                }
                                int iE4 = lhlVarArr[i29].e() + iE2;
                                if (p6a1Var13 == null || p6a1Var14 == null || p6a1Var3 == null || p6a1Var15 == null) {
                                    i7 = 8;
                                } else {
                                    if (cjlVar20 == cjlVar14) {
                                        iE4 = cjlVar14.R[i3].e();
                                    }
                                    int i30 = iE4;
                                    if (cjlVar20 == cjlVar) {
                                        iE3 = cjlVar.R[i29].e();
                                    }
                                    i7 = 8;
                                    yic0Var.b(p6a1Var13, p6a1Var14, i30, 0.5f, p6a1Var3, p6a1Var15, iE3, z14 ? 8 : 5);
                                }
                            } else {
                                i7 = i6;
                            }
                            if (cjlVar20.i0 != i7) {
                                cjlVar21 = cjlVar20;
                            }
                            cjlVar20 = cjlVar22;
                            cjlVar21 = cjlVar21;
                            lhlVarArr5 = lhlVarArr5;
                        }
                    } else {
                        int i31 = 8;
                        if (z9 && cjlVar14 != null) {
                            int i32 = tbeVar.j;
                            boolean z15 = i32 > 0 && tbeVar.i == i32;
                            cjl cjlVar23 = cjlVar14;
                            cjl cjlVar24 = cjlVar23;
                            while (true) {
                                lhl[] lhlVarArr13 = cjlVar23.R;
                                if (cjlVar24 == null) {
                                    break;
                                }
                                lhl[] lhlVarArr14 = cjlVar24.R;
                                cjl cjlVar25 = cjlVar24.p0[i];
                                while (cjlVar25 != null && cjlVar25.i0 == i31) {
                                    cjlVar25 = cjlVar25.p0[i];
                                }
                                if (cjlVar24 == cjlVar14 || cjlVar24 == cjlVar || cjlVar25 == null) {
                                    cjlVar2 = cjlVar23;
                                } else {
                                    if (cjlVar25 == cjlVar) {
                                        cjlVar25 = null;
                                    }
                                    lhl lhlVar20 = lhlVarArr14[i3];
                                    p6a1 p6a1Var16 = lhlVar20.i;
                                    int i33 = i3 + 1;
                                    p6a1 p6a1Var17 = lhlVarArr13[i33].i;
                                    int iE5 = lhlVar20.e();
                                    int iE6 = lhlVarArr14[i33].e();
                                    if (cjlVar25 != null) {
                                        lhlVar = cjlVar25.R[i3];
                                        p6a1Var = lhlVar.i;
                                        cjlVar2 = cjlVar23;
                                        lhl lhlVar21 = lhlVar.f;
                                        p6a1Var2 = lhlVar21 != null ? lhlVar21.i : null;
                                    } else {
                                        cjlVar2 = cjlVar23;
                                        lhl lhlVar22 = cjlVar.R[i3];
                                        p6a1Var = lhlVar22 != null ? lhlVar22.i : null;
                                        p6a1 p6a1Var18 = lhlVarArr14[i33].i;
                                        lhlVar = lhlVar22;
                                        p6a1Var2 = p6a1Var18;
                                    }
                                    if (lhlVar != null) {
                                        iE6 += lhlVar.e();
                                    }
                                    int iE7 = lhlVarArr13[i33].e() + iE5;
                                    cjl cjlVar26 = cjlVar25;
                                    int i34 = iE6;
                                    int i35 = z15 ? 8 : 4;
                                    if (p6a1Var16 == null || p6a1Var17 == null || p6a1Var == null || p6a1Var2 == null) {
                                        cjlVar3 = cjlVar26;
                                    } else {
                                        p6a1 p6a1Var19 = p6a1Var;
                                        cjlVar3 = cjlVar26;
                                        yic0Var.b(p6a1Var16, p6a1Var17, iE7, 0.5f, p6a1Var19, p6a1Var2, i34, i35);
                                    }
                                    cjlVar25 = cjlVar3;
                                }
                                i31 = 8;
                                if (cjlVar24.i0 != 8) {
                                    cjlVar2 = cjlVar24;
                                }
                                cjlVar24 = cjlVar25;
                                cjlVar23 = cjlVar2;
                            }
                            yic0Var2 = yic0Var;
                            lhl lhlVar23 = cjlVar14.R[i3];
                            lhl lhlVar24 = lhlVarArr5[i3].f;
                            int i36 = i3 + 1;
                            lhl lhlVar25 = cjlVar.R[i36];
                            lhl lhlVar26 = cjlVar13.R[i36].f;
                            if (lhlVar24 != null) {
                                if (cjlVar14 != cjlVar) {
                                    yic0Var2.e(lhlVar23.i, lhlVar24.i, lhlVar23.e(), 5);
                                } else if (lhlVar26 != null) {
                                    yic0Var2.b(lhlVar23.i, lhlVar24.i, lhlVar23.e(), 0.5f, lhlVar25.i, lhlVar26.i, lhlVar25.e(), 5);
                                }
                            }
                            if (lhlVar26 != null && cjlVar14 != cjlVar) {
                                yic0Var2.e(lhlVar25.i, lhlVar26.i, -lhlVar25.e(), 5);
                            }
                        }
                        if ((z || z9) && cjlVar14 != null && cjlVar14 != cjlVar) {
                            lhlVarArr2 = cjlVar14.R;
                            lhl lhlVar27 = lhlVarArr2[i3];
                            if (cjlVar == null) {
                                cjlVar = cjlVar14;
                            }
                            lhl[] lhlVarArr15 = cjlVar.R;
                            i8 = i3 + 1;
                            lhlVar3 = lhlVarArr15[i8];
                            lhlVar4 = lhlVar27.f;
                            if (lhlVar4 != null) {
                                p6a1Var4 = lhlVar4.i;
                            } else {
                                p6a1Var4 = null;
                            }
                            lhlVar5 = lhlVar3.f;
                            if (lhlVar5 != null) {
                                p6a1Var5 = lhlVar5.i;
                            } else {
                                p6a1Var5 = null;
                            }
                            if (cjlVar13 != cjlVar) {
                                lhl lhlVar28 = cjlVar13.R[i8].f;
                                p6a1Var5 = lhlVar28 != null ? lhlVar28.i : null;
                            }
                            if (cjlVar14 == cjlVar) {
                                lhlVar3 = lhlVarArr2[i8];
                            }
                            if (p6a1Var4 == null && p6a1Var5 != null) {
                                yic0Var2.b(lhlVar27.i, p6a1Var4, lhlVar27.e(), 0.5f, p6a1Var5, lhlVar3.i, lhlVarArr15[i8].e(), 5);
                            }
                        }
                    }
                } else {
                    lhl lhlVar29 = lhlVarArr5[i3];
                    int i37 = i3 + 1;
                    lhl lhlVar30 = cjlVar13.R[i37];
                    lhl lhlVar31 = lhlVar29.f;
                    p6a1 p6a1Var20 = lhlVar31 != null ? lhlVar31.i : null;
                    lhl lhlVar32 = lhlVar30.f;
                    p6a1 p6a1Var21 = lhlVar32 != null ? lhlVar32.i : null;
                    lhl lhlVar33 = cjlVar14.R[i3];
                    if (cjlVar15 != null) {
                        lhlVar30 = cjlVar15.R[i37];
                    }
                    if (p6a1Var20 == null || p6a1Var21 == null) {
                        cjlVar = cjlVar15;
                    } else {
                        float f13 = i == 0 ? cjlVar16.f0 : cjlVar16.g0;
                        int iE8 = lhlVar33.e();
                        int iE9 = lhlVar30.e();
                        p6a1 p6a1Var22 = lhlVar33.i;
                        p6a1 p6a1Var23 = lhlVar30.i;
                        p6a1 p6a1Var24 = p6a1Var20;
                        cjlVar = cjlVar15;
                        yic0Var.b(p6a1Var22, p6a1Var24, iE8, f13, p6a1Var21, p6a1Var23, iE9, 7);
                    }
                }
                yic0Var2 = yic0Var;
                if (z) {
                    lhlVarArr2 = cjlVar14.R;
                    lhl lhlVar210 = lhlVarArr2[i3];
                    if (cjlVar == null) {
                        cjlVar = cjlVar14;
                    }
                    lhl[] lhlVarArr16 = cjlVar.R;
                    i8 = i3 + 1;
                    lhlVar3 = lhlVarArr16[i8];
                    lhlVar4 = lhlVar210.f;
                    if (lhlVar4 != null) {
                        p6a1Var4 = lhlVar4.i;
                    } else {
                        p6a1Var4 = null;
                    }
                    lhlVar5 = lhlVar3.f;
                    if (lhlVar5 != null) {
                        p6a1Var5 = lhlVar5.i;
                    } else {
                        p6a1Var5 = null;
                    }
                    if (cjlVar13 != cjlVar) {
                        lhl lhlVar211 = cjlVar13.R[i8].f;
                        p6a1Var5 = lhlVar211 != null ? lhlVar211.i : null;
                    }
                    if (cjlVar14 == cjlVar) {
                        lhlVar3 = lhlVarArr2[i8];
                    }
                    if (p6a1Var4 == null) {
                    }
                } else {
                    lhlVarArr2 = cjlVar14.R;
                    lhl lhlVar212 = lhlVarArr2[i3];
                    if (cjlVar == null) {
                        cjlVar = cjlVar14;
                    }
                    lhl[] lhlVarArr17 = cjlVar.R;
                    i8 = i3 + 1;
                    lhlVar3 = lhlVarArr17[i8];
                    lhlVar4 = lhlVar212.f;
                    if (lhlVar4 != null) {
                        p6a1Var4 = lhlVar4.i;
                    } else {
                        p6a1Var4 = null;
                    }
                    lhlVar5 = lhlVar3.f;
                    if (lhlVar5 != null) {
                        p6a1Var5 = lhlVar5.i;
                    } else {
                        p6a1Var5 = null;
                    }
                    if (cjlVar13 != cjlVar) {
                        lhl lhlVar213 = cjlVar13.R[i8].f;
                        p6a1Var5 = lhlVar213 != null ? lhlVar213.i : null;
                    }
                    if (cjlVar14 == cjlVar) {
                        lhlVar3 = lhlVarArr2[i8];
                    }
                    if (p6a1Var4 == null) {
                    }
                }
            } else {
                i5 = i11;
            }
            i12 = i4 + 1;
            djlVar2 = djlVar;
            i11 = i5;
        }
    }

    public static boolean n(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zO = o(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zO;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean o(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    e.getMessage();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final pxg1 p(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        return irn1.o0(jfv.t(cbx.c(b0kVar).b.a, ngv.MILLISECONDS), 0, ((jhx) cbx.c(b0kVar).a.d).b, 2);
    }

    public static final View q(int i, ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        eg.g(cy30.i(i, "Index: ", viewGroup.getChildCount(), ", Size: "));
        return null;
    }

    public static final tka0 r(jla0 jla0Var) {
        if (jla0Var instanceof tka0) {
            return (tka0) jla0Var;
        }
        Object obj = null;
        if (!(jla0Var instanceof qma0)) {
            tw20.y(jla0Var, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List upperBounds = ((qma0) jla0Var).getUpperBounds();
        for (Object obj2 : upperBounds) {
            jla0 jla0VarK = ((oma0) obj2).k();
            bla0 bla0Var = jla0VarK instanceof bla0 ? (bla0) jla0VarK : null;
            if (bla0Var != null && bla0Var.N() != ieg.c && bla0Var.N() != ieg.f) {
                obj = obj2;
                break;
            }
        }
        oma0 oma0Var = (oma0) obj;
        if (oma0Var == null) {
            oma0Var = (oma0) o7h.s0(upperBounds);
        }
        return oma0Var != null ? s(oma0Var) : rc11.a.b(Object.class);
    }

    public static final tka0 s(oma0 oma0Var) {
        jla0 jla0VarK = oma0Var.k();
        if (jla0VarK != null) {
            return r(jla0VarK);
        }
        tw20.y(oma0Var, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    public static Object t(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return gg.p(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList u(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? gg.r(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    public static Serializable v(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return gg.u(bundle, str, cls);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    public static File w(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, f4i1.c(i, str));
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final int x(y341 y341Var) {
        d441 d441VarG1 = y341Var.g1("SELECT changes()");
        try {
            d441VarG1.f1();
            int i = (int) d441VarG1.getLong(0);
            o0c.v(d441VarG1, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0c.v(d441VarG1, th);
                throw th2;
            }
        }
    }

    public static int y(String str) {
        if (str == null) {
            return -1;
        }
        String strP = asj0.p(str);
        strP.getClass();
        switch (strP) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/avif":
                return 21;
            case "image/heic":
            case "image/heif":
                return 20;
            case "image/jpeg":
                return 14;
            case "image/webp":
                return 18;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "image/bmp":
                return 19;
            case "image/png":
                return 17;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static int z(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
