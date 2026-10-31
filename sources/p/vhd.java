package p;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.car.app.model.RowSection;
import androidx.car.app.model.SectionHeader;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import j$.net.URLEncoder;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vhd implements jd50, ag51, Function {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public Object d;

    public vhd(t7y t7yVar, l7m0 l7m0Var) {
        this.a = (byte) 7;
        this.b = t7yVar.o(6);
        this.c = ((k84) l7m0Var.b).r();
        this.d = new LinkedHashMap();
    }

    public void a(String str, String str2) throws IOException {
        f(str, null, null);
        i("%s", str2);
        k();
        synchronized (wf10.b) {
        }
    }

    public Object apply(Object obj) {
        List list;
        ArrayList arrayList;
        List list2 = null;
        switch (this.a) {
            case 4:
                z2w0 z2w0Var = (z2w0) this.d;
                boolean z = this.b;
                wsc0 wsc0Var = (wsc0) ((py21) obj).c();
                if (wsc0Var != null && (list = wsc0Var.e) != null) {
                    List<zuc0> list3 = list;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                    for (zuc0 zuc0Var : list3) {
                        String str = zuc0Var.c;
                        String str2 = zuc0Var.i;
                        fjf1 fjf1Var = zuc0Var.p;
                        fjf1 fjf1Var2 = fjf1Var instanceof fjf1 ? fjf1Var : null;
                        if (fjf1Var2 != null) {
                            List list4 = fjf1Var2.b;
                            ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((yif1) it.next()).a);
                            }
                            arrayList = new ArrayList();
                            for (Object obj2 : arrayList3) {
                                if (((String) obj2).length() > 0) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else {
                            arrayList = z6x.a;
                        }
                        arrayList2.add(new n3w0(str, str2, arrayList, Boolean.valueOf(z ? false : zuc0Var.d()), zuc0Var.a, zuc0Var.d()));
                    }
                    list2 = arrayList2;
                }
                if (list2 == null) {
                    list2 = z2w0Var.d;
                }
                return new o2w0(new z2w0(z2w0Var.a, z2w0Var.b, z2w0Var.c, list2, z2w0Var.e, z2w0Var.f, z2w0Var.g, z2w0Var.h, z2w0Var.i, z2w0Var.t, z2w0Var.X, z2w0Var.Y, z2w0Var.Z), false, this.c);
            default:
                sy21 sy21Var = (sy21) obj;
                aru0 aru0Var = (aru0) this.d;
                boolean z2 = this.b;
                z2w0 z2w0Var2 = (z2w0) sy21Var.b;
                ry21 ry21Var = sy21Var.a;
                if (!ry21Var.Q0 || z2w0Var2 == null) {
                    Logger.d("prerelease response failed with: %d", new Object[]{Integer.valueOf(ry21Var.d)});
                    return Single.error(new HttpException(sy21Var));
                }
                String str3 = z2w0Var2.b;
                return str3 == null ? Single.just(new o2w0(z2w0Var2, false, z2)) : rqt0.F(o6x.a, new yzv0(aru0Var, str3, (lnm) null)).map(new vhd(aru0Var, z2w0Var2, this.c, z2)).onErrorReturn(new svh0(z2w0Var2, z2, (byte) 10));
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    try {
                        if (this.b) {
                            return;
                        }
                        this.b = true;
                        this.c = true;
                        k65 k65Var = (k65) this.d;
                        if (k65Var != null) {
                            try {
                                Runnable runnable = (Runnable) k65Var.b;
                                jhg1 jhg1Var = (jhg1) k65Var.c;
                                Runnable runnable2 = (Runnable) k65Var.d;
                                if (runnable == null) {
                                    jhg1Var.cancel();
                                    runnable2.run();
                                } else {
                                    runnable.run();
                                }
                            } catch (Throwable th) {
                                synchronized (this) {
                                    this.c = false;
                                    notifyAll();
                                    throw th;
                                }
                            }
                            break;
                        }
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            break;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                this.b = false;
                this.c = false;
                ValueAnimator valueAnimator = (ValueAnimator) this.d;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                }
                ValueAnimator valueAnimator2 = (ValueAnimator) this.d;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.d = null;
                return;
        }
    }

    public List c(fpd fpdVar, utj utjVar) {
        int i;
        ouk0 ouk0VarN = c8o.n(fpdVar, utjVar);
        String title = fpdVar.getTitle();
        String str = (title == null || title.length() == 0) ? null : title;
        List items = fpdVar.getItems();
        ArrayList arrayList = new ArrayList(q7h.U(items, 10));
        int i2 = 0;
        for (Object obj : items) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            apd apdVar = (apd) obj;
            nwc nwcVar = apdVar.a;
            p80 p80Var = apdVar.d;
            nwc nwcVar2 = apdVar.b;
            hvc hvcVar = apdVar.c;
            int iC = l1d.C(apdVar.h);
            if (iC == 0) {
                i = 1;
            } else if (iC != 1) {
                i = 2;
                if (iC != 2) {
                    eg.o();
                    return null;
                }
            } else {
                i = 16;
            }
            arrayList.add(x760.D(nwcVar, nwcVar2, hvcVar, Integer.valueOf(i), null, Boolean.valueOf(p80Var instanceof g80), x1p1.n(apdVar.f), (this.b && (p80Var instanceof o80)) ? false : true, apdVar.e, this.c ? apdVar.g : null, new ka0(utjVar, apdVar, i2, ouk0VarN, (byte) 8), 48));
            i2 = i3;
        }
        l7m0 l7m0Var = (l7m0) this.d;
        if (l7m0Var == null) {
            return Collections.singletonList(lgo1.t(str, arrayList, (String) null, utjVar.e, utjVar.d, utjVar.f, 4));
        }
        SectionHeader sectionHeader = utjVar.f;
        b8p1 b8p1Var = utjVar.d;
        int iMin = Math.min(50, ((bil) ((i6b) l7m0Var.b).b).a(0));
        ArrayList arrayListS1 = o7h.s1(arrayList, iMin, iMin);
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayListS1, 10));
        int i4 = 0;
        int size = 0;
        for (Object obj2 : arrayListS1) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                p7h.T();
                throw null;
            }
            List list = (List) obj2;
            String str2 = i4 == 0 ? str : null;
            SectionHeader sectionHeader2 = i4 == 0 ? sectionHeader : null;
            RowSection rowSectionT = lgo1.t(str2, list, (String) null, (Function0) null, b8p1Var != null ? b8p1Var.h(i4, size, i4 == p7h.L(arrayListS1)) : null, sectionHeader2, 12);
            size += list.size();
            arrayList2.add(rowSectionT);
            i4 = i5;
        }
        return arrayList2;
    }

    public b8p1 d(int i, String str, ArrayList arrayList, boolean z, iu30 iu30Var) {
        if (!this.b) {
            return null;
        }
        ei51 ei51Var = new ei51(i, str, arrayList, z, (Integer) null, true);
        r7h.Z(((LinkedHashMap) this.d).keySet(), new mn41(ei51Var, (byte) 2), true);
        return new b8p1(this, ei51Var, iu30Var, 0, (byte) 18);
    }

    public void e(String str, Object... objArr) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        if (this.c) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            filterOutputStream.write(URLEncoder.encode(String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "UTF-8").getBytes(nne.a));
            return;
        }
        if (this.b) {
            Charset charset = nne.a;
            filterOutputStream.write("--".getBytes(charset));
            filterOutputStream.write(md50.j.getBytes(charset));
            filterOutputStream.write("\r\n".getBytes(charset));
            this.b = false;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
        filterOutputStream.write(String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)).getBytes(nne.a));
    }

    public void f(String str, String str2, String str3) throws IOException {
        if (this.c) {
            ((FilterOutputStream) this.d).write(String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(nne.a));
            return;
        }
        e("Content-Disposition: form-data; name=\"%s\"", str);
        if (str2 != null) {
            e("; filename=\"%s\"", str2);
        }
        i("", new Object[0]);
        if (str3 != null) {
            i("%s: %s", "Content-Type", str3);
        }
        i("", new Object[0]);
    }

    public void g(Uri uri, String str, String str2) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        if (str2 == null) {
            str2 = "content/unknown";
        }
        f(str, str, str2);
        int i = fpi1.i(wf10.a().getContentResolver().openInputStream(uri), filterOutputStream);
        i("", new Object[0]);
        k();
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        synchronized (wf10.b) {
        }
    }

    public void h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        if (str2 == null) {
            str2 = "content/unknown";
        }
        f(str, str, str2);
        int i = fpi1.i(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), filterOutputStream);
        i("", new Object[0]);
        k();
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        synchronized (wf10.b) {
        }
    }

    public void i(String str, Object... objArr) throws IOException {
        e(str, Arrays.copyOf(objArr, objArr.length));
        if (this.c) {
            return;
        }
        e("\r\n", new Object[0]);
    }

    public void j(String str, Object obj, md50 md50Var) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        String str2 = md50.j;
        if (cwl1.O(obj)) {
            a(str, cwl1.T(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            f(str, str, "image/png");
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, filterOutputStream);
            i("", new Object[0]);
            k();
            synchronized (wf10.b) {
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            f(str, str, "content/unknown");
            filterOutputStream.write(bArr);
            i("", new Object[0]);
            k();
            String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            synchronized (wf10.b) {
            }
            return;
        }
        if (obj instanceof Uri) {
            g((Uri) obj, str, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            h(str, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (!(obj instanceof kd50)) {
            hhg1.n("value is not a supported type.");
            return;
        }
        kd50 kd50Var = (kd50) obj;
        Parcelable parcelable = kd50Var.b;
        String str3 = kd50Var.a;
        if (parcelable instanceof ParcelFileDescriptor) {
            h(str, (ParcelFileDescriptor) parcelable, str3);
        } else if (parcelable instanceof Uri) {
            g((Uri) parcelable, str, str3);
        } else {
            hhg1.n("value is not a supported type.");
        }
    }

    public void k() throws IOException {
        if (this.c) {
            ((FilterOutputStream) this.d).write("&".getBytes(nne.a));
        } else {
            i("--%s", md50.j);
        }
    }

    public void l(JSONArray jSONArray, Collection collection) throws IOException {
        a("batch", jSONArray.toString());
    }

    public vhd(aru0 aru0Var, z2w0 z2w0Var, boolean z, boolean z2) {
        this.a = (byte) 4;
        this.d = z2w0Var;
        this.b = z;
        this.c = z2;
    }

    public vhd(boolean z, aru0 aru0Var, boolean z2) {
        this.a = (byte) 5;
        this.b = z;
        this.d = aru0Var;
        this.c = z2;
    }

    public vhd(l7m0 l7m0Var, boolean z, int i) {
        this.a = (byte) 3;
        l7m0Var = (i & 1) != 0 ? null : l7m0Var;
        boolean z2 = (i & 2) == 0;
        this.d = l7m0Var;
        this.b = z2;
        this.c = z;
    }

    public /* synthetic */ vhd(byte b) {
        this.a = b;
    }

    public vhd(int i, vu30 vu30Var) {
        this.a = (byte) 6;
        boolean z = (i & 2) == 0;
        this.b = false;
        this.c = z;
        this.d = vu30Var;
    }

    public vhd(ArrayList arrayList, boolean z, boolean z2) {
        this.a = (byte) 2;
        this.d = arrayList;
        this.c = z;
        this.b = z2;
    }

    public vhd(FilterOutputStream filterOutputStream, oue0 oue0Var, boolean z) {
        this.a = (byte) 1;
        this.d = filterOutputStream;
        this.b = true;
        this.c = z;
    }
}
