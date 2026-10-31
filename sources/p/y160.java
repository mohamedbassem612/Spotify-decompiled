package p;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.work.WorkerParameters;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.share.file.api.bitmapconverter.CompressFileException;
import com.spotify.widgets.colorextraction.ColorNotExtractedError;
import com.spotify.yourlibrary.importsyncnotification.importsyncworker.ImportSyncWorker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y160 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y160(ven0 ven0Var, s220 s220Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        this.c = ven0Var;
        this.b = s220Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new y160((b8f1) this.b, (ven0) obj2, lnmVar, (byte) 0);
            case 1:
                return new y160((ssw0) this.b, (pbq) obj2, lnmVar, (byte) 1);
            case 2:
                y160 y160Var = new y160(obj2, lnmVar, (byte) 2);
                y160Var.b = obj;
                return y160Var;
            case 3:
                return new y160((n8d1) this.b, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                y160 y160Var2 = new y160(obj2, lnmVar, (byte) 4);
                y160Var2.b = obj;
                return y160Var2;
            case 5:
                return new y160((c070) this.b, (fz60) obj2, lnmVar, (byte) 5);
            case 6:
                return new y160((OutputStream) this.b, (Bitmap) obj2, lnmVar, (byte) 6);
            case 7:
                return new y160((ohd) this.b, (Exception) obj2, lnmVar, (byte) 7);
            case 8:
                return new y160((wmy) this.b, (Uri) obj2, lnmVar, (byte) 8);
            case 9:
                return new y160((Uri) this.b, (cir0) obj2, lnmVar, (byte) 9);
            case 10:
                y160 y160Var3 = new y160(obj2, lnmVar, (byte) 10);
                y160Var3.b = obj;
                return y160Var3;
            case 11:
                return new y160((ven0) obj2, (s220) this.b, lnmVar);
            case 12:
                return new y160((om80) this.b, (km80) obj2, lnmVar, (byte) 12);
            case 13:
                return new y160((iu30) this.b, (ExoPlayer) obj2, lnmVar, (byte) 13);
            case 14:
                return new y160((uvb0) this.b, (uoa) obj2, lnmVar, (byte) 14);
            case 15:
                y160 y160Var4 = new y160(obj2, lnmVar, (byte) 15);
                y160Var4.b = obj;
                return y160Var4;
            case 16:
                y160 y160Var5 = new y160(obj2, lnmVar, (byte) 16);
                y160Var5.b = obj;
                return y160Var5;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                y160 y160Var6 = new y160(obj2, lnmVar, (byte) 17);
                y160Var6.b = obj;
                return y160Var6;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new y160((mta0) this.b, (esa0) obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new y160((mta0) this.b, (Bundle) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new y160((ur00) this.b, (String) obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new y160((zgb0) this.b, (cib0) obj2, lnmVar, (byte) 21);
            case 22:
                y160 y160Var7 = new y160(obj2, lnmVar, (byte) 22);
                y160Var7.b = obj;
                return y160Var7;
            case 23:
                return new y160((bxb0) this.b, (String) obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new y160((yxa0) this.b, (ur00) obj2, lnmVar, (byte) 24);
            case 25:
                return new y160((String) this.b, (ur00) obj2, lnmVar, (byte) 25);
            case 26:
                return new y160((tv80) this.b, (g6c0) obj2, lnmVar, (byte) 26);
            case 27:
                y160 y160Var8 = new y160(obj2, lnmVar, (byte) 27);
                y160Var8.b = obj;
                return y160Var8;
            case 28:
                y160 y160Var9 = new y160(obj2, lnmVar, (byte) 28);
                y160Var9.b = obj;
                return y160Var9;
            default:
                y160 y160Var10 = new y160(obj2, lnmVar, (byte) 29);
                y160Var10.b = obj;
                return y160Var10;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((t1v0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((zu81) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((i480) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                return create((pp90) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                return create((dnb0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((pp90) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((ap90) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.share.file.api.bitmapconverter.CompressFileException */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws Throwable {
        BitmapFactory.Options options;
        Bitmap bitmap;
        Bitmap bitmap2;
        sm00 sm00Var;
        int iU;
        Uri uriFromFile;
        ou80 ou80Var;
        blc0 blc0Var;
        lik1 lik1Var;
        lik1 lik1Var2;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 0;
        File file = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((b8f1) this.b).b(-((Number) ((ven0) obj2).getValue()).intValue());
                return rih1Var;
            case 1:
                hm5.M(obj);
                ((ssw0) this.b).l(((pbq) obj2).D());
                return rih1Var;
            case 2:
                t1v0 t1v0Var = (t1v0) this.b;
                hm5.M(obj);
                if (t1v0Var == null) {
                    pbq pbqVar = (pbq) obj2;
                    wmy wmyVar = (wmy) pbqVar.i;
                    o5b0 o5b0Var = (o5b0) pbqVar.h;
                    bpb1 bpb1Var = (bpb1) wmyVar.f;
                    Map map = (Map) bpb1Var.getValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((o5b0) entry.getKey()) != o5b0Var) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    bpb1Var.m((Object) null, linkedHashMap);
                }
                return rih1Var;
            case 3:
                hm5.M(obj);
                ((ven0) obj2).setValue(((n8d1) this.b).d);
                return rih1Var;
            case 4:
                bpb1 bpb1Var2 = ((ty60) obj2).o;
                zu81 zu81Var = (zu81) this.b;
                hm5.M(obj);
                if (zu81Var instanceof su81) {
                    bpb1Var2.m((Object) null, Boolean.TRUE);
                } else if ((zu81Var instanceof vu81) || (zu81Var instanceof xu81)) {
                    bpb1Var2.m((Object) null, Boolean.FALSE);
                } else if (!(zu81Var instanceof wu81) && !(zu81Var instanceof yu81)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 5:
                hm5.M(obj);
                pxc.a(((c070) this.b).d, ((fz60) obj2).a, new Long(-1L), (String) null, (String) null, 28);
                return rih1Var;
            case 6:
                hm5.M(obj);
                try {
                    OutputStream outputStream = (OutputStream) this.b;
                    if (outputStream == null) {
                        throw new IllegalStateException("Failed to open image output stream");
                    }
                    try {
                        if (!((Bitmap) obj2).compress(Bitmap.CompressFormat.PNG, 100, outputStream)) {
                            throw new IllegalStateException("Failed to compress image");
                        }
                        outputStream.close();
                        return rih1Var;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(outputStream, th);
                            throw th2;
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Logger.d(e2.getMessage(), new Object[0]);
                    throw new CompressFileException(ktd.i("Unable to compress image ", e2));
                }
            case 7:
                hm5.M(obj);
                ohd ohdVar = (ohd) this.b;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(new m231(new ColorNotExtractedError((Exception) obj2)));
                }
                return rih1Var;
            case 8:
                hm5.M(obj);
                st60 st60Var = (st60) ((wmy) this.b).b;
                Context context = (Context) st60Var.d;
                Uri uri = (Uri) obj2;
                try {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        options = null;
                    } else {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        inputStreamOpenInputStream.close();
                    }
                    if (options == null) {
                        return Uri.EMPTY;
                    }
                    BitmapFactory.Options optionsL = st60.l(options);
                    InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream2 == null) {
                        bitmap = null;
                    } else {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, st60.l(optionsL));
                        inputStreamOpenInputStream2.close();
                        bitmap = bitmapDecodeStream;
                    }
                    if (bitmap == null) {
                        return Uri.EMPTY;
                    }
                    try {
                        InputStream inputStreamOpenInputStream3 = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream3 == null) {
                            sm00Var = null;
                        } else {
                            sm00Var = new sm00(inputStreamOpenInputStream3);
                            inputStreamOpenInputStream3.close();
                        }
                        if (sm00Var == null) {
                            Uri uri2 = Uri.EMPTY;
                            if (bitmap.isRecycled()) {
                                return uri2;
                            }
                            bitmap.recycle();
                            return uri2;
                        }
                        int i = sm00Var.i(1, "Orientation");
                        Matrix matrix = new Matrix();
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        int i2 = 2000;
                        if (width > 2000 || height > 2000) {
                            float f = width;
                            float f2 = height;
                            float f3 = f / f2;
                            if (1.0f > f3) {
                                int iU2 = jch0.U(2000.0f * f3);
                                iU = 2000;
                                i2 = iU2;
                            } else {
                                iU = jch0.U(2000.0f / f3);
                            }
                            matrix.setScale(i2 / f, iU / f2);
                        }
                        st60.F(matrix, i);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        bitmap2 = bitmap;
                        if (bitmapCreateBitmap != bitmap2) {
                            try {
                                bitmap2.recycle();
                            } catch (Throwable th3) {
                                th = th3;
                                if (!bitmap2.isRecycled()) {
                                    bitmap2.recycle();
                                }
                                throw th;
                            }
                        }
                        try {
                            File fileQ = st60Var.q(true);
                            if (fileQ != null) {
                                r420 r420VarL = ((fya) st60Var.b).l(fileQ);
                                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, r420VarL);
                                r420VarL.close();
                                file = fileQ;
                            }
                            if (file == null) {
                                uriFromFile = Uri.EMPTY;
                                bitmapCreateBitmap.recycle();
                                if (bitmap2.isRecycled()) {
                                    return uriFromFile;
                                }
                            } else {
                                uriFromFile = Uri.fromFile(file);
                                bitmapCreateBitmap.recycle();
                                if (bitmap2.isRecycled()) {
                                    return uriFromFile;
                                }
                            }
                            bitmap2.recycle();
                            return uriFromFile;
                        } catch (Throwable th4) {
                            bitmapCreateBitmap.recycle();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        bitmap2 = bitmap;
                    }
                } catch (IOException e3) {
                    Logger.e(e3, "Failed to create preview image", new Object[0]);
                    return Uri.EMPTY;
                }
                break;
            case 9:
                hm5.M(obj);
                Uri uri3 = Uri.EMPTY;
                Uri uri4 = (Uri) this.b;
                cir0 cir0Var = (cir0) obj2;
                if (uri3.equals(uri4)) {
                    ppo1.q(cir0Var);
                } else {
                    Intent intent = new Intent();
                    intent.setData(uri4);
                    cir0Var.c().a(new y231(intent));
                }
                return rih1Var;
            case 10:
                ImportSyncWorker importSyncWorker = (ImportSyncWorker) obj2;
                i480 i480Var = (i480) this.b;
                hm5.M(obj);
                if (i480Var instanceof h480) {
                    b480 b480Var = importSyncWorker.q;
                    h480 h480Var = (h480) i480Var;
                    int i3 = h480Var.c;
                    int i4 = h480Var.a;
                    int i5 = h480Var.b;
                    st60 st60Var2 = (st60) b480Var;
                    Context context2 = (Context) st60Var2.d;
                    Resources resources = context2.getResources();
                    int iP = yoi1.p(i3, 0, 100);
                    dko0 dko0Var = new dko0(context2, "spotify_updates_channel");
                    dko0Var.j(resources.getString(2131959165));
                    dko0Var.i(resources.getQuantityString(2131820761, i5, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(iP)));
                    dko0Var.s(resources.getString(2131959165));
                    dko0Var.D.icon = R.drawable.stat_sys_download;
                    dko0Var.l(2, true);
                    dko0Var.l(8, true);
                    dko0Var.p(100, iP, false);
                    dko0Var.u = context2.getColor(2131102443);
                    dko0Var.g = (PendingIntent) ((idd1) st60Var2.c).getValue();
                    Notification notificationC = dko0Var.c();
                    bd30 bd30Var = Build.VERSION.SDK_INT >= 29 ? new bd30(2131430167, notificationC, 1) : new bd30(2131430167, notificationC, 0);
                    WorkerParameters workerParameters = ((z8d0) importSyncWorker).b;
                    tvl1 tvl1Var = workerParameters.i;
                    upn1.t(new k65(tvl1Var.a.a, "setForegroundAsync", new qd4(tvl1Var, workerParameters.a, bd30Var, ((z8d0) importSyncWorker).a, (byte) 8), (byte) 14));
                    importSyncWorker.w(i3);
                }
                return rih1Var;
            case 11:
                hm5.M(obj);
                ((ven0) obj2).setValue(((s220) this.b).i);
                return rih1Var;
            case 12:
                hm5.M(obj);
                km80 km80Var = (km80) obj2;
                pcf.a(((om80) this.b).b, km80Var.a, km80Var.b, (Bundle) null);
                return rih1Var;
            case 13:
                hm5.M(obj);
                ((iu30) this.b).invoke((ExoPlayer) obj2);
                return rih1Var;
            case 14:
                hm5.M(obj);
                uoa uoaVar = (uoa) obj2;
                if (((uvb0) this.b).b()) {
                    uoaVar.l();
                } else {
                    uoaVar.f();
                }
                return rih1Var;
            case 15:
                pp90 pp90Var = (pp90) this.b;
                hm5.M(obj);
                ((mq90) obj2).getClass();
                return Boolean.valueOf((pp90Var != null ? (byte) 1 : (byte) 0) ^ 1);
            case 16:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                pzw pzwVar = (pzw) obj2;
                fn31.T(c9nVar, (o8n) null, 0, new bda0(pzwVar, file, b3), 3);
                if (((no4) ((b0a0) pzwVar.h).a.get()).b()) {
                    Set<ko90> set = ((qo90) pzwVar.t).b;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        fn31.T(c9nVar, (o8n) null, 0, new bda0(pzwVar, file, b2), 3);
                    } else {
                        for (ko90 ko90Var : set) {
                            if (ko90Var == ko90.a || ko90Var == ko90.b) {
                            }
                        }
                        fn31.T(c9nVar, (o8n) null, 0, new bda0(pzwVar, file, b2), 3);
                    }
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                dea0 dea0Var = (dea0) obj2;
                fn31.T(c9nVar2, (o8n) null, 0, new aea0(dea0Var, file, b3), 3);
                if (((no4) ((b0a0) dea0Var.i).a.get()).b()) {
                    fn31.T(c9nVar2, (o8n) null, 0, new aea0(dea0Var, file, b2), 3);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                a1r0 a1r0Var = ((mta0) this.b).a;
                tv80 tv80Var = ((esa0) obj2).a;
                a1r0.i(a1r0Var, "spotify:playlist:37i9dQZF1EYkqdzj48dyYq", (tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a, (Bundle) null, 4);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                a1r0.j(((mta0) this.b).a, nik1.w6.a, (String) null, (Bundle) obj2, false, 10);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hm5.M(obj);
                ur00 ur00Var = (ur00) this.b;
                ((b431) ur00Var.f).a((ng7) ur00Var.e, (String) obj2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                haa0 haa0Var = ((zgb0) this.b).h;
                String str = ((cib0) obj2).b;
                i8h1 i8h1Var = (i8h1) ((kly0) haa0Var.b).get();
                tdl0 tdl0Var = (tdl0) haa0Var.c;
                x6h1 x6h1VarC = tdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("reference_track_row", (String) null, (Integer) null, str, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = tdl0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 22:
                hm5.M(obj);
                dnb0 dnb0Var = (dnb0) this.b;
                cnb0 cnb0Var = (ve40) dnb0Var.b(5);
                if (!((ve40) cnb0Var).a.equals(dnb0Var)) {
                    cnb0Var.d();
                    ve40.e(((ve40) cnb0Var).b, dnb0Var);
                }
                dlb0 dlb0Var = (dlb0) obj2;
                cnb0 cnb0Var2 = cnb0Var;
                int iO = ((ve40) cnb0Var2).b.o();
                cnb0Var2.d();
                ((ve40) cnb0Var2).b.q(iO);
                cnb0Var2.d();
                ((ve40) cnb0Var2).b.l();
                for (Map.Entry entry2 : dlb0Var.b.entrySet()) {
                    hnb0 hnb0Var = (hnb0) entry2.getKey();
                    int iIntValue = ((Number) entry2.getValue()).intValue();
                    if (dlb0Var.e.contains(new Integer(iIntValue))) {
                        enb0 enb0VarM = fnb0.m();
                        enb0VarM.d();
                        ((ve40) enb0VarM).b.n(hnb0Var);
                        enb0VarM.d();
                        ((ve40) enb0VarM).b.o(iIntValue);
                        cnb0Var2.d();
                        ((ve40) cnb0Var2).b.k(enb0VarM.a());
                    }
                }
                return cnb0Var2.a();
            case 23:
                hm5.M(obj);
                bxb0 bxb0Var = (bxb0) this.b;
                ic9 ic9Var = bxb0Var.f;
                ic9Var.q(((Context) ic9Var.b).getString(2131958540), new x680(bxb0Var, (String) obj2, (byte) 22));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                yxa0 yxa0Var = (yxa0) this.b;
                boolean z = yxa0Var instanceof xxa0;
                ur00 ur00Var2 = (ur00) obj2;
                swa0 swa0Var = (swa0) ur00Var2.b;
                k2c0 k2c0Var = (k2c0) ur00Var2.e;
                xk xkVar = (xk) ur00Var2.c;
                if (z) {
                    cl clVar = cl.b;
                    xk.d(xkVar, clVar, k2c0Var.b(xkVar.f(clVar).a));
                } else {
                    txa0 txa0Var = txa0.a;
                    if (u890.j(yxa0Var, txa0Var)) {
                        blc0Var = blc0.i9;
                    } else {
                        if (!(yxa0Var instanceof uxa0)) {
                            if (z) {
                                eg.m("ParentalConsent flow should use AccountCreationFlowManager instead");
                                return null;
                            }
                            eg.o();
                            return null;
                        }
                        blc0Var = blc0.v9;
                    }
                    int iOrdinal = blc0Var.ordinal();
                    tpw0 tpw0Var = tpw0.b;
                    if (iOrdinal == 448) {
                        twa0 twa0Var = swa0Var.d;
                        lik1Var = twa0Var.Z == tpw0Var ? nik1.s3 : swa0.e(twa0Var) ? nik1.y3 : nik1.t3;
                    } else {
                        if (iOrdinal != 461) {
                            eg.m("Current page is not Legal Consent.");
                            return null;
                        }
                        twa0 twa0Var2 = swa0Var.d;
                        lik1Var = twa0Var2.Z == tpw0Var ? nik1.I3 : swa0.e(twa0Var2) ? nik1.J3 : nik1.K3;
                    }
                    tv80 tv80VarB = k2c0Var.b(lik1Var.a);
                    twa0 twa0Var3 = swa0Var.d;
                    if (twa0Var3.Z == tpw0Var) {
                        yxa0 yxa0Var2 = twa0Var3.Y;
                        if (u890.j(yxa0Var2, txa0Var)) {
                            lik1Var2 = nik1.s3;
                        } else {
                            if (!(yxa0Var2 instanceof uxa0)) {
                                if (yxa0Var2 instanceof xxa0) {
                                    eg.m("ParentalConsent flows should use AccountCreationFlowManager");
                                    return null;
                                }
                                eg.o();
                                return null;
                            }
                            lik1Var2 = nik1.I3;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("key_flow_type", swa0Var.d.Y);
                        swa0Var.a.c(lik1Var2.a, tv80VarB, bundle);
                    } else {
                        swa0Var.a(tv80VarB);
                    }
                }
                return rih1Var;
            case 25:
                ur00 ur00Var3 = (ur00) obj2;
                k2c0 k2c0Var2 = (k2c0) ur00Var3.e;
                hm5.M(obj);
                String str2 = (String) this.b;
                boolean zJ = u890.j(str2, "https://www.spotify.com/legal/managed-account-plan-manager-privacy-policy/plain/");
                b7x b7xVar = b7x.a;
                if (zJ || u890.j(str2, "https://www.spotify.com/legal/managed-account-parent-guardian-privacy-policy/plain/")) {
                    i8h1 i8h1VarA = k2c0Var2.a();
                    x6h1 x6h1VarC2 = k2c0Var2.b.b.c();
                    x6h1VarC2.i.add(new a7h1("privacy_notice_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (u890.j(str2, "https://www.spotify.com/legal/end-user-agreement/plain/")) {
                    i8h1 i8h1VarA2 = k2c0Var2.a();
                    x6h1 x6h1VarC3 = k2c0Var2.b.b.c();
                    x6h1VarC3.i.add(new a7h1("terms_of_use_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    i8h1VarA2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (u890.j(str2, "https://www.spotify.com/legal/managed-account-young-listener-privacy-policy/plain/")) {
                    i8h1 i8h1VarA3 = k2c0Var2.a();
                    x6h1 x6h1VarC4 = k2c0Var2.b.b.c();
                    x6h1VarC4.i.add(new a7h1("young_listener_privacy_policy_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    i8h1VarA3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (u890.j(str2, "https://www.spotify.com/safetyandprivacy/parental-guide/plain/") || u890.j(str2, "https://support.spotify.com/article/managed-accounts/plain/") || u890.j(str2, "https://support.spotify.com/article/shuffle-play/plain/")) {
                    i8h1 i8h1VarA4 = k2c0Var2.a();
                    x6h1 x6h1VarC5 = k2c0Var2.b.b.c();
                    x6h1VarC5.i.add(new a7h1("legal_text_support_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    i8h1VarA4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2)), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                return Boolean.valueOf(z710.d((z710) ur00Var3.d, str2, false, 6));
            case 26:
                hm5.M(obj);
                tv80 tv80Var2 = (tv80) this.b;
                lzn0 lzn0Var = ((g6c0) obj2).a;
                if (tv80Var2 != null) {
                    lzn0Var.a("spotify:presents:import-music", tv80Var2, (Bundle) null);
                } else {
                    lzn0Var.h("spotify:presents:import-music");
                }
                return rih1Var;
            case 27:
                List list = (List) this.b;
                hm5.M(obj);
                ((y8c0) obj2).c.l(list);
                return rih1Var;
            case 28:
                pp90 pp90Var2 = (pp90) this.b;
                hm5.M(obj);
                ((b9c0) obj2).c.l(pp90Var2);
                return rih1Var;
            default:
                ap90 ap90Var = (ap90) this.b;
                hm5.M(obj);
                ((d9c0) obj2).c.l(ap90Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y160(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y160(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
