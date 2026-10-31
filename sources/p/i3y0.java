package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Base64;
import android.view.View;
import app.rive.ViewModelInstance;
import com.ravelin.core.model.Events;
import com.ravelin.core.repository.RavelinFingerprintWorker;
import com.ravelin.core.repository.RavelinWorker;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i3y0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3y0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                i3y0 i3y0Var = new i3y0((u6y0) obj3, (String) obj2, lnmVar, (byte) 0);
                i3y0Var.d = obj;
                return i3y0Var;
            case 1:
                return new i3y0((u6y0) obj3, (String) obj2, this.d, lnmVar, (byte) 1);
            case 2:
                return new i3y0((u6y0) obj3, (String) obj2, this.d, lnmVar, (byte) 2);
            case 3:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 3);
            case 4:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 4);
            case 5:
                return new i3y0(this.d, (String) obj2, obj3, lnmVar, (byte) 5);
            case 6:
                return new i3y0(this.d, (String) obj2, obj3, lnmVar, (byte) 6);
            case 7:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 7);
            case 8:
                i3y0 i3y0Var2 = new i3y0((su01) obj3, (vr01) obj2, lnmVar, (byte) 8);
                i3y0Var2.d = obj;
                return i3y0Var2;
            case 9:
                i3y0 i3y0Var3 = new i3y0((dw01) obj3, (String) obj2, lnmVar, (byte) 9);
                i3y0Var3.d = obj;
                return i3y0Var3;
            case 10:
                i3y0 i3y0Var4 = new i3y0((iu30) obj3, (y011) obj2, lnmVar, (byte) 10);
                i3y0Var4.d = obj;
                return i3y0Var4;
            case 11:
                i3y0 i3y0Var5 = new i3y0((oa11) obj3, (ka11) obj2, lnmVar, (byte) 11);
                i3y0Var5.d = obj;
                return i3y0Var5;
            case 12:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 12);
            case 13:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 13);
            case 14:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 14);
            case 15:
                i3y0 i3y0Var6 = new i3y0((m021) obj3, (Uri) obj2, lnmVar, (byte) 15);
                i3y0Var6.d = obj;
                return i3y0Var6;
            case 16:
                i3y0 i3y0Var7 = new i3y0((wzn0) obj3, (gqb0) obj2, lnmVar, (byte) 16);
                i3y0Var7.d = obj;
                return i3y0Var7;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                i3y0 i3y0Var8 = new i3y0((Map) obj3, (ViewModelInstance) obj2, lnmVar, (byte) 18);
                i3y0Var8.d = obj;
                return i3y0Var8;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                i3y0 i3y0Var9 = new i3y0((hq41) obj3, (Bundle) obj2, lnmVar, (byte) 20);
                i3y0Var9.d = obj;
                return i3y0Var9;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                i3y0 i3y0Var10 = new i3y0((vw51) obj3, (String) obj2, lnmVar, (byte) 21);
                i3y0Var10.d = obj;
                return i3y0Var10;
            case 22:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 22);
            case 23:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 24);
            case 25:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 25);
            case 26:
                return new i3y0(this.d, (String) obj2, obj3, lnmVar, (byte) 26);
            case 27:
                return new i3y0(this.d, obj3, obj2, lnmVar, (byte) 27);
            case 28:
                i3y0 i3y0Var11 = new i3y0((p811) obj3, (dea0) obj2, lnmVar, (byte) 28);
                i3y0Var11.d = obj;
                return i3y0Var11;
            default:
                i3y0 i3y0Var12 = new i3y0((l891) obj3, (qmn) obj2, lnmVar, (byte) 29);
                i3y0Var12.d = obj;
                return i3y0Var12;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((cxc0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                return create((py21) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                create((bw01) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                create((ra11) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((z7d) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((tv80) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public final Object invokeSuspend(Object obj) {
        String string;
        o6y0 o6y0Var;
        Object sjm1Var;
        Object huzVar;
        Boolean m231Var;
        Boolean m231Var2;
        boolean z = true;
        int i = 0;
        o2r o2rVar = null;
        switch (this.a) {
            case 0:
                cxc0 cxc0Var = (cxc0) this.d;
                hm5.M(obj);
                if (cxc0Var.a()) {
                    Map map = cxc0Var.f.q;
                    Set set = h4d0.a;
                    String str = (String) map.get("generation_status");
                    if (str == null || (string = ihc1.e1(str).toString()) == null) {
                        string = "";
                    }
                    h4d0 h4d0VarU = qyo1.u(string);
                    h4d0VarU.getClass();
                    if (h4d0.a.contains(h4d0VarU)) {
                        u6y0 u6y0Var = ((u6y0) this.b).i;
                        fn31.T(u6y0Var.Y, (o8n) null, 0, new cqu0(u6y0Var, (String) this.c, o2rVar, (byte) 25), 3);
                    }
                }
                return rih1.a;
            case 1:
                hm5.M(obj);
                u6y0.l((u6y0) this.b, (String) this.c, 1, ((g6y0) this.d).b, 8);
                return rih1.a;
            case 2:
                hm5.M(obj);
                u6y0 u6y0Var2 = (u6y0) this.b;
                String str2 = (String) this.c;
                zxh zxhVar = (zxh) this.d;
                LinkedHashMap linkedHashMap = u6y0Var2.Z;
                h6y0 h6y0Var = (h6y0) linkedHashMap.get(str2);
                if (h6y0Var != null && (o6y0Var = h6y0Var.g) != null) {
                    ArrayList arrayListJ0 = o7h.J0(o6y0Var.c, zxhVar);
                    linkedHashMap.put(str2, h6y0.a(h6y0Var, (v6y0) null, false, (UUID) null, (xab1) null, arrayListJ0.isEmpty() ? null : o6y0.a(o6y0Var, arrayListJ0, 3), 63));
                }
                return rih1.a;
            case 3:
                hm5.M(obj);
                ry21 ry21VarE = ((cxc) ((xmu0) this.d).b).a((ln21) this.b).e();
                File file = (File) this.c;
                try {
                    if (ry21VarE.Q0) {
                        uz21 uz21Var = ry21VarE.g;
                        if (uz21Var.d() == 0) {
                            sjm1Var = new sjm1("Response body is empty");
                        } else {
                            InputStream inputStreamA = uz21Var.a();
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    o0c.w(inputStreamA, fileOutputStream);
                                    fileOutputStream.close();
                                    inputStreamA.close();
                                    sjm1Var = tjm1.a;
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
                                    u890.p(inputStreamA, th3);
                                    throw th4;
                                }
                            }
                        }
                    } else {
                        sjm1Var = new sjm1("Response code: " + ry21VarE.d);
                    }
                    ry21VarE.close();
                    return sjm1Var;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        u890.p(ry21VarE, th5);
                        throw th6;
                    }
                }
            case 4:
                hm5.M(obj);
                if (((u1z0) this.d).b instanceof s1z0) {
                    bka1.b(((v1z0) this.b).f, (aka1) this.c, fw80.e);
                }
                return rih1.a;
            case 5:
                hm5.M(obj);
                RavelinFingerprintWorker ravelinFingerprintWorker = (RavelinFingerprintWorker) this.d;
                c7n1 c7n1Var = ((RavelinWorker) ravelinFingerprintWorker).h;
                if (c7n1Var == null) {
                    u890.C("endpointClient");
                    throw null;
                }
                dxc dxcVarA = c7n1.a(c7n1Var, "token ".concat((String) this.c), (Events) this.b);
                if (ravelinFingerprintWorker.b()) {
                    return new v8d0();
                }
                sy21 sy21VarC = dxcVarA.c();
                if (ravelinFingerprintWorker.b()) {
                    return new v8d0();
                }
                sy21VarC.getClass();
                ry21 ry21Var = sy21VarC.a;
                if (ry21Var.Q0) {
                    return y8d0.a();
                }
                int i2 = ry21Var.d;
                if (i2 != 429) {
                    tr80 tr80Var = RavelinWorker.k;
                    int i3 = ((rr80) tr80Var).a;
                    int i4 = ((rr80) tr80Var).b;
                    if (i3 > i2 || i2 > i4) {
                        return new v8d0();
                    }
                }
                return new w8d0();
            case 6:
                hm5.M(obj);
                RavelinWorker ravelinWorker = (RavelinWorker) this.d;
                c7n1 c7n1Var2 = ravelinWorker.h;
                if (c7n1Var2 == null) {
                    u890.C("endpointClient");
                    throw null;
                }
                dxc dxcVarB = c7n1Var2.a.b("token ".concat((String) this.c), (Events) this.b);
                if (ravelinWorker.b()) {
                    return new v8d0();
                }
                sy21 sy21VarC2 = dxcVarB.c();
                if (ravelinWorker.b()) {
                    return new v8d0();
                }
                sy21VarC2.getClass();
                ry21 ry21Var2 = sy21VarC2.a;
                if (ry21Var2.Q0) {
                    return y8d0.a();
                }
                int i5 = ry21Var2.d;
                if (i5 != 429) {
                    tr80 tr80Var2 = RavelinWorker.k;
                    int i6 = ((rr80) tr80Var2).a;
                    int i7 = ((rr80) tr80Var2).b;
                    if (i6 > i5 || i5 > i7) {
                        return new v8d0();
                    }
                }
                return new w8d0();
            case 7:
                hm5.M(obj);
                vu30 vu30Var = (vu30) this.d;
                err0 err0Var = (hdn0) this.b;
                id01 id01Var = zc01.a;
                int iS = err0Var.s();
                ven0 ven0Var = (ven0) this.c;
                int iMax = Math.max(((List) ven0Var.getValue()).size() - 1, 0);
                if (iS > iMax) {
                    iS = iMax;
                }
                vu30Var.invoke(new Integer(iS), new Integer(((List) ven0Var.getValue()).size()));
                return rih1.a;
            case 8:
                ly21 ly21Var = (py21) this.d;
                hm5.M(obj);
                su01 su01Var = (su01) this.b;
                if (!su01Var.c) {
                    su01Var.c = true;
                    qyo1.p(su01Var.b);
                }
                ak01 ak01Var = new ak01((vr01) this.c, (byte) 3);
                ly21Var.getClass();
                if (ly21Var instanceof ly21) {
                    huzVar = ak01Var.invoke(ly21Var.a);
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    huzVar = new huz((wsc0) ((oy21) ly21Var).a, (byte) 10);
                }
                return (mr20) huzVar;
            case 9:
                bw01 bw01Var = (bw01) this.d;
                hm5.M(obj);
                ((dw01) this.b).b.put((String) this.c, bw01Var);
                return rih1.a;
            case 10:
                c9n c9nVar = (c9n) this.d;
                hm5.M(obj);
                s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new w73((iu30) this.b, (lnm) null, (byte) 13), 3);
                ((y011) this.c).a = s2tVarQ;
                return s2tVarQ;
            case 11:
                qa11 qa11Var = (ra11) this.d;
                hm5.M(obj);
                oa11 oa11Var = (oa11) this.b;
                ka11 ka11Var = (ka11) this.c;
                if (!u890.j(qa11Var, pa11.a)) {
                    if (!(qa11Var instanceof qa11)) {
                        eg.o();
                        return null;
                    }
                    o2r o2rVar2 = qa11Var.a;
                    if (u890.j(o2rVar2, ka11Var.a)) {
                        o2rVar = o2rVar2;
                    }
                }
                oa11Var.h(o2rVar, false);
                return rih1.a;
            case 12:
                hm5.M(obj);
                ((zr11) ((w2s) this.d).g).a(((qr11) this.b).a, (ou80) this.c);
                return rih1.a;
            case 13:
                hm5.M(obj);
                for (hdf0 hdf0Var : ((HashMap) ((fcf0) this.d).c()).values()) {
                    hdf0Var.getClass();
                    String str3 = hdf0Var.d;
                    if (hdf0Var.f == null && nhc1.Y(str3, "data:", false) && ihc1.w0(str3, "base64,", 0, false, 6) > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str3.substring(ihc1.v0(str3, ',', 0, 6) + 1), 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            hdf0Var.f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException unused) {
                            nue0.d("data URL did not have correct base64 format.");
                        }
                    }
                    Context context = (Context) this.b;
                    String str4 = (String) this.c;
                    if (hdf0Var.f == null && str4 != null) {
                        try {
                            InputStream inputStreamOpen = context.getAssets().open(str4 + str3);
                            inputStreamOpen.getClass();
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                hdf0Var.f = qpi1.e(BitmapFactory.decodeStream(inputStreamOpen, null, options2), hdf0Var.a, hdf0Var.b);
                            } catch (IllegalArgumentException unused2) {
                                nue0.d("Unable to decode image.");
                            }
                        } catch (IOException unused3) {
                            nue0.d("Unable to open asset.");
                        }
                    }
                    break;
                }
                return rih1.a;
            case 14:
                hm5.M(obj);
                rkb rkbVar = (rkb) this.d;
                Bitmap bitmap = (Bitmap) this.b;
                float f = ((m811) this.c).a;
                Bitmap bitmap2 = bitmap;
                while (i < 3) {
                    RenderScript renderScript = rkbVar.a;
                    ScriptIntrinsicBlur scriptIntrinsicBlur = rkbVar.b;
                    Bitmap.Config config = bitmap2.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), config);
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmap2);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScript, bitmapCreateBitmap);
                    scriptIntrinsicBlur.setRadius(yoi1.o(f, 1.0f, 25.0f));
                    scriptIntrinsicBlur.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlur.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    allocationCreateFromBitmap.destroy();
                    allocationCreateFromBitmap2.destroy();
                    if (bitmap2 != bitmap) {
                        bitmap2.recycle();
                    }
                    i++;
                    bitmap2 = bitmapCreateBitmap;
                }
                rkbVar.getClass();
                return bitmap2;
            case 15:
                hm5.M(obj);
                m021 m021Var = (m021) this.b;
                Uri uri = (Uri) this.c;
                try {
                    BitmapFactory.Options options3 = new BitmapFactory.Options();
                    options3.inJustDecodeBounds = true;
                    InputStream inputStreamOpenInputStream = ((Context) m021Var.b).getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options3);
                            inputStreamOpenInputStream.close();
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } catch (Throwable th8) {
                                u890.p(inputStreamOpenInputStream, th7);
                                throw th8;
                            }
                        }
                    }
                    int i8 = options3.outWidth;
                    int i9 = options3.outHeight;
                    if (i8 <= 0 || i9 <= 0 || Math.abs((i8 / i9) - 0.5625f) > 0.01f) {
                        z = false;
                    }
                    m231Var = Boolean.valueOf(z);
                } catch (Throwable th9) {
                    m231Var = new m231(th9);
                }
                return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
            case 16:
                ssw0 ssw0Var = (ssw0) this.d;
                hm5.M(obj);
                Set set2 = ((wzn0) this.b).a;
                gqb0 gqb0Var = (gqb0) this.c;
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    fn31.T(ssw0Var, (o8n) null, 0, new ciw0(ssw0Var, gqb0Var, (String) it.next(), false, null, (byte) 14), 3);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                hm5.M(obj);
                ok31.f((Throwable) this.d, (xi31) this.b, (jk31) this.c);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                c9n c9nVar2 = (c9n) this.d;
                hm5.M(obj);
                Map map2 = (Map) this.b;
                ViewModelInstance viewModelInstance = (ViewModelInstance) this.c;
                for (Map.Entry entry : map2.entrySet()) {
                    fn31.T(c9nVar2, (o8n) null, 0, new m311(viewModelInstance, (String) entry.getKey(), (iu30) entry.getValue(), (lnm) null, (byte) 24), 3);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                hc41 hc41Var = (hc41) this.d;
                njm njmVar = hc41Var.h;
                tqw tqwVar = (tqw) this.b;
                njmVar.b(tqwVar != null ? n3o1.y(tqwVar) : null);
                hc41Var.b.k(new er91((fs91) null, ((zb41) this.c).a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                mmr0 mmr0Var = (mmr0) this.d;
                hm5.M(obj);
                xh71.b(((hq41) this.b).c, (wa71) mmr0Var.a, (Bundle) this.c, wm71.b, (tv80) mmr0Var.b, (List) null, 16);
                return rih1.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                String str5 = (String) this.d;
                hm5.M(obj);
                return new m441(new ciw0((Object) str5, this.b, this.c, (lnm) null, (byte) 17));
            case 22:
                hm5.M(obj);
                dc61 dc61Var = (dc61) this.d;
                kt91 kt91Var = dc61Var.i;
                Context context2 = dc61Var.b;
                kt91Var.k(new er91((fs91) null, context2.getResources().getString(2131961642), (Integer) null, context2.getResources().getString(2131961641), (Integer) null, new kw6(dc61Var, (vb61) this.b, (String) this.c, (byte) 20), (cvr) null, (xq91) null, false));
                return rih1.a;
            case 23:
                hm5.M(obj);
                xh71 xh71Var = (xh71) ((o2n0) this.d).g;
                s371 s371Var = (s371) this.b;
                wa71 wa71Var = new wa71(s371Var.a, s371Var.b, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 124);
                vm71 vm71Var = new vm71(s371Var.c);
                tqw tqwVar2 = (tqw) this.c;
                xh71.b(xh71Var, wa71Var, (Bundle) null, vm71Var, tqwVar2 != null ? n3o1.y(tqwVar2) : null, (List) null, 18);
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                oi oiVar = (oi) ((eyh0) this.d).b;
                l420 l420Var = (l420) this.b;
                l420 l420VarP = oiVar.p(l420Var, (String) this.c);
                while (l420VarP.b.exists()) {
                    l420VarP = oiVar.p(l420Var, eyh0.h(".png"));
                }
                return l420VarP;
            case 25:
                hm5.M(obj);
                a1r0 a1r0Var = ((xh71) this.d).c;
                tv80 tv80Var = (tv80) this.b;
                a1r0.e(a1r0Var, new dwn0("spotify:share-sheet", "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null), (Bundle) this.c, 4);
                return rih1.a;
            case 26:
                hm5.M(obj);
                ps7 ps7Var = ((lo71) this.d).a;
                String str6 = (String) this.c;
                wpc wpcVar = ((kma) ps7Var.b).c;
                k2r k2rVar = wpcVar.e;
                g3r g3rVar = new g3r(wpcVar.a(k2rVar != null ? k2rVar.j() : null, 0), new n3r(Uri.parse(str6)));
                l420 l420Var2 = (l420) this.b;
                try {
                    avw0.c(g3rVar, l420Var2);
                    Uri uriFromFile = Uri.fromFile(l420Var2);
                    g3rVar.close();
                    return uriFromFile;
                } catch (Throwable th10) {
                    try {
                        throw th10;
                    } catch (Throwable th11) {
                        u890.p(g3rVar, th10);
                        throw th11;
                    }
                }
            case 27:
                hm5.M(obj);
                Long l = ((ta71) this.d).d;
                if (l != null) {
                    Function0 function0 = (Function0) this.b;
                    if (function0 == null) {
                        n57.e("Provide a seek done callback to reset the model after the seek was done");
                    } else {
                        function0.invoke();
                        uoa.m((uoa) this.c, l.longValue());
                    }
                }
                return rih1.a;
            case 28:
                jqd0 jqd0Var = (jqd0) ((dea0) this.c).h;
                z7d z7dVar = (z7d) this.d;
                hm5.M(obj);
                Class<?> cls = z7dVar.getClass();
                jd11 jd11Var = rc11.a;
                tka0 tka0VarB = jd11Var.b(cls);
                p811 p811Var = (p811) this.b;
                z7d z7dVar2 = (z7d) p811Var.a;
                if (!tka0VarB.equals(z7dVar2 != null ? jd11Var.b(z7dVar2.getClass()) : null)) {
                    p811Var.a = z7dVar;
                    if (z7dVar.equals(w7d.a)) {
                        t45 t45Var = (t45) jqd0Var.d;
                        if (t45Var != null) {
                            t45Var.g("load_latest_rows_data");
                        }
                        jqd0Var.y(2);
                    } else if (z7dVar instanceof x7d) {
                        t45 t45Var2 = (t45) jqd0Var.d;
                        if (t45Var2 != null) {
                            t45Var2.g("load_latest_rows_data");
                        }
                    } else if (!z7dVar.equals(y7d.a)) {
                        eg.o();
                        return null;
                    }
                }
                return rih1.a;
            default:
                tv80 tv80Var2 = (tv80) this.d;
                hm5.M(obj);
                spn spnVar = ((l891) this.b).a;
                vpn vpnVar = new vpn(z6x.a, true);
                String str7 = ((qmn) this.c).a;
                if (str7.length() > 0) {
                    try {
                        bzu0 bzu0VarC = oxu0.a.c(str7);
                        if ((bzu0VarC instanceof bzu0 ? bzu0VarC : null) == null) {
                            z = false;
                        }
                        m231Var2 = Boolean.valueOf(z);
                    } catch (Throwable th12) {
                        m231Var2 = new m231(th12);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (m231Var2 instanceof m231) {
                        m231Var2 = bool;
                    }
                    if (!m231Var2.booleanValue()) {
                        str7 = null;
                    }
                    break;
                } else {
                    str7 = null;
                }
                spn.b(spnVar, new cqn(str7, (String) null, vpnVar, 2), tv80Var2);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3y0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3y0(Object obj, String str, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = str;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3y0(u6y0 u6y0Var, String str, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = u6y0Var;
        this.c = str;
        this.d = obj;
    }
}
