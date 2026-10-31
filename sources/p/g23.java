package p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.bluejay.upload.impl.worker.AttachmentUploadWorker;
import com.spotify.playlistmixing.endpoints.MixingReorderingError;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g23 implements Function, t1s0, iy5 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public g23(BluetoothGattServer bluetoothGattServer, Set set, v940 v940Var) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        this.a = (byte) 14;
        this.b = bluetoothGattServer;
        this.c = v940Var;
        BluetoothGattService bluetoothGattService = new BluetoothGattService(tgl.a, 0);
        HashSet hashSet = new HashSet();
        ArrayList<de9> arrayList = new ArrayList();
        for (Object obj : set) {
            UUID uuid = (ee9) obj;
            Map map = fe9.a;
            if (hashSet.add(uuid instanceof ce9 ? ((ce9) uuid).b : uuid)) {
                arrayList.add(obj);
            }
        }
        for (de9 de9Var : arrayList) {
            if (de9Var instanceof de9) {
                bluetoothGattCharacteristic = new BluetoothGattCharacteristic(de9Var.a, 8, 16);
            } else if (de9Var instanceof be9) {
                be9 be9Var = (be9) de9Var;
                bluetoothGattCharacteristic = new BluetoothGattCharacteristic(be9Var.a, 2, 1);
                byte[] bArr = be9Var.b;
                if (bArr != null) {
                    bluetoothGattCharacteristic.setValue(bArr);
                }
            } else {
                if (!(de9Var instanceof ce9)) {
                    eg.o();
                    throw null;
                }
                bluetoothGattCharacteristic = new BluetoothGattCharacteristic(((ce9) de9Var).b, 8, 16);
            }
            bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
        }
        if (!((BluetoothGattServer) this.b).addService(bluetoothGattService)) {
            n57.s("Failed to add Bluetooth GATT service");
        }
        this.d = bluetoothGattService;
    }

    public static CoordinatorLayout m(ViewGroup viewGroup) {
        if (viewGroup instanceof CoordinatorLayout) {
            return (CoordinatorLayout) viewGroup;
        }
        if (viewGroup.getParent() != null) {
            return m((ViewGroup) viewGroup.getParent());
        }
        return null;
    }

    public static void n(ViewGroup viewGroup) {
        View childAt;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                childAt = null;
                break;
            }
            int i2 = i + 1;
            childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                tw20.p();
                return;
            } else if (u890.j(childAt.getTag(), "anchor_chip_view")) {
                break;
            } else {
                i = i2;
            }
        }
        if (childAt != null) {
            viewGroup.removeView(childAt);
        }
    }

    public static void o(g23 g23Var, a930 a930Var, w741 w741Var, Object obj) {
        hj7 hj7Var = new hj7(a930Var);
        synchronized (((pvc) g23Var.d)) {
            try {
                if (obj == null) {
                    ((nen0) g23Var.c).m(hj7Var, new gj7(null));
                } else {
                    ((ydf0) g23Var.b).d(hj7Var, new gj7(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.iy5
    public Object a(jy5 jy5Var, lnm lnmVar) {
        return (((Boolean) ((xe01) ((kr60) this.d).b).a.getValue()).booleanValue() ? (ct50) this.c : (laz) this.b).a(jy5Var, lnmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x03bd, code lost:
    
        if (p.nhc1.R(r0, ":collection", false) != false) goto L152;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g23.apply(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object b(qfk0 qfk0Var, onm onmVar) {
        k06 k06Var;
        Object objD;
        if (onmVar instanceof k06) {
            k06Var = (k06) onmVar;
            int i = k06Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                k06Var.c = i - os00.INVALID_ID;
            } else {
                k06Var = new k06(this, onmVar);
            }
        } else {
            k06Var = new k06(this, onmVar);
        }
        k06 k06Var2 = k06Var;
        Object obj = k06Var2.a;
        int i2 = k06Var2.c;
        if (i2 == 0) {
            hm5.M(obj);
            yge0 yge0Var = (yge0) this.d;
            i8h1 i8h1Var = (i8h1) ((kly0) yge0Var.b).get();
            x6h1 x6h1VarC = ((yok0) yge0Var.c).b.c();
            x6h1VarC.i.add(new a7h1("apply_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            b7x b7xVar = b7x.a;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
            zhk0 zhk0Var = (vhk0) this.c;
            String str = qfk0Var.a;
            String str2 = (String) this.b;
            List list = qfk0Var.c;
            List list2 = qfk0Var.b;
            k06Var2.c = 1;
            z6x z6xVar = z6x.a;
            objD = zhk0Var.d(str, str2, list, list2, z6xVar, z6xVar, z6xVar, k06Var2);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objD = ((e331) obj).a;
        }
        Throwable thA = e331.a(objD);
        if (thA != null) {
            return thA instanceof MixingReorderingError.RevisionConflict ? rgk0.a : qgk0.a;
        }
        return sgk0.a;
    }

    public Observable c() {
        return ((BehaviorSubject) this.c).distinctUntilChanged();
    }

    public mr20 d() {
        n2s0 n2s0Var = (n2s0) this.c;
        return new qsc0(n2s0Var.c, n2s0Var, e3s0.g, (byte) 19);
    }

    public void e() {
        n57.e("Partner Integration is only available when Amazon Alexa app is already installed.");
    }

    @Override // p.iy5
    public Object f(int i, lnm lnmVar) {
        return (((Boolean) ((xe01) ((kr60) this.d).b).a.getValue()).booleanValue() ? (ct50) this.c : (laz) this.b).f(i, lnmVar);
    }

    public void g(tv80 tv80Var) {
        fn31.T(smo1.e(flo1.l(op71.f(), igu.b)), null, 0, new vs0(this, tv80Var, (lnm) null, (byte) 2), 3);
    }

    public void h(UUID uuid, Uri uri, String str, hxh1 hxh1Var) throws IOException {
        String type;
        nes0 nes0VarA;
        Integer num;
        Integer num2;
        Context context = ((qfl1) this.c).a;
        boolean z = hxh1Var instanceof gxh1;
        if (z) {
            type = "application/pdf";
        } else {
            if (!(hxh1Var instanceof fxh1)) {
                eg.o();
                return;
            }
            type = context.getContentResolver().getType(uri);
            if (type == null && (type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()))) == null) {
                type = "";
            }
        }
        File file = new File(context.getFilesDir(), eqq.m("upload_", UUID.randomUUID()));
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            hhg1.n("Cannot open file for reading");
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                o0c.w(inputStreamOpenInputStream, fileOutputStream);
                fileOutputStream.close();
                inputStreamOpenInputStream.close();
                if (z) {
                    nes0VarA = ((oes0) this.d).a(file);
                } else {
                    if (!(hxh1Var instanceof fxh1)) {
                        eg.o();
                        return;
                    }
                    nes0VarA = null;
                }
                if (nes0VarA != null && nes0VarA.a == null) {
                    Logger.k(f4i1.f("Could not read PDF metadata for ", str, "; uploading without it."), new Object[0]);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("file_path", file.getAbsolutePath());
                linkedHashMap.put("content_type", type);
                linkedHashMap.put("file_name", str);
                linkedHashMap.put("file_type", hxh1Var.toString());
                if (nes0VarA != null && (num2 = nes0VarA.a) != null) {
                    linkedHashMap.put("page_count", Integer.valueOf(num2.intValue()));
                }
                if (nes0VarA != null && (num = nes0VarA.b) != null) {
                    linkedHashMap.put("character_count", Integer.valueOf(num.intValue()));
                }
                ewq ewqVar = new ewq(linkedHashMap);
                o0c.N(ewqVar);
                awl1.d(((fyh1) this.b).a).a(new ciq0(AttachmentUploadWorker.class).g(uuid).i(ewqVar).a("com.spotify.bluejay.attachment_upload").a("com.spotify.bluejay.attachment_upload.file_path:" + file.getAbsolutePath()).b());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u890.p(inputStreamOpenInputStream, th3);
                throw th4;
            }
        }
    }

    public LocaleList i() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (((pvc) this.d)) {
            try {
                LocaleList localeList2 = (LocaleList) this.c;
                if (localeList2 != null && localeList == ((android.os.LocaleList) this.b)) {
                    return localeList2;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new ehe0(localeList.get(i)));
                }
                LocaleList localeList3 = new LocaleList(arrayList);
                this.b = localeList;
                this.c = localeList3;
                return localeList3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public mr20 k() {
        return rqt0.u(h4p1.g(new l4f0((s2s0) this.d, e3s0.g, (lnm) null, (byte) 18)));
    }

    public fai0 l(ito itoVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        fai0 fai0Var = (fai0) linkedHashMap.get(itoVar);
        if (fai0Var != null) {
            return fai0Var;
        }
        fai0 fai0Var2 = new fai0();
        fai0Var2.n(itoVar.f, new df3(fai0Var2, (byte) 3));
        linkedHashMap.put(itoVar, fai0Var2);
        return fai0Var2;
    }

    public void p() {
        r2b1 r2b1Var = (r2b1) this.b;
        r2b1Var.getClass();
        r2b1Var.d(new gga1(r2b1Var, (byte) 9));
        em3 em3Var = (em3) this.c;
        onv0 onv0Var = (onv0) this.d;
        em3Var.p(onv0Var.b(), onv0Var.a(), "registration");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(a930 a930Var, w741 w741Var, i24 i24Var, onm onmVar) {
        ij7 ij7Var;
        hj7 hj7Var;
        if (onmVar instanceof ij7) {
            ij7Var = (ij7) onmVar;
            int i = ij7Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                ij7Var.d = i - os00.INVALID_ID;
            } else {
                ij7Var = new ij7(this, onmVar);
            }
        } else {
            ij7Var = new ij7(this, onmVar);
        }
        Object obj = ij7Var.b;
        Object obj2 = d9n.a;
        int i2 = ij7Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            w741Var.getClass();
            hj7 hj7Var2 = new hj7(a930Var);
            synchronized (((pvc) this.d)) {
                try {
                    gj7 gj7Var = (gj7) ((ydf0) this.b).c(hj7Var2);
                    if (gj7Var == null) {
                        gj7Var = (gj7) ((nen0) this.c).g(hj7Var2);
                    }
                    if (gj7Var != null) {
                        return gj7Var.a;
                    }
                    ij7Var.a = hj7Var2;
                    ij7Var.d = 1;
                    Object objInvoke = i24Var.invoke(ij7Var);
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    obj = objInvoke;
                    hj7Var = hj7Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hj7Var = ij7Var.a;
            hm5.M(obj);
        }
        synchronized (((pvc) this.d)) {
            try {
                if (obj == null) {
                    ((nen0) this.c).m(hj7Var, new gj7(null));
                } else {
                    ((ydf0) this.b).d(hj7Var, new gj7(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public void r(ito itoVar, ViewGroup viewGroup) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        BehaviorSubject behaviorSubjectF = (BehaviorSubject) linkedHashMap.get(itoVar);
        if (behaviorSubjectF == null) {
            behaviorSubjectF = BehaviorSubject.f();
            linkedHashMap.put(itoVar, behaviorSubjectF);
        }
        if (itoVar.i) {
            mmr0 mmr0Var = (mmr0) ((zu30) this.b).J(behaviorSubjectF, Integer.valueOf((int) TypedValue.applyDimension(1, 20.0f, viewGroup.getContext().getResources().getDisplayMetrics())), new nx2(this, itoVar, (byte) 9), new xb2(viewGroup, (byte) 15));
            wpw wpwVar = (wpw) mmr0Var.a;
            Object obj = mmr0Var.b;
            CoordinatorLayout coordinatorLayoutM = m(viewGroup);
            if (coordinatorLayoutM != null) {
                Context context = coordinatorLayoutM.getContext();
                tka0 tka0Var = dtw.C;
                context.getClass();
                View view = mhc.b(context, coordinatorLayoutM, wpwVar, obj, (ipb1) null, ContentType.LONG_FORM_ON_DEMAND).w;
                view.setTag("anchor_chip_view");
                h3n h3nVar = new h3n(-2, -2);
                h3nVar.l = null;
                h3nVar.k = null;
                h3nVar.f = 2131428387;
                h3nVar.d = 81;
                rwq0.s(view, o40.Y);
                view.setLayoutParams(h3nVar);
                coordinatorLayoutM.addView(view);
            }
        }
    }

    public g23(j23 j23Var, String str, String str2) {
        this.a = (byte) 2;
        this.c = j23Var;
        this.b = str;
        this.d = str2;
    }

    public /* synthetic */ g23(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public g23(mw7 mw7Var) {
        this.a = (byte) 29;
        this.b = mw7Var;
        this.c = BehaviorSubject.f();
        this.d = new su7(this, (byte) 0);
    }

    public g23(zu30 zu30Var) {
        this.a = (byte) 12;
        this.b = zu30Var;
        this.d = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    public g23(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                ir20 ir20Var = new ir20((byte) 6);
                ir20Var.b = Float.NaN;
                this.b = ir20Var;
                this.c = new b8r();
                break;
            case 25:
                this.b = new ydf0(16);
                long[] jArr = hj41.a;
                this.c = new nen0();
                this.d = new pvc((byte) 26);
                break;
            default:
                this.d = new pvc((byte) 26);
                break;
        }
    }

    public g23(b6y b6yVar, vfu0 vfu0Var, c23 c23Var, yla ylaVar, uic uicVar) {
        this.a = (byte) 3;
        this.b = b6yVar;
        this.c = vfu0Var;
        this.d = c23Var;
    }

    public g23(x5j1 x5j1Var) {
        this.a = (byte) 17;
        this.b = x5j1Var;
        this.c = Choreographer.getInstance();
        this.d = new od5(this, (byte) 0);
    }
}
