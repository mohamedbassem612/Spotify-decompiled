package p;

import android.app.Application;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.core.content.FileProvider;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import j$.net.URLEncoder;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class st60 implements Function, BiPredicate, f080, b480, ii80, nrm0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    /* JADX WARN: Code duplicated, block: B:16:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0152  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:16:0x0072, please report this as an issue */
    public st60(qr70 qr70Var, Size size, boolean z) {
        int iIntValue;
        int i;
        boolean z2;
        d2d yndVar;
        ekj0 zud0Var;
        xnd xndVar;
        List<d2d> listAsList;
        ArrayList arrayList;
        this.a = (byte) 12;
        w8p1.m();
        this.d = qr70Var;
        v1d v1dVar = (v1d) qr70Var.h(i4i1.D0, (Object) null);
        if (v1dVar == null) {
            bhn0.y((String) qr70Var.h(jrd1.r0, qr70Var.toString()), "Implementation is missing option unpacker for ");
            throw null;
        }
        vnd vndVar = new vnd();
        v1dVar.a(qr70Var, vndVar);
        vndVar.j();
        aod aodVar = new aod();
        this.b = aodVar;
        Executor executor = (Executor) qr70Var.h(ue90.W, ve90.a());
        Objects.requireNonNull(executor);
        jqd0 jqd0Var = new jqd0(executor);
        int iM = qr70Var.m();
        Integer num = (Integer) qr70Var.h(qr70.d, (Object) null);
        if (num == null) {
            Integer num2 = (Integer) qr70Var.h(st70.K, (Object) null);
            if (num2 == null || num2.intValue() != 4101) {
                iIntValue = 256;
            } else {
                i = 4101;
            }
            if (qr70Var.h(qr70.f, (Object) null) == null) {
                bhn0.d();
                throw null;
            }
            ae0 ae0Var = new ae0();
            ae0 ae0Var2 = new ae0();
            ny8 ny8Var = new ny8(size, iM, i, z, ae0Var, ae0Var2);
            this.c = ny8Var;
            if (((ny8) aodVar.c) == null || ((vnd) aodVar.b) != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            o0c.q("CaptureNode does not support recreation yet.", z2);
            aodVar.c = ny8Var;
            yndVar = new ynd();
            if (z) {
                zud0Var = new zud0(anm1.r(size.getWidth(), size.getHeight(), iM, 4), (byte) 20);
                xndVar = new xnd(aodVar, (byte) 1);
            } else {
                zud0Var = new ekj0(size.getWidth(), size.getHeight(), iM, 4);
                listAsList = Arrays.asList(yndVar, zud0Var.b);
                if (!listAsList.isEmpty()) {
                    if (listAsList.size() == 1) {
                    } else {
                        arrayList = new ArrayList();
                        for (d2d d2dVar : listAsList) {
                            if (!(d2dVar instanceof f2d)) {
                                arrayList.add(d2dVar);
                            }
                        }
                    }
                }
                xndVar = new xnd(aodVar, (byte) 0);
            }
            Surface surface = zud0Var.getSurface();
            Objects.requireNonNull(surface);
            o0c.q("The surface is already set.", ny8Var.a == null);
            ny8Var.a = new g280(surface, size, iM);
            aodVar.b = new vnd(zud0Var);
            zud0Var.g(new q58(aodVar, (byte) 22), x2g0.A());
            ae0Var.b = xndVar;
            ae0Var2.b = new xnd(aodVar, (byte) 2);
            ((g4r) jqd0Var.d).m(IncorrectJpegMetadataQuirk.class);
        }
        iIntValue = num.intValue();
        i = iIntValue;
        if (qr70Var.h(qr70.f, (Object) null) == null) {
            bhn0.d();
            throw null;
        }
        ae0 ae0Var3 = new ae0();
        ae0 ae0Var4 = new ae0();
        ny8 ny8Var2 = new ny8(size, iM, i, z, ae0Var3, ae0Var4);
        this.c = ny8Var2;
        if (((ny8) aodVar.c) == null) {
            z2 = false;
        } else {
            z2 = false;
        }
        o0c.q("CaptureNode does not support recreation yet.", z2);
        aodVar.c = ny8Var2;
        yndVar = new ynd();
        if (z) {
            zud0Var = new ekj0(size.getWidth(), size.getHeight(), iM, 4);
            listAsList = Arrays.asList(yndVar, zud0Var.b);
            if (!listAsList.isEmpty()) {
                if (listAsList.size() == 1) {
                } else {
                    arrayList = new ArrayList();
                    while (r11.hasNext()) {
                        if (!(d2dVar instanceof f2d)) {
                            arrayList.add(d2dVar);
                        }
                    }
                }
            }
            xndVar = new xnd(aodVar, (byte) 0);
        } else {
            zud0Var = new zud0(anm1.r(size.getWidth(), size.getHeight(), iM, 4), (byte) 20);
            xndVar = new xnd(aodVar, (byte) 1);
        }
        Surface surface2 = zud0Var.getSurface();
        Objects.requireNonNull(surface2);
        o0c.q("The surface is already set.", ny8Var2.a == null);
        ny8Var2.a = new g280(surface2, size, iM);
        aodVar.b = new vnd(zud0Var);
        zud0Var.g(new q58(aodVar, (byte) 22), x2g0.A());
        ae0Var3.b = xndVar;
        ae0Var4.b = new xnd(aodVar, (byte) 2);
        ((g4r) jqd0Var.d).m(IncorrectJpegMetadataQuirk.class);
    }

    public static void F(Matrix matrix, int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.postRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.postRotate(-90.0f);
                break;
            default:
                Logger.d("Unknown exif tag", new Object[0]);
                break;
        }
    }

    public static /* synthetic */ Object H(st60 st60Var, String str, el81 el81Var, onm onmVar, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            el81Var = null;
        }
        return st60Var.G(str, el81Var, (i & 4) == 0, onmVar);
    }

    public static final /* synthetic */ Function0 i(st60 st60Var) {
        return (nd70) st60Var.b;
    }

    public static RectF j(RectF rectF, int i) {
        RectF rectF2 = new RectF(rectF);
        switch (i) {
            case 2:
                rectF2.set(1.0f - rectF2.right, rectF2.top, 1.0f - rectF2.left, rectF2.bottom);
            case 1:
                return rectF2;
            case 3:
                rectF2.set(1.0f - rectF2.right, 1.0f - rectF2.bottom, 1.0f - rectF2.left, 1.0f - rectF2.top);
                return rectF2;
            case 4:
                rectF2.set(rectF2.left, 1.0f - rectF2.bottom, rectF2.right, 1.0f - rectF2.top);
                return rectF2;
            case 5:
                rectF2.set(rectF2.top, rectF2.left, rectF2.bottom, rectF2.right);
                return rectF2;
            case 6:
                rectF2.set(rectF2.top, 1.0f - rectF2.right, rectF2.bottom, 1.0f - rectF2.left);
                return rectF2;
            case 7:
                rectF2.set(1.0f - rectF2.bottom, 1.0f - rectF2.right, 1.0f - rectF2.top, 1.0f - rectF2.left);
                return rectF2;
            case 8:
                rectF2.set(1.0f - rectF2.bottom, rectF2.left, 1.0f - rectF2.top, rectF2.right);
                return rectF2;
            default:
                Logger.d("Unknown exif tag", new Object[0]);
                return rectF2;
        }
    }

    public static BitmapFactory.Options l(BitmapFactory.Options options) {
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        int i = options.outWidth / 2;
        int i2 = 1;
        while ((i / i2) * ((options.outHeight / 2) / i2) >= 4000000) {
            i2 *= 2;
        }
        options2.inSampleSize = i2;
        return options2;
    }

    public static String t(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return f4i1.f(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return str.concat(string);
    }

    public void A(tm70 tm70Var, int i, Object obj) {
        if (obj == null || (tm70Var instanceof v6k1)) {
            z(tm70Var, i);
            return;
        }
        zpw zpwVar = tm70Var instanceof zpw ? (zpw) tm70Var : null;
        if (zpwVar != null) {
            k(zpwVar, obj instanceof uqw ? (uqw) obj : null);
        }
    }

    public tm70 B(int i, ViewGroup viewGroup) {
        if (i >= 0) {
            pze0.m(((ft30) this.d).invoke(Integer.valueOf(i)));
            throw null;
        }
        int i2 = i * (-1);
        Iterable iterable = (Iterable) ((nd70) this.b).invoke();
        ArrayList<uqw> arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof uqw) {
                arrayList.add(obj);
            }
        }
        for (uqw uqwVar : arrayList) {
            if (w(uqwVar.b) == i2) {
                laa laaVar = uqwVar.b;
                tka0 tka0Var = dtw.C;
                return new zpw(mhc.d(viewGroup.getContext(), viewGroup, laaVar, (drw) null, 24));
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:83:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0050 A[SYNTHETIC] */
    public Intent C(Intent intent) {
        ArrayList arrayList;
        ft80 ft80Var;
        Intent intent2;
        String stringExtra;
        String stringExtra2;
        Set set = (Set) this.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ct80) it.next()).a(intent));
        }
        if (arrayList2.isEmpty()) {
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof ft80) {
                    arrayList.add(obj);
                }
            }
            ft80Var = (ft80) o7h.s0(arrayList);
            if (ft80Var != null) {
                intent2 = ft80Var.a;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                stringExtra = intent2.getStringExtra("extra_deeplink_navigation_reference");
                if ((stringExtra != null || stringExtra.length() == 0) && (stringExtra2 = intent.getStringExtra("extra_deeplink_navigation_reference")) != null) {
                    if (stringExtra2.length() <= 0) {
                        stringExtra2 = null;
                    }
                    if (stringExtra2 != null) {
                        intent2.putExtra("extra_deeplink_navigation_reference", stringExtra2);
                    }
                }
                if (intent.getBooleanExtra("extra_deeplink_navigation_logged", false)) {
                    intent2.putExtra("extra_deeplink_navigation_logged", true);
                }
                intent = intent2;
            }
        } else {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        if (obj instanceof ft80) {
                            arrayList.add(obj);
                        }
                    }
                    ft80Var = (ft80) o7h.s0(arrayList);
                    if (ft80Var != null) {
                        intent2 = ft80Var.a;
                    } else {
                        intent2 = null;
                    }
                    if (intent2 != null) {
                        stringExtra = intent2.getStringExtra("extra_deeplink_navigation_reference");
                        if (stringExtra != null) {
                            if (stringExtra2.length() <= 0) {
                                stringExtra2 = null;
                            }
                            if (stringExtra2 != null) {
                                intent2.putExtra("extra_deeplink_navigation_reference", stringExtra2);
                            }
                        } else {
                            if (stringExtra2.length() <= 0) {
                                stringExtra2 = null;
                            }
                            if (stringExtra2 != null) {
                                intent2.putExtra("extra_deeplink_navigation_reference", stringExtra2);
                            }
                        }
                        if (intent.getBooleanExtra("extra_deeplink_navigation_logged", false)) {
                            intent2.putExtra("extra_deeplink_navigation_logged", true);
                        }
                        intent = intent2;
                    }
                } else if (((gt80) it2.next()) instanceof dt80) {
                    intent = null;
                }
            }
        }
        if (intent == null) {
            return null;
        }
        Iterator it3 = ((Set) this.c).iterator();
        while (it3.hasNext()) {
            for (vs80 vs80Var : ((ss80) it3.next()).a(intent)) {
                if (vs80Var instanceof ts80) {
                    intent.setAction("android.intent.action.VIEW");
                } else if (vs80Var instanceof vs80) {
                    intent.putExtras(vs80Var.a);
                } else {
                    if (!(vs80Var instanceof us80)) {
                        eg.o();
                        return null;
                    }
                    intent.setData(((us80) vs80Var).a);
                }
            }
        }
        Iterator it4 = ((t380) this.d).iterator();
        while (it4.hasNext()) {
            ((eyf0) it4.next()).a(intent);
        }
        return intent;
    }

    public void D() {
        ((qe41) this.d).p().c("INSTANCE_STATE_RECEIVING_PLUGIN_POINT", new uk(this, (byte) 7));
        ((iac0) this.b).getLifecycle().a(new d8l(this, (byte) 1));
    }

    public void E() {
        ((InputMethodManager) ((znb0) this.b).getValue()).restartInput((View) this.d);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x013e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0155 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object G(String str, el81 el81Var, boolean z, onm onmVar) {
        lx80 lx80Var;
        String str2;
        el81 el81Var2;
        boolean z2;
        Object obj;
        kl81[] kl81VarArr;
        kl81[] kl81VarArr2;
        PlayerState playerState;
        Completable completableFlatMapCompletable;
        boolean z3;
        PlayerState playerState2;
        jpu jpuVar;
        kx80 kx80Var;
        cr51 cr51Var = (cr51) this.b;
        Flowable flowable = (Flowable) this.d;
        if (onmVar instanceof lx80) {
            lx80Var = (lx80) onmVar;
            int i = lx80Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                lx80Var.h = i - Integer.MIN_VALUE;
            } else {
                lx80Var = new lx80(this, onmVar);
            }
        } else {
            lx80Var = new lx80(this, onmVar);
        }
        Object obj2 = lx80Var.f;
        int i2 = lx80Var.h;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            str2 = str;
            lx80Var.a = str2;
            lx80Var.b = el81Var;
            lx80Var.e = z;
            lx80Var.h = 1;
            Object objM = u890.m(flowable, 1, lx80Var);
            if (objM != d9nVar) {
                el81Var2 = el81Var;
                z2 = z;
                obj = objM;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z2 = lx80Var.e;
            el81Var2 = lx80Var.b;
            String str3 = lx80Var.a;
            hm5.M(obj2);
            obj = obj2;
            str2 = str3;
        } else {
            if (i2 == 2) {
                z2 = lx80Var.e;
                kl81VarArr2 = lx80Var.d;
                playerState = lx80Var.c;
                hm5.M(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    eg.m(f4i1.f("At least one signal in ", f46.s0(kl81VarArr2, (String) null, (String) null, (String) null, (iu30) null, 63), " is unavailable"));
                    return null;
                }
                completableFlatMapCompletable = cr51Var.d.b(0, 80).z().flatMapCompletable(new br51((kl81[]) Arrays.copyOf(kl81VarArr2, kl81VarArr2.length), cr51Var));
                lx80Var.a = null;
                lx80Var.b = null;
                lx80Var.c = playerState;
                lx80Var.d = null;
                lx80Var.e = z2;
                lx80Var.h = 3;
                if (fc11.i(completableFlatMapCompletable, lx80Var) != d9nVar) {
                    z3 = z2;
                    playerState2 = playerState;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                if (i2 == 5) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = lx80Var.e;
            playerState2 = lx80Var.c;
            hm5.M(obj2);
        }
        if (!o4p1.t(playerState2)) {
            vbm[] vbmVarArr = q601.a;
            kx80Var = new kx80(new kge(flowable), playerState2, (byte) 0);
            lx80Var.a = null;
            lx80Var.b = null;
            lx80Var.c = null;
            lx80Var.d = null;
            lx80Var.e = z3;
            lx80Var.h = 4;
            if (b5p1.k(kx80Var, lx80Var) != d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (z3) {
            jpuVar = (jpu) this.c;
            lx80Var.a = null;
            lx80Var.b = null;
            lx80Var.c = null;
            lx80Var.d = null;
            lx80Var.e = z3;
            lx80Var.h = 5;
            if (jpuVar.a(lx80Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
        PlayerState playerState3 = (PlayerState) obj;
        if (str2 != null) {
            kl81VarArr = new kl81[]{new dl81(str2, el81Var2)};
        } else {
            boolean zT = o4p1.t(playerState3);
            kl81 kl81Var = yk81.a;
            kl81VarArr = (!zT || o4p1.C(playerState3)) ? new kl81[]{kl81Var} : new kl81[]{kl81Var, al81.a};
        }
        FlowableDistinctUntilChanged flowableDistinctUntilChangedE = cr51Var.e((kl81[]) Arrays.copyOf(kl81VarArr, kl81VarArr.length));
        lx80Var.a = null;
        lx80Var.b = null;
        lx80Var.c = playerState3;
        lx80Var.d = kl81VarArr;
        lx80Var.e = z2;
        lx80Var.h = 2;
        Object objM2 = u890.m(flowableDistinctUntilChangedE, 1, lx80Var);
        if (objM2 != d9nVar) {
            kl81VarArr2 = kl81VarArr;
            playerState = playerState3;
            obj2 = objM2;
            if (((Boolean) obj2).booleanValue()) {
                eg.m(f4i1.f("At least one signal in ", f46.s0(kl81VarArr2, (String) null, (String) null, (String) null, (iu30) null, 63), " is unavailable"));
                return null;
            }
            completableFlatMapCompletable = cr51Var.d.b(0, 80).z().flatMapCompletable(new br51((kl81[]) Arrays.copyOf(kl81VarArr2, kl81VarArr2.length), cr51Var));
            lx80Var.a = null;
            lx80Var.b = null;
            lx80Var.c = playerState;
            lx80Var.d = null;
            lx80Var.e = z2;
            lx80Var.h = 3;
            if (fc11.i(completableFlatMapCompletable, lx80Var) != d9nVar) {
                z3 = z2;
                playerState2 = playerState;
                if (!o4p1.t(playerState2)) {
                    if (z3) {
                        jpuVar = (jpu) this.c;
                        lx80Var.a = null;
                        lx80Var.b = null;
                        lx80Var.c = null;
                        lx80Var.d = null;
                        lx80Var.e = z3;
                        lx80Var.h = 5;
                        if (jpuVar.a(lx80Var) == d9nVar) {
                        }
                    }
                    return rih1Var;
                }
                vbm[] vbmVarArr2 = q601.a;
                kx80Var = new kx80(new kge(flowable), playerState2, (byte) 0);
                lx80Var.a = null;
                lx80Var.b = null;
                lx80Var.c = null;
                lx80Var.d = null;
                lx80Var.e = z3;
                lx80Var.h = 4;
                if (b5p1.k(kx80Var, lx80Var) != d9nVar) {
                    return rih1Var;
                }
            }
        }
        return d9nVar;
    }

    public void I(int i, String str, ou80 ou80Var, boolean z) {
        qds qdsVar = (qds) this.c;
        dma1 dma1Var = qdsVar.a;
        dma1 dma1Var2 = qdsVar.a;
        bma1 bma1Var = qdsVar.c;
        if (!dma1Var.h(bma1Var, false) && (i != 1 || z)) {
            hma1 hma1VarEdit = dma1Var2.edit();
            hma1VarEdit.a(bma1Var, true);
            hma1VarEdit.h();
            ((ser) this.d).a(ou80Var != null ? ou80Var.a : null, "spotify:internal:jam-host-onboarding", null);
            return;
        }
        mur murVar = qdsVar.b;
        bma1 bma1Var2 = rds.a;
        Set setB = dma1Var2.b(bma1Var2, new LinkedHashSet());
        if (setB == null) {
            setB = new LinkedHashSet();
        }
        if (setB.contains(murVar.a(str))) {
            return;
        }
        Iterable iterableB = dma1Var2.b(bma1Var2, new LinkedHashSet());
        if (iterableB == null) {
            iterableB = new LinkedHashSet();
        }
        String strA = murVar.a(str);
        Set setO1 = o7h.o1(iterableB);
        setO1.add(strA);
        hma1 hma1VarEdit2 = dma1Var2.edit();
        hma1VarEdit2.e(bma1Var2, setO1);
        hma1VarEdit2.h();
        ((z1s) this.b).a(new bi70(i));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public gmh1 J(gb11 gb11Var, o8a0 o8a0Var, boolean z) {
        tnw0 tnw0VarC;
        o860 o860Var = (o860) this.d;
        uw0 uw0Var = (uw0) o860Var.b;
        boolean z2 = o8a0Var.d;
        xb11 xb11Var = gb11Var.b;
        xb11 xb11Var2 = xb11Var instanceof xb11 ? xb11Var : null;
        if (xb11Var2 != null) {
            Class cls = xb11Var2.a;
            if (cls.equals(Void.TYPE)) {
                tnw0VarC = null;
            } else {
                tnw0VarC = nja0.b(cls.getName()).c();
            }
        } else {
            tnw0VarC = null;
        }
        fg5 eqb0Var = new eqb0(o860Var, gb11Var, true);
        if (tnw0VarC != null) {
            qx81 qx81VarR = ((ajm0) uw0Var.X).e.r(tnw0VarC);
            qx81 qx81VarZ = rzn1.z(qx81VarR, new hg5(new fg5[]{qx81VarR.getAnnotations(), eqb0Var}));
            return z2 ? qx81VarZ : y3o1.Z(qx81VarZ, qx81VarZ.A0(true));
        }
        a8b0 a8b0VarL = L(xb11Var, bs51.u(2, z2, (drb0) null, 6));
        if (z2) {
            return ((ajm0) uw0Var.X).e.i(z ? 3 : 1, a8b0VarL, eqb0Var);
        }
        return y3o1.Z(((ajm0) uw0Var.X).e.i(1, a8b0VarL, eqb0Var), ((ajm0) uw0Var.X).e.i(3, a8b0VarL, eqb0Var).A0(true));
    }

    public Uri K(int i, Bitmap bitmap) {
        Uri uriFromFile;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        F(matrix, i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        l420 l420VarQ = q(false);
        if (l420VarQ == null) {
            Logger.d("Error creating image", new Object[0]);
            uriFromFile = Uri.EMPTY;
        } else {
            try {
                r420 r420VarL = ((fya) this.b).l(l420VarQ);
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 90, r420VarL);
                r420VarL.close();
                uriFromFile = Uri.fromFile(l420VarQ);
            } catch (IOException e) {
                Logger.e(e, "Error writing image", new Object[0]);
                uriFromFile = Uri.EMPTY;
            }
        }
        bitmapCreateBitmap.recycle();
        return uriFromFile;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    public a8b0 L(zb11 zb11Var, o8a0 o8a0Var) {
        boolean z;
        uw0 uw0Var = (uw0) ((o860) this.d).b;
        if (zb11Var instanceof xb11) {
            Class cls = ((xb11) zb11Var).a;
            tnw0 tnw0VarC = cls.equals(Void.TYPE) ? null : nja0.b(cls.getName()).c();
            return tnw0VarC != null ? ((ajm0) uw0Var.X).e.t(tnw0VarC) : ((ajm0) uw0Var.X).e.x();
        }
        if (!(zb11Var instanceof ob11)) {
            if (zb11Var instanceof gb11) {
                return J((gb11) zb11Var, o8a0Var, false);
            }
            if (zb11Var instanceof cc11) {
                zb11 zb11VarC = ((cc11) zb11Var).c();
                return zb11VarC != null ? L(zb11VarC, o8a0Var) : ((ajm0) uw0Var.X).e.p();
            }
            if (zb11Var == null) {
                return ((ajm0) uw0Var.X).e.p();
            }
            t8e1.o(zb11Var, "Unsupported type: ");
            return null;
        }
        ob11 ob11Var = (ob11) zb11Var;
        Type type = ob11Var.a;
        if (!o8a0Var.d) {
            z = o8a0Var.a != 1;
        }
        boolean zD = ob11Var.d();
        zjz zjzVar = zjz.c;
        if (!zD && !z) {
            qx81 qx81VarO = o(ob11Var, o8a0Var, null);
            return qx81VarO != null ? qx81VarO : bkz.b(zjzVar, new String[]{type.toString()});
        }
        qx81 qx81VarO2 = o(ob11Var, o8a0Var.b(3), null);
        if (qx81VarO2 == null) {
            return bkz.b(zjzVar, new String[]{type.toString()});
        }
        qx81 qx81VarO3 = o(ob11Var, o8a0Var.b(2), qx81VarO2);
        if (qx81VarO3 == null) {
            return bkz.b(zjzVar, new String[]{type.toString()});
        }
        return zD ? new nwz0(qx81VarO2, qx81VarO3, 0) : y3o1.Z(qx81VarO2, qx81VarO3);
    }

    public void M(CursorAnchorInfo cursorAnchorInfo) {
        ((InputMethodManager) ((znb0) this.b).getValue()).updateCursorAnchorInfo((View) this.d, cursorAnchorInfo);
    }

    public void N(int i, int i2, int i3, int i4) {
        ((InputMethodManager) ((znb0) this.b).getValue()).updateSelection((View) this.d, i, i2, i3, i4);
    }

    public Uri a() {
        return (Uri) this.d;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        byte b2 = 20;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                String str = (String) obj;
                wb0 wb0Var = (wb0) obj4;
                String str2 = wb0Var.a;
                return ((v5n) obj3).d(p7h.M(new String[]{str, str2})).map(ud20.f).firstOrError().onErrorReturn(ta20.f).map(new xot(str, str2, (byte) 3)).map(new dh30((sjq0) obj2, wb0Var, b2));
            case 1:
                wb0 wb0Var2 = ((lt60) obj).b;
                if (wb0Var2 != null) {
                    Observable observableOnErrorResumeNext = new ObservableFromPublisher((Flowable) obj4).map(xi20.f).filter(yi20.f).firstOrError().flatMap(new st60(wb0Var2, (v5n) obj3, (sjq0) obj2, z ? (byte) 1 : (byte) 0)).toObservable().onErrorResumeNext(ua20.f);
                    observableOnErrorResumeNext.getClass();
                    return observableOnErrorResumeNext;
                }
                Observable observableJust = Observable.just(new ju60((ns60) null));
                observableJust.getClass();
                return observableJust;
            case 13:
                geh gehVar = (geh) ((m021) obj4).i(new xvy((fc3) obj3, (Intent) obj2, obj, b2));
                return gehVar == null ? deh.a : gehVar;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                PlayerState playerState = (PlayerState) obj;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                ((ag90) obj4).getClass();
                if (playerState.isPlaying() && !playerState.isPaused() && u890.j(playerState.contextUri(), str4) && o4p1.o(playerState).equals(str3)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return rqt0.F(o6x.a, new z290((bp90) obj, (blc0) obj4, (Intent) obj3, (ru9) obj2, (lnm) null, (byte) 3));
        }
    }

    public Uri b() {
        return (Uri) this.c;
    }

    public Object c() {
        return null;
    }

    public void d(Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        Object az80Var;
        ly80 ly80Var;
        bz80 bz80Var = (bz80) this.d;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-160412077);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i | (b0kVar3.g(this) ? 32 : 16);
        boolean z = false;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            ly80 ly80Var2 = (ly80) ((ven0) this.b).getValue();
            iu30 iu30Var = (iu30) ((ven0) this.c).getValue();
            Boolean boolValueOf = Boolean.valueOf(ly80Var2.o);
            boolean zG = ((i2 & 14) == 4) | b0kVar3.g(ly80Var2) | b0kVar3.g(iu30Var);
            Object objT = b0kVar3.T();
            lnm lnmVar = null;
            if (zG || objT == m4cVar) {
                ly80Var = ly80Var2;
                az80Var = new az80(ly80Var, function0, iu30Var, lnmVar, (byte) 0);
                b0kVar3.s0(az80Var);
            } else {
                az80Var = objT;
                ly80Var = ly80Var2;
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) az80Var);
            String str = ly80Var.r;
            if (str == null) {
                str = ly80Var.a;
            }
            boolean z2 = ly80Var.c;
            boolean z3 = ly80Var.q;
            boolean z4 = ly80Var.d;
            boolean z5 = ly80Var.i;
            if (ly80Var.h) {
                b0kVar3.i0(462852721);
                boolean z6 = !((Boolean) h7w.y(b0kVar3).getValue()).booleanValue();
                b0kVar3.r(false);
                z = z6;
            } else {
                b0kVar3.i0(1463533700);
                b0kVar3.r(false);
            }
            tra0 tra0Var = z ? bz80Var.Y : null;
            w9u0 w9u0Var = bz80Var.e;
            boolean z7 = ly80Var.j;
            boolean z8 = ly80Var.k;
            boolean z9 = ly80Var.l;
            String str2 = str;
            String str3 = ly80Var.f27p;
            boolean z10 = ly80Var.n;
            boolean zG2 = b0kVar3.g(iu30Var);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new zi80(iu30Var, (byte) 10);
                b0kVar3.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean zG3 = b0kVar3.g(iu30Var);
            Object objT3 = b0kVar3.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = new zi80(iu30Var, (byte) 11);
                b0kVar3.s0(objT3);
            }
            Function0 function2 = (Function0) objT3;
            boolean zG4 = b0kVar3.g(iu30Var);
            Object objT4 = b0kVar3.T();
            if (zG4 || objT4 == m4cVar) {
                objT4 = new zi80(iu30Var, (byte) 12);
                b0kVar3.s0(objT4);
            }
            Function0 function3 = (Function0) objT4;
            boolean zG5 = b0kVar3.g(iu30Var);
            Object objT5 = b0kVar3.T();
            if (zG5 || objT5 == m4cVar) {
                objT5 = new zi80(iu30Var, (byte) 13);
                b0kVar3.s0(objT5);
            }
            b0kVar2 = b0kVar3;
            nz80.e(str2, function1, null, z2, z3, z4, z5, function2, function3, tra0Var, w9u0Var, z7, z8, z9, z10, (Function0) objT5, str3, b0kVar2, 0);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(this, function0, i, (byte) 22);
        }
    }

    public void e(int i, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            hhg1.n("Failed requirement.");
        } else {
            ((ohd) this.d).resumeWith(new pbn((Uri) this.b, bitmap));
        }
    }

    public ClipDescription getDescription() {
        return (ClipDescription) this.b;
    }

    public void h(qc0 qc0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1076616845);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qc0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mod.b(oi7.a.a((gw70) this.d), apo.r(-576609843, new qy90(qc0Var, z, iu30Var, this), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(this, qc0Var, z, iu30Var, i, (byte) 23);
        }
    }

    public void k(zpw zpwVar, uqw uqwVar) {
        Object obj;
        if (!(uqwVar instanceof uqw)) {
            uqwVar = null;
        }
        if (uqwVar != null) {
            ft0 ft0Var = new ft0(this, uqwVar, (byte) 9);
            Object obj2 = uqwVar.d;
            vu30 vu30Var = uqwVar.f;
            dtw dtwVar = zpwVar.U0;
            View view = dtwVar.w;
            dts dtsVar = (dts) uqwVar.g.invoke();
            uqw uqwVar2 = (uqwVar.e || vu30Var != null) ? uqwVar : null;
            dtwVar.k(uqwVar.c, (uqwVar2 == null || (obj = uqwVar2.d) == null) ? new joa0(obj2) : new hoa0(dtsVar, obj), vu30Var);
            int iIntValue = ((Number) ft0Var.invoke()).intValue();
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) uqwVar.h.invoke(Integer.valueOf(iIntValue));
            if (layoutParams != null) {
                view.setLayoutParams(layoutParams);
            }
            view.setTag(2131430613, obj2);
            xhk1.d(view, new ypw(iIntValue, uqwVar));
        }
    }

    public void m(Drawable drawable) {
        ((ohd) this.d).resumeWith(new pbn((Uri) this.b, ((wfx) this.c).b()));
    }

    public void n() {
        w8p1.m();
        aod aodVar = (aod) this.b;
        w8p1.m();
        ny8 ny8Var = (ny8) aodVar.c;
        Objects.requireNonNull(ny8Var);
        vnd vndVar = (vnd) aodVar.b;
        Objects.requireNonNull(vndVar);
        g280 g280Var = ny8Var.a;
        Objects.requireNonNull(g280Var);
        g280Var.a();
        g280 g280Var2 = ny8Var.a;
        Objects.requireNonNull(g280Var2);
        poz0.F(((j2t) g280Var2).e).b(new znd(vndVar, (byte) 0), x2g0.A());
        g280 g280Var3 = ny8Var.b;
        if (g280Var3 != null) {
            g280Var3.a();
            poz0.F(((j2t) ny8Var.b).e).b(new znd((vnd) null, (byte) 1), x2g0.A());
        }
    }

    public qx81 o(ob11 ob11Var, o8a0 o8a0Var, qx81 qx81Var) {
        e0h1 e0h1VarW;
        boolean z;
        qx81 qx81Var2;
        h0h1 h0h1VarG;
        h0h1 h0h1Var;
        Iterator it;
        boolean z2;
        f1h1 f1h1Var;
        Object next;
        List listL1;
        h0h1 h0h1Var2;
        e1h1 e1h1VarC;
        beg begVarK;
        int iX;
        st60 st60Var = this;
        ob11 ob11Var2 = ob11Var;
        o8a0 o8a0Var2 = o8a0Var;
        int i = o8a0Var2.a;
        int i2 = o8a0Var2.b;
        boolean z3 = o8a0Var2.d;
        o860 o860Var = (o860) st60Var.d;
        uw0 uw0Var = (uw0) o860Var.b;
        if (qx81Var == null || (e0h1VarW = qx81Var.s0()) == null) {
            e0h1VarW = prn1.w(new eqb0(o860Var, ob11Var2, false));
        }
        mb11 mb11Var = ob11Var2.b;
        boolean z4 = false;
        if (mb11Var instanceof mb11) {
            mb11 mb11Var2 = mb11Var;
            qx81Var2 = null;
            kf30 kf30VarD = mb11Var2.d();
            if (kf30VarD == null) {
                throw new AssertionError("Class type should have a FQ name: " + mb11Var);
            }
            if (z3 && kf30VarD.equals(t8a0.a)) {
                wd11 wd11Var = (wd11) uw0Var.c;
                ajn0 ajn0VarE = ajn0.e(i1o1.i(wd11.d[0].getName()));
                beg begVarG = ((zpi0) wd11Var.b.getValue()).g(ajn0VarE, 8);
                beg begVar = begVarG instanceof beg ? begVarG : null;
                if (begVar == null) {
                    begVarK = wd11Var.a.p(new heg(sfb1.i, ajn0VarE), Collections.singletonList(1));
                    z = z3;
                } else {
                    z = z3;
                    begVarK = begVar;
                }
            } else {
                g6b0 g6b0Var = ((ajm0) uw0Var.X).e;
                heg hegVarF = j8a0.f(kf30VarD);
                begVarK = hegVarF != null ? g6b0Var.k(hegVarF.a()) : null;
                if (begVarK == null) {
                    z = z3;
                    begVarK = null;
                } else if (j8a0.k.containsKey(iht.f(begVarK))) {
                    if (i2 == 3 || i == 1) {
                        z = z3;
                    } else {
                        cc11 cc11Var = (zb11) o7h.C0(ob11Var2.c());
                        z = z3;
                        cc11 cc11Var2 = cc11Var instanceof cc11 ? cc11Var : null;
                        if (cc11Var2 != null && cc11Var2.c() != null && u890.j(f46.k0(cc11Var2.a.getUpperBounds()), Object.class)) {
                            lf30 lf30VarF = iht.f(begVarK);
                            String str = j8a0.a;
                            kf30 kf30VarH = j8a0.h(lf30VarF);
                            if (kf30VarH == null) {
                                eg.n("Given class ", begVarK, " is not a read-only collection");
                                return null;
                            }
                            y0h1 y0h1Var = (y0h1) o7h.C0(kht.e(begVarK).k(kf30VarH).g().getParameters());
                            if (y0h1Var != null && (iX = y0h1Var.x()) != 0 && iX != 3) {
                            }
                        }
                    }
                    kf30 kf30VarH2 = j8a0.h(iht.f(begVarK));
                    if (kf30VarH2 == null) {
                        eg.n("Given class ", begVarK, " is not a read-only collection");
                        return null;
                    }
                    begVarK = kht.e(begVarK).k(kf30VarH2);
                } else {
                    z = z3;
                }
            }
            if (begVarK == null) {
                lmw lmwVar = (lmw) ((q881) uw0Var.i).b;
                if (lmwVar == null) {
                    u890.C("resolver");
                    throw null;
                }
                begVarK = lmwVar.x(mb11Var2);
            }
            if (begVarK == null || (h0h1VarG = begVarK.g()) == null) {
                throw new UnsupportedOperationException("Type not found: " + ob11Var2.a);
            }
        } else {
            z = z3;
            qx81Var2 = null;
            if (!(mb11Var instanceof ac11)) {
                bhn0.A(mb11Var, "Unknown classifier kind: ");
                return null;
            }
            y0h1 y0h1VarB = ((b1h1) st60Var.b).b((ac11) mb11Var);
            h0h1VarG = y0h1VarB != null ? y0h1VarB.g() : null;
        }
        if (h0h1VarG == null) {
            return qx81Var2;
        }
        boolean z5 = (i2 == 3 || z || i == 1) ? false : true;
        if (u890.j(qx81Var != null ? qx81Var.t0() : qx81Var2, h0h1VarG) && !ob11Var2.d() && z5) {
            return qx81Var.A0(true);
        }
        boolean z6 = ob11Var2.d() || (ob11Var2.c().isEmpty() && !h0h1VarG.getParameters().isEmpty());
        List parameters = h0h1VarG.getParameters();
        if (!z6) {
            h0h1Var = h0h1VarG;
            if (parameters.size() == ob11Var.c().size()) {
                ba80 ba80VarU1 = o7h.u1(ob11Var.c());
                ArrayList arrayList = new ArrayList(q7h.U(ba80VarU1, 10));
                Iterator it2 = ba80VarU1.iterator();
                while (true) {
                    ca80 ca80Var = (ca80) it2;
                    if (!((Iterator) ca80Var.c).hasNext()) {
                        listL1 = o7h.l1(arrayList);
                        break;
                    }
                    aa80 aa80Var = (aa80) ca80Var.next();
                    int i3 = aa80Var.a;
                    cc11 cc11Var3 = (zb11) aa80Var.b;
                    parameters.size();
                    y0h1 y0h1Var2 = (y0h1) parameters.get(i3);
                    o8a0 o8a0VarU = bs51.u(2, z4, (drb0) null, 7);
                    y0h1Var2.getClass();
                    if (cc11Var3 instanceof cc11) {
                        cc11 cc11Var4 = cc11Var3;
                        zb11 zb11VarC = cc11Var4.c();
                        int i4 = !u890.j(f46.k0(cc11Var4.a.getUpperBounds()), Object.class) ? 3 : 2;
                        if (zb11VarC == null || !(y0h1Var2.x() == 1 || i4 == y0h1Var2.x())) {
                            it = it2;
                            z2 = false;
                            f1h1Var = o1h1.k(y0h1Var2, o8a0VarU);
                        } else {
                            if (cc11Var4.c() == null) {
                                hhg1.n("Nullability annotations on unbounded wildcards aren't supported");
                                return null;
                            }
                            Iterator it3 = new eqb0(o860Var, cc11Var4, false).iterator();
                            while (true) {
                                mf20 mf20Var = (mf20) it3;
                                if (!mf20Var.hasNext()) {
                                    it = it2;
                                    next = null;
                                    break;
                                }
                                next = mf20Var.next();
                                pf5 pf5Var = (pf5) next;
                                kf30[] kf30VarArr = d8a0.b;
                                it = it2;
                                int length = kf30VarArr.length;
                                Iterator it4 = it3;
                                int i5 = 0;
                                while (i5 < length) {
                                    int i6 = length;
                                    int i7 = i5;
                                    if (u890.j(pf5Var.b(), kf30VarArr[i5])) {
                                        break;
                                    }
                                    i5 = i7 + 1;
                                    length = i6;
                                }
                                it2 = it;
                                it3 = it4;
                            }
                            pf5 pf5Var2 = (pf5) next;
                            z2 = false;
                            a8b0 a8b0VarL = st60Var.L(zb11VarC, bs51.u(2, false, (drb0) null, 7));
                            if (pf5Var2 != null) {
                                ArrayList arrayListM0 = o7h.M0(a8b0VarL.getAnnotations(), pf5Var2);
                                a8b0VarL = rzn1.z(a8b0VarL, arrayListM0.isEmpty() ? rzs0.g : new hg5(arrayListM0, (byte) 0));
                            }
                            f1h1Var = rzn1.n(a8b0VarL, i4, y0h1Var2);
                        }
                    } else {
                        it = it2;
                        z2 = false;
                        f1h1Var = new f1h1(1, st60Var.L(cc11Var3, o8a0VarU));
                    }
                    arrayList.add(f1h1Var);
                    it2 = it;
                    z4 = z2;
                }
            } else {
                List list = parameters;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(new f1h1(1, bkz.b(zjz.S0, new String[]{((y0h1) it5.next()).getName().b()})));
                }
                listL1 = o7h.l1(arrayList2);
            }
        } else {
            List<y0h1> list2 = parameters;
            ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
            for (y0h1 y0h1Var3 : list2) {
                if (rzn1.w(y0h1Var3, qx81Var2, o8a0Var2.e)) {
                    e1h1VarC = o1h1.k(y0h1Var3, o8a0Var2);
                    h0h1Var2 = h0h1VarG;
                } else {
                    h0h1 h0h1Var3 = h0h1VarG;
                    h0h1Var2 = h0h1Var3;
                    e1h1VarC = eoc.c(y0h1Var3, o8a0.a(o8a0Var, 0, ob11Var.d(), (Set) null, (qx81) null, 59), new wvb0((voe0) uw0Var.d, new s8a0(st60Var, y0h1Var3, o8a0Var, h0h1Var3, ob11Var2)));
                }
                arrayList3.add(e1h1VarC);
                ob11Var2 = ob11Var;
                o8a0Var2 = o8a0Var;
                st60Var = st60Var;
                h0h1VarG = h0h1Var2;
                qx81Var2 = null;
            }
            h0h1Var = h0h1VarG;
            listL1 = arrayList3;
        }
        return y3o1.i0(listL1, e0h1VarW, h0h1Var, z5);
    }

    public jhm p(String str, int i, boolean z) {
        String str2;
        int i2;
        int iC = l1d.C(i);
        if (iC == 0) {
            str2 = "track_ignore_in_recommendations";
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            str2 = "playlist_entity_ignore_in_recommendations";
        }
        String str3 = str2;
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            i2 = z ? 2131956648 : 2131956646;
        } else {
            if (iC2 != 1) {
                eg.o();
                return null;
            }
            i2 = z ? 2131956647 : 2131956645;
        }
        return new jhm(str3, (hux) (z ? irx.c : gux.c), (fhm) null, (Integer) null, ((dg30) this.c).getString(i2), false, (tm81) null, new ihm(new ygm(3), new ghm(hh60.e1, new cl1(z, str, (byte) 18)), new tb60(z, this, str, i)), 236);
    }

    public l420 q(boolean z) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 9:
                oi oiVar = (oi) this.c;
                l420 l420VarN = oiVar.n(((dg30) obj).getCacheDir(), "profile");
                if (l420VarN.b.exists() || l420VarN.mkdirs()) {
                    try {
                        return oiVar.x("profile_", z ? ".png" : ".jpg", l420VarN);
                    } catch (IOException unused) {
                        return null;
                    }
                }
                Logger.d("Could not make output directory: %s", new Object[]{l420VarN.toString()});
                return null;
            default:
                fya fyaVar = (fya) this.b;
                File cacheDir = ((Context) obj).getCacheDir();
                oi oiVar2 = fyaVar.a;
                l420 l420VarN2 = oiVar2.n(cacheDir, "imagepicker");
                if (l420VarN2.b.exists() || l420VarN2.mkdirs()) {
                    try {
                        return oiVar2.x("imagepicker_", z ? ".png" : ".jpg", l420VarN2);
                    } catch (IOException unused2) {
                        return null;
                    }
                }
                Logger.d("Could not make output directory: %s", new Object[]{l420VarN2.toString()});
                return null;
        }
    }

    public Uri r() {
        l420 l420VarQ = q(false);
        if (l420VarQ == null) {
            return null;
        }
        String path = l420VarQ.b.getPath();
        Context context = (Context) this.d;
        ComponentName componentName = new ComponentName(context, (Class<?>) ImagePickerFileProvider.class);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.getComponentEnabledSetting(componentName) != 1) {
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
        return FileProvider.getUriForFile(context, String.format("%s.%s", Arrays.copyOf(new Object[]{(String) this.c, "imagepicker"}, 2)), new File(path));
    }

    public Uri s(Bitmap bitmap) {
        l420 l420VarQ = q(false);
        Uri uriFromFile = l420VarQ == null ? null : Uri.fromFile(l420VarQ);
        if (uriFromFile == null) {
            Logger.d("Error creating profile image", new Object[0]);
            return null;
        }
        try {
            OutputStream outputStreamOpenOutputStream = ((dg30) this.d).getContentResolver().openOutputStream(uriFromFile);
            if (outputStreamOpenOutputStream == null) {
                Logger.d("Error opening profile image", new Object[0]);
                return null;
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.close();
            return uriFromFile;
        } catch (IOException e) {
            Logger.e(e, "Error writing profile image", new Object[0]);
            return uriFromFile;
        }
    }

    public boolean test(Object obj, Object obj2) {
        if (obj.equals(obj2)) {
            return ((yqg) this.d).b() <= ((Number) ((ft30) this.c).invoke(obj2)).longValue() + ((o811) this.b).a;
        }
        return false;
    }

    public tqt u() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        uo5.u();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strT = t((String) this.d, (HashMap) this.b);
            Log.isLoggable("FirebaseCrashlytics", 2);
            httpsURLConnection = (HttpsURLConnection) new URL(strT).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i = bufferedReader.read(cArr);
                            if (i == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i);
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new tqt(responseCode, string, (byte) 2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public int v(int i) {
        uqw uqwVar = (uqw) ((ft30) this.d).invoke(Integer.valueOf(i));
        if (uqwVar instanceof uqw) {
            return w(uqwVar.b) * (-1);
        }
        return 0;
    }

    public int w(laa laaVar) {
        yfu yfuVar = (yfu) this.c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) yfuVar.b;
        Object objValueOf = linkedHashMap.get(laaVar);
        if (objValueOf == null) {
            objValueOf = Integer.valueOf(((AtomicInteger) yfuVar.c).getAndIncrement());
            linkedHashMap.put(laaVar, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }

    public void x(String str, String str2) {
        ((HashMap) this.c).put(str, str2);
    }

    public boolean y() {
        return ((InputMethodManager) ((znb0) this.b).getValue()).isActive((View) this.d);
    }

    public void z(tm70 tm70Var, int i) {
        uqw uqwVar = (uqw) ((ft30) this.d).invoke(Integer.valueOf(i));
        if (tm70Var instanceof zpw) {
            k((zpw) tm70Var, uqwVar);
        } else if (tm70Var instanceof v6k1) {
            bhn0.d();
        } else {
            eg.o();
        }
    }

    public void f() {
    }

    public void g(Drawable drawable) {
    }

    public st60(m021 m021Var, ro30 ro30Var, fc3 fc3Var, Intent intent, String str) {
        this.a = (byte) 13;
        this.d = m021Var;
        this.b = fc3Var;
        this.c = intent;
    }

    public st60(lzn0 lzn0Var, ikp ikpVar) {
        this.a = (byte) 23;
        this.d = lzn0Var;
        this.b = ikpVar;
        this.c = new txk0((byte) 18);
    }

    public st60(ft30 ft30Var, nd70 nd70Var) {
        this.a = (byte) 7;
        this.d = ft30Var;
        this.b = nd70Var;
        this.c = new yfu((byte) 2);
    }

    public st60(gw70 gw70Var, hl00 hl00Var, mhc mhcVar, yup0 yup0Var) {
        this.a = (byte) 27;
        this.d = gw70Var;
        this.b = hl00Var;
        this.c = yup0Var;
    }

    public st60(Context context, xs80 xs80Var) {
        this.a = (byte) 14;
        this.d = context;
        this.b = xs80Var;
        this.c = new idd1(new nd70(this, (byte) 9));
    }

    public st60(dg30 dg30Var, String str, g420 g420Var) {
        this.a = (byte) 9;
        this.d = dg30Var;
        this.b = str;
        this.c = g420Var.a();
    }

    public st60(String str, HashMap map) {
        this.a = (byte) 4;
        this.d = str;
        this.b = map;
        this.c = new HashMap();
    }

    public st60(o860 o860Var, b1h1 b1h1Var) {
        this.a = (byte) 29;
        this.d = o860Var;
        this.b = b1h1Var;
        this.c = new vnd1(new eoc((byte) 21));
    }

    public st60(Application application, e831 e831Var) {
        this.a = (byte) 22;
        this.d = application;
        this.b = e831Var;
        this.c = new Handler(Looper.getMainLooper());
    }

    public st60(View view) {
        this.a = (byte) 16;
        this.d = view;
        this.b = dm5.S(3, new g030(this, (byte) 8));
        this.c = new up41(view);
    }

    public st60(i870 i870Var, bx40 bx40Var, y570 y570Var) {
        this.a = (byte) 5;
        this.c = i870Var;
        this.d = bx40Var;
        this.b = y570Var;
    }

    public /* synthetic */ st60(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
