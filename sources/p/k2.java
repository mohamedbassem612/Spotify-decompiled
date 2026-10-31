package p;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.tome.pageactivity.PageActivity;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                k2 k2Var = new k2((m2) obj2, lnmVar, (byte) 0);
                k2Var.b = obj;
                return k2Var;
            case 1:
                k2 k2Var2 = new k2((gu) obj2, lnmVar, (byte) 1);
                k2Var2.b = obj;
                return k2Var2;
            case 2:
                k2 k2Var3 = new k2((cp5) obj2, lnmVar, (byte) 2);
                k2Var3.b = obj;
                return k2Var3;
            case 3:
                k2 k2Var4 = new k2((zu30) obj2, lnmVar, (byte) 3);
                k2Var4.b = obj;
                return k2Var4;
            case 4:
                return new k2((nt0) this.b, (p1f0) obj2, lnmVar, (byte) 4);
            case 5:
                k2 k2Var5 = new k2((vt0) obj2, lnmVar, (byte) 5);
                k2Var5.b = obj;
                return k2Var5;
            case 6:
                return new k2((u11) this.b, (a1f0) obj2, lnmVar, (byte) 6);
            case 7:
                return new k2((iu30) this.b, (fi1) obj2, lnmVar, (byte) 7);
            case 8:
                return new k2((los) this.b, (ven0) obj2, lnmVar, (byte) 8);
            case 9:
                k2 k2Var6 = new k2((so1) obj2, lnmVar, (byte) 9);
                k2Var6.b = obj;
                return k2Var6;
            case 10:
                return new k2((iu30) this.b, (upo) obj2, lnmVar, (byte) 10);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new k2((bx1) this.b, (tu1) obj2, lnmVar, (byte) 11);
            case grn1.d /* 12 */:
                k2 k2Var7 = new k2((w62) obj2, lnmVar, (byte) 12);
                k2Var7.b = obj;
                return k2Var7;
            case 13:
                return new k2((String) this.b, (bab1) obj2, lnmVar, (byte) 13);
            case 14:
                return new k2((mwq0) this.b, (ven0) obj2, lnmVar, (byte) 14);
            case 15:
                return new k2((bv40) this.b, (String) obj2, lnmVar, (byte) 15);
            case 16:
                return new k2((wm2) this.b, (cn2) obj2, lnmVar, (byte) 16);
            case 17:
                return new k2((em0) this.b, (String) obj2, lnmVar, (byte) 17);
            case 18:
                return new k2((uz5) this.b, (Context) obj2, lnmVar, (byte) 18);
            case 19:
                return new k2((jt2) this.b, (Uri) obj2, lnmVar, (byte) 19);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new k2((ps3) this.b, (ven0) obj2, lnmVar, (byte) 20);
            case 21:
                return new k2((bab1) this.b, (gu3) obj2, lnmVar, (byte) 21);
            case 22:
                return new k2((ft3) this.b, (hb51) obj2, lnmVar, (byte) 22);
            case 23:
                return new k2((hb51) this.b, (iu30) obj2, lnmVar, (byte) 23);
            case 24:
                return new k2((bt3) this.b, (by41) obj2, lnmVar, (byte) 24);
            case 25:
                return new k2((tob1) this.b, (iu30) obj2, lnmVar, (byte) 25);
            case 26:
                return new k2((String) this.b, (ven0) obj2, lnmVar, (byte) 26);
            case 27:
                return new k2((s45) this.b, (pne1) obj2, lnmVar, (byte) 27);
            case 28:
                return new k2((jqq0) this.b, (bj5) obj2, lnmVar, (byte) 28);
            default:
                return new k2((ox5) this.b, (ComponentName) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException, IOException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                create((q2) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((au) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                throw null;
            case 3:
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((lx0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((go1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case grn1.d /* 12 */:
                create((bn70) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                return create((j5q0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException, IOException {
        s2j1 s2j1Var;
        int i;
        int i2;
        BitmapFactory.Options options;
        int i3;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        String str;
        File file;
        byte b = 1;
        int size = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                q2 q2Var = (q2) this.b;
                hm5.M(obj);
                m2 m2Var = (m2) this.c;
                m2Var.h.l(q2Var);
                if (q2Var.a.length() == 0 || q2Var.b.length() == 0) {
                    m2Var.h(new Throwable("No content available for this entity"));
                } else {
                    m2Var.i();
                }
                return rih1.a;
            case 1:
                au auVar = (au) this.b;
                hm5.M(obj);
                kq kqVar = ((gu) this.c).f;
                List list = auVar.b;
                size = list != null ? list.size() : 0;
                boolean z = auVar.d;
                boolean z2 = auVar.e;
                hma1 hma1VarEdit = kqVar.a.edit();
                hma1VarEdit.b(kq.b, size);
                hma1VarEdit.a(kq.c, z);
                hma1VarEdit.a(kq.d, z2);
                hma1VarEdit.g();
                return rih1.a;
            case 2:
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                ((poa0) mmr0Var.a).getClass();
                if (mmr0Var.b == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            case 3:
                List list2 = (List) this.b;
                hm5.M(obj);
                return new m441(new i50(list2, (zu30) this.c, (lnm) null));
            case 4:
                hm5.M(obj);
                ((nt0) this.b).c.f(((p1f0) this.c).h());
                return rih1.a;
            case 5:
                vt0 vt0Var = (vt0) this.c;
                bpb1 bpb1Var = vt0Var.j;
                lx0 lx0Var = (lx0) this.b;
                hm5.M(obj);
                int iC = l1d.C(lx0Var.a);
                if (iC == 0) {
                    ji0 ji0Var = lx0Var.c;
                    String str2 = ji0Var.t;
                    t45 t45Var = vt0Var.g.b;
                    if (t45Var != null) {
                        t45Var.b("request_identifier", str2);
                    }
                    bt0.a(vt0Var.f, at0.c, str2, Collections.singletonList(ji0Var.a), (String) null, 52);
                    bpb1Var.m((Object) null, ji0Var);
                } else if (iC == 1) {
                    bpb1Var.l((Object) null);
                }
                return rih1.a;
            case 6:
                hm5.M(obj);
                hj01 hj01Var = ((u11) this.b).j;
                a1f0 a1f0Var = (a1f0) this.c;
                String strC = hj01Var.c(v11.a(a1f0Var.d), a1f0Var.e.name());
                if (strC == null) {
                    strC = new m231(new NoSuchElementException("No cached reCAPTCHA token available"));
                }
                return new e331(strC);
            case 7:
                hm5.M(obj);
                iu30 iu30Var = (iu30) this.b;
                fi1 fi1Var = (fi1) this.c;
                iu30Var.invoke(dj20.f(fi1Var.a, fi1Var.b, fi1Var.c, fi1Var.d, fi1Var.e));
                return rih1.a;
            case 8:
                hm5.M(obj);
                ven0 ven0Var = (ven0) this.c;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    ((los) this.b).a(ixb.b);
                }
                return rih1.a;
            case 9:
                go1 go1Var = (go1) this.b;
                hm5.M(obj);
                so1 so1Var = (so1) this.c;
                if (!so1Var.d()) {
                    so1Var.i();
                }
                so1Var.W0.l(go1Var);
                return rih1.a;
            case 10:
                hm5.M(obj);
                ((iu30) this.b).invoke((upo) this.c);
                return rih1.a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                hm5.M(obj);
                ((bx1) this.b).invoke(s8p1.l((tu1) this.c));
                return rih1.a;
            case grn1.d /* 12 */:
                bn70 bn70Var = (bn70) this.b;
                hm5.M(obj);
                xug0 xug0Var = (xug0) ((w62) this.c).e;
                String str3 = bn70Var.b.a;
                if (!str3.equals(xug0Var.a)) {
                    xug0Var.b.onNext(new wug0(str3));
                    xug0Var.a = str3;
                }
                return rih1.a;
            case 13:
                bab1 bab1Var = (bab1) this.c;
                hm5.M(obj);
                String str4 = (String) this.b;
                if (str4 != null) {
                    qe2 qe2Var = new qe2(str4, null);
                    if (!bab1Var.d.c(qe2Var, smg1.a)) {
                        aab1.e(bab1Var.d, qe2Var);
                    }
                }
                return rih1.a;
            case 14:
                hm5.M(obj);
                ((ven0) this.c).setValue(((mwq0) this.b).e);
                return rih1.a;
            case 15:
                hm5.M(obj);
                return new m441(new us0((bv40) this.b, (String) this.c, null, b));
            case 16:
                hm5.M(obj);
                List list3 = ((wm2) this.b).c;
                cn2 cn2Var = (cn2) this.c;
                for (Object obj2 : list3) {
                    int i4 = size + 1;
                    if (size < 0) {
                        p7h.T();
                        throw null;
                    }
                    m2j1 m2j1Var = (m2j1) obj2;
                    if (m2j1Var instanceof l2j1) {
                        s2j1Var = s2j1.a;
                    } else {
                        if (!(m2j1Var instanceof k2j1)) {
                            eg.o();
                            return null;
                        }
                        s2j1Var = s2j1.b;
                    }
                    i8h1 i8h1VarA = cn2Var.a();
                    h7l0 h7l0Var = cn2Var.b;
                    int iOrdinal = s2j1Var.ordinal();
                    if (iOrdinal == 0) {
                        i = 2;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        i = 1;
                    }
                    Integer numValueOf = Integer.valueOf(size);
                    x6h1 x6h1VarC = h7l0Var.b.c();
                    x6h1VarC.i.add(new a7h1("verification_row", p6l0.a(i), numValueOf, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = h7l0Var.c;
                    i8h1VarA.f(k7h1Var.a(), (Set) null);
                    size = i4;
                }
                return rih1.a;
            case 17:
                hm5.M(obj);
                ((lzn0) ((em0) this.b).d).f(new dwn0((String) this.c, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return rih1.a;
            case 18:
                hm5.M(obj);
                uz5 uz5Var = (uz5) this.b;
                Context context = (Context) this.c;
                String str5 = nik1.D4.a;
                Bundle bundleQ = l0p1.q(brj0.c);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str5));
                intent.setClassName(context.getApplicationContext(), PageActivity.class.getName());
                intent.setFlags(536870912);
                intent.putExtras(bundleQ);
                uz5Var.a(intent);
                return rih1.a;
            case 19:
                hm5.M(obj);
                ContentResolver contentResolver = ((jt2) this.b).a.getContentResolver();
                Uri uri = (Uri) this.c;
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            i2 = new sm00(inputStreamOpenInputStream).i(1, "Orientation");
                            inputStreamOpenInputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                u890.p(inputStreamOpenInputStream, th);
                                throw th2;
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                    while (true) {
                        int i5 = i3 * 2;
                        if (Math.max(options.outWidth, options.outHeight) / i5 < 1024) {
                            options.inSampleSize = i3;
                            options.inJustDecodeBounds = false;
                            InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                                    inputStreamOpenInputStream2.close();
                                    if (bitmapDecodeStream != null) {
                                        int iMax = Math.max(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                        if (iMax <= 1024) {
                                            bitmap = bitmapDecodeStream;
                                        } else {
                                            float f = 1024.0f / iMax;
                                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, (int) (bitmapDecodeStream.getWidth() * f), (int) (bitmapDecodeStream.getHeight() * f), true);
                                            if (bitmapCreateScaledBitmap != bitmapDecodeStream) {
                                                bitmapDecodeStream.recycle();
                                            }
                                            bitmap = bitmapCreateScaledBitmap;
                                        }
                                        Matrix matrix = new Matrix();
                                        switch (i2) {
                                            case 2:
                                                matrix.setScale(-1.0f, 1.0f);
                                                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                                break;
                                            case 3:
                                                matrix.setRotate(180.0f);
                                                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                                break;
                                            case 4:
                                                matrix.setScale(1.0f, -1.0f);
                                                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                                break;
                                            case 5:
                                                matrix.setRotate(90.0f);
                                                matrix.postScale(-1.0f, 1.0f);
                                                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                                break;
                                            case 6:
                                                matrix.setRotate(90.0f);
                                                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                                break;
                                            case 7:
                                                matrix.setRotate(-90.0f);
                                                matrix.postScale(-1.0f, 1.0f);
                                                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                                break;
                                            case 8:
                                                matrix.setRotate(270.0f);
                                                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                                break;
                                            default:
                                                bitmapCreateBitmap = bitmap;
                                                break;
                                        }
                                        try {
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            if (!bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream)) {
                                                throw new IllegalStateException("JPEG compression failed");
                                            }
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            if (bitmapCreateBitmap != bitmap) {
                                                bitmapCreateBitmap.recycle();
                                            }
                                            bitmap.recycle();
                                            return byteArray;
                                        } catch (Throwable th3) {
                                            if (bitmapCreateBitmap != bitmap) {
                                                bitmapCreateBitmap.recycle();
                                            }
                                            bitmap.recycle();
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        u890.p(inputStreamOpenInputStream2, th4);
                                        throw th5;
                                    }
                                }
                            }
                            eg.m("Could not decode image from URI");
                            return null;
                        }
                        i3 = i5;
                    }
                } catch (Exception unused) {
                }
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                InputStream inputStreamOpenInputStream3 = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream3 != null) {
                    try {
                        BitmapFactory.decodeStream(inputStreamOpenInputStream3, null, options);
                        inputStreamOpenInputStream3.close();
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            u890.p(inputStreamOpenInputStream3, th6);
                            throw th7;
                        }
                    }
                }
                i3 = 1;
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ps3 ps3Var = (ps3) this.b;
                lzn0 lzn0Var = ps3Var.d;
                hm5.M(obj);
                if (((fs3) ((ven0) this.c).getValue()) != null) {
                    ps3Var.m.a(new q6b(2, false));
                    if (lzn0Var.j(ps3Var.e)) {
                        lzn0Var.e();
                    } else {
                        ((a1r0) ps3Var.f.get()).l();
                    }
                }
                return rih1.a;
            case 21:
                hm5.M(obj);
                bab1 bab1Var2 = (bab1) this.b;
                Object objA0 = o7h.A0((List) bab1Var2.b.getValue());
                gu3 gu3Var = (gu3) this.c;
                if (!u890.j(objA0, gu3Var)) {
                    aab1 aab1Var = bab1Var2.d;
                    p9m p9mVar = smg1.a;
                    bab1 bab1Var3 = aab1Var.a;
                    bab1Var3.c = p9mVar;
                    bw91 bw91Var = bab1Var3.a;
                    bw91Var.set(p7h.L(bw91Var), new z9b1(UUID.randomUUID(), gu3Var));
                }
                return rih1.a;
            case 22:
                hm5.M(obj);
                ((ft3) this.b).d.e.invoke(((hb51) this.c).e);
                return rih1.a;
            case 23:
                hm5.M(obj);
                hb51 hb51Var = (hb51) this.b;
                String str6 = hb51Var.b;
                if (str6.length() > 0 && hb51Var.e.isEmpty() && !hb51Var.h) {
                    ((iu30) this.c).invoke(new m051(str6));
                }
                return rih1.a;
            case 24:
                hm5.M(obj);
                vu30 vu30Var = ((bt3) this.b).a;
                zx41 zx41Var = (by41) this.c;
                vu30Var.invoke(zx41Var.a, zx41Var.b);
                return rih1.a;
            case 25:
                hm5.M(obj);
                if (((Boolean) ((tob1) this.b).getValue()).booleanValue()) {
                    ((iu30) this.c).invoke(c151.a);
                }
                return rih1.a;
            case 26:
                hm5.M(obj);
                if (((String) this.b).length() == 0) {
                    ((ven0) this.c).setValue(new c8e1(0L, 7, (String) null));
                }
                return rih1.a;
            case 27:
                rih1 rih1Var = rih1.a;
                hm5.M(obj);
                ooe1 ooe1Var = ((s45) this.b).c;
                if (ooe1Var == null) {
                    s45 s45Var = (s45) this.b;
                    pne1 pne1Var = (pne1) this.c;
                    ConcurrentHashMap concurrentHashMap = s45Var.e;
                    if (concurrentHashMap.size() < 50) {
                        concurrentHashMap.put(pne1Var.a, pne1Var);
                    }
                } else {
                    ooe1Var.b((pne1) this.c);
                }
                return rih1Var;
            case 28:
                hm5.M(obj);
                jqq0 jqq0Var = (jqq0) this.b;
                jqq0Var.getClass();
                Context context2 = ((bj5) this.c).a;
                BehaviorSubject behaviorSubject = jqq0Var.d;
                behaviorSubject.onNext(iqq0.b);
                i94 i94Var = jqq0Var.b;
                i94Var.e("orbit_library_load");
                try {
                    System.loadLibrary("orbit-jni-spotify");
                    break;
                } catch (UnsatisfiedLinkError e) {
                    Logger.e(e, "Error while performing regular native lib load", new Object[0]);
                    String[] strArr = Build.SUPPORTED_ABIS;
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    int length = strArr2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            String str7 = strArr2[i6];
                            String[] strArr3 = jqq0Var.c;
                            int length2 = strArr3.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 < length2) {
                                    str = strArr3[i7];
                                    if (!ihc1.h0(str7, str, false)) {
                                        i7++;
                                    }
                                } else {
                                    str = "";
                                }
                            }
                            if (str.length() != 0) {
                                try {
                                    file = new File(new File(new File(context2.getFilesDir(), f4i1.e(File.separator, "lib")), str), f4i1.f("lib", "orbit-jni-spotify", ".so"));
                                    pob.a(file);
                                    String strF = f4i1.f("/lib/", str, "/liborbit-jni-spotify.so");
                                    URL resource = hqq0.class.getResource(strF);
                                    if (resource == null) {
                                        Logger.d("Cannot find native library in APK - fallback extraction failed!", new Object[0]);
                                        Logger.d("Looked for '%s'. ABI: %s", new Object[]{strF, str});
                                    } else {
                                        try {
                                            InputStream inputStreamOpenStream = resource.openStream();
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                try {
                                                    try {
                                                        inputStreamOpenStream.getClass();
                                                        o0c.w(inputStreamOpenStream, fileOutputStream);
                                                        fileOutputStream.flush();
                                                        fileOutputStream.close();
                                                        inputStreamOpenStream.close();
                                                    } catch (IOException e2) {
                                                        Logger.e(e2, e2.getMessage(), new Object[0]);
                                                        fileOutputStream.close();
                                                        u890.p(inputStreamOpenStream, (Throwable) null);
                                                        i6++;
                                                        strArr2 = strArr2;
                                                    }
                                                } catch (Throwable th8) {
                                                    try {
                                                        throw th8;
                                                    } catch (Throwable th9) {
                                                        u890.p(fileOutputStream, th8);
                                                        throw th9;
                                                    }
                                                }
                                            } catch (Throwable th10) {
                                                try {
                                                    throw th10;
                                                } catch (Throwable th11) {
                                                    u890.p(inputStreamOpenStream, th10);
                                                    throw th11;
                                                }
                                            }
                                        } catch (IOException unused2) {
                                            System.load(file.getAbsolutePath());
                                            if (jqq0Var.a.nextFloat() >= 0.99d) {
                                                n57.e("Successfully loaded native lib with fallback method (Throttled 99%).");
                                            }
                                            i94Var.a("orbit_library_load");
                                            behaviorSubject.onNext(iqq0.c);
                                            return rih1.a;
                                        }
                                    }
                                } catch (UnsatisfiedLinkError e3) {
                                    Logger.e(e3, e3.getMessage(), new Object[0]);
                                }
                            }
                            i6++;
                            strArr2 = strArr2;
                        } else {
                            Logger.e(e, "Error performing native lib fallback extraction. Trying with ReLinker.", new Object[0]);
                            try {
                                new vyq0((byte) 26).h(context2, "orbit-jni-spotify");
                            } catch (Exception e4) {
                                Logger.e(e4, e4.getMessage(), new Object[0]);
                                i94Var.a("orbit_library_load");
                                behaviorSubject.onNext(iqq0.d);
                                throw e;
                            }
                        }
                        break;
                    }
                    System.load(file.getAbsolutePath());
                    if (jqq0Var.a.nextFloat() >= 0.99d) {
                        n57.e("Successfully loaded native lib with fallback method (Throttled 99%).");
                    }
                }
                i94Var.a("orbit_library_load");
                behaviorSubject.onNext(iqq0.c);
                return rih1.a;
            default:
                hm5.M(obj);
                return ((AppWidgetManager) ((ox5) this.b).c.getValue()).getAppWidgetIds((ComponentName) this.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
