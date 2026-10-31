package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.getkeepsafe.relinker.MissingLibraryException;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.transcript.list.TranscriptListView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorReturn;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vyq0 implements Function, Predicate, lr61, av30, n2r, BiFunction, qiw, xi7, bgz0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public vyq0(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.b = new kdn0(l3r.c);
                break;
            case 26:
                this.b = new HashSet();
                break;
            default:
                this.b = new tdl0((byte) 11);
                break;
        }
    }

    public void A(String str) {
        m(str.getBytes(nne.a));
    }

    public boolean a() {
        return ((ufz0) this.b).d;
    }

    public Object apply(Object obj) {
        Object objInvoke;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hyq0 hyq0Var = (hyq0) obj2;
                ArrayList arrayList = new ArrayList();
                for (u310 u310VarB : (List) obj) {
                    Uri uri = u310VarB.e;
                    if (uri != null && !uri.equals(Uri.EMPTY)) {
                        if (!Pattern.compile("android\\.resource://com\\.spotify\\.music(.debug)?/drawable/(playlist|podcast|album|artist|audiobook)_placeholder").matcher(uri.toString()).matches()) {
                            u310VarB = u310.b(u310VarB, (String) null, (String) null, ((aai0) hyq0Var.d).e(uri, u310VarB.H, 3), 0, (Double) null, (String) null, 0, (y310) null, (String) null, (Map) null, (Uri) null, (q510) null, -65, 15);
                        }
                    }
                    arrayList.add(t4n1.r(u310VarB));
                }
                return new z310(arrayList, (f410) null, (m510) null, (String) null);
            case 1:
            case 2:
            case 4:
            case 5:
            case 7:
            case 11:
            case 12:
            case 18:
            case 19:
            case 21:
            default:
                return ((Observable) obj).flatMap(new hyy0(new n811(), ((yaz0) obj2).g, (byte) 4));
            case 3:
                return ((jzs0) obj2).a.c(((uo3) obj).d).ignoreElement();
            case 6:
                ly21 ly21Var = (py21) obj;
                ewq0 ewq0Var = new ewq0((iku0) obj2, (byte) 9);
                if (ly21Var instanceof ly21) {
                    objInvoke = ewq0Var.invoke(ly21Var.a);
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = bjo.a;
                }
                return (cjo) objInvoke;
            case 8:
                return ((Boolean) obj).booleanValue() ? new rg60((chy) ((tku0) obj2).d.getValue()) : xi10.f;
            case 9:
                return apo.x((chm0) obj2);
            case 10:
                Observable observable = (Observable) obj;
                tzr0 tzr0Var = (tzr0) obj2;
                return observable.take(1L).singleOrError().doOnSubscribe(new plv0(tzr0Var, (byte) 0)).doOnSuccess(new plv0(tzr0Var, (byte) 1)).flatMapObservable(new l1a0(observable, (byte) 1));
            case 13:
                return ((az11) ((cvw0) obj2).b.get()).b.b(x020.d).ignoreElement();
            case 14:
                q1x0 q1x0Var = (q1x0) obj;
                return ((j0a1) obj2).d().v(q1x0Var.g, q1x0Var.h).map(a2x0.b).onErrorReturnItem(new q2x0(false)).toObservable();
            case 15:
                k9x0 k9x0Var = (k9x0) obj;
                return new CompletableOnErrorReturn(((zsc) obj2).J(k9x0Var.c, k9x0Var.d), u9x0.b).n();
            case 16:
                ngx0 ngx0Var = (ngx0) obj2;
                return ngx0Var.a.a(ngx0Var.b).a(((jgx0) obj).a).distinctUntilChanged().map(mgx0.b);
            case 17:
                Intent intent = (Intent) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return crn0.a;
                }
                Set set = s4b1.f;
                Uri uri2 = uic.x(intent.getDataString()).a;
                return new hrn0(fux0.class, new hux0(4, uri2 != null ? uri2.getLastPathSegment() : null, (String) null, wqn1.r("session_id", intent), wqn1.r("refinement_session_id", intent), false, u890.j(wqn1.r("has_completed_refinement", intent), "true")), a6w0.a);
            case 20:
                if (((Boolean) obj).booleanValue()) {
                    xmu0 xmu0Var = (xmu0) obj2;
                    return ((Observable) ((gjp0) xmu0Var.c).invoke()).map(new lfb(xmu0Var, (byte) 21));
                }
                Observable observableJust = Observable.just(kpy0.a);
                observableJust.getClass();
                return observableJust;
            case 22:
                List list = ((y4z0) obj2).d;
                int iS = zno1.s(q7h.U(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : list) {
                    linkedHashMap.put(obj3, null);
                }
                return new e7z0(linkedHashMap);
            case 23:
                l0x0 l0x0Var = ((t6z0) obj2).h;
                ((kt91) l0x0Var.b).k(new er91((fs91) null, ((Resources) l0x0Var.c).getString(2131960752), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return Observable.empty();
        }
    }

    public r6h1 b() {
        return ((tdl0) this.b).b();
    }

    public ArrayList d(List list, String str, boolean z, x47 x47Var) {
        g17 l07Var;
        i3h i3hVar = (i3h) this.b;
        List listSingletonList = list;
        if (listSingletonList.isEmpty()) {
            listSingletonList = Collections.singletonList(new ft01("", str));
        }
        List<ft01> list2 = listSingletonList;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (ft01 ft01Var : list2) {
            String str2 = ft01Var.a;
            String str3 = ft01Var.b;
            boolean zR = eyo1.r(str);
            yz6 yz6Var = yz6.d;
            if (zR) {
                l07Var = new g17(new g07(str2, yz6Var));
            } else if (eyo1.o(str) || eyo1.o(str3)) {
                l07Var = new l07(new g07(str2, xz6.d), false);
            } else {
                Set set = s4b1.f;
                blc0 blc0Var = uic.x(str).c;
                blc0 blc0Var2 = blc0.U4;
                if (blc0Var == blc0Var2 || uic.x(str3).c == blc0Var2) {
                    l07Var = new u07(new g07(str2, yz6Var));
                } else if (eyo1.n(str)) {
                    l07Var = new k07(new g07(str2, yz6Var), false);
                } else if (eyo1.u(str)) {
                    l07Var = new o07(new g07(str2, yz6Var));
                } else if (!eyo1.p(str) || z) {
                    l07Var = eyo1.t(str) ? new y07(new g07(str2, yz6Var), false) : new e17(new g07(str2, yz6Var));
                } else {
                    fkt fktVarA = i3hVar.a(str);
                    l07Var = fktVarA != null ? new v07(i3hVar.b(fktVarA), new g07((String) null, yz6Var)) : new e17(new g07(str2, yz6Var));
                }
            }
            arrayList.add(new j47(l07Var, x47Var));
        }
        return arrayList;
    }

    public void e(jgc jgcVar, int i, uhy0 uhy0Var) {
        int iOrdinal = uhy0Var.ordinal();
        if (iOrdinal == 0) {
            long j = i;
            int i2 = jgc.c[Long.numberOfLeadingZeros(j)];
            jgcVar.b(i2 + 1);
            jgcVar.a(i2, j);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                ((jgc) this.b).c(Integer.reverseBytes(i));
                return;
            } else {
                eg.o();
                return;
            }
        }
        int i3 = (i << 1) ^ (i >> 31);
        jgcVar.b(5);
        if ((i3 & (-128)) != 0) {
            long j2 = i3;
            jgcVar.a(jgc.c[Long.numberOfLeadingZeros(j2)], j2);
        } else {
            byte[] bArr = jgcVar.a;
            int i4 = jgcVar.b;
            jgcVar.b = i4 + 1;
            bArr[i4] = (byte) i3;
        }
    }

    public void f(jgc jgcVar, long j, uhy0 uhy0Var) {
        int iOrdinal = uhy0Var.ordinal();
        if (iOrdinal == 0) {
            int i = jgc.c[Long.numberOfLeadingZeros(j)];
            jgcVar.b(i + 1);
            jgcVar.a(i, j);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    ((jgc) this.b).d(Long.reverseBytes(j));
                    return;
                } else {
                    eg.o();
                    return;
                }
            }
            long j2 = (j >> 63) ^ (j << 1);
            int i2 = jgc.c[Long.numberOfLeadingZeros(j2)];
            jgcVar.b(i2 + 1);
            jgcVar.a(i2, j2);
        }
    }

    public File g(Context context, String str) {
        return new File(context.getDir("lib", 0), cua.l(str));
    }

    public ymd0 getState() {
        return (kdn0) this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public void h(Context context, String str) throws Throwable {
        String[] strArrJ;
        InputStream inputStream;
        InputStream inputStream2;
        ?? r16;
        ?? r11;
        if (context == null) {
            hhg1.n("Given context is null");
            return;
        }
        if (str == null || str.length() == 0) {
            hhg1.n("Given library is either null or empty");
            return;
        }
        k("Beginning load of %s...", str);
        HashSet hashSet = (HashSet) this.b;
        if (hashSet.contains(str)) {
            k("%s already loaded previously!", str);
            return;
        }
        km3 km3Var = null;
        try {
            System.loadLibrary(str);
            hashSet.add(str);
            k("%s (%s) was loaded normally!", str, null);
        } catch (UnsatisfiedLinkError e) {
            k("Loading the library normally failed: %s", Log.getStackTraceString(e));
            k("%s (%s) was not loaded normally, re-linking...", str, null);
            ?? G = g(context, str);
            if (!G.exists()) {
                boolean z = false;
                File dir = context.getDir("lib", 0);
                File fileG = g(context, str);
                File[] fileArrListFiles = dir.listFiles(new qwz0(cua.l(str)));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileG.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str2 = Build.CPU_ABI2;
                    strArr = (str2 == null || str2.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str2};
                }
                String strL = cua.l(str);
                try {
                    km3 km3VarI = u9x0.i(context, strArr, strL, this);
                    try {
                        if (km3VarI == null) {
                            try {
                                strArrJ = u9x0.j(context, strL);
                            } catch (Exception e2) {
                                strArrJ = new String[]{e2.toString()};
                            }
                            StringBuilder sbT = l1d.t("Could not find '", strL, "'. Looked for: ");
                            sbT.append(Arrays.toString(strArr));
                            sbT.append(", but only found: ");
                            throw new MissingLibraryException(l1d.n(Arrays.toString(strArrJ), ".", sbT));
                        }
                        ZipFile zipFile = (ZipFile) km3VarI.b;
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            if (i >= 5) {
                                break;
                            }
                            k("Found %s! Extracting...", strL);
                            try {
                                if (G.exists() || G.createNewFile()) {
                                    try {
                                        inputStream2 = zipFile.getInputStream((ZipEntry) km3VarI.c);
                                        try {
                                            ?? fileOutputStream = new FileOutputStream((File) G);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j = 0;
                                                ?? r7 = z;
                                                while (true) {
                                                    int i3 = inputStream2.read(bArr);
                                                    if (i3 == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, r7, i3);
                                                    j += (long) i3;
                                                    strL = strL;
                                                    r7 = 0;
                                                }
                                                fileOutputStream.flush();
                                                fileOutputStream.getFD().sync();
                                                if (j == G.length()) {
                                                    u9x0.b(inputStream2);
                                                    u9x0.b((Closeable) fileOutputStream);
                                                    G.setReadable(true, r7);
                                                    G.setExecutable(true, r7);
                                                    G.setWritable(true);
                                                    break;
                                                }
                                                u9x0.b(inputStream2);
                                                u9x0.b((Closeable) fileOutputStream);
                                            } catch (FileNotFoundException unused) {
                                                strL = strL;
                                                r11 = fileOutputStream;
                                                u9x0.b(inputStream2);
                                                u9x0.b((Closeable) r11);
                                                strL = strL;
                                                i = i2;
                                                z = false;
                                            } catch (IOException unused2) {
                                                strL = strL;
                                                r11 = fileOutputStream;
                                                u9x0.b(inputStream2);
                                                u9x0.b((Closeable) r11);
                                                strL = strL;
                                                i = i2;
                                                z = false;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = inputStream2;
                                                r16 = fileOutputStream;
                                                u9x0.b(inputStream);
                                                u9x0.b((Closeable) r16);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused3) {
                                            r11 = 0;
                                            u9x0.b(inputStream2);
                                            u9x0.b((Closeable) r11);
                                            strL = strL;
                                            i = i2;
                                            z = false;
                                        } catch (IOException unused4) {
                                            r11 = 0;
                                            u9x0.b(inputStream2);
                                            u9x0.b((Closeable) r11);
                                            strL = strL;
                                            i = i2;
                                            z = false;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = inputStream2;
                                            r16 = 0;
                                            u9x0.b(inputStream);
                                            u9x0.b((Closeable) r16);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused5) {
                                        inputStream2 = null;
                                    } catch (IOException unused6) {
                                        inputStream2 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = null;
                                    }
                                }
                            } catch (IOException unused7) {
                            }
                            strL = strL;
                            strL = strL;
                            i = i2;
                            z = false;
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused8) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        km3Var = km3VarI;
                        if (km3Var != null) {
                            try {
                                ((ZipFile) km3Var.b).close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            System.load(G.getAbsolutePath());
            hashSet.add(str);
            k("%s (%s) was re-linked!", str, null);
        }
    }

    public w7h1 i() {
        tdl0 tdl0Var = (tdl0) this.b;
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), tdl0Var.b, r6h1.c, System.currentTimeMillis());
    }

    public w7h1 j() {
        tdl0 tdl0Var = (tdl0) this.b;
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), tdl0Var.b, r6h1.c, System.currentTimeMillis());
    }

    public void k(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((Observable) ((ct8) this.b).b.invoke()).firstOrError().map(jcx0.c).onErrorReturn(kcx0.c);
    }

    public void m(byte[] bArr) {
        jgc jgcVar = (jgc) this.b;
        e(jgcVar, bArr.length, uhy0.b);
        int length = bArr.length;
        if (length == 0) {
            return;
        }
        jgcVar.b(length);
        f46.O(jgcVar.b, 0, length, bArr, jgcVar.a);
        jgcVar.b += length;
    }

    public void n(byte[] bArr, int i) {
        e((jgc) this.b, jiy0.f.a(i), uhy0.b);
        m(bArr);
    }

    public void o(double d) {
        ((jgc) this.b).d(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    public void p(double d, int i) {
        jgc jgcVar = (jgc) this.b;
        e(jgcVar, jiy0.e.a(i), uhy0.b);
        jgcVar.d(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    public void q(float f) {
        ((jgc) this.b).c(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    public void r(float f, int i) {
        jgc jgcVar = (jgc) this.b;
        e(jgcVar, jiy0.g.a(i), uhy0.b);
        jgcVar.c(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    public void s(int i) {
        e((jgc) this.b, i, uhy0.b);
    }

    public void t(int i, int i2, uhy0 uhy0Var) {
        jgc jgcVar = (jgc) this.b;
        e(jgcVar, (uhy0Var == uhy0.d ? jiy0.g : jiy0.d).a(i2), uhy0.b);
        e(jgcVar, i, uhy0Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    public boolean test(Object obj) {
        byte b = this.a;
        boolean z = true;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                rir0 rir0Var = (f6r0) obj;
                hir0 hir0Var = (hir0) obj2;
                if (!hir0Var.d) {
                    z = false;
                } else if (!rir0Var.equals(hir0Var.e)) {
                    if (rir0Var instanceof rir0) {
                        rir0 rir0Var2 = rir0Var;
                        rir0 rir0Var3 = hir0Var.e;
                        if (rir0Var3 == null || !(rir0Var3 instanceof rir0)) {
                            z = false;
                        } else {
                            rir0 rir0Var4 = rir0Var3;
                            if (!u890.j(rir0Var2.a, rir0Var4.a) || rir0Var2.i != rir0Var4.i) {
                                z = false;
                            }
                        }
                    } else {
                        z = false;
                    }
                }
                hir0Var.d = false;
                return z;
            default:
                return !((gn01) obj2).c.compareAndSet(true, false);
        }
    }

    public void u(long j) {
        f((jgc) this.b, j, uhy0.b);
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 18:
                mmr0 mmr0Var = (mmr0) obj;
                tka0 tka0Var = (tka0) mmr0Var.a;
                boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                MessageInputView messageInputView = (MessageInputView) ((fvx0) obj2).d.f;
                if (u890.j(tka0Var, rc11.a.b(uvx0.class)) && zBooleanValue) {
                    w6e0 w6e0Var = messageInputView.T0;
                    ((EditText) w6e0Var.b).requestFocus();
                    ((EditText) w6e0Var.b).post(new f0j0(messageInputView, (byte) 1));
                } else {
                    ((EditText) messageInputView.T0.b).post(new f0j0(messageInputView, (byte) 0));
                }
                break;
            default:
                mmr0 mmr0Var2 = (mmr0) obj;
                boolean zBooleanValue2 = ((Boolean) mmr0Var2.a).booleanValue();
                int iIntValue = ((Number) mmr0Var2.b).intValue();
                if (zBooleanValue2) {
                    ((TranscriptListView) ((i34) obj2).c).getScroller().b(iIntValue);
                }
                break;
        }
    }

    public void w(long j, int i, uhy0 uhy0Var) {
        jgc jgcVar = (jgc) this.b;
        e(jgcVar, (uhy0Var == uhy0.d ? jiy0.e : jiy0.d).a(i), uhy0.b);
        f(jgcVar, j, uhy0Var);
    }

    public void x(jgc jgcVar) {
        jgc jgcVar2 = (jgc) this.b;
        e(jgcVar2, jgcVar.b, uhy0.b);
        int i = jgcVar.b;
        jgcVar2.b(i);
        f46.O(jgcVar2.b, 0, i, jgcVar.a, jgcVar2.a);
        jgcVar2.b += i;
    }

    public void y(jgc jgcVar, int i) {
        e((jgc) this.b, jiy0.f.a(i), uhy0.b);
        x(jgcVar);
    }

    public void z(int i, String str) {
        n(str.getBytes(nne.a), i);
    }

    public void start() {
    }

    public void stop() {
    }

    public /* synthetic */ vyq0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public vyq0(Intent intent, b72 b72Var) {
        this.a = (byte) 17;
        this.b = intent;
    }

    public vyq0(agc0 agc0Var, i3h i3hVar) {
        this.a = (byte) 29;
        this.b = i3hVar;
    }

    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue() && ((w84) ((erd) ((aru0) this.b).c).a.get()).a());
    }
}
